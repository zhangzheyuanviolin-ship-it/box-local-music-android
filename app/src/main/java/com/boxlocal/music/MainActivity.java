package com.boxlocal.music;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;

public class MainActivity extends Activity {
  private final List<ModelSpec> models = ModelSpec.officialBoxModels();
  private LinearLayout root;
  private TextView statusView;
  private volatile ModelDownload activeDownload;
  private volatile boolean activeGeneration;
  private File lastGeneratedFile;
  private Uri lastExportedUri;
  private MediaPlayer mediaPlayer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    renderModelList();
  }

  private void renderModelList() {
    setTitle("Box Local Music");
    ScrollView scrollView = new ScrollView(this);
    root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setPadding(32, 32, 32, 32);
    scrollView.addView(root);

    addTitle("Box Local Music");
    addText("Official Box model downloader and local music generation workflow.");
    addText("Models and URLs are taken from the installed Box 3.3.3 JADX source: SoundGen, SoundGen HD, and SoundGen HD Long.");
    statusView = addText("Ready");

    for (ModelSpec model : models) {
      addModelCard(model);
    }
    setContentView(scrollView);
  }

  private void addModelCard(ModelSpec model) {
    TextView name = addTitle(model.name);
    name.setTextSize(22);
    addText(model.description);
    addText("Download size: " + model.totalBytesText() + ". Files: " + model.files.size());

    ProgressBar progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
    progressBar.setMax(1000);
    progressBar.setProgress((int) (model.localProgress(modelDir(model)) * 1000));
    root.addView(progressBar, matchWrap());

    TextView fileState = addText(model.localStatusText(modelDir(model)));

    Button download = new Button(this);
    download.setText(model.isReady(modelDir(model)) ? "Verify downloaded files" : "Download or resume");
    root.addView(download, matchWrap());
    download.setOnClickListener(v -> startDownload(model, progressBar, fileState));

    Button open = new Button(this);
    open.setText("Select model and open generation page");
    open.setEnabled(model.isReady(modelDir(model)));
    root.addView(open, matchWrap());
    open.setOnClickListener(v -> renderGeneratePage(model));

    Button delete = new Button(this);
    delete.setText("Delete downloaded model");
    root.addView(delete, matchWrap());
    delete.setOnClickListener(
        v -> {
          deleteTree(modelDir(model));
          statusView.setText("Deleted " + model.name);
          renderModelList();
        });
  }

  private void renderGeneratePage(ModelSpec model) {
    setTitle(model.name);
    ScrollView scrollView = new ScrollView(this);
    root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setPadding(32, 32, 32, 32);
    scrollView.addView(root);

    addTitle(model.name);
    addText(model.description);
    addText("Downloaded files are stored in app-private model storage. Delete from the model list if you need to reclaim space.");

    EditText prompt = new EditText(this);
    prompt.setMinLines(4);
    prompt.setText("calm piano melody, warm harmony, cinematic, 90 bpm");
    prompt.setHint("Describe the music");
    root.addView(prompt, matchWrap());

    TextView durationLabel = addText("Duration: " + model.defaultDurationSec + " seconds");
    SeekBar duration = new SeekBar(this);
    duration.setMax(model.maxDurationSec - model.minDurationSec);
    duration.setProgress(model.defaultDurationSec - model.minDurationSec);
    root.addView(duration, matchWrap());
    duration.setOnSeekBarChangeListener(
        new SeekBar.OnSeekBarChangeListener() {
          @Override
          public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            durationLabel.setText("Duration: " + (model.minDurationSec + progress) + " seconds");
          }

          @Override
          public void onStartTrackingTouch(SeekBar seekBar) {}

          @Override
          public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    statusView = addText("Ready. Model files verified: " + model.localStatusText(modelDir(model)));

    Button generate = new Button(this);
    generate.setText("Generate with selected model");
    root.addView(generate, matchWrap());
    generate.setOnClickListener(
        v ->
            startGeneration(
                model,
                prompt.getText().toString(),
                model.minDurationSec + duration.getProgress(),
                generate));

    Button play = new Button(this);
    play.setText("Play last generated WAV");
    root.addView(play, matchWrap());
    play.setOnClickListener(v -> playLastGenerated());

    Button export = new Button(this);
    export.setText("Export last generated WAV");
    root.addView(export, matchWrap());
    export.setOnClickListener(
        v -> {
          try {
            Uri uri = exportLastGenerated();
            statusView.setText("Exported WAV: " + uri);
          } catch (Exception e) {
            statusView.setText("Export failed: " + e.getMessage());
          }
        });

    Button share = new Button(this);
    share.setText("Share last generated WAV");
    root.addView(share, matchWrap());
    share.setOnClickListener(
        v -> {
          try {
            Uri uri = exportLastGenerated();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("audio/wav");
            intent.putExtra(Intent.EXTRA_STREAM, uri);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(intent, "Share WAV"));
          } catch (Exception e) {
            statusView.setText("Share failed: " + e.getMessage());
          }
        });

    Button back = new Button(this);
    back.setText("Back to model list");
    root.addView(back, matchWrap());
    back.setOnClickListener(v -> renderModelList());
    setContentView(scrollView);
  }

  private void startDownload(ModelSpec model, ProgressBar progressBar, TextView fileState) {
    if (activeDownload != null) {
      statusView.setText("A download is already running.");
      return;
    }
    File dir = modelDir(model);
    ModelDownload download =
        new ModelDownload(
            model,
            dir,
            new ModelDownload.Listener() {
              @Override
              public void onProgress(long received, long total, String currentFile) {
                runOnUiThread(
                    () -> {
                      int value = total <= 0 ? 0 : (int) Math.min(1000, (received * 1000L) / total);
                      progressBar.setProgress(value);
                      statusView.setText(
                          "Downloading "
                              + model.name
                              + ": "
                              + percent(value)
                              + " current file "
                              + currentFile);
                      fileState.setText(model.localStatusText(dir));
                    });
              }

              @Override
              public void onDone() {
                activeDownload = null;
                runOnUiThread(
                    () -> {
                      statusView.setText("Download complete: " + model.name);
                      renderModelList();
                    });
              }

              @Override
              public void onError(Exception error) {
                activeDownload = null;
                runOnUiThread(
                    () -> statusView.setText("Download failed: " + error.getMessage()));
              }
            });
    activeDownload = download;
    download.start();
  }

  private void startGeneration(ModelSpec model, String prompt, int durationSeconds, Button button) {
    if (activeGeneration) {
      statusView.setText("Generation is already running.");
      return;
    }
    if (prompt.trim().isEmpty()) {
      statusView.setText("Prompt is empty.");
      return;
    }
    activeGeneration = true;
    button.setEnabled(false);
    statusView.setText("Loading official Box SoundGen engine...");
    new Thread(
            () -> {
              try {
                String output =
                    OfficialSoundGenEngine.generate(
                        this,
                        model,
                        modelDir(model),
                        prompt.trim(),
                        durationSeconds,
                        progress ->
                            runOnUiThread(
                                () ->
                                    statusView.setText(
                                        "Generating "
                                            + model.name
                                            + ": "
                                            + String.format(java.util.Locale.US, "%.0f%%", progress * 100.0f))));
                lastGeneratedFile = new File(output);
                lastExportedUri = null;
                runOnUiThread(
                    () -> {
                      statusView.setText("Generated WAV: " + lastGeneratedFile.getAbsolutePath());
                      playLastGenerated();
                    });
              } catch (Exception e) {
                runOnUiThread(() -> statusView.setText("Generation failed: " + e.getMessage()));
              } finally {
                activeGeneration = false;
                runOnUiThread(() -> button.setEnabled(true));
              }
            })
        .start();
  }

  private void playLastGenerated() {
    try {
      if (lastGeneratedFile == null || !lastGeneratedFile.isFile()) {
        statusView.setText("No generated WAV is available yet.");
        return;
      }
      if (mediaPlayer != null) {
        mediaPlayer.release();
      }
      mediaPlayer = new MediaPlayer();
      mediaPlayer.setDataSource(lastGeneratedFile.getAbsolutePath());
      mediaPlayer.prepare();
      mediaPlayer.start();
      statusView.setText("Playing: " + lastGeneratedFile.getName());
    } catch (Exception e) {
      statusView.setText("Playback failed: " + e.getMessage());
    }
  }

  private Uri exportLastGenerated() throws Exception {
    if (lastGeneratedFile == null || !lastGeneratedFile.isFile()) {
      throw new IllegalStateException("No generated WAV is available yet.");
    }
    if (lastExportedUri != null) {
      return lastExportedUri;
    }
    ContentValues values = new ContentValues();
    values.put(MediaStore.Audio.Media.DISPLAY_NAME, lastGeneratedFile.getName());
    values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/wav");
    values.put(MediaStore.Audio.Media.RELATIVE_PATH, Environment.DIRECTORY_MUSIC + "/BoxLocalMusic");
    values.put(MediaStore.Audio.Media.IS_PENDING, 1);
    Uri uri = getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values);
    if (uri == null) {
      throw new IllegalStateException("Cannot create MediaStore item.");
    }
    try (FileInputStream input = new FileInputStream(lastGeneratedFile);
        OutputStream output = getContentResolver().openOutputStream(uri)) {
      if (output == null) {
        throw new IllegalStateException("Cannot open MediaStore output.");
      }
      byte[] buffer = new byte[1024 * 256];
      int read;
      while ((read = input.read(buffer)) >= 0) {
        output.write(buffer, 0, read);
      }
    }
    values.clear();
    values.put(MediaStore.Audio.Media.IS_PENDING, 0);
    getContentResolver().update(uri, values, null, null);
    lastExportedUri = uri;
    return uri;
  }

  private File modelDir(ModelSpec model) {
    return new File(getExternalFilesDir(null), "models/" + model.id);
  }

  private TextView addTitle(String text) {
    TextView view = new TextView(this);
    view.setText(text);
    view.setTextSize(28);
    view.setGravity(Gravity.START);
    root.addView(view, matchWrap());
    return view;
  }

  private TextView addText(String text) {
    TextView view = new TextView(this);
    view.setText(text);
    view.setTextSize(16);
    root.addView(view, matchWrap());
    return view;
  }

  private static LinearLayout.LayoutParams matchWrap() {
    LinearLayout.LayoutParams params =
        new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    params.setMargins(0, 0, 0, 24);
    return params;
  }

  private static String percent(int progressPerThousand) {
    return String.format(java.util.Locale.US, "%.1f%%", progressPerThousand / 10.0);
  }

  private static void deleteTree(File file) {
    if (file == null || !file.exists()) {
      return;
    }
    if (file.isDirectory()) {
      File[] children = file.listFiles();
      if (children != null) {
        for (File child : children) {
          deleteTree(child);
        }
      }
    }
    file.delete();
  }

  @Override
  protected void onDestroy() {
    if (mediaPlayer != null) {
      mediaPlayer.release();
      mediaPlayer = null;
    }
    super.onDestroy();
  }
}

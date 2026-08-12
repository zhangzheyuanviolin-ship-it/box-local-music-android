package com.boxlocal.music;

import android.app.Activity;
import android.os.Bundle;
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
import java.util.List;

public class MainActivity extends Activity {
  private final List<ModelSpec> models = ModelSpec.officialBoxModels();
  private LinearLayout root;
  private TextView statusView;
  private volatile ModelDownload activeDownload;

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
            statusView.setText(
                "Generation core is blocked until the official Box LiteRT inference classes are ported. This build intentionally does not fake Box output with procedural audio."));

    Button export = new Button(this);
    export.setText("Export last generated WAV");
    root.addView(export, matchWrap());
    export.setOnClickListener(v -> statusView.setText("No generated WAV is available yet."));

    Button share = new Button(this);
    share.setText("Share last generated WAV");
    root.addView(share, matchWrap());
    share.setOnClickListener(v -> statusView.setText("No generated WAV is available yet."));

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
}

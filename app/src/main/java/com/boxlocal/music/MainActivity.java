package com.boxlocal.music;

import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.OutputStream;

public class MainActivity extends Activity {
  private EditText promptInput;
  private TextView statusView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTitle("Box Local Music");

    ScrollView scrollView = new ScrollView(this);
    LinearLayout layout = new LinearLayout(this);
    layout.setOrientation(LinearLayout.VERTICAL);
    layout.setPadding(36, 36, 36, 36);
    scrollView.addView(layout);

    TextView title = new TextView(this);
    title.setText("Box Local Music");
    title.setTextSize(28);
    title.setGravity(Gravity.START);
    layout.addView(title, matchWrap());

    promptInput = new EditText(this);
    promptInput.setMinLines(4);
    promptInput.setText("calm piano melody, warm harmony, 90 bpm");
    promptInput.setHint("Describe the music");
    layout.addView(promptInput, matchWrap());

    Button generateButton = new Button(this);
    generateButton.setText("Generate local music");
    layout.addView(generateButton, matchWrap());

    statusView = new TextView(this);
    statusView.setTextSize(16);
    statusView.setText("Ready");
    layout.addView(statusView, matchWrap());

    generateButton.setOnClickListener(v -> generate());
    setContentView(scrollView);
  }

  private void generate() {
    String prompt = promptInput.getText().toString();
    if (prompt.trim().isEmpty()) {
      prompt = "calm piano melody";
    }
    statusView.setText("Generating...");
    String finalPrompt = prompt;
    new Thread(
            () -> {
              try {
                String displayName = "BoxLocalMusic_" + System.currentTimeMillis() + ".wav";
                ContentValues values = new ContentValues();
                values.put(MediaStore.Audio.Media.DISPLAY_NAME, displayName);
                values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/wav");
                values.put(MediaStore.Audio.Media.RELATIVE_PATH, "Music/BoxLocalMusic");
                values.put(MediaStore.Audio.Media.IS_MUSIC, 1);
                values.put(MediaStore.Audio.Media.IS_PENDING, 1);
                Uri uri =
                    getContentResolver()
                        .insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values);
                if (uri == null) {
                  throw new IllegalStateException("Cannot create media item");
                }
                try (OutputStream out = getContentResolver().openOutputStream(uri)) {
                  if (out == null) {
                    throw new IllegalStateException("Cannot open media output");
                  }
                  ProceduralMusic.writeWav(out, finalPrompt, 24);
                }
                values.clear();
                values.put(MediaStore.Audio.Media.IS_PENDING, 0);
                getContentResolver().update(uri, values, null, null);
                runOnUiThread(
                    () ->
                        statusView.setText(
                            "Saved: Music/BoxLocalMusic/"
                                + displayName
                                + "\nThis independent build generates tonal offline WAV audio locally."));
              } catch (Exception e) {
                runOnUiThread(() -> statusView.setText("Failed: " + e.getMessage()));
              }
            })
        .start();
  }

  private static LinearLayout.LayoutParams matchWrap() {
    LinearLayout.LayoutParams params =
        new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    params.setMargins(0, 0, 0, 28);
    return params;
  }
}

# Box Local Music

Independent Android local music generator package for the Box fusion fallback route.

Package name: `com.boxlocal.music`

This fallback build is intentionally separated from Local Agent Plaza and does not reuse the failed fusion runtime.

Version 0.2.0 implements the official Box 3.3.3 SoundGen model list and downloader workflow using model facts extracted from the installed Box APK/JADX source:

- SoundGen
- SoundGen HD
- SoundGen HD Long

The app supports model list display, official file URLs, resumable downloads, downloaded-file verification, model deletion, model selection, prompt input, duration adjustment, and export/share placeholders. It does not fake Box neural inference with procedural audio.

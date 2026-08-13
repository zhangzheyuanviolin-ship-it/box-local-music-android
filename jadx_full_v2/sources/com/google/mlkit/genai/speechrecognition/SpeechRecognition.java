            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzaek;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognition;", "", "<init>", "()V", "getClient", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizer;", "options", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
            public final class SpeechRecognition {
                public static final SpeechRecognition INSTANCE = new SpeechRecognition();

                private SpeechRecognition() {
                }

                public final SpeechRecognizer getClient(SpeechRecognizerOptions options) {
/* 10 */            return new SpeechRecognizer(options, zzaek.zzb("genai-speech-recognition"), null);
                }
            }

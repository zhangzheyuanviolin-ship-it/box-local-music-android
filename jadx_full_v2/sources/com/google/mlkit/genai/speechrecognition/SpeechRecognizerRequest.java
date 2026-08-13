            package com.google.mlkit.genai.speechrecognition;

            import com.google.mlkit.genai.common.audio.AudioSource;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest;", "", "audioSource", "Lcom/google/mlkit/genai/common/audio/AudioSource;", "<init>", "(Lcom/google/mlkit/genai/common/audio/AudioSource;)V", "getAudioSource", "()Lcom/google/mlkit/genai/common/audio/AudioSource;", "Builder", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
/* 2 */     public final class SpeechRecognizerRequest {

                public static final Companion INSTANCE = new Companion(null);
                private final AudioSource zza;

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest$Builder;", "", "<init>", "()V", "audioSource", "Lcom/google/mlkit/genai/common/audio/AudioSource;", "getAudioSource", "()Lcom/google/mlkit/genai/common/audio/AudioSource;", "setAudioSource", "(Lcom/google/mlkit/genai/common/audio/AudioSource;)V", "build", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest;", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Builder {
                    public AudioSource audioSource;

                    public final SpeechRecognizerRequest build() {
/* 8 */                 return new SpeechRecognizerRequest(getAudioSource(), null);
                    }

                    public final AudioSource getAudioSource() {
/* 1 */                 AudioSource audioSource = this.audioSource;
/* 3 */                 if (audioSource != null) {
/* 5 */                     return audioSource;
                        }
/* 8 */                 O0000Ioio00.I000OOo1O("audioSource");
/* 29 */                throw null;
                    }

                    public final void setAudioSource(AudioSource audioSource) {
/* 1 */                 this.audioSource = audioSource;
                    }
                }

                public SpeechRecognizerRequest(AudioSource audioSource, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = audioSource;
                }

                public final AudioSource getZza() {
/* 1 */             return this.zza;
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest$Companion;", "", "<init>", "()V", "builder", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest$Builder;", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final Builder builder() {
/* 3 */                 return new Builder();
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }

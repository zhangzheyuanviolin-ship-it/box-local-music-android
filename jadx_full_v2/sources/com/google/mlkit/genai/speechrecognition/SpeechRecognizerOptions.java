            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzhk;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.Locale;
            import java.util.concurrent.Executor;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0003\u0015\u0016\u0014B)\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;", "", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/Locale;", "locale", "LIoillO0OOoo;", "", "preferredModes", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/Locale;LIoillO0OOoo;)V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "LIoillO0OOoo;", "getPreferredModes", "()LIoillO0OOoo;", "Companion", "Mode", "Builder", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
/* 2 */     public final class SpeechRecognizerOptions {

                public static final Companion INSTANCE = new Companion(null);
                private final Executor zza;
                private final Locale zzb;
                private final zzhk zzc;

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions$Builder;", "", "<init>", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "preferredMode", "", "getPreferredMode$annotations", "getPreferredMode", "()I", "setPreferredMode", "(I)V", "build", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Builder {
                    private Executor zza;
                    private Locale zzb = Locale.US;
                    private int zzc;

                    public final SpeechRecognizerOptions build() {
/* 18 */                return new SpeechRecognizerOptions(this.zza, this.zzb, zzhk.zzk(Integer.valueOf(this.zzc)), null);
                    }

                    public final Executor getZza() {
/* 1 */                 return this.zza;
                    }

                    public final Locale getZzb() {
/* 1 */                 return this.zzb;
                    }

                    public final int getZzc() {
/* 1 */                 return this.zzc;
                    }

                    public final void setExecutor(Executor executor) {
/* 1 */                 this.zza = executor;
                    }

                    public final void setLocale(Locale locale) {
/* 1 */                 this.zzb = locale;
                    }

                    public final void setPreferredMode(int i) {
/* 1 */                 this.zzc = i;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions$Mode;", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                @Retention(RetentionPolicy.CLASS)
                public @interface Mode {

                    public static final Companion INSTANCE = Companion.zza;
                    public static final int MODE_ADVANCED = 1;
                    public static final int MODE_BASIC = 0;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions$Mode$Companion;", "", "<init>", "()V", "MODE_BASIC", "", "MODE_ADVANCED", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                    public static final class Companion {
                        public static final int MODE_ADVANCED = 1;
                        public static final int MODE_BASIC = 0;
                        static final Companion zza = new Companion();

                        private Companion() {
                        }
                    }
                }

                public SpeechRecognizerOptions(Executor executor, Locale locale, zzhk zzhkVar, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = executor;
/* 6 */             this.zzb = locale;
/* 8 */             this.zzc = zzhkVar;
                }

                public final zzhk getZzc() {
/* 1 */             return this.zzc;
                }

                public final Locale getZzb() {
/* 1 */             return this.zzb;
                }

                public final Executor getZza() {
/* 1 */             return this.zza;
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions$Companion;", "", "<init>", "()V", "builder", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions$Builder;", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
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

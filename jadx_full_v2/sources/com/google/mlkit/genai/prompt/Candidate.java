            package com.google.mlkit.genai.prompt;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/mlkit/genai/prompt/Candidate;", "", "text", "", "finishReason", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getFinishReason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "FinishReason", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Candidate {

                public static final Companion INSTANCE = new Companion(null);
                private final String zza;
                private final Integer zzb;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/google/mlkit/genai/prompt/Candidate$FinishReason;", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                @Retention(RetentionPolicy.RUNTIME)
                public @interface FinishReason {

                    public static final Companion INSTANCE = Companion.zza;
                    public static final int MAX_TOKENS = 1;
                    public static final int OTHER = -100;
                    public static final int STOP = 0;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/prompt/Candidate$FinishReason$Companion;", "", "<init>", "()V", "STOP", "", "MAX_TOKENS", "OTHER", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public static final int MAX_TOKENS = 1;
                        public static final int OTHER = -100;
                        public static final int STOP = 0;
                        static final Companion zza = new Companion();

                        private Companion() {
                        }
                    }
                }

                public Candidate(String str, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = num;
                }

                public final Integer getZzb() {
/* 1 */             return this.zzb;
                }

                public final String getZza() {
/* 1 */             return this.zza;
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u000b"}, d2 = {"Lcom/google/mlkit/genai/prompt/Candidate$Companion;", "", "<init>", "()V", "create", "Lcom/google/mlkit/genai/prompt/Candidate;", "text", "", "finishReason", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/mlkit/genai/prompt/Candidate;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public static final Candidate zza(String str, @FinishReason Integer num) {
/* 4 */                 return new Candidate(str, num, null);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }

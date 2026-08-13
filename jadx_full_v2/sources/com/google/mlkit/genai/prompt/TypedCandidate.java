            package com.google.mlkit.genai.prompt;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0086\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/google/mlkit/genai/prompt/TypedCandidate;", "T", "", "response", "finishReason", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;)V", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFinishReason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "TypedFinishReason", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class TypedCandidate<T> {
                private final Object zza;
                private final Integer zzb;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/google/mlkit/genai/prompt/TypedCandidate$TypedFinishReason;", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                @Retention(RetentionPolicy.RUNTIME)
                public @interface TypedFinishReason {

                    public static final Companion INSTANCE = Companion.zza;
                    public static final int MAX_TOKENS = 1;
                    public static final int OTHER = -100;
                    public static final int STOP = 0;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/prompt/TypedCandidate$TypedFinishReason$Companion;", "", "<init>", "()V", "STOP", "", "MAX_TOKENS", "OTHER", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public static final int MAX_TOKENS = 1;
                        public static final int OTHER = -100;
                        public static final int STOP = 0;
                        static final Companion zza = new Companion();

                        private Companion() {
                        }
                    }
                }

                public TypedCandidate(Object obj, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = obj;
/* 6 */             this.zzb = num;
                }

                public final Integer getZzb() {
/* 1 */             return this.zzb;
                }

                public final T getResponse() {
/* 1 */             return (T) this.zza;
                }
            }

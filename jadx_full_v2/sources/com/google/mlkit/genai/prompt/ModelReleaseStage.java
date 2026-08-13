            package com.google.mlkit.genai.prompt;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import kotlin.Metadata;
            
            @Retention(RetentionPolicy.SOURCE)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/google/mlkit/genai/prompt/ModelReleaseStage;", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public @interface ModelReleaseStage {

                public static final Companion INSTANCE = Companion.zza;
                public static final int PREVIEW = 1;
                public static final int STABLE = 0;

                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/google/mlkit/genai/prompt/ModelReleaseStage$Companion;", "", "<init>", "()V", "STABLE", "", "PREVIEW", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public static final int PREVIEW = 1;
                    public static final int STABLE = 0;
                    static final Companion zza = new Companion();

                    private Companion() {
                    }
                }
            }

            package com.google.mlkit.genai.prompt;

            import java.util.concurrent.ExecutorService;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0002\f\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerationConfig;", "", "workerExecutor", "Ljava/util/concurrent/ExecutorService;", "modelConfig", "Lcom/google/mlkit/genai/prompt/ModelConfig;", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/google/mlkit/genai/prompt/ModelConfig;)V", "getWorkerExecutor", "()Ljava/util/concurrent/ExecutorService;", "getModelConfig", "()Lcom/google/mlkit/genai/prompt/ModelConfig;", "Builder", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class GenerationConfig {

                public static final Companion INSTANCE = new Companion(null);
                private final ExecutorService zza;
                private final ModelConfig zzb;

                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerationConfig$Builder;", "", "<init>", "()V", "workerExecutor", "Ljava/util/concurrent/ExecutorService;", "getWorkerExecutor", "()Ljava/util/concurrent/ExecutorService;", "setWorkerExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "modelConfig", "Lcom/google/mlkit/genai/prompt/ModelConfig;", "getModelConfig", "()Lcom/google/mlkit/genai/prompt/ModelConfig;", "setModelConfig", "(Lcom/google/mlkit/genai/prompt/ModelConfig;)V", "build", "Lcom/google/mlkit/genai/prompt/GenerationConfig;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder {
                    private ExecutorService zza;
                    private ModelConfig zzb = ModelConfig.INSTANCE.getDEFAULT();

                    public final GenerationConfig build() {
/* 8 */                 return new GenerationConfig(this.zza, this.zzb, null);
                    }

                    public final ModelConfig getZzb() {
/* 1 */                 return this.zzb;
                    }

                    public final ExecutorService getZza() {
/* 1 */                 return this.zza;
                    }

                    public final void setModelConfig(ModelConfig modelConfig) {
/* 1 */                 this.zzb = modelConfig;
                    }

                    public final void setWorkerExecutor(ExecutorService executorService) {
/* 1 */                 this.zza = executorService;
                    }
                }

                public GenerationConfig(ExecutorService executorService, ModelConfig modelConfig, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = executorService;
/* 6 */             this.zzb = modelConfig;
                }

                public final ModelConfig getZzb() {
/* 1 */             return this.zzb;
                }

                public final ExecutorService getZza() {
/* 1 */             return this.zza;
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerationConfig$Companion;", "", "<init>", "()V", "builder", "Lcom/google/mlkit/genai/prompt/GenerationConfig$Builder;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
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

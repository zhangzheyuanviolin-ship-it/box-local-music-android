            package com.google.mlkit.genai.prompt;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fJ\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\r\u001a\u00020\u0003H\u0096\u0080\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/google/mlkit/genai/prompt/ModelConfig;", "", "releaseStage", "", "preference", "<init>", "(II)V", "getReleaseStage", "()I", "getPreference", "equals", "", "other", "hashCode", "Builder", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class ModelConfig {

                public static final Companion INSTANCE = new Companion(null);
                private static final ModelConfig zzc = new ModelConfig(0, 2);
                private final int zza;
                private final int zzb;

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/google/mlkit/genai/prompt/ModelConfig$Builder;", "", "<init>", "()V", "releaseStage", "", "getReleaseStage$annotations", "getReleaseStage", "()I", "setReleaseStage", "(I)V", "explicitPreference", "Ljava/lang/Integer;", "value", "preference", "getPreference$annotations", "getPreference", "setPreference", "build", "Lcom/google/mlkit/genai/prompt/ModelConfig;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder {
                    private int zza;
                    private Integer zzb;

                    public final ModelConfig build() {
/* 10 */                return new ModelConfig(this.zza, getPreference(), null);
                    }

                    public final int getPreference() {
/* 1 */                 Integer num = this.zzb;
                        return num != null ? num.intValue() : this.zza != 0 ? 1 : 2;
                    }

                    public final int getZza() {
/* 1 */                 return this.zza;
                    }

                    public final void setPreference(int i) {
/* 5 */                 this.zzb = Integer.valueOf(i);
                    }

                    public final void setReleaseStage(int i) {
/* 1 */                 this.zza = i;
                    }
                }

                private ModelConfig(int i, int i2) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = i2;
                }

                public static final Builder builder() {
/* 3 */             return INSTANCE.builder();
                }

                public static final ModelConfig getDEFAULT() {
/* 3 */             return INSTANCE.getDEFAULT();
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof ModelConfig)) {
/* 7 */                 return false;
                    }
/* 13 */            ModelConfig modelConfig = (ModelConfig) other;
                    return this.zza == modelConfig.zza && this.zzb == modelConfig.zzb;
                }

                public final int getZzb() {
/* 1 */             return this.zzb;
                }

                public final int getZza() {
/* 1 */             return this.zza;
                }

                public int hashCode() {
/* 7 */             return (this.zza * 31) + this.zzb;
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0007R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/mlkit/genai/prompt/ModelConfig$Companion;", "", "<init>", "()V", "builder", "Lcom/google/mlkit/genai/prompt/ModelConfig$Builder;", "DEFAULT", "Lcom/google/mlkit/genai/prompt/ModelConfig;", "getDEFAULT$annotations", "getDEFAULT", "()Lcom/google/mlkit/genai/prompt/ModelConfig;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final Builder builder() {
/* 3 */                 return new Builder();
                    }

                    public final ModelConfig getDEFAULT() {
/* 1 */                 return ModelConfig.zzc;
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }

/* 8 */         public ModelConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this(i, i2);
                }
            }

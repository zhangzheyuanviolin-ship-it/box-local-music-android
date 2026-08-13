            package com.google.mlkit.genai.prompt;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0IOli0o0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0013\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "", "T", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "generateContentRequest", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "getGenerateContentRequest", "()Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "LO0IOli0o0;", "outputClass", "LO0IOli0o0;", "getOutputClass", "()LO0IOli0o0;", "", "includeSchemaInPrompt", "Z", "getIncludeSchemaInPrompt", "()Z", "Companion", "Builder", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class GenerateTypedContentRequest<T> {

                public static final Companion INSTANCE = new Companion(null);
                private final GenerateContentRequest zza;
                private final O0IOli0o0 zzb;
                private final boolean zzc;

                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest$Builder;", "", "T", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "generateContentRequest", "LO0IOli0o0;", "outputClass", "<init>", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;LO0IOli0o0;)V", "Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "build", "()Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "", "includeSchemaInPrompt", "Z", "getIncludeSchemaInPrompt", "()Z", "setIncludeSchemaInPrompt", "(Z)V", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder<T> {
                    private final GenerateContentRequest zza;
                    private final O0IOli0o0 zzb;
                    private boolean zzc = true;

                    public Builder(GenerateContentRequest generateContentRequest, O0IOli0o0 o0IOli0o0) {
/* 7 */                 this.zza = generateContentRequest;
/* 9 */                 this.zzb = o0IOli0o0;
                    }

                    public final GenerateTypedContentRequest<T> build() {
/* 10 */                return new GenerateTypedContentRequest<>(this.zza, this.zzb, this.zzc, null);
                    }

                    public final boolean getZzc() {
/* 1 */                 return this.zzc;
                    }

                    public final void setIncludeSchemaInPrompt(boolean z) {
/* 1 */                 this.zzc = z;
                    }
                }

                public GenerateTypedContentRequest(GenerateContentRequest generateContentRequest, O0IOli0o0 o0IOli0o0, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = generateContentRequest;
/* 6 */             this.zzb = o0IOli0o0;
/* 8 */             this.zzc = z;
                }

                public final GenerateContentRequest getZza() {
/* 1 */             return this.zza;
                }

                public final boolean getZzc() {
/* 1 */             return this.zzc;
                }

                public final O0IOli0o0 getZzb() {
/* 1 */             return this.zzb;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest$Companion;", "", "T", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "generateContentRequest", "LO0IOli0o0;", "outputClass", "Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest$Builder;", "builder", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;LO0IOli0o0;)Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest$Builder;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final <T> Builder<T> builder(GenerateContentRequest generateContentRequest, O0IOli0o0 outputClass) {
/* 3 */                 return new Builder<>(generateContentRequest, outputClass);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }

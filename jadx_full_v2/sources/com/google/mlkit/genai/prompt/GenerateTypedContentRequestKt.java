            package com.google.mlkit.genai.prompt;

            import com.google.mlkit.genai.prompt.GenerateTypedContentRequest;
            import kotlin.Metadata;
            import p000.O0IOli0o0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "generateContentRequest", "LO0IOli0o0;", "outputClass", "Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "generateTypedContentRequest", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;LO0IOli0o0;)Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "", "includeSchemaInPrompt", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;LO0IOli0o0;Z)Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 2, mv = {2, 3, 0}, xi = 48)
/* 13 */    public final class GenerateTypedContentRequestKt {
                public static final <T> GenerateTypedContentRequest<T> generateTypedContentRequest(GenerateContentRequest generateContentRequest, O0IOli0o0 o0IOli0o0, boolean z) {
/* 3 */             GenerateTypedContentRequest.Builder<T> builder = GenerateTypedContentRequest.INSTANCE.builder(generateContentRequest, o0IOli0o0);
/* 7 */             builder.setIncludeSchemaInPrompt(z);
/* 10 */            return builder.build();
                }

/* 14 */        public static final <T> GenerateTypedContentRequest<T> generateTypedContentRequest(GenerateContentRequest generateContentRequest, O0IOli0o0 o0IOli0o0) {
/* 15 */            return GenerateTypedContentRequest.INSTANCE.builder(generateContentRequest, o0IOli0o0).build();
                }
            }

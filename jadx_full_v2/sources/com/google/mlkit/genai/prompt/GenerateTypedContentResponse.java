            package com.google.mlkit.genai.prompt;

            import java.util.List;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\nR \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateTypedContentResponse;", "T", "", "candidates", "", "Lcom/google/mlkit/genai/prompt/TypedCandidate;", "<init>", "(Ljava/util/List;)V", "getCandidates", "()Ljava/util/List;", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class GenerateTypedContentResponse<T> {
                private final List zza;

                public final List<TypedCandidate<T>> getCandidates() {
/* 1 */             return this.zza;
                }
            }

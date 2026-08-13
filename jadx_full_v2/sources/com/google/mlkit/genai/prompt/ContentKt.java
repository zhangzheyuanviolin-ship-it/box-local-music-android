            package com.google.mlkit.genai.prompt;

            import com.google.mlkit.genai.prompt.Content;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/mlkit/genai/prompt/Content$Builder;", "LOoiIlOl1iI;", "init", "Lcom/google/mlkit/genai/prompt/Content;", "content", "(Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/Content;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 2, mv = {2, 3, 0}, xi = 48)
            public final class ContentKt {
                public static final Content content(Function1 function1) {
/* 3 */             Content.Builder builder = Content.INSTANCE.builder();
/* 7 */             function1.invoke(builder);
/* 10 */            return builder.build();
                }
            }

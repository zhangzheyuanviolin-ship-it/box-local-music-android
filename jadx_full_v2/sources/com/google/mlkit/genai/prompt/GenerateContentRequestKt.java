            package com.google.mlkit.genai.prompt;

            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\u000b\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\u000e\u001a9\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\u000f\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\u0012\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/mlkit/genai/prompt/TextPart;", "text", "Lkotlin/Function1;", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest$Builder;", "LOoiIlOl1iI;", "init", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "generateContentRequest", "(Lcom/google/mlkit/genai/prompt/TextPart;Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "Lcom/google/mlkit/genai/prompt/ImagePart;", "image", "(Lcom/google/mlkit/genai/prompt/ImagePart;Lcom/google/mlkit/genai/prompt/TextPart;Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "Lcom/google/mlkit/genai/prompt/SystemInstruction;", "systemInstruction", "(Lcom/google/mlkit/genai/prompt/SystemInstruction;Lcom/google/mlkit/genai/prompt/TextPart;Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "(Lcom/google/mlkit/genai/prompt/SystemInstruction;Lcom/google/mlkit/genai/prompt/ImagePart;Lcom/google/mlkit/genai/prompt/TextPart;Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "Lcom/google/mlkit/genai/prompt/Content;", "content", "(Lcom/google/mlkit/genai/prompt/Content;Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "(Lcom/google/mlkit/genai/prompt/SystemInstruction;Lcom/google/mlkit/genai/prompt/Content;Lkotlin/jvm/functions/Function1;)Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 2, mv = {2, 3, 0}, xi = 48)
/* 15 */    public final class GenerateContentRequestKt {
                public static final GenerateContentRequest generateContentRequest(SystemInstruction systemInstruction, Content content, Function1 function1) {
/* 3 */             GenerateContentRequest.Builder builder = new GenerateContentRequest.Builder(content);
/* 6 */             builder.setSystemInstruction(systemInstruction);
/* 9 */             function1.invoke(builder);
/* 12 */            return builder.build();
                }

/* 16 */        public static final GenerateContentRequest generateContentRequest(ImagePart imagePart, TextPart textPart, Function1 function1) {
/* 17 */            GenerateContentRequest.Builder builder = GenerateContentRequest.INSTANCE.builder(imagePart, textPart);
/* 18 */            function1.invoke(builder);
/* 19 */            return builder.build();
                }

/* 19 */        public static final GenerateContentRequest generateContentRequest(Content content, Function1 function1) {
/* 20 */            GenerateContentRequest.Builder builder = new GenerateContentRequest.Builder(content);
/* 21 */            function1.invoke(builder);
/* 22 */            return builder.build();
                }

/* 22 */        public static final GenerateContentRequest generateContentRequest(SystemInstruction systemInstruction, ImagePart imagePart, TextPart textPart, Function1 function1) {
/* 23 */            GenerateContentRequest.Builder builder = new GenerateContentRequest.Builder(systemInstruction, imagePart, textPart);
/* 24 */            function1.invoke(builder);
/* 25 */            return builder.build();
                }

/* 25 */        public static final GenerateContentRequest generateContentRequest(SystemInstruction systemInstruction, TextPart textPart, Function1 function1) {
/* 26 */            GenerateContentRequest.Builder builder = new GenerateContentRequest.Builder(systemInstruction, textPart);
/* 27 */            function1.invoke(builder);
/* 28 */            return builder.build();
                }

/* 28 */        public static final GenerateContentRequest generateContentRequest(TextPart textPart, Function1 function1) {
/* 29 */            GenerateContentRequest.Builder builder = GenerateContentRequest.INSTANCE.builder(textPart);
/* 30 */            function1.invoke(builder);
/* 31 */            return builder.build();
                }
            }

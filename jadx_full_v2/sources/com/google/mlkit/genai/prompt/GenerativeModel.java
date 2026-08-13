            package com.google.mlkit.genai.prompt;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.StreamingCallback;
            import java.util.concurrent.ExecutorService;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            import p000.IlOil1ii;
            
            @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00070\u0005¢\u0006\u0002\b\u0006H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\f\u001a\u00020\bH¦@¢\u0006\u0004\b\f\u0010\u0004J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0012\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0018*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H¦@¢\u0006\u0004\b\u0016\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u001b\u0010\u0004J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u001d\u0010\u0017J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001d\u0010\u001fJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H¦@¢\u0006\u0004\b\u001d\u0010\"J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\u001d\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010&J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\b\b\u0000\u0010\u0018*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H¦@¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0011H¦@¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0011H&¢\u0006\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerativeModel;", "", "", "getBaseModelName", "(LIOoil1iiIilo;)Ljava/lang/Object;", "", "Lcom/google/mlkit/genai/common/FeatureStatus;", "checkStatus", "", "isCachingFeatureAvailable", "isStructuredOutputFeatureAvailable", "isSystemPromptAvailable", "isThinkingModeAvailable", "LIlOil1ii;", "Lcom/google/mlkit/genai/common/DownloadStatus;", "download", "()LIlOil1ii;", "LOoiIlOl1iI;", "warmup", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "request", "Lcom/google/mlkit/genai/prompt/CountTokensResponse;", "countTokens", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;LIOoil1iiIilo;)Ljava/lang/Object;", "T", "Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;", "(Lcom/google/mlkit/genai/prompt/GenerateTypedContentRequest;LIOoil1iiIilo;)Ljava/lang/Object;", "getTokenLimit", "Lcom/google/mlkit/genai/prompt/GenerateContentResponse;", "generateContent", "prompt", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "Lcom/google/mlkit/genai/common/StreamingCallback;", "streamingCallback", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;Lcom/google/mlkit/genai/common/StreamingCallback;LIOoil1iiIilo;)Ljava/lang/Object;", "(Ljava/lang/String;Lcom/google/mlkit/genai/common/StreamingCallback;LIOoil1iiIilo;)Ljava/lang/Object;", "generateContentStream", "(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;)LIlOil1ii;", "(Ljava/lang/String;)LIlOil1ii;", "Lcom/google/mlkit/genai/prompt/GenerateTypedContentResponse;", "clearImplicitCaches", "close", "()V", "Lcom/google/mlkit/genai/prompt/Caches;", "getCaches", "()Lcom/google/mlkit/genai/prompt/Caches;", "caches", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 15 */    public interface GenerativeModel {
                Object checkStatus(IOoil1iiIilo iOoil1iiIilo);

                Object clearImplicitCaches(IOoil1iiIilo iOoil1iiIilo);

                void close();

                Object countTokens(GenerateContentRequest generateContentRequest, IOoil1iiIilo iOoil1iiIilo);

                <T> Object countTokens(GenerateTypedContentRequest<T> generateTypedContentRequest, IOoil1iiIilo iOoil1iiIilo);

                IlOil1ii download();

                Object generateContent(GenerateContentRequest generateContentRequest, IOoil1iiIilo iOoil1iiIilo);

                Object generateContent(GenerateContentRequest generateContentRequest, StreamingCallback streamingCallback, IOoil1iiIilo iOoil1iiIilo);

                <T> Object generateContent(GenerateTypedContentRequest<T> generateTypedContentRequest, IOoil1iiIilo iOoil1iiIilo);

                default Object generateContent(String str, StreamingCallback streamingCallback, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return generateContent(GenerateContentRequestKt.generateContentRequest(new TextPart(str), zzb.zza), streamingCallback, iOoil1iiIilo);
                }

                IlOil1ii generateContentStream(GenerateContentRequest request);

                default IlOil1ii generateContentStream(String prompt) {
/* 12 */            return generateContentStream(GenerateContentRequestKt.generateContentRequest(new TextPart(prompt), zzc.zza));
                }

                Object getBaseModelName(IOoil1iiIilo iOoil1iiIilo);

                Caches getCaches();

                Object getTokenLimit(IOoil1iiIilo iOoil1iiIilo);

                Object isCachingFeatureAvailable(IOoil1iiIilo iOoil1iiIilo);

                Object isStructuredOutputFeatureAvailable(IOoil1iiIilo iOoil1iiIilo);

                Object isSystemPromptAvailable(IOoil1iiIilo iOoil1iiIilo);

                Object isThinkingModeAvailable(IOoil1iiIilo iOoil1iiIilo);

                Object warmup(IOoil1iiIilo iOoil1iiIilo);

                ListenableFuture zza(DownloadCallback downloadCallback);

                ListenableFuture zzb();

                ListenableFuture zzc(GenerateContentRequest generateContentRequest);

                ListenableFuture zzd();

                ListenableFuture zze();

                ExecutorService zzf();

/* 16 */        default Object generateContent(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 19 */            return generateContent(GenerateContentRequestKt.generateContentRequest(new TextPart(str), zzd.zza), iOoil1iiIilo);
                }
            }

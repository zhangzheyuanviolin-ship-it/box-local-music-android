            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"getKeywordsFile", "", "type", "", "getKwsModelConfig", "Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "sherpa_onnx_release"}, m18k = 2, mv = {1, 7, 1}, xi = 48)
            public final class KeywordSpotterKt {
                public static final String getKeywordsFile(int i) {
                    return i != 0 ? i != 1 ? "" : "sherpa-onnx-kws-zipformer-gigaspeech-3.3M-2024-01-01/keywords.txt" : "sherpa-onnx-kws-zipformer-wenetspeech-3.3M-2024-01-01/keywords.txt";
                }

                public static final OnlineModelConfig getKwsModelConfig(int i) {
/* 3 */             if (i == 0) {
/* 73 */                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-kws-zipformer-wenetspeech-3.3M-2024-01-01/encoder-epoch-12-avg-2-chunk-16-left-64.onnx", "sherpa-onnx-kws-zipformer-wenetspeech-3.3M-2024-01-01/decoder-epoch-12-avg-2-chunk-16-left-64.onnx", "sherpa-onnx-kws-zipformer-wenetspeech-3.3M-2024-01-01/joiner-epoch-12-avg-2-chunk-16-left-64.onnx"), null, null, null, null, "sherpa-onnx-kws-zipformer-wenetspeech-3.3M-2024-01-01/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
                    }
/* 6 */             if (i != 1) {
/* 8 */                 return null;
                    }
/* 39 */            return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-kws-zipformer-gigaspeech-3.3M-2024-01-01/encoder-epoch-12-avg-2-chunk-16-left-64.onnx", "sherpa-onnx-kws-zipformer-gigaspeech-3.3M-2024-01-01/decoder-epoch-12-avg-2-chunk-16-left-64.onnx", "sherpa-onnx-kws-zipformer-gigaspeech-3.3M-2024-01-01/joiner-epoch-12-avg-2-chunk-16-left-64.onnx"), null, null, null, null, "sherpa-onnx-kws-zipformer-gigaspeech-3.3M-2024-01-01/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
                }
            }

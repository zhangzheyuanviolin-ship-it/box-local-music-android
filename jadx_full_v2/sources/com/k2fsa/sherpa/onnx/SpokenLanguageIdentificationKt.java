            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"getSpokenLanguageIdentificationConfig", "Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;", "type", "", "numThreads", "sherpa_onnx_release"}, m18k = 2, mv = {1, 7, 1}, xi = 48)
            public final class SpokenLanguageIdentificationKt {
                public static final SpokenLanguageIdentificationConfig getSpokenLanguageIdentificationConfig(int i, int i2) {
/* 1 */             if (i == 0) {
/* 50 */                return new SpokenLanguageIdentificationConfig(new SpokenLanguageIdentificationWhisperConfig("sherpa-onnx-whisper-tiny/tiny-encoder.int8.onnx", "sherpa-onnx-whisper-tiny/tiny-decoder.int8.onnx", 0, 4, null), i2, true, null, 8, null);
                    }
/* 4 */             if (i != 1) {
/* 6 */                 return null;
                    }
/* 27 */            return new SpokenLanguageIdentificationConfig(new SpokenLanguageIdentificationWhisperConfig("sherpa-onnx-whisper-base/base-encoder.int8.onnx", "sherpa-onnx-whisper-base/base-decoder.int8.onnx", 0, 4, null), 1, true, null, 8, null);
                }

                public static SpokenLanguageIdentificationConfig getSpokenLanguageIdentificationConfig$default(int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 2) != 0) {
/* 5 */                 i2 = 1;
                    }
/* 6 */             return getSpokenLanguageIdentificationConfig(i, i2);
                }
            }

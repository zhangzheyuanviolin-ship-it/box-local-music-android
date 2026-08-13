            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"getAudioTaggingConfig", "Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;", "type", "", "numThreads", "sherpa_onnx_release"}, m18k = 2, mv = {1, 7, 1}, xi = 48)
            public final class AudioTaggingKt {
                public static final AudioTaggingConfig getAudioTaggingConfig(int i, int i2) {
/* 2 */             if (i == 0) {
/* 158 */               return new AudioTaggingConfig(new AudioTaggingModelConfig(new OfflineZipformerAudioTaggingModelConfig("sherpa-onnx-zipformer-small-audio-tagging-2024-04-15/model.int8.onnx"), null, i2, true, null, 18, null), "sherpa-onnx-zipformer-small-audio-tagging-2024-04-15/class_labels_indices.csv", 3);
                    }
/* 5 */             if (i == 1) {
/* 131 */               return new AudioTaggingConfig(new AudioTaggingModelConfig(new OfflineZipformerAudioTaggingModelConfig("sherpa-onnx-zipformer-audio-tagging-2024-04-09/model.int8.onnx"), null, i2, true, null, 18, null), "sherpa-onnx-zipformer-audio-tagging-2024-04-09/class_labels_indices.csv", 3);
                    }
/* 8 */             if (i == 2) {
/* 104 */               return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-tiny-audio-tagging-2024-04-19/model.int8.onnx", i2, true, null, 17, null), "sherpa-onnx-ced-tiny-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
                    }
/* 10 */            if (i == 3) {
/* 82 */                return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-mini-audio-tagging-2024-04-19/model.int8.onnx", i2, true, null, 17, null), "sherpa-onnx-ced-mini-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
                    }
/* 13 */            if (i == 4) {
/* 60 */                return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-small-audio-tagging-2024-04-19/model.int8.onnx", i2, true, null, 17, null), "sherpa-onnx-ced-small-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
                    }
/* 16 */            if (i != 5) {
/* 18 */                return null;
                    }
/* 38 */            return new AudioTaggingConfig(new AudioTaggingModelConfig(null, "sherpa-onnx-ced-base-audio-tagging-2024-04-19/model.int8.onnx", i2, true, null, 17, null), "sherpa-onnx-ced-base-audio-tagging-2024-04-19/class_labels_indices.csv", 3);
                }

                public static AudioTaggingConfig getAudioTaggingConfig$default(int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 2) != 0) {
/* 5 */                 i2 = 1;
                    }
/* 6 */             return getAudioTaggingConfig(i, i2);
                }
            }

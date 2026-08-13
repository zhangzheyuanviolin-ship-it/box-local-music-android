            package com.k2fsa.sherpa.onnx;

            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getVadModelConfig", "Lcom/k2fsa/sherpa/onnx/VadModelConfig;", "type", "", "sherpa_onnx_release"}, m18k = 2, mv = {1, 7, 1}, xi = 48)
            public final class VadKt {
                public static final VadModelConfig getVadModelConfig(int i) {
/* 1 */             if (i == 0) {
/* 75 */                return new VadModelConfig(new SileroVadModelConfig("silero_vad.onnx", 0.5f, 0.25f, 0.25f, Barcode.FORMAT_UPC_A, 0.0f, 32, null), null, WhisperEngine.SAMPLE_RATE, 1, "cpu", false, 34, null);
                    }
/* 4 */             if (i != 1) {
/* 6 */                 return null;
                    }
/* 40 */            return new VadModelConfig(null, new TenVadModelConfig("ten-vad.onnx", 0.5f, 0.25f, 0.25f, Barcode.FORMAT_QR_CODE, 0.0f, 32, null), WhisperEngine.SAMPLE_RATE, 1, "cpu", false, 33, null);
                }
            }

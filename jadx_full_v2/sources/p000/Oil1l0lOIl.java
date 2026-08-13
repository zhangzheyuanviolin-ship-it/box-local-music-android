            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.k2fsa.sherpa.onnx.FeatureConfig;
            import com.k2fsa.sherpa.onnx.HomophoneReplacerConfig;
            import com.k2fsa.sherpa.onnx.OfflineModelConfig;
            import com.k2fsa.sherpa.onnx.OfflineRecognizer;
            import com.k2fsa.sherpa.onnx.OfflineRecognizerConfig;
            import com.k2fsa.sherpa.onnx.OfflineSenseVoiceModelConfig;
            
            public final class Oil1l0lOIl extends Oll0io implements IlliIl1l11O {
                public final Oil1lO I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final boolean I00iio;
                public final String I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oil1l0lOIl(Oil1lO oil1lO, String str, String str2, boolean z, String str3, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = oil1lO;
/* 3 */             this.I00iiI = str;
/* 5 */             this.I00iiO = str2;
/* 7 */             this.I00iio = z;
/* 9 */             this.I00ilI0I1 = str3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new Oil1l0lOIl(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Oil1l0lOIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
/* 3 */             Oil1lO oil1lO = this.I00iOIl;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 10 */                OfflineRecognizer offlineRecognizer = oil1lO.I00000oIO;
/* 12 */                if (offlineRecognizer != null) {
/* 14 */                    offlineRecognizer.release();
                        }
/* 18 */                oil1lO.I00000oIO = null;
/* 106 */               HomophoneReplacerConfig homophoneReplacerConfig = null;
/* 107 */               int i = 0;
/* 108 */               String str = null;
/* 109 */               float f = 0.0f;
/* 110 */               String str2 = null;
/* 111 */               String str3 = null;
/* 112 */               float f2 = 0.0f;
/* 121 */               oil1lO.I00000oIO = new OfflineRecognizer(null, new OfflineRecognizerConfig(new FeatureConfig(WhisperEngine.SAMPLE_RATE, 80, 0.0f, 4, null), new OfflineModelConfig(null, null, null, null, null, null, new OfflineSenseVoiceModelConfig(this.I00iiI, this.I00iiO, this.I00iio, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, 2, false, "cpu", null, this.I00ilI0I1, null, null, 27525055, null), homophoneReplacerConfig, "greedy_search", i, str, f, str2, str3, f2, 1012, null));
/* 123 */               z = true;
                    } catch (Throwable th) {
/* 130 */               Log.e("SenseVoiceEngine", "loadModel failed", th);
/* 133 */               z = false;
                    }
/* 134 */           return Boolean.valueOf(z);
                }
            }

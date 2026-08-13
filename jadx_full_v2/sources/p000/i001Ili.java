            package p000;

            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            
            public final class i001Ili extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final WhisperEngine I00iiI;
                public final float[] I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i001Ili(WhisperEngine whisperEngine, float[] fArr, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = whisperEngine;
/* 5 */             this.I00iiO = fArr;
/* 7 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new i001Ili(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new i001Ili(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((i001Ili) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iio;
/* 5 */             float[] fArr = this.I00iiO;
/* 9 */             WhisperEngine whisperEngine = this.I00iiI;
                    switch (i) {
                        case 0:
/* 43 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 45 */                    lIoii1l01l0i.I00000oOI(obj);
                            return whisperEngine.contextHandle == 0 ? "" : whisperEngine.transcribeNative(whisperEngine.contextHandle, fArr, str);
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    lIoii1l01l0i.I00000oOI(obj);
                            return whisperEngine.contextHandle == 0 ? Il01100l.I00iOIl : whisperEngine.parseSegmentsJson(whisperEngine.transcribeWithSegmentsNative(whisperEngine.contextHandle, fArr, str));
                    }
                }
            }

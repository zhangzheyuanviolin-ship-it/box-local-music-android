            package p000;

            import android.graphics.Bitmap;
            import android.os.Build;
            import android.util.Log;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerateContentRequestKt;
            import com.google.mlkit.genai.prompt.ImagePart;
            import com.google.mlkit.genai.prompt.TextPart;
            import java.lang.invoke.VarHandle;
            
            public final class IlooIo11l extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final String I00iiO;
                public final Bitmap I00iio;
                public final int I00ilI0I1;
                public final IlooOlI I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlooIo11l(String str, Bitmap bitmap, int i, IlooOlI ilooOlI, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = str;
/* 3 */             this.I00iio = bitmap;
/* 5 */             this.I00ilI0I1 = i;
/* 7 */             this.I00ilO0 = ilooOlI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            IlooIo11l ilooIo11l = new IlooIo11l(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
/* 15 */            ilooIo11l.I00iiI = obj;
/* 37 */            return ilooIo11l;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IlooIo11l) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
                    GenerateContentRequest generateContentRequest;
/* 4 */             IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiI;
/* 6 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 8 */             int i = this.I00iOIl;
                    try {
/* 11 */                if (i == 0) {
/* 26 */                    lIoii1l01l0i.I00000oOI(obj);
/* 31 */                    String str = this.I00iiO;
/* 33 */                    OlOoOIi0o.I00OIl(60, str);
/* 36 */                    String str2 = Build.MODEL;
/* 38 */                    int i2 = this.I00ilI0I1;
/* 40 */                    Bitmap bitmap = this.I00iio;
/* 42 */                    if (bitmap != null) {
/* 46 */                        ImagePart imagePart = new ImagePart(bitmap);
/* 51 */                        TextPart textPart = new TextPart(str);
/* 57 */                        I0li00iII1I i0li00iII1I = new I0li00iII1I(5);
/* 60 */                        i0li00iII1I.I00iiI = i2;
/* 62 */                        VarHandle.storeStoreFence();
/* 65 */                        generateContentRequest = GenerateContentRequestKt.generateContentRequest(imagePart, textPart, i0li00iII1I);
                            } else {
/* 73 */                        TextPart textPart2 = new TextPart(str);
/* 79 */                        I0li00iII1I i0li00iII1I2 = new I0li00iII1I(6);
/* 82 */                        i0li00iII1I2.I00iiI = i2;
/* 84 */                        VarHandle.storeStoreFence();
/* 87 */                        generateContentRequest = GenerateContentRequestKt.generateContentRequest(textPart2, i0li00iII1I2);
                            }
/* 99 */                    IiI110i1O iiI110i1O = new IiI110i1O(this.I00ilO0, generateContentRequest, ilOil1iooOO0, null, 11);
/* 102 */                   this.I00iiI = null;
/* 104 */                   this.I00iOIl = 1;
/* 113 */                   if (lOlo0o.I00000oOI(60000L, iiI110i1O, this) == ii0111o) {
/* 115 */                       return ii0111o;
                            }
                        } else {
/* 13 */                    if (i != 1) {
/* 21 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 24 */                        return null;
                            }
/* 15 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 116 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Oo11Oo unused) {
/* 123 */               Log.e("GeminiNanoProvider", "generate() timed out after 60s — AICore model not yet ready");
/* 168 */               throw new Exception("AICore is still preparing the model. Please wait a moment and try again.");
                    }
                }
            }

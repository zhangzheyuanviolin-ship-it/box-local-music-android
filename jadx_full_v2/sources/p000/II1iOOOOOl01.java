            package p000;

            import android.content.Context;
            import android.speech.tts.TextToSpeech;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II1iOOOOOl01 implements Function1 {
                public final int I00iOIl;
                public II1o0111IO0 I00iiI;
                public Context I00iiO;
                public O1ol100o0O I00iio;

                public II1iOOOOOl01(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    boolean z;
/* 3 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 178 */                   II1o0111IO0 iI1o0111IO0 = this.I00iiI;
/* 180 */                   Context context = this.I00iiO;
/* 182 */                   O1ol100o0O o1ol100o0O = this.I00iio;
/* 188 */                   II1iOOOOOl01 iI1iOOOOOl01 = new II1iOOOOOl01(i);
/* 191 */                   iI1iOOOOOl01.I00iiI = iI1o0111IO0;
/* 193 */                   iI1iOOOOOl01.I00iiO = context;
/* 195 */                   iI1iOOOOOl01.I00iio = o1ol100o0O;
/* 197 */                   VarHandle.storeStoreFence();
/* 200 */                   iOi0oO1iilo.I00000oIO = iI1iOOOOOl01;
                            break;
                        case 1:
/* 141 */                   II1o0111IO0 iI1o0111IO02 = this.I00iiI;
/* 143 */                   Context context2 = this.I00iiO;
/* 145 */                   O1ol100o0O o1ol100o0O2 = this.I00iio;
/* 149 */                   int iIntValue = ((Integer) obj).intValue();
/* 155 */                   if (iIntValue == 24) {
/* 168 */                       iI1o0111IO02.I000O01llI0(true);
                            } else if (iIntValue != 25) {
/* 161 */                       z = false;
                                break;
                            } else {
/* 163 */                       iI1o0111IO02.I00100l0(context2, o1ol100o0O2);
                            }
/* 166 */                   z = true;
                        case 2:
/* 22 */                    II1o0111IO0 iI1o0111IO03 = this.I00iiI;
/* 24 */                    Context context3 = this.I00iiO;
/* 26 */                    O1ol100o0O o1ol100o0O3 = this.I00iio;
/* 32 */                    if (!iI1o0111IO03.I000iOII) {
/* 45 */                        if (((II1l1O1oi01) iI1o0111IO03.I0000Il00O.getValue()).I0000oI00) {
/* 47 */                            iI1o0111IO03.I001IIilI0O();
                                }
/* 52 */                        iI1o0111IO03.I000OiO.getClass();
/* 61 */                        if (iOI10i0I11.I00000oIO(context3, "android.permission.RECORD_AUDIO") == 0) {
/* 63 */                            iI1o0111IO03.I000iOII = true;
/* 65 */                            I1OI0i1lo i1OI0i1lo = iI1o0111IO03.I000O01llI0;
/* 67 */                            TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 69 */                            if (textToSpeech != null) {
/* 71 */                                textToSpeech.stop();
                                    }
/* 76 */                            i1OI0i1lo.I0001Ioi1lo = "";
/* 86 */                            iI1o0111IO03.I000O01llI0.I0000Il00O(new long[]{0, 40, 60, 40});
/* 89 */                            OlO0OIIl1 olO0OIIl1 = iI1o0111IO03.I0000Il00O;
/* 111 */                           olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Listening…", null, false, 27));
/* 126 */                           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(iI1o0111IO03), null, null, new I00oIiI10(iI1o0111IO03, context3, o1ol100o0O3, null, 16), 3);
                                } else {
/* 134 */                           iI1o0111IO03.I000O01llI0.I00000oOI("Microphone permission is needed for voice questions. Grant it and try again.");
                                }
                            }
                            break;
                        default:
/* 15 */                    this.I00iiI.I00100l0(this.I00iiO, this.I00iio);
                            break;
                    }
/* 18 */            return OoiIlOl1iI.I00000oIO;
                }
            }

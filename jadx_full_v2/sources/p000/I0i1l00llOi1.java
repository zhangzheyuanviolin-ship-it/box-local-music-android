            package p000;

            import android.graphics.Bitmap;
            import com.google.ai.edge.gallery.common.CallJsSkillResultImage;
            import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import java.util.Collections;
            import kotlin.jvm.functions.Function1;
            
            public final class I0i1l00llOi1 implements Function1 {
                public final int I00iOIl;
                public float I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I0i1l00llOi1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    Bitmap bitmapI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             float fFloatValue = 0.0f;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 369 */                   AgentTools agentTools = (AgentTools) this.I00iiO;
/* 373 */                   O11OliOlOII o11OliOlOII = (O11OliOlOII) this.I00iio;
/* 375 */                   float f = this.I00iiI;
/* 377 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj;
/* 379 */                   CallJsSkillResultImage resultImageToShow = agentTools.getResultImageToShow();
/* 384 */                   if (resultImageToShow != null) {
/* 386 */                       String base64 = resultImageToShow.getBase64();
/* 390 */                       if (base64 != null && (bitmapI00000oIO = Ol0o1l0ll0i.I00000oIO(base64)) != null) {
/* 428 */                           o11OliOlOII.I0000oI00(o1oIOiI11o0, new IO1OoiOlOO(Collections.singletonList(bitmapI00000oIO), Collections.singletonList(new I0oO00o(bitmapI00000oIO)), (int) (f * 0.8d), IO1loo.I00iiI, 32));
                                }
/* 431 */                       agentTools.setResultImageToShow(null);
                            }
/* 434 */                   CallJsSkillResultWebview resultWebviewToShow = agentTools.getResultWebviewToShow();
/* 438 */                   if (resultWebviewToShow != null) {
/* 440 */                       String url = resultWebviewToShow.getUrl();
/* 444 */                       if (url == null) {
/* 446 */                           url = "";
                                }
/* 454 */                       boolean zI0000O = O0000Ioio00.I0000O(resultWebviewToShow.getIframe(), Boolean.TRUE);
/* 458 */                       Float aspectRatio = resultWebviewToShow.getAspectRatio();
/* 479 */                       o11OliOlOII.I0000oI00(o1oIOiI11o0, new IO1ii1lol0Il(url, zI0000O, aspectRatio != null ? aspectRatio.floatValue() : 1.333f, 8));
/* 482 */                       agentTools.setResultWebviewToShow(null);
                            }
/* 485 */                   IO0O0o0O1Ol.I0000oI00(o11OliOlOII, o1oIOiI11o0, agentTools);
/* 488 */                   return ooiIlOl1iI;
                        case 1:
/* 302 */                   float f2 = this.I00iiI;
/* 307 */                   I0oO00o i0oO00o = (I0oO00o) this.I00iiO;
/* 312 */                   II0oIl iI0oIl = (II0oIl) this.I00iio;
/* 315 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 317 */                   o0iiliOio.I00000oOI();
/* 322 */                   IOO000ilo iOO000ilo = o0iiliOio.I00iOIl.I00iiI;
/* 324 */                   long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 332 */                   iOO000ilo.I0010o().I000II();
                            try {
/* 337 */                       IIOOoll iIOOoll = (IIOOoll) iOO000ilo.I00iiI;
/* 339 */                       iIOOoll.I00i0oil(f2, 0.0f);
/* 346 */                       iIOOoll.I00OloOo(45.0f, 0L);
/* 354 */                       IilloIOOO0i.I00111O(o0iiliOio, i0oO00o, 0L, 0.0f, iI0oIl, 46);
/* 360 */                       return ooiIlOl1iI;
                            } finally {
/* 363 */                       IIlIOloOOO.I001IO000(iOO000ilo, jI001iOo1i0O);
                            }
                        case 2:
/* 238 */                   float f3 = this.I00iiI;
/* 242 */                   OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iiO;
/* 246 */                   OlO01l1oOil olO01l1oOil2 = (OlO01l1oOil) this.I00iio;
/* 248 */                   Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 250 */                   oi11lOiIoi.I0000Il00O(f3);
/* 274 */                   oi11lOiIoi.I000iOII(((Number) olO01l1oOil2.getValue()).floatValue() * ((Number) olO01l1oOil.getValue()).floatValue());
/* 298 */                   oi11lOiIoi.I000l1(((Number) olO01l1oOil2.getValue()).floatValue() * ((Number) olO01l1oOil.getValue()).floatValue());
/* 301 */                   return ooiIlOl1iI;
                        case 3:
/* 145 */                   float f4 = this.I00iiI;
/* 149 */                   OOo0lO oOo0lO = (OOo0lO) this.I00iiO;
/* 153 */                   O0o0101i o0o0101i = (O0o0101i) this.I00iio;
/* 155 */                   I110IIooo i110IIooo = (I110IIooo) obj;
/* 159 */                   if (f4 > 0.0f) {
/* 169 */                       fFloatValue = ((Number) i110IIooo.I0000oI00.getValue()).floatValue();
/* 175 */                       if (fFloatValue > f4) {
/* 177 */                           fFloatValue = f4;
                                }
                            } else if (f4 < 0.0f) {
/* 191 */                       fFloatValue = ((Number) i110IIooo.I0000oI00.getValue()).floatValue();
/* 197 */                       if (fFloatValue < f4) {
                                }
                            }
/* 202 */                   float f5 = fFloatValue - oOo0lO.I00iOIl;
/* 210 */                   if (f5 != o0o0101i.I00000oIO(f5) || fFloatValue != ((Number) i110IIooo.I0000oI00.getValue()).floatValue()) {
/* 229 */                       i110IIooo.I00000oIO();
                            }
                            oOo0lO.I00iOIl += f5;
/* 237 */                   return ooiIlOl1iI;
                        case 4:
/* 115 */                   OO1I0001000i oO1I0001000i = (OO1I0001000i) this.I00iiO;
/* 119 */                   Oo10o0lI00O oo10o0lI00O = (Oo10o0lI00O) this.I00iio;
/* 121 */                   float fFloatValue2 = this.I00iiI;
/* 123 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 125 */                   I10i01 i10i01 = oo10o0lI00O.I00oII;
/* 127 */                   if (i10i01 != null) {
/* 135 */                       fFloatValue2 = ((Number) i10i01.I0000O()).floatValue();
                            }
/* 141 */                   OO11o0IO.I000iOII(oO11o0IO, oO1I0001000i, (int) fFloatValue2, 0);
/* 144 */                   return ooiIlOl1iI;
                        default:
/* 11 */                    Ooioool0 ooioool0 = (Ooioool0) this.I00iiO;
/* 13 */                    float f6 = this.I00iiI;
/* 17 */                    Function1 function1 = (Function1) this.I00iio;
/* 21 */                    long jLongValue = ((Long) obj).longValue();
/* 25 */                    long j = ooioool0.I00000oOI;
/* 31 */                    if (j == Long.MIN_VALUE) {
/* 33 */                        ooioool0.I00000oOI = jLongValue;
/* 35 */                        j = jLongValue;
                            }
/* 38 */                    float f7 = ooioool0.I0000oI00;
/* 40 */                    I110iOiOllO i110iOiOllO = new I110iOiOllO(f7);
/* 45 */                    I110iOiOllO i110iOiOllO2 = Ooioool0.I0001Ioi1lo;
/* 69 */                    long jI00000oOI = f6 == 0.0f ? ooioool0.I00000oIO.I00000oOI(new I110iOiOllO(f7), i110iOiOllO2, ooioool0.I0000Il00O) : O1OooO0IlOo.I000O01llI0((jLongValue - j) / f6);
/* 84 */                    float f8 = ((I110iOiOllO) ooioool0.I00000oIO.I00Io1lO(jI00000oOI, i110iOiOllO, i110iOiOllO2, ooioool0.I0000Il00O)).I00000oIO;
/* 96 */                    ooioool0.I0000Il00O = (I110iOiOllO) ooioool0.I00000oIO.I000oI1ioi(jI00000oOI, i110iOiOllO, i110iOiOllO2, ooioool0.I0000Il00O);
/* 98 */                    ooioool0.I00000oOI = jLongValue;
/* 102 */                   float f9 = ooioool0.I0000oI00 - f8;
/* 103 */                   ooioool0.I0000oI00 = f8;
/* 109 */                   function1.invoke(Float.valueOf(f9));
/* 112 */                   return ooiIlOl1iI;
                    }
                }
            }

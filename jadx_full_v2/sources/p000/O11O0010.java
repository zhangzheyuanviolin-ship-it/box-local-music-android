            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.speech.tts.TextToSpeech;
            import java.lang.invoke.VarHandle;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
            public final class O11O0010 implements Function1 {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public O11O0010(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 172 */                   boolean z = this.I00iiI;
/* 176 */                   StringBuilder sb = (StringBuilder) this.I00iiO;
/* 182 */                   Pattern pattern = ((OOoiliiIoloI) this.I00iio).I00iOIl;
/* 186 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 190 */                   TextToSpeech textToSpeech = (TextToSpeech) this.I00ilO0;
/* 192 */                   String str = (String) obj;
/* 194 */                   if (z && O11Oio.I0000Il00O(oI10i0Il)) {
/* 202 */                       sb.append(str);
/* 205 */                       String string = sb.toString();
/* 214 */                       O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(pattern.matcher(string), 0, string);
/* 218 */                       if (o1OlOOioiII00000oIO == null && string.length() > 500) {
/* 228 */                           String strI0000oI00 = O11Oio.I0000oI00(string);
/* 236 */                           if (strI0000oI00.length() > 0) {
/* 244 */                               Handler handler = new Handler(Looper.getMainLooper());
/* 249 */                               O11O0liO01 o11O0liO01 = new O11O0liO01(0);
/* 252 */                               o11O0liO01.I00iiI = textToSpeech;
/* 254 */                               o11O0liO01.I00iiO = strI0000oI00;
/* 256 */                               VarHandle.storeStoreFence();
/* 259 */                               handler.post(o11O0liO01);
                                    }
/* 262 */                           sb.setLength(0);
                                    break;
                                } else {
/* 266 */                           while (o1OlOOioiII00000oIO != null) {
/* 279 */                               String strI0000oI002 = O11Oio.I0000oI00(string.substring(0, o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1));
/* 290 */                               string = string.substring(o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1);
/* 298 */                               if (strI0000oI002.length() > 0) {
/* 306 */                                   Handler handler2 = new Handler(Looper.getMainLooper());
/* 311 */                                   O11O0liO01 o11O0liO012 = new O11O0liO01(1);
/* 314 */                                   o11O0liO012.I00iiI = textToSpeech;
/* 316 */                                   o11O0liO012.I00iiO = strI0000oI002;
/* 318 */                                   VarHandle.storeStoreFence();
/* 321 */                                   handler2.post(o11O0liO012);
                                        }
/* 328 */                               o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(pattern.matcher(string), 0, string);
                                    }
/* 337 */                           sb.replace(0, sb.length(), string);
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 37 */                    boolean z2 = this.I00iiI;
/* 43 */                    OIooliIO0 oIooliIO0 = ((OI10ooOi) this.I00iiO).I00iiO;
/* 47 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 51 */                    OoI1O1OIoI ooI1O1OIoI = (OoI1O1OIoI) this.I00ilI0I1;
/* 55 */                    OoI1O1OIoI ooI1O1OIoI2 = (OoI1O1OIoI) this.I00ilO0;
/* 57 */                    Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 59 */                    float fFloatValue = 0.8f;
/* 62 */                    float fFloatValue2 = 1.0f;
/* 94 */                    oi11lOiIoi.I000iOII(!z2 ? ((Number) ooI1O1OIoI.I00l0OO0IO.getValue()).floatValue() : ((Boolean) oIooliIO0.getValue()).booleanValue() ? 1.0f : 0.8f);
/* 97 */                    if (!z2) {
/* 107 */                       fFloatValue = ((Number) ooI1O1OIoI.I00l0OO0IO.getValue()).floatValue();
                            } else if (((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 124 */                       fFloatValue = 1.0f;
                            }
/* 125 */                   oi11lOiIoi.I000l1(fFloatValue);
/* 128 */                   if (!z2) {
/* 138 */                       fFloatValue2 = ((Number) ooI1O1OIoI2.I00l0OO0IO.getValue()).floatValue();
                            } else if (!((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 156 */                       fFloatValue2 = 0.0f;
                            }
/* 157 */                   oi11lOiIoi.I0000Il00O(fFloatValue2);
/* 168 */                   oi11lOiIoi.I001iOo1i0O(((OoI0l01O) illOOo00lI.invoke()).I00000oIO);
                            break;
                        default:
/* 11 */                    OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiO;
/* 15 */                    OOo0l0ii10l oOo0l0ii10l2 = (OOo0l0ii10l) this.I00iio;
/* 19 */                    OI1i0llli oI1i0llli = (OI1i0llli) this.I00ilI0I1;
/* 21 */                    boolean z3 = this.I00iiI;
/* 25 */                    I1Il0loi i1Il0loi = (I1Il0loi) this.I00ilO0;
/* 29 */                    oOo0l0ii10l.I00iOIl = true;
/* 31 */                    oOo0l0ii10l2.I00iOIl = true;
/* 33 */                    oI1i0llli.I000lI((OI1OloOIO1O) obj, z3, i1Il0loi);
                            break;
                    }
/* 36 */            return ooiIlOl1iI;
                }
            }

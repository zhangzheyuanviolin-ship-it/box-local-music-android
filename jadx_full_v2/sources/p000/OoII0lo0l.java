            package p000;

            import android.content.Context;
            import android.speech.tts.TextToSpeech;
            import kotlin.jvm.functions.Function1;
            
            public final class OoII0lo0l implements Function1 {
                public final int I00iOIl;
                public OoIO11oiiiil I00iiI;
                public Context I00iiO;

                @Override
                public final Object invoke(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 140 */                   OoIO11oiiiil ooIO11oiiiil = this.I00iiI;
/* 142 */                   Context context = this.I00iiO;
/* 148 */                   boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 152 */                   OlO0OIIl1 olO0OIIl1 = ooIO11oiiiil.I00000oOI;
/* 173 */                   olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, null, null, null, null, false, zBooleanValue, 127));
/* 178 */                   Oi010OO0.I001lllioOl(context, "box_settings", 0, "translator_speak", zBooleanValue);
/* 181 */                   if (!zBooleanValue) {
                                try {
/* 183 */                           TextToSpeech textToSpeech = ooIO11oiiiil.I000OOo1O;
/* 185 */                           if (textToSpeech != null) {
/* 187 */                               textToSpeech.stop();
                                    }
                                } catch (Throwable th) {
/* 192 */                           lIoii1l01l0i.I00000oIO(th);
                                }
                            }
                            break;
                        case 1:
/* 134 */                   this.I00iiI.I000II(this.I00iiO, OoIIOoO.I00iOIl, (OoI1lOl) obj);
                            break;
                        case 2:
/* 118 */                   this.I00iiI.I000II(this.I00iiO, OoIIOoO.I00iiI, (OoI1lOl) obj);
                            break;
                        default:
/* 12 */                    OoIO11oiiiil ooIO11oiiiil2 = this.I00iiI;
/* 14 */                    Context context2 = this.I00iiO;
/* 20 */                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 24 */                    OlO0OIIl1 olO0OIIl12 = ooIO11oiiiil2.I00000oOI;
/* 45 */                    olO0OIIl12.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl12.getValue(), null, null, null, null, null, null, zBooleanValue2, false, 191));
/* 50 */                    Oi010OO0.I001lllioOl(context2, "box_settings", 0, "translator_auto", zBooleanValue2);
/* 53 */                    if (!zBooleanValue2) {
                                ooIO11oiiiil2.I000O01llI0++;
/* 63 */                        ooIO11oiiiil2.I0000O.I00000oOI = true;
                                try {
/* 65 */                            TextToSpeech textToSpeech2 = ooIO11oiiiil2.I000OOo1O;
/* 67 */                            if (textToSpeech2 != null) {
/* 69 */                                textToSpeech2.stop();
                                    }
                                } catch (Throwable th2) {
/* 74 */                            lIoii1l01l0i.I00000oIO(th2);
                                }
/* 77 */                        OlO0OIIl1 olO0OIIl13 = ooIO11oiiiil2.I00000oOI;
/* 102 */                       olO0OIIl13.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl13.getValue(), null, null, OoII00OiO.I00iOIl, null, null, "", false, false, 211));
                            }
                            break;
                    }
/* 105 */           return OoiIlOl1iI.I00000oIO;
                }
            }

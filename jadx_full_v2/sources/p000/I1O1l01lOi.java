            package p000;

            import android.speech.tts.TextToSpeech;
            import android.util.Log;
            import java.util.Locale;
            
            public final class I1O1l01lOi implements TextToSpeech.OnInitListener {
                public final int I00000oIO;
                public Object I00000oOI;

                public I1O1l01lOi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void onInit(int i) {
/* 5 */             int i2 = this.I00000oIO;
/* 10 */            Object obj = this.I00000oOI;
                    switch (i2) {
                        case 0:
/* 119 */                   I1OI0i1lo i1OI0i1lo = (I1OI0i1lo) obj;
/* 123 */                   if (i != 0) {
/* 249 */                       Log.e("BoxAssistSpeaker", "TextToSpeech init FAILED: status=" + i + " — no speech will be produced.");
                                break;
                            } else {
/* 125 */                       TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 139 */                       int language = textToSpeech != null ? textToSpeech.setLanguage(Locale.getDefault()) : -1;
/* 141 */                       if ((language == -2 || language == -1) && textToSpeech != null) {
/* 150 */                           language = textToSpeech.setLanguage(Locale.US);
                                }
/* 159 */                       if (i1OI0i1lo.I0000oI00 > 0.0f && textToSpeech != null) {
                                    try {
/* 165 */                               textToSpeech.setSpeechRate(i1OI0i1lo.I0000oI00);
                                    } catch (Throwable th) {
/* 170 */                               lIoii1l01l0i.I00000oIO(th);
                                    }
                                }
/* 173 */                       if (textToSpeech != null) {
/* 180 */                           textToSpeech.setOnUtteranceProgressListener(new I1O1o0llo1O0());
                                }
/* 183 */                       i1OI0i1lo.I0000Il00O = true;
/* 204 */                       Log.i("BoxAssistSpeaker", "TextToSpeech ready (setLanguage=" + language + ")");
/* 207 */                       I1OI0OoIOl i1OI0OoIOl = i1OI0i1lo.I0000O;
/* 209 */                       if (i1OI0OoIOl != null) {
/* 211 */                           i1OI0i1lo.I0000O = null;
/* 213 */                           if (textToSpeech != null) {
                                        try {
/* 221 */                                   textToSpeech.speak(i1OI0OoIOl.I00000oIO, i1OI0OoIOl.I00000oOI, null, "boxassist-init");
                                            break;
                                        } catch (Throwable th2) {
/* 226 */                                   lIoii1l01l0i.I00000oIO(th2);
/* 252 */                                   return;
                                        }
                                    }
                                }
                            }
                            break;
                        case 1:
/* 114 */                   ((OI10i0Il) obj).setValue(Boolean.valueOf(i == 0));
                            break;
                        default:
/* 15 */                    OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) obj;
/* 17 */                    boolean z = i == 0;
/* 20 */                    ooIO11oiiiil.I000OiO = z;
/* 24 */                    if (z) {
/* 26 */                        TextToSpeech textToSpeech2 = ooIO11oiiiil.I000OOo1O;
/* 28 */                        if (textToSpeech2 != null) {
/* 35 */                            textToSpeech2.setOnUtteranceProgressListener(new OoIO0I0Oo(ooIO11oiiiil));
                                }
/* 38 */                        OoIlOii ooIlOii = ooIO11oiiiil.I000iOII;
/* 40 */                        if (ooIlOii != null) {
/* 44 */                            String str = (String) ooIlOii.I00iOIl;
/* 48 */                            String str2 = (String) ooIlOii.I00iiI;
/* 52 */                            OoIIOoO ooIIOoO = (OoIIOoO) ooIlOii.I00iiO;
/* 58 */                            if (!ooIO11oiiiil.I000OOo1O(str, str2, ooIIOoO)) {
/* 60 */                                ooIO11oiiiil.I0000oI00(ooIIOoO, 1200L);
                                    }
                                }
                            } else {
/* 64 */                        OlO0OIIl1 olO0OIIl1 = ooIO11oiiiil.I00000oOI;
/* 88 */                        olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, null, null, null, "No speech engine on this device — showing text only.", false, false, 223));
/* 91 */                        OoIlOii ooIlOii2 = ooIO11oiiiil.I000iOII;
/* 93 */                        if (ooIlOii2 != null) {
/* 99 */                            ooIO11oiiiil.I0000oI00((OoIIOoO) ooIlOii2.I00iiO, 1200L);
                                }
                            }
/* 102 */                   ooIO11oiiiil.I000iOII = null;
                            break;
                    }
                }
            }

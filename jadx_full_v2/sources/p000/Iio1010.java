            package p000;

            import android.speech.tts.TextToSpeech;
            import java.util.Map;
            
            public final class Iio1010 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public Iio1010(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 114 */                   ((I1ii1o0) this.I00iiI).I001i1O0Ol((IIllOo0) this.I00iiO, (IIllOo0) this.I00iio, (OlioOil) this.I00ilI0I1, (OlioOil) this.I00ilO0, (Map.Entry) this.I00io1l);
                            break;
                        default:
/* 8 */                     String str = (String) this.I00iiI;
/* 13 */                    TextToSpeech textToSpeech = (TextToSpeech) this.I00iiO;
/* 18 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 22 */                    Ii0110 ii0110 = (Ii0110) this.I00ilI0I1;
/* 27 */                    OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 32 */                    I0O1OI i0o1oi = (I0O1OI) this.I00io1l;
/* 39 */                    if (str.length() > 0) {
/* 44 */                        textToSpeech.speak(str, 1, null, "voice_reply_stream");
                            }
/* 51 */                    if (O11Oio.I00000oOI(oI10i0Il2)) {
/* 57 */                        O010OIi o010OIi = (O010OIi) oI10i0Il.getValue();
/* 59 */                        if (o010OIi != null) {
/* 61 */                            o010OIi.I000II(null);
                                }
/* 64 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 80 */                        oI10i0Il.setValue(iOi1II01i0.I0000O(ii0110, O1OI1l011OO1.I00000oIO, null, new O11Oi0ioo0I(textToSpeech, i0o1oi, oI10i0Il, oI10i0Il2, null, 0), 2));
                                break;
                            }
                            break;
                    }
                }
            }

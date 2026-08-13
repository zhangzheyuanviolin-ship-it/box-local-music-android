            package p000;

            import android.speech.tts.TextToSpeech;
            import android.speech.tts.Voice;
            import java.util.ArrayList;
            import java.util.Set;
            
            public final class OioI0il10ol implements TextToSpeech.OnInitListener {
                public OI10i0Il I00000oIO;
                public OOo0ooi I00000oOI;

                @Override
                public final void onInit(int i) {
                    Object objI00Ol1ll1;
                    Set<Voice> voices;
/* 1 */             OI10i0Il oI10i0Il = this.I00000oIO;
/* 3 */             OOo0ooi oOo0ooi = this.I00000oOI;
/* 5 */             if (i == 0) {
/* 9 */                 TextToSpeech textToSpeech = (TextToSpeech) oOo0ooi.I00iOIl;
/* 11 */                if (textToSpeech == null || (voices = textToSpeech.getVoices()) == null) {
/* 64 */                    objI00Ol1ll1 = Il01100l.I00iOIl;
                        } else {
/* 23 */                    ArrayList arrayList = new ArrayList();
/* 34 */                    for (Object obj : voices) {
/* 47 */                        if (!((Voice) obj).isNetworkConnectionRequired()) {
/* 49 */                            arrayList.add(obj);
                                }
                            }
/* 59 */                    objI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(arrayList, new OiOIlO1OII0(2));
                        }
/* 66 */                oI10i0Il.setValue(objI00Ol1ll1);
                    }
                }
            }

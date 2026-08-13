            package p000;

            import android.content.Context;
            import android.os.VibrationEffect;
            import android.os.Vibrator;
            import android.speech.tts.TextToSpeech;
            
            public final class I1OI0i1lo {
                public Context I00000oIO;
                public volatile TextToSpeech I00000oOI;
                public volatile boolean I0000Il00O;
                public volatile I1OI0OoIOl I0000O;
                public volatile float I0000oI00;
                public String I0001Ioi1lo;
                public long I000II;
                public boolean I000O01llI0;
                public Vibrator I000OOo1O;

                public final void I00000oIO(String str, Ool0lIo1o000 ool0lIo1o000) {
/* 5 */             String string = OlOoOIi0o.I00OIo(str).toString();
/* 13 */            if (string.length() == 0) {
/* 79 */                return;
                    }
/* 16 */            Ool0lIo1o000 ool0lIo1o0002 = Ool0lIo1o000.I00iiO;
/* 22 */            int i = ool0lIo1o000 == ool0lIo1o0002 ? 1 : 0;
/* 23 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 27 */            if (ool0lIo1o000 == ool0lIo1o0002 && string.equals(this.I0001Ioi1lo) && jCurrentTimeMillis - this.I000II < 4000) {
/* 79 */                return;
                    }
/* 48 */            this.I0001Ioi1lo = string;
/* 50 */            this.I000II = jCurrentTimeMillis;
/* 52 */            TextToSpeech textToSpeech = this.I00000oOI;
/* 54 */            if (textToSpeech != null && this.I0000Il00O) {
/* 68 */                textToSpeech.speak(string, i, null, IlIi0I0.I000iOII(jCurrentTimeMillis, "boxassist-"));
                    } else if (this.I0000O == null || ool0lIo1o000 != ool0lIo1o0002) {
/* 85 */                this.I0000O = new I1OI0OoIOl(string, i);
                    }
                }

                public final void I00000oOI(String str) {
/* 5 */             String string = OlOoOIi0o.I00OIo(str).toString();
/* 13 */            if (OlOoOIi0o.I001l0I00(string)) {
/* 15 */                return;
                    }
/* 18 */            this.I0001Ioi1lo = "";
/* 20 */            TextToSpeech textToSpeech = this.I00000oOI;
/* 23 */            if (textToSpeech == null || !this.I0000Il00O) {
/* 50 */                this.I0000O = new I1OI0OoIOl(string, 0);
                    } else {
/* 41 */                textToSpeech.speak(string, 0, null, IlIi0I0.I000iOII(System.currentTimeMillis(), "boxassist-passage-"));
                    }
                }

                public final void I0000Il00O(long[] jArr) {
                    Vibrator vibrator;
/* 3 */             if (this.I000O01llI0 && (vibrator = this.I000OOo1O) != null) {
                        try {
/* 16 */                    vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
                        } catch (Throwable th) {
/* 21 */                    lIoii1l01l0i.I00000oIO(th);
                        }
                    }
                }
            }

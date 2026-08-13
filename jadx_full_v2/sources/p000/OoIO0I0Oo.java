            package p000;

            import android.speech.tts.UtteranceProgressListener;
            
/* 27 */    public final class OoIO0I0Oo extends UtteranceProgressListener {
                public final OoIO11oiiiil I00000oIO;

                public OoIO0I0Oo(OoIO11oiiiil ooIO11oiiiil) {
/* 1 */             this.I00000oIO = ooIO11oiiiil;
                }

                @Override
                public final void onDone(String str) {
                    OoIIOoO ooIIOoO;
/* 7 */             if (O0000Ioio00.I0000O(str, "turn_A")) {
/* 9 */                 ooIIOoO = OoIIOoO.I00iOIl;
                    } else if (!O0000Ioio00.I0000O(str, "turn_B")) {
/* 29 */                return;
                    } else {
/* 20 */                ooIIOoO = OoIIOoO.I00iiI;
                    }
/* 26 */            this.I00000oIO.I0000oI00(ooIIOoO, 250L);
                }

                @Override
/* 28 */        public final void onError(String str) {
                }

                @Override
/* 28 */        public final void onStart(String str) {
                }
            }

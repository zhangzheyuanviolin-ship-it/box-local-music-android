            package p000;

            import android.speech.tts.TextToSpeech;
            
            public final class O11O0liO01 implements Runnable {
                public final int I00iOIl;
                public TextToSpeech I00iiI;
                public String I00iiO;

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    this.I00iiI.speak(this.I00iiO, 1, null, "voice_reply_stream");
                            break;
                        default:
/* 14 */                    this.I00iiI.speak(this.I00iiO, 1, null, "voice_reply_stream");
                            break;
                    }
                }
            }

            package p000;

            import android.speech.tts.UtteranceProgressListener;
            import android.util.Log;
            
/* 27 */    public final class I1O1o0llo1O0 extends UtteranceProgressListener {
                @Override
                public final void onError(String str, int i) {
/* 25 */            Log.e("BoxAssistSpeaker", "TTS utterance error: " + str + " code=" + i);
                }

                @Override
/* 28 */        public final void onDone(String str) {
                }

                @Override
/* 28 */        public final void onError(String str) {
/* 30 */            IIlIOloOOO.I001iOo1i0O("TTS utterance error: ", str, "BoxAssistSpeaker");
                }

                @Override
/* 28 */        public final void onStart(String str) {
                }
            }

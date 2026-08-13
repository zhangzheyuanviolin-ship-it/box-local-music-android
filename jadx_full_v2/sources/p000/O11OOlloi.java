            package p000;

            import android.os.Bundle;
            import android.speech.RecognitionListener;
            import java.util.ArrayList;
            
/* 18 */    public final class O11OOlloi implements RecognitionListener {
                public OI10i0Il I00000oIO;
                public IllOOo00lI I00000oOI;
                public OI10i0Il I0000Il00O;

                @Override
                public final void onError(int i) {
/* 1 */             OI10i0Il oI10i0Il = this.I0000Il00O;
/* 5 */             if (i == 8 || i == 9) {
/* 26 */                oI10i0Il.setValue(Boolean.FALSE);
                    } else if (O11Oio.I00000oOI(oI10i0Il)) {
/* 20 */                this.I00000oOI.invoke();
                    }
                }

                @Override
                public final void onResults(Bundle bundle) {
                    String str;
                    ArrayList<String> stringArrayList;
/* 1 */             if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = (String) IOOi0Ool1i.I00II0Ol1O0l(stringArrayList)) == null) {
/* 19 */                str = "";
                    }
/* 25 */            if (str.length() > 0) {
/* 29 */                this.I00000oIO.setValue(str);
                    }
                }

                @Override
/* 19 */        public final void onBeginningOfSpeech() {
                }

                @Override
/* 19 */        public final void onEndOfSpeech() {
                }

                @Override
/* 28 */        public final void onBufferReceived(byte[] bArr) {
                }

                @Override
/* 28 */        public final void onPartialResults(Bundle bundle) {
                }

                @Override
/* 28 */        public final void onReadyForSpeech(Bundle bundle) {
                }

                @Override
/* 28 */        public final void onRmsChanged(float f) {
                }

                @Override
/* 36 */        public final void onEvent(int i, Bundle bundle) {
                }
            }

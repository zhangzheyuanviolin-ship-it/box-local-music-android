            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.speech.RecognitionListener;
            import android.speech.SpeechRecognizer;
            import java.util.ArrayList;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LIo1o01Ol0i01;", "LOooioIIoi0O;", "Landroid/speech/RecognitionListener;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 18 */    public final class Io1o01Ol0i01 extends OooioIIoi0O implements RecognitionListener {
                public OlO0OIIl1 I00000oOI;
                public OOli1O I0000Il00O;
                public SpeechRecognizer I0000O;
                public Intent I0000oI00;
                public Function1 I0001Ioi1lo;
                public Function1 I000II;

                public final void I0000oI00(String str) {
                    Object value;
                    boolean z;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 34 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 18 */                Io1loIilO10I io1loIilO10I = (Io1loIilO10I) this.I0000Il00O.I00iOIl.getValue();
/* 20 */                z = io1loIilO10I.I00000oIO;
/* 22 */                io1loIilO10I.getClass();
/* 34 */            } while (!olO0OIIl1.I000iOII(value, new Io1loIilO10I(str, z)));
                }

                public final void I0001Ioi1lo(boolean z) {
                    Object value;
                    String str;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 34 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 18 */                Io1loIilO10I io1loIilO10I = (Io1loIilO10I) this.I0000Il00O.I00iOIl.getValue();
/* 20 */                str = io1loIilO10I.I00000oOI;
/* 22 */                io1loIilO10I.getClass();
/* 34 */            } while (!olO0OIIl1.I000iOII(value, new Io1loIilO10I(str, z)));
                }

                @Override
                public final void onPartialResults(Bundle bundle) {
/* 10 */            ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
/* 13 */            if (stringArrayList == null || stringArrayList.size() <= 0) {
/* 36 */                I0000oI00("");
                    } else {
/* 22 */                String str = stringArrayList.get(0);
/* 32 */                I0000oI00(str != null ? str : "");
                    }
                }

                @Override
                public final void onResults(Bundle bundle) {
/* 10 */            ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
/* 14 */            if (stringArrayList == null || stringArrayList.size() <= 0) {
/* 36 */                I0000oI00("");
                    } else {
/* 22 */                String str = stringArrayList.get(0);
/* 32 */                I0000oI00(str != null ? str : "");
                    }
/* 39 */            Function1 function1 = this.I0001Ioi1lo;
/* 41 */            if (function1 != null) {
/* 55 */                function1.invoke(((Io1loIilO10I) this.I0000Il00O.I00iOIl.getValue()).I00000oOI);
                    }
/* 58 */            I0001Ioi1lo(false);
                }

                @Override
                public final void onRmsChanged(float f) {
/* 1 */             Function1 function1 = this.I000II;
/* 3 */             if (function1 != null) {
/* 30 */                function1.invoke(Integer.valueOf((int) (((Math.min(Math.max(f, -2.0f), 100.0f) - (-2.0f)) * 65535.0f) / 102.0f)));
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
/* 28 */        public final void onError(int i) {
                }

                @Override
/* 28 */        public final void onReadyForSpeech(Bundle bundle) {
                }

                @Override
/* 36 */        public final void onEvent(int i, Bundle bundle) {
                }
            }

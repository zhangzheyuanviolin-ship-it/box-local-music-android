            package p000;

            import android.util.Log;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizerResponse;
            import java.util.List;
            
            public final class Iloli0oI1iIO implements IlOil1iooOO0 {
                public OI10i0Il I00iOIl;
                public OI10i0Il I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             SpeechRecognizerResponse speechRecognizerResponse = (SpeechRecognizerResponse) obj;
/* 3 */             OI10i0Il oI10i0Il = this.I00iiO;
/* 5 */             OI10i0Il oI10i0Il2 = this.I00iOIl;
/* 9 */             if (speechRecognizerResponse instanceof SpeechRecognizerResponse.PartialTextResponse) {
/* 13 */                String text = ((SpeechRecognizerResponse.PartialTextResponse) speechRecognizerResponse).getText();
/* 17 */                List list = Iloo0ilo.I00000oIO;
/* 19 */                oI10i0Il2.setValue(text);
                    } else if (speechRecognizerResponse instanceof SpeechRecognizerResponse.FinalTextResponse) {
/* 30 */                OI10i0Il oI10i0Il3 = this.I00iiI;
/* 32 */                List list2 = Iloo0ilo.I00000oIO;
/* 61 */                oI10i0Il3.setValue(((String) oI10i0Il3.getValue()) + ((SpeechRecognizerResponse.FinalTextResponse) speechRecognizerResponse).getText());
/* 64 */                oI10i0Il2.setValue("");
                    } else if (speechRecognizerResponse instanceof SpeechRecognizerResponse.CompletedResponse) {
/* 72 */                List list3 = Iloo0ilo.I00000oIO;
/* 74 */                oI10i0Il2.setValue("");
/* 79 */                oI10i0Il.setValue(Boolean.FALSE);
                    } else {
/* 85 */                if (!(speechRecognizerResponse instanceof SpeechRecognizerResponse.ErrorResponse)) {
/* 151 */                   I000II.I00000oIO();
/* 154 */                   return null;
                        }
/* 93 */                String message = ((SpeechRecognizerResponse.ErrorResponse) speechRecognizerResponse).getE().getMessage();
/* 97 */                if (message == null) {
/* 26 */                    message = "";
                        }
/* 100 */               OI10i0Il oI10i0Il4 = this.I00iio;
/* 116 */               String strConcat = OlOoOIi0o.I000oI1ioi(message, "NO_SPEECH_DETECTED", false) ? "No speech detected. Speak clearly after tapping the mic. If this persists, check the microphone privacy toggle in Android Settings → Privacy." : "Recognition error: ".concat(message);
/* 120 */               List list4 = Iloo0ilo.I00000oIO;
/* 122 */               oI10i0Il4.setValue(strConcat);
/* 125 */               oI10i0Il2.setValue("");
/* 130 */               oI10i0Il.setValue(Boolean.FALSE);
/* 145 */               iOi100.I00000oIO(Log.e("GeminiNanoHub", "speech recognition error: ".concat(message)));
                    }
/* 148 */           return OoiIlOl1iI.I00000oIO;
                }
            }

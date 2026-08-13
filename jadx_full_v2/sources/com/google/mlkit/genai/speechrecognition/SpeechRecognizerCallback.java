            package com.google.mlkit.genai.speechrecognition;

            import com.google.mlkit.genai.common.GenAiException;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerCallback;", "", "LOoiIlOl1iI;", "onCompleted", "()V", "Lcom/google/mlkit/genai/common/GenAiException;", "e", "onError", "(Lcom/google/mlkit/genai/common/GenAiException;)V", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "response", "onNext", "(Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;)V", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
            public interface SpeechRecognizerCallback {
                void onCompleted();

                void onError(GenAiException e);

                void onNext(SpeechRecognizerResponse response);
            }

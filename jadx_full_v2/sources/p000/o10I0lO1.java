            package p000;

            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import java.util.Collections;
            
            public final class o10I0lO1 implements StreamingCallback {
                public OOIoOo0O I00000oIO;

                @Override
                public final void onNewText(String str) throws GenAiException {
/* 16 */            Object objI00000oIO = iOlI0o0II.I00000oIO(this.I00000oIO, GenerateContentResponse.Companion.zza(Collections.singletonList(Candidate.Companion.zza(str, null))));
/* 22 */            if (objI00000oIO instanceof IO10l0l0) {
/* 77 */                throw new GenAiException("Failed to send response to Flow", IO10lIoiO.I00000oOI((IO10l0l0) objI00000oIO), 0);
                    }
                }

                @Override
                public final void onNewThought(String str) throws GenAiException {
/* 18 */            Object objI00000oIO = iOlI0o0II.I00000oIO(this.I00000oIO, GenerateContentResponse.Companion.zzb(Il01100l.I00iOIl, Collections.singletonList(Candidate.Companion.zza(str, null))));
/* 24 */            if (objI00000oIO instanceof IO10l0l0) {
/* 77 */                throw new GenAiException("Failed to send thought to Flow", IO10lIoiO.I00000oOI((IO10l0l0) objI00000oIO), 0);
                    }
                }
            }

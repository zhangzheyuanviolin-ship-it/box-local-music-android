            package p000;

            import com.google.mlkit.genai.proofreading.ProofreadingSuggestion;
            import com.google.mlkit.genai.rewriting.RewritingSuggestion;
            import java.util.function.ToIntFunction;
            
            public final class l0l1I0Io1 implements ToIntFunction {
                public final int I00000oIO;

                @Override
                public final int applyAsInt(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 23 */                    return ((ProofreadingSuggestion) obj).getText().length();
                        default:
/* 12 */                    return ((RewritingSuggestion) obj).getText().length();
                    }
                }
            }

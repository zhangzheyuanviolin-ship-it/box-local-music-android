            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IloiI0Io implements Function1 {
                public final int I00iOIl;
                public Rewriter I00iiI;

                public IloiI0Io(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Rewriter rewriter = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    I0IOIo0 i0IOIo0 = new I0IOIo0(15);
/* 24 */                    i0IOIo0.I00000oOI = rewriter;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    return i0IOIo0;
                        default:
/* 10 */                    return rewriter.downloadFeature((DownloadCallback) obj);
                    }
                }
            }

            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.summarization.Summarizer;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Iloi1Oi0oIoi implements Function1 {
                public final int I00iOIl;
                public Summarizer I00iiI;

                public Iloi1Oi0oIoi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Summarizer summarizer = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    I0IOIo0 i0IOIo0 = new I0IOIo0(19);
/* 24 */                    i0IOIo0.I00000oOI = summarizer;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    return i0IOIo0;
                        default:
/* 10 */                    return summarizer.downloadFeature((DownloadCallback) obj);
                    }
                }
            }

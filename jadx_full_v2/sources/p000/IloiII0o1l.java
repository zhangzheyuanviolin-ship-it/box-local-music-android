            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.proofreading.Proofreader;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IloiII0o1l implements Function1 {
                public final int I00iOIl;
                public Proofreader I00iiI;

                public IloiII0o1l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Proofreader proofreader = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    I0IOIo0 i0IOIo0 = new I0IOIo0(14);
/* 24 */                    i0IOIo0.I00000oOI = proofreader;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    return i0IOIo0;
                        default:
/* 10 */                    return proofreader.downloadFeature((DownloadCallback) obj);
                    }
                }
            }

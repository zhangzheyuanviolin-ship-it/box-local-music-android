            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Iloi1i0I implements Function1 {
                public final int I00iOIl;
                public ImageDescriber I00iiI;

                public Iloi1i0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             ImageDescriber imageDescriber = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    I0IOIo0 i0IOIo0 = new I0IOIo0(11);
/* 24 */                    i0IOIo0.I00000oOI = imageDescriber;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    return i0IOIo0;
                        default:
/* 10 */                    return imageDescriber.downloadFeature((DownloadCallback) obj);
                    }
                }
            }

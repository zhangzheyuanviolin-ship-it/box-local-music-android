            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class o0o0OiOiI1 implements IllOOo00lI {
                public final int I00iOIl;
                public AtomicInteger I00iiI;
                public int I00iiO;
                public DownloadCallback I00iio;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 32 */                    if (this.I00iiI.incrementAndGet() == this.I00iiO) {
/* 36 */                        this.I00iio.onDownloadCompleted();
                                break;
                            }
                            break;
                        default:
/* 16 */                    if (this.I00iiI.incrementAndGet() == this.I00iiO) {
/* 20 */                        this.I00iio.onDownloadCompleted();
                                break;
                            }
                            break;
                    }
/* 23 */            return ooiIlOl1iI;
                }
            }

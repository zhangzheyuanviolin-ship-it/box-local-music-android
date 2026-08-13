            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class Ii00i00 implements Function1 {
                public final int I00iOIl;
                public IiIOI1ol0o I00iiI;
                public IOi10loi I00iiO;

                public Ii00i00(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 40 */                    IiIOI1ol0o iiIOI1ol0o = this.I00iiI;
/* 42 */                    IOi10loi iOi10loi = this.I00iiO;
/* 44 */                    Throwable th = (Throwable) obj;
/* 46 */                    if (th == null) {
/* 66 */                        iOi10loi.I00O10llo(iiIOI1ol0o.I000O01llI0());
                                break;
                            } else if (!(th instanceof CancellationException)) {
/* 58 */                        iOi10loi.I00iIO(th);
                                break;
                            } else {
/* 54 */                        iOi10loi.I001IIilI0O((CancellationException) th);
                                break;
                            }
                        default:
/* 8 */                     IiIOI1ol0o iiIOI1ol0o2 = this.I00iiI;
/* 10 */                    IOi10loi iOi10loi2 = this.I00iiO;
/* 12 */                    Throwable th2 = (Throwable) obj;
/* 14 */                    if (th2 == null) {
/* 36 */                        iOi10loi2.I00O10llo(ooiIlOl1iI);
                                break;
                            } else if (!(th2 instanceof CancellationException)) {
/* 26 */                        iOi10loi2.I00iIO(th2);
                                break;
                            } else {
/* 22 */                        iOi10loi2.I001IIilI0O((CancellationException) th2);
                                break;
                            }
                    }
/* 39 */            return ooiIlOl1iI;
                }
            }

            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IIio00Io10 implements Function1 {
                public final int I00iOIl;
                public IIioIlI0 I00iiI;

                public IIio00Io10(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    boolean z;
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIioIlI0 iIioIlI0 = this.I00iiI;
                    switch (i) {
                        case 0:
                            synchronized (iIioIlI0.I000oI1ioi) {
/* 31 */                        iIioIlI0.I00100o1O0lo = IIlOIi0oI1Io.I00000oIO;
/* 33 */                        iIioIlI0.toString();
                            }
/* 37 */                    IIil1o0olooo iIil1o0olooo = iIioIlI0.I000lI;
/* 39 */                    iIioIlI0.toString();
                            synchronized (iIil1o0olooo.I0001Ioi1lo) {
/* 47 */                        iIil1o0olooo.I000II.remove(iIioIlI0);
                            }
/* 51 */                    IOi10loi iOi10loi = iIioIlI0.I001IO000;
/* 53 */                    OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 55 */                    iOi10loi.I00O10llo(ooiIlOl1iI);
/* 61 */                    il001oo1.I00000oOI(iIioIlI0.I00000oIO, null);
/* 64 */                    return ooiIlOl1iI;
                        default:
                            synchronized (iIioIlI0.I000oI1ioi) {
/* 13 */                        z = iIioIlI0.I00100l0;
                            }
/* 16 */                    return Boolean.valueOf(z);
                    }
                }
            }

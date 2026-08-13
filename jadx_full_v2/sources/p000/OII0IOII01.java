            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OII0IOII01 implements Function1 {
                public final int I00iOIl;
                public IlOOiIO I00iiI;
                public float I00iiO;
                public boolean I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 48 */                    IlOOiIO ilOOiIO = this.I00iiI;
/* 50 */                    float f = this.I00iiO;
/* 52 */                    boolean z = this.I00iio;
/* 54 */                    Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 56 */                    float fInvoke = ilOOiIO.invoke();
/* 70 */                    oi11lOiIoi.I000iOII(fInvoke > 0.0f ? 1.0f / ((fInvoke / f) + 1.0f) : 1.0f);
/* 80 */                    oi11lOiIoi.I001iOo1i0O(lOo0o0.I00000oIO(z ? 0.0f : 1.0f, 0.0f));
                            break;
                        default:
/* 11 */                    IlOOiIO ilOOiIO2 = this.I00iiI;
/* 13 */                    float f2 = this.I00iiO;
/* 15 */                    boolean z2 = this.I00iio;
/* 17 */                    Oi11lOiIoi oi11lOiIoi2 = (Oi11lOiIoi) obj;
/* 19 */                    float fInvoke2 = ilOOiIO2.invoke();
/* 31 */                    oi11lOiIoi2.I000iOII(fInvoke2 > 0.0f ? (fInvoke2 / f2) + 1.0f : 1.0f);
/* 44 */                    oi11lOiIoi2.I001iOo1i0O(lOo0o0.I00000oIO(z2 ? 0.0f : 1.0f, 0.5f));
                            break;
                    }
/* 47 */            return ooiIlOl1iI;
                }
            }

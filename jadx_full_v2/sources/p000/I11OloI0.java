            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I11OloI0 implements Function1 {
                public final int I00iOIl;
                public OlO01l1oOil I00iiI;

                public I11OloI0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OlO01l1oOil olO01l1oOil = this.I00iiI;
                    switch (i) {
                        case 0:
/* 50 */                    IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 58 */                    long j = ((IOOiio0i) olO01l1oOil.getValue()).I00000oIO;
/* 66 */                    if (!Ooi0i1.I00000oOI(j, IOOiio0i.I000o00OoI0I)) {
/* 77 */                        IilloIOOO0i.I00ilI0I1(iilloIOOO0i, j, 0L, 0L, 0.0f, null, 0, 126);
                            }
/* 80 */                    return ooiIlOl1iI;
                        case 1:
/* 45 */                    ((Oi11lOiIoi) obj).I0000Il00O(((Number) olO01l1oOil.getValue()).floatValue());
/* 48 */                    return ooiIlOl1iI;
                        default:
/* 28 */                    return IooO0O.I00000oIO(((IiIooOOOI) obj).I00l0OO0IO(((Iil1010O) olO01l1oOil.getValue()).I00iOIl) << 32);
                    }
                }
            }

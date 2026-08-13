            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public abstract class I1oll0O1OO0 {
                public static final OlO1iIi1ol0 I00000oIO = new OlO1iIi1ol0(new I01iOOoiOI(23));
                public static Boolean I00000oOI;

                public static final void I00000oIO(I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, IliO0o11i01 iliO0o11i01, List list, boolean z, IloI0lOlll1 iloI0lOlll1) {
/* 7 */             Executor executor = (Executor) iloI0lOlll1.I000iOII(I00000oIO);
/* 9 */             int i = 0;
/* 10 */            if (executor == null || !I00000oOI(i1111OO10i.I00iiI.length())) {
/* 78 */                iloI0lOlll1.I00i01iIIliI(317137883);
/* 81 */                iloI0lOlll1.I0010I0i(false);
/* 685 */               return;
                    }
/* 27 */            iloI0lOlll1.I00i01iIIliI(315439796);
/* 36 */            O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 44 */            IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
                    try {
/* 48 */                I1oli1o0I1O0 i1oli1o0I1O0 = new I1oli1o0I1O0(i);
/* 51 */                i1oli1o0I1O0.I00iio = oo0lloOiiIOI;
/* 53 */                i1oli1o0I1O0.I00ilI0I1 = o0iOOoiioO;
/* 55 */                i1oli1o0I1O0.I00iiI = list;
/* 57 */                i1oli1o0I1O0.I00ilO0 = i1111OO10i;
/* 59 */                i1oli1o0I1O0.I00io1l = iiIooOOOI;
/* 61 */                i1oli1o0I1O0.I00ioIO = iliO0o11i01;
/* 63 */                i1oli1o0I1O0.I00iiO = z;
/* 65 */                VarHandle.storeStoreFence();
/* 68 */                executor.execute(i1oli1o0I1O0);
                    } catch (RejectedExecutionException unused) {
                    }
/* 71 */            iloI0lOlll1.I0010I0i(false);
                }

                public static final boolean I00000oOI(int i) {
/* 4 */             if (i >= 8 && i < 1000) {
/* 10 */                Boolean boolValueOf = I00000oOI;
/* 13 */                if (boolValueOf == null) {
/* 29 */                    boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
/* 33 */                    I00000oOI = boolValueOf;
                        }
/* 39 */                if (boolValueOf.booleanValue()) {
/* 12 */                    return true;
                        }
                    }
/* 3 */             return false;
                }
            }

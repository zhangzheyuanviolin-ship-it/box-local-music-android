            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Io0O010 extends OI10OloOOoi {
                @Override
                public final void I0000Il00O() {
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 4 */                 I000oI1ioi();
                    }
                }

                @Override
                public final void I000iOII() {
/* 1 */             iO100OlI00o.I00000oIO();
/* 20 */            throw null;
                }

                @Override
                public final void I000l1() {
/* 1 */             iO100OlI00o.I00000oIO();
/* 20 */            throw null;
                }

                @Override
                public final void I000lI() {
/* 1 */             Ol1l1lI1Ili.I0000Il00O();
                }

                @Override
                public final Ol1il1o1 I001IIilI0O(Function1 function1) {
/* 4 */             Io0IooIoI10 io0IooIoI10 = new Io0IooIoI10(0);
/* 7 */             io0IooIoI10.I00iiI = function1;
/* 9 */             VarHandle.storeStoreFence();
/* 16 */            II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(9);
/* 19 */            iI0O1i0I1.I00iiI = io0IooIoI10;
/* 21 */            VarHandle.storeStoreFence();
/* 30 */            return (OOli00i0ooIi) ((Ol1il1o1) Ol1l1lI1Ili.I00000oOI(iI0O1i0I1));
                }

                @Override
                public final lOIo01O01 I001i1O0Ol() {
/* 20 */            throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
                }

                @Override
                public final OI10OloOOoi I001lloI(Function1 function1, Function1 function12) {
/* 5 */             I01i01OoI i01i01OoI = new I01i01OoI(13);
/* 8 */             i01i01OoI.I00iiI = function1;
/* 10 */            i01i01OoI.I00iiO = function12;
/* 12 */            VarHandle.storeStoreFence();
/* 19 */            II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(9);
/* 22 */            iI0O1i0I1.I00iiI = i01i01OoI;
/* 24 */            VarHandle.storeStoreFence();
/* 33 */            return (OI10OloOOoi) ((Ol1il1o1) Ol1l1lI1Ili.I00000oOI(iI0O1i0I1));
                }
            }

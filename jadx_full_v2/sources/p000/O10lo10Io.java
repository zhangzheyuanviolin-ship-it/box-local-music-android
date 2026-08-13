            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
            public final class O10lo10Io extends I010101Oo1lO {
                public O010oO I00ilI0I1;

                @Override
                public final void I00iIO(boolean z, Throwable th) {
/* 1 */             O010oO o010oO = this.I00ilI0I1;
/* 3 */             boolean z2 = th instanceof CancellationException;
/* 5 */             Oio0llilli oio0llilli = o010oO.I00iiI;
/* 7 */             if (!z2) {
/* 29 */                if (oio0llilli.I000lI(th)) {
/* 32 */                    o010oO.I00iiO = true;
                        }
                    } else {
/* 13 */                IIoiOiiI iIoiOiiI = new IIoiOiiI();
/* 16 */                iIoiOiiI.I00000oIO = (CancellationException) th;
/* 18 */                VarHandle.storeStoreFence();
/* 21 */                oio0llilli.I000l1(iIoiOiiI);
                    }
                }

                @Override
                public final void I00iIi0i1o(Object obj) {
/* 5 */             this.I00ilI0I1.I00iiI.I000l1(obj);
                }
            }

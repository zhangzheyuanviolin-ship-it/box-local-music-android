            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class Oi1oO1 extends O00IIol {
                public final Oi1oO0Iooi1o I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oi1oO1(String[] strArr, Oi1oO0Iooi1o oi1oO0Iooi1o) {
/* 3 */             super(strArr);
/* 1 */             this.I00000oOI = oi1oO0Iooi1o;
                }

                @Override
                public final void I00000oIO(Set set) throws InterruptedException {
/* 1 */             I1IiIl i1IiIlI00000oIO = I1IiIl.I00000oIO();
/* 8 */             OOIl1i1 oOIl1i1 = new OOIl1i1(4);
/* 13 */            oOIl1i1.I00iiI = this.I00000oOI;
/* 15 */            VarHandle.storeStoreFence();
/* 20 */            i1IiIlI00000oIO.I00000oIO.getClass();
/* 40 */            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 42 */                oOIl1i1.run();
                    } else {
/* 46 */                i1IiIlI00000oIO.I00000oOI(oOIl1i1);
                    }
                }
            }

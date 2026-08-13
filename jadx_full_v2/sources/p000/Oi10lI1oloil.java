            package p000;

            import android.os.Looper;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public final class Oi10lI1oloil {
                public final HashSet I00000oIO = new HashSet();

                public final void I00000oIO() {
/* 3 */             if (lOll0Oi.I00000oIO == null) {
/* 13 */                lOll0Oi.I00000oIO = Looper.getMainLooper().getThread();
                    }
/* 21 */            if (Thread.currentThread() != lOll0Oi.I00000oIO) {
/* 43 */                I000II.I001IO000("Must be called on the Main thread.");
/* 113 */               return;
                    }
/* 25 */            Iterator it = this.I00000oIO.iterator();
/* 33 */            if (it.hasNext()) {
/* 40 */                throw IIlIOloOOO.I000lI(it);
                    }
                }
            }

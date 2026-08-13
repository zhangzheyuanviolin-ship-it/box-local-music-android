            package p000;

            import java.util.Iterator;
            
            public abstract class lO0l1I {
                public static final I1Io0i0II I00000oIO = new I1Io0i0II(0);

                public static synchronized void I00000oIO() {
/* 4 */             I1Io0i0II i1Io0i0II = I00000oIO;
/* 12 */            Iterator it = ((I1IloI1ii0) i1Io0i0II.values()).iterator();
/* 20 */            if (it.hasNext()) {
/* 33 */                if (it.next() != null) {
/* 42 */                    throw new ClassCastException();
                        }
/* 36 */                throw null;
                    }
/* 22 */            i1Io0i0II.clear();
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IIi0oO {
                static {
                    Object objI00000oIO;
                    try {
/* 3 */                 objI00000oIO = Class.forName("java.lang.ClassValue");
                    } catch (Throwable th) {
/* 9 */                 objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 15 */            if (!(objI00000oIO instanceof Oi10Ii1i1lo)) {
/* 19 */                objI00000oIO = Boolean.TRUE;
                    }
/* 21 */            Object obj = Boolean.FALSE;
/* 25 */            if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 27 */                objI00000oIO = obj;
                    }
                }

                public static final I1I0i0Ilo1Oi I00000oIO(Function1 function1) {
/* 4 */             I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(7);
/* 7 */             i1I0i0Ilo1Oi.I00iiI = function1;
/* 14 */            i1I0i0Ilo1Oi.I00iiO = new ConcurrentHashMap();
/* 16 */            VarHandle.storeStoreFence();
/* 49 */            return i1I0i0Ilo1Oi;
                }
            }

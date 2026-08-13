            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1i0lii {
                public static final I101iI1i I00000oIO(Ii00l101O ii00l101O) {
/* 7 */             I101iI1i i101iI1i = (I101iI1i) ii00l101O.I00lli11(loilIl10Ii.I00ilI0I1);
/* 9 */             if (i101iI1i != null) {
/* 11 */                return i101iI1i;
                    }
/* 14 */            I000II.I001IO000("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
/* 17 */            return null;
                }

                public static final Object I00000oOI(Function1 function1, Oll0io oll0io) {
/* 5 */             I101iI1i i101iI1iI00000oIO = I00000oIO(oll0io.getContext());
/* 12 */            Io0IooIoI10 io0IooIoI10 = new Io0IooIoI10(2);
/* 15 */            io0IooIoI10.I00iiI = function1;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return i101iI1iI00000oIO.I00000oIO(oll0io, io0IooIoI10);
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ThreadFactory;
            
            public abstract class I1010l011o {
                public static final int[] I00000oIO = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
                public static final ThreadFactory I00000oOI = Executors.defaultThreadFactory();

                public static ScheduledExecutorService I00000oIO(I10100ollo0l i10100ollo0l, int i) {
/* 1 */             if (i > 0) {
/* 3 */                 return Executors.newScheduledThreadPool(i, i10100ollo0l);
                    }
/* 16 */            I000II.I0010I0i(IIlIOloOOO.I00100l0("Threads (", i, ") must be > 0"));
/* 19 */            return null;
                }

                public static I10100ollo0l I00000oOI(I10101lool i10101lool, int i) {
/* 3 */             I10100ollo0l i10100ollo0l = new I10100ollo0l();
/* 6 */             i10100ollo0l.I00000oIO = i;
/* 8 */             i10100ollo0l.I00000oOI = i10101lool;
/* 10 */            VarHandle.storeStoreFence();
/* 37 */            return i10100ollo0l;
                }

                public static I10101lool I0000Il00O(ThreadFactory threadFactory, String str) {
/* 2 */             I1OollilIo i1OollilIoI00000oOI = iOOOIOoiIlII.I00000oOI(0);
/* 8 */             I10101lool i10101lool = new I10101lool();
/* 11 */            i10101lool.I00000oIO = threadFactory;
/* 13 */            i10101lool.I00000oOI = str;
/* 15 */            i10101lool.I0000Il00O = i1OollilIoI00000oOI;
/* 17 */            VarHandle.storeStoreFence();
/* 37 */            return i10101lool;
                }
            }

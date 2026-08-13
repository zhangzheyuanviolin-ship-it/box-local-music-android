            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Oo100i0OO {
                public static final ThreadLocal I00000oIO = new ThreadLocal();

                public static Il10o00 I00000oIO() {
/* 1 */             ThreadLocal threadLocal = I00000oIO;
/* 7 */             Il10o00 il10o00 = (Il10o00) threadLocal.get();
/* 9 */             if (il10o00 != null) {
/* 29 */                return il10o00;
                    }
/* 13 */            Thread threadCurrentThread = Thread.currentThread();
/* 17 */            II101Ol iI101Ol = new II101Ol();
/* 20 */            iI101Ol.I00l0I0l0lO1 = threadCurrentThread;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            threadLocal.set(iI101Ol);
/* 29 */            return iI101Ol;
                }
            }

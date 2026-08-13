            package p000;

            import java.util.concurrent.Executors;
            
            public abstract class lioolIIo0i {
                public static final Il11ooO1o I00000oIO(int i) {
                    try {
/* 14 */                return new Il11ooO1o(Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE)));
                    } catch (IllegalArgumentException e) {
/* 20 */                if (i == 3) {
/* 32 */                    return new Il11ooO1o(Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE)));
                        }
/* 77 */                throw e;
                    }
                }
            }

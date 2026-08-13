            package p000;

            import java.lang.reflect.Method;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            
            public abstract class IOlOi0l1O1O {
                public static final Method I00000oIO;

                static {
                    Method method;
                    try {
/* 11 */                method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
                    } catch (Throwable unused) {
/* 16 */                method = null;
                    }
/* 17 */            I00000oIO = method;
                }
            }

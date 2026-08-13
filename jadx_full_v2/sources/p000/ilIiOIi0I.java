            package p000;

            import java.util.concurrent.CancellationException;
            
            public abstract class ilIiOIi0I {
                public static final CancellationException I00000oIO(String str, Throwable th) {
/* 3 */             CancellationException cancellationException = new CancellationException(str);
/* 6 */             cancellationException.initCause(th);
/* 37 */            return cancellationException;
                }
            }

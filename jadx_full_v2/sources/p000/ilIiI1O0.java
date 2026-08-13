            package p000;

            import java.util.concurrent.CancellationException;
            
            public abstract class ilIiI1O0 {
                public static final Throwable I00000oIO(Throwable th) {
/* 1 */             Throwable cause = th;
                    while (true) {
/* 4 */                 if (!(cause instanceof CancellationException)) {
/* 25 */                    if (cause == null) {
                                break;
                            }
/* 29 */                    return cause;
                        }
/* 7 */                 CancellationException cancellationException = (CancellationException) cause;
/* 17 */                if (cause.equals(cancellationException.getCause())) {
                            break;
                        }
/* 20 */                cause = cancellationException.getCause();
                    }
/* 27 */            return th;
                }
            }

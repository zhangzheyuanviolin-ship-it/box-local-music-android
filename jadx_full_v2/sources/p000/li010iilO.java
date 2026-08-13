            package p000;

            import java.util.concurrent.Future;
            
            public abstract class li010iilO {
                public static Object I00000oIO(Future future) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 27 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 23 */                        Thread.currentThread().interrupt();
                            }
/* 26 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }
            }

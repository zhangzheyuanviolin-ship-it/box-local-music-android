            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            
            public abstract class ll00lliII {
                public static l0l11l0 I00000oIO(Exception exc) {
/* 3 */             l0l11l0 l0l11l0Var = new l0l11l0();
/* 6 */             l0l11l0Var.I000OOo1O(exc);
/* 29 */            return l0l11l0Var;
                }

                public static l0IlooI I00000oOI(ListenableFuture listenableFuture, l0OI000IIIi l0oi000iiii, Executor executor) {
/* 1 */             int i = l0O11I1ll.I00l0OO0IO;
/* 5 */             l0IlooI l0ilooi = new l0IlooI(listenableFuture, l0oi000iiii);
/* 12 */            listenableFuture.addListener(l0ilooi, ll01i01oo11.I00000oIO(executor, l0ilooi));
/* 98 */            return l0ilooi;
                }

                public static Object I0000Il00O(Future future) {
                    Object obj;
/* 5 */             if (!future.isDone()) {
/* 46 */                I000II.I001IO000(lio011oio0.I00000oIO("Future was expected to be done: %s", future));
/* 49 */                return null;
                    }
/* 7 */             boolean z = false;
                    while (true) {
                        try {
/* 8 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 34 */                    z = true;
                        } catch (Throwable th) {
/* 23 */                    if (z) {
/* 30 */                        Thread.currentThread().interrupt();
                            }
/* 33 */                    throw th;
                        }
                    }
/* 12 */            if (z) {
/* 18 */                Thread.currentThread().interrupt();
                    }
/* 21 */            return obj;
                }
            }

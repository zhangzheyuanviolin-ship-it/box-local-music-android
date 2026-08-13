            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            
            public abstract class liolilo {
                public static l001iOoO00l0 I00000oIO(Exception exc) {
/* 3 */             l001iOoO00l0 l001iooo00l0 = new l001iOoO00l0();
/* 6 */             l001iooo00l0.I000OOo1O(exc);
/* 29 */            return l001iooo00l0;
                }

                public static l00Il1IoiloI I00000oOI(Object obj) {
                    return obj == null ? l00Il1IoiloI.I00iiI : new l00Il1IoiloI(obj);
                }

                public static ioiiIi0o11 I0000Il00O(ListenableFuture listenableFuture, iliIOoo iliiooo, Executor executor) {
/* 1 */             int i = ioili1lI1l.I00l0OO0IO;
/* 5 */             ioiiIi0o11 ioiiii0o11 = new ioiiIi0o11(listenableFuture, iliiooo);
/* 12 */            listenableFuture.addListener(ioiiii0o11, liooiol.I00000oIO(executor, ioiiii0o11));
/* 98 */            return ioiiii0o11;
                }

                public static ioiIoI0I I0000O(ListenableFuture listenableFuture, iol0ioiIO1iI iol0ioiio1ii, Executor executor) {
/* 1 */             int i = ioili1lI1l.I00l0OO0IO;
/* 5 */             ioiIoI0I ioiioi0i = new ioiIoI0I(listenableFuture, iol0ioiio1ii);
/* 12 */            listenableFuture.addListener(ioiioi0i, liooiol.I00000oIO(executor, ioiioi0i));
/* 98 */            return ioiioi0i;
                }

                public static Object I0000oI00(Future future) {
                    Object obj;
/* 5 */             if (!future.isDone()) {
/* 46 */                I000II.I001IO000(lio1IOlIiiO.I00000oIO("Future was expected to be done: %s", future));
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

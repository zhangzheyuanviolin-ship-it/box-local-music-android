            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            
            public abstract class lioli1IO {
                public static l001iIl I00000oIO(Exception exc) {
/* 3 */             l001iIl l001iil = new l001iIl();
/* 6 */             l001iil.I000OOo1O(exc);
/* 29 */            return l001iil;
                }

                public static l00Il111lO1I I00000oOI(Object obj) {
                    return obj == null ? l00Il111lO1I.I00iiI : new l00Il111lO1I(obj);
                }

                public static ioii1ol1Oool I0000Il00O(ListenableFuture listenableFuture, iliIOo10i10 iliioo10i10, Executor executor) {
/* 1 */             int i = ioilOolol0.I00l0OO0IO;
/* 5 */             ioii1ol1Oool ioii1ol1oool = new ioii1ol1Oool(listenableFuture, iliioo10i10);
/* 12 */            listenableFuture.addListener(ioii1ol1oool, liooi1Oi1.I00000oIO(executor, ioii1ol1oool));
/* 98 */            return ioii1ol1oool;
                }

                public static ioiIlo I0000O(ListenableFuture listenableFuture, iol0i0iOol iol0i0iool, Executor executor) {
/* 1 */             int i = ioilOolol0.I00l0OO0IO;
/* 5 */             ioiIlo ioiilo = new ioiIlo(listenableFuture, iol0i0iool);
/* 12 */            listenableFuture.addListener(ioiilo, liooi1Oi1.I00000oIO(executor, ioiilo));
/* 98 */            return ioiilo;
                }

                public static Object I0000oI00(Future future) {
                    Object obj;
/* 5 */             if (!future.isDone()) {
/* 46 */                I000II.I001IO000(lio1IIoIi.I00000oIO("Future was expected to be done: %s", future));
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

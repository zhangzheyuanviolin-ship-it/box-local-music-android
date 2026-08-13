            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            
            public abstract class lioo0lo01i {
                public static l00iIo I00000oIO(Exception exc) {
/* 3 */             l00iIo l00iio = new l00iIo();
/* 6 */             l00iio.I000OOo1O(exc);
/* 29 */            return l00iio;
                }

                public static l00lIloiio I00000oOI(Object obj) {
                    return obj == null ? l00lIloiio.I00iiI : new l00lIloiio(obj);
                }

                public static iol1Io1 I0000Il00O(ListenableFuture listenableFuture, iliooIIO0Oi iliooiio0oi, Executor executor) {
/* 1 */             int i = iolIiIIIOo1.I00l0OO0IO;
/* 5 */             iol1Io1 iol1io1 = new iol1Io1(listenableFuture, iliooiio0oi);
/* 12 */            listenableFuture.addListener(iol1io1, ll00O010oO.I00000oIO(executor, iol1io1));
/* 98 */            return iol1io1;
                }

                public static iol0l1Iooll I0000O(ListenableFuture listenableFuture, iollIi0II1o iollii0ii1o, Executor executor) {
/* 1 */             int i = iolIiIIIOo1.I00l0OO0IO;
/* 5 */             iol0l1Iooll iol0l1iooll = new iol0l1Iooll(listenableFuture, iollii0ii1o);
/* 12 */            listenableFuture.addListener(iol0l1iooll, ll00O010oO.I00000oIO(executor, iol0l1iooll));
/* 98 */            return iol0l1iooll;
                }

                public static Object I0000oI00(Future future) {
                    Object obj;
/* 5 */             if (!future.isDone()) {
/* 46 */                I000II.I001IO000(lio1l1O0i.I00000oIO("Future was expected to be done: %s", future));
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

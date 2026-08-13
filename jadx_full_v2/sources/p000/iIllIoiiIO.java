            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.LinkedBlockingQueue;
            
            public abstract class iIllIoiiIO {
                public static void I00000oIO(ListenableFuture listenableFuture, Illo1O0O10l illo1O0O10l, Executor executor) {
/* 4 */             IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(0);
/* 7 */             illoOi1I1OO.I00iiI = listenableFuture;
/* 9 */             illoOi1I1OO.I00iiO = illo1O0O10l;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            listenableFuture.addListener(illoOi1I1OO, executor);
                }

                public static Object I00000oOI(ListenableFuture listenableFuture) {
/* 19 */            lII1OI11o1I.I0000oI00("Future was expected to be done, " + listenableFuture, listenableFuture.isDone());
/* 22 */            return I0000Il00O(listenableFuture);
                }

                public static Object I0000Il00O(Future future) {
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

                public static Ioil1IIo I0000O(Object obj) {
                    return obj == null ? Ioil1IIo.I00iiO : new Ioil1IIo(obj, 0);
                }

                public static ListenableFuture I0000oI00(ListenableFuture listenableFuture) {
/* 1 */             listenableFuture.getClass();
/* 8 */             if (listenableFuture.isDone()) {
/* 10 */                return listenableFuture;
                    }
/* 14 */            IlloIII0 illoIII0 = new IlloIII0(0);
/* 17 */            illoIII0.I00iiI = listenableFuture;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            return iOiiloIII0O.I00000oIO(illoIII0);
                }

                public static void I0001Ioi1lo(boolean z, ListenableFuture listenableFuture, IIiOOI iIiOOI, Iii11l iii11l) {
/* 1 */             listenableFuture.getClass();
/* 4 */             iIiOOI.getClass();
/* 7 */             iii11l.getClass();
/* 12 */            IlloIo0O illoIo0O = new IlloIo0O();
/* 15 */            illoIo0O.I00iOIl = iIiOOI;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00000oIO(listenableFuture, illoIo0O, iii11l);
/* 23 */            if (z) {
/* 28 */                IlloO1 illoO1 = new IlloO1(0);
/* 31 */                illoO1.I00iiI = listenableFuture;
/* 33 */                VarHandle.storeStoreFence();
/* 40 */                iIiOOI.I00000oIO(illoO1, Iii11l.I00000oIO());
                    }
                }

                public static IO0oo1I0oIO I000II(ListenableFuture listenableFuture, Illill0o illill0o, Iii11l iii11l) {
/* 3 */             iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 6 */             iiolilo0iiil.I00iOIl = illill0o;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return I000O01llI0(listenableFuture, iiolilo0iiil, iii11l);
                }

                public static IO0oo1I0oIO I000O01llI0(ListenableFuture listenableFuture, I1Olli1oIi i1Olli1oIi, Executor executor) {
/* 3 */             IO0oo1I0oIO iO0oo1I0oIO = new IO0oo1I0oIO();
/* 10 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(11);
/* 13 */            i0IIiO0iI.I00iiI = iO0oo1I0oIO;
/* 15 */            VarHandle.storeStoreFence();
/* 22 */            iO0oo1I0oIO.I00iOIl = iOiiloIII0O.I00000oIO(i0IIiO0iI);
/* 30 */            iO0oo1I0oIO.I00iio = new LinkedBlockingQueue(1);
/* 37 */            iO0oo1I0oIO.I00ilI0I1 = new CountDownLatch(1);
/* 39 */            iO0oo1I0oIO.I00iiO = i1Olli1oIi;
/* 41 */            listenableFuture.getClass();
/* 44 */            iO0oo1I0oIO.I00ilO0 = listenableFuture;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            listenableFuture.addListener(iO0oo1I0oIO, executor);
/* 98 */            return iO0oo1I0oIO;
                }
            }

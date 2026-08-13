            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Future;
            
            public abstract class IlloOoiiO {
                public static Object I00000oIO(Future future) {
/* 5 */             if (future.isDone()) {
/* 7 */                 return li010iilO.I00000oIO(future);
                    }
/* 22 */            I000II.I001IO000(lOi0oI00.I00000oIO("Future was expected to be done: %s", future));
/* 25 */            return null;
                }

                public static Ioiil00oiOo I00000oOI(Exception exc) {
/* 3 */             Ioiil00oiOo ioiil00oiOo = new Ioiil00oiOo();
/* 6 */             ioiil00oiOo.I000lI(exc);
/* 29 */            return ioiil00oiOo;
                }

                public static Ioil1OOO I0000Il00O(Object obj) {
                    return obj == null ? Ioil1OOO.I00iiI : new Ioil1OOO(obj);
                }

                public static ListenableFuture I0000O(ListenableFuture listenableFuture) {
/* 5 */             if (listenableFuture.isDone()) {
/* 7 */                 return listenableFuture;
                    }
/* 10 */            IlloOlO illoOlO = new IlloOlO();
/* 13 */            illoOlO.I00ioIO = listenableFuture;
/* 17 */            listenableFuture.addListener(illoOlO, Iii11Ooi.I00iOIl);
/* 29 */            return illoOlO;
                }
            }

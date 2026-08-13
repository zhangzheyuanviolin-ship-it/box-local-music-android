            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class IlloOlO extends I0110o implements Runnable {
                public ListenableFuture I00ioIO;

                @Override
                public final void I0000O() {
/* 2 */             this.I00ioIO = null;
                }

                @Override
                public final String I000iOII() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             if (listenableFuture == null) {
/* 25 */                return null;
                    }
/* 20 */            return "delegate=[" + listenableFuture + "]";
                }

                @Override
                public final void run() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             if (listenableFuture != null) {
/* 5 */                 I000o00OoI0I(listenableFuture);
                    }
                }
            }

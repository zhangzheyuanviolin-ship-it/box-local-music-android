            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.RunnableFuture;
            
            public final class OoIlol extends IlOooOIi1o implements RunnableFuture {
                public volatile Iooo1i1iili I00l0I0l0lO1;

                public OoIlol(Callable callable) {
/* 9 */             this.I00l0I0l0lO1 = new OoIlliloii0(this, callable);
                }

                @Override
                public final void I0000O() {
                    Iooo1i1iili iooo1i1iili;
/* 5 */             if (I000oI1ioi() && (iooo1i1iili = this.I00l0I0l0lO1) != null) {
/* 11 */                iooo1i1iili.I0000Il00O();
                    }
/* 15 */            this.I00l0I0l0lO1 = null;
                }

                @Override
                public final String I000iOII() {
/* 1 */             Iooo1i1iili iooo1i1iili = this.I00l0I0l0lO1;
/* 3 */             if (iooo1i1iili == null) {
/* 25 */                return super.I000iOII();
                    }
/* 20 */            return "task=[" + iooo1i1iili + "]";
                }

                @Override
                public final void run() {
/* 1 */             Iooo1i1iili iooo1i1iili = this.I00l0I0l0lO1;
/* 3 */             if (iooo1i1iili != null) {
/* 5 */                 iooo1i1iili.run();
                    }
/* 9 */             this.I00l0I0l0lO1 = null;
                }
            }

            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Callable;
            
/* 13 */    public final class OoIlliloii0 extends Iooo1i1iili {
                public final int I00iiO = 0;
                public final OoIlol I00iio;
                public final Object I00ilI0I1;

                public OoIlliloii0(OoIlol ooIlol, Callable callable) {
/* 4 */             this.I00iio = ooIlol;
/* 9 */             callable.getClass();
/* 12 */            this.I00ilI0I1 = callable;
                }

                @Override
                public final void I00000oIO(Throwable th) {
/* 1 */             int i = this.I00iiO;
/* 3 */             OoIlol ooIlol = this.I00iio;
                    switch (i) {
                        case 0:
/* 12 */                    ooIlol.I000lI(th);
                            break;
                        default:
/* 8 */                     ooIlol.I000lI(th);
                            break;
                    }
                }

                @Override
                public final void I00000oOI(Object obj) {
/* 1 */             int i = this.I00iiO;
/* 3 */             OoIlol ooIlol = this.I00iio;
                    switch (i) {
                        case 0:
/* 14 */                    ooIlol.I000o00OoI0I((ListenableFuture) obj);
                            break;
                        default:
/* 8 */                     ooIlol.I000l1(obj);
                            break;
                    }
                }

                @Override
                public final boolean I0000O() {
/* 1 */             int i = this.I00iiO;
/* 3 */             OoIlol ooIlol = this.I00iio;
                    switch (i) {
                    }
/* 8 */             return ooIlol.isDone();
                }

                @Override
                public final Object I0000oI00() {
/* 1 */             int i = this.I00iiO;
/* 3 */             Object obj = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 15 */                    I1OlOl11O0 i1OlOl11O0 = (I1OlOl11O0) obj;
/* 17 */                    ListenableFuture listenableFutureCall = i1OlOl11O0.call();
/* 23 */                    lII0I0I01I1l.I0000oI00(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", i1OlOl11O0);
/* 26 */                    return listenableFutureCall;
                        default:
/* 10 */                    return ((Callable) obj).call();
                    }
                }

                @Override
                public final String I0001Ioi1lo() {
/* 1 */             int i = this.I00iiO;
/* 3 */             Object obj = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 17 */                    return ((I1OlOl11O0) obj).toString();
                        default:
/* 10 */                    return ((Callable) obj).toString();
                    }
                }

/* 14 */        public OoIlliloii0(OoIlol ooIlol, I1OlOl11O0 i1OlOl11O0) {
/* 15 */            this.I00iio = ooIlol;
/* 17 */            this.I00ilI0I1 = i1OlOl11O0;
                }
            }

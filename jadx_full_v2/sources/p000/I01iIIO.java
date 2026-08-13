            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            
            public abstract class I01iIIO extends IlOooOIi1o implements Runnable {
                public static final int I00li1OI = 0;
                public ListenableFuture I00l0I0l0lO1;
                public Object I00l0OO0IO;

                public I01iIIO(ListenableFuture listenableFuture, Object obj) {
/* 4 */             listenableFuture.getClass();
/* 7 */             this.I00l0I0l0lO1 = listenableFuture;
/* 9 */             obj.getClass();
/* 12 */            this.I00l0OO0IO = obj;
                }

                public static I01i1oI I00100l0(ListenableFuture listenableFuture, I1Oll0OOO i1Oll0OOO, Executor executor) {
/* 3 */             I01i1oI i01i1oI = new I01i1oI(listenableFuture, i1Oll0OOO);
/* 10 */            listenableFuture.addListener(i01i1oI, l1i0oIO0.I00000oOI(executor, i01i1oI));
/* 98 */            return i01i1oI;
                }

                @Override
                public final void I0000O() {
/* 1 */             ListenableFuture listenableFuture = this.I00l0I0l0lO1;
/* 13 */            if ((listenableFuture != null) & (this.I00iOIl instanceof I010i10l)) {
/* 19 */                listenableFuture.cancel(I000oI1ioi());
                    }
/* 23 */            this.I00l0I0l0lO1 = null;
/* 25 */            this.I00l0OO0IO = null;
                }

                @Override
                public final String I000iOII() {
                    String str;
/* 1 */             ListenableFuture listenableFuture = this.I00l0I0l0lO1;
/* 3 */             Object obj = this.I00l0OO0IO;
/* 5 */             String strI000iOII = super.I000iOII();
/* 9 */             if (listenableFuture != null) {
/* 26 */                str = "inputFuture=[" + listenableFuture + "], ";
                    } else {
/* 31 */                str = "";
                    }
/* 33 */            if (obj == null) {
/* 58 */                if (strI000iOII != null) {
/* 60 */                    return str.concat(strI000iOII);
                        }
/* 65 */                return null;
                    }
/* 53 */            return str + "function=[" + obj + "]";
                }

                public abstract Object I00100o1O0lo(Object obj, Object obj2);

                public abstract void I0010I0i(Object obj);

                @Override
                public final void run() {
/* 1 */             ListenableFuture listenableFuture = this.I00l0I0l0lO1;
/* 3 */             Object obj = this.I00l0OO0IO;
/* 22 */            if (((this.I00iOIl instanceof I010i10l) | (listenableFuture == null)) || (obj == null)) {
/* 24 */                return;
                    }
/* 26 */            this.I00l0I0l0lO1 = null;
/* 32 */            if (listenableFuture.isCancelled()) {
/* 34 */                I000o00OoI0I(listenableFuture);
/* 37 */                return;
                    }
                    try {
                        try {
/* 42 */                    Object objI00100o1O0lo = I00100o1O0lo(obj, IlloOoiiO.I00000oIO(listenableFuture));
/* 46 */                    this.I00l0OO0IO = null;
/* 48 */                    I0010I0i(objI00100o1O0lo);
                        } catch (Throwable th) {
                            try {
/* 55 */                        if (th instanceof InterruptedException) {
/* 61 */                            Thread.currentThread().interrupt();
                                }
/* 64 */                        I000lI(th);
                            } finally {
/* 71 */                        this.I00l0OO0IO = null;
                            }
                        }
                    } catch (Error e) {
/* 75 */                I000lI(e);
                    } catch (CancellationException unused) {
/* 93 */                cancel(false);
                    } catch (ExecutionException e2) {
/* 89 */                I000lI(e2.getCause());
                    } catch (Exception e3) {
/* 80 */                I000lI(e3);
                    }
                }
            }

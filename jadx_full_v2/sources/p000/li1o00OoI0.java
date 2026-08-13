            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            
            public abstract class li1o00OoI0 extends liIIoo1oo implements Runnable {
                public static final int I00l0OO0IO = 0;
                public ListenableFuture I00ioIO;
                public Object I00l0I0l0lO1;

                public li1o00OoI0(ListenableFuture listenableFuture, Object obj) {
/* 4 */             listenableFuture.getClass();
/* 7 */             this.I00ioIO = listenableFuture;
/* 9 */             this.I00l0I0l0lO1 = obj;
                }

                @Override
                public final void I0000O() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             boolean z = false;
/* 15 */            if ((listenableFuture != null) & (this.I00iOIl instanceof li0olooIo)) {
/* 17 */                Object obj = this.I00iOIl;
/* 21 */                if ((obj instanceof li0olooIo) && ((li0olooIo) obj).I00000oIO) {
/* 29 */                    z = true;
                        }
/* 30 */                listenableFuture.cancel(z);
                    }
/* 34 */            this.I00ioIO = null;
/* 36 */            this.I00l0I0l0lO1 = null;
                }

                @Override
                public final String I0000oI00() {
                    String strI0010I0i;
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             Object obj = this.I00l0I0l0lO1;
/* 5 */             String strI0000oI00 = super.I0000oI00();
/* 9 */             if (listenableFuture != null) {
/* 11 */                String string = listenableFuture.toString();
/* 30 */                strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
                    } else {
/* 35 */                strI0010I0i = "";
                    }
/* 37 */            if (obj == null) {
/* 70 */                if (strI0000oI00 != null) {
/* 72 */                    return strI0010I0i.concat(strI0000oI00);
                        }
/* 77 */                return null;
                    }
/* 39 */            int length = strI0010I0i.length();
/* 43 */            String string2 = obj.toString();
/* 65 */            return IIl001iO0Io.I00100o1O0lo(new StringBuilder(string2.length() + length + 10 + 1), strI0010I0i, "function=[", string2, "]");
                }

                public abstract void I000oI1ioi(Object obj);

                public abstract Object I00100l0(Object obj, Object obj2);

                @Override
                public final void run() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             Object obj = this.I00l0I0l0lO1;
/* 22 */            if (((this.I00iOIl instanceof li0olooIo) | (listenableFuture == null)) || (obj == null)) {
/* 24 */                return;
                    }
/* 26 */            this.I00ioIO = null;
/* 32 */            if (listenableFuture.isCancelled()) {
/* 93 */                I000OiO(listenableFuture);
/* 110 */               return;
                    }
                    try {
                        try {
/* 38 */                    Object objI00100l0 = I00100l0(obj, ll0li01oO0li.I0000oI00(listenableFuture));
/* 42 */                    this.I00l0I0l0lO1 = null;
/* 44 */                    I000oI1ioi(objI00100l0);
                        } catch (Throwable th) {
                            try {
/* 51 */                        if (th instanceof InterruptedException) {
/* 57 */                            Thread.currentThread().interrupt();
                                }
/* 60 */                        I000OOo1O(th);
                            } finally {
/* 67 */                        this.I00l0I0l0lO1 = null;
                            }
                        }
                    } catch (Error e) {
/* 71 */                I000OOo1O(e);
                    } catch (CancellationException unused) {
/* 89 */                cancel(false);
                    } catch (ExecutionException e2) {
/* 85 */                I000OOo1O(e2.getCause());
                    } catch (Exception e3) {
/* 76 */                I000OOo1O(e3);
                    }
                }
            }

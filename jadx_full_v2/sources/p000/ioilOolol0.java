            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            
            public abstract class ioilOolol0 extends iolIIiIlOo implements Runnable {
                public static final int I00l0OO0IO = 0;
                public ListenableFuture I00ioIO;
                public Object I00l0I0l0lO1;

                public ioilOolol0(ListenableFuture listenableFuture, Object obj) {
/* 4 */             listenableFuture.getClass();
/* 7 */             this.I00ioIO = listenableFuture;
/* 9 */             this.I00l0I0l0lO1 = obj;
                }

                @Override
                public final String I0000O() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             Object obj = this.I00l0I0l0lO1;
/* 5 */             String strI0000O = super.I0000O();
/* 24 */            String strI000lI = listenableFuture != null ? IlIi0I0.I000lI("inputFuture=[", listenableFuture.toString(), "], ") : "";
/* 26 */            if (obj != null) {
/* 36 */                return IIl001iO0Io.I000oI1ioi(strI000lI, "function=[", obj.toString(), "]");
                    }
/* 41 */            if (strI0000O != null) {
/* 43 */                return strI000lI.concat(strI0000O);
                    }
/* 48 */            return null;
                }

                @Override
                public final void I0000oI00() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             boolean z = false;
/* 15 */            if ((listenableFuture != null) & (this.I00iOIl instanceof ioO0o00)) {
/* 17 */                Object obj = this.I00iOIl;
/* 21 */                if ((obj instanceof ioO0o00) && ((ioO0o00) obj).I00000oIO) {
/* 29 */                    z = true;
                        }
/* 30 */                listenableFuture.cancel(z);
                    }
/* 34 */            this.I00ioIO = null;
/* 36 */            this.I00l0I0l0lO1 = null;
                }

                public abstract Object I000oI1ioi(Object obj, Object obj2);

                public abstract void I00100l0(Object obj);

                @Override
                public final void run() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             Object obj = this.I00l0I0l0lO1;
/* 22 */            if (((this.I00iOIl instanceof ioO0o00) | (listenableFuture == null)) || (obj == null)) {
/* 24 */                return;
                    }
/* 26 */            this.I00ioIO = null;
/* 32 */            if (listenableFuture.isCancelled()) {
/* 93 */                I000OiO(listenableFuture);
/* 110 */               return;
                    }
                    try {
                        try {
/* 38 */                    Object objI000oI1ioi = I000oI1ioi(obj, lioli1IO.I0000oI00(listenableFuture));
/* 42 */                    this.I00l0I0l0lO1 = null;
/* 44 */                    I00100l0(objI000oI1ioi);
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

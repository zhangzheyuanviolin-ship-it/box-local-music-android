            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.ExecutionException;
            
            public abstract class I00ll1 extends IlOooOIi1o implements Runnable {
                public static final int I00ll1 = 0;
                public ListenableFuture I00l0I0l0lO1;
                public Class I00l0OO0IO;
                public Object I00li1OI;

                public I00ll1(ListenableFuture listenableFuture, Class cls, Object obj) {
/* 4 */             this.I00l0I0l0lO1 = listenableFuture;
/* 6 */             this.I00l0OO0IO = cls;
/* 8 */             this.I00li1OI = obj;
                }

                @Override
                public final void I0000O() {
/* 1 */             ListenableFuture listenableFuture = this.I00l0I0l0lO1;
/* 13 */            if ((listenableFuture != null) & (this.I00iOIl instanceof I010i10l)) {
/* 19 */                listenableFuture.cancel(I000oI1ioi());
                    }
/* 23 */            this.I00l0I0l0lO1 = null;
/* 25 */            this.I00l0OO0IO = null;
/* 27 */            this.I00li1OI = null;
                }

                @Override
                public final String I000iOII() {
                    String str;
/* 1 */             ListenableFuture listenableFuture = this.I00l0I0l0lO1;
/* 3 */             Class cls = this.I00l0OO0IO;
/* 5 */             Object obj = this.I00li1OI;
/* 7 */             String strI000iOII = super.I000iOII();
/* 11 */            if (listenableFuture != null) {
/* 28 */                str = "inputFuture=[" + listenableFuture + "], ";
                    } else {
/* 33 */                str = "";
                    }
/* 35 */            if (cls == null || obj == null) {
/* 70 */                if (strI000iOII != null) {
/* 72 */                    return str.concat(strI000iOII);
                        }
/* 77 */                return null;
                    }
/* 65 */            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
                }

                public abstract Object I00100l0(Object obj, Throwable th);

                public abstract void I00100o1O0lo(Object obj);

                @Override
                public final void run() {
/* 1 */             ListenableFuture listenableFuture = this.I00l0I0l0lO1;
/* 3 */             Class cls = this.I00l0OO0IO;
/* 5 */             Object obj = this.I00li1OI;
/* 24 */            if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.I00iOIl instanceof I010i10l)) {
/* 245 */               return;
                    }
/* 35 */            this.I00l0I0l0lO1 = null;
                    try {
/* 53 */                th = listenableFuture instanceof I011iiii0i ? ((I011iiii0i) listenableFuture).I00000oOI() : null;
                    } catch (ExecutionException e) {
/* 63 */                Throwable cause = e.getCause();
/* 67 */                if (cause == null) {
/* 106 */                   cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
                        }
/* 109 */               th = cause;
                    } catch (Throwable th) {
/* 49 */                th = th;
                    }
/* 61 */            Object objI00000oIO = th == null ? IlloOoiiO.I00000oIO(listenableFuture) : null;
/* 111 */           if (th == null) {
/* 113 */               I000l1(objI00000oIO);
/* 116 */               return;
                    }
/* 121 */           if (!cls.isInstance(th)) {
/* 123 */               I000o00OoI0I(listenableFuture);
/* 126 */               return;
                    }
                    try {
/* 127 */               Object objI00100l0 = I00100l0(obj, th);
/* 131 */               this.I00l0OO0IO = null;
/* 133 */               this.I00li1OI = null;
/* 135 */               I00100o1O0lo(objI00100l0);
                    } catch (Throwable th2) {
                        try {
/* 142 */                   if (th2 instanceof InterruptedException) {
/* 148 */                       Thread.currentThread().interrupt();
                            }
/* 151 */                   I000lI(th2);
                        } finally {
/* 160 */                   this.I00l0OO0IO = null;
/* 162 */                   this.I00li1OI = null;
                        }
                    }
                }
            }

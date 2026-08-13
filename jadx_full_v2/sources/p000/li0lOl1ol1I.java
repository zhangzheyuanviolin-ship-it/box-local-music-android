            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.ExecutionException;
            
            public final class li0lOl1ol1I extends liIIoo1oo implements Runnable {
                public li1o00OoI0 I00ioIO;
                public Class I00l0I0l0lO1;
                public iOiOO11l I00l0OO0IO;

                @Override
                public final void I0000O() {
/* 1 */             li1o00OoI0 li1o00ooi0 = this.I00ioIO;
/* 3 */             boolean z = false;
/* 15 */            if ((li1o00ooi0 != null) & (this.I00iOIl instanceof li0olooIo)) {
/* 17 */                Object obj = this.I00iOIl;
/* 21 */                if ((obj instanceof li0olooIo) && ((li0olooIo) obj).I00000oIO) {
/* 29 */                    z = true;
                        }
/* 30 */                li1o00ooi0.cancel(z);
                    }
/* 34 */            this.I00ioIO = null;
/* 36 */            this.I00l0I0l0lO1 = null;
/* 38 */            this.I00l0OO0IO = null;
                }

                @Override
                public final String I0000oI00() {
                    String strI0010I0i;
/* 1 */             li1o00OoI0 li1o00ooi0 = this.I00ioIO;
/* 3 */             Class cls = this.I00l0I0l0lO1;
/* 5 */             iOiOO11l ioioo11l = this.I00l0OO0IO;
/* 7 */             String strI0000oI00 = super.I0000oI00();
/* 11 */            if (li1o00ooi0 != null) {
/* 13 */                String string = li1o00ooi0.toString();
/* 32 */                strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
                    } else {
/* 37 */                strI0010I0i = "";
                    }
/* 39 */            if (cls == null || ioioo11l == null) {
/* 91 */                if (strI0000oI00 != null) {
/* 93 */                    return strI0010I0i.concat(strI0000oI00);
                        }
/* 98 */                return null;
                    }
/* 44 */            int length = strI0010I0i.length();
/* 48 */            String string2 = cls.toString();
/* 54 */            int length2 = string2.length();
/* 58 */            String string3 = ioioo11l.toString();
/* 74 */            StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
/* 81 */            IIl001iO0Io.I001lIiIIo1O(sb, strI0010I0i, "exceptionType=[", string2, "], fallback=[");
/* 86 */            return IIl001iO0Io.I00100l0(sb, string3, "]");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void run() {
                    Throwable th;
/* 1 */             li1o00OoI0 li1o00ooi0 = this.I00ioIO;
/* 3 */             Class cls = this.I00l0I0l0lO1;
/* 5 */             iOiOO11l ioioo11l = this.I00l0OO0IO;
/* 24 */            if (((ioioo11l == null) || ((li1o00ooi0 == null) | (cls == null))) || (this.I00iOIl instanceof li0olooIo)) {
/* 245 */               return;
                    }
/* 35 */            this.I00ioIO = null;
/* 37 */            if (li1o00ooi0 != null) {
                        try {
/* 39 */                    th = li1o00ooi0.I00000oOI();
                        } catch (ExecutionException e) {
/* 58 */                    Throwable cause = e.getCause();
/* 62 */                    if (cause == null) {
/* 70 */                        String strValueOf = String.valueOf(li1o00ooi0.getClass());
/* 78 */                        String strValueOf2 = String.valueOf(e.getClass());
/* 97 */                        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
/* 104 */                       IIl001iO0Io.I001lIiIIo1O(sb, "Future type ", strValueOf, " threw ", strValueOf2);
/* 109 */                       sb.append(" without a cause");
/* 116 */                       cause = new NullPointerException(sb.toString());
                            }
/* 119 */                   th = cause;
                        } catch (Throwable th2) {
/* 44 */                    th = th2;
                        }
                    } else {
/* 48 */                th = null;
                    }
/* 56 */            Object objI0000oI00 = th == null ? ll0li01oO0li.I0000oI00(li1o00ooi0) : null;
/* 121 */           if (th == null) {
/* 123 */               I000O01llI0(objI0000oI00);
/* 126 */               return;
                    }
/* 131 */           if (!cls.isInstance(th)) {
/* 189 */               I000OiO(li1o00ooi0);
/* 245 */               return;
                    }
                    try {
/* 133 */               ListenableFuture listenableFutureZza = ioioo11l.zza(th);
/* 137 */               if (listenableFutureZza == null) {
/* 162 */                   throw new NullPointerException(ll0Oo10I10.I00000oIO("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ioioo11l));
                        }
/* 139 */               this.I00l0I0l0lO1 = null;
/* 141 */               this.I00l0OO0IO = null;
/* 143 */               I000OiO(listenableFutureZza);
                    } catch (Throwable th3) {
                        try {
/* 166 */                   if (th3 instanceof InterruptedException) {
/* 172 */                       Thread.currentThread().interrupt();
                            }
/* 175 */                   I000OOo1O(th3);
                        } finally {
/* 184 */                   this.I00l0I0l0lO1 = null;
/* 186 */                   this.I00l0OO0IO = null;
                        }
                    }
                }
            }

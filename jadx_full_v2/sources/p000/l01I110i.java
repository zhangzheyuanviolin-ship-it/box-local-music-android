            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.imagedescription.zzp;
            import java.util.concurrent.ExecutionException;
            
            public final class l01I110i extends l0OiIioI1I0 implements Runnable {
                public ListenableFuture I00ioIO;
                public Class I00l0I0l0lO1;
                public zzp I00l0OO0IO;

                @Override
                public final String I0000O() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             Class cls = this.I00l0I0l0lO1;
/* 5 */             zzp zzpVar = this.I00l0OO0IO;
/* 7 */             String strI0000O = super.I0000O();
/* 26 */            String strI000lI = listenableFuture != null ? IlIi0I0.I000lI("inputFuture=[", listenableFuture.toString(), "], ") : "";
/* 28 */            if (cls == null || zzpVar == null) {
/* 59 */                if (strI0000O != null) {
/* 61 */                    return strI000lI.concat(strI0000O);
                        }
/* 66 */                return null;
                    }
/* 45 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O(strI000lI, "exceptionType=[", cls.toString(), "], fallback=[", zzpVar.toString());
/* 51 */            sbI00111O.append("]");
/* 54 */            return sbI00111O.toString();
                }

                @Override
                public final void I0000oI00() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             boolean z = false;
/* 15 */            if ((listenableFuture != null) & (this.I00iOIl instanceof l01OOll0II1)) {
/* 17 */                Object obj = this.I00iOIl;
/* 21 */                if ((obj instanceof l01OOll0II1) && ((l01OOll0II1) obj).I00000oIO) {
/* 29 */                    z = true;
                        }
/* 30 */                listenableFuture.cancel(z);
                    }
/* 34 */            this.I00ioIO = null;
/* 36 */            this.I00l0I0l0lO1 = null;
/* 38 */            this.I00l0OO0IO = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void run() {
/* 1 */             ListenableFuture listenableFuture = this.I00ioIO;
/* 3 */             Class cls = this.I00l0I0l0lO1;
/* 5 */             zzp zzpVar = this.I00l0OO0IO;
/* 24 */            if (((zzpVar == null) || ((listenableFuture == null) | (cls == null))) || (this.I00iOIl instanceof l01OOll0II1)) {
/* 245 */               return;
                    }
/* 35 */            this.I00ioIO = null;
                    try {
/* 53 */                th = listenableFuture instanceof l01loiOOo11l ? ((l01loiOOo11l) listenableFuture).I00000oOI() : null;
                    } catch (ExecutionException e) {
/* 63 */                Throwable cause = e.getCause();
/* 67 */                if (cause == null) {
/* 97 */                    cause = new NullPointerException(Oi010OO0.I001IO000("Future type ", String.valueOf(listenableFuture.getClass()), " threw ", String.valueOf(e.getClass()), " without a cause"));
                        }
/* 100 */               th = cause;
                    } catch (Throwable th) {
/* 49 */                th = th;
                    }
/* 61 */            Object objI0000Il00O = th == null ? ll00lliII.I0000Il00O(listenableFuture) : null;
/* 102 */           if (th == null) {
/* 104 */               I000O01llI0(objI0000Il00O);
/* 107 */               return;
                    }
/* 112 */           if (!cls.isInstance(th)) {
/* 170 */               I000OiO(listenableFuture);
/* 245 */               return;
                    }
                    try {
/* 114 */               ListenableFuture listenableFutureZza = zzpVar.zza(th);
/* 118 */               if (listenableFutureZza == null) {
/* 143 */                   throw new NullPointerException(lio011oio0.I00000oIO("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzpVar));
                        }
/* 120 */               this.I00l0I0l0lO1 = null;
/* 122 */               this.I00l0OO0IO = null;
/* 124 */               I000OiO(listenableFutureZza);
                    } catch (Throwable th2) {
                        try {
/* 147 */                   if (th2 instanceof InterruptedException) {
/* 153 */                       Thread.currentThread().interrupt();
                            }
/* 156 */                   I000OOo1O(th2);
                        } finally {
/* 165 */                   this.I00l0I0l0lO1 = null;
/* 167 */                   this.I00l0OO0IO = null;
                        }
                    }
                }
            }

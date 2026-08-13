            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
/* 24 */    public final class O010oO implements ListenableFuture {
                public O10lo10Io I00iOIl;
                public Oio0llilli I00iiI;
                public boolean I00iiO;

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00iiI.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 7 */             if (!this.I00iiI.cancel(z)) {
/* 17 */                return false;
                    }
/* 12 */            this.I00iOIl.I000II(null);
/* 15 */            return true;
                }

                @Override
                public final Object get() throws Throwable {
/* 3 */             Object obj = this.I00iiI.get();
/* 9 */             if (obj instanceof IIoiOiiI) {
/* 29 */                throw new CancellationException().initCause(((IIoiOiiI) obj).I00000oIO);
                    }
/* 11 */            return obj;
                }

                @Override
                public final boolean isCancelled() {
                    boolean z;
/* 8 */             if (this.I00iiI.I00iOIl instanceof I010i10l) {
/* 7 */                 return true;
                    }
/* 17 */            if (this.I00iiI.isDone() && !this.I00iiO) {
                        try {
/* 29 */                    z = li010iilO.I00000oIO(this.I00iiI) instanceof IIoiOiiI;
                        } catch (CancellationException unused) {
/* 36 */                    z = true;
                        } catch (ExecutionException unused2) {
/* 32 */                    this.I00iiO = true;
/* 34 */                    z = false;
                        }
/* 37 */                if (z) {
/* 7 */                     return true;
                        }
                    }
/* 16 */            return false;
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00iiI.isDone();
                }

                public final String toString() {
/* 7 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append(super.toString());
/* 19 */            sb.append("[status=");
/* 22 */            Oio0llilli oio0llilli = this.I00iiI;
/* 30 */            if (oio0llilli.isDone()) {
                        try {
/* 32 */                    Object objI00000oIO = li010iilO.I00000oIO(oio0llilli);
/* 38 */                    if (objI00000oIO instanceof IIoiOiiI) {
/* 59 */                        sb.append("CANCELLED, cause=[" + ((IIoiOiiI) objI00000oIO).I00000oIO + ']');
                            } else {
/* 82 */                        sb.append("SUCCESS, result=[" + objI00000oIO + ']');
                            }
                        } catch (CancellationException unused) {
/* 140 */                   sb.append("CANCELLED");
                        } catch (ExecutionException e) {
/* 134 */                   sb.append("FAILURE, cause=[" + e.getCause() + ']');
                        } catch (Throwable th) {
/* 109 */                   sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
                        }
                    } else {
/* 161 */               sb.append("PENDING, delegate=[" + oio0llilli + ']');
                    }
/* 164 */           sb.append(']');
/* 167 */           return sb.toString();
                }

                @Override
/* 25 */        public final Object get(long j, TimeUnit timeUnit) throws Throwable {
/* 26 */            Object obj = this.I00iiI.get(j, timeUnit);
/* 27 */            if (obj instanceof IIoiOiiI) {
/* 28 */                throw new CancellationException().initCause(((IIoiOiiI) obj).I00000oIO);
                    }
                    return obj;
                }
            }

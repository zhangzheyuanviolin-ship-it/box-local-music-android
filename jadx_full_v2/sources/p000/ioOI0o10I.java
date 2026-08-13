            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            
/* 18 */    public abstract class ioOI0o10I extends ioOi11iiI {
                public static Object I0000Il00O(ListenableFuture listenableFuture) {
                    Object obj;
                    Throwable thI00000oOI;
/* 6 */             if (listenableFuture instanceof ioO10l000) {
/* 10 */                Object ioo0lii0li = ((ioOI0o10I) listenableFuture).I00iOIl;
/* 14 */                if (ioo0lii0li instanceof ioO0lII0lI) {
/* 17 */                    ioO0lII0lI ioo0lii0li2 = (ioO0lII0lI) ioo0lii0li;
/* 21 */                    if (ioo0lii0li2.I00000oIO) {
/* 23 */                        Throwable th = ioo0lii0li2.I00000oOI;
/* 34 */                        ioo0lii0li = th != null ? new ioO0lII0lI(false, th) : ioO0lII0lI.I0000O;
                            }
                        }
/* 36 */                Objects.requireNonNull(ioo0lii0li);
/* 39 */                return ioo0lii0li;
                    }
/* 42 */            if ((listenableFuture instanceof ioOi11iiI) && (thI00000oOI = ((ioOi11iiI) listenableFuture).I00000oOI()) != null) {
/* 56 */                ioO0oioo0i ioo0oioo0i = new ioO0oioo0i();
/* 59 */                ioo0oioo0i.I00000oIO = thI00000oOI;
/* 61 */                return ioo0oioo0i;
                    }
/* 62 */            boolean zIsCancelled = listenableFuture.isCancelled();
/* 68 */            boolean z = true;
/* 71 */            if ((!ioOi11iiI.I00ilO0) && zIsCancelled) {
/* 73 */                ioO0lII0lI ioo0lii0li3 = ioO0lII0lI.I0000O;
/* 75 */                Objects.requireNonNull(ioo0lii0li3);
/* 78 */                return ioo0lii0li3;
                    }
/* 79 */            boolean z2 = false;
                    while (true) {
                        try {
                            try {
/* 80 */                        obj = listenableFuture.get();
                                break;
                            } catch (InterruptedException unused) {
/* 213 */                       z2 = z;
                            } catch (Throwable th2) {
/* 127 */                       if (z2) {
/* 134 */                           Thread.currentThread().interrupt();
                                }
/* 137 */                       throw th2;
                            }
                        } catch (Error | Exception e) {
/* 140 */                   ioO0oioo0i ioo0oioo0i2 = new ioO0oioo0i();
/* 143 */                   ioo0oioo0i2.I00000oIO = e;
/* 145 */                   return ioo0oioo0i2;
                        } catch (CancellationException e2) {
/* 146 */                   if (zIsCancelled) {
/* 173 */                       return new ioO0lII0lI(false, e2);
                            }
/* 162 */                   IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2);
/* 165 */                   ioO0oioo0i ioo0oioo0i3 = new ioO0oioo0i();
/* 168 */                   ioo0oioo0i3.I00000oIO = illegalArgumentException;
/* 170 */                   return ioo0oioo0i3;
                        } catch (ExecutionException e3) {
/* 177 */                   if (zIsCancelled) {
/* 194 */                       return new ioO0lII0lI(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3));
                            }
/* 200 */                   Throwable cause = e3.getCause();
/* 204 */                   ioO0oioo0i ioo0oioo0i4 = new ioO0oioo0i();
/* 207 */                   cause.getClass();
/* 210 */                   ioo0oioo0i4.I00000oIO = cause;
/* 212 */                   return ioo0oioo0i4;
                        }
                    }
/* 84 */            if (z2) {
/* 90 */                Thread.currentThread().interrupt();
                    }
                    return zIsCancelled ? new ioO0lII0lI(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)))) : obj == null ? ioOi11iiI.I00iio : obj;
                }

                public static Object I0001Ioi1lo(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof ioO0lII0lI) {
/* 27 */                Throwable th = ((ioO0lII0lI) obj).I00000oOI;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof ioO0oioo0i) {
/* 24 */                throw new ExecutionException(((ioO0oioo0i) obj).I00000oIO);
                    }
/* 11 */            if (obj == ioOi11iiI.I00iio) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static boolean I000II(Object obj) {
                    return !(obj instanceof ioO0oIll);
                }

                public static void I000l1(ioOI0o10I iooi0o10i) {
                    ioO100IioiO0 ioo100iioio0;
/* 2 */             ioO100IioiO0 ioo100iioio02 = null;
                    while (true) {
/* 9 */                 for (ioOOIoo ioooiooI00000oOI = ioOi11iiI.I00io1l.I00000oOI(iooi0o10i); ioooiooI00000oOI != null; ioooiooI00000oOI = ioooiooI00000oOI.I00000oOI) {
/* 11 */                    Thread thread = ioooiooI00000oOI.I00000oIO;
/* 13 */                    if (thread != null) {
/* 15 */                        ioooiooI00000oOI.I00000oIO = null;
/* 17 */                        LockSupport.unpark(thread);
                            }
                        }
/* 23 */                iooi0o10i.I0000oI00();
/* 26 */                ioO100IioiO0 ioo100iioio03 = ioO100IioiO0.I0000O;
/* 34 */                ioO100IioiO0 ioo100iioio04 = ioo100iioio02;
/* 30 */                ioO100IioiO0 ioo100iioio0I00000oIO = ioOi11iiI.I00io1l.I00000oIO(iooi0o10i);
/* 36 */                ioO100IioiO0 ioo100iioio05 = ioo100iioio04;
/* 37 */                while (ioo100iioio0I00000oIO != null) {
/* 39 */                    ioO100IioiO0 ioo100iioio06 = ioo100iioio0I00000oIO.I0000Il00O;
/* 41 */                    ioo100iioio0I00000oIO.I0000Il00O = ioo100iioio05;
/* 43 */                    ioo100iioio05 = ioo100iioio0I00000oIO;
/* 44 */                    ioo100iioio0I00000oIO = ioo100iioio06;
                        }
/* 46 */                while (ioo100iioio05 != null) {
/* 48 */                    Runnable runnable = ioo100iioio05.I00000oIO;
/* 50 */                    ioo100iioio0 = ioo100iioio05.I0000Il00O;
/* 52 */                    Objects.requireNonNull(runnable);
/* 57 */                    if (runnable instanceof ioO0oIll) {
/* 59 */                        ioO0oIll ioo0oill = (ioO0oIll) runnable;
/* 61 */                        iooi0o10i = ioo0oill.I00iOIl;
/* 65 */                        if (iooi0o10i.I00iOIl == ioo0oill) {
/* 79 */                            if (ioOi11iiI.I00io1l.I0001Ioi1lo(iooi0o10i, ioo0oill, I0000Il00O(ioo0oill.I00iiI))) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
/* 83 */                        Executor executor = ioo100iioio05.I00000oOI;
/* 85 */                        Objects.requireNonNull(executor);
/* 88 */                        I000lI(runnable, executor);
                            }
/* 91 */                    ioo100iioio05 = ioo100iioio0;
                        }
/* 168 */               return;
/* 81 */                ioo100iioio02 = ioo100iioio0;
                    }
                }

                public static void I000lI(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 35 */                ioOi11iiI.I00ilI0I1.I00000oOI().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", IIl001iO0Io.I000oI1ioi("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                @Override
                public final Throwable I00000oOI() {
/* 3 */             if (!(this instanceof ioO10l000)) {
/* 16 */                return null;
                    }
/* 5 */             Object obj = this.I00iOIl;
/* 9 */             if (obj instanceof ioO0oioo0i) {
/* 13 */                return ((ioO0oioo0i) obj).I00000oIO;
                    }
/* 16 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String I0000O() {
/* 3 */             if (this instanceof ScheduledFuture) {
/* 17 */                return IlIi0I0.I000l1(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
                    }
/* 22 */            return null;
                }

                public boolean I000O01llI0(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = ioOi11iiI.I00iio;
                    }
/* 12 */            if (!ioOi11iiI.I00io1l.I0001Ioi1lo(this, null, obj)) {
/* 19 */                return false;
                    }
/* 14 */            I000l1(this);
/* 17 */            return true;
                }

                public boolean I000OOo1O(Throwable th) {
/* 3 */             th.getClass();
/* 6 */             ioO0oioo0i ioo0oioo0i = new ioO0oioo0i();
/* 9 */             ioo0oioo0i.I00000oIO = th;
/* 18 */            if (!ioOi11iiI.I00io1l.I0001Ioi1lo(this, null, ioo0oioo0i)) {
/* 25 */                return false;
                    }
/* 20 */            I000l1(this);
/* 23 */            return true;
                }

                public final void I000OiO(ListenableFuture listenableFuture) {
                    ioO0oioo0i ioo0oioo0i;
/* 1 */             listenableFuture.getClass();
/* 4 */             Object obj = this.I00iOIl;
/* 6 */             if (obj == null) {
/* 13 */                if (listenableFuture.isDone()) {
/* 25 */                    if (ioOi11iiI.I00io1l.I0001Ioi1lo(this, null, I0000Il00O(listenableFuture))) {
/* 27 */                        I000l1(this);
/* 30 */                        return;
                            }
/* 168 */                   return;
                        }
/* 33 */                ioO0oIll ioo0oill = new ioO0oIll();
/* 36 */                ioo0oill.I00iOIl = this;
/* 38 */                ioo0oill.I00iiI = listenableFuture;
/* 40 */                VarHandle.storeStoreFence();
/* 49 */                if (ioOi11iiI.I00io1l.I0001Ioi1lo(this, null, ioo0oill)) {
                            try {
/* 53 */                        listenableFuture.addListener(ioo0oill, iol1Iil.I00iOIl);
/* 56 */                        return;
                            } catch (Throwable th) {
                                try {
/* 60 */                            ioo0oioo0i = new ioO0oioo0i();
/* 63 */                            ioo0oioo0i.I00000oIO = th;
                                } catch (Error | Exception unused) {
/* 66 */                            ioo0oioo0i = ioO0oioo0i.I00000oOI;
                                }
/* 70 */                        ioOi11iiI.I00io1l.I0001Ioi1lo(this, ioo0oill, ioo0oioo0i);
/* 73 */                        return;
                            }
                        }
/* 74 */                obj = this.I00iOIl;
                    }
/* 78 */            if (obj instanceof ioO0lII0lI) {
/* 84 */                listenableFuture.cancel(((ioO0lII0lI) obj).I00000oIO);
                    }
                }

                public final void I000iOII(StringBuilder sb) {
                    Object obj;
/* 3 */             boolean z = false;
                    while (true) {
                        try {
                            try {
/* 4 */                         obj = get();
                                break;
                            } catch (InterruptedException unused) {
/* 125 */                       z = true;
                            } catch (Throwable th) {
/* 74 */                        if (z) {
/* 81 */                            Thread.currentThread().interrupt();
                                }
/* 84 */                        throw th;
                            }
                        } catch (CancellationException unused2) {
/* 105 */                   sb.append("CANCELLED");
/* 108 */                   return;
                        } catch (ExecutionException e) {
/* 111 */                   sb.append("FAILURE, cause=[");
/* 118 */                   sb.append(e.getCause());
/* 121 */                   sb.append("]");
/* 124 */                   return;
                        } catch (Exception e2) {
/* 87 */                    sb.append("UNKNOWN, cause=[");
/* 94 */                    sb.append(e2.getClass());
/* 99 */                    sb.append(" thrown from get()]");
/* 102 */                   return;
                        }
                    }
/* 8 */             if (z) {
/* 14 */                Thread.currentThread().interrupt();
                    }
/* 19 */            sb.append("SUCCESS, result=[");
/* 22 */            if (obj == null) {
/* 26 */                sb.append("null");
                    } else if (obj == this) {
/* 38 */                sb.append("this future");
                    } else {
/* 50 */                sb.append(obj.getClass().getName());
/* 55 */                sb.append("@");
/* 66 */                sb.append(Integer.toHexString(System.identityHashCode(obj)));
                    }
/* 69 */            sb.append("]");
                }

                @Override
                public void addListener(Runnable runnable, Executor executor) {
                    ioO100IioiO0 ioo100iioio0;
/* 1 */             if (runnable == null) {
/* 56 */                IOOlIIilOl0.I000II("Runnable was null.");
/* 106 */               return;
                    }
/* 3 */             if (executor == null) {
/* 50 */                IOOlIIilOl0.I000II("Executor was null.");
/* 53 */                return;
                    }
/* 9 */             if (!isDone() && (ioo100iioio0 = this.I00iiI) != ioO100IioiO0.I0000O) {
/* 19 */                ioO100IioiO0 ioo100iioio02 = new ioO100IioiO0();
/* 22 */                ioo100iioio02.I00000oIO = runnable;
/* 24 */                ioo100iioio02.I00000oOI = executor;
/* 40 */                do {
/* 26 */                    ioo100iioio02.I0000Il00O = ioo100iioio0;
/* 34 */                    if (ioOi11iiI.I00io1l.I0000oI00(this, ioo100iioio0, ioo100iioio02)) {
/* 43 */                        return;
                            } else {
/* 36 */                        ioo100iioio0 = this.I00iiI;
                            }
/* 40 */                } while (ioo100iioio0 != ioO100IioiO0.I0000O);
                    }
/* 44 */            I000lI(runnable, executor);
                }

                @Override
                public boolean cancel(boolean z) {
                    ioO0lII0lI ioo0lii0li;
/* 1 */             Object obj = this.I00iOIl;
/* 13 */            if (!(obj instanceof ioO0oIll) && !(obj == null)) {
/* 5 */                 return false;
                    }
/* 17 */            if (ioOi11iiI.I00ilO0) {
/* 28 */                ioo0lii0li = new ioO0lII0lI(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 37 */                ioo0lii0li = z ? ioO0lII0lI.I0000Il00O : ioO0lII0lI.I0000O;
/* 39 */                Objects.requireNonNull(ioo0lii0li);
                    }
/* 42 */            boolean z2 = false;
                    while (true) {
/* 49 */                if (ioOi11iiI.I00io1l.I0001Ioi1lo(this, obj, ioo0lii0li)) {
/* 51 */                    I000l1(this);
/* 56 */                    if (!(obj instanceof ioO0oIll)) {
                                break;
                            }
/* 60 */                    ListenableFuture listenableFuture = ((ioO0oIll) obj).I00iiI;
/* 64 */                    if (!(listenableFuture instanceof ioO10l000)) {
/* 82 */                        listenableFuture.cancel(z);
                                break;
                            }
/* 66 */                    this = (ioOI0o10I) listenableFuture;
/* 68 */                    obj = this.I00iOIl;
/* 78 */                    if (!(obj == null) && !(obj instanceof ioO0oIll)) {
                                break;
                            }
/* 80 */                    z2 = true;
                        } else {
/* 86 */                    obj = this.I00iOIl;
/* 92 */                    if (I000II(obj)) {
/* 94 */                        return z2;
                            }
                        }
                    }
/* 6 */             return true;
                }

                @Override
                public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    long j2;
                    Object obj;
/* 7 */             ioOOIoo ioooioo = ioOOIoo.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 361 */               I000II.I00100l0();
/* 359 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 31 */            if ((obj2 != null) && I000II(obj2)) {
/* 33 */                return I0001Ioi1lo(obj2);
                    }
/* 38 */            long j3 = 0;
/* 50 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 55 */            if (nanos >= 1000) {
/* 57 */                ioOOIoo ioooioo2 = this.I00iiO;
/* 59 */                if (ioooioo2 != ioooioo) {
/* 61 */                    obj = null;
/* 65 */                    ioOOIoo ioooioo3 = new ioOOIoo();
                            while (true) {
/* 68 */                        lioiOiO lioioio = ioOi11iiI.I00io1l;
/* 70 */                        lioioio.I0000Il00O(ioooioo3, ioooioo2);
/* 77 */                        if (lioioio.I000II(this, ioooioo2, ioooioo3)) {
/* 79 */                            j2 = j3;
/* 126 */                           do {
/* 90 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 97 */                                if (Thread.interrupted()) {
/* 132 */                                   I00000oIO(ioooioo3);
/* 135 */                                   I000II.I00100l0();
/* 61 */                                    return null;
                                        }
/* 99 */                                Object obj3 = this.I00iOIl;
/* 111 */                               if ((obj3 != null) && I000II(obj3)) {
/* 113 */                                   return I0001Ioi1lo(obj3);
                                        }
/* 122 */                               nanos = jNanoTime - System.nanoTime();
/* 126 */                           } while (nanos >= 1000);
/* 128 */                           I00000oIO(ioooioo3);
                                } else {
/* 139 */                           long j4 = j3;
/* 141 */                           ioOOIoo ioooioo4 = this.I00iiO;
/* 143 */                           if (ioooioo4 == ioooioo) {
                                        break;
                                    }
/* 146 */                           ioooioo2 = ioooioo4;
/* 147 */                           j3 = j4;
                                }
                            }
                        }
/* 150 */               Object obj4 = this.I00iOIl;
/* 152 */               Objects.requireNonNull(obj4);
/* 155 */               return I0001Ioi1lo(obj4);
                    }
/* 160 */           j2 = 0;
/* 162 */           obj = null;
/* 166 */           while (nanos > j2) {
/* 168 */               Object obj5 = this.I00iOIl;
/* 180 */               if ((obj5 != null) && I000II(obj5)) {
/* 182 */                   return I0001Ioi1lo(obj5);
                        }
/* 191 */               if (Thread.interrupted()) {
/* 200 */                   I000II.I00100l0();
/* 203 */                   return obj;
                        }
/* 197 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 204 */           String string = toString();
/* 208 */           String string2 = timeUnit.toString();
/* 212 */           Locale locale = Locale.ROOT;
/* 214 */           String lowerCase = string2.toLowerCase(locale);
/* 244 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 252 */           if (nanos + 1000 < j2) {
/* 256 */               String strConcat2 = strConcat.concat(" (plus ");
/* 260 */               long j5 = -nanos;
/* 263 */               long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
/* 271 */               long nanos2 = j5 - timeUnit.toNanos(jConvert);
/* 282 */               boolean z = jConvert == j2 || nanos2 > 1000;
/* 283 */               if (jConvert > j2) {
/* 299 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 303 */                   if (z) {
/* 307 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 311 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 315 */               if (z) {
/* 319 */                   strConcat2 = IlIi0I0.I000l1(nanos2, strConcat2, " nanoseconds ");
                        }
/* 325 */               strConcat = strConcat2.concat("delay)");
                    }
/* 333 */           if (isDone()) {
/* 346 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 358 */           throw new TimeoutException(IlIi0I0.I000lI(strConcat, " for ", string));
                }

                @Override
                public boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof ioO0lII0lI;
                }

                @Override
                public boolean isDone() {
/* 1 */             Object obj = this.I00iOIl;
/* 12 */            return (obj != null) & I000II(obj);
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public String toString() {
                    String strConcat;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 20 */            if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
/* 30 */                sb.append(getClass().getSimpleName());
                    } else {
/* 42 */                sb.append(getClass().getName());
                    }
/* 47 */            sb.append('@');
/* 58 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 63 */            sb.append("[status=");
/* 72 */            if (isCancelled()) {
/* 76 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 87 */                I000iOII(sb);
                    } else {
/* 92 */                int length = sb.length();
/* 98 */                sb.append("PENDING");
/* 101 */               Object obj = this.I00iOIl;
/* 107 */               if (obj instanceof ioO0oIll) {
/* 111 */                   sb.append(", setFuture=[");
/* 116 */                   ListenableFuture listenableFuture = ((ioO0oIll) obj).I00iiI;
                            try {
/* 118 */                       if (listenableFuture == this) {
/* 122 */                           sb.append("this future");
                                } else {
/* 128 */                           sb.append(listenableFuture);
                                }
                            } catch (Throwable th) {
/* 134 */                       if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
/* 143 */                           throw th;
                                }
/* 144 */                       sb.append("Exception thrown from implementation: ");
/* 151 */                       sb.append(th.getClass());
                            }
/* 154 */                   sb.append("]");
                        } else {
                            try {
/* 158 */                       strConcat = I0000O();
                            } catch (Throwable th2) {
/* 182 */                       if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
/* 191 */                           throw th2;
                                }
/* 200 */                       strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                            }
/* 162 */                   if (strConcat != null) {
/* 175 */                       boolean z = strConcat.isEmpty();
/* 176 */                       if (z) {
/* 178 */                           strConcat = null;
                                }
/* 204 */                       if (strConcat != null) {
/* 208 */                           sb.append(", info=[");
/* 211 */                           sb.append(strConcat);
/* 214 */                           sb.append("]");
                                }
                            }
                        }
/* 221 */               if (isDone()) {
/* 227 */                   sb.delete(length, sb.length());
/* 230 */                   I000iOII(sb);
                        }
                    }
/* 233 */           sb.append("]");
/* 236 */           return sb.toString();
                }

/* 19 */        public void I0000oI00() {
                }

                @Override
/* 364 */       public Object get() throws InterruptedException {
                    Object obj;
/* 365 */           ioOOIoo ioooioo = ioOOIoo.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 366 */               Object obj2 = this.I00iOIl;
/* 367 */               if ((obj2 != null) & I000II(obj2)) {
/* 368 */                   return I0001Ioi1lo(obj2);
                        }
                        ioOOIoo ioooioo2 = this.I00iiO;
                        if (ioooioo2 != ioooioo) {
/* 369 */                   ioOOIoo ioooioo3 = new ioOOIoo();
                            do {
                                lioiOiO lioioio = ioOi11iiI.I00io1l;
/* 370 */                       lioioio.I0000Il00O(ioooioo3, ioooioo2);
/* 371 */                       if (lioioio.I000II(this, ioooioo2, ioooioo3)) {
                                    do {
/* 372 */                               LockSupport.park(this);
/* 373 */                               if (!Thread.interrupted()) {
/* 374 */                                   obj = this.I00iOIl;
                                        } else {
/* 376 */                                   I00000oIO(ioooioo3);
/* 377 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (!((obj != null) & I000II(obj)));
/* 375 */                           return I0001Ioi1lo(obj);
                                }
/* 378 */                       ioooioo2 = this.I00iiO;
                            } while (ioooioo2 != ioooioo);
                        }
                        Object obj3 = this.I00iOIl;
/* 379 */               Objects.requireNonNull(obj3);
                        return I0001Ioi1lo(obj3);
                    }
/* 380 */           I000II.I00100l0();
                    return null;
                }
            }

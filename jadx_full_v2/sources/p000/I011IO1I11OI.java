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
            
/* 27 */    public abstract class I011IO1I11OI extends I011iiii0i {
                public static void I0001Ioi1lo(I011IO1I11OI i011io1i11oi, boolean z) {
/* 2 */             I010o0o0oO i010o0o0oO = null;
                    while (true) {
/* 9 */                 for (I011iO i011iOI0000oI00 = I011iiii0i.I00io1l.I0000oI00(i011io1i11oi); i011iOI0000oI00 != null; i011iOI0000oI00 = i011iOI0000oI00.I00000oOI) {
/* 11 */                    Thread thread = i011iOI0000oI00.I00000oIO;
/* 13 */                    if (thread != null) {
/* 15 */                        i011iOI0000oI00.I00000oIO = null;
/* 17 */                        LockSupport.unpark(thread);
                            }
                        }
/* 23 */                if (z) {
/* 25 */                    i011io1i11oi.I000OiO();
/* 28 */                    z = false;
                        }
/* 29 */                i011io1i11oi.I0000O();
/* 32 */                I010o0o0oO i010o0o0oO2 = I010o0o0oO.I0000O;
/* 40 */                I010o0o0oO i010o0o0oO3 = i010o0o0oO;
/* 36 */                I010o0o0oO i010o0o0oOI0000O = I011iiii0i.I00io1l.I0000O(i011io1i11oi);
/* 42 */                I010o0o0oO i010o0o0oO4 = i010o0o0oO3;
/* 43 */                while (i010o0o0oOI0000O != null) {
/* 45 */                    I010o0o0oO i010o0o0oO5 = i010o0o0oOI0000O.I0000Il00O;
/* 47 */                    i010o0o0oOI0000O.I0000Il00O = i010o0o0oO4;
/* 49 */                    i010o0o0oO4 = i010o0o0oOI0000O;
/* 50 */                    i010o0o0oOI0000O = i010o0o0oO5;
                        }
/* 52 */                while (i010o0o0oO4 != null) {
/* 54 */                    i010o0o0oO = i010o0o0oO4.I0000Il00O;
/* 56 */                    Runnable runnable = i010o0o0oO4.I00000oIO;
/* 58 */                    Objects.requireNonNull(runnable);
/* 63 */                    if (runnable instanceof I010ioo) {
/* 65 */                        I010ioo i010ioo = (I010ioo) runnable;
/* 67 */                        i011io1i11oi = i010ioo.I00iOIl;
/* 71 */                        if (i011io1i11oi.I00iOIl == i010ioo) {
/* 85 */                            if (I011iiii0i.I00io1l.I00000oOI(i011io1i11oi, i010ioo, I000OOo1O(i010ioo.I00iiI))) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
/* 88 */                        Executor executor = i010o0o0oO4.I00000oOI;
/* 90 */                        Objects.requireNonNull(executor);
/* 93 */                        I000II(runnable, executor);
                            }
/* 96 */                    i010o0o0oO4 = i010o0o0oO;
                        }
/* 551 */               return;
                    }
                }

                public static void I000II(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 36 */                I011iiii0i.I00ilI0I1.I00000oIO().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
                    }
                }

                public static Object I000O01llI0(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof I010i10l) {
/* 27 */                Throwable th = ((I010i10l) obj).I00000oOI;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 49 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof I010l1ol111) {
/* 24 */                throw new ExecutionException(((I010l1ol111) obj).I00000oIO);
                    }
/* 11 */            if (obj == I011iiii0i.I00iio) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static Object I000OOo1O(ListenableFuture listenableFuture) {
                    Object obj;
                    Throwable thI00000oOI;
/* 6 */             if (listenableFuture instanceof I0110OiO) {
/* 10 */                Object i010i10l = ((I011IO1I11OI) listenableFuture).I00iOIl;
/* 14 */                if (i010i10l instanceof I010i10l) {
/* 17 */                    I010i10l i010i10l2 = (I010i10l) i010i10l;
/* 21 */                    if (i010i10l2.I00000oIO) {
/* 35 */                        i010i10l = i010i10l2.I00000oOI != null ? new I010i10l(false, i010i10l2.I00000oOI) : I010i10l.I0000O;
                            }
                        }
/* 37 */                Objects.requireNonNull(i010i10l);
/* 40 */                return i010i10l;
                    }
/* 43 */            if ((listenableFuture instanceof I011iiii0i) && (thI00000oOI = ((I011iiii0i) listenableFuture).I00000oOI()) != null) {
/* 56 */                I010l1ol111 i010l1ol111 = new I010l1ol111();
/* 59 */                i010l1ol111.I00000oIO = thI00000oOI;
/* 61 */                return i010l1ol111;
                    }
/* 62 */            boolean zIsCancelled = listenableFuture.isCancelled();
/* 68 */            boolean z = true;
/* 71 */            if ((!I011iiii0i.I00ilO0) && zIsCancelled) {
/* 73 */                I010i10l i010i10l3 = I010i10l.I0000O;
/* 75 */                Objects.requireNonNull(i010i10l3);
/* 78 */                return i010i10l3;
                    }
/* 79 */            boolean z2 = false;
                    while (true) {
                        try {
                            try {
/* 80 */                        obj = listenableFuture.get();
                                break;
                            } catch (InterruptedException unused) {
/* 224 */                       z2 = z;
                            } catch (Throwable th) {
/* 131 */                       if (z2) {
/* 137 */                           Thread.currentThread().interrupt();
                                }
/* 140 */                       throw th;
                            }
                        } catch (Error | Exception e) {
/* 143 */                   I010l1ol111 i010l1ol1112 = new I010l1ol111();
/* 146 */                   i010l1ol1112.I00000oIO = e;
/* 148 */                   return i010l1ol1112;
                        } catch (CancellationException e2) {
/* 149 */                   if (zIsCancelled) {
/* 180 */                       return new I010i10l(false, e2);
                            }
/* 169 */                   IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2);
/* 172 */                   I010l1ol111 i010l1ol1113 = new I010l1ol111();
/* 175 */                   i010l1ol1113.I00000oIO = illegalArgumentException;
/* 177 */                   return i010l1ol1113;
                        } catch (ExecutionException e3) {
/* 184 */                   if (zIsCancelled) {
/* 205 */                       return new I010i10l(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3));
                            }
/* 211 */                   Throwable cause = e3.getCause();
/* 215 */                   I010l1ol111 i010l1ol1114 = new I010l1ol111();
/* 218 */                   cause.getClass();
/* 221 */                   i010l1ol1114.I00000oIO = cause;
/* 223 */                   return i010l1ol1114;
                        }
                    }
/* 84 */            if (z2) {
/* 90 */                Thread.currentThread().interrupt();
                    }
/* 93 */            if (!zIsCancelled) {
                        return obj == null ? I011iiii0i.I00iio : obj;
                    }
/* 114 */           return new I010i10l(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
                }

                @Override
                public final Throwable I00000oOI() {
/* 3 */             if (!(this instanceof I0110OiO)) {
/* 16 */                return null;
                    }
/* 5 */             Object obj = this.I00iOIl;
/* 9 */             if (obj instanceof I010l1ol111) {
/* 13 */                return ((I010l1ol111) obj).I00000oIO;
                    }
/* 16 */            return null;
                }

                public final void I0000Il00O(StringBuilder sb) {
                    Object obj;
/* 3 */             boolean z = false;
                    while (true) {
                        try {
                            try {
/* 4 */                         obj = get();
                                break;
                            } catch (InterruptedException unused) {
/* 84 */                        z = true;
                            } catch (Throwable th) {
/* 34 */                        if (z) {
/* 40 */                            Thread.currentThread().interrupt();
                                }
/* 43 */                        throw th;
                            }
                        } catch (CancellationException unused2) {
/* 64 */                    sb.append("CANCELLED");
/* 83 */                    return;
                        } catch (ExecutionException e) {
/* 70 */                    sb.append("FAILURE, cause=[");
/* 77 */                    sb.append(e.getCause());
/* 80 */                    sb.append("]");
/* 83 */                    return;
                        } catch (Exception e2) {
/* 46 */                    sb.append("UNKNOWN, cause=[");
/* 53 */                    sb.append(e2.getClass());
/* 58 */                    sb.append(" thrown from get()]");
/* 83 */                    return;
                        }
                    }
/* 8 */             if (z) {
/* 14 */                Thread.currentThread().interrupt();
                    }
/* 19 */            sb.append("SUCCESS, result=[");
/* 22 */            I0000oI00(obj, sb);
/* 25 */            sb.append("]");
                }

                public final void I0000oI00(Object obj, StringBuilder sb) {
/* 1 */             if (obj == null) {
/* 5 */                 sb.append("null");
                    } else {
/* 9 */                 if (obj == this) {
/* 13 */                    sb.append("this future");
/* 16 */                    return;
                        }
/* 25 */                sb.append(obj.getClass().getName());
/* 30 */                sb.append("@");
/* 41 */                sb.append(Integer.toHexString(System.identityHashCode(obj)));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String I000iOII() {
/* 3 */             if (!(this instanceof ScheduledFuture)) {
/* 33 */                return null;
                    }
/* 28 */            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                }

                public boolean I000l1(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = I011iiii0i.I00iio;
                    }
/* 13 */            if (!I011iiii0i.I00io1l.I00000oOI(this, null, obj)) {
/* 12 */                return false;
                    }
/* 15 */            I0001Ioi1lo(this, false);
/* 18 */            return true;
                }

                public boolean I000lI(Throwable th) {
/* 3 */             th.getClass();
/* 6 */             I010l1ol111 i010l1ol111 = new I010l1ol111();
/* 9 */             i010l1ol111.I00000oIO = th;
/* 19 */            if (!I011iiii0i.I00io1l.I00000oOI(this, null, i010l1ol111)) {
/* 18 */                return false;
                    }
/* 21 */            I0001Ioi1lo(this, false);
/* 24 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean I000o00OoI0I(ListenableFuture listenableFuture) {
                    I010l1ol111 i010l1ol111;
/* 1 */             listenableFuture.getClass();
/* 4 */             Object obj = this.I00iOIl;
/* 7 */             if (obj != null) {
/* 80 */                if (obj instanceof I010i10l) {
/* 86 */                    listenableFuture.cancel(((I010i10l) obj).I00000oIO);
                        }
                    } else if (listenableFuture.isDone()) {
/* 27 */                if (I011iiii0i.I00io1l.I00000oOI(this, null, I000OOo1O(listenableFuture))) {
/* 29 */                    I0001Ioi1lo(this, false);
/* 13 */                    return true;
                        }
                    } else {
/* 35 */                I010ioo i010ioo = new I010ioo();
/* 38 */                i010ioo.I00iOIl = this;
/* 40 */                i010ioo.I00iiI = listenableFuture;
/* 42 */                VarHandle.storeStoreFence();
/* 51 */                if (I011iiii0i.I00io1l.I00000oOI(this, null, i010ioo)) {
                            try {
/* 55 */                        listenableFuture.addListener(i010ioo, Iii11Ooi.I00iOIl);
/* 13 */                        return true;
                            } catch (Throwable th) {
                                try {
/* 62 */                            i010l1ol111 = new I010l1ol111();
/* 65 */                            i010l1ol111.I00000oIO = th;
                                } catch (Error | Exception unused) {
/* 68 */                            i010l1ol111 = I010l1ol111.I00000oOI;
                                }
/* 72 */                        I011iiii0i.I00io1l.I00000oOI(this, i010ioo, i010l1ol111);
/* 13 */                        return true;
                            }
                        }
/* 76 */                obj = this.I00iOIl;
/* 80 */                if (obj instanceof I010i10l) {
                        }
                    }
/* 6 */             return false;
                }

                public final boolean I000oI1ioi() {
/* 1 */             Object obj = this.I00iOIl;
                    return (obj instanceof I010i10l) && ((I010i10l) obj).I00000oIO;
                }

                @Override
                public void addListener(Runnable runnable, Executor executor) {
                    I010o0o0oO i010o0o0oO;
/* 3 */             lII0I0I01I1l.I0001Ioi1lo("Runnable was null.", runnable);
/* 8 */             lII0I0I01I1l.I0001Ioi1lo("Executor was null.", executor);
/* 15 */            if (!isDone() && (i010o0o0oO = this.I00iiI) != I010o0o0oO.I0000O) {
/* 25 */                I010o0o0oO i010o0o0oO2 = new I010o0o0oO();
/* 28 */                i010o0o0oO2.I00000oIO = runnable;
/* 30 */                i010o0o0oO2.I00000oOI = executor;
/* 47 */                do {
/* 32 */                    i010o0o0oO2.I0000Il00O = i010o0o0oO;
/* 40 */                    if (I011iiii0i.I00io1l.I00000oIO(this, i010o0o0oO, i010o0o0oO2)) {
/* 42 */                        return;
                            } else {
/* 43 */                        i010o0o0oO = this.I00iiI;
                            }
/* 47 */                } while (i010o0o0oO != I010o0o0oO.I0000O);
                    }
/* 49 */            I000II(runnable, executor);
                }

                @Override
                public boolean cancel(boolean z) {
                    I010i10l i010i10l;
/* 1 */             Object obj = this.I00iOIl;
/* 13 */            if (!(obj == null) && !(obj instanceof I010ioo)) {
/* 4 */                 return false;
                    }
/* 17 */            if (I011iiii0i.I00ilO0) {
/* 28 */                i010i10l = new I010i10l(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 37 */                i010i10l = z ? I010i10l.I0000Il00O : I010i10l.I0000O;
/* 39 */                Objects.requireNonNull(i010i10l);
                    }
/* 42 */            boolean z2 = false;
                    while (true) {
/* 49 */                if (I011iiii0i.I00io1l.I00000oOI(this, obj, i010i10l)) {
/* 51 */                    I0001Ioi1lo(this, z);
/* 56 */                    if (!(obj instanceof I010ioo)) {
                                break;
                            }
/* 60 */                    ListenableFuture listenableFuture = ((I010ioo) obj).I00iiI;
/* 64 */                    if (!(listenableFuture instanceof I0110OiO)) {
/* 82 */                        listenableFuture.cancel(z);
                                break;
                            }
/* 66 */                    this = (I011IO1I11OI) listenableFuture;
/* 68 */                    obj = this.I00iOIl;
/* 78 */                    if (!(obj == null) && !(obj instanceof I010ioo)) {
                                break;
                            }
/* 80 */                    z2 = true;
                        } else {
/* 86 */                    obj = this.I00iOIl;
/* 90 */                    if (!(obj instanceof I010ioo)) {
/* 92 */                        return z2;
                            }
                        }
                    }
/* 3 */             return true;
                }

                @Override
                public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    boolean z;
                    long j2;
                    Object obj;
/* 7 */             I011iO i011iO = I011iO.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 359 */               I000II.I00100l0();
/* 357 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 21 */            boolean z2 = true;
/* 31 */            if ((obj2 != null) && (!(obj2 instanceof I010ioo))) {
/* 33 */                return I000O01llI0(obj2);
                    }
/* 38 */            long j3 = 0;
/* 50 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 55 */            if (nanos >= 1000) {
/* 57 */                I011iO i011iO2 = this.I00iiO;
/* 59 */                if (i011iO2 != i011iO) {
/* 61 */                    obj = null;
/* 65 */                    I011iO i011iO3 = new I011iO();
                            while (true) {
/* 68 */                        iOI011o ioi011o = I011iiii0i.I00io1l;
/* 70 */                        ioi011o.I0001Ioi1lo(i011iO3, i011iO2);
/* 77 */                        if (ioi011o.I0000Il00O(this, i011iO2, i011iO3)) {
/* 79 */                            z = z2;
/* 80 */                            j2 = j3;
/* 126 */                           do {
/* 91 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 98 */                                if (Thread.interrupted()) {
/* 132 */                                   I00000oIO(i011iO3);
/* 135 */                                   I000II.I00100l0();
/* 61 */                                    return null;
                                        }
/* 100 */                               Object obj3 = this.I00iOIl;
/* 111 */                               if ((obj3 != null ? z : false) && ((obj3 instanceof I010ioo) ^ z)) {
/* 113 */                                   return I000O01llI0(obj3);
                                        }
/* 122 */                               nanos = jNanoTime - System.nanoTime();
/* 126 */                           } while (nanos >= 1000);
/* 128 */                           I00000oIO(i011iO3);
                                } else {
/* 139 */                           boolean z3 = z2;
/* 140 */                           long j4 = j3;
/* 142 */                           I011iO i011iO4 = this.I00iiO;
/* 144 */                           if (i011iO4 == i011iO) {
                                        break;
                                    }
/* 147 */                           z2 = z3;
/* 148 */                           i011iO2 = i011iO4;
/* 149 */                           j3 = j4;
                                }
                            }
                        }
/* 152 */               Object obj4 = this.I00iOIl;
/* 154 */               Objects.requireNonNull(obj4);
/* 157 */               return I000O01llI0(obj4);
                    }
/* 162 */           z = true;
/* 163 */           j2 = 0;
/* 165 */           obj = null;
/* 169 */           while (nanos > j2) {
/* 171 */               Object obj5 = this.I00iOIl;
/* 182 */               if ((obj5 != null ? z : false) && ((obj5 instanceof I010ioo) ^ z)) {
/* 184 */                   return I000O01llI0(obj5);
                        }
/* 193 */               if (Thread.interrupted()) {
/* 202 */                   I000II.I00100l0();
/* 205 */                   return obj;
                        }
/* 199 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 206 */           String string = toString();
/* 210 */           String string2 = timeUnit.toString();
/* 214 */           Locale locale = Locale.ROOT;
/* 216 */           String lowerCase = string2.toLowerCase(locale);
/* 224 */           StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "Waited ", " ");
/* 236 */           sbI001iOo1i0O.append(timeUnit.toString().toLowerCase(locale));
/* 239 */           String string3 = sbI001iOo1i0O.toString();
/* 247 */           if (nanos + 1000 < j2) {
/* 251 */               String strConcat = string3.concat(" (plus ");
/* 255 */               long j5 = -nanos;
/* 258 */               long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
/* 266 */               long nanos2 = j5 - timeUnit.toNanos(jConvert);
/* 279 */               boolean z4 = (jConvert == j2 || nanos2 > 1000) ? z : false;
/* 281 */               if (jConvert > j2) {
/* 297 */                   String strConcat2 = strConcat + jConvert + " " + lowerCase;
/* 301 */                   if (z4) {
/* 305 */                       strConcat2 = strConcat2.concat(",");
                            }
/* 309 */                   strConcat = strConcat2.concat(" ");
                        }
/* 313 */               if (z4) {
/* 317 */                   strConcat = IlIi0I0.I000l1(nanos2, strConcat, " nanoseconds ");
                        }
/* 323 */               string3 = strConcat.concat("delay)");
                    }
/* 331 */           if (isDone()) {
/* 344 */               throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
                    }
/* 356 */           throw new TimeoutException(IlIi0I0.I000lI(string3, " for ", string));
                }

                @Override
                public boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof I010i10l;
                }

                @Override
                public boolean isDone() {
/* 12 */            return (!(r2 instanceof I010ioo)) & (this.I00iOIl != null);
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public String toString() {
                    String strI000iOII;
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
/* 87 */                I0000Il00O(sb);
                    } else {
/* 92 */                int length = sb.length();
/* 98 */                sb.append("PENDING");
/* 101 */               Object obj = this.I00iOIl;
/* 107 */               if (obj instanceof I010ioo) {
/* 111 */                   sb.append(", setFuture=[");
/* 116 */                   ListenableFuture listenableFuture = ((I010ioo) obj).I00iiI;
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
/* 158 */                       strI000iOII = I000iOII();
                            } catch (Throwable th2) {
/* 182 */                       if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
/* 191 */                           throw th2;
                                }
/* 204 */                       strI000iOII = "Exception thrown from implementation: " + th2.getClass();
                            }
/* 162 */                   if (strI000iOII != null) {
/* 175 */                       boolean z = strI000iOII.isEmpty();
/* 176 */                       if (z) {
/* 178 */                           strI000iOII = null;
                                }
/* 208 */                       if (strI000iOII != null) {
/* 212 */                           sb.append(", info=[");
/* 215 */                           sb.append(strI000iOII);
/* 218 */                           sb.append("]");
                                }
                            }
                        }
/* 225 */               if (isDone()) {
/* 231 */                   sb.delete(length, sb.length());
/* 234 */                   I0000Il00O(sb);
                        }
                    }
/* 237 */           sb.append("]");
/* 240 */           return sb.toString();
                }

/* 28 */        public void I0000O() {
                }

/* 28 */        public void I000OiO() {
                }

                @Override
/* 362 */       public Object get() throws InterruptedException {
                    Object obj;
/* 363 */           I011iO i011iO = I011iO.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 364 */               Object obj2 = this.I00iOIl;
/* 365 */               if ((obj2 != null) & (!(obj2 instanceof I010ioo))) {
/* 366 */                   return I000O01llI0(obj2);
                        }
/* 367 */               I011iO i011iO2 = this.I00iiO;
                        if (i011iO2 != i011iO) {
/* 368 */                   I011iO i011iO3 = new I011iO();
                            do {
/* 369 */                       iOI011o ioi011o = I011iiii0i.I00io1l;
                                ioi011o.I0001Ioi1lo(i011iO3, i011iO2);
/* 370 */                       if (ioi011o.I0000Il00O(this, i011iO2, i011iO3)) {
/* 374 */                           do {
/* 371 */                               LockSupport.park(this);
/* 372 */                               if (!Thread.interrupted()) {
/* 373 */                                   obj = this.I00iOIl;
                                        } else {
/* 376 */                                   I00000oIO(i011iO3);
/* 377 */                                   I000II.I00100l0();
                                            return null;
                                        }
/* 374 */                           } while (!((obj != null) & (!(obj instanceof I010ioo))));
/* 375 */                           return I000O01llI0(obj);
                                }
/* 378 */                       i011iO2 = this.I00iiO;
                            } while (i011iO2 != i011iO);
                        }
/* 379 */               Object obj3 = this.I00iOIl;
                        Objects.requireNonNull(obj3);
                        return I000O01llI0(obj3);
                    }
/* 380 */           I000II.I00100l0();
                    return null;
                }
            }

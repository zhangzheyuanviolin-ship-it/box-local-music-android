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
            import java.util.logging.Logger;
            
/* 18 */    public abstract class li10iIlI1O extends li11oiolO {
                public static Object I0000Il00O(ListenableFuture listenableFuture) {
                    Object obj;
                    Throwable thI00000oOI;
/* 6 */             if (listenableFuture instanceof li10Ili) {
/* 10 */                Object li0olooio = ((li10iIlI1O) listenableFuture).I00iOIl;
/* 14 */                if (li0olooio instanceof li0olooIo) {
/* 17 */                    li0olooIo li0olooio2 = (li0olooIo) li0olooio;
/* 21 */                    if (li0olooio2.I00000oIO) {
/* 23 */                        Throwable th = li0olooio2.I00000oOI;
/* 34 */                        li0olooio = th != null ? new li0olooIo(false, th) : li0olooIo.I0000O;
                            }
                        }
/* 36 */                Objects.requireNonNull(li0olooio);
/* 39 */                return li0olooio;
                    }
/* 42 */            if ((listenableFuture instanceof li11oiolO) && (thI00000oOI = ((li11oiolO) listenableFuture).I00000oOI()) != null) {
/* 56 */                li101looI0I li101looi0i = new li101looI0I();
/* 59 */                li101looi0i.I00000oIO = thI00000oOI;
/* 61 */                return li101looi0i;
                    }
/* 62 */            boolean zIsCancelled = listenableFuture.isCancelled();
/* 68 */            boolean z = true;
/* 71 */            if ((!li11oiolO.I00ilO0) && zIsCancelled) {
/* 73 */                li0olooIo li0olooio3 = li0olooIo.I0000O;
/* 75 */                Objects.requireNonNull(li0olooio3);
/* 78 */                return li0olooio3;
                    }
/* 79 */            boolean z2 = false;
                    while (true) {
                        try {
                            try {
/* 80 */                        obj = listenableFuture.get();
                                break;
                            } catch (InterruptedException unused) {
/* 225 */                       z2 = z;
                            } catch (Throwable th2) {
/* 144 */                       if (z2) {
/* 151 */                           Thread.currentThread().interrupt();
                                }
/* 154 */                       throw th2;
                            }
                        } catch (Error | Exception e) {
/* 157 */                   li101looI0I li101looi0i2 = new li101looI0I();
/* 160 */                   li101looi0i2.I00000oIO = e;
/* 162 */                   return li101looi0i2;
                        } catch (CancellationException e2) {
/* 163 */                   if (zIsCancelled) {
/* 190 */                       return new li0olooIo(false, e2);
                            }
/* 179 */                   IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2);
/* 182 */                   li101looI0I li101looi0i3 = new li101looI0I();
/* 185 */                   li101looi0i3.I00000oIO = illegalArgumentException;
/* 187 */                   return li101looi0i3;
                        } catch (ExecutionException e3) {
                            return zIsCancelled ? new li0olooIo(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3)) : new li101looI0I(e3.getCause());
                        }
                    }
/* 84 */            if (z2) {
/* 90 */                Thread.currentThread().interrupt();
                    }
/* 93 */            if (!zIsCancelled) {
                        return obj == null ? li11oiolO.I00iio : obj;
                    }
/* 99 */            String strValueOf = String.valueOf(listenableFuture);
/* 111 */           StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
/* 114 */           sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
/* 117 */           sb.append(strValueOf);
/* 127 */           return new li0olooIo(false, new IllegalArgumentException(sb.toString()));
                }

                public static Object I0001Ioi1lo(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof li0olooIo) {
/* 31 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(((li0olooIo) obj).I00000oOI);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof li101looI0I) {
/* 24 */                throw new ExecutionException(((li101looI0I) obj).I00000oIO);
                    }
/* 11 */            if (obj == li11oiolO.I00iio) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static boolean I000II(Object obj) {
                    return !(obj instanceof li101OI0O);
                }

                public static void I000iOII(li10iIlI1O li10iili1o) {
                    li10IIOIIO li10iioiio;
/* 2 */             li10IIOIIO li10iioiio2 = null;
                    while (true) {
/* 9 */                 for (li111il1iiIi li111il1iiiiI0000oI00 = li11oiolO.I00io1l.I0000oI00(li10iili1o); li111il1iiiiI0000oI00 != null; li111il1iiiiI0000oI00 = li111il1iiiiI0000oI00.I00000oOI) {
/* 11 */                    Thread thread = li111il1iiiiI0000oI00.I00000oIO;
/* 13 */                    if (thread != null) {
/* 15 */                        li111il1iiiiI0000oI00.I00000oIO = null;
/* 17 */                        LockSupport.unpark(thread);
                            }
                        }
/* 23 */                li10iili1o.I0000O();
/* 26 */                li10IIOIIO li10iioiio3 = li10IIOIIO.I0000O;
/* 34 */                li10IIOIIO li10iioiio4 = li10iioiio2;
/* 30 */                li10IIOIIO li10iioiioI0001Ioi1lo = li11oiolO.I00io1l.I0001Ioi1lo(li10iili1o);
/* 36 */                li10IIOIIO li10iioiio5 = li10iioiio4;
/* 37 */                while (li10iioiioI0001Ioi1lo != null) {
/* 39 */                    li10IIOIIO li10iioiio6 = li10iioiioI0001Ioi1lo.I0000Il00O;
/* 41 */                    li10iioiioI0001Ioi1lo.I0000Il00O = li10iioiio5;
/* 43 */                    li10iioiio5 = li10iioiioI0001Ioi1lo;
/* 44 */                    li10iioiioI0001Ioi1lo = li10iioiio6;
                        }
/* 46 */                while (li10iioiio5 != null) {
/* 48 */                    Runnable runnable = li10iioiio5.I00000oIO;
/* 50 */                    li10iioiio = li10iioiio5.I0000Il00O;
/* 52 */                    Objects.requireNonNull(runnable);
/* 57 */                    if (runnable instanceof li101OI0O) {
/* 59 */                        li101OI0O li101oi0o = (li101OI0O) runnable;
/* 61 */                        li10iili1o = li101oi0o.I00iOIl;
/* 65 */                        if (li10iili1o.I00iOIl == li101oi0o) {
/* 79 */                            if (li11oiolO.I00io1l.I000II(li10iili1o, li101oi0o, I0000Il00O(li101oi0o.I00iiI))) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
/* 83 */                        Executor executor = li10iioiio5.I00000oOI;
/* 85 */                        Objects.requireNonNull(executor);
/* 88 */                        I000lI(runnable, executor);
                            }
/* 91 */                    li10iioiio5 = li10iioiio;
                        }
/* 168 */               return;
/* 81 */                li10iioiio2 = li10iioiio;
                    }
                }

                public static void I000lI(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 9 */                 Logger loggerI00000oOI = li11oiolO.I00ilI0I1.I00000oOI();
/* 13 */                Level level = Level.SEVERE;
/* 15 */                String strValueOf = String.valueOf(runnable);
/* 19 */                String strValueOf2 = String.valueOf(executor);
/* 51 */                loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", IIl001iO0Io.I00100o1O0lo(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
                    }
                }

                @Override
                public final Throwable I00000oOI() {
/* 3 */             if (!(this instanceof li10Ili)) {
/* 16 */                return null;
                    }
/* 5 */             Object obj = this.I00iOIl;
/* 9 */             if (obj instanceof li101looI0I) {
/* 13 */                return ((li101looI0I) obj).I00000oIO;
                    }
/* 16 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String I0000oI00() {
/* 3 */             if (!(this instanceof ScheduledFuture)) {
/* 46 */                return null;
                    }
/* 9 */             long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
/* 25 */            StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
/* 30 */            sb.append("remaining delay=[");
/* 33 */            sb.append(delay);
/* 38 */            sb.append(" ms]");
/* 41 */            return sb.toString();
                }

                public boolean I000O01llI0(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = li11oiolO.I00iio;
                    }
/* 12 */            if (!li11oiolO.I00io1l.I000II(this, null, obj)) {
/* 19 */                return false;
                    }
/* 14 */            I000iOII(this);
/* 17 */            return true;
                }

                public boolean I000OOo1O(Throwable th) {
/* 13 */            if (!li11oiolO.I00io1l.I000II(this, null, new li101looI0I(th))) {
/* 20 */                return false;
                    }
/* 15 */            I000iOII(this);
/* 18 */            return true;
                }

                public final void I000OiO(ListenableFuture listenableFuture) {
                    li101looI0I li101looi0i;
/* 1 */             listenableFuture.getClass();
/* 4 */             Object obj = this.I00iOIl;
/* 6 */             if (obj == null) {
/* 13 */                if (listenableFuture.isDone()) {
/* 25 */                    if (li11oiolO.I00io1l.I000II(this, null, I0000Il00O(listenableFuture))) {
/* 27 */                        I000iOII(this);
/* 30 */                        return;
                            }
/* 168 */                   return;
                        }
/* 33 */                li101OI0O li101oi0o = new li101OI0O();
/* 36 */                li101oi0o.I00iOIl = this;
/* 38 */                li101oi0o.I00iiI = listenableFuture;
/* 40 */                VarHandle.storeStoreFence();
/* 49 */                if (li11oiolO.I00io1l.I000II(this, null, li101oi0o)) {
                            try {
/* 53 */                        listenableFuture.addListener(li101oi0o, liI1iIi1IllO.I00iOIl);
/* 56 */                        return;
                            } catch (Throwable th) {
                                try {
/* 60 */                            li101looi0i = new li101looI0I();
/* 63 */                            li101looi0i.I00000oIO = th;
                                } catch (Error | Exception unused) {
/* 66 */                            li101looi0i = li101looI0I.I00000oOI;
                                }
/* 70 */                        li11oiolO.I00io1l.I000II(this, li101oi0o, li101looi0i);
/* 73 */                        return;
                            }
                        }
/* 74 */                obj = this.I00iOIl;
                    }
/* 78 */            if (obj instanceof li0olooIo) {
/* 84 */                listenableFuture.cancel(((li0olooIo) obj).I00000oIO);
                    }
                }

                public final void I000l1(StringBuilder sb) {
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
                    li10IIOIIO li10iioiio;
/* 3 */             ll0OlOllOl.I00000oOI("Runnable was null.", runnable);
/* 8 */             ll0OlOllOl.I00000oOI("Executor was null.", executor);
/* 15 */            if (!isDone() && (li10iioiio = this.I00iiI) != li10IIOIIO.I0000O) {
/* 25 */                li10IIOIIO li10iioiio2 = new li10IIOIIO();
/* 28 */                li10iioiio2.I00000oIO = runnable;
/* 30 */                li10iioiio2.I00000oOI = executor;
/* 46 */                do {
/* 32 */                    li10iioiio2.I0000Il00O = li10iioiio;
/* 40 */                    if (li11oiolO.I00io1l.I0000O(this, li10iioiio, li10iioiio2)) {
/* 49 */                        return;
                            } else {
/* 42 */                        li10iioiio = this.I00iiI;
                            }
/* 46 */                } while (li10iioiio != li10IIOIIO.I0000O);
                    }
/* 50 */            I000lI(runnable, executor);
                }

                @Override
                public boolean cancel(boolean z) {
                    li0olooIo li0olooio;
/* 1 */             Object obj = this.I00iOIl;
/* 13 */            if (!(obj instanceof li101OI0O) && !(obj == null)) {
/* 5 */                 return false;
                    }
/* 17 */            if (li11oiolO.I00ilO0) {
/* 28 */                li0olooio = new li0olooIo(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 37 */                li0olooio = z ? li0olooIo.I0000Il00O : li0olooIo.I0000O;
/* 39 */                Objects.requireNonNull(li0olooio);
                    }
/* 42 */            boolean z2 = false;
                    while (true) {
/* 49 */                if (li11oiolO.I00io1l.I000II(this, obj, li0olooio)) {
/* 51 */                    I000iOII(this);
/* 56 */                    if (!(obj instanceof li101OI0O)) {
                                break;
                            }
/* 60 */                    ListenableFuture listenableFuture = ((li101OI0O) obj).I00iiI;
/* 64 */                    if (!(listenableFuture instanceof li10Ili)) {
/* 82 */                        listenableFuture.cancel(z);
                                break;
                            }
/* 66 */                    this = (li10iIlI1O) listenableFuture;
/* 68 */                    obj = this.I00iOIl;
/* 78 */                    if (!(obj == null) && !(obj instanceof li101OI0O)) {
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
                    int i;
                    Object obj;
/* 7 */             li111il1iiIi li111il1iiii = li111il1iiIi.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 463 */               I000II.I00100l0();
/* 461 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 31 */            if ((obj2 != null) && I000II(obj2)) {
/* 33 */                return I0001Ioi1lo(obj2);
                    }
/* 38 */            long j3 = 0;
/* 50 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 55 */            if (nanos >= 1000) {
/* 57 */                li111il1iiIi li111il1iiii2 = this.I00iiO;
/* 59 */                if (li111il1iiii2 != li111il1iiii) {
/* 61 */                    obj = null;
/* 65 */                    li111il1iiIi li111il1iiii3 = new li111il1iiIi();
                            while (true) {
/* 68 */                        ll0lOI ll0loi = li11oiolO.I00io1l;
/* 70 */                        ll0loi.I00000oOI(li111il1iiii3, li111il1iiii2);
/* 77 */                        if (ll0loi.I0000Il00O(this, li111il1iiii2, li111il1iiii3)) {
/* 79 */                            j2 = j3;
/* 81 */                            i = 1;
/* 127 */                           do {
/* 91 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 98 */                                if (Thread.interrupted()) {
/* 133 */                                   I00000oIO(li111il1iiii3);
/* 136 */                                   I000II.I00100l0();
/* 61 */                                    return null;
                                        }
/* 100 */                               Object obj3 = this.I00iOIl;
/* 112 */                               if ((obj3 != null) && I000II(obj3)) {
/* 114 */                                   return I0001Ioi1lo(obj3);
                                        }
/* 123 */                               nanos = jNanoTime - System.nanoTime();
/* 127 */                           } while (nanos >= 1000);
/* 129 */                           I00000oIO(li111il1iiii3);
                                } else {
/* 140 */                           long j4 = j3;
/* 143 */                           li111il1iiIi li111il1iiii4 = this.I00iiO;
/* 145 */                           if (li111il1iiii4 == li111il1iiii) {
                                        break;
                                    }
/* 148 */                           li111il1iiii2 = li111il1iiii4;
/* 149 */                           j3 = j4;
                                }
                            }
                        }
/* 152 */               Object obj4 = this.I00iOIl;
/* 154 */               Objects.requireNonNull(obj4);
/* 157 */               return I0001Ioi1lo(obj4);
                    }
/* 162 */           j2 = 0;
/* 164 */           i = 1;
/* 165 */           obj = null;
/* 169 */           while (nanos > j2) {
/* 171 */               Object obj5 = this.I00iOIl;
/* 183 */               if (((obj5 != null ? i : 0) & (I000II(obj5) ? 1 : 0)) != 0) {
/* 185 */                   return I0001Ioi1lo(obj5);
                        }
/* 194 */               if (Thread.interrupted()) {
/* 203 */                   I000II.I00100l0();
/* 206 */                   return obj;
                        }
/* 200 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 207 */           String string = toString();
/* 211 */           String string2 = timeUnit.toString();
/* 215 */           Locale locale = Locale.ROOT;
/* 217 */           String lowerCase = string2.toLowerCase(locale);
/* 225 */           String lowerCase2 = timeUnit.toString().toLowerCase(locale);
/* 250 */           StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
/* 255 */           sb.append("Waited ");
/* 258 */           sb.append(j);
/* 263 */           sb.append(" ");
/* 266 */           sb.append(lowerCase2);
/* 269 */           String string3 = sb.toString();
/* 277 */           if (nanos + 1000 < j2) {
/* 281 */               String strConcat = string3.concat(" (plus ");
/* 285 */               long j5 = -nanos;
/* 288 */               long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
/* 296 */               long nanos2 = j5 - timeUnit.toNanos(jConvert);
/* 308 */               int i2 = (jConvert == j2 || nanos2 > 1000) ? i : 0;
/* 310 */               if (jConvert > j2) {
/* 337 */                   StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + i + String.valueOf(lowerCase).length());
/* 340 */                   sb2.append(strConcat);
/* 343 */                   sb2.append(jConvert);
/* 346 */                   sb2.append(" ");
/* 349 */                   sb2.append(lowerCase);
/* 352 */                   String string4 = sb2.toString();
/* 356 */                   if (i2 != 0) {
/* 360 */                       string4 = string4.concat(",");
                            }
/* 364 */                   strConcat = string4.concat(" ");
                        }
/* 368 */               if (i2 != 0) {
/* 387 */                   StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
/* 390 */                   sb3.append(strConcat);
/* 393 */                   sb3.append(nanos2);
/* 398 */                   sb3.append(" nanoseconds ");
/* 401 */                   strConcat = sb3.toString();
                        }
/* 407 */               string3 = strConcat.concat("delay)");
                    }
/* 415 */           if (isDone()) {
/* 428 */               throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
                    }
/* 460 */           throw new TimeoutException(IIlIOloOOO.I0010I0i(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
                }

                @Override
                public boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof li0olooIo;
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
/* 87 */                I000l1(sb);
                    } else {
/* 92 */                int length = sb.length();
/* 98 */                sb.append("PENDING");
/* 101 */               Object obj = this.I00iOIl;
/* 107 */               if (obj instanceof li101OI0O) {
/* 111 */                   sb.append(", setFuture=[");
/* 116 */                   ListenableFuture listenableFuture = ((li101OI0O) obj).I00iiI;
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
/* 158 */                       strConcat = I0000oI00();
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
/* 230 */                   I000l1(sb);
                        }
                    }
/* 233 */           sb.append("]");
/* 236 */           return sb.toString();
                }

/* 19 */        public void I0000O() {
                }

                @Override
/* 466 */       public Object get() throws InterruptedException {
                    Object obj;
/* 467 */           li111il1iiIi li111il1iiii = li111il1iiIi.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 468 */               Object obj2 = this.I00iOIl;
/* 469 */               if ((obj2 != null) & I000II(obj2)) {
/* 470 */                   return I0001Ioi1lo(obj2);
                        }
                        li111il1iiIi li111il1iiii2 = this.I00iiO;
                        if (li111il1iiii2 != li111il1iiii) {
/* 471 */                   li111il1iiIi li111il1iiii3 = new li111il1iiIi();
                            do {
                                ll0lOI ll0loi = li11oiolO.I00io1l;
/* 472 */                       ll0loi.I00000oOI(li111il1iiii3, li111il1iiii2);
/* 473 */                       if (ll0loi.I0000Il00O(this, li111il1iiii2, li111il1iiii3)) {
                                    do {
/* 474 */                               LockSupport.park(this);
/* 475 */                               if (!Thread.interrupted()) {
/* 476 */                                   obj = this.I00iOIl;
                                        } else {
/* 478 */                                   I00000oIO(li111il1iiii3);
/* 479 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (!((obj != null) & I000II(obj)));
/* 477 */                           return I0001Ioi1lo(obj);
                                }
/* 480 */                       li111il1iiii2 = this.I00iiO;
                            } while (li111il1iiii2 != li111il1iiii);
                        }
                        Object obj3 = this.I00iOIl;
/* 481 */               Objects.requireNonNull(obj3);
                        return I0001Ioi1lo(obj3);
                    }
/* 482 */           I000II.I00100l0();
                    return null;
                }
            }

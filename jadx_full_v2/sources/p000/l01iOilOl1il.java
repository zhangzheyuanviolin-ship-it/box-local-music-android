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
            
/* 18 */    public abstract class l01iOilOl1il extends l01loiOOo11l {
                public static Object I0000Il00O(ListenableFuture listenableFuture) {
                    Object obj;
                    Throwable thI00000oOI;
/* 6 */             if (listenableFuture instanceof l01OoI) {
/* 10 */                Object l01ooll0ii1 = ((l01iOilOl1il) listenableFuture).I00iOIl;
/* 14 */                if (l01ooll0ii1 instanceof l01OOll0II1) {
/* 17 */                    l01OOll0II1 l01ooll0ii12 = (l01OOll0II1) l01ooll0ii1;
/* 21 */                    if (l01ooll0ii12.I00000oIO) {
/* 23 */                        Throwable th = l01ooll0ii12.I00000oOI;
/* 34 */                        l01ooll0ii1 = th != null ? new l01OOll0II1(false, th) : l01OOll0II1.I0000O;
                            }
                        }
/* 36 */                Objects.requireNonNull(l01ooll0ii1);
/* 39 */                return l01ooll0ii1;
                    }
/* 42 */            if ((listenableFuture instanceof l01loiOOo11l) && (thI00000oOI = ((l01loiOOo11l) listenableFuture).I00000oOI()) != null) {
/* 56 */                l01Ol0 l01ol0 = new l01Ol0();
/* 59 */                l01ol0.I00000oIO = thI00000oOI;
/* 61 */                return l01ol0;
                    }
/* 62 */            boolean zIsCancelled = listenableFuture.isCancelled();
/* 68 */            boolean z = true;
/* 71 */            if ((!l01loiOOo11l.I00ilO0) && zIsCancelled) {
/* 73 */                l01OOll0II1 l01ooll0ii13 = l01OOll0II1.I0000O;
/* 75 */                Objects.requireNonNull(l01ooll0ii13);
/* 78 */                return l01ooll0ii13;
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
/* 140 */                   l01Ol0 l01ol02 = new l01Ol0();
/* 143 */                   l01ol02.I00000oIO = e;
/* 145 */                   return l01ol02;
                        } catch (CancellationException e2) {
/* 146 */                   if (zIsCancelled) {
/* 173 */                       return new l01OOll0II1(false, e2);
                            }
/* 162 */                   IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2);
/* 165 */                   l01Ol0 l01ol03 = new l01Ol0();
/* 168 */                   l01ol03.I00000oIO = illegalArgumentException;
/* 170 */                   return l01ol03;
                        } catch (ExecutionException e3) {
/* 177 */                   if (zIsCancelled) {
/* 194 */                       return new l01OOll0II1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3));
                            }
/* 200 */                   Throwable cause = e3.getCause();
/* 204 */                   l01Ol0 l01ol04 = new l01Ol0();
/* 207 */                   cause.getClass();
/* 210 */                   l01ol04.I00000oIO = cause;
/* 212 */                   return l01ol04;
                        }
                    }
/* 84 */            if (z2) {
/* 90 */                Thread.currentThread().interrupt();
                    }
                    return zIsCancelled ? new l01OOll0II1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)))) : obj == null ? l01loiOOo11l.I00iio : obj;
                }

                public static Object I0001Ioi1lo(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof l01OOll0II1) {
/* 27 */                Throwable th = ((l01OOll0II1) obj).I00000oOI;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof l01Ol0) {
/* 24 */                throw new ExecutionException(((l01Ol0) obj).I00000oIO);
                    }
/* 11 */            if (obj == l01loiOOo11l.I00iio) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static boolean I000II(Object obj) {
                    return !(obj instanceof l01Oi0OiI);
                }

                public static void I000l1(l01iOilOl1il l01ioilol1il) {
                    l01Olo10 l01olo10;
/* 2 */             l01Olo10 l01olo102 = null;
                    while (true) {
/* 9 */                 for (l01l0oIOl1 l01l0oiol1I00000oOI = l01loiOOo11l.I00io1l.I00000oOI(l01ioilol1il); l01l0oiol1I00000oOI != null; l01l0oiol1I00000oOI = l01l0oiol1I00000oOI.I00000oOI) {
/* 11 */                    Thread thread = l01l0oiol1I00000oOI.I00000oIO;
/* 13 */                    if (thread != null) {
/* 15 */                        l01l0oiol1I00000oOI.I00000oIO = null;
/* 17 */                        LockSupport.unpark(thread);
                            }
                        }
/* 23 */                l01ioilol1il.I0000oI00();
/* 26 */                l01Olo10 l01olo103 = l01Olo10.I0000O;
/* 34 */                l01Olo10 l01olo104 = l01olo102;
/* 30 */                l01Olo10 l01olo10I00000oIO = l01loiOOo11l.I00io1l.I00000oIO(l01ioilol1il);
/* 36 */                l01Olo10 l01olo105 = l01olo104;
/* 37 */                while (l01olo10I00000oIO != null) {
/* 39 */                    l01Olo10 l01olo106 = l01olo10I00000oIO.I0000Il00O;
/* 41 */                    l01olo10I00000oIO.I0000Il00O = l01olo105;
/* 43 */                    l01olo105 = l01olo10I00000oIO;
/* 44 */                    l01olo10I00000oIO = l01olo106;
                        }
/* 46 */                while (l01olo105 != null) {
/* 48 */                    Runnable runnable = l01olo105.I00000oIO;
/* 50 */                    l01olo10 = l01olo105.I0000Il00O;
/* 52 */                    Objects.requireNonNull(runnable);
/* 57 */                    if (runnable instanceof l01Oi0OiI) {
/* 59 */                        l01Oi0OiI l01oi0oii = (l01Oi0OiI) runnable;
/* 61 */                        l01ioilol1il = l01oi0oii.I00iOIl;
/* 65 */                        if (l01ioilol1il.I00iOIl == l01oi0oii) {
/* 79 */                            if (l01loiOOo11l.I00io1l.I0001Ioi1lo(l01ioilol1il, l01oi0oii, I0000Il00O(l01oi0oii.I00iiI))) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
/* 83 */                        Executor executor = l01olo105.I00000oOI;
/* 85 */                        Objects.requireNonNull(executor);
/* 88 */                        I000lI(runnable, executor);
                            }
/* 91 */                    l01olo105 = l01olo10;
                        }
/* 168 */               return;
/* 81 */                l01olo102 = l01olo10;
                    }
                }

                public static void I000lI(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 35 */                l01loiOOo11l.I00ilI0I1.I00000oOI().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", IIl001iO0Io.I000oI1ioi("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                @Override
                public final Throwable I00000oOI() {
/* 3 */             if (!(this instanceof l01OoI)) {
/* 16 */                return null;
                    }
/* 5 */             Object obj = this.I00iOIl;
/* 9 */             if (obj instanceof l01Ol0) {
/* 13 */                return ((l01Ol0) obj).I00000oIO;
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
/* 3 */                 obj = l01loiOOo11l.I00iio;
                    }
/* 12 */            if (!l01loiOOo11l.I00io1l.I0001Ioi1lo(this, null, obj)) {
/* 19 */                return false;
                    }
/* 14 */            I000l1(this);
/* 17 */            return true;
                }

                public boolean I000OOo1O(Throwable th) {
/* 3 */             th.getClass();
/* 6 */             l01Ol0 l01ol0 = new l01Ol0();
/* 9 */             l01ol0.I00000oIO = th;
/* 18 */            if (!l01loiOOo11l.I00io1l.I0001Ioi1lo(this, null, l01ol0)) {
/* 25 */                return false;
                    }
/* 20 */            I000l1(this);
/* 23 */            return true;
                }

                public final void I000OiO(ListenableFuture listenableFuture) {
                    l01Ol0 l01ol0;
/* 1 */             listenableFuture.getClass();
/* 4 */             Object obj = this.I00iOIl;
/* 6 */             if (obj == null) {
/* 13 */                if (listenableFuture.isDone()) {
/* 25 */                    if (l01loiOOo11l.I00io1l.I0001Ioi1lo(this, null, I0000Il00O(listenableFuture))) {
/* 27 */                        I000l1(this);
/* 30 */                        return;
                            }
/* 168 */                   return;
                        }
/* 33 */                l01Oi0OiI l01oi0oii = new l01Oi0OiI();
/* 36 */                l01oi0oii.I00iOIl = this;
/* 38 */                l01oi0oii.I00iiI = listenableFuture;
/* 40 */                VarHandle.storeStoreFence();
/* 49 */                if (l01loiOOo11l.I00io1l.I0001Ioi1lo(this, null, l01oi0oii)) {
                            try {
/* 53 */                        listenableFuture.addListener(l01oi0oii, l0OO1i.I00iOIl);
/* 56 */                        return;
                            } catch (Throwable th) {
                                try {
/* 60 */                            l01ol0 = new l01Ol0();
/* 63 */                            l01ol0.I00000oIO = th;
                                } catch (Error | Exception unused) {
/* 66 */                            l01ol0 = l01Ol0.I00000oOI;
                                }
/* 70 */                        l01loiOOo11l.I00io1l.I0001Ioi1lo(this, l01oi0oii, l01ol0);
/* 73 */                        return;
                            }
                        }
/* 74 */                obj = this.I00iOIl;
                    }
/* 78 */            if (obj instanceof l01OOll0II1) {
/* 84 */                listenableFuture.cancel(((l01OOll0II1) obj).I00000oIO);
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
                    l01Olo10 l01olo10;
/* 1 */             if (runnable == null) {
/* 56 */                IOOlIIilOl0.I000II("Runnable was null.");
/* 106 */               return;
                    }
/* 3 */             if (executor == null) {
/* 50 */                IOOlIIilOl0.I000II("Executor was null.");
/* 53 */                return;
                    }
/* 9 */             if (!isDone() && (l01olo10 = this.I00iiI) != l01Olo10.I0000O) {
/* 19 */                l01Olo10 l01olo102 = new l01Olo10();
/* 22 */                l01olo102.I00000oIO = runnable;
/* 24 */                l01olo102.I00000oOI = executor;
/* 40 */                do {
/* 26 */                    l01olo102.I0000Il00O = l01olo10;
/* 34 */                    if (l01loiOOo11l.I00io1l.I0000oI00(this, l01olo10, l01olo102)) {
/* 43 */                        return;
                            } else {
/* 36 */                        l01olo10 = this.I00iiI;
                            }
/* 40 */                } while (l01olo10 != l01Olo10.I0000O);
                    }
/* 44 */            I000lI(runnable, executor);
                }

                @Override
                public boolean cancel(boolean z) {
                    l01OOll0II1 l01ooll0ii1;
/* 1 */             Object obj = this.I00iOIl;
/* 13 */            if (!(obj instanceof l01Oi0OiI) && !(obj == null)) {
/* 5 */                 return false;
                    }
/* 17 */            if (l01loiOOo11l.I00ilO0) {
/* 28 */                l01ooll0ii1 = new l01OOll0II1(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 37 */                l01ooll0ii1 = z ? l01OOll0II1.I0000Il00O : l01OOll0II1.I0000O;
/* 39 */                Objects.requireNonNull(l01ooll0ii1);
                    }
/* 42 */            boolean z2 = false;
                    while (true) {
/* 49 */                if (l01loiOOo11l.I00io1l.I0001Ioi1lo(this, obj, l01ooll0ii1)) {
/* 51 */                    I000l1(this);
/* 56 */                    if (!(obj instanceof l01Oi0OiI)) {
                                break;
                            }
/* 60 */                    ListenableFuture listenableFuture = ((l01Oi0OiI) obj).I00iiI;
/* 64 */                    if (!(listenableFuture instanceof l01OoI)) {
/* 82 */                        listenableFuture.cancel(z);
                                break;
                            }
/* 66 */                    this = (l01iOilOl1il) listenableFuture;
/* 68 */                    obj = this.I00iOIl;
/* 78 */                    if (!(obj == null) && !(obj instanceof l01Oi0OiI)) {
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
/* 7 */             l01l0oIOl1 l01l0oiol1 = l01l0oIOl1.I0000Il00O;
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
/* 57 */                l01l0oIOl1 l01l0oiol12 = this.I00iiO;
/* 59 */                if (l01l0oiol12 != l01l0oiol1) {
/* 61 */                    obj = null;
/* 65 */                    l01l0oIOl1 l01l0oiol13 = new l01l0oIOl1();
                            while (true) {
/* 68 */                        liooi0 liooi0Var = l01loiOOo11l.I00io1l;
/* 70 */                        liooi0Var.I0000Il00O(l01l0oiol13, l01l0oiol12);
/* 77 */                        if (liooi0Var.I000II(this, l01l0oiol12, l01l0oiol13)) {
/* 79 */                            j2 = j3;
/* 126 */                           do {
/* 90 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 97 */                                if (Thread.interrupted()) {
/* 132 */                                   I00000oIO(l01l0oiol13);
/* 135 */                                   I000II.I00100l0();
/* 61 */                                    return null;
                                        }
/* 99 */                                Object obj3 = this.I00iOIl;
/* 111 */                               if ((obj3 != null) && I000II(obj3)) {
/* 113 */                                   return I0001Ioi1lo(obj3);
                                        }
/* 122 */                               nanos = jNanoTime - System.nanoTime();
/* 126 */                           } while (nanos >= 1000);
/* 128 */                           I00000oIO(l01l0oiol13);
                                } else {
/* 139 */                           long j4 = j3;
/* 141 */                           l01l0oIOl1 l01l0oiol14 = this.I00iiO;
/* 143 */                           if (l01l0oiol14 == l01l0oiol1) {
                                        break;
                                    }
/* 146 */                           l01l0oiol12 = l01l0oiol14;
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
/* 3 */             return this.I00iOIl instanceof l01OOll0II1;
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
/* 107 */               if (obj instanceof l01Oi0OiI) {
/* 111 */                   sb.append(", setFuture=[");
/* 116 */                   ListenableFuture listenableFuture = ((l01Oi0OiI) obj).I00iiI;
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
/* 365 */           l01l0oIOl1 l01l0oiol1 = l01l0oIOl1.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 366 */               Object obj2 = this.I00iOIl;
/* 367 */               if ((obj2 != null) & I000II(obj2)) {
/* 368 */                   return I0001Ioi1lo(obj2);
                        }
                        l01l0oIOl1 l01l0oiol12 = this.I00iiO;
                        if (l01l0oiol12 != l01l0oiol1) {
/* 369 */                   l01l0oIOl1 l01l0oiol13 = new l01l0oIOl1();
                            do {
                                liooi0 liooi0Var = l01loiOOo11l.I00io1l;
/* 370 */                       liooi0Var.I0000Il00O(l01l0oiol13, l01l0oiol12);
/* 371 */                       if (liooi0Var.I000II(this, l01l0oiol12, l01l0oiol13)) {
                                    do {
/* 372 */                               LockSupport.park(this);
/* 373 */                               if (!Thread.interrupted()) {
/* 374 */                                   obj = this.I00iOIl;
                                        } else {
/* 376 */                                   I00000oIO(l01l0oiol13);
/* 377 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (!((obj != null) & I000II(obj)));
/* 375 */                           return I0001Ioi1lo(obj);
                                }
/* 378 */                       l01l0oiol12 = this.I00iiO;
                            } while (l01l0oiol12 != l01l0oiol1);
                        }
                        Object obj3 = this.I00iOIl;
/* 379 */               Objects.requireNonNull(obj3);
                        return I0001Ioi1lo(obj3);
                    }
/* 380 */           I000II.I00100l0();
                    return null;
                }
            }

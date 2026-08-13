            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
/* 18 */    public abstract class I01Ol1o0 implements ListenableFuture {
                public static final boolean I00iio = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                public static final Logger I00ilI0I1 = Logger.getLogger(I01Ol1o0.class.getName());
                public static final iOI0lO1ilo I00ilO0;
                public static final Object I00io1l;
                public volatile Object I00iOIl;
                public volatile I01OOIlI I00iiI;
                public volatile I01OiO1OI I00iiO;

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    I01Oi01Ilol i01Oi01Ilol;
                    try {
/* 35 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(I01OiO1OI.class, Thread.class, "I00000oIO");
/* 41 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(I01OiO1OI.class, I01OiO1OI.class, "I00000oOI");
/* 47 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(I01Ol1o0.class, I01OiO1OI.class, "I00iiO");
/* 55 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(I01Ol1o0.class, I01OOIlI.class, "I00iiI");
/* 63 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(I01Ol1o0.class, Object.class, "I00iOIl");
/* 67 */                I01OOiI1o i01OOiI1o = new I01OOiI1o();
/* 70 */                i01OOiI1o.I00000oIO = atomicReferenceFieldUpdaterNewUpdater;
/* 72 */                i01OOiI1o.I00000oOI = atomicReferenceFieldUpdaterNewUpdater2;
/* 74 */                i01OOiI1o.I0000Il00O = atomicReferenceFieldUpdaterNewUpdater3;
/* 76 */                i01OOiI1o.I0000O = atomicReferenceFieldUpdaterNewUpdater4;
/* 78 */                i01OOiI1o.I0000oI00 = atomicReferenceFieldUpdaterNewUpdater5;
/* 80 */                VarHandle.storeStoreFence();
/* 83 */                th = null;
                        i01Oi01Ilol = i01OOiI1o;
                    } catch (Throwable th) {
/* 85 */                th = th;
/* 88 */                i01Oi01Ilol = new I01Oi01Ilol();
                    }
/* 91 */            I00ilO0 = i01Oi01Ilol;
/* 93 */            if (th != null) {
/* 101 */               I00ilI0I1.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
                    }
/* 109 */           I00io1l = new Object();
                }

                public static void I0000Il00O(I01Ol1o0 i01Ol1o0) {
                    I01OiO1OI i01OiO1OI;
                    I01OOIlI i01OOIlI;
                    I01OOIlI i01OOIlI2;
                    I01OOIlI i01OOIlI3;
/* 11 */            do {
/* 1 */                 i01OiO1OI = i01Ol1o0.I00iiO;
/* 11 */            } while (!I00ilO0.I0000Il00O(i01Ol1o0, i01OiO1OI, I01OiO1OI.I0000Il00O));
                    while (true) {
/* 13 */                i01OOIlI = null;
/* 14 */                if (i01OiO1OI == null) {
                            break;
                        }
/* 16 */                Thread thread = i01OiO1OI.I00000oIO;
/* 18 */                if (thread != null) {
/* 20 */                    i01OiO1OI.I00000oIO = null;
/* 22 */                    LockSupport.unpark(thread);
                        }
/* 25 */                i01OiO1OI = i01OiO1OI.I00000oOI;
                    }
/* 28 */            i01Ol1o0.I00000oOI();
/* 41 */            do {
/* 31 */                i01OOIlI2 = i01Ol1o0.I00iiI;
/* 41 */            } while (!I00ilO0.I00000oIO(i01Ol1o0, i01OOIlI2, I01OOIlI.I0000O));
                    while (true) {
/* 43 */                i01OOIlI3 = i01OOIlI;
/* 44 */                i01OOIlI = i01OOIlI2;
/* 45 */                if (i01OOIlI == null) {
                            break;
                        }
/* 47 */                i01OOIlI2 = i01OOIlI.I0000Il00O;
/* 49 */                i01OOIlI.I0000Il00O = i01OOIlI3;
                    }
/* 52 */            while (i01OOIlI3 != null) {
/* 54 */                I01OOIlI i01OOIlI4 = i01OOIlI3.I0000Il00O;
/* 60 */                I0000O(i01OOIlI3.I00000oIO, i01OOIlI3.I00000oOI);
/* 63 */                i01OOIlI3 = i01OOIlI4;
                    }
                }

                public static void I0000O(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (RuntimeException e) {
/* 32 */                I00ilI0I1.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
                    }
                }

                public static Object I0000oI00(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof I01OIo) {
/* 27 */                Throwable th = ((I01OIo) obj).I00000oOI;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof I01OO1I) {
/* 24 */                throw new ExecutionException(((I01OO1I) obj).I00000oIO);
                    }
/* 11 */            if (obj == I00io1l) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static Object I0001Ioi1lo(Future future) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 27 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 23 */                        Thread.currentThread().interrupt();
                            }
/* 26 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }

                public final void I00000oIO(StringBuilder sb) {
                    try {
/* 3 */                 Object objI0001Ioi1lo = I0001Ioi1lo(this);
/* 9 */                 sb.append("SUCCESS, result=[");
/* 21 */                sb.append(objI0001Ioi1lo == this ? "this future" : String.valueOf(objI0001Ioi1lo));
/* 24 */                sb.append("]");
                    } catch (CancellationException unused) {
/* 52 */                sb.append("CANCELLED");
                    } catch (RuntimeException e) {
/* 34 */                sb.append("UNKNOWN, cause=[");
/* 41 */                sb.append(e.getClass());
/* 46 */                sb.append(" thrown from get()]");
                    } catch (ExecutionException e2) {
/* 58 */                sb.append("FAILURE, cause=[");
/* 65 */                sb.append(e2.getCause());
/* 68 */                sb.append("]");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String I000II() {
/* 3 */             if (!(this instanceof ScheduledFuture)) {
/* 33 */                return null;
                    }
/* 28 */            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                }

                public final void I000O01llI0(I01OiO1OI i01OiO1OI) {
/* 2 */             i01OiO1OI.I00000oIO = null;
                    while (true) {
/* 4 */                 I01OiO1OI i01OiO1OI2 = this.I00iiO;
/* 8 */                 if (i01OiO1OI2 == I01OiO1OI.I0000Il00O) {
/* 77 */                    return;
                        }
/* 11 */                I01OiO1OI i01OiO1OI3 = null;
/* 12 */                while (i01OiO1OI2 != null) {
/* 14 */                    I01OiO1OI i01OiO1OI4 = i01OiO1OI2.I00000oOI;
/* 18 */                    if (i01OiO1OI2.I00000oIO != null) {
/* 20 */                        i01OiO1OI3 = i01OiO1OI2;
                            } else if (i01OiO1OI3 != null) {
/* 24 */                        i01OiO1OI3.I00000oOI = i01OiO1OI4;
/* 28 */                        if (i01OiO1OI3.I00000oIO == null) {
                                    break;
                                }
                            } else if (!I00ilO0.I0000Il00O(this, i01OiO1OI2, i01OiO1OI4)) {
                                break;
                            }
/* 40 */                    i01OiO1OI2 = i01OiO1OI4;
                        }
/* 77 */                return;
                    }
                }

                public boolean I000OOo1O(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = I00io1l;
                    }
/* 12 */            if (!I00ilO0.I00000oOI(this, null, obj)) {
/* 19 */                return false;
                    }
/* 14 */            I0000Il00O(this);
/* 17 */            return true;
                }

                public boolean I000OiO(Throwable th) {
/* 3 */             th.getClass();
/* 16 */            if (!I00ilO0.I00000oOI(this, null, new I01OO1I(th))) {
/* 23 */                return false;
                    }
/* 18 */            I0000Il00O(this);
/* 21 */            return true;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 1 */             runnable.getClass();
/* 4 */             executor.getClass();
/* 7 */             I01OOIlI i01OOIlI = this.I00iiI;
/* 9 */             I01OOIlI i01OOIlI2 = I01OOIlI.I0000O;
/* 11 */            if (i01OOIlI != i01OOIlI2) {
/* 15 */                I01OOIlI i01OOIlI3 = new I01OOIlI(runnable, executor);
/* 31 */                do {
/* 18 */                    i01OOIlI3.I0000Il00O = i01OOIlI;
/* 26 */                    if (I00ilO0.I00000oIO(this, i01OOIlI, i01OOIlI3)) {
/* 28 */                        return;
                            } else {
/* 29 */                        i01OOIlI = this.I00iiI;
                            }
/* 31 */                } while (i01OOIlI != i01OOIlI2);
                    }
/* 33 */            I0000O(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             Object obj = this.I00iOIl;
/* 3 */             if (obj != null) {
/* 42 */                return false;
                    }
/* 35 */            if (!I00ilO0.I00000oOI(this, obj, I00iio ? new I01OIo(z, new CancellationException("Future.cancel() was called.")) : z ? I01OIo.I0000Il00O : I01OIo.I0000O)) {
/* 42 */                return false;
                    }
/* 37 */            I0000Il00O(this);
/* 40 */            return true;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    Object obj;
/* 7 */             I01OiO1OI i01OiO1OI = I01OiO1OI.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 304 */               I000II.I00100l0();
/* 302 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 21 */            if (obj2 != null) {
/* 23 */                return I0000oI00(obj2);
                    }
/* 40 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 45 */            if (nanos >= 1000) {
/* 47 */                I01OiO1OI i01OiO1OI2 = this.I00iiO;
/* 49 */                if (i01OiO1OI2 != i01OiO1OI) {
/* 53 */                    I01OiO1OI i01OiO1OI3 = new I01OiO1OI();
/* 56 */                    obj = null;
/* 110 */                   do {
/* 58 */                        iOI0lO1ilo ioi0lo1ilo = I00ilO0;
/* 60 */                        ioi0lo1ilo.I0000O(i01OiO1OI3, i01OiO1OI2);
/* 67 */                        if (ioi0lo1ilo.I0000Il00O(this, i01OiO1OI2, i01OiO1OI3)) {
/* 95 */                            do {
/* 69 */                                LockSupport.parkNanos(this, nanos);
/* 76 */                                if (Thread.interrupted()) {
/* 101 */                                   I000O01llI0(i01OiO1OI3);
/* 104 */                                   I000II.I00100l0();
/* 56 */                                    return null;
                                        }
/* 78 */                                Object obj3 = this.I00iOIl;
/* 80 */                                if (obj3 != null) {
/* 82 */                                    return I0000oI00(obj3);
                                        }
/* 91 */                                nanos = jNanoTime - System.nanoTime();
/* 95 */                            } while (nanos >= 1000);
/* 97 */                            I000O01llI0(i01OiO1OI3);
                                } else {
/* 108 */                           i01OiO1OI2 = this.I00iiO;
                                }
/* 110 */                   } while (i01OiO1OI2 != i01OiO1OI);
                        }
/* 114 */               return I0000oI00(this.I00iOIl);
                    }
/* 119 */           obj = null;
/* 123 */           while (nanos > 0) {
/* 125 */               Object obj4 = this.I00iOIl;
/* 127 */               if (obj4 != null) {
/* 129 */                   return I0000oI00(obj4);
                        }
/* 138 */               if (Thread.interrupted()) {
/* 147 */                   I000II.I00100l0();
/* 150 */                   return obj;
                        }
/* 144 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 151 */           String string = toString();
/* 155 */           String string2 = timeUnit.toString();
/* 159 */           Locale locale = Locale.ROOT;
/* 161 */           String lowerCase = string2.toLowerCase(locale);
/* 169 */           StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "Waited ", " ");
/* 181 */           sbI001iOo1i0O.append(timeUnit.toString().toLowerCase(locale));
/* 184 */           String string3 = sbI001iOo1i0O.toString();
/* 192 */           if (nanos + 1000 < 0) {
/* 196 */               String strConcat = string3.concat(" (plus ");
/* 200 */               long j2 = -nanos;
/* 205 */               long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
/* 213 */               long nanos2 = j2 - timeUnit.toNanos(jConvert);
/* 225 */               boolean z = jConvert == 0 || nanos2 > 1000;
/* 226 */               if (jConvert > 0) {
/* 242 */                   String strConcat2 = strConcat + jConvert + " " + lowerCase;
/* 246 */                   if (z) {
/* 250 */                       strConcat2 = strConcat2.concat(",");
                            }
/* 254 */                   strConcat = strConcat2.concat(" ");
                        }
/* 258 */               if (z) {
/* 262 */                   strConcat = IlIi0I0.I000l1(nanos2, strConcat, " nanoseconds ");
                        }
/* 268 */               string3 = strConcat.concat("delay)");
                    }
/* 276 */           if (isDone()) {
/* 289 */               throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
                    }
/* 301 */           throw new TimeoutException(IlIi0I0.I000lI(string3, " for ", string));
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof I01OIo;
                }

                @Override
                public final boolean isDone() {
                    return this.I00iOIl != null;
                }

                public final String toString() {
                    String strI000II;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append("[status=");
/* 24 */            if (this.I00iOIl instanceof I01OIo) {
/* 28 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 38 */                I00000oIO(sb);
                    } else {
                        try {
/* 42 */                    strI000II = I000II();
                        } catch (RuntimeException e) {
/* 62 */                    strI000II = "Exception thrown from implementation: " + e.getClass();
                        }
/* 66 */                if (strI000II != null && !strI000II.isEmpty()) {
/* 76 */                    sb.append("PENDING, info=[");
/* 79 */                    sb.append(strI000II);
/* 82 */                    sb.append("]");
                        } else if (isDone()) {
/* 92 */                    I00000oIO(sb);
                        } else {
/* 98 */                    sb.append("PENDING");
                        }
                    }
/* 101 */           sb.append("]");
/* 104 */           return sb.toString();
                }

/* 19 */        public void I00000oOI() {
                }

                @Override
/* 307 */       public final Object get() throws InterruptedException {
                    Object obj;
/* 308 */           I01OiO1OI i01OiO1OI = I01OiO1OI.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 309 */               Object obj2 = this.I00iOIl;
                        if (obj2 != null) {
/* 310 */                   return I0000oI00(obj2);
                        }
/* 311 */               I01OiO1OI i01OiO1OI2 = this.I00iiO;
                        if (i01OiO1OI2 != i01OiO1OI) {
/* 312 */                   I01OiO1OI i01OiO1OI3 = new I01OiO1OI();
                            do {
/* 313 */                       iOI0lO1ilo ioi0lo1ilo = I00ilO0;
                                ioi0lo1ilo.I0000O(i01OiO1OI3, i01OiO1OI2);
/* 314 */                       if (ioi0lo1ilo.I0000Il00O(this, i01OiO1OI2, i01OiO1OI3)) {
                                    do {
/* 315 */                               LockSupport.park(this);
/* 316 */                               if (!Thread.interrupted()) {
/* 317 */                                   obj = this.I00iOIl;
                                        } else {
/* 319 */                                   I000O01llI0(i01OiO1OI3);
/* 320 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (obj == null);
/* 318 */                           return I0000oI00(obj);
                                }
/* 321 */                       i01OiO1OI2 = this.I00iiO;
                            } while (i01OiO1OI2 != i01OiO1OI);
                        }
/* 322 */               return I0000oI00(this.I00iOIl);
                    }
/* 323 */           I000II.I00100l0();
                    return null;
                }
            }

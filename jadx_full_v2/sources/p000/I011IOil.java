            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
/* 306 */   public abstract class I011IOil implements ListenableFuture {
                public static final boolean I00iio = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                public static final Logger I00ilI0I1 = Logger.getLogger(I011IOil.class.getName());
                public static final iOI00o11 I00ilO0;
                public static final Object I00io1l;
                public volatile Object I00iOIl;
                public volatile I010oio1OO0 I00iiI;
                public volatile I0111i I00iiO;

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    I01101olii i01101olii;
                    try {
/* 35 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(I0111i.class, Thread.class, "I00000oIO");
/* 41 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(I0111i.class, I0111i.class, "I00000oOI");
/* 47 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(I011IOil.class, I0111i.class, "I00iiO");
/* 55 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(I011IOil.class, I010oio1OO0.class, "I00iiI");
/* 63 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(I011IOil.class, Object.class, "I00iOIl");
/* 67 */                I01101IOlO i01101IOlO = new I01101IOlO();
/* 70 */                i01101IOlO.I00000oIO = atomicReferenceFieldUpdaterNewUpdater;
/* 72 */                i01101IOlO.I00000oOI = atomicReferenceFieldUpdaterNewUpdater2;
/* 74 */                i01101IOlO.I0000Il00O = atomicReferenceFieldUpdaterNewUpdater3;
/* 76 */                i01101IOlO.I0000O = atomicReferenceFieldUpdaterNewUpdater4;
/* 78 */                i01101IOlO.I0000oI00 = atomicReferenceFieldUpdaterNewUpdater5;
/* 80 */                VarHandle.storeStoreFence();
/* 83 */                th = null;
                        i01101olii = i01101IOlO;
                    } catch (Throwable th) {
/* 85 */                th = th;
/* 88 */                i01101olii = new I01101olii();
                    }
/* 91 */            I00ilO0 = i01101olii;
/* 93 */            if (th != null) {
/* 101 */               I00ilI0I1.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
                    }
/* 109 */           I00io1l = new Object();
                }

                public static void I00000oOI(I011IOil i011IOil) {
                    I0111i i0111i;
                    I010oio1OO0 i010oio1OO0;
                    I010oio1OO0 i010oio1OO02;
                    I010oio1OO0 i010oio1OO03;
/* 11 */            do {
/* 1 */                 i0111i = i011IOil.I00iiO;
/* 11 */            } while (!I00ilO0.I0000Il00O(i011IOil, i0111i, I0111i.I0000Il00O));
                    while (true) {
/* 13 */                i010oio1OO0 = null;
/* 14 */                if (i0111i == null) {
                            break;
                        }
/* 16 */                Thread thread = i0111i.I00000oIO;
/* 18 */                if (thread != null) {
/* 20 */                    i0111i.I00000oIO = null;
/* 22 */                    LockSupport.unpark(thread);
                        }
/* 25 */                i0111i = i0111i.I00000oOI;
                    }
/* 38 */            do {
/* 28 */                i010oio1OO02 = i011IOil.I00iiI;
/* 38 */            } while (!I00ilO0.I00000oIO(i011IOil, i010oio1OO02, I010oio1OO0.I0000O));
                    while (true) {
/* 40 */                i010oio1OO03 = i010oio1OO0;
/* 41 */                i010oio1OO0 = i010oio1OO02;
/* 42 */                if (i010oio1OO0 == null) {
                            break;
                        }
/* 44 */                i010oio1OO02 = i010oio1OO0.I0000Il00O;
/* 46 */                i010oio1OO0.I0000Il00O = i010oio1OO03;
                    }
/* 49 */            while (i010oio1OO03 != null) {
/* 51 */                I010oio1OO0 i010oio1OO04 = i010oio1OO03.I0000Il00O;
/* 57 */                I0000Il00O(i010oio1OO03.I00000oIO, i010oio1OO03.I00000oOI);
/* 60 */                i010oio1OO03 = i010oio1OO04;
                    }
                }

                public static void I0000Il00O(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (RuntimeException e) {
/* 32 */                I00ilI0I1.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
                    }
                }

                public static Object I0000O(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof I010iIIOlo) {
/* 27 */                Throwable th = ((I010iIIOlo) obj).I00000oIO;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof I010lI0oi) {
/* 24 */                throw new ExecutionException(((I010lI0oi) obj).I00000oIO);
                    }
/* 11 */            if (obj == I00io1l) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static Object I0000oI00(I011IOil i011IOil) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = i011IOil.get();
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
/* 3 */                 Object objI0000oI00 = I0000oI00(this);
/* 9 */                 sb.append("SUCCESS, result=[");
/* 21 */                sb.append(objI0000oI00 == this ? "this future" : String.valueOf(objI0000oI00));
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

                public final void I0001Ioi1lo(I0111i i0111i) {
/* 2 */             i0111i.I00000oIO = null;
                    while (true) {
/* 4 */                 I0111i i0111i2 = this.I00iiO;
/* 8 */                 if (i0111i2 == I0111i.I0000Il00O) {
/* 77 */                    return;
                        }
/* 11 */                I0111i i0111i3 = null;
/* 12 */                while (i0111i2 != null) {
/* 14 */                    I0111i i0111i4 = i0111i2.I00000oOI;
/* 18 */                    if (i0111i2.I00000oIO != null) {
/* 20 */                        i0111i3 = i0111i2;
                            } else if (i0111i3 != null) {
/* 24 */                        i0111i3.I00000oOI = i0111i4;
/* 28 */                        if (i0111i3.I00000oIO == null) {
                                    break;
                                }
                            } else if (!I00ilO0.I0000Il00O(this, i0111i2, i0111i4)) {
                                break;
                            }
/* 40 */                    i0111i2 = i0111i4;
                        }
/* 77 */                return;
                    }
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 1 */             runnable.getClass();
/* 4 */             executor.getClass();
/* 7 */             I010oio1OO0 i010oio1OO0 = this.I00iiI;
/* 9 */             I010oio1OO0 i010oio1OO02 = I010oio1OO0.I0000O;
/* 11 */            if (i010oio1OO0 != i010oio1OO02) {
/* 15 */                I010oio1OO0 i010oio1OO03 = new I010oio1OO0(runnable, executor);
/* 31 */                do {
/* 18 */                    i010oio1OO03.I0000Il00O = i010oio1OO0;
/* 26 */                    if (I00ilO0.I00000oIO(this, i010oio1OO0, i010oio1OO03)) {
/* 28 */                        return;
                            } else {
/* 29 */                        i010oio1OO0 = this.I00iiI;
                            }
/* 31 */                } while (i010oio1OO0 != i010oio1OO02);
                    }
/* 33 */            I0000Il00O(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             Object obj = this.I00iOIl;
/* 3 */             if (obj != null) {
/* 42 */                return false;
                    }
/* 35 */            if (!I00ilO0.I00000oOI(this, obj, I00iio ? new I010iIIOlo(z, new CancellationException("Future.cancel() was called.")) : z ? I010iIIOlo.I00000oOI : I010iIIOlo.I0000Il00O)) {
/* 42 */                return false;
                    }
/* 37 */            I00000oOI(this);
/* 40 */            return true;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    Object obj;
/* 7 */             I0111i i0111i = I0111i.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 304 */               I000II.I00100l0();
/* 302 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 21 */            if (obj2 != null) {
/* 23 */                return I0000O(obj2);
                    }
/* 40 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 45 */            if (nanos >= 1000) {
/* 47 */                I0111i i0111i2 = this.I00iiO;
/* 49 */                if (i0111i2 != i0111i) {
/* 53 */                    I0111i i0111i3 = new I0111i();
/* 56 */                    obj = null;
/* 110 */                   do {
/* 58 */                        iOI00o11 ioi00o11 = I00ilO0;
/* 60 */                        ioi00o11.I0000O(i0111i3, i0111i2);
/* 67 */                        if (ioi00o11.I0000Il00O(this, i0111i2, i0111i3)) {
/* 95 */                            do {
/* 69 */                                LockSupport.parkNanos(this, nanos);
/* 76 */                                if (Thread.interrupted()) {
/* 101 */                                   I0001Ioi1lo(i0111i3);
/* 104 */                                   I000II.I00100l0();
/* 56 */                                    return null;
                                        }
/* 78 */                                Object obj3 = this.I00iOIl;
/* 80 */                                if (obj3 != null) {
/* 82 */                                    return I0000O(obj3);
                                        }
/* 91 */                                nanos = jNanoTime - System.nanoTime();
/* 95 */                            } while (nanos >= 1000);
/* 97 */                            I0001Ioi1lo(i0111i3);
                                } else {
/* 108 */                           i0111i2 = this.I00iiO;
                                }
/* 110 */                   } while (i0111i2 != i0111i);
                        }
/* 114 */               return I0000O(this.I00iOIl);
                    }
/* 119 */           obj = null;
/* 123 */           while (nanos > 0) {
/* 125 */               Object obj4 = this.I00iOIl;
/* 127 */               if (obj4 != null) {
/* 129 */                   return I0000O(obj4);
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
/* 3 */             return this.I00iOIl instanceof I010iIIOlo;
                }

                @Override
                public final boolean isDone() {
                    return this.I00iOIl != null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final String toString() {
                    String str;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append("[status=");
/* 24 */            if (this.I00iOIl instanceof I010iIIOlo) {
/* 28 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 38 */                I00000oIO(sb);
                    } else {
                        try {
/* 44 */                    if (this instanceof ScheduledFuture) {
/* 70 */                        str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                            } else {
/* 75 */                        str = null;
                            }
                        } catch (RuntimeException e) {
/* 92 */                    str = "Exception thrown from implementation: " + e.getClass();
                        }
/* 96 */                if (str != null && !str.isEmpty()) {
/* 106 */                   sb.append("PENDING, info=[");
/* 109 */                   sb.append(str);
/* 112 */                   sb.append("]");
                        } else if (isDone()) {
/* 122 */                   I00000oIO(sb);
                        } else {
/* 128 */                   sb.append("PENDING");
                        }
                    }
/* 131 */           sb.append("]");
/* 134 */           return sb.toString();
                }

                @Override
/* 307 */       public final Object get() throws InterruptedException {
                    Object obj;
/* 308 */           I0111i i0111i = I0111i.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 309 */               Object obj2 = this.I00iOIl;
                        if (obj2 != null) {
/* 310 */                   return I0000O(obj2);
                        }
/* 311 */               I0111i i0111i2 = this.I00iiO;
                        if (i0111i2 != i0111i) {
/* 312 */                   I0111i i0111i3 = new I0111i();
                            do {
/* 313 */                       iOI00o11 ioi00o11 = I00ilO0;
                                ioi00o11.I0000O(i0111i3, i0111i2);
/* 314 */                       if (ioi00o11.I0000Il00O(this, i0111i2, i0111i3)) {
                                    do {
/* 315 */                               LockSupport.park(this);
/* 316 */                               if (!Thread.interrupted()) {
/* 317 */                                   obj = this.I00iOIl;
                                        } else {
/* 319 */                                   I0001Ioi1lo(i0111i3);
/* 320 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (obj == null);
/* 318 */                           return I0000O(obj);
                                }
/* 321 */                       i0111i2 = this.I00iiO;
                            } while (i0111i2 != i0111i);
                        }
/* 322 */               return I0000O(this.I00iOIl);
                    }
/* 323 */           I000II.I00100l0();
                    return null;
                }
            }

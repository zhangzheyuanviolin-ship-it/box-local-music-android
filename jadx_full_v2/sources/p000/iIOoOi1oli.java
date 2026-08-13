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
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
/* 18 */    public abstract class iIOoOi1oli implements ListenableFuture {
                public static final boolean I00iio;
                public static final IOoi01o I00ilI0I1;
                public static final liiOI1lOOIOO I00ilO0;
                public static final Object I00io1l;
                public volatile Object I00iOIl;
                public volatile iIOloo00l0 I00iiI;
                public volatile iIOo0i01l I00iiO;

                static {
                    boolean z;
                    liiOI1lOOIOO iioo01iol1i;
                    Throwable th;
                    Throwable th2;
                    liiOI1lOOIOO iioo0ol;
                    try {
/* 9 */                 z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 14 */                z = false;
                    }
/* 15 */            I00iio = z;
/* 19 */            IOoi01o iOoi01o = new IOoi01o();
/* 28 */            iOoi01o.I00000oIO = iIOoOi1oli.class.getName();
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            I00ilI0I1 = iOoi01o;
/* 35 */            Throwable th3 = null;
                    try {
/* 41 */                th = null;
/* 42 */                th2 = null;
/* 38 */                iioo0ol = new iIOo0Ol();
                    } catch (Error | Exception e) {
                        try {
/* 54 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(iIOo0i01l.class, Thread.class, "I00000oIO");
/* 60 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(iIOo0i01l.class, iIOo0i01l.class, "I00000oOI");
/* 66 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(iIOoOi1oli.class, iIOo0i01l.class, "I00iiO");
/* 74 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(iIOoOi1oli.class, iIOloo00l0.class, "I00iiI");
/* 82 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(iIOoOi1oli.class, Object.class, "I00iOIl");
/* 86 */                    iIOo00OOi1I iioo00ooi1i = new iIOo00OOi1I();
/* 89 */                    iioo00ooi1i.I00000oIO = atomicReferenceFieldUpdaterNewUpdater;
/* 91 */                    iioo00ooi1i.I00000oOI = atomicReferenceFieldUpdaterNewUpdater2;
/* 93 */                    iioo00ooi1i.I0000Il00O = atomicReferenceFieldUpdaterNewUpdater3;
/* 95 */                    iioo00ooi1i.I0000O = atomicReferenceFieldUpdaterNewUpdater4;
/* 97 */                    iioo00ooi1i.I0000oI00 = atomicReferenceFieldUpdaterNewUpdater5;
/* 99 */                    VarHandle.storeStoreFence();
                            iioo01iol1i = iioo00ooi1i;
                        } catch (Error | Exception e2) {
/* 105 */                   th3 = e2;
/* 111 */                   iioo01iol1i = new iIOo01iol1I();
                        }
/* 102 */               th = th3;
/* 103 */               th2 = e;
                        iioo0ol = iioo01iol1i;
                    }
/* 115 */           I00ilO0 = iioo0ol;
/* 117 */           if (th != null) {
/* 119 */               IOoi01o iOoi01o2 = I00ilI0I1;
/* 121 */               Logger loggerI00000oIO = iOoi01o2.I00000oIO();
/* 125 */               Level level = Level.SEVERE;
/* 134 */               loggerI00000oIO.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 147 */               iOoi01o2.I00000oIO().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
                    }
/* 155 */           I00io1l = new Object();
                }

                public static Object I0000Il00O(iIOoOi1oli iioooi1oli) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = iioooi1oli.get();
                            break;
                        } catch (InterruptedException unused) {
/* 28 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 24 */                        Thread.currentThread().interrupt();
                            }
/* 27 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }

                public static void I0000oI00(iIOoOi1oli iioooi1oli) {
/* 8 */             for (iIOo0i01l iioo0i01lI00000oOI = I00ilO0.I00000oOI(iioooi1oli); iioo0i01lI00000oOI != null; iioo0i01lI00000oOI = iioo0i01lI00000oOI.I00000oOI) {
/* 10 */                Thread thread = iioo0i01lI00000oOI.I00000oIO;
/* 12 */                if (thread != null) {
/* 14 */                    iioo0i01lI00000oOI.I00000oIO = null;
/* 16 */                    LockSupport.unpark(thread);
                        }
                    }
/* 22 */            iioooi1oli.I00000oOI();
/* 25 */            liiOI1lOOIOO liioi1looioo = I00ilO0;
/* 27 */            iIOloo00l0 iioloo00l0 = iIOloo00l0.I0000O;
/* 29 */            iIOloo00l0 iioloo00l0I00000oIO = liioi1looioo.I00000oIO(iioooi1oli);
/* 35 */            iIOloo00l0 iioloo00l02 = null;
/* 36 */            while (iioloo00l0I00000oIO != null) {
/* 38 */                iIOloo00l0 iioloo00l03 = iioloo00l0I00000oIO.I0000Il00O;
/* 40 */                iioloo00l0I00000oIO.I0000Il00O = iioloo00l02;
/* 42 */                iioloo00l02 = iioloo00l0I00000oIO;
/* 43 */                iioloo00l0I00000oIO = iioloo00l03;
                    }
/* 45 */            while (iioloo00l02 != null) {
/* 47 */                Runnable runnable = iioloo00l02.I00000oIO;
/* 49 */                iIOloo00l0 iioloo00l04 = iioloo00l02.I0000Il00O;
/* 51 */                Objects.requireNonNull(runnable);
/* 54 */                Executor executor = iioloo00l02.I00000oOI;
/* 56 */                Objects.requireNonNull(executor);
/* 59 */                I0001Ioi1lo(runnable, executor);
/* 62 */                iioloo00l02 = iioloo00l04;
                    }
                }

                public static void I0001Ioi1lo(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 35 */                I00ilI0I1.I00000oIO().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", IIl001iO0Io.I000oI1ioi("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                public static final Object I000O01llI0(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof iIOlili1) {
/* 27 */                Throwable th = ((iIOlili1) obj).I00000oOI;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof iIOlo0O) {
/* 24 */                throw new ExecutionException(((iIOlo0O) obj).I00000oIO);
                    }
/* 11 */            if (obj == I00io1l) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String I00000oIO() {
/* 3 */             if (this instanceof ScheduledFuture) {
/* 17 */                return IlIi0I0.I000l1(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
                    }
/* 22 */            return null;
                }

                public final void I0000O(StringBuilder sb) {
                    try {
/* 3 */                 Object objI0000Il00O = I0000Il00O(this);
/* 9 */                 sb.append("SUCCESS, result=[");
/* 12 */                if (objI0000Il00O == null) {
/* 16 */                    sb.append("null");
                        } else if (objI0000Il00O == this) {
/* 28 */                    sb.append("this future");
                        } else {
/* 40 */                    sb.append(objI0000Il00O.getClass().getName());
/* 45 */                    sb.append("@");
/* 56 */                    sb.append(Integer.toHexString(System.identityHashCode(objI0000Il00O)));
                        }
/* 59 */                sb.append("]");
                    } catch (CancellationException unused) {
/* 83 */                sb.append("CANCELLED");
                    } catch (ExecutionException e) {
/* 89 */                sb.append("FAILURE, cause=[");
/* 96 */                sb.append(e.getCause());
/* 99 */                sb.append("]");
                    } catch (Exception e2) {
/* 65 */                sb.append("UNKNOWN, cause=[");
/* 72 */                sb.append(e2.getClass());
/* 77 */                sb.append(" thrown from get()]");
                    }
                }

                public final void I000II(iIOo0i01l iioo0i01l) {
/* 2 */             iioo0i01l.I00000oIO = null;
                    while (true) {
/* 4 */                 iIOo0i01l iioo0i01l2 = this.I00iiO;
/* 8 */                 if (iioo0i01l2 != iIOo0i01l.I0000Il00O) {
/* 10 */                    iIOo0i01l iioo0i01l3 = null;
/* 11 */                    while (iioo0i01l2 != null) {
/* 13 */                        iIOo0i01l iioo0i01l4 = iioo0i01l2.I00000oOI;
/* 17 */                        if (iioo0i01l2.I00000oIO != null) {
/* 19 */                            iioo0i01l3 = iioo0i01l2;
                                } else if (iioo0i01l3 != null) {
/* 23 */                            iioo0i01l3.I00000oOI = iioo0i01l4;
/* 27 */                            if (iioo0i01l3.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00ilO0.I000II(this, iioo0i01l2, iioo0i01l4)) {
                                    break;
                                }
/* 39 */                        iioo0i01l2 = iioo0i01l4;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
                    iIOloo00l0 iioloo00l0;
/* 1 */             if (runnable == null) {
/* 55 */                IOOlIIilOl0.I000II("Runnable was null.");
/* 106 */               return;
                    }
/* 3 */             if (executor == null) {
/* 49 */                IOOlIIilOl0.I000II("Executor was null.");
/* 52 */                return;
                    }
/* 9 */             if (!isDone() && (iioloo00l0 = this.I00iiI) != iIOloo00l0.I0000O) {
/* 19 */                iIOloo00l0 iioloo00l02 = new iIOloo00l0();
/* 22 */                iioloo00l02.I00000oIO = runnable;
/* 24 */                iioloo00l02.I00000oOI = executor;
/* 41 */                do {
/* 26 */                    iioloo00l02.I0000Il00O = iioloo00l0;
/* 34 */                    if (I00ilO0.I0000oI00(this, iioloo00l0, iioloo00l02)) {
/* 36 */                        return;
                            } else {
/* 37 */                        iioloo00l0 = this.I00iiI;
                            }
/* 41 */                } while (iioloo00l0 != iIOloo00l0.I0000O);
                    }
/* 43 */            I0001Ioi1lo(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
                    iIOlili1 iiolili1;
/* 1 */             Object obj = this.I00iOIl;
/* 3 */             if (obj != null) {
/* 47 */                return false;
                    }
/* 7 */             if (I00iio) {
/* 18 */                iiolili1 = new iIOlili1(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 28 */                iiolili1 = z ? iIOlili1.I0000Il00O : iIOlili1.I0000O;
/* 31 */                Objects.requireNonNull(iiolili1);
                    }
/* 40 */            if (!I00ilO0.I0001Ioi1lo(this, obj, iiolili1)) {
/* 47 */                return false;
                    }
/* 42 */            I0000oI00(this);
/* 45 */            return true;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    Object obj;
/* 7 */             iIOo0i01l iioo0i01l = iIOo0i01l.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 320 */               I000II.I00100l0();
/* 318 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 21 */            if (obj2 != null) {
/* 23 */                return I000O01llI0(obj2);
                    }
/* 40 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 45 */            if (nanos >= 1000) {
/* 47 */                iIOo0i01l iioo0i01l2 = this.I00iiO;
/* 49 */                if (iioo0i01l2 != iioo0i01l) {
/* 53 */                    iIOo0i01l iioo0i01l3 = new iIOo0i01l();
/* 56 */                    obj = null;
/* 119 */                   do {
/* 58 */                        liiOI1lOOIOO liioi1looioo = I00ilO0;
/* 60 */                        liioi1looioo.I0000Il00O(iioo0i01l3, iioo0i01l2);
/* 67 */                        if (liioi1looioo.I000II(this, iioo0i01l2, iioo0i01l3)) {
/* 104 */                           do {
/* 78 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 85 */                                if (Thread.interrupted()) {
/* 110 */                                   I000II(iioo0i01l3);
/* 113 */                                   I000II.I00100l0();
/* 56 */                                    return null;
                                        }
/* 87 */                                Object obj3 = this.I00iOIl;
/* 89 */                                if (obj3 != null) {
/* 91 */                                    return I000O01llI0(obj3);
                                        }
/* 100 */                               nanos = jNanoTime - System.nanoTime();
/* 104 */                           } while (nanos >= 1000);
/* 106 */                           I000II(iioo0i01l3);
                                } else {
/* 117 */                           iioo0i01l2 = this.I00iiO;
                                }
/* 119 */                   } while (iioo0i01l2 != iioo0i01l);
                        }
/* 121 */               Object obj4 = this.I00iOIl;
/* 123 */               Objects.requireNonNull(obj4);
/* 126 */               return I000O01llI0(obj4);
                    }
/* 131 */           obj = null;
/* 135 */           while (nanos > 0) {
/* 137 */               Object obj5 = this.I00iOIl;
/* 139 */               if (obj5 != null) {
/* 141 */                   return I000O01llI0(obj5);
                        }
/* 150 */               if (Thread.interrupted()) {
/* 159 */                   I000II.I00100l0();
/* 162 */                   return obj;
                        }
/* 156 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 163 */           String string = toString();
/* 167 */           String string2 = timeUnit.toString();
/* 171 */           Locale locale = Locale.ROOT;
/* 173 */           String lowerCase = string2.toLowerCase(locale);
/* 203 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 211 */           if (nanos + 1000 < 0) {
/* 215 */               String strConcat2 = strConcat.concat(" (plus ");
/* 219 */               long j2 = -nanos;
/* 222 */               long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
/* 230 */               long nanos2 = j2 - timeUnit.toNanos(jConvert);
/* 233 */               boolean z = true;
/* 234 */               if (jConvert != 0 && nanos2 <= 1000) {
/* 241 */                   z = false;
                        }
/* 242 */               if (jConvert > 0) {
/* 258 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 262 */                   if (z) {
/* 266 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 270 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 274 */               if (z) {
/* 278 */                   strConcat2 = IlIi0I0.I000l1(nanos2, strConcat2, " nanoseconds ");
                        }
/* 284 */               strConcat = strConcat2.concat("delay)");
                    }
/* 292 */           if (isDone()) {
/* 305 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 317 */           throw new TimeoutException(IlIi0I0.I000lI(strConcat, " for ", string));
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof iIOlili1;
                }

                @Override
                public final boolean isDone() {
                    return this.I00iOIl != null;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
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
/* 72 */            if (this.I00iOIl instanceof iIOlili1) {
/* 76 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 86 */                I0000O(sb);
                    } else {
/* 90 */                int length = sb.length();
/* 96 */                sb.append("PENDING");
                        try {
/* 99 */                    strConcat = I00000oIO();
                        } catch (Exception | StackOverflowError e) {
/* 125 */                   strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
                        }
/* 104 */               if (strConcat != null) {
/* 110 */                   if (strConcat.isEmpty()) {
/* 112 */                       strConcat = null;
                            }
/* 129 */                   if (strConcat != null) {
/* 133 */                       sb.append(", info=[");
/* 136 */                       sb.append(strConcat);
/* 139 */                       sb.append("]");
                            }
/* 146 */                   if (isDone()) {
/* 152 */                       sb.delete(length, sb.length());
/* 155 */                       I0000O(sb);
                            }
                        }
                    }
/* 158 */           sb.append("]");
/* 161 */           return sb.toString();
                }

/* 19 */        public void I00000oOI() {
                }

                @Override
/* 323 */       public final Object get() throws InterruptedException {
                    Object obj;
/* 324 */           iIOo0i01l iioo0i01l = iIOo0i01l.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 325 */               Object obj2 = this.I00iOIl;
                        if (obj2 != null) {
/* 326 */                   return I000O01llI0(obj2);
                        }
                        iIOo0i01l iioo0i01l2 = this.I00iiO;
                        if (iioo0i01l2 != iioo0i01l) {
/* 327 */                   iIOo0i01l iioo0i01l3 = new iIOo0i01l();
                            do {
                                liiOI1lOOIOO liioi1looioo = I00ilO0;
/* 328 */                       liioi1looioo.I0000Il00O(iioo0i01l3, iioo0i01l2);
/* 329 */                       if (liioi1looioo.I000II(this, iioo0i01l2, iioo0i01l3)) {
                                    do {
/* 330 */                               LockSupport.park(this);
/* 331 */                               if (!Thread.interrupted()) {
/* 332 */                                   obj = this.I00iOIl;
                                        } else {
/* 334 */                                   I000II(iioo0i01l3);
/* 335 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (obj == null);
/* 333 */                           return I000O01llI0(obj);
                                }
/* 336 */                       iioo0i01l2 = this.I00iiO;
                            } while (iioo0i01l2 != iioo0i01l);
                        }
                        Object obj3 = this.I00iOIl;
/* 337 */               Objects.requireNonNull(obj3);
                        return I000O01llI0(obj3);
                    }
/* 338 */           I000II.I00100l0();
                    return null;
                }
            }

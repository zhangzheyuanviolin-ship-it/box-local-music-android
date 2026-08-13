            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.Objects;
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
            
/* 18 */    public abstract class iliIlI0o00ii implements Future {
                public static final boolean I00iio;
                public static final O0o0ill01o0 I00ilI0I1;
                public static final lio0Oolo1li1 I00ilO0;
                public static final Object I00io1l;
                public volatile Object I00iOIl;
                public volatile ili1II I00iiI;
                public volatile ili1iI1O0lIl I00iiO;

                static {
                    boolean z;
                    lio0Oolo1li1 ili1o1il110;
                    Throwable th;
                    Throwable th2;
                    lio0Oolo1li1 ili1ooo1o1;
                    try {
/* 9 */                 z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 14 */                z = false;
                    }
/* 15 */            I00iio = z;
/* 25 */            I00ilI0I1 = new O0o0ill01o0(3, iliIlI0o00ii.class);
/* 27 */            Throwable th3 = null;
                    try {
/* 33 */                th = null;
/* 34 */                th2 = null;
/* 30 */                ili1ooo1o1 = new ili1OoO1O1();
                    } catch (Error | Exception e) {
                        try {
/* 46 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(ili1iI1O0lIl.class, Thread.class, "I00000oIO");
/* 52 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(ili1iI1O0lIl.class, ili1iI1O0lIl.class, "I00000oOI");
/* 58 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(iliIlI0o00ii.class, ili1iI1O0lIl.class, "I00iiO");
/* 66 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(iliIlI0o00ii.class, ili1II.class, "I00iiI");
/* 74 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(iliIlI0o00ii.class, Object.class, "I00iOIl");
/* 78 */                    ili1IOi ili1ioi = new ili1IOi();
/* 81 */                    ili1ioi.I00000oIO = atomicReferenceFieldUpdaterNewUpdater;
/* 83 */                    ili1ioi.I00000oOI = atomicReferenceFieldUpdaterNewUpdater2;
/* 85 */                    ili1ioi.I0000Il00O = atomicReferenceFieldUpdaterNewUpdater3;
/* 87 */                    ili1ioi.I0000O = atomicReferenceFieldUpdaterNewUpdater4;
/* 89 */                    ili1ioi.I0000oI00 = atomicReferenceFieldUpdaterNewUpdater5;
/* 91 */                    VarHandle.storeStoreFence();
                            ili1o1il110 = ili1ioi;
                        } catch (Error | Exception e2) {
/* 97 */                    th3 = e2;
/* 103 */                   ili1o1il110 = new ili1O1il110();
                        }
/* 94 */                th = th3;
/* 95 */                th2 = e;
                        ili1ooo1o1 = ili1o1il110;
                    }
/* 107 */           I00ilO0 = ili1ooo1o1;
/* 109 */           if (th != null) {
/* 111 */               O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 113 */               Logger loggerI00000oOI = o0o0ill01o0.I00000oOI();
/* 117 */               Level level = Level.SEVERE;
/* 126 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 139 */               o0o0ill01o0.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
                    }
/* 147 */           I00io1l = new Object();
                }

                public static void I0000O(iliIlI0o00ii iliili0o00ii) {
/* 8 */             for (ili1iI1O0lIl ili1ii1o0lilI00000oOI = I00ilO0.I00000oOI(iliili0o00ii); ili1ii1o0lilI00000oOI != null; ili1ii1o0lilI00000oOI = ili1ii1o0lilI00000oOI.I00000oOI) {
/* 10 */                Thread thread = ili1ii1o0lilI00000oOI.I00000oIO;
/* 12 */                if (thread != null) {
/* 14 */                    ili1ii1o0lilI00000oOI.I00000oIO = null;
/* 16 */                    LockSupport.unpark(thread);
                        }
                    }
/* 22 */            iliili0o00ii.I00000oOI();
/* 25 */            lio0Oolo1li1 lio0oolo1li1 = I00ilO0;
/* 27 */            ili1II ili1ii = ili1II.I0000O;
/* 29 */            ili1II ili1iiI00000oIO = lio0oolo1li1.I00000oIO(iliili0o00ii);
/* 33 */            ili1II ili1ii2 = null;
/* 34 */            while (ili1iiI00000oIO != null) {
/* 36 */                ili1II ili1ii3 = ili1iiI00000oIO.I0000Il00O;
/* 38 */                ili1iiI00000oIO.I0000Il00O = ili1ii2;
/* 40 */                ili1ii2 = ili1iiI00000oIO;
/* 41 */                ili1iiI00000oIO = ili1ii3;
                    }
/* 43 */            while (ili1ii2 != null) {
/* 45 */                Runnable runnable = ili1ii2.I00000oIO;
/* 47 */                ili1II ili1ii4 = ili1ii2.I0000Il00O;
/* 49 */                Objects.requireNonNull(runnable);
/* 54 */                if (runnable instanceof ili1Il1O) {
/* 66 */                    throw null;
                        }
/* 56 */                Executor executor = ili1ii2.I00000oOI;
/* 58 */                Objects.requireNonNull(executor);
/* 61 */                I0000oI00(runnable, executor);
/* 64 */                ili1ii2 = ili1ii4;
                    }
                }

                public static void I0000oI00(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 35 */                I00ilI0I1.I00000oOI().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", IIl001iO0Io.I000oI1ioi("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                public static final Object I000II(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof ili10OI0) {
/* 27 */                Throwable th = ((ili10OI0) obj).I00000oOI;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof ili1I1o00I0) {
/* 24 */                throw new ExecutionException(((ili1I1o00I0) obj).I00000oIO);
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

                public final void I0000Il00O(StringBuilder sb) {
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

                public final void I0001Ioi1lo(ili1iI1O0lIl ili1ii1o0lil) {
/* 2 */             ili1ii1o0lil.I00000oIO = null;
                    while (true) {
/* 4 */                 ili1iI1O0lIl ili1ii1o0lil2 = this.I00iiO;
/* 8 */                 if (ili1ii1o0lil2 != ili1iI1O0lIl.I0000Il00O) {
/* 10 */                    ili1iI1O0lIl ili1ii1o0lil3 = null;
/* 11 */                    while (ili1ii1o0lil2 != null) {
/* 13 */                        ili1iI1O0lIl ili1ii1o0lil4 = ili1ii1o0lil2.I00000oOI;
/* 17 */                        if (ili1ii1o0lil2.I00000oIO != null) {
/* 19 */                            ili1ii1o0lil3 = ili1ii1o0lil2;
                                } else if (ili1ii1o0lil3 != null) {
/* 23 */                            ili1ii1o0lil3.I00000oOI = ili1ii1o0lil4;
/* 27 */                            if (ili1ii1o0lil3.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00ilO0.I000II(this, ili1ii1o0lil2, ili1ii1o0lil4)) {
                                    break;
                                }
/* 39 */                        ili1ii1o0lil2 = ili1ii1o0lil4;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                @Override
                public final boolean cancel(boolean z) {
                    ili10OI0 ili10oi0;
/* 1 */             Object obj = this.I00iOIl;
/* 13 */            if ((obj instanceof ili1Il1O) | (obj == null)) {
/* 17 */                if (I00iio) {
/* 28 */                    ili10oi0 = new ili10OI0(z, new CancellationException("Future.cancel() was called."));
                        } else {
/* 38 */                    ili10oi0 = z ? ili10OI0.I0000Il00O : ili10OI0.I0000O;
/* 41 */                    Objects.requireNonNull(ili10oi0);
                        }
/* 50 */                while (!I00ilO0.I0001Ioi1lo(this, obj, ili10oi0)) {
/* 56 */                    obj = this.I00iOIl;
/* 60 */                    if (!(obj instanceof ili1Il1O)) {
                            }
                        }
/* 52 */                I0000O(this);
/* 6 */                 return true;
                    }
/* 5 */             return false;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    boolean z;
                    long j2;
                    Object obj;
/* 7 */             ili1iI1O0lIl ili1ii1o0lil = ili1iI1O0lIl.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 362 */               I000II.I00100l0();
/* 360 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 21 */            boolean z2 = true;
/* 31 */            if ((obj2 != null) && (!(obj2 instanceof ili1Il1O))) {
/* 33 */                return I000II(obj2);
                    }
/* 38 */            long j3 = 0;
/* 50 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 55 */            if (nanos >= 1000) {
/* 57 */                ili1iI1O0lIl ili1ii1o0lil2 = this.I00iiO;
/* 59 */                if (ili1ii1o0lil2 != ili1ii1o0lil) {
/* 61 */                    obj = null;
/* 65 */                    ili1iI1O0lIl ili1ii1o0lil3 = new ili1iI1O0lIl();
                            while (true) {
/* 68 */                        lio0Oolo1li1 lio0oolo1li1 = I00ilO0;
/* 70 */                        lio0oolo1li1.I0000Il00O(ili1ii1o0lil3, ili1ii1o0lil2);
/* 77 */                        if (lio0oolo1li1.I000II(this, ili1ii1o0lil2, ili1ii1o0lil3)) {
/* 79 */                            z = z2;
/* 80 */                            j2 = j3;
/* 126 */                           do {
/* 91 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 98 */                                if (Thread.interrupted()) {
/* 132 */                                   I0001Ioi1lo(ili1ii1o0lil3);
/* 135 */                                   I000II.I00100l0();
/* 61 */                                    return null;
                                        }
/* 100 */                               Object obj3 = this.I00iOIl;
/* 111 */                               if ((obj3 != null ? z : false) && ((obj3 instanceof ili1Il1O) ^ z)) {
/* 113 */                                   return I000II(obj3);
                                        }
/* 122 */                               nanos = jNanoTime - System.nanoTime();
/* 126 */                           } while (nanos >= 1000);
/* 128 */                           I0001Ioi1lo(ili1ii1o0lil3);
                                } else {
/* 139 */                           boolean z3 = z2;
/* 140 */                           long j4 = j3;
/* 142 */                           ili1iI1O0lIl ili1ii1o0lil4 = this.I00iiO;
/* 144 */                           if (ili1ii1o0lil4 == ili1ii1o0lil) {
                                        break;
                                    }
/* 147 */                           z2 = z3;
/* 148 */                           ili1ii1o0lil2 = ili1ii1o0lil4;
/* 149 */                           j3 = j4;
                                }
                            }
                        }
/* 152 */               Object obj4 = this.I00iOIl;
/* 154 */               Objects.requireNonNull(obj4);
/* 157 */               return I000II(obj4);
                    }
/* 162 */           z = true;
/* 163 */           j2 = 0;
/* 165 */           obj = null;
/* 169 */           while (nanos > j2) {
/* 171 */               Object obj5 = this.I00iOIl;
/* 182 */               if ((obj5 != null ? z : false) && ((obj5 instanceof ili1Il1O) ^ z)) {
/* 184 */                   return I000II(obj5);
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
/* 246 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 254 */           if (nanos + 1000 < j2) {
/* 258 */               String strConcat2 = strConcat.concat(" (plus ");
/* 262 */               long j5 = -nanos;
/* 265 */               long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
/* 273 */               long nanos2 = j5 - timeUnit.toNanos(jConvert);
/* 276 */               if (jConvert != j2 && nanos2 <= 1000) {
/* 283 */                   z = false;
                        }
/* 284 */               if (jConvert > j2) {
/* 300 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 304 */                   if (z) {
/* 308 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 312 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 316 */               if (z) {
/* 320 */                   strConcat2 = IlIi0I0.I000l1(nanos2, strConcat2, " nanoseconds ");
                        }
/* 326 */               strConcat = strConcat2.concat("delay)");
                    }
/* 334 */           if (isDone()) {
/* 347 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 359 */           throw new TimeoutException(IlIi0I0.I000lI(strConcat, " for ", string));
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof ili10OI0;
                }

                @Override
                public final boolean isDone() {
/* 12 */            return (this.I00iOIl != null) & (!(r2 instanceof ili1Il1O));
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    String strI00000oIO;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 20 */            if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
/* 30 */                sb.append(getClass().getSimpleName());
                    } else {
/* 42 */                sb.append(getClass().getName());
                    }
/* 47 */            sb.append('@');
/* 58 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 63 */            sb.append("[status=");
/* 72 */            if (this.I00iOIl instanceof ili10OI0) {
/* 76 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 87 */                I0000Il00O(sb);
                    } else {
/* 92 */                int length = sb.length();
/* 98 */                sb.append("PENDING");
/* 105 */               String strConcat = null;
/* 108 */               if (this.I00iOIl instanceof ili1Il1O) {
/* 112 */                   sb.append(", setFuture=[");
                            try {
/* 115 */                       sb.append((Object) null);
                            } catch (Exception | StackOverflowError e) {
/* 120 */                       sb.append("Exception thrown from implementation: ");
/* 127 */                       sb.append(e.getClass());
                            }
/* 130 */                   sb.append("]");
                        } else {
                            try {
/* 134 */                       strI00000oIO = I00000oIO();
                            } catch (Exception | StackOverflowError e2) {
/* 165 */                       strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
                            }
/* 138 */                   if (strI00000oIO != null) {
/* 151 */                       boolean z = strI00000oIO.isEmpty();
/* 152 */                       if (!z) {
/* 155 */                           strConcat = strI00000oIO;
                                }
/* 169 */                       if (strConcat != null) {
/* 173 */                           sb.append(", info=[");
/* 176 */                           sb.append(strConcat);
/* 179 */                           sb.append("]");
                                }
                            }
                        }
/* 186 */               if (isDone()) {
/* 192 */                   sb.delete(length, sb.length());
/* 195 */                   I0000Il00O(sb);
                        }
                    }
/* 198 */           sb.append("]");
/* 201 */           return sb.toString();
                }

/* 19 */        public void I00000oOI() {
                }

                @Override
/* 365 */       public final Object get() throws InterruptedException {
                    Object obj;
/* 366 */           ili1iI1O0lIl ili1ii1o0lil = ili1iI1O0lIl.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 367 */               Object obj2 = this.I00iOIl;
                        if ((obj2 != null) & (!(obj2 instanceof ili1Il1O))) {
/* 368 */                   return I000II(obj2);
                        }
                        ili1iI1O0lIl ili1ii1o0lil2 = this.I00iiO;
                        if (ili1ii1o0lil2 != ili1ii1o0lil) {
/* 369 */                   ili1iI1O0lIl ili1ii1o0lil3 = new ili1iI1O0lIl();
                            do {
                                lio0Oolo1li1 lio0oolo1li1 = I00ilO0;
/* 370 */                       lio0oolo1li1.I0000Il00O(ili1ii1o0lil3, ili1ii1o0lil2);
/* 371 */                       if (lio0oolo1li1.I000II(this, ili1ii1o0lil2, ili1ii1o0lil3)) {
                                    do {
/* 372 */                               LockSupport.park(this);
/* 373 */                               if (!Thread.interrupted()) {
/* 374 */                                   obj = this.I00iOIl;
                                        } else {
/* 376 */                                   I0001Ioi1lo(ili1ii1o0lil3);
/* 377 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (!((obj != null) & (!(obj instanceof ili1Il1O))));
/* 375 */                           return I000II(obj);
                                }
/* 378 */                       ili1ii1o0lil2 = this.I00iiO;
                            } while (ili1ii1o0lil2 != ili1ii1o0lil);
                        }
                        Object obj3 = this.I00iOIl;
/* 379 */               Objects.requireNonNull(obj3);
                        return I000II(obj3);
                    }
/* 380 */           I000II.I00100l0();
                    return null;
                }
            }

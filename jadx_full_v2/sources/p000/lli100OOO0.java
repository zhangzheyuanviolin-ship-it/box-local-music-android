            package p000;

            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.locks.LockSupport;
            
/* 416 */   public final class lli100OOO0 extends iloOO0lI0llo {
                public o0IiOl I00ioIO;

                public static Object I00000oOI(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof ilo1oO) {
/* 27 */                Throwable th = ((ilo1oO) obj).I00000oIO;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof ilo1oo10Ili1) {
/* 24 */                throw new ExecutionException(((ilo1oo10Ili1) obj).I00000oIO);
                    }
/* 11 */            if (obj == iloOO0lI0llo.I00iio) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static Object I0000Il00O(lli100OOO0 lli100ooo0) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = lli100ooo0.get();
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

                public static void I0000O(lli100OOO0 lli100ooo0) {
/* 8 */             for (iloO01 iloo01I0000O = iloOO0lI0llo.I00io1l.I0000O(lli100ooo0); iloo01I0000O != null; iloo01I0000O = iloo01I0000O.I00000oOI) {
/* 10 */                Thread thread = iloo01I0000O.I00000oIO;
/* 12 */                if (thread != null) {
/* 14 */                    iloo01I0000O.I00000oIO = null;
/* 16 */                    LockSupport.unpark(thread);
                        }
                    }
/* 22 */            lli100ooo0.I00ioIO = null;
/* 26 */            iloI0IOOI iloi0iooiI0000oI00 = iloOO0lI0llo.I00io1l.I0000oI00(lli100ooo0);
/* 30 */            iloI0IOOI iloi0iooi = null;
/* 31 */            while (iloi0iooiI0000oI00 != null) {
/* 33 */                iloI0IOOI iloi0iooi2 = iloi0iooiI0000oI00.I00000oIO;
/* 35 */                iloi0iooiI0000oI00.I00000oIO = iloi0iooi;
/* 37 */                iloi0iooi = iloi0iooiI0000oI00;
/* 38 */                iloi0iooiI0000oI00 = iloi0iooi2;
                    }
/* 40 */            if (iloi0iooi != null) {
/* 77 */                throw null;
                    }
                }

                public final void I0000oI00(StringBuilder sb) {
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

                @Override
                public final boolean cancel(boolean z) {
                    ilo1oO ilo1oo;
/* 1 */             Object obj = this.I00iOIl;
/* 3 */             if (obj != null) {
/* 47 */                return false;
                    }
/* 7 */             if (iloOO0lI0llo.I00ilO0) {
/* 18 */                ilo1oo = new ilo1oO(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 28 */                ilo1oo = z ? ilo1oO.I00000oOI : ilo1oO.I0000Il00O;
/* 31 */                Objects.requireNonNull(ilo1oo);
                    }
/* 40 */            if (!iloOO0lI0llo.I00io1l.I0001Ioi1lo(this, obj, ilo1oo)) {
/* 47 */                return false;
                    }
/* 42 */            I0000O(this);
/* 45 */            return true;
                }

                public final Throwable exceptionNow() {
/* 1 */             Object obj = this.I00iOIl;
/* 5 */             if (obj instanceof ilo1oo10Ili1) {
/* 9 */                 return ((ilo1oo10Ili1) obj).I00000oIO;
                    }
/* 18 */            if (obj == null) {
/* 38 */                I000II.I001IO000("Task has not completed");
/* 17 */                return null;
                    }
/* 22 */            if (obj instanceof ilo1oO) {
/* 26 */                I000II.I001IO000("Task was cancelled");
/* 17 */                return null;
                    }
/* 32 */            I000II.I001IO000("Task completed with a result");
/* 17 */            return null;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    Object obj;
/* 7 */             iloO01 iloo01 = iloO01.I0000Il00O;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 414 */               I000II.I00100l0();
/* 412 */               return null;
                    }
/* 19 */            Object obj2 = this.I00iOIl;
/* 21 */            if (obj2 != null) {
/* 23 */                return I00000oOI(obj2);
                    }
/* 40 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 45 */            if (nanos >= 1000) {
/* 47 */                iloO01 iloo012 = this.I00iiO;
/* 49 */                if (iloo012 != iloo01) {
/* 53 */                    iloO01 iloo013 = new iloO01();
/* 56 */                    obj = null;
/* 119 */                   do {
/* 58 */                        lioI0I lioi0i = iloOO0lI0llo.I00io1l;
/* 60 */                        lioi0i.I00000oOI(iloo013, iloo012);
/* 67 */                        if (lioi0i.I0000Il00O(this, iloo012, iloo013)) {
/* 104 */                           do {
/* 78 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 85 */                                if (Thread.interrupted()) {
/* 110 */                                   I00000oIO(iloo013);
/* 113 */                                   I000II.I00100l0();
/* 56 */                                    return null;
                                        }
/* 87 */                                Object obj3 = this.I00iOIl;
/* 89 */                                if (obj3 != null) {
/* 91 */                                    return I00000oOI(obj3);
                                        }
/* 100 */                               nanos = jNanoTime - System.nanoTime();
/* 104 */                           } while (nanos >= 1000);
/* 106 */                           I00000oIO(iloo013);
                                } else {
/* 117 */                           iloo012 = this.I00iiO;
                                }
/* 119 */                   } while (iloo012 != iloo01);
                        }
/* 121 */               Object obj4 = this.I00iOIl;
/* 123 */               Objects.requireNonNull(obj4);
/* 126 */               return I00000oOI(obj4);
                    }
/* 131 */           obj = null;
/* 135 */           while (nanos > 0) {
/* 137 */               Object obj5 = this.I00iOIl;
/* 139 */               if (obj5 != null) {
/* 141 */                   return I00000oOI(obj5);
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
/* 181 */           String lowerCase2 = timeUnit.toString().toLowerCase(locale);
/* 206 */           StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
/* 211 */           sb.append("Waited ");
/* 214 */           sb.append(j);
/* 219 */           sb.append(" ");
/* 222 */           sb.append(lowerCase2);
/* 225 */           String string3 = sb.toString();
/* 233 */           if (nanos + 1000 < 0) {
/* 237 */               String strConcat = string3.concat(" (plus ");
/* 241 */               long j2 = -nanos;
/* 244 */               long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
/* 252 */               long nanos2 = j2 - timeUnit.toNanos(jConvert);
/* 264 */               boolean z = jConvert == 0 || nanos2 > 1000;
/* 265 */               if (jConvert > 0) {
/* 292 */                   StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
/* 295 */                   sb2.append(strConcat);
/* 298 */                   sb2.append(jConvert);
/* 301 */                   sb2.append(" ");
/* 304 */                   sb2.append(lowerCase);
/* 307 */                   String string4 = sb2.toString();
/* 311 */                   if (z) {
/* 315 */                       string4 = string4.concat(",");
                            }
/* 319 */                   strConcat = string4.concat(" ");
                        }
/* 323 */               if (z) {
/* 342 */                   StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
/* 345 */                   sb3.append(strConcat);
/* 348 */                   sb3.append(nanos2);
/* 353 */                   sb3.append(" nanoseconds ");
/* 356 */                   strConcat = sb3.toString();
                        }
/* 362 */               string3 = strConcat.concat("delay)");
                    }
/* 370 */           if (isDone()) {
/* 383 */               throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
                    }
/* 411 */           throw new TimeoutException(IIlIOloOOO.I0010I0i(new StringBuilder(string3.length() + 5 + string.length()), string3, " for ", string));
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iOIl instanceof ilo1oO;
                }

                @Override
                public final boolean isDone() {
                    return this.I00iOIl != null;
                }

                public final Object resultNow() {
/* 1 */             Object obj = this.I00iOIl;
/* 9 */             if (obj == null) {
/* 39 */                I000II.I001IO000("Task has not completed");
/* 8 */                 return null;
                    }
/* 13 */            if (obj instanceof ilo1oo10Ili1) {
/* 33 */                I000II.I001IO000("Task completed with exception");
/* 8 */                 return null;
                    }
/* 17 */            if (obj instanceof ilo1oO) {
/* 27 */                I000II.I001IO000("Task was cancelled");
/* 8 */                 return null;
                    }
/* 21 */            if (obj == iloOO0lI0llo.I00iio) {
/* 8 */                 return null;
                    }
/* 24 */            return obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    String strConcat;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 18 */            if (lli100OOO0.class.getName().startsWith("com.google.common.util.concurrent.")) {
/* 24 */                sb.append(lli100OOO0.class.getSimpleName());
                    } else {
/* 32 */                sb.append(lli100OOO0.class.getName());
                    }
/* 37 */            sb.append('@');
/* 48 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 53 */            sb.append("[status=");
/* 62 */            if (this.I00iOIl instanceof ilo1oO) {
/* 66 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 76 */                I0000oI00(sb);
                    } else {
/* 80 */                int length = sb.length();
/* 86 */                sb.append("PENDING");
                        try {
/* 89 */                    o0IiOl o0iiol = this.I00ioIO;
/* 96 */                    strConcat = o0iiol == null ? "" : o0iiol.toString();
                        } catch (Throwable th) {
/* 114 */                   if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
/* 123 */                       throw th;
                            }
/* 134 */                   strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
                        }
/* 101 */               if (strConcat != null) {
/* 107 */                   if (strConcat.isEmpty()) {
/* 109 */                       strConcat = null;
                            }
/* 138 */                   if (strConcat != null) {
/* 142 */                       sb.append(", info=[");
/* 145 */                       sb.append(strConcat);
/* 148 */                       sb.append("]");
                            }
/* 155 */                   if (isDone()) {
/* 161 */                       sb.delete(length, sb.length());
/* 164 */                       I0000oI00(sb);
                            }
                        }
                    }
/* 167 */           sb.append("]");
/* 170 */           return sb.toString();
                }

                @Override
/* 417 */       public final Object get() throws InterruptedException {
                    Object obj;
/* 418 */           iloO01 iloo01 = iloO01.I0000Il00O;
                    if (!Thread.interrupted()) {
/* 419 */               Object obj2 = this.I00iOIl;
                        if (obj2 != null) {
/* 420 */                   return I00000oOI(obj2);
                        }
                        iloO01 iloo012 = this.I00iiO;
                        if (iloo012 != iloo01) {
/* 421 */                   iloO01 iloo013 = new iloO01();
                            do {
                                lioI0I lioi0i = iloOO0lI0llo.I00io1l;
/* 422 */                       lioi0i.I00000oOI(iloo013, iloo012);
/* 423 */                       if (lioi0i.I0000Il00O(this, iloo012, iloo013)) {
                                    do {
/* 424 */                               LockSupport.park(this);
/* 425 */                               if (!Thread.interrupted()) {
/* 426 */                                   obj = this.I00iOIl;
                                        } else {
/* 428 */                                   I00000oIO(iloo013);
/* 429 */                                   I000II.I00100l0();
                                            return null;
                                        }
                                    } while (obj == null);
/* 427 */                           return I00000oOI(obj);
                                }
/* 430 */                       iloo012 = this.I00iiO;
                            } while (iloo012 != iloo01);
                        }
                        Object obj3 = this.I00iOIl;
/* 431 */               Objects.requireNonNull(obj3);
                        return I00000oOI(obj3);
                    }
/* 432 */           I000II.I00100l0();
                    return null;
                }
            }

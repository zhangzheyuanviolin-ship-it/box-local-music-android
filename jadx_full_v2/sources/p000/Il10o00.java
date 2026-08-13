            package p000;

            import java.util.concurrent.locks.LockSupport;
            import sun.misc.Unsafe;
            
            public abstract class Il10o00 extends Ii00lIOoi implements IiIiOllooO {
                public static final long I00ilI0I1;
                public static final long I00ilO0;
                public static final long I00io1l;
                public static final int I00ioIO = 0;
                public long I00iiI;
                public boolean I00iiO;
                public I1Il0loi I00iio;
                private volatile Object _delayed$volatile;
                private volatile int _isCompleted$volatile;
                private volatile Object _queue$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I00io1l = unsafe.objectFieldOffset(Il10o00.class.getDeclaredField("_queue$volatile"));
/* 27 */            I00ilI0I1 = unsafe.objectFieldOffset(Il10o00.class.getDeclaredField("_delayed$volatile"));
/* 39 */            I00ilO0 = unsafe.objectFieldOffset(Il10o00.class.getDeclaredField("_isCompleted$volatile"));
                }

                @Override
                public final void I000l1(long j, IIoOoIol0Io0 iIoOoIol0Io0) {
/* 26 */            long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
/* 34 */            if (j2 < 4611686018427387903L) {
/* 36 */                long jNanoTime = System.nanoTime();
/* 43 */                Il10l1I1 il10l1I1 = new Il10l1I1(this, j2 + jNanoTime, iIoOoIol0Io0);
/* 46 */                I010l10O(jNanoTime, il10l1I1);
/* 49 */                iOl0iOoIl.I00000oIO(iIoOoIol0Io0, il10l1I1);
                    }
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
/* 1 */             I0100i(runnable);
                }

                public final void I00ooiO1I(boolean z) {
/* 13 */            long j = this.I00iiI - (z ? 4294967296L : 1L);
/* 14 */            this.I00iiI = j;
/* 20 */            if (j <= 0 && this.I00iiO) {
/* 27 */                shutdown();
                    }
                }

                public final void I00oooO(IiiIIOii iiiIIOii) {
/* 1 */             I1Il0loi i1Il0loi = this.I00iio;
/* 3 */             if (i1Il0loi == null) {
/* 7 */                 i1Il0loi = new I1Il0loi();
/* 10 */                this.I00iio = i1Il0loi;
                    }
/* 12 */            i1Il0loi.addLast(iiiIIOii);
                }

                public void I0100i(Runnable runnable) {
/* 1 */             I0100o111I();
/* 8 */             if (!I010101Oo1lO(runnable)) {
/* 26 */                Ii1o00O.I00l0I0l0lO1.I0100i(runnable);
/* 49 */                return;
                    }
/* 10 */            Thread threadI010I0 = I010I0();
/* 18 */            if (Thread.currentThread() != threadI010I0) {
/* 20 */                LockSupport.unpark(threadI010I0);
                    }
                }

                public final void I0100o111I() {
                    Il10lO il10lOI0000Il00O;
/* 9 */             Il10li0OlI il10li0OlI = (Il10li0OlI) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00ilI0I1);
/* 11 */            if (il10li0OlI == null || il10li0OlI.I00000oOI() == 0) {
/* 19 */                return;
                    }
/* 20 */            long jNanoTime = System.nanoTime();
/* 64 */            do {
                        synchronized (il10li0OlI) {
                            try {
/* 25 */                        Il10lO[] il10lOArr = il10li0OlI.I00000oIO;
/* 27 */                        il10lOI0000Il00O = null;
/* 34 */                        Il10lO il10lO = il10lOArr != null ? il10lOArr[0] : null;
/* 35 */                        if (il10lO != null) {
/* 57 */                            if (jNanoTime - il10lO.I00iOIl >= 0 ? I010101Oo1lO(il10lO) : false) {
/* 59 */                                il10lOI0000Il00O = il10li0OlI.I0000Il00O(0);
                                    }
                                }
                            } catch (Throwable th) {
/* 68 */                        throw th;
                            }
                        }
/* 64 */            } while (il10lOI0000Il00O != null);
                }

                public final boolean I010101Oo1lO(Runnable runnable) {
                    Il10o00 il10o00;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00io1l;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 16 */                if (unsafe.getIntVolatile(this, I00ilO0) == 1) {
/* 63 */                    return false;
                        }
/* 19 */                if (objectVolatile == null) {
/* 22 */                    il10o00 = this;
/* 28 */                    if (unsafe.compareAndSwapObject(il10o00, j, (Object) null, runnable)) {
                                break;
                            }
/* 88 */                    this = il10o00;
                        } else {
/* 31 */                    il10o00 = this;
/* 34 */                    if (objectVolatile instanceof O1I0l0iol) {
/* 37 */                        O1I0l0iol o1I0l0iol = (O1I0l0iol) objectVolatile;
/* 39 */                        int iI00000oIO = o1I0l0iol.I00000oIO(runnable);
/* 43 */                        if (iI00000oIO == 0) {
                                    break;
                                }
/* 45 */                        if (iI00000oIO == 1) {
/* 55 */                            unsafe.compareAndSwapObject(il10o00, j, objectVolatile, o1I0l0iol.I0000Il00O());
                                } else if (iI00000oIO == 2) {
/* 63 */                            return false;
                                }
/* 88 */                        this = il10o00;
                            } else {
/* 61 */                        if (objectVolatile == Il10o001OloI.I00000oOI) {
/* 63 */                            return false;
                                }
/* 69 */                        O1I0l0iol o1I0l0iol2 = new O1I0l0iol(8, true);
/* 75 */                        o1I0l0iol2.I00000oIO((Runnable) objectVolatile);
/* 78 */                        o1I0l0iol2.I00000oIO(runnable);
/* 85 */                        if (unsafe.compareAndSwapObject(il10o00, j, objectVolatile, o1I0l0iol2)) {
                                    break;
                                }
/* 88 */                        this = il10o00;
                            }
                        }
                    }
/* 15 */            return true;
                }

                public abstract Thread I010I0();

                public final void I010II(boolean z) {
/* 14 */            this.I00iiI = (z ? 4294967296L : 1L) + this.I00iiI;
/* 16 */            if (z) {
/* 49 */                return;
                    }
/* 19 */            this.I00iiO = true;
                }

                public final boolean I010OIo1l() {
/* 1 */             I1Il0loi i1Il0loi = this.I00iio;
/* 13 */            if (i1Il0loi != null ? i1Il0loi.isEmpty() : true) {
/* 16 */                Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 24 */                Il10li0OlI il10li0OlI = (Il10li0OlI) unsafe.getObjectVolatile(this, I00ilI0I1);
/* 26 */                if (il10li0OlI != null && il10li0OlI.I00000oOI() != 0) {
/* 12 */                    return false;
                        }
/* 38 */                Object objectVolatile = unsafe.getObjectVolatile(this, I00io1l);
/* 42 */                if (objectVolatile != null) {
/* 47 */                    if (objectVolatile instanceof O1I0l0iol) {
/* 53 */                        long longVolatile = unsafe.getLongVolatile((O1I0l0iol) objectVolatile, O1I0l0iol.I000II);
                                return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                            }
/* 78 */                    if (objectVolatile == Il10o001OloI.I00000oOI) {
                            }
                        }
/* 3 */                 return true;
                    }
/* 12 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
                
                    r9 = null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I010i10l() {
                    Unsafe unsafe;
                    long j;
                    Il10o00 il10o00;
                    Runnable runnable;
                    Il10lO il10lO;
/* 1 */             I0OooiI1I i0OooiI1I = Il10o001OloI.I00000oOI;
/* 9 */             if (!I010iIIOlo()) {
/* 13 */                I0100o111I();
                        while (true) {
/* 16 */                    unsafe = I1Ioolli0l0o.I00000oIO;
/* 18 */                    j = I00io1l;
/* 20 */                    Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 25 */                    if (objectVolatile == null) {
/* 27 */                        il10o00 = this;
                                break;
                            }
/* 32 */                    if (objectVolatile instanceof O1I0l0iol) {
/* 35 */                        O1I0l0iol o1I0l0iol = (O1I0l0iol) objectVolatile;
/* 37 */                        Object objI0000O = o1I0l0iol.I0000O();
/* 43 */                        if (objI0000O != O1I0l0iol.I0000oI00) {
/* 45 */                            runnable = (Runnable) objI0000O;
/* 47 */                            il10o00 = this;
                                    break;
                                }
/* 49 */                        O1I0l0iol o1I0l0iolI0000Il00O = o1I0l0iol.I0000Il00O();
/* 53 */                        il10o00 = this;
/* 54 */                        unsafe.compareAndSwapObject(il10o00, j, objectVolatile, o1I0l0iolI0000Il00O);
/* 184 */                       this = il10o00;
                            } else {
/* 59 */                        il10o00 = this;
/* 60 */                        if (objectVolatile == i0OooiI1I) {
                                    break;
                                }
/* 68 */                        if (unsafe.compareAndSwapObject(il10o00, j, objectVolatile, (Object) null)) {
/* 71 */                            runnable = (Runnable) objectVolatile;
                                    break;
                                }
/* 184 */                       this = il10o00;
                            }
                        }
/* 73 */                if (runnable != null) {
/* 75 */                    runnable.run();
/* 7 */                     return 0L;
                        }
/* 79 */                I1Il0loi i1Il0loi = il10o00.I00iio;
/* 100 */               if (((i1Il0loi == null || i1Il0loi.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
/* 103 */                   Object objectVolatile2 = unsafe.getObjectVolatile(il10o00, j);
/* 107 */                   if (objectVolatile2 != null) {
/* 111 */                       if (objectVolatile2 instanceof O1I0l0iol) {
/* 117 */                           long longVolatile = unsafe.getLongVolatile((O1I0l0iol) objectVolatile2, O1I0l0iol.I000II);
/* 136 */                           if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
/* 7 */                                 return 0L;
                                    }
                                } else if (objectVolatile2 == i0OooiI1I) {
/* 81 */                            return Long.MAX_VALUE;
                                }
                            }
/* 149 */                   Il10li0OlI il10li0OlI = (Il10li0OlI) unsafe.getObjectVolatile(il10o00, I00ilI0I1);
/* 151 */                   if (il10li0OlI != null) {
                                synchronized (il10li0OlI) {
/* 154 */                           Il10lO[] il10lOArr = il10li0OlI.I00000oIO;
/* 159 */                           il10lO = il10lOArr != null ? il10lOArr[0] : null;
                                }
/* 165 */                       if (il10lO != null) {
/* 174 */                           long jNanoTime = il10lO.I00iOIl - System.nanoTime();
/* 177 */                           if (jNanoTime >= 0) {
/* 180 */                               return jNanoTime;
                                    }
                                }
                            }
/* 81 */                    return Long.MAX_VALUE;
                        }
                    }
/* 7 */             return 0L;
                }

                public final boolean I010iIIOlo() {
/* 1 */             I1Il0loi i1Il0loi = this.I00iio;
/* 3 */             if (i1Il0loi == null) {
/* 22 */                return false;
                    }
/* 18 */            IiiIIOii iiiIIOii = (IiiIIOii) (i1Il0loi.isEmpty() ? null : i1Il0loi.removeFirst());
/* 20 */            if (iiiIIOii == null) {
/* 22 */                return false;
                    }
/* 24 */            iiiIIOii.run();
/* 27 */            return true;
                }

                public void I010ioo(long j, Il10lO il10lO) {
/* 3 */             Ii1o00O.I00l0I0l0lO1.I010l10O(j, il10lO);
                }

                public final void I010l10O(long j, Il10lO il10lO) {
                    int iI0000Il00O;
                    Thread threadI010I0;
/* 1 */             long j2 = I00ilI0I1;
/* 3 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 12 */            if (unsafe.getIntVolatile(this, I00ilO0) == 1) {
/* 14 */                iI0000Il00O = 1;
                    } else {
/* 20 */                Il10li0OlI il10li0OlI = (Il10li0OlI) unsafe.getObjectVolatile(this, j2);
/* 22 */                if (il10li0OlI == null) {
/* 26 */                    Il10li0OlI il10li0OlI2 = new Il10li0OlI();
/* 29 */                    il10li0OlI2.I0000Il00O = j;
/* 33 */                    unsafe.compareAndSwapObject(this, j2, (Object) null, il10li0OlI2);
/* 40 */                    il10li0OlI = (Il10li0OlI) unsafe.getObjectVolatile(this, j2);
                        }
/* 42 */                iI0000Il00O = il10lO.I0000Il00O(j, il10li0OlI, this);
                    }
/* 46 */            if (iI0000Il00O != 0) {
/* 48 */                if (iI0000Il00O == 1) {
/* 60 */                    I010ioo(j, il10lO);
/* 63 */                    return;
                        } else {
/* 51 */                    if (iI0000Il00O == 2) {
/* 551 */                       return;
                            }
/* 56 */                    I000II.I001IO000("unexpected result");
/* 59 */                    return;
                        }
                    }
/* 68 */            Il10li0OlI il10li0OlI3 = (Il10li0OlI) unsafe.getObjectVolatile(this, j2);
/* 71 */            if (il10li0OlI3 != null) {
                        synchronized (il10li0OlI3) {
/* 74 */                    Il10lO[] il10lOArr = il10li0OlI3.I00000oIO;
/* 79 */                    il10lO = il10lOArr != null ? il10lOArr[0] : null;
                        }
                    }
/* 89 */            if (il10lO != il10lO || Thread.currentThread() == (threadI010I0 = I010I0())) {
/* 551 */               return;
                    }
/* 101 */           LockSupport.unpark(threadI010I0);
                }

                public void shutdown() {
                    I0OooiI1I i0OooiI1I;
                    Il10lO il10lOI0000Il00O;
/* 4 */             Oo100i0OO.I00000oIO.set(null);
/* 12 */            I1Ioolli0l0o.I00000oIO.putIntVolatile(this, I00ilO0, 1);
/* 15 */            I0OooiI1I i0OooiI1I2 = Il10o001OloI.I00000oOI;
                    while (true) {
/* 17 */                Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 19 */                long j = I00io1l;
/* 21 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 25 */                if (objectVolatile == null) {
/* 33 */                    i0OooiI1I = i0OooiI1I2;
/* 34 */                    if (unsafe.compareAndSwapObject(this, j, (Object) null, i0OooiI1I2)) {
                                break;
                            } else {
/* 125 */                       i0OooiI1I2 = i0OooiI1I;
                            }
                        } else {
/* 37 */                    i0OooiI1I = i0OooiI1I2;
/* 40 */                    if (objectVolatile instanceof O1I0l0iol) {
/* 44 */                        ((O1I0l0iol) objectVolatile).I00000oOI();
                                break;
                            } else {
/* 48 */                        if (objectVolatile == i0OooiI1I) {
                                    break;
                                }
/* 55 */                        O1I0l0iol o1I0l0iol = new O1I0l0iol(8, true);
/* 61 */                        o1I0l0iol.I00000oIO((Runnable) objectVolatile);
/* 69 */                        if (unsafe.compareAndSwapObject(this, j, objectVolatile, o1I0l0iol)) {
                                    break;
                                } else {
/* 125 */                           i0OooiI1I2 = i0OooiI1I;
                                }
                            }
                        }
                    }
/* 79 */            while (I010i10l() <= 0) {
                    }
/* 81 */            long jNanoTime = System.nanoTime();
                    while (true) {
/* 94 */                Il10li0OlI il10li0OlI = (Il10li0OlI) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00ilI0I1);
/* 96 */                if (il10li0OlI == null) {
/* 124 */                   return;
                        }
                        synchronized (il10li0OlI) {
/* 113 */                   il10lOI0000Il00O = il10li0OlI.I00000oOI() > 0 ? il10li0OlI.I0000Il00O(0) : null;
                        }
/* 115 */               if (il10lOI0000Il00O == null) {
/* 124 */                   return;
                        } else {
/* 118 */                   I010ioo(jNanoTime, il10lOI0000Il00O);
                        }
                    }
                }
            }

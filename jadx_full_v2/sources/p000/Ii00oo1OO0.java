            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import java.util.concurrent.locks.LockSupport;
            import sun.misc.Unsafe;
            
            public final class Ii00oo1OO0 extends Thread {
                public static final AtomicIntegerFieldUpdater I00l0I0l0lO1 = AtomicIntegerFieldUpdater.newUpdater(Ii00oo1OO0.class, "workerCtl$volatile");
                public static final long I00l0OO0IO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(Ii00oo1OO0.class.getDeclaredField("workerCtl$volatile"));
                public final i01OIoo0l1O I00iOIl;
                public final OOo0ooi I00iiI;
                public Ii010I1i I00iiO;
                public long I00iio;
                public long I00ilI0I1;
                public int I00ilO0;
                public boolean I00io1l;
                public final Ii010io1l I00ioIO;
                private volatile int indexInArray;
                private volatile Object nextParkedWorker;
                private volatile int workerCtl$volatile;

                public Ii00oo1OO0(Ii010io1l ii010io1l, int i) {
/* 1 */             this.I00ioIO = ii010io1l;
/* 7 */             setDaemon(true);
/* 16 */            setContextClassLoader(Ii010io1l.class.getClassLoader());
/* 21 */            i01OIoo0l1O i01oioo0l1o = new i01OIoo0l1O();
/* 31 */            i01oioo0l1o.I00000oIO = new AtomicReferenceArray(Barcode.FORMAT_ITF);
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            this.I00iOIl = i01oioo0l1o;
/* 43 */            this.I00iiI = new OOo0ooi();
/* 47 */            this.I00iiO = Ii010I1i.I00iio;
/* 51 */            this.nextParkedWorker = Ii010io1l.I00li1OI;
/* 57 */            int iNanoTime = (int) System.nanoTime();
/* 63 */            this.I00ilO0 = iNanoTime == 0 ? 42 : iNanoTime;
/* 65 */            I0001Ioi1lo(i);
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OloIOlo10 I00000oIO(boolean z) {
                    OloIOlo10 oloIOlo10I0000oI00;
                    OloIOlo10 oloIOlo10I0000oI002;
                    long j;
                    Unsafe unsafe;
                    long j2;
                    OloIOlo10 oloIOlo10;
/* 3 */             Ii010I1i ii010I1i = this.I00iiO;
/* 5 */             Ii010I1i ii010I1i2 = Ii010I1i.I00iOIl;
/* 7 */             Ii010io1l ii010io1l = this.I00ioIO;
/* 9 */             OloIOlo10 oloIOlo102 = null;
/* 11 */            i01OIoo0l1O i01oioo0l1o = this.I00iOIl;
/* 13 */            if (ii010I1i != ii010I1i2) {
/* 17 */                AtomicLongFieldUpdater atomicLongFieldUpdater = Ii010io1l.I00l0I0l0lO1;
/* 132 */               do {
/* 19 */                    j = atomicLongFieldUpdater.get(ii010io1l);
/* 33 */                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
/* 35 */                        i01oioo0l1o.getClass();
/* 62 */                        do {
/* 38 */                            unsafe = I1Ioolli0l0o.I00000oIO;
/* 40 */                            j2 = i01OIoo0l1O.I0001Ioi1lo;
/* 47 */                            oloIOlo10 = (OloIOlo10) unsafe.getObjectVolatile(i01oioo0l1o, j2);
/* 49 */                            if (oloIOlo10 == null || !oloIOlo10.I00iiI) {
/* 68 */                                int intVolatile = unsafe.getIntVolatile(i01oioo0l1o, i01OIoo0l1O.I0000oI00);
/* 74 */                                int intVolatile2 = unsafe.getIntVolatile(i01oioo0l1o, i01OIoo0l1O.I000II);
                                        while (true) {
/* 78 */                                    if (intVolatile == intVolatile2 || I1Ioolli0l0o.I00000oIO.getIntVolatile(i01oioo0l1o, i01OIoo0l1O.I0000O) == 0) {
                                                break;
                                            }
                                            intVolatile2--;
/* 93 */                                    OloIOlo10 oloIOlo10I0000O = i01oioo0l1o.I0000O(intVolatile2, true);
/* 97 */                                    if (oloIOlo10I0000O != null) {
/* 99 */                                        oloIOlo102 = oloIOlo10I0000O;
                                                break;
                                            }
                                        }
/* 100 */                               if (oloIOlo102 == null) {
/* 118 */                                   return oloIOlo102;
                                        }
/* 108 */                               OloIOlo10 oloIOlo103 = (OloIOlo10) ii010io1l.I00ilO0.I0000Il00O();
                                        return oloIOlo103 == null ? I000OOo1O(1) : oloIOlo103;
                                    }
/* 62 */                        } while (!unsafe.compareAndSwapObject(i01oioo0l1o, j2, oloIOlo10, (Object) null));
/* 64 */                        oloIOlo102 = oloIOlo10;
/* 100 */                       if (oloIOlo102 == null) {
                                }
                            }
/* 132 */               } while (!Ii010io1l.I00l0I0l0lO1.compareAndSet(ii010io1l, j, j - 4398046511104L));
/* 136 */               this.I00iiO = Ii010I1i.I00iOIl;
                    }
/* 138 */           if (z) {
/* 148 */               boolean z2 = I0000O(ii010io1l.I00iOIl * 2) == 0;
/* 152 */               if (z2 && (oloIOlo10I0000oI002 = I0000oI00()) != null) {
/* 160 */                   return oloIOlo10I0000oI002;
                        }
/* 161 */               i01oioo0l1o.getClass();
/* 172 */               OloIOlo10 oloIOlo10I0000Il00O = (OloIOlo10) I1Ioolli0l0o.I00000oIO.getAndSetObject(i01oioo0l1o, i01OIoo0l1O.I0001Ioi1lo, (Object) null);
/* 174 */               if (oloIOlo10I0000Il00O == null) {
/* 176 */                   oloIOlo10I0000Il00O = i01oioo0l1o.I0000Il00O();
                        }
/* 180 */               if (oloIOlo10I0000Il00O != null) {
/* 182 */                   return oloIOlo10I0000Il00O;
                        }
/* 183 */               if (!z2 && (oloIOlo10I0000oI00 = I0000oI00()) != null) {
/* 191 */                   return oloIOlo10I0000oI00;
                        }
                    } else {
/* 192 */               OloIOlo10 oloIOlo10I0000oI003 = I0000oI00();
/* 196 */               if (oloIOlo10I0000oI003 != null) {
/* 198 */                   return oloIOlo10I0000oI003;
                        }
                    }
/* 200 */           return I000OOo1O(3);
                }

                public final int I00000oOI() {
/* 1 */             return this.indexInArray;
                }

                public final Object I0000Il00O() {
/* 1 */             return this.nextParkedWorker;
                }

                public final int I0000O(int i) {
/* 1 */             int i2 = this.I00ilO0;
/* 5 */             int i3 = i2 ^ (i2 << 13);
/* 8 */             int i4 = i3 ^ (i3 >> 17);
/* 11 */            int i5 = i4 ^ (i4 << 5);
/* 12 */            this.I00ilO0 = i5;
                    int i6 = i - 1;
                    return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
                }

                public final OloIOlo10 I0000oI00() {
/* 2 */             int iI0000O = I0000O(2);
/* 6 */             Ii010io1l ii010io1l = this.I00ioIO;
/* 8 */             Io0Io1 io0Io1 = ii010io1l.I00ilO0;
/* 10 */            Io0Io1 io0Io12 = ii010io1l.I00ilI0I1;
/* 12 */            if (iI0000O == 0) {
/* 18 */                OloIOlo10 oloIOlo10 = (OloIOlo10) io0Io12.I0000Il00O();
                        return oloIOlo10 != null ? oloIOlo10 : (OloIOlo10) io0Io1.I0000Il00O();
                    }
/* 34 */            OloIOlo10 oloIOlo102 = (OloIOlo10) io0Io1.I0000Il00O();
                    return oloIOlo102 != null ? oloIOlo102 : (OloIOlo10) io0Io12.I0000Il00O();
                }

                public final void I0001Ioi1lo(int i) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(this.I00ioIO.I00iio);
/* 15 */            sb.append("-worker-");
/* 27 */            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
/* 34 */            setName(sb.toString());
/* 37 */            this.indexInArray = i;
                }

                public final void I000II(Object obj) {
/* 1 */             this.nextParkedWorker = obj;
                }

                public final boolean I000O01llI0(Ii010I1i ii010I1i) {
/* 1 */             Ii010I1i ii010I1i2 = this.I00iiO;
/* 9 */             boolean z = ii010I1i2 == Ii010I1i.I00iOIl;
/* 10 */            if (z) {
/* 21 */                Ii010io1l.I00l0I0l0lO1.addAndGet(this.I00ioIO, 4398046511104L);
                    }
/* 24 */            if (ii010I1i2 != ii010I1i) {
/* 26 */                this.I00iiO = ii010I1i;
                    }
/* 49 */            return z;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
                
                    r7 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
                
                    r1 = -2;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OloIOlo10 I000OOo1O(int i) {
                    int i2;
                    long j;
                    OloIOlo10 oloIOlo10I0000Il00O;
                    long j2;
                    long j3;
/* 3 */             int i3 = i;
/* 5 */             AtomicLongFieldUpdater atomicLongFieldUpdater = Ii010io1l.I00l0I0l0lO1;
/* 7 */             Ii010io1l ii010io1l = this.I00ioIO;
/* 17 */            int i4 = (int) (atomicLongFieldUpdater.get(ii010io1l) & 2097151);
/* 18 */            OloIOlo10 oloIOlo10 = null;
/* 20 */            if (i4 < 2) {
/* 18 */                return null;
                    }
/* 23 */            int iI0000O = I0000O(i4);
/* 27 */            int i5 = 0;
/* 28 */            long jMin = Long.MAX_VALUE;
/* 33 */            while (i5 < i4) {
/* 36 */                iI0000O++;
/* 37 */                if (iI0000O > i4) {
/* 39 */                    iI0000O = 1;
                        }
/* 46 */                Ii00oo1OO0 ii00oo1OO0 = (Ii00oo1OO0) ii010io1l.I00io1l.I00000oOI(iI0000O);
/* 48 */                if (ii00oo1OO0 == null || ii00oo1OO0 == this) {
/* 244 */                   i2 = i4;
                        } else {
/* 52 */                    i01OIoo0l1O i01oioo0l1o = ii00oo1OO0.I00iOIl;
/* 54 */                    i01oioo0l1o.getClass();
/* 58 */                    if (i3 != 3) {
/* 82 */                        boolean z = i3 == 1;
/* 84 */                        Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 86 */                        j = 0;
/* 90 */                        int intVolatile = unsafe.getIntVolatile(i01oioo0l1o, i01OIoo0l1O.I0000oI00);
/* 96 */                        int intVolatile2 = unsafe.getIntVolatile(i01oioo0l1o, i01OIoo0l1O.I000II);
                                while (true) {
/* 100 */                           if (intVolatile == intVolatile2) {
/* 133 */                               i2 = i4;
                                        break;
                                    }
/* 102 */                           if (z) {
/* 106 */                               i2 = i4;
/* 113 */                               if (I1Ioolli0l0o.I00000oIO.getIntVolatile(i01oioo0l1o, i01OIoo0l1O.I0000O) == 0) {
                                            break;
                                        }
                                    } else {
/* 117 */                               i2 = i4;
                                    }
/* 118 */                           int i6 = intVolatile + 1;
/* 120 */                           OloIOlo10 oloIOlo10I0000O = i01oioo0l1o.I0000O(intVolatile, z);
/* 124 */                           if (oloIOlo10I0000O != null) {
/* 131 */                               oloIOlo10I0000Il00O = oloIOlo10I0000O;
                                        break;
                                    }
/* 126 */                           intVolatile = i6;
/* 127 */                           i4 = i2;
                                }
                            } else {
/* 60 */                        oloIOlo10I0000Il00O = i01oioo0l1o.I0000Il00O();
/* 64 */                        i2 = i4;
/* 70 */                        j = 0;
                            }
/* 135 */                   OOo0ooi oOo0ooi = this.I00iiI;
/* 137 */                   if (oloIOlo10I0000Il00O == null) {
                                while (true) {
/* 146 */                           Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 148 */                           j2 = -1;
/* 150 */                           long j4 = i01OIoo0l1O.I0001Ioi1lo;
/* 156 */                           OloIOlo10 oloIOlo102 = (OloIOlo10) unsafe2.getObjectVolatile(i01oioo0l1o, j4);
/* 158 */                           if (oloIOlo102 == null) {
                                        break;
                                    }
/* 170 */                           if (((oloIOlo102.I00iiI ? 1 : 2) & i) == 0) {
                                        break;
                                    }
/* 177 */                           OloO11o0.I0001Ioi1lo.getClass();
/* 184 */                           i01OIoo0l1O i01oioo0l1o2 = i01oioo0l1o;
/* 188 */                           long jNanoTime = System.nanoTime() - oloIOlo102.I00iOIl;
/* 190 */                           long j5 = OloO11o0.I00000oOI;
/* 194 */                           if (jNanoTime < j5) {
/* 196 */                               j3 = j5 - jNanoTime;
                                        break;
                                    }
/* 213 */                           if (unsafe2.compareAndSwapObject(i01oioo0l1o2, j4, oloIOlo102, (Object) null)) {
/* 215 */                               oOo0ooi.I00iOIl = oloIOlo102;
/* 217 */                               j3 = -1;
                                        break;
                                    }
/* 240 */                           i01oioo0l1o = i01oioo0l1o2;
                                }
                            } else {
/* 139 */                       oOo0ooi.I00iOIl = oloIOlo10I0000Il00O;
/* 141 */                       j3 = -1;
/* 143 */                       j2 = -1;
                            }
/* 221 */                   if (j3 == j2) {
/* 225 */                       OloIOlo10 oloIOlo103 = (OloIOlo10) oOo0ooi.I00iOIl;
/* 228 */                       oOo0ooi.I00iOIl = null;
/* 230 */                       return oloIOlo103;
                            }
/* 233 */                   if (j3 > j) {
/* 235 */                       jMin = Math.min(jMin, j3);
                            }
                        }
/* 250 */               i5++;
/* 252 */               i3 = i;
/* 254 */               i4 = i2;
/* 255 */               oloIOlo10 = null;
                    }
/* 268 */           if (jMin == Long.MAX_VALUE) {
/* 271 */               jMin = 0;
                    }
/* 273 */           this.I00ilI0I1 = jMin;
/* 275 */           return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
                
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
                
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
                
                    continue;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Ii010I1i ii010I1i;
                    loop0: while (true) {
/* 4 */                 boolean z = false;
/* 14 */                while (Ii010io1l.I00l0OO0IO.get(this.I00ioIO) != 1) {
/* 18 */                    Ii010I1i ii010I1i2 = this.I00iiO;
/* 20 */                    Ii010I1i ii010I1i3 = Ii010I1i.I00ilI0I1;
/* 22 */                    if (ii010I1i2 == ii010I1i3) {
                                break loop0;
                            }
/* 26 */                    OloIOlo10 oloIOlo10I00000oIO = I00000oIO(this.I00io1l);
/* 35 */                    if (oloIOlo10I00000oIO != null) {
/* 37 */                        this.I00ilI0I1 = 0L;
/* 39 */                        Ii010io1l ii010io1l = this.I00ioIO;
/* 41 */                        this.I00iio = 0L;
/* 47 */                        if (this.I00iiO == Ii010I1i.I00iiO) {
/* 51 */                            this.I00iiO = Ii010I1i.I00iiI;
                                }
/* 55 */                        if (oloIOlo10I00000oIO.I00iiI) {
/* 63 */                            if (I000O01llI0(Ii010I1i.I00iiI) && !ii010io1l.I00100l0() && !ii010io1l.I000l1(Ii010io1l.I00l0I0l0lO1.get(ii010io1l))) {
/* 85 */                                ii010io1l.I00100l0();
                                    }
                                    try {
/* 88 */                                oloIOlo10I00000oIO.run();
                                    } catch (Throwable th) {
/* 93 */                                Thread threadCurrentThread = Thread.currentThread();
/* 101 */                               threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                    }
/* 106 */                           Ii010io1l.I00l0I0l0lO1.addAndGet(ii010io1l, -2097152L);
/* 111 */                           if (this.I00iiO != ii010I1i3) {
/* 115 */                               this.I00iiO = Ii010I1i.I00iio;
                                    }
                                } else {
                                    try {
/* 118 */                               oloIOlo10I00000oIO.run();
                                    } catch (Throwable th2) {
/* 123 */                               Thread threadCurrentThread2 = Thread.currentThread();
/* 131 */                               threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                                    }
                                }
                            } else {
/* 136 */                       this.I00io1l = false;
/* 142 */                       if (this.I00ilI0I1 == 0) {
/* 166 */                           Object obj = this.nextParkedWorker;
/* 168 */                           I0OooiI1I i0OooiI1I = Ii010io1l.I00li1OI;
/* 170 */                           if (obj != i0OooiI1I) {
/* 176 */                               int i = -1;
/* 177 */                               I1Ioolli0l0o.I00000oIO.putIntVolatile(this, I00l0OO0IO, -1);
/* 184 */                               while (this.nextParkedWorker != Ii010io1l.I00li1OI) {
/* 186 */                                   Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 188 */                                   long j = I00l0OO0IO;
/* 194 */                                   if (unsafe.getIntVolatile(this, j) == i) {
/* 196 */                                       Ii010io1l ii010io1l2 = this.I00ioIO;
/* 198 */                                       AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Ii010io1l.I00l0OO0IO;
/* 204 */                                       if (atomicIntegerFieldUpdater.get(ii010io1l2) == 1) {
                                                    break;
                                                }
/* 208 */                                       Ii010I1i ii010I1i4 = this.I00iiO;
/* 210 */                                       Ii010I1i ii010I1i5 = Ii010I1i.I00ilI0I1;
/* 212 */                                       if (ii010I1i4 == ii010I1i5) {
                                                    break;
                                                }
/* 218 */                                       I000O01llI0(Ii010I1i.I00iiO);
/* 221 */                                       Thread.interrupted();
/* 231 */                                       if (this.I00iio == 0) {
/* 239 */                                           ii010I1i = ii010I1i5;
/* 244 */                                           this.I00iio = System.nanoTime() + this.I00ioIO.I00iiO;
                                                } else {
/* 247 */                                           ii010I1i = ii010I1i5;
                                                }
/* 253 */                                       LockSupport.parkNanos(this.I00ioIO.I00iiO);
/* 265 */                                       if (System.nanoTime() - this.I00iio >= 0) {
/* 267 */                                           this.I00iio = 0L;
/* 269 */                                           Ii010io1l ii010io1l3 = this.I00ioIO;
                                                    synchronized (ii010io1l3.I00io1l) {
                                                        try {
/* 283 */                                                   if (!(atomicIntegerFieldUpdater.get(ii010io1l3) == 1)) {
/* 287 */                                                       AtomicLongFieldUpdater atomicLongFieldUpdater = Ii010io1l.I00l0I0l0lO1;
/* 297 */                                                       if (((int) (atomicLongFieldUpdater.get(ii010io1l3) & 2097151)) > ii010io1l3.I00iOIl && unsafe.compareAndSwapInt(this, j, -1, 1)) {
/* 309 */                                                           int i2 = this.indexInArray;
/* 311 */                                                           I0001Ioi1lo(0);
/* 314 */                                                           ii010io1l3.I000O01llI0(this, i2, 0);
/* 322 */                                                           int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(ii010io1l3) & 2097151);
/* 323 */                                                           if (andDecrement != i2) {
/* 331 */                                                               Ii00oo1OO0 ii00oo1OO0 = (Ii00oo1OO0) ii010io1l3.I00io1l.I00000oOI(andDecrement);
/* 335 */                                                               ii010io1l3.I00io1l.I0000Il00O(i2, ii00oo1OO0);
/* 338 */                                                               ii00oo1OO0.I0001Ioi1lo(i2);
/* 341 */                                                               ii010io1l3.I000O01llI0(ii00oo1OO0, andDecrement, i2);
                                                                    }
/* 350 */                                                           ii010io1l3.I00io1l.I0000Il00O(andDecrement, null);
/* 356 */                                                           this.I00iiO = ii010I1i;
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
/* 360 */                                                   throw th3;
                                                        }
                                                    }
                                                }
/* 361 */                                       i = -1;
                                            }
                                        }
                                    } else {
/* 367 */                               Ii010io1l ii010io1l4 = this.I00ioIO;
/* 369 */                               AtomicLongFieldUpdater atomicLongFieldUpdater2 = Ii010io1l.I00ioIO;
/* 373 */                               if (this.nextParkedWorker == i0OooiI1I) {
                                            while (true) {
/* 377 */                                       long j2 = atomicLongFieldUpdater2.get(ii010io1l4);
/* 390 */                                       int i3 = this.indexInArray;
/* 398 */                                       this.nextParkedWorker = ii010io1l4.I00io1l.I00000oOI((int) (j2 & 2097151));
/* 403 */                                       Ii010io1l ii010io1l5 = ii010io1l4;
/* 405 */                                       AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
/* 411 */                                       if (atomicLongFieldUpdater3.compareAndSet(ii010io1l5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                                    break;
                                                }
/* 415 */                                       atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
/* 417 */                                       ii010io1l4 = ii010io1l5;
                                            }
                                        }
                                    }
                                } else if (z) {
/* 151 */                           I000O01llI0(Ii010I1i.I00iiO);
/* 154 */                           Thread.interrupted();
/* 159 */                           LockSupport.parkNanos(this.I00ilI0I1);
/* 162 */                           this.I00ilI0I1 = 0L;
                                } else {
/* 146 */                           z = true;
                                }
                            }
                        }
                        break loop0;
                    }
/* 422 */           I000O01llI0(Ii010I1i.I00ilI0I1);
                }
            }

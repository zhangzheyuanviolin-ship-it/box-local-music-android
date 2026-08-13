            package p000;

            import java.io.Closeable;
            import java.lang.Thread;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import sun.misc.Unsafe;
            
            public final class Ii010io1l implements Executor, Closeable {
                public static final AtomicLongFieldUpdater I00ioIO = AtomicLongFieldUpdater.newUpdater(Ii010io1l.class, "parkedWorkersStack$volatile");
                public static final AtomicLongFieldUpdater I00l0I0l0lO1 = AtomicLongFieldUpdater.newUpdater(Ii010io1l.class, "controlState$volatile");
                public static final AtomicIntegerFieldUpdater I00l0OO0IO = AtomicIntegerFieldUpdater.newUpdater(Ii010io1l.class, "_isTerminated$volatile");
                public static final I0OooiI1I I00li1OI = new I0OooiI1I("NOT_IN_STACK", 3);
                public final int I00iOIl;
                public final int I00iiI;
                public final long I00iiO;
                public final String I00iio;
                public final Io0Io1 I00ilI0I1;
                public final Io0Io1 I00ilO0;
                public final Oi0Ol01loO I00io1l;
                private volatile int _isTerminated$volatile;
                private volatile long controlState$volatile;
                private volatile long parkedWorkersStack$volatile;

                public Ii010io1l(int i, int i2, long j, String str) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = j;
/* 10 */            this.I00iio = str;
/* 13 */            if (i < 1) {
/* 105 */               I000II.I0010I0i(IIlIOloOOO.I00100l0("Core pool size ", i, " should be at least 1"));
/* 483 */               throw null;
                    }
/* 17 */            if (i2 < i) {
/* 92 */                I000II.I0010I0i(IIl001iO0Io.I000l1(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
/* 96 */                throw null;
                    }
/* 22 */            if (i2 > 2097150) {
/* 81 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
/* 85 */                throw null;
                    }
/* 28 */            if (j <= 0) {
/* 70 */                I000II.I0010I0i(IlIi0I0.I000l1(j, "Idle worker keep alive time ", " must be positive"));
/* 74 */                throw null;
                    }
/* 35 */            this.I00ilI0I1 = new Io0Io1();
/* 42 */            this.I00ilO0 = new Io0Io1();
/* 53 */            this.I00io1l = new Oi0Ol01loO((i + 1) * 2);
/* 59 */            this.controlState$volatile = i << 42;
                }

                public static void I000II(Ii010io1l ii010io1l, Runnable runnable, int i) {
/* 9 */             ii010io1l.I0000Il00O(runnable, false, (i & 4) == 0);
                }

                public final int I00000oIO() {
                    synchronized (this.I00io1l) {
                        try {
/* 17 */                    if (I00l0OO0IO.get(this) == 1) {
/* 20 */                        return -1;
                            }
/* 22 */                    AtomicLongFieldUpdater atomicLongFieldUpdater = I00l0I0l0lO1;
/* 24 */                    long j = atomicLongFieldUpdater.get(this);
/* 33 */                    int i = (int) (j & 2097151);
/* 44 */                    int i2 = i - ((int) ((j & 4398044413952L) >> 21));
/* 46 */                    if (i2 < 0) {
/* 48 */                        i2 = 0;
                            }
/* 51 */                    if (i2 >= this.I00iOIl) {
/* 11 */                        return 0;
                            }
/* 57 */                    if (i >= this.I00iiI) {
/* 11 */                        return 0;
                            }
/* 67 */                    int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
/* 68 */                    if (i3 <= 0 || this.I00io1l.I00000oOI(i3) != null) {
/* 119 */                       throw new IllegalArgumentException("Failed requirement.");
                            }
/* 80 */                    Ii00oo1OO0 ii00oo1OO0 = new Ii00oo1OO0(this, i3);
/* 85 */                    this.I00io1l.I0000Il00O(i3, ii00oo1OO0);
/* 94 */                    if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
/* 109 */                       throw new IllegalArgumentException("Failed requirement.");
                            }
/* 96 */                    int i4 = i2 + 1;
/* 98 */                    ii00oo1OO0.start();
/* 101 */                   return i4;
                        } catch (Throwable th) {
/* 541 */                   throw th;
                        }
                    }
                }

                public final void I0000Il00O(Runnable runnable, boolean z, boolean z2) {
                    OloIOlo10 oloIOlo10I00000oIO;
                    Ii010I1i ii010I1i;
/* 3 */             OloO11o0.I0001Ioi1lo.getClass();
/* 6 */             long jNanoTime = System.nanoTime();
/* 12 */            if (runnable instanceof OloIOlo10) {
/* 14 */                oloIOlo10I00000oIO = (OloIOlo10) runnable;
/* 16 */                oloIOlo10I00000oIO.I00iOIl = jNanoTime;
/* 18 */                oloIOlo10I00000oIO.I00iiI = z;
                    } else {
/* 23 */                OloO000Io oloO000Io = new OloO000Io(jNanoTime, z);
/* 26 */                oloO000Io.I00iiO = runnable;
/* 28 */                VarHandle.storeStoreFence();
/* 31 */                oloIOlo10I00000oIO = oloO000Io;
                    }
/* 32 */            boolean z3 = oloIOlo10I00000oIO.I00iiI;
/* 34 */            AtomicLongFieldUpdater atomicLongFieldUpdater = I00l0I0l0lO1;
/* 46 */            long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
/* 48 */            Thread threadCurrentThread = Thread.currentThread();
/* 60 */            Ii00oo1OO0 ii00oo1OO0 = threadCurrentThread instanceof Ii00oo1OO0 ? (Ii00oo1OO0) threadCurrentThread : null;
/* 61 */            if (ii00oo1OO0 == null || ii00oo1OO0.I00ioIO != this) {
/* 67 */                ii00oo1OO0 = null;
                    }
/* 68 */            if (ii00oo1OO0 != null && (ii010I1i = ii00oo1OO0.I00iiO) != Ii010I1i.I00ilI0I1 && (oloIOlo10I00000oIO.I00iiI || ii010I1i != Ii010I1i.I00iiI)) {
/* 88 */                ii00oo1OO0.I00io1l = true;
/* 90 */                i01OIoo0l1O i01oioo0l1o = ii00oo1OO0.I00iOIl;
/* 92 */                if (z2) {
/* 94 */                    oloIOlo10I00000oIO = i01oioo0l1o.I00000oIO(oloIOlo10I00000oIO);
                        } else {
/* 99 */                    i01oioo0l1o.getClass();
/* 110 */                   OloIOlo10 oloIOlo10 = (OloIOlo10) I1Ioolli0l0o.I00000oIO.getAndSetObject(i01oioo0l1o, i01OIoo0l1O.I0001Ioi1lo, oloIOlo10I00000oIO);
/* 116 */                   oloIOlo10I00000oIO = oloIOlo10 == null ? null : i01oioo0l1o.I00000oIO(oloIOlo10);
                        }
                    }
/* 120 */           if (oloIOlo10I00000oIO != null) {
/* 139 */               if (!(oloIOlo10I00000oIO.I00iiI ? this.I00ilO0.I00000oIO(oloIOlo10I00000oIO) : this.I00ilI0I1.I00000oIO(oloIOlo10I00000oIO))) {
/* 160 */                   throw new RejectedExecutionException(IIl001iO0Io.I00100l0(new StringBuilder(), this.I00iio, " was terminated"));
                        }
                    }
/* 161 */           if (z3) {
/* 167 */               if (I00100l0() || I000l1(jAddAndGet)) {
/* 198 */                   return;
                        }
/* 177 */               I00100l0();
/* 180 */               return;
                    }
/* 185 */           if (I00100l0() || I000l1(atomicLongFieldUpdater.get(this))) {
/* 198 */               return;
                    }
/* 199 */           I00100l0();
                }

                public final void I000O01llI0(Ii00oo1OO0 ii00oo1OO0, int i, int i2) {
                    while (true) {
/* 1 */                 AtomicLongFieldUpdater atomicLongFieldUpdater = I00ioIO;
/* 3 */                 long j = atomicLongFieldUpdater.get(this);
/* 11 */                int i3 = (int) (2097151 & j);
/* 19 */                long j2 = (2097152 + j) & (-2097152);
/* 20 */                if (i3 == i) {
/* 22 */                    if (i2 == 0) {
/* 24 */                        Object objI0000Il00O = ii00oo1OO0.I0000Il00O();
                                while (true) {
/* 30 */                            if (objI0000Il00O == I00li1OI) {
/* 32 */                                i3 = -1;
                                        break;
                                    }
/* 34 */                            if (objI0000Il00O == null) {
/* 36 */                                i3 = 0;
                                        break;
                                    }
/* 38 */                            Ii00oo1OO0 ii00oo1OO02 = (Ii00oo1OO0) objI0000Il00O;
/* 40 */                            int iI00000oOI = ii00oo1OO02.I00000oOI();
/* 44 */                            if (iI00000oOI != 0) {
/* 46 */                                i3 = iI00000oOI;
                                        break;
                                    }
/* 48 */                            objI0000Il00O = ii00oo1OO02.I0000Il00O();
                                }
                            } else {
/* 53 */                        i3 = i2;
                            }
                        }
/* 54 */                if (i3 >= 0) {
/* 57 */                    long j3 = j2 | i3;
/* 58 */                    Ii010io1l ii010io1l = this;
/* 63 */                    if (atomicLongFieldUpdater.compareAndSet(ii010io1l, j, j3)) {
/* 65 */                        return;
                            } else {
/* 66 */                        this = ii010io1l;
                            }
                        }
                    }
                }

                public final boolean I000l1(long j) {
/* 16 */            int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
/* 18 */            if (i < 0) {
/* 20 */                i = 0;
                    }
/* 21 */            int i2 = this.I00iOIl;
/* 23 */            if (i < i2) {
/* 25 */                int iI00000oIO = I00000oIO();
/* 30 */                if (iI00000oIO == 1 && i2 > 1) {
/* 34 */                    I00000oIO();
                        }
/* 37 */                if (iI00000oIO > 0) {
/* 29 */                    return true;
                        }
                    }
/* 17 */            return false;
                }

                public final boolean I00100l0() {
                    Ii010io1l ii010io1l;
                    I0OooiI1I i0OooiI1I;
                    int iI00000oOI;
                    while (true) {
/* 1 */                 AtomicLongFieldUpdater atomicLongFieldUpdater = I00ioIO;
/* 3 */                 long j = atomicLongFieldUpdater.get(this);
/* 19 */                Ii00oo1OO0 ii00oo1OO0 = (Ii00oo1OO0) this.I00io1l.I00000oOI((int) (2097151 & j));
/* 23 */                if (ii00oo1OO0 == null) {
/* 25 */                    ii00oo1OO0 = null;
/* 26 */                    ii010io1l = this;
                        } else {
/* 35 */                    long j2 = (2097152 + j) & (-2097152);
/* 36 */                    Object objI0000Il00O = ii00oo1OO0.I0000Il00O();
                            while (true) {
/* 40 */                        i0OooiI1I = I00li1OI;
/* 42 */                        if (objI0000Il00O == i0OooiI1I) {
/* 44 */                            iI00000oOI = -1;
                                    break;
                                }
/* 46 */                        if (objI0000Il00O == null) {
/* 48 */                            iI00000oOI = 0;
                                    break;
                                }
/* 50 */                        Ii00oo1OO0 ii00oo1OO02 = (Ii00oo1OO0) objI0000Il00O;
/* 52 */                        iI00000oOI = ii00oo1OO02.I00000oOI();
/* 56 */                        if (iI00000oOI != 0) {
                                    break;
                                }
/* 94 */                        objI0000Il00O = ii00oo1OO02.I0000Il00O();
/* 99 */                        atomicLongFieldUpdater = atomicLongFieldUpdater;
/* 100 */                       this = this;
                            }
/* 58 */                    if (iI00000oOI >= 0) {
/* 62 */                        Ii010io1l ii010io1l2 = this;
/* 63 */                        boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(ii010io1l2, j, j2 | iI00000oOI);
/* 67 */                        ii010io1l = ii010io1l2;
/* 68 */                        if (zCompareAndSet) {
/* 70 */                            ii00oo1OO0.I000II(i0OooiI1I);
                                }
/* 89 */                        this = ii010io1l;
                            } else {
                                continue;
                            }
                        }
/* 73 */                if (ii00oo1OO0 == null) {
/* 22 */                    return false;
                        }
/* 82 */                if (Ii00oo1OO0.I00l0I0l0lO1.compareAndSet(ii00oo1OO0, -1, 0)) {
/* 84 */                    LockSupport.unpark(ii00oo1OO0);
/* 87 */                    return true;
                        }
/* 89 */                this = ii010io1l;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void close() throws InterruptedException {
                    int i;
                    OloIOlo10 oloIOlo10I00000oIO;
/* 11 */            if (I00l0OO0IO.compareAndSet(this, 0, 1)) {
/* 14 */                Thread threadCurrentThread = Thread.currentThread();
/* 26 */                Ii00oo1OO0 ii00oo1OO0 = threadCurrentThread instanceof Ii00oo1OO0 ? (Ii00oo1OO0) threadCurrentThread : null;
/* 35 */                Ii00oo1OO0 ii00oo1OO02 = (ii00oo1OO0 == null || ii00oo1OO0.I00ioIO != this) ? null : ii00oo1OO0;
                        synchronized (this.I00io1l) {
/* 49 */                    i = (int) (I00l0I0l0lO1.get(this) & 2097151);
                        }
/* 51 */                if (1 <= i) {
/* 53 */                    int i2 = 1;
                            while (true) {
/* 60 */                        Ii00oo1OO0 ii00oo1OO03 = (Ii00oo1OO0) this.I00io1l.I00000oOI(i2);
/* 62 */                        if (ii00oo1OO03 != ii00oo1OO02) {
/* 70 */                            while (ii00oo1OO03.getState() != Thread.State.TERMINATED) {
/* 72 */                                LockSupport.unpark(ii00oo1OO03);
/* 77 */                                ii00oo1OO03.join(10000L);
                                    }
/* 81 */                            i01OIoo0l1O i01oioo0l1o = ii00oo1OO03.I00iOIl;
/* 83 */                            Io0Io1 io0Io1 = this.I00ilO0;
/* 85 */                            i01oioo0l1o.getClass();
/* 96 */                            OloIOlo10 oloIOlo10 = (OloIOlo10) I1Ioolli0l0o.I00000oIO.getAndSetObject(i01oioo0l1o, i01OIoo0l1O.I0001Ioi1lo, (Object) null);
/* 98 */                            if (oloIOlo10 != null) {
/* 100 */                               io0Io1.I00000oIO(oloIOlo10);
                                    }
                                    while (true) {
/* 103 */                               OloIOlo10 oloIOlo10I0000Il00O = i01oioo0l1o.I0000Il00O();
/* 107 */                               if (oloIOlo10I0000Il00O == null) {
                                            break;
                                        } else {
/* 110 */                                   io0Io1.I00000oIO(oloIOlo10I0000Il00O);
                                        }
                                    }
                                }
/* 114 */                       if (i2 == i) {
                                    break;
                                } else {
/* 116 */                           i2++;
                                }
                            }
                        }
/* 119 */               Io0Io1 io0Io12 = this.I00ilO0;
                        while (true) {
/* 121 */                   Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 123 */                   long j = O1I0iI0001.I00000oIO;
/* 130 */                   O1I0l0iol o1I0l0iol = (O1I0l0iol) unsafe.getObjectVolatile(io0Io12, j);
/* 136 */                   if (o1I0l0iol.I00000oOI()) {
                                break;
                            } else {
/* 234 */                       unsafe.compareAndSwapObject(io0Io12, j, o1I0l0iol, o1I0l0iol.I0000Il00O());
                            }
                        }
/* 138 */               Io0Io1 io0Io13 = this.I00ilI0I1;
                        while (true) {
/* 140 */                   Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 142 */                   long j2 = O1I0iI0001.I00000oIO;
/* 149 */                   O1I0l0iol o1I0l0iol2 = (O1I0l0iol) unsafe2.getObjectVolatile(io0Io13, j2);
/* 155 */                   if (o1I0l0iol2.I00000oOI()) {
                                break;
                            } else {
/* 226 */                       unsafe2.compareAndSwapObject(io0Io13, j2, o1I0l0iol2, o1I0l0iol2.I0000Il00O());
                            }
                        }
                        while (true) {
/* 157 */                   if (ii00oo1OO02 == null) {
/* 171 */                       oloIOlo10I00000oIO = (OloIOlo10) this.I00ilI0I1.I0000Il00O();
/* 173 */                       if (oloIOlo10I00000oIO == null && (oloIOlo10I00000oIO = (OloIOlo10) this.I00ilO0.I0000Il00O()) == null) {
                                    break;
                                }
                            } else {
/* 159 */                       oloIOlo10I00000oIO = ii00oo1OO02.I00000oIO(true);
/* 163 */                       if (oloIOlo10I00000oIO == null) {
                                }
                            }
                            try {
/* 205 */                       oloIOlo10I00000oIO.run();
                            } catch (Throwable th) {
/* 210 */                       Thread threadCurrentThread2 = Thread.currentThread();
/* 218 */                       threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                            }
                        }
/* 185 */               if (ii00oo1OO02 != null) {
/* 189 */                   ii00oo1OO02.I000O01llI0(Ii010I1i.I00ilI0I1);
                        }
/* 196 */               I00ioIO.set(this, 0L);
/* 201 */               I00l0I0l0lO1.set(this, 0L);
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
/* 2 */             I000II(this, runnable, 6);
                }

                public final String toString() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Oi0Ol01loO oi0Ol01loO = this.I00io1l;
/* 8 */             int iI00000oIO = oi0Ol01loO.I00000oIO();
/* 12 */            int i = 0;
/* 14 */            int i2 = 0;
/* 15 */            int i3 = 0;
/* 16 */            int i4 = 0;
/* 17 */            int i5 = 0;
/* 19 */            for (int i6 = 1; i6 < iI00000oIO; i6++) {
/* 25 */                Ii00oo1OO0 ii00oo1OO0 = (Ii00oo1OO0) oi0Ol01loO.I00000oOI(i6);
/* 27 */                if (ii00oo1OO0 != null) {
/* 31 */                    i01OIoo0l1O i01oioo0l1o = ii00oo1OO0.I00iOIl;
/* 33 */                    i01oioo0l1o.getClass();
/* 40 */                    Object objectVolatile = I1Ioolli0l0o.I00000oIO.getObjectVolatile(i01oioo0l1o, i01OIoo0l1O.I0001Ioi1lo);
/* 44 */                    int iI00000oOI = i01oioo0l1o.I00000oOI();
/* 48 */                    if (objectVolatile != null) {
/* 50 */                        iI00000oOI++;
                            }
/* 53 */                    int iOrdinal = ii00oo1OO0.I00iiO.ordinal();
/* 57 */                    if (iOrdinal == 0) {
/* 129 */                       i++;
/* 133 */                       StringBuilder sb = new StringBuilder();
/* 136 */                       sb.append(iI00000oOI);
/* 141 */                       sb.append('c');
/* 148 */                       arrayList.add(sb.toString());
                            } else if (iOrdinal == 1) {
/* 106 */                       i2++;
/* 110 */                       StringBuilder sb2 = new StringBuilder();
/* 113 */                       sb2.append(iI00000oOI);
/* 118 */                       sb2.append('b');
/* 125 */                       arrayList.add(sb2.toString());
                            } else if (iOrdinal == 2) {
/* 103 */                       i3++;
                            } else if (iOrdinal == 3) {
/* 78 */                        i4++;
/* 80 */                        if (iI00000oOI > 0) {
/* 84 */                            StringBuilder sb3 = new StringBuilder();
/* 87 */                            sb3.append(iI00000oOI);
/* 92 */                            sb3.append('d');
/* 99 */                            arrayList.add(sb3.toString());
                                }
                            } else {
/* 68 */                        if (iOrdinal != 4) {
/* 73 */                            I000II.I00000oIO();
/* 76 */                            return null;
                                }
/* 70 */                        i5++;
                            }
                        }
                    }
/* 157 */           long j = I00l0I0l0lO1.get(this);
/* 163 */           StringBuilder sb4 = new StringBuilder();
/* 168 */           sb4.append(this.I00iio);
/* 173 */           sb4.append('@');
/* 180 */           sb4.append(Ii1Oo1l.I00000oIO(this));
/* 185 */           sb4.append("[Pool Size {core = ");
/* 188 */           int i7 = this.I00iOIl;
/* 190 */           sb4.append(i7);
/* 195 */           sb4.append(", max = ");
/* 200 */           sb4.append(this.I00iiI);
/* 205 */           sb4.append("}, Worker States {CPU = ");
/* 208 */           sb4.append(i);
/* 213 */           sb4.append(", blocking = ");
/* 216 */           sb4.append(i2);
/* 221 */           sb4.append(", parked = ");
/* 224 */           sb4.append(i3);
/* 229 */           sb4.append(", dormant = ");
/* 232 */           sb4.append(i4);
/* 237 */           sb4.append(", terminated = ");
/* 240 */           sb4.append(i5);
/* 245 */           sb4.append("}, running workers queues = ");
/* 248 */           sb4.append(arrayList);
/* 253 */           sb4.append(", global CPU queue size = ");
/* 262 */           sb4.append(this.I00ilI0I1.I00000oOI());
/* 267 */           sb4.append(", global blocking queue size = ");
/* 276 */           sb4.append(this.I00ilO0.I00000oOI());
/* 281 */           sb4.append(", Control State {created workers= ");
/* 289 */           sb4.append((int) (2097151 & j));
/* 294 */           sb4.append(", blocking tasks = ");
/* 307 */           sb4.append((int) ((4398044413952L & j) >> 21));
/* 312 */           sb4.append(", CPUs acquired = ");
/* 327 */           sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
/* 332 */           sb4.append("}]");
/* 335 */           return sb4.toString();
                }
            }

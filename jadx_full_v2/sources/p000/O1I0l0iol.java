            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import sun.misc.Unsafe;
            
            public final class O1I0l0iol {
                public static final I0OooiI1I I0000oI00;
                public static final long I0001Ioi1lo;
                public static final long I000II;
                public final int I00000oIO;
                public final boolean I00000oOI;
                public final int I0000Il00O;
                public final AtomicReferenceArray I0000O;
                private volatile Object _next$volatile;
                private volatile long _state$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I0001Ioi1lo = unsafe.objectFieldOffset(O1I0l0iol.class.getDeclaredField("_next$volatile"));
/* 27 */            I000II = unsafe.objectFieldOffset(O1I0l0iol.class.getDeclaredField("_state$volatile"));
/* 37 */            I0000oI00 = new I0OooiI1I("REMOVE_FROZEN", 3);
                }

                public O1I0l0iol(int i, boolean z) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = z;
                    int i2 = i - 1;
/* 10 */            this.I0000Il00O = i2;
/* 17 */            this.I0000O = new AtomicReferenceArray(i);
/* 24 */            if (i2 > 1073741823) {
/* 36 */                I000II.I001IO000("Check failed.");
/* 89 */                throw null;
                    }
/* 28 */            if ((i & i2) == 0) {
/* 30 */                return;
                    }
/* 31 */            I000II.I001IO000("Check failed.");
/* 35 */            throw null;
                }

                public final int I00000oIO(Object obj) {
/* 1 */             O1I0l0iol o1I0l0iol = this;
                    while (true) {
/* 5 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 7 */                 long j = I000II;
/* 9 */                 long longVolatile = unsafe.getLongVolatile(o1I0l0iol, j);
/* 20 */                if ((3458764513820540928L & longVolatile) != 0) {
                            return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
                        }
/* 35 */                int i = (int) (1073741823 & longVolatile);
/* 45 */                int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
/* 48 */                int i3 = o1I0l0iol.I0000Il00O;
/* 53 */                if (((i2 + 2) & i3) == (i & i3)) {
/* 86 */                    return 1;
                        }
/* 56 */                boolean z = o1I0l0iol.I00000oOI;
/* 61 */                AtomicReferenceArray atomicReferenceArray = o1I0l0iol.I0000O;
/* 63 */                if (z || atomicReferenceArray.get(i2 & i3) == null) {
/* 112 */                   if (unsafe.compareAndSwapLong(o1I0l0iol, I000II, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
/* 116 */                       atomicReferenceArray.set(i2 & i3, obj);
/* 119 */                       O1I0l0iol o1I0l0iolI0000Il00O = this;
/* 132 */                       while ((I1Ioolli0l0o.I00000oIO.getLongVolatile(o1I0l0iolI0000Il00O, j) & 1152921504606846976L) != 0) {
/* 134 */                           o1I0l0iolI0000Il00O = o1I0l0iolI0000Il00O.I0000Il00O();
/* 138 */                           AtomicReferenceArray atomicReferenceArray2 = o1I0l0iolI0000Il00O.I0000O;
/* 142 */                           int i4 = o1I0l0iolI0000Il00O.I0000Il00O & i2;
/* 143 */                           Object obj2 = atomicReferenceArray2.get(i4);
/* 149 */                           if ((obj2 instanceof O1I0iIoIi01) && ((O1I0iIoIi01) obj2).I00000oIO == i2) {
/* 157 */                               atomicReferenceArray2.set(i4, obj);
                                    } else {
/* 161 */                               o1I0l0iolI0000Il00O = null;
                                    }
/* 162 */                           if (o1I0l0iolI0000Il00O == null) {
/* 164 */                               return 0;
                                    }
                                }
/* 164 */                       return 0;
                            }
/* 166 */                   o1I0l0iol = this;
                        } else {
/* 75 */                    int i5 = o1I0l0iol.I00000oIO;
/* 77 */                    if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
/* 86 */                        return 1;
                            }
                        }
                    }
                }

                public final boolean I00000oOI() {
                    while (true) {
/* 5 */                 long longVolatile = I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I000II);
/* 18 */                if ((longVolatile & 2305843009213693952L) != 0) {
/* 17 */                    return true;
                        }
/* 26 */                if ((1152921504606846976L & longVolatile) != 0) {
/* 28 */                    return false;
                        }
/* 36 */                O1I0l0iol o1I0l0iol = this;
/* 41 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapLong(o1I0l0iol, I000II, longVolatile, longVolatile | 2305843009213693952L)) {
/* 17 */                    return true;
                        }
/* 44 */                this = o1I0l0iol;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v14, types: [O1I0iIoIi01, java.lang.Object] */
                public final O1I0l0iol I0000Il00O() {
                    O1I0l0iol o1I0l0iol;
                    long j;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j2 = I000II;
/* 5 */                 long longVolatile = unsafe.getLongVolatile(this, j2);
/* 17 */                if ((longVolatile & 1152921504606846976L) != 0) {
/* 19 */                    o1I0l0iol = this;
/* 20 */                    j = longVolatile;
                            break;
                        }
/* 22 */                j = 1152921504606846976L | longVolatile;
/* 23 */                o1I0l0iol = this;
/* 28 */                if (unsafe.compareAndSwapLong(o1I0l0iol, j2, longVolatile, j)) {
                            break;
                        }
/* 128 */               this = o1I0l0iol;
                    }
                    while (true) {
/* 38 */                O1I0l0iol o1I0l0iol2 = (O1I0l0iol) I1Ioolli0l0o.I00000oIO.getObjectVolatile(o1I0l0iol, I0001Ioi1lo);
/* 40 */                if (o1I0l0iol2 != null) {
/* 42 */                    return o1I0l0iol2;
                        }
/* 51 */                O1I0l0iol o1I0l0iol3 = new O1I0l0iol(o1I0l0iol.I00000oIO * 2, o1I0l0iol.I00000oOI);
/* 58 */                int i = (int) (1073741823 & j);
/* 68 */                int i2 = (int) ((1152921503533105152L & j) >> 30);
                        while (true) {
/* 69 */                    int i3 = o1I0l0iol.I0000Il00O;
/* 71 */                    int i4 = i & i3;
/* 74 */                    if (i4 != (i3 & i2)) {
/* 78 */                        ?? o1I0iIoIi01 = o1I0l0iol.I0000O.get(i4);
/* 82 */                        if (o1I0iIoIi01 == 0) {
/* 86 */                            o1I0iIoIi01 = new O1I0iIoIi01();
/* 89 */                            o1I0iIoIi01.I00000oIO = i;
/* 91 */                            VarHandle.storeStoreFence();
                                }
/* 99 */                        o1I0l0iol3.I0000O.set(o1I0l0iol3.I0000Il00O & i, o1I0iIoIi01);
/* 102 */                       i++;
                            }
                        }
/* 112 */               Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 118 */               unsafe2.putLongVolatile(o1I0l0iol3, I000II, j & (-1152921504606846977L));
/* 124 */               unsafe2.compareAndSwapObject(o1I0l0iol, I0001Ioi1lo, (Object) null, o1I0l0iol3);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
                
                    return null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O() {
/* 1 */             O1I0l0iol o1I0l0iolI0000Il00O = this;
                    while (true) {
/* 3 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 5 */                 long j = I000II;
/* 7 */                 long longVolatile = unsafe.getLongVolatile(o1I0l0iolI0000Il00O, j);
/* 19 */                if ((longVolatile & 1152921504606846976L) != 0) {
/* 21 */                    return I0000oI00;
                        }
/* 29 */                int i = (int) (longVolatile & 1073741823);
/* 40 */                int i2 = o1I0l0iolI0000Il00O.I0000Il00O;
/* 42 */                int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
/* 43 */                int i4 = i2 & i;
/* 45 */                if (i3 == i4) {
                            break;
                        }
/* 48 */                AtomicReferenceArray atomicReferenceArray = o1I0l0iolI0000Il00O.I0000O;
/* 52 */                Object obj = atomicReferenceArray.get(i4);
/* 56 */                boolean z = o1I0l0iolI0000Il00O.I00000oOI;
/* 58 */                if (obj == null) {
/* 60 */                    if (z) {
                                break;
                            }
                        } else {
/* 67 */                    if (obj instanceof O1I0iIoIi01) {
                                break;
                            }
/* 75 */                    long j2 = (i + 1) & 1073741823;
/* 95 */                    if (unsafe.compareAndSwapLong(o1I0l0iolI0000Il00O, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
/* 97 */                        atomicReferenceArray.set(i4, null);
/* 100 */                       return obj;
                            }
/* 101 */                   o1I0l0iolI0000Il00O = this;
/* 103 */                   if (z) {
                                while (true) {
/* 105 */                           Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 107 */                           long j3 = I000II;
/* 109 */                           long longVolatile2 = unsafe2.getLongVolatile(o1I0l0iolI0000Il00O, j3);
/* 115 */                           int i5 = (int) (longVolatile2 & 1073741823);
/* 120 */                           if ((longVolatile2 & 1152921504606846976L) != 0) {
/* 122 */                               o1I0l0iolI0000Il00O = o1I0l0iolI0000Il00O.I0000Il00O();
                                    } else {
/* 142 */                               if (unsafe2.compareAndSwapLong(o1I0l0iolI0000Il00O, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
/* 149 */                                   o1I0l0iolI0000Il00O.I0000O.set(o1I0l0iolI0000Il00O.I0000Il00O & i5, null);
/* 152 */                                   o1I0l0iolI0000Il00O = null;
                                        } else {
                                            continue;
                                        }
                                    }
/* 153 */                           if (o1I0l0iolI0000Il00O == null) {
/* 541 */                               return obj;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.jvm.functions.Function1;
            import sun.misc.Unsafe;
            
            public class IIIII1OI1 implements IO1010 {
                public static final AtomicLongFieldUpdater I00iio = AtomicLongFieldUpdater.newUpdater(IIIII1OI1.class, "sendersAndCloseStatus$volatile");
                public static final AtomicLongFieldUpdater I00ilI0I1;
                public static final AtomicLongFieldUpdater I00ilO0;
                public static final AtomicLongFieldUpdater I00io1l;
                public static final AtomicReferenceFieldUpdater I00ioIO;
                public static final AtomicReferenceFieldUpdater I00l0I0l0lO1;
                public static final long I00l0OO0IO;
                public static final long I00li1OI;
                public static final long I00ll1;
                public static final long I00lli11;
                public static final long I00lll10;
                public static final long I00o0iI0io1;
                public static final long I00o0l1o1o0;
                public static final long I00o101lO;
                public static final long I00oI0i;
                public final int I00iOIl;
                public final Function1 I00iiI;
                public final I0iII1i10I I00iiO;
                private volatile Object _closeCause$volatile;
                private volatile long bufferEnd$volatile;
                private volatile Object bufferEndSegment$volatile;
                private volatile Object closeHandler$volatile;
                private volatile long completedExpandBuffersAndPauseFlag$volatile;
                private volatile Object receiveSegment$volatile;
                private volatile long receivers$volatile;
                private volatile Object sendSegment$volatile;
                private volatile long sendersAndCloseStatus$volatile;

                static {
/* 11 */            Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 21 */            I00oI0i = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("sendersAndCloseStatus$volatile"));
/* 29 */            I00ilI0I1 = AtomicLongFieldUpdater.newUpdater(IIIII1OI1.class, "receivers$volatile");
/* 39 */            I00o0l1o1o0 = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("receivers$volatile"));
/* 47 */            I00ilO0 = AtomicLongFieldUpdater.newUpdater(IIIII1OI1.class, "bufferEnd$volatile");
/* 57 */            I00li1OI = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("bufferEnd$volatile"));
/* 65 */            I00io1l = AtomicLongFieldUpdater.newUpdater(IIIII1OI1.class, "completedExpandBuffersAndPauseFlag$volatile");
/* 75 */            I00lll10 = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
/* 85 */            I00ioIO = AtomicReferenceFieldUpdater.newUpdater(IIIII1OI1.class, Object.class, "sendSegment$volatile");
/* 95 */            I00o101lO = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("sendSegment$volatile"));
/* 103 */           I00l0I0l0lO1 = AtomicReferenceFieldUpdater.newUpdater(IIIII1OI1.class, Object.class, "receiveSegment$volatile");
/* 113 */           I00o0iI0io1 = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("receiveSegment$volatile"));
/* 125 */           I00ll1 = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("bufferEndSegment$volatile"));
/* 137 */           I00l0OO0IO = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("_closeCause$volatile"));
/* 149 */           I00lli11 = unsafe.objectFieldOffset(IIIII1OI1.class.getDeclaredField("closeHandler$volatile"));
                }

                public IIIII1OI1(int i, Function1 function1) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = function1;
/* 8 */             I0iII1i10I i0iII1i10I = null;
/* 9 */             if (i < 0) {
/* 90 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Invalid channel capacity: ", i, ", should be >=0"));
/* 551 */               throw null;
                    }
/* 11 */            IO10oOO iO10oOO = IIIIIoiliIiO.I00000oIO;
/* 30 */            this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
/* 36 */            this.completedExpandBuffersAndPauseFlag$volatile = I000oI1ioi();
/* 45 */            IO10oOO iO10oOO2 = new IO10oOO(0L, null, this, 3);
/* 48 */            this.sendSegment$volatile = iO10oOO2;
/* 50 */            this.receiveSegment$volatile = iO10oOO2;
/* 60 */            this.bufferEndSegment$volatile = I001lllioOl() ? IIIIIoiliIiO.I00000oIO : iO10oOO2;
/* 62 */            if (function1 != null) {
/* 67 */                i0iII1i10I = new I0iII1i10I(3);
/* 70 */                i0iII1i10I.I00iiI = this;
/* 72 */                VarHandle.storeStoreFence();
                    }
/* 75 */            this.I00iiO = i0iII1i10I;
/* 79 */            this._closeCause$volatile = IIIIIoiliIiO.I0010o;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00IO1(IIIII1OI1 iiiii1oi1, IOoilo iOoilo) throws Throwable {
                    IIII1li iIII1li;
                    IO10oOO iO10oOO;
/* 3 */             if (iOoilo instanceof IIII1li) {
/* 6 */                 iIII1li = (IIII1li) iOoilo;
/* 8 */                 int i = iIII1li.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIII1li.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    iIII1li = new IIII1li(iiiii1oi1, iOoilo);
                        }
                    }
/* 19 */            IIII1li iIII1li2 = iIII1li;
/* 27 */            Object obj = iIII1li2.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = iIII1li2.I00iiO;
/* 35 */            if (i2 != 0) {
/* 37 */                if (i2 == 1) {
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 44 */                    return ((IO10lIoiO) obj).I00000oIO;
                        }
/* 49 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 53 */            lIoii1l01l0i.I00000oOI(obj);
/* 64 */            IO10oOO iO10oOO2 = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(iiiii1oi1, I00o0iI0io1);
/* 70 */            while (!iiiii1oi1.I001iOo1i0O()) {
/* 89 */                long andIncrement = I00ilI0I1.getAndIncrement(iiiii1oi1);
/* 93 */                long j = IIIIIoiliIiO.I00000oOI;
/* 96 */                long j2 = andIncrement / j;
/* 100 */               int i3 = (int) (andIncrement % j);
/* 105 */               if (iO10oOO2.I00iio != j2) {
/* 107 */                   IO10oOO iO10oOOI000OiO = iiiii1oi1.I000OiO(j2, iO10oOO2);
/* 111 */                   if (iO10oOOI000OiO == null) {
                                continue;
                            } else {
/* 114 */                       iO10oOO = iO10oOOI000OiO;
                            }
                        } else {
/* 116 */                   iO10oOO = iO10oOO2;
                        }
/* 118 */               IIIII1OI1 iiiii1oi12 = iiiii1oi1;
/* 121 */               Object objI00Io1lO = iiiii1oi12.I00Io1lO(iO10oOO, i3, andIncrement, null);
/* 128 */               if (objI00Io1lO == IIIIIoiliIiO.I000lI) {
/* 170 */                   I000II.I001IO000("unexpected");
/* 33 */                    return null;
                        }
/* 132 */               if (objI00Io1lO != IIIIIoiliIiO.I000oI1ioi) {
/* 150 */                   if (objI00Io1lO != IIIIIoiliIiO.I000o00OoI0I) {
/* 164 */                       iO10oOO.I00000oIO();
/* 167 */                       return objI00Io1lO;
                            }
/* 152 */                   iIII1li2.I00iiO = 1;
/* 156 */                   Object objI00IO1oi11O = iiiii1oi12.I00IO1oi11O(iO10oOO, i3, andIncrement, iIII1li2);
                            return objI00IO1oi11O == ii0111o ? ii0111o : objI00IO1oi11O;
                        }
/* 140 */               if (andIncrement < iiiii1oi12.I001IIilI0O()) {
/* 142 */                   iO10oOO.I00000oIO();
                        }
/* 145 */               iiiii1oi1 = iiiii1oi12;
/* 146 */               iO10oOO2 = iO10oOO;
                    }
/* 72 */            Throwable thI00100l0 = iiiii1oi1.I00100l0();
/* 78 */            IO10i1 iO10i1 = new IO10i1();
/* 81 */            iO10i1.I00000oIO = thI00100l0;
/* 83 */            VarHandle.storeStoreFence();
/* 86 */            return iO10i1;
                }

                public final boolean I00000oIO(long j) {
                    return j < I000oI1ioi() || j < I0010o() + ((long) this.I00iOIl);
                }

                /* JADX WARN: Code restructure failed: missing block: B:99:0x0176, code lost:
                
                    return r13;
                 */
                /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x015e A[RETURN] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oOI(IOoil1iiIilo iOoil1iiIilo, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object obj2;
                    Object objI0010I0i;
                    Object obj3;
                    String str;
                    int i;
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 3 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 5 */             long j = I00o101lO;
/* 11 */            IO10oOO iO10oOO = (IO10oOO) unsafe.getObjectVolatile(iiiii1oi1, j);
                    while (true) {
/* 13 */                AtomicLongFieldUpdater atomicLongFieldUpdater = I00iio;
/* 15 */                long andIncrement = atomicLongFieldUpdater.getAndIncrement(iiiii1oi1);
/* 24 */                long j2 = andIncrement & 1152921504606846975L;
/* 27 */                boolean zI001i1lo1io = iiiii1oi1.I001i1lo1io(andIncrement, false);
/* 31 */                int i2 = IIIIIoiliIiO.I00000oOI;
                        long j3 = i2;
/* 35 */                long j4 = j2 / j3;
/* 39 */                int i3 = (int) (j2 % j3);
/* 42 */                long j5 = iO10oOO.I00iio;
/* 46 */                Object obj4 = OoiIlOl1iI.I00000oIO;
/* 48 */                if (j5 != j4) {
/* 50 */                    IO10oOO iO10oOOI000l1 = iiiii1oi1.I000l1(j4, iO10oOO);
/* 54 */                    if (iO10oOOI000l1 != null) {
/* 70 */                        iO10oOO = iO10oOOI000l1;
                            } else if (zI001i1lo1io) {
/* 58 */                        Object objI00II0Ol1O0l = I00II0Ol1O0l(iOoil1iiIilo, obj);
/* 64 */                        if (objI00II0Ol1O0l == Ii0111o.I00iOIl) {
/* 66 */                            return objI00II0Ol1O0l;
                                }
                            }
                        }
/* 74 */                int iI00Io1o110i = iiiii1oi1.I00Io1o110i(iO10oOO, i3, obj, j2, null, zI001i1lo1io);
/* 78 */                if (iI00Io1o110i == 0) {
/* 377 */                   iO10oOO.I00000oIO();
/* 376 */                   return obj4;
                        }
/* 81 */                if (iI00Io1o110i == 1) {
                            break;
                        }
/* 84 */                if (iI00Io1o110i == 2) {
/* 361 */                   if (!zI001i1lo1io) {
/* 360 */                       return obj4;
                            }
/* 363 */                   iO10oOO.I000OOo1O();
/* 366 */                   Object objI00II0Ol1O0l2 = I00II0Ol1O0l(iOoil1iiIilo, obj);
                            return objI00II0Ol1O0l2 == Ii0111o.I00iOIl ? objI00II0Ol1O0l2 : obj4;
                        }
/* 89 */                if (iI00Io1o110i == 3) {
/* 126 */                   IIoOoIol0Io0 iIoOoIol0Io0I00000oOI = iOl0iOoIl.I00000oOI(l00iIoI.I0000Il00O(iOoil1iiIilo));
                            try {
/* 138 */                       int iI00Io1o110i2 = I00Io1o110i(iO10oOO, i3, obj, j2, iIoOoIol0Io0I00000oOI, false);
/* 142 */                       if (iI00Io1o110i2 != 0) {
/* 144 */                           if (iI00Io1o110i2 == 1) {
/* 329 */                               obj2 = obj4;
/* 330 */                               iIoOoIol0Io0I00000oOI.resumeWith(obj2);
                                    } else if (iI00Io1o110i2 != 2) {
/* 148 */                               if (iI00Io1o110i2 != 4) {
/* 150 */                                   String str2 = "unexpected";
/* 152 */                                   if (iI00Io1o110i2 != 5) {
/* 308 */                                       throw new IllegalStateException("unexpected");
                                            }
/* 154 */                                   iO10oOO.I00000oIO();
/* 163 */                                   IO10oOO iO10oOO2 = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, j);
                                            while (true) {
/* 165 */                                       long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
/* 169 */                                       long j6 = andIncrement2 & 1152921504606846975L;
/* 172 */                                       boolean zI001i1lo1io2 = I001i1lo1io(andIncrement2, false);
/* 176 */                                       int i4 = IIIIIoiliIiO.I00000oOI;
/* 178 */                                       AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                                long j7 = i4;
/* 181 */                                       long j8 = j6 / j7;
/* 185 */                                       int i5 = (int) (j6 % j7);
/* 186 */                                       obj2 = obj4;
/* 191 */                                       if (iO10oOO2.I00iio != j8) {
/* 193 */                                           IO10oOO iO10oOOI000l12 = I000l1(j8, iO10oOO2);
/* 197 */                                           if (iO10oOOI000l12 != null) {
/* 217 */                                               str = str2;
/* 218 */                                               i = i5;
/* 219 */                                               iO10oOO2 = iO10oOOI000l12;
                                                    } else {
/* 199 */                                               if (zI001i1lo1io2) {
                                                            break;
                                                        }
/* 209 */                                               obj4 = obj2;
/* 210 */                                               atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                    }
                                                } else {
/* 229 */                                           str = str2;
/* 230 */                                           i = i5;
                                                }
/* 233 */                                       int iI00Io1o110i3 = I00Io1o110i(iO10oOO2, i, obj, j6, iIoOoIol0Io0I00000oOI, zI001i1lo1io2);
/* 237 */                                       if (iI00Io1o110i3 == 0) {
/* 298 */                                           iO10oOO2.I00000oIO();
                                                    break;
                                                }
/* 239 */                                       if (iI00Io1o110i3 == 1) {
                                                    break;
                                                }
/* 242 */                                       if (iI00Io1o110i3 != 2) {
/* 245 */                                           if (iI00Io1o110i3 == 3) {
/* 281 */                                               throw new IllegalStateException(str);
                                                    }
/* 248 */                                           if (iI00Io1o110i3 != 4) {
/* 251 */                                               if (iI00Io1o110i3 == 5) {
/* 254 */                                                   iO10oOO2.I00000oIO();
                                                        }
/* 258 */                                               str2 = str;
/* 260 */                                               obj4 = obj2;
/* 261 */                                               atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                    } else if (j6 < I0010o()) {
/* 272 */                                               iO10oOO2.I00000oIO();
                                                    }
                                                } else if (zI001i1lo1io2) {
/* 284 */                                           iO10oOO2.I000OOo1O();
                                                } else {
/* 290 */                                           iIoOoIol0Io0I00000oOI.I00000oIO(iO10oOO2, i + i4);
                                                }
                                            }
                                        } else {
/* 309 */                                   obj2 = obj4;
/* 316 */                                   if (j2 < I0010o()) {
/* 318 */                                       iO10oOO.I00000oIO();
                                            }
                                        }
/* 201 */                               I00II0oii1o(obj, iIoOoIol0Io0I00000oOI);
                                    } else {
/* 322 */                               obj2 = obj4;
/* 325 */                               iIoOoIol0Io0I00000oOI.I00000oIO(iO10oOO, i3 + i2);
                                    }
/* 339 */                           objI0010I0i = iIoOoIol0Io0I00000oOI.I0010I0i();
/* 343 */                           obj3 = Ii0111o.I00iOIl;
/* 345 */                           if (objI0010I0i != obj3) {
/* 348 */                               objI0010I0i = obj2;
                                    }
                                    return objI0010I0i != obj3 ? objI0010I0i : obj2;
                                }
/* 334 */                       obj2 = obj4;
/* 335 */                       iO10oOO.I00000oIO();
/* 294 */                       iIoOoIol0Io0I00000oOI.resumeWith(obj2);
/* 339 */                       objI0010I0i = iIoOoIol0Io0I00000oOI.I0010I0i();
/* 343 */                       obj3 = Ii0111o.I00iOIl;
/* 345 */                       if (objI0010I0i != obj3) {
                                }
                                if (objI0010I0i != obj3) {
                                }
                            } catch (Throwable th) {
/* 352 */                       iIoOoIol0Io0I00000oOI.I001lIiIIo1O();
/* 355 */                       throw th;
                            }
                        } else if (iI00Io1o110i != 4) {
/* 93 */                    if (iI00Io1o110i == 5) {
/* 96 */                        iO10oOO.I00000oIO();
                            }
/* 99 */                    iiiii1oi1 = this;
                        } else {
/* 108 */                   if (j2 < I0010o()) {
/* 110 */                       iO10oOO.I00000oIO();
                            }
/* 113 */                   Object objI00II0Ol1O0l3 = I00II0Ol1O0l(iOoil1iiIilo, obj);
/* 119 */                   if (objI00II0Ol1O0l3 == Ii0111o.I00iOIl) {
/* 121 */                       return objI00II0Ol1O0l3;
                            }
                        }
                    }
                }

                public final boolean I0000Il00O(boolean z, Throwable th) {
                    long j;
                    Object objectVolatile;
                    Unsafe unsafe;
                    long j2;
                    long longVolatile;
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 10 */            if (z) {
                        while (true) {
/* 12 */                    Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 14 */                    long j3 = I00oI0i;
/* 16 */                    long longVolatile2 = unsafe2.getLongVolatile(iiiii1oi1, j3);
/* 23 */                    if (((int) (longVolatile2 >> 60)) != 0) {
                                break;
                            }
/* 27 */                    IO10oOO iO10oOO = IIIIIoiliIiO.I00000oIO;
/* 36 */                    if (unsafe2.compareAndSwapLong(iiiii1oi1, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 1152921504606846976L)) {
                                break;
                            }
/* 39 */                    iiiii1oi1 = this;
                        }
                    }
/* 48 */            IIIII1OI1 iiiii1oi12 = this;
/* 52 */            boolean zCompareAndSwapObject = I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iiiii1oi12, I00l0OO0IO, IIIIIoiliIiO.I0010o, th);
/* 59 */            if (z) {
/* 76 */                do {
/* 61 */                    unsafe = I1Ioolli0l0o.I00000oIO;
/* 63 */                    j2 = I00oI0i;
/* 65 */                    longVolatile = unsafe.getLongVolatile(iiiii1oi12, j2);
/* 76 */                } while (!unsafe.compareAndSwapLong(iiiii1oi12, j2, longVolatile, (longVolatile & 1152921504606846975L) + 3458764513820540928L));
                    } else {
                        while (true) {
/* 79 */                    Unsafe unsafe3 = I1Ioolli0l0o.I00000oIO;
/* 81 */                    long j4 = I00oI0i;
/* 83 */                    long longVolatile3 = unsafe3.getLongVolatile(iiiii1oi12, j4);
/* 89 */                    int i = (int) (longVolatile3 >> 60);
/* 90 */                    if (i == 0) {
/* 103 */                       j = (longVolatile3 & 1152921504606846975L) + 2305843009213693952L;
                            } else {
/* 92 */                        if (i != 1) {
                                    break;
                                }
/* 97 */                        j = (longVolatile3 & 1152921504606846975L) + 3458764513820540928L;
                            }
/* 108 */                   if (unsafe3.compareAndSwapLong(iiiii1oi12, j4, longVolatile3, j)) {
                                break;
                            }
/* 156 */                   iiiii1oi12 = this;
                        }
                    }
/* 110 */           iiiii1oi12.I001l0I00();
/* 113 */           if (zCompareAndSwapObject) {
                        while (true) {
/* 115 */                   Unsafe unsafe4 = I1Ioolli0l0o.I00000oIO;
/* 117 */                   long j5 = I00lli11;
/* 119 */                   objectVolatile = unsafe4.getObjectVolatile(iiiii1oi12, j5);
/* 134 */                   if (unsafe4.compareAndSwapObject(iiiii1oi12, j5, objectVolatile, objectVolatile == null ? IIIIIoiliIiO.I00100o1O0lo : IIIIIoiliIiO.I0010I0i)) {
                                break;
                            }
/* 152 */                   iiiii1oi12 = this;
                        }
/* 136 */               if (objectVolatile != null) {
/* 139 */                   OoOOI1100oI0.I0000Il00O(1, objectVolatile);
/* 148 */                   ((Function1) objectVolatile).invoke(I00100l0());
/* 151 */                   return zCompareAndSwapObject;
                        }
                    }
/* 155 */           return zCompareAndSwapObject;
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
                
                    r0 = (p000.IO10oOO) ((p000.IOlOio11) p000.I1Ioolli0l0o.I00000oIO.getObjectVolatile(r0, p000.IOlOio11.I00iiI));
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IO10oOO I0000O(long j) {
                    IOlOio11 iOlOio11;
                    Unsafe unsafe;
                    long j2;
                    I0OooiI1I i0OooiI1I;
                    long j3;
/* 1 */             Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 5 */             Object objectVolatile = unsafe2.getObjectVolatile(this, I00ll1);
/* 15 */            IO10oOO iO10oOO = (IO10oOO) unsafe2.getObjectVolatile(this, I00o101lO);
/* 26 */            if (iO10oOO.I00iio > ((IO10oOO) objectVolatile).I00iio) {
/* 28 */                objectVolatile = iO10oOO;
                    }
/* 35 */            IO10oOO iO10oOO2 = (IO10oOO) unsafe2.getObjectVolatile(this, I00o0iI0io1);
/* 46 */            if (iO10oOO2.I00iio > ((IO10oOO) objectVolatile).I00iio) {
/* 48 */                objectVolatile = iO10oOO2;
                    }
/* 49 */            IOlOio11 iOlOio112 = (IOlOio11) objectVolatile;
                    loop0: while (true) {
/* 51 */                iOlOio11 = iOlOio112;
/* 80 */                do {
/* 52 */                    int i = IOlOio11.I00iiO;
/* 54 */                    iOlOio11.getClass();
/* 57 */                    unsafe = I1Ioolli0l0o.I00000oIO;
/* 59 */                    j2 = IOlOio11.I00iOIl;
/* 61 */                    Object objectVolatile2 = unsafe.getObjectVolatile(iOlOio11, j2);
/* 65 */                    i0OooiI1I = IOlOiIllI01O.I00000oIO;
/* 67 */                    if (objectVolatile2 == i0OooiI1I) {
                                break loop0;
                            }
/* 71 */                    iOlOio112 = (IOlOio11) objectVolatile2;
/* 73 */                    if (iOlOio112 == null) {
                            }
/* 80 */                } while (!unsafe.compareAndSwapObject(iOlOio11, j2, (Object) null, i0OooiI1I));
                    }
/* 82 */            IO10oOO iO10oOO3 = (IO10oOO) iOlOio11;
/* 90 */            if (I001lIiIIo1O()) {
/* 92 */                IO10oOO iO10oOO4 = iO10oOO3;
/* 160 */               loop2: do {
/* 95 */                    int i2 = IIIIIoiliIiO.I00000oOI - 1;
                            while (true) {
/* 98 */                        if (-1 >= i2) {
                                    break;
                                }
/* 107 */                       j3 = (iO10oOO4.I00iio * IIIIIoiliIiO.I00000oOI) + i2;
/* 114 */                       if (j3 < I0010o()) {
                                    break loop2;
                                }
                                while (true) {
/* 118 */                           Object objI000l1 = iO10oOO4.I000l1(i2);
/* 122 */                           if (objI000l1 != null && objI000l1 != IIIIIoiliIiO.I0000oI00) {
/* 131 */                               if (objI000l1 == IIIIIoiliIiO.I0000O) {
                                            break loop2;
                                        }
                                    } else {
/* 140 */                               if (iO10oOO4.I000iOII(i2, objI000l1, IIIIIoiliIiO.I000l1)) {
/* 142 */                                   iO10oOO4.I000OOo1O();
                                            break;
                                        }
                                    }
                                }
                                i2--;
                            }
/* 160 */               } while (iO10oOO4 != null);
/* 116 */               j3 = -1;
/* 165 */               if (j3 != -1) {
/* 167 */                   I000O01llI0(j3);
                        }
                    }
/* 170 */           Object objI00000oIO = null;
/* 172 */           loop5: for (IO10oOO iO10oOO5 = iO10oOO3; iO10oOO5 != null; iO10oOO5 = (IO10oOO) ((IOlOio11) I1Ioolli0l0o.I00000oIO.getObjectVolatile(iO10oOO5, IOlOio11.I00iiI))) {
/* 177 */               for (int i3 = IIIIIoiliIiO.I00000oOI - 1; -1 < i3; i3--) {
/* 189 */                   if ((iO10oOO5.I00iio * IIIIIoiliIiO.I00000oOI) + i3 < j) {
                                break loop5;
                            }
                            while (true) {
/* 191 */                       Object objI000l12 = iO10oOO5.I000l1(i3);
/* 195 */                       if (objI000l12 != null && objI000l12 != IIIIIoiliIiO.I0000oI00) {
/* 204 */                           if (!(objI000l12 instanceof Ooooo1IIIoo0)) {
/* 228 */                               if (!(objI000l12 instanceof OoooliO1IoI1)) {
                                            break;
                                        }
/* 236 */                               if (iO10oOO5.I000iOII(i3, objI000l12, IIIIIoiliIiO.I000l1)) {
/* 238 */                                   objI00000oIO = ioo0Il.I00000oIO(objI00000oIO, objI000l12);
/* 242 */                                   iO10oOO5.I000lI(i3, true);
                                            break;
                                        }
                                    } else {
/* 212 */                               if (iO10oOO5.I000iOII(i3, objI000l12, IIIIIoiliIiO.I000l1)) {
/* 218 */                                   objI00000oIO = ioo0Il.I00000oIO(objI00000oIO, ((Ooooo1IIIoo0) objI000l12).I00000oIO);
/* 222 */                                   iO10oOO5.I000lI(i3, true);
                                            break;
                                        }
                                    }
                                } else {
/* 252 */                           if (iO10oOO5.I000iOII(i3, objI000l12, IIIIIoiliIiO.I000l1)) {
/* 254 */                               iO10oOO5.I000OOo1O();
                                        break;
                                    }
                                }
                            }
                        }
                    }
/* 273 */           if (objI00000oIO != null) {
/* 277 */               if (!(objI00000oIO instanceof ArrayList)) {
/* 281 */                   I00IOO((OoooliO1IoI1) objI00000oIO, true);
/* 284 */                   return iO10oOO3;
                        }
/* 285 */               ArrayList arrayList = (ArrayList) objI00000oIO;
/* 292 */               for (int size = arrayList.size() - 1; -1 < size; size--) {
/* 300 */                   I00IOO((OoooliO1IoI1) arrayList.get(size), true);
                        }
                    }
/* 966 */           return iO10oOO3;
                }

                @Override
                public final Object I0000oI00() {
                    IO10oOO iO10oOO;
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 5 */             long longVolatile = unsafe.getLongVolatile(this, I00o0l1o1o0);
/* 11 */            long longVolatile2 = unsafe.getLongVolatile(this, I00oI0i);
/* 20 */            if (I001i1lo1io(longVolatile2, true)) {
/* 22 */                Throwable thI00100l0 = I00100l0();
/* 28 */                IO10i1 iO10i1 = new IO10i1();
/* 31 */                iO10i1.I00000oIO = thI00100l0;
/* 33 */                VarHandle.storeStoreFence();
/* 36 */                return iO10i1;
                    }
/* 42 */            long j = longVolatile2 & 1152921504606846975L;
/* 45 */            IO10l0l0 iO10l0l0 = IO10lIoiO.I00000oOI;
/* 47 */            if (longVolatile >= j) {
/* 49 */                return iO10l0l0;
                    }
/* 50 */            Object obj = IIIIIoiliIiO.I000iOII;
/* 58 */            IO10oOO iO10oOO2 = (IO10oOO) unsafe.getObjectVolatile(this, I00o0iI0io1);
/* 64 */            while (!this.I001iOo1i0O()) {
/* 83 */                long andIncrement = I00ilI0I1.getAndIncrement(this);
/* 87 */                long j2 = IIIIIoiliIiO.I00000oOI;
/* 90 */                long j3 = andIncrement / j2;
/* 94 */                int i = (int) (andIncrement % j2);
/* 99 */                if (iO10oOO2.I00iio != j3) {
/* 101 */                   IO10oOO iO10oOOI000OiO = this.I000OiO(j3, iO10oOO2);
/* 105 */                   if (iO10oOOI000OiO == null) {
                                continue;
                            } else {
/* 108 */                       iO10oOO = iO10oOOI000OiO;
                            }
                        } else {
/* 111 */                   iO10oOO = iO10oOO2;
                        }
/* 109 */               IIIII1OI1 iiiii1oi1 = this;
/* 113 */               Object objI00Io1lO = iiiii1oi1.I00Io1lO(iO10oOO, i, andIncrement, obj);
/* 117 */               iO10oOO2 = iO10oOO;
/* 121 */               if (objI00Io1lO == IIIIIoiliIiO.I000lI) {
/* 128 */                   OoooliO1IoI1 ooooliO1IoI1 = obj instanceof OoooliO1IoI1 ? (OoooliO1IoI1) obj : null;
/* 130 */                   if (ooooliO1IoI1 != null) {
/* 132 */                       ooooliO1IoI1.I00000oIO(iO10oOO2, i);
                            }
/* 135 */                   iiiii1oi1.I00IoO0(andIncrement);
/* 138 */                   iO10oOO2.I000OOo1O();
/* 141 */                   return iO10l0l0;
                        }
/* 144 */               if (objI00Io1lO != IIIIIoiliIiO.I000oI1ioi) {
/* 161 */                   if (objI00Io1lO != IIIIIoiliIiO.I000o00OoI0I) {
/* 163 */                       iO10oOO2.I00000oIO();
/* 166 */                       return objI00Io1lO;
                            }
/* 169 */                   I000II.I001IO000("unexpected");
/* 120 */                   return null;
                        }
/* 152 */               if (andIncrement < iiiii1oi1.I001IIilI0O()) {
/* 154 */                   iO10oOO2.I00000oIO();
                        }
/* 157 */               this = iiiii1oi1;
                    }
/* 66 */            Throwable thI00100l02 = this.I00100l0();
/* 72 */            IO10i1 iO10i12 = new IO10i1();
/* 75 */            iO10i12.I00000oIO = thI00100l02;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            return iO10i12;
                }

                @Override
                public final boolean I0001Ioi1lo(Throwable th) {
/* 2 */             return I0000Il00O(false, th);
                }

                @Override
                public final void I000II(CancellationException cancellationException) {
/* 1 */             if (cancellationException == null) {
/* 7 */                 cancellationException = new CancellationException("Channel was cancelled");
                    }
/* 11 */            I0000Il00O(true, cancellationException);
                }

                public final void I000O01llI0(long j) {
                    IOiIIo1l iOiIIo1lI00000oOI;
/* 9 */             IO10oOO iO10oOO = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00o0iI0io1);
                    while (true) {
/* 11 */                Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 13 */                long j2 = I00o0l1o1o0;
/* 15 */                long longVolatile = unsafe.getLongVolatile(this, j2);
/* 33 */                if (j < Math.max(this.I00iOIl + longVolatile, this.I000oI1ioi())) {
/* 35 */                    return;
                        }
/* 39 */                IIIII1OI1 iiiii1oi1 = this;
/* 44 */                if (unsafe.compareAndSwapLong(iiiii1oi1, j2, longVolatile, 1 + longVolatile)) {
/* 46 */                    long j3 = IIIIIoiliIiO.I00000oOI;
/* 49 */                    long j4 = longVolatile / j3;
/* 53 */                    int i = (int) (longVolatile % j3);
/* 58 */                    if (iO10oOO.I00iio != j4) {
/* 60 */                        IO10oOO iO10oOOI000OiO = iiiii1oi1.I000OiO(j4, iO10oOO);
/* 64 */                        if (iO10oOOI000OiO != null) {
/* 67 */                            iO10oOO = iO10oOOI000OiO;
                                }
                            }
/* 71 */                    IO10oOO iO10oOO2 = iO10oOO;
/* 73 */                    Object objI00Io1lO = iiiii1oi1.I00Io1lO(iO10oOO2, i, longVolatile, null);
/* 79 */                    if (objI00Io1lO != IIIIIoiliIiO.I000oI1ioi) {
/* 93 */                        iO10oOO2.I00000oIO();
/* 96 */                        Function1 function1 = iiiii1oi1.I00iiI;
/* 98 */                        if (function1 != null && (iOiIIo1lI00000oOI = l1l0ii1lOoI1.I00000oOI(function1, objI00Io1lO, null)) != null) {
/* 108 */                           throw iOiIIo1lI00000oOI;
                                }
                            } else if (longVolatile < iiiii1oi1.I001IIilI0O()) {
/* 89 */                        iO10oOO2.I00000oIO();
                            }
/* 109 */                   this = iiiii1oi1;
/* 110 */                   iO10oOO = iO10oOO2;
                        }
/* 112 */               this = iiiii1oi1;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:96:0x017a, code lost:
                
                    r1.I001IO000(1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x017d, code lost:
                
                    return;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OOo1O() {
                    Object objI00000oIO;
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 7 */             if (iiiii1oi1.I001lllioOl()) {
/* 9 */                 return;
                    }
/* 18 */            IO10oOO iO10oOO = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(iiiii1oi1, I00ll1);
                    loop0: while (true) {
/* 23 */                long andIncrement = I00ilO0.getAndIncrement(iiiii1oi1);
/* 30 */                long j = andIncrement / IIIIIoiliIiO.I00000oOI;
/* 38 */                if (iiiii1oi1.I001IIilI0O() <= andIncrement) {
/* 44 */                    if (iO10oOO.I00iio < j && iO10oOO.I0000Il00O() != null) {
/* 52 */                        iiiii1oi1.I001lloI(j, iO10oOO);
                            }
/* 3 */                     iiiii1oi1.I001IO000(1L);
/* 58 */                    return;
                        }
/* 63 */                if (iO10oOO.I00iio != j) {
/* 65 */                    IIIIIl iIIIIl = IIIIIl.I00ioIO;
                            while (true) {
/* 67 */                        objI00000oIO = IOlOiIllI01O.I00000oIO(iO10oOO, j, iIIIIl);
/* 75 */                        if (lO1II0.I00000oOI(objI00000oIO)) {
                                    break;
                                }
/* 77 */                        Oii1O0I oii1O0II00000oIO = lO1II0.I00000oIO(objI00000oIO);
                                while (true) {
/* 81 */                            Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 83 */                            long j2 = I00ll1;
/* 89 */                            Oii1O0I oii1O0I = (Oii1O0I) unsafe.getObjectVolatile(iiiii1oi1, j2);
/* 98 */                            if (oii1O0I.I00iio >= oii1O0II00000oIO.I00iio) {
/* 100 */                               iiiii1oi1 = this;
                                        break;
                                    }
/* 107 */                           if (!oii1O0II00000oIO.I000OiO()) {
                                        break;
                                    }
/* 112 */                           iiiii1oi1 = this;
/* 119 */                           if (unsafe.compareAndSwapObject(iiiii1oi1, j2, oii1O0I, oii1O0II00000oIO)) {
/* 125 */                               if (oii1O0I.I0001Ioi1lo()) {
/* 127 */                                   oii1O0I.I0000oI00();
                                        }
                                    } else if (oii1O0II00000oIO.I0001Ioi1lo()) {
/* 137 */                               oii1O0II00000oIO.I0000oI00();
                                    }
                                }
/* 109 */                       iiiii1oi1 = this;
                            }
/* 145 */                   IO10oOO iO10oOO2 = null;
/* 146 */                   if (lO1II0.I00000oOI(objI00000oIO)) {
/* 148 */                       iiiii1oi1.I001l0I00();
/* 151 */                       iiiii1oi1.I001lloI(j, iO10oOO);
/* 3 */                         iiiii1oi1.I001IO000(1L);
                            } else {
/* 162 */                       IO10oOO iO10oOO3 = (IO10oOO) lO1II0.I00000oIO(objI00000oIO);
/* 164 */                       long j3 = iO10oOO3.I00iio;
/* 168 */                       if (j3 > j) {
/* 176 */                           long j4 = IIIIIoiliIiO.I00000oOI * j3;
/* 185 */                           if (I1Ioolli0l0o.I00000oIO.compareAndSwapLong(iiiii1oi1, I00li1OI, 1 + andIncrement, j4)) {
/* 188 */                               iiiii1oi1.I001IO000(j4 - andIncrement);
                                    } else {
/* 3 */                                 iiiii1oi1.I001IO000(1L);
                                    }
                                } else {
/* 196 */                           iO10oOO2 = iO10oOO3;
                                }
                            }
/* 197 */                   if (iO10oOO2 == null) {
                                continue;
                            } else {
/* 201 */                       iO10oOO = iO10oOO2;
                            }
                        }
/* 207 */               int i = (int) (andIncrement % IIIIIoiliIiO.I00000oOI);
/* 208 */               Object objI000l1 = iO10oOO.I000l1(i);
/* 212 */               boolean z = objI000l1 instanceof OoooliO1IoI1;
/* 214 */               long j5 = I00o0l1o1o0;
/* 216 */               if (!z || andIncrement < I1Ioolli0l0o.I00000oIO.getLongVolatile(iiiii1oi1, j5) || !iO10oOO.I000iOII(i, objI000l1, IIIIIoiliIiO.I000II)) {
                            while (true) {
/* 258 */                       Object objI000l12 = iO10oOO.I000l1(i);
/* 264 */                       if (!(objI000l12 instanceof OoooliO1IoI1)) {
/* 327 */                           if (objI000l12 != IIIIIoiliIiO.I000OiO) {
/* 334 */                               if (objI000l12 != null) {
/* 347 */                                   if (objI000l12 == IIIIIoiliIiO.I0000O || objI000l12 == IIIIIoiliIiO.I000O01llI0 || objI000l12 == IIIIIoiliIiO.I000OOo1O || objI000l12 == IIIIIoiliIiO.I000iOII || objI000l12 == IIIIIoiliIiO.I000l1) {
                                                break loop0;
                                            } else if (objI000l12 != IIIIIoiliIiO.I0001Ioi1lo) {
/* 375 */                                       IOOlIIilOl0.I000lI("Unexpected cell state: ", objI000l12);
/* 378 */                                       return;
                                            }
                                        } else if (iO10oOO.I000iOII(i, objI000l12, IIIIIoiliIiO.I0000oI00)) {
                                            break loop0;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (andIncrement < I1Ioolli0l0o.I00000oIO.getLongVolatile(iiiii1oi1, j5)) {
/* 281 */                           Ooooo1IIIoo0 ooooo1IIIoo0 = new Ooooo1IIIoo0();
/* 284 */                           ooooo1IIIoo0.I00000oIO = (OoooliO1IoI1) objI000l12;
/* 286 */                           VarHandle.storeStoreFence();
/* 293 */                           if (iO10oOO.I000iOII(i, objI000l12, ooooo1IIIoo0)) {
                                        break loop0;
                                    }
                                } else if (iO10oOO.I000iOII(i, objI000l12, IIIIIoiliIiO.I000II)) {
/* 308 */                           if (iiiii1oi1.I00IlilI0i0i(objI000l12, iO10oOO, i)) {
/* 312 */                               iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I0000O);
                                        break;
                                    } else {
/* 318 */                               iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I000OiO);
/* 321 */                               iO10oOO.I000OOo1O();
                                    }
                                }
                            }
                        } else if (iiiii1oi1.I00IlilI0i0i(objI000l1, iO10oOO, i)) {
/* 244 */                   iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I0000O);
                            break;
                        } else {
/* 251 */                   iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I000OiO);
/* 254 */                   iO10oOO.I000OOo1O();
/* 3 */                     iiiii1oi1.I001IO000(1L);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00e3 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IO10oOO I000OiO(long j, IO10oOO iO10oOO) {
                    Object objI00000oIO;
                    IO10oOO iO10oOO2;
                    Unsafe unsafe;
                    long j2;
                    long longVolatile;
/* 5 */             IO10oOO iO10oOO3 = IIIIIoiliIiO.I00000oIO;
/* 7 */             IIIIIl iIIIIl = IIIIIl.I00ioIO;
                    loop0: while (true) {
/* 9 */                 objI00000oIO = IOlOiIllI01O.I00000oIO(iO10oOO, j, iIIIIl);
/* 17 */                if (!lO1II0.I00000oOI(objI00000oIO)) {
/* 19 */                    Oii1O0I oii1O0II00000oIO = lO1II0.I00000oIO(objI00000oIO);
                            while (true) {
/* 23 */                        Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 25 */                        long j3 = I00o0iI0io1;
/* 31 */                        Oii1O0I oii1O0I = (Oii1O0I) unsafe2.getObjectVolatile(this, j3);
/* 39 */                        if (oii1O0I.I00iio >= oii1O0II00000oIO.I00iio) {
                                    break loop0;
                                }
/* 46 */                        if (!oii1O0II00000oIO.I000OiO()) {
                                    break;
                                }
/* 54 */                        if (unsafe2.compareAndSwapObject(this, j3, oii1O0I, oii1O0II00000oIO)) {
/* 60 */                            if (oii1O0I.I0001Ioi1lo()) {
/* 62 */                                oii1O0I.I0000oI00();
                                    }
                                } else if (oii1O0II00000oIO.I0001Ioi1lo()) {
/* 72 */                            oii1O0II00000oIO.I0000oI00();
                                }
                            }
                        } else {
                            break;
                        }
                    }
/* 81 */            if (lO1II0.I00000oOI(objI00000oIO)) {
/* 83 */                I001l0I00();
/* 98 */                if (iO10oOO.I00iio * IIIIIoiliIiO.I00000oOI < I001IIilI0O()) {
/* 100 */                   iO10oOO.I00000oIO();
/* 80 */                    return null;
                        }
                    } else {
/* 109 */               IO10oOO iO10oOO4 = (IO10oOO) lO1II0.I00000oIO(objI00000oIO);
/* 111 */               long j4 = iO10oOO4.I00iio;
/* 117 */               if (I001lllioOl() || j > I000oI1ioi() / IIIIIoiliIiO.I00000oOI) {
/* 182 */                   iO10oOO2 = iO10oOO4;
/* 185 */                   if (j4 > j) {
/* 551 */                       return iO10oOO2;
                            }
/* 190 */                   long j5 = j4 * IIIIIoiliIiO.I00000oOI;
/* 210 */                   do {
/* 192 */                       unsafe = I1Ioolli0l0o.I00000oIO;
/* 194 */                       j2 = I00o0l1o1o0;
/* 196 */                       longVolatile = unsafe.getLongVolatile(this, j2);
/* 202 */                       if (longVolatile >= j5) {
                                    break;
                                }
/* 210 */                   } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j5));
/* 222 */                   if (j4 * IIIIIoiliIiO.I00000oOI < I001IIilI0O()) {
/* 224 */                       iO10oOO2.I00000oIO();
                            }
                        } else {
                            while (true) {
/* 131 */                       Unsafe unsafe3 = I1Ioolli0l0o.I00000oIO;
/* 133 */                       long j6 = I00ll1;
/* 139 */                       Oii1O0I oii1O0I2 = (Oii1O0I) unsafe3.getObjectVolatile(this, j6);
/* 145 */                       if (oii1O0I2.I00iio >= j4 || !iO10oOO4.I000OiO()) {
                                    break;
                                }
/* 158 */                       iO10oOO2 = iO10oOO4;
/* 159 */                       if (!unsafe3.compareAndSwapObject(this, j6, oii1O0I2, iO10oOO4)) {
/* 175 */                           if (iO10oOO2.I0001Ioi1lo()) {
/* 177 */                               iO10oOO2.I0000oI00();
                                    }
/* 180 */                           iO10oOO4 = iO10oOO2;
                                } else if (oii1O0I2.I0001Ioi1lo()) {
/* 167 */                           oii1O0I2.I0000oI00();
                                }
                            }
/* 182 */                   iO10oOO2 = iO10oOO4;
/* 185 */                   if (j4 > j) {
                            }
                        }
                    }
/* 80 */            return null;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [long] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v8 */
                @Override
                public final Object I000iOII(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IO10oOO iO10oOO;
                    Throwable th;
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    IIoOoIol0Io0 iIoOoIol0Io02;
                    IIII0lIOio00 iIII0lIOio00;
                    IO10oOO iO10oOO2;
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */             ?? r1 = I00o0iI0io1;
/* 9 */             IO10oOO iO10oOO3 = (IO10oOO) unsafe.getObjectVolatile(this, (long) r1);
/* 15 */            while (!this.I001iOo1i0O()) {
/* 17 */                AtomicLongFieldUpdater atomicLongFieldUpdater = I00ilI0I1;
/* 19 */                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
/* 23 */                long j = IIIIIoiliIiO.I00000oOI;
/* 26 */                long j2 = andIncrement / j;
/* 30 */                int i = (int) (andIncrement % j);
/* 35 */                if (iO10oOO3.I00iio != j2) {
/* 37 */                    IO10oOO iO10oOOI000OiO = this.I000OiO(j2, iO10oOO3);
/* 41 */                    if (iO10oOOI000OiO == null) {
                                continue;
                            } else {
/* 44 */                        iO10oOO = iO10oOOI000OiO;
                            }
                        } else {
/* 46 */                    iO10oOO = iO10oOO3;
                        }
/* 48 */                IIIII1OI1 iiiii1oi1 = this;
/* 49 */                Object objI00Io1lO = iiiii1oi1.I00Io1lO(iO10oOO, i, andIncrement, null);
/* 53 */                I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I000lI;
/* 55 */                IIII0lIOio00 iIII0lIOio002 = null;
/* 58 */                if (objI00Io1lO == i0OooiI1I) {
/* 299 */                   I000II.I001IO000("unexpected");
/* 55 */                    return null;
                        }
/* 60 */                I0OooiI1I i0OooiI1I2 = IIIIIoiliIiO.I000oI1ioi;
/* 62 */                if (objI00Io1lO == i0OooiI1I2) {
/* 70 */                    if (andIncrement < iiiii1oi1.I001IIilI0O()) {
/* 72 */                        iO10oOO.I00000oIO();
                            }
/* 75 */                    this = iiiii1oi1;
/* 76 */                    iO10oOO3 = iO10oOO;
                        } else {
/* 80 */                    if (objI00Io1lO != IIIIIoiliIiO.I000o00OoI0I) {
/* 295 */                       iO10oOO.I00000oIO();
/* 298 */                       return objI00Io1lO;
                            }
/* 86 */                    IIoOoIol0Io0 iIoOoIol0Io0I00000oOI = iOl0iOoIl.I00000oOI(l00iIoI.I0000Il00O(iOoil1iiIilo));
                            try {
/* 90 */                        Object objI00Io1lO2 = iiiii1oi1.I00Io1lO(iO10oOO, i, andIncrement, iIoOoIol0Io0I00000oOI);
                                try {
/* 94 */                            if (objI00Io1lO2 == i0OooiI1I) {
/* 96 */                                iIoOoIol0Io0I00000oOI.I00000oIO(iO10oOO, i);
                                    } else {
/* 107 */                               Function1 function1 = iiiii1oi1.I00iiI;
                                        try {
/* 109 */                                   if (objI00Io1lO2 == i0OooiI1I2) {
/* 117 */                                       if (andIncrement < iiiii1oi1.I001IIilI0O()) {
/* 119 */                                           iO10oOO.I00000oIO();
                                                }
/* 128 */                                       IO10oOO iO10oOO4 = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(iiiii1oi1, (long) r1);
/* 134 */                                       while (!iiiii1oi1.I001iOo1i0O()) {
/* 148 */                                           IIoOoIol0Io0 iIoOoIol0Io03 = iIoOoIol0Io0I00000oOI;
                                                    try {
/* 149 */                                               long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(iiiii1oi1);
/* 153 */                                               long j3 = IIIIIoiliIiO.I00000oOI;
/* 156 */                                               long j4 = andIncrement2 / j3;
/* 160 */                                               int i2 = (int) (andIncrement2 % j3);
/* 165 */                                               if (iO10oOO4.I00iio != j4) {
                                                            try {
/* 167 */                                                       IO10oOO iO10oOOI000OiO2 = iiiii1oi1.I000OiO(j4, iO10oOO4);
/* 171 */                                                       if (iO10oOOI000OiO2 == null) {
/* 173 */                                                           iIoOoIol0Io0I00000oOI = iIoOoIol0Io03;
                                                                } else {
/* 175 */                                                           iO10oOO2 = iO10oOOI000OiO2;
                                                                }
                                                            } catch (Throwable th2) {
/* 179 */                                                       th = th2;
/* 180 */                                                       iIoOoIol0Io0 = iIoOoIol0Io03;
/* 291 */                                                       iIoOoIol0Io0.I001lIiIIo1O();
/* 294 */                                                       throw th;
                                                            }
                                                        } else {
/* 183 */                                                   iO10oOO2 = iO10oOO4;
                                                        }
/* 176 */                                               IIIII1OI1 iiiii1oi12 = iiiii1oi1;
/* 185 */                                               objI00Io1lO2 = iiiii1oi12.I00Io1lO(iO10oOO2, i2, andIncrement2, iIoOoIol0Io03);
/* 189 */                                               iiiii1oi1 = iiiii1oi12;
/* 190 */                                               IO10oOO iO10oOO5 = iO10oOO2;
/* 191 */                                               iIoOoIol0Io02 = iIoOoIol0Io03;
/* 194 */                                               if (objI00Io1lO2 == IIIIIoiliIiO.I000lI) {
/* 196 */                                                   iIoOoIol0Io02.I00000oIO(iO10oOO5, i2);
                                                            break;
                                                        }
/* 205 */                                               if (objI00Io1lO2 == IIIIIoiliIiO.I000oI1ioi) {
/* 213 */                                                   if (andIncrement2 < iiiii1oi1.I001IIilI0O()) {
/* 215 */                                                       iO10oOO5.I00000oIO();
                                                            }
/* 218 */                                                   iO10oOO4 = iO10oOO5;
/* 219 */                                                   iIoOoIol0Io0I00000oOI = iIoOoIol0Io02;
                                                        } else {
/* 223 */                                                   if (objI00Io1lO2 == IIIIIoiliIiO.I000o00OoI0I) {
/* 255 */                                                       throw new IllegalStateException("unexpected");
                                                            }
/* 225 */                                                   iO10oOO5.I00000oIO();
/* 228 */                                                   if (function1 != null) {
/* 242 */                                                       iIII0lIOio00 = new IIII0lIOio00(3, iiiii1oi1, IIIII1OI1.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0);
/* 245 */                                                       iIII0lIOio002 = iIII0lIOio00;
                                                            }
/* 246 */                                                   iIoOoIol0Io02.I000OiO(objI00Io1lO2, iIII0lIOio002);
                                                        }
                                                    } catch (Throwable th3) {
/* 256 */                                               th = th3;
/* 257 */                                               r1 = iIoOoIol0Io03;
/* 201 */                                               th = th;
                                                        iIoOoIol0Io0 = r1;
/* 291 */                                               iIoOoIol0Io0.I001lIiIIo1O();
/* 294 */                                               throw th;
                                                    }
                                                }
/* 144 */                                       iIoOoIol0Io0I00000oOI.resumeWith(lIoii1l01l0i.I00000oIO(iiiii1oi1.I0010I0i()));
                                            } else {
/* 262 */                                       iIoOoIol0Io02 = iIoOoIol0Io0I00000oOI;
/* 263 */                                       iO10oOO.I00000oIO();
/* 266 */                                       if (function1 != null) {
/* 280 */                                           iIII0lIOio00 = new IIII0lIOio00(3, iiiii1oi1, IIIII1OI1.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0);
/* 245 */                                           iIII0lIOio002 = iIII0lIOio00;
                                                }
/* 246 */                                       iIoOoIol0Io02.I000OiO(objI00Io1lO2, iIII0lIOio002);
                                            }
/* 284 */                                   Object objI0010I0i = iIoOoIol0Io02.I0010I0i();
/* 288 */                                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 290 */                                   return objI0010I0i;
                                        } catch (Throwable th4) {
/* 200 */                                   th = th4;
                                        }
                                    }
/* 99 */                            iIoOoIol0Io02 = iIoOoIol0Io0I00000oOI;
/* 284 */                           Object objI0010I0i2 = iIoOoIol0Io02.I0010I0i();
/* 288 */                           Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 290 */                           return objI0010I0i2;
                                } catch (Throwable th5) {
/* 103 */                           th = th5;
/* 104 */                           iIoOoIol0Io0 = iIoOoIol0Io0I00000oOI;
                                }
                            } catch (Throwable th6) {
/* 259 */                       th = th6;
/* 260 */                       r1 = iIoOoIol0Io0I00000oOI;
                            }
                        }
                    }
/* 304 */           Throwable thI0010I0i = this.I0010I0i();
/* 308 */           int i3 = OlIl00i.I00000oIO;
/* 966 */           throw thI0010I0i;
                }

                public final IO10oOO I000l1(long j, IO10oOO iO10oOO) {
                    Object objI00000oIO;
                    IO10oOO iO10oOO2;
                    long j2;
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 7 */             IO10oOO iO10oOO3 = IIIIIoiliIiO.I00000oIO;
/* 9 */             IIIIIl iIIIIl = IIIIIl.I00ioIO;
                    loop0: while (true) {
/* 11 */                objI00000oIO = IOlOiIllI01O.I00000oIO(iO10oOO, j, iIIIIl);
/* 19 */                if (!lO1II0.I00000oOI(objI00000oIO)) {
/* 21 */                    Oii1O0I oii1O0II00000oIO = lO1II0.I00000oIO(objI00000oIO);
                            while (true) {
/* 25 */                        Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 27 */                        long j3 = I00o101lO;
/* 33 */                        Oii1O0I oii1O0I = (Oii1O0I) unsafe.getObjectVolatile(iiiii1oi1, j3);
/* 41 */                        if (oii1O0I.I00iio >= oii1O0II00000oIO.I00iio) {
                                    break loop0;
                                }
/* 48 */                        if (!oii1O0II00000oIO.I000OiO()) {
                                    break;
                                }
/* 55 */                        if (unsafe.compareAndSwapObject(iiiii1oi1, j3, oii1O0I, oii1O0II00000oIO)) {
/* 61 */                            if (oii1O0I.I0001Ioi1lo()) {
/* 63 */                                oii1O0I.I0000oI00();
                                    }
                                } else if (oii1O0II00000oIO.I0001Ioi1lo()) {
/* 73 */                            oii1O0II00000oIO.I0000oI00();
                                }
                            }
                        } else {
                            break;
                        }
                    }
/* 81 */            IO10oOO iO10oOO4 = null;
/* 82 */            if (lO1II0.I00000oOI(objI00000oIO)) {
/* 84 */                iiiii1oi1.I001l0I00();
/* 99 */                if (iO10oOO.I00iio * IIIIIoiliIiO.I00000oOI >= iiiii1oi1.I0010o()) {
/* 81 */                    return null;
                        }
/* 101 */               iO10oOO.I00000oIO();
/* 81 */                return null;
                    }
/* 112 */           IO10oOO iO10oOO5 = (IO10oOO) lO1II0.I00000oIO(objI00000oIO);
/* 114 */           long j4 = iO10oOO5.I00iio;
/* 118 */           if (j4 <= j) {
/* 551 */               return iO10oOO5;
                    }
/* 123 */           long j5 = j4 * IIIIIoiliIiO.I00000oOI;
                    while (true) {
/* 125 */               Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 127 */               long j6 = I00oI0i;
/* 129 */               long longVolatile = unsafe2.getLongVolatile(iiiii1oi1, j6);
/* 138 */               long j7 = 1152921504606846975L & longVolatile;
/* 141 */               if (j7 >= j5) {
/* 143 */                   iO10oOO2 = iO10oOO4;
/* 144 */                   j2 = j4;
                            break;
                        }
/* 149 */               iO10oOO2 = iO10oOO4;
/* 150 */               j2 = j4;
/* 162 */               if (unsafe2.compareAndSwapLong(iiiii1oi1, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                            break;
                        }
/* 181 */               iiiii1oi1 = this;
/* 183 */               iO10oOO4 = iO10oOO2;
/* 184 */               j4 = j2;
                    }
/* 175 */           if (j2 * IIIIIoiliIiO.I00000oOI >= I0010o()) {
/* 180 */               return iO10oOO2;
                    }
/* 177 */           iO10oOO5.I00000oIO();
/* 180 */           return iO10oOO2;
                }

                @Override
                public Object I000lI(Object obj) {
                    IO10i1 iO10i1;
                    Throwable thI00111O;
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 3 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 17 */            long j = 1152921504606846975L;
/* 31 */            boolean z = iiiii1oi1.I001i1lo1io(unsafe.getLongVolatile(iiiii1oi1, I00oI0i), false) ? false : !iiiii1oi1.I00000oIO(r2 & 1152921504606846975L);
/* 32 */            IO10l0l0 iO10l0l0 = IO10lIoiO.I00000oOI;
/* 34 */            if (z) {
/* 36 */                return iO10l0l0;
                    }
/* 37 */            Object obj2 = IIIIIoiliIiO.I000OiO;
/* 45 */            IO10oOO iO10oOO = (IO10oOO) unsafe.getObjectVolatile(iiiii1oi1, I00o101lO);
                    while (true) {
/* 49 */                long andIncrement = I00iio.getAndIncrement(iiiii1oi1);
/* 53 */                long j2 = andIncrement & j;
/* 55 */                boolean zI001i1lo1io = iiiii1oi1.I001i1lo1io(andIncrement, false);
/* 59 */                int i = IIIIIoiliIiO.I00000oOI;
                        long j3 = i;
/* 62 */                long j4 = j2 / j3;
/* 66 */                int i2 = (int) (j2 % j3);
/* 71 */                if (iO10oOO.I00iio != j4) {
/* 73 */                    IO10oOO iO10oOOI000l1 = iiiii1oi1.I000l1(j4, iO10oOO);
/* 77 */                    if (iO10oOOI000l1 != null) {
/* 102 */                       iO10oOO = iO10oOOI000l1;
                            } else {
/* 79 */                        if (zI001i1lo1io) {
/* 81 */                            thI00111O = iiiii1oi1.I00111O();
/* 87 */                            iO10i1 = new IO10i1();
                                    break;
                                }
/* 96 */                        j = 1152921504606846975L;
                            }
                        }
/* 105 */               int iI00Io1o110i = iiiii1oi1.I00Io1o110i(iO10oOO, i2, obj, j2, obj2, zI001i1lo1io);
/* 109 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 111 */               if (iI00Io1o110i == 0) {
/* 200 */                   iO10oOO.I00000oIO();
/* 966 */                   return ooiIlOl1iI;
                        }
/* 113 */               if (iI00Io1o110i == 1) {
/* 199 */                   return ooiIlOl1iI;
                        }
/* 117 */               if (iI00Io1o110i != 2) {
/* 120 */                   if (iI00Io1o110i == 3) {
/* 163 */                       I000II.I001IO000("unexpected");
/* 116 */                       return null;
                            }
/* 123 */                   if (iI00Io1o110i != 4) {
/* 126 */                       if (iI00Io1o110i == 5) {
/* 129 */                           iO10oOO.I00000oIO();
                                }
/* 132 */                       j = 1152921504606846975L;
/* 137 */                       iiiii1oi1 = this;
                            } else {
/* 146 */                       if (j2 < I0010o()) {
/* 148 */                           iO10oOO.I00000oIO();
                                }
/* 151 */                       thI00111O = I00111O();
/* 157 */                       iO10i1 = new IO10i1();
                            }
                        } else {
/* 167 */                   if (!zI001i1lo1io) {
/* 187 */                       OoooliO1IoI1 ooooliO1IoI1 = obj2 instanceof OoooliO1IoI1 ? (OoooliO1IoI1) obj2 : null;
/* 189 */                       if (ooooliO1IoI1 != null) {
/* 192 */                           ooooliO1IoI1.I00000oIO(iO10oOO, i2 + i);
                                }
/* 195 */                       iO10oOO.I000OOo1O();
/* 198 */                       return iO10l0l0;
                            }
/* 169 */                   iO10oOO.I000OOo1O();
/* 172 */                   thI00111O = I00111O();
/* 178 */                   iO10i1 = new IO10i1();
                        }
                    }
/* 90 */            iO10i1.I00000oIO = thI00111O;
/* 92 */            VarHandle.storeStoreFence();
/* 95 */            return iO10i1;
                }

                @Override
                public final Object I000o00OoI0I(IOOo0ll iOOo0ll) {
/* 1 */             return I00IO1(this, iOOo0ll);
                }

                public final long I000oI1ioi() {
/* 5 */             return I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I00li1OI);
                }

                public final Throwable I00100l0() {
/* 9 */             return (Throwable) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00l0OO0IO);
                }

                public final o01l1ioOo0 I00100o1O0lo() {
/* 3 */             IIII1O0i0o1 iIII1O0i0o1 = IIII1O0i0o1.I00ioIO;
/* 6 */             OoOOI1100oI0.I0000Il00O(3, iIII1O0i0o1);
/* 9 */             IIII1OlOlIO iIII1OlOlIO = IIII1OlOlIO.I00ioIO;
/* 11 */            OoOOI1100oI0.I0000Il00O(3, iIII1OlOlIO);
/* 16 */            return new o01l1ioOo0(this, iIII1O0i0o1, iIII1OlOlIO, this.I00iiO);
                }

                public final Throwable I0010I0i() {
/* 1 */             Throwable thI00100l0 = I00100l0();
                    return thI00100l0 == null ? new IOO1lii1i("Channel was closed") : thI00100l0;
                }

                public final long I0010o() {
/* 5 */             return I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I00o0l1o1o0);
                }

                public final Throwable I00111O() {
/* 1 */             Throwable thI00100l0 = I00100l0();
                    return thI00100l0 == null ? new IOIoIlIlO("Channel was closed", 1) : thI00100l0;
                }

                public final long I001IIilI0O() {
/* 14 */            return I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I00oI0i) & 1152921504606846975L;
                }

                public final void I001IO000(long j) {
/* 14 */            if ((I00io1l.addAndGet(this, j) & 4611686018427387904L) != 0) {
/* 27 */                while ((I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I00lll10) & 4611686018427387904L) != 0) {
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:116:0x0185, code lost:
                
                    p000.I1Ioolli0l0o.I00000oIO.compareAndSwapLong(r1, p000.IIIII1OI1.I00o0l1o1o0, r5, 1 + r5);
                    r1 = r17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
                
                    r0 = (p000.IO10oOO) ((p000.IOlOio11) p000.I1Ioolli0l0o.I00000oIO.getObjectVolatile(r0, p000.IOlOio11.I00iiI));
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I001i1lo1io(long j, boolean z) {
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 7 */             int i = (int) (j >> 60);
/* 9 */             if (i != 0 && i != 1) {
/* 20 */                if (i == 2) {
/* 258 */                   iiiii1oi1.I0000O(j & 1152921504606846975L);
/* 261 */                   if (z) {
                                while (true) {
/* 263 */                           Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 265 */                           long j2 = I00o0iI0io1;
/* 271 */                           IO10oOO iO10oOOI000OiO = (IO10oOO) unsafe.getObjectVolatile(iiiii1oi1, j2);
/* 273 */                           long jI0010o = iiiii1oi1.I0010o();
/* 283 */                           if (iiiii1oi1.I001IIilI0O() <= jI0010o) {
                                        break;
                                    }
/* 287 */                           long j3 = IIIIIoiliIiO.I00000oOI;
/* 290 */                           long j4 = jI0010o / j3;
/* 296 */                           if (iO10oOOI000OiO.I00iio != j4 && (iO10oOOI000OiO = iiiii1oi1.I000OiO(j4, iO10oOOI000OiO)) == null) {
/* 314 */                               if (((IO10oOO) unsafe.getObjectVolatile(iiiii1oi1, j2)).I00iio < j4) {
                                            break;
                                        }
                                    } else {
/* 318 */                               iO10oOOI000OiO.I00000oIO();
/* 323 */                               int i2 = (int) (jI0010o % j3);
                                        while (true) {
/* 324 */                                   Object objI000l1 = iO10oOOI000OiO.I000l1(i2);
/* 328 */                                   if (objI000l1 != null && objI000l1 != IIIIIoiliIiO.I0000oI00) {
/* 337 */                                       if (objI000l1 == IIIIIoiliIiO.I0000O || (objI000l1 != IIIIIoiliIiO.I000OiO && objI000l1 != IIIIIoiliIiO.I000l1 && objI000l1 != IIIIIoiliIiO.I000OOo1O && objI000l1 != IIIIIoiliIiO.I000O01llI0 && (objI000l1 == IIIIIoiliIiO.I000II || (objI000l1 != IIIIIoiliIiO.I0001Ioi1lo && jI0010o == iiiii1oi1.I0010o())))) {
                                                    break;
                                                }
                                            } else {
/* 385 */                                       if (iO10oOOI000OiO.I000iOII(i2, objI000l1, IIIIIoiliIiO.I000O01llI0)) {
/* 387 */                                           iiiii1oi1.I000OOo1O();
                                                    break;
                                                }
/* 406 */                                       iiiii1oi1 = this;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
/* 23 */                    if (i != 3) {
/* 252 */                       IOOlIIilOl0.I0000oI00(Oi010OO0.I000oI1ioi(i, "unexpected close status: "));
/* 8 */                         return false;
                            }
/* 27 */                    IO10oOO iO10oOOI0000O = iiiii1oi1.I0000O(j & 1152921504606846975L);
/* 32 */                    IOiIIo1l iOiIIo1lI00000oOI = null;
/* 33 */                    Object objI00000oIO = null;
/* 206 */                   loop0: do {
/* 34 */                        AtomicReferenceArray atomicReferenceArray = iO10oOOI0000O.I00ioIO;
/* 38 */                        int i3 = IIIIIoiliIiO.I00000oOI - 1;
                                while (true) {
/* 40 */                            if (-1 >= i3) {
                                        break;
                                    }
/* 49 */                            long j5 = (iO10oOOI0000O.I00iio * IIIIIoiliIiO.I00000oOI) + i3;
                                    while (true) {
/* 50 */                                Object objI000l12 = iO10oOOI0000O.I000l1(i3);
/* 56 */                                if (objI000l12 == IIIIIoiliIiO.I000OOo1O) {
                                            break loop0;
                                        }
/* 58 */                                I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I0000O;
/* 60 */                                Function1 function1 = iiiii1oi1.I00iiI;
/* 62 */                                if (objI000l12 == i0OooiI1I) {
/* 70 */                                    if (j5 < iiiii1oi1.I0010o()) {
                                                break loop0;
                                            }
/* 78 */                                    if (iO10oOOI0000O.I000iOII(i3, objI000l12, IIIIIoiliIiO.I000l1)) {
/* 80 */                                        if (function1 != null) {
/* 88 */                                            iOiIIo1lI00000oOI = l1l0ii1lOoI1.I00000oOI(function1, atomicReferenceArray.get(i3 * 2), iOiIIo1lI00000oOI);
                                                }
/* 92 */                                        iO10oOOI0000O.I000o00OoI0I(i3, null);
/* 95 */                                        iO10oOOI0000O.I000OOo1O();
                                            }
                                        } else if (objI000l12 == IIIIIoiliIiO.I0000oI00 || objI000l12 == null) {
/* 185 */                                   if (iO10oOOI0000O.I000iOII(i3, objI000l12, IIIIIoiliIiO.I000l1)) {
/* 187 */                                       iO10oOOI0000O.I000OOo1O();
                                                break;
                                            }
                                        } else if (!(objI000l12 instanceof OoooliO1IoI1) && !(objI000l12 instanceof Ooooo1IIIoo0)) {
/* 115 */                                   I0OooiI1I i0OooiI1I2 = IIIIIoiliIiO.I000II;
/* 117 */                                   if (objI000l12 == i0OooiI1I2 || objI000l12 == IIIIIoiliIiO.I0001Ioi1lo) {
                                                break loop0;
                                            }
/* 124 */                                   if (objI000l12 != i0OooiI1I2) {
                                                break;
                                            }
                                        } else {
/* 133 */                                   if (j5 < iiiii1oi1.I0010o()) {
                                                break loop0;
                                            }
/* 146 */                                   OoooliO1IoI1 ooooliO1IoI1 = objI000l12 instanceof Ooooo1IIIoo0 ? ((Ooooo1IIIoo0) objI000l12).I00000oIO : (OoooliO1IoI1) objI000l12;
/* 154 */                                   if (iO10oOOI0000O.I000iOII(i3, objI000l12, IIIIIoiliIiO.I000l1)) {
/* 156 */                                       if (function1 != null) {
/* 164 */                                           iOiIIo1lI00000oOI = l1l0ii1lOoI1.I00000oOI(function1, atomicReferenceArray.get(i3 * 2), iOiIIo1lI00000oOI);
                                                }
/* 168 */                                       objI00000oIO = ioo0Il.I00000oIO(objI00000oIO, ooooliO1IoI1);
/* 172 */                                       iO10oOOI0000O.I000o00OoI0I(i3, null);
/* 175 */                                       iO10oOOI0000O.I000OOo1O();
                                            }
                                        }
                                    }
                                    i3--;
                                }
/* 206 */                   } while (iO10oOOI0000O != null);
/* 208 */                   if (objI00000oIO != null) {
/* 212 */                       if (objI00000oIO instanceof ArrayList) {
/* 220 */                           ArrayList arrayList = (ArrayList) objI00000oIO;
/* 227 */                           for (int size = arrayList.size() - 1; -1 < size; size--) {
/* 235 */                               iiiii1oi1.I00IOO((OoooliO1IoI1) arrayList.get(size), false);
                                    }
                                } else {
/* 216 */                           iiiii1oi1.I00IOO((OoooliO1IoI1) objI00000oIO, false);
                                }
                            }
/* 241 */                   if (iOiIIo1lI00000oOI != null) {
/* 245 */                       throw iOiIIo1lI00000oOI;
                            }
                        }
/* 11 */                return true;
                    }
/* 8 */             return false;
                }

                public final boolean I001iOo1i0O() {
/* 10 */            return I001i1lo1io(I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I00oI0i), true);
                }

                public final boolean I001l0I00() {
/* 10 */            return I001i1lo1io(I1Ioolli0l0o.I00000oIO.getLongVolatile(this, I00oI0i), false);
                }

                public boolean I001lIiIIo1O() {
/* 1 */             return false;
                }

                public final boolean I001lllioOl() {
/* 1 */             long jI000oI1ioi = I000oI1ioi();
                    return jI000oI1ioi == 0 || jI000oI1ioi == Long.MAX_VALUE;
                }

                public final void I001lloI(long j, IO10oOO iO10oOO) {
                    IO10oOO iO10oOO2;
                    IO10oOO iO10oOO3;
/* 5 */             while (iO10oOO.I00iio < j && (iO10oOO3 = (IO10oOO) iO10oOO.I0000Il00O()) != null) {
/* 16 */                iO10oOO = iO10oOO3;
                    }
                    while (true) {
/* 18 */                IO10oOO iO10oOO4 = iO10oOO;
/* 23 */                while (iO10oOO4.I0000O() && (iO10oOO2 = (IO10oOO) iO10oOO4.I0000Il00O()) != null) {
/* 34 */                    iO10oOO4 = iO10oOO2;
                        }
                        while (true) {
/* 36 */                    Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 38 */                    long j2 = I00ll1;
/* 45 */                    Oii1O0I oii1O0I = (Oii1O0I) unsafe.getObjectVolatile(this, j2);
/* 53 */                    if (oii1O0I.I00iio >= iO10oOO4.I00iio) {
/* 80 */                        return;
                            }
/* 60 */                    if (!iO10oOO4.I000OiO()) {
                                break;
                            }
/* 64 */                    IIIII1OI1 iiiii1oi1 = this;
/* 69 */                    if (unsafe.compareAndSwapObject(iiiii1oi1, j2, oii1O0I, iO10oOO4)) {
/* 75 */                        if (oii1O0I.I0001Ioi1lo()) {
/* 77 */                            oii1O0I.I0000oI00();
/* 80 */                            return;
                                }
/* 80 */                        return;
                            } else {
/* 85 */                        if (iO10oOO4.I0001Ioi1lo()) {
/* 87 */                            iO10oOO4.I0000oI00();
                                }
/* 90 */                        this = iiiii1oi1;
                            }
                        }
/* 62 */                iO10oOO = iO10oOO4;
                    }
                }

                public final Object I00II0Ol1O0l(IOoil1iiIilo iOoil1iiIilo, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    IOiIIo1l iOiIIo1lI00000oOI;
/* 8 */             IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 11 */            iIoOoIol0Io0.I00111O();
/* 14 */            Function1 function1 = this.I00iiI;
/* 16 */            if (function1 == null || (iOiIIo1lI00000oOI = l1l0ii1lOoI1.I00000oOI(function1, obj, null)) == null) {
/* 48 */                iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(I00111O()));
                    } else {
/* 29 */                ilIilolOlIoO.I00000oIO(iOiIIo1lI00000oOI, I00111O());
/* 36 */                iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(iOiIIo1lI00000oOI));
                    }
/* 51 */            Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
                    return objI0010I0i == Ii0111o.I00iOIl ? objI0010I0i : OoiIlOl1iI.I00000oIO;
                }

                public final void I00II0oii1o(Object obj, IIoOoIol0Io0 iIoOoIol0Io0) {
/* 1 */             Function1 function1 = this.I00iiI;
/* 3 */             if (function1 != null) {
/* 7 */                 l1l0ii1lOoI1.I00000oIO(function1, obj, iIoOoIol0Io0.I00ilI0I1);
                    }
/* 18 */            iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(I00111O()));
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00IO1oi11O(IO10oOO iO10oOO, int i, long j, IOoilo iOoilo) throws Throwable {
                    IIIII11iiOio iIIII11iiOio;
                    IO10lIoiO iO10lIoiOI00000oIO;
                    IIII0lIOio00 iIII0lIOio00;
/* 5 */             if (iOoilo instanceof IIIII11iiOio) {
/* 8 */                 iIIII11iiOio = (IIIII11iiOio) iOoilo;
/* 10 */                int i2 = iIIII11iiOio.I00iiO;
/* 16 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 19 */                    iIIII11iiOio.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iIIII11iiOio = new IIIII11iiOio(this, iOoilo);
                        }
                    }
/* 27 */            Object objI0010I0i = iIIII11iiOio.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i3 = iIIII11iiOio.I00iiO;
/* 33 */            IIII0lIOio00 iIII0lIOio002 = null;
/* 35 */            if (i3 == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(objI0010I0i);
/* 53 */                iIIII11iiOio.I00iiO = 1;
/* 59 */                IIoOoIol0Io0 iIoOoIol0Io0I00000oOI = iOl0iOoIl.I00000oOI(l00iIoI.I0000Il00O(iIIII11iiOio));
                        try {
/* 65 */                    OOlloIl oOlloIl = new OOlloIl();
/* 68 */                    oOlloIl.I00iOIl = iIoOoIol0Io0I00000oOI;
/* 70 */                    VarHandle.storeStoreFence();
/* 80 */                    Object objI00Io1lO = I00Io1lO(iO10oOO, i, j, oOlloIl);
/* 86 */                    if (objI00Io1lO == IIIIIoiliIiO.I000lI) {
/* 92 */                        oOlloIl.I00000oIO(iO10oOO, i);
                            } else {
/* 102 */                       Object obj = IIIIIoiliIiO.I000oI1ioi;
/* 104 */                       Function1 function1 = this.I00iiI;
/* 106 */                       if (objI00Io1lO == obj) {
/* 114 */                           if (j < I001IIilI0O()) {
/* 116 */                               iO10oOO.I00000oIO();
                                    }
/* 127 */                           IO10oOO iO10oOO2 = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00o0iI0io1);
                                    while (true) {
/* 133 */                               if (I001iOo1i0O()) {
/* 135 */                                   Throwable thI00100l0 = I00100l0();
/* 141 */                                   IO10i1 iO10i1 = new IO10i1();
/* 144 */                                   iO10i1.I00000oIO = thI00100l0;
/* 146 */                                   VarHandle.storeStoreFence();
/* 153 */                                   iIoOoIol0Io0I00000oOI.resumeWith(IO10lIoiO.I00000oIO(iO10i1));
                                            break;
                                        }
/* 160 */                               long andIncrement = I00ilI0I1.getAndIncrement(this);
/* 164 */                               long j2 = IIIIIoiliIiO.I00000oOI;
/* 167 */                               long j3 = andIncrement / j2;
/* 171 */                               int i4 = (int) (andIncrement % j2);
/* 176 */                               if (iO10oOO2.I00iio != j3) {
/* 178 */                                   IO10oOO iO10oOOI000OiO = I000OiO(j3, iO10oOO2);
/* 182 */                                   if (iO10oOOI000OiO != null) {
/* 185 */                                       iO10oOO2 = iO10oOOI000OiO;
                                            }
                                        }
/* 187 */                               Object objI00Io1lO2 = I00Io1lO(iO10oOO2, i4, andIncrement, oOlloIl);
/* 193 */                               if (objI00Io1lO2 == IIIIIoiliIiO.I000lI) {
/* 195 */                                   oOlloIl.I00000oIO(iO10oOO2, i4);
                                            break;
                                        }
/* 201 */                               if (objI00Io1lO2 == IIIIIoiliIiO.I000oI1ioi) {
/* 209 */                                   if (andIncrement < I001IIilI0O()) {
/* 211 */                                       iO10oOO2.I00000oIO();
                                            }
                                        } else {
/* 217 */                                   if (objI00Io1lO2 == IIIIIoiliIiO.I000o00OoI0I) {
/* 255 */                                       throw new IllegalStateException("unexpected");
                                            }
/* 219 */                                   iO10oOO2.I00000oIO();
/* 222 */                                   iO10lIoiOI00000oIO = IO10lIoiO.I00000oIO(objI00Io1lO2);
/* 226 */                                   if (function1 != null) {
/* 240 */                                       iIII0lIOio00 = new IIII0lIOio00(3, this, IIIII1OI1.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
                                            }
                                        }
                                    }
                                } else {
/* 256 */                           iO10oOO.I00000oIO();
/* 259 */                           iO10lIoiOI00000oIO = IO10lIoiO.I00000oIO(objI00Io1lO);
/* 263 */                           if (function1 != null) {
/* 277 */                               iIII0lIOio00 = new IIII0lIOio00(3, this, IIIII1OI1.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
/* 243 */                               iIII0lIOio002 = iIII0lIOio00;
                                    }
/* 244 */                           iIoOoIol0Io0I00000oOI.I000OiO(iO10lIoiOI00000oIO, iIII0lIOio002);
                                }
                            }
/* 281 */                   objI0010I0i = iIoOoIol0Io0I00000oOI.I0010I0i();
/* 285 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 287 */                   if (objI0010I0i == ii0111o) {
/* 289 */                       return ii0111o;
                            }
                        } catch (Throwable th) {
/* 295 */                   iIoOoIol0Io0I00000oOI.I001lIiIIo1O();
/* 483 */                   throw th;
                        }
                    } else {
/* 37 */                if (i3 != 1) {
/* 46 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                lIoii1l01l0i.I00000oOI(objI0010I0i);
                    }
/* 292 */           return ((IO10lIoiO) objI0010I0i).I00000oIO;
                }

                public final void I00IOO(OoooliO1IoI1 ooooliO1IoI1, boolean z) {
/* 3 */             if (ooooliO1IoI1 instanceof IIoOo1iIio1l) {
/* 22 */                ((IOoil1iiIilo) ooooliO1IoI1).resumeWith(lIoii1l01l0i.I00000oIO(z ? I0010I0i() : I00111O()));
/* 25 */                return;
                    }
/* 28 */            if (ooooliO1IoI1 instanceof OOlloIl) {
/* 32 */                IIoOoIol0Io0 iIoOoIol0Io0 = ((OOlloIl) ooooliO1IoI1).I00iOIl;
/* 34 */                Throwable thI00100l0 = I00100l0();
/* 40 */                IO10i1 iO10i1 = new IO10i1();
/* 43 */                iO10i1.I00000oIO = thI00100l0;
/* 45 */                VarHandle.storeStoreFence();
/* 52 */                iIoOoIol0Io0.resumeWith(IO10lIoiO.I00000oIO(iO10i1));
/* 55 */                return;
                    }
/* 58 */            if (!(ooooliO1IoI1 instanceof IIII0iI10)) {
/* 95 */                if (ooooliO1IoI1 instanceof OiiIl0O1I11) {
/* 101 */                   ((OiiIl0O1I11) ooooliO1IoI1).I000O01llI0(this, IIIIIoiliIiO.I000l1);
/* 104 */                   return;
                        } else {
/* 107 */                   IOOlIIilOl0.I000lI("Unexpected waiter: ", ooooliO1IoI1);
/* 551 */                   return;
                        }
                    }
/* 60 */            IIII0iI10 iIII0iI10 = (IIII0iI10) ooooliO1IoI1;
/* 62 */            IIoOoIol0Io0 iIoOoIol0Io02 = iIII0iI10.I00iiI;
/* 65 */            iIII0iI10.I00iiI = null;
/* 69 */            iIII0iI10.I00iOIl = IIIIIoiliIiO.I000l1;
/* 73 */            Throwable thI00100l02 = iIII0iI10.I00iiO.I00100l0();
/* 77 */            if (thI00100l02 == null) {
/* 81 */                iIoOoIol0Io02.resumeWith(Boolean.FALSE);
                    } else {
/* 89 */                iIoOoIol0Io02.resumeWith(lIoii1l01l0i.I00000oIO(thI00100l02));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [IIII0lIOio00] */
                /* JADX WARN: Type inference failed for: r5v1, types: [IIII0lIOio00] */
                public final boolean I00IioO0OiOi(Object obj, Object obj2) {
/* 5 */             if (obj instanceof OiiIl0O1I11) {
                        return ((OiiIl0O1I11) obj).I000O01llI0(this, obj2) == 0;
                    }
/* 17 */            boolean z = obj instanceof OOlloIl;
/* 19 */            Function1 function1 = this.I00iiI;
/* 22 */            if (z) {
/* 26 */                IIoOoIol0Io0 iIoOoIol0Io0 = ((OOlloIl) obj).I00iOIl;
/* 28 */                IO10lIoiO iO10lIoiOI00000oIO = IO10lIoiO.I00000oIO(obj2);
/* 46 */                iIII0lIOio00 = function1 != null ? new IIII0lIOio00(3, this, IIIII1OI1.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1) : null;
/* 50 */                IO10oOO iO10oOO = IIIIIoiliIiO.I00000oIO;
/* 52 */                I0OooiI1I i0OooiI1II000OOo1O = iIoOoIol0Io0.I000OOo1O(iO10lIoiOI00000oIO, iIII0lIOio00);
/* 56 */                if (i0OooiI1II000OOo1O == null) {
/* 3 */                     return false;
                        }
/* 58 */                iIoOoIol0Io0.I000oI1ioi(i0OooiI1II000OOo1O);
/* 4 */                 return true;
                    }
/* 66 */            if (!(obj instanceof IIII0iI10)) {
/* 112 */               if (!(obj instanceof IIoOo1iIio1l)) {
/* 148 */                   IOOlIIilOl0.I000lI("Unexpected receiver type: ", obj);
/* 3 */                     return false;
                        }
/* 114 */               IIoOo1iIio1l iIoOo1iIio1l = (IIoOo1iIio1l) obj;
/* 129 */               iIII0lIOio00 = function1 != null ? new IIII0lIOio00(3, this, IIIII1OI1.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0) : null;
/* 133 */               IO10oOO iO10oOO2 = IIIIIoiliIiO.I00000oIO;
/* 135 */               I0OooiI1I i0OooiI1II000OOo1O2 = iIoOo1iIio1l.I000OOo1O(obj2, iIII0lIOio00);
/* 139 */               if (i0OooiI1II000OOo1O2 == null) {
/* 3 */                     return false;
                        }
/* 141 */               iIoOo1iIio1l.I000oI1ioi(i0OooiI1II000OOo1O2);
/* 4 */                 return true;
                    }
/* 68 */            IIII0iI10 iIII0iI10 = (IIII0iI10) obj;
/* 70 */            IIoOoIol0Io0 iIoOoIol0Io02 = iIII0iI10.I00iiI;
/* 72 */            iIII0iI10.I00iiI = null;
/* 74 */            iIII0iI10.I00iOIl = obj2;
/* 76 */            Boolean bool = Boolean.TRUE;
/* 80 */            Function1 function12 = iIII0iI10.I00iiO.I00iiI;
/* 82 */            if (function12 != null) {
/* 87 */                iIII0lIOio00 = new I0illI1iI(5);
/* 90 */                iIII0lIOio00.I00iiI = function12;
/* 92 */                iIII0lIOio00.I00iiO = obj2;
/* 94 */                VarHandle.storeStoreFence();
                    }
/* 97 */            IO10oOO iO10oOO3 = IIIIIoiliIiO.I00000oIO;
/* 99 */            I0OooiI1I i0OooiI1II000OOo1O3 = iIoOoIol0Io02.I000OOo1O(bool, iIII0lIOio00);
/* 103 */           if (i0OooiI1II000OOo1O3 == null) {
/* 3 */                 return false;
                    }
/* 105 */           iIoOoIol0Io02.I000oI1ioi(i0OooiI1II000OOo1O3);
/* 4 */             return true;
                }

                public final boolean I00IlilI0i0i(Object obj, IO10oOO iO10oOO, int i) {
                    OoIo0i0ll1 ooIo0i0ll1;
/* 1 */             boolean z = obj instanceof IIoOo1iIio1l;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             if (z) {
/* 10 */                IIoOo1iIio1l iIoOo1iIio1l = (IIoOo1iIio1l) obj;
/* 12 */                IO10oOO iO10oOO2 = IIIIIoiliIiO.I00000oIO;
/* 14 */                I0OooiI1I i0OooiI1II000OOo1O = iIoOo1iIio1l.I000OOo1O(ooiIlOl1iI, null);
/* 18 */                if (i0OooiI1II000OOo1O == null) {
/* 3 */                     return false;
                        }
/* 20 */                iIoOo1iIio1l.I000oI1ioi(i0OooiI1II000OOo1O);
/* 4 */                 return true;
                    }
/* 27 */            if (!(obj instanceof OiiIl0O1I11)) {
/* 95 */                IOOlIIilOl0.I000lI("Unexpected waiter: ", obj);
/* 3 */                 return false;
                    }
/* 31 */            int iI000O01llI0 = ((OiiIl0O1I11) obj).I000O01llI0(this, ooiIlOl1iI);
/* 35 */            if (iI000O01llI0 == 0) {
/* 78 */                ooIo0i0ll1 = OoIo0i0ll1.I00iOIl;
                    } else if (iI000O01llI0 == 1) {
/* 75 */                ooIo0i0ll1 = OoIo0i0ll1.I00iiI;
                    } else if (iI000O01llI0 == 2) {
/* 72 */                ooIo0i0ll1 = OoIo0i0ll1.I00iiO;
                    } else {
/* 43 */                if (iI000O01llI0 != 3) {
/* 71 */                    throw new IllegalStateException(("Unexpected internal result: " + iI000O01llI0).toString());
                        }
/* 45 */                ooIo0i0ll1 = OoIo0i0ll1.I00iio;
                    }
/* 82 */            if (ooIo0i0ll1 == OoIo0i0ll1.I00iiI) {
/* 84 */                iO10oOO.I000o00OoI0I(i, null);
                    }
                    return ooIo0i0ll1 == OoIo0i0ll1.I00iOIl;
                }

                public final Object I00Io1lO(IO10oOO iO10oOO, int i, long j, Object obj) {
/* 1 */             Object objI000l1 = iO10oOO.I000l1(i);
/* 5 */             AtomicReferenceArray atomicReferenceArray = iO10oOO.I00ioIO;
/* 13 */            long j2 = I00oI0i;
/* 15 */            if (objI000l1 == null) {
/* 26 */                if (j >= (I1Ioolli0l0o.I00000oIO.getLongVolatile(this, j2) & 1152921504606846975L)) {
/* 28 */                    if (obj == null) {
/* 30 */                        return IIIIIoiliIiO.I000o00OoI0I;
                            }
/* 37 */                    if (iO10oOO.I000iOII(i, objI000l1, obj)) {
/* 39 */                        I000OOo1O();
/* 42 */                        return IIIIIoiliIiO.I000lI;
                            }
                        }
                    } else if (objI000l1 == IIIIIoiliIiO.I0000O && iO10oOO.I000iOII(i, objI000l1, IIIIIoiliIiO.I000OOo1O)) {
/* 57 */                I000OOo1O();
/* 62 */                Object obj2 = atomicReferenceArray.get(i * 2);
/* 66 */                iO10oOO.I000o00OoI0I(i, null);
/* 69 */                return obj2;
                    }
                    while (true) {
/* 70 */                Object objI000l12 = iO10oOO.I000l1(i);
/* 74 */                if (objI000l12 == null || objI000l12 == IIIIIoiliIiO.I0000oI00) {
/* 197 */                   if (j < (I1Ioolli0l0o.I00000oIO.getLongVolatile(this, j2) & 1152921504606846975L)) {
/* 205 */                       if (iO10oOO.I000iOII(i, objI000l12, IIIIIoiliIiO.I000O01llI0)) {
/* 207 */                           I000OOo1O();
/* 210 */                           return IIIIIoiliIiO.I000oI1ioi;
                                }
                            } else {
/* 213 */                       if (obj == null) {
/* 215 */                           return IIIIIoiliIiO.I000o00OoI0I;
                                }
/* 222 */                       if (iO10oOO.I000iOII(i, objI000l12, obj)) {
/* 224 */                           I000OOo1O();
/* 227 */                           return IIIIIoiliIiO.I000lI;
                                }
                            }
                        } else if (objI000l12 != IIIIIoiliIiO.I0000O) {
/* 106 */                   I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I000OiO;
/* 108 */                   if (objI000l12 == i0OooiI1I) {
/* 110 */                       return IIIIIoiliIiO.I000oI1ioi;
                            }
/* 115 */                   if (objI000l12 == IIIIIoiliIiO.I000O01llI0) {
/* 117 */                       return IIIIIoiliIiO.I000oI1ioi;
                            }
/* 122 */                   if (objI000l12 == IIIIIoiliIiO.I000l1) {
/* 124 */                       I000OOo1O();
/* 127 */                       return IIIIIoiliIiO.I000oI1ioi;
                            }
/* 132 */                   if (objI000l12 != IIIIIoiliIiO.I000II && iO10oOO.I000iOII(i, objI000l12, IIIIIoiliIiO.I0001Ioi1lo)) {
/* 142 */                       boolean z = objI000l12 instanceof Ooooo1IIIoo0;
/* 144 */                       if (z) {
/* 148 */                           objI000l12 = ((Ooooo1IIIoo0) objI000l12).I00000oIO;
                                }
/* 154 */                       if (I00IlilI0i0i(objI000l12, iO10oOO, i)) {
/* 158 */                           iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I000OOo1O);
/* 161 */                           I000OOo1O();
/* 166 */                           Object obj3 = atomicReferenceArray.get(i * 2);
/* 170 */                           iO10oOO.I000o00OoI0I(i, null);
/* 173 */                           return obj3;
                                }
/* 174 */                       iO10oOO.I000oI1ioi(i, i0OooiI1I);
/* 177 */                       iO10oOO.I000OOo1O();
/* 180 */                       if (z) {
/* 182 */                           I000OOo1O();
                                }
/* 185 */                       return IIIIIoiliIiO.I000oI1ioi;
                            }
                        } else if (iO10oOO.I000iOII(i, objI000l12, IIIIIoiliIiO.I000OOo1O)) {
/* 93 */                    I000OOo1O();
/* 98 */                    Object obj4 = atomicReferenceArray.get(i * 2);
/* 102 */                   iO10oOO.I000o00OoI0I(i, null);
/* 105 */                   return obj4;
                        }
                    }
                }

                public final int I00Io1o110i(IO10oOO iO10oOO, int i, Object obj, long j, Object obj2, boolean z) {
/* 1 */             iO10oOO.I000o00OoI0I(i, obj);
/* 4 */             if (z) {
/* 6 */                 return I00IoIO0lI(iO10oOO, i, obj, j, obj2, z);
                    }
/* 11 */            Object objI000l1 = iO10oOO.I000l1(i);
/* 17 */            if (objI000l1 == null) {
/* 23 */                if (I00000oIO(j)) {
/* 31 */                    if (iO10oOO.I000iOII(i, null, IIIIIoiliIiO.I0000O)) {
/* 15 */                        return 1;
                            }
                        } else {
/* 34 */                    if (obj2 == null) {
/* 36 */                        return 3;
                            }
/* 42 */                    if (iO10oOO.I000iOII(i, null, obj2)) {
/* 44 */                        return 2;
                            }
                        }
                    } else if (objI000l1 instanceof OoooliO1IoI1) {
/* 50 */                iO10oOO.I000o00OoI0I(i, null);
/* 57 */                if (I00IioO0OiOi(objI000l1, obj)) {
/* 61 */                    iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I000OOo1O);
/* 64 */                    return 0;
                        }
/* 66 */                I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I000iOII;
/* 77 */                if (iO10oOO.I00ioIO.getAndSet((i * 2) + 1, i0OooiI1I) == i0OooiI1I) {
/* 82 */                    return 5;
                        }
/* 79 */                iO10oOO.I000lI(i, true);
/* 82 */                return 5;
                    }
/* 84 */            return I00IoIO0lI(iO10oOO, i, obj, j, obj2, z);
                }

                public final int I00IoIO0lI(IO10oOO iO10oOO, int i, Object obj, long j, Object obj2, boolean z) {
                    while (true) {
/* 1 */                 Object objI000l1 = iO10oOO.I000l1(i);
/* 8 */                 if (objI000l1 == null) {
/* 14 */                    if (!I00000oIO(j) || z) {
/* 27 */                        if (z) {
/* 35 */                            if (iO10oOO.I000iOII(i, null, IIIIIoiliIiO.I000OiO)) {
/* 37 */                                iO10oOO.I000OOo1O();
/* 5 */                                 return 4;
                                    }
                                } else {
/* 41 */                            if (obj2 == null) {
/* 43 */                                return 3;
                                    }
/* 49 */                            if (iO10oOO.I000iOII(i, null, obj2)) {
/* 51 */                                return 2;
                                    }
                                }
                            } else if (iO10oOO.I000iOII(i, null, IIIIIoiliIiO.I0000O)) {
                                break;
                            }
                        } else {
/* 55 */                    if (objI000l1 != IIIIIoiliIiO.I0000oI00) {
/* 66 */                        I0OooiI1I i0OooiI1I = IIIIIoiliIiO.I000iOII;
/* 69 */                        if (objI000l1 == i0OooiI1I) {
/* 71 */                            iO10oOO.I000o00OoI0I(i, null);
/* 68 */                            return 5;
                                }
/* 77 */                        if (objI000l1 == IIIIIoiliIiO.I000O01llI0) {
/* 79 */                            iO10oOO.I000o00OoI0I(i, null);
/* 68 */                            return 5;
                                }
/* 85 */                        if (objI000l1 == IIIIIoiliIiO.I000l1) {
/* 87 */                            iO10oOO.I000o00OoI0I(i, null);
/* 90 */                            I001l0I00();
/* 5 */                             return 4;
                                }
/* 94 */                        iO10oOO.I000o00OoI0I(i, null);
/* 99 */                        if (objI000l1 instanceof Ooooo1IIIoo0) {
/* 103 */                           objI000l1 = ((Ooooo1IIIoo0) objI000l1).I00000oIO;
                                }
/* 109 */                       if (I00IioO0OiOi(objI000l1, obj)) {
/* 113 */                           iO10oOO.I000oI1ioi(i, IIIIIoiliIiO.I000OOo1O);
/* 116 */                           return 0;
                                }
/* 127 */                       if (iO10oOO.I00ioIO.getAndSet((i * 2) + 1, i0OooiI1I) != i0OooiI1I) {
/* 129 */                           iO10oOO.I000lI(i, true);
                                }
/* 68 */                        return 5;
                            }
/* 63 */                    if (iO10oOO.I000iOII(i, objI000l1, IIIIIoiliIiO.I0000O)) {
                                break;
                            }
                        }
                    }
/* 6 */             return 1;
                }

                public final void I00IoO0(long j) {
/* 1 */             IIIII1OI1 iiiii1oi1 = this;
/* 7 */             if (iiiii1oi1.I001lllioOl()) {
/* 130 */               return;
                    }
/* 17 */            while (iiiii1oi1.I000oI1ioi() <= j) {
/* 151 */               iiiii1oi1 = this;
                    }
/* 19 */            int i = IIIIIoiliIiO.I0000Il00O;
/* 22 */            int i2 = 0;
                    while (true) {
/* 28 */                long j2 = I00lll10;
/* 30 */                if (i2 < i) {
/* 32 */                    long jI000oI1ioi = iiiii1oi1.I000oI1ioi();
/* 45 */                    if (jI000oI1ioi == (I1Ioolli0l0o.I00000oIO.getLongVolatile(iiiii1oi1, j2) & 4611686018427387903L) && jI000oI1ioi == iiiii1oi1.I000oI1ioi()) {
/* 130 */                       return;
                            } else {
/* 56 */                        i2++;
                            }
                        } else {
                            while (true) {
/* 59 */                        Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 61 */                        long longVolatile = unsafe.getLongVolatile(iiiii1oi1, j2);
/* 77 */                        if (unsafe.compareAndSwapLong(iiiii1oi1, I00lll10, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                                    break;
                                } else {
/* 148 */                           iiiii1oi1 = this;
                                }
                            }
                            while (true) {
/* 79 */                        long jI000oI1ioi2 = iiiii1oi1.I000oI1ioi();
/* 83 */                        Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 85 */                        long longVolatile2 = unsafe2.getLongVolatile(iiiii1oi1, j2);
/* 89 */                        long j3 = longVolatile2 & 4611686018427387903L;
/* 101 */                       boolean z = (longVolatile2 & 4611686018427387904L) != 0;
/* 104 */                       if (jI000oI1ioi2 == j3 && jI000oI1ioi2 == iiiii1oi1.I000oI1ioi()) {
                                    break;
                                }
/* 134 */                       if (z) {
/* 145 */                           iiiii1oi1 = this;
                                } else {
/* 139 */                           iiiii1oi1 = this;
/* 141 */                           unsafe2.compareAndSwapLong(iiiii1oi1, I00lll10, longVolatile2, j3 + 4611686018427387904L);
                                }
                            }
                            while (true) {
/* 114 */                       Unsafe unsafe3 = I1Ioolli0l0o.I00000oIO;
/* 116 */                       long longVolatile3 = unsafe3.getLongVolatile(iiiii1oi1, j2);
/* 128 */                       if (unsafe3.compareAndSwapLong(iiiii1oi1, I00lll10, longVolatile3, longVolatile3 & 4611686018427387903L)) {
/* 130 */                           return;
                                } else {
/* 131 */                           iiiii1oi1 = this;
                                }
                            }
                        }
                    }
                }

                @Override
                public final IIII0iI10 iterator() {
/* 3 */             IIII0iI10 iIII0iI10 = new IIII0iI10();
/* 6 */             iIII0iI10.I00iiO = this;
/* 10 */            iIII0iI10.I00iOIl = IIIIIoiliIiO.I00100l0;
/* 12 */            VarHandle.storeStoreFence();
/* 29 */            return iIII0iI10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:87:0x01b8, code lost:
                
                    r3 = (p000.IO10oOO) r3.I0000Il00O();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
                
                    if (r3 != null) goto L94;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    String string;
/* 5 */             StringBuilder sb = new StringBuilder();
/* 8 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 19 */            int longVolatile = (int) (unsafe.getLongVolatile(this, I00oI0i) >> 60);
/* 22 */            if (longVolatile == 2) {
/* 35 */                sb.append("closed,");
                    } else if (longVolatile == 3) {
/* 29 */                sb.append("cancelled,");
                    }
/* 59 */            sb.append("capacity=" + this.I00iOIl + ',');
/* 64 */            sb.append("data=[");
/* 75 */            int i = 0;
/* 95 */            List listI000O01llI0 = IOOi1I.I000O01llI0(unsafe.getObjectVolatile(this, I00o0iI0io1), unsafe.getObjectVolatile(this, I00o101lO), unsafe.getObjectVolatile(this, I00ll1));
/* 103 */           ArrayList arrayList = new ArrayList();
/* 114 */           for (Object obj : listI000O01llI0) {
/* 125 */               if (((IO10oOO) obj) != IIIIIoiliIiO.I00000oIO) {
/* 127 */                   arrayList.add(obj);
                        }
                    }
/* 131 */           Iterator it = arrayList.iterator();
/* 139 */           if (!it.hasNext()) {
/* 477 */               IoOOl0iOl1io.I00000oOI();
/* 480 */               return null;
                    }
/* 141 */           Object next = it.next();
/* 149 */           if (it.hasNext()) {
/* 155 */               long j = ((IO10oOO) next).I00iio;
/* 176 */               do {
/* 157 */                   Object next2 = it.next();
/* 164 */                   long j2 = ((IO10oOO) next2).I00iio;
/* 168 */                   if (j > j2) {
/* 170 */                       next = next2;
/* 171 */                       j = j2;
                            }
/* 176 */               } while (it.hasNext());
                    }
/* 178 */           IO10oOO iO10oOO = (IO10oOO) next;
/* 180 */           long jI0010o = I0010o();
/* 184 */           long jI001IIilI0O = I001IIilI0O();
                    loop2: while (true) {
/* 188 */               int i2 = IIIIIoiliIiO.I00000oOI;
/* 190 */               int i3 = i;
                        while (true) {
/* 191 */                   if (i3 >= i2) {
                                break;
                            }
/* 200 */                   long j3 = (iO10oOO.I00iio * IIIIIoiliIiO.I00000oOI) + i3;
/* 203 */                   if (j3 >= jI001IIilI0O && j3 >= jI0010o) {
                                break loop2;
                            }
/* 209 */                   Object objI000l1 = iO10oOO.I000l1(i3);
/* 217 */                   Object obj2 = iO10oOO.I00ioIO.get(i3 * 2);
/* 223 */                   if (objI000l1 instanceof IIoOo1iIio1l) {
/* 247 */                       string = (jI001IIilI0O > j3 || j3 >= jI0010o) ? (jI0010o > j3 || j3 >= jI001IIilI0O) ? "cont" : "send" : "receive";
                            } else if (objI000l1 instanceof OiiIl0O1I11) {
/* 277 */                       string = (jI001IIilI0O > j3 || j3 >= jI0010o) ? (jI0010o > j3 || j3 >= jI001IIilI0O) ? "select" : "onSend" : "onReceive";
                            } else if (objI000l1 instanceof OOlloIl) {
/* 285 */                       string = "receiveCatching";
                            } else if (objI000l1 instanceof Ooooo1IIIoo0) {
/* 307 */                       string = "EB(" + objI000l1 + ')';
                            } else if (O0000Ioio00.I0000O(objI000l1, IIIIIoiliIiO.I0001Ioi1lo) || O0000Ioio00.I0000O(objI000l1, IIIIIoiliIiO.I000II)) {
/* 385 */                       string = "resuming_sender";
                            } else if (objI000l1 == null || objI000l1.equals(IIIIIoiliIiO.I0000oI00) || objI000l1.equals(IIIIIoiliIiO.I000OOo1O) || objI000l1.equals(IIIIIoiliIiO.I000O01llI0) || objI000l1.equals(IIIIIoiliIiO.I000iOII) || objI000l1.equals(IIIIIoiliIiO.I000OiO) || objI000l1.equals(IIIIIoiliIiO.I000l1)) {
/* 436 */                       i3++;
                            } else {
/* 380 */                       string = objI000l1.toString();
                            }
/* 387 */                   if (obj2 != null) {
/* 414 */                       sb.append("(" + string + ',' + obj2 + "),");
                            } else {
/* 433 */                       sb.append(string + ',');
                            }
/* 436 */                   i3++;
                        }
/* 474 */               i = 0;
                    }
/* 454 */           if (OlOoOIi0o.I001lIiIIo1O(sb) == ',') {
/* 461 */               sb.deleteCharAt(sb.length() - 1);
                    }
/* 466 */           sb.append("]");
/* 469 */           return sb.toString();
                }
            }

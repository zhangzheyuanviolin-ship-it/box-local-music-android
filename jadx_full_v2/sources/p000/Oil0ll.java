            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import sun.misc.Unsafe;
            
            public class Oil0ll {
                public static final AtomicLongFieldUpdater I0000Il00O;
                public static final AtomicLongFieldUpdater I0000O;
                public static final AtomicIntegerFieldUpdater I0000oI00;
                public static final long I0001Ioi1lo;
                public static final long I000II;
                public static final long I000O01llI0;
                public final int I00000oIO;
                public final I0iII1i10I I00000oOI;
                private volatile int _availablePermits$volatile;
                private volatile long deqIdx$volatile;
                private volatile long enqIdx$volatile;
                private volatile Object head$volatile;
                private volatile Object tail$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I000II = unsafe.objectFieldOffset(Oil0ll.class.getDeclaredField("head$volatile"));
/* 23 */            I0000Il00O = AtomicLongFieldUpdater.newUpdater(Oil0ll.class, "deqIdx$volatile");
/* 35 */            I000O01llI0 = unsafe.objectFieldOffset(Oil0ll.class.getDeclaredField("tail$volatile"));
/* 43 */            I0000O = AtomicLongFieldUpdater.newUpdater(Oil0ll.class, "enqIdx$volatile");
/* 51 */            I0000oI00 = AtomicIntegerFieldUpdater.newUpdater(Oil0ll.class, "_availablePermits$volatile");
/* 61 */            I0001Ioi1lo = unsafe.objectFieldOffset(Oil0ll.class.getDeclaredField("_availablePermits$volatile"));
                }

                public Oil0ll(int i) {
/* 4 */             this.I00000oIO = i;
/* 7 */             if (i <= 0) {
/* 56 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Semaphore should have at least 1 permit, but had "));
/* 186 */               throw null;
                    }
/* 9 */             if (i < 0) {
/* 46 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "The number of acquired permits should be in 0.."));
/* 49 */                throw null;
                    }
/* 16 */            Oil10oll10o oil10oll10o = new Oil10oll10o(0L, null, 2);
/* 19 */            this.head$volatile = oil10oll10o;
/* 21 */            this.tail$volatile = oil10oll10o;
/* 23 */            this._availablePermits$volatile = i;
/* 29 */            I0iII1i10I i0iII1i10I = new I0iII1i10I(20);
/* 32 */            i0iII1i10I.I00iiI = this;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            this.I00000oOI = i0iII1i10I;
                }

                public final boolean I0000O(OoooliO1IoI1 ooooliO1IoI1) {
                    Object objI00000oIO;
/* 1 */             Oil0ll oil0ll = this;
/* 5 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 7 */             long j = I000O01llI0;
/* 14 */            Oil10oll10o oil10oll10o = (Oil10oll10o) unsafe.getObjectVolatile(oil0ll, j);
/* 18 */            long andIncrement = I0000O.getAndIncrement(oil0ll);
/* 22 */            Oil0iOl oil0iOl = Oil0iOl.I00ioIO;
/* 27 */            long j2 = andIncrement / Oil0oilOiO.I0001Ioi1lo;
                    loop0: while (true) {
/* 29 */                objI00000oIO = IOlOiIllI01O.I00000oIO(oil10oll10o, j2, oil0iOl);
/* 37 */                if (lO1II0.I00000oOI(objI00000oIO)) {
                            break;
                        }
/* 39 */                Oii1O0I oii1O0II00000oIO = lO1II0.I00000oIO(objI00000oIO);
                        while (true) {
/* 43 */                    Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 50 */                    Oii1O0I oii1O0I = (Oii1O0I) unsafe2.getObjectVolatile(oil0ll, j);
/* 60 */                    if (oii1O0I.I00iio >= oii1O0II00000oIO.I00iio) {
/* 62 */                        oil0ll = this;
                                break loop0;
                            }
/* 69 */                    if (!oii1O0II00000oIO.I000OiO()) {
                                break;
                            }
/* 76 */                    oil0ll = this;
/* 84 */                    if (unsafe2.compareAndSwapObject(oil0ll, I000O01llI0, oii1O0I, oii1O0II00000oIO)) {
/* 90 */                        if (oii1O0I.I0001Ioi1lo()) {
/* 92 */                            oii1O0I.I0000oI00();
                                }
                            } else if (oii1O0II00000oIO.I0001Ioi1lo()) {
/* 102 */                       oii1O0II00000oIO.I0000oI00();
                            }
                        }
/* 71 */                oil0ll = this;
                    }
/* 110 */           Oil10oll10o oil10oll10o2 = (Oil10oll10o) lO1II0.I00000oIO(objI00000oIO);
/* 112 */           AtomicReferenceArray atomicReferenceArray = oil10oll10o2.I00io1l;
/* 118 */           int i = (int) (andIncrement % Oil0oilOiO.I0001Ioi1lo);
/* 125 */           if (atomicReferenceArray.compareAndSet(i, null, ooooliO1IoI1)) {
/* 127 */               ooooliO1IoI1.I00000oIO(oil10oll10o2, i);
/* 124 */               return true;
                    }
/* 139 */           if (!atomicReferenceArray.compareAndSet(i, Oil0oilOiO.I00000oOI, Oil0oilOiO.I0000Il00O)) {
/* 152 */               return false;
                    }
/* 148 */           ((IIoOo1iIio1l) ooooliO1IoI1).I000OiO(OoiIlOl1iI.I00000oIO, oil0ll.I00000oOI);
/* 124 */           return true;
                }

                public final void I0000oI00() {
                    Object objI00000oIO;
                    int i;
/* 1 */             Oil0ll oil0ll = this;
/* 215 */           do {
/* 5 */                 int andIncrement = I0000oI00.getAndIncrement(oil0ll);
/* 9 */                 int i2 = oil0ll.I00000oIO;
/* 11 */                if (andIncrement >= i2) {
                            while (true) {
/* 224 */                       Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 226 */                       long j = I0001Ioi1lo;
/* 228 */                       int intVolatile = unsafe.getIntVolatile(oil0ll, j);
/* 232 */                       int i3 = oil0ll.I00000oIO;
/* 234 */                       if (intVolatile <= i3 || unsafe.compareAndSwapInt(oil0ll, j, intVolatile, i3)) {
                                    break;
                                } else {
/* 242 */                           oil0ll = this;
                                }
                            }
/* 541 */                   throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
                        }
/* 13 */                if (andIncrement >= 0) {
/* 217 */                   return;
                        }
/* 17 */                Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 19 */                long j2 = I000II;
/* 26 */                Oil10oll10o oil10oll10o = (Oil10oll10o) unsafe2.getObjectVolatile(oil0ll, j2);
/* 30 */                long andIncrement2 = I0000Il00O.getAndIncrement(oil0ll);
/* 37 */                long j3 = andIncrement2 / Oil0oilOiO.I0001Ioi1lo;
/* 39 */                Oil0lIlO oil0lIlO = Oil0lIlO.I00ioIO;
                        while (true) {
/* 41 */                    objI00000oIO = IOlOiIllI01O.I00000oIO(oil10oll10o, j3, oil0lIlO);
/* 49 */                    if (lO1II0.I00000oOI(objI00000oIO)) {
                                break;
                            }
/* 51 */                    Oii1O0I oii1O0II00000oIO = lO1II0.I00000oIO(objI00000oIO);
                            while (true) {
/* 55 */                        Unsafe unsafe3 = I1Ioolli0l0o.I00000oIO;
/* 62 */                        Oii1O0I oii1O0I = (Oii1O0I) unsafe3.getObjectVolatile(oil0ll, j2);
/* 71 */                        if (oii1O0I.I00iio >= oii1O0II00000oIO.I00iio) {
/* 73 */                            oil0ll = this;
                                    break;
                                }
/* 80 */                        if (!oii1O0II00000oIO.I000OiO()) {
                                    break;
                                }
/* 87 */                        oil0ll = this;
/* 94 */                        if (unsafe3.compareAndSwapObject(oil0ll, I000II, oii1O0I, oii1O0II00000oIO)) {
/* 100 */                           if (oii1O0I.I0001Ioi1lo()) {
/* 102 */                               oii1O0I.I0000oI00();
                                    }
                                } else if (oii1O0II00000oIO.I0001Ioi1lo()) {
/* 112 */                           oii1O0II00000oIO.I0000oI00();
                                }
                            }
/* 82 */                    oil0ll = this;
                        }
/* 120 */               Oil10oll10o oil10oll10o2 = (Oil10oll10o) lO1II0.I00000oIO(objI00000oIO);
/* 122 */               AtomicReferenceArray atomicReferenceArray = oil10oll10o2.I00io1l;
/* 124 */               oil10oll10o2.I00000oIO();
/* 131 */               i = 0;
/* 132 */               if (oil10oll10o2.I00iio <= j3) {
/* 139 */                   int i4 = (int) (andIncrement2 % Oil0oilOiO.I0001Ioi1lo);
/* 142 */                   Object andSet = atomicReferenceArray.getAndSet(i4, Oil0oilOiO.I00000oOI);
/* 147 */                   if (andSet == null) {
/* 149 */                       int i5 = Oil0oilOiO.I00000oIO;
/* 151 */                       while (i < i5) {
/* 159 */                           if (atomicReferenceArray.get(i4) == Oil0oilOiO.I0000Il00O) {
/* 161 */                               i = 1;
                                        break;
                                    }
/* 163 */                           i++;
                                }
/* 174 */                       i = !atomicReferenceArray.compareAndSet(i4, Oil0oilOiO.I00000oOI, Oil0oilOiO.I0000O) ? 1 : 0;
                            } else if (andSet != Oil0oilOiO.I0000oI00) {
/* 182 */                       boolean z = andSet instanceof IIoOo1iIio1l;
/* 184 */                       OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 186 */                       if (z) {
/* 188 */                           IIoOo1iIio1l iIoOo1iIio1l = (IIoOo1iIio1l) andSet;
/* 192 */                           I0OooiI1I i0OooiI1II000OOo1O = iIoOo1iIio1l.I000OOo1O(ooiIlOl1iI, oil0ll.I00000oOI);
/* 196 */                           if (i0OooiI1II000OOo1O != null) {
/* 198 */                               iIoOo1iIio1l.I000oI1ioi(i0OooiI1II000OOo1O);
/* 161 */                               i = 1;
                                        break;
                                        break;
                                    }
                                } else if (!(andSet instanceof OiiIl0O1I11)) {
/* 220 */                           IOOlIIilOl0.I000lI("unexpected: ", andSet);
/* 223 */                           return;
                                } else if (((OiiIl0O1I11) andSet).I000O01llI0(oil0ll, ooiIlOl1iI) == 0) {
/* 161 */                           i = 1;
                                    break;
                                    break;
                                }
                            }
                        }
/* 215 */           } while (i == 0);
                }
            }

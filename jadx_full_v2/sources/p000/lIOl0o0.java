            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Random;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.logging.Level;
            
            public final class lIOl0o0 implements l1olII, iI0iIi {
                public static final String I000OOo1O = new String();
                public Level I00000oIO;
                public long I00000oOI;
                public loll1I0I0iI I0000Il00O;
                public o10lOOOlo I0000O;
                public iO0OOIoI I0000oI00;
                public iio1i1IiOl10 I0001Ioi1lo;
                public Object[] I000II;
                public li0i10lI10o I000O01llI0;

                @Override
                public final void I00000oIO(Object obj) {
/* 5 */             if (I000II()) {
/* 13 */                I0001Ioi1lo("Stream: %s might be missing.", obj);
                    }
                }

                @Override
                public final void I00000oOI(String str, Object obj) {
/* 5 */             if (I000II()) {
/* 13 */                I0001Ioi1lo("AddPacket for stream: %s failed: %s.", obj, str);
                    }
                }

                @Override
                public final iI0iIi I0000Il00O(int i, String str) {
/* 3 */             o0oI10Ooi1il o0oi10ooi1il = new o0oI10Ooi1il();
/* 7 */             o0oi10ooi1il.I0000O = 0;
/* 9 */             o0oi10ooi1il.I00000oOI = str;
/* 11 */            o0oi10ooi1il.I0000Il00O = i;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            if (this.I0000O == null) {
/* 20 */                this.I0000O = o0oi10ooi1il;
                    }
/* 37 */            return this;
                }

                public final lilI1ii I0000O() {
/* 1 */             loll1I0I0iI loll1i0i0ii = this.I0000Il00O;
                    return loll1i0i0ii != null ? loll1i0i0ii : ii0oI1l.I00000oIO;
                }

                public final void I0000oI00(iIIoI1 iiioi1, Object obj) {
/* 1 */             loll1I0I0iI loll1i0i0ii = this.I0000Il00O;
/* 3 */             if (loll1i0i0ii == null) {
/* 7 */                 loll1i0i0ii = new loll1I0I0iI();
/* 14 */                loll1i0i0ii.I00000oIO = new Object[8];
/* 17 */                loll1i0i0ii.I00000oOI = 0;
/* 19 */                this.I0000Il00O = loll1i0i0ii;
                    }
/* 21 */            loll1i0i0ii.I0000oI00(iiioi1, obj);
                }

                public final void I0001Ioi1lo(String str, Object... objArr) {
/* 1 */             this.I000II = objArr;
/* 6 */             for (Object obj : objArr) {
                    }
/* 15 */            if (str != I000OOo1O) {
/* 19 */                ilOIl0OOIi iloil0ooii = ilOIl0OOIi.I00000oOI;
/* 21 */                iio1i1IiOl10 iio1i1iiol10 = new iio1i1IiOl10();
/* 26 */                lio00OOillO.I00000oIO("message", str);
/* 29 */                iio1i1iiol10.I00000oIO = str;
/* 31 */                VarHandle.storeStoreFence();
/* 34 */                this.I0001Ioi1lo = iio1i1iiol10;
                    }
/* 40 */            ((iioiOOllOioi) iilio10l1i.I00000oIO).getClass();
/* 45 */            ilIOIll ilioillI00000oOI = il0Ii1.I00000oOI.I00000oOI();
/* 55 */            if (!ilioillI00000oOI.I00000oIO.isEmpty()) {
/* 57 */                lilI1ii lili1iiI0000O = I0000O();
/* 61 */                iIIoI1 iiioi1 = loO1I0io.I000O01llI0;
/* 67 */                ilIOIll ilioill = (ilIOIll) lili1iiI0000O.I0000Il00O(iiioi1);
/* 69 */                if (ilioill != null) {
/* 71 */                    i1Ol1oooo1ii i1ol1oooo1ii = ilioill.I00000oIO;
/* 73 */                    i1Ol1oooo1ii i1ol1oooo1ii2 = ilioillI00000oOI.I00000oIO;
/* 79 */                    if (!i1ol1oooo1ii.isEmpty()) {
/* 96 */                        ilioillI00000oOI = i1ol1oooo1ii2.isEmpty() ? ilioill : new ilIOIll(new i1Ol1oooo1ii(i1ol1oooo1ii2, i1ol1oooo1ii, (byte) 0));
                            }
                        }
/* 99 */                I0000oI00(iiioi1, ilioillI00000oOI);
                    }
/* 104 */           i1Io0lIii i1io0liii = this.I000O01llI0.I00000oIO;
                    try {
/* 112 */               iliiOOl1Oll0 iliiool1oll0 = (iliiOOl1Oll0) iliiOOl1Oll0.I00iiI.get();
/* 116 */               int i = iliiool1oll0.I00iOIl + 1;
/* 118 */               iliiool1oll0.I00iOIl = i;
/* 120 */               if (i == 0) {
/* 159 */                   throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                        }
                        try {
/* 124 */                   if (i <= 100) {
/* 126 */                       i1io0liii.I0000Il00O(this);
                            } else {
/* 134 */                       li0i10lI10o.I00000oOI("unbounded recursion in log statement", this);
                            }
/* 137 */                   iliiool1oll0.close();
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        try {
/* 160 */                   i1io0liii.I00000oIO(e, this);
                        } catch (RuntimeException e2) {
/* 194 */                   li0i10lI10o.I00000oOI(e2.getClass().getName() + ": " + e2.getMessage(), this);
                            try {
/* 199 */                       e2.printStackTrace(System.err);
                            } catch (RuntimeException unused) {
                            }
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
                /* JADX WARN: Type inference failed for: r14v0, types: [lIOl0o0] */
                /* JADX WARN: Type inference failed for: r1v13, types: [io0oOO0ll] */
                /* JADX WARN: Type inference failed for: r7v19 */
                /* JADX WARN: Type inference failed for: r7v20, types: [iO0OOIoI] */
                /* JADX WARN: Type inference failed for: r7v22, types: [iOI1i1O1] */
                /* JADX WARN: Type inference failed for: r7v23 */
                /* JADX WARN: Type inference failed for: r7v26, types: [iOIoOO0Ii1o0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v17, types: [iIii1Oii00, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000II() {
                    boolean z;
                    StackTraceElement[] stackTraceElementArr;
                    int iI0001Ioi1lo;
                    int i;
                    iIOo1lo0iil1 iioo1lo0iil1;
                    ?? r7;
                    iIOo1lo0iil1 iioo1lo0iil12;
                    int i2;
/* 1 */             o10lOOOlo o10looolo = this.I0000O;
/* 3 */             o0IiOOOOl100 o0iiooool100 = o10lOOOlo.I00000oIO;
/* 5 */             if (o10looolo == null) {
/* 11 */                ((iioiOOllOioi) iilio10l1i.I00000oIO).getClass();
/* 16 */                iioiOOllOioi.I00000oOI.getClass();
/* 19 */                this.I0000O = o0iiooool100;
/* 21 */                o10looolo = o0iiooool100;
                    }
/* 24 */            if (o10looolo != o0iiooool100) {
/* 26 */                loll1I0I0iI loll1i0i0ii = this.I0000Il00O;
/* 28 */                if (loll1i0i0ii != null && (i2 = loll1i0i0ii.I00000oOI) > 0) {
/* 35 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 47 */                        if (loO1I0io.I0001Ioi1lo.equals(loll1i0i0ii.I00000oOI(i3))) {
/* 49 */                            Object objI0000O = loll1i0i0ii.I0000O(i3);
/* 55 */                            ?? ioiooo0ii1o0 = new iOIoOO0Ii1o0();
/* 58 */                            ioiooo0ii1o0.I00000oIO = o10looolo;
/* 62 */                            lio00OOillO.I00000oIO("log site qualifier", objI0000O);
/* 65 */                            ioiooo0ii1o0.I00000oOI = objI0000O;
/* 67 */                            VarHandle.storeStoreFence();
/* 70 */                            o10looolo = ioiooo0ii1o0;
                                }
                            }
                        }
                    } else {
/* 74 */                o10looolo = null;
                    }
/* 75 */            lilI1ii lili1iiI0000O = I0000O();
/* 79 */            int iI00000oIO = lili1iiI0000O.I00000oIO();
/* 83 */            int i4 = 0;
                    while (true) {
/* 84 */                if (i4 >= iI00000oIO) {
                            break;
                        }
/* 94 */                if (lili1iiI0000O.I00000oOI(i4).I00000oIO != "eye3tag") {
/* 118 */                   i4++;
                        } else if (lili1iiI0000O.I0000Il00O(loO1I0io.I00000oIO) == null) {
/* 104 */                   iIIoI1 iiioi1 = loO1I0io.I000OOo1O;
/* 110 */                   if (lili1iiI0000O.I0000Il00O(iiioi1) == null) {
/* 114 */                       I0000oI00(iiioi1, iOOl0OO0i0O.SMALL);
                            }
                        }
                    }
/* 121 */           loll1I0I0iI loll1i0i0ii2 = this.I0000Il00O;
/* 123 */           int i5 = -1;
/* 124 */           iIOo1lo0iil1 iioo1lo0iil13 = iO0OOIoI.I00000oIO;
/* 127 */           if (loll1i0i0ii2 != null) {
/* 129 */               if (o10looolo != null) {
/* 131 */                   int i6 = l0o1iIoI.I0000O;
/* 139 */                   if (loll1i0i0ii2.I0000Il00O(loO1I0io.I0000O) != null) {
/* 286 */                       OIiilo1Ool0o.I00000oIO();
/* 23 */                        return false;
                            }
/* 141 */                   loll1I0I0iI loll1i0i0ii3 = this.I0000Il00O;
/* 143 */                   iIl1O10o iil1o10o = io0oOO0ll.I0000O;
/* 153 */                   if (((Integer) loll1i0i0ii3.I0000Il00O(loO1I0io.I00000oOI)) == null) {
/* 155 */                       iioo1lo0iil1 = null;
                            } else {
/* 163 */                       ?? r1 = (io0oOO0ll) io0oOO0ll.I0000O.I00000oOI(o10looolo, loll1i0i0ii3);
/* 165 */                       AtomicLong atomicLong = r1.I0000Il00O;
                                iioo1lo0iil1 = r1;
/* 178 */                       if (atomicLong.incrementAndGet() < r7.intValue()) {
/* 181 */                           iioo1lo0iil1 = iioo1lo0iil13;
                                }
                            }
/* 182 */                   loll1I0I0iI loll1i0i0ii4 = this.I0000Il00O;
/* 184 */                   iIl1O10o iil1o10o2 = iOI1i1O1.I0000O;
/* 192 */                   Integer num = (Integer) loll1i0i0ii4.I0000Il00O(loO1I0io.I0000Il00O);
/* 194 */                   if (num == null || num.intValue() <= 0) {
/* 245 */                       r7 = 0;
                            } else {
/* 209 */                       r7 = (iOI1i1O1) iOI1i1O1.I0000O.I00000oOI(o10looolo, loll1i0i0ii4);
/* 223 */                       int iNextInt = ((Random) iOI1i1O1.I0000oI00.get()).nextInt(num.intValue());
/* 227 */                       AtomicInteger atomicInteger = r7.I0000Il00O;
/* 240 */                       if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
/* 243 */                           r7 = iioo1lo0iil13;
                                }
                            }
/* 246 */                   if (iioo1lo0iil1 != null) {
/* 250 */                       if (r7 != 0 && iioo1lo0iil1 != iioo1lo0iil13 && r7 != (iioo1lo0iil12 = iO0OOIoI.I00000oOI)) {
/* 260 */                           if (r7 == iioo1lo0iil13 || iioo1lo0iil1 == iioo1lo0iil12) {
/* 248 */                               iioo1lo0iil1 = r7;
                                    } else {
/* 267 */                               ?? iiii1oii00 = new iIii1Oii00();
/* 270 */                               iiii1oii00.I0000Il00O = iioo1lo0iil1;
/* 272 */                               iiii1oii00.I0000O = r7;
/* 274 */                               VarHandle.storeStoreFence();
/* 277 */                               iioo1lo0iil1 = iiii1oii00;
                                    }
                                }
/* 278 */                       this.I0000oI00 = iioo1lo0iil1;
/* 280 */                       z = iioo1lo0iil1 != iioo1lo0iil13;
                            }
                        }
/* 290 */               loll1I0I0iI loll1i0i0ii5 = this.I0000Il00O;
/* 292 */               iIIoI1 iiioi12 = loO1I0io.I000OOo1O;
/* 298 */               iOOl0OO0i0O iool0oo0i0o = (iOOl0OO0i0O) loll1i0i0ii5.I0000Il00O(iiioi12);
/* 300 */               if (iool0oo0i0o != null) {
/* 302 */                   loll1I0I0iI loll1i0i0ii6 = this.I0000Il00O;
/* 304 */                   if (loll1i0i0ii6 != null && (iI0001Ioi1lo = loll1i0i0ii6.I0001Ioi1lo(iiioi12)) >= 0) {
/* 312 */                       int i7 = iI0001Ioi1lo + iI0001Ioi1lo;
/* 313 */                       int i8 = i7 + 2;
                                while (true) {
/* 315 */                           i = loll1i0i0ii6.I00000oOI;
/* 319 */                           if (i8 >= i + i) {
                                        break;
                                    }
/* 323 */                           Object obj = loll1i0i0ii6.I00000oIO[i8];
/* 329 */                           if (!obj.equals(iiioi12)) {
/* 331 */                               Object[] objArr = loll1i0i0ii6.I00000oIO;
/* 333 */                               objArr[i7] = obj;
/* 341 */                               objArr[i7 + 1] = objArr[i8 + 1];
/* 343 */                               i7 += 2;
                                    }
/* 345 */                           i8 += 2;
                                }
/* 352 */                       loll1i0i0ii6.I00000oOI = i - ((i8 - i7) >> 1);
/* 354 */                       while (i7 < i8) {
/* 360 */                           loll1i0i0ii6.I00000oIO[i7] = null;
/* 358 */                           i7++;
                                }
                            }
/* 376 */                   Throwable th = (Throwable) I0000O().I0000Il00O(loO1I0io.I00000oIO);
/* 378 */                   int i9 = iool0oo0i0o.I00iOIl;
/* 380 */                   String[] strArr = ilOoO1lOOIi.I00000oIO;
/* 382 */                   if (i9 <= 0 && i9 != -1) {
/* 389 */                       I000II.I000iOII("invalid maximum depth: 0");
/* 23 */                        return false;
                            }
/* 395 */                   ilOoO1lOOIi.I00000oOI.getClass();
/* 405 */                   if (!(i9 == -1 || i9 > 0)) {
/* 487 */                       I000II.I000iOII("maxDepth must be > 0 or -1");
/* 23 */                        return false;
                            }
/* 412 */                   StackTraceElement[] stackTrace = new Throwable().getStackTrace();
/* 418 */                   String name = lIOl0o0.class.getName();
/* 422 */                   int i10 = 3;
/* 423 */                   boolean z2 = false;
                            while (true) {
/* 425 */                       if (i10 >= stackTrace.length) {
/* 447 */                           i10 = -1;
                                    break;
                                }
/* 437 */                       if (!stackTrace[i10].getClassName().equals(name)) {
/* 441 */                           if (z2) {
                                        break;
                                    }
                                } else {
/* 439 */                           z2 = true;
                                }
/* 444 */                       i10++;
                            }
/* 448 */                   if (i10 == -1) {
/* 450 */                       stackTraceElementArr = new StackTraceElement[0];
                            } else {
/* 454 */                       int length = stackTrace.length - i10;
/* 455 */                       if (i9 <= 0 || i9 >= length) {
/* 459 */                           i9 = length;
                                }
/* 460 */                       StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i9];
/* 462 */                       System.arraycopy(stackTrace, i10, stackTraceElementArr2, 0, i9);
/* 465 */                       stackTraceElementArr = stackTraceElementArr2;
                            }
/* 472 */                   I1o1lOlooI1 i1o1lOlooI1 = new I1o1lOlooI1(iool0oo0i0o.toString(), th, 11);
/* 475 */                   i1o1lOlooI1.setStackTrace(stackTraceElementArr);
/* 480 */                   I0000oI00(loO1I0io.I00000oIO, i1o1lOlooI1);
                        }
                    }
/* 491 */           iO0OOIoI io0ooioi = this.I0000oI00;
/* 493 */           if (io0ooioi == null) {
/* 743 */               return z;
                    }
/* 503 */           iIoilOo iioiloo = (iIoilOo) iIoilOo.I0000Il00O.I00000oOI(o10looolo, this.I0000Il00O);
/* 505 */           AtomicInteger atomicInteger2 = iioiloo.I00000oOI;
/* 507 */           AtomicBoolean atomicBoolean = iioiloo.I00000oIO;
/* 509 */           int iIncrementAndGet = atomicInteger2.incrementAndGet();
/* 513 */           if (io0ooioi != iioo1lo0iil13 && atomicBoolean.compareAndSet(false, true)) {
                        try {
/* 522 */                   io0ooioi.I00000oIO();
/* 525 */                   atomicBoolean.set(false);
/* 529 */                   atomicInteger2.addAndGet(-iIncrementAndGet);
/* 532 */                   i5 = (-1) + iIncrementAndGet;
                        } catch (Throwable th2) {
/* 535 */                   atomicBoolean.set(false);
/* 538 */                   throw th2;
                        }
                    }
/* 539 */           if (z && i5 > 0) {
/* 551 */               this.I0000Il00O.I0000oI00(loO1I0io.I0000oI00, Integer.valueOf(i5));
                    }
/* 557 */           return z & (i5 >= 0);
                }

                @Override
                public final void zzm() {
/* 5 */             if (I000II()) {
/* 15 */                I0001Ioi1lo(I000OOo1O, "MediaPipe graph won't start until all stream headers are available.");
                    }
                }
            }

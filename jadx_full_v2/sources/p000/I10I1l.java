            package p000;

            import android.util.Log;
            
/* 10 */    public final class I10I1l extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public long I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10I1l(long j, Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = j;
/* 5 */             this.I00iio = obj;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 114 */                   return new I10I1l((I10I1li0) obj2, this.I00iiO, iOoil1iiIilo, 0);
                        case 1:
/* 101 */                   return new I10I1l(this.I00iiO, (IIioIlI0) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 88 */                    return new I10I1l((IOi10loi) obj2, this.I00iiO, iOoil1iiIilo, 2);
                        case 3:
/* 75 */                    return new I10I1l((I10i01) obj2, this.I00iiO, iOoil1iiIilo, 3);
                        case 4:
/* 56 */                    I10I1l i10I1l = new I10I1l((Oiill0lI1il1) obj2, iOoil1iiIilo, 4);
/* 63 */                    i10I1l.I00iiO = ((OIOlIiiioi) obj).I00000oIO;
/* 65 */                    return i10I1l;
                        case 5:
/* 46 */                    return new I10I1l(this.I00iiO, (Oll11lOlo) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 27 */                    I10I1l i10I1l2 = new I10I1l((Oo0IOoOi01) obj2, iOoil1iiIilo, 6);
/* 34 */                    i10I1l2.I00iiO = ((OIOlIiiioi) obj).I00000oIO;
/* 36 */                    return i10I1l2;
                        default:
/* 17 */                    return new I10I1l(this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 7);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 135 */                   return ((I10I1l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 120 */                   return ((I10I1l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 105 */                   return ((I10I1l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 90 */                    return ((I10I1l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 75 */                    return ((I10I1l) create(OIOlIiiioi.I00000oIO(((OIOlIiiioi) obj).I00000oIO), (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 54 */                    return ((I10I1l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 39 */                    return ((I10I1l) create(OIOlIiiioi.I00000oIO(((OIOlIiiioi) obj).I00000oIO), (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((I10I1l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
                
                    if (r1 == r7) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(8, r18) == r0) goto L54;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI00000oOI;
                    Object objI0000oI00;
                    long j;
                    Object objI0000oI002;
/* 6 */             int i = 5;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 580 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 582 */                   int i2 = this.I00iiI;
/* 584 */                   if (i2 == 0) {
/* 598 */                       lIoii1l01l0i.I00000oOI(obj);
/* 605 */                       OIIII0oOo1o oIIII0oOo1o = ((I10I1li0) this.I00iio).I00iOIl;
/* 607 */                       long j2 = this.I00iiO;
/* 609 */                       this.I00iiI = 1;
/* 615 */                       if (oIIII0oOo1o.I00000oOI(j2, this) == ii0111o) {
/* 617 */                           return ii0111o;
                                }
                            } else {
/* 586 */                       if (i2 != 1) {
/* 594 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 588 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 619 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 491 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 493 */                   int i3 = this.I00iiI;
/* 495 */                   if (i3 == 0) {
/* 509 */                       lIoii1l01l0i.I00000oOI(obj);
/* 512 */                       long j3 = this.I00iiO;
/* 514 */                       this.I00iiI = 1;
/* 520 */                       if (il0l1o1l.I00000oOI(j3, this) == ii0111o2) {
/* 522 */                           return ii0111o2;
                                }
                            } else {
/* 497 */                       if (i3 != 1) {
/* 505 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 499 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 526 */                   IIioIlI0 iIioIlI0 = (IIioIlI0) this.I00iio;
                            synchronized (iIioIlI0.I000oI1ioi) {
/* 535 */                       if (!iIioIlI0.I0000Il00O() && !O0000Ioio00.I0000O(iIioIlI0.I00100o1O0lo, IIlOIi0oI1Io.I000II) && !O0000Ioio00.I0000O(iIioIlI0.I00100o1O0lo, IIlOIi0oI1Io.I0001Ioi1lo)) {
/* 557 */                           iIioIlI0.toString();
/* 562 */                           iIioIlI0.I0000oI00.I0000Il00O();
/* 565 */                           iIioIlI0.I0001Ioi1lo();
/* 568 */                           iIioIlI0.I0000oI00();
                                }
                            }
/* 575 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 403 */                   long j4 = this.I00iiO;
/* 407 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 409 */                   int i4 = this.I00iiI;
/* 412 */                   if (i4 == 0) {
/* 428 */                       lIoii1l01l0i.I00000oOI(obj);
/* 431 */                       l11I11lO.I0000O(3, "CXCP");
/* 436 */                       IOi10loi iOi10loi = (IOi10loi) this.I00iio;
/* 438 */                       this.I00iiI = 1;
/* 440 */                       objI00000oOI = iiolOOio1.I00000oOI(iOi10loi, j4, this);
/* 444 */                       if (objI00000oOI == ii0111o3) {
/* 446 */                           return ii0111o3;
                                }
                            } else {
/* 414 */                       if (i4 != 1) {
/* 424 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 416 */                       lIoii1l01l0i.I00000oOI(obj);
/* 419 */                       objI00000oOI = obj;
                            }
/* 454 */                   if (((Boolean) objI00000oOI).booleanValue()) {
/* 456 */                       l11I11lO.I0000O(3, "CXCP");
                            } else if (l11I11lO.I0000O(5, "CXCP")) {
/* 485 */                       Log.w("CXCP", "applyScreenFlash: ScreenFlashListener completion timed out after " + j4 + " ms");
                            }
/* 488 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 353 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 355 */                   int i5 = this.I00iiI;
/* 357 */                   if (i5 == 0) {
/* 371 */                       lIoii1l01l0i.I00000oOI(obj);
/* 376 */                       I10i01 i10i01 = (I10i01) this.I00iio;
/* 380 */                       OIOlIiiioi oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO(this.I00iiO);
/* 384 */                       OlIOiI1iI1 olIOiI1iI1 = OiilOllIOIli.I0000O;
/* 386 */                       this.I00iiI = 1;
/* 396 */                       if (I10i01.I00000oIO(i10i01, oIOlIiiioiI00000oIO, olIOiI1iI1, null, null, this, 12) == ii0111o4) {
/* 398 */                           return ii0111o4;
                                }
                            } else {
/* 359 */                       if (i5 != 1) {
/* 367 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 361 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 400 */                   return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 253 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 257 */                   Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) this.I00iio;
/* 259 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 261 */                   int i6 = this.I00iiI;
/* 263 */                   if (i6 == 0) {
/* 277 */                       lIoii1l01l0i.I00000oOI(obj);
/* 280 */                       long j5 = this.I00iiO;
/* 282 */                       OIoi0IIoi oIoi0IIoiI000II = oiill0lI1il1.I000II();
/* 286 */                       if (oIoi0IIoiI000II != null) {
/* 291 */                           I1111OO10i i1111OO10i = (I1111OO10i) oIoi0IIoiI000II.I00iOIl;
/* 297 */                           long j6 = ((Oo0lI00l) oIoi0IIoiI000II.I00iiI).I00000oIO;
/* 299 */                           OO1O0I oo1o0i = oiill0lI1il1.I00oO101o;
/* 301 */                           if (oo1o0i != null) {
/* 303 */                               OIOlIiiioi.I00000oIO(j5);
/* 306 */                               this.I00iiI = 1;
/* 312 */                               if (i1111OO10i.length() == 0 || Oo0lI00l.I0000O(j6)) {
/* 321 */                                   objI0000oI00 = ooiIlOl1iI;
                                        } else {
/* 339 */                                   objI0000oI00 = iOi1II01i0.I0000oI00(oo1o0i.I00000oIO, new O1o1iI(oo1o0i, new I00oO101o(oo1o0i, i1111OO10i, j6, (IOoil1iiIilo) null, 4), iOoil1iiIilo, i), this);
                                        }
/* 343 */                               if (objI0000oI00 != ii0111o5) {
/* 346 */                                   objI0000oI00 = ooiIlOl1iI;
                                        }
/* 347 */                               if (objI0000oI00 == ii0111o5) {
/* 349 */                                   return ii0111o5;
                                        }
                                    }
                                }
                            } else {
/* 265 */                       if (i6 != 1) {
/* 273 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 267 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 351 */                   return ooiIlOl1iI;
                        case 5:
/* 178 */                   long j7 = this.I00iiO;
/* 180 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 182 */                   int i7 = this.I00iiI;
/* 186 */                   if (i7 == 0) {
/* 206 */                       lIoii1l01l0i.I00000oOI(obj);
/* 211 */                       this.I00iiI = 1;
/* 217 */                       if (il0l1o1l.I00000oOI(j7 - 8, this) != ii0111o6) {
                                }
/* 228 */                       return ii0111o6;
                            }
/* 188 */                   if (i7 != 1) {
/* 190 */                       if (i7 != 2) {
/* 198 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 192 */                       lIoii1l01l0i.I00000oOI(obj);
/* 234 */                       IIoOoIol0Io0 iIoOoIol0Io0 = ((Oll11lOlo) this.I00iio).I00iiO;
/* 236 */                       if (iIoOoIol0Io0 != null) {
/* 247 */                           iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(new OO1i1lOl(j7)));
                                }
/* 250 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 202 */                   lIoii1l01l0i.I00000oOI(obj);
/* 220 */                   this.I00iiI = 2;
                            break;
                        case 6:
/* 59 */                    OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 63 */                    Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) this.I00iio;
/* 65 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 67 */                    int i8 = this.I00iiI;
/* 69 */                    if (i8 == 0) {
/* 91 */                        lIoii1l01l0i.I00000oOI(obj);
/* 94 */                        j = this.I00iiO;
/* 96 */                        this.I00iiO = j;
/* 98 */                        this.I00iiI = 1;
/* 104 */                       if (oo0IOoOi01.I00111O(this) != ii0111o7) {
                                }
/* 174 */                       return ii0111o7;
                            }
/* 71 */                    if (i8 != 1) {
/* 73 */                        if (i8 == 2) {
/* 75 */                            lIoii1l01l0i.I00000oOI(obj);
/* 176 */                           return ooiIlOl1iI2;
                                }
/* 81 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 85 */                    j = this.I00iiO;
/* 87 */                    lIoii1l01l0i.I00000oOI(obj);
/* 107 */                   OIoi0IIoi oIoi0IIoiI0001Ioi1lo = oo0IOoOi01.I0001Ioi1lo();
/* 111 */                   if (oIoi0IIoiI0001Ioi1lo != null) {
/* 116 */                       String str = (String) oIoi0IIoiI0001Ioi1lo.I00iOIl;
/* 122 */                       long j8 = ((Oo0lI00l) oIoi0IIoiI0001Ioi1lo.I00iiI).I00000oIO;
/* 124 */                       OO1O0I oo1o0i2 = oo0IOoOi01.I000OiO;
/* 126 */                       if (oo1o0i2 != null) {
/* 128 */                           OIOlIiiioi.I00000oIO(j);
/* 131 */                           this.I00iiI = 2;
/* 137 */                           if (str.length() == 0 || Oo0lI00l.I0000O(j8)) {
/* 146 */                               objI0000oI002 = ooiIlOl1iI2;
                                    } else {
/* 164 */                               objI0000oI002 = iOi1II01i0.I0000oI00(oo1o0i2.I00000oIO, new O1o1iI(oo1o0i2, new I00oO101o(oo1o0i2, str, j8, (IOoil1iiIilo) null, 4), iOoil1iiIilo, i), this);
                                    }
/* 168 */                           if (objI0000oI002 != ii0111o7) {
/* 171 */                               objI0000oI002 = ooiIlOl1iI2;
                                        break;
                                    }
                                }
                            }
/* 176 */                   return ooiIlOl1iI2;
                        default:
/* 12 */                    Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 14 */                    int i9 = this.I00iiI;
/* 16 */                    if (i9 == 0) {
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
/* 33 */                        long j9 = this.I00iiO;
/* 35 */                        this.I00iiI = 1;
/* 41 */                        if (il0l1o1l.I00000oOI(j9, this) == ii0111o8) {
/* 43 */                            return ii0111o8;
                                }
                            } else {
/* 18 */                        if (i9 != 1) {
/* 26 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 20 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 47 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 49 */                    OIo1i1 oIo1i1 = OollloolI.I00000oIO;
/* 53 */                    oI10i0Il.setValue(Boolean.TRUE);
/* 56 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public I10I1l(Object obj, long j, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 12 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00iiO = j;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public I10I1l(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00iOIl = i;
                    this.I00iio = obj;
                }
            }

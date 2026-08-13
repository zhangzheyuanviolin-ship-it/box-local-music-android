            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
/* 11 */    public final class I1oO0ooi001 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final int I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1oO0ooi001(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 9 */             super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 3;
/* 4 */             this.I00iio = iiIi1o;
/* 6 */             this.I00iiO = i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = this.I00iiO;
/* 5 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 77 */                    return new I1oO0ooi001((IiOoOi1) obj2, i2, iOoil1iiIilo, 0);
                        case 1:
/* 68 */                    return new I1oO0ooi001((Ii1liIllli0) obj2, i2, iOoil1iiIilo, 1);
                        case 2:
/* 59 */                    return new I1oO0ooi001((IiIOIO1I) obj2, i2, iOoil1iiIilo, 2);
                        case 3:
/* 50 */                    return new I1oO0ooi001((IiIi1o) obj2, iOoil1iiIilo, i2);
                        case 4:
/* 42 */                    return new I1oO0ooi001((IiI0O1Io) obj2, i2, iOoil1iiIilo, 4);
                        case 5:
/* 33 */                    return new I1oO0ooi001((O0loIO11Ilo) obj2, i2, iOoil1iiIilo, 5);
                        case 6:
/* 24 */                    return new I1oO0ooi001((OIoIoIO0oI1O) obj2, i2, iOoil1iiIilo, 6);
                        default:
/* 15 */                    return new I1oO0ooi001((OiOoi1OOoOO) obj2, i2, iOoil1iiIilo, 7);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 123 */                   return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 108 */                   return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 93 */                    return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 78 */                    return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 63 */                    return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 48 */                    return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 33 */                    return ((I1oO0ooi001) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((I1oO0ooi001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0010o;
/* 3 */             int i = this.I00iOIl;
/* 6 */             int i2 = 0;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             int i3 = this.I00iiO;
/* 11 */            Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 328 */                   IiOoOi1 iiOoOi1 = (IiOoOi1) obj2;
/* 330 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 332 */                   int i4 = this.I00iiI;
/* 334 */                   if (i4 != 0) {
/* 336 */                       if (i4 == 1) {
/* 338 */                           lIoii1l01l0i.I00000oOI(obj);
/* 535 */                           return ooiIlOl1iI;
                                }
/* 343 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                        return null;
                            }
/* 349 */                   lIoii1l01l0i.I00000oOI(obj);
/* 354 */                   float fI000II = iiOoOi1.I00olI.I000II();
/* 358 */                   I10i01 i10i01I00000oIO = O1OI1ll1Il0i.I00000oIO(fI000II);
/* 364 */                   float f = 1.0f + fI000II;
/* 367 */                   Float f2 = new Float(fI000II);
/* 372 */                   Float f3 = new Float(f);
/* 375 */                   OoIoOiiO1 ooIoOiiO1 = i10i01I00000oIO.I00000oIO;
/* 383 */                   I110ooool i110ooool = (I110ooool) ooIoOiiO1.I00000oIO.invoke(f2);
/* 385 */                   if (i110ooool == null) {
/* 387 */                       i110ooool = i10i01I00000oIO.I000O01llI0;
                            }
/* 395 */                   I110ooool i110ooool2 = (I110ooool) ooIoOiiO1.I00000oIO.invoke(f3);
/* 397 */                   if (i110ooool2 == null) {
/* 399 */                       i110ooool2 = i10i01I00000oIO.I000OOo1O;
                            }
/* 401 */                   int iI00000oOI = i110ooool.I00000oOI();
/* 406 */                   for (int i5 = 0; i5 < iI00000oOI; i5++) {
/* 418 */                       if (i110ooool.I00000oIO(i5) > i110ooool2.I00000oIO(i5)) {
/* 451 */                           OO1olIl.I00000oOI("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + i110ooool + " is greater than upper bound " + i110ooool2 + " on index " + i5);
                                }
                            }
/* 457 */                   i10i01I00000oIO.I000OiO = i110ooool;
/* 459 */                   i10i01I00000oIO.I000iOII = i110ooool2;
/* 465 */                   if (!i10i01I00000oIO.I0000oI00()) {
/* 471 */                       Object objI00000oOI = i10i01I00000oIO.I00000oOI(i10i01I00000oIO.I0000O());
/* 483 */                       if (!O0000Ioio00.I0000O(objI00000oOI, i10i01I00000oIO.I0000O())) {
/* 489 */                           i10i01I00000oIO.I0000Il00O.I00iiI.setValue(objI00000oOI);
                                }
                            }
/* 494 */                   Float f4 = new Float(f);
/* 506 */                   IolIOIloiI00 iolIOIloiI00I00000oIO = iOO01lio0.I00000oIO(iOO01lio0.I0000O(i3, 2, IioO00o.I0000O), Oi010oI.I00iOIl, 4);
/* 512 */                   I1oO0i1l0101 i1oO0i1l0101 = new I1oO0i1l0101(i2);
/* 515 */                   i1oO0i1l0101.I00iiI = iiOoOi1;
/* 517 */                   VarHandle.storeStoreFence();
/* 520 */                   this.I00iiI = 1;
                            return I10i01.I00000oIO(i10i01I00000oIO, f4, iolIOIloiI00I00000oIO, null, i1oO0i1l0101, this, 4) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 286 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 288 */                   int i6 = this.I00iiI;
/* 290 */                   if (i6 != 0) {
/* 292 */                       if (i6 == 1) {
/* 294 */                           lIoii1l01l0i.I00000oOI(obj);
/* 297 */                           return obj;
                                }
/* 300 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                        return null;
                            }
/* 305 */                   lIoii1l01l0i.I00000oOI(obj);
/* 310 */                   Ii1I1ooo10O0 ii1I1ooo10O0 = ((Ii1liIllli0) obj2).I0000Il00O;
/* 314 */                   Ii1l1I1l1ii1 ii1l1I1l1ii1 = new Ii1l1I1l1ii1(i3, null, 0);
/* 317 */                   this.I00iiI = 1;
/* 319 */                   Object objI00000oIO = ii1I1ooo10O0.I00000oIO(ii1l1I1l1ii1, this);
                            return objI00000oIO == ii0111o2 ? ii0111o2 : objI00000oIO;
                        case 2:
/* 220 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 222 */                   int i7 = this.I00iiI;
/* 224 */                   if (i7 == 0) {
/* 246 */                       lIoii1l01l0i.I00000oOI(obj);
/* 251 */                       this.I00iiI = 1;
/* 253 */                       objI0010o = ((IiIOIO1I) obj2).I0010o(this);
/* 257 */                       if (objI0010o != ii0111o3) {
                                }
/* 282 */                       return ii0111o3;
                            }
/* 226 */                   if (i7 != 1) {
/* 228 */                       if (i7 == 2) {
/* 230 */                           lIoii1l01l0i.I00000oOI(obj);
/* 233 */                           return obj;
                                }
/* 236 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                        return null;
                            }
/* 240 */                   lIoii1l01l0i.I00000oOI(obj);
/* 243 */                   objI0010o = obj;
/* 260 */                   List list = (List) objI0010o;
/* 266 */                   if (i3 >= list.size()) {
/* 16 */                        return null;
                            }
/* 272 */                   IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) list.get(i3);
/* 274 */                   this.I00iiI = 2;
/* 276 */                   Object objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(this);
/* 280 */                   if (objI00o0iI0io1 != ii0111o3) {
/* 284 */                       return objI00o0iI0io1;
                            }
/* 282 */                   return ii0111o3;
                        case 3:
/* 175 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 177 */                   int i8 = this.I00iiI;
/* 179 */                   if (i8 != 0) {
/* 181 */                       if (i8 == 1) {
/* 183 */                           lIoii1l01l0i.I00000oOI(obj);
/* 186 */                           return obj;
                                }
/* 189 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                        return null;
                            }
/* 194 */                   lIoii1l01l0i.I00000oOI(obj);
/* 203 */                   IiIOI1ol0o iiIOI1ol0oI000O01llI0 = ((IiIi1o) obj2).I000o00OoI0I().I000O01llI0(i3);
/* 207 */                   this.I00iiI = 1;
/* 211 */                   Object objI0010o2 = ((IOi10loi) iiIOI1ol0oI000O01llI0).I0010o(this);
                            return objI0010o2 == ii0111o4 ? ii0111o4 : objI0010o2;
                        case 4:
/* 143 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 145 */                   int i9 = this.I00iiI;
/* 147 */                   if (i9 == 0) {
/* 160 */                       lIoii1l01l0i.I00000oOI(obj);
/* 165 */                       this.I00iiI = 1;
                                return ((IiI0O1Io) obj2).I0001Ioi1lo(i3, iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7), this) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                            }
/* 149 */                   if (i9 == 1) {
/* 151 */                       lIoii1l01l0i.I00000oOI(obj);
/* 174 */                       return ooiIlOl1iI;
                            }
/* 155 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                    return null;
                        case 5:
/* 109 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 111 */                   int i10 = this.I00iiI;
/* 113 */                   if (i10 == 0) {
/* 126 */                       lIoii1l01l0i.I00000oOI(obj);
/* 131 */                       O0lo0l o0lo0l = ((O0loIO11Ilo) obj2).I00o0l1o1o0;
/* 133 */                       this.I00iiI = 1;
                                return o0lo0l.I0000Il00O(i3, this) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                            }
/* 115 */                   if (i10 == 1) {
/* 117 */                       lIoii1l01l0i.I00000oOI(obj);
/* 142 */                       return ooiIlOl1iI;
                            }
/* 121 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                    return null;
                        case 6:
/* 68 */                    OIoIoIO0oI1O oIoIoIO0oI1O = (OIoIoIO0oI1O) obj2;
/* 70 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 72 */                    int i11 = this.I00iiI;
/* 74 */                    if (i11 == 0) {
/* 87 */                        lIoii1l01l0i.I00000oOI(obj);
/* 90 */                        this.I00iiI = 1;
/* 96 */                        if (oIoIoIO0oI1O.I000OOo1O(this) == ii0111o7) {
/* 98 */                            return ii0111o7;
                                }
                            } else {
/* 76 */                        if (i11 != 1) {
/* 82 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                            return null;
                                }
/* 78 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 105 */                   oIoIoIO0oI1O.I001IIilI0O(oIoIoIO0oI1O.I000OiO(i3), 0.0f, true);
/* 108 */                   return ooiIlOl1iI;
                        default:
/* 20 */                    Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 22 */                    int i12 = this.I00iiI;
/* 24 */                    if (i12 != 0) {
/* 26 */                        if (i12 == 1) {
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 67 */                            return ooiIlOl1iI;
                                }
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 40 */                    OiOoi1OOoOO oiOoi1OOoOO = (OiOoi1OOoOO) obj2;
/* 42 */                    OiOl01il10lO oiOl01il10lO = oiOoi1OOoOO.I00000oIO;
/* 44 */                    IlIoO1ilo1 ilIoO1ilo1 = oiOoi1OOoOO.I0000Il00O;
/* 46 */                    this.I00iiI = 1;
/* 56 */                    Object objI00000oIO2 = lO1010I.I00000oIO(oiOl01il10lO, i3 - oiOl01il10lO.I00000oIO.I000II(), ilIoO1ilo1, this);
/* 60 */                    if (objI00000oIO2 != ii0111o8) {
/* 63 */                        objI00000oIO2 = ooiIlOl1iI;
                            }
                            return objI00000oIO2 == ii0111o8 ? ii0111o8 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public I1oO0ooi001(Object obj, int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00iOIl = i2;
                    this.I00iio = obj;
                    this.I00iiO = i;
                }
            }

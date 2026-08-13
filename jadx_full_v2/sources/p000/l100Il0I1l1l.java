            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l100Il0I1l1l {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0210  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0248  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[Catch: O00O0I -> 0x01c1, TryCatch #4 {O00O0I -> 0x01c1, blocks: (B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:39:0x00d8, B:42:0x00ed, B:55:0x0116, B:40:0x00e1), top: B:126:0x00cf }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /* JADX WARN: Type inference failed for: r4v12, types: [int] */
                /* JADX WARN: Type inference failed for: r4v14 */
                /* JADX WARN: Type inference failed for: r4v18 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x019d -> B:138:0x019f). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(O0o0101i o0o0101i, int i, int i2, int i3, IiIooOOOI iiIooOOOI, IOoilo iOoilo) throws Throwable {
                    O0lo00ii01 o0lo00ii01;
                    O0o0101i o0o0101i2;
                    float f;
                    Ii0111o ii0111o;
                    int i4;
                    float fI00i0ilIl0i;
                    float fI00i0ilIl0i2;
                    float fI00i0ilIl0i3;
                    OOo0l0ii10l oOo0l0ii10l;
                    OOo0ooi oOo0ooi;
                    int i5;
                    float f2;
                    OOo0ll111 oOo0ll111;
                    OOo0l0ii10l oOo0l0ii10l2;
                    float f3;
                    O0lo00ii01 o0lo00ii012;
                    float f4;
                    int i6;
                    I110IiI1I1 i110IiI1I1I00000oOI;
                    Float f5;
                    boolean z;
                    I0i1l00llOi1 i0i1l00llOi1;
                    int i7;
                    O0o0101i o0o0101i3;
                    O0lo00ii01 o0lo00ii013;
                    int iI000o00OoI0I;
                    float fMax;
                    Ii0111o ii0111o2;
                    ?? r4;
/* 1 */             int i8 = i;
/* 9 */             if (iOoilo instanceof O0lo00ii01) {
/* 12 */                o0lo00ii01 = (O0lo00ii01) iOoilo;
/* 14 */                int i9 = o0lo00ii01.I00lli11;
/* 20 */                if ((i9 & Integer.MIN_VALUE) != 0) {
/* 23 */                    o0lo00ii01.I00lli11 = i9 - Integer.MIN_VALUE;
                        } else {
/* 28 */                    o0lo00ii01 = new O0lo00ii01(iOoilo);
                        }
                    }
/* 31 */            Object obj = o0lo00ii01.I00ll1;
/* 33 */            Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 35 */            int i10 = o0lo00ii01.I00lli11;
/* 37 */            float f6 = 0.0f;
/* 40 */            boolean z2 = true;
/* 41 */            if (i10 == 0) {
/* 116 */               lIoii1l01l0i.I00000oOI(obj);
/* 122 */               if (i8 < 0.0f) {
/* 127 */                   Ioll0IliO1l.I00000oIO("Index should be non-negative");
                        }
                        try {
/* 133 */                   fI00i0ilIl0i = iiIooOOOI.I00i0ilIl0i(2500.0f);
/* 140 */                   fI00i0ilIl0i2 = iiIooOOOI.I00i0ilIl0i(1500.0f);
/* 146 */                   fI00i0ilIl0i3 = iiIooOOOI.I00i0ilIl0i(50.0f);
/* 152 */                   oOo0l0ii10l = new OOo0l0ii10l();
/* 155 */                   oOo0l0ii10l.I00iOIl = true;
/* 159 */                   oOo0ooi = new OOo0ooi();
/* 168 */                   oOo0ooi.I00iOIl = iOO0I0.I00000oIO(0.0f, 0.0f, 30);
                        } catch (O00O0I e) {
/* 487 */                   e = e;
/* 488 */                   o0o0101i2 = o0o0101i;
                        }
/* 174 */               if (I0000Il00O(o0o0101i, i)) {
/* 466 */                   o0o0101i2 = o0o0101i;
/* 468 */                   f = 0.0f;
/* 470 */                   ii0111o = ii0111o3;
                            try {
/* 484 */                       throw new O00O0I(o0o0101i.I00000oOI(i), (I110IiI1I1) oOo0ooi.I00iOIl);
                            } catch (O00O0I e2) {
/* 485 */                       e = e2;
/* 461 */                       i4 = i2;
/* 493 */                       float f7 = f;
/* 497 */                       i110IiI1I1I00000oOI = iOO0I0.I00000oOI(e.I00iiI, f7, f7, 30);
/* 503 */                       float f8 = e.I00iOIl + i4;
/* 507 */                       OOo0lO oOo0lO = new OOo0lO();
/* 512 */                       f5 = new Float(f8);
/* 533 */                       z = ((Number) i110IiI1I1I00000oOI.I00000oIO()).floatValue() != f7;
/* 540 */                       i0i1l00llOi1 = new I0i1l00llOi1(3);
/* 543 */                       i0i1l00llOi1.I00iiI = f8;
/* 545 */                       i0i1l00llOi1.I00iiO = oOo0lO;
/* 547 */                       i0i1l00llOi1.I00iio = o0o0101i2;
/* 549 */                       VarHandle.storeStoreFence();
/* 552 */                       o0lo00ii01.I00iOIl = o0o0101i2;
/* 555 */                       o0lo00ii01.I00iiI = null;
/* 557 */                       o0lo00ii01.I00iiO = null;
/* 559 */                       o0lo00ii01.I00iio = null;
/* 561 */                       o0lo00ii01.I00ilI0I1 = i8;
/* 563 */                       o0lo00ii01.I00ilO0 = i4;
/* 566 */                       o0lo00ii01.I00lli11 = 2;
/* 582 */                       if (lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI, f5, null, !z, i0i1l00llOi1, o0lo00ii01, 2) != ii0111o) {
/* 585 */                           i7 = i4;
/* 586 */                           o0o0101i3 = o0o0101i2;
/* 587 */                           o0o0101i3.I0001Ioi1lo(i8, i7);
/* 590 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 584 */                       return ii0111o;
                            }
                        }
/* 176 */               o0o0101i2 = o0o0101i;
                        try {
/* 190 */                   i5 = i8 > ((O0o0I1i0O) o0o0101i2.I0000Il00O).I000O01llI0() ? 1 : 0;
                        } catch (O00O0I e3) {
/* 464 */                   e = e3;
                        }
                        try {
/* 193 */                   OOo0ll111 oOo0ll1112 = new OOo0ll111();
/* 196 */                   oOo0ll1112.I00iOIl = 1;
/* 198 */                   f2 = fI00i0ilIl0i;
/* 199 */                   oOo0ll111 = oOo0ll1112;
/* 200 */                   i4 = i2;
/* 202 */                   oOo0l0ii10l2 = oOo0l0ii10l;
/* 203 */                   f3 = fI00i0ilIl0i2;
/* 204 */                   o0lo00ii012 = o0lo00ii01;
/* 205 */                   f4 = fI00i0ilIl0i3;
/* 206 */                   i6 = i3;
/* 210 */                   if (oOo0l0ii10l2.I00iOIl) {
                            }
                        } catch (O00O0I e4) {
/* 457 */                   e = e4;
/* 458 */                   f = 0.0f;
/* 460 */                   ii0111o = ii0111o3;
/* 461 */                   i4 = i2;
/* 493 */                   float f72 = f;
/* 497 */                   i110IiI1I1I00000oOI = iOO0I0.I00000oOI(e.I00iiI, f72, f72, 30);
/* 503 */                   float f82 = e.I00iOIl + i4;
/* 507 */                   OOo0lO oOo0lO2 = new OOo0lO();
/* 512 */                   f5 = new Float(f82);
/* 533 */                   if (((Number) i110IiI1I1I00000oOI.I00000oIO()).floatValue() != f72) {
                            }
/* 540 */                   i0i1l00llOi1 = new I0i1l00llOi1(3);
/* 543 */                   i0i1l00llOi1.I00iiI = f82;
/* 545 */                   i0i1l00llOi1.I00iiO = oOo0lO2;
/* 547 */                   i0i1l00llOi1.I00iio = o0o0101i2;
/* 549 */                   VarHandle.storeStoreFence();
/* 552 */                   o0lo00ii01.I00iOIl = o0o0101i2;
/* 555 */                   o0lo00ii01.I00iiI = null;
/* 557 */                   o0lo00ii01.I00iiO = null;
/* 559 */                   o0lo00ii01.I00iio = null;
/* 561 */                   o0lo00ii01.I00ilI0I1 = i8;
/* 563 */                   o0lo00ii01.I00ilO0 = i4;
/* 566 */                   o0lo00ii01.I00lli11 = 2;
/* 582 */                   if (lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI, f5, null, !z, i0i1l00llOi1, o0lo00ii01, 2) != ii0111o) {
                            }
/* 584 */                   return ii0111o;
                        }
/* 590 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 43 */            if (i10 != 1) {
/* 45 */                if (i10 != 2) {
/* 60 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                    return null;
                        }
/* 47 */                i7 = o0lo00ii01.I00ilO0;
/* 49 */                i8 = o0lo00ii01.I00ilI0I1;
/* 51 */                o0o0101i3 = o0lo00ii01.I00iOIl;
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 587 */               o0o0101i3.I0001Ioi1lo(i8, i7);
/* 590 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 64 */            int i11 = o0lo00ii01.I00ioIO;
/* 66 */            float f9 = o0lo00ii01.I00li1OI;
/* 68 */            float f10 = o0lo00ii01.I00l0OO0IO;
/* 70 */            float f11 = o0lo00ii01.I00l0I0l0lO1;
/* 72 */            int i12 = o0lo00ii01.I00io1l;
/* 74 */            int i13 = o0lo00ii01.I00ilO0;
/* 76 */            int i14 = o0lo00ii01.I00ilI0I1;
/* 78 */            OOo0ll111 oOo0ll1113 = o0lo00ii01.I00iio;
/* 80 */            oOo0ooi = o0lo00ii01.I00iiO;
/* 82 */            OOo0l0ii10l oOo0l0ii10l3 = o0lo00ii01.I00iiI;
/* 84 */            O0o0101i o0o0101i4 = o0lo00ii01.I00iOIl;
                    try {
/* 86 */                lIoii1l01l0i.I00000oOI(obj);
/* 90 */                i5 = i11;
/* 91 */                i6 = i12;
/* 92 */                oOo0ll111 = oOo0ll1113;
/* 93 */                f = 0.0f;
/* 95 */                i4 = i13;
/* 96 */                ii0111o = ii0111o3;
/* 97 */                r4 = 1;
/* 98 */                f2 = f11;
/* 99 */                oOo0l0ii10l2 = oOo0l0ii10l3;
/* 100 */               o0o0101i2 = o0o0101i4;
/* 101 */               f3 = f10;
/* 102 */               o0lo00ii012 = o0lo00ii01;
/* 103 */               f4 = f9;
/* 104 */               i8 = i14;
                        try {
                            try {
                                oOo0ll111.I00iOIl += r4;
                            } catch (O00O0I e5) {
/* 450 */                       e = e5;
/* 451 */                       o0lo00ii013 = o0lo00ii012;
/* 453 */                       f = f6;
/* 455 */                       ii0111o = ii0111o3;
                            }
/* 421 */                   ii0111o3 = ii0111o;
/* 422 */                   f6 = f;
/* 424 */                   z2 = true;
                        } catch (O00O0I e6) {
/* 427 */                   e = e6;
/* 428 */                   o0lo00ii01 = o0lo00ii012;
/* 493 */                   float f722 = f;
/* 497 */                   i110IiI1I1I00000oOI = iOO0I0.I00000oOI(e.I00iiI, f722, f722, 30);
/* 503 */                   float f822 = e.I00iOIl + i4;
/* 507 */                   OOo0lO oOo0lO22 = new OOo0lO();
/* 512 */                   f5 = new Float(f822);
/* 533 */                   if (((Number) i110IiI1I1I00000oOI.I00000oIO()).floatValue() != f722) {
                            }
/* 540 */                   i0i1l00llOi1 = new I0i1l00llOi1(3);
/* 543 */                   i0i1l00llOi1.I00iiI = f822;
/* 545 */                   i0i1l00llOi1.I00iiO = oOo0lO22;
/* 547 */                   i0i1l00llOi1.I00iio = o0o0101i2;
/* 549 */                   VarHandle.storeStoreFence();
/* 552 */                   o0lo00ii01.I00iOIl = o0o0101i2;
/* 555 */                   o0lo00ii01.I00iiI = null;
/* 557 */                   o0lo00ii01.I00iiO = null;
/* 559 */                   o0lo00ii01.I00iio = null;
/* 561 */                   o0lo00ii01.I00ilI0I1 = i8;
/* 563 */                   o0lo00ii01.I00ilO0 = i4;
/* 566 */                   o0lo00ii01.I00lli11 = 2;
/* 582 */                   if (lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI, f5, null, !z, i0i1l00llOi1, o0lo00ii01, 2) != ii0111o) {
                            }
/* 584 */                   return ii0111o;
                        }
                    } catch (O00O0I e7) {
/* 107 */               e = e7;
/* 108 */               o0o0101i2 = o0o0101i4;
/* 109 */               f = 0.0f;
/* 111 */               i4 = i13;
/* 112 */               i8 = i14;
/* 113 */               ii0111o = ii0111o3;
/* 493 */               float f7222 = f;
/* 497 */               i110IiI1I1I00000oOI = iOO0I0.I00000oOI(e.I00iiI, f7222, f7222, 30);
/* 503 */               float f8222 = e.I00iOIl + i4;
/* 507 */               OOo0lO oOo0lO222 = new OOo0lO();
/* 512 */               f5 = new Float(f8222);
/* 533 */               if (((Number) i110IiI1I1I00000oOI.I00000oIO()).floatValue() != f7222) {
                        }
/* 540 */               i0i1l00llOi1 = new I0i1l00llOi1(3);
/* 543 */               i0i1l00llOi1.I00iiI = f8222;
/* 545 */               i0i1l00llOi1.I00iiO = oOo0lO222;
/* 547 */               i0i1l00llOi1.I00iio = o0o0101i2;
/* 549 */               VarHandle.storeStoreFence();
/* 552 */               o0lo00ii01.I00iOIl = o0o0101i2;
/* 555 */               o0lo00ii01.I00iiI = null;
/* 557 */               o0lo00ii01.I00iiO = null;
/* 559 */               o0lo00ii01.I00iio = null;
/* 561 */               o0lo00ii01.I00ilI0I1 = i8;
/* 563 */               o0lo00ii01.I00ilO0 = i4;
/* 566 */               o0lo00ii01.I00lli11 = 2;
/* 582 */               if (lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI, f5, null, !z, i0i1l00llOi1, o0lo00ii01, 2) != ii0111o) {
                        }
/* 584 */               return ii0111o;
                    }
/* 210 */           if (oOo0l0ii10l2.I00iOIl) {
                        switch (o0o0101i2.I00000oIO) {
                            case 0:
/* 234 */                       iI000o00OoI0I = ((O0o0I1i0O) o0o0101i2.I0000Il00O).I000OiO().I000oI1ioi;
                                break;
                            default:
/* 221 */                       iI000o00OoI0I = ((OIoIoIO0oI1O) o0o0101i2.I0000Il00O).I000o00OoI0I();
                                break;
                        }
/* 236 */               if (iI000o00OoI0I > 0) {
                            try {
                                try {
                                    try {
                                        try {
/* 242 */                                   int iI00000oOI = o0o0101i2.I00000oOI(i8) + i4;
/* 243 */                                   boolean z3 = z2;
/* 252 */                                   if (Math.abs(iI00000oOI) >= f2) {
/* 278 */                                       fMax = i5 != 0 ? f2 : -f2;
                                            } else {
                                                try {
/* 259 */                                           fMax = Math.max(Math.abs(iI00000oOI), f4);
/* 263 */                                           if (i5 == 0) {
/* 266 */                                               fMax = -fMax;
                                                    }
                                                } catch (O00O0I e8) {
/* 268 */                                           e = e8;
/* 269 */                                           o0lo00ii01 = o0lo00ii012;
/* 270 */                                           f = f6;
/* 113 */                                           ii0111o = ii0111o3;
/* 493 */                                           float f72222 = f;
/* 497 */                                           i110IiI1I1I00000oOI = iOO0I0.I00000oOI(e.I00iiI, f72222, f72222, 30);
/* 503 */                                           float f82222 = e.I00iOIl + i4;
/* 507 */                                           OOo0lO oOo0lO2222 = new OOo0lO();
/* 512 */                                           f5 = new Float(f82222);
/* 533 */                                           if (((Number) i110IiI1I1I00000oOI.I00000oIO()).floatValue() != f72222) {
                                                    }
/* 540 */                                           i0i1l00llOi1 = new I0i1l00llOi1(3);
/* 543 */                                           i0i1l00llOi1.I00iiI = f82222;
/* 545 */                                           i0i1l00llOi1.I00iiO = oOo0lO2222;
/* 547 */                                           i0i1l00llOi1.I00iio = o0o0101i2;
/* 549 */                                           VarHandle.storeStoreFence();
/* 552 */                                           o0lo00ii01.I00iOIl = o0o0101i2;
/* 555 */                                           o0lo00ii01.I00iiI = null;
/* 557 */                                           o0lo00ii01.I00iiO = null;
/* 559 */                                           o0lo00ii01.I00iio = null;
/* 561 */                                           o0lo00ii01.I00ilI0I1 = i8;
/* 563 */                                           o0lo00ii01.I00ilO0 = i4;
/* 566 */                                           o0lo00ii01.I00lli11 = 2;
/* 582 */                                           if (lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI, f5, null, !z, i0i1l00llOi1, o0lo00ii01, 2) != ii0111o) {
                                                    }
/* 584 */                                           return ii0111o;
                                                }
                                            }
/* 287 */                                   I110IiI1I1 i110IiI1I1I00000oOI2 = iOO0I0.I00000oOI((I110IiI1I1) oOo0ooi.I00iOIl, f6, f6, 30);
/* 291 */                                   oOo0ooi.I00iOIl = i110IiI1I1I00000oOI2;
/* 295 */                                   OOo0lO oOo0lO3 = new OOo0lO();
/* 302 */                                   Float f12 = new Float(fMax);
                                            boolean z4 = !(((Number) ((I110IiI1I1) oOo0ooi.I00iOIl).I00000oIO()).floatValue() == f ? z3 : false);
/* 338 */                                   boolean z5 = i5 != 0 ? z3 : false;
/* 342 */                                   O0lllOII o0lllOII = new O0lllOII();
/* 345 */                                   o0lllOII.I00iOIl = o0o0101i2;
/* 347 */                                   o0lllOII.I00iiI = i8;
/* 349 */                                   o0lllOII.I00iiO = fMax;
/* 351 */                                   o0lllOII.I00iio = oOo0lO3;
/* 353 */                                   o0lllOII.I00ilI0I1 = oOo0l0ii10l2;
/* 355 */                                   o0lllOII.I00ilO0 = z5;
/* 357 */                                   o0lllOII.I00io1l = f3;
/* 359 */                                   o0lllOII.I00ioIO = oOo0ll111;
/* 361 */                                   o0lllOII.I00l0I0l0lO1 = i6;
/* 363 */                                   o0lllOII.I00l0OO0IO = i4;
/* 365 */                                   o0lllOII.I00li1OI = oOo0ooi;
/* 367 */                                   VarHandle.storeStoreFence();
/* 370 */                                   o0lo00ii012.I00iOIl = o0o0101i2;
/* 372 */                                   o0lo00ii012.I00iiI = oOo0l0ii10l2;
/* 374 */                                   o0lo00ii012.I00iiO = oOo0ooi;
/* 376 */                                   o0lo00ii012.I00iio = oOo0ll111;
/* 378 */                                   o0lo00ii012.I00ilI0I1 = i8;
/* 380 */                                   o0lo00ii012.I00ilO0 = i4;
/* 382 */                                   o0lo00ii012.I00io1l = i6;
/* 384 */                                   o0lo00ii012.I00l0I0l0lO1 = f2;
/* 386 */                                   o0lo00ii012.I00l0OO0IO = f3;
/* 388 */                                   o0lo00ii012.I00li1OI = f4;
/* 390 */                                   o0lo00ii012.I00ioIO = i5;
/* 392 */                                   boolean z6 = z3;
/* 394 */                                   o0lo00ii012.I00lli11 = z6 ? 1 : 0;
/* 404 */                                   Object objI0001Ioi1lo = lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI2, f12, null, z4, o0lllOII, o0lo00ii013, 2);
/* 408 */                                   ii0111o = ii0111o2;
/* 410 */                                   if (objI0001Ioi1lo != ii0111o) {
/* 414 */                                       o0lo00ii012 = o0lo00ii013;
                                                r4 = z6;
                                                oOo0ll111.I00iOIl += r4;
/* 421 */                                       ii0111o3 = ii0111o;
/* 422 */                                       f6 = f;
/* 424 */                                       z2 = true;
/* 210 */                                       if (oOo0l0ii10l2.I00iOIl) {
                                                }
                                            }
                                        } catch (O00O0I e9) {
/* 436 */                                   e = e9;
/* 437 */                                   o0lo00ii013 = o0lo00ii012;
                                        }
                                    } catch (O00O0I e10) {
/* 444 */                               e = e10;
/* 445 */                               o0lo00ii013 = o0lo00ii012;
/* 447 */                               f = f6;
                                    }
/* 283 */                           ii0111o2 = ii0111o3;
                                } catch (O00O0I e11) {
/* 430 */                           e = e11;
/* 431 */                           ii0111o = ii0111o2;
/* 433 */                           o0lo00ii01 = o0lo00ii013;
/* 493 */                           float f722222 = f;
/* 497 */                           i110IiI1I1I00000oOI = iOO0I0.I00000oOI(e.I00iiI, f722222, f722222, 30);
/* 503 */                           float f822222 = e.I00iOIl + i4;
/* 507 */                           OOo0lO oOo0lO22222 = new OOo0lO();
/* 512 */                           f5 = new Float(f822222);
/* 533 */                           if (((Number) i110IiI1I1I00000oOI.I00000oIO()).floatValue() != f722222) {
                                    }
/* 540 */                           i0i1l00llOi1 = new I0i1l00llOi1(3);
/* 543 */                           i0i1l00llOi1.I00iiI = f822222;
/* 545 */                           i0i1l00llOi1.I00iiO = oOo0lO22222;
/* 547 */                           i0i1l00llOi1.I00iio = o0o0101i2;
/* 549 */                           VarHandle.storeStoreFence();
/* 552 */                           o0lo00ii01.I00iOIl = o0o0101i2;
/* 555 */                           o0lo00ii01.I00iiI = null;
/* 557 */                           o0lo00ii01.I00iiO = null;
/* 559 */                           o0lo00ii01.I00iio = null;
/* 561 */                           o0lo00ii01.I00ilI0I1 = i8;
/* 563 */                           o0lo00ii01.I00ilO0 = i4;
/* 566 */                           o0lo00ii01.I00lli11 = 2;
/* 582 */                           if (lOiIo0.I0001Ioi1lo(i110IiI1I1I00000oOI, f5, null, !z, i0i1l00llOi1, o0lo00ii01, 2) != ii0111o) {
                                    }
/* 584 */                           return ii0111o;
                                }
/* 400 */                       o0lo00ii013 = o0lo00ii012;
                            } catch (O00O0I e12) {
/* 440 */                       e = e12;
/* 441 */                       o0lo00ii013 = o0lo00ii012;
                            }
/* 298 */                   f = f6;
/* 584 */                   return ii0111o;
                        }
                    }
/* 590 */           return OoiIlOl1iI.I00000oIO;
                }

                public static final boolean I00000oOI(boolean z, O0o0101i o0o0101i, int i, int i2) {
/* 1 */             if (z) {
/* 7 */                 if (o0o0101i.I0000Il00O() > i) {
/* 42 */                    return true;
                        }
                        return o0o0101i.I0000Il00O() == i && o0o0101i.I0000O() > i2;
                    }
/* 27 */            if (o0o0101i.I0000Il00O() < i) {
/* 42 */                return true;
                    }
                    return o0o0101i.I0000Il00O() == i && o0o0101i.I0000O() < i2;
                }

                public static final boolean I0000Il00O(O0o0101i o0o0101i, int i) {
                    return i <= o0o0101i.I0000oI00() && o0o0101i.I0000Il00O() <= i;
                }
            }

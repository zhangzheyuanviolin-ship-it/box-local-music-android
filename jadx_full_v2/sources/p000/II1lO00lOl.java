            package p000;

            import android.graphics.Bitmap;
            import java.util.LinkedHashSet;
            import java.util.List;
            
/* 13 */    public final class II1lO00lOl extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1lO00lOl(Ii1liIllli0 ii1liIllli0, Ol0ioI1iI ol0ioI1iI, boolean z, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 3;
/* 4 */             this.I00iio = ii1liIllli0;
/* 6 */             this.I00ilI0I1 = ol0ioI1iI;
/* 8 */             this.I00iiO = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 102 */                   II1lO00lOl iI1lO00lOl = new II1lO00lOl((II1o0111IO0) obj2, iOoil1iiIilo);
/* 105 */                   iI1lO00lOl.I00iio = obj;
/* 107 */                   return iI1lO00lOl;
                        case 1:
/* 93 */                    return new II1lO00lOl((OI10i0Il) this.I00iio, this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 73 */                    return new II1lO00lOl((List) this.I00iio, iOoil1iiIilo, this.I00iiO, (IO01o11o0lI0) obj2, 2);
                        case 3:
/* 55 */                    return new II1lO00lOl((Ii1liIllli0) this.I00iio, (Ol0ioI1iI) obj2, this.I00iiO, iOoil1iiIilo);
                        case 4:
/* 40 */                    return new II1lO00lOl((IiIi1o) this.I00iio, iOoil1iiIilo, this.I00iiO, (LinkedHashSet) obj2, 4);
                        default:
/* 22 */                    return new II1lO00lOl((I10i01) this.I00iio, this.I00iiO, (I110IiI0o1Il) obj2, iOoil1iiIilo, 5);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((II1lO00lOl) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
                
                    if (((p000.IO01o11o0lI0) r3).I0010I0i(1000000000, r15) == r0) goto L49;
                 */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0001Ioi1lo;
                    Object obj2;
                    boolean z;
                    String str;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             Object obj3 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 306 */                   II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) obj3;
/* 310 */                   Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 312 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 314 */                   int i2 = this.I00iiI;
/* 316 */                   if (i2 == 0) {
/* 343 */                       lIoii1l01l0i.I00000oOI(obj);
/* 346 */                       this.I00iio = ii0110;
/* 348 */                       this.I00iiI = 1;
/* 350 */                       objI0001Ioi1lo = iI1o0111IO0.I0001Ioi1lo(this);
/* 354 */                       if (objI0001Ioi1lo != ii0111o) {
                                }
/* 434 */                       return ii0111o;
                            }
/* 318 */                   if (i2 != 1) {
/* 320 */                       if (i2 != 2) {
/* 331 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 322 */                       z = this.I00iiO;
/* 324 */                       lIoii1l01l0i.I00000oOI(obj);
/* 327 */                       obj2 = obj;
/* 439 */                       str = (String) obj2;
/* 441 */                       OlO0OIIl1 olO0OIIl1 = iI1o0111IO0.I0000Il00O;
/* 443 */                       I1OI0i1lo i1OI0i1lo = iI1o0111IO0.I000O01llI0;
/* 464 */                       olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Reading mode", null, false, 11));
/* 471 */                       if (OlOoOIi0o.I001l0I00(str)) {
/* 497 */                           i1OI0i1lo.I0000Il00O(new long[]{0, 40, 60, 40});
/* 500 */                           i1OI0i1lo.I00000oOI(str);
/* 503 */                           OlO0OIIl1 olO0OIIl12 = iI1o0111IO0.I0000Il00O;
/* 528 */                           olO0OIIl12.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl12.getValue(), null, false, null, OlOoOIi0o.I00OIl(120, str), false, 23));
/* 531 */                           return ooiIlOl1iI;
                                }
/* 473 */                       if (z) {
/* 487 */                           i1OI0i1lo.I00000oIO("No text found. Try holding the camera steady on the text.", Ool0lIo1o000.I00iiI);
/* 531 */                           return ooiIlOl1iI;
                                }
/* 479 */                       i1OI0i1lo.I00000oIO("The image is blurry. Hold the camera steady on the text, then tap again.", Ool0lIo1o000.I00iiI);
/* 531 */                       return ooiIlOl1iI;
                            }
/* 337 */                   lIoii1l01l0i.I00000oOI(obj);
/* 340 */                   objI0001Ioi1lo = obj;
/* 357 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) objI0001Ioi1lo;
/* 359 */                   if (oIoi0IIoi == null) {
/* 361 */                       OlO0OIIl1 olO0OIIl13 = iI1o0111IO0.I0000Il00O;
/* 382 */                       olO0OIIl13.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl13.getValue(), null, false, "Reading mode", null, false, 11));
/* 391 */                       iI1o0111IO0.I000O01llI0.I00000oIO("No camera image yet.", Ool0lIo1o000.I00iiI);
/* 531 */                       return ooiIlOl1iI;
                            }
/* 398 */                   Bitmap bitmap = (Bitmap) oIoi0IIoi.I00iOIl;
/* 404 */                   boolean zBooleanValue = ((Boolean) oIoi0IIoi.I00iiI).booleanValue();
/* 408 */                   Oi0Oooi oi0Oooi = iI1o0111IO0.I000II;
/* 410 */                   this.I00iio = null;
/* 412 */                   this.I00iiO = zBooleanValue;
/* 414 */                   this.I00iiI = 2;
/* 416 */                   oi0Oooi.getClass();
/* 419 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 428 */                   Object objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new OOlOoOo(bitmap, oi0Oooi, null), this);
/* 432 */                   if (objI0000oI00 != ii0111o) {
/* 437 */                       obj2 = objI0000oI00;
/* 438 */                       z = zBooleanValue;
/* 439 */                       str = (String) obj2;
/* 441 */                       OlO0OIIl1 olO0OIIl14 = iI1o0111IO0.I0000Il00O;
/* 443 */                       I1OI0i1lo i1OI0i1lo2 = iI1o0111IO0.I000O01llI0;
/* 464 */                       olO0OIIl14.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl14.getValue(), null, false, "Reading mode", null, false, 11));
/* 471 */                       if (OlOoOIi0o.I001l0I00(str)) {
                                }
                            }
/* 434 */                   return ii0111o;
                        case 1:
/* 246 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 248 */                   int i3 = this.I00iiI;
/* 250 */                   if (i3 == 0) {
/* 263 */                       lIoii1l01l0i.I00000oOI(obj);
/* 280 */                       if (!((Boolean) ((OI10i0Il) this.I00iio).getValue()).booleanValue() || this.I00iiO) {
/* 305 */                           return ooiIlOl1iI;
                                }
/* 286 */                       this.I00iiI = 1;
/* 294 */                       if (il0l1o1l.I00000oOI(240L, this) == ii0111o2) {
/* 296 */                           return ii0111o2;
                                }
                            } else {
/* 252 */                       if (i3 != 1) {
/* 258 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 254 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 302 */                   ((OI10i0Il) obj3).setValue(Boolean.FALSE);
/* 305 */                   return ooiIlOl1iI;
                        case 2:
/* 170 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 172 */                   int i4 = this.I00iiI;
/* 177 */                   if (i4 == 0) {
/* 196 */                       lIoii1l01l0i.I00000oOI(obj);
/* 199 */                       l11I11lO.I0000O(3, "CXCP");
/* 204 */                       List list = (List) this.I00iio;
/* 208 */                       this.I00iiI = 1;
/* 214 */                       if (iOOlOiI.I00000oOI(list, this) != ii0111o3) {
                                }
/* 240 */                       return ii0111o3;
                            }
/* 179 */                   if (i4 != 1) {
/* 181 */                       if (i4 != 2) {
/* 187 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 183 */                       lIoii1l01l0i.I00000oOI(obj);
/* 242 */                       l11I11lO.I0000O(3, "CXCP");
/* 245 */                       return ooiIlOl1iI;
                            }
/* 192 */                   lIoii1l01l0i.I00000oOI(obj);
/* 217 */                   l11I11lO.I0000O(3, "CXCP");
/* 222 */                   if (!this.I00iiO) {
/* 245 */                       return ooiIlOl1iI;
                            }
/* 224 */                   l11I11lO.I0000O(3, "CXCP");
/* 229 */                   this.I00iiI = 2;
                            break;
                        case 3:
/* 123 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 125 */                   int i5 = this.I00iiI;
/* 127 */                   if (i5 != 0) {
/* 129 */                       if (i5 == 1) {
/* 131 */                           lIoii1l01l0i.I00000oOI(obj);
/* 134 */                           return obj;
                                }
/* 137 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 142 */                   lIoii1l01l0i.I00000oOI(obj);
/* 149 */                   Ii1I1ooo10O0 ii1I1ooo10O0 = ((Ii1liIllli0) this.I00iio).I0000O;
/* 157 */                   Ii1li0iio0i ii1li0iio0i = new Ii1li0iio0i((Ol0ioI1iI) obj3, this.I00iiO, null);
/* 160 */                   this.I00iiI = 1;
/* 162 */                   Object objI00000oIO = ii1I1ooo10O0.I00000oIO(ii1li0iio0i, this);
                            return objI00000oIO == ii0111o4 ? ii0111o4 : objI00000oIO;
                        case 4:
/* 73 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 75 */                    int i6 = this.I00iiI;
/* 77 */                    if (i6 != 0) {
/* 79 */                        if (i6 == 1) {
/* 81 */                            lIoii1l01l0i.I00000oOI(obj);
/* 84 */                            return obj;
                                }
/* 87 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 92 */                    lIoii1l01l0i.I00000oOI(obj);
/* 107 */                   IiIOI1ol0o iiIOI1ol0oI000OiO = ((IiIi1o) this.I00iio).I000o00OoI0I().I000OiO((LinkedHashSet) obj3, this.I00iiO);
/* 111 */                   this.I00iiI = 1;
/* 115 */                   Object objI0010o = ((IOi10loi) iiIOI1ol0oI000OiO).I0010o(this);
                            return objI0010o == ii0111o5 ? ii0111o5 : objI0010o;
                        default:
/* 15 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 17 */                    int i7 = this.I00iiI;
/* 19 */                    if (i7 != 0) {
/* 21 */                        if (i7 == 1) {
/* 23 */                            lIoii1l01l0i.I00000oOI(obj);
/* 72 */                            return ooiIlOl1iI;
                                }
/* 27 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 32 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    I10i01 i10i01 = (I10i01) this.I00iio;
/* 47 */                    float f = this.I00iiO ? 1.0f : 0.8f;
/* 58 */                    this.I00iiI = 1;
                            return I10i01.I00000oIO(i10i01, new Float(f), (I110IiI0o1Il) obj3, null, null, this, 12) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public II1lO00lOl(II1o0111IO0 iI1o0111IO0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 0;
/* 15 */            this.I00ilI0I1 = iI1o0111IO0;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public II1lO00lOl(Object obj, IOoil1iiIilo iOoil1iiIilo, boolean z, Object obj2, int i) {
                    super(2, iOoil1iiIilo);
/* 16 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00iiO = z;
                    this.I00ilI0I1 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public II1lO00lOl(Object obj, boolean z, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00iiO = z;
                    this.I00ilI0I1 = obj2;
                }
            }

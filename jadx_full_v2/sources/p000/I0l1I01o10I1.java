            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
/* 15 */    public final class I0l1I01o10I1 extends Oll0io implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0l1I01o10I1(OolI1lo oolI1lo, Map map, IOlOo0 iOlOo0, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(1, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 3;
/* 4 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 6 */             this.I00iiO = oolI1lo;
/* 8 */             this.I00iio = map;
/* 10 */            this.I00ilI0I1 = iOlOo0;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iio;
/* 5 */             Object obj2 = this.I00ilI0I1;
/* 7 */             Object obj3 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 90 */                    return new I0l1I01o10I1((I0l1OOl1l10) obj3, this.I00iio, (IlliOIilI) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 74 */                    return new I0l1I01o10I1((OO01Ol) obj3, (OoI0Oii0Ol00) obj, (IlliIl1l11O) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 57 */                    return new I0l1I01o10I1((Oo1o1iil) obj3, (OI110lo) obj, (IIl00I) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 34 */                    Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 40 */                    return new I0l1I01o10I1((OolI1lo) obj3, (Map) obj, (IOlOo0) obj2, iOoil1iiIilo);
                        default:
/* 25 */                    return new I0l1I01o10I1((OolI1lo) obj3, (IIl0oI) obj, (Map) obj2, iOoil1iiIilo, 4);
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                    }
/* 16 */            return ((I0l1I01o10I1) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
                
                    if (p000.lOlo0o.I00000oOI(1500, r11, r10) == r0) goto L39;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             int i2 = 2;
/* 6 */             Object obj2 = this.I00ilI0I1;
/* 8 */             Object obj3 = this.I00iio;
/* 13 */            Object obj4 = this.I00iiO;
/* 15 */            Oi0OO1IIl1 oi0OO1IIl1 = null;
/* 15 */            Object[] objArr = 0;
/* 15 */            Object[] objArr2 = 0;
                    switch (i) {
                        case 0:
/* 251 */                   I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) obj4;
/* 253 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 255 */                   int i3 = this.I00iiI;
/* 257 */                   if (i3 == 0) {
/* 270 */                       lIoii1l01l0i.I00000oOI(obj);
/* 277 */                       ((OIooliIO0) i0l1OOl1l10.I000OOo1O).setValue(obj3);
/* 282 */                       I0l10lIi i0l10lIi = new I0l10lIi(i2);
/* 285 */                       i0l10lIi.I00iiI = i0l1OOl1l10;
/* 287 */                       VarHandle.storeStoreFence();
/* 295 */                       I00oIiI10 i00oIiI10 = new I00oIiI10((IlliOIilI) obj2, i0l1OOl1l10, objArr == true ? 1 : 0, 7);
/* 298 */                       this.I00iiI = 1;
/* 304 */                       if (I0l0lIoOIoIi.I000OOo1O(i0l10lIi, i00oIiI10, this) == ii0111o) {
/* 306 */                           return ii0111o;
                                }
                            } else {
/* 259 */                       if (i3 != 1) {
/* 265 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                            return null;
                                }
/* 261 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 322 */                   if (!((Boolean) ((Function1) i0l1OOl1l10.I00000oIO).invoke(obj3)).booleanValue()) {
/* 361 */                       return ooiIlOl1iI;
                            }
/* 344 */                   ((I0l1I0I0i10I) i0l1OOl1l10.I000o00OoI0I).I00000oIO(i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(obj3), ((OIooO1iiliI) i0l1OOl1l10.I000lI).I000II());
/* 351 */                   ((OIooliIO0) i0l1OOl1l10.I000O01llI0).setValue(obj3);
/* 358 */                   ((OIooliIO0) i0l1OOl1l10.I000II).setValue(obj3);
/* 361 */                   return ooiIlOl1iI;
                        case 1:
/* 215 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 217 */                   int i4 = this.I00iiI;
/* 219 */                   if (i4 == 0) {
/* 232 */                       lIoii1l01l0i.I00000oOI(obj);
/* 241 */                       this.I00iiI = 1;
/* 243 */                       Object objI0000O = ((OO01Ol) obj4).I0000O((OoI0Oii0Ol00) obj3, (IlliIl1l11O) obj2, this);
                                return objI0000O == ii0111o2 ? ii0111o2 : objI0000O;
                            }
/* 221 */                   if (i4 == 1) {
/* 223 */                       lIoii1l01l0i.I00000oOI(obj);
/* 250 */                       return obj;
                            }
/* 227 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                    return null;
                        case 2:
/* 137 */                   IIl00I iIl00I = (IIl00I) obj2;
/* 139 */                   OI110lo oI110lo = (OI110lo) obj3;
/* 141 */                   Oo1o1iil oo1o1iil = (Oo1o1iil) obj4;
/* 143 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 145 */                   int i5 = this.I00iiI;
                            try {
/* 147 */                       if (i5 == 0) {
/* 164 */                           lIoii1l01l0i.I00000oOI(obj);
/* 169 */                           if (oI110lo != OI110lo.I00iiI) {
/* 184 */                               O1iOlO o1iOlO = new O1iOlO((Object) iIl00I, (IOoil1iiIilo) (objArr2 == true ? 1 : 0), 13);
/* 187 */                               this.I00iiI = 2;
                                        break;
                                    } else {
/* 171 */                               this.I00iiI = 1;
/* 177 */                               if (iIl00I.invoke(this) == ii0111o3) {
/* 197 */                                   return ii0111o3;
                                        }
                                    }
                                } else {
/* 149 */                           if (i5 != 1 && i5 != 2) {
/* 159 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                                return null;
                                    }
/* 153 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 201 */                       if (oI110lo == OI110lo.I00iiO) {
/* 206 */                           return ooiIlOl1iI;
                                }
/* 203 */                       oo1o1iil.I00000oIO();
/* 206 */                       return ooiIlOl1iI;
                            } finally {
/* 209 */                       if (oI110lo != OI110lo.I00iiO) {
/* 211 */                           oo1o1iil.I00000oIO();
                                }
                            }
                        case 3:
/* 97 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 99 */                    int i6 = this.I00iiI;
/* 101 */                   if (i6 != 0) {
/* 103 */                       if (i6 == 1) {
/* 105 */                           lIoii1l01l0i.I00000oOI(obj);
/* 136 */                           return obj;
                                }
/* 109 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                        return null;
                            }
/* 114 */                   lIoii1l01l0i.I00000oOI(obj);
/* 125 */                   this.I00iiI = 1;
/* 127 */                   IOi10loi iOi10loi = OolI1lo.I000l1;
/* 129 */                   Object objI00100o1O0lo = ((OolI1lo) obj4).I00100o1O0lo(Ool1iI0OiI.I00iiI, (Map) obj3, (IOlOo0) obj2, this);
                            return objI00100o1O0lo == ii0111o4 ? ii0111o4 : objI00100o1O0lo;
                        default:
/* 19 */                    OolI1lo oolI1lo = (OolI1lo) obj4;
/* 21 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 23 */                    int i7 = this.I00iiI;
/* 25 */                    if (i7 != 0) {
/* 27 */                        if (i7 == 1) {
/* 29 */                            lIoii1l01l0i.I00000oOI(obj);
/* 96 */                            return obj;
                                }
/* 33 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                        return null;
                            }
/* 38 */                    lIoii1l01l0i.I00000oOI(obj);
/* 44 */                    l11I11lO.I0000O(3, "CXCP");
/* 47 */                    LinkedHashMap linkedHashMap = oolI1lo.I000iOII;
/* 49 */                    Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iiO;
/* 53 */                    IOi10loi iOi10loi2 = OolI1lo.I000l1;
/* 60 */                    IIl0lo1oi iIl0lo1oi = new IIl0lo1oi(0);
/* 63 */                    iIl0lo1oi.I0000O((IIl0oI) obj3);
/* 78 */                    linkedHashMap.put(ool1iI0OiI, new Ool1o1l(iIl0lo1oi, new LinkedHashMap((Map) obj2), oi0OO1IIl1, 12));
/* 83 */                    Ool1o1l ool1o1lI000oI1ioi = OolI1lo.I000oI1ioi(oolI1lo.I000iOII);
/* 87 */                    this.I00iiI = 1;
/* 89 */                    Object objI0010I0i = oolI1lo.I0010I0i(ool1o1lI000oI1ioi, null, this);
                            return objI0010I0i == ii0111o5 ? ii0111o5 : objI0010I0i;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public I0l1I01o10I1(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(1, iOoil1iiIilo);
/* 17 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                }
            }

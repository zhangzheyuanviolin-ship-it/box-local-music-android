            package p000;
            
            public final class OIoI0lloOol extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OIoIoIO0oI1O I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OIoI0lloOol(OIoIoIO0oI1O oIoIoIO0oI1O, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oIoIoIO0oI1O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    return new OIoI0lloOol(this.I00iiO, iOoil1iiIilo, 0);
                        case 1:
/* 38 */                    return new OIoI0lloOol(this.I00iiO, iOoil1iiIilo, 1);
                        case 2:
/* 29 */                    return new OIoI0lloOol(this.I00iiO, iOoil1iiIilo, 2);
                        case 3:
/* 20 */                    return new OIoI0lloOol(this.I00iiO, iOoil1iiIilo, 3);
                        default:
/* 11 */                    return new OIoI0lloOol(this.I00iiO, iOoil1iiIilo, 4);
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
/* 18 */            return ((OIoI0lloOol) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0001Ioi1lo;
                    Object objI0001Ioi1lo2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OIoIoIO0oI1O oIoIoIO0oI1O = this.I00iiO;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 199 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 201 */                   int i2 = this.I00iiI;
/* 203 */                   if (i2 != 0) {
/* 205 */                       if (i2 == 1) {
/* 207 */                           lIoii1l01l0i.I00000oOI(obj);
/* 246 */                           return ooiIlOl1iI;
                                }
/* 211 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 216 */                   lIoii1l01l0i.I00000oOI(obj);
/* 219 */                   this.I00iiI = 1;
/* 221 */                   OIoIoilI1 oIoIoilI1 = OIoIol.I00000oIO;
/* 228 */                   if (oIoIoIO0oI1O.I000iOII() - 1 < 0 || (objI0001Ioi1lo = oIoIoIO0oI1O.I0001Ioi1lo(oIoIoIO0oI1O.I000iOII() - 1, iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7), this)) != ii0111o) {
/* 242 */                       objI0001Ioi1lo = ooiIlOl1iI;
                            }
                            return objI0001Ioi1lo == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 147 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 149 */                   int i3 = this.I00iiI;
/* 151 */                   if (i3 != 0) {
/* 153 */                       if (i3 == 1) {
/* 155 */                           lIoii1l01l0i.I00000oOI(obj);
/* 198 */                           return ooiIlOl1iI;
                                }
/* 159 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 164 */                   lIoii1l01l0i.I00000oOI(obj);
/* 167 */                   this.I00iiI = 1;
/* 169 */                   OIoIoilI1 oIoIoilI12 = OIoIol.I00000oIO;
/* 180 */                   if (oIoIoIO0oI1O.I000iOII() + 1 >= oIoIoIO0oI1O.I000o00OoI0I() || (objI0001Ioi1lo2 = oIoIoIO0oI1O.I0001Ioi1lo(oIoIoIO0oI1O.I000iOII() + 1, iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7), this)) != ii0111o2) {
/* 194 */                       objI0001Ioi1lo2 = ooiIlOl1iI;
                            }
                            return objI0001Ioi1lo2 == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 101 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 103 */                   int i4 = this.I00iiI;
/* 105 */                   if (i4 != 0) {
/* 107 */                       if (i4 == 1) {
/* 109 */                           lIoii1l01l0i.I00000oOI(obj);
/* 146 */                           return ooiIlOl1iI;
                                }
/* 113 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 118 */                   lIoii1l01l0i.I00000oOI(obj);
/* 121 */                   this.I00iiI = 1;
/* 123 */                   OI110lo oI110lo = OI110lo.I00iOIl;
/* 129 */                   I01ii1i i01ii1i = new I01ii1i(2, iOoil1iiIilo, 4);
/* 132 */                   oIoIoIO0oI1O.getClass();
/* 135 */                   Object objI00111O = OIoIoIO0oI1O.I00111O(oIoIoIO0oI1O, oI110lo, i01ii1i, this);
/* 139 */                   if (objI00111O != ii0111o3) {
/* 142 */                       objI00111O = ooiIlOl1iI;
                            }
                            return objI00111O == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                        case 3:
/* 57 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 59 */                    int i5 = this.I00iiI;
/* 61 */                    if (i5 != 0) {
/* 63 */                        if (i5 == 1) {
/* 65 */                            lIoii1l01l0i.I00000oOI(obj);
/* 100 */                           return ooiIlOl1iI;
                                }
/* 69 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 74 */                    lIoii1l01l0i.I00000oOI(obj);
/* 77 */                    if (oIoIoIO0oI1O == null) {
/* 100 */                       return ooiIlOl1iI;
                            }
/* 79 */                    this.I00iiI = 1;
/* 89 */                    Object objI00111O2 = OIoIoIO0oI1O.I00111O(oIoIoIO0oI1O, OI110lo.I00iiO, new i0I111I(false, null), this);
/* 93 */                    if (objI00111O2 != ii0111o4) {
/* 96 */                        objI00111O2 = ooiIlOl1iI;
                            }
                            return objI00111O2 == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                        default:
/* 14 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 16 */                    int i6 = this.I00iiI;
/* 18 */                    if (i6 != 0) {
/* 20 */                        if (i6 == 1) {
/* 22 */                            lIoii1l01l0i.I00000oOI(obj);
/* 56 */                            return ooiIlOl1iI;
                                }
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    if (oIoIoIO0oI1O == null) {
/* 56 */                        return ooiIlOl1iI;
                            }
/* 36 */                    this.I00iiI = 1;
/* 45 */                    Object objI00111O3 = OIoIoIO0oI1O.I00111O(oIoIoIO0oI1O, OI110lo.I00iiO, new i0I111I(true, null), this);
/* 49 */                    if (objI00111O3 != ii0111o5) {
/* 52 */                        objI00111O3 = ooiIlOl1iI;
                            }
                            return objI00111O3 == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                    }
                }
            }

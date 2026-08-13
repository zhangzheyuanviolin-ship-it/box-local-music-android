            package p000;
            
            public final class O0lOlIOi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final O0lOll0I0o00 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0lOlIOi(O0lOll0I0o00 o0lOll0I0o00, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = o0lOll0I0o00;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0lOll0I0o00 o0lOll0I0o00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 39 */                    return new O0lOlIOi(o0lOll0I0o00, iOoil1iiIilo, 0);
                        case 1:
/* 32 */                    return new O0lOlIOi(o0lOll0I0o00, iOoil1iiIilo, 1);
                        case 2:
/* 25 */                    return new O0lOlIOi(o0lOll0I0o00, iOoil1iiIilo, 2);
                        case 3:
/* 18 */                    return new O0lOlIOi(o0lOll0I0o00, iOoil1iiIilo, 3);
                        default:
/* 11 */                    return new O0lOlIOi(o0lOll0I0o00, iOoil1iiIilo, 4);
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
/* 18 */            return ((O0lOlIOi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             O0lOll0I0o00 o0lOll0I0o00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 165 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 167 */                   int i2 = this.I00iiI;
/* 169 */                   if (i2 != 0) {
/* 171 */                       if (i2 == 1) {
/* 173 */                           lIoii1l01l0i.I00000oOI(obj);
/* 203 */                           return ooiIlOl1iI;
                                }
/* 177 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 182 */                   lIoii1l01l0i.I00000oOI(obj);
/* 185 */                   I10i01 i10i01 = o0lOll0I0o00.I00100o1O0lo;
/* 191 */                   Float f = new Float(1.0f);
/* 194 */                   this.I00iiI = 1;
                            return i10i01.I0001Ioi1lo(this, f) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 110 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 112 */                   int i3 = this.I00iiI;
/* 116 */                   if (i3 == 0) {
/* 129 */                       lIoii1l01l0i.I00000oOI(obj);
/* 132 */                       I10i01 i10i012 = o0lOll0I0o00.I00100l0;
/* 134 */                       IooO0O iooO0OI00000oIO = IooO0O.I00000oIO(0L);
/* 138 */                       this.I00iiI = 1;
/* 144 */                       if (i10i012.I0001Ioi1lo(this, iooO0OI00000oIO) == ii0111o2) {
/* 146 */                           return ii0111o2;
                                }
                            } else {
/* 118 */                       if (i3 != 1) {
/* 124 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                             return null;
                                }
/* 120 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 154 */                   o0lOll0I0o00.I0010I0i.setValue(IooO0O.I00000oIO(0L));
/* 161 */                   o0lOll0I0o00.I000O01llI0.setValue(Boolean.FALSE);
/* 164 */                   return ooiIlOl1iI;
                        case 2:
/* 78 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 80 */                    int i4 = this.I00iiI;
/* 82 */                    if (i4 == 0) {
/* 95 */                        lIoii1l01l0i.I00000oOI(obj);
/* 98 */                        I10i01 i10i013 = o0lOll0I0o00.I00100l0;
/* 100 */                       this.I00iiI = 1;
                                return i10i013.I000II(this) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                            }
/* 84 */                    if (i4 == 1) {
/* 86 */                        lIoii1l01l0i.I00000oOI(obj);
/* 109 */                       return ooiIlOl1iI;
                            }
/* 90 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 3:
/* 46 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 48 */                    int i5 = this.I00iiI;
/* 50 */                    if (i5 == 0) {
/* 63 */                        lIoii1l01l0i.I00000oOI(obj);
/* 66 */                        I10i01 i10i014 = o0lOll0I0o00.I00100o1O0lo;
/* 68 */                        this.I00iiI = 1;
                                return i10i014.I000II(this) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                            }
/* 52 */                    if (i5 == 1) {
/* 54 */                        lIoii1l01l0i.I00000oOI(obj);
/* 77 */                        return ooiIlOl1iI;
                            }
/* 58 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 16 */                    int i6 = this.I00iiI;
/* 18 */                    if (i6 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        I10i01 i10i015 = o0lOll0I0o00.I00100o1O0lo;
/* 36 */                        this.I00iiI = 1;
                                return i10i015.I000II(this) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                            }
/* 20 */                    if (i6 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        return ooiIlOl1iI;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

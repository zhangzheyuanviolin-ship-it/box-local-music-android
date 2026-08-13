            package p000;
            
            public final class Iol11iOioOi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Iol1I0loo0 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iol11iOioOi(Iol1I0loo0 iol1I0loo0, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iol1I0loo0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Iol1I0loo0 iol1I0loo0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 32 */                    return new Iol11iOioOi(iol1I0loo0, iOoil1iiIilo, 0);
                        case 1:
/* 25 */                    return new Iol11iOioOi(iol1I0loo0, iOoil1iiIilo, 1);
                        case 2:
/* 18 */                    return new Iol11iOioOi(iol1I0loo0, iOoil1iiIilo, 2);
                        default:
/* 11 */                    return new Iol11iOioOi(iol1I0loo0, iOoil1iiIilo, 3);
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
/* 18 */            return ((Iol11iOioOi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Iol1I0loo0 iol1I0loo0 = this.I00iiO;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 151 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 153 */                   int i2 = this.I00iiI;
/* 155 */                   if (i2 == 0) {
/* 167 */                       lIoii1l01l0i.I00000oOI(obj);
/* 171 */                       I10i01 i10i01 = iol1I0loo0.I00olI;
/* 173 */                       if (i10i01 != null) {
/* 175 */                           OloooOlO10oI oloooOlO10oII000iOII = iol1I0loo0.I00ol1;
/* 177 */                           if (oloooOlO10oII000iOII == null) {
/* 197 */                               oloooOlO10oII000iOII = iOloo0O0O.I000iOII(((O1OoiOIi1ooi) iiliIooIliOo.I00000oIO(iol1I0loo0, O1OoilIO.I00000oOI)).I00000oIO, (Oo0lOii10o10) iiliIooIliOo.I00000oIO(iol1I0loo0, Oo0lOio.I00000oIO));
                                    }
/* 210 */                           IOOiio0i iOOiio0iI00000oIO = IOOiio0i.I00000oIO(oloooOlO10oII000iOII.I0000O(iol1I0loo0.I00o101lO, false, iol1I0loo0.I00oO101o));
/* 236 */                           I110IiI0o1Il i110IiI0o1IlI00000oIO = iol1I0loo0.I00o101lO ? l1i1II.I00000oIO(((O1OoiOIi1ooi) iiliIooIliOo.I00000oIO(iol1I0loo0, O1OoilIO.I00000oOI)).I0000O, OI0I0o.I00iio) : iOO01lio0.I00000oOI();
/* 241 */                           this.I00iiI = 1;
/* 247 */                           obj = I10i01.I00000oIO(i10i01, iOOiio0iI00000oIO, i110IiI0o1IlI00000oIO, null, null, this, 12);
/* 251 */                           if (obj == ii0111o) {
/* 253 */                               return ii0111o;
                                    }
                                }
/* 257 */                       return ooiIlOl1iI;
                            }
/* 157 */                   if (i2 != 1) {
/* 163 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 159 */                   lIoii1l01l0i.I00000oOI(obj);
/* 257 */                   return ooiIlOl1iI;
                        case 1:
/* 68 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 70 */                    int i3 = this.I00iiI;
/* 72 */                    if (i3 == 0) {
/* 84 */                        lIoii1l01l0i.I00000oOI(obj);
/* 87 */                        I10i01 i10i012 = iol1I0loo0.I00oliIiO01i;
/* 102 */                       Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO((iol1I0loo0.I00oO101o && iol1I0loo0.I00o101lO) ? iol1I0loo0.I00oII : iol1I0loo0.I00oIiI10);
/* 128 */                       I110IiI0o1Il i110IiI0o1IlI00000oIO2 = iol1I0loo0.I00o101lO ? l1i1II.I00000oIO(((O1OoiOIi1ooi) iiliIooIliOo.I00000oIO(iol1I0loo0, O1OoilIO.I00000oOI)).I0000O, OI0I0o.I00iiI) : iOO01lio0.I00000oOI();
/* 133 */                       this.I00iiI = 1;
/* 144 */                       if (I10i01.I00000oIO(i10i012, iil1010OI00000oIO, i110IiI0o1IlI00000oIO2, null, null, this, 12) == ii0111o2) {
/* 146 */                           return ii0111o2;
                                }
                            } else {
/* 74 */                        if (i3 != 1) {
/* 80 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 76 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 148 */                   return ooiIlOl1iI;
                        case 2:
/* 41 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 43 */                    int i4 = this.I00iiI;
/* 45 */                    if (i4 == 0) {
/* 58 */                        lIoii1l01l0i.I00000oOI(obj);
/* 61 */                        this.I00iiI = 1;
/* 63 */                        iol1I0loo0.I010oio1OO0(this);
/* 66 */                        return ii0111o3;
                            }
/* 47 */                    if (i4 == 1) {
/* 49 */                        lIoii1l01l0i.I00000oOI(obj);
/* 52 */                        return ooiIlOl1iI;
                            }
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 16 */                    int i5 = this.I00iiI;
/* 18 */                    if (i5 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        this.I00iiI = 1;
/* 36 */                        iol1I0loo0.I010oio1OO0(this);
/* 39 */                        return ii0111o4;
                            }
/* 20 */                    if (i5 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 25 */                        return ooiIlOl1iI;
                            }
/* 27 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                    }
                }
            }

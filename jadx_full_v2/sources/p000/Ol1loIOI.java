            package p000;
            
            public final class Ol1loIOI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final IlliIl1l11O I00iio;
                public final OI10i0Il I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol1loIOI(IlliIl1l11O illiIl1l11O, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = illiIl1l11O;
/* 5 */             this.I00ilI0I1 = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    Ol1loIOI ol1loIOI = new Ol1loIOI(this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
/* 29 */                    ol1loIOI.I00iiO = obj;
/* 31 */                    return ol1loIOI;
                        default:
/* 13 */                    Ol1loIOI ol1loIOI2 = new Ol1loIOI(this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
/* 16 */                    ol1loIOI2.I00iiO = obj;
/* 18 */                    return ol1loIOI2;
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
/* 18 */            return ((Ol1loIOI) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 7 */             IlliIl1l11O illiIl1l11O = this.I00iio;
                    switch (i) {
                        case 0:
/* 59 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 61 */                    int i2 = this.I00iiI;
/* 63 */                    if (i2 == 0) {
/* 76 */                        lIoii1l01l0i.I00000oOI(obj);
/* 89 */                        OOIoIlO oOIoIlO = new OOIoIlO(oI10i0Il, ((Ii0110) this.I00iiO).I00000oIO());
/* 92 */                        this.I00iiI = 1;
                                return illiIl1l11O.invoke(oOIoIlO, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 65 */                    if (i2 == 1) {
/* 67 */                        lIoii1l01l0i.I00000oOI(obj);
/* 101 */                       return ooiIlOl1iI;
                            }
/* 71 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 20 */                    if (i3 == 0) {
/* 33 */                        lIoii1l01l0i.I00000oOI(obj);
/* 46 */                        OOIoIlO oOIoIlO2 = new OOIoIlO(oI10i0Il, ((Ii0110) this.I00iiO).I00000oIO());
/* 49 */                        this.I00iiI = 1;
                                return illiIl1l11O.invoke(oOIoIlO2, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 22 */                    if (i3 == 1) {
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
/* 58 */                        return ooiIlOl1iI;
                            }
/* 28 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                    }
                }
            }

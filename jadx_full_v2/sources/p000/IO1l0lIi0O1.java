            package p000;
            
            public final class IO1l0lIi0O1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final O1oOil I00iiI;
                public final OI10i0Il I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1l0lIi0O1(O1oOil o1oOil, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = o1oOil;
/* 5 */             this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    return new IO1l0lIi0O1(this.I00iiI, this.I00iiO, iOoil1iiIilo, 0);
                        case 1:
/* 24 */                    return new IO1l0lIi0O1(this.I00iiI, this.I00iiO, iOoil1iiIilo, 1);
                        default:
/* 13 */                    return new IO1l0lIi0O1(this.I00iiI, this.I00iiO, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 38 */                    ((IO1l0lIi0O1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 28 */                    ((IO1l0lIi0O1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((IO1l0lIi0O1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             O1oOil o1oOil = this.I00iiI;
/* 10 */            OI10i0Il oI10i0Il = this.I00iiO;
                    switch (i) {
                        case 0:
/* 61 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 63 */                    lIoii1l01l0i.I00000oOI(obj);
/* 79 */                    oI10i0Il.setValue(Boolean.valueOf((o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iio));
                            break;
                        case 1:
/* 37 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    boolean z = (o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iio;
/* 51 */                    Ii0i0o1lliO1 ii0i0o1lliO1 = Ilo1IoOo.I00000oIO;
/* 57 */                    oI10i0Il.setValue(Boolean.valueOf(z));
                            break;
                        default:
/* 15 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 33 */                    oI10i0Il.setValue(Boolean.valueOf((o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iio));
                            break;
                    }
/* 36 */            return ooiIlOl1iI;
                }
            }

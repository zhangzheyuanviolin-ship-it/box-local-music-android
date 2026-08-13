            package p000;
            
            public final class IO1l1I0IiiOo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final OI10i0Il I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1l1I0IiiOo(OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    return new IO1l1I0IiiOo(this.I00iiI, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new IO1l1I0IiiOo(this.I00iiI, iOoil1iiIilo, 1);
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
/* 28 */                    ((IO1l1I0IiiOo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((IO1l1I0IiiOo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 23 */                    lIoii1l01l0i.I00000oOI(obj);
/* 28 */                    oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        default:
/* 10 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 12 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    oI10i0Il.setValue("");
                            break;
                    }
/* 20 */            return ooiIlOl1iI;
                }
            }

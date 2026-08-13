            package p000;
            
            public final class Ii1l1I1l1ii1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1l1I1l1ii1(int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
/* 9 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i2;
                    switch (i2) {
                        case 1:
/* 13 */                    super(i, iOoil1iiIilo);
                            break;
                        default:
/* 6 */                     this.I00iiI = i;
                            break;
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    Ii1l1I1l1ii1 ii1l1I1l1ii1 = new Ii1l1I1l1ii1(this.I00iiI, iOoil1iiIilo, 0);
/* 24 */                    ii1l1I1l1ii1.I00iiO = obj;
/* 26 */                    return ii1l1I1l1ii1;
                        default:
/* 10 */                    Ii1l1I1l1ii1 ii1l1I1l1ii12 = new Ii1l1I1l1ii1(2, iOoil1iiIilo, 1);
/* 13 */                    ii1l1I1l1ii12.I00iiO = obj;
/* 15 */                    return ii1l1I1l1ii12;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((Ii1l1I1l1ii1) create((II00iIliI0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((Ii1l1I1l1ii1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    switch (this.I00iOIl) {
                        case 0:
/* 79 */                    II00iIliI0 iI00iIliI0 = (II00iIliI0) this.I00iiO;
/* 81 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 83 */                    lIoii1l01l0i.I00000oOI(obj);
/* 90 */                    II00i0I1io iI00i0I1io = (II00i0I1io) iI00iIliI0.I00100o1O0lo();
/* 92 */                    int i = this.I00iiI;
/* 94 */                    iI00i0I1io.I0000O();
/* 101 */                   ((II00iIliI0) iI00i0I1io.I00iiI).I001IO000(i);
/* 108 */                   return (II00iIliI0) iI00i0I1io.I00000oOI();
                        default:
/* 6 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 8 */                     int i2 = this.I00iiI;
/* 11 */                    if (i2 == 0) {
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
/* 35 */                        ii0110 = (Ii0110) this.I00iiO;
                            } else {
/* 13 */                        if (i2 != 1) {
/* 25 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 28 */                            return null;
                                }
/* 17 */                        ii0110 = (Ii0110) this.I00iiO;
/* 19 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 46 */                    while (l01oO1iOo.I000II(ii0110.I00000oIO())) {
/* 52 */                        OI1lOo oI1lOo = new OI1lOo(9);
/* 55 */                        this.I00iiO = ii0110;
/* 57 */                        this.I00iiI = 1;
/* 71 */                        if (l1i0lii.I00000oIO(getContext()).I00000oIO(this, oI1lOo) == ii0111o2) {
/* 76 */                            return ii0111o2;
                                }
                            }
/* 74 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

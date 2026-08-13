            package p000;
            
            public final class IIlooo0I0iO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IIo000I0ilI I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIlooo0I0iO(IIo000I0ilI iIo000I0ilI, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iIo000I0ilI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIo000I0ilI iIo000I0ilI = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new IIlooo0I0iO(iIo000I0ilI, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new IIlooo0I0iO(iIo000I0ilI, iOoil1iiIilo, 1);
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
/* 18 */            return ((IIlooo0I0iO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIo000I0ilI iIo000I0ilI = this.I00iiO;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 50 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 52 */                    int i2 = this.I00iiI;
/* 54 */                    if (i2 == 0) {
/* 66 */                        lIoii1l01l0i.I00000oOI(obj);
/* 69 */                        O010OIi o010OIi = iIo000I0ilI.I00000oIO;
/* 71 */                        this.I00iiI = 1;
/* 77 */                        if (l01oO1iOo.I0000Il00O(o010OIi, this) == ii0111o) {
/* 79 */                            return ii0111o;
                                }
                            } else {
/* 56 */                        if (i2 != 1) {
/* 62 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 58 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 81 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i3 = this.I00iiI;
/* 16 */                    if (i3 != 0) {
/* 18 */                        if (i3 == 1) {
/* 20 */                            lIoii1l01l0i.I00000oOI(obj);
/* 49 */                            return obj;
                                }
/* 24 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 35 */                    IIlooo0I0iO iIlooo0I0iO = new IIlooo0I0iO(iIo000I0ilI, iOoil1iiIilo, 0);
/* 38 */                    this.I00iiI = 1;
/* 42 */                    Object objI0000Il00O = lOlo0o.I0000Il00O(3000L, iIlooo0I0iO, this);
                            return objI0000Il00O == ii0111o2 ? ii0111o2 : objI0000Il00O;
                    }
                }
            }

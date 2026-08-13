            package p000;
            
            public final class IO0II0ilO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IO0Il0o1OI I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO0II0ilO(IO0Il0o1OI iO0Il0o1OI, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iO0Il0o1OI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IO0Il0o1OI iO0Il0o1OI = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new IO0II0ilO(iO0Il0o1OI, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new IO0II0ilO(iO0Il0o1OI, iOoil1iiIilo, 1);
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
/* 18 */            return ((IO0II0ilO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IO0Il0o1OI iO0Il0o1OI = this.I00iiO;
                    switch (i) {
                        case 0:
/* 44 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 46 */                    int i2 = this.I00iiI;
/* 48 */                    if (i2 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        this.I00iiI = 1;
                                return iO0Il0o1OI.I000l1(this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 50 */                    if (i2 == 1) {
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
/* 73 */                        return ooiIlOl1iI;
                            }
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        this.I00iiI = 1;
                                return iO0Il0o1OI.I000l1(this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 20 */                    if (i3 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 43 */                        return ooiIlOl1iI;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

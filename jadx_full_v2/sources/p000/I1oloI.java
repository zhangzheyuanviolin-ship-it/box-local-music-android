            package p000;
            
            public final class I1oloI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Oo1o1iil I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1oloI(Oo1o1iil oo1o1iil, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oo1o1iil;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    return new I1oloI(this.I00iiO, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new I1oloI(this.I00iiO, iOoil1iiIilo, 1);
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
/* 18 */            return ((I1oloI) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oo1o1iil oo1o1iil = this.I00iiO;
                    switch (i) {
                        case 0:
/* 46 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 48 */                    int i2 = this.I00iiI;
/* 50 */                    if (i2 == 0) {
/* 63 */                        lIoii1l01l0i.I00000oOI(obj);
/* 66 */                        this.I00iiI = 1;
                                return oo1o1iil.I0000Il00O(OI110lo.I00iOIl, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 52 */                    if (i2 == 1) {
/* 54 */                        lIoii1l01l0i.I00000oOI(obj);
/* 77 */                        return ooiIlOl1iI;
                            }
/* 58 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        OI110lo oI110lo = OI110lo.I00iiI;
/* 36 */                        this.I00iiI = 1;
                                return oo1o1iil.I0000Il00O(oI110lo, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 20 */                    if (i3 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        return ooiIlOl1iI;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

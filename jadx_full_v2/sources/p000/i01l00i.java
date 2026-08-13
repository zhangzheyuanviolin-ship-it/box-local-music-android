            package p000;
            
            public final class i01l00i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final i01l0IiO I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i01l00i(i01l0IiO i01l0iio, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i01l0iio;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i01l0IiO i01l0iio = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new i01l00i(i01l0iio, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new i01l00i(i01l0iio, iOoil1iiIilo, 1);
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
/* 18 */            return ((i01l00i) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i01l0IiO i01l0iio = this.I00iiO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 52 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 54 */                    int i2 = this.I00iiI;
/* 56 */                    if (i2 == 0) {
/* 69 */                        lIoii1l01l0i.I00000oOI(obj);
/* 72 */                        I0lio1O01i01 i0lio1O01i01 = i01l0iio.I00iOIl;
/* 74 */                        this.I00iiI = 1;
/* 78 */                        Object objI000II = i0lio1O01i01.I00ol1.I000II(this);
/* 82 */                        if (objI000II != ii0111o) {
/* 85 */                            objI000II = ooiIlOl1iI;
                                }
/* 86 */                        if (objI000II == ii0111o) {
/* 88 */                            return ii0111o;
                                }
                            } else {
/* 58 */                        if (i2 != 1) {
/* 65 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 60 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 63 */                    return ooiIlOl1iI;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        I0lio1O01i01 i0lio1O01i012 = i01l0iio.I00iOIl;
/* 36 */                        this.I00iiI = 1;
/* 40 */                        Object objI00000oIO = i0lio1O01i012.I00olI.I00000oIO(this);
/* 44 */                        if (objI00000oIO != ii0111o2) {
/* 47 */                            objI00000oIO = ooiIlOl1iI;
                                }
/* 48 */                        if (objI00000oIO == ii0111o2) {
/* 50 */                            return ii0111o2;
                                }
                            } else {
/* 20 */                        if (i3 != 1) {
/* 27 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 25 */                    return ooiIlOl1iI;
                    }
                }
            }

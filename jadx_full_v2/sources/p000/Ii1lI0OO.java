            package p000;
            
            public final class Ii1lI0OO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ii1liIllli0 I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lI0OO(Ii1liIllli0 ii1liIllli0, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ii1liIllli0;
/* 5 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iio;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new Ii1lI0OO(ii1liIllli0, str, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new Ii1lI0OO(ii1liIllli0, str, iOoil1iiIilo, 1);
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
/* 18 */            return ((Ii1lI0OO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iio;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 60 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 62 */                    int i2 = this.I00iiI;
/* 64 */                    if (i2 != 0) {
/* 66 */                        if (i2 == 1) {
/* 68 */                            lIoii1l01l0i.I00000oOI(obj);
/* 97 */                            return obj;
                                }
/* 72 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 77 */                    lIoii1l01l0i.I00000oOI(obj);
/* 80 */                    Ii1I1ooo10O0 ii1I1ooo10O0 = ii1liIllli0.I0000O;
/* 85 */                    Ii1l1iio0lO0 ii1l1iio0lO0 = new Ii1l1iio0lO0(str, 0, null);
/* 88 */                    this.I00iiI = 1;
/* 90 */                    Object objI00000oIO = ii1I1ooo10O0.I00000oIO(ii1l1iio0lO0, this);
                            return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
/* 35 */                        IlOil1ii data = ii1liIllli0.I00000oOI.getData();
/* 39 */                        this.I00iiI = 1;
/* 41 */                        obj = ilOoO00.I00000oIO(data, this);
/* 45 */                        if (obj == ii0111o2) {
/* 47 */                            return ii0111o2;
                                }
                            } else {
/* 20 */                        if (i3 != 1) {
/* 26 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 55 */                    return ((Ooli101Iii1) obj).I001IIilI0O().get(str);
                    }
                }
            }

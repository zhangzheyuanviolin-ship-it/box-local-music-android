            package p000;

            import java.util.ArrayList;
            
            public final class Ii1lOii extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ii1liIllli0 I00iiO;
                public final ArrayList I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lOii(Ii1liIllli0 ii1liIllli0, ArrayList arrayList, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ii1liIllli0;
/* 5 */             this.I00iio = arrayList;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             ArrayList arrayList = this.I00iio;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new Ii1lOii(ii1liIllli0, arrayList, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new Ii1lOii(ii1liIllli0, arrayList, iOoil1iiIilo, 1);
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
/* 18 */            return ((Ii1lOii) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             ArrayList arrayList = this.I00iio;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 51 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 53 */                    int i2 = this.I00iiI;
/* 55 */                    if (i2 != 0) {
/* 57 */                        if (i2 == 1) {
/* 59 */                            lIoii1l01l0i.I00000oOI(obj);
/* 88 */                            return obj;
                                }
/* 63 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 68 */                    lIoii1l01l0i.I00000oOI(obj);
/* 71 */                    Ii1I1ooo10O0 ii1I1ooo10O0 = ii1liIllli0.I00000oIO;
/* 76 */                    Ii1lO0 ii1lO0 = new Ii1lO0(arrayList, null, 0);
/* 79 */                    this.I00iiI = 1;
/* 81 */                    Object objI00000oIO = ii1I1ooo10O0.I00000oIO(ii1lO0, this);
                            return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 != 0) {
/* 20 */                        if (i3 == 1) {
/* 22 */                            lIoii1l01l0i.I00000oOI(obj);
/* 50 */                            return obj;
                                }
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    Ii1I1ooo10O0 ii1I1ooo10O02 = ii1liIllli0.I0000O;
/* 38 */                    Ii1lO0 ii1lO02 = new Ii1lO0(arrayList, null, 1);
/* 41 */                    this.I00iiI = 1;
/* 43 */                    Object objI00000oIO2 = ii1I1ooo10O02.I00000oIO(ii1lO02, this);
                            return objI00000oIO2 == ii0111o2 ? ii0111o2 : objI00000oIO2;
                    }
                }
            }

            package p000;
            
            public final class I1oo1O1IOO1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final OO1io0l0 I00iio;
                public final Oo1o1iil I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1oo1O1IOO1(OO1io0l0 oO1io0l0, Oo1o1iil oo1o1iil, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = oO1io0l0;
/* 5 */             this.I00ilI0I1 = oo1o1iil;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    I1oo1O1IOO1 i1oo1O1IOO1 = new I1oo1O1IOO1(this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
/* 29 */                    i1oo1O1IOO1.I00iiO = obj;
/* 31 */                    return i1oo1O1IOO1;
                        default:
/* 13 */                    I1oo1O1IOO1 i1oo1O1IOO12 = new I1oo1O1IOO1(this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
/* 16 */                    i1oo1O1IOO12.I00iiO = obj;
/* 18 */                    return i1oo1O1IOO12;
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
/* 18 */            return ((I1oo1O1IOO1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oo1o1iil oo1o1iil = this.I00ilI0I1;
/* 7 */             OO1io0l0 oO1io0l0 = this.I00iio;
                    switch (i) {
                        case 0:
/* 57 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 59 */                    int i2 = this.I00iiI;
/* 61 */                    if (i2 == 0) {
/* 74 */                        lIoii1l01l0i.I00000oOI(obj);
/* 83 */                        I1oo1IiiOIo i1oo1IiiOIo = new I1oo1IiiOIo((Ii0110) this.I00iiO, oo1o1iil, null);
/* 86 */                        this.I00iiI = 1;
                                return ililI0.I0000Il00O(oO1io0l0, i1oo1IiiOIo, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 63 */                    if (i2 == 1) {
/* 65 */                        lIoii1l01l0i.I00000oOI(obj);
/* 95 */                        return ooiIlOl1iI;
                            }
/* 69 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                    return null;
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 20 */                    if (i3 == 0) {
/* 33 */                        lIoii1l01l0i.I00000oOI(obj);
/* 42 */                        I1ooIlOiO0iI i1ooIlOiO0iI = new I1ooIlOiO0iI((Ii0110) this.I00iiO, oo1o1iil, (IOoil1iiIilo) null);
/* 45 */                        this.I00iiI = 1;
                                return ((Oll1OII0o) oO1io0l0).I010l1O(i1ooIlOiO0iI, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 22 */                    if (i3 == 1) {
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
/* 56 */                        return ooiIlOl1iI;
                            }
/* 28 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                    return null;
                    }
                }
            }

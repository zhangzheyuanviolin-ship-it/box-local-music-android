            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class Olo1oli extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Function3 I00iiO;
                public final OOIII0OOoOi1 I00iio;
                public final OO1il00lI I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Olo1oli(Function3 function3, OOIII0OOoOi1 oOIII0OOoOi1, OO1il00lI oO1il00lI, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = function3;
/* 5 */             this.I00iio = oOIII0OOoOi1;
/* 7 */             this.I00ilI0I1 = oO1il00lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new Olo1oli(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new Olo1oli(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
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
/* 18 */            return ((Olo1oli) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OO1il00lI oO1il00lI = this.I00ilI0I1;
/* 7 */             OOIII0OOoOi1 oOIII0OOoOi1 = this.I00iio;
/* 9 */             Function3 function3 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 54 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 56 */                    int i2 = this.I00iiI;
/* 58 */                    if (i2 == 0) {
/* 71 */                        lIoii1l01l0i.I00000oOI(obj);
/* 76 */                        OIOlIiiioi oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO(oO1il00lI.I0000Il00O);
/* 80 */                        this.I00iiI = 1;
                                return function3.invoke(oOIII0OOoOi1, oIOlIiiioiI00000oIO, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 60 */                    if (i2 == 1) {
/* 62 */                        lIoii1l01l0i.I00000oOI(obj);
/* 89 */                        return ooiIlOl1iI;
                            }
/* 66 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                    return null;
                        default:
/* 18 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 20 */                    int i3 = this.I00iiI;
/* 22 */                    if (i3 == 0) {
/* 35 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        OIOlIiiioi oIOlIiiioiI00000oIO2 = OIOlIiiioi.I00000oIO(oO1il00lI.I0000Il00O);
/* 44 */                        this.I00iiI = 1;
                                return function3.invoke(oOIII0OOoOi1, oIOlIiiioiI00000oIO2, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 24 */                    if (i3 == 1) {
/* 26 */                        lIoii1l01l0i.I00000oOI(obj);
/* 53 */                        return ooiIlOl1iI;
                            }
/* 30 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                    return null;
                    }
                }
            }

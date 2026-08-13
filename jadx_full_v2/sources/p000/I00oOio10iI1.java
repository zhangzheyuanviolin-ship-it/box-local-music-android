            package p000;
            
/* 11 */    public final class I00oOio10iI1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OI0lOIiOIOOo I00iiO;
                public final OOIII1oOoolO I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00oOio10iI1(OOIII1oOoolO oOIII1oOoolO, OI0lOIiOIOOo oI0lOIiOIOOo, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 0;
/* 4 */             this.I00iio = oOIII1oOoolO;
/* 6 */             this.I00iiO = oI0lOIiOIOOo;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OOIII1oOoolO oOIII1oOoolO = this.I00iio;
/* 5 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iiO;
                    switch (i) {
                        case 0:
/* 26 */                    return new I00oOio10iI1(oOIII1oOoolO, oI0lOIiOIOOo, iOoil1iiIilo);
                        case 1:
/* 20 */                    return new I00oOio10iI1(oI0lOIiOIOOo, oOIII1oOoolO, iOoil1iiIilo, 1);
                        default:
/* 13 */                    return new I00oOio10iI1(oI0lOIiOIOOo, oOIII1oOoolO, iOoil1iiIilo, 2);
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
/* 18 */            return ((I00oOio10iI1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OOIII1oOoolO oOIII1oOoolO = this.I00iio;
/* 7 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iiO;
                    switch (i) {
                        case 0:
/* 76 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 78 */                    int i2 = this.I00iiI;
/* 80 */                    if (i2 == 0) {
/* 93 */                        lIoii1l01l0i.I00000oOI(obj);
/* 98 */                        OOIIIiOOili oOIIIiOOili = new OOIIIiOOili(oOIII1oOoolO);
/* 101 */                       this.I00iiI = 1;
                                return oI0lOIiOIOOo.I00000oIO(oOIIIiOOili, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 82 */                    if (i2 == 1) {
/* 84 */                        lIoii1l01l0i.I00000oOI(obj);
/* 110 */                       return ooiIlOl1iI;
                            }
/* 88 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        case 1:
/* 46 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 48 */                    int i3 = this.I00iiI;
/* 50 */                    if (i3 == 0) {
/* 63 */                        lIoii1l01l0i.I00000oOI(obj);
/* 66 */                        this.I00iiI = 1;
                                return oI0lOIiOIOOo.I00000oIO(oOIII1oOoolO, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 52 */                    if (i3 == 1) {
/* 54 */                        lIoii1l01l0i.I00000oOI(obj);
/* 75 */                        return ooiIlOl1iI;
                            }
/* 58 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        default:
/* 16 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 18 */                    int i4 = this.I00iiI;
/* 20 */                    if (i4 == 0) {
/* 33 */                        lIoii1l01l0i.I00000oOI(obj);
/* 36 */                        this.I00iiI = 1;
                                return oI0lOIiOIOOo.I00000oIO(oOIII1oOoolO, this) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                            }
/* 22 */                    if (i4 == 1) {
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        return ooiIlOl1iI;
                            }
/* 28 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public I00oOio10iI1(OI0lOIiOIOOo oI0lOIiOIOOo, OOIII1oOoolO oOIII1oOoolO, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00iOIl = i;
                    this.I00iiO = oI0lOIiOIOOo;
                    this.I00iio = oOIII1oOoolO;
                }
            }

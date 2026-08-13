            package p000;
            
            public final class I0O0io1loiOO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol1OlloIO I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0O0io1loiOO(Ol1OlloIO ol1OlloIO, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol1OlloIO;
/* 5 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return new I0O0io1loiOO(this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new I0O0io1loiOO(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
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
/* 18 */            return ((I0O0io1loiOO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             String str = this.I00iio;
/* 8 */             Ol1OlloIO ol1OlloIO = this.I00iiO;
                    switch (i) {
                        case 0:
/* 49 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 51 */                    int i2 = this.I00iiI;
/* 53 */                    if (i2 == 0) {
/* 66 */                        lIoii1l01l0i.I00000oOI(obj);
/* 69 */                        Ol1OIo0O0O0l ol1OIo0O0O0l = Ol1OIo0O0O0l.I00iOIl;
/* 71 */                        this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, str, this, 2) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 55 */                    if (i2 == 1) {
/* 57 */                        lIoii1l01l0i.I00000oOI(obj);
/* 80 */                        return ooiIlOl1iI;
                            }
/* 61 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                    return null;
                        default:
/* 17 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 19 */                    int i3 = this.I00iiI;
/* 21 */                    if (i3 == 0) {
/* 34 */                        lIoii1l01l0i.I00000oOI(obj);
/* 37 */                        Ol1OIo0O0O0l ol1OIo0O0O0l2 = Ol1OIo0O0O0l.I00iOIl;
/* 39 */                        this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, str, this, 2) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 23 */                    if (i3 == 1) {
/* 25 */                        lIoii1l01l0i.I00000oOI(obj);
/* 48 */                        return ooiIlOl1iI;
                            }
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                    return null;
                    }
                }
            }

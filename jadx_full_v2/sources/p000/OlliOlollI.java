            package p000;
            
            public final class OlliOlollI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final I10i01 I00iiO;
                public final float I00iio;
                public final Ollii0ii0lOl I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlliOlollI(I10i01 i10i01, float f, Ollii0ii0lOl ollii0ii0lOl, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i10i01;
/* 5 */             this.I00iio = f;
/* 7 */             this.I00ilI0I1 = ollii0ii0lOl;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new OlliOlollI(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new OlliOlollI(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
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
/* 18 */            return ((OlliOlollI) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ollii0ii0lOl ollii0ii0lOl = this.I00ilI0I1;
/* 7 */             float f = this.I00iio;
                    switch (i) {
                        case 0:
/* 60 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 62 */                    int i2 = this.I00iiI;
/* 64 */                    if (i2 != 0) {
/* 66 */                        if (i2 == 1) {
/* 68 */                            lIoii1l01l0i.I00000oOI(obj);
/* 103 */                           return ooiIlOl1iI;
                                }
/* 72 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 77 */                    lIoii1l01l0i.I00000oOI(obj);
/* 80 */                    Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 84 */                    IlIoO1ilo1 ilIoO1ilo1 = ollii0ii0lOl.I00oI0i;
/* 86 */                    this.I00iiI = 1;
                            return I10i01.I00000oIO(this.I00iiO, iil1010OI00000oIO, ilIoO1ilo1, null, null, this, 12) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 20 */                    if (i3 != 0) {
/* 22 */                        if (i3 == 1) {
/* 24 */                            lIoii1l01l0i.I00000oOI(obj);
/* 59 */                            return ooiIlOl1iI;
                                }
/* 28 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(f);
/* 40 */                    IlIoO1ilo1 ilIoO1ilo12 = ollii0ii0lOl.I00oI0i;
/* 42 */                    this.I00iiI = 1;
                            return I10i01.I00000oIO(this.I00iiO, iil1010OI00000oIO2, ilIoO1ilo12, null, null, this, 12) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                    }
                }
            }

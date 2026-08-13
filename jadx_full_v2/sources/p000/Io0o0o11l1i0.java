            package p000;
            
            public final class Io0o0o11l1i0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final I0oiil10Ili I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Io0o0o11l1i0(I0oiil10Ili i0oiil10Ili, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i0oiil10Ili;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    return new Io0o0o11l1i0(this.I00iiO, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new Io0o0o11l1i0(this.I00iiO, iOoil1iiIilo, 1);
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
/* 18 */            return ((Io0o0o11l1i0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I0oiil10Ili i0oiil10Ili = this.I00iiO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 44 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 46 */                    int i2 = this.I00iiI;
/* 48 */                    if (i2 == 0) {
/* 60 */                        lIoii1l01l0i.I00000oOI(obj);
/* 63 */                        this.I00iiI = 1;
/* 65 */                        i0oiil10Ili.I001lllioOl();
/* 68 */                        if (ooiIlOl1iI == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 56 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
                            break;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
/* 33 */                        this.I00iiI = 1;
/* 35 */                        i0oiil10Ili.I001lllioOl();
/* 38 */                        if (ooiIlOl1iI == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
                            break;
                    }
/* 42 */            return ooiIlOl1iI;
                }
            }

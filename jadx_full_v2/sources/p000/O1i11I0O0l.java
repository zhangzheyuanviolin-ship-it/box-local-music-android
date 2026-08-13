            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O1i11I0O0l extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol010000lo00 I00iiO;
                public final Function1 I00iio;
                public final O1i1O1I I00ilI0I1;
                public final OI10i0Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1i11I0O0l(Ol010000lo00 ol010000lo00, Function1 function1, O1i1O1I o1i1O1I, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol010000lo00;
/* 5 */             this.I00iio = function1;
/* 7 */             this.I00ilI0I1 = o1i1O1I;
/* 9 */             this.I00ilO0 = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    return new O1i11I0O0l(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 0);
                        default:
/* 18 */                    return new O1i11I0O0l(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 1);
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
/* 18 */            return ((O1i11I0O0l) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             O1i1O1I o1i1O1I = this.I00ilI0I1;
/* 7 */             OI10i0Il oI10i0Il = this.I00ilO0;
/* 9 */             Function1 function1 = this.I00iio;
/* 11 */            Ol010000lo00 ol010000lo00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 73 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 75 */                    int i2 = this.I00iiI;
/* 77 */                    if (i2 == 0) {
/* 90 */                        lIoii1l01l0i.I00000oOI(obj);
/* 93 */                        this.I00iiI = 1;
/* 99 */                        if (ol010000lo00.I0000O(this) == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 85 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 81 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 122 */                   function1.invoke(Boolean.valueOf(!O0000Ioio00.I0000O((String) oI10i0Il.getValue(), o1i1O1I.I000II())));
                            break;
                        default:
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    int i3 = this.I00iiI;
/* 24 */                    if (i3 == 0) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        this.I00iiI = 1;
/* 46 */                        if (ol010000lo00.I0000O(this) == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 69 */                    function1.invoke(Boolean.valueOf(!O0000Ioio00.I0000O((String) oI10i0Il.getValue(), o1i1O1I.I000II())));
                            break;
                    }
/* 72 */            return ooiIlOl1iI;
                }
            }

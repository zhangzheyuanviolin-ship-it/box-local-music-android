            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public final class IO000lo0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public IIiOOI I00iiI;
                public int I00iiO;
                public final IIiOOI I00iio;
                public final IO01o11o0lI0 I00ilI0I1;
                public final int I00ilO0;
                public final int I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO000lo0(IIiOOI iIiOOI, IOoil1iiIilo iOoil1iiIilo, IO01o11o0lI0 iO01o11o0lI0, int i, int i2, int i3) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i3;
/* 3 */             this.I00iio = iIiOOI;
/* 5 */             this.I00ilI0I1 = iO01o11o0lI0;
/* 7 */             this.I00ilO0 = i;
/* 9 */             this.I00io1l = i2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    return new IO000lo0(this.I00iio, iOoil1iiIilo, this.I00ilI0I1, this.I00ilO0, this.I00io1l, 0);
                        default:
/* 18 */                    return new IO000lo0(this.I00iio, iOoil1iiIilo, this.I00ilI0I1, this.I00ilO0, this.I00io1l, 1);
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
/* 18 */            return ((IO000lo0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IIiOOI iIiOOI;
                    IO000lo0 iO000lo0;
                    IIiOOI iIiOOI2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IIiOOI iIiOOI3 = this.I00iio;
                    switch (i) {
                        case 0:
/* 92 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 94 */                    int i2 = this.I00iiO;
/* 96 */                    if (i2 == 0) {
/* 119 */                       lIoii1l01l0i.I00000oOI(obj);
/* 124 */                       List listSingletonList = Collections.singletonList(IIooOO1o.I00iiO);
/* 128 */                       this.I00iiI = iIiOOI3;
/* 130 */                       this.I00iiO = 1;
/* 140 */                       obj = this.I00ilI0I1.I000O01llI0(listSingletonList, this.I00ilO0, this.I00io1l, 1, null, this);
/* 144 */                       if (obj != ii0111o) {
                                }
                                break;
                            } else if (i2 == 1) {
/* 113 */                       iIiOOI3 = this.I00iiI;
/* 115 */                       lIoii1l01l0i.I00000oOI(obj);
                            } else if (i2 != 2) {
/* 108 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 102 */                       iIiOOI = this.I00iiI;
/* 104 */                       lIoii1l01l0i.I00000oOI(obj);
/* 162 */                       iIiOOI.I00000oOI(null);
                                break;
                            }
/* 149 */                   this.I00iiI = iIiOOI3;
/* 151 */                   this.I00iiO = 2;
/* 157 */                   if (iOOlOiI.I00000oOI((Collection) obj, this) != ii0111o) {
/* 161 */                       iIiOOI = iIiOOI3;
/* 162 */                       iIiOOI.I00000oOI(null);
                            }
                        default:
/* 15 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 17 */                    int i3 = this.I00iiO;
/* 19 */                    if (i3 == 0) {
/* 43 */                        lIoii1l01l0i.I00000oOI(obj);
/* 48 */                        List listSingletonList2 = Collections.singletonList(IIooOO1o.I00iOIl);
/* 52 */                        this.I00iiI = iIiOOI3;
/* 54 */                        this.I00iiO = 1;
/* 64 */                        iO000lo0 = this;
/* 65 */                        obj = this.I00ilI0I1.I000O01llI0(listSingletonList2, this.I00ilO0, this.I00io1l, 1, null, iO000lo0);
/* 69 */                        if (obj != ii0111o2) {
                                }
                                break;
                            } else if (i3 == 1) {
/* 36 */                        iIiOOI3 = this.I00iiI;
/* 38 */                        lIoii1l01l0i.I00000oOI(obj);
/* 41 */                        iO000lo0 = this;
                            } else if (i3 != 2) {
/* 31 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 25 */                        iIiOOI2 = this.I00iiI;
/* 27 */                        lIoii1l01l0i.I00000oOI(obj);
/* 87 */                        iIiOOI2.I00000oOI(null);
                                break;
                            }
/* 74 */                    iO000lo0.I00iiI = iIiOOI3;
/* 76 */                    iO000lo0.I00iiO = 2;
/* 82 */                    if (iOOlOiI.I00000oOI((Collection) obj, iO000lo0) != ii0111o2) {
/* 86 */                        iIiOOI2 = iIiOOI3;
/* 87 */                        iIiOOI2.I00000oOI(null);
                            }
                    }
/* 90 */            return ooiIlOl1iI;
                }
            }

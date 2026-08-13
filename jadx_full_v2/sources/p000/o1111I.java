            package p000;
            
            public final class o1111I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final o1I0I0O I00iiO;
                public final IIiOOI I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o1111I(o1I0I0O o1i0i0o, IIiOOI iIiOOI, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = o1i0i0o;
/* 5 */             this.I00iio = iIiOOI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIiOOI iIiOOI = this.I00iio;
/* 5 */             o1I0I0O o1i0i0o = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new o1111I(o1i0i0o, iIiOOI, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new o1111I(o1i0i0o, iIiOOI, iOoil1iiIilo, 1);
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
/* 18 */            return ((o1111I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             o1I0I0O o1i0i0o = this.I00iiO;
/* 9 */             IIiOOI iIiOOI = this.I00iio;
                    switch (i) {
                        case 0:
/* 47 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
                            try {
/* 51 */                        if (this.I00iiI == 0) {
/* 59 */                            lIoii1l01l0i.I00000oOI(obj);
/* 62 */                            this.I00iiI = 1;
/* 68 */                            if (o1i0i0o.clearImplicitCaches(this) == ii0111o) {
                                        break;
                                    }
                                } else {
/* 53 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
/* 72 */                        iIiOOI.I00000oOI(null);
                                break;
                            } catch (Exception e) {
/* 76 */                        iIiOOI.I0000O(e);
/* 79 */                        return ooiIlOl1iI;
                            }
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
                            try {
/* 18 */                        if (this.I00iiI == 0) {
/* 26 */                            lIoii1l01l0i.I00000oOI(obj);
/* 29 */                            this.I00iiI = 1;
/* 35 */                            if (o1i0i0o.warmup(this) == ii0111o2) {
                                        break;
                                    }
                                } else {
/* 20 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
/* 39 */                        iIiOOI.I00000oOI(null);
                                break;
                            } catch (Exception e2) {
/* 43 */                        iIiOOI.I0000O(e2);
/* 46 */                        return ooiIlOl1iI;
                            }
                    }
/* 46 */            return ooiIlOl1iI;
                }
            }

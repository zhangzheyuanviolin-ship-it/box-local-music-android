            package p000;
            
            public final class IIillIIO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IOi10loi I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIillIIO(IOi10loi iOi10loi, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iOi10loi;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IOi10loi iOi10loi = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new IIillIIO(iOi10loi, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new IIillIIO(iOi10loi, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new IIillIIO(iOi10loi, iOoil1iiIilo, 2);
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
/* 18 */            return ((IIillIIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOi10loi iOi10loi = this.I00iiO;
                    switch (i) {
                        case 0:
/* 93 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 95 */                    int i2 = this.I00iiI;
/* 97 */                    if (i2 == 0) {
/* 110 */                       lIoii1l01l0i.I00000oOI(obj);
/* 113 */                       this.I00iiI = 1;
                                return iOi10loi.I0010o(this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 99 */                    if (i2 == 1) {
/* 101 */                       lIoii1l01l0i.I00000oOI(obj);
/* 122 */                       return ooiIlOl1iI;
                            }
/* 105 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 1:
/* 44 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 46 */                    int i3 = this.I00iiI;
/* 48 */                    if (i3 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        this.I00iiI = 1;
/* 72 */                        if (il0l1o1l.I00000oOI(5000L, this) == ii0111o2) {
/* 74 */                            return ii0111o2;
                                }
                            } else {
/* 50 */                        if (i3 != 1) {
/* 56 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                             return null;
                                }
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 79 */                    l11I11lO.I0000O(3, "CXCP");
/* 89 */                    iOi10loi.I00O10llo(new lolOiIoiillI(11));
/* 92 */                    return ooiIlOl1iI;
                        default:
/* 14 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 16 */                    int i4 = this.I00iiI;
/* 18 */                    if (i4 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        this.I00iiI = 1;
/* 36 */                        Object objI0010o = iOi10loi.I0010o(this);
                                return objI0010o == ii0111o3 ? ii0111o3 : objI0010o;
                            }
/* 20 */                    if (i4 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 43 */                        return obj;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

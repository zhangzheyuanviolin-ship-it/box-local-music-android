            package p000;
            
            public final class IIo10olO0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIo10olO0(int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
/* 3 */             super(i, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    return new IIo10olO0(2, iOoil1iiIilo, 0);
                        default:
/* 10 */                    IIo10olO0 iIo10olO0 = new IIo10olO0(2, iOoil1iiIilo, 1);
/* 19 */                    iIo10olO0.I00iiI = ((Number) obj).intValue();
/* 21 */                    return iIo10olO0;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 41 */                    return ((IIo10olO0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 26 */                    return ((IIo10olO0) create(Integer.valueOf(((Number) obj).intValue()), (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 25 */                    int i = this.I00iiI;
/* 27 */                    if (i == 0) {
/* 42 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        this.I00iiI = 1;
/* 53 */                        if (il0l1o1l.I00000oOI(3000L, this) == ii0111o) {
/* 58 */                            return ii0111o;
                                }
                            } else {
/* 29 */                        if (i != 1) {
/* 37 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 40 */                            return null;
                                }
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 56 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 7 */                     int i2 = this.I00iiI;
/* 9 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 11 */                    lIoii1l01l0i.I00000oOI(obj);
/* 18 */                    return Boolean.valueOf(i2 > 0);
                    }
                }
            }

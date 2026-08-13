            package p000;

            import java.util.List;
            
            public final class Io0Iio0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final boolean I00iiI;
                public final OI10i0Il I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Io0Iio0(int i, IOoil1iiIilo iOoil1iiIilo, OI10i0Il oI10i0Il, boolean z) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = z;
/* 5 */             this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return new Io0Iio0(0, iOoil1iiIilo, this.I00iiO, this.I00iiI);
                        default:
/* 13 */                    return new Io0Iio0(1, iOoil1iiIilo, this.I00iiO, this.I00iiI);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 28 */                    ((Io0Iio0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Io0Iio0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             boolean z = this.I00iiI;
/* 7 */             OI10i0Il oI10i0Il = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 27 */                    lIoii1l01l0i.I00000oOI(obj);
/* 30 */                    if (z) {
/* 32 */                        List list = Io0IlOI0l.I00000oIO;
/* 36 */                        oI10i0Il.setValue(Boolean.TRUE);
                                break;
                            }
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 21 */                    oI10i0Il.setValue(Boolean.valueOf(z));
                            break;
                    }
/* 24 */            return ooiIlOl1iI;
                }
            }

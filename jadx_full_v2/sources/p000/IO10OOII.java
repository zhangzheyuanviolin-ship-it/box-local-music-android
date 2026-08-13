            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
/* 13 */    public final class IO10OOII extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public int I00iiI;
                public Object I00iiO;
                public final IO10i01 I00iio;
                public final IlOil1iooOO0 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO10OOII(IO10i01 iO10i01, IlOil1iooOO0 ilOil1iooOO0, Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = iO10i01;
/* 6 */             this.I00ilI0I1 = ilOil1iooOO0;
/* 8 */             this.I00iiO = obj;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IlOil1iooOO0 ilOil1iooOO0 = this.I00ilI0I1;
/* 5 */             IO10i01 iO10i01 = this.I00iio;
                    switch (i) {
                        case 0:
/* 22 */                    return new IO10OOII(iO10i01, ilOil1iooOO0, this.I00iiO, iOoil1iiIilo);
                        default:
/* 12 */                    IO10OOII io10ooii = new IO10OOII(iO10i01, ilOil1iooOO0, iOoil1iiIilo);
/* 15 */                    io10ooii.I00iiO = obj;
/* 17 */                    return io10ooii;
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
/* 18 */            return ((IO10OOII) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IlOil1iooOO0 ilOil1iooOO0 = this.I00ilI0I1;
/* 7 */             IO10i01 iO10i01 = this.I00iio;
                    switch (i) {
                        case 0:
/* 75 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 77 */                    int i2 = this.I00iiI;
/* 79 */                    if (i2 != 0) {
/* 81 */                        if (i2 == 1) {
/* 83 */                            lIoii1l01l0i.I00000oOI(obj);
/* 108 */                           return ooiIlOl1iI;
                                }
/* 87 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 92 */                    lIoii1l01l0i.I00000oOI(obj);
/* 95 */                    Function3 function3 = iO10i01.I00ilI0I1;
/* 97 */                    Object obj2 = this.I00iiO;
/* 99 */                    this.I00iiI = 1;
                            return function3.invoke(ilOil1iooOO0, obj2, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 18 */                    Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    int i3 = this.I00iiI;
/* 24 */                    if (i3 != 0) {
/* 26 */                        if (i3 == 1) {
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 74 */                            return ooiIlOl1iI;
                                }
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 45 */                    IlOil1ii ilOil1ii = iO10i01.I00iio;
/* 49 */                    I00100o1O0lo i00100o1O0lo = new I00100o1O0lo(1);
/* 52 */                    i00100o1O0lo.I00iiI = oOo0ooi;
/* 54 */                    i00100o1O0lo.I00iiO = ii0110;
/* 56 */                    i00100o1O0lo.I00iio = iO10i01;
/* 58 */                    i00100o1O0lo.I00ilI0I1 = ilOil1iooOO0;
/* 60 */                    VarHandle.storeStoreFence();
/* 63 */                    this.I00iiO = null;
/* 65 */                    this.I00iiI = 1;
                            return ilOil1ii.I00000oIO(i00100o1O0lo, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public IO10OOII(IO10i01 iO10i01, IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iio = iO10i01;
                    this.I00ilI0I1 = ilOil1iooOO0;
                }
            }

            package p000;

            import android.content.Context;
            
            public final class o0OOoOO1i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IOiOol0 I00iiO;
                public final Context I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0OOoOO1i(IOiOol0 iOiOol0, Context context, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iOiOol0;
/* 5 */             this.I00iio = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Context context = this.I00iio;
/* 5 */             IOiOol0 iOiOol0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new o0OOoOO1i(iOiOol0, context, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new o0OOoOO1i(iOiOol0, context, iOoil1iiIilo, 1);
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
/* 18 */            return ((o0OOoOO1i) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             Context context = this.I00iio;
/* 8 */             IOiOol0 iOiOol0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 33 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */                    int i2 = this.I00iiI;
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 40 */                    if (i2 != 0) {
/* 58 */                        return ooiIlOl1iI;
                            }
/* 46 */                    OOl11O0ii0II oOl11O0ii0II = new OOl11O0ii0II(iOiOol0, context, null);
/* 49 */                    this.I00iiI = 1;
                            return iOiOol0.I00OilO00Il(context, oOl11O0ii0II, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 13 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 15 */                    int i3 = this.I00iiI;
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 20 */                    if (i3 != 0) {
/* 32 */                        return ooiIlOl1iI;
                            }
/* 23 */                    this.I00iiI = 1;
                            return iOiOol0.I00OIo(context, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                    }
                }
            }

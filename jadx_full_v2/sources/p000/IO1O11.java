            package p000;

            import android.content.Context;
            import android.widget.Toast;
            
            public final class IO1O11 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final boolean I00iiI;
                public final Context I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1O11(boolean z, Context context, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = z;
/* 5 */             this.I00iiO = context;
/* 7 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new IO1O11(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new IO1O11(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
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
/* 28 */                    ((IO1O11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((IO1O11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            String str = this.I00iio;
/* 13 */            Context context = this.I00iiO;
/* 15 */            boolean z = this.I00iiI;
                    switch (i) {
                        case 0:
/* 47 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    if (!z) {
/* 70 */                        Toast.makeText(context, "Export failed", 0).show();
                                break;
                            } else {
/* 62 */                        Toast.makeText(context, "Saved to Downloads/".concat(str), 1).show();
                                break;
                            }
                        default:
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 25 */                    if (!z) {
/* 43 */                        Toast.makeText(context, "Export failed", 0).show();
                                break;
                            } else {
/* 35 */                        Toast.makeText(context, "Saved to Downloads/".concat(str), 1).show();
                                break;
                            }
                    }
/* 46 */            return ooiIlOl1iI;
                }
            }

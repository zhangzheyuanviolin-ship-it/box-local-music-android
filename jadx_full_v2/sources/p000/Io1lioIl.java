            package p000;

            import android.content.Context;
            import java.util.List;
            
            public final class Io1lioIl extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Context I00iiI;
                public final O1OIi1 I00iiO;
                public final OI10i0Il I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Io1lioIl(Context context, O1OIi1 o1OIi1, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = context;
/* 5 */             this.I00iiO = o1OIi1;
/* 7 */             this.I00iio = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new Io1lioIl(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new Io1lioIl(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 28 */                    ((Io1lioIl) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Io1lioIl) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             O1OIi1 o1OIi1 = this.I00iiO;
/* 7 */             OI10i0Il oI10i0Il = this.I00iio;
/* 11 */            Context context = this.I00iiI;
                    switch (i) {
                        case 0:
/* 39 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    if (iOI10i0I11.I00000oIO(context, "android.permission.RECORD_AUDIO") != 0) {
/* 56 */                        o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                                break;
                            } else {
/* 52 */                        oI10i0Il.setValue(Boolean.TRUE);
                                break;
                            }
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    lIoii1l01l0i.I00000oOI(obj);
/* 25 */                    if (iOI10i0I11.I00000oIO(context, "android.permission.RECORD_AUDIO") != 0) {
/* 35 */                        o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                                break;
                            } else {
/* 27 */                        List list = O1o0iO.I00000oIO;
/* 31 */                        oI10i0Il.setValue(Boolean.TRUE);
                                break;
                            }
                    }
/* 38 */            return ooiIlOl1iI;
                }
            }

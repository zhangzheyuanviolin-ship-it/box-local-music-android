            package p000;

            import android.content.Context;
            import java.util.Iterator;
            
            public final class IO1oi00l11 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final OloIl1l1oOii I00iiI;
                public final O1ol100o0O I00iiO;
                public final Context I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1oi00l11(OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, Context context, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oloIl1l1oOii;
/* 5 */             this.I00iiO = o1ol100o0O;
/* 7 */             this.I00iio = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new IO1oi00l11(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new IO1oi00l11(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
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
/* 28 */                    ((IO1oi00l11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((IO1oi00l11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 47 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    OloIl1l1oOii oloIl1l1oOii = this.I00iiI;
/* 56 */                    Iterator it = oloIl1l1oOii.I000OiO.iterator();
/* 64 */                    while (it.hasNext()) {
/* 81 */                        O1ol100o0O.I000O01llI0(this.I00iiO, this.I00iio, oloIl1l1oOii, (O1oIOiI11o0) it.next(), null, null, 24);
                            }
                            break;
                        default:
/* 8 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    OloIl1l1oOii oloIl1l1oOii2 = this.I00iiI;
/* 17 */                    Iterator it2 = oloIl1l1oOii2.I000OiO.iterator();
/* 25 */                    while (it2.hasNext()) {
/* 42 */                        O1ol100o0O.I000O01llI0(this.I00iiO, this.I00iio, oloIl1l1oOii2, (O1oIOiI11o0) it2.next(), null, null, 24);
                            }
                            break;
                    }
/* 46 */            return ooiIlOl1iI;
                }
            }

            package p000;

            import java.util.ArrayList;
            import java.util.Map;
            
            public final class Ii1l1iio0lO0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final String I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1l1iio0lO0(String str, int i, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iiO;
                    switch (i) {
                        case 0:
/* 29 */                    Ii1l1iio0lO0 ii1l1iio0lO0 = new Ii1l1iio0lO0(str, 0, iOoil1iiIilo);
/* 32 */                    ii1l1iio0lO0.I00iiI = obj;
/* 34 */                    return ii1l1iio0lO0;
                        case 1:
/* 20 */                    Ii1l1iio0lO0 ii1l1iio0lO02 = new Ii1l1iio0lO0(str, 1, iOoil1iiIilo);
/* 23 */                    ii1l1iio0lO02.I00iiI = obj;
/* 25 */                    return ii1l1iio0lO02;
                        default:
/* 11 */                    Ii1l1iio0lO0 ii1l1iio0lO03 = new Ii1l1iio0lO0(str, 2, iOoil1iiIilo);
/* 14 */                    ii1l1iio0lO03.I00iiI = obj;
/* 16 */                    return ii1l1iio0lO03;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 48 */                    return ((Ii1l1iio0lO0) create((Ol0olo0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 33 */                    return ((Ii1l1iio0lO0) create((O1i1liOl) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((Ii1l1iio0lO0) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iiO;
                    switch (i) {
                        case 0:
/* 92 */                    Ol0olo0 ol0olo0 = (Ol0olo0) this.I00iiI;
/* 94 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 96 */                    lIoii1l01l0i.I00000oOI(obj);
/* 101 */                   ArrayList arrayList = new ArrayList();
/* 116 */                   for (Ol0ioI1iI ol0ioI1iI : ol0olo0.I001IIilI0O()) {
/* 132 */                       if (!O0000Ioio00.I0000O(ol0ioI1iI.I001i1O0Ol(), str)) {
/* 134 */                           arrayList.add(ol0ioI1iI);
                                }
                            }
/* 138 */                   Ol0olO ol0olOI001IO000 = Ol0olo0.I001IO000();
/* 142 */                   ol0olOI001IO000.I000II(arrayList);
/* 145 */                   return ol0olOI001IO000.I00000oOI();
                        case 1:
/* 24 */                    O1i1liOl o1i1liOl = (O1i1liOl) this.I00iiI;
/* 26 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 28 */                    lIoii1l01l0i.I00000oOI(obj);
/* 31 */                    Iool1IOO1o0i iool1IOO1o0iI00111O = o1i1liOl.I00111O();
/* 37 */                    ArrayList arrayList2 = new ArrayList();
/* 48 */                    for (Object obj2 : iool1IOO1o0iI00111O) {
/* 65 */                        if (!O0000Ioio00.I0000O(((O1i1OolO) obj2).I001i1O0Ol(), str)) {
/* 67 */                            arrayList2.add(obj2);
                                }
                            }
/* 71 */                    O1i1l1 o1i1l1I001IIilI0O = O1i1liOl.I001IIilI0O();
/* 75 */                    o1i1l1I001IIilI0O.I0000O();
/* 82 */                    ((O1i1liOl) o1i1l1I001IIilI0O.I00iiI).I0010I0i(arrayList2);
/* 85 */                    return o1i1l1I001IIilI0O.I00000oOI();
                        default:
/* 8 */                     Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    return ((Map) this.I00iiI).get(str);
                    }
                }
            }

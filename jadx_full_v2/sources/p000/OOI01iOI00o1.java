            package p000;

            import java.util.LinkedHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class OOI01iOI00o1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final IlliIl1l11O I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOI01iOI00o1(IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = illiIl1l11O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IlliIl1l11O illiIl1l11O = this.I00iio;
                    switch (i) {
                        case 0:
/* 20 */                    OOI01iOI00o1 oOI01iOI00o1 = new OOI01iOI00o1(illiIl1l11O, iOoil1iiIilo, 0);
/* 23 */                    oOI01iOI00o1.I00iiO = obj;
/* 25 */                    return oOI01iOI00o1;
                        default:
/* 11 */                    OOI01iOI00o1 oOI01iOI00o12 = new OOI01iOI00o1(illiIl1l11O, iOoil1iiIilo, 1);
/* 14 */                    oOI01iOI00o12.I00iiO = obj;
/* 16 */                    return oOI01iOI00o12;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI0ooi10l oI0ooi10l = (OI0ooi10l) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((OOI01iOI00o1) create(oI0ooi10l, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IlliIl1l11O illiIl1l11O = this.I00iio;
                    switch (i) {
                        case 0:
/* 67 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 69 */                    int i2 = this.I00iiI;
/* 71 */                    if (i2 == 0) {
/* 83 */                        lIoii1l01l0i.I00000oOI(obj);
/* 88 */                        OI0ooi10l oI0ooi10l = (OI0ooi10l) this.I00iiO;
/* 90 */                        this.I00iiI = 1;
/* 92 */                        obj = illiIl1l11O.invoke(oI0ooi10l, this);
/* 96 */                        if (obj == ii0111o) {
/* 98 */                            return ii0111o;
                                }
                            } else {
/* 73 */                        if (i2 != 1) {
/* 79 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 75 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 101 */                   OI0ooi10l oI0ooi10l2 = (OI0ooi10l) obj;
/* 109 */                   ((AtomicBoolean) oI0ooi10l2.I00000oOI.I00iOIl).set(true);
/* 112 */                   return oI0ooi10l2;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i3 = this.I00iiI;
/* 16 */                    if (i3 == 0) {
/* 33 */                        lIoii1l01l0i.I00000oOI(obj);
/* 52 */                        OI0ooi10l oI0ooi10l3 = new OI0ooi10l(new LinkedHashMap(((OI0ooi10l) this.I00iiO).I00000oIO()), false);
/* 55 */                        this.I00iiO = oI0ooi10l3;
/* 57 */                        this.I00iiI = 1;
                                return illiIl1l11O.invoke(oI0ooi10l3, this) == ii0111o2 ? ii0111o2 : oI0ooi10l3;
                            }
/* 18 */                    if (i3 != 1) {
/* 29 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 23 */                    OI0ooi10l oI0ooi10l4 = (OI0ooi10l) this.I00iiO;
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
/* 66 */                    return oI0ooi10l4;
                    }
                }
            }

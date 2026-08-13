            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class I0i1Il extends Oll0io implements Function3 {
                public final int I00iOIl;
                public int I00iiI;
                public OO11OoloI I00iiO;
                public Object I00iio;
                public final Function3 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0i1Il(Function3 function3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00ilI0I1 = function3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Function3 function3 = this.I00ilI0I1;
/* 7 */             OO11OoloI oO11OoloI = (OO11OoloI) obj;
/* 9 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj3;
                    switch (i) {
                        case 0:
/* 32 */                    I0i1Il i0i1Il = new I0i1Il(function3, iOoil1iiIilo, 0);
/* 35 */                    i0i1Il.I00iiO = oO11OoloI;
/* 37 */                    i0i1Il.I00iio = obj2;
/* 39 */                    return i0i1Il.invokeSuspend(ooiIlOl1iI);
                        default:
/* 17 */                    I0i1Il i0i1Il2 = new I0i1Il(function3, iOoil1iiIilo, 1);
/* 20 */                    i0i1Il2.I00iiO = oO11OoloI;
/* 22 */                    i0i1Il2.I00iio = obj2;
/* 24 */                    return i0i1Il2.invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Function3 function3 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 78 */                    OO11OoloI oO11OoloI = this.I00iiO;
/* 80 */                    Object obj2 = this.I00iio;
/* 82 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 84 */                    int i2 = this.I00iiI;
/* 86 */                    if (i2 == 0) {
/* 105 */                       lIoii1l01l0i.I00000oOI(obj);
/* 110 */                       if (!(obj2 instanceof OIio0oloI1I)) {
/* 146 */                           return ooiIlOl1iI;
                                }
/* 113 */                       Object obj3 = oO11OoloI.I00iOIl;
/* 115 */                       this.I00iiO = oO11OoloI;
/* 117 */                       this.I00iio = null;
/* 119 */                       this.I00iiI = 1;
/* 121 */                       obj = function3.invoke(obj3, obj2, this);
/* 125 */                       if (obj != ii0111o) {
                                }
/* 145 */                       return ii0111o;
                            }
/* 88 */                    if (i2 != 1) {
/* 90 */                        if (i2 == 2) {
/* 92 */                            lIoii1l01l0i.I00000oOI(obj);
/* 146 */                           return ooiIlOl1iI;
                                }
/* 96 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 101 */                   lIoii1l01l0i.I00000oOI(obj);
/* 128 */                   OIio0oloI1I oIio0oloI1I = (OIio0oloI1I) obj;
/* 130 */                   if (oIio0oloI1I == null) {
/* 146 */                       return ooiIlOl1iI;
                            }
/* 133 */                   this.I00iiO = null;
/* 135 */                   this.I00iio = null;
/* 137 */                   this.I00iiI = 2;
/* 143 */                   if (oO11OoloI.I0000oI00(this, oIio0oloI1I) != ii0111o) {
/* 146 */                       return ooiIlOl1iI;
                            }
/* 145 */                   return ii0111o;
                        default:
/* 15 */                    OO11OoloI oO11OoloI2 = this.I00iiO;
/* 17 */                    Object obj4 = this.I00iio;
/* 19 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 21 */                    int i3 = this.I00iiI;
/* 23 */                    if (i3 == 0) {
/* 42 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        Object obj5 = oO11OoloI2.I00iOIl;
/* 47 */                        this.I00iiO = oO11OoloI2;
/* 49 */                        this.I00iio = null;
/* 51 */                        this.I00iiI = 1;
/* 53 */                        obj = function3.invoke(obj5, obj4, this);
/* 57 */                        if (obj != ii0111o2) {
                                }
/* 76 */                        return ii0111o2;
                            }
/* 25 */                    if (i3 != 1) {
/* 27 */                        if (i3 == 2) {
/* 29 */                            lIoii1l01l0i.I00000oOI(obj);
/* 77 */                            return ooiIlOl1iI;
                                }
/* 33 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 38 */                    lIoii1l01l0i.I00000oOI(obj);
/* 60 */                    OIio0oloI1I oIio0oloI1I2 = (OIio0oloI1I) obj;
/* 62 */                    if (oIio0oloI1I2 == null) {
/* 77 */                        return ooiIlOl1iI;
                            }
/* 64 */                    this.I00iiO = null;
/* 66 */                    this.I00iio = null;
/* 68 */                    this.I00iiI = 2;
/* 74 */                    if (oO11OoloI2.I0000oI00(this, oIio0oloI1I2) != ii0111o2) {
/* 77 */                        return ooiIlOl1iI;
                            }
/* 76 */                    return ii0111o2;
                    }
                }
            }

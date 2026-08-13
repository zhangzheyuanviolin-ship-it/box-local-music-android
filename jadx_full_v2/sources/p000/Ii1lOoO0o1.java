            package p000;
            
            public final class Ii1lOoO0o1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ii1liIllli0 I00iiO;
                public final boolean I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lOoO0o1(Ii1liIllli0 ii1liIllli0, boolean z, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ii1liIllli0;
/* 5 */             this.I00iio = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 68 */                    return new Ii1lOoO0o1(this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        case 1:
/* 57 */                    return new Ii1lOoO0o1(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                        case 2:
/* 46 */                    return new Ii1lOoO0o1(this.I00iiO, this.I00iio, iOoil1iiIilo, 2);
                        case 3:
/* 35 */                    return new Ii1lOoO0o1(this.I00iiO, this.I00iio, iOoil1iiIilo, 3);
                        case 4:
/* 24 */                    return new Ii1lOoO0o1(this.I00iiO, this.I00iio, iOoil1iiIilo, 4);
                        default:
/* 13 */                    return new Ii1lOoO0o1(this.I00iiO, this.I00iio, iOoil1iiIilo, 5);
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
/* 18 */            return ((Ii1lOoO0o1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = this.I00iio;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 203 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 205 */                   int i2 = this.I00iiI;
/* 207 */                   if (i2 != 0) {
/* 209 */                       if (i2 == 1) {
/* 211 */                           lIoii1l01l0i.I00000oOI(obj);
/* 240 */                           return obj;
                                }
/* 215 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 220 */                   lIoii1l01l0i.I00000oOI(obj);
/* 223 */                   Ii1I1ooo10O0 ii1I1ooo10O0 = ii1liIllli0.I0000O;
/* 228 */                   Ii1lOii11O ii1lOii11O = new Ii1lOii11O(z, null, 0);
/* 231 */                   this.I00iiI = 1;
/* 233 */                   Object objI00000oIO = ii1I1ooo10O0.I00000oIO(ii1lOii11O, this);
                            return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                        case 1:
/* 166 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 168 */                   int i3 = this.I00iiI;
/* 170 */                   if (i3 != 0) {
/* 172 */                       if (i3 == 1) {
/* 174 */                           lIoii1l01l0i.I00000oOI(obj);
/* 202 */                           return obj;
                                }
/* 178 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 183 */                   lIoii1l01l0i.I00000oOI(obj);
/* 186 */                   Ii1I1ooo10O0 ii1I1ooo10O02 = ii1liIllli0.I00000oIO;
/* 190 */                   Ii1lOii11O ii1lOii11O2 = new Ii1lOii11O(z, null, 1);
/* 193 */                   this.I00iiI = 1;
/* 195 */                   Object objI00000oIO2 = ii1I1ooo10O02.I00000oIO(ii1lOii11O2, this);
                            return objI00000oIO2 == ii0111o2 ? ii0111o2 : objI00000oIO2;
                        case 2:
/* 128 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 130 */                   int i4 = this.I00iiI;
/* 132 */                   if (i4 != 0) {
/* 134 */                       if (i4 == 1) {
/* 136 */                           lIoii1l01l0i.I00000oOI(obj);
/* 165 */                           return obj;
                                }
/* 140 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 145 */                   lIoii1l01l0i.I00000oOI(obj);
/* 148 */                   Ii1I1ooo10O0 ii1I1ooo10O03 = ii1liIllli0.I00000oIO;
/* 153 */                   Ii1lOii11O ii1lOii11O3 = new Ii1lOii11O(z, null, 2);
/* 156 */                   this.I00iiI = 1;
/* 158 */                   Object objI00000oIO3 = ii1I1ooo10O03.I00000oIO(ii1lOii11O3, this);
                            return objI00000oIO3 == ii0111o3 ? ii0111o3 : objI00000oIO3;
                        case 3:
/* 90 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 92 */                    int i5 = this.I00iiI;
/* 94 */                    if (i5 != 0) {
/* 96 */                        if (i5 == 1) {
/* 98 */                            lIoii1l01l0i.I00000oOI(obj);
/* 127 */                           return obj;
                                }
/* 102 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 107 */                   lIoii1l01l0i.I00000oOI(obj);
/* 110 */                   Ii1I1ooo10O0 ii1I1ooo10O04 = ii1liIllli0.I00000oIO;
/* 115 */                   Ii1lOii11O ii1lOii11O4 = new Ii1lOii11O(z, null, 3);
/* 118 */                   this.I00iiI = 1;
/* 120 */                   Object objI00000oIO4 = ii1I1ooo10O04.I00000oIO(ii1lOii11O4, this);
                            return objI00000oIO4 == ii0111o4 ? ii0111o4 : objI00000oIO4;
                        case 4:
/* 52 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 54 */                    int i6 = this.I00iiI;
/* 56 */                    if (i6 != 0) {
/* 58 */                        if (i6 == 1) {
/* 60 */                            lIoii1l01l0i.I00000oOI(obj);
/* 89 */                            return obj;
                                }
/* 64 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 69 */                    lIoii1l01l0i.I00000oOI(obj);
/* 72 */                    Ii1I1ooo10O0 ii1I1ooo10O05 = ii1liIllli0.I00000oIO;
/* 77 */                    Ii1lOii11O ii1lOii11O5 = new Ii1lOii11O(z, null, 4);
/* 80 */                    this.I00iiI = 1;
/* 82 */                    Object objI00000oIO5 = ii1I1ooo10O05.I00000oIO(ii1lOii11O5, this);
                            return objI00000oIO5 == ii0111o5 ? ii0111o5 : objI00000oIO5;
                        default:
/* 14 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 16 */                    int i7 = this.I00iiI;
/* 18 */                    if (i7 != 0) {
/* 20 */                        if (i7 == 1) {
/* 22 */                            lIoii1l01l0i.I00000oOI(obj);
/* 51 */                            return obj;
                                }
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    Ii1I1ooo10O0 ii1I1ooo10O06 = ii1liIllli0.I00000oIO;
/* 39 */                    Ii1lOii11O ii1lOii11O6 = new Ii1lOii11O(z, null, 5);
/* 42 */                    this.I00iiI = 1;
/* 44 */                    Object objI00000oIO6 = ii1I1ooo10O06.I00000oIO(ii1lOii11O6, this);
                            return objI00000oIO6 == ii0111o6 ? ii0111o6 : objI00000oIO6;
                    }
                }
            }

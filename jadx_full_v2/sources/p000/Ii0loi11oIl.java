            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 15 */    public final class Ii0loi11oIl extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public int I00iiI;
                public final Oi1oIiOiIi0 I00iiO;
                public final boolean I00iio;
                public final boolean I00ilI0I1;
                public final Function1 I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii0loi11oIl(IOoil1iiIilo iOoil1iiIilo, Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, boolean z2, Function1 function1) {
/* 13 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iiO = oi1oIiOiIi0;
/* 6 */             this.I00iio = z;
/* 8 */             this.I00ilI0I1 = z2;
/* 10 */            this.I00ilO0 = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    return new Ii0loi11oIl(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                        default:
/* 17 */                    return new Ii0loi11oIl(iOoil1iiIilo, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0);
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
/* 18 */            return ((Ii0loi11oIl) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    switch (this.I00iOIl) {
                        case 0:
/* 55 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 57 */                    int i = this.I00iiI;
/* 59 */                    if (i != 0) {
/* 61 */                        if (i == 1) {
/* 63 */                            lIoii1l01l0i.I00000oOI(obj);
/* 119 */                           return obj;
                                }
/* 67 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 3 */                         return null;
                            }
/* 72 */                    lIoii1l01l0i.I00000oOI(obj);
/* 75 */                    Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00iiO;
/* 96 */                    boolean z = !(oi1oIiOiIi0.I000iOII() && oi1oIiOiIi0.I000l1()) && this.I00iio;
/* 101 */                   boolean z2 = this.I00ilI0I1;
/* 103 */                   Oi1oIiOiIi0 oi1oIiOiIi02 = this.I00iiO;
/* 107 */                   Ii0lo0iOoOO1 ii0lo0iOoOO1 = new Ii0lo0iOoOO1(z, z2, oi1oIiOiIi02, null, this.I00ilO0, 0);
/* 110 */                   this.I00iiI = 1;
/* 112 */                   Object objI00111O = oi1oIiOiIi02.I00111O(z2, ii0lo0iOoOO1, this);
                            return objI00111O == ii0111o ? ii0111o : objI00111O;
                        default:
/* 10 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 12 */                    int i2 = this.I00iiI;
/* 14 */                    if (i2 != 0) {
/* 16 */                        if (i2 == 1) {
/* 18 */                            lIoii1l01l0i.I00000oOI(obj);
/* 54 */                            return obj;
                                }
/* 22 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 3 */                         return null;
                            }
/* 27 */                    lIoii1l01l0i.I00000oOI(obj);
/* 35 */                    boolean z3 = this.I00ilI0I1;
/* 37 */                    boolean z4 = this.I00iio;
/* 39 */                    Oi1oIiOiIi0 oi1oIiOiIi03 = this.I00iiO;
/* 42 */                    Ii0lo0iOoOO1 ii0lo0iOoOO12 = new Ii0lo0iOoOO1(z3, z4, oi1oIiOiIi03, null, this.I00ilO0, 1);
/* 45 */                    this.I00iiI = 1;
/* 47 */                    Object objI00111O2 = oi1oIiOiIi03.I00111O(z4, ii0lo0iOoOO12, this);
                            return objI00111O2 == ii0111o2 ? ii0111o2 : objI00111O2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public Ii0loi11oIl(Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, boolean z2, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iiO = oi1oIiOiIi0;
                    this.I00iio = z;
                    this.I00ilI0I1 = z2;
                    this.I00ilO0 = function1;
                }
            }

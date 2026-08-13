            package p000;

            import java.util.List;
            
            public final class OOl101 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final O0o0I1i0O I00iiO;
                public final OI10i0Il I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOl101(O0o0I1i0O o0o0I1i0O, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = o0o0I1i0O;
/* 5 */             this.I00iio = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iio;
/* 5 */             O0o0I1i0O o0o0I1i0O = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new OOl101(o0o0I1i0O, oI10i0Il, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new OOl101(o0o0I1i0O, oI10i0Il, iOoil1iiIilo, 1);
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
/* 18 */            return ((OOl101) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             O0o0I1i0O o0o0I1i0O = this.I00iiO;
/* 12 */            OI10i0Il oI10i0Il = this.I00iio;
                    switch (i) {
                        case 0:
/* 78 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 80 */                    int i2 = this.I00iiI;
/* 82 */                    if (i2 != 0) {
/* 84 */                        if (i2 == 1) {
/* 86 */                            lIoii1l01l0i.I00000oOI(obj);
/* 120 */                           return ooiIlOl1iI;
                                }
/* 90 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 95 */                    lIoii1l01l0i.I00000oOI(obj);
/* 108 */                   int size = ((List) oI10i0Il.getValue()).size() - 1;
/* 109 */                   this.I00iiI = 1;
/* 111 */                   IoloOio0I ioloOio0I = O0o0I1i0O.I001iOo1i0O;
                            return o0o0I1i0O.I0001Ioi1lo(size, 0, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 17 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 19 */                    int i3 = this.I00iiI;
/* 21 */                    if (i3 != 0) {
/* 23 */                        if (i3 == 1) {
/* 25 */                            lIoii1l01l0i.I00000oOI(obj);
/* 77 */                            return ooiIlOl1iI;
                                }
/* 29 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 34 */                    lIoii1l01l0i.I00000oOI(obj);
/* 51 */                    if (((OoIIo0oOI1) oI10i0Il.getValue()).I0000oI00.isEmpty()) {
/* 77 */                        return ooiIlOl1iI;
                            }
/* 65 */                    int size2 = ((OoIIo0oOI1) oI10i0Il.getValue()).I0000oI00.size() - 1;
/* 66 */                    this.I00iiI = 1;
/* 68 */                    IoloOio0I ioloOio0I2 = O0o0I1i0O.I001iOo1i0O;
                            return o0o0I1i0O.I0001Ioi1lo(size2, 0, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                    }
                }
            }

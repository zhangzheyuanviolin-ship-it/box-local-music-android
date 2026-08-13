            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I10OoO extends Oll0io implements Function1 {
                public final int I00iOIl;
                public final Object I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10OoO(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 31 */                    return new I10OoO((I10i01) obj, iOoil1iiIilo, 0);
                        case 1:
/* 22 */                    return new I10OoO((OOo0ooi) obj, iOoil1iiIilo, 1);
                        default:
/* 13 */                    return new I10OoO((IO0Il0o1OI) obj, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                        case 0:
/* 37 */                    ((I10OoO) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
/* 40 */                    return ooiIlOl1iI;
                        case 1:
/* 26 */                    return ((I10OoO) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 16 */                    ((I10OoO) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
/* 19 */                    return ooiIlOl1iI;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 46 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 53 */                    ((I10i01) obj2).I0000Il00O();
/* 56 */                    return ooiIlOl1iI;
                        case 1:
/* 23 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
/* 31 */                    ((OOo0ooi) obj2).I00iOIl = null;
/* 42 */                    return new OIi0ooOoOOo0(null, IIlOloloOil.I00000oIO(13), 1);
                        default:
/* 10 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 12 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    ((IO0Il0o1OI) obj2).I001i1O0Ol.await();
/* 22 */                    return ooiIlOl1iI;
                    }
                }
            }

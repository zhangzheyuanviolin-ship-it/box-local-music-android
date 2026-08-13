            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Oo0IIlI extends Oll0io implements Function1 {
                public final int I00iOIl;
                public final Oo0IOoOi01 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oo0IIlI(Oo0IOoOi01 oo0IOoOi01, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oo0IOoOi01;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Oo0IOoOi01 oo0IOoOi01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 32 */                    return new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, 0);
                        case 1:
/* 25 */                    return new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, 1);
                        case 2:
/* 18 */                    return new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, 2);
                        default:
/* 11 */                    return new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, 3);
                    }
                }

                @Override
                public final Object invoke(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                        case 0:
/* 46 */                    ((Oo0IIlI) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 36 */                    ((Oo0IIlI) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 26 */                    ((Oo0IIlI) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 16 */                    ((Oo0IIlI) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 19 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oo0IOoOi01 oo0IOoOi01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 39 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 45 */                    oo0IOoOi01.I001lllioOl = false;
                            break;
                        case 1:
/* 30 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 32 */                    lIoii1l01l0i.I00000oOI(obj);
/* 35 */                    oo0IOoOi01.I0000Il00O();
                            break;
                        case 2:
/* 19 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 26 */                    oo0IOoOi01.I00000oIO(oo0IOoOi01.I001lllioOl);
                            break;
                        default:
/* 10 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 12 */                    lIoii1l01l0i.I00000oOI(obj);
/* 15 */                    oo0IOoOi01.I000oI1ioi();
                            break;
                    }
/* 18 */            return ooiIlOl1iI;
                }
            }

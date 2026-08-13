            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Iil010OO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Function1 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iil010OO(int i, IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    return new Iil010OO(0, iOoil1iiIilo, this.I00iiI);
                        default:
/* 11 */                    return new Iil010OO(1, iOoil1iiIilo, this.I00iiI);
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
/* 28 */                    ((Iil010OO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Iil010OO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             Function1 function1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 25 */                    function1.invoke(null);
                            break;
                        default:
/* 11 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 13 */                    lIoii1l01l0i.I00000oOI(obj);
/* 16 */                    function1.invoke(null);
                            break;
                    }
/* 19 */            return ooiIlOl1iI;
                }
            }

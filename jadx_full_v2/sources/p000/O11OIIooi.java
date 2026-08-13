            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O11OIIooi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Function1 I00iiI;
                public final OI10i0Il I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11OIIooi(Function1 function1, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = function1;
/* 5 */             this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iiO;
/* 5 */             Function1 function1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 27 */                    return new O11OIIooi(function1, oI10i0Il, iOoil1iiIilo, 0);
                        case 1:
/* 20 */                    return new O11OIIooi(function1, oI10i0Il, iOoil1iiIilo, 1);
                        default:
/* 13 */                    return new O11OIIooi(function1, oI10i0Il, iOoil1iiIilo, 2);
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
/* 38 */                    ((O11OIIooi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 28 */                    ((O11OIIooi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((O11OIIooi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iiO;
/* 7 */             Function1 function1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 42 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
/* 51 */                    String str = (String) oI10i0Il.getValue();
/* 57 */                    if (str.length() != 0) {
/* 62 */                        oI10i0Il.setValue("");
/* 65 */                        function1.invoke(str);
                                break;
                            }
                            break;
                        case 1:
/* 27 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    function1.invoke((List) oI10i0Il.getValue());
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 23 */                    function1.invoke((List) oI10i0Il.getValue());
                            break;
                    }
/* 26 */            return ooiIlOl1iI;
                }
            }

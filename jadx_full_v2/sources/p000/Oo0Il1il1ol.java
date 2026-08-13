            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Oo0Il1il1ol extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Function1 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oo0Il1il1ol(int i, IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Function1 function1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new Oo0Il1il1ol(0, iOoil1iiIilo, function1);
                        default:
/* 11 */                    return new Oo0Il1il1ol(1, iOoil1iiIilo, function1);
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
/* 18 */            return ((Oo0Il1il1ol) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Function1 function1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 42 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 44 */                    int i2 = this.I00iiI;
/* 46 */                    if (i2 == 0) {
/* 58 */                        lIoii1l01l0i.I00000oOI(obj);
/* 61 */                        this.I00iiI = 1;
/* 67 */                        if (function1.invoke(this) == ii0111o) {
/* 69 */                            return ii0111o;
                                }
                            } else {
/* 48 */                        if (i2 != 1) {
/* 54 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 71 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i3 = this.I00iiI;
/* 16 */                    if (i3 == 0) {
/* 29 */                        lIoii1l01l0i.I00000oOI(obj);
/* 32 */                        this.I00iiI = 1;
/* 34 */                        Object objInvoke = function1.invoke(this);
                                return objInvoke == ii0111o2 ? ii0111o2 : objInvoke;
                            }
/* 18 */                    if (i3 == 1) {
/* 20 */                        lIoii1l01l0i.I00000oOI(obj);
/* 41 */                        return obj;
                            }
/* 24 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                    }
                }
            }

            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 8 */     public final class Ii0llooiiIii extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final Function1 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii0llooiiIii(int i, IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
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
/* 28 */                    Ii0llooiiIii ii0llooiiIii = new Ii0llooiiIii(0, iOoil1iiIilo, function1);
/* 31 */                    ii0llooiiIii.I00iiI = obj;
/* 33 */                    return ii0llooiiIii;
                        case 1:
/* 19 */                    Ii0llooiiIii ii0llooiiIii2 = new Ii0llooiiIii(1, iOoil1iiIilo, function1);
/* 22 */                    ii0llooiiIii2.I00iiI = obj;
/* 24 */                    return ii0llooiiIii2;
                        default:
/* 10 */                    Ii0llooiiIii ii0llooiiIii3 = new Ii0llooiiIii(iOoil1iiIilo, function1);
/* 13 */                    ii0llooiiIii3.I00iiI = obj;
/* 15 */                    return ii0llooiiIii3;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 47 */                    return ((Ii0llooiiIii) create((OO01IO1Oo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 32 */                    return ((Ii0llooiiIii) create((OO01IO1Oo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    ((Ii0llooiiIii) create((OI0ooi10l) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 21 */                    return ooiIlOl1iI;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Function1 function1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 43 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 45 */                    lIoii1l01l0i.I00000oOI(obj);
/* 58 */                    return function1.invoke(((OO01IO1Oo) this.I00iiI).I00000oOI());
                        case 1:
/* 23 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    return function1.invoke(((OO01IO1Oo) this.I00iiI).I00000oOI());
                        default:
/* 8 */                     Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    function1.invoke((OI0ooi10l) this.I00iiI);
/* 20 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public Ii0llooiiIii(IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 2;
/* 10 */            this.I00iiO = function1;
                }
            }

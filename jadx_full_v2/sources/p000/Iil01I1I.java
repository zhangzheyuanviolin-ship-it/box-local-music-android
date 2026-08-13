            package p000;
            
            public final class Iil01I1I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final IllOOo00lI I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iil01I1I(IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = illOOo00lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    return new Iil01I1I(this.I00iiI, iOoil1iiIilo, 0);
                        case 1:
/* 38 */                    return new Iil01I1I(this.I00iiI, iOoil1iiIilo, 1);
                        case 2:
/* 29 */                    return new Iil01I1I(this.I00iiI, iOoil1iiIilo, 2);
                        case 3:
/* 20 */                    return new Iil01I1I(this.I00iiI, iOoil1iiIilo, 3);
                        default:
/* 11 */                    return new Iil01I1I(this.I00iiI, iOoil1iiIilo, 4);
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
/* 58 */                    ((Iil01I1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 48 */                    ((Iil01I1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 38 */                    ((Iil01I1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 3:
/* 28 */                    ((Iil01I1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Iil01I1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IllOOo00lI illOOo00lI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 46 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 51 */                    illOOo00lI.invoke();
                            break;
                        case 1:
/* 37 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    illOOo00lI.invoke();
                            break;
                        case 2:
/* 28 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 30 */                    lIoii1l01l0i.I00000oOI(obj);
/* 33 */                    illOOo00lI.invoke();
                            break;
                        case 3:
/* 19 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 24 */                    illOOo00lI.invoke();
                            break;
                        default:
/* 10 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 12 */                    lIoii1l01l0i.I00000oOI(obj);
/* 15 */                    illOOo00lI.invoke();
                            break;
                    }
/* 18 */            return ooiIlOl1iI;
                }
            }

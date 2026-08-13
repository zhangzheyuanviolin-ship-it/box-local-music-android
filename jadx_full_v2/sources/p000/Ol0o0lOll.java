            package p000;
            
            public final class Ol0o0lOll extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final I0Iol0OOiO I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol0o0lOll(I0Iol0OOiO i0Iol0OOiO, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = i0Iol0OOiO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I0Iol0OOiO i0Iol0OOiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 18 */                    return new Ol0o0lOll(i0Iol0OOiO, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new Ol0o0lOll(i0Iol0OOiO, iOoil1iiIilo, 1);
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
/* 28 */                    ((Ol0o0lOll) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Ol0o0lOll) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 7 */             I0Iol0OOiO i0Iol0OOiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 23 */                    lIoii1l01l0i.I00000oOI(obj);
/* 26 */                    i0Iol0OOiO.invoke(il011I1OiO0I);
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    i0Iol0OOiO.invoke(il011I1OiO0I);
                            break;
                    }
/* 20 */            return ooiIlOl1iI;
                }
            }

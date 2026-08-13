            package p000;
            
            public final class OlI10lo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final OlI0o1 I00iiI;
                public final O1oiilO I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlI10lo(OlI0o1 olI0o1, O1oiilO o1oiilO, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = olI0o1;
/* 5 */             this.I00iiO = o1oiilO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1oiilO o1oiilO = this.I00iiO;
/* 5 */             OlI0o1 olI0o1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    return new OlI10lo(olI0o1, o1oiilO, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new OlI10lo(olI0o1, o1oiilO, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 28 */                    ((OlI10lo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((OlI10lo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             O1oiilO o1oiilO = this.I00iiO;
/* 7 */             OlI0o1 olI0o1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 24 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 26 */                    lIoii1l01l0i.I00000oOI(obj);
/* 29 */                    olI0o1.I00000oOI();
/* 32 */                    o1oiilO.invoke();
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    olI0o1.I00000oOI();
/* 20 */                    o1oiilO.invoke();
                            break;
                    }
/* 23 */            return ooiIlOl1iI;
                }
            }

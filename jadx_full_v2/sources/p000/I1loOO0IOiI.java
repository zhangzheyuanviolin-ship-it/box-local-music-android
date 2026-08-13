            package p000;
            
            public final class I1loOO0IOiI implements IlliIl1l11O {
                public final int I00iOIl;
                public OI1llOooOl1 I00iiI;

                public I1loOO0IOiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             OI1llOooOl1 oI1llOooOl1 = this.I00iiI;
/* 10 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 14 */            int iIntValue = ((Integer) obj2).intValue();
                    switch (i) {
                        case 0:
/* 77 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 83 */                        iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 79 */                        oI1llOooOl1.I00000oIO(0, iloI0lOlll1);
                                break;
                            }
                        case 1:
/* 55 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 61 */                        iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 57 */                        oI1llOooOl1.I00000oIO(0, iloI0lOlll1);
                                break;
                            }
                        default:
/* 33 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 39 */                        iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 35 */                        oI1llOooOl1.I00000oIO(0, iloI0lOlll1);
                                break;
                            }
                    }
/* 42 */            return ooiIlOl1iI;
                }
            }

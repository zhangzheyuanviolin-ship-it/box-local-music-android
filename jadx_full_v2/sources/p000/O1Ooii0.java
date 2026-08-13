            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O1Ooii0 implements IlliIl1l11O {
                public final int I00iOIl;
                public OoOo1o00Oi00 I00iiI;
                public IOii1l I00iiO;

                public O1Ooii0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 47 */                    OoOo1o00Oi00 ooOo1o00Oi00 = this.I00iiI;
/* 49 */                    IOii1l iOii1l = this.I00iiO;
/* 51 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 55 */                    int iIntValue = ((Integer) obj2).intValue();
/* 69 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 95 */                        iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 73 */                        O1Ooii0 o1Ooii0 = new O1Ooii0(i2);
/* 76 */                        o1Ooii0.I00iiI = ooOo1o00Oi00;
/* 78 */                        o1Ooii0.I00iiO = iOii1l;
/* 80 */                        VarHandle.storeStoreFence();
/* 91 */                        OO1oI00O1O.I00000oIO(iiioOl1O.I00000oOI(-241536773, o1Ooii0, iloI0lOlll1), iloI0lOlll1, 6);
                                break;
                            }
                        default:
/* 11 */                    OoOo1o00Oi00 ooOo1o00Oi002 = this.I00iiI;
/* 13 */                    IOii1l iOii1l2 = this.I00iiO;
/* 15 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 19 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 35 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 43 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 39 */                        Oo0i1oIIoOO.I00000oIO(ooOo1o00Oi002.I000OiO, iOii1l2, iloI0lOlll12, 0);
                                break;
                            }
                    }
/* 46 */            return ooiIlOl1iI;
                }
            }

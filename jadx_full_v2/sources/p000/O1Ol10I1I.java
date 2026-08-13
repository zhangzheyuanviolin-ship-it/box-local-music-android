            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class O1Ol10I1I implements Function3 {
                public final int I00iOIl;
                public String I00iiI;
                public long I00iiO;
                public long I00iio;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 50 */                    boolean z = false;
/* 51 */                    String str = this.I00iiI;
/* 55 */                    long j = this.I00iiO;
/* 57 */                    long j2 = this.I00iio;
/* 61 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 65 */                    int iIntValue = ((Integer) obj3).intValue();
/* 71 */                    if ((iIntValue & 17) != 16) {
/* 73 */                        z = true;
                            }
/* 79 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, z)) {
/* 89 */                        iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 84 */                        O1Ol1io1o.I0000Il00O(str, j, j2, iloI0lOlll1, 0);
                                break;
                            }
                        default:
/* 12 */                    String str2 = this.I00iiI;
/* 14 */                    long j3 = this.I00iiO;
/* 16 */                    long j4 = this.I00iio;
/* 21 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 25 */                    int iIntValue2 = ((Integer) obj3).intValue();
/* 39 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 46 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 42 */                        O1Ol1io1o.I0000Il00O(str2, j3, j4, iloI0lOlll12, 0);
                                break;
                            }
                    }
/* 49 */            return ooiIlOl1iI;
                }
            }

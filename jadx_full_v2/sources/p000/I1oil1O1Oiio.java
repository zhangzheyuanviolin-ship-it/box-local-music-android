            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I1oil1O1Oiio implements IlliOIilI {
                public final int I00iOIl;
                public Oi1O00I1 I00iiI;
                public Object I00iiO;

                public I1oil1O1Oiio(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i2) {
                        case 0:
/* 113 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 125 */                   if ((((Number) obj4).intValue() & 129) != 128 || !iloI0lOlll1.I00IO1()) {
/* 149 */                       io000ol1I.I00000oIO(this.I00iiI, ((I1OIoo1) ((iOOO0ooiIo) this.I00iiO)).I00000oIO, iloI0lOlll1, 0);
                                break;
                            } else {
/* 134 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            }
                        default:
/* 10 */                    int iIntValue = ((Number) obj).intValue();
/* 16 */                    int iIntValue2 = ((Number) obj2).intValue();
/* 21 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj3;
/* 25 */                    int iIntValue3 = ((Number) obj4).intValue();
/* 31 */                    if ((iIntValue3 & 6) == 0) {
/* 42 */                        i = (iloI0lOlll12.I0000oI00(iIntValue) ? 4 : 2) | iIntValue3;
                            } else {
/* 44 */                        i = iIntValue3;
                            }
/* 47 */                    if ((iIntValue3 & 48) == 0) {
/* 60 */                        i |= iloI0lOlll12.I0000oI00(iIntValue2) ? 32 : 16;
                            }
/* 65 */                    if ((i & 147) != 146 || !iloI0lOlll12.I00IO1()) {
/* 78 */                        Oi1O00I1 oi1O00I1 = this.I00iiI;
/* 82 */                        Function1[] function1Arr = (Function1[]) this.I00iiO;
/* 105 */                       Oi1Io0I.I00000oOI(oi1O00I1, (String) function1Arr[iIntValue % function1Arr.length].invoke(Integer.valueOf(iIntValue2)), null, null, 0, false, 0, iloI0lOlll12, 0);
                                break;
                            } else {
/* 74 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            }
                            break;
                    }
/* 108 */           return ooiIlOl1iI;
                }
            }

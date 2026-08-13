            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class Olll1il implements Function3 {
                public final int I00iOIl;
                public int I00iiI;

                public Olll1il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             int i = this.I00iOIl;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            int i2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 174 */                   Ollio1i1 ollio1i1 = (Ollio1i1) obj;
/* 178 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 184 */                   int iIntValue = ((Integer) obj3).intValue();
/* 190 */                   if ((iIntValue & 6) == 0) {
/* 208 */                       iIntValue |= (iIntValue & 8) == 0 ? iloI0lOlll1.I000II(ollio1i1) : iloI0lOlll1.I000OOo1O(ollio1i1) ? 4 : 2;
                            }
/* 220 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 243 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 239 */                       i1O10l1io1iO.I00io1l.I0000O(ollio1i1.I00000oIO(i2), Float.NaN, 0.0f, 0L, null, iloI0lOlll1, 196656, 28);
                                break;
                            }
                        case 1:
/* 99 */                    Ollio1i1 ollio1i12 = (Ollio1i1) obj;
/* 103 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 109 */                   int iIntValue2 = ((Integer) obj3).intValue();
/* 115 */                   if ((iIntValue2 & 6) == 0) {
/* 133 */                       iIntValue2 |= (iIntValue2 & 8) == 0 ? iloI0lOlll12.I000II(ollio1i12) : iloI0lOlll12.I000OOo1O(ollio1i12) ? 4 : 2;
                            }
/* 145 */                   if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
/* 168 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 164 */                       i1O10l1io1iO.I00io1l.I0000O(ollio1i12.I00000oIO(i2), Float.NaN, 0.0f, 0L, null, iloI0lOlll12, 196656, 28);
                                break;
                            }
                        default:
/* 20 */                    List list = (List) obj;
/* 24 */                    IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 30 */                    ((Integer) obj3).getClass();
/* 37 */                    if (i2 >= list.size()) {
/* 90 */                        iloI0lOlll13.I00i01iIIliI(436548218);
/* 93 */                        iloI0lOlll13.I0010I0i(false);
                                break;
                            } else {
/* 42 */                        iloI0lOlll13.I00i01iIIliI(436390614);
/* 45 */                        i1O10l1io1iO i1o10l1io1io = i1O10l1io1iO.I00io1l;
/* 51 */                        Olll1Oi olll1Oi = (Olll1Oi) list.get(i2);
/* 57 */                        I0iII1i10I i0iII1i10I = new I0iII1i10I(24);
/* 60 */                        i0iII1i10I.I00iiI = olll1Oi;
/* 62 */                        VarHandle.storeStoreFence();
/* 67 */                        IOl11II iOl11II = new IOl11II();
/* 70 */                        iOl11II.I00000oIO = i0iII1i10I;
/* 72 */                        VarHandle.storeStoreFence();
/* 80 */                        i1o10l1io1io.I000II(iOl11II, 0.0f, 0L, iloI0lOlll13, 3072);
/* 83 */                        iloI0lOlll13.I0010I0i(false);
                                break;
                            }
                    }
/* 96 */            return ooiIlOl1iI;
                }
            }

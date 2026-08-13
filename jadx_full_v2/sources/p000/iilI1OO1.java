            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class iilI1OO1 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [IOl0l1l0I1] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [Ilo1iIi1OI01] */
                /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
                public static final List I00000oIO(Ol11il011o0 ol11il011o0, Integer num, int i, Integer num2) {
                    int iI00IO1;
                    int iI0010I0i;
                    OI0oiiIO0 oI0oiiIO0;
/* 3 */             if (ol11il011o0.I001i1O0Ol || ol11il011o0.I000oI1ioi() == 0) {
/* 158 */               return Il01100l.I00iOIl;
                    }
/* 13 */            int i2 = 0;
/* 14 */            ?? oOlOOi = new OOlOOi(0);
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            if (num2 != null) {
/* 22 */                iI00IO1 = num2.intValue();
                    } else {
/* 27 */                iI00IO1 = ol11il011o0.I001IO000;
/* 29 */                if (iI00IO1 < 0) {
/* 33 */                    iI00IO1 = ol11il011o0.I00IO1(ol11il011o0.I00000oOI, i);
                        }
                    }
/* 37 */            if (num == 0) {
/* 51 */                int iI00IoiI = ol11il011o0.I000OOo1O - ol11il011o0.I00IoiI(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i));
/* 52 */                OI0l1oli1I oI0l1oli1I = ol11il011o0.I0010o;
/* 54 */                if (oI0l1oli1I != null && (oI0oiiIO0 = (OI0oiiIO0) oI0l1oli1I.I00000oOI(i)) != null) {
/* 64 */                    i2 = oI0oiiIO0.I00000oOI;
                        }
/* 67 */                num = Integer.valueOf(iI00IoiI + i2);
                    }
/* 75 */            int iI00100o1O0lo = ol11il011o0.I00100o1O0lo(i) * 5;
/* 77 */            int[] iArr = ol11il011o0.I00000oOI;
/* 80 */            if (iI00100o1O0lo < iArr.length) {
/* 82 */                iI0010I0i = ol11il011o0.I0010I0i(i);
                    } else {
/* 94 */                int iI00IO12 = iI00IO1 >= 0 ? ol11il011o0.I00IO1(iArr, iI00IO1) : iI00IO1;
/* 95 */                iI0010I0i = ol11il011o0.I0010I0i(iI00IO1);
/* 149 */               int i3 = iI00IO1;
/* 150 */               iI00IO1 = iI00IO12;
/* 151 */               i = i3;
                    }
/* 100 */           while (i >= 0) {
/* 130 */               oOlOOi.I000II(iI0010I0i, (ol11il011o0.I00000oOI[(ol11il011o0.I00100o1O0lo(i) * 5) + 1] & 536870912) != 0 ? ol11il011o0.I0010o(i) : IOl11li.I00000oIO, ol11il011o0.I00Iooi00oi(i), num);
/* 133 */               num = ol11il011o0.I00000oOI(i);
/* 137 */               if (iI00IO1 >= 0) {
/* 141 */                   int iI00IO13 = ol11il011o0.I00IO1(ol11il011o0.I00000oOI, iI00IO1);
/* 145 */                   iI0010I0i = ol11il011o0.I0010I0i(iI00IO1);
/* 149 */                   int i4 = iI00IO1;
/* 150 */                   iI00IO1 = iI00IO13;
/* 151 */                   i = i4;
                        } else {
/* 153 */                   i = iI00IO1;
                        }
                    }
/* 155 */           return oOlOOi.I00iOIl;
                }

                public static final Integer I00000oOI(Ol11i0 ol11i0, IOl1ool0 iOl1ool0, int i, int i2) {
                    Integer numI00000oOI;
/* 1 */             int[] iArr = ol11i0.I00000oOI;
                    while (true) {
/* 4 */                 if (i >= i2) {
/* 3 */                     return null;
                        }
/* 10 */                int iI00000oOI = Ol11iOOOoo1.I00000oOI(iArr, i) + i;
/* 15 */                if (ol11i0.I000OiO(i) && ol11i0.I000OOo1O(i) == 206 && O0000Ioio00.I0000O(ol11i0.I00100l0(iArr, i), IOl1II00.I0000oI00)) {
/* 38 */                    Object objI000O01llI0 = ol11i0.I000O01llI0(i, 0);
/* 49 */                    IloI1lO1IiI0 iloI1lO1IiI0 = objI000O01llI0 instanceof IloI1lO1IiI0 ? (IloI1lO1IiI0) objI000O01llI0 : null;
/* 55 */                    Object obj = iloI1lO1IiI0 != null ? iloI1lO1IiI0.I00000oIO : null;
/* 61 */                    Ilo1loO ilo1loO = obj instanceof Ilo1loO ? (Ilo1loO) obj : null;
/* 63 */                    if (ilo1loO != null && ilo1loO.I00iOIl == iOl1ool0) {
/* 70 */                        return Integer.valueOf(i);
                            }
                        }
/* 79 */                if (ol11i0.I0000O(i) && (numI00000oOI = I00000oOI(ol11i0, iOl1ool0, i + 1, iI00000oOI)) != null) {
/* 93 */                    return Integer.valueOf(numI00000oOI.intValue());
                        }
/* 98 */                i = iI00000oOI;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [IOl0l1l0I1, OOlOOi] */
                /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v4 */
                /* JADX WARN: Type inference failed for: r9v5 */
                public static final ArrayList I0000Il00O(Ol11i0 ol11i0, int i, Integer num) {
/* 3 */             ?? oOlOOi = new OOlOOi(ol11i0);
/* 6 */             int iI00100o1O0lo = ol11i0.I00100o1O0lo(i);
/* 10 */            Ilo1iIi1OI01 ilo1iIi1OI01I00000oIO = ol11i0.I00000oIO(i);
/* 14 */            while (i >= 0) {
/* 41 */                oOlOOi.I000II(ol11i0.I000OOo1O(i), ol11i0.I000iOII(i) ? ol11i0.I00100l0(ol11i0.I00000oOI, i) : IOl11li.I00000oIO, ol11i0.I00000oIO.I000oI1ioi(i), num);
/* 44 */                if (iI00100o1O0lo >= 0) {
/* 54 */                    Ilo1iIi1OI01 ilo1iIi1OI01 = ilo1iIi1OI01I00000oIO;
/* 46 */                    ilo1iIi1OI01I00000oIO = ol11i0.I00000oIO(iI00100o1O0lo);
/* 56 */                    i = iI00100o1O0lo;
/* 50 */                    iI00100o1O0lo = ol11i0.I00100o1O0lo(iI00100o1O0lo);
/* 58 */                    num = ilo1iIi1OI01;
                        } else {
/* 60 */                    i = iI00100o1O0lo;
/* 61 */                    num = ilo1iIi1OI01I00000oIO;
                        }
                    }
/* 63 */            return oOlOOi.I00iOIl;
                }
            }

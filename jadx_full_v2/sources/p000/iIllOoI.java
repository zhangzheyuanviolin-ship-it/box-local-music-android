            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class iIllOoI {
                public static final I0oloIO0 I00000oIO = new I0oloIO0(2);

                public static final void I00000oIO(Ol11i0 ol11i0, ArrayList arrayList, int i) {
/* 1 */             boolean zI000l1 = ol11i0.I000l1(i);
/* 5 */             int[] iArr = ol11i0.I00000oOI;
/* 7 */             if (zI000l1) {
/* 13 */                arrayList.add(ol11i0.I000o00OoI0I(i));
/* 16 */                return;
                    }
/* 23 */            int iI00000oOI = Ol11iOOOoo1.I00000oOI(iArr, i) + i;
/* 24 */            for (int i2 = i + 1; i2 < iI00000oOI; i2 += iArr[(i2 * 5) + 3]) {
/* 26 */                I00000oIO(ol11i0, arrayList, i2);
                    }
                }

                public static final int I00000oOI(int i, List list) {
                    int size = list.size() - 1;
/* 7 */             int i2 = 0;
/* 8 */             while (i2 <= size) {
/* 12 */                int i3 = (i2 + size) >>> 1;
/* 22 */                int iI0000oI00 = O0000Ioio00.I0000oI00(((O00I0lllo) list.get(i3)).I00000oOI, i);
/* 26 */                if (iI0000oI00 < 0) {
/* 28 */                    i2 = i3 + 1;
                        } else {
/* 31 */                    if (iI0000oI00 <= 0) {
/* 36 */                        return i3;
                            }
                            size = i3 - 1;
                        }
                    }
/* 39 */            return -(i2 + 1);
                }

                public static final void I0000Il00O(Ol11il011o0 ol11il011o0, int i, Object obj) {
/* 1 */             int iI000II = ol11il011o0.I000II(i);
/* 5 */             Object[] objArr = ol11il011o0.I0000Il00O;
/* 7 */             Object obj2 = objArr[iI000II];
/* 11 */            objArr[iI000II] = IOl11li.I00000oIO;
/* 13 */            if (obj == obj2) {
/* 15 */                return;
                    }
/* 43 */            IOl1II00.I00000oIO("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
                }

                public static final void I0000O(int i, int i2, List list) {
/* 1 */             int iI00000oOI = I00000oOI(i, list);
/* 5 */             if (iI00000oOI < 0) {
/* 9 */                 iI00000oOI = -(iI00000oOI + 1);
                    }
/* 14 */            while (iI00000oOI < list.size() && ((O00I0lllo) list.get(iI00000oOI)).I00000oOI < i2) {
                    }
                }
            }

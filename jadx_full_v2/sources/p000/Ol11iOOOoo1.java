            package p000;

            import java.util.ArrayList;
            import java.util.ConcurrentModificationException;
            
            public abstract class Ol11iOOOoo1 {
                public static final Ol11i0000Oo I00000oIO(Ol11i0000Oo ol11i0000Oo) {
/* 4 */             if (!(ol11i0000Oo instanceof Ol11i0000Oo)) {
/* 7 */                 ol11i0000Oo = null;
                    }
/* 8 */             if (ol11i0000Oo != null) {
/* 10 */                return ol11i0000Oo;
                    }
/* 13 */            IOl1II00.I00000oOI("Inconsistent composition");
/* 16 */            IOOlIIilOl0.I0000Il00O();
/* 3 */             return null;
                }

                public static final int I00000oOI(int[] iArr, int i) {
/* 5 */             return iArr[(i * 5) + 3];
                }

                public static final int I0000Il00O(ArrayList arrayList, int i, int i2) {
/* 1 */             int iI0000O = I0000O(arrayList, i, i2);
                    return iI0000O >= 0 ? iI0000O : -(iI0000O + 1);
                }

                public static final int I0000O(ArrayList arrayList, int i, int i2) {
                    int size = arrayList.size() - 1;
/* 7 */             int i3 = 0;
/* 8 */             while (i3 <= size) {
/* 12 */                int i4 = (i3 + size) >>> 1;
/* 20 */                int i5 = ((Ilo1iIi1OI01) arrayList.get(i4)).I00000oIO;
/* 22 */                if (i5 < 0) {
/* 24 */                    i5 += i2;
                        }
/* 25 */                int iI0000oI00 = O0000Ioio00.I0000oI00(i5, i);
/* 29 */                if (iI0000oI00 < 0) {
/* 31 */                    i3 = i4 + 1;
                        } else {
/* 34 */                    if (iI0000oI00 <= 0) {
/* 39 */                        return i4;
                            }
                            size = i4 - 1;
                        }
                    }
/* 42 */            return -(i3 + 1);
                }

                public static final int I0000oI00(int[] iArr, int i) {
/* 1 */             int i2 = i * 5;
/* 17 */            return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
                }

                public static final void I0001Ioi1lo() {
/* 20 */            throw new ConcurrentModificationException();
                }

                public static final void I000II(int i, int i2, int[] iArr) {
/* 1 */             if (i2 >= 0) {
                    }
/* 8 */             int i3 = (i * 5) + 1;
/* 16 */            iArr[i3] = i2 | (iArr[i3] & (-67108864));
                }
            }

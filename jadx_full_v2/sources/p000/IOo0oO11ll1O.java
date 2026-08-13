            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOo0oO11ll1O {
                public long I00000oIO;

                public static final IOo0oO11ll1O I00000oIO(long j) {
/* 3 */             IOo0oO11ll1O iOo0oO11ll1O = new IOo0oO11ll1O();
/* 6 */             iOo0oO11ll1O.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iOo0oO11ll1O;
                }

                public static final long I00000oOI(int i, int i2, int i3, int i4) {
/* 1 */             if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
/* 12 */                Ioliol1Ii.I00000oIO("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                    }
/* 15 */            return IOo0olo.I000O01llI0(i, i2, i3, i4);
                }

                public static long I0000Il00O(long j, int i, int i2, int i3, int i4, int i5) {
/* 3 */             if ((i5 & 1) != 0) {
/* 5 */                 i = I000l1(j);
                    }
/* 11 */            if ((i5 & 2) != 0) {
/* 13 */                i2 = I000OiO(j);
                    }
/* 19 */            if ((i5 & 4) != 0) {
/* 21 */                i3 = I000iOII(j);
                    }
/* 27 */            if ((i5 & 8) != 0) {
/* 29 */                i4 = I000OOo1O(j);
                    }
/* 33 */            return I00000oOI(i, i2, i3, i4);
                }

                public static final boolean I0000O(long j, long j2) {
                    return j == j2;
                }

                public static final boolean I0000oI00(long j) {
/* 4 */             int i = (int) (3 & j);
/* 14 */            int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
                    return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
                }

                public static final boolean I0001Ioi1lo(long j) {
/* 4 */             int i = (int) (3 & j);
                    return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
                }

                public static final boolean I000II(long j) {
/* 4 */             int i = (int) (3 & j);
/* 14 */            int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
/* 19 */            int i3 = (1 << (18 - i2)) - 1;
/* 25 */            int i4 = ((int) (j >> (i2 + 15))) & i3;
/* 30 */            int i5 = ((int) (j >> (i2 + 46))) & i3;
                    return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
                }

                public static final boolean I000O01llI0(long j) {
/* 4 */             int i = (int) (3 & j);
/* 19 */            int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
/* 23 */            int i3 = ((int) (j >> 2)) & i2;
/* 28 */            int i4 = ((int) (j >> 33)) & i2;
                    return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
                }

                public static final int I000OOo1O(long j) {
/* 4 */             int i = (int) (3 & j);
/* 14 */            int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
/* 24 */            int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
/* 25 */            if (i3 == 0) {
/* 27 */                return Integer.MAX_VALUE;
                    }
/* 31 */            return i3 - 1;
                }

                public static final int I000OiO(long j) {
/* 4 */             int i = (int) (3 & j);
/* 23 */            int i2 = (int) (j >> 33);
/* 24 */            int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
/* 25 */            if (i3 == 0) {
/* 27 */                return Integer.MAX_VALUE;
                    }
/* 31 */            return i3 - 1;
                }

                public static final int I000iOII(long j) {
/* 4 */             int i = (int) (3 & j);
/* 14 */            int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
/* 24 */            return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
                }

                public static final int I000l1(long j) {
/* 4 */             int i = (int) (3 & j);
/* 22 */            return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
                }

                public static String I000lI(long j) {
/* 1 */             int iI000OiO = I000OiO(j);
/* 14 */            String strValueOf = iI000OiO == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iI000OiO);
/* 18 */            int iI000OOo1O = I000OOo1O(j);
/* 25 */            String strValueOf2 = iI000OOo1O != Integer.MAX_VALUE ? String.valueOf(iI000OOo1O) : "Infinity";
/* 76 */            return "Constraints(minWidth = " + I000l1(j) + ", maxWidth = " + strValueOf + ", minHeight = " + I000iOII(j) + ", maxHeight = " + strValueOf2 + ")";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IOo0oO11ll1O) && this.I00000oIO == ((IOo0oO11ll1O) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I000lI(this.I00000oIO);
                }
            }

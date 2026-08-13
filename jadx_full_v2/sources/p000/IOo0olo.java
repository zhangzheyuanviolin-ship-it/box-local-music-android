            package p000;
            
            public abstract class IOo0olo {
                public static final long I00000oIO(int i, int i2, int i3, int i4) {
/* 24 */            if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
/* 28 */                Ioliol1Ii.I00000oIO("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                    }
/* 31 */            return I000O01llI0(i, i2, i3, i4);
                }

                public static long I00000oOI(int i, int i2, int i3, int i4, int i5) {
/* 4 */             if ((i5 & 1) != 0) {
/* 6 */                 i = 0;
                    }
/* 12 */            if ((i5 & 2) != 0) {
/* 14 */                i2 = Integer.MAX_VALUE;
                    }
/* 17 */            if ((i5 & 4) != 0) {
/* 19 */                i3 = 0;
                    }
/* 22 */            if ((i5 & 8) != 0) {
/* 24 */                i4 = Integer.MAX_VALUE;
                    }
/* 25 */            return I00000oIO(i, i2, i3, i4);
                }

                public static final int I0000Il00O(int i) {
/* 3 */             if (i < 8191) {
/* 5 */                 return 13;
                    }
/* 10 */            if (i < 32767) {
/* 12 */                return 15;
                    }
/* 18 */            if (i < 65535) {
/* 20 */                return 16;
                    }
                    return i < 262143 ? 18 : 255;
                }

                public static final long I0000O(long j, long j2) {
/* 5 */             int i = (int) (j2 >> 32);
/* 6 */             int iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 10 */            int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 14 */            if (i < iI000l1) {
/* 16 */                i = iI000l1;
                    }
/* 17 */            if (i <= iI000OiO) {
/* 20 */                iI000OiO = i;
                    }
/* 27 */            int i2 = (int) (j2 & 4294967295L);
/* 28 */            int iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 32 */            int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 36 */            if (i2 < iI000iOII) {
/* 38 */                i2 = iI000iOII;
                    }
/* 39 */            if (i2 <= iI000OOo1O) {
/* 42 */                iI000OOo1O = i2;
                    }
/* 48 */            return (iI000OiO << 32) | (iI000OOo1O & 4294967295L);
                }

                public static final long I0000oI00(long j, long j2) {
/* 1 */             int iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 5 */             int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 9 */             int iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 13 */            int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 17 */            int iI000l12 = IOo0oO11ll1O.I000l1(j2);
/* 21 */            if (iI000l12 < iI000l1) {
/* 23 */                iI000l12 = iI000l1;
                    }
/* 24 */            if (iI000l12 > iI000OiO) {
/* 26 */                iI000l12 = iI000OiO;
                    }
/* 27 */            int iI000OiO2 = IOo0oO11ll1O.I000OiO(j2);
/* 31 */            if (iI000OiO2 >= iI000l1) {
/* 34 */                iI000l1 = iI000OiO2;
                    }
/* 35 */            if (iI000l1 <= iI000OiO) {
/* 38 */                iI000OiO = iI000l1;
                    }
/* 39 */            int iI000iOII2 = IOo0oO11ll1O.I000iOII(j2);
/* 43 */            if (iI000iOII2 < iI000iOII) {
/* 45 */                iI000iOII2 = iI000iOII;
                    }
/* 46 */            if (iI000iOII2 > iI000OOo1O) {
/* 48 */                iI000iOII2 = iI000OOo1O;
                    }
/* 49 */            int iI000OOo1O2 = IOo0oO11ll1O.I000OOo1O(j2);
/* 53 */            if (iI000OOo1O2 >= iI000iOII) {
/* 56 */                iI000iOII = iI000OOo1O2;
                    }
/* 57 */            if (iI000iOII <= iI000OOo1O) {
/* 60 */                iI000OOo1O = iI000iOII;
                    }
/* 61 */            return I00000oIO(iI000l12, iI000OiO, iI000iOII2, iI000OOo1O);
                }

                public static final int I0001Ioi1lo(int i, long j) {
/* 1 */             int iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 5 */             int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 9 */             if (i < iI000iOII) {
/* 11 */                i = iI000iOII;
                    }
                    return i > iI000OOo1O ? iI000OOo1O : i;
                }

                public static final int I000II(int i, long j) {
/* 1 */             int iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 5 */             int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 9 */             if (i < iI000l1) {
/* 11 */                i = iI000l1;
                    }
                    return i > iI000OiO ? iI000OiO : i;
                }

                public static final long I000O01llI0(int i, int i2, int i3, int i4) {
/* 8 */             int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
/* 9 */             int iI0000Il00O = I0000Il00O(i5);
/* 17 */            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
/* 18 */            int iI0000Il00O2 = I0000Il00O(i6);
/* 25 */            if (iI0000Il00O + iI0000Il00O2 > 31) {
/* 27 */                I000iOII(i6, i5);
                    }
/* 30 */            int i7 = i2 + 1;
/* 36 */            int i8 = i4 + 1;
                    int i9 = iI0000Il00O2 - 13;
/* 69 */            return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (iI0000Il00O2 + 2)) | ((i8 & (~(i8 >> 31))) << (iI0000Il00O2 + 33));
                }

                public static final long I000OOo1O(long j, int i, int i2) {
/* 5 */             int iI000l1 = IOo0oO11ll1O.I000l1(j) + i;
/* 7 */             if (iI000l1 < 0) {
/* 9 */                 iI000l1 = 0;
                    }
/* 10 */            int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 17 */            if (iI000OiO != Integer.MAX_VALUE && (iI000OiO = iI000OiO + i) < 0) {
/* 23 */                iI000OiO = 0;
                    }
/* 28 */            int iI000iOII = IOo0oO11ll1O.I000iOII(j) + i2;
/* 29 */            if (iI000iOII < 0) {
/* 31 */                iI000iOII = 0;
                    }
/* 32 */            int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 43 */            return I00000oIO(iI000l1, iI000OiO, iI000iOII, (iI000OOo1O == Integer.MAX_VALUE || (iI000OOo1O = iI000OOo1O + i2) >= 0) ? iI000OOo1O : 0);
                }

                public static long I000OiO(int i, int i2, int i3, long j) {
/* 4 */             if ((i3 & 1) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                i2 = 0;
                    }
/* 12 */            return I000OOo1O(j, i, i2);
                }

                public static final void I000iOII(int i, int i2) {
/* 37 */            throw new IllegalArgumentException(Oi010OO0.I0010o("Can't represent a width of ", i, " and height of ", i2, " in Constraints"));
                }

                public static final Void I000l1(int i) {
/* 29 */            throw new IllegalArgumentException(IIlIOloOOO.I00100l0("Can't represent a size of ", i, " in Constraints"));
                }
            }

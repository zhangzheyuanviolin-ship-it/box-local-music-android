            package p000;

            import java.util.Arrays;
            
            public final class iI0Ol11Il010 {
                public static final iI0Ol11Il010 I0000oI00 = new iI0Ol11Il010(0, new int[0], new Object[0], false);
                public int I00000oIO;
                public int[] I00000oOI;
                public Object[] I0000Il00O;
                public boolean I0000O;

                public iI0Ol11Il010(int i, int[] iArr, Object[] objArr, boolean z) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = iArr;
/* 8 */             this.I0000Il00O = objArr;
/* 10 */            this.I0000O = z;
                }

                public static iI0Ol11Il010 I00000oIO() {
/* 11 */            return new iI0Ol11Il010(0, new int[8], new Object[8], true);
                }

                public final void I00000oOI(int i, Object obj) {
/* 3 */             if (!this.I0000O) {
/* 27 */                OIiilo1Ool0o.I000lI();
/* 37 */                return;
                    }
/* 9 */             I0000Il00O(this.I00000oIO + 1);
/* 12 */            int[] iArr = this.I00000oOI;
/* 14 */            int i2 = this.I00000oIO;
/* 16 */            iArr[i2] = i;
/* 20 */            this.I0000Il00O[i2] = obj;
/* 24 */            this.I00000oIO = i2 + 1;
                }

                public final void I0000Il00O(int i) {
/* 1 */             int[] iArr = this.I00000oOI;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.I00000oIO;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 13 */                    i = i3;
                        }
/* 16 */                if (i < 8) {
/* 18 */                    i = 8;
                        }
/* 23 */                this.I00000oOI = Arrays.copyOf(iArr, i);
/* 31 */                this.I0000Il00O = Arrays.copyOf(this.I0000Il00O, i);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 60 */                return true;
                    }
/* 5 */             if (obj != null && (obj instanceof iI0Ol11Il010)) {
/* 13 */                iI0Ol11Il010 ii0ol11il010 = (iI0Ol11Il010) obj;
/* 15 */                int i = this.I00000oIO;
/* 19 */                if (i == ii0ol11il010.I00000oIO) {
/* 21 */                    int[] iArr = this.I00000oOI;
/* 23 */                    int[] iArr2 = ii0ol11il010.I00000oOI;
/* 25 */                    int i2 = 0;
                            while (true) {
/* 26 */                        if (i2 >= i) {
/* 38 */                            Object[] objArr = this.I0000Il00O;
/* 40 */                            Object[] objArr2 = ii0ol11il010.I0000Il00O;
/* 42 */                            int i3 = this.I00000oIO;
/* 45 */                            for (int i4 = 0; i4 < i3; i4++) {
/* 55 */                                if (objArr[i4].equals(objArr2[i4])) {
                                        }
                                    }
/* 60 */                            return true;
                                }
/* 32 */                        if (iArr[i2] != iArr2[i2]) {
                                    break;
                                }
/* 35 */                        i2++;
                            }
                        }
                    }
/* 4 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = i + 527;
/* 5 */             int[] iArr = this.I00000oOI;
/* 8 */             int iHashCode = 17;
/* 11 */            int i3 = 17;
/* 12 */            for (int i4 = 0; i4 < i; i4++) {
/* 18 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 25 */            int i5 = ((i2 * 31) + i3) * 31;
/* 27 */            Object[] objArr = this.I0000Il00O;
/* 29 */            int i6 = this.I00000oIO;
/* 31 */            for (int i7 = 0; i7 < i6; i7++) {
/* 41 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return i5 + iHashCode;
                }
            }

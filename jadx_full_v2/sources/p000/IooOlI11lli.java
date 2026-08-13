            package p000;

            import java.util.Arrays;
            
/* 9 */     public final class IooOlI11lli {
                public int[] I00000oIO;
                public int I00000oOI;

                public IooOlI11lli() {
/* 8 */             this.I00000oIO = new int[10];
                }

                public int I00000oIO(int i) {
                    int i2 = this.I00000oOI - 1;
                    return i2 >= 0 ? this.I00000oIO[i2] : i;
                }

                public int I00000oOI() {
/* 1 */             int[] iArr = this.I00000oIO;
                    int i = this.I00000oOI - 1;
/* 7 */             this.I00000oOI = i;
/* 9 */             return iArr[i];
                }

                public void I0000Il00O(int i) {
/* 1 */             int[] iArrCopyOf = this.I00000oIO;
/* 6 */             if (this.I00000oOI >= iArrCopyOf.length) {
/* 11 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
/* 15 */                this.I00000oIO = iArrCopyOf;
                    }
/* 17 */            int i2 = this.I00000oOI;
/* 21 */            this.I00000oOI = i2 + 1;
/* 23 */            iArrCopyOf[i2] = i;
                }

                public void I0000O(int i, int i2, int i3) {
/* 1 */             int i4 = this.I00000oOI;
/* 3 */             int[] iArrCopyOf = this.I00000oIO;
/* 5 */             int i5 = i4 + 3;
/* 8 */             if (i5 >= iArrCopyOf.length) {
/* 13 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
/* 17 */                this.I00000oIO = iArrCopyOf;
                    }
/* 20 */            iArrCopyOf[i4] = i + i3;
/* 25 */            iArrCopyOf[i4 + 1] = i2 + i3;
/* 29 */            iArrCopyOf[i4 + 2] = i3;
/* 31 */            this.I00000oOI = i5;
                }

                public void I0000oI00(int i, int i2, int i3, int i4) {
/* 1 */             int i5 = this.I00000oOI;
/* 3 */             int[] iArrCopyOf = this.I00000oIO;
/* 5 */             int i6 = i5 + 4;
/* 8 */             if (i6 >= iArrCopyOf.length) {
/* 13 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
/* 17 */                this.I00000oIO = iArrCopyOf;
                    }
/* 19 */            iArrCopyOf[i5] = i;
/* 23 */            iArrCopyOf[i5 + 1] = i2;
/* 27 */            iArrCopyOf[i5 + 2] = i3;
/* 31 */            iArrCopyOf[i5 + 3] = i4;
/* 33 */            this.I00000oOI = i6;
                }

                public void I0001Ioi1lo(int i, int i2) {
/* 1 */             if (i < i2) {
                        int i3 = i - 3;
/* 6 */                 for (int i4 = i; i4 < i2; i4 += 3) {
/* 8 */                     int[] iArr = this.I00000oIO;
/* 10 */                    int i5 = iArr[i4];
/* 12 */                    int i6 = iArr[i2];
/* 14 */                    if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
/* 28 */                        i3 += 3;
/* 30 */                        I000II(i3, i4);
                            }
                        }
/* 38 */                I000II(i3 + 3, i2);
/* 41 */                I0001Ioi1lo(i, i3);
/* 46 */                I0001Ioi1lo(i3 + 6, i2);
                    }
                }

                public void I000II(int i, int i2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i3 = iArr[i];
/* 7 */             iArr[i] = iArr[i2];
/* 9 */             iArr[i2] = i3;
/* 11 */            int i4 = i + 1;
/* 13 */            int i5 = i2 + 1;
/* 15 */            int i6 = iArr[i4];
/* 19 */            iArr[i4] = iArr[i5];
/* 21 */            iArr[i5] = i6;
/* 23 */            int i7 = i + 2;
/* 25 */            int i8 = i2 + 2;
/* 27 */            int i9 = iArr[i7];
/* 31 */            iArr[i7] = iArr[i8];
/* 33 */            iArr[i8] = i9;
                }

/* 10 */        public IooOlI11lli(int i) {
/* 12 */            this.I00000oIO = new int[i];
                }
            }

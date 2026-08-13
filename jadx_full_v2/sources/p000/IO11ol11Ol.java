            package p000;

            import java.util.Arrays;
            
/* 9 */     public final class IO11ol11Ol {
                public int[] I00000oIO;

                public IO11ol11Ol(int i) {
/* 8 */             this.I00000oIO = new int[]{i};
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof IO11ol11Ol) {
/* 6 */                 IO11ol11Ol iO11ol11Ol = (IO11ol11Ol) obj;
/* 8 */                 int[] iArr = this.I00000oIO;
/* 10 */                int i = iArr[0];
/* 15 */                if (i == 12) {
/* 17 */                    int[] iArr2 = iO11ol11Ol.I00000oIO;
/* 21 */                    if (iArr2[0] == 12) {
                                return (iArr.length <= 1 || iArr2.length <= 1) ? iArr.length == iArr2.length : iArr[1] == iArr2[1];
                            }
                        }
/* 47 */                if (i == iO11ol11Ol.I00000oIO[0]) {
/* 14 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = iArr[0];
                    return (i != 12 || iArr.length <= 1) ? i : iArr[1] ^ i;
                }

                public final String toString() {
/* 3 */             return Arrays.toString(this.I00000oIO);
                }

/* 10 */        public IO11ol11Ol(int i, int i2) {
/* 13 */            this.I00000oIO = new int[]{i, i2};
                }
            }

            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Oio10I11IIi {
                public int I00000oIO;
                public final int[] I00000oOI = new int[10];

                public final int I00000oIO() {
/* 5 */             if ((this.I00000oIO & Barcode.FORMAT_ITF) != 0) {
/* 10 */                return this.I00000oOI[7];
                    }
/* 13 */            return 65535;
                }

                public final void I00000oOI(int i, int i2) {
/* 1 */             if (i >= 0) {
/* 3 */                 int[] iArr = this.I00000oOI;
/* 6 */                 if (i >= iArr.length) {
/* 89 */                    return;
                        }
/* 14 */                this.I00000oIO = (1 << i) | this.I00000oIO;
/* 16 */                iArr[i] = i2;
                    }
                }
            }

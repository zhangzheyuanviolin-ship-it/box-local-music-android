            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class OooO0oI1 {
                public static final OooO0oI1 I0000O = new OooO0oI1(Barcode.FORMAT_QR_CODE, Barcode.FORMAT_QR_CODE, Barcode.FORMAT_QR_CODE);
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public OooO0oI1(int i, int i2, int i3) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OooO0oI1)) {
/* 7 */                 return false;
                    }
/* 11 */            OooO0oI1 oooO0oI1 = (OooO0oI1) obj;
                    return this.I00000oIO == oooO0oI1.I00000oIO && this.I00000oOI == oooO0oI1.I00000oOI && this.I0000Il00O == oooO0oI1.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
/* 7 */             int i3 = this.I00000oIO;
/* 9 */             if (i2 == 0) {
/* 13 */                StringBuilder sb = new StringBuilder();
/* 16 */                sb.append(i3);
/* 19 */                sb.append('.');
/* 22 */                sb.append(i);
/* 25 */                return sb.toString();
                    }
/* 32 */            StringBuilder sb2 = new StringBuilder();
/* 35 */            sb2.append(i3);
/* 38 */            sb2.append('.');
/* 41 */            sb2.append(i);
/* 44 */            sb2.append('.');
/* 47 */            sb2.append(i2);
/* 50 */            return sb2.toString();
                }
            }

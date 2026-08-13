            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class Io1i1io {
                public static final int[] I00000oIO;
                public static final long[] I00000oOI;

                static {
/* 3 */             int[] iArr = new int[Barcode.FORMAT_QR_CODE];
/* 5 */             int i = 0;
/* 9 */             for (int i2 = 0; i2 < 256; i2++) {
/* 26 */                iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
                    }
/* 31 */            I00000oIO = iArr;
/* 33 */            int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
/* 38 */            for (int i3 = 0; i3 < 256; i3++) {
/* 55 */                iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
                    }
/* 60 */            int[] iArr3 = new int[Barcode.FORMAT_QR_CODE];
/* 63 */            for (int i4 = 0; i4 < 256; i4++) {
/* 66 */                iArr3[i4] = -1;
                    }
/* 71 */            int i5 = 0;
/* 72 */            int i6 = 0;
/* 77 */            while (i5 < "0123456789abcdef".length()) {
/* 85 */                iArr3["0123456789abcdef".charAt(i5)] = i6;
/* 87 */                i5++;
/* 83 */                i6++;
                    }
/* 91 */            int i7 = 0;
/* 92 */            int i8 = 0;
/* 97 */            while (i7 < "0123456789ABCDEF".length()) {
/* 105 */               iArr3["0123456789ABCDEF".charAt(i7)] = i8;
/* 107 */               i7++;
/* 103 */               i8++;
                    }
/* 111 */           long[] jArr = new long[Barcode.FORMAT_QR_CODE];
/* 114 */           for (int i9 = 0; i9 < 256; i9++) {
/* 118 */               jArr[i9] = -1;
                    }
/* 123 */           int i10 = 0;
/* 124 */           int i11 = 0;
/* 129 */           while (i10 < "0123456789abcdef".length()) {
/* 138 */               jArr["0123456789abcdef".charAt(i10)] = i11;
/* 140 */               i10++;
/* 135 */               i11++;
                    }
/* 144 */           int i12 = 0;
/* 149 */           while (i < "0123456789ABCDEF".length()) {
/* 158 */               jArr["0123456789ABCDEF".charAt(i)] = i12;
/* 160 */               i++;
/* 155 */               i12++;
                    }
/* 164 */           I00000oOI = jArr;
                }
            }

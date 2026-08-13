            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class Ooi1lIi1 {
                public static final short[] I00000oIO = new short[Barcode.FORMAT_ITF];
                public static final byte[] I00000oOI;

                static {
/* 9 */             byte[] bArr = new byte[112];
/* 11 */            I00000oOI = bArr;
/* 13 */            byte[] bArr2 = new byte[Barcode.FORMAT_ITF];
/* 19 */            I00000oIO(bArr2, 0, 15, (byte) 1);
/* 27 */            I00000oIO(bArr2, 16, 31, (byte) 2);
/* 35 */            I00000oIO(bArr2, 32, 63, (byte) 3);
/* 42 */            I00000oIO(bArr2, 64, 65, (byte) 0);
/* 50 */            I00000oIO(bArr2, 66, 95, (byte) 4);
/* 56 */            I00000oIO(bArr2, 96, 96, (byte) 5);
/* 64 */            I00000oIO(bArr2, 97, 108, (byte) 6);
/* 70 */            I00000oIO(bArr2, 109, 109, (byte) 7);
/* 77 */            I00000oIO(bArr2, 110, 111, (byte) 6);
/* 82 */            I00000oIO(bArr2, 112, 112, (byte) 8);
/* 91 */            I00000oIO(bArr2, 113, 115, (byte) 9);
/* 98 */            I00000oIO(bArr2, 116, 116, (byte) 10);
/* 105 */           I00000oIO(bArr2, 117, 127, (byte) 0);
/* 111 */           I00000oIO(bArr, 0, bArr.length - 1, (byte) -2);
/* 117 */           I00000oIO(bArr, 8, 11, (byte) -1);
/* 124 */           I00000oIO(bArr, 24, 27, (byte) 0);
/* 131 */           I00000oIO(bArr, 40, 43, (byte) 16);
/* 138 */           I00000oIO(bArr, 58, 59, (byte) 0);
/* 145 */           I00000oIO(bArr, 72, 73, (byte) 0);
/* 152 */           I00000oIO(bArr, 89, 91, (byte) 16);
/* 157 */           I00000oIO(bArr, 104, 104, (byte) 16);
/* 160 */           byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
/* 165 */           byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
/* 170 */           for (int i = 0; i < 128; i++) {
/* 172 */               byte b = bArr2[i];
/* 184 */               I00000oIO[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
                    }
                }

                public static void I00000oIO(byte[] bArr, int i, int i2, byte b) {
/* 1 */             while (i <= i2) {
/* 3 */                 bArr[i] = b;
/* 5 */                 i++;
                    }
                }
            }

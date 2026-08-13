            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Arrays;
            
            public abstract class I1oI0olIl {
                public static final byte[] I00000oIO;
                public static final int[] I00000oOI;
                public static final byte[] I0000Il00O;
                public static final int[] I0000O;

                static {
/* 3 */             byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
/* 8 */             I00000oIO = bArr;
/* 12 */            int[] iArr = new int[Barcode.FORMAT_QR_CODE];
/* 14 */            int i = 0;
/* 16 */            Arrays.fill(iArr, 0, Barcode.FORMAT_QR_CODE, -1);
/* 22 */            iArr[61] = -2;
/* 24 */            int i2 = 0;
/* 25 */            int i3 = 0;
/* 26 */            while (i2 < 64) {
/* 32 */                iArr[bArr[i2]] = i3;
/* 34 */                i2++;
/* 30 */                i3++;
                    }
/* 38 */            I00000oOI = iArr;
/* 40 */            byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
/* 45 */            I0000Il00O = bArr2;
/* 47 */            int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
/* 49 */            Arrays.fill(iArr2, 0, Barcode.FORMAT_QR_CODE, -1);
/* 52 */            iArr2[61] = -2;
/* 54 */            int i4 = 0;
/* 55 */            while (i < 64) {
/* 61 */                iArr2[bArr2[i]] = i4;
/* 63 */                i++;
/* 59 */                i4++;
                    }
/* 67 */            I0000O = iArr2;
                }
            }

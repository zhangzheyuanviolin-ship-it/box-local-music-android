            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            
            public abstract class ill1iI {
                static {
/* 4 */             new ill0OO1(0);
                }

                public static byte[] I00000oIO(InputStream inputStream) throws IOException {
/* 1 */             inputStream.getClass();
/* 8 */             ArrayDeque arrayDeque = new ArrayDeque(20);
/* 12 */            int iHighestOneBit = Integer.highestOneBit(0);
/* 25 */            int iMin = Math.min(8192, Math.max(Barcode.FORMAT_ITF, iHighestOneBit + iHighestOneBit));
/* 29 */            int i = 0;
/* 34 */            while (i < 2147483639) {
/* 37 */                int iMin2 = Math.min(iMin, 2147483639 - i);
/* 41 */                byte[] bArr = new byte[iMin2];
/* 43 */                arrayDeque.add(bArr);
/* 46 */                int i2 = 0;
/* 47 */                while (i2 < iMin2) {
/* 51 */                    int i3 = inputStream.read(bArr, i2, iMin2 - i2);
/* 55 */                    if (i3 == -1) {
/* 57 */                        return I00000oOI(arrayDeque, i);
                            }
/* 62 */                    i2 += i3;
/* 63 */                    i += i3;
                        }
/* 74 */                long j = iMin * (iMin < 4096 ? 4 : 2);
/* 96 */                iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
                    }
/* 102 */           if (inputStream.read() == -1) {
/* 104 */               return I00000oOI(arrayDeque, 2147483639);
                    }
/* 168 */           throw new OutOfMemoryError("input is too large to fit in a byte array");
                }

                public static byte[] I00000oOI(ArrayDeque arrayDeque, int i) {
/* 6 */             if (arrayDeque.isEmpty()) {
/* 8 */                 return new byte[0];
                    }
/* 15 */            byte[] bArr = (byte[]) arrayDeque.remove();
/* 17 */            int length = bArr.length;
/* 18 */            if (length == i) {
/* 20 */                return bArr;
                    }
/* 21 */            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
/* 25 */            int i2 = i - length;
/* 27 */            while (i2 > 0) {
/* 33 */                byte[] bArr2 = (byte[]) arrayDeque.remove();
/* 36 */                int iMin = Math.min(i2, bArr2.length);
/* 42 */                System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
/* 45 */                i2 -= iMin;
                    }
/* 106 */           return bArrCopyOf;
                }
            }

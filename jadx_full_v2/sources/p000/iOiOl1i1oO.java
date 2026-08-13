            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            
            public abstract class iOiOl1i1oO {
                public static byte[] I00000oIO(ArrayDeque arrayDeque, int i) {
/* 6 */             if (arrayDeque.isEmpty()) {
/* 8 */                 return new byte[0];
                    }
/* 15 */            byte[] bArr = (byte[]) arrayDeque.remove();
/* 18 */            if (bArr.length == i) {
/* 20 */                return bArr;
                    }
/* 22 */            int length = i - bArr.length;
/* 24 */            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
/* 28 */            while (length > 0) {
/* 34 */                byte[] bArr2 = (byte[]) arrayDeque.remove();
/* 37 */                int iMin = Math.min(length, bArr2.length);
/* 43 */                System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
/* 46 */                length -= iMin;
                    }
/* 89 */            return bArrCopyOf;
                }

                public static byte[] I00000oOI(IIO11OII01ii iIO11OII01ii) throws IOException {
/* 5 */             ArrayDeque arrayDeque = new ArrayDeque(20);
/* 23 */            int iMin = Math.min(8192, Math.max(Barcode.FORMAT_ITF, Integer.highestOneBit(0) * 2));
/* 27 */            int i = 0;
/* 32 */            while (i < 2147483639) {
/* 35 */                int iMin2 = Math.min(iMin, 2147483639 - i);
/* 39 */                byte[] bArr = new byte[iMin2];
/* 41 */                arrayDeque.add(bArr);
/* 44 */                int i2 = 0;
/* 45 */                while (i2 < iMin2) {
/* 49 */                    int i3 = iIO11OII01ii.read(bArr, i2, iMin2 - i2);
/* 53 */                    if (i3 == -1) {
/* 55 */                        return I00000oIO(arrayDeque, i);
                            }
/* 60 */                    i2 += i3;
/* 61 */                    i += i3;
                        }
/* 72 */                long j = iMin * (iMin < 4096 ? 4 : 2);
/* 94 */                iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
                    }
/* 100 */           if (iIO11OII01ii.read() == -1) {
/* 102 */               return I00000oIO(arrayDeque, 2147483639);
                    }
/* 186 */           throw new OutOfMemoryError("input is too large to fit in a byte array");
                }
            }

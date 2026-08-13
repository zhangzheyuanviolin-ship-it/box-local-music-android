            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            import java.util.Queue;
            
            public final class zzij {
                static {
/* 3 */             new zzii();
                }

                public static byte[] zza(InputStream inputStream) throws IOException {
/* 5 */             ArrayDeque arrayDeque = new ArrayDeque(20);
/* 9 */             int iHighestOneBit = Integer.highestOneBit(0);
/* 22 */            int iMin = Math.min(8192, Math.max(Barcode.FORMAT_ITF, iHighestOneBit + iHighestOneBit));
/* 26 */            int i = 0;
/* 31 */            while (i < 2147483639) {
/* 34 */                int iMin2 = Math.min(iMin, 2147483639 - i);
/* 38 */                byte[] bArr = new byte[iMin2];
/* 40 */                arrayDeque.add(bArr);
/* 43 */                int i2 = 0;
/* 44 */                while (i2 < iMin2) {
/* 48 */                    int i3 = inputStream.read(bArr, i2, iMin2 - i2);
/* 52 */                    if (i3 == -1) {
/* 54 */                        return zzb(arrayDeque, i);
                            }
/* 59 */                    i2 += i3;
/* 60 */                    i += i3;
                        }
/* 72 */                iMin = zzin.zza(iMin * (iMin < 4096 ? 4 : 2));
                    }
/* 81 */            if (inputStream.read() == -1) {
/* 83 */                return zzb(arrayDeque, 2147483639);
                    }
/* 168 */           throw new OutOfMemoryError("input is too large to fit in a byte array");
                }

                private static byte[] zzb(Queue queue, int i) {
/* 6 */             if (queue.isEmpty()) {
/* 8 */                 return new byte[0];
                    }
/* 15 */            byte[] bArr = (byte[]) queue.remove();
/* 17 */            int length = bArr.length;
/* 18 */            if (length == i) {
/* 20 */                return bArr;
                    }
/* 21 */            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
/* 25 */            int i2 = i - length;
/* 27 */            while (i2 > 0) {
/* 33 */                byte[] bArr2 = (byte[]) queue.remove();
/* 36 */                int iMin = Math.min(i2, bArr2.length);
/* 42 */                System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
/* 45 */                i2 -= iMin;
                    }
/* 106 */           return bArrCopyOf;
                }
            }

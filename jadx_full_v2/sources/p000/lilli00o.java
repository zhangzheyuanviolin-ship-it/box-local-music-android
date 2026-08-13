            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.ByteBuffer;
            
            public abstract class lilli00o {
                public static ByteBuffer I00000oIO(Bitmap bitmap) {
/* 1 */             int width = bitmap.getWidth();
/* 5 */             int height = bitmap.getHeight();
/* 9 */             int i = width * height;
/* 11 */            int[] iArr = new int[i];
/* 19 */            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
/* 30 */            int iCeil = (int) Math.ceil(height / 2.0d);
/* 41 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i);
/* 46 */            int i2 = 0;
/* 47 */            int i3 = 0;
/* 48 */            for (int i4 = 0; i4 < height; i4++) {
/* 50 */                int i5 = 0;
/* 51 */                while (i5 < width) {
/* 53 */                    int i6 = iArr[i3];
/* 55 */                    int i7 = i6 >> 16;
/* 57 */                    int i8 = i6 >> 8;
/* 61 */                    int i9 = i6 & 255;
/* 62 */                    int i10 = i2 + 1;
/* 64 */                    int i11 = i7 & 255;
/* 65 */                    int i12 = i8 & 255;
/* 85 */                    byteBufferAllocateDirect.put(i2, (byte) Math.min(255, ((((i9 * 25) + ((i12 * 129) + (i11 * 66))) + Barcode.FORMAT_ITF) >> 8) + 16));
/* 90 */                    if (i4 % 2 == 0 && i3 % 2 == 0) {
/* 116 */                       int i13 = ((((i11 * 112) - (i12 * 94)) - (i9 * 18)) + Barcode.FORMAT_ITF) >> 8;
/* 118 */                       int i14 = ((((i11 * (-38)) - (i12 * 74)) + (i9 * 112)) + Barcode.FORMAT_ITF) >> 8;
/* 120 */                       int i15 = i13 + Barcode.FORMAT_ITF;
/* 122 */                       int i16 = i14 + Barcode.FORMAT_ITF;
/* 124 */                       int i17 = i + 1;
/* 131 */                       byteBufferAllocateDirect.put(i, (byte) Math.min(255, i15));
/* 134 */                       i += 2;
/* 141 */                       byteBufferAllocateDirect.put(i17, (byte) Math.min(255, i16));
                            }
/* 144 */                   i3++;
/* 146 */                   i5++;
/* 148 */                   i2 = i10;
                        }
                    }
/* 186 */           return byteBufferAllocateDirect;
                }
            }

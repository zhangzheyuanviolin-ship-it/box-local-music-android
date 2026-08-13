            package p000;

            import android.graphics.Bitmap;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.util.Iterator;
            
            public final class O1loO10Ii0I {
                public static final float[] I000II = {0.485f, 0.456f, 0.406f};
                public static final float[] I000O01llI0 = {0.229f, 0.224f, 0.225f};
                public CompiledModel I00000oIO;
                public boolean I00000oOI;
                public float[] I0000Il00O;
                public int I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;

                public static float[] I00000oIO(Bitmap bitmap) {
/* 18 */            Bitmap bitmapCreateScaledBitmap = (bitmap.getWidth() == 256 && bitmap.getHeight() == 256) ? bitmap : Bitmap.createScaledBitmap(bitmap, Barcode.FORMAT_QR_CODE, Barcode.FORMAT_QR_CODE, true);
/* 25 */            int[] iArr = new int[65536];
/* 36 */            bitmapCreateScaledBitmap.getPixels(iArr, 0, Barcode.FORMAT_QR_CODE, 0, 0, Barcode.FORMAT_QR_CODE, Barcode.FORMAT_QR_CODE);
/* 41 */            float[] fArr = new float[196608];
/* 45 */            for (int i = 0; i < 65536; i++) {
/* 47 */                int i2 = iArr[i];
/* 67 */                int i3 = i * 3;
/* 69 */                float[] fArr2 = I000II;
/* 73 */                float f = (((i2 >> 16) & 255) / 255.0f) - fArr2[0];
/* 74 */                float[] fArr3 = I000O01llI0;
/* 79 */                fArr[i3] = f / fArr3[0];
/* 89 */                fArr[i3 + 1] = ((((i2 >> 8) & 255) / 255.0f) - fArr2[1]) / fArr3[1];
/* 99 */                fArr[i3 + 2] = (((i2 & 255) / 255.0f) - fArr2[2]) / fArr3[2];
                    }
/* 104 */           if (bitmapCreateScaledBitmap != bitmap) {
/* 106 */               bitmapCreateScaledBitmap.recycle();
                    }
/* 186 */           return fArr;
                }

                public static String I00000oOI(String str) {
                    Object next;
/* 3 */             File file = new File(str);
/* 10 */            if (file.isFile()) {
/* 12 */                return file.getAbsolutePath();
                    }
/* 23 */            Iterator it = IlIl10.I000l1(file, IlIl0l1lO.I00iOIl).iterator();
                    while (true) {
/* 28 */                I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 35 */                if (!i011lIilI0lo.hasNext()) {
/* 63 */                    next = null;
                            break;
                        }
/* 37 */                next = i011lIilI0lo.next();
/* 42 */                File file2 = (File) next;
/* 48 */                if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
                            break;
                        }
                    }
/* 64 */            File file3 = (File) next;
/* 68 */            String absolutePath = file3 != null ? file3.getAbsolutePath() : null;
/* 72 */            if (absolutePath == null) {
/* 78 */                IIlIOloOOO.I001iOo1i0O("No .tflite at ", str, "BoxAssistMidas");
                    }
/* 186 */           return absolutePath;
                }
            }

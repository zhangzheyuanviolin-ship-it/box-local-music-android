            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Collections;
            import kotlin.jvm.functions.Function1;
            
            public final class O1lIO1O extends ioIOOi0 {
                public OilIoI11 I00000oIO;
                public Function1 I00000oOI;
                public Ii0110 I0000Il00O;
                public Ol010000lo00 I0000O;
                public OI10i0Il I0000oI00;

                @Override
                public final void I00000oIO(IoiO1IO1I1i ioiO1IO1I1i) throws Exception {
                    II000lIl0o10 iI000lIl0o10;
                    int i;
/* 1 */             Ii0110 ii0110 = this.I0000Il00O;
/* 3 */             OI10i0Il oI10i0Il = this.I0000oI00;
/* 5 */             Ol010000lo00 ol010000lo00 = this.I0000O;
                    try {
                        try {
/* 10 */                    Bitmap bitmapI00000oIO = ioOiOIli1i.I00000oIO(ioiO1IO1I1i);
/* 26 */                    int iI0000Il00O = this.I00000oIO.I00iiO + ioiO1IO1I1i.I00i0oil().I0000Il00O();
/* 27 */                    if (iI0000Il00O != 0) {
/* 31 */                        Matrix matrix = new Matrix();
/* 35 */                        matrix.postRotate(iI0000Il00O);
/* 49 */                        bitmapI00000oIO = Bitmap.createBitmap(bitmapI00000oIO, 0, 0, bitmapI00000oIO.getWidth(), bitmapI00000oIO.getHeight(), matrix, true);
                            }
/* 60 */                    int width = bitmapI00000oIO.getWidth();
/* 64 */                    int height = bitmapI00000oIO.getHeight();
/* 68 */                    int i2 = Barcode.FORMAT_UPC_E;
/* 70 */                    if (width > 1024 || height > 1024) {
/* 77 */                        float f = width / height;
/* 84 */                        if (f > 1.0f) {
/* 87 */                            i = (int) (1024.0f / f);
                                } else {
/* 90 */                            i2 = (int) (1024.0f * f);
/* 93 */                            i = 1024;
                                }
/* 95 */                        bitmapI00000oIO = Bitmap.createScaledBitmap(bitmapI00000oIO, i2, i, true);
                            }
/* 105 */                   this.I00000oOI.invoke(Collections.singletonList(bitmapI00000oIO));
/* 108 */                   ioiO1IO1I1i.close();
/* 113 */                   iI000lIl0o10 = new II000lIl0o10(ol010000lo00, oI10i0Il, null, 5);
                        } catch (Exception e) {
/* 124 */                   Log.e("AGMessageInputText", "Failed to process image", e);
/* 127 */                   ioiO1IO1I1i.close();
/* 132 */                   iI000lIl0o10 = new II000lIl0o10(ol010000lo00, oI10i0Il, null, 5);
                        }
/* 116 */               iOi1II01i0.I0000O(ii0110, null, null, iI000lIl0o10, 3);
                    } catch (Throwable th) {
/* 136 */               ioiO1IO1I1i.close();
/* 144 */               iOi1II01i0.I0000O(ii0110, null, null, new II000lIl0o10(ol010000lo00, oI10i0Il, null, 5), 3);
/* 168 */               throw th;
                    }
                }
            }

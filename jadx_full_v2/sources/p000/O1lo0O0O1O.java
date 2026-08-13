            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class O1lo0O0O1O implements IllOOo00lI {
                public final int I00iOIl;
                public O1loIO I00iiI;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             O1loIO o1loIO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 60 */                    OlO0OIIl1 olO0OIIl1 = o1loIO.I00000oOI;
/* 68 */                    Bitmap bitmap = ((O1loIIIOiO) olO0OIIl1.getValue()).I0000O;
/* 70 */                    if (bitmap != null) {
/* 78 */                        O1loIIIOiO o1loIIIOiO = (O1loIIIOiO) olO0OIIl1.getValue();
/* 82 */                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, Bitmap.Config.ARGB_8888);
/* 86 */                        bitmapCreateBitmap.eraseColor(-1);
/* 101 */                       olO0OIIl1.I000lI(null, O1loIIIOiO.I00000oIO(o1loIIIOiO, bitmap, bitmapCreateBitmap, 0, null, 0.0f, false, null, false, 240));
                                break;
                            }
                            break;
                        default:
/* 14 */                    OlO0OIIl1 olO0OIIl12 = o1loIO.I00000oOI;
/* 24 */                    if (((O1loIIIOiO) olO0OIIl12.getValue()).I00000oIO != null) {
/* 32 */                        O1loIIIOiO o1loIIIOiO2 = (O1loIIIOiO) olO0OIIl12.getValue();
/* 36 */                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, Bitmap.Config.ARGB_8888);
/* 40 */                        bitmapCreateBitmap2.eraseColor(-1);
/* 56 */                        olO0OIIl12.I000lI(null, O1loIIIOiO.I00000oIO(o1loIIIOiO2, null, bitmapCreateBitmap2, 0, null, 0.0f, false, null, false, 241));
                                break;
                            }
                            break;
                    }
/* 59 */            return ooiIlOl1iI;
                }
            }

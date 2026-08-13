            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class ilI00Ioo {
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
                
                    if (p000.il0iIill1I.I00000oIO(r9, r1, p000.O0000Ioio00.I0000O(r7, r2) ? r0.getWidth() : p000.I000O01llI0.I0000O(r7.I00000oIO, r8), p000.O0000Ioio00.I0000O(r7, r2) ? r0.getHeight() : p000.I000O01llI0.I0000O(r7.I00000oOI, r8), r8) == 1.0d) goto L24;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Bitmap I00000oIO(Drawable drawable, Bitmap.Config config, Ol0i11lo1l1I ol0i11lo1l1I, OiO0llO0IO oiO0llO0IO, boolean z) {
                    Bitmap bitmap;
                    Bitmap bitmap2;
/* 3 */             if (drawable instanceof BitmapDrawable) {
/* 8 */                 Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
/* 27 */                if (bitmap3.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
/* 29 */                    if (!z) {
/* 32 */                        int width = bitmap3.getWidth();
/* 36 */                        int height = bitmap3.getHeight();
/* 40 */                        Ol0i11lo1l1I ol0i11lo1l1I2 = Ol0i11lo1l1I.I0000Il00O;
                            }
/* 86 */                    return bitmap3;
                        }
                    }
/* 87 */            Drawable drawableMutate = drawable.mutate();
/* 91 */            Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 93 */            boolean z2 = drawableMutate instanceof BitmapDrawable;
/* 102 */           BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) drawableMutate : null;
/* 116 */           int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
/* 120 */           int i = Barcode.FORMAT_UPC_A;
/* 122 */           if (intrinsicWidth <= 0) {
/* 125 */               intrinsicWidth = 512;
                    }
/* 129 */           BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) drawableMutate : null;
/* 144 */           int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
/* 148 */           if (intrinsicHeight > 0) {
/* 150 */               i = intrinsicHeight;
                    }
/* 151 */           Ol0i11lo1l1I ol0i11lo1l1I3 = Ol0i11lo1l1I.I0000Il00O;
/* 181 */           double dI00000oIO = il0iIill1I.I00000oIO(intrinsicWidth, i, O0000Ioio00.I0000O(ol0i11lo1l1I, ol0i11lo1l1I3) ? intrinsicWidth : I000O01llI0.I0000O(ol0i11lo1l1I.I00000oIO, oiO0llO0IO), O0000Ioio00.I0000O(ol0i11lo1l1I, ol0i11lo1l1I3) ? i : I000O01llI0.I0000O(ol0i11lo1l1I.I00000oOI, oiO0llO0IO), oiO0llO0IO);
/* 187 */           int iI0001Ioi1lo = O1OooO0IlOo.I0001Ioi1lo(intrinsicWidth * dI00000oIO);
/* 193 */           int iI0001Ioi1lo2 = O1OooO0IlOo.I0001Ioi1lo(dI00000oIO * i);
/* 197 */           if (config == null || config == Bitmap.Config.HARDWARE) {
/* 203 */               config = Bitmap.Config.ARGB_8888;
                    }
/* 205 */           Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iI0001Ioi1lo, iI0001Ioi1lo2, config);
/* 209 */           Rect bounds = drawableMutate.getBounds();
/* 213 */           int i2 = bounds.left;
/* 215 */           int i3 = bounds.top;
/* 217 */           int i4 = bounds.right;
/* 219 */           int i5 = bounds.bottom;
/* 222 */           drawableMutate.setBounds(0, 0, iI0001Ioi1lo, iI0001Ioi1lo2);
/* 230 */           drawableMutate.draw(new Canvas(bitmapCreateBitmap));
/* 233 */           drawableMutate.setBounds(i2, i3, i4, i5);
/* 399 */           return bitmapCreateBitmap;
                }
            }

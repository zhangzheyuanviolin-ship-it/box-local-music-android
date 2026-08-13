            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.Region;
            
            public final class I0lIooIo1 implements IIolOo {
                public Canvas I00000oIO = I0lO01i00oi.I00000oIO;
                public Rect I00000oOI;
                public Rect I0000Il00O;

                @Override
                public final void I00000oIO(float f, float f2) {
/* 3 */             this.I00000oIO.scale(f, f2);
                }

                @Override
                public final void I00000oOI(float f) {
/* 3 */             this.I00000oIO.rotate(f);
                }

                @Override
                public final void I0000Il00O(float f, long j, I0oiil10Ili i0oiil10Ili) {
/* 27 */            this.I00000oIO.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) i0oiil10Ili.I00iiO);
                }

                @Override
                public final void I0000O(I0ol0lI i0ol0lI, I0oiil10Ili i0oiil10Ili) {
/* 1 */             Canvas canvas = this.I00000oIO;
/* 5 */             if (i0ol0lI instanceof I0ol0lI) {
/* 13 */                canvas.drawPath(i0ol0lI.I00000oIO, iOIlil0Il1i.I00000oOI(i0oiil10Ili));
                    } else {
/* 19 */                OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
                    }
                }

                @Override
                public final void I0000oI00(I0oO00o i0oO00o, long j, long j2, long j3, long j4, I0oiil10Ili i0oiil10Ili) {
/* 3 */             if (this.I00000oOI == null) {
/* 10 */                this.I00000oOI = new Rect();
/* 17 */                this.I0000Il00O = new Rect();
                    }
/* 19 */            Canvas canvas = this.I00000oIO;
/* 21 */            Bitmap bitmapI00000oIO = iOIlOlI0Ii.I00000oIO(i0oO00o);
/* 25 */            Rect rect = this.I00000oOI;
/* 31 */            int i = (int) (j >> 32);
/* 32 */            rect.left = i;
/* 40 */            int i2 = (int) (j & 4294967295L);
/* 41 */            rect.top = i2;
/* 47 */            rect.right = i + ((int) (j2 >> 32));
/* 53 */            rect.bottom = i2 + ((int) (j2 & 4294967295L));
/* 55 */            Rect rect2 = this.I0000Il00O;
/* 59 */            int i3 = (int) (j3 >> 32);
/* 60 */            rect2.left = i3;
/* 64 */            int i4 = (int) (j3 & 4294967295L);
/* 65 */            rect2.top = i4;
/* 71 */            rect2.right = i3 + ((int) (j4 >> 32));
/* 77 */            rect2.bottom = i4 + ((int) (j4 & 4294967295L));
/* 85 */            canvas.drawBitmap(bitmapI00000oIO, rect, rect2, (Paint) i0oiil10Ili.I00iiO);
                }

                @Override
                public final void I0001Ioi1lo(float f, float f2, float f3, float f4, float f5, float f6, I0oiil10Ili i0oiil10Ili) {
/* 7 */             this.I00000oIO.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) i0oiil10Ili.I00iiO);
                }

                @Override
                public final void I000II() {
/* 3 */             this.I00000oIO.save();
                }

                @Override
                public final void I000O01llI0(long j, long j2, I0oiil10Ili i0oiil10Ili) {
/* 43 */            this.I00000oIO.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) i0oiil10Ili.I00iiO);
                }

                @Override
                public final void I000OOo1O() {
/* 3 */             this.I00000oIO.disableZ();
                }

                @Override
                public final void I000OiO(float f, float f2, float f3, float f4, I0oiil10Ili i0oiil10Ili) {
/* 7 */             this.I00000oIO.drawRect(f, f2, f3, f4, iOIlil0Il1i.I00000oOI(i0oiil10Ili));
                }

                @Override
                public final void I000iOII(float[] fArr) {
/* 5 */             if (l1II0lo.I00000oIO(fArr)) {
/* 29 */                return;
                    }
/* 9 */             Matrix matrix = new Matrix();
/* 12 */            iOIli10iO0I.I00000oIO(matrix, fArr);
/* 17 */            this.I00000oIO.concat(matrix);
                }

                @Override
                public final void I000l1(I0ol0lI i0ol0lI) {
/* 1 */             Canvas canvas = this.I00000oIO;
/* 5 */             if (i0ol0lI instanceof I0ol0lI) {
/* 11 */                canvas.clipPath(i0ol0lI.I00000oIO, Region.Op.INTERSECT);
                    } else {
/* 17 */                OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
                    }
                }

                @Override
                public final void I000lI(float f, float f2, float f3, float f4, int i) {
/* 10 */            this.I00000oIO.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
                }

                @Override
                public final void I000o00OoI0I(float f, float f2) {
/* 3 */             this.I00000oIO.translate(f, f2);
                }

                @Override
                public final void I000oI1ioi(I0oO00o i0oO00o, long j, I0oiil10Ili i0oiil10Ili) {
/* 31 */            this.I00000oIO.drawBitmap(iOIlOlI0Ii.I00000oIO(i0oO00o), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), iOIlil0Il1i.I00000oOI(i0oiil10Ili));
                }

                @Override
                public final void I00100l0() {
/* 3 */             this.I00000oIO.restore();
                }

                @Override
                public final void I0010I0i(OOo0IO oOo0IO, I0oiil10Ili i0oiil10Ili) {
/* 18 */            this.I00000oIO.saveLayer(oOo0IO.I00000oIO, oOo0IO.I00000oOI, oOo0IO.I0000Il00O, oOo0IO.I0000O, (Paint) i0oiil10Ili.I00iiO, 31);
                }

                @Override
                public final void I0010o() {
/* 3 */             this.I00000oIO.enableZ();
                }

                @Override
                public final void I00111O(float f, float f2, float f3, float f4, float f5, float f6, I0oiil10Ili i0oiil10Ili) {
/* 17 */            this.I00000oIO.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) i0oiil10Ili.I00iiO);
                }
            }

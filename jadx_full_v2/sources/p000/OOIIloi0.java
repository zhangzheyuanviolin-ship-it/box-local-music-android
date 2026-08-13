            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Size;
            
            public final class OOIIloi0 {
                public Size I00000oIO;
                public Rect I00000oOI;
                public int I0000Il00O;
                public Matrix I0000O;
                public int I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public OOIIoilo1l I000O01llI0;

                public final Matrix I00000oIO(Size size, int i, Rect rect) {
/* 5 */             Matrix matrix = null;
/* 6 */             if (!I0001Ioi1lo()) {
/* 5 */                 return null;
                    }
/* 11 */            Matrix matrix2 = new Matrix();
/* 18 */            if (I0001Ioi1lo()) {
/* 25 */                matrix = new Matrix(this.I0000O);
/* 32 */                matrix.postConcat(I0000Il00O(i, size));
                    }
/* 35 */            matrix.invert(matrix2);
/* 40 */            Matrix matrix3 = new Matrix();
/* 68 */            matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
/* 71 */            matrix2.postConcat(matrix3);
/* 98 */            return matrix2;
                }

                public final Size I00000oOI() {
                    return OoI0lIiO.I0000Il00O(this.I0000Il00O) ? new Size(this.I00000oOI.height(), this.I00000oOI.width()) : new Size(this.I00000oOI.width(), this.I00000oOI.height());
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Matrix I0000Il00O(int i, Size size) {
                    Matrix.ScaleToFit scaleToFit;
                    RectF rectF;
/* 6 */             lII1OI11o1I.I0000oI00(null, I0001Ioi1lo());
/* 19 */            if (OoI0lIiO.I0000O(size, true, I00000oOI())) {
/* 33 */                rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
                    } else {
/* 50 */                RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
/* 53 */                Size sizeI00000oOI = I00000oOI();
/* 69 */                RectF rectF3 = new RectF(0.0f, 0.0f, sizeI00000oOI.getWidth(), sizeI00000oOI.getHeight());
/* 74 */                Matrix matrix = new Matrix();
/* 77 */                OOIIoilo1l oOIIoilo1l = this.I000O01llI0;
/* 79 */                int iOrdinal = oOIIoilo1l.ordinal();
/* 83 */                if (iOrdinal == 0) {
/* 127 */                   scaleToFit = Matrix.ScaleToFit.START;
/* 131 */                   if (oOIIoilo1l != OOIIoilo1l.FIT_CENTER || oOIIoilo1l == OOIIoilo1l.FIT_START || oOIIoilo1l == OOIIoilo1l.FIT_END) {
/* 149 */                       matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                            } else {
/* 142 */                       matrix.setRectToRect(rectF2, rectF3, scaleToFit);
/* 145 */                       matrix.invert(matrix);
                            }
/* 152 */                   matrix.mapRect(rectF3);
/* 155 */                   if (i != 1) {
/* 164 */                       float width = size.getWidth() / 2.0f;
/* 167 */                       float f = width + width;
/* 179 */                       rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
                            } else {
/* 184 */                       rectF = rectF3;
                            }
                        } else if (iOrdinal == 1) {
/* 124 */                   scaleToFit = Matrix.ScaleToFit.CENTER;
/* 131 */                   if (oOIIoilo1l != OOIIoilo1l.FIT_CENTER) {
/* 149 */                       matrix.setRectToRect(rectF3, rectF2, scaleToFit);
/* 152 */                       matrix.mapRect(rectF3);
/* 155 */                       if (i != 1) {
                                }
                            }
                        } else if (iOrdinal == 2) {
/* 121 */                   scaleToFit = Matrix.ScaleToFit.END;
/* 131 */                   if (oOIIoilo1l != OOIIoilo1l.FIT_CENTER) {
                            }
                        } else {
/* 91 */                    if (iOrdinal != 3) {
/* 94 */                        if (iOrdinal != 4) {
/* 97 */                            if (iOrdinal != 5) {
/* 115 */                               l11I11lO.I00000oIO("PreviewTransform", "Unexpected crop rect: " + oOIIoilo1l);
/* 118 */                               scaleToFit = Matrix.ScaleToFit.FILL;
                                    }
                                }
                            }
/* 131 */                   if (oOIIoilo1l != OOIIoilo1l.FIT_CENTER) {
                            }
                        }
                    }
/* 195 */           Matrix matrixI00000oIO = OoI0lIiO.I00000oIO(new RectF(this.I00000oOI), rectF, this.I0000Il00O, false);
/* 201 */           if (this.I0001Ioi1lo && this.I000II) {
/* 209 */               boolean zI0000Il00O = OoI0lIiO.I0000Il00O(this.I0000Il00O);
/* 213 */               Rect rect = this.I00000oOI;
/* 219 */               if (zI0000Il00O) {
/* 233 */                   matrixI00000oIO.preScale(1.0f, -1.0f, rect.centerX(), this.I00000oOI.centerY());
/* 236 */                   return matrixI00000oIO;
                        }
/* 249 */               matrixI00000oIO.preScale(-1.0f, 1.0f, rect.centerX(), this.I00000oOI.centerY());
                    }
/* 332 */           return matrixI00000oIO;
                }

                public final Matrix I0000O() {
/* 6 */             lII1OI11o1I.I0000oI00(null, I0001Ioi1lo());
/* 26 */            RectF rectF = new RectF(0.0f, 0.0f, this.I00000oIO.getWidth(), this.I00000oIO.getHeight());
/* 44 */            return OoI0lIiO.I00000oIO(rectF, rectF, !this.I000II ? this.I0000Il00O : -iOioOiio.I00000oOI(this.I0000oI00), false);
                }

                public final RectF I0000oI00(int i, Size size) {
/* 6 */             lII1OI11o1I.I0000oI00(null, I0001Ioi1lo());
/* 9 */             Matrix matrixI0000Il00O = I0000Il00O(i, size);
/* 30 */            RectF rectF = new RectF(0.0f, 0.0f, this.I00000oIO.getWidth(), this.I00000oIO.getHeight());
/* 33 */            matrixI0000Il00O.mapRect(rectF);
/* 37 */            return rectF;
                }

                public final boolean I0001Ioi1lo() {
                    return (this.I00000oOI == null || this.I00000oIO == null || !(!this.I000II || this.I0000oI00 != -1)) ? false : true;
                }
            }

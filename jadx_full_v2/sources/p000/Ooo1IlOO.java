            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
/* 47 */    public final class Ooo1IlOO extends Ooo0l1I0I00 {
                public static final PorterDuff.Mode I00l0OO0IO = PorterDuff.Mode.SRC_IN;
                public Ooo11Ol1li I00iiI;
                public PorterDuffColorFilter I00iiO;
                public ColorFilter I00iio;
                public boolean I00ilI0I1;
                public boolean I00ilO0;
                public final float[] I00io1l;
                public final Matrix I00ioIO;
                public final Rect I00l0I0l0lO1;

                public Ooo1IlOO() {
/* 5 */             this.I00ilO0 = true;
/* 11 */            this.I00io1l = new float[9];
/* 18 */            this.I00ioIO = new Matrix();
/* 25 */            this.I00l0I0l0lO1 = new Rect();
/* 29 */            Ooo11Ol1li ooo11Ol1li = new Ooo11Ol1li();
/* 33 */            ooo11Ol1li.I0000Il00O = null;
/* 37 */            ooo11Ol1li.I0000O = I00l0OO0IO;
/* 44 */            ooo11Ol1li.I00000oOI = new Ooo111OO();
/* 46 */            this.I00iiI = ooo11Ol1li;
                }

                public final PorterDuffColorFilter I00000oIO(ColorStateList colorStateList, PorterDuff.Mode mode) {
/* 1 */             if (colorStateList == null || mode == null) {
/* 21 */                return null;
                    }
/* 17 */            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
                }

                @Override
                public final boolean canApplyTheme() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable == null) {
/* 8 */                 return false;
                    }
/* 5 */             drawable.canApplyTheme();
/* 8 */             return false;
                }

                @Override
                public final void draw(Canvas canvas) {
                    Paint paint;
/* 5 */             Drawable drawable = this.I00iOIl;
/* 7 */             if (drawable != null) {
/* 9 */                 drawable.draw(canvas);
/* 12 */                return;
                    }
/* 13 */            Rect rect = this.I00l0I0l0lO1;
/* 15 */            copyBounds(rect);
/* 22 */            if (rect.width() <= 0 || rect.height() <= 0) {
/* 437 */               return;
                    }
/* 32 */            ColorFilter colorFilter = this.I00iio;
/* 34 */            if (colorFilter == null) {
/* 36 */                colorFilter = this.I00iiO;
                    }
/* 38 */            Matrix matrix = this.I00ioIO;
/* 40 */            canvas.getMatrix(matrix);
/* 43 */            float[] fArr = this.I00io1l;
/* 45 */            matrix.getValues(fArr);
/* 51 */            float fAbs = Math.abs(fArr[0]);
/* 58 */            float fAbs2 = Math.abs(fArr[4]);
/* 65 */            float fAbs3 = Math.abs(fArr[1]);
/* 72 */            float fAbs4 = Math.abs(fArr[3]);
/* 81 */            if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
/* 87 */                fAbs = 1.0f;
/* 88 */                fAbs2 = 1.0f;
                    }
/* 95 */            int iWidth = (int) (rect.width() * fAbs);
/* 105 */           int iMin = Math.min(Barcode.FORMAT_PDF417, iWidth);
/* 109 */           int iMin2 = Math.min(Barcode.FORMAT_PDF417, (int) (rect.height() * fAbs2));
/* 113 */           if (iMin <= 0 || iMin2 <= 0) {
/* 437 */               return;
                    }
/* 119 */           int iSave = canvas.save();
/* 129 */           canvas.translate(rect.left, rect.top);
/* 136 */           if (isAutoMirrored() && getLayoutDirection() == 1) {
/* 149 */               canvas.translate(rect.width(), 0.0f);
/* 154 */               canvas.scale(-1.0f, 1.0f);
                    }
/* 157 */           rect.offsetTo(0, 0);
/* 160 */           Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 162 */           Bitmap bitmap = ooo11Ol1li.I0001Ioi1lo;
/* 164 */           if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != ooo11Ol1li.I0001Ioi1lo.getHeight()) {
/* 187 */               ooo11Ol1li.I0001Ioi1lo = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
/* 189 */               ooo11Ol1li.I000iOII = true;
                    }
/* 191 */           boolean z = this.I00ilO0;
/* 193 */           Ooo11Ol1li ooo11Ol1li2 = this.I00iiI;
/* 195 */           if (!z) {
/* 199 */               ooo11Ol1li2.I0001Ioi1lo.eraseColor(0);
/* 206 */               Canvas canvas2 = new Canvas(ooo11Ol1li2.I0001Ioi1lo);
/* 209 */               Ooo111OO ooo111OO = ooo11Ol1li2.I00000oOI;
/* 219 */               ooo111OO.I00000oIO(ooo111OO.I000II, Ooo111OO.I00100l0, canvas2, iMin, iMin2);
                    } else if (ooo11Ol1li2.I000iOII || ooo11Ol1li2.I000II != ooo11Ol1li2.I0000Il00O || ooo11Ol1li2.I000O01llI0 != ooo11Ol1li2.I0000O || ooo11Ol1li2.I000OiO != ooo11Ol1li2.I0000oI00 || ooo11Ol1li2.I000OOo1O != ooo11Ol1li2.I00000oOI.getRootAlpha()) {
/* 260 */               Ooo11Ol1li ooo11Ol1li3 = this.I00iiI;
/* 264 */               ooo11Ol1li3.I0001Ioi1lo.eraseColor(0);
/* 271 */               Canvas canvas3 = new Canvas(ooo11Ol1li3.I0001Ioi1lo);
/* 274 */               Ooo111OO ooo111OO2 = ooo11Ol1li3.I00000oOI;
/* 280 */               ooo111OO2.I00000oIO(ooo111OO2.I000II, Ooo111OO.I00100l0, canvas3, iMin, iMin2);
/* 283 */               Ooo11Ol1li ooo11Ol1li4 = this.I00iiI;
/* 287 */               ooo11Ol1li4.I000II = ooo11Ol1li4.I0000Il00O;
/* 291 */               ooo11Ol1li4.I000O01llI0 = ooo11Ol1li4.I0000O;
/* 299 */               ooo11Ol1li4.I000OOo1O = ooo11Ol1li4.I00000oOI.getRootAlpha();
/* 303 */               ooo11Ol1li4.I000OiO = ooo11Ol1li4.I0000oI00;
/* 305 */               ooo11Ol1li4.I000iOII = false;
                    }
/* 307 */           Ooo11Ol1li ooo11Ol1li5 = this.I00iiI;
/* 318 */           if (ooo11Ol1li5.I00000oOI.getRootAlpha() >= 255 && colorFilter == null) {
/* 323 */               paint = null;
                    } else {
/* 327 */               if (ooo11Ol1li5.I000l1 == null) {
/* 331 */                   Paint paint2 = new Paint();
/* 334 */                   ooo11Ol1li5.I000l1 = paint2;
/* 336 */                   paint2.setFilterBitmap(true);
                        }
/* 347 */               ooo11Ol1li5.I000l1.setAlpha(ooo11Ol1li5.I00000oOI.getRootAlpha());
/* 352 */               ooo11Ol1li5.I000l1.setColorFilter(colorFilter);
/* 355 */               paint = ooo11Ol1li5.I000l1;
                    }
/* 359 */           canvas.drawBitmap(ooo11Ol1li5.I0001Ioi1lo, (Rect) null, rect, paint);
/* 362 */           canvas.restoreToCount(iSave);
                }

                @Override
                public final int getAlpha() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getAlpha() : this.I00iiI.I00000oOI.getRootAlpha();
                }

                @Override
                public final int getChangingConfigurations() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.getChangingConfigurations();
                    }
/* 20 */            return this.I00iiI.getChangingConfigurations() | super.getChangingConfigurations();
                }

                @Override
                public final ColorFilter getColorFilter() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getColorFilter() : this.I00iio;
                }

                @Override
                public final Drawable.ConstantState getConstantState() {
/* 3 */             if (this.I00iOIl != null) {
/* 13 */                return new Ooo11iOooII(this.I00iOIl.getConstantState());
                    }
/* 23 */            this.I00iiI.I00000oIO = getChangingConfigurations();
/* 25 */            return this.I00iiI;
                }

                @Override
                public final int getIntrinsicHeight() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getIntrinsicHeight() : (int) this.I00iiI.I00000oOI.I000OOo1O;
                }

                @Override
                public final int getIntrinsicWidth() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getIntrinsicWidth() : (int) this.I00iiI.I00000oOI.I000O01llI0;
                }

                @Override
                public final int getOpacity() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.getOpacity();
                    }
/* 10 */            return -3;
                }

                @Override
                public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 11 */            Drawable drawable = this.I00iOIl;
/* 13 */            if (drawable != null) {
/* 15 */                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
/* 18 */                return;
                    }
/* 19 */            Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 26 */            ooo11Ol1li.I00000oOI = new Ooo111OO();
/* 30 */            TypedArray typedArrayI0000O = lOollIIio1O.I0000O(resources, theme, attributeSet, Ii1Oo1l.I00000oIO);
/* 34 */            Ooo11Ol1li ooo11Ol1li2 = this.I00iiI;
/* 36 */            Ooo111OO ooo111OO = ooo11Ol1li2.I00000oOI;
/* 50 */            int i5 = !lOollIIio1O.I0000Il00O(xmlPullParser, "tintMode") ? -1 : typedArrayI0000O.getInt(6, -1);
/* 54 */            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
/* 58 */            int i6 = 3;
/* 60 */            if (i5 == 3) {
/* 82 */                mode = PorterDuff.Mode.SRC_OVER;
                    } else if (i5 != 5) {
/* 64 */                if (i5 != 9) {
                            switch (i5) {
                                case 14:
/* 76 */                            mode = PorterDuff.Mode.MULTIPLY;
                                    break;
                                case 15:
/* 73 */                            mode = PorterDuff.Mode.SCREEN;
                                    break;
                                case 16:
/* 70 */                            mode = PorterDuff.Mode.ADD;
                                    break;
                            }
                        } else {
/* 79 */                    mode = PorterDuff.Mode.SRC_ATOP;
                        }
                    }
/* 84 */            ooo11Ol1li2.I0000O = mode;
/* 86 */            ColorStateList colorStateListI00000oIO = lOollIIio1O.I00000oIO(typedArrayI0000O, xmlPullParser, theme);
/* 90 */            if (colorStateListI00000oIO != null) {
/* 92 */                ooo11Ol1li2.I0000Il00O = colorStateListI00000oIO;
                    }
/* 94 */            boolean z = ooo11Ol1li2.I0000oI00;
/* 104 */           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
/* 106 */               z = typedArrayI0000O.getBoolean(5, z);
                    }
/* 110 */           ooo11Ol1li2.I0000oI00 = z;
/* 112 */           float f = ooo111OO.I000OiO;
/* 121 */           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
/* 123 */               f = typedArrayI0000O.getFloat(7, f);
                    }
/* 127 */           ooo111OO.I000OiO = f;
/* 129 */           float f2 = ooo111OO.I000iOII;
/* 139 */           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
/* 141 */               f2 = typedArrayI0000O.getFloat(8, f2);
                    }
/* 145 */           ooo111OO.I000iOII = f2;
/* 152 */           if (ooo111OO.I000OiO <= 0.0f) {
/* 1088 */              throw new XmlPullParserException(typedArrayI0000O.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
                    }
/* 156 */           if (f2 <= 0.0f) {
/* 1061 */              throw new XmlPullParserException(typedArrayI0000O.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
                    }
/* 164 */           ooo111OO.I000O01llI0 = typedArrayI0000O.getDimension(3, ooo111OO.I000O01llI0);
/* 168 */           int i7 = 2;
/* 169 */           float dimension = typedArrayI0000O.getDimension(2, ooo111OO.I000OOo1O);
/* 173 */           ooo111OO.I000OOo1O = dimension;
/* 179 */           if (ooo111OO.I000O01llI0 <= 0.0f) {
/* 1034 */              throw new XmlPullParserException(typedArrayI0000O.getPositionDescription() + "<vector> tag requires width > 0");
                    }
/* 183 */           if (dimension <= 0.0f) {
/* 1007 */              throw new XmlPullParserException(typedArrayI0000O.getPositionDescription() + "<vector> tag requires height > 0");
                    }
/* 185 */           float alpha = ooo111OO.getAlpha();
/* 196 */           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
/* 198 */               alpha = typedArrayI0000O.getFloat(4, alpha);
                    }
/* 202 */           ooo111OO.setAlpha(alpha);
/* 206 */           String string = typedArrayI0000O.getString(0);
/* 210 */           if (string != null) {
/* 212 */               ooo111OO.I000lI = string;
/* 216 */               ooo111OO.I000oI1ioi.put(string, ooo111OO);
                    }
/* 219 */           typedArrayI0000O.recycle();
/* 226 */           ooo11Ol1li.I00000oIO = getChangingConfigurations();
/* 228 */           int i8 = 1;
/* 229 */           ooo11Ol1li.I000iOII = true;
/* 231 */           Ooo11Ol1li ooo11Ol1li3 = this.I00iiI;
/* 233 */           Ooo111OO ooo111OO2 = ooo11Ol1li3.I00000oOI;
/* 237 */           ArrayDeque arrayDeque = new ArrayDeque();
/* 240 */           Ooo0oOIl0I0 ooo0oOIl0I0 = ooo111OO2.I000II;
/* 242 */           I1Io0i0II i1Io0i0II = ooo111OO2.I000oI1ioi;
/* 244 */           arrayDeque.push(ooo0oOIl0I0);
/* 247 */           int eventType = xmlPullParser.getEventType();
/* 255 */           int depth = xmlPullParser.getDepth() + 1;
/* 257 */           boolean z2 = true;
/* 259 */           while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
/* 271 */               if (eventType == i7) {
/* 273 */                   String name = xmlPullParser.getName();
/* 283 */                   Ooo0oOIl0I0 ooo0oOIl0I02 = (Ooo0oOIl0I0) arrayDeque.peek();
/* 293 */                   i = depth;
/* 297 */                   if ("path".equals(name)) {
/* 301 */                       Ooo0lOl0O1l0 ooo0lOl0O1l0 = new Ooo0lOl0O1l0();
/* 305 */                       ooo0lOl0O1l0.I0000oI00 = 0.0f;
/* 309 */                       ooo0lOl0O1l0.I000II = 1.0f;
/* 311 */                       ooo0lOl0O1l0.I000O01llI0 = 1.0f;
/* 313 */                       ooo0lOl0O1l0.I000OOo1O = 0.0f;
/* 315 */                       ooo0lOl0O1l0.I000OiO = 1.0f;
/* 317 */                       ooo0lOl0O1l0.I000iOII = 0.0f;
/* 319 */                       Paint.Cap cap = Paint.Cap.BUTT;
/* 321 */                       ooo0lOl0O1l0.I000l1 = cap;
/* 323 */                       Paint.Join join = Paint.Join.MITER;
/* 325 */                       ooo0lOl0O1l0.I000lI = join;
/* 331 */                       ooo0lOl0O1l0.I000o00OoI0I = 4.0f;
/* 335 */                       TypedArray typedArrayI0000O2 = lOollIIio1O.I0000O(resources, theme, attributeSet, Ii1Oo1l.I0000Il00O);
/* 343 */                       if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
/* 348 */                           String string2 = typedArrayI0000O2.getString(0);
/* 352 */                           if (string2 != null) {
/* 354 */                               ooo0lOl0O1l0.I00000oOI = string2;
                                    }
/* 357 */                           String string3 = typedArrayI0000O2.getString(2);
/* 361 */                           if (string3 != null) {
/* 367 */                               ooo0lOl0O1l0.I00000oIO = l1ooi0IOi.I00000oOI(string3);
                                    }
/* 376 */                           ooo0lOl0O1l0.I0001Ioi1lo = lOollIIio1O.I00000oOI(typedArrayI0000O2, xmlPullParser, theme, "fillColor", 1);
/* 378 */                           float f3 = ooo0lOl0O1l0.I000O01llI0;
/* 386 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
/* 390 */                               f3 = typedArrayI0000O2.getFloat(12, f3);
                                    }
/* 394 */                           ooo0lOl0O1l0.I000O01llI0 = f3;
/* 414 */                           int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayI0000O2.getInt(8, -1) : -1;
/* 438 */                           ooo0lOl0O1l0.I000l1 = i9 != 0 ? i9 != 1 ? i9 != 2 ? ooo0lOl0O1l0.I000l1 : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
/* 458 */                           int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayI0000O2.getInt(9, -1) : -1;
/* 482 */                           ooo0lOl0O1l0.I000lI = i10 != 0 ? i10 != 1 ? i10 != 2 ? ooo0lOl0O1l0.I000lI : Paint.Join.BEVEL : Paint.Join.ROUND : join;
/* 484 */                           float f4 = ooo0lOl0O1l0.I000o00OoI0I;
/* 492 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
/* 496 */                               f4 = typedArrayI0000O2.getFloat(10, f4);
                                    }
/* 500 */                           ooo0lOl0O1l0.I000o00OoI0I = f4;
/* 509 */                           ooo0lOl0O1l0.I0000O = lOollIIio1O.I00000oOI(typedArrayI0000O2, xmlPullParser, theme, "strokeColor", 3);
/* 511 */                           float f5 = ooo0lOl0O1l0.I000II;
/* 519 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
/* 523 */                               f5 = typedArrayI0000O2.getFloat(11, f5);
                                    }
/* 527 */                           ooo0lOl0O1l0.I000II = f5;
/* 529 */                           float f6 = ooo0lOl0O1l0.I0000oI00;
/* 537 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
/* 540 */                               f6 = typedArrayI0000O2.getFloat(4, f6);
                                    }
/* 544 */                           ooo0lOl0O1l0.I0000oI00 = f6;
/* 546 */                           float f7 = ooo0lOl0O1l0.I000OiO;
/* 554 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
/* 557 */                               f7 = typedArrayI0000O2.getFloat(6, f7);
                                    }
/* 561 */                           ooo0lOl0O1l0.I000OiO = f7;
/* 563 */                           float f8 = ooo0lOl0O1l0.I000iOII;
/* 571 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
/* 574 */                               f8 = typedArrayI0000O2.getFloat(7, f8);
                                    }
/* 578 */                           ooo0lOl0O1l0.I000iOII = f8;
/* 580 */                           float f9 = ooo0lOl0O1l0.I000OOo1O;
/* 588 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
/* 591 */                               f9 = typedArrayI0000O2.getFloat(5, f9);
                                    }
/* 595 */                           ooo0lOl0O1l0.I000OOo1O = f9;
/* 597 */                           int i11 = ooo0lOl0O1l0.I0000Il00O;
/* 603 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
/* 607 */                               i11 = typedArrayI0000O2.getInt(13, i11);
                                    }
/* 611 */                           ooo0lOl0O1l0.I0000Il00O = i11;
                                }
/* 613 */                       typedArrayI0000O2.recycle();
/* 618 */                       ooo0oOIl0I02.I00000oOI.add(ooo0lOl0O1l0);
/* 625 */                       if (ooo0lOl0O1l0.getPathName() != null) {
/* 631 */                           i1Io0i0II.put(ooo0lOl0O1l0.getPathName(), ooo0lOl0O1l0);
                                }
/* 636 */                       ooo11Ol1li3.I00000oIO = ooo11Ol1li3.I00000oIO;
/* 639 */                       i4 = 1;
/* 646 */                       z2 = false;
                            } else {
/* 662 */                       if ("clip-path".equals(name)) {
/* 666 */                           Ooo0lOI ooo0lOI = new Ooo0lOI();
/* 673 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
/* 677 */                               TypedArray typedArrayI0000O3 = lOollIIio1O.I0000O(resources, theme, attributeSet, Ii1Oo1l.I0000O);
/* 682 */                               String string4 = typedArrayI0000O3.getString(0);
/* 686 */                               if (string4 != null) {
/* 688 */                                   ooo0lOI.I00000oOI = string4;
                                        }
/* 691 */                               String string5 = typedArrayI0000O3.getString(1);
/* 695 */                               if (string5 != null) {
/* 701 */                                   ooo0lOI.I00000oIO = l1ooi0IOi.I00000oOI(string5);
                                        }
/* 717 */                               ooo0lOI.I0000Il00O = !lOollIIio1O.I0000Il00O(xmlPullParser, "fillType") ? 0 : typedArrayI0000O3.getInt(2, 0);
/* 719 */                               typedArrayI0000O3.recycle();
                                    }
/* 724 */                           ooo0oOIl0I02.I00000oOI.add(ooo0lOI);
/* 731 */                           if (ooo0lOI.getPathName() != null) {
/* 737 */                               i1Io0i0II.put(ooo0lOI.getPathName(), ooo0lOI);
                                    }
/* 742 */                           ooo11Ol1li3.I00000oIO = ooo11Ol1li3.I00000oIO;
                                } else if ("group".equals(name)) {
/* 756 */                           Ooo0oOIl0I0 ooo0oOIl0I03 = new Ooo0oOIl0I0();
/* 761 */                           TypedArray typedArrayI0000O4 = lOollIIio1O.I0000O(resources, theme, attributeSet, Ii1Oo1l.I00000oOI);
/* 765 */                           float f10 = ooo0oOIl0I03.I0000Il00O;
/* 773 */                           if (lOollIIio1O.I0000Il00O(xmlPullParser, "rotation")) {
/* 778 */                               f10 = typedArrayI0000O4.getFloat(5, f10);
                                    }
/* 782 */                           ooo0oOIl0I03.I0000Il00O = f10;
/* 786 */                           i4 = 1;
/* 791 */                           ooo0oOIl0I03.I0000O = typedArrayI0000O4.getFloat(1, ooo0oOIl0I03.I0000O);
/* 800 */                           ooo0oOIl0I03.I0000oI00 = typedArrayI0000O4.getFloat(2, ooo0oOIl0I03.I0000oI00);
/* 802 */                           float f11 = ooo0oOIl0I03.I0001Ioi1lo;
/* 810 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
/* 813 */                               f11 = typedArrayI0000O4.getFloat(3, f11);
                                    }
/* 817 */                           ooo0oOIl0I03.I0001Ioi1lo = f11;
/* 819 */                           float f12 = ooo0oOIl0I03.I000II;
/* 827 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
/* 830 */                               f12 = typedArrayI0000O4.getFloat(4, f12);
                                    }
/* 836 */                           ooo0oOIl0I03.I000II = f12;
/* 838 */                           float f13 = ooo0oOIl0I03.I000O01llI0;
/* 846 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
/* 849 */                               f13 = typedArrayI0000O4.getFloat(6, f13);
                                    }
/* 855 */                           ooo0oOIl0I03.I000O01llI0 = f13;
/* 857 */                           float f14 = ooo0oOIl0I03.I000OOo1O;
/* 865 */                           if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
/* 868 */                               f14 = typedArrayI0000O4.getFloat(7, f14);
                                    }
/* 874 */                           ooo0oOIl0I03.I000OOo1O = f14;
/* 877 */                           String string6 = typedArrayI0000O4.getString(0);
/* 881 */                           if (string6 != null) {
/* 883 */                               ooo0oOIl0I03.I000iOII = string6;
                                    }
/* 885 */                           ooo0oOIl0I03.I0000Il00O();
/* 888 */                           typedArrayI0000O4.recycle();
/* 893 */                           ooo0oOIl0I02.I00000oOI.add(ooo0oOIl0I03);
/* 896 */                           arrayDeque.push(ooo0oOIl0I03);
/* 903 */                           if (ooo0oOIl0I03.getGroupName() != null) {
/* 909 */                               i1Io0i0II.put(ooo0oOIl0I03.getGroupName(), ooo0oOIl0I03);
                                    }
/* 914 */                           ooo11Ol1li3.I00000oIO = ooo11Ol1li3.I00000oIO;
                                }
/* 745 */                       i4 = 1;
                            }
/* 916 */                   i3 = i4;
/* 918 */                   i2 = 3;
                        } else {
/* 920 */                   i = depth;
/* 922 */                   i2 = i6;
/* 930 */                   i3 = 1;
/* 932 */                   if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
/* 944 */                       arrayDeque.pop();
                            }
                        }
/* 947 */               eventType = xmlPullParser.next();
/* 951 */               i6 = i2;
/* 952 */               i8 = i3;
/* 954 */               depth = i;
/* 956 */               i7 = 2;
                    }
/* 960 */           if (z2) {
/* 980 */               throw new XmlPullParserException("no path defined");
                    }
/* 970 */           this.I00iiO = I00000oIO(ooo11Ol1li.I0000Il00O, ooo11Ol1li.I0000O);
                }

                @Override
                public final void invalidateSelf() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.invalidateSelf();
                    } else {
/* 9 */                 super.invalidateSelf();
                    }
                }

                @Override
                public final boolean isAutoMirrored() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.isAutoMirrored() : this.I00iiI.I0000oI00;
                }

                @Override
                public final boolean isStateful() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.isStateful();
                    }
/* 14 */            if (super.isStateful()) {
/* 59 */                return true;
                    }
/* 16 */            Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 18 */            if (ooo11Ol1li == null) {
/* 57 */                return false;
                    }
/* 20 */            Ooo111OO ooo111OO = ooo11Ol1li.I00000oOI;
/* 22 */            Boolean boolValueOf = ooo111OO.I000o00OoI0I;
/* 24 */            if (boolValueOf == null) {
/* 32 */                boolValueOf = Boolean.valueOf(ooo111OO.I000II.I00000oIO());
/* 36 */                ooo111OO.I000o00OoI0I = boolValueOf;
                    }
/* 42 */            if (boolValueOf.booleanValue()) {
/* 59 */                return true;
                    }
/* 46 */            ColorStateList colorStateList = this.I00iiI.I0000Il00O;
                    return colorStateList != null && colorStateList.isStateful();
                }

                @Override
                public final Drawable mutate() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.mutate();
/* 8 */                 return this;
                    }
/* 11 */            if (!this.I00ilI0I1 && super.mutate() == this) {
/* 21 */                Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 23 */                Ooo11Ol1li ooo11Ol1li2 = new Ooo11Ol1li();
/* 27 */                ooo11Ol1li2.I0000Il00O = null;
/* 31 */                ooo11Ol1li2.I0000O = I00l0OO0IO;
/* 33 */                if (ooo11Ol1li != null) {
/* 37 */                    ooo11Ol1li2.I00000oIO = ooo11Ol1li.I00000oIO;
/* 41 */                    Ooo111OO ooo111OO = ooo11Ol1li.I00000oOI;
/* 43 */                    Ooo111OO ooo111OO2 = new Ooo111OO();
/* 51 */                    ooo111OO2.I0000Il00O = new Matrix();
/* 54 */                    ooo111OO2.I000O01llI0 = 0.0f;
/* 56 */                    ooo111OO2.I000OOo1O = 0.0f;
/* 58 */                    ooo111OO2.I000OiO = 0.0f;
/* 60 */                    ooo111OO2.I000iOII = 0.0f;
/* 64 */                    ooo111OO2.I000l1 = 255;
/* 66 */                    ooo111OO2.I000lI = null;
/* 68 */                    ooo111OO2.I000o00OoI0I = null;
/* 73 */                    I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 76 */                    ooo111OO2.I000oI1ioi = i1Io0i0II;
/* 85 */                    ooo111OO2.I000II = new Ooo0oOIl0I0(ooo111OO.I000II, i1Io0i0II);
/* 94 */                    ooo111OO2.I00000oIO = new Path(ooo111OO.I00000oIO);
/* 103 */                   ooo111OO2.I00000oOI = new Path(ooo111OO.I00000oOI);
/* 107 */                   ooo111OO2.I000O01llI0 = ooo111OO.I000O01llI0;
/* 111 */                   ooo111OO2.I000OOo1O = ooo111OO.I000OOo1O;
/* 115 */                   ooo111OO2.I000OiO = ooo111OO.I000OiO;
/* 119 */                   ooo111OO2.I000iOII = ooo111OO.I000iOII;
/* 123 */                   ooo111OO2.I000l1 = ooo111OO.I000l1;
/* 127 */                   ooo111OO2.I000lI = ooo111OO.I000lI;
/* 129 */                   String str = ooo111OO.I000lI;
/* 131 */                   if (str != null) {
/* 133 */                       i1Io0i0II.put(str, ooo111OO2);
                            }
/* 138 */                   ooo111OO2.I000o00OoI0I = ooo111OO.I000o00OoI0I;
/* 140 */                   VarHandle.storeStoreFence();
/* 143 */                   ooo11Ol1li2.I00000oOI = ooo111OO2;
/* 149 */                   if (ooo11Ol1li.I00000oOI.I0000oI00 != null) {
/* 160 */                       ooo111OO2.I0000oI00 = new Paint(ooo11Ol1li.I00000oOI.I0000oI00);
                            }
/* 166 */                   if (ooo11Ol1li.I00000oOI.I0000O != null) {
/* 179 */                       ooo11Ol1li2.I00000oOI.I0000O = new Paint(ooo11Ol1li.I00000oOI.I0000O);
                            }
/* 183 */                   ooo11Ol1li2.I0000Il00O = ooo11Ol1li.I0000Il00O;
/* 187 */                   ooo11Ol1li2.I0000O = ooo11Ol1li.I0000O;
/* 191 */                   ooo11Ol1li2.I0000oI00 = ooo11Ol1li.I0000oI00;
                        }
/* 193 */               this.I00iiI = ooo11Ol1li2;
/* 196 */               this.I00ilI0I1 = true;
                    }
/* 245 */           return this;
                }

                @Override
                public final void onBoundsChange(Rect rect) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setBounds(rect);
                    }
                }

                @Override
                public final boolean onStateChange(int[] iArr) {
                    boolean z;
                    PorterDuff.Mode mode;
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.setState(iArr);
                    }
/* 10 */            Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 12 */            ColorStateList colorStateList = ooo11Ol1li.I0000Il00O;
/* 15 */            if (colorStateList == null || (mode = ooo11Ol1li.I0000O) == null) {
/* 32 */                z = false;
                    } else {
/* 25 */                this.I00iiO = I00000oIO(colorStateList, mode);
/* 27 */                invalidateSelf();
/* 30 */                z = true;
                    }
/* 33 */            Ooo111OO ooo111OO = ooo11Ol1li.I00000oOI;
/* 35 */            Boolean boolValueOf = ooo111OO.I000o00OoI0I;
/* 37 */            if (boolValueOf == null) {
/* 45 */                boolValueOf = Boolean.valueOf(ooo111OO.I000II.I00000oIO());
/* 49 */                ooo111OO.I000o00OoI0I = boolValueOf;
                    }
/* 55 */            if (boolValueOf.booleanValue()) {
/* 61 */                boolean zI00000oOI = ooo11Ol1li.I00000oOI.I000II.I00000oOI(iArr);
                        ooo11Ol1li.I000iOII |= zI00000oOI;
/* 70 */                if (zI00000oOI) {
/* 72 */                    invalidateSelf();
/* 14 */                    return true;
                        }
                    }
/* 77 */            return z;
                }

                @Override
                public final void scheduleSelf(Runnable runnable, long j) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.scheduleSelf(runnable, j);
                    } else {
/* 9 */                 super.scheduleSelf(runnable, j);
                    }
                }

                @Override
                public final void setAlpha(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setAlpha(i);
                    } else if (this.I00iiI.I00000oOI.getRootAlpha() != i) {
/* 23 */                this.I00iiI.I00000oOI.setRootAlpha(i);
/* 26 */                invalidateSelf();
                    }
                }

                @Override
                public final void setAutoMirrored(boolean z) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setAutoMirrored(z);
                    } else {
/* 11 */                this.I00iiI.I0000oI00 = z;
                    }
                }

                @Override
                public final void setColorFilter(ColorFilter colorFilter) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setColorFilter(colorFilter);
                    } else {
/* 9 */                 this.I00iio = colorFilter;
/* 11 */                invalidateSelf();
                    }
                }

                @Override
                public final void setTint(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTint(i);
                    } else {
/* 13 */                setTintList(ColorStateList.valueOf(i));
                    }
                }

                @Override
                public final void setTintList(ColorStateList colorStateList) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintList(colorStateList);
/* 8 */                 return;
                    }
/* 9 */             Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 13 */            if (ooo11Ol1li.I0000Il00O != colorStateList) {
/* 15 */                ooo11Ol1li.I0000Il00O = colorStateList;
/* 23 */                this.I00iiO = I00000oIO(colorStateList, ooo11Ol1li.I0000O);
/* 25 */                invalidateSelf();
                    }
                }

                @Override
                public final void setTintMode(PorterDuff.Mode mode) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintMode(mode);
/* 8 */                 return;
                    }
/* 9 */             Ooo11Ol1li ooo11Ol1li = this.I00iiI;
/* 13 */            if (ooo11Ol1li.I0000O != mode) {
/* 15 */                ooo11Ol1li.I0000O = mode;
/* 23 */                this.I00iiO = I00000oIO(ooo11Ol1li.I0000Il00O, mode);
/* 25 */                invalidateSelf();
                    }
                }

                @Override
                public final boolean setVisible(boolean z, boolean z2) {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
                }

                @Override
                public final void unscheduleSelf(Runnable runnable) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.unscheduleSelf(runnable);
                    } else {
/* 9 */                 super.unscheduleSelf(runnable);
                    }
                }

/* 48 */        public Ooo1IlOO(Ooo11Ol1li ooo11Ol1li) {
/* 50 */            this.I00ilO0 = true;
/* 51 */            this.I00io1l = new float[9];
/* 52 */            this.I00ioIO = new Matrix();
/* 53 */            this.I00l0I0l0lO1 = new Rect();
/* 54 */            this.I00iiI = ooo11Ol1li;
/* 55 */            this.I00iiO = I00000oIO(ooo11Ol1li.I0000Il00O, ooo11Ol1li.I0000O);
                }

                @Override
/* 1088 */      public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
/* 1089 */          Drawable drawable = this.I00iOIl;
                    if (drawable != null) {
/* 1090 */              drawable.inflate(resources, xmlPullParser, attributeSet);
                    } else {
/* 1091 */              inflate(resources, xmlPullParser, attributeSet, null);
                    }
                }
            }

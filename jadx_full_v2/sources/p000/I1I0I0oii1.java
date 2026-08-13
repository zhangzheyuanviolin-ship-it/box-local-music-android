            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.net.Uri;
            import android.util.AttributeSet;
            import android.widget.ImageButton;
            import android.widget.ImageView;
            
            public class I1I0I0oii1 extends ImageButton {
                public final I11l01l I00iOIl;
                public final I00Ol00 I00iiI;
                public boolean I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1I0I0oii1(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             Oo11io0.I00000oIO(context);
/* 8 */             this.I00iiO = false;
/* 14 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 19 */            I11l01l i11l01l = new I11l01l(this);
/* 22 */            this.I00iOIl = i11l01l;
/* 24 */            i11l01l.I001lIiIIo1O(attributeSet, i);
/* 29 */            I00Ol00 i00Ol00 = new I00Ol00(this);
/* 32 */            this.I00iiI = i00Ol00;
/* 34 */            i00Ol00.I000o00OoI0I(attributeSet, i);
                }

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I000OiO();
                    }
/* 11 */            I00Ol00 i00Ol00 = this.I00iiI;
/* 13 */            if (i00Ol00 != null) {
/* 15 */                i00Ol00.I00000oOI();
                    }
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 return i11l01l.I001i1lo1io();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 return i11l01l.I001iOo1i0O();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportImageTintList() {
                    IOloIIl1 iOloIIl1;
/* 2 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 4 */             if (i00Ol00 == null || (iOloIIl1 = (IOloIIl1) i00Ol00.I0000O) == null) {
/* 1 */                 return null;
                    }
/* 14 */            return (ColorStateList) iOloIIl1.I0000Il00O;
                }

                public PorterDuff.Mode getSupportImageTintMode() {
                    IOloIIl1 iOloIIl1;
/* 2 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 4 */             if (i00Ol00 == null || (iOloIIl1 = (IOloIIl1) i00Ol00.I0000O) == null) {
/* 1 */                 return null;
                    }
/* 14 */            return (PorterDuff.Mode) iOloIIl1.I0000O;
                }

                @Override
                public final boolean hasOverlappingRendering() {
                    return !(((ImageView) this.I00iiI.I0000Il00O).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
                }

                @Override
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I00II0Ol1O0l();
                    }
                }

                @Override
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I00II0oii1o(i);
                    }
                }

                @Override
                public void setImageBitmap(Bitmap bitmap) {
/* 1 */             super.setImageBitmap(bitmap);
/* 4 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 6 */             if (i00Ol00 != null) {
/* 8 */                 i00Ol00.I00000oOI();
                    }
                }

                @Override
                public void setImageDrawable(Drawable drawable) {
/* 1 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 3 */             if (i00Ol00 != null && drawable != null && !this.I00iiO) {
/* 15 */                i00Ol00.I00000oOI = drawable.getLevel();
                    }
/* 17 */            super.setImageDrawable(drawable);
/* 20 */            if (i00Ol00 != null) {
/* 22 */                i00Ol00.I00000oOI();
/* 27 */                if (this.I00iiO) {
/* 77 */                    return;
                        }
/* 31 */                ImageView imageView = (ImageView) i00Ol00.I0000Il00O;
/* 37 */                if (imageView.getDrawable() != null) {
/* 45 */                    imageView.getDrawable().setLevel(i00Ol00.I00000oOI);
                        }
                    }
                }

                @Override
                public void setImageLevel(int i) {
/* 1 */             super.setImageLevel(i);
/* 5 */             this.I00iiO = true;
                }

                @Override
                public void setImageResource(int i) {
/* 1 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 5 */             ImageView imageView = (ImageView) i00Ol00.I0000Il00O;
/* 7 */             if (i != 0) {
/* 13 */                Drawable drawableI00000oIO = iOO0oOI1Ol.I00000oIO(imageView.getContext(), i);
/* 17 */                if (drawableI00000oIO != null) {
/* 19 */                    int i2 = IiloO11l.I00000oIO;
                        }
/* 21 */                imageView.setImageDrawable(drawableI00000oIO);
                    } else {
/* 26 */                imageView.setImageDrawable(null);
                    }
/* 29 */            i00Ol00.I00000oOI();
                }

                @Override
                public void setImageURI(Uri uri) {
/* 1 */             super.setImageURI(uri);
/* 4 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 6 */             if (i00Ol00 != null) {
/* 8 */                 i00Ol00.I00000oOI();
                    }
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 i11l01l.I00Io1o110i(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 i11l01l.I00IoIO0lI(mode);
                    }
                }

                public void setSupportImageTintList(ColorStateList colorStateList) {
/* 1 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 3 */             if (i00Ol00 != null) {
/* 7 */                 IOloIIl1 iOloIIl1 = (IOloIIl1) i00Ol00.I0000O;
/* 9 */                 if (iOloIIl1 == null) {
/* 13 */                    iOloIIl1 = new IOloIIl1();
/* 16 */                    i00Ol00.I0000O = iOloIIl1;
                        }
/* 18 */                iOloIIl1.I0000Il00O = colorStateList;
/* 21 */                iOloIIl1.I00000oOI = true;
/* 23 */                i00Ol00.I00000oOI();
                    }
                }

                public void setSupportImageTintMode(PorterDuff.Mode mode) {
/* 1 */             I00Ol00 i00Ol00 = this.I00iiI;
/* 3 */             if (i00Ol00 != null) {
/* 7 */                 IOloIIl1 iOloIIl1 = (IOloIIl1) i00Ol00.I0000O;
/* 9 */                 if (iOloIIl1 == null) {
/* 13 */                    iOloIIl1 = new IOloIIl1();
/* 16 */                    i00Ol00.I0000O = iOloIIl1;
                        }
/* 18 */                iOloIIl1.I0000O = mode;
/* 21 */                iOloIIl1.I00000oIO = true;
/* 23 */                i00Ol00.I00000oOI();
                    }
                }
            }

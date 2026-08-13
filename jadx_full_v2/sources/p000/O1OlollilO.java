            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.RippleDrawable;
            import com.box.gallery.R;
            
            public final class O1OlollilO {
                public O1OllOiIo1I I00000oIO;
                public OioOlIlii1il I00000oOI;
                public OlO0lil1 I0000Il00O;
                public OlIOOlill1o I0000O;
                public I0IOIlIOIII I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;
                public PorterDuff.Mode I000l1;
                public ColorStateList I000lI;
                public ColorStateList I000o00OoI0I;
                public ColorStateList I000oI1ioi;
                public O1Ooi0 I00100l0;
                public boolean I00100o1O0lo;
                public boolean I0010I0i;
                public boolean I0010o;
                public boolean I00111O;
                public boolean I001IIilI0O;
                public RippleDrawable I001IO000;
                public int I001i1O0Ol;

                public final O1Ooi0 I00000oIO(boolean z) {
/* 1 */             RippleDrawable rippleDrawable = this.I001IO000;
/* 3 */             if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
/* 35 */                return null;
                    }
/* 32 */            return (O1Ooi0) ((LayerDrawable) ((InsetDrawable) this.I001IO000.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
                }

                public final void I00000oOI(int i, int i2) {
/* 1 */             O1OllOiIo1I o1OllOiIo1I = this.I00000oIO;
/* 3 */             int paddingStart = o1OllOiIo1I.getPaddingStart();
/* 7 */             int paddingTop = o1OllOiIo1I.getPaddingTop();
/* 11 */            int paddingEnd = o1OllOiIo1I.getPaddingEnd();
/* 15 */            int paddingBottom = o1OllOiIo1I.getPaddingBottom();
/* 19 */            int i3 = this.I000O01llI0;
/* 21 */            int i4 = this.I000OOo1O;
/* 23 */            this.I000OOo1O = i2;
/* 25 */            this.I000O01llI0 = i;
/* 29 */            if (!this.I0010I0i) {
/* 31 */                I0000Il00O();
                    }
/* 38 */            o1OllOiIo1I.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
                }

                public final void I0000Il00O() {
/* 1 */             O1OllOiIo1I o1OllOiIo1I = this.I00000oIO;
/* 7 */             O1Ooi0 o1Ooi0 = new O1Ooi0(this.I00000oOI);
/* 10 */            OlO0lil1 olO0lil1 = this.I0000Il00O;
/* 12 */            if (olO0lil1 != null) {
/* 14 */                o1Ooi0.I000OOo1O(olO0lil1);
                    }
/* 17 */            OlIOOlill1o olIOOlill1o = this.I0000O;
/* 19 */            if (olIOOlill1o != null) {
/* 21 */                o1Ooi0.I000O01llI0(olIOOlill1o);
                    }
/* 24 */            I0IOIlIOIII i0IOIlIOIII = this.I0000oI00;
/* 26 */            if (i0IOIlIOIII != null) {
/* 28 */                o1Ooi0.I00ooIo0 = i0IOIlIOIII;
                    }
/* 34 */            o1Ooi0.I000II(o1OllOiIo1I.getContext());
/* 39 */            o1Ooi0.setTintList(this.I000lI);
/* 42 */            PorterDuff.Mode mode = this.I000l1;
/* 44 */            if (mode != null) {
/* 46 */                o1Ooi0.setTintMode(mode);
                    }
/* 49 */            float f = this.I000iOII;
/* 52 */            ColorStateList colorStateList = this.I000o00OoI0I;
/* 56 */            o1Ooi0.I00iiI.I000iOII = f;
/* 58 */            o1Ooi0.invalidateSelf();
/* 61 */            O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0.I00iiI;
/* 65 */            if (o1OoOIoiiO1I.I0000oI00 != colorStateList) {
/* 67 */                o1OoOIoiiO1I.I0000oI00 = colorStateList;
/* 73 */                o1Ooi0.onStateChange(o1Ooi0.getState());
                    }
/* 80 */            O1Ooi0 o1Ooi02 = new O1Ooi0(this.I00000oOI);
/* 83 */            OlO0lil1 olO0lil12 = this.I0000Il00O;
/* 85 */            if (olO0lil12 != null) {
/* 87 */                o1Ooi02.I000OOo1O(olO0lil12);
                    }
/* 90 */            OlIOOlill1o olIOOlill1o2 = this.I0000O;
/* 92 */            if (olIOOlill1o2 != null) {
/* 94 */                o1Ooi02.I000O01llI0(olIOOlill1o2);
                    }
/* 98 */            o1Ooi02.setTint(0);
/* 101 */           float f2 = this.I000iOII;
/* 116 */           int iI00000oOI = this.I00100o1O0lo ? l1I10i.I00000oOI(o1OllOiIo1I, R.attr.colorSurface) : 0;
/* 119 */           o1Ooi02.I00iiI.I000iOII = f2;
/* 121 */           o1Ooi02.invalidateSelf();
/* 124 */           ColorStateList colorStateListValueOf = ColorStateList.valueOf(iI00000oOI);
/* 128 */           O1OoOIoiiO1I o1OoOIoiiO1I2 = o1Ooi02.I00iiI;
/* 132 */           if (o1OoOIoiiO1I2.I0000oI00 != colorStateListValueOf) {
/* 134 */               o1OoOIoiiO1I2.I0000oI00 = colorStateListValueOf;
/* 140 */               o1Ooi02.onStateChange(o1Ooi02.getState());
                    }
/* 147 */           O1Ooi0 o1Ooi03 = new O1Ooi0(this.I00000oOI);
/* 150 */           this.I00100l0 = o1Ooi03;
/* 152 */           OlO0lil1 olO0lil13 = this.I0000Il00O;
/* 154 */           if (olO0lil13 != null) {
/* 156 */               o1Ooi03.I000OOo1O(olO0lil13);
                    }
/* 159 */           OlIOOlill1o olIOOlill1o3 = this.I0000O;
/* 161 */           if (olIOOlill1o3 != null) {
/* 165 */               this.I00100l0.I000O01llI0(olIOOlill1o3);
                    }
/* 171 */           this.I00100l0.setTint(-1);
/* 176 */           ColorStateList colorStateListValueOf2 = this.I000oI1ioi;
/* 178 */           if (colorStateListValueOf2 == null) {
/* 181 */               colorStateListValueOf2 = ColorStateList.valueOf(0);
                    }
/* 213 */           RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{o1Ooi02, o1Ooi0}), this.I0001Ioi1lo, this.I000O01llI0, this.I000II, this.I000OOo1O), this.I00100l0);
/* 216 */           this.I001IO000 = rippleDrawable;
/* 218 */           o1OllOiIo1I.setInternalBackground(rippleDrawable);
/* 221 */           O1Ooi0 o1Ooi0I00000oIO = I00000oIO(false);
/* 225 */           if (o1Ooi0I00000oIO != null) {
/* 227 */               float f3 = this.I001i1O0Ol;
/* 230 */               O1OoOIoiiO1I o1OoOIoiiO1I3 = o1Ooi0I00000oIO.I00iiI;
/* 236 */               if (o1OoOIoiiO1I3.I000o00OoI0I != f3) {
/* 238 */                   o1OoOIoiiO1I3.I000o00OoI0I = f3;
/* 240 */                   o1Ooi0I00000oIO.I000lI();
                        }
/* 247 */               o1Ooi0I00000oIO.setState(o1OllOiIo1I.getDrawableState());
                    }
                }

                public final void I0000O() {
                    OioilII oioilII;
/* 2 */             O1Ooi0 o1Ooi0I00000oIO = I00000oIO(false);
/* 6 */             if (o1Ooi0I00000oIO != null) {
/* 8 */                 OlO0lil1 olO0lil1 = this.I0000Il00O;
/* 10 */                if (olO0lil1 != null) {
/* 12 */                    o1Ooi0I00000oIO.I000OOo1O(olO0lil1);
                        } else {
/* 18 */                    o1Ooi0I00000oIO.setShapeAppearanceModel(this.I00000oOI);
                        }
/* 21 */                OlIOOlill1o olIOOlill1o = this.I0000O;
/* 23 */                if (olIOOlill1o != null) {
/* 25 */                    o1Ooi0I00000oIO.I000O01llI0(olIOOlill1o);
                        }
                    }
/* 29 */            O1Ooi0 o1Ooi0I00000oIO2 = I00000oIO(true);
/* 33 */            if (o1Ooi0I00000oIO2 != null) {
/* 35 */                OlO0lil1 olO0lil12 = this.I0000Il00O;
/* 37 */                if (olO0lil12 != null) {
/* 39 */                    o1Ooi0I00000oIO2.I000OOo1O(olO0lil12);
                        } else {
/* 45 */                    o1Ooi0I00000oIO2.setShapeAppearanceModel(this.I00000oOI);
                        }
/* 48 */                OlIOOlill1o olIOOlill1o2 = this.I0000O;
/* 50 */                if (olIOOlill1o2 != null) {
/* 52 */                    o1Ooi0I00000oIO2.I000O01llI0(olIOOlill1o2);
                        }
                    }
/* 55 */            RippleDrawable rippleDrawable = this.I001IO000;
/* 57 */            if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
/* 90 */                oioilII = null;
                    } else {
/* 67 */                int numberOfLayers = this.I001IO000.getNumberOfLayers();
/* 71 */                RippleDrawable rippleDrawable2 = this.I001IO000;
/* 87 */                oioilII = numberOfLayers > 2 ? (OioilII) rippleDrawable2.getDrawable(2) : (OioilII) rippleDrawable2.getDrawable(1);
                    }
/* 91 */            if (oioilII != null) {
/* 95 */                oioilII.setShapeAppearanceModel(this.I00000oOI);
/* 100 */               if (oioilII instanceof O1Ooi0) {
/* 102 */                   O1Ooi0 o1Ooi0 = (O1Ooi0) oioilII;
/* 104 */                   OlO0lil1 olO0lil13 = this.I0000Il00O;
/* 106 */                   if (olO0lil13 != null) {
/* 108 */                       o1Ooi0.I000OOo1O(olO0lil13);
                            }
/* 111 */                   OlIOOlill1o olIOOlill1o3 = this.I0000O;
/* 113 */                   if (olIOOlill1o3 != null) {
/* 115 */                       o1Ooi0.I000O01llI0(olIOOlill1o3);
                            }
                        }
                    }
                }

                public final void I0000oI00() {
/* 2 */             O1Ooi0 o1Ooi0I00000oIO = I00000oIO(false);
/* 7 */             O1Ooi0 o1Ooi0I00000oIO2 = I00000oIO(true);
/* 11 */            if (o1Ooi0I00000oIO != null) {
/* 13 */                float f = this.I000iOII;
/* 16 */                ColorStateList colorStateList = this.I000o00OoI0I;
/* 20 */                o1Ooi0I00000oIO.I00iiI.I000iOII = f;
/* 22 */                o1Ooi0I00000oIO.invalidateSelf();
/* 25 */                O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0I00000oIO.I00iiI;
/* 29 */                if (o1OoOIoiiO1I.I0000oI00 != colorStateList) {
/* 31 */                    o1OoOIoiiO1I.I0000oI00 = colorStateList;
/* 37 */                    o1Ooi0I00000oIO.onStateChange(o1Ooi0I00000oIO.getState());
                        }
/* 40 */                if (o1Ooi0I00000oIO2 != null) {
/* 42 */                    float f2 = this.I000iOII;
/* 54 */                    int iI00000oOI = this.I00100o1O0lo ? l1I10i.I00000oOI(this.I00000oIO, R.attr.colorSurface) : 0;
/* 60 */                    o1Ooi0I00000oIO2.I00iiI.I000iOII = f2;
/* 62 */                    o1Ooi0I00000oIO2.invalidateSelf();
/* 65 */                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iI00000oOI);
/* 69 */                    O1OoOIoiiO1I o1OoOIoiiO1I2 = o1Ooi0I00000oIO2.I00iiI;
/* 73 */                    if (o1OoOIoiiO1I2.I0000oI00 != colorStateListValueOf) {
/* 75 */                        o1OoOIoiiO1I2.I0000oI00 = colorStateListValueOf;
/* 81 */                        o1Ooi0I00000oIO2.onStateChange(o1Ooi0I00000oIO2.getState());
                            }
                        }
                    }
                }
            }

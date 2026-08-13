            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.InputFilter;
            import android.util.AttributeSet;
            import android.widget.ToggleButton;
            
            public final class I1II1i extends ToggleButton {
                public final I11l01l I00iOIl;
                public final I1I1loi I00iiI;
                public I1I01O1lO1o1 I00iiO;

                public I1II1i(Context context, AttributeSet attributeSet) {
/* 4 */             super(context, attributeSet, R.attr.buttonStyleToggle);
/* 11 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 16 */            I11l01l i11l01l = new I11l01l(this);
/* 19 */            this.I00iOIl = i11l01l;
/* 21 */            i11l01l.I001lIiIIo1O(attributeSet, R.attr.buttonStyleToggle);
/* 26 */            I1I1loi i1I1loi = new I1I1loi(this);
/* 29 */            this.I00iiI = i1I1loi;
/* 31 */            i1I1loi.I0001Ioi1lo(attributeSet, R.attr.buttonStyleToggle);
/* 38 */            getEmojiTextViewHelper().I00000oIO(attributeSet, R.attr.buttonStyleToggle);
                }

                private I1I01O1lO1o1 getEmojiTextViewHelper() {
/* 1 */             I1I01O1lO1o1 i1I01O1lO1o1 = this.I00iiO;
/* 3 */             if (i1I01O1lO1o1 != null) {
/* 20 */                return i1I01O1lO1o1;
                    }
/* 7 */             I1I01O1lO1o1 i1I01O1lO1o12 = new I1I01O1lO1o1(this);
/* 10 */            this.I00iiO = i1I01O1lO1o12;
/* 20 */            return i1I01O1lO1o12;
                }

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I000OiO();
                    }
/* 11 */            I1I1loi i1I1loi = this.I00iiI;
/* 13 */            if (i1I1loi != null) {
/* 15 */                i1I1loi.I00000oOI();
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

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.I00iiI.I0000O();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.I00iiI.I0000oI00();
                }

                @Override
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().I00000oOI(z);
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
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
                }

                @Override
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().I0000Il00O(z);
                }

                @Override
                public void setFilters(InputFilter[] inputFilterArr) {
/* 15 */            super.setFilters(((ilI1Oi0) getEmojiTextViewHelper().I00000oOI.I00iOIl).I00000oIO(inputFilterArr));
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

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             I1I1loi i1I1loi = this.I00iiI;
/* 3 */             i1I1loi.I000O01llI0(colorStateList);
/* 6 */             i1I1loi.I00000oOI();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             I1I1loi i1I1loi = this.I00iiI;
/* 3 */             i1I1loi.I000OOo1O(mode);
/* 6 */             i1I1loi.I00000oOI();
                }
            }

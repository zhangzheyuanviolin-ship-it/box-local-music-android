            package p000;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import com.box.gallery.R;
            
            public final class I0I1iI extends I1I0I11lo implements I0I1ioli {
                public final I0I1ii0i I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0I1iI(I0I1ii0i i0I1ii0i, Context context) {
/* 7 */             super(context, null, R.attr.actionOverflowButtonStyle);
/* 1 */             this.I00iio = i0I1ii0i;
/* 11 */            setClickable(true);
/* 14 */            setFocusable(true);
/* 18 */            setVisibility(0);
/* 21 */            setEnabled(true);
/* 28 */            Oo1l0oIiIllO.I00000oIO(this, getContentDescription());
/* 36 */            setOnTouchListener(new I0I11O000oO(this, this));
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             return false;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                @Override
                public final boolean performClick() {
/* 6 */             if (super.performClick()) {
/* 5 */                 return true;
                    }
/* 10 */            playSoundEffect(0);
/* 15 */            this.I00iio.I000l1();
/* 5 */             return true;
                }

                @Override
                public final boolean setFrame(int i, int i2, int i3, int i4) {
/* 1 */             boolean frame = super.setFrame(i, i2, i3, i4);
/* 5 */             Drawable drawable = getDrawable();
/* 9 */             Drawable background = getBackground();
/* 13 */            if (drawable != null && background != null) {
/* 17 */                int width = getWidth();
/* 21 */                int height = getHeight();
/* 29 */                int iMax = Math.max(width, height) / 2;
/* 50 */                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
/* 53 */                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
/* 61 */                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
                    }
/* 204 */           return frame;
                }
            }

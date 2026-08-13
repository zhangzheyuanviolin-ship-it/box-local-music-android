            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Parcelable;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.ListAdapter;
            import android.widget.Spinner;
            import android.widget.SpinnerAdapter;
            import android.widget.ThemedSpinnerAdapter;
            import java.lang.invoke.VarHandle;
            
            public final class I1I1OI00IOo extends Spinner {
                public static final int[] I00l0I0l0lO1 = {R.attr.spinnerMode};
                public I11l01l I00iOIl;
                public Context I00iiI;
                public I1I0lO1IIO I00iiO;
                public SpinnerAdapter I00iio;
                public boolean I00ilI0I1;
                public I1I1O010 I00ilO0;
                public int I00io1l;
                public Rect I00ioIO;

                public final int I00000oIO(SpinnerAdapter spinnerAdapter, Drawable drawable) {
/* 1 */             Rect rect = this.I00ioIO;
/* 3 */             int i = 0;
/* 4 */             if (spinnerAdapter == null) {
/* 3 */                 return 0;
                    }
/* 11 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
/* 19 */            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
/* 27 */            int iMax = Math.max(0, getSelectedItemPosition());
/* 37 */            int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
/* 52 */            View view = null;
/* 53 */            int iMax2 = 0;
/* 54 */            for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
/* 56 */                int itemViewType = spinnerAdapter.getItemViewType(iMax3);
/* 60 */                if (itemViewType != i) {
/* 62 */                    view = null;
/* 63 */                    i = itemViewType;
                        }
/* 64 */                view = spinnerAdapter.getView(iMax3, view, this);
/* 72 */                if (view.getLayoutParams() == null) {
/* 80 */                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        }
/* 83 */                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 90 */                iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                    }
/* 97 */            if (drawable == null) {
/* 332 */               return iMax2;
                    }
/* 99 */            drawable.getPadding(rect);
/* 107 */           return rect.left + rect.right + iMax2;
                }

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I000OiO();
                    }
                }

                @Override
                public int getDropDownHorizontalOffset() {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
                    return i1i1o010 != null ? i1i1o010.I00000oOI() : super.getDropDownHorizontalOffset();
                }

                @Override
                public int getDropDownVerticalOffset() {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
                    return i1i1o010 != null ? i1i1o010.I000oI1ioi() : super.getDropDownVerticalOffset();
                }

                @Override
                public int getDropDownWidth() {
                    return this.I00ilO0 != null ? this.I00io1l : super.getDropDownWidth();
                }

                public final I1I1O010 getInternalPopup() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public Drawable getPopupBackground() {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
                    return i1i1o010 != null ? i1i1o010.I000II() : super.getPopupBackground();
                }

                @Override
                public Context getPopupContext() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public CharSequence getPrompt() {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
                    return i1i1o010 != null ? i1i1o010.I0000oI00() : super.getPrompt();
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

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 6 */             if (i1i1o010 == null || !i1i1o010.I00000oIO()) {
/* 20 */                return;
                    }
/* 14 */            i1i1o010.dismiss();
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 6 */             if (this.I00ilO0 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
/* 106 */               return;
                    }
/* 48 */            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), I00000oIO(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                }

                @Override
                public final void onRestoreInstanceState(Parcelable parcelable) {
                    ViewTreeObserver viewTreeObserver;
/* 1 */             I1I1O000iiI0 i1I1O000iiI0 = (I1I1O000iiI0) parcelable;
/* 7 */             super.onRestoreInstanceState(i1I1O000iiI0.getSuperState());
/* 12 */            if (!i1I1O000iiI0.I00iOIl || (viewTreeObserver = getViewTreeObserver()) == null) {
/* 77 */                return;
                    }
/* 23 */            I1I0llO0I i1I0llO0I = new I1I0llO0I(0);
/* 26 */            i1I0llO0I.I00iiI = this;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            viewTreeObserver.addOnGlobalLayoutListener(i1I0llO0I);
                }

                @Override
                public final Parcelable onSaveInstanceState() {
/* 7 */             I1I1O000iiI0 i1I1O000iiI0 = new I1I1O000iiI0(super.onSaveInstanceState());
/* 10 */            I1I1O010 i1i1o010 = this.I00ilO0;
/* 23 */            i1I1O000iiI0.I00iOIl = i1i1o010 != null && i1i1o010.I00000oIO();
/* 55 */            return i1I1O000iiI0;
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             I1I0lO1IIO i1I0lO1IIO = this.I00iiO;
/* 3 */             if (i1I0lO1IIO == null || !i1I0lO1IIO.onTouch(this, motionEvent)) {
/* 13 */                return super.onTouchEvent(motionEvent);
                    }
/* 11 */            return true;
                }

                @Override
                public final boolean performClick() {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 3 */             if (i1i1o010 == null) {
/* 24 */                return super.performClick();
                    }
/* 9 */             if (i1i1o010.I00000oIO()) {
/* 22 */                return true;
                    }
/* 19 */            i1i1o010.I000o00OoI0I(getTextDirection(), getTextAlignment());
/* 22 */            return true;
                }

                @Override
                public void setAdapter(SpinnerAdapter spinnerAdapter) {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 5 */             if (!this.I00ilI0I1) {
/* 7 */                 this.I00iio = spinnerAdapter;
/* 9 */                 return;
                    }
/* 10 */            super.setAdapter(spinnerAdapter);
/* 13 */            if (i1i1o010 != null) {
/* 15 */                Context context = this.I00iiI;
/* 17 */                if (context == null) {
/* 19 */                    context = getContext();
                        }
/* 25 */                Resources.Theme theme = context.getTheme();
/* 29 */                I1I0oI1Olo1 i1I0oI1Olo1 = new I1I0oI1Olo1();
/* 32 */                i1I0oI1Olo1.I00000oIO = spinnerAdapter;
/* 36 */                if (spinnerAdapter instanceof ListAdapter) {
/* 41 */                    i1I0oI1Olo1.I00000oOI = (ListAdapter) spinnerAdapter;
                        }
/* 43 */                if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
/* 51 */                    I1I0loI0o.I00000oIO((ThemedSpinnerAdapter) spinnerAdapter, theme);
                        }
/* 54 */                i1i1o010.I00100l0(i1I0oI1Olo1);
                    }
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
                public void setDropDownHorizontalOffset(int i) {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 3 */             if (i1i1o010 == null) {
/* 12 */                super.setDropDownHorizontalOffset(i);
                    } else {
/* 5 */                 i1i1o010.I000lI(i);
/* 8 */                 i1i1o010.I0000O(i);
                    }
                }

                @Override
                public void setDropDownVerticalOffset(int i) {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 3 */             if (i1i1o010 != null) {
/* 5 */                 i1i1o010.I000iOII(i);
                    } else {
/* 9 */                 super.setDropDownVerticalOffset(i);
                    }
                }

                @Override
                public void setDropDownWidth(int i) {
/* 3 */             if (this.I00ilO0 != null) {
/* 5 */                 this.I00io1l = i;
                    } else {
/* 8 */                 super.setDropDownWidth(i);
                    }
                }

                @Override
                public void setPopupBackgroundDrawable(Drawable drawable) {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 3 */             if (i1i1o010 != null) {
/* 5 */                 i1i1o010.I000OOo1O(drawable);
                    } else {
/* 9 */                 super.setPopupBackgroundDrawable(drawable);
                    }
                }

                @Override
                public void setPopupBackgroundResource(int i) {
/* 9 */             setPopupBackgroundDrawable(iOO0oOI1Ol.I00000oIO(getPopupContext(), i));
                }

                @Override
                public void setPrompt(CharSequence charSequence) {
/* 1 */             I1I1O010 i1i1o010 = this.I00ilO0;
/* 3 */             if (i1i1o010 != null) {
/* 5 */                 i1i1o010.I000O01llI0(charSequence);
                    } else {
/* 9 */                 super.setPrompt(charSequence);
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
            }

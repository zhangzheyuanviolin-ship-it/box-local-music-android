            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ViewTreeObserver;
            import android.widget.ListAdapter;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
            public final class I1I1Io extends O10O00o implements I1I1O010 {
                public CharSequence I00oo1iO0ll;
                public I1I0oI1Olo1 I00ooIo0;
                public final Rect I00ooiO1I;
                public int I00oooO;
                public final I1I1OI00IOo I0100i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1I1Io(I1I1OI00IOo i1I1OI00IOo, Context context, AttributeSet attributeSet) {
/* 7 */             super(context, attributeSet, R.attr.spinnerStyle, 0);
/* 1 */             this.I0100i = i1I1OI00IOo;
/* 15 */            this.I00ooiO1I = new Rect();
/* 17 */            this.I00o0iI0io1 = i1I1OI00IOo;
/* 20 */            this.I00oli = true;
/* 24 */            this.I00oliIiO01i.setFocusable(true);
/* 29 */            I1I11i1oI11 i1I11i1oI11 = new I1I11i1oI11(0);
/* 32 */            i1I11i1oI11.I00iiI = this;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            this.I00o0l1o1o0 = i1I11i1oI11;
                }

                @Override
                public final CharSequence I0000oI00() {
/* 1 */             return this.I00oo1iO0ll;
                }

                @Override
                public final void I000O01llI0(CharSequence charSequence) {
/* 1 */             this.I00oo1iO0ll = charSequence;
                }

                @Override
                public final void I000lI(int i) {
/* 1 */             this.I00oooO = i;
                }

                @Override
                public final void I000o00OoI0I(int i, int i2) {
                    ViewTreeObserver viewTreeObserver;
/* 1 */             I1I0OoiI0o i1I0OoiI0o = this.I00oliIiO01i;
/* 3 */             boolean zIsShowing = i1I0OoiI0o.isShowing();
/* 7 */             I0010o();
/* 11 */            i1I0OoiI0o.setInputMethodMode(2);
/* 14 */            I0001Ioi1lo();
/* 17 */            Iio010 iio010 = this.I00iiO;
/* 20 */            iio010.setChoiceMode(1);
/* 23 */            iio010.setTextDirection(i);
/* 26 */            iio010.setTextAlignment(i2);
/* 29 */            I1I1OI00IOo i1I1OI00IOo = this.I0100i;
/* 31 */            int selectedItemPosition = i1I1OI00IOo.getSelectedItemPosition();
/* 35 */            Iio010 iio0102 = this.I00iiO;
/* 41 */            if (i1I0OoiI0o.isShowing() && iio0102 != null) {
/* 46 */                iio0102.setListSelectionHidden(false);
/* 49 */                iio0102.setSelection(selectedItemPosition);
/* 56 */                if (iio0102.getChoiceMode() != 0) {
/* 58 */                    iio0102.setItemChecked(selectedItemPosition, true);
                        }
                    }
/* 61 */            if (zIsShowing || (viewTreeObserver = i1I1OI00IOo.getViewTreeObserver()) == null) {
/* 106 */               return;
                    }
/* 72 */            I1I0llO0I i1I0llO0I = new I1I0llO0I(1);
/* 75 */            i1I0llO0I.I00iiI = this;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            viewTreeObserver.addOnGlobalLayoutListener(i1I0llO0I);
/* 85 */            I1I11iio i1I11iio = new I1I11iio();
/* 88 */            i1I11iio.I00iiI = this;
/* 90 */            i1I11iio.I00iOIl = i1I0llO0I;
/* 92 */            VarHandle.storeStoreFence();
/* 95 */            i1I0OoiI0o.setOnDismissListener(i1I11iio);
                }

                @Override
                public final void I00100l0(ListAdapter listAdapter) {
/* 1 */             super.I00100l0(listAdapter);
/* 6 */             this.I00ooIo0 = (I1I0oI1Olo1) listAdapter;
                }

                public final void I0010o() {
                    int i;
/* 1 */             I1I0OoiI0o i1I0OoiI0o = this.I00oliIiO01i;
/* 3 */             Drawable background = i1I0OoiI0o.getBackground();
/* 7 */             I1I1OI00IOo i1I1OI00IOo = this.I0100i;
/* 9 */             Rect rect = i1I1OI00IOo.I00ioIO;
/* 12 */            if (background != null) {
/* 14 */                background.getPadding(rect);
/* 28 */                i = i1I1OI00IOo.getLayoutDirection() == 1 ? rect.right : -rect.left;
                    } else {
/* 30 */                i = 0;
/* 31 */                rect.right = 0;
/* 33 */                rect.left = 0;
                    }
/* 35 */            int paddingLeft = i1I1OI00IOo.getPaddingLeft();
/* 39 */            int paddingRight = i1I1OI00IOo.getPaddingRight();
/* 43 */            int width = i1I1OI00IOo.getWidth();
/* 47 */            int i2 = i1I1OI00IOo.I00io1l;
/* 50 */            if (i2 == -2) {
/* 58 */                int iI00000oIO = i1I1OI00IOo.I00000oIO(this.I00ooIo0, i1I0OoiI0o.getBackground());
/* 81 */                int i3 = (i1I1OI00IOo.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
/* 82 */                if (iI00000oIO > i3) {
/* 84 */                    iI00000oIO = i3;
                        }
/* 92 */                I0010I0i(Math.max(iI00000oIO, (width - paddingLeft) - paddingRight));
                    } else if (i2 == -1) {
/* 102 */               I0010I0i((width - paddingLeft) - paddingRight);
                    } else {
/* 106 */               I0010I0i(i2);
                    }
/* 129 */           this.I00ilO0 = i1I1OI00IOo.getLayoutDirection() == 1 ? (((width - paddingRight) - this.I00ilI0I1) - this.I00oooO) + i : paddingLeft + this.I00oooO + i;
                }
            }

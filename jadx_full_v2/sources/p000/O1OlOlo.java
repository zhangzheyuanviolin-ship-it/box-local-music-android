            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ArrayAdapter;
            import android.widget.TextView;
            
            public final class O1OlOlo extends ArrayAdapter {
                public ColorStateList I00000oIO;
                public ColorStateList I00000oOI;
                public final O1Oli0 I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1OlOlo(O1Oli0 o1Oli0, Context context, int i, String[] strArr) {
/* 3 */             super(context, i, strArr);
/* 1 */             this.I0000Il00O = o1Oli0;
/* 6 */             I00000oIO();
                }

                public final void I00000oIO() {
                    ColorStateList colorStateList;
/* 1 */             O1Oli0 o1Oli0 = this.I0000Il00O;
/* 3 */             ColorStateList colorStateList2 = o1Oli0.I00li1OI;
/* 5 */             ColorStateList colorStateList3 = null;
/* 7 */             if (colorStateList2 != null) {
/* 12 */                int[] iArr = {R.attr.state_pressed};
/* 32 */                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
                    } else {
/* 36 */                colorStateList = null;
                    }
/* 37 */            this.I00000oOI = colorStateList;
/* 41 */            if (o1Oli0.I00l0OO0IO != 0 && o1Oli0.I00li1OI != null) {
/* 53 */                int[] iArr2 = {R.attr.state_hovered, -16842919};
/* 60 */                int[] iArr3 = {R.attr.state_selected, -16842919};
/* 102 */               colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{IOOliIoI1l.I00000oOI(o1Oli0.I00li1OI.getColorForState(iArr3, 0), o1Oli0.I00l0OO0IO), IOOliIoI1l.I00000oOI(o1Oli0.I00li1OI.getColorForState(iArr2, 0), o1Oli0.I00l0OO0IO), o1Oli0.I00l0OO0IO});
                    }
/* 105 */           this.I00000oIO = colorStateList3;
                }

                @Override
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             View view2 = super.getView(i, view, viewGroup);
/* 7 */             if (view2 instanceof TextView) {
/* 10 */                TextView textView = (TextView) view2;
/* 12 */                O1Oli0 o1Oli0 = this.I0000Il00O;
/* 30 */                Drawable rippleDrawable = null;
/* 31 */                if (o1Oli0.getText().toString().contentEquals(textView.getText()) && o1Oli0.I00l0OO0IO != 0) {
/* 41 */                    ColorDrawable colorDrawable = new ColorDrawable(o1Oli0.I00l0OO0IO);
/* 46 */                    if (this.I00000oOI != null) {
/* 50 */                        colorDrawable.setTintList(this.I00000oIO);
/* 57 */                        rippleDrawable = new RippleDrawable(this.I00000oOI, colorDrawable, null);
                            } else {
/* 62 */                        rippleDrawable = colorDrawable;
                            }
                        }
/* 63 */                textView.setBackground(rippleDrawable);
                    }
/* 98 */            return view2;
                }
            }

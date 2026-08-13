            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.widget.CompoundButton;
            import android.widget.TextView;
            import java.util.WeakHashMap;
            
            public final class I11lI0IO0O01 {
                public ColorStateList I00000oIO = null;
                public PorterDuff.Mode I00000oOI = null;
                public boolean I0000Il00O = false;
                public boolean I0000O = false;
                public boolean I0000oI00;
                public TextView I0001Ioi1lo;

                public I11lI0IO0O01(CompoundButton compoundButton) {
/* 14 */            this.I0001Ioi1lo = compoundButton;
                }

                public void I00000oIO() {
/* 3 */             CompoundButton compoundButton = (CompoundButton) this.I0001Ioi1lo;
/* 5 */             Drawable buttonDrawable = compoundButton.getButtonDrawable();
/* 9 */             if (buttonDrawable != null) {
/* 13 */                if (this.I0000Il00O || this.I0000O) {
/* 19 */                    Drawable drawableMutate = buttonDrawable.mutate();
/* 25 */                    if (this.I0000Il00O) {
/* 29 */                        drawableMutate.setTintList(this.I00000oIO);
                            }
/* 34 */                    if (this.I0000O) {
/* 38 */                        drawableMutate.setTintMode(this.I00000oOI);
                            }
/* 45 */                    if (drawableMutate.isStateful()) {
/* 51 */                        drawableMutate.setState(compoundButton.getDrawableState());
                            }
/* 54 */                    compoundButton.setButtonDrawable(drawableMutate);
                        }
                    }
                }

                public void I00000oOI() {
/* 3 */             I11l1ioo1IoI i11l1ioo1IoI = (I11l1ioo1IoI) this.I0001Ioi1lo;
/* 5 */             Drawable checkMarkDrawable = i11l1ioo1IoI.getCheckMarkDrawable();
/* 9 */             if (checkMarkDrawable != null) {
/* 13 */                if (this.I0000Il00O || this.I0000O) {
/* 19 */                    Drawable drawableMutate = checkMarkDrawable.mutate();
/* 25 */                    if (this.I0000Il00O) {
/* 29 */                        drawableMutate.setTintList(this.I00000oIO);
                            }
/* 34 */                    if (this.I0000O) {
/* 38 */                        drawableMutate.setTintMode(this.I00000oOI);
                            }
/* 45 */                    if (drawableMutate.isStateful()) {
/* 51 */                        drawableMutate.setState(i11l1ioo1IoI.getDrawableState());
                            }
/* 54 */                    i11l1ioo1IoI.setCheckMarkDrawable(drawableMutate);
                        }
                    }
                }

                public void I0000Il00O(AttributeSet attributeSet, int i) {
                    int resourceId;
                    int resourceId2;
/* 4 */             CompoundButton compoundButton = (CompoundButton) this.I0001Ioi1lo;
/* 6 */             Context context = compoundButton.getContext();
/* 10 */            int[] iArr = OOilOli0.I000lI;
/* 12 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, iArr, i);
/* 19 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 21 */            Context context2 = compoundButton.getContext();
/* 28 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 30 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 35 */            OooiO1oOi1.I00000oOI(compoundButton, context2, iArr, attributeSet, typedArray2, i, 0);
                    try {
/* 44 */                if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                            try {
/* 60 */                        compoundButton.setButtonDrawable(iOO0oOI1Ol.I00000oIO(compoundButton.getContext(), resourceId2));
                            } catch (Resources.NotFoundException unused) {
                            }
                        } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
/* 87 */                    compoundButton.setButtonDrawable(iOO0oOI1Ol.I00000oIO(compoundButton.getContext(), resourceId));
                        }
/* 95 */                if (typedArray.hasValue(2)) {
/* 101 */                   compoundButton.setButtonTintList(olilOlOiII0010I0i.I000OiO(2));
                        }
/* 109 */               if (typedArray.hasValue(3)) {
/* 121 */                   compoundButton.setButtonTintMode(IiloO11l.I00000oIO(typedArray.getInt(3, -1), null));
                        }
/* 124 */               olilOlOiII0010I0i.I0010o();
                    } catch (Throwable th) {
/* 128 */               olilOlOiII0010I0i.I0010o();
/* 332 */               throw th;
                    }
                }
            }

            package com.google.android.material.bottomsheet;

            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import android.util.TypedValue;
            import android.view.View;
            import android.view.ViewConfiguration;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import p000.I000II;
            import p000.II1Ii0o;
            import p000.IIloOI;
            import p000.O1OoOIoiiO1I;
            import p000.O1Ooi0;
            import p000.OOilOii0o1I;
            import p000.OioOlIlii1il;
            import p000.iioiIoioo1I0;
            import p000.l1I11O1Iooi1;
            
/* 427 */   public class BottomSheetBehavior<V extends View> extends iioiIoioo1I0 {
                public final boolean I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;
                public final O1Ooi0 I0000O;
                public final ColorStateList I0000oI00;
                public final boolean I0001Ioi1lo;
                public final OioOlIlii1il I000II;
                public boolean I000O01llI0;
                public final ValueAnimator I000OOo1O;
                public final int I000OiO;
                public final boolean I000iOII;
                public int I000l1;

                public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
                    int i;
                    int i2;
/* 5 */             this.I00000oIO = true;
/* 10 */            new IIloOI(this, 6);
/* 14 */            this.I000l1 = 4;
/* 18 */            new ArrayList();
/* 23 */            new SparseIntArray();
/* 33 */            context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
/* 38 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOii0o1I.I00000oIO);
/* 42 */            int i3 = 3;
/* 47 */            if (typedArrayObtainStyledAttributes.hasValue(3)) {
/* 53 */                this.I0000oI00 = l1I11O1Iooi1.I00000oIO(context, typedArrayObtainStyledAttributes, 3);
                    }
/* 61 */            if (typedArrayObtainStyledAttributes.hasValue(22)) {
/* 77 */                this.I000II = OioOlIlii1il.I00000oOI(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).I00000oIO();
                    }
/* 79 */            OioOlIlii1il oioOlIlii1il = this.I000II;
/* 81 */            if (oioOlIlii1il != null) {
/* 86 */                O1Ooi0 o1Ooi0 = new O1Ooi0(oioOlIlii1il);
/* 89 */                this.I0000O = o1Ooi0;
/* 91 */                o1Ooi0.I000II(context);
/* 94 */                ColorStateList colorStateList = this.I0000oI00;
/* 96 */                if (colorStateList != null) {
/* 98 */                    O1Ooi0 o1Ooi02 = this.I0000O;
/* 100 */                   O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi02.I00iiI;
/* 104 */                   if (o1OoOIoiiO1I.I0000O != colorStateList) {
/* 106 */                       o1OoOIoiiO1I.I0000O = colorStateList;
/* 112 */                       o1Ooi02.onStateChange(o1Ooi02.getState());
                            }
                        } else {
/* 118 */                   TypedValue typedValue = new TypedValue();
/* 128 */                   context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
/* 135 */                   this.I0000O.setTint(typedValue.data);
                        }
                    }
/* 144 */           ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 148 */           this.I000OOo1O = valueAnimatorOfFloat;
/* 152 */           valueAnimatorOfFloat.setDuration(500L);
/* 155 */           ValueAnimator valueAnimator = this.I000OOo1O;
/* 159 */           II1Ii0o iI1Ii0o = new II1Ii0o();
/* 162 */           iI1Ii0o.I00000oIO = this;
/* 164 */           VarHandle.storeStoreFence();
/* 167 */           valueAnimator.addUpdateListener(iI1Ii0o);
/* 172 */           typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
/* 181 */           if (typedArrayObtainStyledAttributes.hasValue(0)) {
/* 183 */               typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                    }
/* 190 */           if (typedArrayObtainStyledAttributes.hasValue(1)) {
/* 192 */               typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
                    }
/* 197 */           TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
/* 201 */           if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
/* 215 */               I00000oIO(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
                    } else {
/* 207 */               I00000oIO(i2);
                    }
/* 220 */           boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
/* 227 */           if (this.I000iOII != z) {
/* 229 */               this.I000iOII = z;
/* 231 */               if (!z && this.I000l1 == 5 && this.I000l1 != 4) {
/* 242 */                   this.I000l1 = 4;
                        }
                    }
/* 246 */           typedArrayObtainStyledAttributes.getBoolean(14, false);
/* 250 */           boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
/* 256 */           if (this.I00000oIO != z2) {
/* 259 */               this.I00000oIO = z2;
/* 261 */               if (!z2 || (i = this.I000l1) != 6) {
/* 268 */                   i3 = this.I000l1;
/* 270 */                   i = i3;
                        }
/* 271 */               if (i == i3) {
/* 273 */                   i3 = i;
                        } else {
/* 275 */                   this.I000l1 = i3;
                        }
/* 277 */               I00000oOI(i3);
                    }
/* 282 */           typedArrayObtainStyledAttributes.getBoolean(13, false);
/* 285 */           typedArrayObtainStyledAttributes.getBoolean(4, true);
/* 288 */           typedArrayObtainStyledAttributes.getBoolean(5, true);
/* 293 */           typedArrayObtainStyledAttributes.getInt(11, 0);
/* 300 */           float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
/* 308 */           if (f <= 0.0f || f >= 1.0f) {
/* 424 */               I000II.I000iOII("ratio must be a float value between 0 and 1");
/* 427 */               throw null;
                    }
/* 316 */           TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
/* 324 */           if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
/* 346 */               int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
/* 350 */               if (dimensionPixelOffset < 0) {
/* 418 */                   I000II.I000iOII("offset must be greater than or equal to 0");
/* 421 */                   throw null;
                        }
/* 352 */               this.I000OiO = dimensionPixelOffset;
/* 356 */               I00000oOI(this.I000l1);
                    } else {
/* 330 */               int i4 = typedValuePeekValue2.data;
/* 332 */               if (i4 < 0) {
/* 342 */                   I000II.I000iOII("offset must be greater than or equal to 0");
/* 345 */                   throw null;
                        }
/* 334 */               this.I000OiO = i4;
/* 338 */               I00000oOI(this.I000l1);
                    }
/* 363 */           typedArrayObtainStyledAttributes.getInt(12, 500);
/* 368 */           typedArrayObtainStyledAttributes.getBoolean(18, false);
/* 373 */           typedArrayObtainStyledAttributes.getBoolean(19, false);
/* 378 */           typedArrayObtainStyledAttributes.getBoolean(20, false);
/* 383 */           typedArrayObtainStyledAttributes.getBoolean(21, true);
/* 388 */           typedArrayObtainStyledAttributes.getBoolean(15, false);
/* 391 */           typedArrayObtainStyledAttributes.getBoolean(16, false);
/* 396 */           typedArrayObtainStyledAttributes.getBoolean(17, false);
/* 405 */           this.I0001Ioi1lo = typedArrayObtainStyledAttributes.getBoolean(24, true);
/* 407 */           typedArrayObtainStyledAttributes.recycle();
/* 414 */           ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                }

                public final void I00000oIO(int i) {
/* 1 */             boolean z = this.I0000Il00O;
/* 4 */             if (i == -1) {
/* 6 */                 if (z) {
/* 19 */                    return;
                        }
/* 9 */                 this.I0000Il00O = true;
                    } else if (z || this.I00000oOI != i) {
/* 21 */                this.I0000Il00O = false;
/* 27 */                this.I00000oOI = Math.max(0, i);
                    }
                }

                public final void I00000oOI(int i) {
                    O1Ooi0 o1Ooi0;
/* 2 */             if (i == 2) {
/* 186 */               return;
                    }
/* 19 */            boolean z = this.I000l1 == 3 && this.I0001Ioi1lo;
/* 22 */            if (this.I000O01llI0 == z || (o1Ooi0 = this.I0000O) == null) {
/* 186 */               return;
                    }
/* 29 */            this.I000O01llI0 = z;
/* 31 */            ValueAnimator valueAnimator = this.I000OOo1O;
/* 36 */            if (valueAnimator != null) {
/* 42 */                if (valueAnimator.isRunning()) {
/* 44 */                    valueAnimator.reverse();
/* 47 */                    return;
                        } else {
/* 61 */                    valueAnimator.setFloatValues(o1Ooi0.I00iiI.I000OiO, z ? 0.0f : 1.0f);
/* 64 */                    valueAnimator.start();
/* 67 */                    return;
                        }
                    }
/* 68 */            if (valueAnimator != null && valueAnimator.isRunning()) {
/* 76 */                valueAnimator.cancel();
                    }
/* 81 */            float f = this.I000O01llI0 ? 0.0f : 1.0f;
/* 84 */            O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0.I00iiI;
/* 90 */            if (o1OoOIoiiO1I.I000OiO != f) {
/* 92 */                o1OoOIoiiO1I.I000OiO = f;
/* 94 */                o1Ooi0.I00ilO0 = true;
/* 96 */                o1Ooi0.I00io1l = true;
/* 98 */                o1Ooi0.invalidateSelf();
                    }
                }

/* 428 */       public BottomSheetBehavior() {
/* 430 */           this.I00000oIO = true;
/* 432 */           new IIloOI(this, 6);
/* 433 */           this.I000l1 = 4;
/* 434 */           new ArrayList();
/* 435 */           new SparseIntArray();
                }
            }

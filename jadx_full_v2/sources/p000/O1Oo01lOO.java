            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.AnimatedStateListDrawable;
            import android.graphics.drawable.AnimatedVectorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.autofill.AutofillManager;
            import android.widget.CompoundButton;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            
/* 11 */    public final class O1Oo01lOO extends I11l110liiOi {
                public static final int[] I00oli = {R.attr.state_indeterminate};
                public static final int[] I00oliIiO01i = {R.attr.state_error};
                public static final int[][] I00oo1iO0ll = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
                public static final int I00ooIo0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
                public final LinkedHashSet I00ilI0I1;
                public final LinkedHashSet I00ilO0;
                public ColorStateList I00io1l;
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public CharSequence I00li1OI;
                public Drawable I00ll1;
                public Drawable I00lli11;
                public boolean I00lll10;
                public ColorStateList I00o0iI0io1;
                public ColorStateList I00o0l1o1o0;
                public PorterDuff.Mode I00o101lO;
                public int I00oI0i;
                public int[] I00oII;
                public boolean I00oIiI10;
                public CharSequence I00oO101o;
                public CompoundButton.OnCheckedChangeListener I00oOio10iI1;
                public final I10o0lIl I00ol1;
                public final O1Olool I00olI;

                public O1Oo01lOO(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
                    ColorStateList colorStateList;
                    int resourceId;
                    int resourceId2;
                    int resourceId3;
/* 14 */            super(iIoiO1l.I00000oIO(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]), attributeSet);
/* 22 */            this.I00ilI0I1 = new LinkedHashSet();
/* 29 */            this.I00ilO0 = new LinkedHashSet();
/* 31 */            Context context2 = getContext();
/* 37 */            I10o0lIl i10o0lIl = new I10o0lIl(context2);
/* 40 */            Resources resources = context2.getResources();
/* 44 */            Resources.Theme theme = context2.getTheme();
/* 48 */            ThreadLocal threadLocal = Oi0oolOI.I00000oIO;
/* 53 */            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
/* 57 */            i10o0lIl.I00iOIl = drawable;
/* 61 */            drawable.setCallback(i10o0lIl.I00ilO0);
/* 72 */            new I10o0OiiO(i10o0lIl.I00iOIl.getConstantState());
/* 75 */            this.I00ol1 = i10o0lIl;
/* 79 */            O1Olool o1Olool = new O1Olool();
/* 82 */            o1Olool.I00000oOI = this;
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            this.I00olI = o1Olool;
/* 89 */            Context context3 = getContext();
/* 97 */            this.I00ll1 = getButtonDrawable();
/* 103 */           this.I00o0iI0io1 = getSuperButtonTintList();
/* 106 */           setSupportButtonTintList(null);
/* 114 */           iO1I10lioi.I00000oIO(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
/* 117 */           int[] iArr = OOilOii0o1I.I000II;
/* 120 */           iO1I10lioi.I00000oOI(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
/* 123 */           TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
/* 149 */           this.I00lli11 = (!typedArrayObtainStyledAttributes.hasValue(2) || (resourceId3 = typedArrayObtainStyledAttributes.getResourceId(2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(2) : iOO0oOI1Ol.I00000oIO(context3, resourceId3);
/* 154 */           if (this.I00ll1 != null && l1I0O0OI0oO.I00000oOI(context3, R.attr.isMaterial3Theme, false)) {
/* 165 */               int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
/* 169 */               int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
/* 175 */               if (resourceId4 == I00ooIo0 && resourceId5 == 0) {
/* 179 */                   super.setButtonDrawable((Drawable) null);
/* 189 */                   this.I00ll1 = iOO0oOI1Ol.I00000oIO(context3, R.drawable.mtrl_checkbox_button);
/* 191 */                   this.I00lll10 = true;
/* 195 */                   if (this.I00lli11 == null) {
/* 204 */                       this.I00lli11 = iOO0oOI1Ol.I00000oIO(context3, R.drawable.mtrl_checkbox_button_icon);
                            }
                        }
                    }
/* 211 */           if ((!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = iOI10i0I11.I00000oOI(context3, resourceId2)) == null) && (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = iOI10i0I11.I00000oOI(context3, resourceId)) == null)) {
/* 245 */               colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
                    }
/* 250 */           this.I00o0l1o1o0 = colorStateList;
/* 254 */           int i = typedArrayObtainStyledAttributes.getInt(4, -1);
/* 258 */           PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
/* 264 */           this.I00o101lO = li1lliOI.I00000oIO(i);
/* 272 */           this.I00ioIO = typedArrayObtainStyledAttributes.getBoolean(10, false);
/* 279 */           this.I00l0I0l0lO1 = typedArrayObtainStyledAttributes.getBoolean(6, true);
/* 287 */           this.I00l0OO0IO = typedArrayObtainStyledAttributes.getBoolean(9, false);
/* 295 */           this.I00li1OI = typedArrayObtainStyledAttributes.getText(8);
/* 302 */           if (typedArrayObtainStyledAttributes.hasValue(7)) {
/* 308 */               setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
                    }
/* 311 */           typedArrayObtainStyledAttributes.recycle();
/* 314 */           I00000oIO();
                }

                private String getButtonStateDescription() {
/* 1 */             int i = this.I00oI0i;
                    return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
                }

                private ColorStateList getMaterialThemeColorsTintList() {
/* 1 */             ColorStateList colorStateList = this.I00io1l;
/* 3 */             if (colorStateList != null) {
/* 110 */               return colorStateList;
                    }
/* 8 */             int iI00000oOI = l1I10i.I00000oOI(this, R.attr.colorControlActivated);
/* 15 */            int iI00000oOI2 = l1I10i.I00000oOI(this, R.attr.colorError);
/* 22 */            int iI00000oOI3 = l1I10i.I00000oOI(this, R.attr.colorSurface);
/* 29 */            int iI00000oOI4 = l1I10i.I00000oOI(this, R.attr.colorOnSurface);
/* 69 */            ColorStateList colorStateList2 = new ColorStateList(I00oo1iO0ll, new int[]{l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI2, 1.0f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI, 1.0f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI4, 0.54f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI4, 0.38f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI4, 0.38f)});
/* 72 */            this.I00io1l = colorStateList2;
/* 74 */            return colorStateList2;
                }

                private ColorStateList getSuperButtonTintList() {
/* 1 */             ColorStateList colorStateList = this.I00o0iI0io1;
                    return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
                }

                public final void I00000oIO() {
                    ColorStateList colorStateList;
                    ColorStateList colorStateList2;
                    I0I0oIi0oll i0I0oIi0oll;
/* 1 */             Drawable drawableMutate = this.I00ll1;
/* 3 */             ColorStateList colorStateList3 = this.I00o0iI0io1;
/* 5 */             PorterDuff.Mode buttonTintMode = getButtonTintMode();
/* 10 */            if (drawableMutate == null) {
/* 12 */                drawableMutate = null;
                    } else if (colorStateList3 != null) {
/* 16 */                drawableMutate = drawableMutate.mutate();
/* 20 */                if (buttonTintMode != null) {
/* 22 */                    drawableMutate.setTintMode(buttonTintMode);
                        }
                    }
/* 25 */            this.I00ll1 = drawableMutate;
/* 27 */            Drawable drawableMutate2 = this.I00lli11;
/* 29 */            ColorStateList colorStateList4 = this.I00o0l1o1o0;
/* 31 */            PorterDuff.Mode mode = this.I00o101lO;
/* 33 */            if (drawableMutate2 == null) {
/* 35 */                drawableMutate2 = null;
                    } else if (colorStateList4 != null) {
/* 39 */                drawableMutate2 = drawableMutate2.mutate();
/* 43 */                if (mode != null) {
/* 45 */                    drawableMutate2.setTintMode(mode);
                        }
                    }
/* 48 */            this.I00lli11 = drawableMutate2;
/* 53 */            if (this.I00lll10) {
/* 57 */                I10o0lIl i10o0lIl = this.I00ol1;
/* 59 */                if (i10o0lIl != null) {
/* 61 */                    I10o01li1i i10o01li1i = i10o0lIl.I00iiI;
/* 63 */                    Drawable drawable = i10o0lIl.I00iOIl;
/* 65 */                    O1Olool o1Olool = this.I00olI;
/* 67 */                    if (drawable != null) {
/* 69 */                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
/* 71 */                        I10OooOIill0 i10OooOIill0 = o1Olool.I00000oIO;
/* 73 */                        if (i10OooOIill0 == null) {
/* 77 */                            i10OooOIill0 = new I10OooOIill0(o1Olool);
/* 80 */                            o1Olool.I00000oIO = i10OooOIill0;
                                }
/* 82 */                        animatedVectorDrawable.unregisterAnimationCallback(i10OooOIill0);
                            }
/* 85 */                    ArrayList arrayList = i10o0lIl.I00ilI0I1;
/* 87 */                    if (arrayList != null && o1Olool != null) {
/* 92 */                        arrayList.remove(o1Olool);
/* 101 */                       if (i10o0lIl.I00ilI0I1.size() == 0 && (i0I0oIi0oll = i10o0lIl.I00iio) != null) {
/* 109 */                           i10o01li1i.I00000oOI.removeListener(i0I0oIi0oll);
/* 112 */                           i10o0lIl.I00iio = null;
                                }
                            }
/* 114 */                   Drawable drawable2 = i10o0lIl.I00iOIl;
/* 116 */                   if (drawable2 != null) {
/* 118 */                       AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
/* 120 */                       I10OooOIill0 i10OooOIill02 = o1Olool.I00000oIO;
/* 122 */                       if (i10OooOIill02 == null) {
/* 126 */                           i10OooOIill02 = new I10OooOIill0(o1Olool);
/* 129 */                           o1Olool.I00000oIO = i10OooOIill02;
                                }
/* 131 */                       animatedVectorDrawable2.registerAnimationCallback(i10OooOIill02);
                            } else if (o1Olool != null) {
/* 138 */                       ArrayList arrayList2 = i10o0lIl.I00ilI0I1;
/* 140 */                       if (arrayList2 == null) {
/* 144 */                           arrayList2 = new ArrayList();
/* 147 */                           i10o0lIl.I00ilI0I1 = arrayList2;
                                }
/* 153 */                       if (!arrayList2.contains(o1Olool)) {
/* 158 */                           i10o0lIl.I00ilI0I1.add(o1Olool);
/* 161 */                           I0I0oIi0oll i0I0oIi0oll2 = i10o0lIl.I00iio;
/* 163 */                           if (i0I0oIi0oll2 == null) {
/* 167 */                               i0I0oIi0oll2 = new I0I0oIi0oll(i10o0lIl, 1);
/* 170 */                               i10o0lIl.I00iio = i0I0oIi0oll2;
                                    }
/* 174 */                           i10o01li1i.I00000oOI.addListener(i0I0oIi0oll2);
                                }
                            }
                        }
/* 177 */               Drawable drawable3 = this.I00ll1;
/* 181 */               if ((drawable3 instanceof AnimatedStateListDrawable) && i10o0lIl != null) {
/* 194 */                   ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, i10o0lIl, false);
/* 204 */                   ((AnimatedStateListDrawable) this.I00ll1).addTransition(R.id.indeterminate, R.id.unchecked, i10o0lIl, false);
                        }
                    }
/* 207 */           Drawable drawable4 = this.I00ll1;
/* 209 */           if (drawable4 != null && (colorStateList2 = this.I00o0iI0io1) != null) {
/* 215 */               drawable4.setTintList(colorStateList2);
                    }
/* 218 */           Drawable drawable5 = this.I00lli11;
/* 220 */           if (drawable5 != null && (colorStateList = this.I00o0l1o1o0) != null) {
/* 226 */               drawable5.setTintList(colorStateList);
                    }
/* 229 */           Drawable drawable6 = this.I00ll1;
/* 231 */           Drawable drawable7 = this.I00lli11;
/* 233 */           if (drawable6 == null) {
/* 235 */               drawable6 = drawable7;
                    } else if (drawable7 != null) {
/* 240 */               int intrinsicWidth = drawable7.getIntrinsicWidth();
/* 245 */               if (intrinsicWidth == -1) {
/* 248 */                   intrinsicWidth = drawable6.getIntrinsicWidth();
                        }
/* 252 */               int intrinsicHeight = drawable7.getIntrinsicHeight();
/* 256 */               if (intrinsicHeight == -1) {
/* 259 */                   intrinsicHeight = drawable6.getIntrinsicHeight();
                        }
/* 267 */               if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
/* 278 */                   float f = intrinsicWidth / intrinsicHeight;
/* 292 */                   if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
/* 294 */                       int intrinsicWidth2 = drawable6.getIntrinsicWidth();
/* 300 */                       intrinsicHeight = (int) (intrinsicWidth2 / f);
/* 301 */                       intrinsicWidth = intrinsicWidth2;
                            } else {
/* 303 */                       intrinsicHeight = drawable6.getIntrinsicHeight();
/* 309 */                       intrinsicWidth = (int) (f * intrinsicHeight);
                            }
                        }
/* 316 */               LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
/* 319 */               layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
/* 324 */               layerDrawable.setLayerGravity(1, 17);
/* 327 */               drawable6 = layerDrawable;
                    }
/* 328 */           super.setButtonDrawable(drawable6);
/* 331 */           refreshDrawableState();
                }

                @Override
                public Drawable getButtonDrawable() {
/* 1 */             return this.I00ll1;
                }

                public Drawable getButtonIconDrawable() {
/* 1 */             return this.I00lli11;
                }

                public ColorStateList getButtonIconTintList() {
/* 1 */             return this.I00o0l1o1o0;
                }

                public PorterDuff.Mode getButtonIconTintMode() {
/* 1 */             return this.I00o101lO;
                }

                @Override
                public ColorStateList getButtonTintList() {
/* 1 */             return this.I00o0iI0io1;
                }

                public int getCheckedState() {
/* 1 */             return this.I00oI0i;
                }

                public CharSequence getErrorAccessibilityLabel() {
/* 1 */             return this.I00li1OI;
                }

                @Override
                public final boolean isChecked() {
                    return this.I00oI0i == 1;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.I00ioIO && this.I00o0iI0io1 == null && this.I00o0l1o1o0 == null) {
/* 17 */                setUseMaterialThemeColors(true);
                    }
                }

                @Override
                public final int[] onCreateDrawableState(int i) {
                    int[] iArrCopyOf;
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
/* 11 */            if (getCheckedState() == 2) {
/* 15 */                View.mergeDrawableStates(iArrOnCreateDrawableState, I00oli);
                    }
/* 20 */            if (this.I00l0OO0IO) {
/* 24 */                View.mergeDrawableStates(iArrOnCreateDrawableState, I00oliIiO01i);
                    }
/* 27 */            int i2 = 0;
                    while (true) {
/* 32 */                if (i2 >= iArrOnCreateDrawableState.length) {
/* 57 */                    iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
/* 62 */                    iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                            break;
                        }
/* 34 */                int i3 = iArrOnCreateDrawableState[i2];
/* 36 */                if (i3 == 16842912) {
/* 38 */                    iArrCopyOf = iArrOnCreateDrawableState;
                            break;
                        }
/* 40 */                if (i3 == 0) {
/* 46 */                    iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
/* 48 */                    iArrCopyOf[i2] = 16842912;
                            break;
                        }
/* 51 */                i2++;
                    }
/* 64 */            this.I00oII = iArrCopyOf;
/* 77 */            return iArrOnCreateDrawableState;
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    Drawable buttonDrawable;
/* 3 */             if (!this.I00l0I0l0lO1 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
/* 84 */                super.onDraw(canvas);
/* 168 */               return;
                    }
/* 40 */            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
/* 41 */            int iSave = canvas.save();
/* 47 */            canvas.translate(width, 0.0f);
/* 50 */            super.onDraw(canvas);
/* 53 */            canvas.restoreToCount(iSave);
/* 60 */            if (getBackground() != null) {
/* 62 */                Rect bounds = buttonDrawable.getBounds();
/* 80 */                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                    }
                }

                @Override
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 4 */             if (accessibilityNodeInfo != null && this.I00l0OO0IO) {
/* 37 */                accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.I00li1OI));
                    }
                }

                @Override
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof O1Oo00ii00)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             O1Oo00ii00 o1Oo00ii00 = (O1Oo00ii00) parcelable;
/* 15 */            super.onRestoreInstanceState(o1Oo00ii00.getSuperState());
/* 20 */            setCheckedState(o1Oo00ii00.I00iOIl);
                }

                @Override
                public final Parcelable onSaveInstanceState() {
/* 7 */             O1Oo00ii00 o1Oo00ii00 = new O1Oo00ii00(super.onSaveInstanceState());
/* 14 */            o1Oo00ii00.I00iOIl = getCheckedState();
/* 20 */            return o1Oo00ii00;
                }

                @Override
                public void setButtonDrawable(int i) {
/* 9 */             setButtonDrawable(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }

                public void setButtonIconDrawable(Drawable drawable) {
/* 1 */             this.I00lli11 = drawable;
/* 3 */             I00000oIO();
                }

                public void setButtonIconDrawableResource(int i) {
/* 9 */             setButtonIconDrawable(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }

                public void setButtonIconTintList(ColorStateList colorStateList) {
/* 3 */             if (this.I00o0l1o1o0 == colorStateList) {
/* 5 */                 return;
                    }
/* 6 */             this.I00o0l1o1o0 = colorStateList;
/* 8 */             I00000oIO();
                }

                public void setButtonIconTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.I00o101lO == mode) {
/* 5 */                 return;
                    }
/* 6 */             this.I00o101lO = mode;
/* 8 */             I00000oIO();
                }

                @Override
                public void setButtonTintList(ColorStateList colorStateList) {
/* 3 */             if (this.I00o0iI0io1 == colorStateList) {
/* 5 */                 return;
                    }
/* 6 */             this.I00o0iI0io1 = colorStateList;
/* 8 */             I00000oIO();
                }

                @Override
                public void setButtonTintMode(PorterDuff.Mode mode) {
/* 1 */             setSupportButtonTintMode(mode);
/* 4 */             I00000oIO();
                }

                public void setCenterIfNoTextEnabled(boolean z) {
/* 1 */             this.I00l0I0l0lO1 = z;
                }

                @Override
                public void setChecked(boolean z) {
/* 1 */             setCheckedState(z ? 1 : 0);
                }

                public void setCheckedState(int i) {
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
/* 3 */             if (this.I00oI0i != i) {
/* 5 */                 this.I00oI0i = i;
/* 14 */                super.setChecked(i == 1);
/* 17 */                refreshDrawableState();
/* 22 */                if (this.I00oO101o == null) {
/* 28 */                    super.setStateDescription(getButtonStateDescription());
                        }
/* 33 */                if (this.I00oIiI10) {
/* 168 */                   return;
                        }
/* 36 */                this.I00oIiI10 = true;
/* 38 */                LinkedHashSet linkedHashSet = this.I00ilO0;
/* 40 */                if (linkedHashSet != null) {
/* 42 */                    Iterator it = linkedHashSet.iterator();
/* 50 */                    if (it.hasNext()) {
/* 57 */                        throw IIlIOloOOO.I000lI(it);
                            }
                        }
/* 61 */                if (this.I00oI0i != 2 && (onCheckedChangeListener = this.I00oOio10iI1) != null) {
/* 71 */                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                        }
/* 84 */                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
/* 86 */                if (autofillManager != null) {
/* 88 */                    autofillManager.notifyValueChanged(this);
                        }
/* 91 */                this.I00oIiI10 = false;
                    }
                }

                public void setErrorAccessibilityLabel(CharSequence charSequence) {
/* 1 */             this.I00li1OI = charSequence;
                }

                public void setErrorAccessibilityLabelResource(int i) {
/* 13 */            setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
                }

                public void setErrorShown(boolean z) {
/* 3 */             if (this.I00l0OO0IO == z) {
/* 23 */                return;
                    }
/* 6 */             this.I00l0OO0IO = z;
/* 8 */             refreshDrawableState();
/* 13 */            Iterator it = this.I00ilI0I1.iterator();
/* 21 */            if (it.hasNext()) {
/* 29 */                throw IIlIOloOOO.I000lI(it);
                    }
                }

                @Override
                public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
/* 1 */             this.I00oOio10iI1 = onCheckedChangeListener;
                }

                @Override
                public void setStateDescription(CharSequence charSequence) {
/* 1 */             this.I00oO101o = charSequence;
/* 3 */             if (charSequence != null) {
/* 15 */                super.setStateDescription(charSequence);
                    } else if (charSequence == null) {
/* 11 */                super.setStateDescription(getButtonStateDescription());
                    }
                }

                public void setUseMaterialThemeColors(boolean z) {
/* 1 */             this.I00ioIO = z;
/* 3 */             if (z) {
/* 9 */                 setButtonTintList(getMaterialThemeColorsTintList());
                    } else {
/* 14 */                setButtonTintList(null);
                    }
                }

                @Override
                public final void toggle() {
/* 7 */             setChecked(!isChecked());
                }

                @Override
/* 12 */        public void setButtonDrawable(Drawable drawable) {
/* 13 */            this.I00ll1 = drawable;
/* 14 */            this.I00lll10 = false;
/* 15 */            I00000oIO();
                }
            }

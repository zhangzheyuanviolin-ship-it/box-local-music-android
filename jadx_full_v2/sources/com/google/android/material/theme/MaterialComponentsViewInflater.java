            package com.google.android.material.theme;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.accessibility.AccessibilityManager;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import p000.I11ioI1IlOI;
            import p000.I11l0Ool;
            import p000.I11l110liiOi;
            import p000.I1I0OoiI0o;
            import p000.I1I0ii0;
            import p000.I1I11i1oI11;
            import p000.I1II01I;
            import p000.I1IIIOIooo0;
            import p000.O10O00o;
            import p000.O1Oli0;
            import p000.O1OllOiIo1I;
            import p000.O1Oo01lOO;
            import p000.O1OoIi00oil;
            import p000.O1OoiII1lOIi;
            import p000.OOilOii0o1I;
            import p000.iIoiO1l;
            import p000.iO1I10lioi;
            import p000.l1I0O0OI0oO;
            import p000.l1I11O1Iooi1;
            
            public class MaterialComponentsViewInflater extends I1IIIOIooo0 {
                @Override
                public final I11ioI1IlOI I00000oIO(Context context, AttributeSet attributeSet) {
/* 13 */            O1Oli0 o1Oli0 = new O1Oli0(iIoiO1l.I00000oIO(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0, new int[0]), attributeSet);
/* 18 */            new Rect();
/* 21 */            Context context2 = o1Oli0.getContext();
/* 30 */            iO1I10lioi.I00000oIO(context2, attributeSet, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
/* 33 */            int[] iArr = OOilOii0o1I.I0000oI00;
/* 36 */            iO1I10lioi.I00000oOI(context2, attributeSet, iArr, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
/* 39 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
/* 48 */            if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getInt(0, 0) == 0) {
/* 56 */                o1Oli0.setKeyListener(null);
                    }
/* 67 */            o1Oli0.I00io1l = typedArrayObtainStyledAttributes.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
/* 78 */            o1Oli0.I00ioIO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
/* 85 */            if (typedArrayObtainStyledAttributes.hasValue(2)) {
/* 95 */                o1Oli0.I00l0I0l0lO1 = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0));
                    }
/* 102 */           o1Oli0.I00l0OO0IO = typedArrayObtainStyledAttributes.getColor(4, 0);
/* 109 */           o1Oli0.I00li1OI = l1I11O1Iooi1.I00000oIO(context2, typedArrayObtainStyledAttributes, 5);
/* 119 */           o1Oli0.I00ilO0 = (AccessibilityManager) context2.getSystemService("accessibility");
/* 126 */           O10O00o o10O00o = new O10O00o(context2, null, R.attr.listPopupWindowStyle, 0);
/* 129 */           o1Oli0.I00ilI0I1 = o10O00o;
/* 131 */           o10O00o.I00oli = true;
/* 133 */           I1I0OoiI0o i1I0OoiI0o = o10O00o.I00oliIiO01i;
/* 135 */           i1I0OoiI0o.setFocusable(true);
/* 138 */           o10O00o.I00o0iI0io1 = o1Oli0;
/* 140 */           i1I0OoiI0o.setInputMethodMode(2);
/* 147 */           o10O00o.I00100l0(o1Oli0.getAdapter());
/* 152 */           I1I11i1oI11 i1I11i1oI11 = new I1I11i1oI11(1);
/* 155 */           i1I11i1oI11.I00iiI = o1Oli0;
/* 157 */           VarHandle.storeStoreFence();
/* 160 */           o10O00o.I00o0l1o1o0 = i1I11i1oI11;
/* 167 */           if (typedArrayObtainStyledAttributes.hasValue(6)) {
/* 173 */               o1Oli0.setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(6, 0));
                    }
/* 176 */           typedArrayObtainStyledAttributes.recycle();
/* 179 */           VarHandle.storeStoreFence();
/* 551 */           return o1Oli0;
                }

                @Override
                public final I11l0Ool I00000oOI(Context context, AttributeSet attributeSet) {
/* 3 */             return new O1OllOiIo1I(context, attributeSet);
                }

                @Override
                public final I11l110liiOi I0000Il00O(Context context, AttributeSet attributeSet) {
/* 3 */             return new O1Oo01lOO(context, attributeSet);
                }

                @Override
                public final I1I0ii0 I0000O(Context context, AttributeSet attributeSet) {
/* 16 */            O1OoIi00oil o1OoIi00oil = new O1OoIi00oil(iIoiO1l.I00000oIO(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]), attributeSet);
/* 19 */            Context context2 = o1OoIi00oil.getContext();
/* 28 */            iO1I10lioi.I00000oIO(context2, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
/* 31 */            int[] iArr = OOilOii0o1I.I000O01llI0;
/* 34 */            iO1I10lioi.I00000oOI(context2, attributeSet, iArr, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
/* 37 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
/* 45 */            if (typedArrayObtainStyledAttributes.hasValue(0)) {
/* 51 */                o1OoIi00oil.setButtonTintList(l1I11O1Iooi1.I00000oIO(context2, typedArrayObtainStyledAttributes, 0));
                    }
/* 59 */            o1OoIi00oil.I00ilO0 = typedArrayObtainStyledAttributes.getBoolean(1, false);
/* 61 */            typedArrayObtainStyledAttributes.recycle();
/* 89 */            return o1OoIi00oil;
                }

                @Override
                public final I1II01I I0000oI00(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
/* 13 */            O1OoiII1lOIi o1OoiII1lOIi = new O1OoiII1lOIi(iIoiO1l.I00000oIO(context, attributeSet, android.R.attr.textViewStyle, 0, new int[0]), attributeSet, android.R.attr.textViewStyle);
/* 16 */            Context context2 = o1OoiII1lOIi.getContext();
/* 28 */            if (l1I0O0OI0oO.I00000oOI(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
/* 30 */                Resources.Theme theme = context2.getTheme();
/* 34 */                int[] iArr = OOilOii0o1I.I000l1;
/* 36 */                TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
/* 45 */                int iI0000O = O1OoiII1lOIi.I0000O(context2, typedArrayObtainStyledAttributes, 1, 2);
/* 49 */                typedArrayObtainStyledAttributes.recycle();
/* 53 */                if (iI0000O == -1) {
/* 56 */                    TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
/* 60 */                    int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
/* 64 */                    typedArrayObtainStyledAttributes2.recycle();
/* 67 */                    if (resourceId != -1) {
/* 71 */                        TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, OOilOii0o1I.I000iOII);
/* 84 */                        int iI0000O2 = O1OoiII1lOIi.I0000O(o1OoiII1lOIi.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
/* 88 */                        typedArrayObtainStyledAttributes3.recycle();
/* 91 */                        if (iI0000O2 >= 0) {
/* 93 */                            o1OoiII1lOIi.setLineHeight(iI0000O2);
                                }
                            }
                        }
                    }
/* 551 */           return o1OoiII1lOIi;
                }
            }

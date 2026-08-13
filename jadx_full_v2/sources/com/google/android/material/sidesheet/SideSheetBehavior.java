            package com.google.android.material.sidesheet;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.View;
            import android.view.ViewConfiguration;
            import com.box.gallery.R;
            import java.util.LinkedHashSet;
            import p000.I0IIiO0iI;
            import p000.O1OoOIoiiO1I;
            import p000.O1Ooi0;
            import p000.OOilOii0o1I;
            import p000.OioOlIlii1il;
            import p000.iioiIoioo1I0;
            import p000.l1I11O1Iooi1;
            
/* 148 */   public class SideSheetBehavior<V extends View> extends iioiIoioo1I0 {
                public final O1Ooi0 I00000oIO;
                public final ColorStateList I00000oOI;
                public final OioOlIlii1il I0000Il00O;
                public int I0000O;

                public SideSheetBehavior(Context context, AttributeSet attributeSet) {
/* 8 */             new I0IIiO0iI(this, 22);
/* 12 */            this.I0000O = 5;
/* 16 */            new LinkedHashSet();
/* 21 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOii0o1I.I000oI1ioi);
/* 30 */            if (typedArrayObtainStyledAttributes.hasValue(3)) {
/* 36 */                this.I00000oOI = l1I11O1Iooi1.I00000oIO(context, typedArrayObtainStyledAttributes, 3);
                    }
/* 43 */            if (typedArrayObtainStyledAttributes.hasValue(6)) {
/* 57 */                this.I0000Il00O = OioOlIlii1il.I00000oOI(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).I00000oIO();
                    }
/* 63 */            if (typedArrayObtainStyledAttributes.hasValue(5)) {
/* 66 */                typedArrayObtainStyledAttributes.getResourceId(5, -1);
                    }
/* 69 */            OioOlIlii1il oioOlIlii1il = this.I0000Il00O;
/* 72 */            if (oioOlIlii1il != null) {
/* 77 */                O1Ooi0 o1Ooi0 = new O1Ooi0(oioOlIlii1il);
/* 80 */                this.I00000oIO = o1Ooi0;
/* 82 */                o1Ooi0.I000II(context);
/* 85 */                ColorStateList colorStateList = this.I00000oOI;
/* 87 */                if (colorStateList != null) {
/* 89 */                    O1Ooi0 o1Ooi02 = this.I00000oIO;
/* 91 */                    O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi02.I00iiI;
/* 95 */                    if (o1OoOIoiiO1I.I0000O != colorStateList) {
/* 97 */                        o1OoOIoiiO1I.I0000O = colorStateList;
/* 103 */                       o1Ooi02.onStateChange(o1Ooi02.getState());
                            }
                        } else {
/* 109 */                   TypedValue typedValue = new TypedValue();
/* 119 */                   context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
/* 126 */                   this.I00000oIO.setTint(typedValue.data);
                        }
                    }
/* 132 */           typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
/* 136 */           typedArrayObtainStyledAttributes.getBoolean(4, true);
/* 139 */           typedArrayObtainStyledAttributes.recycle();
/* 146 */           ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                }

/* 149 */       public SideSheetBehavior() {
/* 151 */           new I0IIiO0iI(this, 22);
/* 152 */           this.I0000O = 5;
/* 153 */           new LinkedHashSet();
                }
            }

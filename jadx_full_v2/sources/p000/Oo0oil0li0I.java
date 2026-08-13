            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Color;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.TypedValue;
            import android.view.View;
            
            public abstract class Oo0oil0li0I {
                public static final ThreadLocal I00000oIO = new ThreadLocal();
                public static final int[] I00000oOI = {-16842910};
                public static final int[] I0000Il00O = {R.attr.state_focused};
                public static final int[] I0000O = {R.attr.state_pressed};
                public static final int[] I0000oI00 = {R.attr.state_checked};
                public static final int[] I0001Ioi1lo = new int[0];
                public static final int[] I000II = new int[1];

                public static void I00000oIO(View view, Context context) {
/* 5 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(OOilOli0.I000OiO);
                    try {
/* 15 */                if (!typedArrayObtainStyledAttributes.hasValue(117)) {
/* 40 */                    Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                        }
                    } finally {
/* 50 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public static int I00000oOI(Context context, int i) {
/* 1 */             ColorStateList colorStateListI0000O = I0000O(context, i);
/* 5 */             if (colorStateListI0000O != null && colorStateListI0000O.isStateful()) {
/* 19 */                return colorStateListI0000O.getColorForState(I00000oOI, colorStateListI0000O.getDefaultColor());
                    }
/* 24 */            ThreadLocal threadLocal = I00000oIO;
/* 30 */            TypedValue typedValue = (TypedValue) threadLocal.get();
/* 32 */            if (typedValue == null) {
/* 36 */                typedValue = new TypedValue();
/* 39 */                threadLocal.set(typedValue);
                    }
/* 50 */            context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
/* 53 */            float f = typedValue.getFloat();
/* 71 */            return IOOliIoI1l.I0000O(I0000Il00O(context, i), Math.round(Color.alpha(r4) * f));
                }

                public static int I0000Il00O(Context context, int i) {
/* 1 */             int[] iArr = I000II;
/* 4 */             iArr[0] = i;
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                    try {
/* 11 */                return typedArrayObtainStyledAttributes.getColor(0, 0);
                    } finally {
/* 20 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public static ColorStateList I0000O(Context context, int i) {
                    ColorStateList colorStateList;
                    int resourceId;
/* 1 */             int[] iArr = I000II;
/* 4 */             iArr[0] = i;
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                    try {
/* 15 */                if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = iOI10i0I11.I00000oOI(context, resourceId)) == null) {
/* 30 */                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
                        }
/* 37 */                return colorStateList;
                    } finally {
/* 39 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }
            }

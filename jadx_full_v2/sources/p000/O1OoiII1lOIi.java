            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.util.TypedValue;
            import com.box.gallery.R;
            
            public final class O1OoiII1lOIi extends I1II01I {
                public static int I0000O(Context context, TypedArray typedArray, int... iArr) {
/* 3 */             int dimensionPixelSize = -1;
/* 6 */             for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
/* 10 */                int i2 = iArr[i];
/* 14 */                TypedValue typedValue = new TypedValue();
/* 21 */                if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
/* 39 */                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
/* 43 */                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
/* 47 */                    typedArrayObtainStyledAttributes.recycle();
/* 50 */                    dimensionPixelSize = dimensionPixelSize2;
                        } else {
/* 52 */                    dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
                        }
                    }
/* 215 */           return dimensionPixelSize;
                }

                @Override
                public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
/* 1 */             super.setTextAppearance(context, i);
/* 12 */            if (l1I0O0OI0oO.I00000oOI(context, R.attr.textAppearanceLineHeightEnabled, true)) {
/* 20 */                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, OOilOii0o1I.I000iOII);
/* 34 */                int iI0000O = I0000O(getContext(), typedArrayObtainStyledAttributes, 2, 4);
/* 38 */                typedArrayObtainStyledAttributes.recycle();
/* 41 */                if (iI0000O >= 0) {
/* 43 */                    setLineHeight(iI0000O);
                        }
                    }
                }
            }

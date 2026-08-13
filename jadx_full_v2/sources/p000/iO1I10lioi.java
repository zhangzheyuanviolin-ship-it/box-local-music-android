            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import com.box.gallery.R;
            
            public abstract class iO1I10lioi {
                public static final int[] I00000oIO = {R.attr.colorPrimary};
                public static final int[] I00000oOI = {R.attr.colorPrimaryVariant};

                public static void I00000oIO(Context context, AttributeSet attributeSet, int i, int i2) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOii0o1I.I00100l0, i, i2);
/* 9 */             boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
/* 13 */            typedArrayObtainStyledAttributes.recycle();
/* 16 */            if (z) {
/* 20 */                TypedValue typedValue = new TypedValue();
/* 34 */                if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
/* 50 */                    I0000Il00O(context, I00000oOI, "Theme.MaterialComponents");
                        }
                    }
/* 57 */            I0000Il00O(context, I00000oIO, "Theme.AppCompat");
                }

                public static void I00000oOI(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOii0o1I.I00100l0, i, i2);
/* 8 */             boolean z = false;
/* 13 */            if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
/* 15 */                typedArrayObtainStyledAttributes.recycle();
/* 18 */                return;
                    }
/* 22 */            if (iArr2.length != 0) {
/* 32 */                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 38 */                for (int i3 : iArr2) {
/* 46 */                    if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
/* 48 */                        typedArrayObtainStyledAttributes2.recycle();
                                break;
                            }
                        }
/* 55 */                typedArrayObtainStyledAttributes2.recycle();
/* 30 */                z = true;
                    } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
/* 30 */                z = true;
                    }
/* 59 */            typedArrayObtainStyledAttributes.recycle();
/* 62 */            if (z) {
/* 64 */                return;
                    }
/* 67 */            I000II.I000iOII("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
                }

                public static void I0000Il00O(Context context, int[] iArr, String str) {
/* 1 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
/* 7 */             for (int i = 0; i < iArr.length; i++) {
/* 13 */                if (!typedArrayObtainStyledAttributes.hasValue(i)) {
/* 18 */                    typedArrayObtainStyledAttributes.recycle();
/* 29 */                    I000II.I000iOII(IlIi0I0.I000lI("The style on this component requires your app theme to be ", str, " (or a descendant)."));
/* 32 */                    return;
                        }
                    }
/* 33 */            typedArrayObtainStyledAttributes.recycle();
                }
            }

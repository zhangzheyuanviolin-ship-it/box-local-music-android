            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            
            public abstract class lIl0oooi {
                public static OOo0l0 I00000oIO(Context context, AttributeSet attributeSet, int i, int i2) {
/* 3 */             OOo0l0 oOo0l0 = new OOo0l0();
/* 8 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilO0il.I00000oIO, i, i2);
/* 18 */            oOo0l0.I00000oIO = typedArrayObtainStyledAttributes.getInt(0, 1);
/* 26 */            oOo0l0.I00000oOI = typedArrayObtainStyledAttributes.getInt(10, 1);
/* 34 */            oOo0l0.I0000Il00O = typedArrayObtainStyledAttributes.getBoolean(9, false);
/* 42 */            oOo0l0.I0000O = typedArrayObtainStyledAttributes.getBoolean(11, false);
/* 44 */            typedArrayObtainStyledAttributes.recycle();
/* 204 */           return oOo0l0;
                }
            }

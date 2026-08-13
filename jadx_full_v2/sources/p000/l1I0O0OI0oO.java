            package p000;

            import android.content.Context;
            import android.util.TypedValue;
            
            public abstract class l1I0O0OI0oO {
                public static TypedValue I00000oIO(Context context, int i) {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 15 */            if (context.getTheme().resolveAttribute(i, typedValue, true)) {
/* 17 */                return typedValue;
                    }
/* 18 */            return null;
                }

                public static boolean I00000oOI(Context context, int i, boolean z) {
/* 1 */             TypedValue typedValueI00000oIO = I00000oIO(context, i);
                    return (typedValueI00000oIO == null || typedValueI00000oIO.type != 18) ? z : typedValueI00000oIO.data != 0;
                }
            }

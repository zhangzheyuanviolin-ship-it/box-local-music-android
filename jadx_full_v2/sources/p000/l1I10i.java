            package p000;

            import android.content.Context;
            import android.graphics.Color;
            import android.util.TypedValue;
            import android.view.View;
            
            public abstract class l1I10i {
                public static int I00000oIO(Context context, int i) {
                    Integer numValueOf;
/* 1 */             TypedValue typedValueI00000oIO = l1I0O0OI0oO.I00000oIO(context, i);
/* 5 */             if (typedValueI00000oIO != null) {
/* 7 */                 int i2 = typedValueI00000oIO.resourceId;
/* 18 */                numValueOf = Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValueI00000oIO.data);
                    } else {
/* 23 */                numValueOf = null;
                    }
/* 24 */            if (numValueOf != null) {
/* 26 */                return numValueOf.intValue();
                    }
/* 31 */            return 0;
                }

                public static int I00000oOI(View view, int i) {
/* 1 */             Context context = view.getContext();
/* 5 */             Context context2 = view.getContext();
/* 13 */            String canonicalName = view.getClass().getCanonicalName();
/* 17 */            TypedValue typedValueI00000oIO = l1I0O0OI0oO.I00000oIO(context2, i);
/* 21 */            if (typedValueI00000oIO != null) {
/* 23 */                int i2 = typedValueI00000oIO.resourceId;
                        return i2 != 0 ? context.getColor(i2) : typedValueI00000oIO.data;
                    }
/* 49 */            OIiilo1Ool0o.I000l1("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{canonicalName, context2.getResources().getResourceName(i)});
/* 52 */            return 0;
                }

                public static int I0000Il00O(int i, int i2, float f) {
/* 15 */            return IOOliIoI1l.I00000oOI(IOOliIoI1l.I0000O(i2, Math.round(Color.alpha(i2) * f)), i);
                }
            }

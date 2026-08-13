            package p000;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.EdgeEffect;
            
            public abstract class IioO0o {
                public static EdgeEffect I00000oIO(Context context, AttributeSet attributeSet) {
                    try {
/* 3 */                 return new EdgeEffect(context, attributeSet);
                    } catch (Throwable unused) {
/* 9 */                 return new EdgeEffect(context);
                    }
                }

                public static float I00000oOI(EdgeEffect edgeEffect) {
                    try {
/* 1 */                 return edgeEffect.getDistance();
                    } catch (Throwable unused) {
/* 6 */                 return 0.0f;
                    }
                }

                public static float I0000Il00O(EdgeEffect edgeEffect, float f, float f2) {
                    try {
/* 1 */                 return edgeEffect.onPullDistance(f, f2);
                    } catch (Throwable unused) {
/* 6 */                 edgeEffect.onPull(f, f2);
/* 9 */                 return 0.0f;
                    }
                }
            }

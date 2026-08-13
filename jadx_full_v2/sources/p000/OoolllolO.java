            package p000;

            import android.graphics.Insets;
            import android.graphics.Rect;
            import android.view.View;
            import android.view.WindowInsets;
            
            public abstract class OoolllolO {
                public static void I00000oIO(View view, Rect rect, Rect rect2) {
/* 22 */            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
/* 34 */            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                }
            }

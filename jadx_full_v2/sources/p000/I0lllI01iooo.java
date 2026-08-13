            package p000;

            import android.view.View;
            import android.view.ViewParent;
            
            public abstract class I0lllI01iooo {
                public static final char[] I00000oIO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

                public static final boolean I00000oIO(View view, View view2) {
/* 5 */             if (view2.equals(view)) {
/* 23 */                return false;
                    }
/* 12 */            for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
/* 14 */                if (parent == view) {
/* 16 */                    return true;
                        }
                    }
/* 23 */            return false;
                }

                public static final float I00000oOI(float[] fArr, int i, float[] fArr2, int i2) {
/* 2 */             int i3 = i * 4;
/* 38 */            return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
                }
            }

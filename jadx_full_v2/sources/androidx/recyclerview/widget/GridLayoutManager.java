            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import p000.I000II;
            import p000.Oi010OO0;
            import p000.OoOil11Ol1o;
            import p000.lIl0oooi;
            
            public class GridLayoutManager extends LinearLayoutManager {
                public final int I0000oI00;

                public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 1 */             super(context, attributeSet, i, i2);
/* 5 */             this.I0000oI00 = -1;
/* 9 */             new SparseIntArray();
/* 14 */            new SparseIntArray();
/* 19 */            SparseIntArray sparseIntArray = new SparseIntArray();
/* 24 */            new SparseIntArray();
/* 29 */            new Rect();
/* 36 */            int i3 = lIl0oooi.I00000oIO(context, attributeSet, i, i2).I00000oOI;
/* 40 */            if (i3 == this.I0000oI00) {
/* 42 */                return;
                    }
/* 44 */            if (i3 < 1) {
/* 58 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i3, "Span count should be at least 1. Provided "));
/* 204 */               throw null;
                    }
/* 46 */            this.I0000oI00 = i3;
/* 48 */            sparseIntArray.clear();
                }

                @Override
                public final void I00000oOI(boolean z) {
/* 1 */             if (z) {
/* 10 */                OoOil11Ol1o.I000OiO("GridLayoutManager does not support stack from end. Consider using reverse layout");
                    } else {
/* 4 */                 super.I00000oOI(false);
                    }
                }
            }

            package com.google.android.material.transformation;

            import android.content.Context;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            
            @Deprecated
/* 18 */    public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
                public FabTransformationBehavior() {
/* 6 */             new Rect();
/* 11 */            new RectF();
/* 16 */            new RectF();
                }

/* 19 */        public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
/* 20 */            super(context, attributeSet);
/* 21 */            new Rect();
/* 22 */            new RectF();
/* 23 */            new RectF();
                }
            }

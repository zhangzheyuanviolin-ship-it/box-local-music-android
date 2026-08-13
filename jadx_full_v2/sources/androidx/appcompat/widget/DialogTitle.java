            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.text.Layout;
            import android.util.AttributeSet;
            import p000.I1II01I;
            import p000.OOilOli0;
            
/* 4 */     public class DialogTitle extends I1II01I {
                public DialogTitle(Context context) {
/* 2 */             super(context, null);
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int lineCount;
/* 1 */             super.onMeasure(i, i2);
/* 4 */             Layout layout = getLayout();
/* 8 */             if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
/* 106 */               return;
                    }
/* 25 */            setSingleLine(false);
/* 29 */            setMaxLines(2);
/* 45 */            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, OOilOli0.I001IO000, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
/* 49 */            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
/* 53 */            if (dimensionPixelSize != 0) {
/* 56 */                setTextSize(0, dimensionPixelSize);
                    }
/* 59 */            typedArrayObtainStyledAttributes.recycle();
/* 62 */            super.onMeasure(i, i2);
                }

/* 5 */         public DialogTitle(Context context, AttributeSet attributeSet) {
/* 6 */             super(context, attributeSet);
                }
            }

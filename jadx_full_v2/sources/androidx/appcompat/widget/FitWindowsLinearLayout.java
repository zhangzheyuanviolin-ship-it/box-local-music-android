            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.widget.LinearLayout;
            import p000.IlO10il0IlI;
            
/* 3 */     public class FitWindowsLinearLayout extends LinearLayout {
                public FitWindowsLinearLayout(Context context) {
/* 1 */             super(context);
                }

                @Override
                public final boolean fitSystemWindows(Rect rect) {
/* 1 */             return super.fitSystemWindows(rect);
                }

/* 4 */         public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
/* 5 */             super(context, attributeSet);
                }

/* 28 */        public void setOnFitSystemWindowsListener(IlO10il0IlI ilO10il0IlI) {
                }
            }

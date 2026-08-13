            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.widget.FrameLayout;
            import p000.IlO10il0IlI;
            
/* 3 */     public class FitWindowsFrameLayout extends FrameLayout {
                public FitWindowsFrameLayout(Context context) {
/* 1 */             super(context);
                }

                @Override
                public final boolean fitSystemWindows(Rect rect) {
/* 1 */             return super.fitSystemWindows(rect);
                }

/* 4 */         public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
/* 5 */             super(context, attributeSet);
                }

/* 28 */        public void setOnFitSystemWindowsListener(IlO10il0IlI ilO10il0IlI) {
                }
            }

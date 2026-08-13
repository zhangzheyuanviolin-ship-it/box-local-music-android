            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            import java.util.WeakHashMap;
            
/* 18 */    public final class OooiI0iI implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
                public WeakHashMap I00iOIl;

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 5 */             view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                }

                @Override
/* 19 */        public final void onGlobalLayout() {
                }

                @Override
/* 28 */        public final void onViewDetachedFromWindow(View view) {
                }
            }

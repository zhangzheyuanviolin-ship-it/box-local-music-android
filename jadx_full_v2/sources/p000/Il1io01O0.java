            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            
            public final class Il1io01O0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
                public boolean I00iOIl;
                public View I00iiI;
                public IllOOo00lI I00iiO;

                @Override
                public final void onGlobalLayout() {
/* 3 */             this.I00iiO.invoke();
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 1 */             View view2 = this.I00iiI;
/* 5 */             if (this.I00iOIl || !view2.isAttachedToWindow()) {
/* 29 */                return;
                    }
/* 18 */            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
/* 22 */            this.I00iOIl = true;
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 3 */             if (this.I00iOIl) {
/* 12 */                this.I00iiI.getViewTreeObserver().removeOnGlobalLayoutListener(this);
/* 16 */                this.I00iOIl = false;
                    }
                }
            }

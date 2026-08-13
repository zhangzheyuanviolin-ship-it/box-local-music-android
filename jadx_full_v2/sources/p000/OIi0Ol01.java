            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            import java.lang.invoke.VarHandle;
            
            public final class OIi0Ol01 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
                public View I00iOIl;
                public ViewTreeObserver I00iiI;
                public Runnable I00iiO;

                public static void I00000oIO(View view, Runnable runnable) {
/* 1 */             if (view == null) {
/* 34 */                IOOlIIilOl0.I000II("view == null");
/* 37 */                return;
                    }
/* 5 */             OIi0Ol01 oIi0Ol01 = new OIi0Ol01();
/* 8 */             oIi0Ol01.I00iOIl = view;
/* 14 */            oIi0Ol01.I00iiI = view.getViewTreeObserver();
/* 16 */            oIi0Ol01.I00iiO = runnable;
/* 18 */            VarHandle.storeStoreFence();
/* 25 */            view.getViewTreeObserver().addOnPreDrawListener(oIi0Ol01);
/* 28 */            view.addOnAttachStateChangeListener(oIi0Ol01);
                }

                @Override
                public final boolean onPreDraw() {
/* 1 */             View view = this.I00iOIl;
/* 9 */             if (this.I00iiI.isAlive()) {
/* 13 */                this.I00iiI.removeOnPreDrawListener(this);
                    } else {
/* 21 */                view.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
/* 24 */            view.removeOnAttachStateChangeListener(this);
/* 29 */            this.I00iiO.run();
/* 32 */            return true;
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 5 */             this.I00iiI = view.getViewTreeObserver();
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             View view2 = this.I00iOIl;
/* 9 */             if (this.I00iiI.isAlive()) {
/* 13 */                this.I00iiI.removeOnPreDrawListener(this);
                    } else {
/* 21 */                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
/* 24 */            view2.removeOnAttachStateChangeListener(this);
                }
            }

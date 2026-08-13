            package p000;

            import android.animation.LayoutTransition;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.graphics.Canvas;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowInsets;
            import android.widget.FrameLayout;
            import com.box.gallery.R;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            
/* 27 */    public final class Ill0oioO0 extends FrameLayout {
                public ArrayList I00iOIl;
                public ArrayList I00iiI;
                public View.OnApplyWindowInsetsListener I00iiO;
                public boolean I00iio;

                public final void I00000oIO(View view) {
/* 7 */             if (this.I00iiI.contains(view)) {
/* 11 */                this.I00iOIl.add(view);
                    }
                }

                @Override
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 4 */             Object tag = view.getTag(R.id.fragment_container_view_tag);
/* 16 */            if ((tag instanceof Ill0l1 ? (Ill0l1) tag : null) != null) {
/* 18 */                super.addView(view, i, layoutParams);
                    } else {
/* 26 */                IOOlIIilOl0.I0001Ioi1lo(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment.");
                    }
                }

                @Override
                public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
                    i00iooo00li i00iooo00liVarI0000Il00O;
/* 2 */             i00iooo00li i00iooo00liVarI0000Il00O2 = i00iooo00li.I0000Il00O(null, windowInsets);
/* 6 */             View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.I00iiO;
/* 8 */             if (onApplyWindowInsetsListener != null) {
/* 14 */                i00iooo00liVarI0000Il00O = i00iooo00li.I0000Il00O(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
                    } else {
/* 19 */                WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 21 */                WindowInsets windowInsetsI00000oOI = i00iooo00liVarI0000Il00O2.I00000oOI();
/* 25 */                if (windowInsetsI00000oOI != null && !windowInsetsI00000oOI.equals(windowInsetsI00000oOI)) {
/* 33 */                    i00iooo00liVarI0000Il00O2 = i00iooo00li.I0000Il00O(this, windowInsetsI00000oOI);
                        }
/* 37 */                i00iooo00liVarI0000Il00O = i00iooo00liVarI0000Il00O2;
                    }
/* 44 */            if (!i00iooo00liVarI0000Il00O.I00000oIO.I0010o()) {
/* 46 */                int childCount = getChildCount();
/* 51 */                for (int i = 0; i < childCount; i++) {
/* 53 */                    View childAt = getChildAt(i);
/* 57 */                    WeakHashMap weakHashMap2 = OooiOl0ioo0i.I00000oIO;
/* 59 */                    WindowInsets windowInsetsI00000oOI2 = i00iooo00liVarI0000Il00O.I00000oOI();
/* 63 */                    if (windowInsetsI00000oOI2 != null) {
/* 65 */                        WindowInsets windowInsetsI00000oIO = OooiOi0I0l.I00000oIO(childAt, windowInsetsI00000oOI2);
/* 73 */                        if (!windowInsetsI00000oIO.equals(windowInsetsI00000oOI2)) {
/* 75 */                            i00iooo00li.I0000Il00O(childAt, windowInsetsI00000oIO);
                                }
                            }
                        }
                    }
/* 168 */           return windowInsets;
                }

                @Override
                public final void dispatchDraw(Canvas canvas) {
/* 3 */             if (this.I00iio) {
/* 7 */                 Iterator it = this.I00iOIl.iterator();
/* 15 */                while (it.hasNext()) {
/* 27 */                    super.drawChild(canvas, (View) it.next(), getDrawingTime());
                        }
                    }
/* 31 */            super.dispatchDraw(canvas);
                }

                @Override
                public final boolean drawChild(Canvas canvas, View view, long j) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             if (this.I00iio && !arrayList.isEmpty() && arrayList.contains(view)) {
/* 19 */                return false;
                    }
/* 21 */            return super.drawChild(canvas, view, j);
                }

                @Override
                public final void endViewTransition(View view) {
/* 3 */             this.I00iiI.remove(view);
/* 12 */            if (this.I00iOIl.remove(view)) {
/* 15 */                this.I00iio = true;
                    }
/* 17 */            super.endViewTransition(view);
                }

                public final <F extends Ill0l1> F getFragment() {
                    Ill0l1 ill0l1;
                    Ill0oOi0 ill0oOi0;
                    Ill1OlOOl ill1OlOOlI00100o1O0lo;
/* 1 */             View view = this;
                    while (true) {
/* 3 */                 if (view == null) {
/* 36 */                    ill0l1 = null;
                            break;
                        }
/* 8 */                 Object tag = view.getTag(R.id.fragment_container_view_tag);
/* 19 */                ill0l1 = tag instanceof Ill0l1 ? (Ill0l1) tag : null;
/* 20 */                if (ill0l1 != null) {
                            break;
                        }
/* 23 */                Object parent = view.getParent();
/* 34 */                view = parent instanceof View ? (View) parent : null;
                    }
/* 37 */            if (ill0l1 == null) {
/* 83 */                Context context = getContext();
                        while (true) {
/* 89 */                    if (!(context instanceof ContextWrapper)) {
/* 105 */                       ill0oOi0 = null;
                                break;
                            }
/* 93 */                    if (context instanceof Ill0oOi0) {
/* 95 */                        ill0oOi0 = (Ill0oOi0) context;
                                break;
                            }
/* 100 */                   context = ((ContextWrapper) context).getBaseContext();
                        }
/* 106 */               if (ill0oOi0 == null) {
/* 125 */                   IioIoO10iOiI.I000O01llI0(this, "View ", " is not within a subclass of FragmentActivity.");
/* 2 */                     return null;
                        }
/* 108 */               ill1OlOOlI00100o1O0lo = ill0oOi0.I00100o1O0lo();
                    } else {
/* 43 */                if (!ill0l1.I00100o1O0lo()) {
/* 82 */                    throw new IllegalStateException("The Fragment " + ill0l1 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                        }
/* 45 */                ill1OlOOlI00100o1O0lo = ill0l1.I000OOo1O();
                    }
/* 116 */           return (F) ill1OlOOlI00100o1O0lo.I001lllioOl(getId());
                }

                @Override
                public final void removeAllViewsInLayout() {
/* 1 */             int childCount = getChildCount();
                    while (true) {
                        childCount--;
/* 8 */                 if (-1 >= childCount) {
/* 20 */                    super.removeAllViewsInLayout();
/* 55 */                    return;
                        }
/* 14 */                I00000oIO(getChildAt(childCount));
                    }
                }

                @Override
                public final void removeView(View view) {
/* 1 */             I00000oIO(view);
/* 4 */             super.removeView(view);
                }

                @Override
                public final void removeViewAt(int i) {
/* 5 */             I00000oIO(getChildAt(i));
/* 8 */             super.removeViewAt(i);
                }

                @Override
                public final void removeViewInLayout(View view) {
/* 1 */             I00000oIO(view);
/* 4 */             super.removeViewInLayout(view);
                }

                @Override
                public final void removeViews(int i, int i2) {
/* 1 */             int i3 = i + i2;
/* 4 */             for (int i4 = i; i4 < i3; i4++) {
/* 10 */                I00000oIO(getChildAt(i4));
                    }
/* 16 */            super.removeViews(i, i2);
                }

                @Override
                public final void removeViewsInLayout(int i, int i2) {
/* 1 */             int i3 = i + i2;
/* 4 */             for (int i4 = i; i4 < i3; i4++) {
/* 10 */                I00000oIO(getChildAt(i4));
                    }
/* 16 */            super.removeViewsInLayout(i, i2);
                }

                public final void setDrawDisappearingViewsLast(boolean z) {
/* 1 */             this.I00iio = z;
                }

                @Override
                public void setLayoutTransition(LayoutTransition layoutTransition) {
/* 29 */            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
                }

                @Override
                public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
/* 1 */             this.I00iiO = onApplyWindowInsetsListener;
                }

                @Override
                public final void startViewTransition(View view) {
/* 5 */             if (view.getParent() == this) {
/* 9 */                 this.I00iiI.add(view);
                    }
/* 12 */            super.startViewTransition(view);
                }

                @Override
/* 28 */        public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
/* 29 */            return windowInsets;
                }
            }

            package p000;

            import android.content.Context;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import androidx.appcompat.widget.Toolbar;
            import java.util.ArrayList;
            
/* 35 */    public final class Oo1OoiI implements O1l0iiO {
                public O1illlIiilIl I00iOIl;
                public O1ioIIl I00iiI;
                public final Toolbar I00iiO;

                public Oo1OoiI(Toolbar toolbar) {
/* 4 */             this.I00iiO = toolbar;
                }

                @Override
                public final boolean I00000oOI(Oli1l1l0 oli1l1l0) {
/* 1 */             return false;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                @Override
                public final boolean I0000oI00(O1ioIIl o1ioIIl) {
/* 1 */             Toolbar toolbar = this.I00iiO;
/* 3 */             KeyEvent.Callback callback = toolbar.I00l0I0l0lO1;
/* 7 */             if (callback instanceof IOOOloi) {
/* 15 */                ((O1ioOOOillO) ((IOOOloi) callback)).I00iOIl.onActionViewCollapsed();
                    }
/* 20 */            toolbar.removeView(toolbar.I00l0I0l0lO1);
/* 25 */            toolbar.removeView(toolbar.I00ioIO);
/* 29 */            toolbar.I00l0I0l0lO1 = null;
/* 31 */            ArrayList arrayList = toolbar.I0100i;
/* 39 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 47 */                toolbar.addView((View) arrayList.get(size));
                    }
/* 53 */            arrayList.clear();
/* 56 */            this.I00iiI = null;
/* 58 */            toolbar.requestLayout();
/* 62 */            o1ioIIl.I001lloI = false;
/* 66 */            o1ioIIl.I000o00OoI0I.I00100l0(false);
/* 69 */            toolbar.I00111O();
/* 37 */            return true;
                }

                @Override
                public final boolean I000O01llI0(O1ioIIl o1ioIIl) {
/* 1 */             Toolbar toolbar = this.I00iiO;
/* 3 */             toolbar.I0000Il00O();
/* 8 */             ViewParent parent = toolbar.I00ioIO.getParent();
/* 12 */            if (parent != toolbar) {
/* 16 */                if (parent instanceof ViewGroup) {
/* 22 */                    ((ViewGroup) parent).removeView(toolbar.I00ioIO);
                        }
/* 27 */                toolbar.addView(toolbar.I00ioIO);
                    }
/* 30 */            View actionView = o1ioIIl.getActionView();
/* 34 */            toolbar.I00l0I0l0lO1 = actionView;
/* 36 */            this.I00iiI = o1ioIIl;
/* 38 */            ViewParent parent2 = actionView.getParent();
/* 43 */            if (parent2 != toolbar) {
/* 47 */                if (parent2 instanceof ViewGroup) {
/* 53 */                    ((ViewGroup) parent2).removeView(toolbar.I00l0I0l0lO1);
                        }
/* 56 */                Oo1OolOI oo1OolOII000O01llI0 = Toolbar.I000O01llI0();
/* 68 */                oo1OolOII000O01llI0.I00000oIO = (toolbar.I00lll10 & 112) | 8388611;
/* 70 */                oo1OolOII000O01llI0.I00000oOI = 2;
/* 74 */                toolbar.I00l0I0l0lO1.setLayoutParams(oo1OolOII000O01llI0);
/* 79 */                toolbar.addView(toolbar.I00l0I0l0lO1);
                    }
/* 88 */            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
/* 90 */                View childAt = toolbar.getChildAt(childCount);
/* 102 */               if (((Oo1OolOI) childAt.getLayoutParams()).I00000oOI != 2 && childAt != toolbar.I00iOIl) {
/* 108 */                   toolbar.removeViewAt(childCount);
/* 113 */                   toolbar.I0100i.add(childAt);
                        }
                    }
/* 119 */           toolbar.requestLayout();
/* 122 */           o1ioIIl.I001lloI = true;
/* 127 */           o1ioIIl.I000o00OoI0I.I00100l0(false);
/* 130 */           KeyEvent.Callback callback = toolbar.I00l0I0l0lO1;
/* 134 */           if (callback instanceof IOOOloi) {
/* 142 */               ((O1ioOOOillO) ((IOOOloi) callback)).I00iOIl.onActionViewExpanded();
                    }
/* 145 */           toolbar.I00111O();
/* 86 */            return true;
                }

                @Override
                public final void I000OOo1O() {
/* 3 */             if (this.I00iiI != null) {
/* 5 */                 O1illlIiilIl o1illlIiilIl = this.I00iOIl;
/* 7 */                 if (o1illlIiilIl != null) {
/* 11 */                    int size = o1illlIiilIl.I0001Ioi1lo.size();
/* 16 */                    for (int i = 0; i < size; i++) {
/* 26 */                        if (this.I00iOIl.getItem(i) == this.I00iiI) {
/* 55 */                            return;
                                }
                            }
                        }
/* 34 */                I0000oI00(this.I00iiI);
                    }
                }

                @Override
                public final void I000iOII(Context context, O1illlIiilIl o1illlIiilIl) {
                    O1ioIIl o1ioIIl;
/* 1 */             O1illlIiilIl o1illlIiilIl2 = this.I00iOIl;
/* 3 */             if (o1illlIiilIl2 != null && (o1ioIIl = this.I00iiI) != null) {
/* 9 */                 o1illlIiilIl2.I0000O(o1ioIIl);
                    }
/* 12 */            this.I00iOIl = o1illlIiilIl;
                }

                @Override
/* 36 */        public final void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
                }
            }

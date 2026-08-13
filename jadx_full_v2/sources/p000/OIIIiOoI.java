            package p000;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.ScrollView;
            import androidx.core.widget.NestedScrollView;
            
            public final class OIIIiOoI extends I01lloolio1l {
                @Override
                public final void I00000oOI(View view, AccessibilityEvent accessibilityEvent) {
/* 1 */             super.I00000oOI(view, accessibilityEvent);
/* 4 */             NestedScrollView nestedScrollView = (NestedScrollView) view;
/* 12 */            accessibilityEvent.setClassName(ScrollView.class.getName());
/* 24 */            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
/* 31 */            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
/* 38 */            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
/* 45 */            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
/* 52 */            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                }

                @Override
                public final void I0000Il00O(View view, I01oII0IOOO i01oII0IOOO) {
                    int scrollRange;
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = i01oII0IOOO.I00000oIO;
/* 5 */             this.I00iOIl.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 8 */             NestedScrollView nestedScrollView = (NestedScrollView) view;
/* 12 */            i01oII0IOOO.I0000oI00("android.widget.ScrollView");
/* 19 */            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
/* 106 */               return;
                    }
/* 28 */            accessibilityNodeInfo.setScrollable(true);
/* 35 */            if (nestedScrollView.getScrollY() > 0) {
/* 39 */                i01oII0IOOO.I00000oIO(I01o0l.I000II);
/* 44 */                i01oII0IOOO.I00000oIO(I01o0l.I000O01llI0);
                    }
/* 51 */            if (nestedScrollView.getScrollY() < scrollRange) {
/* 55 */                i01oII0IOOO.I00000oIO(I01o0l.I0001Ioi1lo);
/* 60 */                i01oII0IOOO.I00000oIO(I01o0l.I000OiO);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000O(View view, int i, Bundle bundle) {
/* 6 */             if (super.I0000O(view, i, bundle)) {
/* 5 */                 return true;
                    }
/* 9 */             NestedScrollView nestedScrollView = (NestedScrollView) view;
/* 16 */            if (nestedScrollView.isEnabled()) {
/* 20 */                int height = nestedScrollView.getHeight();
/* 26 */                Rect rect = new Rect();
/* 37 */                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
/* 45 */                    height = rect.height();
                        }
/* 51 */                if (i == 4096) {
/* 126 */                   int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
/* 134 */                   if (iMin != nestedScrollView.getScrollY()) {
/* 146 */                       nestedScrollView.I001IO000(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
/* 5 */                         return true;
                            }
                        } else if (i == 8192 || i == 16908344) {
/* 83 */                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
/* 91 */                    if (iMax != nestedScrollView.getScrollY()) {
/* 103 */                       nestedScrollView.I001IO000(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
/* 5 */                         return true;
                            }
                        } else if (i == 16908346) {
                        }
                    }
/* 15 */            return false;
                }
            }

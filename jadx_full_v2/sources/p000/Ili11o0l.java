            package p000;

            import android.graphics.Rect;
            import android.view.FocusFinder;
            import android.view.View;
            import android.view.ViewGroup;
            
            public abstract class Ili11o0l {
                public static final int[] I00000oIO = new int[2];
                public static final Rect I00000oOI = new Rect();

                public static final OOo0IO I00000oIO(View view, View view2) {
/* 1 */             int[] iArr = I00000oIO;
/* 3 */             view.getLocationInWindow(iArr);
/* 7 */             int i = iArr[0];
/* 10 */            int i2 = iArr[1];
/* 12 */            view2.getLocationInWindow(iArr);
/* 15 */            int i3 = iArr[0];
/* 21 */            float f = i2 - iArr[1];
/* 25 */            view.getFocusedRect(I00000oOI);
/* 33 */            float f2 = (i - i3) + r1.left;
/* 54 */            return new OOo0IO(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
                }

                public static final boolean I00000oOI(View view, Integer num, Rect rect) {
/* 1 */             if (num == null) {
/* 3 */                 return view.requestFocus();
                    }
/* 10 */            if (!(view instanceof ViewGroup)) {
/* 16 */                return view.requestFocus(num.intValue(), rect);
                    }
/* 22 */            ViewGroup viewGroup = (ViewGroup) view;
/* 28 */            if (viewGroup.isFocused()) {
/* 30 */                return true;
                    }
/* 36 */            if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
/* 48 */                return viewGroup.requestFocus(num.intValue(), rect);
                    }
/* 55 */            if (view instanceof I0lio1O01i01) {
/* 63 */                return ((I0lio1O01i01) view).requestFocus(num.intValue(), rect);
                    }
/* 68 */            if (rect != null) {
/* 78 */                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                        return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
                    }
/* 122 */           View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
                    return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
                }

                public static final Integer I0000Il00O(int i) {
/* 2 */             if (i == 5) {
/* 6 */                 return 33;
                    }
/* 12 */            if (i == 6) {
/* 16 */                return 130;
                    }
/* 22 */            if (i == 3) {
/* 26 */                return 17;
                    }
/* 32 */            if (i == 4) {
/* 36 */                return 66;
                    }
/* 43 */            if (i == 1) {
/* 45 */                return 2;
                    }
                    return i == 2 ? 1 : null;
                }

                public static final Ili0i1il0l0l I0000O(int i) {
/* 3 */             if (i == 1) {
/* 54 */                return Ili0i1il0l0l.I00000oIO(2);
                    }
/* 5 */             if (i == 2) {
/* 49 */                return Ili0i1il0l0l.I00000oIO(1);
                    }
/* 9 */             if (i == 17) {
/* 44 */                return Ili0i1il0l0l.I00000oIO(3);
                    }
/* 13 */            if (i == 33) {
/* 38 */                return Ili0i1il0l0l.I00000oIO(5);
                    }
/* 17 */            if (i == 66) {
/* 32 */                return Ili0i1il0l0l.I00000oIO(4);
                    }
/* 21 */            if (i != 130) {
/* 23 */                return null;
                    }
/* 26 */            return Ili0i1il0l0l.I00000oIO(6);
                }
            }

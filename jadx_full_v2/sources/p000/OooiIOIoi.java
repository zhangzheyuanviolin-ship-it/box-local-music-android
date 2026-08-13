            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.WindowInsets;
            import com.box.gallery.R;
            
            public abstract class OooiIOIoi {
                public static i00iooo00li I00000oIO(View view, i00iooo00li i00iooo00liVar, Rect rect) {
/* 1 */             WindowInsets windowInsetsI00000oOI = i00iooo00liVar.I00000oOI();
/* 5 */             if (windowInsetsI00000oOI != null) {
/* 11 */                return i00iooo00li.I0000Il00O(view, view.computeSystemWindowInsets(windowInsetsI00000oOI, rect));
                    }
/* 16 */            rect.setEmpty();
/* 98 */            return i00iooo00liVar;
                }

                public static void I00000oOI(View view, OIOloIl1oo1 oIOloIl1oo1) {
/* 9 */             OooiI1I1oo oooiI1I1oo = oIOloIl1oo1 != null ? new OooiI1I1oo(view, oIOloIl1oo1) : null;
/* 17 */            if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
/* 19 */                return;
                    }
/* 20 */            if (oooiI1I1oo != null) {
/* 22 */                view.setOnApplyWindowInsetsListener(oooiI1I1oo);
                    } else {
/* 35 */                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
                    }
                }
            }

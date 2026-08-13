            package p000;

            import android.view.View;
            import com.box.gallery.R;
            
            public abstract class li1lOloO {
                public static final O0oiOi I00000oIO(View view) {
/* 2 */             while (view != null) {
/* 7 */                 Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
/* 18 */                O0oiOi o0oiOi = tag instanceof O0oiOi ? (O0oiOi) tag : null;
/* 19 */                if (o0oiOi != null) {
/* 21 */                    return o0oiOi;
                        }
/* 22 */                Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 33 */                view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
                    }
/* 1 */             return null;
                }
            }

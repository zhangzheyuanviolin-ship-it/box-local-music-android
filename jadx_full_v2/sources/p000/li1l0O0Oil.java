            package p000;

            import android.view.View;
            import android.view.ViewParent;
            import com.box.gallery.R;
            
            public abstract class li1l0O0Oil {
                public static final ViewParent I00000oIO(View view) {
/* 1 */             ViewParent parent = view.getParent();
/* 5 */             if (parent != null) {
/* 7 */                 return parent;
                    }
/* 11 */            Object tag = view.getTag(R.id.view_tree_disjoint_parent);
/* 17 */            if (tag instanceof ViewParent) {
/* 19 */                return (ViewParent) tag;
                    }
/* 22 */            return null;
                }
            }

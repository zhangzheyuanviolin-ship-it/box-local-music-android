            package p000;

            import android.view.View;
            import com.box.gallery.R;
            
            public abstract class li1lOolIO {
                public static final OiIoOoIi01 I00000oIO(View view) {
/* 2 */             while (view != null) {
/* 7 */                 Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
/* 18 */                OiIoOoIi01 oiIoOoIi01 = tag instanceof OiIoOoIi01 ? (OiIoOoIi01) tag : null;
/* 19 */                if (oiIoOoIi01 != null) {
/* 21 */                    return oiIoOoIi01;
                        }
/* 22 */                Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 33 */                view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
                    }
/* 1 */             return null;
                }
            }

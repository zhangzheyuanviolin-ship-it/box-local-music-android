            package p000;

            import android.view.View;
            import com.box.gallery.R;
            
            public abstract class li1li1Ol11Io {
                public static final Oool1Ii0I I00000oIO(View view) {
/* 2 */             while (view != null) {
/* 7 */                 Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
/* 18 */                Oool1Ii0I oool1Ii0I = tag instanceof Oool1Ii0I ? (Oool1Ii0I) tag : null;
/* 19 */                if (oool1Ii0I != null) {
/* 21 */                    return oool1Ii0I;
                        }
/* 22 */                Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 33 */                view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
                    }
/* 1 */             return null;
                }
            }

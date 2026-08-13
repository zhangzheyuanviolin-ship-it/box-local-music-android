            package p000;

            import android.view.View;
            import com.box.gallery.R;
            
            public abstract class O11o0olil {
                public static final IOlO1IilOlOl I00000oIO = iiliio0o.I0000Il00O(new O0o0Ol0(14));

                public static OII0l00 I00000oIO(IloI0lOlll1 iloI0lOlll1) {
                    OII0l00 oII0l00;
/* 7 */             OII0l00 oII0l002 = (OII0l00) iloI0lOlll1.I000iOII(I00000oIO);
/* 10 */            if (oII0l002 != null) {
/* 68 */                iloI0lOlll1.I00i01iIIliI(950834231);
/* 71 */                iloI0lOlll1.I0010I0i(false);
/* 77 */                return oII0l002;
                    }
/* 15 */            iloI0lOlll1.I00i01iIIliI(950836184);
/* 24 */            View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
                    while (true) {
/* 26 */                oII0l00 = null;
/* 27 */                if (view == null) {
                            break;
                        }
/* 32 */                Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
/* 43 */                OII0l00 oII0l003 = tag instanceof OII0l00 ? (OII0l00) tag : null;
/* 44 */                if (oII0l003 != null) {
/* 46 */                    oII0l00 = oII0l003;
                            break;
                        }
/* 48 */                Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 59 */                view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
                    }
/* 61 */            iloI0lOlll1.I0010I0i(false);
/* 64 */            return oII0l00;
                }
            }

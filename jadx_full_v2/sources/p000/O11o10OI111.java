            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.view.View;
            import com.box.gallery.R;
            
            public abstract class O11o10OI111 {
                public static final IOlO1IilOlOl I00000oIO = iiliio0o.I0000Il00O(new O0o0Ol0(15));

                public static OIOoOIolI I00000oIO(IloI0lOlll1 iloI0lOlll1) {
/* 7 */             OIOoOIolI oIOoOIolI = (OIOoOIolI) iloI0lOlll1.I000iOII(I00000oIO);
/* 9 */             Object obj = null;
/* 11 */            if (oIOoOIolI == null) {
/* 16 */                iloI0lOlll1.I00i01iIIliI(1208426157);
/* 25 */                View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
                        while (true) {
/* 27 */                    if (view == null) {
/* 61 */                        oIOoOIolI = null;
                                break;
                            }
/* 32 */                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
/* 43 */                    OIOoOIolI oIOoOIolI2 = tag instanceof OIOoOIolI ? (OIOoOIolI) tag : null;
/* 44 */                    if (oIOoOIolI2 != null) {
/* 46 */                        oIOoOIolI = oIOoOIolI2;
                                break;
                            }
/* 48 */                    Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 59 */                    view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
                        }
                    } else {
/* 69 */                iloI0lOlll1.I00i01iIIliI(1208423708);
                    }
/* 62 */            iloI0lOlll1.I0010I0i(false);
/* 73 */            if (oIOoOIolI != null) {
/* 115 */               iloI0lOlll1.I00i01iIIliI(1208423789);
/* 118 */               iloI0lOlll1.I0010I0i(false);
/* 168 */               return oIOoOIolI;
                    }
/* 78 */            iloI0lOlll1.I00i01iIIliI(1208428160);
/* 87 */            Context baseContext = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
                    while (true) {
/* 91 */                if (!(baseContext instanceof ContextWrapper)) {
                            break;
                        }
/* 95 */                if (baseContext instanceof OIOoOIolI) {
/* 97 */                    obj = baseContext;
                            break;
                        }
/* 101 */               baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
/* 106 */           OIOoOIolI oIOoOIolI3 = (OIOoOIolI) obj;
/* 108 */           iloI0lOlll1.I0010I0i(false);
/* 111 */           return oIOoOIolI3;
                }
            }

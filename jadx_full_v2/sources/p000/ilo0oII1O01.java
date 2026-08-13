            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            
            public abstract class ilo0oII1O01 {
                public static final Oool0IIIO0o I00000oIO(Oool0IIIO0o oool0IIIO0o, IloI0lOlll1 iloI0lOlll1) {
/* 7 */             Context baseContext = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 17 */            boolean zI000II = iloI0lOlll1.I000II(baseContext) | iloI0lOlll1.I000II(oool0IIIO0o);
/* 18 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 22 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 30 */                while (baseContext instanceof ContextWrapper) {
/* 34 */                    if (baseContext instanceof IOiO1Ol) {
/* 48 */                        Ii10ooiIO ii10ooiIO = (Ii10ooiIO) ((Io1ii0IO) ilII1oOi1.I00000oIO(Io1ii0IO.class, (IOiO1Ol) baseContext));
/* 63 */                        objI00O0i0ii = new Io1il0IoII(ii10ooiIO.I00000oIO(), oool0IIIO0o, new I0IIiO0iI(ii10ooiIO.I00000oIO, ii10ooiIO.I00000oOI));
/* 66 */                        iloI0lOlll1.I00iio(objI00O0i0ii);
                            } else {
/* 74 */                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            }
                        }
/* 81 */                IoOOl0iOl1io.I000OOo1O("Expected an activity context for creating a HiltViewModelFactory but instead found: ", baseContext);
/* 84 */                return null;
                    }
/* 69 */            return (Oool0IIIO0o) objI00O0i0ii;
                }
            }

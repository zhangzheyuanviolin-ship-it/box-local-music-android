            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class liIIiol0oI10 {
                /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static i00lIlOOll0 I00000oIO(IloI0lOlll1 iloI0lOlll1) {
                    Object obj;
/* 7 */             View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 9 */             i00lIlOOll0 i00lilooll0I00000oOI = I00000oOI(view);
/* 21 */            boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(i00lilooll0I00000oOI) | iloI0lOlll1.I000OOo1O(view);
/* 22 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 26 */            if (!zI000OOo1O) {
                        obj = objI00O0i0ii;
/* 30 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 36 */                    OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(28);
/* 39 */                    oiOi011iI1ol.I00iiI = i00lilooll0I00000oOI;
/* 41 */                    oiOi011iI1ol.I00iiO = view;
/* 43 */                    VarHandle.storeStoreFence();
/* 46 */                    iloI0lOlll1.I00iio(oiOi011iI1ol);
                            obj = oiOi011iI1ol;
                        }
                    }
/* 51 */            iIO0iiOiOl0l.I00000oOI(i00lilooll0I00000oOI, (Function1) obj, iloI0lOlll1);
/* 77 */            return i00lilooll0I00000oOI;
                }

                public static i00lIlOOll0 I00000oOI(View view) {
                    i00lIlOOll0 i00lilooll0;
/* 1 */             WeakHashMap weakHashMap = i00lIlOOll0.I001i1O0Ol;
                    synchronized (weakHashMap) {
                        try {
/* 4 */                     Object i00lilooll02 = weakHashMap.get(view);
/* 8 */                     if (i00lilooll02 == null) {
/* 12 */                        i00lilooll02 = new i00lIlOOll0(view);
/* 15 */                        weakHashMap.put(view, i00lilooll02);
                            }
/* 21 */                    i00lilooll0 = (i00lIlOOll0) i00lilooll02;
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 24 */            return i00lilooll0;
                }

                public static I10OOlO I0000Il00O(int i, String str) {
/* 3 */             I10OOlO i10OOlO = new I10OOlO();
/* 6 */             i10OOlO.I00000oIO = i;
/* 8 */             i10OOlO.I00000oOI = str;
/* 16 */            i10OOlO.I0000Il00O = lOO00IiI0li.I00000oIO(Ioo0l0I.I0000oI00);
/* 24 */            i10OOlO.I0000O = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 26 */            VarHandle.storeStoreFence();
/* 37 */            return i10OOlO;
                }
            }

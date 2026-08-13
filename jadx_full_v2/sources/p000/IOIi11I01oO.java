            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.HashMap;
            import java.util.List;
            
            public final class IOIi11I01oO {
                public HashMap I00000oIO;
                public HashMap I00000oOI;

                public static void I00000oIO(List list, O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0, O0oiO0ilooli o0oiO0ilooli) {
/* 1 */             if (list != null) {
/* 9 */                 for (int size = list.size() - 1; size >= 0; size--) {
/* 15 */                    IOIi1I11O iOIi1I11O = (IOIi1I11O) list.get(size);
/* 17 */                    Method method = iOIi1I11O.I00000oOI;
                            try {
/* 19 */                        int i = iOIi1I11O.I00000oIO;
/* 21 */                        if (i == 0) {
/* 46 */                            method.invoke(o0oiO0ilooli, null);
                                } else if (i == 1) {
/* 41 */                            method.invoke(o0oiO0ilooli, o0oiOi);
                                } else if (i == 2) {
/* 33 */                            method.invoke(o0oiO0ilooli, o0oiOi, o0oOOiI0);
                                }
                            } catch (IllegalAccessException e) {
/* 53 */                        IioIoO10iOiI.I000lI(e);
/* 56 */                        return;
                            } catch (InvocationTargetException e2) {
/* 64 */                        OIiilo1Ool0o.I000iOII("Failed to call observer method", e2.getCause());
/* 204 */                       return;
                            }
                        }
                    }
                }
            }

            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ii0OOOOo0i {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I) {
/* 13 */            return iIlll1lo.I00000oOI(o1ooiI111i, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, oioOIi1o0I, true, 1042431);
                }

                public static final O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i) {
/* 13 */            return iIlll1lo.I00000oOI(o1ooiI111i, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 1044479);
                }

                public static ii0II11oi0I I0000Il00O() {
                    String strI001IIilI0O;
/* 3 */             ClassLoader classLoader = ii0OOOOo0i.class.getClassLoader();
/* 14 */            if (ii0II11oi0I.class.equals(ii0II11oi0I.class)) {
/* 59 */                strI001IIilI0O = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
                    } else {
/* 28 */                if (!ii0II11oi0I.class.getPackage().equals(ii0OOOOo0i.class.getPackage())) {
/* 34 */                    I000II.I000iOII(ii0II11oi0I.class.getName());
/* 13 */                    return null;
                        }
/* 54 */                strI001IIilI0O = Oi010OO0.I001IIilI0O(ii0II11oi0I.class.getPackage().getName(), ".BlazeGenerated", ii0II11oi0I.class.getSimpleName(), "Loader");
                    }
                    try {
                        try {
                            try {
/* 74 */                        IIlIOloOOO.I001i1lo1io(Class.forName(strI001IIilI0O, true, classLoader).getConstructor(null).newInstance(null));
/* 77 */                        throw null;
                            } catch (IllegalAccessException e) {
/* 97 */                        throw new IllegalStateException(e);
                            } catch (InstantiationException e2) {
/* 103 */                       throw new IllegalStateException(e2);
                            }
                        } catch (NoSuchMethodException e3) {
/* 109 */                   throw new IllegalStateException(e3);
                        } catch (InvocationTargetException e4) {
/* 91 */                    throw new IllegalStateException(e4);
                        }
                    } catch (ClassNotFoundException unused) {
                        try {
/* 117 */                   Iterator it = Arrays.asList(new ii0OOOOo0i[0]).iterator();
/* 123 */                   ArrayList arrayList = new ArrayList();
/* 130 */                   while (it.hasNext()) {
                                try {
/* 197 */                           if (it.next() == null) {
/* 199 */                               throw null;
                                    }
/* 205 */                           throw new ClassCastException();
                                } catch (ServiceConfigurationError e5) {
/* 236 */                           Logger.getLogger(ii0I1Il.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(ii0II11oi0I.class.getSimpleName()), (Throwable) e5);
                                }
                            }
/* 136 */                   if (arrayList.size() == 1) {
/* 142 */                       return (ii0II11oi0I) arrayList.get(0);
                            }
/* 149 */                   if (arrayList.size() == 0) {
/* 13 */                        return null;
                            }
                            try {
/* 172 */                       return (ii0II11oi0I) ii0II11oi0I.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                            } catch (IllegalAccessException e6) {
/* 185 */                       OoOil11Ol1o.I000oI1ioi(e6);
/* 13 */                        return null;
                            } catch (NoSuchMethodException e7) {
/* 189 */                       OoOil11Ol1o.I000oI1ioi(e7);
/* 13 */                        return null;
                            } catch (InvocationTargetException e8) {
/* 181 */                       OoOil11Ol1o.I000oI1ioi(e8);
/* 13 */                        return null;
                            }
                        } catch (Throwable th) {
/* 743 */                   throw new ServiceConfigurationError(th.getMessage(), th);
                        }
                    }
                }
            }

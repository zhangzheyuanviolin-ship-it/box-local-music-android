            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class i1iI1lIoo {
                public static final IOii1l I00000oIO = new IOii1l(1266779645, new IOilli0o(10), false);
                public static final IOii1l I00000oOI = new IOii1l(-654090135, new IOilli0o(14), false);
                public static final IOii1l I0000Il00O = new IOii1l(1575797098, new IOilli0o(15), false);
                public static final IOii1l I0000O = new IOii1l(-2127015260, new IOilli0o(16), false);
                public static final IOii1l I0000oI00 = new IOii1l(523103810, new IOillo1(2), false);
                public static final IOii1l I0001Ioi1lo = new IOii1l(1714398443, new IOillo1(3), false);
                public static final IOii1l I000II = new IOii1l(-1025610908, new IOillo1(4), false);
                public static final IOii1l I000O01llI0 = new IOii1l(1503111648, new IOillo1(5), false);
                public static final IOii1l I000OOo1O = new IOii1l(-910347568, new IOilli0o(11), false);
                public static final IOii1l I000OiO = new IOii1l(-1594577873, new IOilli0o(12), false);
                public static final IOii1l I000iOII = new IOii1l(1638938655, new IOilli0o(13), false);
                public static final IOii1l I000l1 = new IOii1l(-937293707, new IOillo1(1), false);

                public static i1i0OOO10O I00000oIO() {
                    String strI001IIilI0O;
/* 3 */             ClassLoader classLoader = i1iI1lIoo.class.getClassLoader();
/* 14 */            if (i1i0OOO10O.class.equals(i1i0OOO10O.class)) {
/* 59 */                strI001IIilI0O = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
                    } else {
/* 28 */                if (!i1i0OOO10O.class.getPackage().equals(i1iI1lIoo.class.getPackage())) {
/* 34 */                    I000II.I000iOII(i1i0OOO10O.class.getName());
/* 13 */                    return null;
                        }
/* 54 */                strI001IIilI0O = Oi010OO0.I001IIilI0O(i1i0OOO10O.class.getPackage().getName(), ".BlazeGenerated", i1i0OOO10O.class.getSimpleName(), "Loader");
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
/* 117 */                   Iterator it = Arrays.asList(new i1iI1lIoo[0]).iterator();
/* 123 */                   ArrayList arrayList = new ArrayList();
/* 130 */                   while (it.hasNext()) {
                                try {
/* 197 */                           if (it.next() == null) {
/* 199 */                               throw null;
                                    }
/* 205 */                           throw new ClassCastException();
                                } catch (ServiceConfigurationError e5) {
/* 236 */                           Logger.getLogger(i1OllOI.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(i1i0OOO10O.class.getSimpleName()), (Throwable) e5);
                                }
                            }
/* 136 */                   if (arrayList.size() == 1) {
/* 142 */                       return (i1i0OOO10O) arrayList.get(0);
                            }
/* 149 */                   if (arrayList.size() == 0) {
/* 13 */                        return null;
                            }
                            try {
/* 172 */                       return (i1i0OOO10O) i1i0OOO10O.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

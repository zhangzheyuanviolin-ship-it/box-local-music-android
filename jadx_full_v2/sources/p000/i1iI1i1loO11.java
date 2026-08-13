            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class i1iI1i1loO11 {
                public static final IOii1l I00000oIO = new IOii1l(1175919053, new IOillo1(0), false);

                public static i1i0OIoO1iO I00000oIO() {
                    String strI001IIilI0O;
/* 3 */             ClassLoader classLoader = i1iI1i1loO11.class.getClassLoader();
/* 14 */            if (i1i0OIoO1iO.class.equals(i1i0OIoO1iO.class)) {
/* 59 */                strI001IIilI0O = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
                    } else {
/* 28 */                if (!i1i0OIoO1iO.class.getPackage().equals(i1iI1i1loO11.class.getPackage())) {
/* 34 */                    I000II.I000iOII(i1i0OIoO1iO.class.getName());
/* 13 */                    return null;
                        }
/* 54 */                strI001IIilI0O = Oi010OO0.I001IIilI0O(i1i0OIoO1iO.class.getPackage().getName(), ".BlazeGenerated", i1i0OIoO1iO.class.getSimpleName(), "Loader");
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
/* 117 */                   Iterator it = Arrays.asList(new i1iI1i1loO11[0]).iterator();
/* 123 */                   ArrayList arrayList = new ArrayList();
/* 130 */                   while (it.hasNext()) {
                                try {
/* 197 */                           if (it.next() == null) {
/* 199 */                               throw null;
                                    }
/* 205 */                           throw new ClassCastException();
                                } catch (ServiceConfigurationError e5) {
/* 236 */                           Logger.getLogger(i1OliOi0o00o.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(i1i0OIoO1iO.class.getSimpleName()), (Throwable) e5);
                                }
                            }
/* 136 */                   if (arrayList.size() == 1) {
/* 142 */                       return (i1i0OIoO1iO) arrayList.get(0);
                            }
/* 149 */                   if (arrayList.size() == 0) {
/* 13 */                        return null;
                            }
                            try {
/* 172 */                       return (i1i0OIoO1iO) i1i0OIoO1iO.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

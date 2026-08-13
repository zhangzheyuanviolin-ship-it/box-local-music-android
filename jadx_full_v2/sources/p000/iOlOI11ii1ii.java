            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class iOlOI11ii1ii {
                public static IoiOolO1iOo I00000oIO;

                public static iOlO11i I00000oIO() {
/* 5 */             ClassLoader classLoader = iOlOI11ii1ii.class.getClassLoader();
/* 17 */            if (iOlO11i.class.equals(iOlO11i.class)) {
                        try {
                            try {
/* 32 */                        if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
/* 34 */                            throw null;
                                }
/* 40 */                        throw new ClassCastException();
                            } catch (ReflectiveOperationException e) {
/* 47 */                        throw new IllegalStateException(e);
                            }
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    try {
/* 55 */                Iterator it = Arrays.asList(new iOlOI11ii1ii[0]).iterator();
/* 61 */                ArrayList arrayList = new ArrayList();
/* 68 */                while (it.hasNext()) {
                            try {
/* 122 */                       if (it.next() == null) {
/* 124 */                           throw null;
                                }
/* 130 */                       throw new ClassCastException();
                            } catch (ServiceConfigurationError e2) {
/* 161 */                       Logger.getLogger(iOlIlI.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(iOlO11i.class.getSimpleName()), (Throwable) e2);
                            }
                        }
/* 74 */                if (arrayList.size() == 1) {
/* 80 */                    return (iOlO11i) arrayList.get(0);
                        }
/* 87 */                if (arrayList.size() == 0) {
/* 16 */                    return null;
                        }
                        try {
/* 110 */                   return (iOlO11i) iOlO11i.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                        } catch (ReflectiveOperationException e3) {
/* 114 */                   OoOil11Ol1o.I000oI1ioi(e3);
/* 16 */                    return null;
                        }
                    } catch (Throwable th) {
/* 245 */               throw new ServiceConfigurationError(th.getMessage(), th);
                    }
                }
            }

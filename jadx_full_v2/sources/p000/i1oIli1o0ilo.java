            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class i1oIli1o0ilo {
                public static final IOii1l I00000oIO = new IOii1l(886264466, new IOio00o(23), false);
                public static final IOii1l I00000oOI = new IOii1l(-1186244672, new IOio0lIilii1(1), false);
                public static final IOii1l I0000Il00O = new IOii1l(972839422, new IOio0lIilii1(2), false);
                public static final IOii1l I0000O = new IOii1l(-755399911, new IOio00o(24), false);
                public static final IOii1l I0000oI00 = new IOii1l(1820926624, new IOio00o(25), false);
                public static final IOii1l I0001Ioi1lo = new IOii1l(411494231, new IOio00o(26), false);
                public static final IOii1l I000II = new IOii1l(-2018442733, new IOio0lIilii1(3), false);
                public static final IOii1l I000O01llI0 = new IOii1l(1488699247, new IOio00o(27), false);
                public static final IOii1l I000OOo1O = new IOii1l(1032683101, new IOio00o(28), false);

                public static i1o0l0i I00000oIO() {
/* 5 */             ClassLoader classLoader = i1oIli1o0ilo.class.getClassLoader();
/* 17 */            if (i1o0l0i.class.equals(i1o0l0i.class)) {
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
/* 55 */                Iterator it = Arrays.asList(new i1oIli1o0ilo[0]).iterator();
/* 61 */                ArrayList arrayList = new ArrayList();
/* 68 */                while (it.hasNext()) {
                            try {
/* 122 */                       if (it.next() == null) {
/* 124 */                           throw null;
                                }
/* 130 */                       throw new ClassCastException();
                            } catch (ServiceConfigurationError e2) {
/* 161 */                       Logger.getLogger(i1lllO0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(i1o0l0i.class.getSimpleName()), (Throwable) e2);
                            }
                        }
/* 74 */                if (arrayList.size() == 1) {
/* 80 */                    return (i1o0l0i) arrayList.get(0);
                        }
/* 87 */                if (arrayList.size() == 0) {
/* 16 */                    return null;
                        }
                        try {
/* 110 */                   return (i1o0l0i) i1o0l0i.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                        } catch (ReflectiveOperationException e3) {
/* 114 */                   OoOil11Ol1o.I000oI1ioi(e3);
/* 16 */                    return null;
                        }
                    } catch (Throwable th) {
/* 245 */               throw new ServiceConfigurationError(th.getMessage(), th);
                    }
                }
            }

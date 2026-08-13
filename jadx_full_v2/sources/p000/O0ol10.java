            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            
            public abstract class O0ol10 {
                public static final HashMap I00000oIO = new HashMap();
                public static final HashMap I00000oOI = new HashMap();

                public static void I00000oIO(Constructor constructor, O0oiO0ilooli o0oiO0ilooli) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    try {
/* 5 */                 constructor.newInstance(o0oiO0ilooli);
/* 13 */                throw new ClassCastException();
                    } catch (IllegalAccessException e) {
/* 37 */                throw new RuntimeException(e);
                    } catch (InstantiationException e2) {
/* 27 */                throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
/* 20 */                throw new RuntimeException(e3);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x010f A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static int I00000oOI(Class cls) throws NoSuchMethodException, SecurityException {
                    Constructor<?> declaredConstructor;
                    boolean zBooleanValue;
                    int length;
/* 3 */             HashMap map = I00000oIO;
/* 9 */             Integer num = (Integer) map.get(cls);
/* 11 */            if (num != null) {
/* 13 */                return num.intValue();
                    }
/* 22 */            int i = 1;
/* 23 */            if (cls.getCanonicalName() != null) {
/* 27 */                int i2 = 0;
/* 28 */                ArrayList arrayList = null;
                        try {
/* 29 */                    Package r5 = cls.getPackage();
/* 33 */                    String canonicalName = cls.getCanonicalName();
/* 46 */                    String name = r5 != null ? r5.getName() : "";
/* 52 */                    if (name.length() != 0) {
/* 60 */                        canonicalName = canonicalName.substring(name.length() + 1);
                            }
/* 72 */                    String strConcat = OlOolloIIOl0.I000iOII(canonicalName, ".", "_").concat("_LifecycleAdapter");
/* 80 */                    if (name.length() != 0) {
/* 97 */                        strConcat = name + "." + strConcat;
                            }
/* 109 */                   declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
/* 117 */                   if (!declaredConstructor.isAccessible()) {
/* 119 */                       declaredConstructor.setAccessible(true);
                            }
                        } catch (ClassNotFoundException unused) {
/* 127 */                   declaredConstructor = null;
                        } catch (NoSuchMethodException e) {
/* 123 */                   IioIoO10iOiI.I000lI(e);
/* 27 */                    return 0;
                        }
/* 129 */               HashMap map2 = I00000oOI;
/* 131 */               if (declaredConstructor != null) {
/* 137 */                   map2.put(cls, Collections.singletonList(declaredConstructor));
                        } else {
/* 143 */                   IOIi1oO iOIi1oO = IOIi1oO.I0000Il00O;
/* 145 */                   HashMap map3 = iOIi1oO.I00000oOI;
/* 151 */                   Boolean bool = (Boolean) map3.get(cls);
/* 153 */                   if (bool != null) {
/* 155 */                       zBooleanValue = bool.booleanValue();
                            } else {
                                try {
/* 160 */                           Method[] declaredMethods = cls.getDeclaredMethods();
/* 164 */                           int length2 = declaredMethods.length;
/* 165 */                           int i3 = 0;
                                    while (true) {
/* 166 */                               if (i3 >= length2) {
/* 190 */                                   map3.put(cls, Boolean.FALSE);
/* 193 */                                   zBooleanValue = false;
                                            break;
                                        }
/* 178 */                               if (((OIi011o01) declaredMethods[i3].getAnnotation(OIi011o01.class)) != null) {
/* 180 */                                   iOIi1oO.I00000oIO(cls, declaredMethods);
/* 183 */                                   zBooleanValue = true;
                                            break;
                                        }
/* 185 */                               i3++;
                                    }
                                } catch (NoClassDefFoundError e2) {
/* 437 */                           throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                                }
                            }
/* 194 */                   if (!zBooleanValue) {
/* 197 */                       Class superclass = cls.getSuperclass();
/* 203 */                       if (superclass == null || !O0oiO0ilooli.class.isAssignableFrom(superclass)) {
/* 229 */                           Class<?>[] interfaces = cls.getInterfaces();
/* 233 */                           length = interfaces.length;
                                    while (true) {
/* 234 */                               if (i2 < length) {
/* 236 */                                   Class<?> cls2 = interfaces[i2];
/* 238 */                                   if (cls2 != null && O0oiO0ilooli.class.isAssignableFrom(cls2)) {
/* 250 */                                       if (I00000oOI(cls2) == 1) {
                                                    break;
                                                }
/* 253 */                                       if (arrayList == null) {
/* 257 */                                           arrayList = new ArrayList();
                                                }
/* 266 */                                       arrayList.addAll((Collection) map2.get(cls2));
                                            }
/* 269 */                                   i2++;
                                        } else if (arrayList != null) {
/* 274 */                                   map2.put(cls, arrayList);
                                        }
                                    }
                                } else if (I00000oOI(superclass) != 1) {
/* 226 */                           arrayList = new ArrayList((Collection) map2.get(superclass));
/* 229 */                           Class<?>[] interfaces2 = cls.getInterfaces();
/* 233 */                           length = interfaces2.length;
                                    while (true) {
/* 234 */                               if (i2 < length) {
                                        }
/* 269 */                               i2++;
                                    }
                                }
                            }
                        }
/* 140 */               i = 2;
                    }
/* 283 */           map.put(cls, Integer.valueOf(i));
/* 286 */           return i;
                }
            }

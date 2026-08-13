            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class IOIi1oO {
                public static final IOIi1oO I0000Il00O;
                public HashMap I00000oIO;
                public HashMap I00000oOI;

                static {
/* 3 */             IOIi1oO iOIi1oO = new IOIi1oO();
/* 11 */            iOIi1oO.I00000oIO = new HashMap();
/* 18 */            iOIi1oO.I00000oOI = new HashMap();
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            I0000Il00O = iOIi1oO;
                }

                public static void I00000oOI(HashMap map, IOIi1I11O iOIi1I11O, O0oOOiI0 o0oOOiI0, Class cls) {
/* 5 */             O0oOOiI0 o0oOOiI02 = (O0oOOiI0) map.get(iOIi1I11O);
/* 7 */             if (o0oOOiI02 == null || o0oOOiI0 == o0oOOiI02) {
/* 50 */                if (o0oOOiI02 == null) {
/* 52 */                    map.put(iOIi1I11O, o0oOOiI0);
                        }
                    } else {
/* 14 */                String name = iOIi1I11O.I00000oOI.getName();
/* 18 */                String name2 = cls.getName();
/* 46 */                I000II.I000iOII(IIlIOloOOO.I0010I0i(IIl001iO0Io.I00111O("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(o0oOOiI02), ", new value ", String.valueOf(o0oOOiI0)));
                    }
                }

                public final IOIi11I01oO I00000oIO(Class cls, Method[] methodArr) throws SecurityException {
                    int i;
/* 1 */             HashMap map = this.I00000oIO;
/* 3 */             Class superclass = cls.getSuperclass();
/* 9 */             HashMap map2 = new HashMap();
/* 13 */            if (superclass != null) {
/* 19 */                IOIi11I01oO iOIi11I01oOI00000oIO = (IOIi11I01oO) map.get(superclass);
/* 21 */                if (iOIi11I01oOI00000oIO == null) {
/* 24 */                    iOIi11I01oOI00000oIO = I00000oIO(superclass, null);
                        }
/* 30 */                map2.putAll(iOIi11I01oOI00000oIO.I00000oOI);
                    }
/* 40 */            for (Class<?> cls2 : cls.getInterfaces()) {
/* 48 */                IOIi11I01oO iOIi11I01oOI00000oIO2 = (IOIi11I01oO) map.get(cls2);
/* 50 */                if (iOIi11I01oOI00000oIO2 == null) {
/* 53 */                    iOIi11I01oOI00000oIO2 = I00000oIO(cls2, null);
                        }
/* 71 */                for (Map.Entry entry : iOIi11I01oOI00000oIO2.I00000oOI.entrySet()) {
/* 91 */                    I00000oOI(map2, (IOIi1I11O) entry.getKey(), (O0oOOiI0) entry.getValue(), cls);
                        }
                    }
/* 98 */            if (methodArr == null) {
                        try {
/* 101 */                   methodArr = cls.getDeclaredMethods();
                        } catch (NoClassDefFoundError e) {
/* 332 */                   throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
                        }
                    }
/* 107 */           boolean z = false;
/* 108 */           for (Method method : methodArr) {
/* 118 */               OIi011o01 oIi011o01 = (OIi011o01) method.getAnnotation(OIi011o01.class);
/* 120 */               if (oIi011o01 != null) {
/* 123 */                   Class<?>[] parameterTypes = method.getParameterTypes();
/* 129 */                   if (parameterTypes.length <= 0) {
/* 149 */                       i = 0;
                            } else {
/* 139 */                       if (!O0oiOi.class.isAssignableFrom(parameterTypes[0])) {
/* 145 */                           I000II.I000iOII("invalid parameter type. Must be one and instanceof LifecycleOwner");
/* 12 */                            return null;
                                }
/* 141 */                       i = 1;
                            }
/* 150 */                   O0oOOiI0 o0oOOiI0Value = oIi011o01.value();
/* 156 */                   if (parameterTypes.length > 1) {
/* 166 */                       if (!O0oOOiI0.class.isAssignableFrom(parameterTypes[1])) {
/* 182 */                           I000II.I000iOII("invalid parameter type. second arg must be an event");
/* 12 */                            return null;
                                }
/* 170 */                       if (o0oOOiI0Value != O0oOOiI0.ON_ANY) {
/* 176 */                           I000II.I000iOII("Second arg is supported only for ON_ANY value");
/* 12 */                            return null;
                                }
/* 172 */                       i = 2;
                            }
/* 187 */                   if (parameterTypes.length > 2) {
/* 213 */                       I000II.I000iOII("cannot have more than 2 params");
/* 12 */                        return null;
                            }
/* 191 */                   IOIi1I11O iOIi1I11O = new IOIi1I11O();
/* 194 */                   iOIi1I11O.I00000oIO = i;
/* 196 */                   iOIi1I11O.I00000oOI = method;
/* 198 */                   method.setAccessible(true);
/* 201 */                   VarHandle.storeStoreFence();
/* 204 */                   I00000oOI(map2, iOIi1I11O, o0oOOiI0Value, cls);
/* 207 */                   z = true;
                        }
                    }
/* 219 */           IOIi11I01oO iOIi11I01oO = new IOIi11I01oO();
/* 222 */           iOIi11I01oO.I00000oOI = map2;
/* 226 */           HashMap map3 = new HashMap();
/* 229 */           iOIi11I01oO.I00000oIO = map3;
/* 243 */           for (Map.Entry entry2 : map2.entrySet()) {
/* 255 */               O0oOOiI0 o0oOOiI0 = (O0oOOiI0) entry2.getValue();
/* 261 */               List arrayList = (List) map3.get(o0oOOiI0);
/* 263 */               if (arrayList == null) {
/* 267 */                   arrayList = new ArrayList();
/* 270 */                   map3.put(o0oOOiI0, arrayList);
                        }
/* 279 */               arrayList.add((IOIi1I11O) entry2.getKey());
                    }
/* 283 */           VarHandle.storeStoreFence();
/* 286 */           map.put(cls, iOIi11I01oO);
/* 295 */           this.I00000oOI.put(cls, Boolean.valueOf(z));
/* 298 */           return iOIi11I01oO;
                }
            }

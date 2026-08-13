            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.TreeMap;
            import p000.O01lo1il;
            
            public final class IOIOll extends O011ioiO1OI {
                public static final O011lOli FACTORY = new I00000oIO();
                private final IOIOilI0 classFactory;
                private final I00000oOI[] fieldsArray;
                private final O01lo1il.I00000oIO options;

                public class I00000oIO implements O011lOli {
                    private void createFieldBindings(OI011oo1 oI011oo1, Type type, Map<String, I00000oOI> map) throws SecurityException {
                        O011iIO1 o011iIO1;
/* 1 */                 Class<?> rawType = OoOllol1Io1.getRawType(type);
/* 5 */                 boolean zIsPlatformType = Ooll10OlIOl0.isPlatformType(rawType);
/* 15 */                for (Field field : rawType.getDeclaredFields()) {
/* 27 */                    if (includeField(zIsPlatformType, field.getModifiers()) && ((o011iIO1 = (O011iIO1) field.getAnnotation(O011iIO1.class)) == null || !o011iIO1.ignore())) {
/* 51 */                        Type typeResolve = Ooll10OlIOl0.resolve(type, rawType, field.getGenericType());
/* 55 */                        Set<? extends Annotation> setJsonAnnotations = Ooll10OlIOl0.jsonAnnotations(field);
/* 59 */                        String name = field.getName();
/* 63 */                        O011ioiO1OI o011ioiO1OIAdapter = oI011oo1.adapter(typeResolve, setJsonAnnotations, name);
/* 68 */                        field.setAccessible(true);
/* 71 */                        String strJsonName = Ooll10OlIOl0.jsonName(name, o011iIO1);
/* 77 */                        I00000oOI i00000oOI = new I00000oOI(strJsonName, field, o011ioiO1OIAdapter);
/* 80 */                        I00000oOI i00000oOIPut = map.put(strJsonName, i00000oOI);
/* 86 */                        if (i00000oOIPut != null) {
/* 97 */                            StringBuilder sb = new StringBuilder("Conflicting fields:\n    ");
/* 102 */                           sb.append(i00000oOIPut.field);
/* 105 */                           Field field2 = i00000oOI.field;
/* 109 */                           sb.append("\n    ");
/* 112 */                           sb.append(field2);
/* 122 */                           throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    }

                    private boolean includeField(boolean z, int i) {
/* 6 */                 if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
/* 5 */                     return false;
                        }
                        return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
                    }

                    private void throwIfIsCollectionClass(Type type, Class<?> cls) {
/* 1 */                 Class<?> rawType = OoOllol1Io1.getRawType(type);
/* 9 */                 if (cls.isAssignableFrom(rawType)) {
/* 18 */                    StringBuilder sb = new StringBuilder("No JsonAdapter for ");
/* 21 */                    sb.append(type);
/* 24 */                    String simpleName = cls.getSimpleName();
/* 28 */                    String simpleName2 = rawType.getSimpleName();
/* 34 */                    sb.append(", you should probably use ");
/* 37 */                    sb.append(simpleName);
/* 42 */                    sb.append(" instead of ");
/* 45 */                    sb.append(simpleName2);
/* 50 */                    sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
/* 89 */                    throw new IllegalArgumentException(sb.toString());
                        }
                    }

                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) throws SecurityException {
/* 4 */                 if ((type instanceof Class) || (type instanceof ParameterizedType)) {
/* 12 */                    Class<?> rawType = OoOllol1Io1.getRawType(type);
/* 20 */                    if (!rawType.isInterface() && !rawType.isEnum() && set.isEmpty()) {
/* 42 */                        if (Ooll10OlIOl0.isPlatformType(rawType)) {
/* 46 */                            throwIfIsCollectionClass(type, List.class);
/* 51 */                            throwIfIsCollectionClass(type, Set.class);
/* 56 */                            throwIfIsCollectionClass(type, Map.class);
/* 61 */                            throwIfIsCollectionClass(type, Collection.class);
/* 74 */                            String str = "Platform " + rawType;
/* 80 */                            if (type instanceof ParameterizedType) {
/* 95 */                                str = str + " in " + type;
                                    }
/* 105 */                           I000II.I000iOII(str.concat(" requires explicit JsonAdapter to be registered"));
/* 3 */                             return null;
                                }
/* 113 */                       if (!rawType.isAnonymousClass()) {
/* 119 */                           if (rawType.isLocalClass()) {
/* 235 */                               I000II.I000iOII("Cannot serialize local class ".concat(rawType.getName()));
/* 3 */                                 return null;
                                    }
/* 125 */                           if (rawType.getEnclosingClass() != null && !Modifier.isStatic(rawType.getModifiers())) {
/* 148 */                               I000II.I000iOII("Cannot serialize non-static nested class ".concat(rawType.getName()));
/* 3 */                                 return null;
                                    }
/* 160 */                           if (Modifier.isAbstract(rawType.getModifiers())) {
/* 221 */                               I000II.I000iOII("Cannot serialize abstract class ".concat(rawType.getName()));
/* 3 */                                 return null;
                                    }
/* 166 */                           if (Ooll10OlIOl0.isKotlin(rawType)) {
/* 207 */                               IoOOl0iOl1io.I000o00OoI0I(rawType.getName(), "Cannot serialize Kotlin type ", ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
/* 3 */                                 return null;
                                    }
/* 168 */                           IOIOilI0 iOIOilI0 = IOIOilI0.get(rawType);
/* 174 */                           TreeMap treeMap = new TreeMap();
/* 179 */                           while (type != Object.class) {
/* 181 */                               createFieldBindings(oI011oo1, type, treeMap);
/* 184 */                               type = OoOllol1Io1.getGenericSuperclass(type);
                                    }
/* 194 */                           return new IOIOll(iOIOilI0, treeMap).nullSafe();
                                }
/* 249 */                       I000II.I000iOII("Cannot serialize anonymous class ".concat(rawType.getName()));
                            }
                        }
/* 3 */                 return null;
                    }
                }

                public static class I00000oOI {
                    final O011ioiO1OI adapter;
                    final Field field;
                    final String name;

                    public I00000oOI(String str, Field field, O011ioiO1OI o011ioiO1OI) {
/* 4 */                 this.name = str;
/* 6 */                 this.field = field;
/* 8 */                 this.adapter = o011ioiO1OI;
                    }

                    public void read(O01lo1il o01lo1il, Object obj) throws IllegalAccessException, IllegalArgumentException {
/* 9 */                 this.field.set(obj, this.adapter.fromJson(o01lo1il));
                    }

                    public void write(O01ooIO00oio o01ooIO00oio, Object obj) throws IllegalAccessException, IllegalArgumentException {
/* 9 */                 this.adapter.toJson(o01ooIO00oio, this.field.get(obj));
                    }
                }

                public IOIOll(IOIOilI0 iOIOilI0, Map<String, I00000oOI> map) {
/* 4 */             this.classFactory = iOIOilI0;
/* 22 */            this.fieldsArray = (I00000oOI[]) map.values().toArray(new I00000oOI[map.size()]);
/* 44 */            this.options = O01lo1il.I00000oIO.of((String[]) map.keySet().toArray(new String[map.size()]));
                }

                @Override
                public Object fromJson(O01lo1il o01lo1il) throws IllegalArgumentException {
                    try {
/* 4 */                 Object objNewInstance = this.classFactory.newInstance();
                        try {
/* 8 */                     o01lo1il.beginObject();
/* 15 */                    while (o01lo1il.hasNext()) {
/* 19 */                        int iSelectName = o01lo1il.selectName(this.options);
/* 24 */                        if (iSelectName == -1) {
/* 26 */                            o01lo1il.skipName();
/* 29 */                            o01lo1il.skipValue();
                                } else {
/* 37 */                            this.fieldsArray[iSelectName].read(o01lo1il, objNewInstance);
                                }
                            }
/* 41 */                    o01lo1il.endObject();
/* 44 */                    return objNewInstance;
                        } catch (IllegalAccessException unused) {
/* 45 */                    OoOil11Ol1o.I0000Il00O();
/* 1 */                     return null;
                        }
                    } catch (IllegalAccessException unused2) {
/* 51 */                OoOil11Ol1o.I0000Il00O();
/* 1 */                 return null;
                    } catch (InstantiationException e) {
/* 61 */                IioIoO10iOiI.I000lI(e);
/* 1 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 60 */                throw Ooll10OlIOl0.rethrowCause(e2);
                    }
                }

                @Override
                public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) throws IllegalArgumentException {
                    try {
/* 1 */                 o01ooIO00oio.beginObject();
/* 8 */                 for (I00000oOI i00000oOI : this.fieldsArray) {
/* 14 */                    o01ooIO00oio.name(i00000oOI.name);
/* 17 */                    i00000oOI.write(o01ooIO00oio, obj);
                        }
/* 23 */                o01ooIO00oio.endObject();
                    } catch (IllegalAccessException unused) {
/* 27 */                OoOil11Ol1o.I0000Il00O();
                    }
                }

                public String toString() {
/* 18 */            return "JsonAdapter(" + this.classFactory + ")";
                }
            }

            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Array;
            import java.lang.reflect.Field;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Method;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Proxy;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.lang.reflect.WildcardType;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Properties;
            import java.util.Set;
            import p000.Ooll10OlIOl0;
            
/* 25 */    public final class OoOllol1Io1 {

                public class I00000oIO implements InvocationHandler {
                    final Class val$annotationType;

                    public I00000oIO(Class cls) {
/* 1 */                 this.val$annotationType = cls;
                    }

                    @Override
                    public Object invoke(Object obj, Method method, Object[] objArr) {
/* 1 */                 String name = method.getName();
/* 5 */                 name.getClass();
                        switch (name) {
                            case "toString":
/* 111 */                       return "@" + this.val$annotationType.getName() + "()";
                            case "equals":
/* 85 */                        return Boolean.valueOf(this.val$annotationType.isInstance(objArr[0]));
                            case "hashCode":
/* 72 */                        return 0;
                            case "annotationType":
/* 69 */                        return this.val$annotationType;
                            default:
/* 64 */                        return method.invoke(obj, objArr);
                        }
                    }
                }

                private OoOllol1Io1() {
                }

                public static Type arrayComponentType(Type type) {
/* 3 */             if (type instanceof GenericArrayType) {
/* 7 */                 return ((GenericArrayType) type).getGenericComponentType();
                    }
/* 14 */            if (type instanceof Class) {
/* 18 */                return ((Class) type).getComponentType();
                    }
/* 23 */            return null;
                }

                public static GenericArrayType arrayOf(Type type) {
/* 3 */             return new Ooll10OlIOl0.I00000oIO(type);
                }

                public static Type collectionElementType(Type type, Class<?> cls) {
/* 3 */             Type supertype = getSupertype(type, cls, Collection.class);
/* 10 */            if (supertype instanceof WildcardType) {
/* 18 */                supertype = ((WildcardType) supertype).getUpperBounds()[0];
                    }
                    return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments()[0] : Object.class;
                }

                public static <T extends Annotation> T createJsonQualifierImplementation(Class<T> cls) {
/* 6 */             if (!cls.isAnnotation()) {
/* 57 */                IoOOl0iOl1io.I0000O(cls, " must be an annotation.");
/* 5 */                 return null;
                    }
/* 14 */            if (!cls.isAnnotationPresent(O01llo0IIo0.class)) {
/* 51 */                IoOOl0iOl1io.I0000O(cls, " must have @JsonQualifier.");
/* 5 */                 return null;
                    }
/* 21 */            if (cls.getDeclaredMethods().length == 0) {
/* 40 */                return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new I00000oIO(cls));
                    }
/* 45 */            IoOOl0iOl1io.I0000O(cls, " must not declare methods.");
/* 5 */             return null;
                }

                public static boolean equals(Type type, Type type2) {
/* 2 */             if (type == type2) {
/* 1 */                 return true;
                    }
/* 7 */             if (type instanceof Class) {
                        return type2 instanceof GenericArrayType ? equals(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
                    }
/* 38 */            if (type instanceof ParameterizedType) {
/* 42 */                if (!(type2 instanceof ParameterizedType)) {
/* 37 */                    return false;
                        }
/* 45 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 47 */                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                        return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Ooll10OlIOl0.I00000oOI ? ((Ooll10OlIOl0.I00000oOI) parameterizedType).typeArguments : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Ooll10OlIOl0.I00000oOI ? ((Ooll10OlIOl0.I00000oOI) parameterizedType2).typeArguments : parameterizedType2.getActualTypeArguments());
                    }
/* 115 */           if (type instanceof GenericArrayType) {
/* 119 */               if (type2 instanceof Class) {
/* 133 */                   return equals(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
                        }
/* 140 */               if (type2 instanceof GenericArrayType) {
/* 155 */                   return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
                        }
/* 37 */                return false;
                    }
/* 162 */           if (type instanceof WildcardType) {
/* 166 */               if (!(type2 instanceof WildcardType)) {
/* 37 */                    return false;
                        }
/* 169 */               WildcardType wildcardType = (WildcardType) type;
/* 171 */               WildcardType wildcardType2 = (WildcardType) type2;
                        return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                    }
/* 205 */           if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
/* 37 */                return false;
                    }
/* 212 */           TypeVariable typeVariable = (TypeVariable) type;
/* 214 */           TypeVariable typeVariable2 = (TypeVariable) type2;
                    return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
                }

                public static String generatedJsonAdapterName(String str) {
/* 22 */            return str.replace("$", "_") + "JsonAdapter";
                }

                @Deprecated
                public static Set<? extends Annotation> getFieldJsonQualifierAnnotations(Class<?> cls, String str) throws NoSuchFieldException, SecurityException {
                    try {
/* 1 */                 Field declaredField = cls.getDeclaredField(str);
/* 6 */                 declaredField.setAccessible(true);
/* 9 */                 Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
/* 16 */                LinkedHashSet linkedHashSet = new LinkedHashSet(declaredAnnotations.length);
/* 21 */                for (Annotation annotation : declaredAnnotations) {
/* 35 */                    if (annotation.annotationType().isAnnotationPresent(O01llo0IIo0.class)) {
/* 37 */                        linkedHashSet.add(annotation);
                            }
                        }
/* 46 */                return Collections.unmodifiableSet(linkedHashSet);
                    } catch (NoSuchFieldException e) {
/* 57 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Could not access field ", str, " on class ");
/* 65 */                sbI001IIilI0O.append(cls.getCanonicalName());
/* 89 */                throw new IllegalArgumentException(sbI001IIilI0O.toString(), e);
                    }
                }

                public static Type getGenericSuperclass(Type type) {
/* 1 */             Class<?> rawType = getRawType(type);
/* 9 */             return Ooll10OlIOl0.resolve(type, rawType, rawType.getGenericSuperclass());
                }

                public static Class<?> getRawType(Type type) {
/* 3 */             if (type instanceof Class) {
/* 5 */                 return (Class) type;
                    }
/* 10 */            if (type instanceof ParameterizedType) {
/* 18 */                return (Class) ((ParameterizedType) type).getRawType();
                    }
/* 24 */            if (type instanceof GenericArrayType) {
/* 40 */                return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                    }
/* 47 */            if (type instanceof TypeVariable) {
/* 49 */                return Object.class;
                    }
/* 54 */            if (type instanceof WildcardType) {
/* 64 */                return getRawType(((WildcardType) type).getUpperBounds()[0]);
                    }
/* 86 */            OoOil11Ol1o.I0010o("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
/* 89 */            return null;
                }

                public static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
/* 5 */             if (cls2.isAssignableFrom(cls)) {
/* 11 */                return Ooll10OlIOl0.resolve(type, cls, Ooll10OlIOl0.getGenericSupertype(type, cls, cls2));
                    }
/* 16 */            OIiilo1Ool0o.I00100o1O0lo();
/* 19 */            return null;
                }

                public static Type[] mapKeyAndValueTypes(Type type, Class<?> cls) {
/* 6 */             if (type == Properties.class) {
/* 8 */                 return new Type[]{String.class, String.class};
                    }
/* 19 */            Type supertype = getSupertype(type, cls, Map.class);
                    return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }

                public static ParameterizedType newParameterizedType(Type type, Type... typeArr) {
/* 3 */             if (typeArr.length != 0) {
/* 7 */                 return new Ooll10OlIOl0.I00000oOI(null, type, typeArr);
                    }
/* 13 */            IioIoO10iOiI.I000OiO("Missing type arguments for ", type);
/* 2 */             return null;
                }

                public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
/* 2 */             if (typeArr.length != 0) {
/* 6 */                 return new Ooll10OlIOl0.I00000oOI(type, type2, typeArr);
                    }
/* 12 */            IioIoO10iOiI.I000OiO("Missing type arguments for ", type2);
/* 15 */            return null;
                }

                public static Set<? extends Annotation> nextAnnotations(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
/* 8 */             if (!cls.isAnnotationPresent(O01llo0IIo0.class)) {
/* 59 */                IoOOl0iOl1io.I0000O(cls, " is not a JsonQualifier.");
/* 7 */                 return null;
                    }
/* 14 */            if (set.isEmpty()) {
/* 7 */                 return null;
                    }
/* 25 */            for (Annotation annotation : set) {
/* 41 */                if (cls.equals(annotation.annotationType())) {
/* 45 */                    LinkedHashSet linkedHashSet = new LinkedHashSet(set);
/* 48 */                    linkedHashSet.remove(annotation);
/* 51 */                    return Collections.unmodifiableSet(linkedHashSet);
                        }
                    }
/* 7 */             return null;
                }

                public static WildcardType subtypeOf(Type type) {
/* 23 */            return new Ooll10OlIOl0.I0000Il00O(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, Ooll10OlIOl0.EMPTY_TYPE_ARRAY);
                }

                public static WildcardType supertypeOf(Type type) {
/* 27 */            return new Ooll10OlIOl0.I0000Il00O(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
                }

/* 26 */        public static String generatedJsonAdapterName(Class<?> cls) {
/* 27 */            if (cls.getAnnotation(O01III.class) != null) {
/* 28 */                return generatedJsonAdapterName(cls.getName());
                    }
/* 29 */            IioIoO10iOiI.I000OiO("Class does not have a JsonClass annotation: ", cls);
                    return null;
                }
            }

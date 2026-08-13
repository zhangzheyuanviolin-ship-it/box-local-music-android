            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.AnnotatedElement;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.lang.reflect.WildcardType;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
/* 16 */    public final class Ooll10OlIOl0 {
                public static final Class<?> DEFAULT_CONSTRUCTOR_MARKER;
                private static final Class<? extends Annotation> METADATA;
                private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER_TYPE;
                public static final Set<Annotation> NO_ANNOTATIONS = Collections.EMPTY_SET;
                public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

                public static final class I00000oIO implements GenericArrayType {
                    private final Type componentType;

                    public I00000oIO(Type type) {
/* 8 */                 this.componentType = Ooll10OlIOl0.canonicalize(type);
                    }

                    public boolean equals(Object obj) {
                        return (obj instanceof GenericArrayType) && OoOllol1Io1.equals(this, (GenericArrayType) obj);
                    }

                    @Override
                    public Type getGenericComponentType() {
/* 1 */                 return this.componentType;
                    }

                    public int hashCode() {
/* 3 */                 return this.componentType.hashCode();
                    }

                    public String toString() {
/* 20 */                return Ooll10OlIOl0.typeToString(this.componentType) + "[]";
                    }
                }

                public static final class I00000oOI implements ParameterizedType {
                    private final Type ownerType;
                    private final Type rawType;
                    public final Type[] typeArguments;

                    public I00000oOI(Type type, Type type2, Type... typeArr) {
/* 7 */                 if (type2 instanceof Class) {
/* 12 */                    Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
/* 18 */                    if (type != null) {
/* 20 */                        if (enclosingClass == null || OoOllol1Io1.getRawType(type) != enclosingClass) {
/* 31 */                            OoOil11Ol1o.I0010o("unexpected owner type for ", type2, ": ", type);
/* 34 */                            throw null;
                                }
                            } else if (enclosingClass != null) {
/* 40 */                        OoOil11Ol1o.I000OOo1O(type2, "unexpected owner type for ", ": null");
/* 43 */                        throw null;
                            }
                        }
/* 51 */                this.ownerType = type != null ? Ooll10OlIOl0.canonicalize(type) : null;
/* 57 */                this.rawType = Ooll10OlIOl0.canonicalize(type2);
/* 65 */                this.typeArguments = (Type[]) typeArr.clone();
/* 67 */                int i = 0;
                        while (true) {
/* 68 */                    Type[] typeArr2 = this.typeArguments;
/* 71 */                    if (i >= typeArr2.length) {
/* 215 */                       return;
                            }
/* 75 */                    typeArr2[i].getClass();
/* 82 */                    Ooll10OlIOl0.checkNotPrimitive(this.typeArguments[i]);
/* 85 */                    Type[] typeArr3 = this.typeArguments;
/* 93 */                    typeArr3[i] = Ooll10OlIOl0.canonicalize(typeArr3[i]);
/* 95 */                    i++;
                        }
                    }

                    public boolean equals(Object obj) {
                        return (obj instanceof ParameterizedType) && OoOllol1Io1.equals(this, (ParameterizedType) obj);
                    }

                    @Override
                    public Type[] getActualTypeArguments() {
/* 7 */                 return (Type[]) this.typeArguments.clone();
                    }

                    @Override
                    public Type getOwnerType() {
/* 1 */                 return this.ownerType;
                    }

                    @Override
                    public Type getRawType() {
/* 1 */                 return this.rawType;
                    }

                    public int hashCode() {
/* 20 */                return Ooll10OlIOl0.hashCodeOrZero(this.ownerType) ^ (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode());
                    }

                    public String toString() {
/* 10 */                StringBuilder sb = new StringBuilder((this.typeArguments.length + 1) * 30);
/* 19 */                sb.append(Ooll10OlIOl0.typeToString(this.rawType));
/* 25 */                if (this.typeArguments.length == 0) {
/* 27 */                    return sb.toString();
                        }
/* 34 */                sb.append("<");
/* 46 */                sb.append(Ooll10OlIOl0.typeToString(this.typeArguments[0]));
/* 52 */                for (int i = 1; i < this.typeArguments.length; i++) {
/* 56 */                    sb.append(", ");
/* 67 */                    sb.append(Ooll10OlIOl0.typeToString(this.typeArguments[i]));
                        }
/* 75 */                sb.append(">");
/* 78 */                return sb.toString();
                    }
                }

                public static final class I0000Il00O implements WildcardType {
                    private final Type lowerBound;
                    private final Type upperBound;

                    public I0000Il00O(Type[] typeArr, Type[] typeArr2) {
/* 7 */                 if (typeArr2.length > 1) {
/* 72 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 89 */                    throw null;
                        }
/* 10 */                if (typeArr.length != 1) {
/* 68 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 71 */                    throw null;
                        }
/* 14 */                if (typeArr2.length != 1) {
/* 49 */                    typeArr[0].getClass();
/* 54 */                    Ooll10OlIOl0.checkNotPrimitive(typeArr[0]);
/* 57 */                    this.lowerBound = null;
/* 65 */                    this.upperBound = Ooll10OlIOl0.canonicalize(typeArr[0]);
/* 67 */                    return;
                        }
/* 18 */                typeArr2[0].getClass();
/* 23 */                Ooll10OlIOl0.checkNotPrimitive(typeArr2[0]);
/* 30 */                if (typeArr[0] != Object.class) {
/* 43 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 46 */                    throw null;
                        }
/* 38 */                this.lowerBound = Ooll10OlIOl0.canonicalize(typeArr2[0]);
/* 40 */                this.upperBound = Object.class;
                    }

                    public boolean equals(Object obj) {
                        return (obj instanceof WildcardType) && OoOllol1Io1.equals(this, (WildcardType) obj);
                    }

                    @Override
                    public Type[] getLowerBounds() {
/* 1 */                 Type type = this.lowerBound;
                        return type != null ? new Type[]{type} : Ooll10OlIOl0.EMPTY_TYPE_ARRAY;
                    }

                    @Override
                    public Type[] getUpperBounds() {
/* 4 */                 return new Type[]{this.upperBound};
                    }

                    public int hashCode() {
/* 1 */                 Type type = this.lowerBound;
/* 21 */                return (this.upperBound.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
                    }

                    public String toString() {
/* 3 */                 if (this.lowerBound != null) {
/* 21 */                    return "? super " + Ooll10OlIOl0.typeToString(this.lowerBound);
                        }
/* 30 */                if (this.upperBound == Object.class) {
/* 32 */                    return "?";
                        }
/* 51 */                return "? extends " + Ooll10OlIOl0.typeToString(this.upperBound);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Class cls;
                    try {
/* 15 */                cls = Class.forName(getKotlinMetadataClassName());
                    } catch (ClassNotFoundException unused) {
/* 20 */                cls = null;
                    }
/* 21 */            METADATA = cls;
/* 25 */            DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;
/* 31 */            LinkedHashMap linkedHashMap = new LinkedHashMap(16);
/* 38 */            linkedHashMap.put(Boolean.TYPE, Boolean.class);
/* 45 */            linkedHashMap.put(Byte.TYPE, Byte.class);
/* 52 */            linkedHashMap.put(Character.TYPE, Character.class);
/* 59 */            linkedHashMap.put(Double.TYPE, Double.class);
/* 66 */            linkedHashMap.put(Float.TYPE, Float.class);
/* 73 */            linkedHashMap.put(Integer.TYPE, Integer.class);
/* 80 */            linkedHashMap.put(Long.TYPE, Long.class);
/* 87 */            linkedHashMap.put(Short.TYPE, Short.class);
/* 94 */            linkedHashMap.put(Void.TYPE, Void.class);
/* 101 */           PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(linkedHashMap);
                }

                private Ooll10OlIOl0() {
                }

                public static <T> Class<T> boxIfPrimitive(Class<T> cls) {
/* 7 */             Class<T> cls2 = (Class) PRIMITIVE_TO_WRAPPER_TYPE.get(cls);
                    return cls2 == null ? cls : cls2;
                }

                public static Type canonicalize(Type type) {
/* 3 */             if (type instanceof Class) {
/* 5 */                 Class cls = (Class) type;
                        return cls.isArray() ? new I00000oIO(canonicalize(cls.getComponentType())) : cls;
                    }
/* 30 */            if (type instanceof ParameterizedType) {
/* 34 */                if (type instanceof I00000oOI) {
/* 36 */                    return type;
                        }
/* 37 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 53 */                return new I00000oOI(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
                    }
/* 59 */            if (type instanceof GenericArrayType) {
                        return type instanceof I00000oIO ? type : new I00000oIO(((GenericArrayType) type).getGenericComponentType());
                    }
/* 80 */            if (!(type instanceof WildcardType) || (type instanceof I0000Il00O)) {
/* 86 */                return type;
                    }
/* 87 */            WildcardType wildcardType = (WildcardType) type;
/* 99 */            return new I0000Il00O(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
                }

                public static void checkNotPrimitive(Type type) {
/* 3 */             if ((type instanceof Class) && ((Class) type).isPrimitive()) {
/* 19 */                OoOil11Ol1o.I000OOo1O(type, "Unexpected primitive ", ". Use the boxed type.");
                    }
                }

                public static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
/* 1 */             GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
/* 7 */             if (genericDeclaration instanceof Class) {
/* 9 */                 return (Class) genericDeclaration;
                    }
/* 12 */            return null;
                }

                private static <T> Constructor<T> findConstructor(Class<T> cls) throws SecurityException {
/* 7 */             for (Object obj : cls.getDeclaredConstructors()) {
/* 9 */                 Constructor<T> constructor = (Constructor<T>) obj;
/* 11 */                Class<?>[] parameterTypes = constructor.getParameterTypes();
/* 16 */                if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(DEFAULT_CONSTRUCTOR_MARKER)) {
/* 31 */                    return constructor;
                        }
                    }
/* 37 */            IoOOl0iOl1io.I000OOo1O("No defaults constructor found for ", cls);
/* 40 */            return null;
                }

                public static O011ioiO1OI generatedAdapter(OI011oo1 oI011oo1, Type type, Class<?> cls) {
                    Class<?> cls2;
                    Constructor<?> declaredConstructor;
                    Object[] objArr;
/* 9 */             O01III o01iii = (O01III) cls.getAnnotation(O01III.class);
/* 12 */            if (o01iii != null && o01iii.generateAdapter()) {
                        try {
                            try {
/* 35 */                        cls2 = Class.forName(OoOllol1Io1.generatedJsonAdapterName(cls.getName()), true, cls.getClassLoader());
                            } catch (NoSuchMethodException e) {
/* 121 */                       e = e;
/* 122 */                       cls2 = null;
                            }
                            try {
/* 43 */                        if (type instanceof ParameterizedType) {
/* 48 */                            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                    try {
/* 56 */                                declaredConstructor = cls2.getDeclaredConstructor(OI011oo1.class, Type[].class);
/* 60 */                                objArr = new Object[]{oI011oo1, actualTypeArguments};
                                    } catch (NoSuchMethodException unused) {
/* 76 */                                declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
/* 80 */                                objArr = new Object[]{actualTypeArguments};
                                    }
                                } else {
                                    try {
/* 91 */                                declaredConstructor = cls2.getDeclaredConstructor(OI011oo1.class);
/* 95 */                                objArr = new Object[]{oI011oo1};
                                    } catch (NoSuchMethodException unused2) {
/* 100 */                               declaredConstructor = cls2.getDeclaredConstructor(null);
/* 105 */                               objArr = new Object[0];
                                    }
                                }
/* 107 */                       declaredConstructor.setAccessible(true);
/* 116 */                       return ((O011ioiO1OI) declaredConstructor.newInstance(objArr)).nullSafe();
                            } catch (NoSuchMethodException e2) {
/* 85 */                        e = e2;
/* 144 */                       if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
/* 193 */                           OoOil11Ol1o.I000lI("Failed to find the generated JsonAdapter constructor for ", type, e);
/* 11 */                            return null;
                                }
/* 160 */                       StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
/* 163 */                       sb.append(type);
/* 166 */                       String canonicalName = cls2.getCanonicalName();
/* 172 */                       sb.append("'. Suspiciously, the type was not parameterized but the target class '");
/* 175 */                       sb.append(canonicalName);
/* 180 */                       sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
/* 190 */                       throw new RuntimeException(sb.toString(), e);
                            }
                        } catch (ClassNotFoundException e3) {
/* 199 */                   OoOil11Ol1o.I000lI("Failed to find the generated JsonAdapter class for ", type, e3);
                        } catch (IllegalAccessException e4) {
/* 138 */                   OoOil11Ol1o.I000lI("Failed to access the generated JsonAdapter for ", type, e4);
/* 11 */                    return null;
                        } catch (InstantiationException e5) {
/* 132 */                   OoOil11Ol1o.I000lI("Failed to instantiate the generated JsonAdapter for ", type, e5);
/* 11 */                    return null;
                        } catch (InvocationTargetException e6) {
/* 129 */                   throw rethrowCause(e6);
                        }
                    }
/* 11 */            return null;
                }

                public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
/* 1 */             if (cls2 == cls) {
/* 3 */                 return type;
                    }
/* 8 */             if (cls2.isInterface()) {
/* 10 */                Class<?>[] interfaces = cls.getInterfaces();
/* 14 */                int length = interfaces.length;
/* 16 */                for (int i = 0; i < length; i++) {
/* 18 */                    Class<?> cls3 = interfaces[i];
/* 20 */                    if (cls3 == cls2) {
/* 26 */                        return cls.getGenericInterfaces()[i];
                            }
/* 33 */                    if (cls2.isAssignableFrom(cls3)) {
/* 43 */                        return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                            }
                        }
                    }
/* 55 */            if (!cls.isInterface()) {
/* 59 */                while (cls != Object.class) {
/* 61 */                    Class<? super Object> superclass = cls.getSuperclass();
/* 65 */                    if (superclass == cls2) {
/* 67 */                        return cls.getGenericSuperclass();
                            }
/* 76 */                    if (cls2.isAssignableFrom(superclass)) {
/* 82 */                        return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                            }
/* 87 */                    cls = superclass;
                        }
                    }
/* 215 */           return cls2;
                }

                private static String getKotlinMetadataClassName() {
/* 1 */             return "kotlin.Metadata";
                }

                public static boolean hasNullable(Annotation[] annotationArr) {
/* 4 */             for (Annotation annotation : annotationArr) {
/* 22 */                if (annotation.annotationType().getSimpleName().equals("Nullable")) {
/* 24 */                    return true;
                        }
                    }
/* 2 */             return false;
                }

                public static int hashCodeOrZero(Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj.hashCode();
                    }
/* 8 */             return 0;
                }

                public static int indexOf(Object[] objArr, Object obj) {
/* 4 */             for (int i = 0; i < objArr.length; i++) {
/* 12 */                if (obj.equals(objArr[i])) {
/* 14 */                    return i;
                        }
                    }
/* 18 */            IoOOl0iOl1io.I00000oOI();
/* 1 */             return 0;
                }

                public static boolean isAnnotationPresent(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
/* 6 */             if (set.isEmpty()) {
/* 5 */                 return false;
                    }
/* 9 */             Iterator<? extends Annotation> it = set.iterator();
/* 17 */            while (it.hasNext()) {
/* 29 */                if (it.next().annotationType() == cls) {
/* 31 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                public static boolean isKotlin(Class<?> cls) {
/* 1 */             Class<? extends Annotation> cls2 = METADATA;
                    return cls2 != null && cls.isAnnotationPresent(cls2);
                }

                public static boolean isPlatformType(Class<?> cls) {
/* 1 */             String name = cls.getName();
                    return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
                }

                public static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
/* 2 */             LinkedHashSet linkedHashSet = null;
/* 4 */             for (Annotation annotation : annotationArr) {
/* 18 */                if (annotation.annotationType().isAnnotationPresent(O01llo0IIo0.class)) {
/* 20 */                    if (linkedHashSet == null) {
/* 24 */                        linkedHashSet = new LinkedHashSet();
                            }
/* 27 */                    linkedHashSet.add(annotation);
                        }
                    }
                    return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : NO_ANNOTATIONS;
                }

                public static String jsonName(String str, O011iIO1 o011iIO1) {
/* 1 */             if (o011iIO1 != null) {
/* 4 */                 String strName = o011iIO1.name();
/* 14 */                if (!"\u0000".equals(strName)) {
/* 89 */                    return strName;
                        }
                    }
/* 16 */            return str;
                }

                public static <T> Constructor<T> lookupDefaultsConstructor(Class<T> cls) throws SecurityException {
/* 3 */             if (DEFAULT_CONSTRUCTOR_MARKER == null) {
/* 16 */                I000II.I001IO000("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
/* 19 */                return null;
                    }
/* 5 */             Constructor<T> constructorFindConstructor = findConstructor(cls);
/* 10 */            constructorFindConstructor.setAccessible(true);
/* 13 */            return constructorFindConstructor;
                }

                public static O01IiOo11l1o missingProperty(String str, String str2, O01lo1il o01lo1il) {
                    String string;
/* 1 */             String path = o01lo1il.getPath();
/* 11 */            if (str2.equals(str)) {
/* 15 */                string = IIl001iO0Io.I000oI1ioi("Required value '", str, "' missing at ", path);
                    } else {
/* 24 */                StringBuilder sbI00111O = IIl001iO0Io.I00111O("Required value '", str, "' (JSON name '", str2, "') missing at ");
/* 28 */                sbI00111O.append(path);
/* 31 */                string = sbI00111O.toString();
                    }
/* 37 */            return new O01IiOo11l1o(string);
                }

                public static Type removeSubtypeWildcard(Type type) {
/* 3 */             if (!(type instanceof WildcardType)) {
/* 5 */                 return type;
                    }
/* 7 */             WildcardType wildcardType = (WildcardType) type;
/* 14 */            if (wildcardType.getLowerBounds().length != 0) {
/* 16 */                return type;
                    }
/* 17 */            Type[] upperBounds = wildcardType.getUpperBounds();
/* 23 */            if (upperBounds.length == 1) {
/* 26 */                return upperBounds[0];
                    }
/* 29 */            OIiilo1Ool0o.I00100o1O0lo();
/* 32 */            return null;
                }

                private static Type resolve(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
/* 3 */             while (type2 instanceof TypeVariable) {
/* 6 */                 TypeVariable<?> typeVariable = (TypeVariable) type2;
/* 12 */                if (collection.contains(typeVariable)) {
/* 14 */                    return type2;
                        }
/* 15 */                collection.add(typeVariable);
/* 18 */                type2 = resolveTypeVariable(type, cls, typeVariable);
/* 22 */                if (type2 == typeVariable) {
/* 24 */                    return type2;
                        }
                    }
/* 27 */            if (type2 instanceof Class) {
/* 30 */                Class cls2 = (Class) type2;
/* 36 */                if (cls2.isArray()) {
/* 38 */                    Class<?> componentType = cls2.getComponentType();
/* 42 */                    Type typeResolve = resolve(type, cls, componentType, collection);
                            return componentType == typeResolve ? cls2 : OoOllol1Io1.arrayOf(typeResolve);
                        }
                    }
/* 56 */            if (type2 instanceof GenericArrayType) {
/* 58 */                GenericArrayType genericArrayType = (GenericArrayType) type2;
/* 60 */                Type genericComponentType = genericArrayType.getGenericComponentType();
/* 64 */                Type typeResolve2 = resolve(type, cls, genericComponentType, collection);
                        return genericComponentType == typeResolve2 ? genericArrayType : OoOllol1Io1.arrayOf(typeResolve2);
                    }
/* 80 */            if (type2 instanceof ParameterizedType) {
/* 82 */                ParameterizedType parameterizedType = (ParameterizedType) type2;
/* 84 */                Type ownerType = parameterizedType.getOwnerType();
/* 88 */                Type typeResolve3 = resolve(type, cls, ownerType, collection);
/* 96 */                boolean z = typeResolve3 != ownerType;
/* 97 */                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
/* 101 */               int length = actualTypeArguments.length;
/* 102 */               for (int i = 0; i < length; i++) {
/* 106 */                   Type typeResolve4 = resolve(type, cls, actualTypeArguments[i], collection);
/* 112 */                   if (typeResolve4 != actualTypeArguments[i]) {
/* 114 */                       if (!z) {
/* 121 */                           actualTypeArguments = (Type[]) actualTypeArguments.clone();
/* 123 */                           z = true;
                                }
/* 124 */                       actualTypeArguments[i] = typeResolve4;
                            }
                        }
                        return z ? new I00000oOI(typeResolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                    }
/* 142 */           boolean z2 = type2 instanceof WildcardType;
                    Type type3 = type2;
/* 144 */           if (z2) {
/* 146 */               WildcardType wildcardType = (WildcardType) type2;
/* 148 */               Type[] lowerBounds = wildcardType.getLowerBounds();
/* 152 */               Type[] upperBounds = wildcardType.getUpperBounds();
/* 157 */               if (lowerBounds.length == 1) {
/* 161 */                   Type typeResolve5 = resolve(type, cls, lowerBounds[0], collection);
                            type3 = wildcardType;
/* 167 */                   if (typeResolve5 != lowerBounds[0]) {
/* 169 */                       return OoOllol1Io1.supertypeOf(typeResolve5);
                            }
                        } else {
                            type3 = wildcardType;
/* 175 */                   if (upperBounds.length == 1) {
/* 179 */                       Type typeResolve6 = resolve(type, cls, upperBounds[0], collection);
                                type3 = wildcardType;
/* 185 */                       if (typeResolve6 != upperBounds[0]) {
/* 187 */                           return OoOllol1Io1.subtypeOf(typeResolve6);
                                }
                            }
                        }
                    }
/* 483 */           return type3;
                }

                public static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
/* 1 */             Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
/* 5 */             if (clsDeclaringClassOf != null) {
/* 8 */                 Type genericSupertype = getGenericSupertype(type, cls, clsDeclaringClassOf);
/* 14 */                if (genericSupertype instanceof ParameterizedType) {
/* 30 */                    return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
                        }
                    }
/* 215 */           return typeVariable;
                }

                public static RuntimeException rethrowCause(InvocationTargetException invocationTargetException) {
/* 1 */             Throwable targetException = invocationTargetException.getTargetException();
/* 7 */             if (targetException instanceof RuntimeException) {
/* 49 */                throw ((RuntimeException) targetException);
                    }
/* 11 */            if (targetException instanceof Error) {
/* 15 */                throw ((Error) targetException);
                    }
/* 21 */            throw new RuntimeException(targetException);
                }

                public static String typeAnnotatedWithAnnotations(Type type, Set<? extends Annotation> set) {
                    String str;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(type);
/* 13 */            if (set.isEmpty()) {
/* 15 */                str = " (with no annotations)";
                    } else {
/* 28 */                str = " annotated " + set;
                    }
/* 32 */            sb.append(str);
/* 35 */            return sb.toString();
                }

                public static String typeToString(Type type) {
                    return type instanceof Class ? ((Class) type).getName() : type.toString();
                }

                public static boolean typesMatch(Type type, Type type2) {
/* 1 */             return OoOllol1Io1.equals(type, type2);
                }

                public static O01IiOo11l1o unexpectedNull(String str, String str2, O01lo1il o01lo1il) {
                    String string;
/* 1 */             String path = o01lo1il.getPath();
/* 11 */            if (str2.equals(str)) {
/* 15 */                string = IIl001iO0Io.I000oI1ioi("Non-null value '", str, "' was null at ", path);
                    } else {
/* 24 */                StringBuilder sbI00111O = IIl001iO0Io.I00111O("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
/* 28 */                sbI00111O.append(path);
/* 31 */                string = sbI00111O.toString();
                    }
/* 37 */            return new O01IiOo11l1o(string);
                }

/* 17 */        public static String jsonName(String str, AnnotatedElement annotatedElement) {
/* 18 */            return jsonName(str, (O011iIO1) annotatedElement.getAnnotation(O011iIO1.class));
                }

/* 42 */        public static Set<? extends Annotation> jsonAnnotations(AnnotatedElement annotatedElement) {
/* 43 */            return jsonAnnotations(annotatedElement.getAnnotations());
                }

/* 192 */       public static Type resolve(Type type, Class<?> cls, Type type2) {
/* 193 */           return resolve(type, cls, type2, new LinkedHashSet());
                }
            }

            package p000;

            import java.lang.reflect.Array;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.lang.reflect.WildcardType;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Objects;
            
            public abstract class iIllolOO {
                public static final Type[] I00000oIO = new Type[0];

                public static Type I00000oIO(Type type) {
/* 4 */             if (type instanceof Class) {
/* 6 */                 Class cls = (Class) type;
                        return cls.isArray() ? new Io11IIoOI(I00000oIO(cls.getComponentType()), 0) : cls;
                    }
/* 31 */            if (type instanceof ParameterizedType) {
/* 33 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 51 */                return new Io11IlI10ill(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments(), 0);
                    }
/* 57 */            if (type instanceof GenericArrayType) {
/* 67 */                return new Io11IIoOI(((GenericArrayType) type).getGenericComponentType(), 0);
                    }
/* 73 */            if (!(type instanceof WildcardType)) {
/* 186 */               return type;
                    }
/* 75 */            WildcardType wildcardType = (WildcardType) type;
/* 87 */            return new Io11Io1iOOO0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
                }

                public static void I00000oOI(Type type) {
/* 3 */             if ((type instanceof Class) && ((Class) type).isPrimitive()) {
/* 16 */                I000II.I000iOII("Primitive type is not allowed");
                    }
                }

                public static boolean I0000Il00O(Type type, Type type2) {
/* 2 */             if (type == type2) {
/* 1 */                 return true;
                    }
/* 7 */             if (type instanceof Class) {
/* 9 */                 return type.equals(type2);
                    }
/* 17 */            if (type instanceof ParameterizedType) {
/* 21 */                if (!(type2 instanceof ParameterizedType)) {
/* 16 */                    return false;
                        }
/* 24 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 26 */                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                        return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                    }
/* 74 */            if (type instanceof GenericArrayType) {
/* 78 */                if (type2 instanceof GenericArrayType) {
/* 93 */                    return I0000Il00O(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
                        }
/* 16 */                return false;
                    }
/* 100 */           if (type instanceof WildcardType) {
/* 104 */               if (!(type2 instanceof WildcardType)) {
/* 16 */                    return false;
                        }
/* 107 */               WildcardType wildcardType = (WildcardType) type;
/* 109 */               WildcardType wildcardType2 = (WildcardType) type2;
                        return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                    }
/* 143 */           if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
/* 16 */                return false;
                    }
/* 150 */           TypeVariable typeVariable = (TypeVariable) type;
/* 152 */           TypeVariable typeVariable2 = (TypeVariable) type2;
                    return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
                }

                public static Type I0000O(Type type, Class cls, Class cls2) {
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
/* 43 */                        return I0000O(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                            }
                        }
                    }
/* 55 */            if (!cls.isInterface()) {
/* 59 */                while (cls != Object.class) {
/* 61 */                    Class<?> superclass = cls.getSuperclass();
/* 65 */                    if (superclass == cls2) {
/* 67 */                        return cls.getGenericSuperclass();
                            }
/* 76 */                    if (cls2.isAssignableFrom(superclass)) {
/* 82 */                        return I0000O(cls.getGenericSuperclass(), superclass, cls2);
                            }
/* 87 */                    cls = superclass;
                        }
                    }
/* 215 */           return cls2;
                }

                public static Class I0000oI00(Type type) {
/* 3 */             if (type instanceof Class) {
/* 5 */                 return (Class) type;
                    }
/* 10 */            if (type instanceof ParameterizedType) {
/* 18 */                return (Class) ((ParameterizedType) type).getRawType();
                    }
/* 24 */            if (type instanceof GenericArrayType) {
/* 40 */                return Array.newInstance((Class<?>) I0000oI00(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                    }
/* 47 */            if (type instanceof TypeVariable) {
/* 49 */                return Object.class;
                    }
/* 54 */            if (type instanceof WildcardType) {
/* 64 */                return I0000oI00(((WildcardType) type).getUpperBounds()[0]);
                    }
/* 86 */            OoOil11Ol1o.I0010o("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
/* 89 */            return null;
                }

                public static Type I0001Ioi1lo(Type type, Class cls, Class cls2) {
/* 3 */             if (type instanceof WildcardType) {
/* 12 */                type = ((WildcardType) type).getUpperBounds()[0];
                    }
/* 18 */            if (cls2.isAssignableFrom(cls)) {
/* 29 */                return I000II(type, cls, I0000O(type, cls, cls2), new HashMap());
                    }
/* 215 */           throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[EDGE_INSN: B:86:0x013e->B:80:0x013e BREAK  A[LOOP:0: B:3:0x0002->B:89:?], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:3:0x0002->B:89:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r13v14 */
                /* JADX WARN: Type inference failed for: r13v15 */
                /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.reflect.Type[]] */
                /* JADX WARN: Type inference failed for: r13v18 */
                /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.reflect.WildcardType] */
                /* JADX WARN: Type inference failed for: r13v3, types: [Io11Io1iOOO0] */
                /* JADX WARN: Type inference failed for: r13v4, types: [Io11Io1iOOO0] */
                /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.reflect.ParameterizedType] */
                /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.reflect.GenericArrayType] */
                /* JADX WARN: Type inference failed for: r13v7 */
                /* JADX WARN: Type inference failed for: r13v9 */
                /* JADX WARN: Type inference failed for: r14v0, types: [java.util.HashMap] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Type I000II(Type type, Class cls, Type type2, HashMap map) {
                    Type typeI000II;
                    Type io11IlI10ill;
/* 2 */             TypeVariable typeVariable = null;
                    while (true) {
/* 6 */                 if (type2 instanceof TypeVariable) {
/* 9 */                     TypeVariable typeVariable2 = type2;
/* 15 */                    Type type3 = (Type) map.get(typeVariable2);
/* 17 */                    Class cls2 = Void.TYPE;
/* 19 */                    if (type3 != null) {
                                return type3 == cls2 ? type2 : type3;
                            }
/* 25 */                    map.put(typeVariable2, cls2);
/* 28 */                    if (typeVariable == null) {
/* 30 */                        typeVariable = typeVariable2;
                            }
/* 31 */                    GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
/* 42 */                    Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
/* 43 */                    if (cls3 == null) {
/* 85 */                        type2 = typeVariable2;
/* 86 */                        if (type2 != typeVariable2) {
                                    break;
                                }
                            } else {
/* 46 */                        Type typeI0000O = I0000O(type, cls, cls3);
/* 52 */                        if (typeI0000O instanceof ParameterizedType) {
/* 54 */                            TypeVariable[] typeParameters = cls3.getTypeParameters();
/* 58 */                            int length = typeParameters.length;
/* 59 */                            for (int i = 0; i < length; i++) {
/* 67 */                                if (typeVariable2.equals(typeParameters[i])) {
/* 75 */                                    type2 = ((ParameterizedType) typeI0000O).getActualTypeArguments()[i];
                                        }
                                    }
/* 81 */                            IoOOl0iOl1io.I00000oOI();
/* 1 */                             return null;
                                }
/* 86 */                        if (type2 != typeVariable2) {
                                }
                            }
                        } else if (type2 instanceof Class) {
/* 95 */                    Class cls4 = type2;
/* 101 */                   if (cls4.isArray()) {
/* 103 */                       Class<?> componentType = cls4.getComponentType();
/* 107 */                       Type typeI000II2 = I000II(type, cls, componentType, map);
/* 115 */                       if (Objects.equals(componentType, typeI000II2)) {
/* 117 */                           type2 = cls4;
                                } else {
/* 122 */                           io11IlI10ill = new Io11IIoOI(typeI000II2, 0);
/* 125 */                           type2 = io11IlI10ill;
                                }
                            } else if (type2 instanceof GenericArrayType) {
/* 132 */                       type2 = (GenericArrayType) type2;
/* 134 */                       Type genericComponentType = type2.getGenericComponentType();
/* 138 */                       Type typeI000II3 = I000II(type, cls, genericComponentType, map);
/* 146 */                       if (!Objects.equals(genericComponentType, typeI000II3)) {
/* 152 */                           io11IlI10ill = new Io11IIoOI(typeI000II3, 0);
/* 125 */                           type2 = io11IlI10ill;
                                }
                            } else if (type2 instanceof ParameterizedType) {
/* 161 */                       type2 = (ParameterizedType) type2;
/* 163 */                       Type ownerType = type2.getOwnerType();
/* 167 */                       Type typeI000II4 = I000II(type, cls, ownerType, map);
/* 171 */                       boolean zEquals = Objects.equals(typeI000II4, ownerType);
/* 175 */                       Type[] actualTypeArguments = type2.getActualTypeArguments();
/* 179 */                       int length2 = actualTypeArguments.length;
/* 181 */                       boolean z = false;
/* 182 */                       for (int i2 = 0; i2 < length2; i2++) {
/* 186 */                           Type typeI000II5 = I000II(type, cls, actualTypeArguments[i2], map);
/* 196 */                           if (!Objects.equals(typeI000II5, actualTypeArguments[i2])) {
/* 198 */                               if (!z) {
/* 204 */                                   actualTypeArguments = (Type[]) actualTypeArguments.clone();
/* 206 */                                   z = true;
                                        }
/* 207 */                               actualTypeArguments[i2] = typeI000II5;
                                    }
                                }
/* 212 */                       if (!zEquals || z) {
/* 224 */                           io11IlI10ill = new Io11IlI10ill(typeI000II4, (Class) type2.getRawType(), actualTypeArguments, 0);
/* 125 */                           type2 = io11IlI10ill;
                                }
                            } else if (type2 instanceof WildcardType) {
/* 232 */                       type2 = (WildcardType) type2;
/* 234 */                       Type[] lowerBounds = type2.getLowerBounds();
/* 238 */                       Type[] upperBounds = type2.getUpperBounds();
/* 243 */                       if (lowerBounds.length == 1) {
/* 247 */                           Type typeI000II6 = I000II(type, cls, lowerBounds[0], map);
/* 253 */                           if (typeI000II6 != lowerBounds[0]) {
/* 279 */                               type2 = new Io11Io1iOOO0(new Type[]{Object.class}, typeI000II6 instanceof WildcardType ? ((WildcardType) typeI000II6).getLowerBounds() : new Type[]{typeI000II6}, 0);
                                    }
                                } else if (upperBounds.length == 1 && (typeI000II = I000II(type, cls, upperBounds[0], map)) != upperBounds[0]) {
/* 316 */                           type2 = new Io11Io1iOOO0(typeI000II instanceof WildcardType ? ((WildcardType) typeI000II).getUpperBounds() : new Type[]{typeI000II}, I00000oIO, 0);
                                }
                            }
                        }
                    }
/* 319 */           if (typeVariable != null) {
/* 321 */               map.put(typeVariable, type2);
                    }
/* 483 */           return type2;
                }

                public static String I000O01llI0(Type type) {
                    return type instanceof Class ? ((Class) type).getName() : type.toString();
                }
            }

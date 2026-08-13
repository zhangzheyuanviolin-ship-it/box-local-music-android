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
            
            public abstract class iO1lo1I1iI {
                public static final Type[] I00000oIO = new Type[0];

                public static Type I00000oIO(Type type) {
/* 4 */             if (type instanceof Class) {
/* 6 */                 Class cls = (Class) type;
                        return cls.isArray() ? new Io11IIoOI(I00000oIO(cls.getComponentType()), 1) : cls;
                    }
/* 31 */            if (type instanceof ParameterizedType) {
/* 33 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 51 */                return new Io11IlI10ill(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments(), 1);
                    }
/* 57 */            if (type instanceof GenericArrayType) {
/* 67 */                return new Io11IIoOI(((GenericArrayType) type).getGenericComponentType(), 1);
                    }
/* 73 */            if (!(type instanceof WildcardType)) {
/* 186 */               return type;
                    }
/* 75 */            WildcardType wildcardType = (WildcardType) type;
/* 87 */            return new Io11Io1iOOO0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 1);
                }

                public static Class I00000oOI(Type type) {
/* 3 */             if (type instanceof Class) {
/* 5 */                 return (Class) type;
                    }
/* 10 */            if (type instanceof ParameterizedType) {
/* 18 */                return (Class) ((ParameterizedType) type).getRawType();
                    }
/* 24 */            if (type instanceof GenericArrayType) {
/* 40 */                return Array.newInstance((Class<?>) I00000oOI(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                    }
/* 47 */            if (type instanceof TypeVariable) {
/* 49 */                return Object.class;
                    }
/* 54 */            if (type instanceof WildcardType) {
/* 64 */                return I00000oOI(((WildcardType) type).getUpperBounds()[0]);
                    }
/* 78 */            String name = type == null ? "null" : type.getClass().getName();
/* 82 */            String strValueOf = String.valueOf(type);
/* 110 */           I000II.I000iOII(IIl001iO0Io.I00100o1O0lo(new StringBuilder(strValueOf.length() + 76 + name.length()), "Expected a Class, ParameterizedType, or GenericArrayType, but <", strValueOf, "> is of type ", name));
/* 113 */           return null;
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

                public static String I0000O(Type type) {
                    return type instanceof Class ? ((Class) type).getName() : type.toString();
                }

                public static void I0000oI00(Type type) {
/* 3 */             if ((type instanceof Class) && ((Class) type).isPrimitive()) {
/* 16 */                I000II.I000iOII("Primitive type is not allowed");
                    }
                }

                public static Type I0001Ioi1lo(Type type, Class cls, Class cls2) {
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
/* 43 */                        return I0001Ioi1lo(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
/* 84 */                        return I0001Ioi1lo(cls.getGenericSuperclass(), superclass, cls2);
                            }
/* 78 */                    cls = superclass;
                        }
                    }
/* 215 */           return cls2;
                }

                public static Type I000II(Type type, Class cls, Class cls2) {
/* 3 */             if (type instanceof WildcardType) {
/* 12 */                type = ((WildcardType) type).getUpperBounds()[0];
                    }
/* 18 */            if (cls2.isAssignableFrom(cls)) {
/* 29 */                return I000O01llI0(type, cls, I0001Ioi1lo(type, cls, cls2), new HashMap());
                    }
/* 34 */            String strValueOf = String.valueOf(cls);
/* 38 */            String string = cls2.toString();
/* 64 */            I000II.I000iOII(IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 36 + string.length()), strValueOf, " is not the same as or a subtype of ", string));
/* 67 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x013d A[EDGE_INSN: B:84:0x013d->B:78:0x013d BREAK  A[LOOP:0: B:3:0x0002->B:87:?], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:87:? A[LOOP:0: B:3:0x0002->B:87:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r12v10, types: [Io11IIoOI] */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r12v16 */
                /* JADX WARN: Type inference failed for: r12v17 */
                /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.reflect.Type[]] */
                /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
                /* JADX WARN: Type inference failed for: r12v20 */
                /* JADX WARN: Type inference failed for: r12v3, types: [Io11Io1iOOO0] */
                /* JADX WARN: Type inference failed for: r12v4, types: [Io11Io1iOOO0] */
                /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
                /* JADX WARN: Type inference failed for: r12v6, types: [Io11IlI10ill] */
                /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.reflect.GenericArrayType] */
                /* JADX WARN: Type inference failed for: r12v8, types: [Io11IIoOI] */
                /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Type I000O01llI0(Type type, Class cls, Type type2, HashMap map) {
                    Type typeI000O01llI0;
/* 2 */             TypeVariable typeVariable = null;
                    while (true) {
/* 5 */                 int i = 0;
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
/* 46 */                        Type typeI0001Ioi1lo = I0001Ioi1lo(type, cls, cls3);
/* 52 */                        if (typeI0001Ioi1lo instanceof ParameterizedType) {
/* 54 */                            TypeVariable[] typeParameters = cls3.getTypeParameters();
/* 58 */                            int length = typeParameters.length;
/* 59 */                            while (i < length) {
/* 67 */                                if (typeVariable2.equals(typeParameters[i])) {
/* 75 */                                    type2 = ((ParameterizedType) typeI0001Ioi1lo).getActualTypeArguments()[i];
                                        } else {
/* 78 */                                    i++;
                                        }
                                    }
/* 81 */                            IoOOl0iOl1io.I00000oOI();
/* 1 */                             return null;
                                }
/* 86 */                        if (type2 != typeVariable2) {
                                }
                            }
                        } else if (type2 instanceof Class) {
/* 96 */                    Class cls4 = type2;
/* 102 */                   if (cls4.isArray()) {
/* 104 */                       Class<?> componentType = cls4.getComponentType();
/* 108 */                       Type typeI000O01llI02 = I000O01llI0(type, cls, componentType, map);
/* 123 */                       type2 = Objects.equals(componentType, typeI000O01llI02) ? cls4 : new Io11IIoOI(typeI000O01llI02, 1);
                            } else if (type2 instanceof GenericArrayType) {
/* 132 */                       type2 = (GenericArrayType) type2;
/* 134 */                       Type genericComponentType = type2.getGenericComponentType();
/* 138 */                       Type typeI000O01llI03 = I000O01llI0(type, cls, genericComponentType, map);
/* 146 */                       if (!Objects.equals(genericComponentType, typeI000O01llI03)) {
/* 150 */                           type2 = new Io11IIoOI(typeI000O01llI03, 1);
                                }
                            } else if (type2 instanceof ParameterizedType) {
/* 159 */                       type2 = (ParameterizedType) type2;
/* 161 */                       Type ownerType = type2.getOwnerType();
/* 165 */                       Type typeI000O01llI04 = I000O01llI0(type, cls, ownerType, map);
/* 169 */                       boolean zEquals = Objects.equals(typeI000O01llI04, ownerType);
/* 173 */                       Type[] actualTypeArguments = type2.getActualTypeArguments();
/* 177 */                       int length2 = actualTypeArguments.length;
/* 178 */                       Type[] typeArr = actualTypeArguments;
/* 179 */                       boolean z = false;
/* 180 */                       while (i < length2) {
/* 184 */                           Type typeI000O01llI05 = I000O01llI0(type, cls, typeArr[i], map);
/* 194 */                           if (!Objects.equals(typeI000O01llI05, typeArr[i])) {
/* 196 */                               if (!z) {
/* 203 */                                   typeArr = (Type[]) typeArr.clone();
                                        }
/* 205 */                               typeArr[i] = typeI000O01llI05;
/* 207 */                               z = true;
                                    }
/* 208 */                           i++;
                                }
/* 211 */                       if (!zEquals || z) {
/* 223 */                           type2 = new Io11IlI10ill(typeI000O01llI04, (Class) type2.getRawType(), typeArr, 1);
                                }
                            } else if (type2 instanceof WildcardType) {
/* 231 */                       type2 = (WildcardType) type2;
/* 233 */                       Type[] lowerBounds = type2.getLowerBounds();
/* 237 */                       Type[] upperBounds = type2.getUpperBounds();
/* 242 */                       if (lowerBounds.length == 1) {
/* 246 */                           Type typeI000O01llI06 = I000O01llI0(type, cls, lowerBounds[0], map);
/* 252 */                           if (typeI000O01llI06 != lowerBounds[0]) {
/* 278 */                               type2 = new Io11Io1iOOO0(new Type[]{Object.class}, typeI000O01llI06 instanceof WildcardType ? ((WildcardType) typeI000O01llI06).getLowerBounds() : new Type[]{typeI000O01llI06}, 1);
                                    }
                                } else if (upperBounds.length == 1 && (typeI000O01llI0 = I000O01llI0(type, cls, upperBounds[0], map)) != upperBounds[0]) {
/* 315 */                           type2 = new Io11Io1iOOO0(typeI000O01llI0 instanceof WildcardType ? ((WildcardType) typeI000O01llI0).getUpperBounds() : new Type[]{typeI000O01llI0}, I00000oIO, 1);
                                }
                            }
                        }
                    }
/* 318 */           if (typeVariable != null) {
/* 320 */               map.put(typeVariable, type2);
                    }
/* 483 */           return type2;
                }
            }

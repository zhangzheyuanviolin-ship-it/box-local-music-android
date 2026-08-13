            package p000;

            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.lang.reflect.WildcardType;
            import java.util.Objects;
            
/* 94 */    public class OoOilO<T> {
                public final Class I00000oIO;
                public final Type I00000oOI;
                public final int I0000Il00O;

                public OoOilO() {
/* 8 */             Type genericSuperclass = getClass().getGenericSuperclass();
/* 17 */            if (genericSuperclass instanceof ParameterizedType) {
/* 19 */                ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
/* 25 */                if (parameterizedType.getRawType() == OoOilO.class) {
/* 34 */                    Type typeI00000oIO = iIllolOO.I00000oIO(parameterizedType.getActualTypeArguments()[0]);
/* 50 */                    if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
/* 52 */                        I00000oIO(typeI00000oIO);
                            }
/* 55 */                    this.I00000oOI = typeI00000oIO;
/* 61 */                    this.I00000oIO = iIllolOO.I0000oI00(typeI00000oIO);
/* 67 */                    this.I0000Il00O = typeI00000oIO.hashCode();
/* 69 */                    return;
                        }
                    } else if (genericSuperclass == OoOilO.class) {
/* 86 */                I000II.I001IO000("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
/* 89 */                throw null;
                    }
/* 92 */            I000II.I001IO000("Must only create direct subclasses of TypeToken");
/* 113 */           throw null;
                }

                public static void I00000oIO(Type type) {
/* 3 */             if (type instanceof TypeVariable) {
/* 97 */                TypeVariable typeVariable = (TypeVariable) type;
/* 105 */               StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
/* 112 */               sb.append(typeVariable.getName());
/* 117 */               sb.append(" declared by ");
/* 124 */               sb.append(typeVariable.getGenericDeclaration());
/* 131 */               String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable");
/* 137 */               sb.append("\nSee ");
/* 140 */               sb.append(strConcat);
/* 186 */               throw new IllegalArgumentException(sb.toString());
                    }
/* 7 */             if (type instanceof GenericArrayType) {
/* 15 */                I00000oIO(((GenericArrayType) type).getGenericComponentType());
/* 18 */                return;
                    }
/* 21 */            int i = 0;
/* 22 */            if (type instanceof ParameterizedType) {
/* 24 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 26 */                Type ownerType = parameterizedType.getOwnerType();
/* 30 */                if (ownerType != null) {
/* 32 */                    I00000oIO(ownerType);
                        }
/* 35 */                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
/* 39 */                int length = actualTypeArguments.length;
/* 40 */                while (i < length) {
/* 44 */                    I00000oIO(actualTypeArguments[i]);
/* 47 */                    i++;
                        }
/* 87 */                return;
                    }
/* 52 */            if (!(type instanceof WildcardType)) {
/* 88 */                if (type != null) {
/* 90 */                    return;
                        }
/* 93 */                I000II.I000iOII("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
/* 96 */                return;
                    }
/* 54 */            WildcardType wildcardType = (WildcardType) type;
/* 62 */            for (Type type2 : wildcardType.getLowerBounds()) {
/* 66 */                I00000oIO(type2);
                    }
/* 72 */            Type[] upperBounds = wildcardType.getUpperBounds();
/* 76 */            int length2 = upperBounds.length;
/* 77 */            while (i < length2) {
/* 81 */                I00000oIO(upperBounds[i]);
/* 84 */                i++;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OoOilO) {
                        return iIllolOO.I0000Il00O(this.I00000oOI, ((OoOilO) obj).I00000oOI);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 1 */             return this.I0000Il00O;
                }

                public final String toString() {
/* 3 */             return iIllolOO.I000O01llI0(this.I00000oOI);
                }

/* 95 */        public OoOilO(Type type) {
/* 97 */            Objects.requireNonNull(type);
                    Type typeI00000oIO = iIllolOO.I00000oIO(type);
                    this.I00000oOI = typeI00000oIO;
/* 98 */            this.I00000oIO = iIllolOO.I0000oI00(typeI00000oIO);
/* 99 */            this.I0000Il00O = typeI00000oIO.hashCode();
                }
            }

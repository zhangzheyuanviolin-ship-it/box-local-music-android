            package p000;

            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.EnumMap;
            import java.util.EnumSet;
            
            public final class IOo11IliOOl1 implements OIOi0l1il {
                public final int I00iOIl;
                public Type I00iiI;

                @Override
                public final Object I00000oOI() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Type type = this.I00iiI;
                    switch (i) {
                        case 0:
/* 76 */                    if (!(type instanceof ParameterizedType)) {
/* 133 */                       throw new O01Oo001("Invalid EnumSet type: " + type);
                            }
/* 85 */                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
/* 89 */                    if (type2 instanceof Class) {
/* 93 */                        return EnumSet.noneOf((Class) type2);
                            }
/* 115 */                   throw new O01Oo001("Invalid EnumSet type: " + type);
                        default:
/* 13 */                    if (!(type instanceof ParameterizedType)) {
/* 71 */                        throw new O01Oo001("Invalid EnumMap type: " + type);
                            }
/* 22 */                    Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
/* 26 */                    if (type3 instanceof Class) {
/* 32 */                        return new EnumMap((Class) type3);
                            }
/* 53 */                    throw new O01Oo001("Invalid EnumMap type: " + type);
                    }
                }
            }

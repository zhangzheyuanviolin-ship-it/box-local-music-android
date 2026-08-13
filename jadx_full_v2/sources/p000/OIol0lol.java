            package p000;

            import java.io.IOException;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            public final class OIol0lol implements ParameterizedType, Type {
                public final Class I00iOIl;
                public final Type I00iiI;
                public final Type[] I00iiO;

                public OIol0lol(Class cls, Type type, ArrayList arrayList) {
/* 4 */             this.I00iOIl = cls;
/* 6 */             this.I00iiI = type;
/* 17 */            this.I00iiO = (Type[]) arrayList.toArray(new Type[0]);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ParameterizedType)) {
/* 45 */                return false;
                    }
/* 5 */             ParameterizedType parameterizedType = (ParameterizedType) obj;
                    return this.I00iOIl.equals(parameterizedType.getRawType()) && O0000Ioio00.I0000O(this.I00iiI, parameterizedType.getOwnerType()) && Arrays.equals(this.I00iiO, parameterizedType.getActualTypeArguments());
                }

                @Override
                public final Type[] getActualTypeArguments() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Type getOwnerType() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Type getRawType() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final String getTypeName() throws IOException {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Class cls = this.I00iOIl;
/* 8 */             Type type = this.I00iiI;
/* 10 */            if (type != null) {
/* 16 */                sb.append(OoOo1IIiiO.I0000oI00(type));
/* 21 */                sb.append("$");
/* 28 */                sb.append(cls.getSimpleName());
                    } else {
/* 36 */                sb.append(OoOo1IIiiO.I0000oI00(cls));
                    }
/* 39 */            Type[] typeArr = this.I00iiO;
/* 42 */            if (typeArr.length != 0) {
/* 55 */                I1IoiO1l.I001lIiIIo1O(typeArr, sb, ", ", "<", ">", "...", OIol0i.I00ioIO);
                    }
/* 58 */            return sb.toString();
                }

                public final int hashCode() {
/* 3 */             int iHashCode = this.I00iOIl.hashCode();
/* 7 */             Type type = this.I00iiI;
/* 24 */            return Arrays.hashCode(this.I00iiO) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
                }

                public final String toString() {
/* 1 */             return getTypeName();
                }
            }

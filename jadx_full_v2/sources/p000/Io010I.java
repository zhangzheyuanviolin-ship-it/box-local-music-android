            package p000;

            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.Type;
            
            public final class Io010I implements GenericArrayType, Type {
                public Type I00iOIl;

                public final boolean equals(Object obj) {
                    return (obj instanceof GenericArrayType) && this.I00iOIl.equals(((GenericArrayType) obj).getGenericComponentType());
                }

                @Override
                public final Type getGenericComponentType() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final String getTypeName() {
/* 20 */            return OoOo1IIiiO.I0000oI00(this.I00iOIl) + "[]";
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 1 */             return getTypeName();
                }
            }

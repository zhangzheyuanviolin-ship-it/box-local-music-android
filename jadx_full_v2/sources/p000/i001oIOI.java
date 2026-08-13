            package p000;

            import java.lang.reflect.Type;
            import java.lang.reflect.WildcardType;
            import java.util.Arrays;
            
            public final class i001oIOI implements WildcardType, Type {
                public static final i001oIOI I00iiO = new i001oIOI(null, null);
                public final Type I00iOIl;
                public final Type I00iiI;

                public i001oIOI(Type type, Type type2) {
/* 4 */             this.I00iOIl = type;
/* 6 */             this.I00iiI = type2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof WildcardType)) {
/* 37 */                return false;
                    }
/* 9 */             WildcardType wildcardType = (WildcardType) obj;
                    return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
                }

                @Override
                public final Type[] getLowerBounds() {
/* 2 */             Type type = this.I00iiI;
                    return type == null ? new Type[0] : new Type[]{type};
                }

                @Override
                public final String getTypeName() {
/* 1 */             Type type = this.I00iiI;
/* 3 */             if (type != null) {
/* 19 */                return "? super " + OoOo1IIiiO.I0000oI00(type);
                    }
/* 24 */            Type type2 = this.I00iOIl;
/* 26 */            if (type2 == null || O0000Ioio00.I0000O(type2, Object.class)) {
/* 55 */                return "?";
                    }
/* 50 */            return "? extends " + OoOo1IIiiO.I0000oI00(type2);
                }

                @Override
                public final Type[] getUpperBounds() {
/* 1 */             Type type = this.I00iOIl;
/* 3 */             if (type == null) {
/* 5 */                 type = Object.class;
                    }
/* 8 */             return new Type[]{type};
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
                }

                public final String toString() {
/* 1 */             return getTypeName();
                }
            }

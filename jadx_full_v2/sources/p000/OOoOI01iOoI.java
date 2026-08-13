            package p000;

            import java.lang.reflect.Type;
            import java.lang.reflect.WildcardType;
            import java.util.Collection;
            
            public final class OOoOI01iOoI extends OOoIlii {
                public WildcardType I00000oIO;

                @Override
                public final Type I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                public final OOoIlii I0000Il00O() {
/* 1 */             WildcardType wildcardType = this.I00000oIO;
/* 3 */             Type[] upperBounds = wildcardType.getUpperBounds();
/* 7 */             Type[] lowerBounds = wildcardType.getLowerBounds();
/* 14 */            if (upperBounds.length > 1 || lowerBounds.length > 1) {
/* 58 */                OoOil11Ol1o.I000iOII("Wildcard types with many bounds are not yet supported: ", wildcardType);
/* 12 */                return null;
                    }
/* 20 */            if (lowerBounds.length == 1) {
/* 28 */                return lIli0ooiOill.I00000oIO((Type) I1IoiO1l.I00II0oii1o(lowerBounds));
                    }
/* 34 */            if (upperBounds.length == 1) {
/* 40 */                Type type = (Type) I1IoiO1l.I00II0oii1o(upperBounds);
/* 48 */                if (!O0000Ioio00.I0000O(type, Object.class)) {
/* 50 */                    return lIli0ooiOill.I00000oIO(type);
                        }
                    }
/* 12 */            return null;
                }

                @Override
                public final Collection getAnnotations() {
/* 1 */             return Il01100l.I00iOIl;
                }
            }

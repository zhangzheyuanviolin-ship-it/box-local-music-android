            package p000;
            
            public final class l1oiOIloOo extends lI1000oO0Ol {
                public static final l1oiOIloOo I00iOIl = new l1oiOIloOo();

                @Override
                public final Object I00000oIO() {
/* 29 */            throw new IllegalStateException("Optional.get() cannot be called on an absent value");
                }

                @Override
                public final Object I00000oOI(Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 6 */             IOOlIIilOl0.I000II("use Optional.orNull() instead of Optional.or(null)");
/* 9 */             return null;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
/* 1 */             return 2040732332;
                }

                public final String toString() {
/* 1 */             return "Optional.absent()";
                }
            }

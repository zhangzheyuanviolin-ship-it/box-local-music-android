            package p000;
            
            public final class lI1Oli0IIoo extends lI1000oO0Ol {
                public Object I00iOIl;

                @Override
                public final Object I00000oIO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final Object I00000oOI(Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return this.I00iOIl;
                    }
/* 8 */             IOOlIIilOl0.I000II("use Optional.orNull() instead of Optional.or(null)");
/* 11 */            return null;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return true;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof lI1Oli0IIoo) {
/* 11 */                return this.I00iOIl.equals(((lI1Oli0IIoo) obj).I00iOIl);
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00iOIl.hashCode() + 1502476572;
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("Optional.of(", this.I00iOIl.toString(), ")");
                }
            }

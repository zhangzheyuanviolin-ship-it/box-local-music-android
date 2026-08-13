            package p000;

            import java.util.Locale;
            
            public final class O11oOOio1iO {
                public final Locale I00000oIO;

                public O11oOOio1iO(Locale locale) {
/* 4 */             this.I00000oIO = locale;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == null || !(obj instanceof O11oOOio1iO)) {
/* 1 */                 return false;
                    }
/* 10 */            if (this == obj) {
/* 12 */                return true;
                    }
/* 28 */            return O0000Ioio00.I0000O(this.I00000oIO.toLanguageTag(), ((O11oOOio1iO) obj).I00000oIO.toLanguageTag());
                }

                public final int hashCode() {
/* 7 */             return this.I00000oIO.toLanguageTag().hashCode();
                }

                public final String toString() {
/* 3 */             return this.I00000oIO.toLanguageTag();
                }
            }

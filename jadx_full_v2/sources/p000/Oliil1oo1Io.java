            package p000;

            import java.io.Serializable;
            import java.util.Objects;
            
            public final class Oliil1oo1Io implements OliiillO, Serializable {
                public Object I00iOIl;

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof Oliil1oo1Io) {
/* 11 */                return this.I00iOIl.equals(((Oliil1oo1Io) obj).I00iOIl);
                    }
/* 16 */            return false;
                }

                @Override
                public final Object get() {
/* 1 */             return this.I00iOIl;
                }

                public final int hashCode() {
/* 7 */             return Objects.hash(this.I00iOIl);
                }

                public final String toString() {
/* 18 */            return "Suppliers.ofInstance(" + this.I00iOIl + ")";
                }
            }

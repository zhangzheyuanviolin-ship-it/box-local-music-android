            package p000;

            import java.util.Objects;
            
            public final class OiliIOOIli1o {
                public final Class I00000oIO;
                public final Class I00000oOI;

                public OiliIOOIli1o(Class cls, Class cls2) {
/* 4 */             this.I00000oIO = cls;
/* 6 */             this.I00000oOI = cls2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OiliIOOIli1o)) {
/* 30 */                return false;
                    }
/* 6 */             OiliIOOIli1o oiliIOOIli1o = (OiliIOOIli1o) obj;
                    return oiliIOOIli1o.I00000oIO.equals(this.I00000oIO) && oiliIOOIli1o.I00000oOI.equals(this.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.I00000oIO, this.I00000oOI);
                }

                public final String toString() {
/* 26 */            return this.I00000oIO.getSimpleName() + " with serialization type: " + this.I00000oOI.getSimpleName();
                }
            }

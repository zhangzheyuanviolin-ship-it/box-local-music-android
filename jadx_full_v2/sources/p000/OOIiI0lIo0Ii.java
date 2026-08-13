            package p000;

            import java.util.Objects;
            
            public final class OOIiI0lIo0Ii {
                public final Class I00000oIO;
                public final Class I00000oOI;

                public OOIiI0lIo0Ii(Class cls, Class cls2) {
/* 4 */             this.I00000oIO = cls;
/* 6 */             this.I00000oOI = cls2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OOIiI0lIo0Ii)) {
/* 30 */                return false;
                    }
/* 6 */             OOIiI0lIo0Ii oOIiI0lIo0Ii = (OOIiI0lIo0Ii) obj;
                    return oOIiI0lIo0Ii.I00000oIO.equals(this.I00000oIO) && oOIiI0lIo0Ii.I00000oOI.equals(this.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.I00000oIO, this.I00000oOI);
                }

                public final String toString() {
/* 26 */            return this.I00000oIO.getSimpleName() + " with primitive type: " + this.I00000oOI.getSimpleName();
                }
            }

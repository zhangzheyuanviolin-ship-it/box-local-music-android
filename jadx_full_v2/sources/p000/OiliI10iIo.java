            package p000;

            import java.util.Objects;
            
            public final class OiliI10iIo {
                public final Class I00000oIO;
                public final IIOIlli0IO I00000oOI;

                public OiliI10iIo(Class cls, IIOIlli0IO iIOIlli0IO) {
/* 4 */             this.I00000oIO = cls;
/* 6 */             this.I00000oOI = iIOIlli0IO;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OiliI10iIo)) {
/* 30 */                return false;
                    }
/* 6 */             OiliI10iIo oiliI10iIo = (OiliI10iIo) obj;
                    return oiliI10iIo.I00000oIO.equals(this.I00000oIO) && oiliI10iIo.I00000oOI.equals(this.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.I00000oIO, this.I00000oOI);
                }

                public final String toString() {
/* 22 */            return this.I00000oIO.getSimpleName() + ", object identifier: " + this.I00000oOI;
                }
            }

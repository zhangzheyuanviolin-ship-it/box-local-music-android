            package p000;
            
            public final class Ii0lloOl {
                public final OOiilOlOOI I00000oIO;
                public final boolean I00000oOI;

                public Ii0lloOl(OOiilOlOOI oOiilOlOOI, boolean z) {
/* 4 */             this.I00000oIO = oOiilOlOOI;
/* 6 */             this.I00000oOI = z;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof Ii0lloOl) {
/* 6 */                 Ii0lloOl ii0lloOl = (Ii0lloOl) obj;
/* 16 */                if (ii0lloOl.I00000oIO.equals(this.I00000oIO) && ii0lloOl.I00000oOI == this.I00000oOI) {
/* 24 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 22 */            return Boolean.valueOf(this.I00000oOI).hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }
            }

            package p000;
            
            public final class Ool0olii10Ii {
                public final String I00000oIO;
                public final String I00000oOI;

                public Ool0olii10Ii(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ool0olii10Ii)) {
/* 7 */                 return false;
                    }
/* 11 */            Ool0olii10Ii ool0olii10Ii = (Ool0olii10Ii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ool0olii10Ii.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ool0olii10Ii.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("UrlAndFileName(url=", this.I00000oIO, ", fileName=", this.I00000oOI, ")");
                }
            }

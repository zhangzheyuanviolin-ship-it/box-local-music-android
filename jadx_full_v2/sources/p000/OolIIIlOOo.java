            package p000;
            
            public final class OolIIIlOOo {
                public int I00000oIO;
                public IOi10loi I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OolIIIlOOo)) {
/* 7 */                 return false;
                    }
/* 11 */            OolIIIlOOo oolIIIlOOo = (OolIIIlOOo) obj;
                    return this.I00000oIO == oolIIIlOOo.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oolIIIlOOo.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "RequestSignal(requestNo=" + this.I00000oIO + ", signal=" + this.I00000oOI + ')';
                }
            }

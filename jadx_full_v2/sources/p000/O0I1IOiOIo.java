            package p000;
            
            public final class O0I1IOiOIo extends l0OIOOOlliO {
                public String I00000oOI;
                public String I0000Il00O;

                @Override
                public final String I00000oIO() {
/* 18 */            return this.I00000oOI + ':' + this.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0I1IOiOIo)) {
/* 32 */                return false;
                    }
/* 9 */             O0I1IOiOIo o0I1IOiOIo = (O0I1IOiOIo) obj;
                    return this.I00000oOI.equals(o0I1IOiOIo.I00000oOI) && this.I0000Il00O.equals(o0I1IOiOIo.I0000Il00O);
                }

                public final int hashCode() {
/* 15 */            return this.I0000Il00O.hashCode() + (this.I00000oOI.hashCode() * 31);
                }
            }

            package p000;
            
            public final class I1Oioi extends I1OIOiil {
                public boolean I00000oIO;
                public I1OioiIi0lol I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1Oioi)) {
/* 24 */                return false;
                    }
/* 9 */             I1Oioi i1Oioi = (I1Oioi) obj;
                    return this.I00000oIO == i1Oioi.I00000oIO && this.I00000oOI == i1Oioi.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Boolean.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "AstTableCell(header=" + this.I00000oIO + ", alignment=" + this.I00000oOI + ")";
                }
            }

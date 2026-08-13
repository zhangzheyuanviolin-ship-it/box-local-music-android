            package p000;
            
            public final class i0o0li {
                public int I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof i0o0li) {
/* 6 */                 i0o0li i0o0liVar = (i0o0li) obj;
/* 12 */                if (this.I00000oIO == i0o0liVar.I00000oIO && this.I00000oOI == i0o0liVar.I00000oOI) {
/* 20 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 7 */             return this.I00000oOI | (this.I00000oIO << 16);
                }

                public final String toString() {
/* 21 */            return this.I00000oIO + "x" + this.I00000oOI;
                }
            }

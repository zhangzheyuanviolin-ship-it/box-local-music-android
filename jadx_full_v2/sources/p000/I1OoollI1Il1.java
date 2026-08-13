            package p000;
            
            public final class I1OoollI1Il1 {
                public final String I00000oIO;
                public final OoOO010 I00000oOI;

                public I1OoollI1Il1(String str, OoOO010 ooOO010) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = ooOO010;
/* 12 */            if (OlOoOIi0o.I001l0I00(str)) {
/* 17 */                I000II.I000iOII("Name can't be blank");
/* 89 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1OoollI1Il1)) {
/* 32 */                return false;
                    }
/* 9 */             I1OoollI1Il1 i1OoollI1Il1 = (I1OoollI1Il1) obj;
                    return this.I00000oIO.equals(i1OoollI1Il1.I00000oIO) && this.I00000oOI.equals(i1OoollI1Il1.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             return "AttributeKey: ".concat(this.I00000oIO);
                }
            }

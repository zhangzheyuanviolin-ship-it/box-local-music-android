            package p000;
            
            public final class Iol0oIiIOI {
                public final int I00000oIO;
                public final Object I00000oOI;

                public Iol0oIiIOI(int i, Object obj) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = obj;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Iol0oIiIOI)) {
/* 7 */                 return false;
                    }
/* 11 */            Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) obj;
                    return this.I00000oIO == iol0oIiIOI.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, iol0oIiIOI.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.I00000oIO) * 31;
/* 9 */             Object obj = this.I00000oOI;
/* 19 */            return iHashCode + (obj == null ? 0 : obj.hashCode());
                }

                public final String toString() {
/* 28 */            return "IndexedValue(index=" + this.I00000oIO + ", value=" + this.I00000oOI + ')';
                }
            }

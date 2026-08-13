            package p000;
            
            public final class OIOiIIi0OOiO {
                public final int I00000oIO;
                public final Integer I00000oOI;

                public OIOiIIi0OOiO(int i, Integer num) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = num;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OIOiIIi0OOiO)) {
/* 7 */                 return false;
                    }
/* 11 */            OIOiIIi0OOiO oIOiIIi0OOiO = (OIOiIIi0OOiO) obj;
                    return this.I00000oIO == oIOiIIi0OOiO.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oIOiIIi0OOiO.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.I00000oIO) * 31;
/* 9 */             Integer num = this.I00000oOI;
/* 19 */            return iHashCode + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
/* 28 */            return "ObjectLocation(group=" + this.I00000oIO + ", dataOffset=" + this.I00000oOI + ")";
                }
            }

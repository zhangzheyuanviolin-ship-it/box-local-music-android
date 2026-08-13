            package p000;
            
            public final class i01Oil0 {
                public String I00000oIO;
                public i01IOiO1lO I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i01Oil0)) {
/* 7 */                 return false;
                    }
/* 11 */            i01Oil0 i01oil0 = (i01Oil0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i01oil0.I00000oIO) && this.I00000oOI == i01oil0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "IdAndState(id=" + this.I00000oIO + ", state=" + this.I00000oOI + ')';
                }
            }

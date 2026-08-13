            package p000;
            
            public final class il001oIi1I {
                public int I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof il001oIi1I) {
/* 6 */                 il001oIi1I il001oii1i = (il001oIi1I) obj;
/* 12 */                if (this.I00000oIO == il001oii1i.I00000oIO && this.I00000oOI == il001oii1i.I00000oOI) {
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

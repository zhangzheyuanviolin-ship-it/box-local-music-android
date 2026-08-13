            package p000;
            
            public final class IO0l1oIIi1i {
                public final String I00000oIO;
                public final Integer I00000oOI;

                public IO0l1oIIi1i(String str, Integer num) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = num;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IO0l1oIIi1i)) {
/* 32 */                return false;
                    }
/* 9 */             IO0l1oIIi1i iO0l1oIIi1i = (IO0l1oIIi1i) obj;
                    return this.I00000oIO.equals(iO0l1oIIi1i.I00000oIO) && this.I00000oOI.equals(iO0l1oIIi1i.I00000oOI);
                }

                public final int hashCode() {
/* 16 */            return (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
                }

                public final String toString() {
/* 28 */            return "CategoryInfo(id=" + this.I00000oIO + ", labelStringRes=" + this.I00000oOI + ", label=null)";
                }
            }

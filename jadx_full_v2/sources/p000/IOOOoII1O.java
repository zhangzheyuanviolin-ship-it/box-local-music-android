            package p000;
            
            public final class IOOOoII1O {
                public final int I00000oIO;
                public final int I00000oOI;

                public IOOOoII1O(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOOOoII1O)) {
/* 7 */                 return false;
                    }
/* 11 */            IOOOoII1O iOOOoII1O = (IOOOoII1O) obj;
                    return this.I00000oIO == iOOOoII1O.I00000oIO && this.I00000oOI == iOOOoII1O.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("CollectionInfo(rowCount=", this.I00000oIO, ", columnCount=", this.I00000oOI, ")");
                }
            }

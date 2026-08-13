            package p000;
            
            public final class i01IIlI {
                public final String I00000oIO;
                public final int I00000oOI;

                public i01IIlI(String str, int i) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i01IIlI)) {
/* 7 */                 return false;
                    }
/* 11 */            i01IIlI i01iili = (i01IIlI) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i01iili.I00000oIO) && this.I00000oOI == i01iili.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", generation=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00000oOI, ')');
                }
            }

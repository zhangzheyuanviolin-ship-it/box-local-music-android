            package p000;
            
            public final class I1OI0OoIOl {
                public final String I00000oIO;
                public final int I00000oOI;

                public I1OI0OoIOl(String str, int i) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1OI0OoIOl)) {
/* 7 */                 return false;
                    }
/* 11 */            I1OI0OoIOl i1OI0OoIOl = (I1OI0OoIOl) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1OI0OoIOl.I00000oIO) && this.I00000oOI == i1OI0OoIOl.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Pending(text=" + this.I00000oIO + ", queueMode=" + this.I00000oOI + ")";
                }
            }

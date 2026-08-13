            package p000;
            
            public final class I1l0iIlI10 {
                public I1l1oO0OI1 I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l0iIlI10) {
/* 10 */                I1l0iIlI10 i1l0iIlI10 = (I1l0iIlI10) obj;
/* 20 */                if (this.I00000oIO.equals(i1l0iIlI10.I00000oIO) && this.I00000oOI == i1l0iIlI10.I00000oOI) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 14 */            return this.I00000oOI ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("In{packet=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", jpegQuality=");
/* 22 */            return IIl001iO0Io.I000lI(this.I00000oOI, "}", sb);
                }
            }

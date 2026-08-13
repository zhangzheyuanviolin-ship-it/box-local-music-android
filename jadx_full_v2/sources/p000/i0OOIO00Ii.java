            package p000;
            
            public final class i0OOIO00Ii {
                public String I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof i0OOIO00Ii) {
/* 10 */                i0OOIO00Ii i0ooio00ii = (i0OOIO00Ii) obj;
/* 20 */                if (this.I00000oIO.equals(i0ooio00ii.I00000oIO) && this.I00000oOI == i0ooio00ii.I00000oOI && this.I0000Il00O == i0ooio00ii.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            long j = this.I0000Il00O;
/* 17 */            long j2 = j ^ (j >>> 32);
/* 18 */            long j3 = this.I00000oOI;
/* 29 */            return ((((int) ((j3 >>> 32) ^ j3)) ^ (iHashCode * 1000003)) * 1000003) ^ ((int) j2);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AiAssetLocation{path=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", offset=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", size=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, this.I0000Il00O, "}");
                }
            }

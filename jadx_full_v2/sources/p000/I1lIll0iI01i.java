            package p000;
            
            public final class I1lIll0iI01i {
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lIll0iI01i) {
/* 10 */                I1lIll0iI01i i1lIll0iI01i = (I1lIll0iI01i) obj;
/* 18 */                if (this.I00000oIO == i1lIll0iI01i.I00000oIO && this.I00000oOI == i1lIll0iI01i.I00000oOI && this.I0000Il00O == i1lIll0iI01i.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 14 */            long j2 = this.I00000oOI;
/* 21 */            int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
/* 22 */            long j3 = this.I0000Il00O;
/* 28 */            return ((int) ((j3 >>> 32) ^ j3)) ^ i;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", elapsedRealtime=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", uptimeMillis=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, this.I0000Il00O, "}");
                }
            }

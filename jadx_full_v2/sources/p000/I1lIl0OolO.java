            package p000;

            import java.util.Set;
            
            public final class I1lIl0OolO {
                public long I00000oIO;
                public long I00000oOI;
                public Set I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lIl0OolO) {
/* 10 */                I1lIl0OolO i1lIl0OolO = (I1lIl0OolO) obj;
/* 18 */                if (this.I00000oIO == i1lIl0OolO.I00000oIO && this.I00000oOI == i1lIl0OolO.I00000oOI && this.I0000Il00O.equals(i1lIl0OolO.I0000Il00O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 13 */            int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
/* 14 */            long j2 = this.I00000oOI;
/* 29 */            return this.I0000Il00O.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
                }

                public final String toString() {
/* 38 */            return "ConfigValue{delta=" + this.I00000oIO + ", maxAllowedDelay=" + this.I00000oOI + ", flags=" + this.I0000Il00O + "}";
                }
            }

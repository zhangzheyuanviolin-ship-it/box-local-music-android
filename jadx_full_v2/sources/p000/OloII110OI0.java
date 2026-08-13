            package p000;

            import java.util.Objects;
            
            public final class OloII110OI0 {
                public final long I00000oIO;
                public final long I00000oOI;

                public OloII110OI0(long j, long j2) {
/* 8 */             if (j < 0) {
/* 28 */                I000II.I000iOII("offset must not be negative");
/* 89 */                throw null;
                    }
/* 12 */            if (j2 < 0) {
/* 21 */                I000II.I000iOII("numbytes must not be negative");
/* 25 */                throw null;
                    }
/* 14 */            this.I00000oIO = j;
/* 16 */            this.I00000oOI = j2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && OloII110OI0.class == obj.getClass()) {
/* 17 */                OloII110OI0 oloII110OI0 = (OloII110OI0) obj;
/* 25 */                if (this.I00000oIO == oloII110OI0.I00000oIO && this.I00000oOI == oloII110OI0.I00000oOI) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 17 */            return Objects.hash(Long.valueOf(this.I00000oIO), Long.valueOf(this.I00000oOI));
                }

                public final String toString() {
/* 28 */            return "TarArchiveStructSparse{offset=" + this.I00000oIO + ", numbytes=" + this.I00000oOI + '}';
                }
            }

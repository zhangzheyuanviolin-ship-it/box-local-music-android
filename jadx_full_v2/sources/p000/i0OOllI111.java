            package p000;
            
            public final class i0OOllI111 {
                public long I00000oIO;
                public i0IlI0lloio I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof i0OOllI111)) {
/* 30 */                return false;
                    }
/* 8 */             i0OOllI111 i0oolli111 = (i0OOllI111) obj;
                    return this.I00000oIO == i0oolli111.I00000oIO && this.I00000oOI.equals(i0oolli111.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 20 */            return this.I00000oOI.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 32 */            return "AiPackStates{totalBytes=" + this.I00000oIO + ", packStates=" + this.I00000oOI.toString() + "}";
                }
            }

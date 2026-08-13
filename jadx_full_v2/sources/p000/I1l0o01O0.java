            package p000;
            
            public final class I1l0o01O0 {
                public String I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l0o01O0) {
/* 10 */                I1l0o01O0 i1l0o01O0 = (I1l0o01O0) obj;
/* 20 */                if (this.I00000oIO.equals(i1l0o01O0.I00000oIO) && this.I00000oOI == i1l0o01O0.I00000oOI && this.I0000Il00O == i1l0o01O0.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.I00000oIO.hashCode() ^ 1000003) * 1000003;
/* 12 */            long j = this.I00000oOI;
/* 22 */            long j2 = this.I0000Il00O;
/* 28 */            return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", tokenExpirationTimestamp=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", tokenCreationTimestamp=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, this.I0000Il00O, "}");
                }
            }

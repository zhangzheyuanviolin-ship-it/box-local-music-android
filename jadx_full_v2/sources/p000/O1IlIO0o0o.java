            package p000;
            
            public final class O1IlIO0o0o {
                public String I00000oIO;
                public boolean I00000oOI;
                public long I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 39 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1IlIO0o0o)) {
/* 37 */                return false;
                    }
/* 9 */             O1IlIO0o0o o1IlIO0o0o = (O1IlIO0o0o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1IlIO0o0o.I00000oIO) && this.I00000oOI == o1IlIO0o0o.I00000oOI && this.I0000Il00O == o1IlIO0o0o.I0000Il00O;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 26 */            return Long.hashCode(this.I0000Il00O) + Oi010OO0.I000OOo1O((str == null ? 0 : str.hashCode()) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             boolean z = this.I00000oOI;
/* 5 */             long j = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("MTEnvProperties(envName=");
/* 14 */            sb.append(str);
/* 19 */            sb.append(", ended=");
/* 22 */            sb.append(z);
/* 27 */            sb.append(", numRows=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, j, ")");
                }
            }

            package p000;
            
            public final class i1OO1io {
                public String I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof i1OO1io)) {
/* 34 */                return false;
                    }
/* 8 */             i1OO1io i1oo1io = (i1OO1io) obj;
                    return this.I00000oIO.equals(i1oo1io.I00000oIO) && this.I00000oOI == i1oo1io.I00000oOI && this.I0000Il00O == i1oo1io.I0000Il00O;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 26 */            return this.I0000Il00O ^ (((iHashCode * 1000003) ^ (true != this.I00000oOI ? 1237 : 1231)) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", enableFirelog=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", firelogEventType=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, "}", sb);
                }
            }

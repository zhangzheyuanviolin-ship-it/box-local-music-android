            package p000;
            
            public final class loO1loo1o0 {
                public String I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof loO1loo1o0)) {
/* 34 */                return false;
                    }
/* 8 */             loO1loo1o0 loo1loo1o0 = (loO1loo1o0) obj;
                    return this.I00000oIO.equals(loo1loo1o0.I00000oIO) && this.I00000oOI == loo1loo1o0.I00000oOI && this.I0000Il00O == loo1loo1o0.I0000Il00O;
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

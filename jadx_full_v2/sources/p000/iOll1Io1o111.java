            package p000;
            
            public final class iOll1Io1o111 {
                public String I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof iOll1Io1o111)) {
/* 28 */                return false;
                    }
/* 8 */             iOll1Io1o111 ioll1io1o111 = (iOll1Io1o111) obj;
                    return this.I00000oIO.equals(ioll1io1o111.I00000oIO) && this.I00000oOI == ioll1io1o111.I00000oOI;
                }

                public final int hashCode() {
/* 17 */            return this.I00000oOI ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", enableFirelog=true, firelogEventType=");
/* 22 */            return IIl001iO0Io.I000lI(this.I00000oOI, "}", sb);
                }
            }

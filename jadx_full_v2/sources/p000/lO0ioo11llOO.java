            package p000;
            
            public final class lO0ioo11llOO {
                public String I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof lO0ioo11llOO)) {
/* 34 */                return false;
                    }
/* 8 */             lO0ioo11llOO lo0ioo11lloo = (lO0ioo11llOO) obj;
                    return this.I00000oIO.equals(lo0ioo11lloo.I00000oIO) && this.I00000oOI == lo0ioo11lloo.I00000oOI && this.I0000Il00O == lo0ioo11lloo.I0000Il00O;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 26 */            return this.I0000Il00O ^ (((iHashCode * 1000003) ^ (true != this.I00000oOI ? 1237 : 1231)) * 1000003);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             boolean z = this.I00000oOI;
/* 5 */             int i = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
/* 14 */            sb.append(str);
/* 19 */            sb.append(", enableFirelog=");
/* 22 */            sb.append(z);
/* 27 */            sb.append(", firelogEventType=");
/* 32 */            return IIl001iO0Io.I000lI(i, "}", sb);
                }
            }

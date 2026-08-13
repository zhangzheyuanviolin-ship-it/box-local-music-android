            package p000;
            
            public final class iOilOIiI {
                public String I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof iOilOIiI)) {
/* 34 */                return false;
                    }
/* 8 */             iOilOIiI ioiloiii = (iOilOIiI) obj;
                    return this.I00000oIO.equals(ioiloiii.I00000oIO) && this.I00000oOI == ioiloiii.I00000oOI && this.I0000Il00O == ioiloiii.I0000Il00O;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 26 */            return this.I0000Il00O ^ (((iHashCode * 1000003) ^ (true != this.I00000oOI ? 1237 : 1231)) * 1000003);
                }

                public final String toString() {
/* 1 */             boolean z = this.I00000oOI;
/* 7 */             int length = String.valueOf(z).length();
/* 11 */            int i = this.I0000Il00O;
/* 17 */            int length2 = String.valueOf(i).length();
/* 23 */            String str = this.I00000oIO;
/* 37 */            StringBuilder sb = new StringBuilder(str.length() + 48 + length + 19 + length2 + 1);
/* 42 */            sb.append("MLKitLoggingOptions{libraryName=");
/* 45 */            sb.append(str);
/* 50 */            sb.append(", enableFirelog=");
/* 53 */            sb.append(z);
/* 60 */            return IIlIOloOOO.I00100o1O0lo(sb, ", firelogEventType=", i, "}");
                }
            }

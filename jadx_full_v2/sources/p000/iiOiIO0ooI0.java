            package p000;
            
            public final class iiOiIO0ooI0 {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iiOiIO0ooI0) {
/* 10 */                iiOiIO0ooI0 iioiio0ooi0 = (iiOiIO0ooI0) obj;
/* 20 */                if (this.I00000oIO.equals(iioiio0ooi0.I00000oIO) && this.I00000oOI == iioiio0ooi0.I00000oOI && this.I0000Il00O == iioiio0ooi0.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I0000Il00O ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("GpuInfo{rendererName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", majorVersion=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", minorVersion=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, "}", sb);
                }
            }

            package p000;

            import java.util.Map;
            
            public final class OlOO1i0ll0 {
                public Map I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OlOO1i0ll0)) {
/* 7 */                 return false;
                    }
/* 11 */            OlOO1i0ll0 olOO1i0ll0 = (OlOO1i0ll0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, olOO1i0ll0.I00000oIO) && this.I00000oOI == olOO1i0ll0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", maxSupportedFrameRate=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00000oOI, ')');
                }
            }

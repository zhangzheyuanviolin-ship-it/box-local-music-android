            package p000;
            
            public final class I1l1iI1Io {
                public boolean I00000oIO;
                public int I00000oOI;
                public float I0000Il00O;
                public int I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l1iI1Io) {
/* 10 */                I1l1iI1Io i1l1iI1Io = (I1l1iI1Io) obj;
/* 16 */                if (this.I00000oIO == i1l1iI1Io.I00000oIO && this.I00000oOI == i1l1iI1Io.I00000oOI && Float.floatToIntBits(this.I0000Il00O) == Float.floatToIntBits(i1l1iI1Io.I0000Il00O) && this.I0000O == i1l1iI1Io.I0000O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 30 */            return this.I0000O ^ (((((((true != this.I00000oIO ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ Float.floatToIntBits(this.I0000Il00O)) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MiniBenchmarkResult{logged=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", stabilityStatus=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", correctnessScore=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", runLatencyMs=");
/* 42 */            return IIl001iO0Io.I000lI(this.I0000O, "}", sb);
                }
            }

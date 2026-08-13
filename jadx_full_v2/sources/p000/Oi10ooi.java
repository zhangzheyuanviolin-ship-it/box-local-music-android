            package p000;
            
            public final class Oi10ooi {
                public String I00000oIO;
                public String I00000oOI;
                public float I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oi10ooi)) {
/* 43 */                return false;
                    }
/* 9 */             Oi10ooi oi10ooi = (Oi10ooi) obj;
                    return this.I00000oIO.equals(oi10ooi.I00000oIO) && this.I00000oOI.equals(oi10ooi.I00000oOI) && Float.compare(this.I0000Il00O, oi10ooi.I0000Il00O) == 0;
                }

                public final int hashCode() {
/* 22 */            return Float.hashCode(this.I0000Il00O) + Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 19 */            return Oi010OO0.I001i1O0Ol(IIl001iO0Io.I00111O("RetrievedChunk(text=", str, ", documentId=", str2, ", score="), this.I0000Il00O, ")");
                }
            }

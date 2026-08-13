            package p000;
            
            public final class O11101IIlil1 {
                public String I00000oIO;
                public float I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof O11101IIlil1)) {
/* 46 */                return false;
                    }
/* 9 */             O11101IIlil1 o11101IIlil1 = (O11101IIlil1) obj;
                    return this.I00000oIO.equals(o11101IIlil1.I00000oIO) && Float.compare(this.I00000oOI, o11101IIlil1.I00000oOI) == 0 && this.I0000Il00O == o11101IIlil1.I0000Il00O && this.I0000O == o11101IIlil1.I0000O;
                }

                public final int hashCode() {
/* 28 */            return Integer.hashCode(this.I0000O) + IIl001iO0Io.I0000O(this.I0000Il00O, OooioIOo1.I0000O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31);
                }

                public final String toString() {
/* 48 */            return "GenerationResult(response=" + this.I00000oIO + ", tokensPerSecond=" + this.I00000oOI + ", durationSeconds=" + this.I0000Il00O + ", contextLengthUsed=" + this.I0000O + ")";
                }
            }

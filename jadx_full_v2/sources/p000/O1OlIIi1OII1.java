            package p000;
            
            public final class O1OlIIi1OII1 {
                public String I00000oIO;
                public IooO11l I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1OlIIi1OII1)) {
/* 32 */                return false;
                    }
/* 9 */             O1OlIIi1OII1 o1OlIIi1OII1 = (O1OlIIi1OII1) obj;
                    return this.I00000oIO.equals(o1OlIIi1OII1.I00000oIO) && this.I00000oOI.equals(o1OlIIi1OII1.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "MatchGroup(value=" + this.I00000oIO + ", range=" + this.I00000oOI + ')';
                }
            }

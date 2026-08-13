            package p000;
            
            public final class OIoi11oolo {
                public final Object I00000oIO;
                public final Object I00000oOI;

                public OIoi11oolo(Object obj, Object obj2) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OIoi11oolo)) {
/* 30 */                return false;
                    }
/* 6 */             OIoi11oolo oIoi11oolo = (OIoi11oolo) obj;
                    return oIoi11oolo.I00000oIO.equals(this.I00000oIO) && oIoi11oolo.I00000oOI.equals(this.I00000oOI);
                }

                public final int hashCode() {
/* 13 */            return this.I00000oOI.hashCode() ^ this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 28 */            return "Pair{" + this.I00000oIO + " " + this.I00000oOI + "}";
                }
            }

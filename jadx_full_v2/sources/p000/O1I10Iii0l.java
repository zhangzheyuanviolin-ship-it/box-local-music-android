            package p000;
            
            public final class O1I10Iii0l {
                public O1I10OIO I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1I10Iii0l)) {
/* 46 */                return false;
                    }
/* 9 */             O1I10Iii0l o1I10Iii0l = (O1I10Iii0l) obj;
                    return this.I00000oIO == o1I10Iii0l.I00000oIO && this.I00000oOI.equals(o1I10Iii0l.I00000oOI) && this.I0000Il00O == o1I10Iii0l.I0000Il00O && this.I0000O.equals(o1I10Iii0l.I0000O);
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000O(this.I0000Il00O, Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31);
                }

                public final String toString() {
/* 48 */            return "LogMessage(level=" + this.I00000oIO + ", source=" + this.I00000oOI + ", lineNumber=" + this.I0000Il00O + ", message=" + this.I0000O + ")";
                }
            }

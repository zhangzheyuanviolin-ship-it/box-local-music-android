            package p000;
            
            public final class Iol00ooo {
                public int I00000oIO;
                public IiIO1ol1i1o0 I00000oOI;
                public IIll0oO I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Iol00ooo)) {
/* 7 */                 return false;
                    }
/* 11 */            Iol00ooo iol00ooo = (Iol00ooo) obj;
                    return this.I00000oIO == iol00ooo.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, iol00ooo.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iol00ooo.I0000Il00O);
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (Integer.hashCode(this.I00000oIO) * 31)) * 31);
                }

                public final String toString() {
/* 42 */            return "ConfiguredOutput(streamId=" + ((Object) OlOO0I1.I00000oOI(this.I00000oIO)) + ", deferrableSurface=" + this.I00000oOI + ", graph=" + this.I0000Il00O + ')';
                }
            }

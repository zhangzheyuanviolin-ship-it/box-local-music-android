            package p000;
            
            public final class IOIO1OO1l10l {
                public final OI1IlOlol I00000oIO;
                public final OOOi0i1IOo I00000oOI;
                public final II0O0I00oOi I0000Il00O;
                public final OlI1o0ooI I0000O;

                public IOIO1OO1l10l(OI1IlOlol oI1IlOlol, OOOi0i1IOo oOOi0i1IOo, II0O0I00oOi iI0O0I00oOi, OlI1o0ooI olI1o0ooI) {
/* 4 */             this.I00000oIO = oI1IlOlol;
/* 6 */             this.I00000oOI = oOOi0i1IOo;
/* 8 */             this.I0000Il00O = iI0O0I00oOi;
/* 10 */            this.I0000O = olI1o0ooI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOIO1OO1l10l)) {
/* 54 */                return false;
                    }
/* 9 */             IOIO1OO1l10l iOIO1OO1l10l = (IOIO1OO1l10l) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOIO1OO1l10l.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOIO1OO1l10l.I00000oOI) && this.I0000Il00O.equals(iOIO1OO1l10l.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iOIO1OO1l10l.I0000O);
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "ClassData(nameResolver=" + this.I00000oIO + ", classProto=" + this.I00000oOI + ", metadataVersion=" + this.I0000Il00O + ", sourceElement=" + this.I0000O + ')';
                }
            }

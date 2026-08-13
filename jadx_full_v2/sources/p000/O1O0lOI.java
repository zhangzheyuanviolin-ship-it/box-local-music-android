            package p000;
            
/* 7 */     public final class O1O0lOI {
                public O1O0lio1liIo I00000oIO;
                public String I00000oOI;

                public O1O0lOI(O1O0lio1liIo o1O0lio1liIo, String str) {
/* 4 */             this.I00000oIO = o1O0lio1liIo;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1O0lOI)) {
/* 7 */                 return false;
                    }
/* 11 */            O1O0lOI o1O0lOI = (O1O0lOI) obj;
                    return this.I00000oIO == o1O0lOI.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o1O0lOI.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "MTParseError(errorCode=" + this.I00000oIO + ", errorDesc=" + this.I00000oOI + ")";
                }

/* 8 */         public O1O0lOI() {
/* 11 */            this(O1O0lio1liIo.I00iOIl, "");
                }
            }

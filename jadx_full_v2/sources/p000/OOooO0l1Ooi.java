            package p000;
            
            public final class OOooO0l1Ooi {
                public final String I00000oIO;
                public final String I00000oOI;
                public final long I0000Il00O;

                public OOooO0l1Ooi(String str, String str2, long j) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 43 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOooO0l1Ooi)) {
/* 41 */                return false;
                    }
/* 9 */             OOooO0l1Ooi oOooO0l1Ooi = (OOooO0l1Ooi) obj;
                    return this.I00000oIO.equals(oOooO0l1Ooi.I00000oIO) && this.I00000oOI.equals(oOooO0l1Ooi.I00000oOI) && this.I0000Il00O == oOooO0l1Ooi.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.I0000Il00O) + Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 19 */            return IlIi0I0.I000o00OoI0I(IIl001iO0Io.I00111O("Remote(remoteName=", this.I00000oIO, ", localName=", this.I00000oOI, ", size="), this.I0000Il00O, ")");
                }
            }

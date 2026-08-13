            package p000;
            
            public final class OiiOOli {
                public final Oi0il01O01IO I00000oIO;
                public final int I00000oOI;
                public final long I0000Il00O;

                public OiiOOli(Oi0il01O01IO oi0il01O01IO, int i, long j) {
/* 4 */             this.I00000oIO = oi0il01O01IO;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OiiOOli)) {
/* 7 */                 return false;
                    }
/* 11 */            OiiOOli oiiOOli = (OiiOOli) obj;
                    return this.I00000oIO == oiiOOli.I00000oIO && this.I00000oOI == oiiOOli.I00000oOI && this.I0000Il00O == oiiOOli.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", offset=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", selectableId=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, this.I0000Il00O, ")");
                }
            }

            package p000;
            
            public final class OiiOlI0I {
                public final OiiOOli I00000oIO;
                public final OiiOOli I00000oOI;
                public final boolean I0000Il00O;

                public OiiOlI0I(OiiOOli oiiOOli, OiiOOli oiiOOli2, boolean z) {
/* 4 */             this.I00000oIO = oiiOOli;
/* 6 */             this.I00000oOI = oiiOOli2;
/* 8 */             this.I0000Il00O = z;
                }

                public static OiiOlI0I I00000oIO(OiiOlI0I oiiOlI0I, OiiOOli oiiOOli, OiiOOli oiiOOli2, boolean z, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 oiiOOli = oiiOlI0I.I00000oIO;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                oiiOOli2 = oiiOlI0I.I00000oOI;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                z = oiiOlI0I.I0000Il00O;
                    }
/* 19 */            oiiOlI0I.getClass();
/* 24 */            return new OiiOlI0I(oiiOOli, oiiOOli2, z);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OiiOlI0I)) {
/* 7 */                 return false;
                    }
/* 11 */            OiiOlI0I oiiOlI0I = (OiiOlI0I) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oiiOlI0I.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oiiOlI0I.I00000oOI) && this.I0000Il00O == oiiOlI0I.I0000Il00O;
                }

                public final int hashCode() {
/* 24 */            return Boolean.hashCode(this.I0000Il00O) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Selection(start=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", end=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", handlesCrossed=");
/* 32 */            return IIlIOloOOO.I0010o(sb, this.I0000Il00O, ")");
                }
            }

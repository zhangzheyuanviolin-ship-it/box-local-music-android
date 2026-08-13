            package p000;
            
            public final class OO1I0OI0o {
                public final long I00000oIO;
                public final long I00000oOI;
                public final int I0000Il00O;

                public OO1I0OI0o(int i, long j, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = i;
/* 10 */            Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 22 */            if ((j & 1095216660480L) == 0) {
/* 26 */                Ioliol.I00000oIO("width cannot be TextUnit.Unspecified");
                    }
/* 32 */            if ((1095216660480L & j2) == 0) {
/* 36 */                Ioliol.I00000oIO("height cannot be TextUnit.Unspecified");
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 39 */                return true;
                    }
/* 6 */             if (!(obj instanceof OO1I0OI0o)) {
/* 41 */                return false;
                    }
/* 9 */             OO1I0OI0o oO1I0OI0o = (OO1I0OI0o) obj;
                    return Oo0o1OiIo.I00000oOI(this.I00000oIO, oO1I0OI0o.I00000oIO) && Oo0o1OiIo.I00000oOI(this.I00000oOI, oO1I0OI0o.I00000oOI) && this.I0000Il00O == oO1I0OI0o.I0000Il00O;
                }

                public final int hashCode() {
/* 1 */             Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 24 */            return Integer.hashCode(this.I0000Il00O) + IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 3 */             String strI0001Ioi1lo = Oo0o1OiIo.I0001Ioi1lo(this.I00000oIO);
/* 9 */             String strI0001Ioi1lo2 = Oo0o1OiIo.I0001Ioi1lo(this.I00000oOI);
/* 14 */            int i = this.I0000Il00O;
/* 71 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("Placeholder(width=", strI0001Ioi1lo, ", height=", strI0001Ioi1lo2, ", placeholderVerticalAlign="), i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid", ")");
                }
            }

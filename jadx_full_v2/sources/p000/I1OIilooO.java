            package p000;
            
            public final class I1OIilooO extends I1OIOiil {
                public char I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public String I0000O;
                public String I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 55 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1OIilooO)) {
/* 53 */                return false;
                    }
/* 9 */             I1OIilooO i1OIilooO = (I1OIilooO) obj;
                    return this.I00000oIO == i1OIilooO.I00000oIO && this.I00000oOI == i1OIilooO.I00000oOI && this.I0000Il00O == i1OIilooO.I0000Il00O && this.I0000O.equals(i1OIilooO.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, i1OIilooO.I0000oI00);
                }

                public final int hashCode() {
/* 34 */            return this.I0000oI00.hashCode() + Oi010OO0.I000O01llI0(IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, Character.hashCode(this.I00000oIO) * 31, 31), 31), 31, this.I0000O);
                }

                public final String toString() {
/* 1 */             char c = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
/* 7 */             String str = this.I0000O;
/* 9 */             String str2 = this.I0000oI00;
/* 15 */            StringBuilder sb = new StringBuilder("AstFencedCodeBlock(fenceChar=");
/* 18 */            sb.append(c);
/* 23 */            sb.append(", fenceLength=");
/* 26 */            sb.append(i);
/* 31 */            sb.append(", fenceIndent=");
/* 34 */            sb.append(i2);
/* 39 */            sb.append(", info=");
/* 42 */            sb.append(str);
/* 47 */            sb.append(", literal=");
/* 52 */            return IIl001iO0Io.I00100l0(sb, str2, ")");
                }
            }

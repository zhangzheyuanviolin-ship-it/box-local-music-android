            package p000;
            
            public final class O1Io0Io1oo11 {
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public boolean I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1Io0Io1oo11)) {
/* 7 */                 return false;
                    }
/* 11 */            O1Io0Io1oo11 o1Io0Io1oo11 = (O1Io0Io1oo11) obj;
                    return this.I00000oIO == o1Io0Io1oo11.I00000oIO && Float.compare(this.I00000oOI, o1Io0Io1oo11.I00000oOI) == 0 && Float.compare(this.I0000Il00O, o1Io0Io1oo11.I0000Il00O) == 0 && Float.compare(this.I0000O, o1Io0Io1oo11.I0000O) == 0 && this.I0000oI00 == o1Io0Io1oo11.I0000oI00;
                }

                public final int hashCode() {
/* 34 */            return Boolean.hashCode(this.I0000oI00) + OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(Integer.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             float f = this.I00000oOI;
/* 5 */             float f2 = this.I0000Il00O;
/* 7 */             float f3 = this.I0000O;
/* 9 */             boolean z = this.I0000oI00;
/* 15 */            StringBuilder sb = new StringBuilder("MTGlyphPart(glyph=");
/* 18 */            sb.append(i);
/* 23 */            sb.append(", fullAdvance=");
/* 26 */            sb.append(f);
/* 31 */            sb.append(", startConnectorLength=");
/* 34 */            sb.append(f2);
/* 39 */            sb.append(", endConnectorLength=");
/* 42 */            sb.append(f3);
/* 47 */            sb.append(", isExtender=");
/* 52 */            return IIlIOloOOO.I0010o(sb, z, ")");
                }
            }

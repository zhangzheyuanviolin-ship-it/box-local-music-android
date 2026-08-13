            package p000;
            
            public final class O0Ol0O extends O0OoI01Oo000 {
                public String I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0Ol0O)) {
/* 32 */                return false;
                    }
/* 9 */             O0Ol0O o0Ol0O = (O0Ol0O) obj;
                    return this.I00000oIO.equals(o0Ol0O.I00000oIO) && this.I00000oOI.equals(o0Ol0O.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("EnumValue(");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append('.');
/* 22 */            return IlIi0I0.I000oI1ioi(sb, this.I00000oOI, ')');
                }
            }

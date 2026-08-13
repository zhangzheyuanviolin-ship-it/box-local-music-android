            package p000;
            
            public final class Ioo1Io {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ioo1Io)) {
/* 7 */                 return false;
                    }
/* 13 */            Ioo1Io ioo1Io = (Ioo1Io) obj;
                    return this.I00000oIO == ioo1Io.I00000oIO && this.I00000oOI == ioo1Io.I00000oOI && this.I0000Il00O == ioo1Io.I0000Il00O && this.I0000O == ioo1Io.I0000O;
                }

                public final int hashCode() {
/* 17 */            return (((((this.I00000oIO * 31) + this.I00000oOI) * 31) + this.I0000Il00O) * 31) + this.I0000O;
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = this.I00000oOI;
/* 5 */             int i3 = this.I0000Il00O;
/* 7 */             int i4 = this.I0000O;
/* 15 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("InsetsValues(left=", i, ", top=", i2, ", right=");
/* 19 */            sbI0010I0i.append(i3);
/* 24 */            sbI0010I0i.append(", bottom=");
/* 27 */            sbI0010I0i.append(i4);
/* 32 */            sbI0010I0i.append(")");
/* 35 */            return sbI0010I0i.toString();
                }
            }

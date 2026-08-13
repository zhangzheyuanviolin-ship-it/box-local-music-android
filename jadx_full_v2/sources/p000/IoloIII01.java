            package p000;
            
            public final class IoloIII01 {
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public IoloIII01(int i, int i2, int i3) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IoloIII01)) {
/* 7 */                 return false;
                    }
/* 11 */            IoloIII01 ioloIII01 = (IoloIII01) obj;
                    return this.I00000oIO == ioloIII01.I00000oIO && this.I00000oOI == ioloIII01.I00000oOI && this.I0000Il00O == ioloIII01.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("InputConfigData(width=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", height=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", format=");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, this.I0000Il00O, ')');
                }
            }

            package p000;
            
            public final class O1oIOoi0oo {
                public final String I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final long I0000O;

                public O1oIOoi0oo(long j, String str, String str2, String str3) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = str3;
/* 10 */            this.I0000O = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 54 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1oIOoi0oo)) {
/* 52 */                return false;
                    }
/* 9 */             O1oIOoi0oo o1oIOoi0oo = (O1oIOoi0oo) obj;
                    return this.I00000oIO.equals(o1oIOoi0oo.I00000oIO) && this.I00000oOI.equals(o1oIOoi0oo.I00000oOI) && this.I0000Il00O.equals(o1oIOoi0oo.I0000Il00O) && this.I0000O == o1oIOoi0oo.I0000O;
                }

                public final int hashCode() {
/* 28 */            return Long.hashCode(this.I0000O) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ModelDataFile(name=", this.I00000oIO, ", url=", this.I00000oOI, ", downloadFileName=");
/* 17 */            sbI00111O.append(this.I0000Il00O);
/* 22 */            sbI00111O.append(", sizeInBytes=");
/* 27 */            sbI00111O.append(this.I0000O);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }

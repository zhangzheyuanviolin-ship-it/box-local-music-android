            package p000;
            
            public final class IOlliI1O0l1 {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public boolean I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOlliI1O0l1)) {
/* 50 */                return false;
                    }
/* 9 */             IOlliI1O0l1 iOlliI1O0l1 = (IOlliI1O0l1) obj;
                    return this.I00000oIO.equals(iOlliI1O0l1.I00000oIO) && this.I00000oOI.equals(iOlliI1O0l1.I00000oOI) && this.I0000Il00O.equals(iOlliI1O0l1.I0000Il00O) && this.I0000O == iOlliI1O0l1.I0000O;
                }

                public final int hashCode() {
/* 28 */            return Boolean.hashCode(this.I0000O) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             boolean z = this.I0000O;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ConfigRowData(label=", str, ", oldValueDisplay=", str2, ", newValueDisplay=");
/* 19 */            sbI00111O.append(str3);
/* 24 */            sbI00111O.append(", isChanged=");
/* 27 */            sbI00111O.append(z);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }

            package p000;
            
            public final class OOio1iliiii {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public long I0000O;
                public int I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 61 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOio1iliiii)) {
/* 59 */                return false;
                    }
/* 9 */             OOio1iliiii oOio1iliiii = (OOio1iliiii) obj;
                    return this.I00000oIO.equals(oOio1iliiii.I00000oIO) && this.I00000oOI.equals(oOio1iliiii.I00000oOI) && this.I0000Il00O.equals(oOio1iliiii.I0000Il00O) && this.I0000O == oOio1iliiii.I0000O && this.I0000oI00 == oOio1iliiii.I0000oI00;
                }

                public final int hashCode() {
/* 34 */            return Integer.hashCode(this.I0000oI00) + IIlIOloOOO.I0000O(this.I0000O, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             long j = this.I0000O;
/* 9 */             int i = this.I0000oI00;
/* 17 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("RagDocument(id=", str, ", title=", str2, ", uri=");
/* 21 */            sbI00111O.append(str3);
/* 26 */            sbI00111O.append(", createdAt=");
/* 29 */            sbI00111O.append(j);
/* 36 */            return IIlIOloOOO.I00100o1O0lo(sbI00111O, ", chunkCount=", i, ")");
                }
            }

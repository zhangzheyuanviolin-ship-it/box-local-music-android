            package p000;
            
            public final class OillO0lO1O {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public Long I0000O;
                public String I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OillO0lO1O)) {
/* 7 */                 return false;
                    }
/* 11 */            OillO0lO1O oillO0lO1O = (OillO0lO1O) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oillO0lO1O.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oillO0lO1O.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oillO0lO1O.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oillO0lO1O.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oillO0lO1O.I0000oI00);
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            String str2 = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 27 */            String str3 = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 40 */            Long l = this.I0000O;
/* 51 */            int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
/* 53 */            String str4 = this.I0000oI00;
/* 62 */            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             Long l = this.I0000O;
/* 9 */             String str4 = this.I0000oI00;
/* 11 */            OOoiliiIoloI oOoiliiIoloI = OillOO10.I00000oIO;
/* 15 */            StringBuilder sb = new StringBuilder();
/* 20 */            OillOO10.I00000oIO(str2, "event", sb);
/* 25 */            OillOO10.I00000oIO(str, "data", sb);
/* 30 */            OillOO10.I00000oIO(str3, "id", sb);
/* 35 */            OillOO10.I00000oIO(l, "retry", sb);
/* 40 */            OillOO10.I00000oIO(str4, "", sb);
/* 43 */            return sb.toString();
                }
            }

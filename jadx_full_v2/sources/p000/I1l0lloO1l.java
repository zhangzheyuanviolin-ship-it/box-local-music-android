            package p000;
            
            public final class I1l0lloO1l {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public I1lO0lOlOIi I0000O;
                public int I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 85 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1l0lloO1l)) {
/* 87 */                return false;
                    }
/* 8 */             I1l0lloO1l i1l0lloO1l = (I1l0lloO1l) obj;
/* 10 */            String str = this.I00000oIO;
/* 12 */            String str2 = i1l0lloO1l.I00000oIO;
/* 14 */            if (str == null) {
/* 16 */                if (str2 != null) {
/* 87 */                    return false;
                        }
                    } else if (!str.equals(str2)) {
/* 87 */                return false;
                    }
/* 25 */            String str3 = this.I00000oOI;
/* 27 */            String str4 = i1l0lloO1l.I00000oOI;
/* 29 */            if (str3 == null) {
/* 31 */                if (str4 != null) {
/* 87 */                    return false;
                        }
                    } else if (!str3.equals(str4)) {
/* 87 */                return false;
                    }
/* 40 */            String str5 = this.I0000Il00O;
/* 42 */            String str6 = i1l0lloO1l.I0000Il00O;
/* 44 */            if (str5 == null) {
/* 46 */                if (str6 != null) {
/* 87 */                    return false;
                        }
                    } else if (!str5.equals(str6)) {
/* 87 */                return false;
                    }
/* 55 */            I1lO0lOlOIi i1lO0lOlOIi = this.I0000O;
/* 57 */            I1lO0lOlOIi i1lO0lOlOIi2 = i1l0lloO1l.I0000O;
/* 59 */            if (i1lO0lOlOIi == null) {
/* 61 */                if (i1lO0lOlOIi2 != null) {
/* 87 */                    return false;
                        }
                    } else if (!i1lO0lOlOIi.equals(i1lO0lOlOIi2)) {
/* 87 */                return false;
                    }
/* 70 */            int i = this.I0000oI00;
/* 72 */            int i2 = i1l0lloO1l.I0000oI00;
                    return i == 0 ? i2 == 0 : IIlIOloOOO.I00000oOI(i, i2);
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 16 */            int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
/* 17 */            String str2 = this.I00000oOI;
/* 28 */            int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
/* 29 */            String str3 = this.I0000Il00O;
/* 40 */            int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
/* 41 */            I1lO0lOlOIi i1lO0lOlOIi = this.I0000O;
/* 52 */            int iHashCode4 = (iHashCode3 ^ (i1lO0lOlOIi == null ? 0 : i1lO0lOlOIi.hashCode())) * 1000003;
/* 53 */            int i = this.I0000oI00;
/* 62 */            return iHashCode4 ^ (i != 0 ? IIlIOloOOO.I001lIiIIo1O(i) : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", fid=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", refreshToken=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", authToken=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", responseCode=");
/* 48 */            int i = this.I0000oI00;
/* 64 */            sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
/* 69 */            sb.append("}");
/* 72 */            return sb.toString();
                }
            }

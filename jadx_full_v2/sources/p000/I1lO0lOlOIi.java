            package p000;
            
            public final class I1lO0lOlOIi {
                public String I00000oIO;
                public long I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1lO0lOlOIi)) {
/* 50 */                return false;
                    }
/* 8 */             I1lO0lOlOIi i1lO0lOlOIi = (I1lO0lOlOIi) obj;
/* 10 */            String str = this.I00000oIO;
/* 12 */            String str2 = i1lO0lOlOIi.I00000oIO;
/* 14 */            if (str == null) {
/* 16 */                if (str2 != null) {
/* 50 */                    return false;
                        }
                    } else if (!str.equals(str2)) {
/* 50 */                return false;
                    }
/* 31 */            if (this.I00000oOI != i1lO0lOlOIi.I00000oOI) {
/* 50 */                return false;
                    }
/* 33 */            int i = this.I0000Il00O;
/* 35 */            int i2 = i1lO0lOlOIi.I0000Il00O;
                    return i == 0 ? i2 == 0 : IIlIOloOOO.I00000oOI(i, i2);
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 8 */             int iHashCode = str == null ? 0 : str.hashCode();
/* 17 */            long j = this.I00000oOI;
/* 26 */            int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
/* 27 */            int i2 = this.I0000Il00O;
/* 36 */            return i ^ (i2 != 0 ? IIlIOloOOO.I001lIiIIo1O(i2) : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TokenResult{token=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", tokenExpirationTimestamp=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", responseCode=");
/* 28 */            int i = this.I0000Il00O;
/* 50 */            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
/* 55 */            sb.append("}");
/* 58 */            return sb.toString();
                }
            }

            package p000;
            
            public final class I1lI11 {
                public static final int I000O01llI0 = 0;
                public String I00000oIO;
                public int I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public long I0000oI00;
                public long I0001Ioi1lo;
                public String I000II;

                static {
/* 3 */             I1lI0iIOiOl i1lI0iIOiOl = new I1lI0iIOiOl();
/* 8 */             i1lI0iIOiOl.I0001Ioi1lo = 0L;
/* 14 */            byte b = (byte) (i1lI0iIOiOl.I000O01llI0 | 2);
/* 16 */            i1lI0iIOiOl.I00000oOI = 1;
/* 18 */            i1lI0iIOiOl.I0000oI00 = 0L;
/* 23 */            i1lI0iIOiOl.I000O01llI0 = (byte) (b | 1);
/* 25 */            i1lI0iIOiOl.I00000oIO();
                }

                public final I1lI0iIOiOl I00000oIO() {
/* 3 */             I1lI0iIOiOl i1lI0iIOiOl = new I1lI0iIOiOl();
/* 8 */             i1lI0iIOiOl.I00000oIO = this.I00000oIO;
/* 12 */            i1lI0iIOiOl.I00000oOI = this.I00000oOI;
/* 16 */            i1lI0iIOiOl.I0000Il00O = this.I0000Il00O;
/* 20 */            i1lI0iIOiOl.I0000O = this.I0000O;
/* 24 */            i1lI0iIOiOl.I0000oI00 = this.I0000oI00;
/* 28 */            i1lI0iIOiOl.I0001Ioi1lo = this.I0001Ioi1lo;
/* 32 */            i1lI0iIOiOl.I000II = this.I000II;
/* 35 */            i1lI0iIOiOl.I000O01llI0 = (byte) 3;
/* 113 */           return i1lI0iIOiOl;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 96 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1lI11)) {
/* 98 */                return false;
                    }
/* 8 */             I1lI11 i1lI11 = (I1lI11) obj;
/* 10 */            String str = this.I00000oIO;
/* 12 */            String str2 = i1lI11.I00000oIO;
/* 14 */            if (str == null) {
/* 16 */                if (str2 != null) {
/* 98 */                    return false;
                        }
                    } else if (!str.equals(str2)) {
/* 98 */                return false;
                    }
/* 33 */            if (!IIlIOloOOO.I00000oOI(this.I00000oOI, i1lI11.I00000oOI)) {
/* 98 */                return false;
                    }
/* 35 */            String str3 = this.I0000Il00O;
/* 37 */            String str4 = i1lI11.I0000Il00O;
/* 39 */            if (str3 == null) {
/* 41 */                if (str4 != null) {
/* 98 */                    return false;
                        }
                    } else if (!str3.equals(str4)) {
/* 98 */                return false;
                    }
/* 50 */            String str5 = this.I0000O;
/* 52 */            String str6 = i1lI11.I0000O;
/* 54 */            if (str5 == null) {
/* 56 */                if (str6 != null) {
/* 98 */                    return false;
                        }
                    } else if (!str5.equals(str6)) {
/* 98 */                return false;
                    }
/* 71 */            if (this.I0000oI00 != i1lI11.I0000oI00 || this.I0001Ioi1lo != i1lI11.I0001Ioi1lo) {
/* 98 */                return false;
                    }
/* 81 */            String str7 = this.I000II;
/* 83 */            String str8 = i1lI11.I000II;
                    return str7 == null ? str8 == null : str7.equals(str8);
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 24 */            int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ IIlIOloOOO.I001lIiIIo1O(this.I00000oOI)) * 1000003;
/* 25 */            String str2 = this.I0000Il00O;
/* 36 */            int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
/* 37 */            String str3 = this.I0000O;
/* 48 */            int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
/* 49 */            long j = this.I0000oI00;
/* 58 */            int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
/* 59 */            long j2 = this.I0001Ioi1lo;
/* 66 */            int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
/* 67 */            String str4 = this.I000II;
/* 76 */            return i2 ^ (str4 != null ? str4.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", registrationStatus=");
/* 18 */            int i = this.I00000oOI;
/* 52 */            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
/* 57 */            sb.append(", authToken=");
/* 62 */            sb.append(this.I0000Il00O);
/* 67 */            sb.append(", refreshToken=");
/* 72 */            sb.append(this.I0000O);
/* 77 */            sb.append(", expiresInSecs=");
/* 82 */            sb.append(this.I0000oI00);
/* 87 */            sb.append(", tokenCreationEpochInSecs=");
/* 92 */            sb.append(this.I0001Ioi1lo);
/* 97 */            sb.append(", fisError=");
/* 104 */           return IIl001iO0Io.I00100l0(sb, this.I000II, "}");
                }
            }

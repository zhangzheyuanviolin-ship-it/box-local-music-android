            package p000;

            import java.util.ArrayList;
            
            public final class I1l11OoIO extends O1I1101oiOi {
                public long I00000oIO;
                public long I00000oOI;
                public I1ioi0IooiO0 I0000Il00O;
                public Integer I0000O;
                public String I0000oI00;
                public ArrayList I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 86 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1I1101oiOi)) {
/* 88 */                return false;
                    }
/* 12 */            I1l11OoIO i1l11OoIO = (I1l11OoIO) ((O1I1101oiOi) obj);
/* 18 */            if (this.I00000oIO != i1l11OoIO.I00000oIO || this.I00000oOI != i1l11OoIO.I00000oOI || !this.I0000Il00O.equals(i1l11OoIO.I0000Il00O)) {
/* 88 */                return false;
                    }
/* 38 */            Integer num = this.I0000O;
/* 40 */            Integer num2 = i1l11OoIO.I0000O;
/* 42 */            if (num == null) {
/* 44 */                if (num2 != null) {
/* 88 */                    return false;
                        }
                    } else if (!num.equals(num2)) {
/* 88 */                return false;
                    }
/* 53 */            String str = this.I0000oI00;
/* 55 */            String str2 = i1l11OoIO.I0000oI00;
/* 57 */            if (str == null) {
/* 59 */                if (str2 != null) {
/* 88 */                    return false;
                        }
                    } else if (!str.equals(str2)) {
/* 88 */                return false;
                    }
/* 76 */            if (!this.I0001Ioi1lo.equals(i1l11OoIO.I0001Ioi1lo)) {
/* 88 */                return false;
                    }
/* 78 */            Object obj2 = OOiiiloIIil0.I00iOIl;
                    return obj2.equals(obj2);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 14 */            long j2 = this.I00000oOI;
/* 30 */            int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003;
/* 31 */            Integer num = this.I0000O;
/* 43 */            int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
/* 44 */            String str = this.I0000oI00;
/* 69 */            return ((this.I0001Ioi1lo.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ OOiiiloIIil0.I00iOIl.hashCode();
                }

                public final String toString() {
/* 78 */            return "LogRequest{requestTimeMs=" + this.I00000oIO + ", requestUptimeMs=" + this.I00000oOI + ", clientInfo=" + this.I0000Il00O + ", logSource=" + this.I0000O + ", logSourceName=" + this.I0000oI00 + ", logEvents=" + this.I0001Ioi1lo + ", qosTier=" + OOiiiloIIil0.I00iOIl + "}";
                }
            }

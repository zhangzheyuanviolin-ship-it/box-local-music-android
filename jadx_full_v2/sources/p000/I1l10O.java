            package p000;

            import java.util.Arrays;
            
            public final class I1l10O extends O1I0ll0i {
                public long I00000oIO;
                public Integer I00000oOI;
                public long I0000Il00O;
                public byte[] I0000O;
                public String I0000oI00;
                public long I0001Ioi1lo;
                public OIIO0OOO I000II;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof O1I0ll0i) {
/* 10 */                O1I0ll0i o1I0ll0i = (O1I0ll0i) obj;
/* 15 */                I1l10O i1l10O = (I1l10O) o1I0ll0i;
/* 21 */                if (this.I00000oIO == i1l10O.I00000oIO) {
/* 23 */                    Integer num = this.I00000oOI;
/* 25 */                    Integer num2 = i1l10O.I00000oOI;
/* 27 */                    if (num != null ? num.equals(num2) : num2 == null) {
/* 44 */                        if (this.I0000Il00O == i1l10O.I0000Il00O) {
/* 63 */                            if (Arrays.equals(this.I0000O, o1I0ll0i instanceof I1l10O ? ((I1l10O) o1I0ll0i).I0000O : i1l10O.I0000O)) {
/* 65 */                                String str = this.I0000oI00;
/* 67 */                                String str2 = i1l10O.I0000oI00;
/* 69 */                                if (str != null ? str.equals(str2) : str2 == null) {
/* 86 */                                    if (this.I0001Ioi1lo == i1l10O.I0001Ioi1lo) {
/* 88 */                                        OIIO0OOO oiio0ooo = this.I000II;
/* 90 */                                        OIIO0OOO oiio0ooo2 = i1l10O.I000II;
/* 92 */                                        if (oiio0ooo != null ? oiio0ooo.equals(oiio0ooo2) : oiio0ooo2 == null) {
/* 1 */                                             return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 13 */            int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
/* 14 */            Integer num = this.I00000oOI;
/* 21 */            int iHashCode = num == null ? 0 : num.hashCode();
/* 27 */            long j2 = this.I0000Il00O;
/* 42 */            int iHashCode2 = (((((i ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.I0000O)) * 1000003;
/* 43 */            String str = this.I0000oI00;
/* 49 */            int iHashCode3 = str == null ? 0 : str.hashCode();
/* 55 */            long j3 = this.I0001Ioi1lo;
/* 62 */            int i2 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
/* 63 */            OIIO0OOO oiio0ooo = this.I000II;
/* 72 */            return i2 ^ (oiio0ooo != null ? oiio0ooo.hashCode() : 0);
                }

                public final String toString() {
/* 82 */            return "LogEvent{eventTimeMs=" + this.I00000oIO + ", eventCode=" + this.I00000oOI + ", eventUptimeMs=" + this.I0000Il00O + ", sourceExtension=" + Arrays.toString(this.I0000O) + ", sourceExtensionJsonProto3=" + this.I0000oI00 + ", timezoneOffsetSeconds=" + this.I0001Ioi1lo + ", networkConnectionInfo=" + this.I000II + "}";
                }
            }

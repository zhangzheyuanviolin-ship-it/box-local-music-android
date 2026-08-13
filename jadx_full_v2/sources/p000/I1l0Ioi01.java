            package p000;

            import java.util.HashMap;
            
            public final class I1l0Ioi01 {
                public String I00000oIO;
                public Integer I00000oOI;
                public Il01oOi I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public HashMap I0001Ioi1lo;

                public final String I00000oIO(String str) {
/* 7 */             String str2 = (String) this.I0001Ioi1lo.get(str);
                    return str2 == null ? "" : str2;
                }

                public final int I00000oOI(String str) {
/* 7 */             String str2 = (String) this.I0001Ioi1lo.get(str);
/* 9 */             if (str2 == null) {
/* 11 */                return 0;
                    }
/* 17 */            return Integer.valueOf(str2).intValue();
                }

                public final I0Oi111ii I0000Il00O() {
/* 4 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(2);
/* 7 */             String str = this.I00000oIO;
/* 10 */            if (str == null) {
/* 58 */                IOOlIIilOl0.I000II("Null transportName");
/* 9 */                 return null;
                    }
/* 12 */            i0Oi111ii.I00iiI = str;
/* 16 */            i0Oi111ii.I00iiO = this.I00000oOI;
/* 18 */            Il01oOi il01oOi = this.I0000Il00O;
/* 20 */            if (il01oOi == null) {
/* 52 */                IOOlIIilOl0.I000II("Null encodedPayload");
/* 9 */                 return null;
                    }
/* 22 */            i0Oi111ii.I00iio = il01oOi;
/* 30 */            i0Oi111ii.I00ilI0I1 = Long.valueOf(this.I0000O);
/* 38 */            i0Oi111ii.I00ilO0 = Long.valueOf(this.I0000oI00);
/* 47 */            i0Oi111ii.I00io1l = new HashMap(this.I0001Ioi1lo);
/* 49 */            return i0Oi111ii;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 71 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1l0Ioi01)) {
/* 73 */                return false;
                    }
/* 8 */             I1l0Ioi01 i1l0Ioi01 = (I1l0Ioi01) obj;
/* 18 */            if (!this.I00000oIO.equals(i1l0Ioi01.I00000oIO)) {
/* 73 */                return false;
                    }
/* 20 */            Integer num = this.I00000oOI;
/* 22 */            Integer num2 = i1l0Ioi01.I00000oOI;
/* 24 */            if (num == null) {
/* 26 */                if (num2 != null) {
/* 73 */                    return false;
                        }
                    } else if (!num.equals(num2)) {
/* 73 */                return false;
                    }
                    return this.I0000Il00O.equals(i1l0Ioi01.I0000Il00O) && this.I0000O == i1l0Ioi01.I0000O && this.I0000oI00 == i1l0Ioi01.I0000oI00 && this.I0001Ioi1lo.equals(i1l0Ioi01.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.I00000oIO.hashCode() ^ 1000003) * 1000003;
/* 12 */            Integer num = this.I00000oOI;
/* 31 */            int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003;
/* 32 */            long j = this.I0000O;
/* 41 */            int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
/* 42 */            long j2 = this.I0000oI00;
/* 56 */            return this.I0001Ioi1lo.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
                }

                public final String toString() {
/* 68 */            return "EventInternal{transportName=" + this.I00000oIO + ", code=" + this.I00000oOI + ", encodedPayload=" + this.I0000Il00O + ", eventMillis=" + this.I0000O + ", uptimeMillis=" + this.I0000oI00 + ", autoMetadata=" + this.I0001Ioi1lo + "}";
                }
            }

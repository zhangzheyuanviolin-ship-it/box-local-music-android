            package p000;
            
            public final class I1l1l10IOiI extends OIIO0OOO {
                public OIIO0Iilo1O0 I00000oIO;
                public OIIO00i1 I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof OIIO0OOO) {
/* 10 */                OIIO0OOO oiio0ooo = (OIIO0OOO) obj;
/* 12 */                OIIO0Iilo1O0 oIIO0Iilo1O0 = this.I00000oIO;
/* 14 */                if (oIIO0Iilo1O0 != null ? oIIO0Iilo1O0.equals(((I1l1l10IOiI) oiio0ooo).I00000oIO) : ((I1l1l10IOiI) oiio0ooo).I00000oIO == null) {
/* 35 */                    OIIO00i1 oIIO00i1 = this.I00000oOI;
/* 37 */                    if (oIIO00i1 != null ? oIIO00i1.equals(((I1l1l10IOiI) oiio0ooo).I00000oOI) : ((I1l1l10IOiI) oiio0ooo).I00000oOI == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             OIIO0Iilo1O0 oIIO0Iilo1O0 = this.I00000oIO;
/* 16 */            int iHashCode = ((oIIO0Iilo1O0 == null ? 0 : oIIO0Iilo1O0.hashCode()) ^ 1000003) * 1000003;
/* 17 */            OIIO00i1 oIIO00i1 = this.I00000oOI;
/* 26 */            return iHashCode ^ (oIIO00i1 != null ? oIIO00i1.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "NetworkConnectionInfo{networkType=" + this.I00000oIO + ", mobileSubtype=" + this.I00000oOI + "}";
                }
            }

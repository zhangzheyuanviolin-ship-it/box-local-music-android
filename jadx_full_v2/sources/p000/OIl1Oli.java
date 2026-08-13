            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            
            public final class OIl1Oli {
                public ArrayList I00000oIO;
                public LinkedHashMap I00000oOI;
                public I0oiIOi00lo1 I0000Il00O;
                public LinkedHashMap I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof OIl1Oli)) {
/* 54 */                return false;
                    }
/* 9 */             OIl1Oli oIl1Oli = (OIl1Oli) obj;
                    return this.I00000oIO.equals(oIl1Oli.I00000oIO) && this.I00000oOI.equals(oIl1Oli.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oIl1Oli.I0000Il00O) && this.I0000O.equals(oIl1Oli.I0000O);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            I0oiIOi00lo1 i0oiIOi00lo1 = this.I0000Il00O;
/* 37 */            return this.I0000O.hashCode() + ((iHashCode + (i0oiIOi00lo1 == null ? 0 : i0oiIOi00lo1.hashCode())) * 31);
                }

                public final String toString() {
/* 48 */            return "OutputConfigurations(all=" + this.I00000oIO + ", deferred=" + this.I00000oOI + ", postviewOutput=" + this.I0000Il00O + ", outputSurfaceMap=" + this.I0000O + ')';
                }
            }

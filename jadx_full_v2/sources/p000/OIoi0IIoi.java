            package p000;

            import java.io.Serializable;
            
            public final class OIoi0IIoi implements Serializable {
                public final Object I00iOIl;
                public final Object I00iiI;

                public OIoi0IIoi(Object obj, Object obj2) {
/* 4 */             this.I00iOIl = obj;
/* 6 */             this.I00iiI = obj2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OIoi0IIoi)) {
/* 7 */                 return false;
                    }
/* 11 */            OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) obj;
                    return O0000Ioio00.I0000O(this.I00iOIl, oIoi0IIoi.I00iOIl) && O0000Ioio00.I0000O(this.I00iiI, oIoi0IIoi.I00iiI);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.I00iOIl;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            Object obj2 = this.I00iiI;
/* 23 */            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "(" + this.I00iOIl + ", " + this.I00iiI + ')';
                }
            }

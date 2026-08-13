            package p000;

            import java.io.Serializable;
            
            public final class OoIlOii implements Serializable {
                public final Object I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;

                public OoIlOii(Object obj, Object obj2, Object obj3) {
/* 4 */             this.I00iOIl = obj;
/* 6 */             this.I00iiI = obj2;
/* 8 */             this.I00iiO = obj3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OoIlOii)) {
/* 7 */                 return false;
                    }
/* 11 */            OoIlOii ooIlOii = (OoIlOii) obj;
                    return O0000Ioio00.I0000O(this.I00iOIl, ooIlOii.I00iOIl) && O0000Ioio00.I0000O(this.I00iiI, ooIlOii.I00iiI) && O0000Ioio00.I0000O(this.I00iiO, ooIlOii.I00iiO);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.I00iOIl;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            Object obj2 = this.I00iiI;
/* 25 */            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
/* 27 */            Object obj3 = this.I00iiO;
/* 36 */            return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
                }

                public final String toString() {
/* 36 */            return "(" + this.I00iOIl + ", " + this.I00iiI + ", " + this.I00iiO + ')';
                }
            }

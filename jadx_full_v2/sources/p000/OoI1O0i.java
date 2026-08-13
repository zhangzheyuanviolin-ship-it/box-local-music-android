            package p000;
            
            public final class OoI1O0i implements OoI1O01lI {
                public final Object I00000oIO;
                public final Object I00000oOI;

                public OoI1O0i(Object obj, Object obj2) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
                }

                @Override
                public final Object I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final Object I0000oI00() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OoI1O01lI)) {
/* 33 */                return false;
                    }
/* 5 */             OoI1O01lI ooI1O01lI = (OoI1O01lI) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooI1O01lI.I00000oOI()) && O0000Ioio00.I0000O(this.I00000oOI, ooI1O01lI.I0000oI00());
                }

                public final int hashCode() {
/* 2 */             Object obj = this.I00000oIO;
/* 12 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
/* 14 */            Object obj2 = this.I00000oOI;
/* 22 */            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
                }
            }

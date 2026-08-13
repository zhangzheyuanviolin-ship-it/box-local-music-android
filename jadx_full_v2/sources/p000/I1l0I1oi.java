            package p000;
            
            public final class I1l0I1oi extends Il10IiOO {
                public final Object I00000oIO;
                public final OOIio1010OoO I00000oOI;
                public final I1lIioOOIIl I0000Il00O;

                public I1l0I1oi(Object obj, OOIio1010OoO oOIio1010OoO, I1lIioOOIIl i1lIioOOIIl) {
/* 4 */             if (obj == null) {
/* 15 */                IOOlIIilOl0.I000II("Null payload");
/* 98 */                throw null;
                    }
/* 6 */             this.I00000oIO = obj;
/* 8 */             this.I00000oOI = oOIio1010OoO;
/* 10 */            this.I0000Il00O = i1lIioOOIIl;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 47 */                return true;
                    }
/* 6 */             if (!(obj instanceof Il10IiOO)) {
/* 49 */                return false;
                    }
/* 10 */            I1l0I1oi i1l0I1oi = (I1l0I1oi) ((Il10IiOO) obj);
/* 20 */            if (!this.I00000oIO.equals(i1l0I1oi.I00000oIO) || !this.I00000oOI.equals(i1l0I1oi.I00000oOI)) {
/* 49 */                return false;
                    }
/* 32 */            I1lIioOOIIl i1lIioOOIIl = i1l0I1oi.I0000Il00O;
/* 34 */            I1lIioOOIIl i1lIioOOIIl2 = this.I0000Il00O;
                    return i1lIioOOIIl2 == null ? i1lIioOOIIl == null : i1lIioOOIIl2.equals(i1lIioOOIIl);
                }

                public final int hashCode() {
/* 21 */            int iHashCode = ((((1000003 * 1000003) ^ this.I00000oIO.hashCode()) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003;
/* 22 */            I1lIioOOIIl i1lIioOOIIl = this.I0000Il00O;
/* 32 */            return (i1lIioOOIIl == null ? 0 : i1lIioOOIIl.hashCode()) ^ iHashCode;
                }

                public final String toString() {
/* 38 */            return "Event{code=null, payload=" + this.I00000oIO + ", priority=" + this.I00000oOI + ", productData=" + this.I0000Il00O + "}";
                }
            }

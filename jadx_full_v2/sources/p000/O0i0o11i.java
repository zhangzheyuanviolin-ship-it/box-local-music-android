            package p000;
            
            public final class O0i0o11i {
                public static final O0i0o11i I0000Il00O = new O0i0o11i(null, null);
                public final O0i0ol1o I00000oIO;
                public final O0i0iioIlO I00000oOI;

                public O0i0o11i(O0i0ol1o o0i0ol1o, O0i0iioIlO o0i0iioIlO) {
/* 4 */             this.I00000oIO = o0i0ol1o;
/* 6 */             this.I00000oOI = o0i0iioIlO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0i0o11i)) {
/* 7 */                 return false;
                    }
/* 11 */            O0i0o11i o0i0o11i = (O0i0o11i) obj;
                    return this.I00000oIO == o0i0o11i.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o0i0o11i.I00000oOI);
                }

                public final int hashCode() {
/* 2 */             O0i0ol1o o0i0ol1o = this.I00000oIO;
/* 12 */            int iHashCode = (o0i0ol1o == null ? 0 : o0i0ol1o.hashCode()) * 31;
/* 14 */            O0i0iioIlO o0i0iioIlO = this.I00000oOI;
/* 23 */            return iHashCode + (o0i0iioIlO != null ? o0i0iioIlO.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "KmTypeProjection(variance=" + this.I00000oIO + ", type=" + this.I00000oOI + ')';
                }
            }

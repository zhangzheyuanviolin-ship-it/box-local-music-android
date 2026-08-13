            package p000;
            
            public final class O0i01II {
                public O0i0iioIlO I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0i01II)) {
/* 32 */                return false;
                    }
/* 9 */             O0i01II o0i01II = (O0i01II) obj;
                    return this.I00000oIO.equals(o0i01II.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o0i01II.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 19 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", typeFlexibilityId=");
/* 22 */            return IlIi0I0.I000oI1ioi(sb, this.I00000oOI, ')');
                }
            }

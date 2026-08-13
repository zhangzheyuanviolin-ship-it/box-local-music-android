            package p000;
            
            public final class Ii1I0iO000o {
                public long I00000oIO;
                public float I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ii1I0iO000o)) {
/* 7 */                 return false;
                    }
/* 11 */            Ii1I0iO000o ii1I0iO000o = (Ii1I0iO000o) obj;
                    return this.I00000oIO == ii1I0iO000o.I00000oIO && Float.compare(this.I00000oOI, ii1I0iO000o.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Long.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "DataPointAtTime(time=" + this.I00000oIO + ", dataPoint=" + this.I00000oOI + ")";
                }
            }

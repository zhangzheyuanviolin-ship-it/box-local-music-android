            package p000;
            
            public final class Io1ilii01l {
                public OOo0IO I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 51 */                return true;
                    }
/* 6 */             if (!(obj instanceof Io1ilii01l)) {
/* 49 */                return false;
                    }
/* 11 */            Io1ilii01l io1ilii01l = (Io1ilii01l) obj;
                    return this.I00000oIO.equals(io1ilii01l.I00000oIO) && this.I00000oOI == io1ilii01l.I00000oOI && this.I0000Il00O == io1ilii01l.I0000Il00O && this.I0000O == io1ilii01l.I0000O && this.I0000oI00 == io1ilii01l.I0000oI00;
                }

                public final int hashCode() {
/* 34 */            return Boolean.hashCode(this.I0000oI00) + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
                }

                public final String toString() {
/* 58 */            return "HingeInfo(bounds=" + this.I00000oIO + ", isFlat=" + this.I00000oOI + ", isVertical=" + this.I0000Il00O + ", isSeparating=" + this.I0000O + ", isOccluding=" + this.I0000oI00 + ')';
                }
            }

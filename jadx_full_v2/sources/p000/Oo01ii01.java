            package p000;
            
            public final class Oo01ii01 extends lOl0oo {
                public I0iol11I1OI I00000oIO;
                public I0iol11I1OI I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oo01ii01)) {
/* 32 */                return false;
                    }
/* 9 */             Oo01ii01 oo01ii01 = (Oo01ii01) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo01ii01.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo01ii01.I00000oOI);
                }

                public final int hashCode() {
/* 23 */            return this.I00000oOI.hashCode() + ((this.I00000oIO.hashCode() + (Boolean.hashCode(false) * 31)) * 31);
                }

                public final String toString() {
/* 28 */            return "Inside(isAlwaysMinimized=false, minimizedAlignment=" + this.I00000oIO + ", expandedAlignment=" + this.I00000oOI + ")";
                }
            }

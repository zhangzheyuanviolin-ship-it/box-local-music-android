            package p000;
            
            public final class OI0IOO0iO0Oo {
                public final long I00000oIO;
                public final long I00000oOI;
                public final boolean I0000Il00O;

                public OI0IOO0iO0Oo(long j, long j2, boolean z) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = z;
                }

                public final OI0IOO0iO0Oo I00000oIO(OI0IOO0iO0Oo oI0IOO0iO0Oo) {
/* 21 */            return new OI0IOO0iO0Oo(OIOlIiiioi.I000II(this.I00000oIO, oI0IOO0iO0Oo.I00000oIO), Math.max(this.I00000oOI, oI0IOO0iO0Oo.I00000oOI), this.I0000Il00O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 39 */                return true;
                    }
/* 6 */             if (!(obj instanceof OI0IOO0iO0Oo)) {
/* 37 */                return false;
                    }
/* 9 */             OI0IOO0iO0Oo oI0IOO0iO0Oo = (OI0IOO0iO0Oo) obj;
                    return OIOlIiiioi.I0000O(this.I00000oIO, oI0IOO0iO0Oo.I00000oIO) && this.I00000oOI == oI0IOO0iO0Oo.I00000oOI && this.I0000Il00O == oI0IOO0iO0Oo.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Boolean.hashCode(this.I0000Il00O) + IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 42 */            return "MouseWheelScrollDelta(value=" + OIOlIiiioi.I000OOo1O(this.I00000oIO) + ", timeMillis=" + this.I00000oOI + ", shouldApplyImmediately=" + this.I0000Il00O + ")";
                }
            }

            package p000;
            
            public final class OooI1i111oO {
                public I110ooool I00000oIO;
                public IioIllI11l0I I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OooI1i111oO)) {
/* 33 */                return false;
                    }
/* 10 */            OooI1i111oO oooI1i111oO = (OooI1i111oO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oooI1i111oO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oooI1i111oO.I00000oOI);
                }

                public final int hashCode() {
/* 23 */            return Integer.hashCode(0) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 28 */            return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.I00000oIO + ", easing=" + this.I00000oOI + ", arcMode=ArcMode(value=0))";
                }
            }

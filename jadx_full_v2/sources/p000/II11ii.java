            package p000;
            
            public final class II11ii {
                public I0oO00o I00000oIO = null;
                public I0lIooIo1 I00000oOI = null;
                public IIolilIo I0000Il00O = null;
                public I0ol0lI I0000O = null;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof II11ii)) {
/* 54 */                return false;
                    }
/* 9 */             II11ii iI11ii = (II11ii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iI11ii.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iI11ii.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iI11ii.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iI11ii.I0000O);
                }

                public final int hashCode() {
/* 1 */             I0oO00o i0oO00o = this.I00000oIO;
/* 12 */            int iHashCode = (i0oO00o == null ? 0 : i0oO00o.hashCode()) * 31;
/* 14 */            I0lIooIo1 i0lIooIo1 = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (i0lIooIo1 == null ? 0 : i0lIooIo1.hashCode())) * 31;
/* 27 */            IIolilIo iIolilIo = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (iIolilIo == null ? 0 : iIolilIo.hashCode())) * 31;
/* 40 */            I0ol0lI i0ol0lI = this.I0000O;
/* 49 */            return iHashCode3 + (i0ol0lI != null ? i0ol0lI.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "BorderCache(imageBitmap=" + this.I00000oIO + ", canvas=" + this.I00000oOI + ", canvasDrawScope=" + this.I0000Il00O + ", borderPath=" + this.I0000O + ")";
                }
            }

            package p000;
            
            public abstract class IOOl0ll {
                public final String I00000oIO;
                public final long I00000oOI;
                public final int I0000Il00O;

                public IOOl0ll(int i, long j, String str) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I0000Il00O = i;
/* 15 */            if (str.length() == 0) {
/* 33 */                I000II.I000iOII("The name of a color space cannot be null and must contain at least 1 character");
/* 98 */                throw null;
                    }
/* 18 */            if (i < -1 || i > 63) {
/* 27 */                I000II.I000iOII("The id must be between -1 and 63");
/* 30 */                throw null;
                    }
                }

                public abstract float I00000oIO(int i);

                public abstract float I00000oOI(int i);

                public boolean I0000Il00O() {
/* 1 */             return false;
                }

                public abstract long I0000O(float f, float f2, float f3);

                public abstract float I0000oI00(float f, float f2, float f3);

                public abstract long I0001Ioi1lo(float f, float f2, float f3, float f4, IOOl0ll iOOl0ll);

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 47 */                return false;
                    }
/* 18 */            IOOl0ll iOOl0ll = (IOOl0ll) obj;
/* 24 */            if (this.I0000Il00O == iOOl0ll.I0000Il00O && this.I00000oIO.equals(iOOl0ll.I00000oIO)) {
/* 42 */                return iiO1i0O.I00000oIO(this.I00000oOI, iOOl0ll.I00000oOI);
                    }
/* 47 */            return false;
                }

                public int hashCode() {
/* 18 */            return IIlIOloOOO.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31) + this.I0000Il00O;
                }

                public final String toString() {
/* 37 */            return this.I00000oIO + " (id=" + this.I0000Il00O + ", model=" + iiO1i0O.I00000oOI(this.I00000oOI) + ")";
                }
            }

            package p000;
            
            public final class I0l0Iiil0 implements O1l0O0i1IOoI {
                public final II0O000iIl I00000oIO;
                public final II0O000iIl I00000oOI;

                public I0l0Iiil0(II0O000iIl iI0O000iIl, II0O000iIl iI0O000iIl2) {
/* 4 */             this.I00000oIO = iI0O000iIl;
/* 6 */             this.I00000oOI = iI0O000iIl2;
                }

                @Override
                public final int I00000oIO(IooO1IOlo iooO1IOlo, long j, int i) {
/* 8 */             int iI00000oIO = this.I00000oOI.I00000oIO(0, iooO1IOlo.I00000oOI());
/* 22 */            return iooO1IOlo.I00000oOI + iI00000oIO + (-this.I00000oIO.I00000oIO(0, i));
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0l0Iiil0)) {
/* 32 */                return false;
                    }
/* 9 */             I0l0Iiil0 i0l0Iiil0 = (I0l0Iiil0) obj;
                    return this.I00000oIO.equals(i0l0Iiil0.I00000oIO) && this.I00000oOI.equals(i0l0Iiil0.I00000oOI);
                }

                public final int hashCode() {
/* 19 */            return Float.hashCode(this.I00000oOI.I00000oIO) + (Float.hashCode(this.I00000oIO.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "Vertical(menuAlignment=" + this.I00000oIO + ", anchorAlignment=" + this.I00000oOI + ")";
                }
            }

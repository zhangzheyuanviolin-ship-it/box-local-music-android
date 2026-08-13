            package p000;
            
            public final class I0l0Ii0O implements O1l0Ii10I00l {
                public final II0IlloOiO0i I00000oIO;
                public final II0IlloOiO0i I00000oOI;

                public I0l0Ii0O(II0IlloOiO0i iI0IlloOiO0i, II0IlloOiO0i iI0IlloOiO0i2) {
/* 4 */             this.I00000oIO = iI0IlloOiO0i;
/* 6 */             this.I00000oOI = iI0IlloOiO0i2;
                }

                @Override
                public final int I00000oIO(IooO1IOlo iooO1IOlo, long j, int i, O0iOOoiioO o0iOOoiioO) {
/* 8 */             int iI00000oIO = this.I00000oOI.I00000oIO(0, iooO1IOlo.I0000O(), o0iOOoiioO);
/* 22 */            return iooO1IOlo.I00000oIO + iI00000oIO + (-this.I00000oIO.I00000oIO(0, i, o0iOOoiioO));
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0l0Ii0O)) {
/* 32 */                return false;
                    }
/* 9 */             I0l0Ii0O i0l0Ii0O = (I0l0Ii0O) obj;
                    return this.I00000oIO.equals(i0l0Ii0O.I00000oIO) && this.I00000oOI.equals(i0l0Ii0O.I00000oOI);
                }

                public final int hashCode() {
/* 19 */            return Float.hashCode(this.I00000oOI.I00000oIO) + (Float.hashCode(this.I00000oIO.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "Horizontal(menuAlignment=" + this.I00000oIO + ", anchorAlignment=" + this.I00000oOI + ")";
                }
            }

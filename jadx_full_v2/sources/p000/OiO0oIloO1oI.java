            package p000;
            
            public final class OiO0oIloO1oI {
                public final float I00000oIO;
                public final long I00000oOI;
                public final IlIoO1ilo1 I0000Il00O;

                public OiO0oIloO1oI(float f, long j, IlIoO1ilo1 ilIoO1ilo1) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I0000Il00O = ilIoO1ilo1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OiO0oIloO1oI)) {
/* 7 */                 return false;
                    }
/* 11 */            OiO0oIloO1oI oiO0oIloO1oI = (OiO0oIloO1oI) obj;
                    return Float.compare(this.I00000oIO, oiO0oIloO1oI.I00000oIO) == 0 && OoI0l01O.I00000oOI(this.I00000oOI, oiO0oIloO1oI.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oiO0oIloO1oI.I0000Il00O);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = Float.hashCode(this.I00000oIO) * 31;
/* 10 */            int i = OoI0l01O.I0000Il00O;
/* 24 */            return this.I0000Il00O.hashCode() + IIlIOloOOO.I0000O(this.I00000oOI, iHashCode, 31);
                }

                public final String toString() {
/* 42 */            return "Scale(scale=" + this.I00000oIO + ", transformOrigin=" + OoI0l01O.I0000oI00(this.I00000oOI) + ", animationSpec=" + this.I0000Il00O + ")";
                }
            }

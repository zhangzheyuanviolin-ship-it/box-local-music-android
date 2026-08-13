            package p000;
            
            public final class Olll1Oi {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;

                public Olll1Oi(float f, float f2, float f3) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof Olll1Oi)) {
/* 43 */                return false;
                    }
/* 9 */             Olll1Oi olll1Oi = (Olll1Oi) obj;
                    return Iil1010O.I0000Il00O(this.I00000oIO, olll1Oi.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, olll1Oi.I00000oOI) && Iil1010O.I0000Il00O(this.I0000Il00O, olll1Oi.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return Float.hashCode(this.I0000Il00O) + OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             float f = this.I00000oIO;
/* 3 */             String strI0000O = Iil1010O.I0000O(f);
/* 7 */             float f2 = this.I00000oOI;
/* 10 */            String strI0000O2 = Iil1010O.I0000O(f + f2);
/* 38 */            return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("TabPosition(left=", strI0000O, ", right=", strI0000O2, ", width="), Iil1010O.I0000O(f2), ", contentWidth=", Iil1010O.I0000O(this.I0000Il00O), ")");
                }
            }

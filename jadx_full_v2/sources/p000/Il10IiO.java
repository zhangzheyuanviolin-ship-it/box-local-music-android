            package p000;

            import android.util.Range;
            import android.util.Rational;
            
            public final class Il10IiO {
                public final boolean I00000oIO;
                public final int I00000oOI;
                public final Range I0000Il00O;
                public final Rational I0000O;

                public Il10IiO(boolean z, int i, Range range, Rational rational) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = range;
/* 10 */            this.I0000O = rational;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Il10IiO)) {
/* 7 */                 return false;
                    }
/* 11 */            Il10IiO il10IiO = (Il10IiO) obj;
                    return this.I00000oIO == il10IiO.I00000oIO && this.I00000oOI == il10IiO.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, il10IiO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, il10IiO.I0000O);
                }

                public final int hashCode() {
/* 30 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + IIl001iO0Io.I0000O(this.I00000oOI, Boolean.hashCode(this.I00000oIO) * 31, 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "EvCompValue(supported=" + this.I00000oIO + ", index=" + this.I00000oOI + ", range=" + this.I0000Il00O + ", step=" + this.I0000O + ')';
                }
            }

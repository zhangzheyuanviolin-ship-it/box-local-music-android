            package p000;
            
            public final class OOO01oo {
                public static final OOO01oo I0000O = new OOO01oo(0.0f, lIiioliIlo.I0001Ioi1lo(0.0f, 0.0f), 0);
                public final float I00000oIO;
                public final IOO1O00oI I00000oOI;
                public final int I0000Il00O;

                public OOO01oo(float f, IOO1O00oI iOO1O00oI, int i) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = iOO1O00oI;
/* 8 */             this.I0000Il00O = i;
/* 14 */            if (Float.isNaN(f)) {
/* 19 */                I000II.I000iOII("current must not be NaN");
/* 98 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOO01oo)) {
/* 7 */                 return false;
                    }
/* 11 */            OOO01oo oOO01oo = (OOO01oo) obj;
                    return this.I00000oIO == oOO01oo.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oOO01oo.I00000oOI) && this.I0000Il00O == oOO01oo.I0000Il00O;
                }

                public final int hashCode() {
/* 20 */            return ((this.I00000oOI.hashCode() + (Float.hashCode(this.I00000oIO) * 31)) * 31) + this.I0000Il00O;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", range=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", steps=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, ")", sb);
                }
            }

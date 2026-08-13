            package p000;
            
            public final class Io1IIIi01 {
                public final II1i0o0 I00000oIO;
                public final I0OooiI1I I00000oOI;
                public final IIlIi0lIii I0000Il00O;

                public Io1IIIi01(II1i0o0 iI1i0o0, I0OooiI1I i0OooiI1I, IIlIi0lIii iIlIi0lIii) {
/* 4 */             this.I00000oIO = iI1i0o0;
/* 6 */             this.I00000oOI = i0OooiI1I;
/* 8 */             this.I0000Il00O = iIlIi0lIii;
/* 15 */            if (iI1i0o0.I00000oOI() == 0 && iI1i0o0.I00000oIO() == 0) {
/* 26 */                I000II.I000iOII("Bounds must be non zero");
/* 29 */                throw null;
                    }
/* 32 */            if (iI1i0o0.I00000oIO == 0 || iI1i0o0.I00000oOI == 0) {
/* 98 */                return;
                    }
/* 41 */            I000II.I000iOII("Bounding rectangle must start at the top or left window edge for folding features");
/* 44 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (Io1IIIi01.class.equals(obj != null ? obj.getClass() : null)) {
/* 23 */                Io1IIIi01 io1IIIi01 = (Io1IIIi01) obj;
                        return this.I00000oIO.equals(io1IIIi01.I00000oIO) && this.I00000oOI == io1IIIi01.I00000oOI && this.I0000Il00O == io1IIIi01.I0000Il00O;
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 47 */            return Io1IIIi01.class.getSimpleName() + " { " + this.I00000oIO + ", type=" + this.I00000oOI + ", state=" + this.I0000Il00O + " }";
                }
            }

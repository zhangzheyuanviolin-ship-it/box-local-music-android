            package p000;
            
/* 8 */     public final class IOi0OoOOIlli implements Iioi1O {
                public final I1111OO10i I00000oIO;
                public final int I00000oOI;

                public IOi0OoOOIlli(String str, int i) {
/* 6 */             this(new I1111OO10i(str), i);
                }

                @Override
                public final void I00000oIO(Oo0olliOi1 oo0olliOi1) {
/* 1 */             int i = oo0olliOi1.I0000O;
/* 3 */             I1111OO10i i1111OO10i = this.I00000oIO;
/* 6 */             if (i != -1) {
/* 12 */                oo0olliOi1.I0000O(i, oo0olliOi1.I0000oI00, i1111OO10i.I00iiI);
                    } else {
/* 22 */                oo0olliOi1.I0000O(oo0olliOi1.I00000oOI, oo0olliOi1.I0000Il00O, i1111OO10i.I00iiI);
                    }
/* 25 */            int i2 = oo0olliOi1.I00000oOI;
/* 27 */            int i3 = oo0olliOi1.I0000Il00O;
/* 29 */            int i4 = i2 == i3 ? i3 : -1;
/* 32 */            int i5 = this.I00000oOI;
/* 57 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - i1111OO10i.I00iiI.length(), 0, ((I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo).I000lI());
/* 61 */            oo0olliOi1.I0001Ioi1lo(iI0000Il00O, iI0000Il00O);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOi0OoOOIlli)) {
/* 7 */                 return false;
                    }
/* 15 */            IOi0OoOOIlli iOi0OoOOIlli = (IOi0OoOOIlli) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO.I00iiI, iOi0OoOOIlli.I00000oIO.I00iiI) && this.I00000oOI == iOi0OoOOIlli.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return (this.I00000oIO.I00iiI.hashCode() * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 30 */            return "CommitTextCommand(text='" + this.I00000oIO.I00iiI + "', newCursorPosition=" + this.I00000oOI + ")";
                }

/* 9 */         public IOi0OoOOIlli(I1111OO10i i1111OO10i, int i) {
                    this.I00000oIO = i1111OO10i;
                    this.I00000oOI = i;
                }
            }

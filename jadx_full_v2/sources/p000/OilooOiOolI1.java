            package p000;
            
            public final class OilooOiOolI1 implements Iioi1O {
                public final I1111OO10i I00000oIO;
                public final int I00000oOI;

                public OilooOiOolI1(String str, int i) {
/* 9 */             this.I00000oIO = new I1111OO10i(str);
/* 11 */            this.I00000oOI = i;
                }

                @Override
                public final void I00000oIO(Oo0olliOi1 oo0olliOi1) {
/* 3 */             String str = this.I00000oIO.I00iiI;
/* 5 */             int i = oo0olliOi1.I0000O;
/* 8 */             if (i != -1) {
/* 12 */                oo0olliOi1.I0000O(i, oo0olliOi1.I0000oI00, str);
/* 19 */                if (str.length() > 0) {
/* 26 */                    oo0olliOi1.I0000oI00(i, str.length() + i);
                        }
                    } else {
/* 30 */                int i2 = oo0olliOi1.I00000oOI;
/* 34 */                oo0olliOi1.I0000O(i2, oo0olliOi1.I0000Il00O, str);
/* 41 */                if (str.length() > 0) {
/* 48 */                    oo0olliOi1.I0000oI00(i2, str.length() + i2);
                        }
                    }
/* 51 */            int i3 = oo0olliOi1.I00000oOI;
/* 53 */            int i4 = oo0olliOi1.I0000Il00O;
/* 55 */            int i5 = i3 == i4 ? i4 : -1;
/* 58 */            int i6 = this.I00000oOI;
/* 81 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, ((I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo).I000lI());
/* 85 */            oo0olliOi1.I0001Ioi1lo(iI0000Il00O, iI0000Il00O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof OilooOiOolI1)) {
/* 32 */                return false;
                    }
/* 13 */            OilooOiOolI1 oilooOiOolI1 = (OilooOiOolI1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO.I00iiI, oilooOiOolI1.I00000oIO.I00iiI) && this.I00000oOI == oilooOiOolI1.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return (this.I00000oIO.I00iiI.hashCode() * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 30 */            return "SetComposingTextCommand(text='" + this.I00000oIO.I00iiI + "', newCursorPosition=" + this.I00000oOI + ")";
                }
            }

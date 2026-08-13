            package p000;
            
            public final class OiiO01I11iI {
                public final long I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public final Oo0iil0o0oI I0001Ioi1lo;

                public OiiO01I11iI(long j, int i, int i2, int i3, int i4, Oo0iil0o0oI oo0iil0o0oI) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
/* 10 */            this.I0000O = i3;
/* 12 */            this.I0000oI00 = i4;
/* 14 */            this.I0001Ioi1lo = oo0iil0o0oI;
                }

                public final OiiOOli I00000oIO(int i) {
/* 11 */            return new OiiOOli(lO1O0oll.I00000oIO(this.I0001Ioi1lo, i), i, this.I00000oIO);
                }

                public final Ii0OiIIl00OO I00000oOI() {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             int i2 = this.I0000O;
                    return i < i2 ? Ii0OiIIl00OO.I00iiI : i > i2 ? Ii0OiIIl00OO.I00iOIl : Ii0OiIIl00OO.I00iiO;
                }

                public final OiiOlI0I I0000Il00O(int i, int i2) {
/* 16 */            return new OiiOlI0I(I00000oIO(i), I00000oIO(i2), i > i2);
                }

                public final String toString() {
/* 1 */             Oo0iil0o0oI oo0iil0o0oI = this.I0001Ioi1lo;
/* 3 */             int i = this.I0000Il00O;
/* 5 */             Oi0il01O01IO oi0il01O01IOI00000oIO = lO1O0oll.I00000oIO(oo0iil0o0oI, i);
/* 9 */             int i2 = this.I0000O;
/* 72 */            return "SelectionInfo(id=" + this.I00000oIO + ", range=(" + i + "-" + oi0il01O01IOI00000oIO + "," + i2 + "-" + lO1O0oll.I00000oIO(oo0iil0o0oI, i2) + "), prevOffset=" + this.I0000oI00 + ")";
                }
            }

            package p000;
            
/* 27 */    public final class Ol0OlliioI0O implements Oiil1o0OIi {
                public final boolean I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final OiiOlI0I I0000O;
                public final OiiO01I11iI I0000oI00;

                public Ol0OlliioI0O(boolean z, int i, int i2, OiiOlI0I oiiOlI0I, OiiO01I11iI oiiO01I11iI) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
/* 10 */            this.I0000O = oiiOlI0I;
/* 12 */            this.I0000oI00 = oiiO01I11iI;
                }

                @Override
                public final boolean I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final OiiO01I11iI I00000oOI() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final OiiO01I11iI I0000Il00O(long j) {
/* 1 */             OiiO01I11iI oiiO01I11iI = this.I0000oI00;
/* 7 */             if (j == oiiO01I11iI.I00000oIO) {
/* 9 */                 return oiiO01I11iI;
                    }
/* 10 */            return null;
                }

                @Override
                public final OiiOlI0I I0000O() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final OiiO01I11iI I0000oI00() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final int I000II() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final OiiO01I11iI I000O01llI0() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Ii0OiIIl00OO I000OOo1O() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             int i2 = this.I0000Il00O;
                    return i < i2 ? Ii0OiIIl00OO.I00iiI : i > i2 ? Ii0OiIIl00OO.I00iOIl : this.I0000oI00.I00000oOI();
                }

                @Override
                public final OiiO01I11iI I000OiO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final int I000iOII() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final boolean I000l1(Oiil1o0OIi oiil1o0OIi) {
/* 3 */             if (this.I0000O == null || oiil1o0OIi == null || !(oiil1o0OIi instanceof Ol0OlliioI0O)) {
/* 58 */                return true;
                    }
/* 11 */            Ol0OlliioI0O ol0OlliioI0O = (Ol0OlliioI0O) oiil1o0OIi;
/* 17 */            if (this.I00000oOI != ol0OlliioI0O.I00000oOI || this.I0000Il00O != ol0OlliioI0O.I0000Il00O || this.I00000oIO != ol0OlliioI0O.I00000oIO) {
/* 58 */                return true;
                    }
/* 31 */            OiiO01I11iI oiiO01I11iI = ol0OlliioI0O.I0000oI00;
/* 33 */            OiiO01I11iI oiiO01I11iI2 = this.I0000oI00;
                    return (oiiO01I11iI2.I00000oIO == oiiO01I11iI.I00000oIO && oiiO01I11iI2.I0000Il00O == oiiO01I11iI.I0000Il00O && oiiO01I11iI2.I0000O == oiiO01I11iI.I0000O) ? false : true;
                }

                @Override
                public final OI0lli1 I000lI(OiiOlI0I oiiOlI0I) {
/* 1 */             boolean z = oiiOlI0I.I0000Il00O;
/* 3 */             OiiOOli oiiOOli = oiiOlI0I.I00000oOI;
/* 5 */             OiiOOli oiiOOli2 = oiiOlI0I.I00000oIO;
/* 7 */             if ((!z && oiiOOli2.I00000oOI > oiiOOli.I00000oOI) || (z && oiiOOli2.I00000oOI <= oiiOOli.I00000oOI)) {
/* 27 */                oiiOlI0I = OiiOlI0I.I00000oIO(oiiOlI0I, null, null, !z, 3);
                    }
/* 33 */            long j = this.I0000oI00.I00000oIO;
/* 35 */            OI0lli1 oI0lli1 = O1IO1IIIO0OO.I00000oIO;
/* 39 */            OI0lli1 oI0lli12 = new OI0lli1();
/* 42 */            oI0lli12.I000OOo1O(j, oiiOlI0I);
/* 77 */            return oI0lli12;
                }

                @Override
                public final int I000o00OoI0I() {
/* 1 */             return 1;
                }

                public final String toString() {
/* 40 */            return "SingleSelectionLayout(isStartHandle=" + this.I00000oIO + ", crossed=" + I000OOo1O() + ", info=\n\t" + this.I0000oI00 + ")";
                }

                @Override
/* 28 */        public final void I0001Ioi1lo(Iil1oo1 iil1oo1) {
                }
            }

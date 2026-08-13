            package p000;
            
            public final class Oii1O1l {
                public byte[] I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public OOo10l0o0IOO I0000O;
                public boolean I0000oI00 = false;
                public Oii1O1l I0001Ioi1lo;
                public Oii1O1l I000II;

                public Oii1O1l(byte[] bArr, int i, int i2, OOo10l0o0IOO oOo10l0o0IOO) {
/* 4 */             this.I00000oIO = bArr;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
/* 10 */            this.I0000O = oOo10l0o0IOO;
                }

                public final int I00000oIO() {
/* 5 */             return this.I0000Il00O - this.I00000oOI;
                }

                public final byte I00000oOI(int i) {
/* 6 */             return this.I00000oIO[this.I00000oOI + i];
                }

                public final void I0000Il00O(Oii1O1l oii1O1l) {
/* 1 */             oii1O1l.I000II = this;
/* 5 */             oii1O1l.I0001Ioi1lo = this.I0001Ioi1lo;
/* 7 */             Oii1O1l oii1O1l2 = this.I0001Ioi1lo;
/* 9 */             if (oii1O1l2 != null) {
/* 11 */                oii1O1l2.I000II = oii1O1l;
                    }
/* 13 */            this.I0001Ioi1lo = oii1O1l;
                }

                public final Oii1O1l I0000O() {
/* 1 */             OOo10l0o0IOO oOo10l0o0IOO = this.I0000O;
/* 3 */             if (oOo10l0o0IOO == null) {
/* 5 */                 Oii1O1l oii1O1l = Oii1iIoiil0o.I00000oIO;
/* 9 */                 oOo10l0o0IOO = new OOo10l0o0IOO();
/* 12 */                this.I0000O = oOo10l0o0IOO;
                    }
/* 14 */            byte[] bArr = this.I00000oIO;
/* 16 */            int i = this.I00000oOI;
/* 18 */            int i2 = this.I0000Il00O;
/* 22 */            OOo10l0o0IOO.I00000oOI.incrementAndGet(oOo10l0o0IOO);
/* 27 */            return new Oii1O1l(bArr, i, i2, oOo10l0o0IOO);
                }

                public final void I0000oI00(Oii1O1l oii1O1l, int i) {
/* 3 */             if (!oii1O1l.I0000oI00) {
/* 79 */                I000II.I001IO000("only owner can write");
/* 89 */                return;
                    }
/* 5 */             int i2 = oii1O1l.I0000Il00O;
/* 11 */            if (i2 + i > 8192) {
/* 13 */                OOo10l0o0IOO oOo10l0o0IOO = oii1O1l.I0000O;
/* 15 */                if (oOo10l0o0IOO != null && oOo10l0o0IOO.I00000oIO > 0) {
/* 22 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 25 */                    return;
                        }
/* 26 */                int i3 = oii1O1l.I0000Il00O;
/* 30 */                int i4 = oii1O1l.I00000oOI;
/* 33 */                if ((i3 + i) - i4 > 8192) {
/* 51 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 54 */                    return;
                        }
/* 35 */                byte[] bArr = oii1O1l.I00000oIO;
/* 37 */                I1IoiO1l.I000lI(bArr, bArr, i4, i3);
/* 44 */                i2 = oii1O1l.I0000Il00O - oii1O1l.I00000oOI;
/* 45 */                oii1O1l.I0000Il00O = i2;
/* 48 */                oii1O1l.I00000oOI = 0;
                    }
/* 55 */            byte[] bArr2 = this.I00000oIO;
/* 57 */            byte[] bArr3 = oii1O1l.I00000oIO;
/* 59 */            int i5 = this.I00000oOI;
/* 63 */            I1IoiO1l.I000OOo1O(bArr2, i2, bArr3, i5, i5 + i);
                    oii1O1l.I0000Il00O += i;
                    this.I00000oOI += i;
                }
            }

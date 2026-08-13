            package p000;
            
/* 15 */    public final class Oii1OOIOo {
                public final byte[] I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public final boolean I0000oI00;
                public Oii1OOIOo I0001Ioi1lo;
                public Oii1OOIOo I000II;

                public Oii1OOIOo() {
/* 8 */             this.I00000oIO = new byte[8192];
/* 11 */            this.I0000oI00 = true;
/* 14 */            this.I0000O = false;
                }

                public final Oii1OOIOo I00000oIO() {
/* 1 */             Oii1OOIOo oii1OOIOo = this.I0001Ioi1lo;
/* 8 */             Oii1OOIOo oii1OOIOo2 = oii1OOIOo != this ? oii1OOIOo : null;
/* 9 */             Oii1OOIOo oii1OOIOo3 = this.I000II;
/* 11 */            oii1OOIOo3.I0001Ioi1lo = oii1OOIOo;
/* 15 */            this.I0001Ioi1lo.I000II = oii1OOIOo3;
/* 17 */            this.I0001Ioi1lo = null;
/* 19 */            this.I000II = null;
/* 29 */            return oii1OOIOo2;
                }

                public final void I00000oOI(Oii1OOIOo oii1OOIOo) {
/* 1 */             oii1OOIOo.I000II = this;
/* 5 */             oii1OOIOo.I0001Ioi1lo = this.I0001Ioi1lo;
/* 9 */             this.I0001Ioi1lo.I000II = oii1OOIOo;
/* 11 */            this.I0001Ioi1lo = oii1OOIOo;
                }

                public final Oii1OOIOo I0000Il00O() {
/* 2 */             this.I0000O = true;
/* 12 */            return new Oii1OOIOo(this.I00000oIO, this.I00000oOI, this.I0000Il00O, true);
                }

                public final void I0000O(Oii1OOIOo oii1OOIOo, int i) {
/* 1 */             byte[] bArr = oii1OOIOo.I00000oIO;
/* 5 */             if (!oii1OOIOo.I0000oI00) {
/* 68 */                I000II.I001IO000("only owner can write");
/* 89 */                return;
                    }
/* 7 */             int i2 = oii1OOIOo.I0000Il00O;
/* 9 */             int i3 = i2 + i;
/* 13 */            if (i3 > 8192) {
/* 17 */                if (oii1OOIOo.I0000O) {
/* 42 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 45 */                    return;
                        }
/* 19 */                int i4 = oii1OOIOo.I00000oOI;
/* 22 */                if (i3 - i4 > 8192) {
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 41 */                    return;
                        }
/* 24 */                I1IoiO1l.I000lI(bArr, bArr, i4, i2);
/* 31 */                i2 = oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 32 */                oii1OOIOo.I0000Il00O = i2;
/* 35 */                oii1OOIOo.I00000oOI = 0;
                    }
/* 46 */            int i5 = this.I00000oOI;
/* 52 */            I1IoiO1l.I000OOo1O(this.I00000oIO, i2, bArr, i5, i5 + i);
                    oii1OOIOo.I0000Il00O += i;
                    this.I00000oOI += i;
                }

/* 16 */        public Oii1OOIOo(byte[] bArr, int i, int i2, boolean z) {
/* 18 */            this.I00000oIO = bArr;
/* 19 */            this.I00000oOI = i;
/* 20 */            this.I0000Il00O = i2;
/* 21 */            this.I0000O = z;
/* 22 */            this.I0000oI00 = false;
                }
            }

            package p000;
            
            public final class iOl1Oloi1i extends iOl1iiIll {
                public final byte[] I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;

                public iOl1Oloi1i(byte[] bArr, int i, int i2) {
/* 7 */             iOl1iiIll.I000lI(i, i + i2, bArr.length);
/* 10 */            this.I00iiO = bArr;
/* 12 */            this.I00iio = i;
/* 14 */            this.I00ilI0I1 = i2;
                }

                @Override
                public final byte I00000oOI(int i) {
/* 6 */             return this.I00iiO[this.I00iio + i];
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final iOl1iiIll I0000oI00(int i, int i2) {
/* 3 */             int iI000lI = iOl1iiIll.I000lI(i, i2, this.I00ilI0I1);
/* 7 */             if (iI000lI == 0) {
/* 9 */                 return iOl1iiIll.I00iiI;
                    }
/* 19 */            return new iOl1Oloi1i(this.I00iiO, this.I00iio + i, iI000lI);
                }

                @Override
                public final void I0001Ioi1lo(int i, byte[] bArr) {
/* 6 */             System.arraycopy(this.I00iiO, this.I00iio, bArr, 0, i);
                }

                @Override
                public final boolean I000OOo1O(iOl1iiIll iol1iiill) {
/* 1 */             boolean z = iol1iiill instanceof iOlI1l0li;
/* 3 */             if (!z && !(iol1iiill instanceof iOl1Oloi1i)) {
/* 10 */                return iol1iiill.I000OOo1O(this);
                    }
/* 15 */            int iI0000O = iol1iiill.I0000O();
/* 20 */            int i = this.I00ilI0I1;
/* 22 */            if (i > iI0000O) {
/* 120 */               OoOil11Ol1o.I0000O(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
/* 19 */                return false;
                    }
/* 28 */            if (i > iol1iiill.I0000O()) {
/* 74 */                int iI0000O2 = iol1iiill.I0000O();
/* 97 */                OoOil11Ol1o.I0000oI00(String.valueOf(i).length() + 27 + String.valueOf(iI0000O2).length(), i, iI0000O2);
/* 19 */                return false;
                    }
/* 30 */            byte[] bArr = this.I00iiO;
/* 32 */            int i2 = this.I00iio;
/* 34 */            if (z) {
/* 40 */                return iOl1iiIll.I000o00OoI0I(bArr, i2, ((iOlI1l0li) iol1iiill).I00iiO, 0, i);
                    }
/* 47 */            if (!(iol1iiill instanceof iOl1Oloi1i)) {
/* 69 */                return iol1iiill.I0000oI00(0, i).equals(I0000oI00(i2, i + i2));
                    }
/* 49 */            iOl1Oloi1i iol1oloi1i = (iOl1Oloi1i) iol1iiill;
/* 55 */            return iOl1iiIll.I000o00OoI0I(bArr, i2, iol1oloi1i.I00iiO, iol1oloi1i.I00iio, i);
                }

                @Override
                public final int I000OiO(int i, int i2) {
/* 5 */             return iOlilI1ill0.I00000oIO(i, this.I00iiO, this.I00iio, i2);
                }
            }

            package p000;

            import java.util.Arrays;
            
            public final class iOlI1l0li extends iOl1iiIll {
                public final byte[] I00iiO;

                public iOlI1l0li(byte[] bArr) {
/* 4 */             this.I00iiO = bArr;
                }

                @Override
                public final byte I00000oOI(int i) {
/* 3 */             return this.I00iiO[i];
                }

                @Override
                public final int I0000O() {
/* 3 */             return this.I00iiO.length;
                }

                @Override
                public final iOl1iiIll I0000oI00(int i, int i2) {
/* 1 */             byte[] bArr = this.I00iiO;
/* 5 */             int iI000lI = iOl1iiIll.I000lI(0, i2, bArr.length);
                    return iI000lI == 0 ? iOl1iiIll.I00iiI : new iOl1Oloi1i(bArr, 0, iI000lI);
                }

                @Override
                public final void I0001Ioi1lo(int i, byte[] bArr) {
/* 4 */             System.arraycopy(this.I00iiO, 0, bArr, 0, i);
                }

                @Override
                public final boolean I000OOo1O(iOl1iiIll iol1iiill) {
/* 1 */             boolean z = iol1iiill instanceof iOlI1l0li;
/* 3 */             byte[] bArr = this.I00iiO;
/* 5 */             if (z) {
/* 11 */                return Arrays.equals(bArr, ((iOlI1l0li) iol1iiill).I00iiO);
                    }
/* 16 */            boolean z2 = iol1iiill instanceof iOl1Oloi1i;
/* 18 */            if (!z2) {
/* 112 */               return iol1iiill.I000OOo1O(this);
                    }
/* 21 */            iOl1Oloi1i iol1oloi1i = (iOl1Oloi1i) iol1iiill;
/* 23 */            int i = iol1oloi1i.I00ilI0I1;
/* 25 */            int length = bArr.length;
/* 27 */            if (length > i) {
/* 108 */               OoOil11Ol1o.I0000O(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
/* 26 */                return false;
                    }
/* 29 */            if (length <= i) {
                        return z ? iOl1iiIll.I000o00OoI0I(bArr, 0, ((iOlI1l0li) iol1iiill).I00iiO, 0, length) : z2 ? iOl1iiIll.I000o00OoI0I(bArr, 0, iol1oloi1i.I00iiO, iol1oloi1i.I00iio, length) : iol1iiill.I0000oI00(0, length).equals(I0000oI00(0, length));
                    }
/* 85 */            OoOil11Ol1o.I0000oI00(String.valueOf(length).length() + 27 + String.valueOf(i).length(), length, i);
/* 26 */            return false;
                }

                @Override
                public final int I000OiO(int i, int i2) {
/* 4 */             return iOlilI1ill0.I00000oIO(i, this.I00iiO, 0, i2);
                }
            }

            package p000;

            import java.util.Arrays;
            
            public final class i1lI1O extends i1lI00ll111 {
                public final byte[] I00iiO;

                public i1lI1O(byte[] bArr) {
/* 4 */             bArr.getClass();
/* 7 */             this.I00iiO = bArr;
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
                public final i1lI00ll111 I0000oI00(int i, int i2) {
/* 1 */             byte[] bArr = this.I00iiO;
/* 5 */             int iI00100o1O0lo = i1lIIl01O.I00100o1O0lo(0, i2, bArr.length);
                    return iI00100o1O0lo == 0 ? i1lIIl01O.I00iiI : new i1l1Iilo0O(bArr, 0, iI00100o1O0lo);
                }

                @Override
                public final void I0001Ioi1lo(int i, byte[] bArr) {
/* 4 */             System.arraycopy(this.I00iiO, 0, bArr, 0, i);
                }

                @Override
                public final void I000OOo1O(i1lllO0 i1lllo0) {
/* 1 */             byte[] bArr = this.I00iiO;
/* 5 */             i1lllo0.I0000Il00O(bArr, 0, bArr.length);
                }

                @Override
                public final boolean I000OiO(i1lIIl01O i1liil01o) {
/* 1 */             boolean z = i1liil01o instanceof i1lI1O;
/* 3 */             byte[] bArr = this.I00iiO;
/* 5 */             if (z) {
/* 11 */                return Arrays.equals(bArr, ((i1lI1O) i1liil01o).I00iiO);
                    }
/* 16 */            boolean z2 = i1liil01o instanceof i1l1Iilo0O;
/* 18 */            if (!z2) {
/* 112 */               return i1liil01o.I000OiO(this);
                    }
/* 21 */            i1l1Iilo0O i1l1iilo0o = (i1l1Iilo0O) i1liil01o;
/* 23 */            int i = i1l1iilo0o.I00ilI0I1;
/* 25 */            int length = bArr.length;
/* 27 */            if (length > i) {
/* 108 */               OoOil11Ol1o.I0000O(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
/* 26 */                return false;
                    }
/* 29 */            if (length <= i) {
                        return z ? i1lIIl01O.I0010I0i(bArr, 0, ((i1lI1O) i1liil01o).I00iiO, 0, length) : z2 ? i1lIIl01O.I0010I0i(bArr, 0, i1l1iilo0o.I00iiO, i1l1iilo0o.I00iio, length) : i1liil01o.I0000oI00(0, length).equals(I0000oI00(0, length));
                    }
/* 85 */            OoOil11Ol1o.I0000oI00(String.valueOf(length).length() + 27 + String.valueOf(i).length(), length, i);
/* 26 */            return false;
                }

                @Override
                public final int I000iOII(int i, int i2) {
/* 4 */             return iI000IO.I00000oIO(i, this.I00iiO, 0, i2);
                }
            }

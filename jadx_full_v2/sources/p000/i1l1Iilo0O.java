            package p000;
            
            public final class i1l1Iilo0O extends i1lI00ll111 {
                public final byte[] I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;

                public i1l1Iilo0O(byte[] bArr, int i, int i2) {
/* 7 */             i1lIIl01O.I00100o1O0lo(i, i + i2, bArr.length);
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
                public final i1lI00ll111 I0000oI00(int i, int i2) {
/* 3 */             int iI00100o1O0lo = i1lIIl01O.I00100o1O0lo(i, i2, this.I00ilI0I1);
/* 7 */             if (iI00100o1O0lo == 0) {
/* 9 */                 return i1lIIl01O.I00iiI;
                    }
/* 19 */            return new i1l1Iilo0O(this.I00iiO, this.I00iio + i, iI00100o1O0lo);
                }

                @Override
                public final void I0001Ioi1lo(int i, byte[] bArr) {
/* 6 */             System.arraycopy(this.I00iiO, this.I00iio, bArr, 0, i);
                }

                @Override
                public final void I000OOo1O(i1lllO0 i1lllo0) {
/* 7 */             i1lllo0.I0000Il00O(this.I00iiO, this.I00iio, this.I00ilI0I1);
                }

                @Override
                public final boolean I000OiO(i1lIIl01O i1liil01o) {
/* 1 */             boolean z = i1liil01o instanceof i1lI1O;
/* 3 */             if (!z && !(i1liil01o instanceof i1l1Iilo0O)) {
/* 10 */                return i1liil01o.I000OiO(this);
                    }
/* 15 */            int iI0000O = i1liil01o.I0000O();
/* 20 */            int i = this.I00ilI0I1;
/* 22 */            if (i > iI0000O) {
/* 120 */               OoOil11Ol1o.I0000O(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
/* 19 */                return false;
                    }
/* 28 */            if (i > i1liil01o.I0000O()) {
/* 74 */                int iI0000O2 = i1liil01o.I0000O();
/* 97 */                OoOil11Ol1o.I0000oI00(String.valueOf(i).length() + 27 + String.valueOf(iI0000O2).length(), i, iI0000O2);
/* 19 */                return false;
                    }
/* 30 */            byte[] bArr = this.I00iiO;
/* 32 */            int i2 = this.I00iio;
/* 34 */            if (z) {
/* 40 */                return i1lIIl01O.I0010I0i(bArr, i2, ((i1lI1O) i1liil01o).I00iiO, 0, i);
                    }
/* 47 */            if (!(i1liil01o instanceof i1l1Iilo0O)) {
/* 69 */                return i1liil01o.I0000oI00(0, i).equals(I0000oI00(i2, i + i2));
                    }
/* 49 */            i1l1Iilo0O i1l1iilo0o = (i1l1Iilo0O) i1liil01o;
/* 55 */            return i1lIIl01O.I0010I0i(bArr, i2, i1l1iilo0o.I00iiO, i1l1iilo0o.I00iio, i);
                }

                @Override
                public final int I000iOII(int i, int i2) {
/* 5 */             return iI000IO.I00000oIO(i, this.I00iiO, this.I00iio, i2);
                }
            }

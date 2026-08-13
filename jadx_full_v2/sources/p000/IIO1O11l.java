            package p000;
            
            public final class IIO1O11l extends IIO1i00loOo {
                public final byte[] I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;

                public IIO1O11l(byte[] bArr, int i, int i2) {
/* 7 */             IIO1i00loOo.I00000oOI(i, i + i2, bArr.length);
/* 10 */            this.I00iio = bArr;
/* 12 */            this.I00ilI0I1 = i;
/* 14 */            this.I00ilO0 = i2;
                }

                @Override
                public final void I0000oI00(int i, byte[] bArr) {
/* 6 */             System.arraycopy(this.I00iio, this.I00ilI0I1, bArr, 0, i);
                }

                @Override
                public final boolean I0001Ioi1lo(IIO1i00loOo iIO1i00loOo) {
/* 1 */             boolean z = iIO1i00loOo instanceof IIO1lIii;
/* 3 */             if (!z && !(iIO1i00loOo instanceof IIO1O11l)) {
/* 10 */                return iIO1i00loOo.I0001Ioi1lo(this);
                    }
/* 15 */            int size = iIO1i00loOo.size();
/* 19 */            int i = this.I00ilO0;
/* 21 */            if (i > size) {
/* 186 */               throw new IllegalArgumentException("Length too large: " + i + i);
                    }
/* 28 */            if (i > iIO1i00loOo.size()) {
/* 86 */                OIiilo1Ool0o.I000o00OoI0I(iIO1i00loOo.size(), IlIi0I0.I00100o1O0lo("Ran off end of other: 0, ", i, ", "));
/* 27 */                return false;
                    }
/* 30 */            byte[] bArr = this.I00iio;
/* 32 */            int i2 = this.I00ilI0I1;
/* 34 */            if (z) {
/* 40 */                return IIO1i00loOo.I000iOII(bArr, i2, ((IIO1lIii) iIO1i00loOo).I00iio, 0, i);
                    }
/* 47 */            if (!(iIO1i00loOo instanceof IIO1O11l)) {
/* 69 */                return iIO1i00loOo.I000lI(0, i).equals(I000lI(i2, i + i2));
                    }
/* 49 */            IIO1O11l iIO1O11l = (IIO1O11l) iIO1i00loOo;
/* 55 */            return IIO1i00loOo.I000iOII(bArr, i2, iIO1O11l.I00iio, iIO1O11l.I00ilI0I1, i);
                }

                @Override
                public final byte I000OOo1O(int i) {
/* 6 */             return this.I00iio[this.I00ilI0I1 + i];
                }

                @Override
                public final int I000OiO(int i, int i2) {
/* 5 */             return Iool1iioooil.I00000oOI(i, this.I00iio, this.I00ilI0I1, i2);
                }

                @Override
                public final IIO1i00loOo I000lI(int i, int i2) {
/* 3 */             int iI00000oOI = IIO1i00loOo.I00000oOI(i, i2, this.I00ilO0);
/* 7 */             if (iI00000oOI == 0) {
/* 9 */                 return IIO1i00loOo.I00iiI;
                    }
/* 19 */            return new IIO1O11l(this.I00iio, this.I00ilI0I1 + i, iI00000oOI);
                }

                @Override
                public final void I000o00OoI0I(IOOOiI0 iOOOiI0) {
/* 7 */             iOOOiI0.I001i1O0Ol(this.I00iio, this.I00ilI0I1, this.I00ilO0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilO0;
                }
            }

            package p000;

            import java.util.Arrays;
            
            public final class IIO1lIii extends IIO1i00loOo {
                public final byte[] I00iio;

                public IIO1lIii(byte[] bArr) {
/* 4 */             bArr.getClass();
/* 7 */             this.I00iio = bArr;
                }

                @Override
                public final void I0000oI00(int i, byte[] bArr) {
/* 4 */             System.arraycopy(this.I00iio, 0, bArr, 0, i);
                }

                @Override
                public final boolean I0001Ioi1lo(IIO1i00loOo iIO1i00loOo) {
/* 1 */             boolean z = iIO1i00loOo instanceof IIO1lIii;
/* 3 */             byte[] bArr = this.I00iio;
/* 5 */             if (z) {
/* 11 */                return Arrays.equals(bArr, ((IIO1lIii) iIO1i00loOo).I00iio);
                    }
/* 18 */            if (!(iIO1i00loOo instanceof IIO1O11l)) {
/* 70 */                return iIO1i00loOo.I0001Ioi1lo(this);
                    }
/* 20 */            int length = bArr.length;
/* 22 */            IIO1O11l iIO1O11l = (IIO1O11l) iIO1i00loOo;
/* 24 */            int i = iIO1O11l.I00ilO0;
/* 27 */            if (length > i) {
/* 66 */                I000II.I00100o1O0lo(length, bArr.length);
/* 26 */                return false;
                    }
/* 29 */            if (length <= i) {
                        return iIO1i00loOo instanceof IIO1lIii ? IIO1i00loOo.I000iOII(bArr, 0, ((IIO1lIii) iIO1i00loOo).I00iio, 0, length) : IIO1i00loOo.I000iOII(bArr, 0, iIO1O11l.I00iio, iIO1O11l.I00ilI0I1, length);
                    }
/* 61 */            I000II.I000iOII(IIl001iO0Io.I000l1(length, i, "Ran off end of other: 0, ", ", "));
/* 26 */            return false;
                }

                @Override
                public final byte I000OOo1O(int i) {
/* 3 */             return this.I00iio[i];
                }

                @Override
                public final int I000OiO(int i, int i2) {
/* 4 */             return Iool1iioooil.I00000oOI(i, this.I00iio, 0, i2);
                }

                @Override
                public final IIO1i00loOo I000lI(int i, int i2) {
/* 1 */             byte[] bArr = this.I00iio;
/* 5 */             int iI00000oOI = IIO1i00loOo.I00000oOI(0, i2, bArr.length);
                    return iI00000oOI == 0 ? IIO1i00loOo.I00iiI : new IIO1O11l(bArr, 0, iI00000oOI);
                }

                @Override
                public final void I000o00OoI0I(IOOOiI0 iOOOiI0) {
/* 2 */             byte[] bArr = this.I00iio;
/* 5 */             iOOOiI0.I001i1O0Ol(bArr, 0, bArr.length);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iio.length;
                }
            }

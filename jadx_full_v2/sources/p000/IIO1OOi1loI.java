            package p000;
            
            public final class IIO1OOi1loI extends IIO1ooI {
                public int I00ilI0I1;
                public int I00ilO0;

                @Override
                public final byte I00000oOI(int i) {
/* 1 */             int i2 = this.I00ilO0;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 41 */                return this.I00iiI[this.I00ilI0I1 + i];
                    }
/* 10 */            if (i < 0) {
/* 18 */                OoOil11Ol1o.I0010I0i(Oi010OO0.I000oI1ioi(i, "Index < 0: "));
/* 21 */                return (byte) 0;
                    }
/* 31 */            OoOil11Ol1o.I0010I0i(IIl001iO0Io.I000l1(i, i2, "Index > length: ", ", "));
/* 34 */            return (byte) 0;
                }

                @Override
                public final void I0001Ioi1lo(int i, byte[] bArr) {
/* 6 */             System.arraycopy(this.I00iiI, this.I00ilI0I1, bArr, 0, i);
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final byte I000OiO(int i) {
/* 6 */             return this.I00iiI[this.I00ilI0I1 + i];
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilO0;
                }
            }

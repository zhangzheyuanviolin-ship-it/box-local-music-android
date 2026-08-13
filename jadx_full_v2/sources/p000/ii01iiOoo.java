            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            
            public class ii01iiOoo extends ii01lO0l11ii {
                public final byte[] I00iiO;

                public ii01iiOoo(byte[] bArr) {
/* 4 */             bArr.getClass();
/* 7 */             this.I00iiO = bArr;
                }

                @Override
                public byte I00000oOI(int i) {
/* 3 */             return this.I00iiO[i];
                }

                @Override
                public byte I0000O(int i) {
/* 3 */             return this.I00iiO[i];
                }

                @Override
                public int I0001Ioi1lo() {
/* 3 */             return this.I00iiO.length;
                }

                @Override
                public void I000OOo1O(int i, byte[] bArr, int i2, int i3) {
/* 3 */             System.arraycopy(this.I00iiO, i, bArr, i2, i3);
                }

                @Override
                public final int I000OiO() {
/* 1 */             return 0;
                }

                @Override
                public final boolean I000iOII() {
/* 1 */             return true;
                }

                @Override
                public final int I000lI(int i, int i2, int i3) {
/* 5 */             int iI001IO000 = I001IO000() + i2;
/* 6 */             Charset charset = ii0i1ll10I0.I00000oIO;
/* 11 */            for (int i4 = iI001IO000; i4 < iI001IO000 + i3; i4++) {
/* 19 */                i = (i * 31) + this.I00iiO[i4];
                    }
/* 98 */            return i;
                }

                @Override
                public final ii01lO0l11ii I000o00OoI0I(int i, int i2) {
/* 5 */             int iI00100o1O0lo = ii01lO0l11ii.I00100o1O0lo(i, i2, I0001Ioi1lo());
/* 9 */             if (iI00100o1O0lo == 0) {
/* 11 */                return ii01lO0l11ii.I00iiI;
                    }
/* 20 */            int iI001IO000 = I001IO000() + i;
/* 21 */            byte[] bArr = this.I00iiO;
/* 23 */            ii011o00O1lo ii011o00o1lo = new ii011o00O1lo(bArr);
/* 29 */            ii01lO0l11ii.I00100o1O0lo(iI001IO000, iI001IO000 + iI00100o1O0lo, bArr.length);
/* 32 */            ii011o00o1lo.I00iio = iI001IO000;
/* 34 */            ii011o00o1lo.I00ilI0I1 = iI00100o1O0lo;
/* 36 */            VarHandle.storeStoreFence();
/* 106 */           return ii011o00o1lo;
                }

                @Override
                public final void I000oI1ioi(ii0I1Il ii0i1il) {
/* 11 */            ii0i1il.I000O01llI0(this.I00iiO, I001IO000(), I0001Ioi1lo());
                }

                public int I001IO000() {
/* 1 */             return 0;
                }

                public final boolean I001i1O0Ol(ii01iiOoo ii01iiooo, int i, int i2) {
/* 6 */             if (i2 > ii01iiooo.I0001Ioi1lo()) {
/* 70 */                I000II.I00100o1O0lo(i2, I0001Ioi1lo());
/* 5 */                 return false;
                    }
/* 14 */            if (i + i2 > ii01iiooo.I0001Ioi1lo()) {
/* 62 */                OIiilo1Ool0o.I000o00OoI0I(ii01iiooo.I0001Ioi1lo(), IIl001iO0Io.I0010I0i("Ran off end of other: ", i, ", ", i2, ", "));
/* 5 */                 return false;
                    }
/* 16 */            byte[] bArr = ii01iiooo.I00iiO;
/* 22 */            int iI001IO000 = I001IO000() + i2;
/* 23 */            int iI001IO0002 = I001IO000();
/* 31 */            int iI001IO0003 = ii01iiooo.I001IO000() + i;
/* 32 */            while (iI001IO0002 < iI001IO000) {
/* 40 */                if (this.I00iiO[iI001IO0002] != bArr[iI001IO0003]) {
/* 5 */                     return false;
                        }
/* 43 */                iI001IO0002++;
/* 45 */                iI001IO0003++;
                    }
/* 48 */            return true;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 7 */             if ((obj instanceof ii01lO0l11ii) && I0001Ioi1lo() == ((ii01lO0l11ii) obj).I0001Ioi1lo()) {
/* 28 */                if (I0001Ioi1lo() == 0) {
/* 30 */                    return true;
                        }
/* 34 */                if (!(obj instanceof ii01iiOoo)) {
/* 58 */                    return obj.equals(this);
                        }
/* 36 */                ii01iiOoo ii01iiooo = (ii01iiOoo) obj;
/* 38 */                int i = this.I00iOIl;
/* 40 */                int i2 = ii01iiooo.I00iOIl;
/* 42 */                if (i == 0 || i2 == 0 || i == i2) {
/* 53 */                    return I001i1O0Ol(ii01iiooo, 0, I0001Ioi1lo());
                        }
                    }
/* 6 */             return false;
                }
            }

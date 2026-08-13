            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            
            public class il1lilI1Ol extends il1oII0OlIo {
                public final byte[] I00iiO;

                public il1lilI1Ol(byte[] bArr) {
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
/* 5 */             int iI001lIiIIo1O = I001lIiIIo1O() + i2;
/* 6 */             Charset charset = iloi1OI100li.I00000oIO;
/* 11 */            for (int i4 = iI001lIiIIo1O; i4 < iI001lIiIIo1O + i3; i4++) {
/* 19 */                i = (i * 31) + this.I00iiO[i4];
                    }
/* 98 */            return i;
                }

                @Override
                public final int I000o00OoI0I(int i, int i2, int i3) {
/* 5 */             int iI001lIiIIo1O = I001lIiIIo1O() + i2;
/* 9 */             l0O1O1.I00000oIO.getClass();
/* 14 */            return iOl0lOIi11.I0010o(i, this.I00iiO, iI001lIiIIo1O, i3 + iI001lIiIIo1O);
                }

                @Override
                public final il1oII0OlIo I000oI1ioi(int i, int i2) {
/* 5 */             int iI00111O = il1oII0OlIo.I00111O(i, i2, I0001Ioi1lo());
/* 9 */             if (iI00111O == 0) {
/* 11 */                return il1oII0OlIo.I00iiI;
                    }
/* 20 */            int iI001lIiIIo1O = I001lIiIIo1O() + i;
/* 21 */            byte[] bArr = this.I00iiO;
/* 23 */            il1O1Oo1oiIO il1o1oo1oiio = new il1O1Oo1oiIO(bArr);
/* 29 */            il1oII0OlIo.I00111O(iI001lIiIIo1O, iI001lIiIIo1O + iI00111O, bArr.length);
/* 32 */            il1o1oo1oiio.I00iio = iI001lIiIIo1O;
/* 34 */            il1o1oo1oiio.I00ilI0I1 = iI00111O;
/* 36 */            VarHandle.storeStoreFence();
/* 106 */           return il1o1oo1oiio;
                }

                @Override
                public final String I00100o1O0lo(Charset charset) {
/* 13 */            return new String(this.I00iiO, I001lIiIIo1O(), I0001Ioi1lo(), charset);
                }

                @Override
                public final void I0010I0i(ilIO10iO ilio10io) {
/* 11 */            ilio10io.I0000O(this.I00iiO, I001lIiIIo1O(), I0001Ioi1lo());
                }

                @Override
                public final boolean I0010o() {
/* 1 */             int iI001lIiIIo1O = I001lIiIIo1O();
/* 9 */             int iI0001Ioi1lo = I0001Ioi1lo() + iI001lIiIIo1O;
/* 12 */            l0O1O1.I00000oIO.getClass();
                    return iOl0lOIi11.I0010o(0, this.I00iiO, iI001lIiIIo1O, iI0001Ioi1lo) == 0;
                }

                public int I001lIiIIo1O() {
/* 1 */             return 0;
                }

                public final boolean I001lllioOl(il1lilI1Ol il1lili1ol, int i, int i2) {
/* 6 */             if (i2 > il1lili1ol.I0001Ioi1lo()) {
/* 70 */                I000II.I00100o1O0lo(i2, I0001Ioi1lo());
/* 5 */                 return false;
                    }
/* 14 */            if (i + i2 > il1lili1ol.I0001Ioi1lo()) {
/* 62 */                OIiilo1Ool0o.I000o00OoI0I(il1lili1ol.I0001Ioi1lo(), IIl001iO0Io.I0010I0i("Ran off end of other: ", i, ", ", i2, ", "));
/* 5 */                 return false;
                    }
/* 16 */            byte[] bArr = il1lili1ol.I00iiO;
/* 22 */            int iI001lIiIIo1O = I001lIiIIo1O() + i2;
/* 23 */            int iI001lIiIIo1O2 = I001lIiIIo1O();
/* 31 */            int iI001lIiIIo1O3 = il1lili1ol.I001lIiIIo1O() + i;
/* 32 */            while (iI001lIiIIo1O2 < iI001lIiIIo1O) {
/* 40 */                if (this.I00iiO[iI001lIiIIo1O2] != bArr[iI001lIiIIo1O3]) {
/* 5 */                     return false;
                        }
/* 43 */                iI001lIiIIo1O2++;
/* 45 */                iI001lIiIIo1O3++;
                    }
/* 48 */            return true;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 7 */             if ((obj instanceof il1oII0OlIo) && I0001Ioi1lo() == ((il1oII0OlIo) obj).I0001Ioi1lo()) {
/* 28 */                if (I0001Ioi1lo() == 0) {
/* 30 */                    return true;
                        }
/* 34 */                if (!(obj instanceof il1lilI1Ol)) {
/* 58 */                    return obj.equals(this);
                        }
/* 36 */                il1lilI1Ol il1lili1ol = (il1lilI1Ol) obj;
/* 38 */                int i = this.I00iOIl;
/* 40 */                int i2 = il1lili1ol.I00iOIl;
/* 42 */                if (i == 0 || i2 == 0 || i == i2) {
/* 53 */                    return I001lllioOl(il1lili1ol, 0, I0001Ioi1lo());
                        }
                    }
/* 6 */             return false;
                }
            }

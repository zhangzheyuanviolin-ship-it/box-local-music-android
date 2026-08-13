            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IOOO0l10l extends IOOOIO1O {
                public FileInputStream I0000O;
                public byte[] I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;

                @Override
                public final void I00000oIO(int i) throws O0010I0o {
/* 3 */             if (this.I000OOo1O != i) {
/* 49 */                throw new O0010I0o("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override
                public final int I00000oOI() {
/* 5 */             return this.I000OiO + this.I000O01llI0;
                }

                @Override
                public final boolean I0000Il00O() {
                    return this.I000O01llI0 == this.I0001Ioi1lo && !I00l0OO0IO(1);
                }

                @Override
                public final void I0000O(int i) {
/* 1 */             this.I000iOII = i;
/* 3 */             I00io1l();
                }

                @Override
                public final int I0000oI00(int i) throws O0010I0o {
/* 1 */             if (i < 0) {
/* 49 */                throw O0010I0o.I0000O();
                    }
/* 8 */             int i2 = this.I000OiO + this.I000O01llI0 + i;
/* 9 */             if (i2 < 0) {
/* 33 */                throw new O0010I0o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    }
/* 11 */            int i3 = this.I000iOII;
/* 13 */            if (i2 > i3) {
/* 25 */                throw O0010I0o.I0000oI00();
                    }
/* 15 */            this.I000iOII = i2;
/* 17 */            I00io1l();
/* 20 */            return i3;
                }

                @Override
                public final boolean I0001Ioi1lo() {
                    return I00ilI0I1() != 0;
                }

                @Override
                public final IIO1lIii I000II() throws IOException {
/* 1 */             byte[] bArr = this.I0000oI00;
/* 3 */             int iI00iio = I00iio();
/* 7 */             int i = this.I0001Ioi1lo;
/* 9 */             int i2 = this.I000O01llI0;
/* 12 */            if (iI00iio <= i - i2 && iI00iio > 0) {
/* 16 */                IIO1lIii iIO1lIiiI0000O = IIO1i00loOo.I0000O(bArr, i2, iI00iio);
                        this.I000O01llI0 += iI00iio;
/* 25 */                return iIO1lIiiI0000O;
                    }
/* 26 */            if (iI00iio == 0) {
/* 28 */                return IIO1i00loOo.I00iiI;
                    }
/* 31 */            if (iI00iio < 0) {
/* 541 */               throw O0010I0o.I0000O();
                    }
/* 33 */            byte[] bArrI00iIi0i1o = I00iIi0i1o(iI00iio);
/* 38 */            if (bArrI00iIi0i1o != null) {
/* 41 */                return IIO1i00loOo.I0000O(bArrI00iIi0i1o, 0, bArrI00iIi0i1o.length);
                    }
/* 46 */            int i3 = this.I000O01llI0;
/* 48 */            int i4 = this.I0001Ioi1lo;
/* 50 */            int length = i4 - i3;
                    this.I000OiO += i4;
/* 57 */            this.I000O01llI0 = 0;
/* 59 */            this.I0001Ioi1lo = 0;
/* 63 */            ArrayList arrayListI00iOIl = I00iOIl(iI00iio - length);
/* 67 */            byte[] bArr2 = new byte[iI00iio];
/* 69 */            System.arraycopy(bArr, i3, bArr2, 0, length);
/* 72 */            Iterator it = arrayListI00iOIl.iterator();
/* 80 */            while (it.hasNext()) {
/* 86 */                byte[] bArr3 = (byte[]) it.next();
/* 89 */                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
/* 93 */                length += bArr3.length;
                    }
                    try {
/* 95 */                IIO1lIii iIO1lIii = IIO1i00loOo.I00iiI;
                        return iI00iio == 0 ? IIO1i00loOo.I00iiI : new IIO1lIii(bArr2);
                    } catch (O0010I0o e) {
/* 116 */               throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                }

                @Override
                public final double I000O01llI0() {
/* 5 */             return Double.longBitsToDouble(I00iiO());
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return I00iio();
                }

                @Override
                public final int I000OiO() {
/* 1 */             return I00iiI();
                }

                @Override
                public final long I000iOII() {
/* 1 */             return I00iiO();
                }

                @Override
                public final float I000l1() {
/* 5 */             return Float.intBitsToFloat(I00iiI());
                }

                @Override
                public final int I000lI() {
/* 1 */             return I00iio();
                }

                @Override
                public final long I000o00OoI0I() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             return I00iiI();
                }

                @Override
                public final long I00100l0() {
/* 1 */             return I00iiO();
                }

                @Override
                public final int I00100o1O0lo() {
/* 1 */             int iI00iio = I00iio();
/* 10 */            return (-(iI00iio & 1)) ^ (iI00iio >>> 1);
                }

                @Override
                public final long I0010I0i() {
/* 1 */             long jI00ilI0I1 = I00ilI0I1();
/* 12 */            return (-(jI00ilI0I1 & 1)) ^ (jI00ilI0I1 >>> 1);
                }

                @Override
                public final String I0010o() throws O0010I0o {
/* 1 */             byte[] bArr = this.I0000oI00;
/* 3 */             int iI00iio = I00iio();
/* 7 */             if (iI00iio > 0) {
/* 9 */                 int i = this.I0001Ioi1lo;
/* 11 */                int i2 = this.I000O01llI0;
/* 14 */                if (iI00iio <= i - i2) {
/* 20 */                    String str = new String(bArr, i2, iI00iio, StandardCharsets.UTF_8);
                            this.I000O01llI0 += iI00iio;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iI00iio == 0) {
/* 31 */                return "";
                    }
/* 34 */            if (iI00iio < 0) {
/* 113 */               throw O0010I0o.I0000O();
                    }
/* 38 */            if (iI00iio > this.I0001Ioi1lo) {
/* 66 */                return new String(I00iIO(iI00iio), StandardCharsets.UTF_8);
                    }
/* 40 */            I00ioIO(iI00iio);
/* 49 */            String str2 = new String(bArr, this.I000O01llI0, iI00iio, StandardCharsets.UTF_8);
                    this.I000O01llI0 += iI00iio;
/* 57 */            return str2;
                }

                @Override
                public final String I00111O() throws IOException {
/* 1 */             byte[] bArrI00iIO = this.I0000oI00;
/* 3 */             int iI00iio = I00iio();
/* 7 */             int i = this.I000O01llI0;
/* 9 */             int i2 = this.I0001Ioi1lo;
/* 15 */            if (iI00iio <= i2 - i && iI00iio > 0) {
/* 21 */                this.I000O01llI0 = i + iI00iio;
                    } else {
/* 24 */                if (iI00iio == 0) {
/* 13 */                    return "";
                        }
/* 27 */                if (iI00iio < 0) {
/* 113 */                   throw O0010I0o.I0000O();
                        }
/* 29 */                i = 0;
/* 30 */                if (iI00iio <= i2) {
/* 32 */                    I00ioIO(iI00iio);
/* 35 */                    this.I000O01llI0 = iI00iio;
                        } else {
/* 38 */                    bArrI00iIO = I00iIO(iI00iio);
                        }
                    }
/* 42 */            if (iI00iio != 0) {
/* 49 */                return Ooll0110oo.I00000oIO.I00000oIO(bArrI00iIO, i, iI00iio);
                    }
/* 44 */            OoliOIl1 ooliOIl1 = Ooll0110oo.I00000oIO;
/* 13 */            return "";
                }

                @Override
                public final int I001IIilI0O() throws O0010I0o {
/* 5 */             if (I0000Il00O()) {
/* 8 */                 this.I000OOo1O = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00iio = I00iio();
/* 15 */            this.I000OOo1O = iI00iio;
/* 19 */            if ((iI00iio >>> 3) != 0) {
/* 21 */                return iI00iio;
                    }
/* 29 */            throw new O0010I0o("Protocol message contained an invalid tag (zero).");
                }

                @Override
                public final int I001IO000() {
/* 1 */             return I00iio();
                }

                @Override
                public final long I001i1O0Ol() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final boolean I001i1lo1io(int i) throws O0010I0o {
/* 1 */             byte[] bArr = this.I0000oI00;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 == 0) {
/* 71 */                if (this.I0001Ioi1lo - this.I000O01llI0 >= 10) {
/* 73 */                    while (i3 < 10) {
/* 75 */                        int i4 = this.I000O01llI0;
/* 79 */                        this.I000O01llI0 = i4 + 1;
/* 83 */                        if (bArr[i4] < 0) {
/* 86 */                            i3++;
                                }
                            }
/* 93 */                    throw O0010I0o.I0000Il00O();
                        }
/* 94 */                while (i3 < 10) {
/* 100 */                   if (this.I000O01llI0 == this.I0001Ioi1lo) {
/* 102 */                       I00ioIO(1);
                            }
/* 105 */                   int i5 = this.I000O01llI0;
/* 109 */                   this.I000O01llI0 = i5 + 1;
/* 113 */                   if (bArr[i5] < 0) {
/* 116 */                       i3++;
                            }
                        }
/* 186 */               throw O0010I0o.I0000Il00O();
/* 6 */                 return true;
                    }
/* 9 */             if (i2 == 1) {
/* 60 */                I00l0I0l0lO1(8);
/* 6 */                 return true;
                    }
/* 12 */            if (i2 == 2) {
/* 54 */                I00l0I0l0lO1(I00iio());
/* 6 */                 return true;
                    }
/* 16 */            if (i2 == 3) {
/* 40 */                I001iOo1i0O();
/* 46 */                I00000oIO(((i >>> 3) << 3) | 4);
/* 6 */                 return true;
                    }
/* 18 */            if (i2 == 4) {
/* 34 */                if (this.I00000oOI == 0) {
/* 36 */                    I00000oIO(0);
                        }
/* 5 */                 return false;
                    }
/* 21 */            if (i2 != 5) {
/* 31 */                throw O0010I0o.I00000oOI();
                    }
/* 23 */            I00l0I0l0lO1(4);
/* 6 */             return true;
                }

                public final byte[] I00iIO(int i) throws IOException {
/* 1 */             byte[] bArrI00iIi0i1o = I00iIi0i1o(i);
/* 5 */             if (bArrI00iIi0i1o != null) {
/* 7 */                 return bArrI00iIi0i1o;
                    }
/* 8 */             int i2 = this.I000O01llI0;
/* 10 */            int i3 = this.I0001Ioi1lo;
/* 12 */            int length = i3 - i2;
                    this.I000OiO += i3;
/* 20 */            this.I000O01llI0 = 0;
/* 22 */            this.I0001Ioi1lo = 0;
/* 26 */            ArrayList arrayListI00iOIl = I00iOIl(i - length);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.I0000oI00, i2, bArr, 0, length);
/* 37 */            Iterator it = arrayListI00iOIl.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                byte[] bArr2 = (byte[]) it.next();
/* 54 */                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
/* 58 */                length += bArr2.length;
                    }
/* 186 */           return bArr;
                }

                public final byte[] I00iIi0i1o(int i) throws IOException {
/* 1 */             FileInputStream fileInputStream = this.I0000O;
/* 3 */             if (i == 0) {
/* 5 */                 return Iool1iioooil.I00000oIO;
                    }
/* 8 */             if (i < 0) {
/* 186 */               throw O0010I0o.I0000O();
                    }
/* 10 */            int i2 = this.I000OiO;
/* 12 */            int i3 = this.I000O01llI0;
/* 16 */            int i4 = i2 + i3 + i;
/* 22 */            if (i4 - Integer.MAX_VALUE > 0) {
/* 117 */               throw new O0010I0o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    }
/* 24 */            int i5 = this.I000iOII;
/* 26 */            if (i4 > i5) {
/* 102 */               I00l0I0l0lO1((i5 - i2) - i3);
/* 109 */               throw O0010I0o.I0000oI00();
                    }
/* 30 */            int i6 = this.I0001Ioi1lo - i3;
/* 31 */            int i7 = i - i6;
/* 36 */            if (i7 >= 4096) {
                        try {
/* 42 */                    if (i7 > fileInputStream.available()) {
/* 45 */                        return null;
                            }
                        } catch (O0010I0o e) {
/* 48 */                    e.I00iOIl = true;
/* 50 */                    throw e;
                        }
                    }
/* 51 */            byte[] bArr = new byte[i];
/* 58 */            System.arraycopy(this.I0000oI00, this.I000O01llI0, bArr, 0, i6);
                    this.I000OiO += this.I0001Ioi1lo;
/* 68 */            this.I000O01llI0 = 0;
/* 70 */            this.I0001Ioi1lo = 0;
/* 72 */            while (i6 < i) {
                        try {
/* 76 */                    int i8 = fileInputStream.read(bArr, i6, i - i6);
/* 81 */                    if (i8 == -1) {
/* 94 */                        throw O0010I0o.I0000oI00();
                            }
                            this.I000OiO += i8;
/* 88 */                    i6 += i8;
                        } catch (O0010I0o e2) {
/* 96 */                    e2.I00iOIl = true;
/* 98 */                    throw e2;
                        }
                    }
/* 99 */            return bArr;
                }

                public final ArrayList I00iOIl(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, Barcode.FORMAT_AZTEC);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
                            try {
/* 23 */                        int i3 = this.I0000O.read(bArr, i2, iMin - i2);
/* 28 */                        if (i3 == -1) {
/* 41 */                            throw O0010I0o.I0000oI00();
                                }
                                this.I000OiO += i3;
/* 35 */                        i2 += i3;
                            } catch (O0010I0o e) {
/* 44 */                        e.I00iOIl = true;
/* 46 */                        throw e;
                            }
                        }
/* 47 */                i -= iMin;
/* 48 */                arrayList.add(bArr);
                    }
/* 186 */           return arrayList;
                }

                public final int I00iiI() throws O0010I0o {
/* 1 */             int i = this.I000O01llI0;
/* 7 */             if (this.I0001Ioi1lo - i < 4) {
/* 9 */                 I00ioIO(4);
/* 12 */                i = this.I000O01llI0;
                    }
/* 14 */            byte[] bArr = this.I0000oI00;
/* 18 */            this.I000O01llI0 = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I00iiO() throws O0010I0o {
/* 1 */             int i = this.I000O01llI0;
/* 8 */             if (this.I0001Ioi1lo - i < 8) {
/* 10 */                I00ioIO(8);
/* 13 */                i = this.I000O01llI0;
                    }
/* 15 */            byte[] bArr = this.I0000oI00;
/* 19 */            this.I000O01llI0 = i + 8;
/* 95 */            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
                }

                public final int I00iio() {
                    int i;
/* 1 */             int i2 = this.I000O01llI0;
/* 3 */             int i3 = this.I0001Ioi1lo;
/* 5 */             if (i3 != i2) {
/* 8 */                 byte[] bArr = this.I0000oI00;
/* 10 */                int i4 = i2 + 1;
/* 12 */                byte b = bArr[i2];
/* 14 */                if (b >= 0) {
/* 16 */                    this.I000O01llI0 = i4;
/* 18 */                    return b;
                        }
/* 22 */                if (i3 - i4 >= 9) {
/* 25 */                    int i5 = i2 + 2;
/* 31 */                    int i6 = (bArr[i4] << 7) ^ b;
/* 32 */                    if (i6 < 0) {
/* 34 */                        i = i6 ^ (-128);
                            } else {
/* 37 */                        int i7 = i2 + 3;
/* 43 */                        int i8 = (bArr[i5] << 14) ^ i6;
/* 44 */                        if (i8 >= 0) {
/* 46 */                            i = i8 ^ 16256;
                                } else {
/* 50 */                            int i9 = i2 + 4;
/* 56 */                            int i10 = i8 ^ (bArr[i7] << 21);
/* 57 */                            if (i10 < 0) {
/* 62 */                                i = (-2080896) ^ i10;
                                    } else {
/* 65 */                                i7 = i2 + 5;
/* 67 */                                byte b2 = bArr[i9];
/* 75 */                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
/* 76 */                                if (b2 < 0) {
/* 78 */                                    i9 = i2 + 6;
/* 82 */                                    if (bArr[i7] < 0) {
/* 84 */                                        i7 = i2 + 7;
/* 88 */                                        if (bArr[i9] < 0) {
/* 90 */                                            i9 = i2 + 8;
/* 94 */                                            if (bArr[i7] < 0) {
/* 96 */                                                i7 = i2 + 9;
/* 100 */                                               if (bArr[i9] < 0) {
/* 102 */                                                   int i12 = i2 + 10;
/* 106 */                                                   if (bArr[i7] >= 0) {
/* 115 */                                                       i5 = i12;
/* 116 */                                                       i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 120 */                                   i = i11;
                                        }
/* 118 */                               i = i11;
                                    }
/* 63 */                            i5 = i9;
                                }
/* 48 */                        i5 = i7;
                            }
/* 122 */                   this.I000O01llI0 = i5;
/* 541 */                   return i;
                        }
                    }
/* 112 */           return (int) I00ilO0();
                }

                public final long I00ilI0I1() {
                    long j;
                    long j2;
                    long j3;
/* 1 */             int i = this.I000O01llI0;
/* 3 */             int i2 = this.I0001Ioi1lo;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.I0000oI00;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I000O01llI0 = i3;
/* 19 */                    return b;
                        }
/* 24 */                if (i2 - i3 >= 9) {
/* 28 */                    int i4 = i + 2;
/* 34 */                    int i5 = (bArr[i3] << 7) ^ b;
/* 35 */                    if (i5 < 0) {
/* 37 */                        j = i5 ^ (-128);
                            } else {
/* 42 */                        int i6 = i + 3;
/* 48 */                        int i7 = (bArr[i4] << 14) ^ i5;
/* 49 */                        if (i7 >= 0) {
/* 51 */                            j = i7 ^ 16256;
/* 54 */                            i4 = i6;
                                } else {
/* 57 */                            int i8 = i + 4;
/* 63 */                            int i9 = i7 ^ (bArr[i6] << 21);
/* 64 */                            if (i9 < 0) {
/* 69 */                                long j4 = (-2080896) ^ i9;
/* 72 */                                i4 = i8;
/* 73 */                                j = j4;
                                    } else {
                                        long j5 = i9;
/* 77 */                                i4 = i + 5;
/* 85 */                                long j6 = j5 ^ (bArr[i8] << 28);
/* 91 */                                if (j6 >= 0) {
/* 93 */                                    j2 = 266354560;
                                        } else {
/* 99 */                                    int i10 = i + 6;
/* 107 */                                   long j7 = j6 ^ (bArr[i4] << 35);
/* 110 */                                   if (j7 < 0) {
/* 112 */                                       j3 = -34093383808L;
                                            } else {
/* 121 */                                       i4 = i + 7;
/* 129 */                                       j6 = j7 ^ (bArr[i10] << 42);
/* 132 */                                       if (j6 >= 0) {
/* 134 */                                           j2 = 4363953127296L;
                                                } else {
/* 140 */                                           i10 = i + 8;
/* 148 */                                           j7 = j6 ^ (bArr[i4] << 49);
/* 151 */                                           if (j7 < 0) {
/* 153 */                                               j3 = -558586000294016L;
                                                    } else {
/* 159 */                                               i4 = i + 9;
/* 167 */                                               j6 = j7 ^ (bArr[i10] << 56);
/* 170 */                                               if (j6 >= 0) {
/* 172 */                                                   j2 = 71499008037633920L;
                                                        } else {
/* 178 */                                                   int i11 = i + 10;
/* 186 */                                                   long j8 = (bArr[i4] << 63) ^ j6;
/* 189 */                                                   if (j8 >= 0) {
/* 196 */                                                       j = j8 ^ (-9151873028817141888L);
/* 198 */                                                       i4 = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 117 */                                   j = j7 ^ j3;
/* 119 */                                   i4 = i10;
                                        }
/* 96 */                                j = j6 ^ j2;
                                    }
                                }
                            }
/* 199 */                   this.I000O01llI0 = i4;
/* 201 */                   return j;
                        }
                    }
/* 202 */           return I00ilO0();
                }

                public final long I00ilO0() throws O0010I0o {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.I000O01llI0 == this.I0001Ioi1lo) {
/* 15 */                    I00ioIO(1);
                        }
/* 18 */                byte[] bArr = this.I0000oI00;
/* 20 */                int i2 = this.I000O01llI0;
/* 24 */                this.I000O01llI0 = i2 + 1;
/* 32 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 35 */                if ((bArr[i2] & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 113 */           throw O0010I0o.I0000Il00O();
                }

                public final void I00io1l() {
/* 5 */             int i = this.I0001Ioi1lo + this.I000II;
/* 6 */             this.I0001Ioi1lo = i;
/* 10 */            int i2 = this.I000OiO + i;
/* 11 */            int i3 = this.I000iOII;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.I000II = 0;
/* 29 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.I000II = i4;
/* 19 */            this.I0001Ioi1lo = i - i4;
                }

                public final void I00ioIO(int i) throws O0010I0o {
/* 5 */             if (I00l0OO0IO(i)) {
/* 49 */                return;
                    }
/* 16 */            if (i <= (Integer.MAX_VALUE - this.I000OiO) - this.I000O01llI0) {
/* 30 */                throw O0010I0o.I0000oI00();
                    }
/* 25 */            throw new O0010I0o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                }

                public final void I00l0I0l0lO1(int i) throws O0010I0o {
/* 1 */             int i2 = this.I0001Ioi1lo;
/* 3 */             int i3 = this.I000O01llI0;
/* 5 */             int i4 = i2 - i3;
/* 6 */             if (i <= i4 && i >= 0) {
/* 11 */                this.I000O01llI0 = i3 + i;
/* 13 */                return;
                    }
/* 14 */            FileInputStream fileInputStream = this.I0000O;
/* 16 */            if (i < 0) {
/* 186 */               throw O0010I0o.I0000O();
                    }
/* 18 */            int i5 = this.I000OiO;
/* 20 */            int i6 = i5 + i3;
/* 22 */            int i7 = i6 + i;
/* 24 */            int i8 = this.I000iOII;
/* 26 */            if (i7 > i8) {
/* 150 */               I00l0I0l0lO1((i8 - i5) - i3);
/* 157 */               throw O0010I0o.I0000oI00();
                    }
/* 28 */            this.I000OiO = i6;
/* 31 */            this.I0001Ioi1lo = 0;
/* 33 */            this.I000O01llI0 = 0;
/* 36 */            while (i4 < i) {
/* 38 */                long j = i - i4;
                        try {
                            try {
/* 41 */                        long jSkip = fileInputStream.skip(j);
/* 49 */                        if (jSkip < 0 || jSkip > j) {
/* 95 */                            throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 55 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 59 */                            i4 += (int) jSkip;
                                }
                            } catch (O0010I0o e) {
/* 99 */                        e.I00iOIl = true;
/* 101 */                       throw e;
                            }
                        } catch (Throwable th) {
                            this.I000OiO += i4;
/* 107 */                   I00io1l();
/* 110 */                   throw th;
                        }
                    }
                    this.I000OiO += i4;
/* 116 */           I00io1l();
/* 119 */           if (i4 >= i) {
/* 147 */               return;
                    }
/* 121 */           int i9 = this.I0001Ioi1lo;
/* 125 */           int i10 = i9 - this.I000O01llI0;
/* 127 */           this.I000O01llI0 = i9;
/* 129 */           I00ioIO(1);
                    while (true) {
/* 132 */               int i11 = i - i10;
/* 134 */               int i12 = this.I0001Ioi1lo;
/* 136 */               if (i11 <= i12) {
/* 145 */                   this.I000O01llI0 = i11;
/* 147 */                   return;
                        } else {
/* 138 */                   i10 += i12;
/* 139 */                   this.I000O01llI0 = i12;
/* 141 */                   I00ioIO(1);
                        }
                    }
                }

                public final boolean I00l0OO0IO(int i) throws IOException {
/* 1 */             FileInputStream fileInputStream = this.I0000O;
/* 3 */             byte[] bArr = this.I0000oI00;
/* 5 */             int i2 = this.I000O01llI0;
/* 7 */             int i3 = i2 + i;
/* 9 */             int i4 = this.I0001Ioi1lo;
/* 12 */            if (i3 <= i4) {
/* 116 */               I000II.I001IO000(IIlIOloOOO.I00100l0("refillBuffer() called when ", i, " bytes were already available in buffer"));
/* 11 */                return false;
                    }
/* 14 */            int i5 = this.I000OiO;
/* 22 */            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.I000iOII) {
/* 33 */                if (i2 > 0) {
/* 35 */                    if (i4 > i2) {
/* 38 */                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                            }
/* 43 */                    i5 = this.I000OiO + i2;
/* 44 */                    this.I000OiO = i5;
/* 48 */                    i4 = this.I0001Ioi1lo - i2;
/* 49 */                    this.I0001Ioi1lo = i4;
/* 51 */                    this.I000O01llI0 = 0;
                        }
                        try {
/* 62 */                    int i6 = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
/* 66 */                    if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
/* 100 */                       I000II.I000II(i6, fileInputStream.getClass());
/* 11 */                        return false;
                            }
/* 74 */                    if (i6 > 0) {
                                this.I0001Ioi1lo += i6;
/* 81 */                        I00io1l();
/* 86 */                        if (this.I0001Ioi1lo >= i || I00l0OO0IO(i)) {
/* 61 */                            return true;
                                }
                            }
                        } catch (O0010I0o e) {
/* 105 */                   e.I00iOIl = true;
/* 107 */                   throw e;
                        }
                    }
/* 11 */            return false;
                }
            }

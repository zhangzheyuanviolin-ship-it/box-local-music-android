            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IOOIol10lI extends IOOOI0 {
                public ByteArrayInputStream I0000Il00O;
                public byte[] I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;

                @Override
                public final void I00000oOI(int i) throws O000oiiiOI0 {
/* 3 */             if (this.I000O01llI0 != i) {
/* 49 */                throw new O000oiiiOI0("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override
                public final int I000II() {
/* 5 */             return this.I000OOo1O + this.I000II;
                }

                @Override
                public final boolean I000O01llI0() {
                    return this.I000II == this.I0000oI00 && !I00o0iI0io1(1);
                }

                @Override
                public final void I000iOII(int i) {
/* 1 */             this.I000OiO = i;
/* 3 */             I00ll1();
                }

                @Override
                public final int I000lI(int i) throws O000oiiiOI0 {
/* 1 */             if (i < 0) {
/* 49 */                throw O000oiiiOI0.I0000oI00();
                    }
/* 8 */             int i2 = this.I000OOo1O + this.I000II + i;
/* 9 */             int i3 = this.I000OiO;
/* 11 */            if (i2 > i3) {
/* 23 */                throw O000oiiiOI0.I000II();
                    }
/* 13 */            this.I000OiO = i2;
/* 15 */            I00ll1();
/* 18 */            return i3;
                }

                @Override
                public final boolean I000o00OoI0I() {
                    return I00l0OO0IO() != 0;
                }

                @Override
                public final IIO1i10I I000oI1ioi() throws IOException {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int iI00l0I0l0lO1 = I00l0I0l0lO1();
/* 7 */             int i = this.I0000oI00;
/* 9 */             int i2 = this.I000II;
/* 12 */            if (iI00l0I0l0lO1 <= i - i2 && iI00l0I0l0lO1 > 0) {
/* 16 */                IIO1i10I iIO1i10II0000oI00 = IIOI1Ii1I.I0000oI00(bArr, i2, iI00l0I0l0lO1);
                        this.I000II += iI00l0I0l0lO1;
/* 25 */                return iIO1i10II0000oI00;
                    }
/* 26 */            if (iI00l0I0l0lO1 == 0) {
/* 28 */                return IIOI1Ii1I.I00iiI;
                    }
/* 31 */            byte[] bArrI00ilI0I1 = I00ilI0I1(iI00l0I0l0lO1);
/* 36 */            if (bArrI00ilI0I1 != null) {
/* 39 */                return IIOI1Ii1I.I0000oI00(bArrI00ilI0I1, 0, bArrI00ilI0I1.length);
                    }
/* 44 */            int i3 = this.I000II;
/* 46 */            int i4 = this.I0000oI00;
/* 48 */            int length = i4 - i3;
                    this.I000OOo1O += i4;
/* 55 */            this.I000II = 0;
/* 57 */            this.I0000oI00 = 0;
/* 61 */            ArrayList arrayListI00ilO0 = I00ilO0(iI00l0I0l0lO1 - length);
/* 65 */            byte[] bArr2 = new byte[iI00l0I0l0lO1];
/* 67 */            System.arraycopy(bArr, i3, bArr2, 0, length);
/* 70 */            Iterator it = arrayListI00ilO0.iterator();
/* 78 */            while (it.hasNext()) {
/* 84 */                byte[] bArr3 = (byte[]) it.next();
/* 87 */                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
/* 91 */                length += bArr3.length;
                    }
/* 93 */            IIO1i10I iIO1i10I = IIOI1Ii1I.I00iiI;
/* 97 */            return new IIO1i10I(bArr2);
                }

                @Override
                public final double I00100o1O0lo() {
/* 5 */             return Double.longBitsToDouble(I00ioIO());
                }

                @Override
                public final int I0010I0i() {
/* 1 */             return I00l0I0l0lO1();
                }

                @Override
                public final int I0010o() {
/* 1 */             return I00io1l();
                }

                @Override
                public final long I00111O() {
/* 1 */             return I00ioIO();
                }

                @Override
                public final float I001IIilI0O() {
/* 5 */             return Float.intBitsToFloat(I00io1l());
                }

                @Override
                public final int I001IO000() {
/* 1 */             return I00l0I0l0lO1();
                }

                @Override
                public final long I001i1O0Ol() {
/* 1 */             return I00l0OO0IO();
                }

                @Override
                public final int I001i1lo1io() {
/* 1 */             return I00io1l();
                }

                @Override
                public final long I001iOo1i0O() {
/* 1 */             return I00ioIO();
                }

                @Override
                public final int I001l0I00() {
/* 5 */             return IOOOI0.I0000O(I00l0I0l0lO1());
                }

                @Override
                public final long I001lIiIIo1O() {
/* 5 */             return IOOOI0.I0000oI00(I00l0OO0IO());
                }

                @Override
                public final String I001lllioOl() throws O000oiiiOI0 {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int iI00l0I0l0lO1 = I00l0I0l0lO1();
/* 7 */             if (iI00l0I0l0lO1 > 0) {
/* 9 */                 int i = this.I0000oI00;
/* 11 */                int i2 = this.I000II;
/* 14 */                if (iI00l0I0l0lO1 <= i - i2) {
/* 20 */                    String str = new String(bArr, i2, iI00l0I0l0lO1, Iool1iOO11.I00000oIO);
                            this.I000II += iI00l0I0l0lO1;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iI00l0I0l0lO1 == 0) {
/* 31 */                return "";
                    }
/* 36 */            if (iI00l0I0l0lO1 > this.I0000oI00) {
/* 64 */                return new String(I00iio(iI00l0I0l0lO1), Iool1iOO11.I00000oIO);
                    }
/* 38 */            I00lli11(iI00l0I0l0lO1);
/* 47 */            String str2 = new String(bArr, this.I000II, iI00l0I0l0lO1, Iool1iOO11.I00000oIO);
                    this.I000II += iI00l0I0l0lO1;
/* 55 */            return str2;
                }

                @Override
                public final String I001lloI() throws IOException {
/* 1 */             byte[] bArrI00iio = this.I0000O;
/* 3 */             int iI00l0I0l0lO1 = I00l0I0l0lO1();
/* 7 */             int i = this.I000II;
/* 9 */             int i2 = this.I0000oI00;
/* 13 */            if (iI00l0I0l0lO1 <= i2 - i && iI00l0I0l0lO1 > 0) {
/* 19 */                this.I000II = i + iI00l0I0l0lO1;
                    } else {
/* 22 */                if (iI00l0I0l0lO1 == 0) {
/* 24 */                    return "";
                        }
/* 27 */                i = 0;
/* 28 */                if (iI00l0I0l0lO1 <= i2) {
/* 30 */                    I00lli11(iI00l0I0l0lO1);
/* 33 */                    this.I000II = iI00l0I0l0lO1;
                        } else {
/* 36 */                    bArrI00iio = I00iio(iI00l0I0l0lO1);
                        }
                    }
/* 42 */            return Oolio1l.I00000oIO.I00000oIO(bArrI00iio, i, iI00l0I0l0lO1);
                }

                @Override
                public final int I00II0Ol1O0l() throws O000oiiiOI0 {
/* 5 */             if (I000O01llI0()) {
/* 8 */                 this.I000O01llI0 = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00l0I0l0lO1 = I00l0I0l0lO1();
/* 15 */            this.I000O01llI0 = iI00l0I0l0lO1;
/* 19 */            if ((iI00l0I0l0lO1 >>> 3) != 0) {
/* 21 */                return iI00l0I0l0lO1;
                    }
/* 29 */            throw O000oiiiOI0.I00000oIO();
                }

                @Override
                public final int I00II0oii1o() {
/* 1 */             return I00l0I0l0lO1();
                }

                @Override
                public final long I00IO1() {
/* 1 */             return I00l0OO0IO();
                }

                public final byte[] I00iio(int i) throws IOException {
/* 1 */             byte[] bArrI00ilI0I1 = I00ilI0I1(i);
/* 5 */             if (bArrI00ilI0I1 != null) {
/* 7 */                 return bArrI00ilI0I1;
                    }
/* 8 */             int i2 = this.I000II;
/* 10 */            int i3 = this.I0000oI00;
/* 12 */            int length = i3 - i2;
                    this.I000OOo1O += i3;
/* 20 */            this.I000II = 0;
/* 22 */            this.I0000oI00 = 0;
/* 26 */            ArrayList arrayListI00ilO0 = I00ilO0(i - length);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.I0000O, i2, bArr, 0, length);
/* 37 */            Iterator it = arrayListI00ilO0.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                byte[] bArr2 = (byte[]) it.next();
/* 54 */                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
/* 58 */                length += bArr2.length;
                    }
/* 186 */           return bArr;
                }

                public final byte[] I00ilI0I1(int i) throws IOException {
/* 1 */             ByteArrayInputStream byteArrayInputStream = this.I0000Il00O;
/* 3 */             if (i == 0) {
/* 5 */                 return Iool1iOO11.I00000oOI;
                    }
/* 8 */             if (i < 0) {
/* 186 */               throw O000oiiiOI0.I0000oI00();
                    }
/* 10 */            int i2 = this.I000OOo1O;
/* 12 */            int i3 = this.I000II;
/* 16 */            int i4 = i2 + i3 + i;
/* 22 */            if (i4 - Integer.MAX_VALUE > 0) {
/* 117 */               throw new O000oiiiOI0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
/* 24 */            int i5 = this.I000OiO;
/* 26 */            if (i4 > i5) {
/* 102 */               I00lll10((i5 - i2) - i3);
/* 109 */               throw O000oiiiOI0.I000II();
                    }
/* 30 */            int i6 = this.I0000oI00 - i3;
/* 31 */            int i7 = i - i6;
/* 36 */            if (i7 >= 4096) {
                        try {
/* 42 */                    if (i7 > byteArrayInputStream.available()) {
/* 45 */                        return null;
                            }
                        } catch (O000oiiiOI0 e) {
/* 48 */                    e.I00iOIl = true;
/* 50 */                    throw e;
                        }
                    }
/* 51 */            byte[] bArr = new byte[i];
/* 58 */            System.arraycopy(this.I0000O, this.I000II, bArr, 0, i6);
                    this.I000OOo1O += this.I0000oI00;
/* 68 */            this.I000II = 0;
/* 70 */            this.I0000oI00 = 0;
/* 72 */            while (i6 < i) {
                        try {
/* 76 */                    int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
/* 81 */                    if (i8 == -1) {
/* 94 */                        throw O000oiiiOI0.I000II();
                            }
                            this.I000OOo1O += i8;
/* 88 */                    i6 += i8;
                        } catch (O000oiiiOI0 e2) {
/* 96 */                    e2.I00iOIl = true;
/* 98 */                    throw e2;
                        }
                    }
/* 99 */            return bArr;
                }

                public final ArrayList I00ilO0(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, Barcode.FORMAT_AZTEC);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
/* 23 */                    int i3 = this.I0000Il00O.read(bArr, i2, iMin - i2);
/* 28 */                    if (i3 == -1) {
/* 41 */                        throw O000oiiiOI0.I000II();
                            }
                            this.I000OOo1O += i3;
/* 35 */                    i2 += i3;
                        }
/* 42 */                i -= iMin;
/* 43 */                arrayList.add(bArr);
                    }
/* 49 */            return arrayList;
                }

                public final int I00io1l() throws O000oiiiOI0 {
/* 1 */             int i = this.I000II;
/* 7 */             if (this.I0000oI00 - i < 4) {
/* 9 */                 I00lli11(4);
/* 12 */                i = this.I000II;
                    }
/* 14 */            byte[] bArr = this.I0000O;
/* 18 */            this.I000II = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I00ioIO() throws O000oiiiOI0 {
/* 1 */             int i = this.I000II;
/* 8 */             if (this.I0000oI00 - i < 8) {
/* 10 */                I00lli11(8);
/* 13 */                i = this.I000II;
                    }
/* 15 */            byte[] bArr = this.I0000O;
/* 19 */            this.I000II = i + 8;
/* 95 */            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
                }

                public final int I00l0I0l0lO1() {
                    int i;
/* 1 */             int i2 = this.I000II;
/* 3 */             int i3 = this.I0000oI00;
/* 5 */             if (i3 != i2) {
/* 8 */                 byte[] bArr = this.I0000O;
/* 10 */                int i4 = i2 + 1;
/* 12 */                byte b = bArr[i2];
/* 14 */                if (b >= 0) {
/* 16 */                    this.I000II = i4;
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
/* 122 */                   this.I000II = i5;
/* 541 */                   return i;
                        }
                    }
/* 112 */           return (int) I00li1OI();
                }

                public final long I00l0OO0IO() {
                    long j;
                    long j2;
                    long j3;
/* 1 */             int i = this.I000II;
/* 3 */             int i2 = this.I0000oI00;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.I0000O;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I000II = i3;
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
/* 93 */                                    j3 = 266354560;
                                        } else {
/* 99 */                                    int i10 = i + 6;
/* 107 */                                   long j7 = j6 ^ (bArr[i4] << 35);
/* 110 */                                   if (j7 < 0) {
/* 112 */                                       j2 = -34093383808L;
                                            } else {
/* 121 */                                       i4 = i + 7;
/* 129 */                                       j6 = j7 ^ (bArr[i10] << 42);
/* 132 */                                       if (j6 >= 0) {
/* 134 */                                           j3 = 4363953127296L;
                                                } else {
/* 140 */                                           i10 = i + 8;
/* 148 */                                           j7 = j6 ^ (bArr[i4] << 49);
/* 151 */                                           if (j7 < 0) {
/* 153 */                                               j2 = -558586000294016L;
                                                    } else {
/* 159 */                                               i4 = i + 9;
/* 173 */                                               long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
/* 176 */                                               if (j8 < 0) {
/* 178 */                                                   int i11 = i + 10;
/* 185 */                                                   if (bArr[i4] >= 0) {
/* 192 */                                                       i4 = i11;
                                                            }
                                                        }
/* 193 */                                               j = j8;
                                                    }
                                                }
                                            }
/* 117 */                                   j = j7 ^ j2;
/* 119 */                                   i4 = i10;
                                        }
/* 96 */                                j = j6 ^ j3;
                                    }
                                }
                            }
/* 194 */                   this.I000II = i4;
/* 541 */                   return j;
                        }
                    }
/* 187 */           return I00li1OI();
                }

                public final long I00li1OI() throws O000oiiiOI0 {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.I000II == this.I0000oI00) {
/* 15 */                    I00lli11(1);
                        }
/* 18 */                byte[] bArr = this.I0000O;
/* 20 */                int i2 = this.I000II;
/* 24 */                this.I000II = i2 + 1;
/* 32 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 35 */                if ((bArr[i2] & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 113 */           throw O000oiiiOI0.I0000O();
                }

                public final void I00ll1() {
/* 5 */             int i = this.I0000oI00 + this.I0001Ioi1lo;
/* 6 */             this.I0000oI00 = i;
/* 10 */            int i2 = this.I000OOo1O + i;
/* 11 */            int i3 = this.I000OiO;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.I0001Ioi1lo = 0;
/* 29 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.I0001Ioi1lo = i4;
/* 19 */            this.I0000oI00 = i - i4;
                }

                public final void I00lli11(int i) throws O000oiiiOI0 {
/* 5 */             if (I00o0iI0io1(i)) {
/* 49 */                return;
                    }
/* 16 */            if (i <= (Integer.MAX_VALUE - this.I000OOo1O) - this.I000II) {
/* 30 */                throw O000oiiiOI0.I000II();
                    }
/* 25 */            throw new O000oiiiOI0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }

                public final void I00lll10(int i) throws O000oiiiOI0 {
/* 1 */             int i2 = this.I0000oI00;
/* 3 */             int i3 = this.I000II;
/* 5 */             int i4 = i2 - i3;
/* 6 */             if (i <= i4 && i >= 0) {
/* 11 */                this.I000II = i3 + i;
/* 13 */                return;
                    }
/* 14 */            ByteArrayInputStream byteArrayInputStream = this.I0000Il00O;
/* 16 */            if (i < 0) {
/* 186 */               throw O000oiiiOI0.I0000oI00();
                    }
/* 18 */            int i5 = this.I000OOo1O;
/* 20 */            int i6 = i5 + i3;
/* 22 */            int i7 = i6 + i;
/* 24 */            int i8 = this.I000OiO;
/* 26 */            if (i7 > i8) {
/* 150 */               I00lll10((i8 - i5) - i3);
/* 157 */               throw O000oiiiOI0.I000II();
                    }
/* 28 */            this.I000OOo1O = i6;
/* 31 */            this.I0000oI00 = 0;
/* 33 */            this.I000II = 0;
/* 36 */            while (i4 < i) {
/* 38 */                long j = i - i4;
                        try {
                            try {
/* 41 */                        long jSkip = byteArrayInputStream.skip(j);
/* 49 */                        if (jSkip < 0 || jSkip > j) {
/* 95 */                            throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 55 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 59 */                            i4 += (int) jSkip;
                                }
                            } catch (O000oiiiOI0 e) {
/* 99 */                        e.I00iOIl = true;
/* 101 */                       throw e;
                            }
                        } catch (Throwable th) {
                            this.I000OOo1O += i4;
/* 107 */                   I00ll1();
/* 110 */                   throw th;
                        }
                    }
                    this.I000OOo1O += i4;
/* 116 */           I00ll1();
/* 119 */           if (i4 >= i) {
/* 147 */               return;
                    }
/* 121 */           int i9 = this.I0000oI00;
/* 125 */           int i10 = i9 - this.I000II;
/* 127 */           this.I000II = i9;
/* 129 */           I00lli11(1);
                    while (true) {
/* 132 */               int i11 = i - i10;
/* 134 */               int i12 = this.I0000oI00;
/* 136 */               if (i11 <= i12) {
/* 145 */                   this.I000II = i11;
/* 147 */                   return;
                        } else {
/* 138 */                   i10 += i12;
/* 139 */                   this.I000II = i12;
/* 141 */                   I00lli11(1);
                        }
                    }
                }

                public final boolean I00o0iI0io1(int i) throws IOException {
/* 1 */             ByteArrayInputStream byteArrayInputStream = this.I0000Il00O;
/* 3 */             byte[] bArr = this.I0000O;
/* 5 */             int i2 = this.I000II;
/* 7 */             int i3 = i2 + i;
/* 9 */             int i4 = this.I0000oI00;
/* 12 */            if (i3 <= i4) {
/* 115 */               I000II.I001IO000(IIlIOloOOO.I00100l0("refillBuffer() called when ", i, " bytes were already available in buffer"));
/* 11 */                return false;
                    }
/* 14 */            int i5 = this.I000OOo1O;
/* 22 */            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.I000OiO) {
/* 33 */                if (i2 > 0) {
/* 35 */                    if (i4 > i2) {
/* 38 */                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                            }
/* 43 */                    i5 = this.I000OOo1O + i2;
/* 44 */                    this.I000OOo1O = i5;
/* 48 */                    i4 = this.I0000oI00 - i2;
/* 49 */                    this.I0000oI00 = i4;
/* 51 */                    this.I000II = 0;
                        }
                        try {
/* 62 */                    int i6 = byteArrayInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
/* 66 */                    if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
/* 99 */                        I000II.I000II(i6, byteArrayInputStream.getClass());
/* 11 */                        return false;
                            }
/* 74 */                    if (i6 > 0) {
                                this.I0000oI00 += i6;
/* 81 */                        I00ll1();
/* 86 */                        if (this.I0000oI00 >= i) {
/* 61 */                            return true;
                                }
/* 89 */                        return I00o0iI0io1(i);
                            }
                        } catch (O000oiiiOI0 e) {
/* 104 */                   e.I00iOIl = true;
/* 106 */                   throw e;
                        }
                    }
/* 11 */            return false;
                }
            }

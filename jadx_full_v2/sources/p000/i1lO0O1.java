            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class i1lO0O1 extends IOOOIO1O {
                public InputStream I0000O;
                public byte[] I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;

                @Override
                public final int I001l0I00(int i) throws iI00lI {
/* 1 */             if (i < 0) {
/* 36 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 26 */                return 0;
                    }
/* 8 */             int i2 = this.I000OiO + this.I000O01llI0 + i;
/* 9 */             if (i2 < 0) {
/* 30 */                iilo0lOo110.I000II("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 26 */                return 0;
                    }
/* 11 */            int i3 = this.I000iOII;
/* 13 */            if (i2 > i3) {
/* 23 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 26 */                return 0;
                    }
/* 15 */            this.I000iOII = i2;
/* 17 */            I00iIO();
/* 20 */            return i3;
                }

                @Override
                public final void I001lIiIIo1O(int i) {
/* 1 */             this.I000iOII = i;
/* 3 */             I00iIO();
                }

                @Override
                public final int I001lllioOl() {
/* 1 */             int i = this.I000iOII;
/* 6 */             if (i == Integer.MAX_VALUE) {
/* 8 */                 return -1;
                    }
/* 15 */            return i - (this.I000OiO + this.I000O01llI0);
                }

                @Override
                public final boolean I001lloI() {
                    return this.I000O01llI0 == this.I0001Ioi1lo && !I00iOIl(1);
                }

                @Override
                public final int I00II0Ol1O0l() {
/* 5 */             return this.I000OiO + this.I000O01llI0;
                }

                @Override
                public final int I00II0oii1o(byte[] bArr, int i, int i2) throws IOException {
/* 5 */             if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
/* 71 */                OoOil11Ol1o.I001i1lo1io();
/* 4 */                 return 0;
                    }
/* 11 */            if (i2 == 0) {
/* 4 */                 return 0;
                    }
/* 14 */            int i3 = this.I0001Ioi1lo;
/* 16 */            int i4 = this.I000O01llI0;
/* 18 */            int i5 = i3 - i4;
/* 19 */            if (i5 > 0) {
/* 21 */                int iMin = Math.min(i2, i5);
/* 29 */                System.arraycopy(this.I0000oI00, this.I000O01llI0, bArr, i, iMin);
                        this.I000O01llI0 += iMin;
/* 37 */                return iMin;
                    }
/* 44 */            int iMin2 = Math.min(i2, (this.I000iOII - this.I000OiO) - i4);
/* 49 */            if (iMin2 <= 0) {
/* 48 */                return -1;
                    }
                    try {
/* 54 */                int i6 = this.I0000O.read(bArr, i, iMin2);
/* 58 */                if (i6 != -1) {
                            this.I000OiO += i6;
                        }
/* 65 */                return i6;
                    } catch (iI00lI e) {
/* 68 */                e.I00iOIl = true;
/* 70 */                throw e;
                    }
                }

                @Override
                public final void I00IO1(int i) throws iI00lI {
/* 1 */             InputStream inputStream = this.I0000O;
/* 3 */             int i2 = this.I0001Ioi1lo;
/* 5 */             int i3 = this.I000O01llI0;
/* 7 */             int i4 = i2 - i3;
/* 8 */             if (i <= i4 && i >= 0) {
/* 14 */                this.I000O01llI0 = i3 + i;
/* 16 */                return;
                    }
/* 21 */            if (i < 0) {
/* 183 */               iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 437 */               return;
                    }
/* 23 */            int i5 = this.I000OiO;
/* 25 */            int i6 = i5 + i3;
/* 27 */            int i7 = this.I000iOII;
/* 31 */            if (i6 + i > i7) {
/* 172 */               I00IO1((i7 - i5) - i3);
/* 177 */               iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 180 */               return;
                    }
/* 33 */            this.I000OiO = i6;
/* 36 */            this.I0001Ioi1lo = 0;
/* 38 */            this.I000O01llI0 = 0;
/* 41 */            while (i4 < i) {
/* 43 */                long j = i - i4;
                        try {
                            try {
/* 46 */                        long jSkip = inputStream.skip(j);
/* 54 */                        if (jSkip < 0 || jSkip > j) {
/* 72 */                            String strValueOf = String.valueOf(inputStream.getClass());
/* 95 */                            StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
/* 98 */                            sb.append(strValueOf);
/* 101 */                           sb.append("#skip returned invalid result: ");
/* 104 */                           sb.append(jSkip);
/* 107 */                           sb.append("\nThe InputStream implementation is buggy.");
/* 117 */                           throw new IllegalStateException(sb.toString());
                                }
/* 60 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 64 */                            i4 += (int) jSkip;
                                }
                            } catch (iI00lI e) {
/* 121 */                       e.I00iOIl = true;
/* 123 */                       throw e;
                            }
                        } catch (Throwable th) {
                            this.I000OiO += i4;
/* 129 */                   I00iIO();
/* 132 */                   throw th;
                        }
                    }
                    this.I000OiO += i4;
/* 138 */           I00iIO();
/* 141 */           if (i4 >= i) {
/* 169 */               return;
                    }
/* 143 */           int i8 = this.I0001Ioi1lo;
/* 147 */           int i9 = i8 - this.I000O01llI0;
/* 149 */           this.I000O01llI0 = i8;
/* 151 */           I00iIi0i1o(1);
                    while (true) {
/* 154 */               int i10 = i - i9;
/* 156 */               int i11 = this.I0001Ioi1lo;
/* 158 */               if (i10 <= i11) {
/* 167 */                   this.I000O01llI0 = i10;
/* 169 */                   return;
                        } else {
/* 160 */                   i9 += i11;
/* 161 */                   this.I000O01llI0 = i11;
/* 163 */                   I00iIi0i1o(1);
                        }
                    }
                }

                @Override
                public final int I00Io1o110i() throws iI00lI {
/* 5 */             if (I001lloI()) {
/* 8 */                 this.I000OOo1O = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00i0ilIl0i = I00i0ilIl0i();
/* 15 */            this.I000OOo1O = iI00i0ilIl0i;
/* 19 */            if ((iI00i0ilIl0i >>> 3) != 0) {
/* 21 */                return iI00i0ilIl0i;
                    }
/* 24 */            iilo0lOo110.I000II("Protocol message contained an invalid tag (zero).");
/* 27 */            return 0;
                }

                @Override
                public final void I00IoIO0lI(int i) throws iI00lI {
/* 3 */             if (this.I000OOo1O == i) {
/* 5 */                 return;
                    }
/* 8 */             iilo0lOo110.I000II("Protocol message end-group tag did not match expected tag.");
                }

                @Override
                public final boolean I00IoO0(int i) throws iI00lI {
/* 1 */             byte[] bArr = this.I0000oI00;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 == 0) {
/* 73 */                if (this.I0001Ioi1lo - this.I000O01llI0 >= 10) {
/* 75 */                    while (i3 < 10) {
/* 77 */                        int i4 = this.I000O01llI0;
/* 81 */                        this.I000O01llI0 = i4 + 1;
/* 85 */                        if (bArr[i4] < 0) {
/* 88 */                            i3++;
                                }
                            }
/* 91 */                    iilo0lOo110.I000II("CodedInputStream encountered a malformed varint.");
/* 30 */                    return false;
                        }
/* 95 */                while (i3 < 10) {
/* 101 */                   if (this.I000O01llI0 == this.I0001Ioi1lo) {
/* 103 */                       I00iIi0i1o(1);
                            }
/* 106 */                   int i5 = this.I000O01llI0;
/* 110 */                   this.I000O01llI0 = i5 + 1;
/* 114 */                   if (bArr[i5] < 0) {
/* 116 */                       i3++;
                            }
                        }
/* 120 */               iilo0lOo110.I000II("CodedInputStream encountered a malformed varint.");
/* 30 */                return false;
/* 6 */                 return true;
                    }
/* 9 */             if (i2 == 1) {
/* 60 */                I00IO1(8);
/* 6 */                 return true;
                    }
/* 12 */            if (i2 == 2) {
/* 54 */                I00IO1(I00i0ilIl0i());
/* 6 */                 return true;
                    }
/* 16 */            if (i2 == 3) {
/* 40 */                I00IioO0OiOi();
/* 46 */                I00IoIO0lI(((i >>> 3) << 3) | 4);
/* 6 */                 return true;
                    }
/* 18 */            if (i2 == 4) {
/* 34 */                if (this.I00000oOI == 0) {
/* 36 */                    I00IoIO0lI(0);
                        }
/* 5 */                 return false;
                    }
/* 21 */            if (i2 == 5) {
/* 23 */                I00IO1(4);
/* 6 */                 return true;
                    }
/* 27 */            OoOil11Ol1o.I00100l0();
/* 30 */            return false;
                }

                @Override
                public final double I00IoiI() {
/* 5 */             return Double.longBitsToDouble(I00io1l());
                }

                @Override
                public final float I00Iooi00oi() {
/* 5 */             return Float.intBitsToFloat(I00ilO0());
                }

                @Override
                public final long I00O0i0ii() {
/* 1 */             return I00i0oil();
                }

                @Override
                public final long I00O0o1oo() {
/* 1 */             return I00i0oil();
                }

                @Override
                public final int I00O10llo() {
/* 1 */             return I00i0ilIl0i();
                }

                @Override
                public final long I00OI1() {
/* 1 */             return I00io1l();
                }

                @Override
                public final int I00OIO1() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final boolean I00OIl() {
                    return I00i0oil() != 0;
                }

                @Override
                public final String I00OIo() throws iI00lI {
/* 1 */             byte[] bArr = this.I0000oI00;
/* 3 */             int iI00i0ilIl0i = I00i0ilIl0i();
/* 7 */             if (iI00i0ilIl0i > 0) {
/* 9 */                 int i = this.I0001Ioi1lo;
/* 11 */                int i2 = this.I000O01llI0;
/* 14 */                if (iI00i0ilIl0i <= i - i2) {
/* 21 */                    String str = new String(bArr, i2, iI00i0ilIl0i, StandardCharsets.UTF_8);
                            this.I000O01llI0 += iI00i0ilIl0i;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iI00i0ilIl0i == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iI00i0ilIl0i < 0) {
/* 73 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 76 */                return null;
                    }
/* 39 */            if (iI00i0ilIl0i > this.I0001Ioi1lo) {
/* 67 */                return new String(I00iiI(iI00i0ilIl0i), StandardCharsets.UTF_8);
                    }
/* 41 */            I00iIi0i1o(iI00i0ilIl0i);
/* 50 */            String str2 = new String(bArr, this.I000O01llI0, iI00i0ilIl0i, StandardCharsets.UTF_8);
                    this.I000O01llI0 += iI00i0ilIl0i;
/* 58 */            return str2;
                }

                @Override
                public final String I00OOll1() throws IOException {
/* 1 */             byte[] bArrI00iiI = this.I0000oI00;
/* 3 */             int iI00i0ilIl0i = I00i0ilIl0i();
/* 7 */             int i = this.I000O01llI0;
/* 9 */             int i2 = this.I0001Ioi1lo;
/* 13 */            if (iI00i0ilIl0i <= i2 - i && iI00i0ilIl0i > 0) {
/* 19 */                this.I000O01llI0 = i + iI00i0ilIl0i;
                    } else {
/* 22 */                if (iI00i0ilIl0i == 0) {
/* 24 */                    return "";
                        }
/* 27 */                if (iI00i0ilIl0i < 0) {
/* 49 */                    iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 52 */                    return null;
                        }
/* 29 */                i = 0;
/* 30 */                if (iI00i0ilIl0i <= i2) {
/* 32 */                    I00iIi0i1o(iI00i0ilIl0i);
/* 35 */                    this.I000O01llI0 = iI00i0ilIl0i;
                        } else {
/* 38 */                    bArrI00iiI = I00iiI(iI00i0ilIl0i);
                        }
                    }
/* 42 */            return iI1i1o0lIl1o.I0000O(bArrI00iiI, i, iI00i0ilIl0i);
                }

                @Override
                public final i1lI1O I00OilO00Il() throws IOException {
/* 1 */             byte[] bArr = this.I0000oI00;
/* 3 */             int iI00i0ilIl0i = I00i0ilIl0i();
/* 7 */             int i = this.I0001Ioi1lo;
/* 9 */             int i2 = this.I000O01llI0;
/* 12 */            if (iI00i0ilIl0i <= i - i2 && iI00i0ilIl0i > 0) {
/* 16 */                i1lI1O i1li1oI000o00OoI0I = i1lIIl01O.I000o00OoI0I(bArr, i2, iI00i0ilIl0i);
                        this.I000O01llI0 += iI00i0ilIl0i;
/* 25 */                return i1li1oI000o00OoI0I;
                    }
/* 26 */            if (iI00i0ilIl0i == 0) {
/* 28 */                return i1lIIl01O.I00iiI;
                    }
/* 31 */            if (iI00i0ilIl0i < 0) {
/* 118 */               iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 121 */               return null;
                    }
/* 33 */            byte[] bArrI00iiO = I00iiO(iI00i0ilIl0i);
/* 38 */            if (bArrI00iiO != null) {
/* 41 */                return i1lIIl01O.I000o00OoI0I(bArrI00iiO, 0, bArrI00iiO.length);
                    }
/* 46 */            int i3 = this.I000O01llI0;
/* 48 */            int i4 = this.I0001Ioi1lo;
/* 50 */            int i5 = i4 - i3;
                    this.I000OiO += i4;
/* 57 */            this.I000O01llI0 = 0;
/* 59 */            this.I0001Ioi1lo = 0;
/* 63 */            ArrayList arrayListI00iio = I00iio(iI00i0ilIl0i - i5);
/* 67 */            byte[] bArr2 = new byte[iI00i0ilIl0i];
/* 69 */            System.arraycopy(bArr, i3, bArr2, 0, i5);
/* 72 */            Iterator it = arrayListI00iio.iterator();
/* 80 */            while (it.hasNext()) {
/* 86 */                byte[] bArr3 = (byte[]) it.next();
/* 88 */                int length = bArr3.length;
/* 89 */                System.arraycopy(bArr3, 0, bArr2, i5, length);
/* 92 */                i5 += length;
                    }
                    try {
/* 94 */                i1lI1O i1li1o = i1lIIl01O.I00iiI;
                        return iI00i0ilIl0i == 0 ? i1lIIl01O.I00iiI : new i1lI1O(bArr2);
                    } catch (iI00lI e) {
/* 115 */               throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                }

                @Override
                public final byte[] I00Oio() throws iI00lI {
/* 1 */             int iI00i0ilIl0i = I00i0ilIl0i();
/* 5 */             int i = this.I0001Ioi1lo;
/* 7 */             int i2 = this.I000O01llI0;
/* 10 */            if (iI00i0ilIl0i <= i - i2 && iI00i0ilIl0i > 0) {
/* 19 */                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.I0000oI00, i2, i2 + iI00i0ilIl0i);
                        this.I000O01llI0 += iI00i0ilIl0i;
/* 28 */                return bArrCopyOfRange;
                    }
/* 29 */            if (iI00i0ilIl0i >= 0) {
/* 31 */                return I00iiI(iI00i0ilIl0i);
                    }
/* 38 */            iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 41 */            return null;
                }

                @Override
                public final int I00Ol00() {
/* 1 */             return I00i0ilIl0i();
                }

                @Override
                public final int I00Ol10() {
/* 1 */             return I00i0ilIl0i();
                }

                @Override
                public final int I00Ol1ll1() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final long I00OloOo() {
/* 1 */             return I00io1l();
                }

                @Override
                public final int I00i01iIIliI() {
/* 5 */             return IOOOIO1O.I00IlilI0i0i(I00i0ilIl0i());
                }

                @Override
                public final long I00i0O() {
/* 5 */             return IOOOIO1O.I00Io1lO(I00i0oil());
                }

                @Override
                public final int I00i0ilIl0i() {
                    int i;
/* 1 */             int i2 = this.I000O01llI0;
/* 3 */             int i3 = this.I0001Ioi1lo;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.I0000oI00;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I000O01llI0 = i4;
/* 19 */                    return b;
                        }
/* 23 */                if (i3 - i4 >= 9) {
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
/* 110 */                                                       i5 = i12;
/* 111 */                                                       i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 115 */                                   i = i11;
                                        }
/* 113 */                               i = i11;
                                    }
/* 63 */                            i5 = i9;
                                }
/* 48 */                        i5 = i7;
                            }
/* 117 */                   this.I000O01llI0 = i5;
/* 119 */                   return i;
                        }
                    }
/* 124 */           return (int) I00ilI0I1();
                }

                @Override
                public final long I00i0oil() {
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
/* 26 */                    int i4 = i + 2;
/* 32 */                    int i5 = (bArr[i3] << 7) ^ b;
/* 33 */                    if (i5 < 0) {
/* 35 */                        j = i5 ^ (-128);
                            } else {
/* 40 */                        int i6 = i + 3;
/* 46 */                        int i7 = (bArr[i4] << 14) ^ i5;
/* 47 */                        if (i7 >= 0) {
/* 49 */                            j = i7 ^ 16256;
                                } else {
/* 55 */                            int i8 = i + 4;
/* 61 */                            int i9 = i7 ^ (bArr[i6] << 21);
/* 62 */                            if (i9 < 0) {
/* 67 */                                long j4 = (-2080896) ^ i9;
/* 70 */                                i4 = i8;
/* 71 */                                j = j4;
                                    } else {
/* 74 */                                i6 = i + 5;
/* 83 */                                long j5 = (bArr[i8] << 28) ^ i9;
/* 88 */                                if (j5 >= 0) {
/* 93 */                                    j = j5 ^ 266354560;
                                        } else {
/* 96 */                                    i4 = i + 6;
/* 104 */                                   long j6 = (bArr[i6] << 35) ^ j5;
/* 107 */                                   if (j6 < 0) {
/* 109 */                                       j3 = -34093383808L;
                                            } else {
/* 117 */                                       int i10 = i + 7;
/* 125 */                                       long j7 = j6 ^ (bArr[i4] << 42);
/* 128 */                                       if (j7 >= 0) {
/* 130 */                                           j2 = 4363953127296L;
                                                } else {
/* 139 */                                           i4 = i + 8;
/* 147 */                                           j6 = j7 ^ (bArr[i10] << 49);
/* 150 */                                           if (j6 < 0) {
/* 152 */                                               j3 = -558586000294016L;
                                                    } else {
/* 158 */                                               i10 = i + 9;
/* 166 */                                               j7 = j6 ^ (bArr[i4] << 56);
/* 169 */                                               if (j7 >= 0) {
/* 171 */                                                   j2 = 71499008037633920L;
                                                        } else {
/* 177 */                                                   i4 = i + 10;
/* 185 */                                                   long j8 = j7 ^ (bArr[i10] << 63);
/* 189 */                                                   if (j8 >= 0) {
/* 196 */                                                       j = j8 ^ (-9151873028817141888L);
                                                            }
                                                        }
                                                    }
                                                }
/* 135 */                                       j = j7 ^ j2;
/* 137 */                                       i4 = i10;
                                            }
/* 114 */                                   j = j6 ^ j3;
                                        }
                                    }
                                }
/* 52 */                        i4 = i6;
                            }
/* 197 */                   this.I000O01llI0 = i4;
/* 199 */                   return j;
                        }
                    }
/* 200 */           return I00ilI0I1();
                }

                public final void I00iIO() {
/* 5 */             int i = this.I0001Ioi1lo + this.I000II;
/* 6 */             this.I0001Ioi1lo = i;
/* 10 */            int i2 = this.I000OiO + i;
/* 11 */            int i3 = this.I000iOII;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.I000II = 0;
/* 55 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.I000II = i4;
/* 19 */            this.I0001Ioi1lo = i - i4;
                }

                public final void I00iIi0i1o(int i) throws iI00lI {
/* 5 */             if (I00iOIl(i)) {
/* 29 */                return;
                    }
/* 16 */            if (i > (Integer.MAX_VALUE - this.I000OiO) - this.I000O01llI0) {
/* 20 */                iilo0lOo110.I000II("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    } else {
/* 26 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                public final boolean I00iOIl(int i) throws IOException {
/* 1 */             InputStream inputStream = this.I0000O;
/* 3 */             byte[] bArr = this.I0000oI00;
/* 5 */             int i2 = this.I000O01llI0;
/* 7 */             int i3 = i2 + i;
/* 9 */             int i4 = this.I0001Ioi1lo;
/* 12 */            if (i3 <= i4) {
/* 181 */               I000II.I001IO000(IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
/* 11 */                return false;
                    }
/* 14 */            int i5 = this.I000OiO;
/* 22 */            if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.I000iOII) {
/* 11 */                return false;
                    }
/* 33 */            if (i2 > 0) {
/* 35 */                if (i4 > i2) {
/* 38 */                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
/* 43 */                i5 = this.I000OiO + i2;
/* 44 */                this.I000OiO = i5;
/* 48 */                i4 = this.I0001Ioi1lo - i2;
/* 49 */                this.I0001Ioi1lo = i4;
/* 51 */                this.I000O01llI0 = 0;
                    }
                    try {
/* 62 */                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
/* 66 */                if (i6 != 0 && i6 >= -1 && i6 <= bArr.length) {
/* 74 */                    if (i6 <= 0) {
/* 11 */                        return false;
                            }
                            this.I0001Ioi1lo += i6;
/* 81 */                    I00iIO();
                            return this.I0001Ioi1lo >= i || I00iOIl(i);
                        }
/* 104 */               String strValueOf = String.valueOf(inputStream.getClass());
/* 127 */               StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
/* 130 */               sb.append(strValueOf);
/* 135 */               sb.append("#read(byte[]) returned invalid result: ");
/* 138 */               sb.append(i6);
/* 143 */               sb.append("\nThe InputStream implementation is buggy.");
/* 153 */               throw new IllegalStateException(sb.toString());
                    } catch (iI00lI e) {
/* 155 */               e.I00iOIl = true;
/* 157 */               throw e;
                    }
                }

                public final byte[] I00iiI(int i) throws IOException {
/* 1 */             byte[] bArrI00iiO = I00iiO(i);
/* 5 */             if (bArrI00iiO != null) {
/* 7 */                 return bArrI00iiO;
                    }
/* 8 */             int i2 = this.I000O01llI0;
/* 10 */            int i3 = this.I0001Ioi1lo;
/* 12 */            int i4 = i3 - i2;
                    this.I000OiO += i3;
/* 20 */            this.I000O01llI0 = 0;
/* 22 */            this.I0001Ioi1lo = 0;
/* 26 */            ArrayList arrayListI00iio = I00iio(i - i4);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.I0000oI00, i2, bArr, 0, i4);
/* 37 */            Iterator it = arrayListI00iio.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                byte[] bArr2 = (byte[]) it.next();
/* 53 */                int length = bArr2.length;
/* 54 */                System.arraycopy(bArr2, 0, bArr, i4, length);
/* 57 */                i4 += length;
                    }
/* 77 */            return bArr;
                }

                public final byte[] I00iiO(int i) throws IOException {
/* 1 */             InputStream inputStream = this.I0000O;
/* 3 */             if (i == 0) {
/* 5 */                 return iI000IO.I00000oIO;
                    }
/* 8 */             int i2 = this.I000OiO;
/* 10 */            int i3 = this.I000O01llI0;
/* 14 */            int i4 = i2 + i3 + i;
/* 20 */            if ((-2147483647) + i4 > 0) {
/* 109 */               iilo0lOo110.I000II("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 19 */                return null;
                    }
/* 22 */            int i5 = this.I000iOII;
/* 26 */            if (i4 > i5) {
/* 100 */               I00IO1((i5 - i2) - i3);
/* 103 */               iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 19 */                return null;
                    }
/* 30 */            int i6 = this.I0001Ioi1lo - i3;
/* 31 */            int i7 = i - i6;
/* 36 */            if (i7 >= 4096) {
                        try {
/* 42 */                    if (i7 > inputStream.available()) {
/* 19 */                        return null;
                            }
                        } catch (iI00lI e) {
/* 47 */                    e.I00iOIl = true;
/* 49 */                    throw e;
                        }
                    }
/* 50 */            byte[] bArr = new byte[i];
/* 57 */            System.arraycopy(this.I0000oI00, this.I000O01llI0, bArr, 0, i6);
                    this.I000OiO += this.I0001Ioi1lo;
/* 67 */            this.I000O01llI0 = 0;
/* 69 */            this.I0001Ioi1lo = 0;
/* 71 */            while (i6 < i) {
                        try {
/* 75 */                    int i8 = inputStream.read(bArr, i6, i - i6);
/* 80 */                    if (i8 == -1) {
/* 89 */                        iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 19 */                        return null;
                            }
                            this.I000OiO += i8;
/* 87 */                    i6 += i8;
                        } catch (iI00lI e2) {
/* 94 */                    e2.I00iOIl = true;
/* 96 */                    throw e2;
                        }
                    }
/* 97 */            return bArr;
                }

                public final ArrayList I00iio(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, Barcode.FORMAT_AZTEC);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
                            try {
/* 23 */                        int i3 = this.I0000O.read(bArr, i2, iMin - i2);
/* 28 */                        if (i3 == -1) {
/* 39 */                            iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */                            return null;
                                }
                                this.I000OiO += i3;
/* 35 */                        i2 += i3;
                            } catch (iI00lI e) {
/* 46 */                        e.I00iOIl = true;
/* 48 */                        throw e;
                            }
                        }
/* 49 */                i -= iMin;
/* 50 */                arrayList.add(bArr);
                    }
/* 77 */            return arrayList;
                }

                public final long I00ilI0I1() throws iI00lI {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.I000O01llI0 == this.I0001Ioi1lo) {
/* 15 */                    I00iIi0i1o(1);
                        }
/* 18 */                byte[] bArr = this.I0000oI00;
/* 20 */                int i2 = this.I000O01llI0;
/* 24 */                this.I000O01llI0 = i2 + 1;
/* 32 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 35 */                if ((bArr[i2] & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 43 */            iilo0lOo110.I000II("CodedInputStream encountered a malformed varint.");
/* 46 */            return 0L;
                }

                public final int I00ilO0() throws iI00lI {
/* 1 */             int i = this.I000O01llI0;
/* 7 */             if (this.I0001Ioi1lo - i < 4) {
/* 9 */                 I00iIi0i1o(4);
/* 12 */                i = this.I000O01llI0;
                    }
/* 14 */            byte[] bArr = this.I0000oI00;
/* 18 */            this.I000O01llI0 = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I00io1l() throws iI00lI {
/* 3 */             int i = this.I000O01llI0;
/* 10 */            if (this.I0001Ioi1lo - i < 8) {
/* 12 */                I00iIi0i1o(8);
/* 15 */                i = this.I000O01llI0;
                    }
/* 17 */            byte[] bArr = this.I0000oI00;
/* 21 */            this.I000O01llI0 = i + 8;
/* 23 */            long j = bArr[i];
/* 38 */            long j2 = bArr[i + 2];
/* 43 */            long j3 = bArr[i + 3];
/* 106 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }
            }

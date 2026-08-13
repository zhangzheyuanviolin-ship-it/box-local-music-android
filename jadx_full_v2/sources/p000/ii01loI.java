            package p000;

            import java.util.Arrays;
            
            public final class ii01loI extends IOOOI0 {
                public byte[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;

                @Override
                public final void I00IioO0OiOi(int i) {
/* 1 */             this.I000O01llI0 = i;
/* 7 */             int i2 = this.I0000O + this.I0000oI00;
/* 8 */             this.I0000O = i2;
/* 10 */            if (i2 <= i) {
/* 21 */                this.I0000oI00 = 0;
/* 29 */                return;
                    }
/* 12 */            int i3 = i2 - i;
/* 14 */            this.I0000oI00 = i3;
/* 17 */            this.I0000O = i2 - i3;
                }

                @Override
                public final boolean I00IlilI0i0i() {
                    return this.I0001Ioi1lo == this.I0000O;
                }

                @Override
                public final boolean I00Io1lO() {
                    return I00ioIO() != 0;
                }

                @Override
                public final boolean I00Io1o110i(int i) throws ii0iI11ol {
                    int iI00Ol10;
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 == 0) {
/* 75 */                if (this.I0000O - this.I0001Ioi1lo >= 10) {
/* 77 */                    while (i3 < 10) {
/* 79 */                        int i4 = this.I0001Ioi1lo;
/* 83 */                        this.I0001Ioi1lo = i4 + 1;
/* 87 */                        if (bArr[i4] < 0) {
/* 90 */                            i3++;
                                }
                            }
/* 93 */                    OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered a malformed varint.");
/* 30 */                    return false;
                        }
/* 97 */                while (i3 < 10) {
/* 99 */                    int i5 = this.I0001Ioi1lo;
/* 103 */                   if (i5 == this.I0000O) {
/* 119 */                       OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */                        return false;
                            }
/* 107 */                   this.I0001Ioi1lo = i5 + 1;
/* 111 */                   if (bArr[i5] < 0) {
/* 113 */                       i3++;
                            }
                        }
/* 123 */               OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered a malformed varint.");
/* 30 */                return false;
/* 6 */                 return true;
                    }
/* 9 */             if (i2 == 1) {
/* 62 */                I00iio(8);
/* 6 */                 return true;
                    }
/* 12 */            if (i2 == 2) {
/* 56 */                I00iio(I00ilO0());
/* 6 */                 return true;
                    }
/* 16 */            if (i2 == 3) {
/* 43 */                do {
/* 33 */                    iI00Ol10 = I00Ol10();
/* 37 */                    if (iI00Ol10 == 0) {
                                break;
                            }
/* 43 */                } while (I00Io1o110i(iI00Ol10));
/* 48 */                I00iiO(((i >>> 3) << 3) | 4);
/* 6 */                 return true;
                    }
/* 18 */            if (i2 == 4) {
/* 5 */                 return false;
                    }
/* 21 */            if (i2 == 5) {
/* 23 */                I00iio(4);
/* 6 */                 return true;
                    }
/* 27 */            OoOil11Ol1o.I001IO000();
/* 30 */            return false;
                }

                @Override
                public final double I00O0i0ii() {
/* 5 */             return Double.longBitsToDouble(I00io1l());
                }

                @Override
                public final float I00OI1() {
/* 5 */             return Float.intBitsToFloat(I00ilI0I1());
                }

                @Override
                public final int I00OIO1() {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
                public final int I00OIl(int i) throws ii0iI11ol {
/* 1 */             if (i < 0) {
/* 50 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 40 */                return 0;
                    }
/* 5 */             int i2 = i + this.I0001Ioi1lo;
/* 6 */             if (i2 < 0) {
/* 44 */                OoOil11Ol1o.I001iOo1i0O("Failed to parse the message.");
/* 40 */                return 0;
                    }
/* 8 */             int i3 = this.I000O01llI0;
/* 10 */            if (i2 > i3) {
/* 37 */                OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 40 */                return 0;
                    }
/* 12 */            this.I000O01llI0 = i2;
/* 18 */            int i4 = this.I0000O + this.I0000oI00;
/* 19 */            this.I0000O = i4;
/* 21 */            if (i4 <= i2) {
/* 32 */                this.I0000oI00 = 0;
/* 34 */                return i3;
                    }
/* 23 */            int i5 = i4 - i2;
/* 25 */            this.I0000oI00 = i5;
/* 28 */            this.I0000O = i4 - i5;
/* 30 */            return i3;
                }

                @Override
                public final int I00OIo() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final int I00OOll1() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final int I00OilO00Il() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final int I00Oio() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final int I00Ol00() {
/* 5 */             return IOOOI0.I00IoIO0lI(I00ilO0());
                }

                @Override
                public final int I00Ol10() throws ii0iI11ol {
/* 5 */             if (I00IlilI0i0i()) {
/* 8 */                 this.I000II = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00ilO0 = I00ilO0();
/* 15 */            this.I000II = iI00ilO0;
/* 19 */            if ((iI00ilO0 >>> 3) != 0) {
/* 21 */                return iI00ilO0;
                    }
/* 24 */            OoOil11Ol1o.I001iOo1i0O("Protocol message contained an invalid tag (zero).");
/* 27 */            return 0;
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
                public final long I00i01iIIliI() {
/* 1 */             return I00ioIO();
                }

                @Override
                public final long I00i0O() {
/* 1 */             return I00io1l();
                }

                @Override
                public final long I00i0ilIl0i() {
/* 5 */             return IOOOI0.I00IoO0(I00ioIO());
                }

                @Override
                public final long I00i0oil() {
/* 1 */             return I00ioIO();
                }

                @Override
                public final ii01iiOoo I00iIO() throws ii0iI11ol {
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 3 */             int iI00ilO0 = I00ilO0();
/* 7 */             if (iI00ilO0 > 0) {
/* 9 */                 int i = this.I0000O;
/* 11 */                int i2 = this.I0001Ioi1lo;
/* 14 */                if (iI00ilO0 <= i - i2) {
/* 17 */                    ii01iiOoo ii01iioooI0010o = ii01lO0l11ii.I0010o(bArr, i2, iI00ilO0);
                            this.I0001Ioi1lo += iI00ilO0;
/* 26 */                    return ii01iioooI0010o;
                        }
                    }
/* 27 */            if (iI00ilO0 == 0) {
/* 67 */                return ii01lO0l11ii.I00iiI;
                    }
/* 29 */            if (iI00ilO0 > 0) {
/* 31 */                int i3 = this.I0000O;
/* 33 */                int i4 = this.I0001Ioi1lo;
/* 36 */                if (iI00ilO0 <= i3 - i4) {
/* 39 */                    int i5 = iI00ilO0 + i4;
/* 40 */                    this.I0001Ioi1lo = i5;
/* 48 */                    return new ii01iiOoo(Arrays.copyOfRange(bArr, i4, i5));
                        }
                    }
/* 53 */            if (iI00ilO0 <= 0) {
/* 57 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 52 */                return null;
                    }
/* 63 */            OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 52 */            return null;
                }

                @Override
                public final String I00iOIl() throws ii0iI11ol {
/* 1 */             int iI00ilO0 = I00ilO0();
/* 5 */             if (iI00ilO0 > 0) {
/* 7 */                 int i = this.I0000O;
/* 9 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (iI00ilO0 <= i - i2) {
/* 21 */                    String str = new String(this.I0000Il00O, i2, iI00ilO0, ii0i1ll10I0.I00000oIO);
                            this.I0001Ioi1lo += iI00ilO0;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iI00ilO0 == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iI00ilO0 < 0) {
/* 39 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 42 */                return null;
                    }
/* 46 */            OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */            return null;
                }

                @Override
                public final String I00iiI() throws ii0iI11ol {
/* 1 */             int iI00ilO0 = I00ilO0();
/* 5 */             if (iI00ilO0 > 0) {
/* 7 */                 int i = this.I0000O;
/* 9 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (iI00ilO0 <= i - i2) {
/* 17 */                    String strI0000O = ii10i1o.I0000O(this.I0000Il00O, i2, iI00ilO0);
                            this.I0001Ioi1lo += iI00ilO0;
/* 26 */                    return strI0000O;
                        }
                    }
/* 27 */            if (iI00ilO0 == 0) {
/* 29 */                return "";
                    }
/* 33 */            if (iI00ilO0 <= 0) {
/* 37 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 32 */                return null;
                    }
/* 43 */            OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 32 */            return null;
                }

                @Override
                public final void I00iiO(int i) throws ii0iI11ol {
/* 3 */             if (this.I000II == i) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001iOo1i0O("Protocol message end-group tag did not match expected tag.");
                }

                public final void I00iio(int i) throws ii0iI11ol {
/* 1 */             if (i >= 0) {
/* 3 */                 int i2 = this.I0000O;
/* 5 */                 int i3 = this.I0001Ioi1lo;
/* 8 */                 if (i <= i2 - i3) {
/* 12 */                    this.I0001Ioi1lo = i3 + i;
/* 14 */                    return;
                        }
                    }
/* 15 */            if (i < 0) {
/* 19 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    } else {
/* 25 */                OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                public final int I00ilI0I1() throws ii0iI11ol {
/* 1 */             int i = this.I0001Ioi1lo;
/* 7 */             if (this.I0000O - i < 4) {
/* 49 */                OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 52 */                return 0;
                    }
/* 9 */             byte[] bArr = this.I0000Il00O;
/* 13 */            this.I0001Ioi1lo = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int I00ilO0() {
                    int i;
/* 1 */             int i2 = this.I0001Ioi1lo;
/* 3 */             int i3 = this.I0000O;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.I0000Il00O;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I0001Ioi1lo = i4;
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
/* 117 */                   this.I0001Ioi1lo = i5;
/* 119 */                   return i;
                        }
                    }
/* 124 */           return (int) I00l0I0l0lO1();
                }

                public final long I00io1l() throws ii0iI11ol {
/* 3 */             int i = this.I0001Ioi1lo;
/* 10 */            if (this.I0000O - i < 8) {
/* 105 */               OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 108 */               return 0L;
                    }
/* 12 */            byte[] bArr = this.I0000Il00O;
/* 16 */            this.I0001Ioi1lo = i + 8;
/* 18 */            long j = bArr[i];
/* 33 */            long j2 = bArr[i + 2];
/* 38 */            long j3 = bArr[i + 3];
/* 101 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }

                public final long I00ioIO() {
                    long j;
                    long j2;
/* 1 */             int i = this.I0001Ioi1lo;
/* 3 */             int i2 = this.I0000O;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.I0000Il00O;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I0001Ioi1lo = i3;
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
/* 67 */                                long j3 = (-2080896) ^ i9;
/* 70 */                                i4 = i8;
/* 71 */                                j = j3;
                                    } else {
/* 74 */                                i6 = i + 5;
/* 83 */                                long j4 = (bArr[i8] << 28) ^ i9;
/* 88 */                                if (j4 >= 0) {
/* 93 */                                    j = j4 ^ 266354560;
                                        } else {
/* 96 */                                    i4 = i + 6;
/* 104 */                                   long j5 = (bArr[i6] << 35) ^ j4;
/* 107 */                                   if (j5 < 0) {
/* 109 */                                       j2 = -34093383808L;
                                            } else {
/* 117 */                                       int i10 = i + 7;
/* 125 */                                       long j6 = j5 ^ (bArr[i4] << 42);
/* 128 */                                       if (j6 >= 0) {
/* 135 */                                           j = j6 ^ 4363953127296L;
                                                } else {
/* 139 */                                           i4 = i + 8;
/* 147 */                                           j5 = j6 ^ (bArr[i10] << 49);
/* 150 */                                           if (j5 < 0) {
/* 152 */                                               j2 = -558586000294016L;
                                                    } else {
/* 158 */                                               i10 = i + 9;
/* 172 */                                               long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
/* 175 */                                               if (j7 < 0) {
/* 177 */                                                   i4 = i + 10;
/* 184 */                                                   if (bArr[i10] >= 0) {
/* 186 */                                                       j = j7;
                                                            }
                                                        } else {
/* 188 */                                                   j = j7;
                                                        }
                                                    }
                                                }
/* 137 */                                       i4 = i10;
                                            }
/* 114 */                                   j = j5 ^ j2;
                                        }
                                    }
                                }
/* 52 */                        i4 = i6;
                            }
/* 190 */                   this.I0001Ioi1lo = i4;
/* 192 */                   return j;
                        }
                    }
/* 193 */           return I00l0I0l0lO1();
                }

                public final long I00l0I0l0lO1() throws ii0iI11ol {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (i2 == this.I0000O) {
/* 37 */                    OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 40 */                    return 0L;
                        }
/* 14 */                byte[] bArr = this.I0000Il00O;
/* 18 */                this.I0001Ioi1lo = i2 + 1;
/* 26 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 29 */                if ((bArr[i2] & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 45 */            OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered a malformed varint.");
/* 40 */            return 0L;
                }
            }

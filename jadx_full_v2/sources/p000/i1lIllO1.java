            package p000;

            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            
            public final class i1lIllO1 extends IOOOIO1O {
                public byte[] I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;

                @Override
                public final int I001l0I00(int i) throws iI00lI {
/* 1 */             if (i < 0) {
/* 50 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 40 */                return 0;
                    }
/* 5 */             int i2 = i + this.I000II;
/* 6 */             if (i2 < 0) {
/* 44 */                iilo0lOo110.I000II("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 40 */                return 0;
                    }
/* 8 */             int i3 = this.I000OOo1O;
/* 10 */            if (i2 > i3) {
/* 37 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 40 */                return 0;
                    }
/* 12 */            this.I000OOo1O = i2;
/* 18 */            int i4 = this.I0000oI00 + this.I0001Ioi1lo;
/* 19 */            this.I0000oI00 = i4;
/* 21 */            if (i4 <= i2) {
/* 32 */                this.I0001Ioi1lo = 0;
/* 34 */                return i3;
                    }
/* 23 */            int i5 = i4 - i2;
/* 25 */            this.I0001Ioi1lo = i5;
/* 28 */            this.I0000oI00 = i4 - i5;
/* 30 */            return i3;
                }

                @Override
                public final void I001lIiIIo1O(int i) {
/* 1 */             this.I000OOo1O = i;
/* 7 */             int i2 = this.I0000oI00 + this.I0001Ioi1lo;
/* 8 */             this.I0000oI00 = i2;
/* 10 */            if (i2 <= i) {
/* 21 */                this.I0001Ioi1lo = 0;
/* 29 */                return;
                    }
/* 12 */            int i3 = i2 - i;
/* 14 */            this.I0001Ioi1lo = i3;
/* 17 */            this.I0000oI00 = i2 - i3;
                }

                @Override
                public final int I001lllioOl() {
/* 1 */             int i = this.I000OOo1O;
/* 6 */             if (i == Integer.MAX_VALUE) {
/* 8 */                 return -1;
                    }
/* 12 */            return i - this.I000II;
                }

                @Override
                public final boolean I001lloI() {
                    return this.I000II == this.I0000oI00;
                }

                @Override
                public final int I00II0Ol1O0l() {
/* 1 */             return this.I000II;
                }

                @Override
                public final int I00II0oii1o(byte[] bArr, int i, int i2) {
/* 5 */             if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
/* 40 */                OoOil11Ol1o.I001i1lo1io();
/* 4 */                 return 0;
                    }
/* 11 */            if (i2 == 0) {
/* 4 */                 return 0;
                    }
/* 19 */            int iMin = Math.min(i2, this.I0000oI00 - this.I000II);
/* 23 */            if (iMin == 0) {
/* 25 */                return -1;
                    }
/* 31 */            System.arraycopy(this.I0000O, this.I000II, bArr, i, iMin);
                    this.I000II += iMin;
/* 39 */            return iMin;
                }

                @Override
                public final void I00IO1(int i) throws iI00lI {
/* 1 */             if (i >= 0) {
/* 3 */                 int i2 = this.I0000oI00;
/* 5 */                 int i3 = this.I000II;
/* 8 */                 if (i <= i2 - i3) {
/* 12 */                    this.I000II = i3 + i;
/* 14 */                    return;
                        }
                    }
/* 15 */            if (i < 0) {
/* 19 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    } else {
/* 25 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                @Override
                public final int I00Io1o110i() throws iI00lI {
/* 5 */             if (I001lloI()) {
/* 8 */                 this.I000O01llI0 = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00iiO = I00iiO();
/* 15 */            this.I000O01llI0 = iI00iiO;
/* 19 */            if ((iI00iiO >>> 3) != 0) {
/* 21 */                return iI00iiO;
                    }
/* 24 */            iilo0lOo110.I000II("Protocol message contained an invalid tag (zero).");
/* 27 */            return 0;
                }

                @Override
                public final void I00IoIO0lI(int i) throws iI00lI {
/* 3 */             if (this.I000O01llI0 == i) {
/* 5 */                 return;
                    }
/* 8 */             iilo0lOo110.I000II("Protocol message end-group tag did not match expected tag.");
                }

                @Override
                public final boolean I00IoO0(int i) throws iI00lI {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 != 0) {
/* 9 */                 if (i2 == 1) {
/* 60 */                    I00IO1(8);
/* 6 */                     return true;
                        }
/* 12 */                if (i2 == 2) {
/* 54 */                    I00IO1(I00iiO());
/* 6 */                     return true;
                        }
/* 16 */                if (i2 == 3) {
/* 40 */                    I00IioO0OiOi();
/* 46 */                    I00IoIO0lI(((i >>> 3) << 3) | 4);
/* 6 */                     return true;
                        }
/* 18 */                if (i2 == 4) {
/* 34 */                    if (this.I00000oOI == 0) {
/* 36 */                        I00IoIO0lI(0);
                            }
/* 5 */                     return false;
                        }
/* 21 */                if (i2 == 5) {
/* 23 */                    I00IO1(4);
/* 6 */                     return true;
                        }
/* 27 */                OoOil11Ol1o.I00100l0();
/* 30 */                return false;
                    }
/* 73 */            if (this.I0000oI00 - this.I000II >= 10) {
/* 75 */                while (i3 < 10) {
/* 77 */                    int i4 = this.I000II;
/* 81 */                    this.I000II = i4 + 1;
/* 85 */                    if (bArr[i4] < 0) {
/* 88 */                        i3++;
                            }
                        }
/* 91 */                iilo0lOo110.I000II("CodedInputStream encountered a malformed varint.");
/* 30 */                return false;
                    }
/* 95 */            while (i3 < 10) {
/* 97 */                int i5 = this.I000II;
/* 101 */               if (i5 == this.I0000oI00) {
/* 117 */                   iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */                    return false;
                        }
/* 105 */               this.I000II = i5 + 1;
/* 109 */               if (bArr[i5] < 0) {
/* 111 */                   i3++;
                        }
                    }
/* 121 */           iilo0lOo110.I000II("CodedInputStream encountered a malformed varint.");
/* 30 */            return false;
/* 6 */             return true;
                }

                @Override
                public final double I00IoiI() {
/* 5 */             return Double.longBitsToDouble(I00iOIl());
                }

                @Override
                public final float I00Iooi00oi() {
/* 5 */             return Float.intBitsToFloat(I00iIi0i1o());
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
/* 1 */             return I00iiO();
                }

                @Override
                public final long I00OI1() {
/* 1 */             return I00iOIl();
                }

                @Override
                public final int I00OIO1() {
/* 1 */             return I00iIi0i1o();
                }

                @Override
                public final boolean I00OIl() {
                    return I00i0oil() != 0;
                }

                @Override
                public final String I00OIo() throws iI00lI {
/* 1 */             int iI00iiO = I00iiO();
/* 5 */             if (iI00iiO > 0) {
/* 7 */                 int i = this.I0000oI00;
/* 9 */                 int i2 = this.I000II;
/* 12 */                if (iI00iiO <= i - i2) {
/* 21 */                    String str = new String(this.I0000O, i2, iI00iiO, StandardCharsets.UTF_8);
                            this.I000II += iI00iiO;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iI00iiO == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iI00iiO < 0) {
/* 39 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 42 */                return null;
                    }
/* 46 */            iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */            return null;
                }

                @Override
                public final String I00OOll1() throws iI00lI {
/* 1 */             int iI00iiO = I00iiO();
/* 5 */             if (iI00iiO > 0) {
/* 7 */                 int i = this.I0000oI00;
/* 9 */                 int i2 = this.I000II;
/* 12 */                if (iI00iiO <= i - i2) {
/* 17 */                    String strI0000O = iI1i1o0lIl1o.I0000O(this.I0000O, i2, iI00iiO);
                            this.I000II += iI00iiO;
/* 26 */                    return strI0000O;
                        }
                    }
/* 27 */            if (iI00iiO == 0) {
/* 29 */                return "";
                    }
/* 33 */            if (iI00iiO <= 0) {
/* 37 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 32 */                return null;
                    }
/* 43 */            iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 32 */            return null;
                }

                @Override
                public final i1lI1O I00OilO00Il() throws iI00lI {
/* 1 */             int iI00iiO = I00iiO();
/* 5 */             if (iI00iiO > 0) {
/* 7 */                 int i = this.I0000oI00;
/* 9 */                 int i2 = this.I000II;
/* 12 */                if (iI00iiO <= i - i2) {
/* 16 */                    i1lI1O i1li1oI000o00OoI0I = i1lIIl01O.I000o00OoI0I(this.I0000O, i2, iI00iiO);
                            this.I000II += iI00iiO;
/* 25 */                    return i1li1oI000o00OoI0I;
                        }
                    }
/* 26 */            if (iI00iiO == 0) {
/* 28 */                return i1lIIl01O.I00iiI;
                    }
/* 31 */            byte[] bArrI00iiI = I00iiI(iI00iiO);
/* 35 */            i1lI1O i1li1o = i1lIIl01O.I00iiI;
                    return bArrI00iiI.length == 0 ? i1lIIl01O.I00iiI : new i1lI1O(bArrI00iiI);
                }

                @Override
                public final byte[] I00Oio() {
/* 5 */             return I00iiI(I00iiO());
                }

                @Override
                public final int I00Ol00() {
/* 1 */             return I00iiO();
                }

                @Override
                public final int I00Ol10() {
/* 1 */             return I00iiO();
                }

                @Override
                public final int I00Ol1ll1() {
/* 1 */             return I00iIi0i1o();
                }

                @Override
                public final long I00OloOo() {
/* 1 */             return I00iOIl();
                }

                @Override
                public final int I00i01iIIliI() {
/* 5 */             return IOOOIO1O.I00IlilI0i0i(I00iiO());
                }

                @Override
                public final long I00i0O() {
/* 5 */             return IOOOIO1O.I00Io1lO(I00i0oil());
                }

                @Override
                public final int I00i0ilIl0i() {
/* 1 */             return I00iiO();
                }

                @Override
                public final long I00i0oil() {
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
/* 197 */                   this.I000II = i4;
/* 199 */                   return j;
                        }
                    }
/* 200 */           return I00iIO();
                }

                public final long I00iIO() throws iI00lI {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.I000II;
/* 12 */                if (i2 == this.I0000oI00) {
/* 37 */                    iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 40 */                    return 0L;
                        }
/* 14 */                byte[] bArr = this.I0000O;
/* 18 */                this.I000II = i2 + 1;
/* 26 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 29 */                if ((bArr[i2] & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 45 */            iilo0lOo110.I000II("CodedInputStream encountered a malformed varint.");
/* 40 */            return 0L;
                }

                public final int I00iIi0i1o() throws iI00lI {
/* 1 */             int i = this.I000II;
/* 7 */             if (this.I0000oI00 - i < 4) {
/* 49 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 52 */                return 0;
                    }
/* 9 */             byte[] bArr = this.I0000O;
/* 13 */            this.I000II = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I00iOIl() throws iI00lI {
/* 3 */             int i = this.I000II;
/* 10 */            if (this.I0000oI00 - i < 8) {
/* 105 */               iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 108 */               return 0L;
                    }
/* 12 */            byte[] bArr = this.I0000O;
/* 16 */            this.I000II = i + 8;
/* 18 */            long j = bArr[i];
/* 33 */            long j2 = bArr[i + 2];
/* 38 */            long j3 = bArr[i + 3];
/* 101 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }

                public final byte[] I00iiI(int i) throws iI00lI {
/* 1 */             if (i > 0) {
/* 3 */                 int i2 = this.I0000oI00;
/* 5 */                 int i3 = this.I000II;
/* 8 */                 if (i <= i2 - i3) {
/* 11 */                    int i4 = i + i3;
/* 12 */                    this.I000II = i4;
/* 16 */                    return Arrays.copyOfRange(this.I0000O, i3, i4);
                        }
                    }
/* 22 */            if (i > 0) {
/* 37 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 21 */                return null;
                    }
/* 24 */            if (i == 0) {
/* 26 */                return iI000IO.I00000oIO;
                    }
/* 31 */            iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 21 */            return null;
                }

                public final int I00iiO() {
                    int i;
/* 1 */             int i2 = this.I000II;
/* 3 */             int i3 = this.I0000oI00;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.I0000O;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I000II = i4;
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
/* 117 */                   this.I000II = i5;
/* 119 */                   return i;
                        }
                    }
/* 124 */           return (int) I00iIO();
                }
            }

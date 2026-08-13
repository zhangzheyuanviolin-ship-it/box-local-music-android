            package p000;

            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            
            public final class IOOIoI0ii extends IOOOIO1O {
                public byte[] I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;

                @Override
                public final void I00000oIO(int i) throws O0010I0o {
/* 3 */             if (this.I000OOo1O != i) {
/* 49 */                throw new O0010I0o("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override
                public final int I00000oOI() {
/* 5 */             return this.I000II - this.I000O01llI0;
                }

                @Override
                public final boolean I0000Il00O() {
                    return this.I000II == this.I0000oI00;
                }

                @Override
                public final void I0000O(int i) {
/* 1 */             this.I000OiO = i;
/* 3 */             I00ilO0();
                }

                @Override
                public final int I0000oI00(int i) {
/* 1 */             if (i < 0) {
/* 49 */                throw O0010I0o.I0000O();
                    }
/* 7 */             int iI00000oOI = I00000oOI() + i;
/* 8 */             if (iI00000oOI < 0) {
/* 32 */                throw new O0010I0o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    }
/* 10 */            int i2 = this.I000OiO;
/* 12 */            if (iI00000oOI > i2) {
/* 24 */                throw O0010I0o.I0000oI00();
                    }
/* 14 */            this.I000OiO = iI00000oOI;
/* 16 */            I00ilO0();
/* 19 */            return i2;
                }

                @Override
                public final boolean I0001Ioi1lo() {
                    return I00iio() != 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIO1lIii I000II() throws O0010I0o {
                    byte[] bArrCopyOfRange;
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int iI00iiI = I00iiI();
/* 7 */             if (iI00iiI > 0) {
/* 9 */                 int i = this.I0000oI00;
/* 11 */                int i2 = this.I000II;
/* 14 */                if (iI00iiI <= i - i2) {
/* 16 */                    IIO1lIii iIO1lIiiI0000O = IIO1i00loOo.I0000O(bArr, i2, iI00iiI);
                            this.I000II += iI00iiI;
/* 25 */                    return iIO1lIiiI0000O;
                        }
                    }
/* 26 */            if (iI00iiI == 0) {
/* 28 */                return IIO1i00loOo.I00iiI;
                    }
/* 31 */            if (iI00iiI > 0) {
/* 33 */                int i3 = this.I0000oI00;
/* 35 */                int i4 = this.I000II;
/* 38 */                if (iI00iiI <= i3 - i4) {
/* 40 */                    int i5 = iI00iiI + i4;
/* 41 */                    this.I000II = i5;
/* 43 */                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                        } else {
/* 48 */                    if (iI00iiI > 0) {
/* 113 */                       throw O0010I0o.I0000oI00();
                            }
/* 50 */                    if (iI00iiI != 0) {
/* 72 */                        throw O0010I0o.I0000O();
                            }
/* 52 */                    bArrCopyOfRange = Iool1iioooil.I00000oIO;
                        }
                    }
/* 54 */            IIO1lIii iIO1lIii = IIO1i00loOo.I00iiI;
                    return bArrCopyOfRange.length == 0 ? IIO1i00loOo.I00iiI : new IIO1lIii(bArrCopyOfRange);
                }

                @Override
                public final double I000O01llI0() {
/* 5 */             return Double.longBitsToDouble(I00iIi0i1o());
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return I00iOIl();
                }

                @Override
                public final int I000OiO() {
/* 1 */             return I00iIO();
                }

                @Override
                public final long I000iOII() {
/* 1 */             return I00iIi0i1o();
                }

                @Override
                public final float I000l1() {
/* 5 */             return Float.intBitsToFloat(I00iIO());
                }

                @Override
                public final int I000lI() {
/* 1 */             return I00iOIl();
                }

                @Override
                public final long I000o00OoI0I() {
/* 1 */             return I00iio();
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             return I00iIO();
                }

                @Override
                public final long I00100l0() {
/* 1 */             return I00iIi0i1o();
                }

                @Override
                public final int I00100o1O0lo() {
/* 1 */             int iI00iiI = I00iiI();
/* 10 */            return (-(iI00iiI & 1)) ^ (iI00iiI >>> 1);
                }

                @Override
                public final long I0010I0i() {
/* 1 */             long jI00iio = I00iio();
/* 12 */            return (-(jI00iio & 1)) ^ (jI00iio >>> 1);
                }

                @Override
                public final String I0010o() throws O0010I0o {
/* 1 */             int iI00iiI = I00iiI();
/* 5 */             if (iI00iiI > 0) {
/* 7 */                 int i = this.I0000oI00;
/* 9 */                 int i2 = this.I000II;
/* 12 */                if (iI00iiI <= i - i2) {
/* 20 */                    String str = new String(this.I0000O, i2, iI00iiI, StandardCharsets.UTF_8);
                            this.I000II += iI00iiI;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iI00iiI == 0) {
/* 31 */                return "";
                    }
/* 34 */            if (iI00iiI < 0) {
/* 40 */                throw O0010I0o.I0000O();
                    }
/* 113 */           throw O0010I0o.I0000oI00();
                }

                @Override
                public final String I00111O() throws O0010I0o {
/* 1 */             int iI00iiI = I00iiI();
/* 5 */             String strI00000oIO = "";
/* 7 */             if (iI00iiI > 0) {
/* 9 */                 int i = this.I0000oI00;
/* 11 */                int i2 = this.I000II;
/* 14 */                if (iI00iiI <= i - i2) {
/* 16 */                    byte[] bArr = this.I0000O;
/* 18 */                    if (iI00iiI == 0) {
/* 20 */                        OoliOIl1 ooliOIl1 = Ooll0110oo.I00000oIO;
                            } else {
/* 25 */                        strI00000oIO = Ooll0110oo.I00000oIO.I00000oIO(bArr, i2, iI00iiI);
                            }
                            this.I000II += iI00iiI;
/* 34 */                    return strI00000oIO;
                        }
                    }
/* 35 */            if (iI00iiI == 0) {
/* 5 */                 return "";
                    }
/* 38 */            if (iI00iiI <= 0) {
/* 44 */                throw O0010I0o.I0000O();
                    }
/* 113 */           throw O0010I0o.I0000oI00();
                }

                @Override
                public final int I001IIilI0O() throws O0010I0o {
/* 5 */             if (I0000Il00O()) {
/* 8 */                 this.I000OOo1O = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00iiI = I00iiI();
/* 15 */            this.I000OOo1O = iI00iiI;
/* 19 */            if ((iI00iiI >>> 3) != 0) {
/* 21 */                return iI00iiI;
                    }
/* 29 */            throw new O0010I0o("Protocol message contained an invalid tag (zero).");
                }

                @Override
                public final int I001IO000() {
/* 1 */             return I00iiI();
                }

                @Override
                public final long I001i1O0Ol() {
/* 1 */             return I00iio();
                }

                @Override
                public final boolean I001i1lo1io(int i) throws O0010I0o {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 == 0) {
/* 71 */                if (this.I0000oI00 - this.I000II >= 10) {
/* 73 */                    while (i3 < 10) {
/* 75 */                        int i4 = this.I000II;
/* 79 */                        this.I000II = i4 + 1;
/* 83 */                        if (bArr[i4] < 0) {
/* 86 */                            i3++;
                                }
                            }
/* 93 */                    throw O0010I0o.I0000Il00O();
                        }
/* 94 */                while (i3 < 10) {
/* 96 */                    int i5 = this.I000II;
/* 100 */                   if (i5 == this.I0000oI00) {
/* 118 */                       throw O0010I0o.I0000oI00();
                            }
/* 104 */                   this.I000II = i5 + 1;
/* 108 */                   if (bArr[i5] < 0) {
/* 111 */                       i3++;
                            }
                        }
/* 186 */               throw O0010I0o.I0000Il00O();
/* 6 */                 return true;
                    }
/* 9 */             if (i2 == 1) {
/* 60 */                I00io1l(8);
/* 6 */                 return true;
                    }
/* 12 */            if (i2 == 2) {
/* 54 */                I00io1l(I00iiI());
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
/* 23 */            I00io1l(4);
/* 6 */             return true;
                }

                public final int I00iIO() throws O0010I0o {
/* 1 */             int i = this.I000II;
/* 7 */             if (this.I0000oI00 - i < 4) {
/* 113 */               throw O0010I0o.I0000oI00();
                    }
/* 9 */             byte[] bArr = this.I0000O;
/* 13 */            this.I000II = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I00iIi0i1o() throws O0010I0o {
/* 1 */             int i = this.I000II;
/* 8 */             if (this.I0000oI00 - i < 8) {
/* 113 */               throw O0010I0o.I0000oI00();
                    }
/* 10 */            byte[] bArr = this.I0000O;
/* 14 */            this.I000II = i + 8;
/* 90 */            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
                }

                public final int I00iOIl() {
/* 1 */             return I00iiO();
                }

                public final int I00iiI() {
/* 1 */             return I00iiO();
                }

                public final int I00iiO() {
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
/* 112 */           return (int) I00ilI0I1();
                }

                public final long I00iio() {
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
/* 199 */                   this.I000II = i4;
/* 201 */                   return j;
                        }
                    }
/* 202 */           return I00ilI0I1();
                }

                public final long I00ilI0I1() throws O0010I0o {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.I000II;
/* 12 */                if (i2 == this.I0000oI00) {
/* 39 */                    throw O0010I0o.I0000oI00();
                        }
/* 14 */                byte[] bArr = this.I0000O;
/* 18 */                this.I000II = i2 + 1;
/* 26 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 29 */                if ((bArr[i2] & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 113 */           throw O0010I0o.I0000Il00O();
                }

                public final void I00ilO0() {
/* 5 */             int i = this.I0000oI00 + this.I0001Ioi1lo;
/* 6 */             this.I0000oI00 = i;
/* 10 */            int i2 = i - this.I000O01llI0;
/* 12 */            int i3 = this.I000OiO;
/* 14 */            if (i2 <= i3) {
/* 24 */                this.I0001Ioi1lo = 0;
/* 29 */                return;
                    }
/* 16 */            int i4 = i2 - i3;
/* 17 */            this.I0001Ioi1lo = i4;
/* 20 */            this.I0000oI00 = i - i4;
                }

                public final void I00io1l(int i) throws O0010I0o {
/* 1 */             if (i >= 0) {
/* 3 */                 int i2 = this.I0000oI00;
/* 5 */                 int i3 = this.I000II;
/* 8 */                 if (i <= i2 - i3) {
/* 11 */                    this.I000II = i3 + i;
/* 13 */                    return;
                        }
                    }
/* 14 */            if (i >= 0) {
/* 49 */                throw O0010I0o.I0000oI00();
                    }
/* 20 */            throw O0010I0o.I0000O();
                }
            }

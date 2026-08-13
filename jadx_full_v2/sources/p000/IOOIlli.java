            package p000;

            import java.util.Arrays;
            
            public final class IOOIlli extends IOOOI0 {
                public byte[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;

                @Override
                public final void I00000oOI(int i) throws O0011oo {
/* 3 */             if (this.I000O01llI0 != i) {
/* 29 */                throw new O0011oo("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override
                public final int I000II() {
/* 5 */             return this.I0001Ioi1lo - this.I000II;
                }

                @Override
                public final boolean I000O01llI0() {
                    return this.I0001Ioi1lo == this.I0000O;
                }

                @Override
                public final void I000iOII(int i) {
/* 1 */             this.I000OOo1O = i;
/* 3 */             I00l0I0l0lO1();
                }

                @Override
                public final int I000lI(int i) {
/* 1 */             if (i < 0) {
/* 77 */                throw O0011oo.I0000O();
                    }
/* 7 */             int iI000II = I000II() + i;
/* 8 */             if (iI000II < 0) {
/* 32 */                throw new O0011oo("Failed to parse the message.");
                    }
/* 10 */            int i2 = this.I000OOo1O;
/* 12 */            if (iI000II > i2) {
/* 24 */                throw O0011oo.I0000oI00();
                    }
/* 14 */            this.I000OOo1O = iI000II;
/* 16 */            I00l0I0l0lO1();
/* 19 */            return i2;
                }

                @Override
                public final boolean I000o00OoI0I() {
                    return I00io1l() != 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIO1ooI I00100l0() throws O0011oo {
                    byte[] bArrCopyOfRange;
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 3 */             int iI00ilO0 = I00ilO0();
/* 7 */             if (iI00ilO0 > 0) {
/* 9 */                 int i = this.I0000O;
/* 11 */                int i2 = this.I0001Ioi1lo;
/* 14 */                if (iI00ilO0 <= i - i2) {
/* 16 */                    IIO1ooI iIO1ooII0000oI00 = IIO1ooI.I0000oI00(bArr, i2, iI00ilO0);
                            this.I0001Ioi1lo += iI00ilO0;
/* 25 */                    return iIO1ooII0000oI00;
                        }
                    }
/* 26 */            if (iI00ilO0 == 0) {
/* 28 */                return IIO1ooI.I00iiO;
                    }
/* 31 */            if (iI00ilO0 > 0) {
/* 33 */                int i3 = this.I0000O;
/* 35 */                int i4 = this.I0001Ioi1lo;
/* 38 */                if (iI00ilO0 <= i3 - i4) {
/* 40 */                    int i5 = iI00ilO0 + i4;
/* 41 */                    this.I0001Ioi1lo = i5;
/* 43 */                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                        } else {
/* 48 */                    if (iI00ilO0 > 0) {
/* 110 */                       throw O0011oo.I0000oI00();
                            }
/* 50 */                    if (iI00ilO0 != 0) {
/* 66 */                        throw O0011oo.I0000O();
                            }
/* 52 */                    bArrCopyOfRange = IoolIIolo1lI.I00000oOI;
                        }
                    }
/* 54 */            IIO1ooI iIO1ooI = IIO1ooI.I00iiO;
/* 58 */            return new IIO1ooI(bArrCopyOfRange);
                }

                @Override
                public final double I00100o1O0lo() {
/* 5 */             return Double.longBitsToDouble(I00ilI0I1());
                }

                @Override
                public final int I0010I0i() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final int I0010o() {
/* 1 */             return I00iio();
                }

                @Override
                public final long I00111O() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final float I001IIilI0O() {
/* 5 */             return Float.intBitsToFloat(I00iio());
                }

                @Override
                public final int I001IO000() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final long I001i1O0Ol() {
/* 1 */             return I00io1l();
                }

                @Override
                public final int I001i1lo1io() {
/* 1 */             return I00iio();
                }

                @Override
                public final long I001iOo1i0O() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final int I001l0I00() {
/* 1 */             int iI00ilO0 = I00ilO0();
/* 10 */            return (-(iI00ilO0 & 1)) ^ (iI00ilO0 >>> 1);
                }

                @Override
                public final long I001lIiIIo1O() {
/* 1 */             long jI00io1l = I00io1l();
/* 12 */            return (-(jI00io1l & 1)) ^ (jI00io1l >>> 1);
                }

                @Override
                public final String I001lllioOl() throws O0011oo {
/* 1 */             int iI00ilO0 = I00ilO0();
/* 5 */             if (iI00ilO0 > 0) {
/* 7 */                 int i = this.I0000O;
/* 9 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (iI00ilO0 <= i - i2) {
/* 20 */                    String str = new String(this.I0000Il00O, i2, iI00ilO0, IoolIIolo1lI.I00000oIO);
                            this.I0001Ioi1lo += iI00ilO0;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iI00ilO0 == 0) {
/* 31 */                return "";
                    }
/* 34 */            if (iI00ilO0 < 0) {
/* 40 */                throw O0011oo.I0000O();
                    }
/* 55 */            throw O0011oo.I0000oI00();
                }

                @Override
                public final String I001lloI() throws O0011oo {
/* 1 */             int iI00ilO0 = I00ilO0();
/* 5 */             if (iI00ilO0 > 0) {
/* 7 */                 int i = this.I0000O;
/* 9 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (iI00ilO0 <= i - i2) {
/* 18 */                    String strI00000oIO = Ooll0IoO.I00000oIO.I00000oIO(this.I0000Il00O, i2, iI00ilO0);
                            this.I0001Ioi1lo += iI00ilO0;
/* 27 */                    return strI00000oIO;
                        }
                    }
/* 28 */            if (iI00ilO0 == 0) {
/* 30 */                return "";
                    }
/* 33 */            if (iI00ilO0 <= 0) {
/* 39 */                throw O0011oo.I0000O();
                    }
/* 55 */            throw O0011oo.I0000oI00();
                }

                @Override
                public final int I00II0Ol1O0l() throws O0011oo {
/* 5 */             if (I000O01llI0()) {
/* 8 */                 this.I000O01llI0 = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00ilO0 = I00ilO0();
/* 15 */            this.I000O01llI0 = iI00ilO0;
/* 19 */            if ((iI00ilO0 >>> 3) != 0) {
/* 21 */                return iI00ilO0;
                    }
/* 55 */            throw new O0011oo("Protocol message contained an invalid tag (zero).");
                }

                @Override
                public final int I00II0oii1o() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final long I00IO1() {
/* 1 */             return I00io1l();
                }

                @Override
                public final boolean I00IO1oi11O(int i) throws O0011oo {
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 != 0) {
/* 9 */                 if (i2 == 1) {
/* 53 */                    I00l0OO0IO(8);
/* 6 */                     return true;
                        }
/* 12 */                if (i2 == 2) {
/* 47 */                    I00l0OO0IO(I00ilO0());
/* 6 */                     return true;
                        }
/* 16 */                if (i2 == 3) {
/* 33 */                    I00IOO();
/* 39 */                    I00000oOI(((i >>> 3) << 3) | 4);
/* 6 */                     return true;
                        }
/* 18 */                if (i2 == 4) {
/* 5 */                     return false;
                        }
/* 21 */                if (i2 != 5) {
/* 31 */                    throw O0011oo.I00000oOI();
                        }
/* 23 */                I00l0OO0IO(4);
/* 6 */                 return true;
                    }
/* 64 */            if (this.I0000O - this.I0001Ioi1lo >= 10) {
/* 66 */                while (i3 < 10) {
/* 68 */                    int i4 = this.I0001Ioi1lo;
/* 72 */                    this.I0001Ioi1lo = i4 + 1;
/* 76 */                    if (bArr[i4] < 0) {
/* 79 */                        i3++;
                            }
                        }
/* 86 */                throw O0011oo.I0000Il00O();
                    }
/* 87 */            while (i3 < 10) {
/* 89 */                int i5 = this.I0001Ioi1lo;
/* 93 */                if (i5 == this.I0000O) {
/* 111 */                   throw O0011oo.I0000oI00();
                        }
/* 97 */                this.I0001Ioi1lo = i5 + 1;
/* 101 */               if (bArr[i5] < 0) {
/* 104 */                   i3++;
                        }
                    }
/* 168 */           throw O0011oo.I0000Il00O();
/* 6 */             return true;
                }

                public final int I00iio() throws O0011oo {
/* 1 */             int i = this.I0001Ioi1lo;
/* 7 */             if (this.I0000O - i < 4) {
/* 55 */                throw O0011oo.I0000oI00();
                    }
/* 9 */             byte[] bArr = this.I0000Il00O;
/* 13 */            this.I0001Ioi1lo = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I00ilI0I1() throws O0011oo {
/* 1 */             int i = this.I0001Ioi1lo;
/* 8 */             if (this.I0000O - i < 8) {
/* 110 */               throw O0011oo.I0000oI00();
                    }
/* 10 */            byte[] bArr = this.I0000Il00O;
/* 14 */            this.I0001Ioi1lo = i + 8;
/* 90 */            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
                }

                public final int I00ilO0() {
                    int i;
/* 1 */             int i2 = this.I0001Ioi1lo;
/* 3 */             int i3 = this.I0000O;
/* 5 */             if (i3 != i2) {
/* 8 */                 byte[] bArr = this.I0000Il00O;
/* 10 */                int i4 = i2 + 1;
/* 12 */                byte b = bArr[i2];
/* 14 */                if (b >= 0) {
/* 16 */                    this.I0001Ioi1lo = i4;
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
/* 122 */                   this.I0001Ioi1lo = i5;
/* 245 */                   return i;
                        }
                    }
/* 112 */           return (int) I00ioIO();
                }

                public final long I00io1l() {
                    long j;
                    long j2;
                    long j3;
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
/* 194 */                   this.I0001Ioi1lo = i4;
/* 245 */                   return j;
                        }
                    }
/* 187 */           return I00ioIO();
                }

                public final long I00ioIO() throws O0011oo {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (i2 == this.I0000O) {
/* 39 */                    throw O0011oo.I0000oI00();
                        }
/* 14 */                byte[] bArr = this.I0000Il00O;
/* 18 */                this.I0001Ioi1lo = i2 + 1;
/* 26 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 29 */                if ((bArr[i2] & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 55 */            throw O0011oo.I0000Il00O();
                }

                public final void I00l0I0l0lO1() {
/* 5 */             int i = this.I0000O + this.I0000oI00;
/* 6 */             this.I0000O = i;
/* 10 */            int i2 = i - this.I000II;
/* 12 */            int i3 = this.I000OOo1O;
/* 14 */            if (i2 <= i3) {
/* 24 */                this.I0000oI00 = 0;
/* 55 */                return;
                    }
/* 16 */            int i4 = i2 - i3;
/* 17 */            this.I0000oI00 = i4;
/* 20 */            this.I0000O = i - i4;
                }

                public final void I00l0OO0IO(int i) throws O0011oo {
/* 1 */             if (i >= 0) {
/* 3 */                 int i2 = this.I0000O;
/* 5 */                 int i3 = this.I0001Ioi1lo;
/* 8 */                 if (i <= i2 - i3) {
/* 11 */                    this.I0001Ioi1lo = i3 + i;
/* 13 */                    return;
                        }
                    }
/* 14 */            if (i >= 0) {
/* 29 */                throw O0011oo.I0000oI00();
                    }
/* 20 */            throw O0011oo.I0000O();
                }
            }

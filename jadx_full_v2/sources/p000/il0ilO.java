            package p000;

            import java.util.Arrays;
            
            public final class il0ilO extends IOOOI0 {
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
                    return I00io1l() != 0;
                }

                @Override
                public final double I00O0i0ii() {
/* 5 */             return Double.longBitsToDouble(I00ilO0());
                }

                @Override
                public final float I00OI1() {
/* 5 */             return Float.intBitsToFloat(I00iio());
                }

                @Override
                public final int I00OIO1() {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
                public final int I00OIl(int i) throws ill0ll01OOOO {
/* 1 */             if (i < 0) {
/* 77 */                throw ill0ll01OOOO.I0000O();
                    }
/* 5 */             int i2 = i + this.I0001Ioi1lo;
/* 6 */             if (i2 < 0) {
/* 44 */                throw ill0ll01OOOO.I0000oI00();
                    }
/* 8 */             int i3 = this.I000O01llI0;
/* 10 */            if (i2 > i3) {
/* 39 */                throw ill0ll01OOOO.I0001Ioi1lo();
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
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final int I00OOll1() {
/* 1 */             return I00iio();
                }

                @Override
                public final int I00OilO00Il() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final int I00Oio() {
/* 1 */             return I00iio();
                }

                @Override
                public final int I00Ol00() {
/* 1 */             int iI00ilI0I1 = I00ilI0I1();
/* 10 */            return (iI00ilI0I1 >>> 1) ^ (-(iI00ilI0I1 & 1));
                }

                @Override
                public final int I00Ol10() throws ill0ll01OOOO {
/* 5 */             if (I00IlilI0i0i()) {
/* 8 */                 this.I000II = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00ilI0I1 = I00ilI0I1();
/* 15 */            this.I000II = iI00ilI0I1;
/* 19 */            if ((iI00ilI0I1 >>> 3) != 0) {
/* 21 */                return iI00ilI0I1;
                    }
/* 55 */            throw new ill0ll01OOOO("Protocol message contained an invalid tag (zero).");
                }

                @Override
                public final int I00Ol1ll1() {
/* 1 */             return I00ilI0I1();
                }

                @Override
                public final long I00OloOo() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final long I00i01iIIliI() {
/* 1 */             return I00io1l();
                }

                @Override
                public final long I00i0O() {
/* 1 */             return I00ilO0();
                }

                @Override
                public final long I00i0ilIl0i() {
/* 1 */             long jI00io1l = I00io1l();
/* 11 */            return (jI00io1l >>> 1) ^ (-(1 & jI00io1l));
                }

                @Override
                public final long I00i0oil() {
/* 1 */             return I00io1l();
                }

                @Override
                public final iiooOi11li I00iIi0i1o() throws ill0ll01OOOO {
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 3 */             int iI00ilI0I1 = I00ilI0I1();
/* 7 */             if (iI00ilI0I1 > 0) {
/* 9 */                 int i = this.I0000O;
/* 11 */                int i2 = this.I0001Ioi1lo;
/* 14 */                if (iI00ilI0I1 <= i - i2) {
/* 17 */                    iiooOi11li iioooi11liI000OOo1O = iiooOi11li.I000OOo1O(bArr, i2, iI00ilI0I1);
                            this.I0001Ioi1lo += iI00ilI0I1;
/* 26 */                    return iioooi11liI000OOo1O;
                        }
                    }
/* 27 */            if (iI00ilI0I1 == 0) {
/* 64 */                return iiooOi11li.I00iiO;
                    }
/* 29 */            if (iI00ilI0I1 > 0) {
/* 31 */                int i3 = this.I0000O;
/* 33 */                int i4 = this.I0001Ioi1lo;
/* 36 */                if (iI00ilI0I1 <= i3 - i4) {
/* 39 */                    int i5 = iI00ilI0I1 + i4;
/* 40 */                    this.I0001Ioi1lo = i5;
/* 48 */                    return new iiooOi11li(Arrays.copyOfRange(bArr, i4, i5));
                        }
                    }
/* 52 */            if (iI00ilI0I1 <= 0) {
/* 58 */                throw ill0ll01OOOO.I0000O();
                    }
/* 63 */            throw ill0ll01OOOO.I0001Ioi1lo();
                }

                @Override
                public final String I00iOIl() throws ill0ll01OOOO {
/* 1 */             int iI00ilI0I1 = I00ilI0I1();
/* 5 */             if (iI00ilI0I1 > 0) {
/* 7 */                 int i = this.I0000O;
/* 9 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (iI00ilI0I1 <= i - i2) {
/* 21 */                    String str = new String(this.I0000Il00O, i2, iI00ilI0I1, ililOO0.I00000oIO);
                            this.I0001Ioi1lo += iI00ilI0I1;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iI00ilI0I1 == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iI00ilI0I1 < 0) {
/* 41 */                throw ill0ll01OOOO.I0000O();
                    }
/* 55 */            throw ill0ll01OOOO.I0001Ioi1lo();
                }

                @Override
                public final String I00iiI() throws ill0ll01OOOO {
/* 1 */             int iI00ilI0I1 = I00ilI0I1();
/* 5 */             if (iI00ilI0I1 > 0) {
/* 7 */                 int i = this.I0000O;
/* 9 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (iI00ilI0I1 <= i - i2) {
/* 17 */                    String strI0000O = l011IIO.I0000O(this.I0000Il00O, i2, iI00ilI0I1);
                            this.I0001Ioi1lo += iI00ilI0I1;
/* 26 */                    return strI0000O;
                        }
                    }
/* 27 */            if (iI00ilI0I1 == 0) {
/* 29 */                return "";
                    }
/* 32 */            if (iI00ilI0I1 <= 0) {
/* 38 */                throw ill0ll01OOOO.I0000O();
                    }
/* 55 */            throw ill0ll01OOOO.I0001Ioi1lo();
                }

                @Override
                public final void I00iiO(int i) throws ill0ll01OOOO {
/* 3 */             if (this.I000II != i) {
/* 29 */                throw new ill0ll01OOOO("Protocol message end-group tag did not match expected tag.");
                    }
                }

                public final int I00iio() throws ill0ll01OOOO {
/* 1 */             int i = this.I0001Ioi1lo;
/* 7 */             if (this.I0000O - i < 4) {
/* 55 */                throw ill0ll01OOOO.I0001Ioi1lo();
                    }
/* 9 */             byte[] bArr = this.I0000Il00O;
/* 13 */            this.I0001Ioi1lo = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int I00ilI0I1() {
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
/* 124 */           return (int) I00ioIO();
                }

                public final long I00ilO0() throws ill0ll01OOOO {
/* 3 */             int i = this.I0001Ioi1lo;
/* 10 */            if (this.I0000O - i < 8) {
/* 110 */               throw ill0ll01OOOO.I0001Ioi1lo();
                    }
/* 12 */            byte[] bArr = this.I0000Il00O;
/* 16 */            this.I0001Ioi1lo = i + 8;
/* 18 */            long j = bArr[i];
/* 33 */            long j2 = bArr[i + 2];
/* 38 */            long j3 = bArr[i + 3];
/* 101 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }

                public final long I00io1l() {
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
/* 193 */           return I00ioIO();
                }

                public final long I00ioIO() throws ill0ll01OOOO {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.I0001Ioi1lo;
/* 12 */                if (i2 == this.I0000O) {
/* 39 */                    throw ill0ll01OOOO.I0001Ioi1lo();
                        }
/* 14 */                byte[] bArr = this.I0000Il00O;
/* 18 */                this.I0001Ioi1lo = i2 + 1;
/* 26 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 29 */                if ((bArr[i2] & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 55 */            throw ill0ll01OOOO.I0000Il00O();
                }
            }

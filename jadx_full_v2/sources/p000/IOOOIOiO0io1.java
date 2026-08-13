            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IOOOIOiO0io1 {
                public byte[] I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public InputStream I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;

                public final void I00000oIO(int i) {
/* 3 */             if (this.I0001Ioi1lo != i) {
/* 49 */                throw new O001110li("Protocol message end-group tag did not match expected tag.");
                    }
                }

                public final void I00000oOI() {
/* 5 */             if (this.I000OOo1O >= 64) {
/* 29 */                throw new O001110li("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                }

                public final int I0000Il00O() {
/* 1 */             int i = this.I000O01llI0;
/* 6 */             if (i == Integer.MAX_VALUE) {
/* 8 */                 return -1;
                    }
/* 15 */            return i - (this.I000II + this.I0000O);
                }

                public final void I0000O(int i) {
/* 1 */             this.I000O01llI0 = i;
/* 3 */             I000oI1ioi();
                }

                public final int I0000oI00(int i) {
/* 1 */             if (i < 0) {
/* 49 */                throw new O001110li("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
/* 8 */             int i2 = this.I000II + this.I0000O + i;
/* 9 */             int i3 = this.I000O01llI0;
/* 11 */            if (i2 > i3) {
/* 23 */                throw O001110li.I00000oIO();
                    }
/* 13 */            this.I000O01llI0 = i2;
/* 15 */            I000oI1ioi();
/* 18 */            return i3;
                }

                public final O1101ooIo0l I0001Ioi1lo() {
/* 1 */             int iI000iOII = I000iOII();
/* 5 */             int i = this.I00000oOI;
/* 7 */             int i2 = this.I0000O;
/* 10 */            if (iI000iOII > i - i2 || iI000iOII <= 0) {
                        return iI000iOII == 0 ? IIOII1.I00iOIl : new O1101ooIo0l(I000O01llI0(iI000iOII));
                    }
/* 16 */            byte[] bArr = new byte[iI000iOII];
/* 19 */            System.arraycopy(this.I00000oIO, i2, bArr, 0, iI000iOII);
/* 24 */            O1101ooIo0l o1101ooIo0l = new O1101ooIo0l(bArr);
                    this.I0000O += iI000iOII;
/* 32 */            return o1101ooIo0l;
                }

                public final I01Ilioliio I000II(O0II0llIl o0II0llIl, Il1lll0iI il1lll0iI) {
/* 1 */             int iI000iOII = I000iOII();
/* 5 */             I00000oOI();
/* 8 */             int iI0000oI00 = I0000oI00(iI000iOII);
                    this.I000OOo1O++;
/* 22 */            I01Ilioliio i01Ilioliio = (I01Ilioliio) o0II0llIl.I0000Il00O(this, il1lll0iI);
/* 25 */            I00000oIO(0);
                    this.I000OOo1O--;
/* 34 */            I0000O(iI0000oI00);
/* 89 */            return i01Ilioliio;
                }

                public final byte[] I000O01llI0(int i) throws O001110li {
/* 1 */             byte[] bArr = this.I00000oIO;
/* 3 */             if (i <= 0) {
/* 5 */                 if (i == 0) {
/* 7 */                     return IoolI10lO0ol.I00000oIO;
                        }
/* 17 */                throw new O001110li("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
/* 18 */            int i2 = this.I000II;
/* 20 */            int i3 = this.I0000O;
/* 24 */            int i4 = i2 + i3 + i;
/* 25 */            int i5 = this.I000O01llI0;
/* 27 */            if (i4 > i5) {
/* 149 */               I0010I0i((i5 - i2) - i3);
/* 186 */               throw O001110li.I00000oIO();
                    }
/* 32 */            if (i < 4096) {
/* 34 */                byte[] bArr2 = new byte[i];
/* 38 */                int i6 = this.I00000oOI - i3;
/* 39 */                System.arraycopy(bArr, i3, bArr2, 0, i6);
/* 44 */                this.I0000O = this.I00000oOI;
/* 46 */                int i7 = i - i6;
/* 47 */                if (i7 > 0) {
/* 49 */                    I00100l0(i7);
                        }
/* 52 */                System.arraycopy(bArr, 0, bArr2, i6, i7);
/* 55 */                this.I0000O = i7;
/* 57 */                return bArr2;
                    }
/* 58 */            int i8 = this.I00000oOI;
/* 61 */            this.I000II = i2 + i8;
/* 63 */            this.I0000O = 0;
/* 65 */            this.I00000oOI = 0;
/* 67 */            int length = i8 - i3;
/* 68 */            int i9 = i - length;
/* 72 */            ArrayList arrayList = new ArrayList();
/* 75 */            while (i9 > 0) {
/* 77 */                int iMin = Math.min(i9, Barcode.FORMAT_AZTEC);
/* 81 */                byte[] bArr3 = new byte[iMin];
/* 83 */                int i10 = 0;
/* 84 */                while (i10 < iMin) {
/* 86 */                    InputStream inputStream = this.I0000oI00;
/* 95 */                    int i11 = inputStream == null ? -1 : inputStream.read(bArr3, i10, iMin - i10);
/* 99 */                    if (i11 == -1) {
/* 112 */                       throw O001110li.I00000oIO();
                            }
                            this.I000II += i11;
/* 106 */                   i10 += i11;
                        }
/* 113 */               i9 -= iMin;
/* 114 */               arrayList.add(bArr3);
                    }
/* 118 */           byte[] bArr4 = new byte[i];
/* 120 */           System.arraycopy(bArr, i3, bArr4, 0, length);
/* 123 */           Iterator it = arrayList.iterator();
/* 131 */           while (it.hasNext()) {
/* 137 */               byte[] bArr5 = (byte[]) it.next();
/* 140 */               System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
/* 144 */               length += bArr5.length;
                    }
/* 146 */           return bArr4;
                }

                public final int I000OOo1O() throws O001110li {
/* 1 */             int i = this.I0000O;
/* 7 */             if (this.I00000oOI - i < 4) {
/* 9 */                 I00100l0(4);
/* 12 */                i = this.I0000O;
                    }
/* 14 */            byte[] bArr = this.I00000oIO;
/* 18 */            this.I0000O = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final long I000OiO() throws O001110li {
/* 1 */             int i = this.I0000O;
/* 8 */             if (this.I00000oOI - i < 8) {
/* 10 */                I00100l0(8);
/* 13 */                i = this.I0000O;
                    }
/* 15 */            byte[] bArr = this.I00000oIO;
/* 19 */            this.I0000O = i + 8;
/* 95 */            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
                }

                public final int I000iOII() {
                    int i;
/* 1 */             int i2 = this.I0000O;
/* 3 */             int i3 = this.I00000oOI;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.I00000oIO;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I0000O = i4;
/* 19 */                    return b;
                        }
/* 23 */                if (i3 - i4 >= 9) {
/* 26 */                    int i5 = i2 + 2;
/* 32 */                    int i6 = (bArr[i4] << 7) ^ b;
                            long j = i6;
/* 38 */                    if (j < 0) {
/* 43 */                        i = (int) ((-128) ^ j);
                            } else {
/* 46 */                        int i7 = i2 + 3;
/* 52 */                        int i8 = (bArr[i5] << 14) ^ i6;
                                long j2 = i8;
/* 56 */                        if (j2 >= 0) {
/* 61 */                            i = (int) (16256 ^ j2);
                                } else {
/* 64 */                            int i9 = i2 + 4;
/* 70 */                            long j3 = i8 ^ (bArr[i7] << 21);
/* 74 */                            if (j3 < 0) {
/* 80 */                                i = (int) ((-2080896) ^ j3);
                                    } else {
/* 83 */                                i7 = i2 + 5;
/* 95 */                                int i10 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
/* 96 */                                if (bArr[i9] < 0) {
/* 98 */                                    i9 = i2 + 6;
/* 102 */                                   if (bArr[i7] < 0) {
/* 104 */                                       i7 = i2 + 7;
/* 108 */                                       if (bArr[i9] < 0) {
/* 110 */                                           i9 = i2 + 8;
/* 114 */                                           if (bArr[i7] < 0) {
/* 116 */                                               i7 = i2 + 9;
/* 120 */                                               if (bArr[i9] < 0) {
/* 122 */                                                   int i11 = i2 + 10;
/* 126 */                                                   if (bArr[i7] >= 0) {
/* 135 */                                                       i5 = i11;
/* 136 */                                                       i = i10;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 140 */                                   i = i10;
                                        }
/* 138 */                               i = i10;
                                    }
/* 81 */                            i5 = i9;
                                }
/* 62 */                        i5 = i7;
                            }
/* 142 */                   this.I0000O = i5;
/* 541 */                   return i;
                        }
                    }
/* 132 */           return (int) I000lI();
                }

                public final long I000l1() {
                    long j;
                    long j2;
                    long j3;
/* 1 */             int i = this.I0000O;
/* 3 */             int i2 = this.I00000oOI;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.I00000oIO;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I0000O = i3;
/* 19 */                    return b;
                        }
/* 24 */                if (i2 - i3 >= 9) {
/* 28 */                    int i4 = i + 2;
/* 34 */                    long j4 = (bArr[i3] << 7) ^ b;
/* 40 */                    if (j4 >= 0) {
/* 48 */                        int i5 = i + 3;
/* 55 */                        long j5 = j4 ^ (bArr[i4] << 14);
/* 58 */                        if (j5 >= 0) {
/* 60 */                            j3 = 16256;
                                } else {
/* 67 */                            i4 = i + 4;
/* 74 */                            j4 = j5 ^ (bArr[i5] << 21);
/* 77 */                            if (j4 < 0) {
/* 79 */                                j2 = -2080896;
                                    } else {
/* 83 */                                i5 = i + 5;
/* 91 */                                j5 = j4 ^ (bArr[i4] << 28);
/* 94 */                                if (j5 >= 0) {
/* 96 */                                    j3 = 266354560;
                                        } else {
/* 100 */                                   i4 = i + 6;
/* 108 */                                   j4 = j5 ^ (bArr[i5] << 35);
/* 111 */                                   if (j4 < 0) {
/* 113 */                                       j2 = -34093383808L;
                                            } else {
/* 119 */                                       i5 = i + 7;
/* 127 */                                       j5 = j4 ^ (bArr[i4] << 42);
/* 130 */                                       if (j5 >= 0) {
/* 132 */                                           j3 = 4363953127296L;
                                                } else {
/* 138 */                                           i4 = i + 8;
/* 146 */                                           j4 = j5 ^ (bArr[i5] << 49);
/* 149 */                                           if (j4 < 0) {
/* 151 */                                               j2 = -558586000294016L;
                                                    } else {
/* 157 */                                               i5 = i + 9;
/* 171 */                                               long j6 = (j4 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
/* 174 */                                               if (j6 >= 0) {
/* 192 */                                                   j = j6;
/* 64 */                                                    i4 = i5;
/* 195 */                                                   this.I0000O = i4;
/* 541 */                                                   return j;
                                                        }
/* 176 */                                               i4 = i + 10;
/* 183 */                                               if (bArr[i5] >= 0) {
/* 190 */                                                   j = j6;
/* 195 */                                                   this.I0000O = i4;
/* 541 */                                                   return j;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 62 */                        j = j5 ^ j3;
/* 64 */                        i4 = i5;
/* 195 */                       this.I0000O = i4;
/* 541 */                       return j;
                            }
/* 42 */                    j2 = -128;
/* 44 */                    j = j4 ^ j2;
/* 195 */                   this.I0000O = i4;
/* 541 */                   return j;
                        }
                    }
/* 185 */           return I000lI();
                }

                public final long I000lI() throws O001110li {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.I0000O == this.I00000oOI) {
/* 15 */                    I00100l0(1);
                        }
/* 18 */                byte[] bArr = this.I00000oIO;
/* 20 */                int i2 = this.I0000O;
/* 24 */                this.I0000O = i2 + 1;
/* 32 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 35 */                if ((bArr[i2] & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 113 */           throw new O001110li("CodedInputStream encountered a malformed varint.");
                }

                public final int I000o00OoI0I() throws O001110li {
/* 5 */             if (this.I0000O == this.I00000oOI && !I0010o(1)) {
/* 15 */                this.I0001Ioi1lo = 0;
/* 14 */                return 0;
                    }
/* 18 */            int iI000iOII = I000iOII();
/* 22 */            this.I0001Ioi1lo = iI000iOII;
/* 26 */            if ((iI000iOII >>> 3) != 0) {
/* 28 */                return iI000iOII;
                    }
/* 113 */           throw new O001110li("Protocol message contained an invalid tag (zero).");
                }

                public final void I000oI1ioi() {
/* 5 */             int i = this.I00000oOI + this.I0000Il00O;
/* 6 */             this.I00000oOI = i;
/* 10 */            int i2 = this.I000II + i;
/* 11 */            int i3 = this.I000O01llI0;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.I0000Il00O = 0;
/* 29 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.I0000Il00O = i4;
/* 19 */            this.I00000oOI = i - i4;
                }

                public final void I00100l0(int i) throws O001110li {
/* 5 */             if (!I0010o(i)) {
/* 49 */                throw O001110li.I00000oIO();
                    }
                }

                public final boolean I00100o1O0lo(int i, I1I1OO00o1o i1I1OO00o1o) throws IOException {
                    boolean zI00100o1O0lo;
/* 1 */             int i2 = i & 7;
/* 4 */             if (i2 == 0) {
/* 109 */               long jI000l1 = I000l1();
/* 113 */               i1I1OO00o1o.I00Io1lO(i);
/* 116 */               i1I1OO00o1o.I00Io1o110i(jI000l1);
/* 3 */                 return true;
                    }
/* 6 */             if (i2 == 1) {
/* 98 */                long jI000OiO = I000OiO();
/* 102 */               i1I1OO00o1o.I00Io1lO(i);
/* 105 */               i1I1OO00o1o.I00IlilI0i0i(jI000OiO);
/* 3 */                 return true;
                    }
/* 9 */             if (i2 == 2) {
/* 80 */                O1101ooIo0l o1101ooIo0lI0001Ioi1lo = I0001Ioi1lo();
/* 84 */                i1I1OO00o1o.I00Io1lO(i);
/* 91 */                i1I1OO00o1o.I00Io1lO(o1101ooIo0lI0001Ioi1lo.size());
/* 94 */                i1I1OO00o1o.I00IO1oi11O(o1101ooIo0lI0001Ioi1lo);
/* 3 */                 return true;
                    }
/* 13 */            if (i2 != 3) {
/* 15 */                if (i2 == 4) {
/* 39 */                    return false;
                        }
/* 18 */                if (i2 != 5) {
/* 38 */                    throw new O001110li("Protocol message tag had invalid wire type.");
                        }
/* 20 */                int iI000OOo1O = I000OOo1O();
/* 24 */                i1I1OO00o1o.I00Io1lO(i);
/* 27 */                i1I1OO00o1o.I00IioO0OiOi(iI000OOo1O);
/* 3 */                 return true;
                    }
/* 41 */            i1I1OO00o1o.I00Io1lO(i);
/* 68 */            do {
/* 44 */                int iI000o00OoI0I = I000o00OoI0I();
/* 48 */                if (iI000o00OoI0I == 0) {
                            break;
                        }
/* 51 */                I00000oOI();
                        this.I000OOo1O++;
/* 59 */                zI00100o1O0lo = I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1o);
                        this.I000OOo1O--;
/* 68 */            } while (zI00100o1O0lo);
/* 72 */            int i3 = ((i >>> 3) << 3) | 4;
/* 73 */            I00000oIO(i3);
/* 76 */            i1I1OO00o1o.I00Io1lO(i3);
/* 3 */             return true;
                }

                public final void I0010I0i(int i) throws O001110li {
/* 1 */             int i2 = this.I00000oOI;
/* 3 */             int i3 = this.I0000O;
/* 5 */             int i4 = i2 - i3;
/* 7 */             if (i <= i4 && i >= 0) {
/* 12 */                this.I0000O = i3 + i;
/* 14 */                return;
                    }
/* 15 */            if (i < 0) {
/* 186 */               throw new O001110li("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
/* 17 */            int i5 = this.I000II;
/* 21 */            int i6 = i5 + i3 + i;
/* 22 */            int i7 = this.I000O01llI0;
/* 24 */            if (i6 > i7) {
/* 50 */                I0010I0i((i7 - i5) - i3);
/* 57 */                throw O001110li.I00000oIO();
                    }
/* 26 */            this.I0000O = i2;
/* 29 */            I00100l0(1);
                    while (true) {
/* 32 */                int i8 = i - i4;
/* 34 */                int i9 = this.I00000oOI;
/* 36 */                if (i8 <= i9) {
/* 45 */                    this.I0000O = i8;
/* 47 */                    return;
                        } else {
/* 38 */                    i4 += i9;
/* 39 */                    this.I0000O = i9;
/* 41 */                    I00100l0(1);
                        }
                    }
                }

                public final boolean I0010o(int i) throws IOException {
/* 1 */             InputStream inputStream = this.I0000oI00;
/* 3 */             byte[] bArr = this.I00000oIO;
/* 5 */             int i2 = this.I0000O;
/* 7 */             int i3 = i2 + i;
/* 9 */             int i4 = this.I00000oOI;
/* 11 */            if (i3 <= i4) {
/* 119 */               I000II.I001IO000(IIlIOloOOO.I00100l0("refillBuffer() called when ", i, " bytes were already available in buffer"));
/* 108 */               return false;
                    }
/* 20 */            if (this.I000II + i2 + i <= this.I000O01llI0 && inputStream != null) {
/* 25 */                if (i2 > 0) {
/* 27 */                    if (i4 > i2) {
/* 30 */                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                            }
                            this.I000II += i2;
/* 40 */                    i4 = this.I00000oOI - i2;
/* 42 */                    this.I00000oOI = i4;
/* 44 */                    this.I0000O = 0;
                        }
/* 48 */                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
/* 52 */                if (i5 == 0 || i5 < -1 || i5 > bArr.length) {
/* 105 */                   I000II.I001IO000(IIlIOloOOO.I00100l0("InputStream#read(byte[]) returned invalid result: ", i5, "\nThe InputStream implementation is buggy."));
/* 108 */                   return false;
                        }
/* 60 */                if (i5 > 0) {
                            this.I00000oOI += i5;
/* 73 */                    if ((this.I000II + i) - 67108864 > 0) {
/* 96 */                        throw new O001110li("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                            }
/* 75 */                    I000oI1ioi();
/* 80 */                    if (this.I00000oOI >= i) {
/* 82 */                        return true;
                            }
/* 84 */                    return I0010o(i);
                        }
                    }
/* 19 */            return false;
                }
            }

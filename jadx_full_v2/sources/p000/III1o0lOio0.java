            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.nio.ByteBuffer;
            import java.nio.channels.ByteChannel;
            import java.nio.charset.Charset;
            
/* 27 */    public final class III1o0lOio0 implements IIIIlO11I0lO, IIIIiol, Cloneable, ByteChannel {
                public Oii1OOIOo I00iOIl;
                public long I00iiI;

                public final void I00000oIO() throws EOFException {
/* 3 */             skip(this.I00iiI);
                }

                public final long I0000Il00O() {
/* 1 */             long j = this.I00iiI;
/* 7 */             if (j == 0) {
/* 3 */                 return 0L;
                    }
/* 12 */            Oii1OOIOo oii1OOIOo = this.I00iOIl.I000II;
                    return (oii1OOIOo.I0000Il00O >= 8192 || !oii1OOIOo.I0000oI00) ? j : j - (r2 - oii1OOIOo.I00000oOI);
                }

                public final void I000II(III1o0lOio0 iII1o0lOio0, long j, long j2) {
/* 3 */             long j3 = j;
/* 5 */             iO1oO1OoOoii.I00000oOI(this.I00iiI, j3, j2);
/* 12 */            if (j2 == 0) {
/* 215 */               return;
                    }
                    iII1o0lOio0.I00iiI += j2;
/* 20 */            Oii1OOIOo oii1OOIOo = this.I00iOIl;
                    while (true) {
/* 26 */                long j4 = oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 30 */                if (j3 < j4) {
                            break;
                        }
/* 32 */                j3 -= j4;
/* 33 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
                    }
/* 36 */            long j5 = j2;
/* 39 */            while (j5 > 0) {
/* 41 */                Oii1OOIOo oii1OOIOoI0000Il00O = oii1OOIOo.I0000Il00O();
/* 48 */                int i = oii1OOIOoI0000Il00O.I00000oOI + ((int) j3);
/* 49 */                oii1OOIOoI0000Il00O.I00000oOI = i;
/* 59 */                oii1OOIOoI0000Il00O.I0000Il00O = Math.min(i + ((int) j5), oii1OOIOoI0000Il00O.I0000Il00O);
/* 61 */                Oii1OOIOo oii1OOIOo2 = iII1o0lOio0.I00iOIl;
/* 63 */                if (oii1OOIOo2 == null) {
/* 65 */                    oii1OOIOoI0000Il00O.I000II = oii1OOIOoI0000Il00O;
/* 67 */                    oii1OOIOoI0000Il00O.I0001Ioi1lo = oii1OOIOoI0000Il00O;
/* 69 */                    iII1o0lOio0.I00iOIl = oii1OOIOoI0000Il00O;
                        } else {
/* 74 */                    oii1OOIOo2.I000II.I00000oOI(oii1OOIOoI0000Il00O);
                        }
/* 83 */                j5 -= oii1OOIOoI0000Il00O.I0000Il00O - oii1OOIOoI0000Il00O.I00000oOI;
/* 84 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 86 */                j3 = 0;
                    }
                }

                public final byte I000O01llI0(long j) {
/* 6 */             iO1oO1OoOoii.I00000oOI(this.I00iiI, j, 1L);
/* 9 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 11 */            oii1OOIOo.getClass();
/* 14 */            long j2 = this.I00iiI;
/* 20 */            if (j2 - j < j) {
/* 24 */                while (j2 > j) {
/* 26 */                    oii1OOIOo = oii1OOIOo.I000II;
/* 34 */                    j2 -= oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
                        }
/* 44 */                return oii1OOIOo.I00000oIO[(int) ((oii1OOIOo.I00000oOI + j) - j2)];
                    }
/* 47 */            long j3 = 0;
                    while (true) {
/* 49 */                int i = oii1OOIOo.I0000Il00O;
/* 51 */                int i2 = oii1OOIOo.I00000oOI;
/* 55 */                long j4 = (i - i2) + j3;
/* 58 */                if (j4 > j) {
/* 70 */                    return oii1OOIOo.I00000oIO[(int) ((i2 + j) - j3)];
                        }
/* 60 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 62 */                j3 = j4;
                    }
                }

                public final long I000l1(byte b, long j, long j2) {
                    Oii1OOIOo oii1OOIOo;
/* 1 */             long j3 = 0;
/* 5 */             if (0 > j || j > j2) {
/* 215 */               throw new IllegalArgumentException(("size=" + this.I00iiI + " fromIndex=" + j + " toIndex=" + j2).toString());
                    }
/* 11 */            long j4 = this.I00iiI;
/* 15 */            if (j2 > j4) {
/* 17 */                j2 = j4;
                    }
/* 20 */            if (j == j2 || (oii1OOIOo = this.I00iOIl) == null) {
/* 167 */               return -1L;
                    }
/* 34 */            if (j4 - j < j) {
/* 38 */                while (j4 > j) {
/* 40 */                    oii1OOIOo = oii1OOIOo.I000II;
/* 48 */                    j4 -= oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
                        }
/* 52 */                while (j4 < j2) {
/* 54 */                    byte[] bArr = oii1OOIOo.I00000oIO;
/* 68 */                    int iMin = (int) Math.min(oii1OOIOo.I0000Il00O, (oii1OOIOo.I00000oOI + j2) - j4);
/* 75 */                    for (int i = (int) ((oii1OOIOo.I00000oOI + j) - j4); i < iMin; i++) {
/* 79 */                        if (bArr[i] == b) {
/* 85 */                            return (i - oii1OOIOo.I00000oOI) + j4;
                                }
                            }
/* 96 */                    j4 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 97 */                    oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 99 */                    j = j4;
                        }
/* 167 */               return -1L;
                    }
                    while (true) {
/* 107 */               long j5 = (oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI) + j3;
/* 110 */               if (j5 > j) {
                            break;
                        }
/* 112 */               oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 114 */               j3 = j5;
                    }
/* 118 */           while (j3 < j2) {
/* 120 */               byte[] bArr2 = oii1OOIOo.I00000oIO;
/* 134 */               int iMin2 = (int) Math.min(oii1OOIOo.I0000Il00O, (oii1OOIOo.I00000oOI + j2) - j3);
/* 141 */               for (int i2 = (int) ((oii1OOIOo.I00000oOI + j) - j3); i2 < iMin2; i2++) {
/* 145 */                   if (bArr2[i2] == b) {
/* 151 */                       return (i2 - oii1OOIOo.I00000oOI) + j3;
                            }
                        }
/* 162 */               j3 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 163 */               oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 165 */               j = j3;
                    }
/* 167 */           return -1L;
                }

                @Override
                public final boolean I000lI(long j) {
                    return this.I00iiI >= j;
                }

                public final long I00100l0(IIOIIi1ilIO iIOIIi1ilIO, long j) {
/* 1 */             long j2 = 0;
/* 5 */             if (j < 0) {
/* 290 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "fromIndex < 0: "));
/* 1 */                 return 0L;
                    }
/* 7 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 11 */            if (oii1OOIOo == null) {
/* 9 */                 return -1L;
                    }
/* 14 */            long j3 = this.I00iiI;
/* 23 */            if (j3 - j < j) {
/* 27 */                while (j3 > j) {
/* 29 */                    oii1OOIOo = oii1OOIOo.I000II;
/* 37 */                    j3 -= oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
                        }
/* 43 */                if (iIOIIi1ilIO.I00000oOI() == 2) {
/* 45 */                    byte bI000II = iIOIIi1ilIO.I000II(0);
/* 49 */                    byte bI000II2 = iIOIIi1ilIO.I000II(1);
/* 57 */                    while (j3 < this.I00iiI) {
/* 59 */                        byte[] bArr = oii1OOIOo.I00000oIO;
/* 67 */                        int i = oii1OOIOo.I0000Il00O;
/* 69 */                        for (int i2 = (int) ((oii1OOIOo.I00000oOI + j) - j3); i2 < i; i2++) {
/* 71 */                            byte b = bArr[i2];
/* 73 */                            if (b == bI000II || b == bI000II2) {
/* 85 */                                return (i2 - oii1OOIOo.I00000oOI) + j3;
                                    }
                                }
/* 93 */                        j3 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 94 */                        oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 96 */                        j = j3;
                            }
                        } else {
/* 98 */                    byte[] bArrI0001Ioi1lo = iIOIIi1ilIO.I0001Ioi1lo();
/* 106 */                   while (j3 < this.I00iiI) {
/* 108 */                       byte[] bArr2 = oii1OOIOo.I00000oIO;
/* 116 */                       int i3 = oii1OOIOo.I0000Il00O;
/* 118 */                       for (int i4 = (int) ((oii1OOIOo.I00000oOI + j) - j3); i4 < i3; i4++) {
/* 120 */                           byte b2 = bArr2[i4];
/* 124 */                           for (byte b3 : bArrI0001Ioi1lo) {
/* 128 */                               if (b2 == b3) {
/* 134 */                                   return (i4 - oii1OOIOo.I00000oOI) + j3;
                                        }
                                    }
                                }
/* 148 */                       j3 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 149 */                       oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 151 */                       j = j3;
                            }
                        }
/* 9 */                 return -1L;
                    }
                    while (true) {
/* 160 */               long j4 = (oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI) + j2;
/* 163 */               if (j4 > j) {
                            break;
                        }
/* 165 */               oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 167 */               j2 = j4;
                    }
/* 173 */           if (iIOIIi1ilIO.I00000oOI() == 2) {
/* 175 */               byte bI000II3 = iIOIIi1ilIO.I000II(0);
/* 179 */               byte bI000II4 = iIOIIi1ilIO.I000II(1);
/* 187 */               while (j2 < this.I00iiI) {
/* 189 */                   byte[] bArr3 = oii1OOIOo.I00000oIO;
/* 197 */                   int i5 = oii1OOIOo.I0000Il00O;
/* 199 */                   for (int i6 = (int) ((oii1OOIOo.I00000oOI + j) - j2); i6 < i5; i6++) {
/* 201 */                       byte b4 = bArr3[i6];
/* 203 */                       if (b4 == bI000II3 || b4 == bI000II4) {
/* 215 */                           return (i6 - oii1OOIOo.I00000oOI) + j2;
                                }
                            }
/* 223 */                   j2 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 224 */                   oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 226 */                   j = j2;
                        }
                    } else {
/* 228 */               byte[] bArrI0001Ioi1lo2 = iIOIIi1ilIO.I0001Ioi1lo();
/* 236 */               while (j2 < this.I00iiI) {
/* 238 */                   byte[] bArr4 = oii1OOIOo.I00000oIO;
/* 246 */                   int i7 = oii1OOIOo.I0000Il00O;
/* 248 */                   for (int i8 = (int) ((oii1OOIOo.I00000oOI + j) - j2); i8 < i7; i8++) {
/* 250 */                       byte b5 = bArr4[i8];
/* 254 */                       for (byte b6 : bArrI0001Ioi1lo2) {
/* 258 */                           if (b5 == b6) {
/* 264 */                               return (i8 - oii1OOIOo.I00000oOI) + j2;
                                    }
                                }
                            }
/* 278 */                   j2 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 279 */                   oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 281 */                   j = j2;
                        }
                    }
/* 9 */             return -1L;
                }

                @Override
                public final void I00100o1O0lo(long j) throws EOFException {
/* 5 */             if (this.I00iiI >= j) {
/* 7 */                 return;
                    }
/* 8 */             I000II.I001i1O0Ol();
                }

                @Override
                public final long I0010I0i(IIOIIi1ilIO iIOIIi1ilIO) {
/* 1 */             byte[] bArr = I00000oOI.I00000oIO;
/* 16 */            return I00000oOI.I00000oIO(this, iIOIIi1ilIO, 0L, Long.MAX_VALUE, iIOIIi1ilIO.I00000oOI());
                }

                public final boolean I001i1lo1io(long j, IIOIIi1ilIO iIOIIi1ilIO, int i) {
/* 1 */             if (i >= 0 && j >= 0 && i + j <= this.I00iiI && i <= iIOIIi1ilIO.I00000oOI()) {
                        return i == 0 || I00000oOI.I00000oIO(this, iIOIIi1ilIO, j, j + 1, i) != -1;
                    }
/* 49 */            return false;
                }

                public final byte[] I001l0I00(long j) throws EOFException {
/* 5 */             if (j < 0 || j > 2147483647L) {
/* 53 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount: "));
/* 40 */                return null;
                    }
/* 18 */            if (this.I00iiI < j) {
/* 43 */                I000II.I001i1O0Ol();
/* 40 */                return null;
                    }
/* 20 */            int i = (int) j;
/* 21 */            byte[] bArr = new byte[i];
/* 23 */            int i2 = 0;
/* 24 */            while (i2 < i) {
/* 28 */                int i3 = read(bArr, i2, i - i2);
/* 33 */                if (i3 == -1) {
/* 37 */                    I000II.I001i1O0Ol();
/* 40 */                    return null;
                        }
/* 35 */                i2 += i3;
                    }
/* 42 */            return bArr;
                }

                public final boolean I00II0Ol1O0l() {
                    return this.I00iiI == 0;
                }

                @Override
                public final int I00IO1oi11O(OIil0IiIo oIil0IiIo) throws EOFException {
/* 2 */             int iI0000O = I00000oOI.I0000O(this, oIil0IiIo, false);
/* 7 */             if (iI0000O == -1) {
/* 6 */                 return -1;
                    }
/* 19 */            skip(oIil0IiIo.I00iOIl[iI0000O].I00000oOI());
/* 49 */            return iI0000O;
                }

                public final IIOIIi1ilIO I00IOO(long j) throws EOFException {
/* 6 */             if (j < 0 || j > 2147483647L) {
/* 56 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount: "));
/* 5 */                 return null;
                    }
/* 19 */            if (this.I00iiI < j) {
/* 46 */                I000II.I001i1O0Ol();
/* 5 */                 return null;
                    }
/* 25 */            if (j < 4096) {
/* 42 */                return new IIOIIi1ilIO(I001l0I00(j));
                    }
/* 28 */            IIOIIi1ilIO iIOIIi1ilIOI00iOIl = I00iOIl((int) j);
/* 32 */            skip(j);
/* 35 */            return iIOIIi1ilIOI00iOIl;
                }

                public final int I00IioO0OiOi() throws EOFException {
/* 1 */             long j = this.I00iiI;
/* 7 */             if (j < 4) {
/* 109 */               I000II.I001i1O0Ol();
/* 112 */               return 0;
                    }
/* 9 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 11 */            int i = oii1OOIOo.I00000oOI;
/* 13 */            int i2 = oii1OOIOo.I0000Il00O;
/* 20 */            if (i2 - i < 4) {
/* 54 */                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
                    }
/* 56 */            byte[] bArr = oii1OOIOo.I00000oIO;
/* 75 */            int i3 = i + 3;
/* 83 */            int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
/* 84 */            int i5 = i + 4;
/* 90 */            int i6 = (bArr[i3] & 255) | i4;
/* 92 */            this.I00iiI = j - 4;
/* 94 */            if (i5 != i2) {
/* 106 */               oii1OOIOo.I00000oOI = i5;
/* 108 */               return i6;
                    }
/* 100 */           this.I00iOIl = oii1OOIOo.I00000oIO();
/* 102 */           Oii1iI10.I00000oIO(oii1OOIOo);
/* 105 */           return i6;
                }

                @Override
                public final long I00IlilI0i0i(IIOIIi1ilIO iIOIIi1ilIO) {
/* 3 */             return I00100l0(iIOIIi1ilIO, 0L);
                }

                @Override
                public final String I00IoO0(long j) throws EOFException {
/* 5 */             if (j < 0) {
/* 146 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "limit < 0: "));
/* 149 */               return null;
                    }
/* 20 */            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
/* 28 */            long jI000l1 = I000l1((byte) 10, 0L, j2);
/* 36 */            if (jI000l1 != -1) {
/* 38 */                return I00000oOI.I0000Il00O(this, jI000l1);
                    }
/* 47 */            if (j2 < this.I00iiI && I000O01llI0(j2 - 1) == 13 && I000O01llI0(j2) == 10) {
/* 67 */                return I00000oOI.I0000Il00O(this, j2);
                    }
/* 74 */            III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 88 */            I000II(iII1o0lOio0, 0L, Math.min(32L, this.I00iiI));
/* 139 */           throw new EOFException("\\n not found: limit=" + Math.min(this.I00iiI, j) + " content=" + iII1o0lOio0.I00IOO(iII1o0lOio0.I00iiI).I0000Il00O() + (char) 8230);
                }

                public final short I00IoiI() throws EOFException {
/* 1 */             long j = this.I00iiI;
/* 7 */             if (j < 2) {
/* 72 */                I000II.I001i1O0Ol();
/* 75 */                return (short) 0;
                    }
/* 9 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 11 */            int i = oii1OOIOo.I00000oOI;
/* 13 */            int i2 = oii1OOIOo.I0000Il00O;
/* 18 */            if (i2 - i < 2) {
/* 35 */                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
                    }
/* 37 */            byte[] bArr = oii1OOIOo.I00000oIO;
/* 39 */            int i3 = i + 1;
/* 45 */            int i4 = (bArr[i] & 255) << 8;
/* 47 */            int i5 = i + 2;
/* 52 */            int i6 = (bArr[i3] & 255) | i4;
/* 54 */            this.I00iiI = j - 2;
/* 56 */            if (i5 == i2) {
/* 62 */                this.I00iOIl = oii1OOIOo.I00000oIO();
/* 64 */                Oii1iI10.I00000oIO(oii1OOIOo);
                    } else {
/* 68 */                oii1OOIOo.I00000oOI = i5;
                    }
/* 70 */            return (short) i6;
                }

                @Override
                public final long I00OIO1(IIIIiol iIIIiol) {
/* 1 */             long j = this.I00iiI;
/* 7 */             if (j > 0) {
/* 9 */                 iIIIiol.write(this, j);
                    }
/* 49 */            return j;
                }

                public final short I00OIl() throws EOFException {
/* 1 */             short sI00IoiI = I00IoiI();
/* 16 */            return (short) (((sI00IoiI & 255) << 8) | ((65280 & sI00IoiI) >>> 8));
                }

                public final String I00OOll1(long j, Charset charset) throws EOFException {
/* 6 */             if (j < 0 || j > 2147483647L) {
/* 91 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount: "));
/* 5 */                 return null;
                    }
/* 19 */            if (this.I00iiI < j) {
/* 81 */                I000II.I001i1O0Ol();
/* 5 */                 return null;
                    }
/* 21 */            if (j == 0) {
/* 23 */                return "";
                    }
/* 26 */            Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 28 */            int i = oii1OOIOo.I00000oOI;
/* 37 */            if (i + j > oii1OOIOo.I0000Il00O) {
/* 45 */                return new String(I001l0I00(j), charset);
                    }
/* 53 */            int i2 = (int) j;
/* 54 */            String str = new String(oii1OOIOo.I00000oIO, i, i2, charset);
/* 59 */            int i3 = oii1OOIOo.I00000oOI + i2;
/* 60 */            oii1OOIOo.I00000oOI = i3;
                    this.I00iiI -= j;
/* 69 */            if (i3 == oii1OOIOo.I0000Il00O) {
/* 75 */                this.I00iOIl = oii1OOIOo.I00000oIO();
/* 77 */                Oii1iI10.I00000oIO(oii1OOIOo);
                    }
/* 80 */            return str;
                }

                @Override
                public final IIIIiol I00OilO00Il(String str) {
/* 1 */             I00oo1iO0ll(str);
/* 49 */            return this;
                }

                public final String I00Ol00() {
/* 5 */             return I00OOll1(this.I00iiI, IO1IOI.I00000oIO);
                }

                @Override
                public final String I00Ol1ll1(Charset charset) {
/* 3 */             return I00OOll1(this.I00iiI, charset);
                }

                @Override
                public final IIIIiol I00i01iIIliI(long j) {
/* 1 */             I00o0iI0io1(j);
/* 49 */            return this;
                }

                @Override
                public final IIIIiol I00iIi0i1o(int i, int i2, String str) {
/* 1 */             I00oliIiO01i(i, i2, str);
/* 215 */           return this;
                }

                public final IIOIIi1ilIO I00iOIl(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return IIOIIi1ilIO.I00iio;
                    }
/* 11 */            iO1oO1OoOoii.I00000oOI(this.I00iiI, 0L, i);
/* 14 */            Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            int i3 = 0;
/* 18 */            int i4 = 0;
/* 19 */            while (i3 < i) {
/* 21 */                int i5 = oii1OOIOo.I0000Il00O;
/* 23 */                int i6 = oii1OOIOo.I00000oOI;
/* 25 */                if (i5 == i6) {
/* 36 */                    I000II.I000O01llI0("s.limit == s.pos");
/* 39 */                    return null;
                        }
/* 28 */                i3 += i5 - i6;
/* 29 */                i4++;
/* 31 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
                    }
/* 41 */            byte[][] bArr = new byte[i4][];
/* 45 */            int[] iArr = new int[i4 * 2];
/* 47 */            Oii1OOIOo oii1OOIOo2 = this.I00iOIl;
/* 49 */            int i7 = 0;
/* 50 */            while (i2 < i) {
/* 54 */                bArr[i7] = oii1OOIOo2.I00000oIO;
/* 61 */                i2 += oii1OOIOo2.I0000Il00O - oii1OOIOo2.I00000oOI;
/* 66 */                iArr[i7] = Math.min(i2, i);
/* 72 */                iArr[i7 + i4] = oii1OOIOo2.I00000oOI;
/* 75 */                oii1OOIOo2.I0000O = true;
/* 77 */                i7++;
/* 78 */                oii1OOIOo2 = oii1OOIOo2.I0001Ioi1lo;
                    }
/* 83 */            return new OiiIIoi(bArr, iArr);
                }

                public final Oii1OOIOo I00iiI(int i) {
/* 2 */             if (i < 1 || i > 8192) {
/* 46 */                I000II.I000iOII("unexpected capacity");
/* 49 */                return null;
                    }
/* 8 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 10 */            if (oii1OOIOo == null) {
/* 12 */                Oii1OOIOo oii1OOIOoI00000oOI = Oii1iI10.I00000oOI();
/* 16 */                this.I00iOIl = oii1OOIOoI00000oOI;
/* 18 */                oii1OOIOoI00000oOI.I000II = oii1OOIOoI00000oOI;
/* 20 */                oii1OOIOoI00000oOI.I0001Ioi1lo = oii1OOIOoI00000oOI;
/* 22 */                return oii1OOIOoI00000oOI;
                    }
/* 23 */            Oii1OOIOo oii1OOIOo2 = oii1OOIOo.I000II;
/* 28 */            if (oii1OOIOo2.I0000Il00O + i <= 8192 && oii1OOIOo2.I0000oI00) {
/* 35 */                return oii1OOIOo2;
                    }
/* 36 */            Oii1OOIOo oii1OOIOoI00000oOI2 = Oii1iI10.I00000oOI();
/* 40 */            oii1OOIOo2.I00000oOI(oii1OOIOoI00000oOI2);
/* 43 */            return oii1OOIOoI00000oOI2;
                }

                @Override
                public final String I00iio() {
/* 6 */             return I00IoO0(Long.MAX_VALUE);
                }

                public final void I00ioIO(int i, byte[] bArr) {
                    long j = i;
/* 6 */             iO1oO1OoOoii.I00000oOI(bArr.length, 0L, j);
/* 9 */             int i2 = 0;
/* 10 */            while (i2 < i) {
/* 13 */                Oii1OOIOo oii1OOIOoI00iiI = I00iiI(1);
/* 23 */                int iMin = Math.min(i - i2, 8192 - oii1OOIOoI00iiI.I0000Il00O);
/* 31 */                int i3 = i2 + iMin;
/* 33 */                I1IoiO1l.I000OOo1O(bArr, oii1OOIOoI00iiI.I0000Il00O, oii1OOIOoI00iiI.I00000oIO, i2, i3);
                        oii1OOIOoI00iiI.I0000Il00O += iMin;
/* 41 */                i2 = i3;
                    }
                    this.I00iiI += j;
                }

                public final void I00l0I0l0lO1(IIOIIi1ilIO iIOIIi1ilIO) {
/* 5 */             iIOIIi1ilIO.I000oI1ioi(this, iIOIIi1ilIO.I00000oOI());
                }

                public final void I00lli11(OlI1ii olI1ii) {
/* 11 */            while (olI1ii.read(this, 8192L) != -1) {
                    }
                }

                public final void I00lll10(int i) {
/* 2 */             Oii1OOIOo oii1OOIOoI00iiI = I00iiI(1);
/* 6 */             byte[] bArr = oii1OOIOoI00iiI.I00000oIO;
/* 8 */             int i2 = oii1OOIOoI00iiI.I0000Il00O;
/* 12 */            oii1OOIOoI00iiI.I0000Il00O = i2 + 1;
/* 15 */            bArr[i2] = (byte) i;
                    this.I00iiI++;
                }

                public final void I00o0iI0io1(long j) {
/* 5 */             if (j == 0) {
/* 9 */                 I00lll10(48);
/* 12 */                return;
                    }
/* 16 */            long j2 = (j >>> 1) | j;
/* 20 */            long j3 = j2 | (j2 >>> 2);
/* 24 */            long j4 = j3 | (j3 >>> 4);
/* 29 */            long j5 = j4 | (j4 >>> 8);
/* 34 */            long j6 = j5 | (j5 >>> 16);
/* 39 */            long j7 = j6 | (j6 >>> 32);
/* 48 */            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
/* 58 */            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
/* 67 */            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
/* 70 */            long j11 = j10 + (j10 >>> 8);
/* 73 */            long j12 = j11 + (j11 >>> 16);
/* 87 */            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
/* 88 */            Oii1OOIOo oii1OOIOoI00iiI = I00iiI(i);
/* 92 */            byte[] bArr = oii1OOIOoI00iiI.I00000oIO;
/* 94 */            int i2 = oii1OOIOoI00iiI.I0000Il00O;
/* 99 */            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
/* 109 */               bArr[i3] = I00000oOI.I00000oIO[(int) (15 & j)];
/* 111 */               j >>>= 4;
                    }
                    oii1OOIOoI00iiI.I0000Il00O += i;
                    this.I00iiI += i;
                }

                public final void I00oII(int i) {
/* 2 */             Oii1OOIOo oii1OOIOoI00iiI = I00iiI(4);
/* 6 */             byte[] bArr = oii1OOIOoI00iiI.I00000oIO;
/* 8 */             int i2 = oii1OOIOoI00iiI.I0000Il00O;
/* 17 */            bArr[i2] = (byte) ((i >>> 24) & 255);
/* 26 */            bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
/* 35 */            bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
/* 41 */            bArr[i2 + 3] = (byte) (i & 255);
/* 43 */            oii1OOIOoI00iiI.I0000Il00O = i2 + 4;
                    this.I00iiI += 4;
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[EDGE_INSN: B:44:0x009f->B:38:0x009f BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I00oli() throws EOFException {
                    int i;
/* 7 */             if (this.I00iiI == 0) {
/* 167 */               I000II.I001i1O0Ol();
/* 3 */                 return 0L;
                    }
/* 10 */            int i2 = 0;
/* 11 */            boolean z = false;
/* 12 */            long j = 0;
/* 158 */           do {
/* 13 */                Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 15 */                byte[] bArr = oii1OOIOo.I00000oIO;
/* 17 */                int i3 = oii1OOIOo.I00000oOI;
/* 19 */                int i4 = oii1OOIOo.I0000Il00O;
/* 21 */                while (i3 < i4) {
/* 23 */                    byte b = bArr[i3];
/* 27 */                    if (b >= 48 && b <= 57) {
                                i = b - 48;
                            } else if (b >= 97 && b <= 102) {
                                i = b - 87;
                            } else if (b < 65 || b > 70) {
/* 100 */                       z = true;
/* 101 */                       if (i2 == 0) {
/* 106 */                           char[] cArr = I0lllI01iooo.I00000oIO;
/* 139 */                           throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                                }
/* 140 */                       if (i3 != i4) {
/* 146 */                           this.I00iOIl = oii1OOIOo.I00000oIO();
/* 148 */                           Oii1iI10.I00000oIO(oii1OOIOo);
                                } else {
/* 152 */                           oii1OOIOo.I00000oOI = i3;
                                }
/* 154 */                       if (!z) {
                                    break;
                                }
                            } else {
                                i = b - 55;
                            }
/* 62 */                    if (((-1152921504606846976L) & j) != 0) {
/* 75 */                        III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 78 */                        iII1o0lOio0.I00o0iI0io1(j);
/* 81 */                        iII1o0lOio0.I00lll10(b);
/* 99 */                        throw new NumberFormatException("Number too large: ".concat(iII1o0lOio0.I00Ol00()));
                            }
/* 67 */                    j = (j << 4) | i;
/* 68 */                    i3++;
/* 70 */                    i2++;
                        }
/* 140 */               if (i3 != i4) {
                        }
/* 154 */               if (!z) {
                        }
/* 158 */           } while (this.I00iOIl != null);
                    this.I00iiI -= i2;
/* 166 */           return j;
                }

                public final void I00oliIiO01i(int i, int i2, String str) {
                    char cCharAt;
/* 1 */             if (i < 0) {
/* 316 */               I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "beginIndex < 0: "));
/* 2160 */              return;
                    }
/* 3 */             if (i2 < i) {
/* 306 */               I000II.I0010I0i(IIl001iO0Io.I000l1(i2, i, "endIndex < beginIndex: ", " < "));
/* 309 */               return;
                    }
/* 9 */             if (i2 > str.length()) {
/* 273 */               StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("endIndex > string.length: ", i2, " > ");
/* 281 */               sbI00100o1O0lo.append(str.length());
/* 297 */               throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                    }
/* 11 */            while (i < i2) {
/* 13 */                char cCharAt2 = str.charAt(i);
/* 19 */                if (cCharAt2 < 128) {
/* 22 */                    Oii1OOIOo oii1OOIOoI00iiI = I00iiI(1);
/* 26 */                    byte[] bArr = oii1OOIOoI00iiI.I00000oIO;
/* 30 */                    int i3 = oii1OOIOoI00iiI.I0000Il00O - i;
/* 33 */                    int iMin = Math.min(i2, 8192 - i3);
/* 37 */                    int i4 = i + 1;
/* 41 */                    bArr[i + i3] = (byte) cCharAt2;
                            while (true) {
/* 43 */                        i = i4;
/* 44 */                        if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                                    break;
                                }
/* 52 */                        i4 = i + 1;
/* 56 */                        bArr[i + i3] = (byte) cCharAt;
                            }
/* 60 */                    int i5 = oii1OOIOoI00iiI.I0000Il00O;
/* 62 */                    int i6 = (i3 + i) - i5;
/* 64 */                    oii1OOIOoI00iiI.I0000Il00O = i5 + i6;
                            this.I00iiI += i6;
                        } else {
/* 75 */                    if (cCharAt2 < 2048) {
/* 78 */                        Oii1OOIOo oii1OOIOoI00iiI2 = I00iiI(2);
/* 82 */                        byte[] bArr2 = oii1OOIOoI00iiI2.I00000oIO;
/* 84 */                        int i7 = oii1OOIOoI00iiI2.I0000Il00O;
/* 91 */                        bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
/* 99 */                        bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 102 */                       oii1OOIOoI00iiI2.I0000Il00O = i7 + 2;
                                this.I00iiI += 2;
                            } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
/* 224 */                       Oii1OOIOo oii1OOIOoI00iiI3 = I00iiI(3);
/* 228 */                       byte[] bArr3 = oii1OOIOoI00iiI3.I00000oIO;
/* 230 */                       int i8 = oii1OOIOoI00iiI3.I0000Il00O;
/* 237 */                       bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
/* 246 */                       bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | Barcode.FORMAT_ITF);
/* 254 */                       bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 257 */                       oii1OOIOoI00iiI3.I0000Il00O = i8 + 3;
                                this.I00iiI += 3;
                            } else {
/* 127 */                       int i9 = i + 1;
/* 136 */                       char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
/* 140 */                       if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
/* 217 */                           I00lll10(63);
/* 220 */                           i = i9;
                                } else {
/* 161 */                           int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
/* 163 */                           Oii1OOIOo oii1OOIOoI00iiI4 = I00iiI(4);
/* 167 */                           byte[] bArr4 = oii1OOIOoI00iiI4.I00000oIO;
/* 169 */                           int i11 = oii1OOIOoI00iiI4.I0000Il00O;
/* 176 */                           bArr4[i11] = (byte) ((i10 >> 18) | 240);
/* 185 */                           bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | Barcode.FORMAT_ITF);
/* 194 */                           bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | Barcode.FORMAT_ITF);
/* 201 */                           bArr4[i11 + 3] = (byte) ((i10 & 63) | Barcode.FORMAT_ITF);
/* 204 */                           oii1OOIOoI00iiI4.I0000Il00O = i11 + 4;
                                    this.I00iiI += 4;
/* 213 */                           i += 2;
                                }
                            }
/* 111 */                   i++;
                        }
                    }
                }

                public final void I00oo1iO0ll(String str) {
/* 6 */             I00oliIiO01i(0, str.length(), str);
                }

                public final void I00ooIo0(int i) {
/* 3 */             if (i < 128) {
/* 5 */                 I00lll10(i);
/* 8 */                 return;
                    }
/* 13 */            if (i < 2048) {
/* 16 */                Oii1OOIOo oii1OOIOoI00iiI = I00iiI(2);
/* 20 */                byte[] bArr = oii1OOIOoI00iiI.I00000oIO;
/* 22 */                int i2 = oii1OOIOoI00iiI.I0000Il00O;
/* 29 */                bArr[i2] = (byte) ((i >> 6) | 192);
/* 36 */                bArr[i2 + 1] = (byte) ((i & 63) | Barcode.FORMAT_ITF);
/* 39 */                oii1OOIOoI00iiI.I0000Il00O = i2 + 2;
                        this.I00iiI += 2;
/* 48 */                return;
                    }
/* 52 */            if (55296 <= i && i < 57344) {
/* 59 */                I00lll10(63);
/* 62 */                return;
                    }
/* 65 */            if (i < 65536) {
/* 68 */                Oii1OOIOo oii1OOIOoI00iiI2 = I00iiI(3);
/* 72 */                byte[] bArr2 = oii1OOIOoI00iiI2.I00000oIO;
/* 74 */                int i3 = oii1OOIOoI00iiI2.I0000Il00O;
/* 81 */                bArr2[i3] = (byte) ((i >> 12) | 224);
/* 90 */                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Barcode.FORMAT_ITF);
/* 97 */                bArr2[i3 + 2] = (byte) ((i & 63) | Barcode.FORMAT_ITF);
/* 100 */               oii1OOIOoI00iiI2.I0000Il00O = i3 + 3;
                        this.I00iiI += 3;
/* 109 */               return;
                    }
/* 113 */           if (i > 1114111) {
/* 177 */               I000II.I000iOII("Unexpected code point: 0x".concat(iO1oO1OoOoii.I0000Il00O(i)));
/* 186 */               return;
                    }
/* 116 */           Oii1OOIOo oii1OOIOoI00iiI3 = I00iiI(4);
/* 120 */           byte[] bArr3 = oii1OOIOoI00iiI3.I00000oIO;
/* 122 */           int i4 = oii1OOIOoI00iiI3.I0000Il00O;
/* 129 */           bArr3[i4] = (byte) ((i >> 18) | 240);
/* 138 */           bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Barcode.FORMAT_ITF);
/* 147 */           bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Barcode.FORMAT_ITF);
/* 154 */           bArr3[i4 + 3] = (byte) ((i & 63) | Barcode.FORMAT_ITF);
/* 157 */           oii1OOIOoI00iiI3.I0000Il00O = i4 + 4;
                    this.I00iiI += 4;
                }

                public final Object clone() {
/* 3 */             III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 12 */            if (this.I00iiI == 0) {
/* 14 */                return iII1o0lOio0;
                    }
/* 15 */            Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 17 */            Oii1OOIOo oii1OOIOoI0000Il00O = oii1OOIOo.I0000Il00O();
/* 21 */            iII1o0lOio0.I00iOIl = oii1OOIOoI0000Il00O;
/* 23 */            oii1OOIOoI0000Il00O.I000II = oii1OOIOoI0000Il00O;
/* 25 */            oii1OOIOoI0000Il00O.I0001Ioi1lo = oii1OOIOoI0000Il00O;
/* 29 */            for (Oii1OOIOo oii1OOIOo2 = oii1OOIOo.I0001Ioi1lo; oii1OOIOo2 != oii1OOIOo; oii1OOIOo2 = oii1OOIOo2.I0001Ioi1lo) {
/* 37 */                oii1OOIOoI0000Il00O.I000II.I00000oOI(oii1OOIOo2.I0000Il00O());
                    }
/* 45 */            iII1o0lOio0.I00iiI = this.I00iiI;
/* 113 */           return iII1o0lOio0;
                }

                public final boolean equals(Object obj) {
/* 6 */             if (this == obj) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(obj instanceof III1o0lOio0)) {
/* 11 */                return false;
                    }
/* 15 */            long j = this.I00iiI;
/* 17 */            III1o0lOio0 iII1o0lOio0 = (III1o0lOio0) obj;
/* 23 */            if (j != iII1o0lOio0.I00iiI) {
/* 11 */                return false;
                    }
/* 30 */            if (j == 0) {
/* 5 */                 return true;
                    }
/* 33 */            Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 35 */            Oii1OOIOo oii1OOIOo2 = iII1o0lOio0.I00iOIl;
/* 37 */            int i = oii1OOIOo.I00000oOI;
/* 39 */            int i2 = oii1OOIOo2.I00000oOI;
/* 41 */            long j2 = 0;
/* 46 */            while (j2 < this.I00iiI) {
/* 54 */                long jMin = Math.min(oii1OOIOo.I0000Il00O - i, oii1OOIOo2.I0000Il00O - i2);
/* 59 */                long j3 = 0;
/* 62 */                while (j3 < jMin) {
/* 66 */                    int i3 = i + 1;
/* 72 */                    int i4 = i2 + 1;
/* 76 */                    if (oii1OOIOo.I00000oIO[i] != oii1OOIOo2.I00000oIO[i2]) {
/* 11 */                        return false;
                            }
/* 81 */                    j3++;
/* 82 */                    i = i3;
/* 84 */                    i2 = i4;
                        }
/* 89 */                if (i == oii1OOIOo.I0000Il00O) {
/* 91 */                    oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 93 */                    i = oii1OOIOo.I00000oOI;
                        }
/* 97 */                if (i2 == oii1OOIOo2.I0000Il00O) {
/* 99 */                    oii1OOIOo2 = oii1OOIOo2.I0001Ioi1lo;
/* 101 */                   i2 = oii1OOIOo2.I00000oOI;
                        }
/* 103 */               j2 += jMin;
                    }
/* 5 */             return true;
                }

                public final int hashCode() {
/* 1 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 3 */             if (oii1OOIOo == null) {
/* 5 */                 return 0;
                    }
/* 7 */             int i = 1;
/* 28 */            do {
/* 10 */                int i2 = oii1OOIOo.I0000Il00O;
/* 12 */                for (int i3 = oii1OOIOo.I00000oOI; i3 < i2; i3++) {
/* 20 */                    i = (i * 31) + oii1OOIOo.I00000oIO[i3];
                        }
/* 24 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 28 */            } while (oii1OOIOo != this.I00iOIl);
/* 113 */           return i;
                }

                @Override
                public final boolean isOpen() {
/* 1 */             return true;
                }

                @Override
                public final OOliO0 peek() {
/* 8 */             return new OOliO0(new OO0ioI01o(this));
                }

                public final int read(byte[] bArr, int i, int i2) {
/* 5 */             iO1oO1OoOoii.I00000oOI(bArr.length, i, i2);
/* 8 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 10 */            if (oii1OOIOo == null) {
/* 12 */                return -1;
                    }
/* 19 */            int iMin = Math.min(i2, oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI);
/* 23 */            byte[] bArr2 = oii1OOIOo.I00000oIO;
/* 25 */            int i3 = oii1OOIOo.I00000oOI;
/* 29 */            I1IoiO1l.I000OOo1O(bArr2, i, bArr, i3, i3 + iMin);
/* 34 */            int i4 = oii1OOIOo.I00000oOI + iMin;
/* 35 */            oii1OOIOo.I00000oOI = i4;
                    this.I00iiI -= iMin;
/* 45 */            if (i4 == oii1OOIOo.I0000Il00O) {
/* 51 */                this.I00iOIl = oii1OOIOo.I00000oIO();
/* 53 */                Oii1iI10.I00000oIO(oii1OOIOo);
                    }
/* 215 */           return iMin;
                }

                public final byte readByte() throws EOFException {
/* 1 */             long j = this.I00iiI;
/* 7 */             if (j == 0) {
/* 41 */                I000II.I001i1O0Ol();
/* 44 */                return (byte) 0;
                    }
/* 9 */             Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 11 */            int i = oii1OOIOo.I00000oOI;
/* 13 */            int i2 = oii1OOIOo.I0000Il00O;
/* 17 */            int i3 = i + 1;
/* 19 */            byte b = oii1OOIOo.I00000oIO[i];
/* 24 */            this.I00iiI = j - 1;
/* 26 */            if (i3 != i2) {
/* 38 */                oii1OOIOo.I00000oOI = i3;
/* 40 */                return b;
                    }
/* 32 */            this.I00iOIl = oii1OOIOo.I00000oIO();
/* 34 */            Oii1iI10.I00000oIO(oii1OOIOo);
/* 37 */            return b;
                }

                @Override
                public final void skip(long j) throws EOFException {
/* 5 */             while (j > 0) {
/* 7 */                 Oii1OOIOo oii1OOIOo = this.I00iOIl;
/* 9 */                 if (oii1OOIOo == null) {
/* 48 */                    I000II.I001i1O0Ol();
/* 186 */                   return;
                        }
/* 21 */                int iMin = (int) Math.min(j, oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI);
                        long j2 = iMin;
                        this.I00iiI -= j2;
/* 28 */                j -= j2;
/* 31 */                int i = oii1OOIOo.I00000oOI + iMin;
/* 32 */                oii1OOIOo.I00000oOI = i;
/* 36 */                if (i == oii1OOIOo.I0000Il00O) {
/* 42 */                    this.I00iOIl = oii1OOIOo.I00000oIO();
/* 44 */                    Oii1iI10.I00000oIO(oii1OOIOo);
                        }
                    }
                }

                @Override
                public final Oo11IoI timeout() {
/* 1 */             return Oo11IoI.I0000O;
                }

                public final String toString() {
/* 1 */             long j = this.I00iiI;
/* 8 */             if (j <= 2147483647L) {
/* 15 */                return I00iOIl((int) j).toString();
                    }
/* 113 */           throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.I00iiI).toString());
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) {
                    Oii1OOIOo oii1OOIOoI00000oOI;
/* 1 */             if (iII1o0lOio0 == this) {
/* 220 */               I000II.I000iOII("source == this");
/* 551 */               return;
                    }
/* 8 */             iO1oO1OoOoii.I00000oOI(iII1o0lOio0.I00iiI, 0L, j);
/* 15 */            while (j > 0) {
/* 17 */                Oii1OOIOo oii1OOIOo = iII1o0lOio0.I00iOIl;
/* 23 */                int i = oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 28 */                if (j < i) {
/* 30 */                    Oii1OOIOo oii1OOIOo2 = this.I00iOIl;
/* 37 */                    Oii1OOIOo oii1OOIOo3 = oii1OOIOo2 != null ? oii1OOIOo2.I000II : null;
/* 38 */                    if (oii1OOIOo3 != null && oii1OOIOo3.I0000oI00) {
/* 62 */                        if ((oii1OOIOo3.I0000Il00O + j) - (oii1OOIOo3.I0000O ? 0 : oii1OOIOo3.I00000oOI) <= 8192) {
/* 65 */                            oii1OOIOo.I0000O(oii1OOIOo3, (int) j);
                                    iII1o0lOio0.I00iiI -= j;
                                    this.I00iiI += j;
/* 78 */                            return;
                                }
                            }
/* 79 */                    int i2 = (int) j;
/* 80 */                    if (i2 <= 0 || i2 > i) {
/* 129 */                       I000II.I000iOII("byteCount out of range");
/* 132 */                       return;
                            }
/* 86 */                    if (i2 >= 1024) {
/* 88 */                        oii1OOIOoI00000oOI = oii1OOIOo.I0000Il00O();
                            } else {
/* 93 */                        oii1OOIOoI00000oOI = Oii1iI10.I00000oOI();
/* 97 */                        byte[] bArr = oii1OOIOo.I00000oIO;
/* 99 */                        byte[] bArr2 = oii1OOIOoI00000oOI.I00000oIO;
/* 101 */                       int i3 = oii1OOIOo.I00000oOI;
/* 105 */                       I1IoiO1l.I000lI(bArr, bArr2, i3, i3 + i2);
                            }
/* 111 */                   oii1OOIOoI00000oOI.I0000Il00O = oii1OOIOoI00000oOI.I00000oOI + i2;
                            oii1OOIOo.I00000oOI += i2;
/* 120 */                   oii1OOIOo.I000II.I00000oOI(oii1OOIOoI00000oOI);
/* 123 */                   iII1o0lOio0.I00iOIl = oii1OOIOoI00000oOI;
/* 125 */                   oii1OOIOo = oii1OOIOoI00000oOI;
                        }
/* 137 */               long j2 = oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 143 */               iII1o0lOio0.I00iOIl = oii1OOIOo.I00000oIO();
/* 145 */               Oii1OOIOo oii1OOIOo4 = this.I00iOIl;
/* 147 */               if (oii1OOIOo4 == null) {
/* 149 */                   this.I00iOIl = oii1OOIOo;
/* 151 */                   oii1OOIOo.I000II = oii1OOIOo;
/* 153 */                   oii1OOIOo.I0001Ioi1lo = oii1OOIOo;
                        } else {
/* 158 */                   oii1OOIOo4.I000II.I00000oOI(oii1OOIOo);
/* 161 */                   Oii1OOIOo oii1OOIOo5 = oii1OOIOo.I000II;
/* 163 */                   if (oii1OOIOo5 == oii1OOIOo) {
/* 214 */                       I000II.I001IO000("cannot compact");
/* 217 */                       return;
                            } else if (oii1OOIOo5.I0000oI00) {
/* 174 */                       int i4 = oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 187 */                       if (i4 <= (8192 - oii1OOIOo5.I0000Il00O) + (oii1OOIOo5.I0000O ? 0 : oii1OOIOo5.I00000oOI)) {
/* 190 */                           oii1OOIOo.I0000O(oii1OOIOo5, i4);
/* 193 */                           oii1OOIOo.I00000oIO();
/* 196 */                           Oii1iI10.I00000oIO(oii1OOIOo);
                                }
                            }
                        }
                        iII1o0lOio0.I00iiI -= j2;
                        this.I00iiI += j2;
/* 209 */               j -= j2;
                    }
                }

                @Override
                public final IIIIiol writeByte(int i) {
/* 1 */             I00lll10(i);
/* 49 */            return this;
                }

                @Override
/* 28 */        public final III1o0lOio0 I0000oI00() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final void close() {
                }

                @Override
/* 28 */        public final void flush() {
                }

                @Override
/* 56 */        public final int read(ByteBuffer byteBuffer) {
/* 57 */            Oii1OOIOo oii1OOIOo = this.I00iOIl;
                    if (oii1OOIOo == null) {
                        return -1;
                    }
/* 58 */            int iMin = Math.min(byteBuffer.remaining(), oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI);
/* 59 */            byteBuffer.put(oii1OOIOo.I00000oIO, oii1OOIOo.I00000oOI, iMin);
/* 60 */            int i = oii1OOIOo.I00000oOI + iMin;
                    oii1OOIOo.I00000oOI = i;
                    this.I00iiI -= iMin;
/* 62 */            if (i == oii1OOIOo.I0000Il00O) {
/* 63 */                this.I00iOIl = oii1OOIOo.I00000oIO();
/* 64 */                Oii1iI10.I00000oIO(oii1OOIOo);
                    }
                    return iMin;
                }

                @Override
/* 64 */        public final long read(III1o0lOio0 iII1o0lOio0, long j) {
                    if (j >= 0) {
/* 65 */                long j2 = this.I00iiI;
                        if (j2 == 0) {
                            return -1L;
                        }
                        if (j > j2) {
                            j = j2;
                        }
/* 66 */                iII1o0lOio0.write(this, j);
                        return j;
                    }
/* 69 */            I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
                    return 0L;
                }

                @Override
/* 223 */       public final int write(ByteBuffer byteBuffer) {
/* 224 */           int iRemaining = byteBuffer.remaining();
                    int i = iRemaining;
                    while (i > 0) {
/* 225 */               Oii1OOIOo oii1OOIOoI00iiI = I00iiI(1);
/* 226 */               int iMin = Math.min(i, 8192 - oii1OOIOoI00iiI.I0000Il00O);
/* 227 */               byteBuffer.get(oii1OOIOoI00iiI.I00000oIO, oii1OOIOoI00iiI.I0000Il00O, iMin);
                        i -= iMin;
                        oii1OOIOoI00iiI.I0000Il00O += iMin;
                    }
                    this.I00iiI += iRemaining;
                    return iRemaining;
                }
            }

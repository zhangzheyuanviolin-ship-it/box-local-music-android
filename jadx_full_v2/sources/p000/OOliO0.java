            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            
/* 62 */    public final class OOliO0 implements IIIIlO11I0lO {
                public final OlI1ii I00iOIl;
                public final III1o0lOio0 I00iiI = new III1o0lOio0();
                public boolean I00iiO;

                public OOliO0(OlI1ii olI1ii) {
/* 4 */             this.I00iOIl = olI1ii;
                }

                public final long I00000oIO(byte b, long j, long j2) {
/* 5 */             if (this.I00iiO) {
/* 71 */                I000II.I001IO000("closed");
/* 3 */                 return 0L;
                    }
/* 9 */             if (0 > j2) {
/* 65 */                I000II.I0010I0i(IlIi0I0.I000iOII(j2, "fromIndex=0 toIndex="));
/* 3 */                 return 0L;
                    }
/* 11 */            long jMax = 0;
/* 16 */            while (jMax < j2) {
/* 18 */                III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 20 */                byte b2 = b;
/* 21 */                long j3 = j2;
/* 22 */                long jI000l1 = iII1o0lOio0.I000l1(b2, jMax, j3);
/* 28 */                if (jI000l1 != -1) {
/* 30 */                    return jI000l1;
                        }
/* 31 */                long j4 = iII1o0lOio0.I00iiI;
/* 35 */                if (j4 >= j3 || this.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
                            break;
                        }
/* 50 */                jMax = Math.max(jMax, j4);
/* 54 */                b = b2;
/* 55 */                j2 = j3;
                    }
/* 14 */            return -1L;
                }

                public final IIOIIi1ilIO I0000Il00O(long j) {
/* 1 */             I00100o1O0lo(j);
/* 6 */             return this.I00iiI.I00IOO(j);
                }

                @Override
                public final III1o0lOio0 I0000oI00() {
/* 1 */             return this.I00iiI;
                }

                public final int I000II() {
/* 3 */             I00100o1O0lo(4L);
/* 8 */             return this.I00iiI.I00IioO0OiOi();
                }

                public final int I000O01llI0() throws EOFException {
/* 3 */             I00100o1O0lo(4L);
/* 8 */             int iI00IioO0OiOi = this.I00iiI.I00IioO0OiOi();
/* 34 */            return ((iI00IioO0OiOi & 255) << 24) | (((-16777216) & iI00IioO0OiOi) >>> 24) | ((16711680 & iI00IioO0OiOi) >>> 8) | ((65280 & iI00IioO0OiOi) << 8);
                }

                public final short I000l1() {
/* 3 */             I00100o1O0lo(2L);
/* 8 */             return this.I00iiI.I00IoiI();
                }

                @Override
                public final boolean I000lI(long j) {
                    III1o0lOio0 iII1o0lOio0;
/* 6 */             if (j < 0) {
/* 49 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 5 */                 return false;
                    }
/* 10 */            if (this.I00iiO) {
/* 39 */                I000II.I001IO000("closed");
/* 5 */                 return false;
                    }
/* 32 */            do {
/* 12 */                iII1o0lOio0 = this.I00iiI;
/* 18 */                if (iII1o0lOio0.I00iiI >= j) {
/* 35 */                    return true;
                        }
/* 32 */            } while (this.I00iOIl.read(iII1o0lOio0, 8192L) != -1);
/* 5 */             return false;
                }

                @Override
                public final void I00100o1O0lo(long j) {
/* 5 */             if (I000lI(j)) {
/* 7 */                 return;
                    }
/* 8 */             I000II.I001i1O0Ol();
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
                
                    return -1;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I0010I0i(IIOIIi1ilIO iIOIIi1ilIO) {
                    long j;
/* 3 */             int iI00000oOI = iIOIIi1ilIO.I00000oOI();
                    long j2 = iI00000oOI;
/* 15 */            iO1oO1OoOoii.I00000oOI(iIOIIi1ilIO.I00000oOI(), 0L, j2);
/* 22 */            if (!this.I00iiO) {
/* 24 */                long jMax = 0;
                        while (true) {
/* 25 */                    III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 34 */                    long jI00000oIO = I00000oOI.I00000oIO(iII1o0lOio0, iIOIIi1ilIO, jMax, Long.MAX_VALUE, iI00000oOI);
/* 38 */                    long j3 = -1;
/* 42 */                    if (jI00000oIO == -1) {
/* 45 */                        long j4 = iII1o0lOio0.I00iiI;
/* 53 */                        long j5 = (j4 - j2) + 1;
/* 56 */                        if (j5 >= Long.MAX_VALUE) {
                                    break;
                                }
/* 63 */                        if (j4 >= Long.MAX_VALUE) {
/* 81 */                            int iMax = (int) Math.max(1L, j4 - 9223372036854775806L);
                                    int iMin = ((int) Math.min(j2, (iII1o0lOio0.I00iiI - jMax) + 1)) - 1;
/* 93 */                            if (iMax > iMin) {
                                        break;
                                    }
                                    while (true) {
/* 97 */                                j = j3;
/* 107 */                               if (iII1o0lOio0.I001i1lo1io(iII1o0lOio0.I00iiI - iMin, iIOIIi1ilIO, iMin)) {
                                            break;
                                        }
/* 127 */                               if (iMin == iMax) {
/* 134 */                                   return j;
                                        }
                                        iMin--;
/* 131 */                               j3 = j;
                                    }
                                } else {
/* 67 */                            j = -1;
                                }
/* 119 */                       if (this.I00iOIl.read(iII1o0lOio0, 8192L) == j) {
/* 134 */                           return j;
                                }
/* 122 */                       jMax = Math.max(jMax, j5);
                            } else {
/* 44 */                        return jI00000oIO;
                            }
                        }
                    } else {
/* 137 */               I000II.I001IO000("closed");
/* 20 */                return 0L;
                    }
                }

                public final boolean I00II0Ol1O0l() {
/* 4 */             if (this.I00iiO) {
/* 33 */                I000II.I001IO000("closed");
/* 3 */                 return false;
                    }
/* 6 */             III1o0lOio0 iII1o0lOio0 = this.I00iiI;
                    return iII1o0lOio0.I00II0Ol1O0l() && this.I00iOIl.read(iII1o0lOio0, 8192L) == -1;
                }

                @Override
                public final int I00IO1oi11O(OIil0IiIo oIil0IiIo) throws EOFException {
/* 3 */             if (this.I00iiO) {
/* 48 */                I000II.I001IO000("closed");
/* 51 */                return 0;
                    }
                    while (true) {
/* 6 */                 III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 8 */                 int iI0000O = I00000oOI.I0000O(iII1o0lOio0, oIil0IiIo, true);
/* 14 */                if (iI0000O != -2) {
/* 16 */                    if (iI0000O != -1) {
/* 27 */                        iII1o0lOio0.skip(oIil0IiIo.I00iOIl[iI0000O].I00000oOI());
/* 30 */                        return iI0000O;
                            }
                        } else if (this.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
                            break;
                        }
                    }
/* 13 */            return -1;
                }

                @Override
                public final long I00IlilI0i0i(IIOIIi1ilIO iIOIIi1ilIO) {
/* 3 */             long jMax = 0;
/* 5 */             if (this.I00iiO) {
/* 42 */                I000II.I001IO000("closed");
/* 3 */                 return 0L;
                    }
                    while (true) {
/* 7 */                 III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 9 */                 long jI00100l0 = iII1o0lOio0.I00100l0(iIOIIi1ilIO, jMax);
/* 17 */                if (jI00100l0 != -1) {
/* 19 */                    return jI00100l0;
                        }
/* 20 */                long j = iII1o0lOio0.I00iiI;
/* 32 */                if (this.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
/* 13 */                    return -1L;
                        }
/* 35 */                jMax = Math.max(jMax, j);
                    }
                }

                @Override
                public final String I00IoO0(long j) throws EOFException {
/* 7 */             if (j < 0) {
/* 162 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "limit < 0: "));
/* 165 */               return null;
                    }
/* 22 */            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
/* 31 */            long jI00000oIO = I00000oIO((byte) 10, 0L, j2);
/* 39 */            III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 41 */            if (jI00000oIO != -1) {
/* 43 */                return I00000oOI.I0000Il00O(iII1o0lOio0, jI00000oIO);
                    }
/* 50 */            if (j2 < Long.MAX_VALUE && I000lI(j2) && iII1o0lOio0.I000O01llI0(j2 - 1) == 13 && I000lI(j2 + 1) && iII1o0lOio0.I000O01llI0(j2) == 10) {
/* 84 */                return I00000oOI.I0000Il00O(iII1o0lOio0, j2);
                    }
/* 91 */            III1o0lOio0 iII1o0lOio02 = new III1o0lOio0();
/* 104 */           iII1o0lOio0.I000II(iII1o0lOio02, 0L, Math.min(32L, iII1o0lOio0.I00iiI));
/* 155 */           throw new EOFException("\\n not found: limit=" + Math.min(iII1o0lOio0.I00iiI, j) + " content=" + iII1o0lOio02.I00IOO(iII1o0lOio02.I00iiI).I0000Il00O() + (char) 8230);
                }

                @Override
                public final long I00OIO1(IIIIiol iIIIiol) {
                    III1o0lOio0 iII1o0lOio0;
/* 3 */             long j = 0;
                    while (true) {
/* 4 */                 OlI1ii olI1ii = this.I00iOIl;
/* 8 */                 iII1o0lOio0 = this.I00iiI;
/* 18 */                if (olI1ii.read(iII1o0lOio0, 8192L) == -1) {
                            break;
                        }
/* 20 */                long jI0000Il00O = iII1o0lOio0.I0000Il00O();
/* 26 */                if (jI0000Il00O > 0) {
/* 28 */                    j += jI0000Il00O;
/* 29 */                    iIIIiol.write(iII1o0lOio0, jI0000Il00O);
                        }
                    }
/* 33 */            long j2 = iII1o0lOio0.I00iiI;
/* 37 */            if (j2 <= 0) {
/* 49 */                return j;
                    }
/* 39 */            long j3 = j + j2;
/* 40 */            iIIIiol.write(iII1o0lOio0, j2);
/* 49 */            return j3;
                }

                @Override
                public final String I00Ol1ll1(Charset charset) {
/* 1 */             OlI1ii olI1ii = this.I00iOIl;
/* 3 */             III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 5 */             iII1o0lOio0.I00lli11(olI1ii);
/* 10 */            return iII1o0lOio0.I00OOll1(iII1o0lOio0.I00iiI, charset);
                }

                @Override
                public final String I00iio() {
/* 6 */             return I00IoO0(Long.MAX_VALUE);
                }

                @Override
                public final long I00oli() {
                    III1o0lOio0 iII1o0lOio0;
                    byte bI000O01llI0;
/* 3 */             I00100o1O0lo(1L);
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 int i2 = i + 1;
/* 10 */                boolean zI000lI = I000lI(i2);
/* 14 */                iII1o0lOio0 = this.I00iiI;
/* 16 */                if (!zI000lI) {
                            break;
                        }
/* 19 */                bI000O01llI0 = iII1o0lOio0.I000O01llI0(i);
/* 25 */                if ((bI000O01llI0 < 48 || bI000O01llI0 > 57) && ((bI000O01llI0 < 97 || bI000O01llI0 > 102) && (bI000O01llI0 < 65 || bI000O01llI0 > 70))) {
                            break;
                        }
/* 48 */                i = i2;
                    }
/* 50 */            if (i == 0) {
/* 57 */                iOlI1lIi0.I00000oIO(16);
/* 73 */                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bI000O01llI0, 16)));
                    }
/* 74 */            return iII1o0lOio0.I00oli();
                }

                @Override
                public final void close() throws IOException {
/* 3 */             if (this.I00iiO) {
/* 29 */                return;
                    }
/* 6 */             this.I00iiO = true;
/* 10 */            this.I00iOIl.close();
/* 15 */            this.I00iiI.I00000oIO();
                }

                @Override
                public final boolean isOpen() {
/* 3 */             return !this.I00iiO;
                }

                @Override
                public final OOliO0 peek() {
/* 8 */             return new OOliO0(new OO0ioI01o(this));
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) {
/* 5 */             if (j < 0) {
/* 60 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 1 */                 return 0L;
                    }
/* 9 */             if (this.I00iiO) {
/* 50 */                I000II.I001IO000("closed");
/* 1 */                 return 0L;
                    }
/* 11 */            III1o0lOio0 iII1o0lOio02 = this.I00iiI;
/* 17 */            if (iII1o0lOio02.I00iiI == 0) {
/* 19 */                if (j == 0) {
/* 1 */                     return 0L;
                        }
/* 34 */                if (this.I00iOIl.read(iII1o0lOio02, 8192L) == -1) {
/* 30 */                    return -1L;
                        }
                    }
/* 43 */            return iII1o0lOio02.read(iII1o0lOio0, Math.min(j, iII1o0lOio02.I00iiI));
                }

                public final byte readByte() {
/* 3 */             I00100o1O0lo(1L);
/* 8 */             return this.I00iiI.readByte();
                }

                @Override
                public final void skip(long j) throws EOFException {
/* 3 */             if (this.I00iiO) {
/* 52 */                I000II.I001IO000("closed");
/* 186 */               return;
                    }
/* 9 */             while (j > 0) {
/* 11 */                III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 17 */                if (iII1o0lOio0.I00iiI == 0 && this.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
/* 34 */                    I000II.I001i1O0Ol();
/* 37 */                    return;
                        } else {
/* 40 */                    long jMin = Math.min(j, iII1o0lOio0.I00iiI);
/* 44 */                    iII1o0lOio0.skip(jMin);
/* 47 */                    j -= jMin;
                        }
                    }
                }

                @Override
                public final Oo11IoI timeout() {
/* 3 */             return this.I00iOIl.timeout();
                }

                public final String toString() {
/* 18 */            return "buffer(" + this.I00iOIl + ')';
                }

                @Override
/* 63 */        public final int read(ByteBuffer byteBuffer) {
/* 64 */            III1o0lOio0 iII1o0lOio0 = this.I00iiI;
                    if (iII1o0lOio0.I00iiI == 0 && this.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
                        return -1;
                    }
/* 66 */            return iII1o0lOio0.read(byteBuffer);
                }
            }

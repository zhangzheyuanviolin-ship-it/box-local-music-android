            package p000;

            import java.io.EOFException;
            import java.io.Flushable;
            
/* 27 */    public final class III1oo00i1li implements OlI1iil1l0, AutoCloseable, Flushable {
                public Oii1O1l I00iOIl;
                public Oii1O1l I00iiI;
                public long I00iiO;

                public final byte I00000oIO(long j) {
                    Oii1O1l oii1O1l;
                    long j2;
/* 1 */             long j3 = 0;
/* 6 */             if (j < 0 || j >= this.I00iiO) {
/* 100 */               I000II.I0010o(IlIi0I0.I000o00OoI0I(Oi010OO0.I001iOo1i0O(j, "position (", ") is not within the range [0..size("), this.I00iiO, "))"));
/* 5 */                 return (byte) 0;
                    }
/* 14 */            Oii1O1l oii1O1l2 = this.I00iOIl;
/* 16 */            if (j == 0) {
/* 18 */                return oii1O1l2.I00000oOI(0);
                    }
/* 23 */            oii1O1l2.getClass();
/* 26 */            long j4 = this.I00iiO;
/* 32 */            if (j4 - j < j) {
/* 34 */                oii1O1l = this.I00iiI;
/* 36 */                while (oii1O1l != null && j4 > j) {
/* 48 */                    j4 -= oii1O1l.I0000Il00O - oii1O1l.I00000oOI;
/* 51 */                    if (j4 <= j) {
                                break;
                            }
/* 53 */                    oii1O1l = oii1O1l.I000II;
                        }
/* 56 */                j2 = j - j4;
                    } else {
/* 63 */                oii1O1l = this.I00iOIl;
/* 65 */                while (oii1O1l != null) {
/* 73 */                    long j5 = (oii1O1l.I0000Il00O - oii1O1l.I00000oOI) + j3;
/* 76 */                    if (j5 > j) {
                                break;
                            }
/* 78 */                    oii1O1l = oii1O1l.I0001Ioi1lo;
/* 80 */                    j3 = j5;
                        }
/* 82 */                j2 = j - j3;
                    }
/* 58 */            return oii1O1l.I00000oOI((int) j2);
                }

                public final int I0000Il00O(byte[] bArr, int i, int i2) {
/* 5 */             iO1i0iI.I00000oIO(bArr.length, i, i2);
/* 8 */             Oii1O1l oii1O1l = this.I00iOIl;
/* 10 */            if (oii1O1l == null) {
/* 12 */                return -1;
                    }
/* 19 */            int iMin = Math.min(i2 - i, oii1O1l.I00000oIO());
/* 25 */            int i3 = (i + iMin) - i;
/* 26 */            byte[] bArr2 = oii1O1l.I00000oIO;
/* 28 */            int i4 = oii1O1l.I00000oOI;
/* 32 */            I1IoiO1l.I000OOo1O(bArr2, i, bArr, i4, i4 + i3);
                    oii1O1l.I00000oOI += i3;
                    this.I00iiO -= iMin;
/* 50 */            if (oii1O1l.I00000oIO() == 0) {
/* 52 */                I000O01llI0();
                    }
/* 215 */           return iMin;
                }

                public final void I000II(III1oo00i1li iII1oo00i1li, long j) throws EOFException {
/* 5 */             if (j < 0) {
/* 50 */                I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 89 */                return;
                    }
/* 7 */             long j2 = this.I00iiO;
/* 11 */            if (j2 >= j) {
/* 13 */                iII1oo00i1li.I00IOO(this, j);
                    } else {
/* 17 */                iII1oo00i1li.I00IOO(this, j2);
/* 41 */                throw new EOFException(IlIi0I0.I000o00OoI0I(Oi010OO0.I001iOo1i0O(j, "Buffer exhausted before writing ", " bytes. Only "), this.I00iiO, " bytes were written."));
                    }
                }

                public final void I000O01llI0() {
/* 1 */             Oii1O1l oii1O1l = this.I00iOIl;
/* 3 */             Oii1O1l oii1O1l2 = oii1O1l.I0001Ioi1lo;
/* 5 */             this.I00iOIl = oii1O1l2;
/* 8 */             if (oii1O1l2 == null) {
/* 10 */                this.I00iiI = null;
                    } else {
/* 13 */                oii1O1l2.I000II = null;
                    }
/* 15 */            oii1O1l.I0001Ioi1lo = null;
/* 17 */            Oii1iIoiil0o.I00000oIO(oii1O1l);
                }

                public final long I000l1(OOlI0i1lo oOlI0i1lo) {
/* 1 */             long j = 0;
                    while (true) {
/* 5 */                 long jI00II0oii1o = oOlI0i1lo.I00II0oii1o(this, 8192L);
/* 13 */                if (jI00II0oii1o == -1) {
/* 49 */                    return j;
                        }
/* 15 */                j += jI00II0oii1o;
                    }
                }

                @Override
                public final boolean I000lI(long j) {
/* 5 */             if (j >= 0) {
                        return this.I00iiO >= j;
                    }
/* 25 */            I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount: ", " < 0"));
/* 28 */            return false;
                }

                public final long I00100l0(III1oo00i1li iII1oo00i1li) {
/* 1 */             long j = this.I00iiO;
/* 7 */             if (j > 0) {
/* 9 */                 iII1oo00i1li.I00IOO(this, j);
                    }
/* 49 */            return j;
                }

                @Override
                public final void I00100o1O0lo(long j) throws EOFException {
/* 5 */             if (j < 0) {
/* 55 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount: "));
/* 186 */               return;
                    }
/* 11 */            if (this.I00iiO >= j) {
/* 13 */                return;
                    }
/* 48 */            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.I00iiO + ", required: " + j + ')');
                }

                public final Oii1O1l I001i1lo1io() {
/* 1 */             Oii1O1l oii1O1l = this.I00iiI;
/* 3 */             if (oii1O1l == null) {
/* 5 */                 Oii1O1l oii1O1lI00000oOI = Oii1iIoiil0o.I00000oOI();
/* 9 */                 this.I00iOIl = oii1O1lI00000oOI;
/* 11 */                this.I00iiI = oii1O1lI00000oOI;
/* 13 */                return oii1O1lI00000oOI;
                    }
/* 20 */            if (oii1O1l.I0000Il00O + 1 <= 8192 && oii1O1l.I0000oI00) {
/* 27 */                return oii1O1l;
                    }
/* 28 */            Oii1O1l oii1O1lI00000oOI2 = Oii1iIoiil0o.I00000oOI();
/* 32 */            oii1O1l.I0000Il00O(oii1O1lI00000oOI2);
/* 35 */            this.I00iiI = oii1O1lI00000oOI2;
/* 113 */           return oii1O1lI00000oOI2;
                }

                public final void I001l0I00(int i, byte[] bArr) {
/* 6 */             iO1i0iI.I00000oIO(bArr.length, 0L, i);
/* 9 */             int i2 = 0;
/* 10 */            while (i2 < i) {
/* 12 */                Oii1O1l oii1O1lI001i1lo1io = I001i1lo1io();
/* 16 */                byte[] bArr2 = oii1O1lI001i1lo1io.I00000oIO;
/* 28 */                int iMin = Math.min(i - i2, bArr2.length - oii1O1lI001i1lo1io.I0000Il00O) + i2;
/* 31 */                I1IoiO1l.I000OOo1O(bArr, oii1O1lI001i1lo1io.I0000Il00O, bArr2, i2, iMin);
/* 39 */                oii1O1lI001i1lo1io.I0000Il00O = (iMin - i2) + oii1O1lI001i1lo1io.I0000Il00O;
/* 41 */                i2 = iMin;
                    }
                    this.I00iiO += i;
                }

                @Override
                public final boolean I00II0Ol1O0l() {
                    return this.I00iiO == 0;
                }

                @Override
                public final long I00II0oii1o(III1oo00i1li iII1oo00i1li, long j) {
/* 5 */             if (j < 0) {
/* 33 */                I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 1 */                 return 0L;
                    }
/* 7 */             long j2 = this.I00iiO;
/* 11 */            if (j2 == 0) {
/* 13 */                return -1L;
                    }
/* 18 */            if (j > j2) {
/* 20 */                j = j2;
                    }
/* 21 */            iII1oo00i1li.I00IOO(this, j);
/* 24 */            return j;
                }

                public final void I00IOO(III1oo00i1li iII1oo00i1li, long j) {
                    Oii1O1l oii1O1lI00000oOI;
/* 1 */             if (iII1oo00i1li == this) {
/* 287 */               I000II.I000iOII("source == this");
/* 551 */               return;
                    }
/* 5 */             iO1i0iI.I00000oOI(iII1oo00i1li.I00iiO, j);
/* 12 */            while (j > 0) {
/* 24 */                if (j < iII1oo00i1li.I00iOIl.I00000oIO()) {
/* 26 */                    Oii1O1l oii1O1l = this.I00iiI;
/* 28 */                    if (oii1O1l != null && oii1O1l.I0000oI00) {
/* 37 */                        long j2 = oii1O1l.I0000Il00O + j;
/* 38 */                        OOo10l0o0IOO oOo10l0o0IOO = oii1O1l.I0000O;
/* 56 */                        if (j2 - ((oOo10l0o0IOO == null || oOo10l0o0IOO.I00000oIO <= 0) ? oii1O1l.I00000oOI : 0) <= 8192) {
/* 61 */                            iII1oo00i1li.I00iOIl.I0000oI00(oii1O1l, (int) j);
                                    iII1oo00i1li.I00iiO -= j;
                                    this.I00iiO += j;
/* 74 */                            return;
                                }
                            }
/* 75 */                    Oii1O1l oii1O1l2 = iII1oo00i1li.I00iOIl;
/* 77 */                    int i = (int) j;
/* 78 */                    if (i <= 0 || i > oii1O1l2.I0000Il00O - oii1O1l2.I00000oOI) {
/* 138 */                       I000II.I000iOII("byteCount out of range");
/* 141 */                       return;
                            }
/* 89 */                    if (i >= 1024) {
/* 91 */                        oii1O1lI00000oOI = oii1O1l2.I0000O();
                            } else {
/* 96 */                        oii1O1lI00000oOI = Oii1iIoiil0o.I00000oOI();
/* 100 */                       byte[] bArr = oii1O1l2.I00000oIO;
/* 102 */                       byte[] bArr2 = oii1O1lI00000oOI.I00000oIO;
/* 104 */                       int i2 = oii1O1l2.I00000oOI;
/* 108 */                       I1IoiO1l.I000lI(bArr, bArr2, i2, i2 + i);
                            }
/* 114 */                   oii1O1lI00000oOI.I0000Il00O = oii1O1lI00000oOI.I00000oOI + i;
                            oii1O1l2.I00000oOI += i;
/* 121 */                   Oii1O1l oii1O1l3 = oii1O1l2.I000II;
/* 123 */                   if (oii1O1l3 != null) {
/* 125 */                       oii1O1l3.I0000Il00O(oii1O1lI00000oOI);
                            } else {
/* 129 */                       oii1O1lI00000oOI.I0001Ioi1lo = oii1O1l2;
/* 131 */                       oii1O1l2.I000II = oii1O1lI00000oOI;
                            }
/* 133 */                   iII1oo00i1li.I00iOIl = oii1O1lI00000oOI;
                        }
/* 142 */               Oii1O1l oii1O1l4 = iII1oo00i1li.I00iOIl;
/* 144 */               long jI00000oIO = oii1O1l4.I00000oIO();
/* 149 */               Oii1O1l oii1O1l5 = oii1O1l4.I0001Ioi1lo;
/* 151 */               Oii1O1l oii1O1l6 = oii1O1l4.I000II;
/* 153 */               if (oii1O1l6 != null) {
/* 155 */                   oii1O1l6.I0001Ioi1lo = oii1O1l5;
                        }
/* 157 */               Oii1O1l oii1O1l7 = oii1O1l4.I0001Ioi1lo;
/* 159 */               if (oii1O1l7 != null) {
/* 161 */                   oii1O1l7.I000II = oii1O1l6;
                        }
/* 164 */               oii1O1l4.I0001Ioi1lo = null;
/* 166 */               oii1O1l4.I000II = null;
/* 168 */               iII1oo00i1li.I00iOIl = oii1O1l5;
/* 170 */               if (oii1O1l5 == null) {
/* 172 */                   iII1oo00i1li.I00iiI = null;
                        }
/* 176 */               if (this.I00iOIl == null) {
/* 178 */                   this.I00iOIl = oii1O1l4;
/* 180 */                   this.I00iiI = oii1O1l4;
                        } else {
/* 185 */                   this.I00iiI.I0000Il00O(oii1O1l4);
/* 188 */                   Oii1O1l oii1O1l8 = oii1O1l4.I000II;
/* 190 */                   if (oii1O1l8 == null) {
/* 281 */                       I000II.I001IO000("cannot compact");
/* 284 */                       return;
                            }
/* 194 */                   if (oii1O1l8.I0000oI00) {
/* 201 */                       int i3 = oii1O1l4.I0000Il00O - oii1O1l4.I00000oOI;
/* 204 */                       int i4 = 8192 - oii1O1l8.I0000Il00O;
/* 206 */                       OOo10l0o0IOO oOo10l0o0IOO2 = oii1O1l8.I0000O;
/* 220 */                       if (i3 <= i4 + ((oOo10l0o0IOO2 == null || oOo10l0o0IOO2.I00000oIO <= 0) ? oii1O1l4.I000II.I00000oOI : 0)) {
/* 223 */                           Oii1O1l oii1O1l9 = oii1O1l4.I000II;
/* 225 */                           oii1O1l4.I0000oI00(oii1O1l9, i3);
/* 228 */                           Oii1O1l oii1O1l10 = oii1O1l4.I0001Ioi1lo;
/* 230 */                           Oii1O1l oii1O1l11 = oii1O1l4.I000II;
/* 232 */                           if (oii1O1l11 != null) {
/* 234 */                               oii1O1l11.I0001Ioi1lo = oii1O1l10;
                                    }
/* 236 */                           Oii1O1l oii1O1l12 = oii1O1l4.I0001Ioi1lo;
/* 238 */                           if (oii1O1l12 != null) {
/* 240 */                               oii1O1l12.I000II = oii1O1l11;
                                    }
/* 242 */                           oii1O1l4.I0001Ioi1lo = null;
/* 244 */                           oii1O1l4.I000II = null;
/* 246 */                           if (oii1O1l10 != null) {
/* 275 */                               I000II.I001IO000("Check failed.");
/* 278 */                               return;
                                    } else {
/* 248 */                               Oii1iIoiil0o.I00000oIO(oii1O1l4);
/* 251 */                               oii1O1l4 = oii1O1l9;
                                    }
                                }
                            }
/* 252 */                   this.I00iiI = oii1O1l4;
/* 256 */                   if (oii1O1l4.I000II == null) {
/* 258 */                       this.I00iOIl = oii1O1l4;
                            }
                        }
                        iII1oo00i1li.I00iiO -= jI00000oIO;
                        this.I00iiO += jI00000oIO;
/* 270 */               j -= jI00000oIO;
                    }
                }

                @Override
                public final byte readByte() throws EOFException {
/* 1 */             Oii1O1l oii1O1l = this.I00iOIl;
/* 3 */             if (oii1O1l == null) {
/* 113 */               throw new EOFException(IlIi0I0.I000o00OoI0I(new StringBuilder("Buffer doesn't contain required number of bytes (size: "), this.I00iiO, ", required: 1)"));
                    }
/* 5 */             int iI00000oIO = oii1O1l.I00000oIO();
/* 9 */             if (iI00000oIO == 0) {
/* 11 */                I000O01llI0();
/* 14 */                return readByte();
                    }
/* 19 */            byte[] bArr = oii1O1l.I00000oIO;
/* 21 */            int i = oii1O1l.I00000oOI;
/* 25 */            oii1O1l.I00000oOI = i + 1;
/* 27 */            byte b = bArr[i];
                    this.I00iiO--;
/* 37 */            if (iI00000oIO == 1) {
/* 39 */                I000O01llI0();
                    }
/* 42 */            return b;
                }

                public final void skip(long j) throws EOFException {
/* 5 */             if (j < 0) {
/* 70 */                I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 186 */               return;
                    }
/* 7 */             long j2 = j;
/* 10 */            while (j2 > 0) {
/* 12 */                Oii1O1l oii1O1l = this.I00iOIl;
/* 14 */                if (oii1O1l == null) {
/* 60 */                    throw new EOFException(IlIi0I0.I000l1(j, "Buffer exhausted before skipping ", " bytes."));
                        }
/* 26 */                int iMin = (int) Math.min(j2, oii1O1l.I0000Il00O - oii1O1l.I00000oOI);
                        long j3 = iMin;
                        this.I00iiO -= j3;
/* 33 */                j2 -= j3;
/* 36 */                int i = oii1O1l.I00000oOI + iMin;
/* 37 */                oii1O1l.I00000oOI = i;
/* 41 */                if (i == oii1O1l.I0000Il00O) {
/* 43 */                    I000O01llI0();
                        }
                    }
                }

                public final String toString() {
/* 1 */             long j = this.I00iiO;
/* 7 */             if (j == 0) {
/* 9 */                 return "Buffer(size=0)";
                    }
/* 18 */            int iMin = (int) Math.min(64L, j);
/* 34 */            StringBuilder sb = new StringBuilder((iMin * 2) + (this.I00iiO > 64 ? 1 : 0));
/* 39 */            int i = 0;
/* 40 */            for (Oii1O1l oii1O1l = this.I00iOIl; oii1O1l != null; oii1O1l = oii1O1l.I0001Ioi1lo) {
/* 42 */                int i2 = 0;
/* 43 */                while (i < iMin && i2 < oii1O1l.I00000oIO()) {
/* 51 */                    int i3 = i2 + 1;
/* 53 */                    byte bI00000oOI = oii1O1l.I00000oOI(i2);
/* 57 */                    i++;
/* 63 */                    char[] cArr = iO1i0iI.I00000oIO;
/* 67 */                    sb.append(cArr[(bI00000oOI >> 4) & 15]);
/* 74 */                    sb.append(cArr[bI00000oOI & 15]);
/* 77 */                    i2 = i3;
                        }
                    }
/* 86 */            if (this.I00iiO > 64) {
/* 90 */                sb.append((char) 8230);
                    }
/* 118 */           return "Buffer(size=" + this.I00iiO + " hex=" + ((Object) sb) + ')';
                }

                @Override
/* 28 */        public final III1oo00i1li I0000oI00() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final void close() {
                }

                @Override
/* 28 */        public final void flush() {
                }
            }

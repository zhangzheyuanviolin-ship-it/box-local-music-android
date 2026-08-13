            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.zip.CRC32;
            import java.util.zip.DataFormatException;
            import java.util.zip.Inflater;
            
            public final class Io11OiO1 implements OlI1ii {
                public byte I00iOIl;
                public final OOliO0 I00iiI;
                public final Inflater I00iiO;
                public final IolIiOl I00iio;
                public final CRC32 I00ilI0I1;

                public Io11OiO1(OlI1ii olI1ii) {
/* 6 */             OOliO0 oOliO0 = new OOliO0(olI1ii);
/* 9 */             this.I00iiI = oOliO0;
/* 14 */            Inflater inflater = new Inflater(true);
/* 17 */            this.I00iiO = inflater;
/* 21 */            IolIiOl iolIiOl = new IolIiOl();
/* 24 */            iolIiOl.I00iOIl = oOliO0;
/* 26 */            iolIiOl.I00iiI = inflater;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            this.I00iio = iolIiOl;
/* 38 */            this.I00ilI0I1 = new CRC32();
                }

                public static void I00000oIO(int i, int i2, String str) throws IOException {
/* 1 */             if (i2 == i) {
/* 3 */                 return;
                    }
/* 215 */           throw new IOException(str + ": actual 0x" + OlOoOIi0o.I00IO1(8, iO1oO1OoOoii.I0000Il00O(i2)) + " != expected 0x" + OlOoOIi0o.I00IO1(8, iO1oO1OoOoii.I0000Il00O(i)));
                }

                public final void I0000Il00O(III1o0lOio0 iII1o0lOio0, long j, long j2) {
/* 1 */             Oii1OOIOo oii1OOIOo = iII1o0lOio0.I00iOIl;
                    while (true) {
/* 7 */                 long j3 = oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 11 */                if (j < j3) {
                            break;
                        }
/* 13 */                j -= j3;
/* 14 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
                    }
/* 21 */            while (j2 > 0) {
/* 36 */                int iMin = (int) Math.min(oii1OOIOo.I0000Il00O - r6, j2);
/* 41 */                this.I00ilI0I1.update(oii1OOIOo.I00000oIO, (int) (oii1OOIOo.I00000oOI + j), iMin);
/* 45 */                j2 -= iMin;
/* 46 */                oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 48 */                j = 0;
                    }
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iio.close();
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws DataFormatException, IOException {
                    long j2;
                    III1o0lOio0 iII1o0lOio02;
                    long j3;
/* 1 */             Io11OiO1 io11OiO1 = this;
/* 7 */             OOliO0 oOliO0 = io11OiO1.I00iiI;
/* 9 */             III1o0lOio0 iII1o0lOio03 = oOliO0.I00iiI;
/* 15 */            if (j < 0) {
/* 348 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 11 */                return 0L;
                    }
/* 17 */            if (j == 0) {
/* 11 */                return 0L;
                    }
/* 20 */            byte b = io11OiO1.I00iOIl;
/* 22 */            CRC32 crc32 = io11OiO1.I00ilI0I1;
/* 27 */            if (b == 0) {
/* 31 */                oOliO0.I00100o1O0lo(10L);
/* 36 */                byte bI000O01llI0 = iII1o0lOio03.I000O01llI0(3L);
/* 49 */                boolean z = ((bI000O01llI0 >> 1) & 1) == 1;
/* 51 */                if (z) {
/* 57 */                    io11OiO1.I0000Il00O(iII1o0lOio03, 0L, 10L);
                        }
/* 68 */                I00000oIO(8075, oOliO0.I000l1(), "ID1ID2");
/* 73 */                oOliO0.skip(8L);
/* 81 */                if (((bI000O01llI0 >> 2) & 1) == 1) {
/* 83 */                    oOliO0.I00100o1O0lo(2L);
/* 86 */                    if (z) {
/* 97 */                        j2 = 0;
/* 99 */                        j3 = 2;
/* 101 */                       I0000Il00O(iII1o0lOio03, 0L, 2L);
                            } else {
/* 105 */                       j2 = 0;
/* 107 */                       j3 = 2;
                            }
/* 115 */                   long jI00OIl = iII1o0lOio03.I00OIl() & 65535;
/* 117 */                   oOliO0.I00100o1O0lo(jI00OIl);
/* 120 */                   if (z) {
/* 126 */                       I0000Il00O(iII1o0lOio03, 0L, jI00OIl);
                            }
/* 129 */                   iII1o0lOio02 = iII1o0lOio03;
/* 131 */                   oOliO0.skip(jI00OIl);
                        } else {
/* 135 */                   iII1o0lOio02 = iII1o0lOio03;
/* 137 */                   j2 = 0;
/* 139 */                   j3 = 2;
                        }
/* 145 */               if (((bI000O01llI0 >> 3) & 1) == 1) {
/* 156 */                   long jI00000oIO = oOliO0.I00000oIO((byte) 0, 0L, Long.MAX_VALUE);
/* 162 */                   if (jI00000oIO == -1) {
/* 183 */                       I000II.I001i1O0Ol();
/* 186 */                       return j2;
                            }
/* 164 */                   if (z) {
/* 174 */                       I0000Il00O(iII1o0lOio02, 0L, jI00000oIO + 1);
                            }
/* 179 */                   oOliO0.skip(jI00000oIO + 1);
                        }
/* 190 */               if (((bI000O01llI0 >> 4) & 1) == 1) {
/* 201 */                   long jI00000oIO2 = oOliO0.I00000oIO((byte) 0, 0L, Long.MAX_VALUE);
/* 207 */                   if (jI00000oIO2 == -1) {
/* 231 */                       I000II.I001i1O0Ol();
/* 234 */                       return j2;
                            }
/* 209 */                   if (z) {
/* 215 */                       io11OiO1 = this;
/* 219 */                       io11OiO1.I0000Il00O(iII1o0lOio02, 0L, jI00000oIO2 + 1);
                            } else {
/* 223 */                       io11OiO1 = this;
                            }
/* 227 */                   oOliO0.skip(jI00000oIO2 + 1);
                        } else {
/* 235 */                   io11OiO1 = this;
                        }
/* 237 */               if (z) {
/* 239 */                   oOliO0.I00100o1O0lo(j3);
/* 256 */                   I00000oIO(oOliO0.I00iiI.I00OIl(), (short) crc32.getValue(), "FHCRC");
/* 259 */                   crc32.reset();
                        }
/* 262 */               io11OiO1.I00iOIl = (byte) 1;
/* 264 */               b = 1;
                    } else {
/* 266 */               j2 = 0;
                    }
/* 269 */           if (b == 1) {
/* 271 */               long j4 = iII1o0lOio0.I00iiI;
/* 275 */               long j5 = io11OiO1.I00iio.read(iII1o0lOio0, j);
/* 281 */               if (j5 != -1) {
/* 284 */                   io11OiO1.I0000Il00O(iII1o0lOio0, j4, j5);
/* 287 */                   return j5;
                        }
/* 288 */               io11OiO1.I00iOIl = (byte) 2;
/* 290 */               b = 2;
                    }
/* 291 */           if (b == 2) {
/* 304 */               I00000oIO(oOliO0.I000O01llI0(), (int) crc32.getValue(), "CRC");
/* 320 */               I00000oIO(oOliO0.I000O01llI0(), (int) io11OiO1.I00iiO.getBytesWritten(), "ISIZE");
/* 324 */               io11OiO1.I00iOIl = (byte) 3;
/* 330 */               if (!oOliO0.I00II0Ol1O0l()) {
/* 335 */                   IioIoO10iOiI.I000OOo1O("gzip finished without exhausting source");
/* 338 */                   return j2;
                        }
                    }
/* 25 */            return -1L;
                }

                @Override
                public final Oo11IoI timeout() {
/* 5 */             return this.I00iiI.I00iOIl.timeout();
                }
            }

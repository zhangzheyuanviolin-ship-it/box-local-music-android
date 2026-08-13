            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            import java.util.zip.DataFormatException;
            import java.util.zip.Inflater;
            
            public final class IolIiOl implements OlI1ii {
                public OOliO0 I00iOIl;
                public Inflater I00iiI;
                public int I00iiO;
                public boolean I00iio;

                @Override
                public final void close() throws IOException {
/* 3 */             if (this.I00iio) {
/* 5 */                 return;
                    }
/* 8 */             this.I00iiI.end();
/* 12 */            this.I00iio = true;
/* 16 */            this.I00iOIl.close();
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws DataFormatException, IOException {
                    long j2;
/* 5 */             while (j >= 0) {
/* 9 */                 if (this.I00iio) {
/* 167 */                   I000II.I001IO000("closed");
/* 1 */                     return 0L;
                        }
/* 11 */                OOliO0 oOliO0 = this.I00iOIl;
/* 13 */                Inflater inflater = this.I00iiI;
/* 15 */                if (j == 0) {
/* 17 */                    j2 = 0;
                        } else {
                            try {
/* 20 */                        Oii1OOIOo oii1OOIOoI00iiI = iII1o0lOio0.I00iiI(1);
/* 33 */                        int iMin = (int) Math.min(j, 8192 - oii1OOIOoI00iiI.I0000Il00O);
/* 38 */                        if (inflater.needsInput() && !oOliO0.I00II0Ol1O0l()) {
/* 50 */                            Oii1OOIOo oii1OOIOo = oOliO0.I00iiI.I00iOIl;
/* 52 */                            int i = oii1OOIOo.I0000Il00O;
/* 54 */                            int i2 = oii1OOIOo.I00000oOI;
/* 56 */                            int i3 = i - i2;
/* 57 */                            this.I00iiO = i3;
/* 61 */                            inflater.setInput(oii1OOIOo.I00000oIO, i2, i3);
                                }
/* 68 */                        int iInflate = inflater.inflate(oii1OOIOoI00iiI.I00000oIO, oii1OOIOoI00iiI.I0000Il00O, iMin);
/* 72 */                        int i4 = this.I00iiO;
/* 74 */                        if (i4 != 0) {
/* 81 */                            int remaining = i4 - inflater.getRemaining();
                                    this.I00iiO -= remaining;
/* 88 */                            oOliO0.skip(remaining);
                                }
/* 91 */                        if (iInflate > 0) {
                                    oii1OOIOoI00iiI.I0000Il00O += iInflate;
                                    j2 = iInflate;
                                    iII1o0lOio0.I00iiI += j2;
                                } else {
/* 109 */                           if (oii1OOIOoI00iiI.I00000oOI == oii1OOIOoI00iiI.I0000Il00O) {
/* 115 */                               iII1o0lOio0.I00iOIl = oii1OOIOoI00iiI.I00000oIO();
/* 117 */                               Oii1iI10.I00000oIO(oii1OOIOoI00iiI);
                                    }
/* 17 */                            j2 = 0;
                                }
                            } catch (DataFormatException e) {
/* 164 */                       throw new IOException(e);
                            }
                        }
/* 123 */               if (j2 > 0) {
/* 125 */                   return j2;
                        }
/* 130 */               if (inflater.finished() || inflater.needsDictionary()) {
/* 155 */                   return -1L;
                        }
/* 143 */               if (oOliO0.I00II0Ol1O0l()) {
/* 154 */                   throw new EOFException("source exhausted prematurely");
                        }
                    }
/* 177 */           I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 1 */             return 0L;
                }

                @Override
                public final Oo11IoI timeout() {
/* 5 */             return this.I00iOIl.I00iOIl.timeout();
                }
            }

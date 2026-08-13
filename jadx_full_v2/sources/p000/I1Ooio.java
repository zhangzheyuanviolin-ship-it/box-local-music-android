            package p000;

            import java.io.IOException;
            import java.io.OutputStream;
            
/* 10 */    public final class I1Ooio implements Ol0i0olI {
                public final int I00iOIl = 0;
                public Object I00iiI;
                public Object I00iiO;

                public I1Ooio(OutputStream outputStream, Oo11IoI oo11IoI) {
/* 7 */             this.I00iiI = outputStream;
/* 9 */             this.I00iiO = oo11IoI;
                }

                @Override
                public final void close() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    Ol1oloO1llI ol1oloO1llI = (Ol1oloO1llI) this.I00iiI;
/* 20 */                    I1Ooio i1Ooio = (I1Ooio) this.I00iiO;
/* 22 */                    ol1oloO1llI.I000O01llI0();
                            try {
/* 25 */                        i1Ooio.close();
/* 32 */                        if (ol1oloO1llI.I000OOo1O()) {
/* 40 */                            throw ol1oloO1llI.I000iOII(null);
                                }
/* 34 */                        return;
                            } catch (IOException e) {
/* 48 */                        if (!ol1oloO1llI.I000OOo1O()) {
/* 55 */                            throw e;
                                }
/* 55 */                        throw ol1oloO1llI.I000iOII(e);
                            } finally {
/* 56 */                        ol1oloO1llI.I000OOo1O();
                            }
                        default:
/* 10 */                    ((OutputStream) this.I00iiI).close();
/* 13 */                    return;
                    }
                }

                @Override
                public final void flush() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    Ol1oloO1llI ol1oloO1llI = (Ol1oloO1llI) this.I00iiI;
/* 20 */                    I1Ooio i1Ooio = (I1Ooio) this.I00iiO;
/* 22 */                    ol1oloO1llI.I000O01llI0();
                            try {
/* 25 */                        i1Ooio.flush();
/* 32 */                        if (ol1oloO1llI.I000OOo1O()) {
/* 40 */                            throw ol1oloO1llI.I000iOII(null);
                                }
/* 34 */                        return;
                            } catch (IOException e) {
/* 48 */                        if (!ol1oloO1llI.I000OOo1O()) {
/* 55 */                            throw e;
                                }
/* 55 */                        throw ol1oloO1llI.I000iOII(e);
                            } finally {
/* 56 */                        ol1oloO1llI.I000OOo1O();
                            }
                        default:
/* 10 */                    ((OutputStream) this.I00iiI).flush();
/* 13 */                    return;
                    }
                }

                @Override
                public final Oo11IoI timeout() {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    return (Ol1oloO1llI) this.I00iiI;
                        default:
/* 8 */                     return (Oo11IoI) this.I00iiO;
                    }
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    return "AsyncTimeout.sink(" + ((I1Ooio) this.I00iiO) + ')';
                        default:
/* 25 */                    return "sink(" + ((OutputStream) this.I00iiI) + ')';
                    }
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
                    long j2;
                    switch (this.I00iOIl) {
                        case 0:
/* 87 */                    iO1oO1OoOoii.I00000oOI(iII1o0lOio0.I00iiI, 0L, j);
/* 94 */                    for (long j3 = j; j3 > 0; j3 -= j2) {
/* 96 */                        Oii1OOIOo oii1OOIOo = iII1o0lOio0.I00iOIl;
/* 98 */                        j2 = 0;
                                while (true) {
/* 104 */                           if (j2 < 65536) {
/* 112 */                               j2 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 115 */                               if (j2 >= j3) {
/* 117 */                                   j2 = j3;
                                        } else {
/* 119 */                                   oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
                                        }
                                    }
                                }
/* 124 */                       Ol1oloO1llI ol1oloO1llI = (Ol1oloO1llI) this.I00iiI;
/* 128 */                       I1Ooio i1Ooio = (I1Ooio) this.I00iiO;
/* 130 */                       ol1oloO1llI.I000O01llI0();
                                try {
                                    try {
/* 133 */                               i1Ooio.write(iII1o0lOio0, j2);
/* 140 */                               if (ol1oloO1llI.I000OOo1O()) {
/* 149 */                                   throw ol1oloO1llI.I000iOII(null);
                                        }
                                    } catch (IOException e) {
/* 159 */                               if (!ol1oloO1llI.I000OOo1O()) {
/* 166 */                                   throw e;
                                        }
/* 166 */                               throw ol1oloO1llI.I000iOII(e);
                                    }
                                } catch (Throwable th) {
/* 167 */                           ol1oloO1llI.I000OOo1O();
/* 170 */                           throw th;
                                }
                            }
/* 171 */                   return;
                        default:
/* 14 */                    iO1oO1OoOoii.I00000oOI(iII1o0lOio0.I00iiI, 0L, j);
/* 17 */                    long j4 = j;
/* 21 */                    while (j4 > 0) {
/* 27 */                        ((Oo11IoI) this.I00iiO).I0001Ioi1lo();
/* 30 */                        Oii1OOIOo oii1OOIOo2 = iII1o0lOio0.I00iOIl;
/* 42 */                        int iMin = (int) Math.min(j4, oii1OOIOo2.I0000Il00O - oii1OOIOo2.I00000oOI);
/* 51 */                        ((OutputStream) this.I00iiI).write(oii1OOIOo2.I00000oIO, oii1OOIOo2.I00000oOI, iMin);
/* 56 */                        int i = oii1OOIOo2.I00000oOI + iMin;
/* 57 */                        oii1OOIOo2.I00000oOI = i;
                                long j5 = iMin;
/* 60 */                        j4 -= j5;
                                iII1o0lOio0.I00iiI -= j5;
/* 68 */                        if (i == oii1OOIOo2.I0000Il00O) {
/* 74 */                            iII1o0lOio0.I00iOIl = oii1OOIOo2.I00000oIO();
/* 76 */                            Oii1iI10.I00000oIO(oii1OOIOo2);
                                }
                            }
/* 80 */                    return;
                    }
                }

/* 11 */        public I1Ooio() {
                }
            }

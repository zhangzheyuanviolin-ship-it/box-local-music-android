            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.util.logging.Logger;
            
/* 10 */    public final class I1Ool00Il implements OlI1ii {
                public final int I00iOIl = 0;
                public Object I00iiI;
                public Object I00iiO;

                public I1Ool00Il(InputStream inputStream, Oo11IoI oo11IoI) {
/* 7 */             this.I00iiI = inputStream;
/* 9 */             this.I00iiO = oo11IoI;
                }

                @Override
                public final void close() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    Ol1oloO1llI ol1oloO1llI = (Ol1oloO1llI) this.I00iiI;
/* 20 */                    I1Ool00Il i1Ool00Il = (I1Ool00Il) this.I00iiO;
/* 22 */                    ol1oloO1llI.I000O01llI0();
                            try {
/* 25 */                        i1Ool00Il.close();
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
/* 10 */                    ((InputStream) this.I00iiI).close();
/* 13 */                    return;
                    }
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 125 */                   Ol1oloO1llI ol1oloO1llI = (Ol1oloO1llI) this.I00iiI;
/* 129 */                   I1Ool00Il i1Ool00Il = (I1Ool00Il) this.I00iiO;
/* 131 */                   ol1oloO1llI.I000O01llI0();
                            try {
/* 134 */                       long j2 = i1Ool00Il.read(iII1o0lOio0, j);
/* 142 */                       if (ol1oloO1llI.I000OOo1O()) {
/* 150 */                           throw ol1oloO1llI.I000iOII(null);
                                }
/* 144 */                       return j2;
                            } catch (IOException e) {
/* 158 */                       if (ol1oloO1llI.I000OOo1O()) {
/* 165 */                           throw ol1oloO1llI.I000iOII(e);
                                }
/* 165 */                       throw e;
                            } finally {
/* 166 */                       ol1oloO1llI.I000OOo1O();
                            }
                        default:
/* 10 */                    if (j == 0) {
/* 6 */                         return 0L;
                            }
/* 13 */                    if (j < 0) {
/* 119 */                       I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 6 */                         return 0L;
                            }
                            try {
/* 19 */                        ((Oo11IoI) this.I00iiO).I0001Ioi1lo();
/* 23 */                        Oii1OOIOo oii1OOIOoI00iiI = iII1o0lOio0.I00iiI(1);
/* 45 */                        int i = ((InputStream) this.I00iiI).read(oii1OOIOoI00iiI.I00000oIO, oii1OOIOoI00iiI.I0000Il00O, (int) Math.min(j, 8192 - oii1OOIOoI00iiI.I0000Il00O));
/* 50 */                        if (i == -1) {
/* 56 */                            if (oii1OOIOoI00iiI.I00000oOI == oii1OOIOoI00iiI.I0000Il00O) {
/* 62 */                                iII1o0lOio0.I00iOIl = oii1OOIOoI00iiI.I00000oIO();
/* 64 */                                Oii1iI10.I00000oIO(oii1OOIOoI00iiI);
                                    }
/* 67 */                            return -1L;
                                }
                                oii1OOIOoI00iiI.I0000Il00O += i;
                                long j3 = i;
                                iII1o0lOio0.I00iiI += j3;
/* 122 */                       return j3;
                            } catch (AssertionError e2) {
/* 83 */                        Logger logger = i0I1O1oilI1.I00000oIO;
/* 89 */                        if (e2.getCause() != null) {
/* 91 */                            String message = e2.getMessage();
/* 104 */                           if (message != null ? OlOoOIi0o.I000oI1ioi(message, "getsockname failed", false) : false) {
/* 111 */                               throw new IOException(e2);
                                    }
                                }
/* 112 */                       throw e2;
                            }
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
/* 47 */                    return "AsyncTimeout.source(" + ((I1Ool00Il) this.I00iiO) + ')';
                        default:
/* 25 */                    return "source(" + ((InputStream) this.I00iiI) + ')';
                    }
                }

/* 11 */        public I1Ool00Il() {
                }
            }

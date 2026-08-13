            package p000;

            import java.io.IOException;
            import java.io.InterruptedIOException;
            
            public final class IoIOlili01I implements OlI1ii {
                public long I00iOIl;
                public boolean I00iiI;
                public III1o0lOio0 I00iiO;
                public III1o0lOio0 I00iio;
                public boolean I00ilI0I1;
                public IoIi1I11l11 I00ilO0;

                @Override
                public final void close() {
                    long j;
/* 1 */             IoIi1I11l11 ioIi1I11l11 = this.I00ilO0;
                    synchronized (ioIi1I11l11) {
/* 5 */                 this.I00ilI0I1 = true;
/* 7 */                 III1o0lOio0 iII1o0lOio0 = this.I00iio;
/* 9 */                 j = iII1o0lOio0.I00iiI;
/* 11 */                iII1o0lOio0.I00000oIO();
/* 14 */                ioIi1I11l11.notifyAll();
                    }
/* 22 */            if (j > 0) {
/* 24 */                IoIi1I11l11 ioIi1I11l112 = this.I00ilO0;
/* 26 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 30 */                ioIi1I11l112.I00000oOI.I000l1(j);
                    }
/* 35 */            this.I00ilO0.I00000oIO();
                }

                /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[LOOP:0: B:4:0x000a->B:47:0x0096, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x009a A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws Throwable {
                    int i;
                    Throwable olOO0IOl0i1;
                    boolean z;
                    long j2;
                    long j3;
/* 5 */             long j4 = 0;
/* 9 */             if (j < 0) {
/* 193 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 5 */                 return 0L;
                    }
                    while (true) {
/* 11 */                IoIi1I11l11 ioIi1I11l11 = this.I00ilO0;
                        synchronized (ioIi1I11l11) {
/* 16 */                    ioIi1I11l11.I000iOII.I000O01llI0();
                            try {
                                synchronized (ioIi1I11l11) {
/* 20 */                            i = ioIi1I11l11.I000lI;
                                }
/* 149 */                       if (z) {
/* 157 */                           if (j3 != -1) {
/* 159 */                               return j3;
                                    }
/* 160 */                           if (olOO0IOl0i1 == null) {
/* 60 */                                return -1L;
                                    }
/* 163 */                           throw olOO0IOl0i1;
                                }
/* 151 */                       j4 = j2;
                            } finally {
/* 179 */                       ioIi1I11l11.I000iOII.I000iOII();
                            }
                        }
/* 23 */                if (i != 0 && !this.I00iiI) {
/* 29 */                    olOO0IOl0i1 = ioIi1I11l11.I000o00OoI0I;
/* 31 */                    if (olOO0IOl0i1 == null) {
                                synchronized (ioIi1I11l11) {
/* 39 */                            olOO0IOl0i1 = new OlOO0IOl0i1(ioIi1I11l11.I000lI);
                                }
                            }
                        }
/* 49 */                olOO0IOl0i1 = null;
/* 52 */                if (this.I00ilI0I1) {
/* 173 */                   throw new IOException("stream closed");
                        }
/* 54 */                III1o0lOio0 iII1o0lOio02 = this.I00iio;
/* 56 */                long j5 = iII1o0lOio02.I00iiI;
/* 62 */                z = false;
/* 63 */                if (j5 > j4) {
/* 71 */                    j3 = iII1o0lOio02.read(iII1o0lOio0, Math.min(j, j5));
/* 77 */                    long j6 = ioIi1I11l11.I0000Il00O + j3;
/* 78 */                    ioIi1I11l11.I0000Il00O = j6;
/* 80 */                    j2 = j4;
/* 84 */                    long j7 = j6 - ioIi1I11l11.I0000O;
/* 85 */                    if (olOO0IOl0i1 == null && j7 >= ioIi1I11l11.I00000oOI.I00o0l1o1o0.I00000oIO() / 2) {
/* 106 */                       ioIi1I11l11.I00000oOI.I001l0I00(ioIi1I11l11.I00000oIO, j7);
/* 111 */                       ioIi1I11l11.I0000O = ioIi1I11l11.I0000Il00O;
                            }
                        } else {
/* 116 */                   j2 = j4;
/* 120 */                   if (!this.I00iiI && olOO0IOl0i1 == null) {
                                try {
/* 124 */                           ioIi1I11l11.wait();
/* 127 */                           z = true;
                                } catch (InterruptedException unused) {
/* 134 */                           Thread.currentThread().interrupt();
/* 142 */                           throw new InterruptedIOException();
                                }
                            }
/* 128 */                   j3 = -1;
                        }
/* 149 */               if (z) {
                        }
                    }
                }

                @Override
                public final Oo11IoI timeout() {
/* 3 */             return this.I00ilO0.I000iOII;
                }
            }

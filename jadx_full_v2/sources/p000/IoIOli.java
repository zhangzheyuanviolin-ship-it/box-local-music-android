            package p000;

            import java.io.InterruptedIOException;
            
            public final class IoIOli implements Ol0i0olI {
                public boolean I00iOIl;
                public III1o0lOio0 I00iiI;
                public boolean I00iiO;
                public IoIi1I11l11 I00iio;

                /* JADX WARN: Finally extract failed */
                public final void I00000oIO(boolean z) {
                    long jMin;
                    boolean z2;
/* 1 */             IoIi1I11l11 ioIi1I11l11 = this.I00iio;
                    synchronized (ioIi1I11l11) {
/* 6 */                 ioIi1I11l11.I000l1.I000O01llI0();
/* 15 */                while (ioIi1I11l11.I0000oI00 >= ioIi1I11l11.I0001Ioi1lo && !this.I00iOIl && !this.I00iiO) {
                            try {
                                synchronized (ioIi1I11l11) {
/* 26 */                            int i = ioIi1I11l11.I000lI;
/* 29 */                            if (i != 0) {
                                        break;
                                    }
                                    try {
/* 31 */                                ioIi1I11l11.wait();
                                    } catch (InterruptedException unused) {
/* 39 */                                Thread.currentThread().interrupt();
/* 47 */                                throw new InterruptedIOException();
                                    }
                                }
                            } catch (Throwable th) {
/* 138 */                       ioIi1I11l11.I000l1.I000iOII();
/* 141 */                       throw th;
                            }
                        }
/* 57 */                ioIi1I11l11.I000l1.I000iOII();
/* 60 */                ioIi1I11l11.I00000oOI();
/* 72 */                jMin = Math.min(ioIi1I11l11.I0001Ioi1lo - ioIi1I11l11.I0000oI00, this.I00iiI.I00iiI);
                        ioIi1I11l11.I0000oI00 += jMin;
/* 97 */                z2 = z && jMin == this.I00iiI.I00iiI;
                    }
/* 104 */           this.I00iio.I000l1.I000O01llI0();
                    try {
/* 107 */               IoIi1I11l11 ioIi1I11l112 = this.I00iio;
/* 115 */               ioIi1I11l112.I00000oOI.I00100l0(ioIi1I11l112.I00000oIO, z2, this.I00iiI, jMin);
                    } finally {
/* 132 */               this.I00iio.I000l1.I000iOII();
                    }
                }

                @Override
                public final void close() {
                    boolean z;
/* 1 */             IoIi1I11l11 ioIi1I11l11 = this.I00iio;
/* 3 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (ioIi1I11l11) {
/* 8 */                 if (this.I00iiO) {
/* 11 */                    return;
                        }
                        synchronized (ioIi1I11l11) {
/* 21 */                    z = ioIi1I11l11.I000lI == 0;
                        }
/* 23 */                IoIi1I11l11 ioIi1I11l112 = this.I00iio;
/* 29 */                if (!ioIi1I11l112.I000OiO.I00iOIl) {
/* 39 */                    if (this.I00iiI.I00iiI > 0) {
/* 47 */                        while (this.I00iiI.I00iiI > 0) {
/* 49 */                            I00000oIO(true);
                                }
                            } else if (z) {
/* 63 */                        ioIi1I11l112.I00000oOI.I00100l0(ioIi1I11l112.I00000oIO, true, null, 0L);
                            }
                        }
                        synchronized (this.I00iio) {
/* 69 */                    this.I00iiO = true;
                        }
/* 76 */                this.I00iio.I00000oOI.flush();
/* 81 */                this.I00iio.I00000oIO();
                    }
                }

                @Override
                public final void flush() {
/* 1 */             IoIi1I11l11 ioIi1I11l11 = this.I00iio;
/* 3 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (ioIi1I11l11) {
/* 6 */                 ioIi1I11l11.I00000oOI();
                    }
/* 18 */            while (this.I00iiI.I00iiI > 0) {
/* 21 */                I00000oIO(false);
/* 28 */                this.I00iio.I00000oOI.flush();
                    }
                }

                @Override
                public final Oo11IoI timeout() {
/* 3 */             return this.I00iio.I000l1;
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) {
/* 1 */             III1o0lOio0 iII1o0lOio02 = this.I00iiI;
/* 3 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 5 */             iII1o0lOio02.write(iII1o0lOio0, j);
/* 14 */            while (iII1o0lOio02.I00iiI >= 16384) {
/* 17 */                I00000oIO(false);
                    }
                }
            }

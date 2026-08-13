            package p000;

            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
/* 27 */    public final class IoIOl0o0lo0 implements OlI1ii {
                public OOliO0 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
                    int i;
                    int iI000II;
/* 1 */             OOliO0 oOliO0 = this.I00iOIl;
/* 89 */            do {
/* 3 */                 int i2 = this.I00ilI0I1;
/* 7 */                 if (i2 == 0) {
/* 12 */                    oOliO0.skip(this.I00ilO0);
/* 16 */                    this.I00ilO0 = 0;
/* 22 */                    if ((this.I00iiO & 4) == 0) {
/* 25 */                        i = this.I00iio;
/* 27 */                        int iI0010o = OollIoI001lo.I0010o(oOliO0);
/* 31 */                        this.I00ilI0I1 = iI0010o;
/* 33 */                        this.I00iiI = iI0010o;
/* 39 */                        int i3 = oOliO0.readByte() & 255;
/* 47 */                        this.I00iiO = oOliO0.readByte() & 255;
/* 49 */                        Logger logger = IoIOl1.I00iio;
/* 57 */                        if (logger.isLoggable(Level.FINE)) {
/* 59 */                            IIOIIi1ilIO iIOIIi1ilIO = IoIO101IlO.I00000oIO;
/* 72 */                            logger.fine(IoIO101IlO.I00000oIO(true, this.I00iio, this.I00iiI, i3, this.I00iiO));
                                }
/* 82 */                        iI000II = oOliO0.I000II() & Integer.MAX_VALUE;
/* 83 */                        this.I00iio = iI000II;
/* 87 */                        if (i3 != 9) {
/* 122 */                           throw new IOException(i3 + " != TYPE_CONTINUATION");
                                }
                            }
                        } else {
/* 128 */                   long j2 = oOliO0.read(iII1o0lOio0, Math.min(j, i2));
/* 134 */                   if (j2 != -1) {
                                this.I00ilI0I1 -= (int) j2;
/* 551 */                       return j2;
                            }
                        }
/* 5 */                 return -1L;
/* 89 */            } while (iI000II == i);
/* 94 */            IioIoO10iOiI.I000OOo1O("TYPE_CONTINUATION streamId changed");
/* 97 */            return 0L;
                }

                @Override
                public final Oo11IoI timeout() {
/* 5 */             return this.I00iOIl.I00iOIl.timeout();
                }

                @Override
/* 28 */        public final void close() {
                }
            }

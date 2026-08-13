            package p000;

            import java.io.IOException;
            import java.net.ProtocolException;
            
            public final class Il111lI1l0 extends Ill010O1l1 {
                public final long I00iiI;
                public long I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;
                public boolean I00ilO0;
                public final IOI0oloi01 I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il111lI1l0(IOI0oloi01 iOI0oloi01, OlI1ii olI1ii, long j) {
/* 3 */             super(olI1ii);
/* 1 */             this.I00io1l = iOI0oloi01;
/* 6 */             this.I00iiI = j;
/* 9 */             this.I00iio = true;
/* 15 */            if (j == 0) {
/* 18 */                I00000oIO(null);
                    }
                }

                public final IOException I00000oIO(IOException iOException) {
/* 3 */             if (this.I00ilI0I1) {
/* 5 */                 return iOException;
                    }
/* 7 */             this.I00ilI0I1 = true;
/* 10 */            if (iOException == null && this.I00iio) {
/* 16 */                this.I00iio = false;
                    }
/* 20 */            return this.I00io1l.I00000oIO(true, false, iOException);
                }

                @Override
                public final void close() throws IOException {
/* 3 */             if (this.I00ilO0) {
/* 5 */                 return;
                    }
/* 7 */             this.I00ilO0 = true;
                    try {
/* 9 */                 super.close();
/* 13 */                I00000oIO(null);
                    } catch (IOException e) {
/* 29 */                throw I00000oIO(e);
                    }
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
/* 5 */             if (this.I00ilO0) {
/* 91 */                I000II.I001IO000("closed");
/* 94 */                return 0L;
                    }
                    try {
/* 9 */                 long j2 = this.I00iOIl.read(iII1o0lOio0, j);
/* 15 */                if (this.I00iio) {
/* 18 */                    this.I00iio = false;
                        }
/* 28 */                if (j2 == -1) {
/* 30 */                    I00000oIO(null);
/* 23 */                    return -1L;
                        }
/* 36 */                long j3 = this.I00iiO + j2;
/* 37 */                long j4 = this.I00iiI;
/* 41 */                if (j4 == -1 || j3 <= j4) {
/* 74 */                    this.I00iiO = j3;
/* 78 */                    if (j3 == j4) {
/* 80 */                        I00000oIO(null);
                            }
/* 83 */                    return j2;
                        }
/* 73 */                throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
                    } catch (IOException e) {
/* 88 */                throw I00000oIO(e);
                    }
                }
            }

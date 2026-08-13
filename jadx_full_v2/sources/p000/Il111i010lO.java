            package p000;

            import java.io.IOException;
            import java.net.ProtocolException;
            
            public final class Il111i010lO extends Ill00IiiOIiO {
                public final long I00iOIl;
                public boolean I00iiI;
                public long I00iiO;
                public boolean I00iio;
                public final IOI0oloi01 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il111i010lO(IOI0oloi01 iOI0oloi01, Ol0i0olI ol0i0olI, long j) {
/* 3 */             super(ol0i0olI);
/* 1 */             this.I00ilI0I1 = iOI0oloi01;
/* 6 */             this.I00iOIl = j;
                }

                public final IOException I00000oIO(IOException iOException) {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return iOException;
                    }
/* 7 */             this.I00iiI = true;
/* 12 */            return this.I00ilI0I1.I00000oIO(false, true, iOException);
                }

                @Override
                public final void close() throws IOException {
/* 3 */             if (this.I00iio) {
/* 5 */                 return;
                    }
/* 7 */             this.I00iio = true;
/* 11 */            long j = this.I00iOIl;
/* 15 */            if (j != -1 && this.I00iiO != j) {
/* 31 */                throw new ProtocolException("unexpected end of stream");
                    }
                    try {
/* 32 */                super.close();
/* 36 */                I00000oIO(null);
                    } catch (IOException e) {
/* 113 */               throw I00000oIO(e);
                    }
                }

                @Override
                public final void flush() throws IOException {
                    try {
/* 1 */                 super.flush();
                    } catch (IOException e) {
/* 29 */                throw I00000oIO(e);
                    }
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
/* 3 */             if (this.I00iio) {
/* 62 */                I000II.I001IO000("closed");
/* 89 */                return;
                    }
/* 7 */             long j2 = this.I00iOIl;
/* 11 */            if (j2 != -1 && this.I00iiO + j > j2) {
/* 27 */                StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j2, "expected ", " bytes but received ");
/* 34 */                sbI001iOo1i0O.append(this.I00iiO + j);
/* 44 */                throw new ProtocolException(sbI001iOo1i0O.toString());
                    }
                    try {
/* 45 */                super.write(iII1o0lOio0, j);
                        this.I00iiO += j;
                    } catch (IOException e) {
/* 59 */                throw I00000oIO(e);
                    }
                }
            }

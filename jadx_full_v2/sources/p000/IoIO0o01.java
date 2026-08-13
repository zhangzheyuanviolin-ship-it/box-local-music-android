            package p000;

            import java.io.IOException;
            
            public final class IoIO0o01 extends IoIIoI {
                public boolean I00iio;

                @Override
                public final void close() {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 8 */             if (!this.I00iio) {
/* 10 */                I00000oIO();
                    }
/* 14 */            this.I00iiI = true;
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
/* 5 */             if (j < 0) {
/* 46 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 1 */                 return 0L;
                    }
/* 9 */             if (this.I00iiI) {
/* 36 */                I000II.I001IO000("closed");
/* 1 */                 return 0L;
                    }
/* 15 */            if (this.I00iio) {
/* 13 */                return -1L;
                    }
/* 18 */            long j2 = super.read(iII1o0lOio0, j);
/* 24 */            if (j2 != -1) {
/* 33 */                return j2;
                    }
/* 27 */            this.I00iio = true;
/* 29 */            I00000oIO();
/* 13 */            return -1L;
                }
            }

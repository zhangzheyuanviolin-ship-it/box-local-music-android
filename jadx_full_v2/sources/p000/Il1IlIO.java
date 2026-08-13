            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
/* 24 */    public final class Il1IlIO extends Il1Iii0iO {
                public Il1IlIO(InputStream inputStream) {
/* 1 */             super(inputStream);
/* 8 */             if (inputStream.markSupported()) {
/* 15 */                this.I00iOIl.mark(Integer.MAX_VALUE);
                    } else {
/* 21 */                I000II.I000iOII("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
/* 29 */                throw null;
                    }
                }

                public final void I0000Il00O(long j) throws IOException {
/* 1 */             int i = this.I00iiI;
/* 6 */             if (i > j) {
/* 9 */                 this.I00iiI = 0;
/* 13 */                this.I00iOIl.reset();
                    } else {
/* 18 */                j -= i;
                    }
/* 20 */            I00000oIO((int) j);
                }

/* 25 */        public Il1IlIO(byte[] bArr) {
/* 26 */            super(bArr);
/* 27 */            this.I00iOIl.mark(Integer.MAX_VALUE);
                }
            }

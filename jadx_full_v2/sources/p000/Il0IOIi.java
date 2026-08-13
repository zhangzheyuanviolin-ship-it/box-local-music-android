            package p000;

            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.channels.FileChannel;
            
/* 6 */     public final class Il0IOIi extends FileInputStream {
                public InputStream I00iOIl;
                public Object I00iiI;

                @Override
                public final int available() {
/* 3 */             return this.I00iOIl.available();
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final FileChannel getChannel() {
/* 20 */            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
                }

                @Override
                public final void mark(int i) {
                    synchronized (this.I00iiI) {
/* 6 */                 this.I00iOIl.mark(i);
                    }
                }

                @Override
                public final boolean markSupported() {
/* 3 */             return this.I00iOIl.markSupported();
                }

                @Override
                public final int read() {
/* 3 */             return this.I00iOIl.read();
                }

                @Override
                public final void reset() {
                    synchronized (this.I00iiI) {
/* 6 */                 this.I00iOIl.reset();
                    }
                }

                @Override
                public final long skip(long j) {
/* 3 */             return this.I00iOIl.skip(j);
                }

                @Override
/* 7 */         public final int read(byte[] bArr) {
/* 8 */             return this.I00iOIl.read(bArr);
                }

                @Override
/* 8 */         public final int read(byte[] bArr, int i, int i2) {
/* 9 */             return this.I00iOIl.read(bArr, i, i2);
                }
            }

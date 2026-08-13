            package p000;

            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.nio.channels.FileChannel;
            
/* 5 */     public final class Il0IOO011iI extends FileOutputStream {
                public OutputStream I00iOIl;

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final void flush() throws IOException {
/* 3 */             this.I00iOIl.flush();
                }

                @Override
                public final FileChannel getChannel() {
/* 20 */            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
                }

                @Override
                public final void write(byte[] bArr) throws IOException {
/* 3 */             this.I00iOIl.write(bArr);
                }

                @Override
/* 6 */         public final void write(int i) throws IOException {
/* 7 */             this.I00iOIl.write(i);
                }

                @Override
/* 7 */         public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 8 */             this.I00iOIl.write(bArr, i, i2);
                }
            }

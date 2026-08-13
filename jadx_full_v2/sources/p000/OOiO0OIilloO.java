            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 6 */     public abstract class OOiO0OIilloO extends FilterInputStream {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOiO0OIilloO(InputStream inputStream, boolean z) {
/* 4 */             super(inputStream);
/* 2 */             this.I00iOIl = 0;
                }

                @Override
                public int available() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return super.available();
                }

                @Override
                public void close() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 10 */                    InputStream inputStream = ((FilterInputStream) this).in;
/* 12 */                    byte[] bArr = IoOlilOO.I00000oIO;
/* 14 */                    if (inputStream != null) {
/* 16 */                        inputStream.close();
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.close();
                            break;
                    }
                }

                @Override
                public synchronized void mark(int i) {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this) {
/* 13 */                        ((FilterInputStream) this).in.mark(i);
                            }
/* 17 */                    return;
                        default:
/* 6 */                     super.mark(i);
/* 9 */                     return;
                    }
                }

                @Override
                public boolean markSupported() {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    return ((FilterInputStream) this).in.markSupported();
                        default:
/* 6 */                     return super.markSupported();
                    }
                }

                @Override
                public int read(byte[] bArr) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    byte[] bArr2 = IoOlilOO.I00000oIO;
/* 17 */                    int i = ((FilterInputStream) this).in.read(bArr);
/* 21 */                    I00000oIO(i);
/* 24 */                    return i;
                        default:
/* 8 */                     return ((FilterInputStream) this).in.read(bArr);
                    }
                }

                @Override
                public synchronized void reset() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this) {
                                try {
/* 13 */                            ((FilterInputStream) this).in.reset();
                                } catch (IOException e) {
/* 21 */                            throw e;
                                }
                            }
/* 17 */                    return;
                        default:
/* 6 */                     super.reset();
/* 9 */                     return;
                    }
                }

                @Override
                public long skip(long j) {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    return ((FilterInputStream) this).in.skip(j);
                        default:
/* 6 */                     return super.skip(j);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 7 */         public OOiO0OIilloO(InputStream inputStream, int i) {
                    super(inputStream);
/* 8 */             this.I00iOIl = i;
                }

                @Override
/* 24 */        public int read() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    int i = ((FilterInputStream) this).in.read();
/* 26 */                    I00000oIO(i != -1 ? 1 : -1);
                            return i;
                        default:
                            return super.read();
                    }
                }

                @Override
/* 26 */        public int read(byte[] bArr, int i, int i2) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
/* 28 */                    I00000oIO(i3);
                            return i3;
                        default:
                            return super.read(bArr, i, i2);
                    }
                }

/* 48 */        public void I00000oIO(int i) {
                }
            }

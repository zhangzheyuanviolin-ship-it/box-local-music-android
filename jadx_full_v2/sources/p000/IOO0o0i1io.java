            package p000;

            import java.io.FileInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 7 */     public final class IOO0o0i1io extends OOiO0OIilloO {
                public final int I00iiI = 1;

                public IOO0o0i1io(InputStream inputStream) {
/* 5 */             super(inputStream, 0);
                }

                public static IOO0o0i1io I0000Il00O(FileInputStream fileInputStream) {
/* 4 */             return new IOO0o0i1io(fileInputStream, false);
                }

                @Override
                public synchronized void I00000oIO(int i) {
                    switch (this.I00iiI) {
                        case 1:
                            synchronized (this) {
                                break;
                            }
                    }
                }

                @Override
                public void close() throws IOException {
                    switch (this.I00iiI) {
                        case 0:
/* 12 */                    ((FilterInputStream) this).in = IOO1i01IIll.I00iOIl;
                            break;
                        default:
/* 6 */                     super.close();
                            break;
                    }
                }

                @Override
                public synchronized long skip(long j) {
                    long jSkip;
                    switch (this.I00iiI) {
                        case 1:
                            synchronized (this) {
/* 14 */                        jSkip = ((FilterInputStream) this).in.skip(j);
                            }
/* 19 */                    return jSkip;
                        default:
/* 6 */                     return super.skip(j);
                    }
                }

/* 8 */         public IOO0o0i1io(InputStream inputStream, boolean z) {
                    super(inputStream, z);
                }
            }

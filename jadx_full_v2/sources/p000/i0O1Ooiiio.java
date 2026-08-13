            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Enumeration;
            
/* 41 */    public final class i0O1Ooiiio extends InputStream {
                public Enumeration I00iOIl;
                public FileInputStream I00iiI;

                public final void I00000oIO() throws IOException {
/* 1 */             Enumeration enumeration = this.I00iOIl;
/* 3 */             FileInputStream fileInputStream = this.I00iiI;
/* 5 */             if (fileInputStream != null) {
/* 7 */                 fileInputStream.close();
                    }
/* 14 */            if (enumeration.hasMoreElements()) {
/* 27 */                this.I00iiI = new FileInputStream((File) enumeration.nextElement());
                    } else {
/* 31 */                this.I00iiI = null;
                    }
                }

                @Override
                public final void close() throws IOException {
/* 1 */             super.close();
/* 4 */             FileInputStream fileInputStream = this.I00iiI;
/* 6 */             if (fileInputStream != null) {
/* 8 */                 fileInputStream.close();
/* 12 */                this.I00iiI = null;
                    }
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 3 */             if (this.I00iiI == null) {
/* 36 */                return -1;
                    }
/* 6 */             bArr.getClass();
/* 10 */            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
/* 39 */                OoOil11Ol1o.I001i1lo1io();
/* 9 */                 return 0;
                    }
/* 18 */            if (i2 == 0) {
/* 9 */                 return 0;
                    }
/* 34 */            do {
/* 22 */                int i3 = this.I00iiI.read(bArr, i, i2);
/* 26 */                if (i3 > 0) {
/* 28 */                    return i3;
                        }
/* 29 */                I00000oIO();
/* 34 */            } while (this.I00iiI != null);
/* 36 */            return -1;
                }

                @Override
/* 42 */        public final int read() throws IOException {
                    while (true) {
/* 43 */                FileInputStream fileInputStream = this.I00iiI;
                        if (fileInputStream == null) {
                            return -1;
                        }
                        int i = fileInputStream.read();
                        if (i != -1) {
                            return i;
                        }
/* 44 */                I00000oIO();
                    }
                }
            }

            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.security.GeneralSecurityException;
            import java.util.Iterator;
            
/* 113 */   public final class Ioo000li1 extends InputStream {
                public boolean I00iOIl;
                public InputStream I00iiI;
                public InputStream I00iiO;
                public IOO000ilo I00iio;
                public byte[] I00ilI0I1;

                @Override
                public final synchronized int available() {
/* 2 */             InputStream inputStream = this.I00iiI;
/* 4 */             if (inputStream == null) {
/* 7 */                 return 0;
                    }
/* 9 */             return inputStream.available();
                }

                @Override
                public final synchronized void close() {
/* 4 */             this.I00iiO.close();
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override
                public final synchronized int read(byte[] bArr, int i, int i2) {
/* 3 */             if (i2 == 0) {
/* 2 */                 return 0;
                    }
/* 7 */             InputStream inputStream = this.I00iiI;
/* 9 */             if (inputStream != null) {
/* 11 */                return inputStream.read(bArr, i, i2);
                    }
/* 21 */            if (this.I00iOIl) {
/* 112 */               throw new IOException("No matching key found for the ciphertext in the stream.");
                    }
/* 24 */            this.I00iOIl = true;
/* 34 */            Iterator it = this.I00iio.I001i1lo1io(iIIl1o1Iiol.I00000oIO).iterator();
/* 42 */            while (it.hasNext()) {
                        try {
                            try {
/* 58 */                        InputStream inputStreamI00000oIO = ((OlOiOooOO1) ((OOIiiiO) it.next()).I00000oOI).I00000oIO(this.I00iiO, this.I00ilI0I1);
/* 62 */                        int i3 = inputStreamI00000oIO.read(bArr, i, i2);
/* 66 */                        if (i3 == 0) {
/* 84 */                            throw new IOException("Could not read bytes from the ciphertext stream");
                                }
/* 68 */                        this.I00iiI = inputStreamI00000oIO;
/* 72 */                        this.I00iiO.mark(0);
/* 76 */                        return i3;
                            } catch (IOException unused) {
/* 93 */                        this.I00iiO.reset();
                            }
                        } catch (GeneralSecurityException unused2) {
/* 87 */                    this.I00iiO.reset();
                        }
                    }
/* 104 */           throw new IOException("No matching key found for the ciphertext in the stream.");
                }

                @Override
/* 114 */       public final synchronized int read(byte[] bArr) {
/* 115 */           return read(bArr, 0, bArr.length);
                }

                @Override
/* 115 */       public final synchronized int read() {
/* 116 */           byte[] bArr = new byte[1];
/* 117 */           if (read(bArr) != 1) {
                        return -1;
                    }
/* 118 */           return bArr[0];
                }
            }

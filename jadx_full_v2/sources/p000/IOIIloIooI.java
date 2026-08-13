            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import javax.crypto.Cipher;
            
/* 27 */    public final class IOIIloIooI extends FilterInputStream {
                public final Cipher I00iOIl;
                public final byte[] I00iiI;
                public boolean I00iiO;
                public byte[] I00iio;
                public int I00ilI0I1;
                public int I00ilO0;

                public IOIIloIooI(ByteArrayInputStream byteArrayInputStream, Cipher cipher) {
/* 1 */             super(byteArrayInputStream);
/* 8 */             this.I00iiI = new byte[Barcode.FORMAT_UPC_A];
/* 11 */            this.I00iiO = false;
/* 13 */            this.I00iOIl = cipher;
                }

                public final byte[] I00000oIO() throws I00IlilI0i0i {
                    try {
/* 3 */                 if (this.I00iiO) {
/* 15 */                    return null;
                        }
/* 6 */                 this.I00iiO = true;
/* 10 */                return this.I00iOIl.doFinal();
                    } catch (GeneralSecurityException e) {
/* 23 */                I00IlilI0i0i i00IlilI0i0i = new I00IlilI0i0i("Error finalising cipher", 3);
/* 26 */                i00IlilI0i0i.I00iiI = e;
/* 28 */                VarHandle.storeStoreFence();
/* 113 */               throw i00IlilI0i0i;
                    }
                }

                public final int I0000Il00O() throws IOException {
/* 4 */             if (!this.I00iiO) {
/* 8 */                 this.I00ilO0 = 0;
/* 10 */                this.I00ilI0I1 = 0;
                        while (true) {
/* 12 */                    int i = this.I00ilI0I1;
/* 14 */                    if (i != 0) {
/* 113 */                       return i;
                            }
/* 20 */                    int i2 = ((FilterInputStream) this).in.read(this.I00iiI);
/* 24 */                    if (i2 == -1) {
/* 26 */                        byte[] bArrI00000oIO = I00000oIO();
/* 30 */                        this.I00iio = bArrI00000oIO;
/* 32 */                        if (bArrI00000oIO != null && bArrI00000oIO.length != 0) {
/* 38 */                            int length = bArrI00000oIO.length;
/* 39 */                            this.I00ilI0I1 = length;
/* 41 */                            return length;
                                }
                            } else {
/* 47 */                        byte[] bArrUpdate = this.I00iOIl.update(this.I00iiI, 0, i2);
/* 51 */                        this.I00iio = bArrUpdate;
/* 53 */                        if (bArrUpdate != null) {
/* 56 */                            this.I00ilI0I1 = bArrUpdate.length;
                                }
                            }
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final int available() {
/* 5 */             return this.I00ilI0I1 - this.I00ilO0;
                }

                @Override
                public final void close() throws I00IlilI0i0i {
                    try {
/* 3 */                 ((FilterInputStream) this).in.close();
/* 14 */                this.I00ilO0 = 0;
/* 16 */                this.I00ilI0I1 = 0;
                    } finally {
/* 22 */                if (!this.I00iiO) {
/* 24 */                    I00000oIO();
                        }
                    }
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 5 */             if (this.I00ilO0 >= this.I00ilI0I1 && I0000Il00O() < 0) {
/* 13 */                return -1;
                    }
/* 19 */            int iMin = Math.min(i2, available());
/* 27 */            System.arraycopy(this.I00iio, this.I00ilO0, bArr, i, iMin);
                    this.I00ilO0 += iMin;
/* 215 */           return iMin;
                }

                @Override
                public final long skip(long j) {
/* 5 */             if (j <= 0) {
/* 1 */                 return 0L;
                    }
/* 17 */            int iMin = (int) Math.min(j, available());
                    this.I00ilO0 += iMin;
/* 23 */            return iMin;
                }

                @Override
/* 28 */        public final void reset() {
                }

                @Override
/* 35 */        public final int read() {
/* 36 */            if (this.I00ilO0 >= this.I00ilI0I1 && I0000Il00O() < 0) {
                        return -1;
                    }
                    byte[] bArr = this.I00iio;
                    int i = this.I00ilO0;
                    this.I00ilO0 = i + 1;
                    return bArr[i] & 255;
                }

                @Override
/* 48 */        public final void mark(int i) {
                }
            }

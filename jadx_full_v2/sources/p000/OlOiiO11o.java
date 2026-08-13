            package p000;

            import java.io.FileOutputStream;
            import java.io.FilterOutputStream;
            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            
/* 108 */   public final class OlOiiO11o extends FilterOutputStream {
                public final OlOO10OII11 I00iOIl;
                public final int I00iiI;
                public final ByteBuffer I00iiO;
                public final ByteBuffer I00iio;
                public boolean I00ilI0I1;

                public OlOiiO11o(OIIoIO oIIoIO, FileOutputStream fileOutputStream, byte[] bArr) throws IOException {
/* 1 */             super(fileOutputStream);
/* 4 */             OlOO10OII11 olOO10OII11I000O01llI0 = oIIoIO.I000O01llI0(bArr);
/* 8 */             this.I00iOIl = olOO10OII11I000O01llI0;
/* 10 */            int iI0001Ioi1lo = oIIoIO.I0001Ioi1lo();
/* 14 */            this.I00iiI = iI0001Ioi1lo;
/* 16 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iI0001Ioi1lo);
/* 20 */            this.I00iiO = byteBufferAllocate;
/* 30 */            this.I00iio = ByteBuffer.allocate(oIIoIO.I0000O());
/* 37 */            byteBufferAllocate.limit(iI0001Ioi1lo - oIIoIO.I0000Il00O());
/* 40 */            ByteBuffer byteBufferI000OOo1O = olOO10OII11I000O01llI0.I000OOo1O();
/* 48 */            byte[] bArr2 = new byte[byteBufferI000OOo1O.remaining()];
/* 50 */            byteBufferI000OOo1O.get(bArr2);
/* 55 */            ((FilterOutputStream) this).out.write(bArr2);
/* 59 */            this.I00ilI0I1 = true;
                }

                @Override
                public final synchronized void close() {
/* 6 */             if (this.I00ilI0I1) {
                        try {
/* 12 */                    this.I00iiO.flip();
/* 17 */                    this.I00iio.clear();
/* 26 */                    this.I00iOIl.I000OiO(this.I00iiO, this.I00iio);
/* 31 */                    this.I00iio.flip();
/* 54 */                    ((FilterOutputStream) this).out.write(this.I00iio.array(), this.I00iio.position(), this.I00iio.remaining());
/* 58 */                    this.I00ilI0I1 = false;
/* 60 */                    super.close();
                        } catch (GeneralSecurityException e) {
/* 105 */                   throw new IOException("ptBuffer.remaining():" + this.I00iiO.remaining() + " ctBuffer.remaining():" + this.I00iio.remaining(), e);
                        }
                    }
                }

                @Override
                public final synchronized void write(byte[] bArr, int i, int i2) {
                    try {
/* 4 */                 if (!this.I00ilI0I1) {
/* 107 */                   throw new IOException("Trying to write to closed stream");
                        }
                        while (true) {
/* 8 */                     int iRemaining = this.I00iiO.remaining();
/* 12 */                    ByteBuffer byteBuffer = this.I00iiO;
/* 14 */                    if (i2 > iRemaining) {
/* 16 */                        int iRemaining2 = byteBuffer.remaining();
/* 20 */                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, iRemaining2);
/* 24 */                        i += iRemaining2;
/* 25 */                        i2 -= iRemaining2;
                                try {
/* 28 */                            this.I00iiO.flip();
/* 33 */                            this.I00iio.clear();
/* 42 */                            this.I00iOIl.I0001Ioi1lo(this.I00iiO, byteBufferWrap, this.I00iio);
/* 47 */                            this.I00iio.flip();
/* 70 */                            ((FilterOutputStream) this).out.write(this.I00iio.array(), this.I00iio.position(), this.I00iio.remaining());
/* 75 */                            this.I00iiO.clear();
/* 82 */                            this.I00iiO.limit(this.I00iiI);
                                } catch (GeneralSecurityException e) {
/* 94 */                            throw new IOException(e);
                                }
                            } else {
/* 95 */                        byteBuffer.put(bArr, i, i2);
                            }
                        }
                    } catch (Throwable th) {
/* 215 */               throw th;
                    }
                }

                @Override
/* 109 */       public final void write(byte[] bArr) {
/* 110 */           write(bArr, 0, bArr.length);
                }

                @Override
/* 110 */       public final void write(int i) {
/* 112 */           write(new byte[]{(byte) i}, 0, 1);
                }
            }

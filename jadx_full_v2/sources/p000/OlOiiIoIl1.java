            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            
/* 97 */    public final class OlOiiIoIl1 extends FilterInputStream {
                public final ByteBuffer I00iOIl;
                public final ByteBuffer I00iiI;
                public final int I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;
                public boolean I00ilO0;
                public boolean I00io1l;
                public final byte[] I00ioIO;
                public int I00l0I0l0lO1;
                public final OlOO0oIio01 I00l0OO0IO;
                public final int I00li1OI;
                public final int I00ll1;

                public OlOiiIoIl1(OIIoIO oIIoIO, InputStream inputStream, byte[] bArr) {
/* 1 */             super(inputStream);
/* 8 */             this.I00l0OO0IO = oIIoIO.I000II();
/* 14 */            this.I00iiO = oIIoIO.I0000oI00();
/* 21 */            this.I00ioIO = Arrays.copyOf(bArr, bArr.length);
/* 23 */            int iI0000O = oIIoIO.I0000O();
/* 27 */            this.I00li1OI = iI0000O;
/* 31 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iI0000O + 1);
/* 35 */            this.I00iOIl = byteBufferAllocate;
/* 38 */            byteBufferAllocate.limit(0);
/* 46 */            this.I00ll1 = iI0000O - oIIoIO.I0000Il00O();
/* 54 */            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(oIIoIO.I0001Ioi1lo() + 16);
/* 58 */            this.I00iiI = byteBufferAllocate2;
/* 60 */            byteBufferAllocate2.limit(0);
/* 63 */            this.I00iio = false;
/* 65 */            this.I00ilI0I1 = false;
/* 67 */            this.I00ilO0 = false;
/* 69 */            this.I00l0I0l0lO1 = 0;
/* 71 */            this.I00io1l = false;
                }

                public final void I00000oIO() throws IOException {
                    byte b;
/* 4 */             while (!this.I00ilI0I1 && this.I00iOIl.remaining() > 0) {
/* 34 */                int i = ((FilterInputStream) this).in.read(this.I00iOIl.array(), this.I00iOIl.position(), this.I00iOIl.remaining());
/* 38 */                if (i > 0) {
/* 40 */                    ByteBuffer byteBuffer = this.I00iOIl;
/* 47 */                    byteBuffer.position(byteBuffer.position() + i);
                        } else if (i == -1) {
/* 54 */                    this.I00ilI0I1 = true;
                        } else if (i == 0) {
/* 62 */                    IioIoO10iOiI.I000OOo1O("Could not read bytes from the ciphertext stream");
/* 65 */                    return;
                        }
                    }
/* 69 */            if (this.I00ilI0I1) {
/* 93 */                b = 0;
                    } else {
/* 71 */                ByteBuffer byteBuffer2 = this.I00iOIl;
/* 78 */                b = byteBuffer2.get(byteBuffer2.position() - 1);
/* 82 */                ByteBuffer byteBuffer3 = this.I00iOIl;
/* 89 */                byteBuffer3.position(byteBuffer3.position() - 1);
                    }
/* 96 */            this.I00iOIl.flip();
/* 101 */           this.I00iiI.clear();
                    try {
/* 114 */               this.I00l0OO0IO.I0001Ioi1lo(this.I00iOIl, this.I00l0I0l0lO1, this.I00ilI0I1, this.I00iiI);
                        this.I00l0I0l0lO1++;
/* 124 */               this.I00iiI.flip();
/* 129 */               this.I00iOIl.clear();
/* 134 */               if (this.I00ilI0I1) {
/* 154 */                   return;
                        }
/* 138 */               this.I00iOIl.clear();
/* 146 */               this.I00iOIl.limit(this.I00li1OI + 1);
/* 151 */               this.I00iOIl.put(b);
                    } catch (GeneralSecurityException e) {
/* 156 */               this.I00io1l = true;
/* 160 */               this.I00iiI.limit(0);
/* 541 */               throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.I00l0I0l0lO1 + " endOfCiphertext:" + this.I00ilI0I1, e);
                    }
                }

                public final void I0000Il00O() throws IOException {
/* 5 */             if (this.I00iio) {
/* 90 */                this.I00io1l = true;
/* 94 */                this.I00iiI.limit(0);
/* 99 */                IioIoO10iOiI.I000OOo1O("Decryption failed.");
/* 113 */               return;
                    }
/* 9 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.I00iiO);
/* 17 */            while (byteBufferAllocate.remaining() > 0) {
/* 33 */                int i = ((FilterInputStream) this).in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
/* 38 */                if (i == -1) {
/* 57 */                    this.I00io1l = true;
/* 61 */                    this.I00iiI.limit(0);
/* 66 */                    IioIoO10iOiI.I000OOo1O("Ciphertext is too short");
/* 69 */                    return;
                        } else {
/* 40 */                    if (i == 0) {
/* 53 */                        IioIoO10iOiI.I000OOo1O("Could not read bytes from the ciphertext stream");
/* 56 */                        return;
                            }
/* 47 */                    byteBufferAllocate.position(byteBufferAllocate.position() + i);
                        }
                    }
/* 70 */            byteBufferAllocate.flip();
                    try {
/* 77 */                this.I00l0OO0IO.I0000O(byteBufferAllocate, this.I00ioIO);
/* 80 */                this.I00iio = true;
                    } catch (GeneralSecurityException e) {
/* 89 */                throw new IOException(e);
                    }
                }

                @Override
                public final synchronized int available() {
/* 4 */             return this.I00iiI.remaining();
                }

                @Override
                public final synchronized void close() {
/* 2 */             super.close();
                }

                @Override
                public final synchronized void mark(int i) {
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override
                public final synchronized int read(byte[] bArr, int i, int i2) {
                    try {
/* 4 */                 if (this.I00io1l) {
/* 96 */                    throw new IOException("Decryption failed.");
                        }
/* 9 */                 if (!this.I00iio) {
/* 11 */                    I0000Il00O();
/* 16 */                    this.I00iOIl.clear();
/* 24 */                    this.I00iOIl.limit(this.I00ll1 + 1);
                        }
/* 33 */                if (this.I00ilO0) {
/* 32 */                    return -1;
                        }
/* 37 */                int i3 = 0;
                        while (true) {
/* 38 */                    if (i3 >= i2) {
                                break;
                            }
/* 46 */                    if (this.I00iiI.remaining() == 0) {
/* 50 */                        if (this.I00ilI0I1) {
/* 52 */                            this.I00ilO0 = true;
                                    break;
                                }
/* 55 */                        I00000oIO();
                            }
/* 66 */                    int iMin = Math.min(this.I00iiI.remaining(), i2 - i3);
/* 74 */                    this.I00iiI.get(bArr, i3 + i, iMin);
/* 77 */                    i3 += iMin;
                        }
/* 79 */                if (i3 == 0 && this.I00ilO0) {
/* 32 */                    return -1;
                        }
/* 88 */                return i3;
                    } catch (Throwable th) {
/* 215 */               throw th;
                    }
                }

                @Override
                public final long skip(long j) {
                    int i;
/* 1 */             long j2 = this.I00li1OI;
/* 8 */             if (j <= 0) {
/* 4 */                 return 0L;
                    }
/* 15 */            int iMin = (int) Math.min(j2, j);
/* 16 */            byte[] bArr = new byte[iMin];
/* 18 */            long j3 = j;
/* 21 */            while (j3 > 0 && (i = read(bArr, 0, (int) Math.min(iMin, j3))) > 0) {
/* 38 */                j3 -= i;
                    }
/* 40 */            return j - j3;
                }

                public final synchronized String toString() {
/* 120 */           return "StreamingAeadDecryptingStream\nsegmentNr:" + this.I00l0I0l0lO1 + "\nciphertextSegmentSize:" + this.I00li1OI + "\nheaderRead:" + this.I00iio + "\nendOfCiphertext:" + this.I00ilI0I1 + "\nendOfPlaintext:" + this.I00ilO0 + "\ndecryptionErrorOccured:" + this.I00io1l + "\nciphertextSgement position:" + this.I00iOIl.position() + " limit:" + this.I00iOIl.limit() + "\nplaintextSegment position:" + this.I00iiI.position() + " limit:" + this.I00iiI.limit();
                }

                @Override
/* 98 */        public final int read(byte[] bArr) {
/* 99 */            return read(bArr, 0, bArr.length);
                }

                @Override
/* 99 */        public final int read() throws IOException {
/* 100 */           byte[] bArr = new byte[1];
/* 101 */           int i = read(bArr, 0, 1);
                    if (i == 1) {
/* 102 */               return bArr[0] & 255;
                    }
                    if (i == -1) {
                        return i;
                    }
/* 103 */           IioIoO10iOiI.I000OOo1O("Reading failed");
                    return 0;
                }
            }

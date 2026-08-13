            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 213 */   public final class I001iOo1i0O extends FilterInputStream {
                public int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public byte[] I00iio;
                public byte[] I00ilI0I1;

                public I001iOo1i0O(InputStream inputStream) {
/* 1 */             super(inputStream);
/* 5 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = 0;
/* 9 */             this.I00iiO = false;
/* 14 */            this.I00iio = new byte[5];
/* 19 */            this.I00ilI0I1 = new byte[4];
                }

                @Override
                public final int available() {
/* 1 */             return 0;
                }

                @Override
                public final void close() throws IOException {
/* 2 */             this.I00iio = null;
/* 5 */             this.I00iiO = true;
/* 7 */             this.I00ilI0I1 = null;
/* 9 */             super.close();
                }

                @Override
                public final synchronized void mark(int i) {
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
                
                    r13 = r14.I00iio;
                    r13[r2] = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
                
                    if (r12 != 126) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
                
                    r13[r2] = 117;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
                
                    r4 = r2 - 1;
                    r14.I00iiI = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
                
                    if (r4 != 0) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
                
                    r14.I00iiO = true;
                    r14.I00iio = null;
                    r14.I00ilI0I1 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
                
                    return -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
                
                    if (r2 >= 5) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
                
                    r2 = r2 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
                
                    if (r2 >= 5) goto L80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
                
                    r14.I00iio[r2] = 117;
                    r2 = r2 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
                
                    r14.I00iiO = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
                
                    r1 = 0;
                    r4 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
                
                    if (r4 >= 5) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
                
                    r5 = (byte) (r14.I00iio[r4] - 33);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
                
                    if (r5 < 0) goto L82;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
                
                    if (r5 > 93) goto L83;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
                
                    r1 = (r1 * 85) + r5;
                    r4 = r4 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
                
                    r14.I00iiI = 0;
                    r14.I00iiO = true;
                    r14.I00iio = null;
                    r14.I00ilI0I1 = null;
                    p000.IioIoO10iOiI.I000OOo1O("Invalid data in Ascii85 stream");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
                
                    if (r10 < 0) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
                
                    r14.I00ilI0I1[r10] = (byte) (255 & r1);
                    r1 = r1 >>> 8;
                    r10 = r10 - 1;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int read() throws IOException {
/* 5 */             if (this.I00iOIl >= this.I00iiI) {
/* 10 */                if (this.I00iiO) {
/* 9 */                     return -1;
                        }
/* 14 */                this.I00iOIl = 0;
                        while (true) {
/* 22 */                    byte b = (byte) ((FilterInputStream) this).in.read();
/* 24 */                    if (b == -1) {
/* 26 */                        this.I00iiO = true;
/* 9 */                         return -1;
                            }
                            byte b2 = b;
/* 32 */                    if (b2 != 10 && b2 != 13 && b2 != 32) {
/* 45 */                        if (b2 == 126) {
/* 47 */                            this.I00iiO = true;
/* 49 */                            this.I00ilI0I1 = null;
/* 51 */                            this.I00iio = null;
/* 53 */                            this.I00iiI = 0;
/* 9 */                             return -1;
                                }
/* 58 */                        int i = 3;
/* 59 */                        if (b2 == 122) {
/* 61 */                            byte[] bArr = this.I00ilI0I1;
/* 63 */                            bArr[3] = 0;
/* 66 */                            bArr[2] = 0;
/* 68 */                            bArr[1] = 0;
/* 70 */                            bArr[0] = 0;
/* 73 */                            this.I00iiI = 4;
                                } else {
/* 79 */                            this.I00iio[0] = b2;
/* 81 */                            int i2 = 1;
                                    while (true) {
/* 85 */                                if (i2 >= 5) {
                                            break;
                                        }
                                        while (true) {
/* 93 */                                    byte b3 = (byte) ((FilterInputStream) this).in.read();
/* 94 */                                    if (b3 != -1) {
                                                byte b4 = b3;
/* 100 */                                       if (b4 != 10 && b4 != 13 && b4 != 32) {
                                                    break;
                                                }
                                            } else {
/* 96 */                                        this.I00iiO = true;
/* 9 */                                         return -1;
                                            }
                                        }
/* 115 */                               i2++;
                                    }
                                }
                            }
                        }
                    }
/* 202 */           byte[] bArr2 = this.I00ilI0I1;
/* 204 */           int i3 = this.I00iOIl;
/* 208 */           this.I00iOIl = i3 + 1;
/* 212 */           return bArr2[i3] & 255;
                }

                @Override
                public final synchronized void reset() {
/* 9 */             throw new IOException("Reset is not supported");
                }

                @Override
                public final long skip(long j) {
/* 1 */             return 0L;
                }

                @Override
/* 214 */       public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 215 */           if (this.I00iiO && this.I00iOIl >= this.I00iiI) {
                        return -1;
                    }
                    for (int i3 = 0; i3 < i2; i3++) {
/* 216 */               int i4 = this.I00iOIl;
                        if (i4 < this.I00iiI) {
/* 217 */                   byte[] bArr2 = this.I00ilI0I1;
                            this.I00iOIl = i4 + 1;
                            bArr[i3 + i] = bArr2[i4];
                        } else {
/* 218 */                   int i5 = read();
                            if (i5 == -1) {
                                return i3;
                            }
/* 219 */                   bArr[i3 + i] = (byte) i5;
                        }
                    }
                    return i2;
                }
            }

            package p000;

            import java.io.Closeable;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            
/* 8 */     public final class OOl1lI0oI extends OutputStream {
                public final int I00iOIl = 1;
                public Closeable I00iiI;

                public OOl1lI0oI(OiOOiIO1 oiOOiIO1) {
/* 7 */             this.I00iiI = oiOOiIO1;
                }

                @Override
                public void close() throws IOException {
                    switch (this.I00iOIl) {
                        case 1:
                            break;
                        default:
/* 6 */                     super.close();
                            break;
                    }
                }

                @Override
                public void flush() throws IOException {
                    switch (this.I00iOIl) {
                        case 1:
/* 14 */                    ((FileOutputStream) this.I00iiI).flush();
                            break;
                        default:
/* 6 */                     super.flush();
                            break;
                    }
                }

                @Override
                public final void write(int i) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    OiOOiIO1 oiOOiIO1 = (OiOOiIO1) this.I00iiI;
/* 18 */                    oiOOiIO1.I0000Il00O();
/* 22 */                    oiOOiIO1.I000II(true);
/* 25 */                    byte[] bArr = oiOOiIO1.I00ilO0;
/* 27 */                    int i2 = oiOOiIO1.I00io1l;
/* 29 */                    int i3 = i2 + 1;
/* 31 */                    oiOOiIO1.I00io1l = i3;
/* 34 */                    bArr[i2] = (byte) i;
/* 36 */                    oiOOiIO1.I00ioIO = true;
/* 41 */                    long j = oiOOiIO1.I00ilI0I1 + i3;
/* 46 */                    if (j > oiOOiIO1.I00iiO) {
/* 48 */                        oiOOiIO1.I00iiO = j;
                                break;
                            }
                            break;
                        default:
/* 10 */                    ((FileOutputStream) this.I00iiI).write(i);
                            break;
                    }
                }

/* 9 */         public OOl1lI0oI() {
                }

/* 28 */        private final void I00000oIO() {
                }

                @Override
/* 50 */        public final void write(byte[] bArr) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 52 */                    OiOOiIO1 oiOOiIO1 = (OiOOiIO1) this.I00iiI;
                            oiOOiIO1.getClass();
/* 53 */                    oiOOiIO1.write(bArr, 0, bArr.length);
                            break;
                        default:
/* 51 */                    ((FileOutputStream) this.I00iiI).write(bArr);
                            break;
                    }
                }

                @Override
/* 53 */        public final void write(byte[] bArr, int i, int i2) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 55 */                    ((OiOOiIO1) this.I00iiI).write(bArr, i, i2);
                            break;
                        default:
/* 54 */                    ((FileOutputStream) this.I00iiI).write(bArr, i, i2);
                            break;
                    }
                }
            }

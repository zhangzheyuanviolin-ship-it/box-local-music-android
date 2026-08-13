            package p000;

            import java.io.BufferedOutputStream;
            
            public final class Il0O0i extends BufferedOutputStream {
                public boolean I00iOIl;
                public boolean I00iiI;
                public int I00iiO;
                public boolean I00iio;

                @Override
                public final synchronized void flush() {
                    try {
/* 4 */                 if (this.I00iOIl && !this.I00iiI) {
/* 12 */                    write(13);
                            this.I00iiO++;
                        }
/* 25 */                this.I00iOIl = false;
/* 27 */                this.I00iiI = false;
/* 29 */                super.flush();
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                @Override
                public final synchronized void write(byte[] bArr, int i, int i2) {
                    try {
/* 10 */                if (this.I00iiO == 0 && i2 > 10) {
/* 14 */                    this.I00iio = false;
/* 17 */                    for (int i3 = 0; i3 < 10; i3++) {
/* 19 */                        byte b = bArr[i3];
/* 23 */                        if (b >= 9 && (b <= 10 || b >= 32 || b == 13)) {
                                }
/* 37 */                        this.I00iio = true;
                                break;
                            }
                        }
/* 44 */                if (this.I00iio) {
/* 48 */                    if (this.I00iOIl) {
/* 50 */                        this.I00iOIl = false;
/* 54 */                        if (!this.I00iiI && i2 == 1 && bArr[i] == 10) {
/* 63 */                            return;
                                } else {
/* 64 */                            write(13);
                                }
                            }
/* 69 */                    if (this.I00iiI) {
/* 71 */                        write(10);
/* 74 */                        this.I00iiI = false;
                            }
/* 76 */                    if (i2 > 0) {
/* 81 */                        byte b2 = bArr[(i + i2) - 1];
/* 83 */                        if (b2 == 13) {
/* 85 */                            this.I00iOIl = true;
                                    i2--;
                                } else if (b2 == 10) {
/* 92 */                            this.I00iiI = true;
                                    int i4 = i2 - 1;
/* 96 */                            if (i4 <= 0 || bArr[(i + i4) - 1] != 13) {
/* 110 */                               i2 = i4;
                                    } else {
/* 105 */                               this.I00iOIl = true;
                                        i2 -= 2;
                                    }
                                }
                            }
                        }
/* 111 */               super.write(bArr, i, i2);
                        this.I00iiO += i2;
                    } catch (Throwable th) {
/* 215 */               throw th;
                    }
                }
            }

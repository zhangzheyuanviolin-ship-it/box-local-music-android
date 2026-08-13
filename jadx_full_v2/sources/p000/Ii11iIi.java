            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            
/* 10 */    public class Ii11iIi {
                public final int I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;

                public Ii11iIi(byte[] bArr) {
/* 2 */             this.I00000oIO = 0;
/* 7 */             this.I0000Il00O = 0;
/* 9 */             this.I00000oOI = bArr;
                }

                public int I00000oIO(int i) throws EOFException {
                    int i2;
                    try {
/* 8 */                 i2 = this.I00000oOI[this.I0000Il00O + i] & 255;
                    } catch (RuntimeException unused) {
/* 11 */                i2 = -1;
                    }
/* 12 */            if (i2 >= 0) {
/* 14 */                return i2;
                    }
/* 15 */            I000II.I001i1O0Ol();
/* 18 */            return 0;
                }

                public int I00000oOI() {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000Il00O;
/* 7 */                 int i2 = bArr[i] & 255;
/* 11 */                this.I0000Il00O = i + 1;
/* 13 */                return i2;
                    } catch (RuntimeException unused) {
/* 14 */                return -1;
                    }
                }

                public void I0000Il00O() {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000Il00O;
/* 5 */                 byte b = bArr[i];
/* 9 */                 this.I0000Il00O = i + 1;
                    } catch (RuntimeException unused) {
                    }
                }

                public byte[] I0000O(int i) throws IOException {
/* 1 */             if (i < 0) {
/* 30 */                IioIoO10iOiI.I000OOo1O("length is negative");
/* 26 */                return null;
                    }
/* 3 */             byte[] bArr = this.I00000oOI;
/* 5 */             int length = bArr.length;
/* 6 */             int i2 = this.I0000Il00O;
/* 9 */             if (length - i2 < i) {
/* 23 */                I000II.I001i1O0Ol();
/* 26 */                return null;
                    }
/* 11 */            byte[] bArr2 = new byte[i];
/* 14 */            System.arraycopy(bArr, i2, bArr2, 0, i);
                    this.I0000Il00O += i;
/* 22 */            return bArr2;
                }

                public int I0000oI00() throws EOFException {
/* 1 */             int iI00000oOI = I00000oOI();
/* 5 */             int iI00000oOI2 = I00000oOI();
/* 9 */             int iI00000oOI3 = I00000oOI();
/* 13 */            int iI00000oOI4 = I00000oOI();
/* 21 */            if ((iI00000oOI | iI00000oOI2 | iI00000oOI3 | iI00000oOI4) >= 0) {
/* 31 */                return iI00000oOI4 | (iI00000oOI << 24) | (iI00000oOI2 << 16) | (iI00000oOI3 << 8);
                    }
/* 33 */            I000II.I001i1O0Ol();
/* 36 */            return 0;
                }

                public int I0001Ioi1lo() throws EOFException {
/* 1 */             int iI00000oOI = I00000oOI();
/* 5 */             if (iI00000oOI >= 0) {
/* 7 */                 return iI00000oOI;
                    }
/* 8 */             I000II.I001i1O0Ol();
/* 11 */            return 0;
                }

                public int I000II() throws EOFException {
/* 1 */             int iI00000oOI = I00000oOI();
/* 5 */             int iI00000oOI2 = I00000oOI();
/* 11 */            if ((iI00000oOI | iI00000oOI2) >= 0) {
/* 15 */                return iI00000oOI2 | (iI00000oOI << 8);
                    }
/* 17 */            I000II.I001i1O0Ol();
/* 20 */            return 0;
                }

                public void I000O01llI0(int i) {
                    switch (this.I00000oIO) {
                        case 1:
/* 52 */                    if (i == 0) {
/* 91 */                        I000OOo1O();
                                break;
                            } else if (i == 1) {
                                this.I0000Il00O += 8;
                                break;
                            } else if (i == 2) {
                                this.I0000Il00O += (int) I000OOo1O();
                                break;
                            } else if (i == 5) {
                                this.I0000Il00O += 4;
                                break;
                            } else {
/* 63 */                        this.I0000Il00O = this.I00000oOI.length;
                                break;
                            }
                        default:
/* 9 */                     if (i == 0) {
/* 48 */                        I000OOo1O();
                                break;
                            } else if (i == 1) {
                                this.I0000Il00O += 8;
                                break;
                            } else if (i == 2) {
                                this.I0000Il00O += (int) I000OOo1O();
                                break;
                            } else if (i == 5) {
                                this.I0000Il00O += 4;
                                break;
                            } else {
/* 20 */                        this.I0000Il00O = this.I00000oOI.length;
                                break;
                            }
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public long I000OOo1O() {
/* 5 */             long j = 0;
/* 7 */             int i = 0;
                    switch (this.I00000oIO) {
                        case 1:
                            while (true) {
/* 35 */                        byte[] bArr = this.I00000oOI;
/* 37 */                        int i2 = this.I0000Il00O;
/* 39 */                        byte b = bArr[i2];
/* 45 */                        this.I0000Il00O = i2 + 1;
/* 50 */                        j |= ((b & 255) & 127) << i;
/* 53 */                        if ((b & 128) == 0) {
                                    break;
                                } else {
/* 55 */                            i += 7;
                                }
                            }
                        default:
                            while (true) {
/* 11 */                        byte[] bArr2 = this.I00000oOI;
/* 13 */                        int i3 = this.I0000Il00O;
/* 15 */                        byte b2 = bArr2[i3];
/* 21 */                        this.I0000Il00O = i3 + 1;
/* 26 */                        j |= ((b2 & 255) & 127) << i;
/* 29 */                        if ((b2 & 128) == 0) {
                                    break;
                                } else {
/* 31 */                            i += 7;
                                }
                            }
                    }
/* 34 */            return j;
                }
            }

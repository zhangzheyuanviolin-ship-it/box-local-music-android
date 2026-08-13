            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
/* 67 */    public final class IOo10oOO extends InputStream {
                public final I00Ol00 I00iOIl;
                public boolean I00iiI = true;
                public int I00iiO = 0;
                public I00II0Ol1O0l I00iio;
                public InputStream I00ilI0I1;

                public IOo10oOO(I00Ol00 i00Ol00) {
/* 10 */            this.I00iOIl = i00Ol00;
                }

                public final I00II0Ol1O0l I00000oIO() throws IOException {
/* 1 */             I00Ol00 i00Ol00 = this.I00iOIl;
/* 7 */             int i = ((O0olI000) i00Ol00.I0000Il00O).read();
/* 16 */            I00IO1oi11O i00IO1oi11OI000iOII = i < 0 ? null : i00Ol00.I000iOII(i);
/* 20 */            if (i00IO1oi11OI000iOII == null) {
/* 11 */                return null;
                    }
/* 25 */            if (!(i00IO1oi11OI000iOII instanceof I00II0Ol1O0l)) {
/* 46 */                I000II.I00111O("unknown object encountered: ", i00IO1oi11OI000iOII.getClass());
/* 11 */                return null;
                    }
/* 29 */            if (this.I00iiO == 0) {
/* 31 */                return (I00II0Ol1O0l) i00IO1oi11OI000iOII;
                    }
/* 36 */            IioIoO10iOiI.I000OOo1O("only the last nested bitstring can have padding");
/* 11 */            return null;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 3 */             int i3 = 0;
/* 4 */             if (this.I00ilI0I1 == null) {
/* 8 */                 if (!this.I00iiI) {
/* 66 */                    return -1;
                        }
/* 11 */                I00II0Ol1O0l i00II0Ol1O0lI00000oIO = I00000oIO();
/* 15 */                this.I00iio = i00II0Ol1O0lI00000oIO;
/* 17 */                if (i00II0Ol1O0lI00000oIO == null) {
/* 66 */                    return -1;
                        }
/* 20 */                this.I00iiI = false;
/* 26 */                this.I00ilI0I1 = i00II0Ol1O0lI00000oIO.I0001Ioi1lo();
                    }
                    while (true) {
/* 34 */                int i4 = this.I00ilI0I1.read(bArr, i + i3, i2 - i3);
/* 38 */                if (i4 >= 0) {
/* 40 */                    i3 += i4;
/* 41 */                    if (i3 == i2) {
/* 43 */                        return i3;
                            }
                        } else {
/* 50 */                    this.I00iiO = this.I00iio.I000OOo1O();
/* 52 */                    I00II0Ol1O0l i00II0Ol1O0lI00000oIO2 = I00000oIO();
/* 56 */                    this.I00iio = i00II0Ol1O0lI00000oIO2;
/* 58 */                    if (i00II0Ol1O0lI00000oIO2 == null) {
/* 61 */                        this.I00ilI0I1 = null;
/* 64 */                        if (i3 < 1) {
/* 66 */                            return -1;
                                }
/* 215 */                       return i3;
                            }
/* 26 */                    this.I00ilI0I1 = i00II0Ol1O0lI00000oIO2.I0001Ioi1lo();
                        }
                    }
                }

                @Override
/* 68 */        public final int read() throws IOException {
/* 69 */            if (this.I00ilI0I1 == null) {
                        if (this.I00iiI) {
                            I00II0Ol1O0l i00II0Ol1O0lI00000oIO = I00000oIO();
                            this.I00iio = i00II0Ol1O0lI00000oIO;
                            if (i00II0Ol1O0lI00000oIO != null) {
                                this.I00iiI = false;
                                this.I00ilI0I1 = i00II0Ol1O0lI00000oIO.I0001Ioi1lo();
                            }
                        }
                        return -1;
                    }
                    while (true) {
                        int i = this.I00ilI0I1.read();
                        if (i >= 0) {
                            return i;
                        }
                        this.I00iiO = this.I00iio.I000OOo1O();
                        I00II0Ol1O0l i00II0Ol1O0lI00000oIO2 = I00000oIO();
                        this.I00iio = i00II0Ol1O0lI00000oIO2;
                        if (i00II0Ol1O0lI00000oIO2 == null) {
                            this.I00ilI0I1 = null;
                            return -1;
                        }
                        this.I00ilI0I1 = i00II0Ol1O0lI00000oIO2.I0001Ioi1lo();
                    }
                }
            }

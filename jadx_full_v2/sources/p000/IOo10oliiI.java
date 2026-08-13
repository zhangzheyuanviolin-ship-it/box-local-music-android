            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
/* 55 */    public final class IOo10oliiI extends InputStream {
                public final I00Ol00 I00iOIl;
                public boolean I00iiI = true;
                public InputStream I00iiO;

                public IOo10oliiI(I00Ol00 i00Ol00) {
/* 7 */             this.I00iOIl = i00Ol00;
                }

                public final I00O10llo I00000oIO() throws IOException {
/* 1 */             I00Ol00 i00Ol00 = this.I00iOIl;
/* 7 */             int i = ((O0olI000) i00Ol00.I0000Il00O).read();
/* 16 */            I00IO1oi11O i00IO1oi11OI000iOII = i < 0 ? null : i00Ol00.I000iOII(i);
/* 20 */            if (i00IO1oi11OI000iOII == null) {
/* 11 */                return null;
                    }
/* 25 */            if (i00IO1oi11OI000iOII instanceof I00O10llo) {
/* 27 */                return (I00O10llo) i00IO1oi11OI000iOII;
                    }
/* 36 */            I000II.I00111O("unknown object encountered: ", i00IO1oi11OI000iOII.getClass());
/* 11 */            return null;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
                    I00O10llo i00O10lloI00000oIO;
/* 3 */             int i3 = 0;
/* 4 */             if (this.I00iiO == null) {
/* 8 */                 if (!this.I00iiI || (i00O10lloI00000oIO = I00000oIO()) == null) {
/* 54 */                    return -1;
                        }
/* 18 */                this.I00iiI = false;
/* 24 */                this.I00iiO = i00O10lloI00000oIO.I00000oOI();
                    }
                    while (true) {
/* 32 */                int i4 = this.I00iiO.read(bArr, i + i3, i2 - i3);
/* 36 */                if (i4 >= 0) {
/* 38 */                    i3 += i4;
/* 39 */                    if (i3 == i2) {
/* 41 */                        return i3;
                            }
                        } else {
/* 42 */                    I00O10llo i00O10lloI00000oIO2 = I00000oIO();
/* 46 */                    if (i00O10lloI00000oIO2 == null) {
/* 49 */                        this.I00iiO = null;
/* 52 */                        if (i3 < 1) {
/* 54 */                            return -1;
                                }
/* 215 */                       return i3;
                            }
/* 24 */                    this.I00iiO = i00O10lloI00000oIO2.I00000oOI();
                        }
                    }
                }

                @Override
/* 56 */        public final int read() throws IOException {
                    I00O10llo i00O10lloI00000oIO;
/* 57 */            if (this.I00iiO == null) {
                        if (!this.I00iiI || (i00O10lloI00000oIO = I00000oIO()) == null) {
                            return -1;
                        }
                        this.I00iiI = false;
                        this.I00iiO = i00O10lloI00000oIO.I00000oOI();
                    }
                    while (true) {
                        int i = this.I00iiO.read();
                        if (i >= 0) {
                            return i;
                        }
                        I00O10llo i00O10lloI00000oIO2 = I00000oIO();
                        if (i00O10lloI00000oIO2 == null) {
                            this.I00iiO = null;
                            return -1;
                        }
                        this.I00iiO = i00O10lloI00000oIO2.I00000oOI();
                    }
                }
            }

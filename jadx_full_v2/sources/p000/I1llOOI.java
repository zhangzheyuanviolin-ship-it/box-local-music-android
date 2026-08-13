            package p000;

            import java.io.IOException;
            
/* 8 */     public final class I1llOOI implements I00IO1oi11O, IoiolIoO1I0O {
                public final int I00iOIl;
                public I00Ol00 I00iiI;

                public I1llOOI(I00Ol00 i00Ol00) {
/* 2 */             this.I00iOIl = 2;
/* 7 */             this.I00iiI = i00Ol00;
                }

                public static Ii0o0o0O00IO I00000oIO(I00Ol00 i00Ol00) throws I00IlilI0i0i {
                    try {
/* 11 */                return new Ii0o0o0O00IO(Ii10I0Ii.I00000oIO(i00Ol00.I001IO000()));
                    } catch (IllegalArgumentException e) {
/* 49 */                throw new I00IlilI0i0i(e.getMessage(), e, 0);
                    }
                }

                @Override
                public final I00OIO1 I0000O() {
                    switch (this.I00iOIl) {
                        case 0:
                            try {
/* 93 */                        return new I1llI1Iil(this.I00iiI.I001IO000());
                            } catch (IOException e) {
/* 103 */                       I000II.I001IO000(e.getMessage());
/* 3 */                         return null;
                            }
                        case 1:
                            try {
/* 70 */                        return new I1lli01ioi(this.I00iiI.I001IO000());
                            } catch (IOException e2) {
/* 84 */                        throw new I00OI1(e2.getMessage(), e2);
                            }
                        case 2:
                            try {
/* 41 */                        return I00000oIO(this.I00iiI);
                            } catch (IOException e3) {
/* 61 */                        throw new I00OI1("unable to get DER object", e3);
                            } catch (IllegalArgumentException e4) {
/* 55 */                        throw new I00OI1("unable to get DER object", e4);
                            }
                        case 3:
                            try {
/* 23 */                        return I000OiO();
                            } catch (IOException e5) {
/* 33 */                        I000II.I001IO000(e5.getMessage());
/* 3 */                         return null;
                            }
                        default:
                            try {
/* 7 */                         return I000OiO();
                            } catch (IOException e6) {
/* 22 */                        throw new I00OI1(e6.getMessage(), e6);
                            }
                    }
                }

                @Override
                public final I00OIO1 I000OiO() {
                    switch (this.I00iOIl) {
                        case 0:
/* 55 */                    return new I1llI1Iil(this.I00iiI.I001IO000());
                        case 1:
/* 43 */                    return new I1lli01ioi(this.I00iiI.I001IO000());
                        case 2:
/* 30 */                    return I00000oIO(this.I00iiI);
                        case 3:
/* 23 */                    return Ii10I0Ii.I00000oIO(this.I00iiI.I001IO000());
                        default:
/* 12 */                    return Ii10I0Ii.I00000oOI(this.I00iiI.I001IO000());
                    }
                }

/* 9 */         public I1llOOI(int i) {
/* 10 */            this.I00iOIl = i;
                }
            }

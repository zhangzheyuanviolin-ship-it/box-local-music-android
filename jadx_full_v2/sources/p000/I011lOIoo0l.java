            package p000;
            
            public final class I011lOIoo0l extends iO1olo1Ii {
                public final int I00000oIO;
                public O01lii I00000oOI;
                public String I0000Il00O;
                public Object I0000O;

                public I011lOIoo0l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final i1i0olI I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 15 */                    return this.I00000oOI.I00000oOI.I00000oOI;
                        default:
/* 8 */                     return (i1i0olI) this.I0000O;
                    }
                }

                @Override
                public void I000II(short s) {
                    switch (this.I00000oIO) {
                        case 1:
/* 18 */                    I00IO1(String.valueOf(s & 65535));
                            break;
                        default:
/* 6 */                     super.I000II(s);
                            break;
                    }
                }

                @Override
                public void I000OOo1O(byte b) {
                    switch (this.I00000oIO) {
                        case 1:
/* 16 */                    I00IO1(String.valueOf(b & 255));
                            break;
                        default:
/* 6 */                     super.I000OOo1O(b);
                            break;
                    }
                }

                @Override
                public void I001i1lo1io(int i) {
                    switch (this.I00000oIO) {
                        case 1:
/* 14 */                    I00IO1(Integer.toUnsignedString(i));
                            break;
                        default:
/* 6 */                     super.I001i1lo1io(i);
                            break;
                    }
                }

                @Override
                public void I001l0I00(long j) {
                    switch (this.I00000oIO) {
                        case 1:
/* 14 */                    I00IO1(Long.toUnsignedString(j));
                            break;
                        default:
/* 6 */                     super.I001l0I00(j);
                            break;
                    }
                }

                @Override
                public void I001lloI(String str) {
                    switch (this.I00000oIO) {
                        case 0:
/* 24 */                    this.I00000oOI.I00Io1lO(new O01i0Iiil(str, false, (OilOloI) this.I0000O), this.I0000Il00O);
                            break;
                        default:
/* 6 */                     super.I001lloI(str);
                            break;
                    }
                }

                public void I00IO1(String str) {
/* 12 */            this.I00000oOI.I00Io1lO(new O01i0Iiil(str, false, null), this.I0000Il00O);
                }
            }

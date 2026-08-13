            package p000;

            import java.nio.charset.Charset;
            import java.util.Iterator;
            
            public final class ioo11I extends il1oII0OlIo {
                public static final int[] I00ioIO = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
                public final int I00iiO;
                public final il1oII0OlIo I00iio;
                public final il1oII0OlIo I00ilI0I1;
                public final int I00ilO0;
                public final int I00io1l;

                public ioo11I(il1oII0OlIo il1oii0olio, il1oII0OlIo il1oii0olio2) {
/* 4 */             this.I00iio = il1oii0olio;
/* 6 */             this.I00ilI0I1 = il1oii0olio2;
/* 8 */             int iI0001Ioi1lo = il1oii0olio.I0001Ioi1lo();
/* 12 */            this.I00ilO0 = iI0001Ioi1lo;
/* 19 */            this.I00iiO = il1oii0olio2.I0001Ioi1lo() + iI0001Ioi1lo;
/* 35 */            this.I00io1l = Math.max(il1oii0olio.I000OiO(), il1oii0olio2.I000OiO()) + 1;
                }

                public static int I001lIiIIo1O(int i) {
/* 3 */             if (i >= 47) {
/* 5 */                 return Integer.MAX_VALUE;
                    }
/* 11 */            return I00ioIO[i];
                }

                @Override
                public final byte I00000oOI(int i) {
/* 3 */             il1oII0OlIo.I001iOo1i0O(i, this.I00iiO);
/* 6 */             return I0000O(i);
                }

                @Override
                public final byte I0000O(int i) {
/* 1 */             int i2 = this.I00ilO0;
                    return i < i2 ? this.I00iio.I0000O(i) : this.I00ilI0I1.I0000O(i - i2);
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final void I000OOo1O(int i, byte[] bArr, int i2, int i3) {
/* 1 */             int i4 = i + i3;
/* 3 */             il1oII0OlIo il1oii0olio = this.I00iio;
/* 5 */             int i5 = this.I00ilO0;
/* 7 */             if (i4 <= i5) {
/* 9 */                 il1oii0olio.I000OOo1O(i, bArr, i2, i3);
/* 12 */                return;
                    }
/* 13 */            il1oII0OlIo il1oii0olio2 = this.I00ilI0I1;
/* 15 */            if (i >= i5) {
/* 18 */                il1oii0olio2.I000OOo1O(i - i5, bArr, i2, i3);
/* 21 */                return;
                    }
/* 22 */            int i6 = i5 - i;
/* 23 */            il1oii0olio.I000OOo1O(i, bArr, i2, i6);
/* 29 */            il1oii0olio2.I000OOo1O(0, bArr, i2 + i6, i3 - i6);
                }

                @Override
                public final int I000OiO() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final boolean I000iOII() {
                    return this.I00iiO >= I001lIiIIo1O(this.I00io1l);
                }

                @Override
                public final int I000lI(int i, int i2, int i3) {
/* 1 */             int i4 = i2 + i3;
/* 3 */             il1oII0OlIo il1oii0olio = this.I00iio;
/* 5 */             int i5 = this.I00ilO0;
/* 7 */             if (i4 <= i5) {
/* 9 */                 return il1oii0olio.I000lI(i, i2, i3);
                    }
/* 14 */            il1oII0OlIo il1oii0olio2 = this.I00ilI0I1;
/* 16 */            if (i2 >= i5) {
/* 19 */                return il1oii0olio2.I000lI(i, i2 - i5, i3);
                    }
/* 24 */            int i6 = i5 - i2;
/* 31 */            return il1oii0olio2.I000lI(il1oii0olio.I000lI(i, i2, i6), 0, i3 - i6);
                }

                @Override
                public final int I000o00OoI0I(int i, int i2, int i3) {
/* 1 */             int i4 = i2 + i3;
/* 3 */             il1oII0OlIo il1oii0olio = this.I00iio;
/* 5 */             int i5 = this.I00ilO0;
/* 7 */             if (i4 <= i5) {
/* 9 */                 return il1oii0olio.I000o00OoI0I(i, i2, i3);
                    }
/* 14 */            il1oII0OlIo il1oii0olio2 = this.I00ilI0I1;
/* 16 */            if (i2 >= i5) {
/* 19 */                return il1oii0olio2.I000o00OoI0I(i, i2 - i5, i3);
                    }
/* 24 */            int i6 = i5 - i2;
/* 31 */            return il1oii0olio2.I000o00OoI0I(il1oii0olio.I000o00OoI0I(i, i2, i6), 0, i3 - i6);
                }

                @Override
                public final il1oII0OlIo I000oI1ioi(int i, int i2) {
/* 1 */             int i3 = this.I00iiO;
/* 3 */             int iI00111O = il1oII0OlIo.I00111O(i, i2, i3);
/* 7 */             if (iI00111O == 0) {
/* 9 */                 return il1oII0OlIo.I00iiI;
                    }
/* 12 */            if (iI00111O == i3) {
/* 14 */                return this;
                    }
/* 15 */            il1oII0OlIo il1oii0olio = this.I00iio;
/* 17 */            int i4 = this.I00ilO0;
/* 19 */            if (i2 <= i4) {
/* 21 */                return il1oii0olio.I000oI1ioi(i, i2);
                    }
/* 26 */            il1oII0OlIo il1oii0olio2 = this.I00ilI0I1;
/* 28 */            if (i < i4) {
/* 53 */                return new ioo11I(il1oii0olio.I000oI1ioi(i, il1oii0olio.I0001Ioi1lo()), il1oii0olio2.I000oI1ioi(0, i2 - i4));
                    }
/* 32 */            return il1oii0olio2.I000oI1ioi(i - i4, i2 - i4);
                }

                @Override
                public final String I00100o1O0lo(Charset charset) {
                    byte[] bArr;
/* 3 */             int iI0001Ioi1lo = I0001Ioi1lo();
/* 7 */             if (iI0001Ioi1lo == 0) {
/* 9 */                 bArr = iloi1OI100li.I00000oOI;
                    } else {
/* 12 */                byte[] bArr2 = new byte[iI0001Ioi1lo];
/* 15 */                I000OOo1O(0, bArr2, 0, iI0001Ioi1lo);
/* 18 */                bArr = bArr2;
                    }
/* 19 */            return new String(bArr, charset);
                }

                @Override
                public final void I0010I0i(ilIO10iO ilio10io) {
/* 3 */             this.I00iio.I0010I0i(ilio10io);
/* 8 */             this.I00ilI0I1.I0010I0i(ilio10io);
                }

                @Override
                public final boolean I0010o() {
/* 6 */             int iI000o00OoI0I = this.I00iio.I000o00OoI0I(0, 0, this.I00ilO0);
/* 10 */            il1oII0OlIo il1oii0olio = this.I00ilI0I1;
                    return il1oii0olio.I000o00OoI0I(iI000o00OoI0I, 0, il1oii0olio.I0001Ioi1lo()) == 0;
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 3 */             return new iol0li00l11(this);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 88 */                return true;
                    }
/* 7 */             if (obj instanceof il1oII0OlIo) {
/* 10 */                il1oII0OlIo il1oii0olio = (il1oII0OlIo) obj;
/* 12 */                int iI0001Ioi1lo = il1oii0olio.I0001Ioi1lo();
/* 16 */                int i = this.I00iiO;
/* 18 */                if (i == iI0001Ioi1lo) {
/* 21 */                    if (i == 0) {
/* 88 */                        return true;
                            }
/* 24 */                    int i2 = this.I00iOIl;
/* 26 */                    int i3 = il1oii0olio.I00iOIl;
/* 28 */                    if (i2 == 0 || i3 == 0 || i2 == i3) {
/* 36 */                        OIIloI0Iil oIIloI0Iil = new OIIloI0Iil(this);
/* 39 */                        il1lilI1Ol il1lili1olI0000Il00O = oIIloI0Iil.I0000Il00O();
/* 45 */                        OIIloI0Iil oIIloI0Iil2 = new OIIloI0Iil(il1oii0olio);
/* 48 */                        il1lilI1Ol il1lili1olI0000Il00O2 = oIIloI0Iil2.I0000Il00O();
/* 52 */                        int i4 = 0;
/* 53 */                        int i5 = 0;
/* 54 */                        int i6 = 0;
                                while (true) {
/* 59 */                            int iI0001Ioi1lo2 = il1lili1olI0000Il00O.I0001Ioi1lo() - i4;
/* 64 */                            int iI0001Ioi1lo3 = il1lili1olI0000Il00O2.I0001Ioi1lo() - i5;
/* 65 */                            int iMin = Math.min(iI0001Ioi1lo2, iI0001Ioi1lo3);
/* 80 */                            if (!(i4 == 0 ? il1lili1olI0000Il00O.I001lllioOl(il1lili1olI0000Il00O2, i5, iMin) : il1lili1olI0000Il00O2.I001lllioOl(il1lili1olI0000Il00O, i4, iMin))) {
                                        break;
                                    }
/* 83 */                            i6 += iMin;
/* 84 */                            if (i6 >= i) {
/* 86 */                                if (i6 == i) {
/* 88 */                                    return true;
                                        }
/* 90 */                                IOOlIIilOl0.I000iOII();
/* 6 */                                 return false;
                                    }
/* 94 */                            if (iMin == iI0001Ioi1lo2) {
/* 96 */                                il1lili1olI0000Il00O = oIIloI0Iil.I0000Il00O();
/* 100 */                               i4 = 0;
                                    } else {
/* 102 */                               i4 += iMin;
                                    }
/* 103 */                           if (iMin == iI0001Ioi1lo3) {
/* 105 */                               il1lili1olI0000Il00O2 = oIIloI0Iil2.I0000Il00O();
/* 109 */                               i5 = 0;
                                    } else {
/* 111 */                               i5 += iMin;
                                    }
                                }
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return new iol0li00l11(this);
                }
            }

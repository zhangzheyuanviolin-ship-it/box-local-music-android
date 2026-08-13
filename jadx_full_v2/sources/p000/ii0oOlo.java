            package p000;

            import java.util.Iterator;
            
            public final class ii0oOlo extends ii01lO0l11ii {
                public static final int[] I00ioIO = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
                public final int I00iiO;
                public final ii01lO0l11ii I00iio;
                public final ii01lO0l11ii I00ilI0I1;
                public final int I00ilO0;
                public final int I00io1l;

                public ii0oOlo(ii01lO0l11ii ii01lo0l11ii, ii01lO0l11ii ii01lo0l11ii2) {
/* 4 */             this.I00iio = ii01lo0l11ii;
/* 6 */             this.I00ilI0I1 = ii01lo0l11ii2;
/* 8 */             int iI0001Ioi1lo = ii01lo0l11ii.I0001Ioi1lo();
/* 12 */            this.I00ilO0 = iI0001Ioi1lo;
/* 19 */            this.I00iiO = ii01lo0l11ii2.I0001Ioi1lo() + iI0001Ioi1lo;
/* 35 */            this.I00io1l = Math.max(ii01lo0l11ii.I000OiO(), ii01lo0l11ii2.I000OiO()) + 1;
                }

                public static int I001IO000(int i) {
/* 3 */             if (i >= 47) {
/* 5 */                 return Integer.MAX_VALUE;
                    }
/* 11 */            return I00ioIO[i];
                }

                @Override
                public final byte I00000oOI(int i) {
/* 3 */             ii01lO0l11ii.I001IIilI0O(i, this.I00iiO);
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
/* 3 */             ii01lO0l11ii ii01lo0l11ii = this.I00iio;
/* 5 */             int i5 = this.I00ilO0;
/* 7 */             if (i4 <= i5) {
/* 9 */                 ii01lo0l11ii.I000OOo1O(i, bArr, i2, i3);
/* 12 */                return;
                    }
/* 13 */            ii01lO0l11ii ii01lo0l11ii2 = this.I00ilI0I1;
/* 15 */            if (i >= i5) {
/* 18 */                ii01lo0l11ii2.I000OOo1O(i - i5, bArr, i2, i3);
/* 21 */                return;
                    }
/* 22 */            int i6 = i5 - i;
/* 23 */            ii01lo0l11ii.I000OOo1O(i, bArr, i2, i6);
/* 29 */            ii01lo0l11ii2.I000OOo1O(0, bArr, i2 + i6, i3 - i6);
                }

                @Override
                public final int I000OiO() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final boolean I000iOII() {
                    return this.I00iiO >= I001IO000(this.I00io1l);
                }

                @Override
                public final int I000lI(int i, int i2, int i3) {
/* 1 */             int i4 = i2 + i3;
/* 3 */             ii01lO0l11ii ii01lo0l11ii = this.I00iio;
/* 5 */             int i5 = this.I00ilO0;
/* 7 */             if (i4 <= i5) {
/* 9 */                 return ii01lo0l11ii.I000lI(i, i2, i3);
                    }
/* 14 */            ii01lO0l11ii ii01lo0l11ii2 = this.I00ilI0I1;
/* 16 */            if (i2 >= i5) {
/* 19 */                return ii01lo0l11ii2.I000lI(i, i2 - i5, i3);
                    }
/* 24 */            int i6 = i5 - i2;
/* 31 */            return ii01lo0l11ii2.I000lI(ii01lo0l11ii.I000lI(i, i2, i6), 0, i3 - i6);
                }

                @Override
                public final ii01lO0l11ii I000o00OoI0I(int i, int i2) {
/* 1 */             int i3 = this.I00iiO;
/* 3 */             int iI00100o1O0lo = ii01lO0l11ii.I00100o1O0lo(i, i2, i3);
/* 7 */             if (iI00100o1O0lo == 0) {
/* 9 */                 return ii01lO0l11ii.I00iiI;
                    }
/* 12 */            if (iI00100o1O0lo == i3) {
/* 14 */                return this;
                    }
/* 15 */            ii01lO0l11ii ii01lo0l11ii = this.I00iio;
/* 17 */            int i4 = this.I00ilO0;
/* 19 */            if (i2 <= i4) {
/* 21 */                return ii01lo0l11ii.I000o00OoI0I(i, i2);
                    }
/* 26 */            ii01lO0l11ii ii01lo0l11ii2 = this.I00ilI0I1;
/* 28 */            if (i < i4) {
/* 53 */                return new ii0oOlo(ii01lo0l11ii.I000o00OoI0I(i, ii01lo0l11ii.I0001Ioi1lo()), ii01lo0l11ii2.I000o00OoI0I(0, i2 - i4));
                    }
/* 32 */            return ii01lo0l11ii2.I000o00OoI0I(i - i4, i2 - i4);
                }

                @Override
                public final void I000oI1ioi(ii0I1Il ii0i1il) {
/* 3 */             this.I00iio.I000oI1ioi(ii0i1il);
/* 8 */             this.I00ilI0I1.I000oI1ioi(ii0i1il);
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 3 */             return new ii0oOi00lO1i(this);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 88 */                return true;
                    }
/* 7 */             if (obj instanceof ii01lO0l11ii) {
/* 10 */                ii01lO0l11ii ii01lo0l11ii = (ii01lO0l11ii) obj;
/* 12 */                int iI0001Ioi1lo = ii01lo0l11ii.I0001Ioi1lo();
/* 16 */                int i = this.I00iiO;
/* 18 */                if (i == iI0001Ioi1lo) {
/* 21 */                    if (i == 0) {
/* 88 */                        return true;
                            }
/* 24 */                    int i2 = this.I00iOIl;
/* 26 */                    int i3 = ii01lo0l11ii.I00iOIl;
/* 28 */                    if (i2 == 0 || i3 == 0 || i2 == i3) {
/* 36 */                        OIIloI0Iil oIIloI0Iil = new OIIloI0Iil(this);
/* 39 */                        ii01iiOoo ii01iioooI00000oOI = oIIloI0Iil.I00000oOI();
/* 45 */                        OIIloI0Iil oIIloI0Iil2 = new OIIloI0Iil(ii01lo0l11ii);
/* 48 */                        ii01iiOoo ii01iioooI00000oOI2 = oIIloI0Iil2.I00000oOI();
/* 52 */                        int i4 = 0;
/* 53 */                        int i5 = 0;
/* 54 */                        int i6 = 0;
                                while (true) {
/* 59 */                            int iI0001Ioi1lo2 = ii01iioooI00000oOI.I0001Ioi1lo() - i4;
/* 64 */                            int iI0001Ioi1lo3 = ii01iioooI00000oOI2.I0001Ioi1lo() - i5;
/* 65 */                            int iMin = Math.min(iI0001Ioi1lo2, iI0001Ioi1lo3);
/* 80 */                            if (!(i4 == 0 ? ii01iioooI00000oOI.I001i1O0Ol(ii01iioooI00000oOI2, i5, iMin) : ii01iioooI00000oOI2.I001i1O0Ol(ii01iioooI00000oOI, i4, iMin))) {
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
/* 96 */                                ii01iioooI00000oOI = oIIloI0Iil.I00000oOI();
/* 100 */                               i4 = 0;
                                    } else {
/* 102 */                               i4 += iMin;
                                    }
/* 103 */                           if (iMin == iI0001Ioi1lo3) {
/* 105 */                               ii01iioooI00000oOI2 = oIIloI0Iil2.I00000oOI();
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
/* 3 */             return new ii0oOi00lO1i(this);
                }
            }

            package p000;

            import java.io.IOException;
            
/* 7 */     public final class Ii0ol0ii01I extends I00OOll1 {
                public final int I00iiO;
                public int I00iio;

                public Ii0ol0ii01I(I00IO1oi11O[] i00IO1oi11OArr, int i) {
/* 1 */             this.I00iiO = i;
/* 6 */             this.I00iOIl = i00IO1oi11OArr;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 8 */             int i = 0;
                    switch (this.I00iiO) {
                        case 0:
/* 96 */                    o1OIll00i.I00i01iIIliI(48, z);
/* 99 */                    Ii0oiilIloiO ii0oiilIloiOI00Iooi00oi = o1OIll00i.I00Iooi00oi();
/* 105 */                   int length = this.I00iOIl.length;
/* 108 */                   if (this.I00iio >= 0 || length > 16) {
/* 160 */                       o1OIll00i.I00Oio(I00IlilI0i0i());
/* 163 */                       while (i < length) {
/* 177 */                           this.I00iOIl[i].I0000O().I001IIilI0O().I000oI1ioi(ii0oiilIloiOI00Iooi00oi, true);
/* 180 */                           i++;
                                }
                                break;
                            } else {
/* 113 */                       I00OIO1[] i00oio1Arr = new I00OIO1[length];
/* 116 */                       int iI0010I0i = 0;
/* 117 */                       for (int i2 = 0; i2 < length; i2++) {
/* 127 */                           I00OIO1 i00oio1I001IIilI0O = this.I00iOIl[i2].I0000O().I001IIilI0O();
/* 131 */                           i00oio1Arr[i2] = i00oio1I001IIilI0O;
/* 137 */                           iI0010I0i += i00oio1I001IIilI0O.I0010I0i(true);
                                }
/* 141 */                       this.I00iio = iI0010I0i;
/* 143 */                       o1OIll00i.I00Oio(iI0010I0i);
/* 146 */                       while (i < length) {
/* 150 */                           i00oio1Arr[i].I000oI1ioi(ii0oiilIloiOI00Iooi00oi, true);
/* 153 */                           i++;
                                }
                                break;
                            }
                        default:
/* 12 */                    o1OIll00i.I00i01iIIliI(48, z);
/* 15 */                    Ii10I1oIl0l ii10I1oIl0lI00O0i0ii = o1OIll00i.I00O0i0ii();
/* 21 */                    int length2 = this.I00iOIl.length;
/* 24 */                    if (this.I00iio >= 0 || length2 > 16) {
/* 76 */                        o1OIll00i.I00Oio(I00Io1lO());
/* 79 */                        while (i < length2) {
/* 89 */                            ii10I1oIl0lI00O0i0ii.I00i0O(this.I00iOIl[i].I0000O());
/* 92 */                            i++;
                                }
                                break;
                            } else {
/* 29 */                        I00OIO1[] i00oio1Arr2 = new I00OIO1[length2];
/* 32 */                        int iI0010I0i2 = 0;
/* 33 */                        for (int i3 = 0; i3 < length2; i3++) {
/* 43 */                            I00OIO1 i00oio1I001IO000 = this.I00iOIl[i3].I0000O().I001IO000();
/* 47 */                            i00oio1Arr2[i3] = i00oio1I001IO000;
/* 53 */                            iI0010I0i2 += i00oio1I001IO000.I0010I0i(true);
                                }
/* 57 */                        this.I00iio = iI0010I0i2;
/* 59 */                        o1OIll00i.I00Oio(iI0010I0i2);
/* 62 */                        while (i < length2) {
/* 66 */                            ii10I1oIl0lI00O0i0ii.I00i0O(i00oio1Arr2[i]);
/* 69 */                            i++;
                                }
                                break;
                            }
                    }
                }

                @Override
                public final int I0010I0i(boolean z) {
                    switch (this.I00iiO) {
                        case 0:
/* 19 */                    return O1OIll00i.I00O10llo(I00IlilI0i0i(), z);
                        default:
/* 10 */                    return O1OIll00i.I00O10llo(I00Io1lO(), z);
                    }
                }

                @Override
                public I00OIO1 I001IIilI0O() {
                    switch (this.I00iiO) {
                        case 0:
/* 10 */                    return this;
                        default:
/* 6 */                     return super.I001IIilI0O();
                    }
                }

                @Override
                public final I00OIO1 I001IO000() {
/* 1 */             int i = this.I00iiO;
/* 29 */            return this;
                }

                @Override
                public final I001lloI I00II0oii1o() {
                    switch (this.I00iiO) {
                        case 0:
/* 31 */                    return new Ii0o0iiI(I1lioO11Il.I001lIiIIo1O(I001i1O0Ol()), false);
                        default:
/* 17 */                    return new Ii101I1O1il(I1lioO11Il.I001lIiIIo1O(I001i1O0Ol()), false);
                    }
                }

                @Override
                public final I00O0o1oo I00IO1() {
                    switch (this.I00iiO) {
                    }
/* 16 */            return new Ii0oii1lIil(I1ll1ioil.I001iOo1i0O(I001iOo1i0O()));
                }

                @Override
                public final I00OilO00Il I00IO1oi11O() {
                    switch (this.I00iiO) {
                    }
/* 12 */            return new Ii0olO1(1, false, this.I00iOIl);
                }

                public int I00IlilI0i0i() {
/* 1 */             int i = this.I00iio;
/* 3 */             if (i >= 0) {
/* 113 */               return i;
                    }
/* 7 */             int length = this.I00iOIl.length;
/* 9 */             int iI0010I0i = 0;
/* 10 */            for (int i2 = 0; i2 < length; i2++) {
/* 29 */                iI0010I0i += this.I00iOIl[i2].I0000O().I001IIilI0O().I0010I0i(true);
                    }
/* 33 */            this.I00iio = iI0010I0i;
/* 35 */            return iI0010I0i;
                }

                public int I00Io1lO() {
/* 1 */             int i = this.I00iio;
/* 3 */             if (i >= 0) {
/* 113 */               return i;
                    }
/* 7 */             int length = this.I00iOIl.length;
/* 9 */             int iI0010I0i = 0;
/* 10 */            for (int i2 = 0; i2 < length; i2++) {
/* 29 */                iI0010I0i += this.I00iOIl[i2].I0000O().I001IO000().I0010I0i(true);
                    }
/* 33 */            this.I00iio = iI0010I0i;
/* 35 */            return iI0010I0i;
                }

/* 8 */         public Ii0ol0ii01I(int i) {
/* 9 */             this.I00iiO = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public Ii0ol0ii01I(I00IOO i00ioo, int i) {
                    super(i00ioo);
/* 10 */            this.I00iiO = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 10 */        public Ii0ol0ii01I(I00OIO1 i00oio1, int i) {
                    super(i00oio1);
/* 11 */            this.I00iiO = i;
                }

/* 11 */        public Ii0ol0ii01I(boolean z) {
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 12 */        public Ii0ol0ii01I() {
/* 13 */            this(0);
/* 13 */            this.I00iiO = 0;
                }
            }

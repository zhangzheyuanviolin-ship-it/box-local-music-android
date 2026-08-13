            package p000;

            import java.io.IOException;
            
/* 15 */    public final class Ii0olO1 extends I00OilO00Il {
                public final int I00iio;
                public int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii0olO1(int i, boolean z, I00IO1oi11O[] i00IO1oi11OArr) {
/* 6 */             super(z, i00IO1oi11OArr);
/* 1 */             this.I00iio = i;
                    switch (i) {
                        case 1:
/* 10 */                    super(z, i00IO1oi11OArr);
/* 14 */                    this.I00ilI0I1 = -1;
                            break;
                        default:
                            break;
                    }
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 8 */             int i = 0;
                    switch (this.I00iio) {
                        case 0:
/* 92 */                    o1OIll00i.I00i01iIIliI(49, z);
/* 95 */                    Ii0oiilIloiO ii0oiilIloiOI00Iooi00oi = o1OIll00i.I00Iooi00oi();
/* 99 */                    I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 101 */                   int length = i00IO1oi11OArr.length;
/* 104 */                   if (this.I00ilI0I1 >= 0 || length > 16) {
/* 154 */                       o1OIll00i.I00Oio(I001lllioOl());
/* 157 */                       while (i < length) {
/* 169 */                           i00IO1oi11OArr[i].I0000O().I001IIilI0O().I000oI1ioi(ii0oiilIloiOI00Iooi00oi, true);
/* 172 */                           i++;
                                }
                                break;
                            } else {
/* 109 */                       I00OIO1[] i00oio1Arr = new I00OIO1[length];
/* 112 */                       int iI0010I0i = 0;
/* 113 */                       for (int i2 = 0; i2 < length; i2++) {
/* 121 */                           I00OIO1 i00oio1I001IIilI0O = i00IO1oi11OArr[i2].I0000O().I001IIilI0O();
/* 125 */                           i00oio1Arr[i2] = i00oio1I001IIilI0O;
/* 131 */                           iI0010I0i += i00oio1I001IIilI0O.I0010I0i(true);
                                }
/* 135 */                       this.I00ilI0I1 = iI0010I0i;
/* 137 */                       o1OIll00i.I00Oio(iI0010I0i);
/* 140 */                       while (i < length) {
/* 144 */                           i00oio1Arr[i].I000oI1ioi(ii0oiilIloiOI00Iooi00oi, true);
/* 147 */                           i++;
                                }
                                break;
                            }
                        default:
/* 12 */                    o1OIll00i.I00i01iIIliI(49, z);
/* 15 */                    Ii10I1oIl0l ii10I1oIl0lI00O0i0ii = o1OIll00i.I00O0i0ii();
/* 19 */                    I00IO1oi11O[] i00IO1oi11OArr2 = this.I00iOIl;
/* 21 */                    int length2 = i00IO1oi11OArr2.length;
/* 24 */                    if (this.I00ilI0I1 >= 0 || length2 > 16) {
/* 74 */                        o1OIll00i.I00Oio(I001lloI());
/* 77 */                        while (i < length2) {
/* 85 */                            ii10I1oIl0lI00O0i0ii.I00i0O(i00IO1oi11OArr2[i].I0000O());
/* 88 */                            i++;
                                }
                                break;
                            } else {
/* 29 */                        I00OIO1[] i00oio1Arr2 = new I00OIO1[length2];
/* 32 */                        int iI0010I0i2 = 0;
/* 33 */                        for (int i3 = 0; i3 < length2; i3++) {
/* 41 */                            I00OIO1 i00oio1I001IO000 = i00IO1oi11OArr2[i3].I0000O().I001IO000();
/* 45 */                            i00oio1Arr2[i3] = i00oio1I001IO000;
/* 51 */                            iI0010I0i2 += i00oio1I001IO000.I0010I0i(true);
                                }
/* 55 */                        this.I00ilI0I1 = iI0010I0i2;
/* 57 */                        o1OIll00i.I00Oio(iI0010I0i2);
/* 60 */                        while (i < length2) {
/* 64 */                            ii10I1oIl0lI00O0i0ii.I00i0O(i00oio1Arr2[i]);
/* 67 */                            i++;
                                }
                                break;
                            }
                    }
                }

                @Override
                public final int I0010I0i(boolean z) {
                    switch (this.I00iio) {
                        case 0:
/* 19 */                    return O1OIll00i.I00O10llo(I001lllioOl(), z);
                        default:
/* 10 */                    return O1OIll00i.I00O10llo(I001lloI(), z);
                    }
                }

                @Override
                public I00OIO1 I001IIilI0O() {
                    switch (this.I00iio) {
                        case 0:
/* 13 */                    if (!this.I00iiI) {
                                break;
                            }
                            break;
                    }
/* 6 */             return super.I001IIilI0O();
                }

                @Override
                public final I00OIO1 I001IO000() {
/* 1 */             int i = this.I00iio;
/* 29 */            return this;
                }

                public int I001lllioOl() {
/* 1 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 3 */             int i = this.I00ilI0I1;
/* 5 */             if (i >= 0) {
/* 113 */               return i;
                    }
/* 9 */             int iI0010I0i = 0;
/* 10 */            for (I00IO1oi11O i00IO1oi11O : i00IO1oi11OArr) {
/* 27 */                iI0010I0i += i00IO1oi11O.I0000O().I001IIilI0O().I0010I0i(true);
                    }
/* 31 */            this.I00ilI0I1 = iI0010I0i;
/* 33 */            return iI0010I0i;
                }

                public int I001lloI() {
/* 1 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 3 */             int i = this.I00ilI0I1;
/* 5 */             if (i >= 0) {
/* 113 */               return i;
                    }
/* 9 */             int iI0010I0i = 0;
/* 10 */            for (I00IO1oi11O i00IO1oi11O : i00IO1oi11OArr) {
/* 27 */                iI0010I0i += i00IO1oi11O.I0000O().I001IO000().I0010I0i(true);
                    }
/* 31 */            this.I00ilI0I1 = iI0010I0i;
/* 33 */            return iI0010I0i;
                }

/* 16 */        public Ii0olO1() {
/* 17 */            this.I00iio = 1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public Ii0olO1(I00IOO i00ioo) {
                    super(i00ioo);
/* 18 */            this.I00iio = 1;
                }
            }

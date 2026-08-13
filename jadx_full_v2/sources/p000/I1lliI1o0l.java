            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            
/* 12 */    public final class I1lliI1o0l extends I00Ol1ll1 {
                public final int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1lliI1o0l(boolean z, int i, I00IO1oi11O i00IO1oi11O, int i2) {
/* 10 */            super(z ? 1 : 2, Barcode.FORMAT_ITF, i, i00IO1oi11O);
/* 1 */             this.I00ilI0I1 = i2;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 1 */             int i = this.I00ilI0I1;
/* 3 */             int i2 = this.I00iiO;
/* 5 */             int i3 = this.I00iiI;
/* 7 */             I00IO1oi11O i00IO1oi11O = this.I00iio;
                    switch (i) {
                        case 0:
/* 101 */                   I00OIO1 i00oio1I0000O = i00IO1oi11O.I0000O();
/* 105 */                   boolean zI001lllioOl = I001lllioOl();
/* 109 */                   if (z) {
/* 111 */                       if (zI001lllioOl || i00oio1I0000O.I00100o1O0lo()) {
/* 119 */                           i3 |= 32;
                                }
/* 121 */                       o1OIll00i.I00OloOo(i3, i2);
                            }
/* 125 */                   if (!zI001lllioOl) {
/* 142 */                       i00oio1I0000O.I000oI1ioi(o1OIll00i, false);
                                break;
                            } else {
/* 129 */                       o1OIll00i.I00OOll1(Barcode.FORMAT_ITF);
/* 132 */                       i00oio1I0000O.I000oI1ioi(o1OIll00i, true);
/* 135 */                       o1OIll00i.I00OOll1(0);
/* 138 */                       o1OIll00i.I00OOll1(0);
                                break;
                            }
                        case 1:
/* 61 */                    I00OIO1 i00oio1I001IIilI0O = i00IO1oi11O.I0000O().I001IIilI0O();
/* 65 */                    boolean zI001lllioOl2 = I001lllioOl();
/* 69 */                    if (z) {
/* 71 */                        if (zI001lllioOl2 || i00oio1I001IIilI0O.I00100o1O0lo()) {
/* 79 */                            i3 |= 32;
                                }
/* 81 */                        o1OIll00i.I00OloOo(i3, i2);
                            }
/* 84 */                    if (zI001lllioOl2) {
/* 90 */                        o1OIll00i.I00Oio(i00oio1I001IIilI0O.I0010I0i(true));
                            }
/* 97 */                    i00oio1I001IIilI0O.I000oI1ioi(o1OIll00i.I00Iooi00oi(), zI001lllioOl2);
                            break;
                        default:
/* 17 */                    I00OIO1 i00oio1I001IO000 = i00IO1oi11O.I0000O().I001IO000();
/* 21 */                    boolean zI001lllioOl3 = I001lllioOl();
/* 25 */                    if (z) {
/* 27 */                        if (zI001lllioOl3 || i00oio1I001IO000.I00100o1O0lo()) {
/* 35 */                            i3 |= 32;
                                }
/* 37 */                        o1OIll00i.I00OloOo(i3, i2);
                            }
/* 40 */                    if (zI001lllioOl3) {
/* 46 */                        o1OIll00i.I00Oio(i00oio1I001IO000.I0010I0i(true));
                            }
/* 53 */                    i00oio1I001IO000.I000oI1ioi(o1OIll00i.I00O0i0ii(), zI001lllioOl3);
                            break;
                    }
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             int i = this.I00ilI0I1;
/* 5 */             I00IO1oi11O i00IO1oi11O = this.I00iio;
                    switch (i) {
                        case 0:
/* 60 */                    if (!I001lllioOl() && !i00IO1oi11O.I0000O().I00100o1O0lo()) {
                                break;
                            }
                            break;
                        case 1:
/* 37 */                    if (!I001lllioOl() && !i00IO1oi11O.I0000O().I001IIilI0O().I00100o1O0lo()) {
                                break;
                            }
                            break;
                        default:
/* 14 */                    if (!I001lllioOl() && !i00IO1oi11O.I0000O().I001IO000().I00100o1O0lo()) {
                                break;
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 1 */             int i = this.I00ilI0I1;
/* 4 */             int i2 = this.I00iiO;
/* 6 */             I00IO1oi11O i00IO1oi11O = this.I00iio;
                    switch (i) {
                        case 0:
/* 73 */                    I00OIO1 i00oio1I0000O = i00IO1oi11O.I0000O();
/* 77 */                    boolean zI001lllioOl = I001lllioOl();
/* 81 */                    int iI0010I0i = i00oio1I0000O.I0010I0i(zI001lllioOl);
/* 85 */                    if (zI001lllioOl) {
/* 87 */                        iI0010I0i += 3;
                            }
/* 95 */                    return iI0010I0i + (z ? O1OIll00i.I00OI1(i2) : 0);
                        case 1:
/* 46 */                    I00OIO1 i00oio1I001IIilI0O = i00IO1oi11O.I0000O().I001IIilI0O();
/* 50 */                    boolean zI001lllioOl2 = I001lllioOl();
/* 54 */                    int iI0010I0i2 = i00oio1I001IIilI0O.I0010I0i(zI001lllioOl2);
/* 58 */                    if (zI001lllioOl2) {
/* 64 */                        iI0010I0i2 += O1OIll00i.I00O0o1oo(iI0010I0i2);
                            }
/* 71 */                    return iI0010I0i2 + (z ? O1OIll00i.I00OI1(i2) : 0);
                        default:
/* 15 */                    I00OIO1 i00oio1I001IO000 = i00IO1oi11O.I0000O().I001IO000();
/* 19 */                    boolean zI001lllioOl3 = I001lllioOl();
/* 23 */                    int iI0010I0i3 = i00oio1I001IO000.I0010I0i(zI001lllioOl3);
/* 27 */                    if (zI001lllioOl3) {
/* 33 */                        iI0010I0i3 += O1OIll00i.I00O0o1oo(iI0010I0i3);
                            }
/* 40 */                    return iI0010I0i3 + (z ? O1OIll00i.I00OI1(i2) : 0);
                    }
                }

                @Override
                public I00OIO1 I001IIilI0O() {
                    switch (this.I00ilI0I1) {
                        case 1:
/* 10 */                    return this;
                        default:
/* 6 */                     return super.I001IIilI0O();
                    }
                }

                @Override
                public I00OIO1 I001IO000() {
                    switch (this.I00ilI0I1) {
                        case 1:
                        case 2:
/* 10 */                    return this;
                        default:
/* 6 */                     return super.I001IO000();
                    }
                }

                @Override
                public final I00OOll1 I001lloI(I00OIO1 i00oio1) {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 27 */                    return new I1llI1Iil(i00oio1);
                        case 1:
/* 19 */                    Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00oio1, 0);
/* 22 */                    ii0ol0ii01I.I00iio = -1;
/* 24 */                    return ii0ol0ii01I;
                        default:
/* 10 */                    Ii0ol0ii01I ii0ol0ii01I2 = new Ii0ol0ii01I(i00oio1, 1);
/* 13 */                    ii0ol0ii01I2.I00iio = -1;
/* 15 */                    return ii0ol0ii01I2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I1lliI1o0l(int i, int i2, int i3, I00IO1oi11O i00IO1oi11O, int i4) {
                    super(i, i2, i3, i00IO1oi11O);
/* 14 */            this.I00ilI0I1 = i4;
                }
            }

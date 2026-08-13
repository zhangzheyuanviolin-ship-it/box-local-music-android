            package p000;

            import java.io.IOException;
            
/* 184 */   public final class Ii0o0o0O00IO extends I00OIO1 {
                public I00O0i0ii I00iOIl;
                public I00IoIO0lI I00iiI;
                public I00OIO1 I00iiO;
                public int I00iio;
                public I00OIO1 I00ilI0I1;
                public final int I00ilO0 = 0;

                public Ii0o0o0O00IO(I00OOll1 i00OOll1) {
                    int i;
                    I00OIO1 i00oio1I0000O;
/* 8 */             I00OIO1 i00oio1I001iOo1i0O = I001iOo1i0O(i00OOll1, 0);
/* 14 */            if (i00oio1I001iOo1i0O instanceof I00O0i0ii) {
/* 18 */                this.I00iOIl = (I00O0i0ii) i00oio1I001iOo1i0O;
/* 20 */                i00oio1I001iOo1i0O = I001iOo1i0O(i00OOll1, 1);
/* 24 */                i = 1;
                    } else {
/* 26 */                i = 0;
                    }
/* 29 */            if (i00oio1I001iOo1i0O instanceof I00IoIO0lI) {
/* 33 */                this.I00iiI = (I00IoIO0lI) i00oio1I001iOo1i0O;
/* 35 */                i++;
/* 37 */                i00oio1I001iOo1i0O = I001iOo1i0O(i00OOll1, i);
                    }
/* 43 */            if (!(i00oio1I001iOo1i0O instanceof I00Ol1ll1)) {
/* 45 */                this.I00iiO = i00oio1I001iOo1i0O;
/* 47 */                i++;
/* 49 */                i00oio1I001iOo1i0O = I001iOo1i0O(i00OOll1, i);
                    }
/* 59 */            if (i00OOll1.size() != i + 1) {
/* 182 */               I000II.I000iOII("input sequence too large");
/* 186 */               throw null;
                    }
/* 63 */            if (!(i00oio1I001iOo1i0O instanceof I00Ol1ll1)) {
/* 176 */               I000II.I000iOII("No tagged object found in sequence. Structure doesn't seem to be of type External");
/* 179 */               throw null;
                    }
/* 65 */            I00Ol1ll1 i00Ol1ll1 = (I00Ol1ll1) i00oio1I001iOo1i0O;
/* 67 */            int i2 = i00Ol1ll1.I00iiO;
/* 69 */            if (i2 < 0 || i2 > 2) {
/* 170 */               I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "invalid encoding value: "));
/* 173 */               throw null;
                    }
/* 74 */            this.I00iio = i2;
/* 76 */            int i3 = i00Ol1ll1.I00iiI;
/* 82 */            if (128 != i3) {
/* 160 */               I000II.I000iOII("invalid tag: ".concat(iO1oOlIIo10.I00000oIO(i3, i2)));
/* 163 */               throw null;
                    }
/* 84 */            if (i2 != 0) {
/* 86 */                if (i2 == 1) {
/* 117 */                   i00oio1I0000O = (I00O0o1oo) I00O0o1oo.I00iiI.I0001Ioi1lo(i00Ol1ll1, false);
                        } else {
/* 88 */                    if (i2 != 2) {
/* 107 */                       I000II.I000iOII("invalid tag: ".concat(iO1oOlIIo10.I00000oIO(i3, i2)));
/* 110 */                       throw null;
                            }
/* 96 */                    i00oio1I0000O = (I001lloI) I001lloI.I00iiI.I0001Ioi1lo(i00Ol1ll1, false);
                        }
                    } else {
/* 124 */               if (!i00Ol1ll1.I001lllioOl()) {
/* 148 */                   I000II.I001IO000("object implicit - explicit expected.");
/* 151 */                   throw null;
                        }
/* 126 */               I00IO1oi11O i00IO1oi11O = i00Ol1ll1.I00iio;
/* 139 */               i00oio1I0000O = (i00IO1oi11O instanceof I00IoO0 ? (I00IoO0) i00IO1oi11O : i00IO1oi11O.I0000O()).I0000O();
                    }
/* 143 */           this.I00ilI0I1 = i00oio1I0000O;
                }

                public static I00OIO1 I001iOo1i0O(I00OOll1 i00OOll1, int i) {
/* 5 */             if (i00OOll1.size() > i) {
/* 11 */                return i00OOll1.I001lloI(i).I0000O();
                    }
/* 18 */            I000II.I000iOII("too few objects in input sequence");
/* 21 */            return null;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
                    Ii0o0o0O00IO ii0o0o0O00IO;
                    I00O0i0ii i00O0i0ii;
                    I00O0i0ii i00O0i0ii2;
/* 1 */             if (this == i00oio1) {
/* 82 */                return true;
                    }
/* 7 */             if (!(i00oio1 instanceof Ii0o0o0O00IO) || ((i00O0i0ii = this.I00iOIl) != (i00O0i0ii2 = (ii0o0o0O00IO = (Ii0o0o0O00IO) i00oio1).I00iOIl) && (i00O0i0ii == null || i00O0i0ii2 == null || !i00O0i0ii.equals(i00O0i0ii2)))) {
/* 6 */                 return false;
                    }
/* 30 */            I00IoIO0lI i00IoIO0lI = this.I00iiI;
/* 32 */            I00IoIO0lI i00IoIO0lI2 = ii0o0o0O00IO.I00iiI;
/* 34 */            if (i00IoIO0lI != i00IoIO0lI2 && (i00IoIO0lI == null || i00IoIO0lI2 == null || !i00IoIO0lI.equals(i00IoIO0lI2))) {
/* 6 */                 return false;
                    }
/* 48 */            I00OIO1 i00oio12 = this.I00iiO;
/* 50 */            I00OIO1 i00oio13 = ii0o0o0O00IO.I00iiO;
                    return (i00oio12 == i00oio13 || !(i00oio12 == null || i00oio13 == null || !i00oio12.equals(i00oio13))) && this.I00iio == ii0o0o0O00IO.I00iio && this.I00ilI0I1.I0010o(ii0o0o0O00IO.I00ilI0I1);
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 3 */             o1OIll00i.I00i01iIIliI(40, z);
/* 11 */            I001i1O0Ol().I000oI1ioi(o1OIll00i, false);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return true;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 5 */             return I001i1O0Ol().I0010I0i(z);
                }

                @Override
                public I00OIO1 I001IIilI0O() {
                    switch (this.I00ilO0) {
                        case 0:
/* 91 */                    return this;
                        default:
/* 8 */                     I00O0i0ii i00O0i0ii = this.I00iOIl;
/* 10 */                    I00IoIO0lI i00IoIO0lI = this.I00iiI;
/* 12 */                    I00OIO1 i00oio1 = this.I00iiO;
/* 14 */                    int i = this.I00iio;
/* 16 */                    I00OIO1 i00oio12 = this.I00ilI0I1;
/* 18 */                    Ii0o0o0O00IO ii0o0o0O00IO = new Ii0o0o0O00IO();
/* 21 */                    ii0o0o0O00IO.I00iOIl = i00O0i0ii;
/* 23 */                    ii0o0o0O00IO.I00iiI = i00IoIO0lI;
/* 25 */                    ii0o0o0O00IO.I00iiO = i00oio1;
/* 28 */                    if (i < 0 || i > 2) {
/* 86 */                        I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "invalid encoding value: "));
                            } else {
/* 33 */                        ii0o0o0O00IO.I00iio = i;
/* 38 */                        if (i == 1 ? I00O0o1oo.class.isInstance(i00oio12) : !(i == 2 && !I001lloI.class.isInstance(i00oio12))) {
/* 77 */                            ii0o0o0O00IO.I00ilI0I1 = i00oio12;
/* 90 */                            return ii0o0o0O00IO;
                                }
/* 64 */                        I000II.I001IO000("unexpected object: ".concat(i00oio12.getClass().getName()));
                            }
/* 27 */                    return null;
                    }
                }

                @Override
                public final I00OIO1 I001IO000() {
/* 1 */             int i = this.I00ilO0;
/* 29 */            return this;
                }

                public final I00OOll1 I001i1O0Ol() {
                    switch (this.I00ilO0) {
                        case 0:
/* 66 */                    I00IOO i00ioo = new I00IOO(4);
/* 69 */                    I00O0i0ii i00O0i0ii = this.I00iOIl;
/* 71 */                    if (i00O0i0ii != null) {
/* 73 */                        i00ioo.I0000O(i00O0i0ii);
                            }
/* 76 */                    I00IoIO0lI i00IoIO0lI = this.I00iiI;
/* 78 */                    if (i00IoIO0lI != null) {
/* 80 */                        i00ioo.I0000O(i00IoIO0lI);
                            }
/* 83 */                    I00OIO1 i00oio1 = this.I00iiO;
/* 85 */                    if (i00oio1 != null) {
/* 91 */                        i00ioo.I0000O(i00oio1.I001IIilI0O());
                            }
/* 96 */                    int i = this.I00iio;
/* 108 */                   i00ioo.I0000O(new I1lliI1o0l(i == 0, i, this.I00ilI0I1, 1));
/* 113 */                   Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 116 */                   ii0ol0ii01I.I00iio = -1;
/* 118 */                   return ii0ol0ii01I;
                        default:
/* 12 */                    I00IOO i00ioo2 = new I00IOO(4);
/* 15 */                    I00O0i0ii i00O0i0ii2 = this.I00iOIl;
/* 17 */                    if (i00O0i0ii2 != null) {
/* 19 */                        i00ioo2.I0000O(i00O0i0ii2);
                            }
/* 22 */                    I00IoIO0lI i00IoIO0lI2 = this.I00iiI;
/* 24 */                    if (i00IoIO0lI2 != null) {
/* 26 */                        i00ioo2.I0000O(i00IoIO0lI2);
                            }
/* 29 */                    I00OIO1 i00oio12 = this.I00iiO;
/* 31 */                    if (i00oio12 != null) {
/* 37 */                        i00ioo2.I0000O(i00oio12.I001IO000());
                            }
/* 42 */                    int i2 = this.I00iio;
/* 53 */                    i00ioo2.I0000O(new I1lliI1o0l(i2 == 0, i2, this.I00ilI0I1, 2));
/* 58 */                    Ii0ol0ii01I ii0ol0ii01I2 = new Ii0ol0ii01I(i00ioo2, 1);
/* 61 */                    ii0ol0ii01I2.I00iio = -1;
/* 63 */                    return ii0ol0ii01I2;
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             I00O0i0ii i00O0i0ii = this.I00iOIl;
/* 8 */             int iHashCode = i00O0i0ii == null ? 0 : i00O0i0ii.hashCode();
/* 12 */            I00IoIO0lI i00IoIO0lI = this.I00iiI;
/* 22 */            int iHashCode2 = iHashCode ^ (i00IoIO0lI == null ? 0 : i00IoIO0lI.hashCode());
/* 23 */            I00OIO1 i00oio1 = this.I00iiO;
/* 42 */            return this.I00ilI0I1.hashCode() ^ ((iHashCode2 ^ (i00oio1 != null ? i00oio1.hashCode() : 0)) ^ this.I00iio);
                }

/* 185 */       public Ii0o0o0O00IO() {
                }
            }

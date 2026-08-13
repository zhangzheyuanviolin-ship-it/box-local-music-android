            package p000;

            import java.io.IOException;
            import java.util.Arrays;
            
/* 27 */    public abstract class I00Ol1ll1 extends I00OIO1 implements IoiolIoO1I0O {
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final I00IO1oi11O I00iio;

                public I00Ol1ll1(int i, int i2, int i3, I00IO1oi11O i00IO1oi11O) {
/* 4 */             if (i00IO1oi11O == null) {
/* 39 */                IOOlIIilOl0.I000II("'obj' cannot be null");
/* 483 */               throw null;
                    }
/* 6 */             if (i2 == 0 || (i2 & 192) != i2) {
/* 32 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "invalid tag class: "));
/* 36 */                throw null;
                    }
/* 17 */            this.I00iOIl = i00IO1oi11O instanceof I00IO1 ? 1 : i;
/* 19 */            this.I00iiI = i2;
/* 21 */            this.I00iiO = i3;
/* 23 */            this.I00iio = i00IO1oi11O;
                }

                public static I00Ol1ll1 I001i1O0Ol(int i, int i2, I00IOO i00ioo) {
                    int i3;
                    I1lliI1o0l i1lliI1o0l;
/* 4 */             if (i00ioo.I00000oOI == 1) {
/* 15 */                i3 = i;
/* 17 */                i1lliI1o0l = new I1lliI1o0l(3, i3, i2, i00ioo.I0000oI00(0), 2);
                    } else {
/* 36 */                i3 = i;
/* 33 */                i1lliI1o0l = new I1lliI1o0l(4, i, i2, Ii10I0Ii.I00000oIO(i00ioo), 2);
                    }
                    return i3 != 64 ? i1lliI1o0l : new Ii1011OI(i1lliI1o0l);
                }

                public static I00Ol1ll1 I001iOo1i0O(I00IO1oi11O i00IO1oi11O) {
/* 1 */             if (i00IO1oi11O == null || (i00IO1oi11O instanceof I00Ol1ll1)) {
/* 38 */                return (I00Ol1ll1) i00IO1oi11O;
                    }
/* 8 */             I00OIO1 i00oio1I0000O = i00IO1oi11O.I0000O();
/* 14 */            if (i00oio1I0000O instanceof I00Ol1ll1) {
/* 16 */                return (I00Ol1ll1) i00oio1I0000O;
                    }
/* 33 */            I000II.I000iOII("unknown object in getInstance: ".concat(i00IO1oi11O.getClass().getName()));
/* 36 */            return null;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (!(i00oio1 instanceof I00Ol1ll1)) {
/* 78 */                return false;
                    }
/* 6 */             I00Ol1ll1 i00Ol1ll1 = (I00Ol1ll1) i00oio1;
/* 12 */            if (this.I00iiO != i00Ol1ll1.I00iiO || this.I00iiI != i00Ol1ll1.I00iiI) {
/* 78 */                return false;
                    }
/* 25 */            if (this.I00iOIl != i00Ol1ll1.I00iOIl && I001lllioOl() != i00Ol1ll1.I001lllioOl()) {
/* 78 */                return false;
                    }
/* 40 */            I00OIO1 i00oio1I0000O = this.I00iio.I0000O();
/* 46 */            I00OIO1 i00oio1I0000O2 = i00Ol1ll1.I00iio.I0000O();
/* 50 */            if (i00oio1I0000O == i00oio1I0000O2) {
/* 52 */                return true;
                    }
/* 58 */            if (I001lllioOl()) {
/* 73 */                return i00oio1I0000O.I000o00OoI0I(i00oio1I0000O2);
                    }
                    try {
/* 68 */                return Arrays.equals(I000iOII(), i00Ol1ll1.I000iOII());
                    } catch (IOException unused) {
/* 78 */                return false;
                    }
                }

                @Override
                public I00OIO1 I001IIilI0O() {
/* 12 */            return new I1lliI1o0l(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, 1);
                }

                @Override
                public I00OIO1 I001IO000() {
/* 12 */            return new I1lliI1o0l(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, 2);
                }

                public final I00OIO1 I001lIiIIo1O() {
/* 5 */             if (128 == this.I00iiI) {
/* 9 */                 return this.I00iio.I0000O();
                    }
/* 16 */            I000II.I001IO000("this method only valid for CONTEXT_SPECIFIC tags");
/* 19 */            return null;
                }

                public final boolean I001lllioOl() {
/* 1 */             int i = this.I00iOIl;
                    return i == 1 || i == 3;
                }

                public abstract I00OOll1 I001lloI(I00OIO1 i00oio1);

                @Override
                public final int hashCode() {
/* 30 */            return this.I00iio.I0000O().hashCode() ^ (((this.I00iiI * 7919) ^ this.I00iiO) ^ (I001lllioOl() ? 15 : 240));
                }

                public final String toString() {
/* 19 */            return iO1oOlIIo10.I00000oIO(this.I00iiI, this.I00iiO) + this.I00iio;
                }

                @Override
/* 28 */        public final I00OIO1 I000OiO() {
/* 29 */            return this;
                }
            }

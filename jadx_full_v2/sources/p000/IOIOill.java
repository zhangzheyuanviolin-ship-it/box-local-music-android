            package p000;
            
/* 14 */    public final class IOIOill {
                public final Ill0IO I00000oIO;
                public final Ill0IO I00000oOI;
                public final boolean I0000Il00O;

                public IOIOill(Ill0IO ill0IO, Ill0IO ill0IO2, boolean z) {
/* 4 */             this.I00000oIO = ill0IO;
/* 6 */             this.I00000oOI = ill0IO2;
/* 8 */             this.I0000Il00O = z;
/* 12 */            ill0IO2.I00000oIO.I0000Il00O();
                }

                public static final String I0000Il00O(Ill0IO ill0IO) {
/* 3 */             String str = ill0IO.I00000oIO.I00000oIO;
                    return OlOoOIi0o.I00100l0(str, '/') ? IIl001iO0Io.I000iOII('`', "`", str) : str;
                }

                public final Ill0IO I00000oIO() {
/* 1 */             Ill0IO ill0IO = this.I00000oIO;
/* 5 */             boolean zI0000Il00O = ill0IO.I00000oIO.I0000Il00O();
/* 9 */             Ill0IO ill0IO2 = this.I00000oOI;
/* 11 */            if (zI0000Il00O) {
/* 13 */                return ill0IO2;
                    }
/* 44 */            return new Ill0IO(ill0IO.I00000oIO.I00000oIO + '.' + ill0IO2.I00000oIO.I00000oIO);
                }

                public final String I00000oOI() {
/* 1 */             Ill0IO ill0IO = this.I00000oIO;
/* 5 */             boolean zI0000Il00O = ill0IO.I00000oIO.I0000Il00O();
/* 9 */             Ill0IO ill0IO2 = this.I00000oOI;
/* 11 */            if (zI0000Il00O) {
/* 13 */                return I0000Il00O(ill0IO2);
                    }
/* 47 */            return ill0IO.I00000oIO.I00000oIO.replace('.', '/') + "/" + I0000Il00O(ill0IO2);
                }

                public final IOIOill I0000O(OI1Iio0ii1 oI1Iio0ii1) {
/* 13 */            return new IOIOill(this.I00000oIO, this.I00000oOI.I00000oIO(oI1Iio0ii1), this.I0000Il00O);
                }

                public final IOIOill I0000oI00() {
/* 3 */             Ill0IO ill0IOI00000oOI = this.I00000oOI.I00000oOI();
/* 13 */            if (ill0IOI00000oOI.I00000oIO.I0000Il00O()) {
/* 25 */                return null;
                    }
/* 21 */            return new IOIOill(this.I00000oIO, ill0IOI00000oOI, this.I0000Il00O);
                }

                public final OI1Iio0ii1 I0001Ioi1lo() {
/* 5 */             return this.I00000oOI.I00000oIO.I000II();
                }

                public final boolean I000II() {
/* 13 */            return !this.I00000oOI.I00000oOI().I00000oIO.I0000Il00O();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOIOill)) {
/* 7 */                 return false;
                    }
/* 11 */            IOIOill iOIOill = (IOIOill) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOIOill.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOIOill.I00000oOI) && this.I0000Il00O == iOIOill.I0000Il00O;
                }

                public final int hashCode() {
/* 24 */            return Boolean.hashCode(this.I0000Il00O) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 5 */             boolean zI0000Il00O = this.I00000oIO.I00000oIO.I0000Il00O();
/* 9 */             String strI00000oOI = I00000oOI();
                    return zI0000Il00O ? "/".concat(strI00000oOI) : strI00000oOI;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 15 */        public IOIOill(Ill0IO ill0IO, OI1Iio0ii1 oI1Iio0ii1) {
                    this(ill0IO, ililiol1o0i.I00000oIO(oI1Iio0ii1), false);
/* 16 */            Ill0IO ill0IO2 = Ill0IO.I0000Il00O;
                }
            }

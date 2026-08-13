            package p000;
            
            public final class I0ioOiiIO0 extends I00IoO0 {
                public I00O0i0ii I00iOIl;
                public I00IO1oi11O I00iiI = Ii0oIIl.I00iOIl;

                public I0ioOiiIO0(I00O0i0ii i00O0i0ii) {
/* 4 */             this.I00iOIl = i00O0i0ii;
                }

                public static I0ioOiiIO0 I000o00OoI0I(Object obj) {
/* 3 */             if (obj instanceof I0ioOiiIO0) {
/* 5 */                 return (I0ioOiiIO0) obj;
                    }
/* 9 */             if (obj != null) {
/* 13 */                I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(obj);
/* 17 */                I0ioOiiIO0 i0ioOiiIO0 = new I0ioOiiIO0();
/* 25 */                if (i00OOll1I001lllioOl.size() >= 1 && i00OOll1I001lllioOl.size() <= 2) {
/* 43 */                    i0ioOiiIO0.I00iOIl = I00O0i0ii.I001lloI(i00OOll1I001lllioOl.I001lloI(0));
/* 49 */                    if (i00OOll1I001lllioOl.size() == 2) {
/* 55 */                        i0ioOiiIO0.I00iiI = i00OOll1I001lllioOl.I001lloI(1);
/* 57 */                        return i0ioOiiIO0;
                            }
/* 58 */                    i0ioOiiIO0.I00iiI = null;
/* 60 */                    return i0ioOiiIO0;
                        }
/* 67 */                IioIoO10iOiI.I0001Ioi1lo(i00OOll1I001lllioOl.size(), "Bad sequence size: ");
                    }
/* 8 */             return null;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(2);
/* 9 */             i00ioo.I0000O(this.I00iOIl);
/* 12 */            I00IO1oi11O i00IO1oi11O = this.I00iiI;
/* 14 */            if (i00IO1oi11O != null) {
/* 16 */                i00ioo.I0000O(i00IO1oi11O);
                    }
/* 22 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 26 */            ii0ol0ii01I.I00iio = -1;
/* 29 */            return ii0ol0ii01I;
                }
            }

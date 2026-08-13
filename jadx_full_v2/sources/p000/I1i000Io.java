            package p000;
            
            public final class I1i000Io extends I00IoO0 {
                public I00O0i0ii I00iOIl;
                public I00IO1oi11O I00iiI;

                public static I1i000Io I000o00OoI0I(I00IO1oi11O i00IO1oi11O) {
/* 3 */             if (i00IO1oi11O instanceof I1i000Io) {
/* 5 */                 return (I1i000Io) i00IO1oi11O;
                    }
/* 8 */             if (i00IO1oi11O == null) {
/* 38 */                I000II.I000iOII("null value in getInstance()");
/* 41 */                return null;
                    }
/* 12 */            I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00IO1oi11O);
/* 16 */            I1i000Io i1i000Io = new I1i000Io();
/* 26 */            i1i000Io.I00iOIl = (I00O0i0ii) i00OOll1I001lllioOl.I001lloI(0);
/* 33 */            i1i000Io.I00iiI = i00OOll1I001lllioOl.I001lloI(1);
/* 35 */            return i1i000Io;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(2);
/* 9 */             i00ioo.I0000O(this.I00iOIl);
/* 14 */            i00ioo.I0000O(this.I00iiI);
/* 20 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 24 */            ii0ol0ii01I.I00iio = -1;
/* 29 */            return ii0ol0ii01I;
                }
            }

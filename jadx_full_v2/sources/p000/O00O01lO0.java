            package p000;
            
            public final class O00O01lO0 extends I00IoO0 {
                public i01lOO0li I00iOIl;
                public I00IoIO0lI I00iiI;

                public static O00O01lO0 I000o00OoI0I(I00IoO0 i00IoO0) {
/* 3 */             if (i00IoO0 instanceof O00O01lO0) {
/* 5 */                 return (O00O01lO0) i00IoO0;
                    }
/* 8 */             if (i00IoO0 == null) {
/* 40 */                return null;
                    }
/* 12 */            I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00IoO0);
/* 16 */            O00O01lO0 o00O01lO0 = new O00O01lO0();
/* 28 */            o00O01lO0.I00iOIl = i01lOO0li.I000o00OoI0I(i00OOll1I001lllioOl.I001lloI(0));
/* 37 */            o00O01lO0.I00iiI = (I00IoIO0lI) i00OOll1I001lllioOl.I001lloI(1);
/* 39 */            return o00O01lO0;
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

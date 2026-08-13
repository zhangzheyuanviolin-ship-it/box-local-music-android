            package p000;
            
            public final class O0Iil01O0i extends I00IoO0 {
                public I00IoIO0lI I00iOIl;
                public O0IiOl10IOo I00iiI;
                public I0ioOiiIO0 I00iiO;
                public I00O0o1oo I00iio;

                public static O0Iil01O0i I000o00OoI0I(I00Ol1ll1 i00Ol1ll1, boolean z) {
                    O0IiOl10IOo o0IiOl10IOo;
                    I00IO1oi11O i00IO1oi11OI001lloI;
/* 7 */             I00OOll1 i00OOll1 = (I00OOll1) I00OOll1.I00iiI.I0001Ioi1lo(i00Ol1ll1, z);
/* 10 */            if (i00OOll1 == null) {
/* 9 */                 return null;
                    }
/* 14 */            I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00OOll1);
/* 18 */            O0Iil01O0i o0Iil01O0i = new O0Iil01O0i();
/* 28 */            o0Iil01O0i.I00iOIl = (I00IoIO0lI) i00OOll1I001lllioOl.I001lloI(0);
/* 31 */            I00IO1oi11O i00IO1oi11OI001lloI2 = i00OOll1I001lllioOl.I001lloI(1);
/* 37 */            if (i00IO1oi11OI001lloI2 == null || (i00IO1oi11OI001lloI2 instanceof O0IiOl10IOo)) {
/* 139 */               o0IiOl10IOo = (O0IiOl10IOo) i00IO1oi11OI001lloI2;
                    } else {
/* 46 */                if (!(i00IO1oi11OI001lloI2 instanceof I00OOll1)) {
/* 134 */                   I000II.I000iOII("Invalid KEKIdentifier: ".concat(i00IO1oi11OI001lloI2.getClass().getName()));
/* 9 */                     return null;
                        }
/* 50 */                I00OOll1 i00OOll12 = (I00OOll1) i00IO1oi11OI001lloI2;
/* 52 */                o0IiOl10IOo = new O0IiOl10IOo();
/* 61 */                o0IiOl10IOo.I00iOIl = (I00O0o1oo) i00OOll12.I001lloI(0);
/* 63 */                int size = i00OOll12.size();
/* 67 */                if (size != 1) {
/* 69 */                    if (size != 2) {
/* 71 */                        if (size != 3) {
/* 94 */                            I000II.I000iOII("Invalid KEKIdentifier");
/* 9 */                             return null;
                                }
/* 79 */                        o0IiOl10IOo.I00iiI = (I00Io1lO) i00OOll12.I001lloI(1);
/* 81 */                        i00IO1oi11OI001lloI = i00OOll12.I001lloI(2);
                            } else if (i00OOll12.I001lloI(1) instanceof I00Io1lO) {
/* 112 */                       o0IiOl10IOo.I00iiI = (I00Io1lO) i00OOll12.I001lloI(1);
                            } else {
/* 115 */                       i00IO1oi11OI001lloI = i00OOll12.I001lloI(1);
                            }
/* 89 */                    o0IiOl10IOo.I00iiO = OIilllol.I000o00OoI0I(i00IO1oi11OI001lloI);
                        }
                    }
/* 141 */           o0Iil01O0i.I00iiI = o0IiOl10IOo;
/* 151 */           o0Iil01O0i.I00iiO = I0ioOiiIO0.I000o00OoI0I(i00OOll1I001lllioOl.I001lloI(2));
/* 159 */           o0Iil01O0i.I00iio = (I00O0o1oo) i00OOll1I001lllioOl.I001lloI(3);
/* 161 */           return o0Iil01O0i;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(4);
/* 9 */             i00ioo.I0000O(this.I00iOIl);
/* 14 */            i00ioo.I0000O(this.I00iiI);
/* 19 */            i00ioo.I0000O(this.I00iiO);
/* 24 */            i00ioo.I0000O(this.I00iio);
/* 30 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 34 */            ii0ol0ii01I.I00iio = -1;
/* 113 */           return ii0ol0ii01I;
                }
            }

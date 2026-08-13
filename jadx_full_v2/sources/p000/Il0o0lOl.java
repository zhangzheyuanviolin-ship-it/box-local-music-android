            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Il0o0lOl extends I00IoO0 {
                public I00IoIO0lI I00iOIl;
                public OIilOOI0O0io I00iiI;
                public I00OilO00Il I00iiO;
                public Il0IO1Ol1ioI I00iio;
                public I00OilO00Il I00ilI0I1;

                public static Il0o0lOl I000o00OoI0I(I00OIO1 i00oio1) {
                    int i;
                    OIilOOI0O0io oIilOOI0O0io;
                    I00Ol1ll1 i00Ol1ll1;
/* 1 */             Il0IO1Ol1ioI il0IO1Ol1ioI = null;
/* 2 */             if (i00oio1 == null) {
/* 1 */                 return null;
                    }
/* 6 */             I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00oio1);
/* 10 */            Il0o0lOl il0o0lOl = new Il0o0lOl();
/* 20 */            il0o0lOl.I00iOIl = (I00IoIO0lI) i00OOll1I001lllioOl.I001lloI(0);
/* 23 */            I00IO1oi11O i00IO1oi11OI001lloI = i00OOll1I001lllioOl.I001lloI(1);
/* 27 */            boolean z = i00IO1oi11OI001lloI instanceof I00Ol1ll1;
/* 29 */            I001lllioOl i001lllioOl = I00OilO00Il.I00iiO;
/* 32 */            if (z) {
/* 42 */                I00OOll1 i00OOll1 = (I00OOll1) I00OOll1.I00iiI.I0001Ioi1lo((I00Ol1ll1) i00IO1oi11OI001lloI, false);
/* 44 */                if (i00OOll1 != null) {
/* 48 */                    I00OOll1 i00OOll1I001lllioOl2 = I00OOll1.I001lllioOl(i00OOll1);
/* 52 */                    oIilOOI0O0io = new OIilOOI0O0io();
/* 55 */                    int size = i00OOll1I001lllioOl2.size();
/* 59 */                    if (size != 0) {
/* 61 */                        if (size == 1) {
/* 104 */                           i00Ol1ll1 = (I00Ol1ll1) i00OOll1I001lllioOl2.I001lloI(0);
/* 106 */                           int i2 = i00Ol1ll1.I00iiO;
/* 108 */                           if (i2 == 0) {
/* 127 */                               oIilOOI0O0io.I00iOIl = (I00OilO00Il) i001lllioOl.I0001Ioi1lo(i00Ol1ll1, false);
                                    } else if (i2 != 1) {
/* 117 */                               IioIoO10iOiI.I0001Ioi1lo(i00Ol1ll1.I00iiO, "Bad tag in OriginatorInfo: ");
/* 1 */                                 return null;
                                    }
                                } else {
/* 63 */                            if (size != 2) {
/* 96 */                                I000II.I000iOII("OriginatorInfo too big");
/* 1 */                                 return null;
                                    }
/* 77 */                            oIilOOI0O0io.I00iOIl = (I00OilO00Il) i001lllioOl.I0001Ioi1lo((I00Ol1ll1) i00OOll1I001lllioOl2.I001lloI(0), false);
/* 83 */                            i00Ol1ll1 = (I00Ol1ll1) i00OOll1I001lllioOl2.I001lloI(1);
                                }
/* 91 */                        oIilOOI0O0io.I00iiI = (I00OilO00Il) i001lllioOl.I0001Ioi1lo(i00Ol1ll1, false);
                            }
                        } else {
/* 130 */                   oIilOOI0O0io = null;
                        }
/* 131 */               il0o0lOl.I00iiI = oIilOOI0O0io;
/* 133 */               i00IO1oi11OI001lloI = i00OOll1I001lllioOl.I001lloI(2);
/* 137 */               i = 3;
                    } else {
/* 139 */               i = 2;
                    }
/* 144 */           il0o0lOl.I00iiO = I00OilO00Il.I001iOo1i0O(i00IO1oi11OI001lloI);
/* 146 */           int i3 = i + 1;
/* 148 */           I00IO1oi11O i00IO1oi11OI001lloI2 = i00OOll1I001lllioOl.I001lloI(i);
/* 154 */           if (i00IO1oi11OI001lloI2 instanceof Il0IO1Ol1ioI) {
/* 157 */               il0IO1Ol1ioI = (Il0IO1Ol1ioI) i00IO1oi11OI001lloI2;
                    } else if (i00IO1oi11OI001lloI2 != null) {
/* 164 */               I00OOll1 i00OOll1I001lllioOl3 = I00OOll1.I001lllioOl(i00IO1oi11OI001lloI2);
/* 168 */               Il0IO1Ol1ioI il0IO1Ol1ioI2 = new Il0IO1Ol1ioI();
/* 175 */               if (i00OOll1I001lllioOl3.size() < 2) {
/* 221 */                   I000II.I000iOII("Truncated Sequence Found");
/* 1 */                     return null;
                        }
/* 183 */               il0IO1Ol1ioI2.I00iOIl = (I00O0i0ii) i00OOll1I001lllioOl3.I001lloI(0);
/* 193 */               il0IO1Ol1ioI2.I00iiI = I0ioOiiIO0.I000o00OoI0I(i00OOll1I001lllioOl3.I001lloI(1));
/* 199 */               if (i00OOll1I001lllioOl3.size() > 2) {
/* 215 */                   il0IO1Ol1ioI2.I00iiO = (I00O0o1oo) I00O0o1oo.I00iiI.I0001Ioi1lo((I00Ol1ll1) i00OOll1I001lllioOl3.I001lloI(2), false);
                        }
/* 217 */               il0IO1Ol1ioI = il0IO1Ol1ioI2;
                    }
/* 225 */           il0o0lOl.I00iio = il0IO1Ol1ioI;
/* 231 */           if (i00OOll1I001lllioOl.size() > i3) {
/* 245 */               il0o0lOl.I00ilI0I1 = (I00OilO00Il) i001lllioOl.I0001Ioi1lo((I00Ol1ll1) i00OOll1I001lllioOl.I001lloI(i3), false);
                    }
/* 247 */           return il0o0lOl;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(5);
/* 9 */             i00ioo.I0000O(this.I00iOIl);
/* 12 */            OIilOOI0O0io oIilOOI0O0io = this.I00iiI;
/* 17 */            if (oIilOOI0O0io != null) {
/* 26 */                i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 0, oIilOOI0O0io, 1));
                    }
/* 31 */            i00ioo.I0000O(this.I00iiO);
/* 36 */            i00ioo.I0000O(this.I00iio);
/* 39 */            I00OilO00Il i00OilO00Il = this.I00ilI0I1;
/* 41 */            if (i00OilO00Il != null) {
/* 52 */                i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 1, i00OilO00Il, 1));
                    }
/* 57 */            return new I1llI1Iil(i00ioo);
                }
            }

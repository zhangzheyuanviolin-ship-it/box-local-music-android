            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public final class Io0il0IO1lI extends I00IoO0 {
                public Io0iiOoI I00iOIl;
                public Io0ioI1I0lI0 I00iiI;

                public static Io0il0IO1lI I000o00OoI0I(Object obj) {
                    Io0iiOoI io0iiOoI;
/* 3 */             if (obj instanceof Io0il0IO1lI) {
/* 5 */                 return (Io0il0IO1lI) obj;
                    }
/* 9 */             if (obj != null) {
/* 13 */                I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(obj);
/* 17 */                Io0il0IO1lI io0il0IO1lI = new Io0il0IO1lI();
/* 21 */                I00IO1oi11O i00IO1oi11OI001lloI = i00OOll1I001lllioOl.I001lloI(0);
/* 32 */                if (i00IO1oi11OI001lloI instanceof Io0iiOoI) {
/* 34 */                    io0iiOoI = (Io0iiOoI) i00IO1oi11OI001lloI;
                        } else if (i00IO1oi11OI001lloI != null) {
/* 42 */                    I00OOll1 i00OOll1I001lllioOl2 = I00OOll1.I001lllioOl(i00IO1oi11OI001lloI);
/* 46 */                    Io0iiOoI io0iiOoI2 = new Io0iiOoI();
/* 53 */                    if (i00OOll1I001lllioOl2.size() == 2) {
/* 69 */                        io0iiOoI2.I00iOIl = iOO1iOiOl.I00000oIO(I00O0o1oo.I001i1O0Ol(i00OOll1I001lllioOl2.I001lloI(0)).I00iOIl);
/* 85 */                        io0iiOoI2.I00iiO = iOO1iOiOl.I00000oIO(I00O0o1oo.I001i1O0Ol(i00OOll1I001lllioOl2.I001lloI(1)).I00iOIl);
/* 87 */                        io0iiOoI2.I00iiI = null;
                            } else {
/* 98 */                        if (i00OOll1I001lllioOl2.size() != 3) {
/* 161 */                           IioIoO10iOiI.I0001Ioi1lo(i00OOll1I001lllioOl2.size(), "unknown sequence length: ");
/* 8 */                             return null;
                                }
/* 114 */                       io0iiOoI2.I00iOIl = iOO1iOiOl.I00000oIO(I00O0o1oo.I001i1O0Ol(i00OOll1I001lllioOl2.I001lloI(0)).I00iOIl);
/* 138 */                       io0iiOoI2.I00iiI = iOO1iOiOl.I00000oIO(((I00O0o1oo) I00O0o1oo.I00iiI.I0001Ioi1lo(I00Ol1ll1.I001iOo1i0O(i00OOll1I001lllioOl2.I001lloI(1)), false)).I00iOIl);
/* 154 */                       io0iiOoI2.I00iiO = iOO1iOiOl.I00000oIO(I00O0o1oo.I001i1O0Ol(i00OOll1I001lllioOl2.I001lloI(2)).I00iOIl);
                            }
/* 89 */                    VarHandle.storeStoreFence();
/* 92 */                    io0iiOoI = io0iiOoI2;
                        } else {
/* 165 */                   io0iiOoI = null;
                        }
/* 166 */               io0il0IO1lI.I00iOIl = io0iiOoI;
/* 178 */               I00OOll1 i00OOll1I001lIiIIo1O = I00OOll1.I001lIiIIo1O(I00Ol1ll1.I001iOo1i0O(i00OOll1I001lllioOl.I001lloI(1)), false);
/* 182 */               Io0ioI1I0lI0 io0ioI1I0lI0 = new Io0ioI1I0lI0();
/* 189 */               if (i00OOll1I001lIiIIo1O.size() == 2) {
/* 199 */                   io0ioI1I0lI0.I00iOIl = I00O0i0ii.I001lloI(i00OOll1I001lIiIIo1O.I001lloI(0));
/* 211 */                   io0ioI1I0lI0.I00iiO = I00O0o1oo.I001i1O0Ol(i00OOll1I001lIiIIo1O.I001lloI(1)).I00iOIl;
/* 213 */                   io0ioI1I0lI0.I00iiI = null;
                        } else if (i00OOll1I001lIiIIo1O.size() == 3) {
/* 233 */                   io0ioI1I0lI0.I00iOIl = I00O0i0ii.I001lloI(i00OOll1I001lIiIIo1O.I001lloI(0));
/* 251 */                   io0ioI1I0lI0.I00iiI = OliI1l0l.I000o00OoI0I(I00OOll1.I001lIiIIo1O(I00Ol1ll1.I001iOo1i0O(i00OOll1I001lIiIIo1O.I001lloI(1)), false));
/* 263 */                   io0ioI1I0lI0.I00iiO = I00O0o1oo.I001i1O0Ol(i00OOll1I001lIiIIo1O.I001lloI(2)).I00iOIl;
                        } else {
/* 276 */                   IioIoO10iOiI.I0001Ioi1lo(i00OOll1I001lIiIIo1O.size(), "unknown sequence length: ");
                        }
/* 215 */               VarHandle.storeStoreFence();
/* 266 */               io0il0IO1lI.I00iiI = io0ioI1I0lI0;
/* 268 */               VarHandle.storeStoreFence();
/* 271 */               return io0il0IO1lI;
                    }
/* 8 */             return null;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(2);
/* 9 */             i00ioo.I0000O(this.I00iOIl);
/* 12 */            Io0ioI1I0lI0 io0ioI1I0lI0 = this.I00iiI;
/* 14 */            if (io0ioI1I0lI0 != null) {
/* 25 */                i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 0, io0ioI1I0lI0, 1));
                    }
/* 31 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 35 */            ii0ol0ii01I.I00iio = -1;
/* 113 */           return ii0ol0ii01I;
                }
            }

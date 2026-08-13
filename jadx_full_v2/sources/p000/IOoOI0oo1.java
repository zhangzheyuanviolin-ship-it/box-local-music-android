            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOoOI0oo1 extends I00IoO0 implements IIOlll0i {
                public I00O0i0ii I00iOIl;
                public I00OIO1 I00iiI;
                public boolean I00iiO;

                public static IOoOI0oo1 I000o00OoI0I(I00OIO1 i00oio1) {
/* 1 */             I00OIO1 i00oio1I001lIiIIo1O = null;
/* 2 */             if (i00oio1 != null) {
/* 6 */                 I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00oio1);
/* 10 */                IOoOI0oo1 iOoOI0oo1 = new IOoOI0oo1();
/* 18 */                if (i00OOll1I001lllioOl.size() >= 1 && i00OOll1I001lllioOl.size() <= 2) {
/* 34 */                    iOoOI0oo1.I00iOIl = (I00O0i0ii) i00OOll1I001lllioOl.I001lloI(0);
/* 40 */                    if (i00OOll1I001lllioOl.size() > 1) {
/* 46 */                        I00Ol1ll1 i00Ol1ll1 = (I00Ol1ll1) i00OOll1I001lllioOl.I001lloI(1);
/* 52 */                        if (!i00Ol1ll1.I001lllioOl() || i00Ol1ll1.I00iiO != 0) {
/* 67 */                            I000II.I000iOII("Bad tag for 'content'");
/* 1 */                             return null;
                                }
/* 58 */                        i00oio1I001lIiIIo1O = i00Ol1ll1.I001lIiIIo1O();
                            }
/* 62 */                    iOoOI0oo1.I00iiI = i00oio1I001lIiIIo1O;
/* 74 */                    iOoOI0oo1.I00iiO = !(i00OOll1I001lllioOl instanceof I1llI1Iil);
/* 76 */                    VarHandle.storeStoreFence();
/* 79 */                    return iOoOI0oo1;
                        }
/* 86 */                IioIoO10iOiI.I0001Ioi1lo(i00OOll1I001lllioOl.size(), "Bad sequence size: ");
                    }
/* 1 */             return null;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 1 */             boolean z = this.I00iiO;
/* 6 */             I00IOO i00ioo = new I00IOO(2);
/* 11 */            i00ioo.I0000O(this.I00iOIl);
/* 14 */            I00OIO1 i00oio1 = this.I00iiI;
/* 17 */            if (i00oio1 != null) {
/* 20 */                if (z) {
/* 27 */                    i00ioo.I0000O(new I1lliI1o0l(true, 0, i00oio1, 2));
                        } else {
/* 36 */                    i00ioo.I0000O(new I1lliI1o0l(true, 0, i00oio1, 0));
                        }
                    }
/* 39 */            if (!z) {
/* 52 */                return new I1llI1Iil(i00ioo);
                    }
/* 43 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 1);
/* 47 */            ii0ol0ii01I.I00iio = -1;
/* 49 */            return ii0ol0ii01I;
                }
            }

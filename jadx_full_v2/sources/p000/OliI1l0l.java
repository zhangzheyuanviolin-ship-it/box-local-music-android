            package p000;

            import java.util.Enumeration;
            
            public final class OliI1l0l extends I00IoO0 {
                public I0ioOiiIO0 I00iOIl;
                public Ii0o0iiI I00iiI;

                public static OliI1l0l I000o00OoI0I(I00IO1oi11O i00IO1oi11O) {
/* 3 */             if (i00IO1oi11O instanceof OliI1l0l) {
/* 5 */                 return (OliI1l0l) i00IO1oi11O;
                    }
/* 9 */             if (i00IO1oi11O != null) {
/* 13 */                I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00IO1oi11O);
/* 17 */                OliI1l0l oliI1l0l = new OliI1l0l();
/* 25 */                if (i00OOll1I001lllioOl.size() == 2) {
/* 27 */                    Enumeration enumerationI00II0Ol1O0l = i00OOll1I001lllioOl.I00II0Ol1O0l();
/* 39 */                    oliI1l0l.I00iOIl = I0ioOiiIO0.I000o00OoI0I(enumerationI00II0Ol1O0l.nextElement());
/* 49 */                    oliI1l0l.I00iiI = Ii0o0iiI.I001lIiIIo1O(enumerationI00II0Ol1O0l.nextElement());
/* 51 */                    return oliI1l0l;
                        }
/* 58 */                IioIoO10iOiI.I0001Ioi1lo(i00OOll1I001lllioOl.size(), "Bad sequence size: ");
                    }
/* 8 */             return null;
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

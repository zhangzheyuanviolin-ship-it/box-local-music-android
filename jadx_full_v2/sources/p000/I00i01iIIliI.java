            package p000;

            import java.io.IOException;
            import java.util.Collections;
            import java.util.Map;
            
            public abstract class I00i01iIIliI {
                public final int I00000oIO;
                public final Class I00000oOI;

                public I00i01iIIliI(int i, Class cls) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = cls;
                }

                public void I00000oIO(I00OIO1 i00oio1) {
/* 7 */             if (this.I00000oOI.isInstance(i00oio1)) {
/* 9 */                 return;
                    }
/* 24 */            I000II.I001IO000("unexpected object: ".concat(i00oio1.getClass().getName()));
                }

                public abstract I01Iio10lo I00000oOI(I01Iio10lo i01Iio10lo);

                public I00OIO1 I0000Il00O(byte[] bArr) throws IOException {
/* 1 */             I00OIO1 i00oio1I00111O = I00OIO1.I00111O(bArr);
/* 5 */             I00000oIO(i00oio1I00111O);
/* 49 */            return i00oio1I00111O;
                }

                public I00OIO1 I0000O(I00OOll1 i00OOll1) {
/* 49 */            throw new IllegalStateException("unexpected implicit constructed encoding");
                }

                public I00OIO1 I0000oI00(Ii0oii1lIil ii0oii1lIil) {
/* 49 */            throw new IllegalStateException("unexpected implicit primitive encoding");
                }

                public I00OIO1 I0001Ioi1lo(I00Ol1ll1 i00Ol1ll1, boolean z) {
                    I00OIO1 i00oio1I0000O;
/* 6 */             if (128 != i00Ol1ll1.I00iiI) {
/* 88 */                I000II.I001IO000("this method only valid for CONTEXT_SPECIFIC tags");
/* 5 */                 return null;
                    }
/* 8 */             int i = i00Ol1ll1.I00iOIl;
/* 10 */            I00IO1oi11O i00IO1oi11O = i00Ol1ll1.I00iio;
/* 14 */            if (z) {
/* 20 */                if (!i00Ol1ll1.I001lllioOl()) {
/* 30 */                    I000II.I001IO000("object explicit - implicit expected.");
/* 5 */                     return null;
                        }
/* 22 */                i00oio1I0000O = i00IO1oi11O.I0000O();
/* 26 */                I00000oIO(i00oio1I0000O);
                    } else {
/* 35 */                if (1 == i) {
/* 82 */                    I000II.I001IO000("object explicit - implicit expected.");
/* 5 */                     return null;
                        }
/* 37 */                I00OIO1 i00oio1I0000O2 = i00IO1oi11O.I0000O();
/* 42 */                if (i == 3) {
/* 74 */                    i00oio1I0000O = I0000O(i00Ol1ll1.I001lloI(i00oio1I0000O2));
                        } else if (i != 4) {
/* 47 */                    I00000oIO(i00oio1I0000O2);
/* 50 */                    i00oio1I0000O = i00oio1I0000O2;
                        } else {
/* 65 */                    i00oio1I0000O = i00oio1I0000O2 instanceof I00OOll1 ? I0000O((I00OOll1) i00oio1I0000O2) : I0000oI00((Ii0oii1lIil) i00oio1I0000O2);
                        }
                    }
/* 78 */            I00000oIO(i00oio1I0000O);
/* 81 */            return i00oio1I0000O;
                }

                public Map I000II() {
/* 1 */             return Collections.EMPTY_MAP;
                }

                public abstract I01Iio10lo I000O01llI0(IIOI1Ii1I iIOI1Ii1I);

                public abstract void I000OOo1O(I01Iio10lo i01Iio10lo);

                public boolean equals(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
                            return this == obj;
                        default:
/* 6 */                     return super.equals(obj);
                    }
                }
            }

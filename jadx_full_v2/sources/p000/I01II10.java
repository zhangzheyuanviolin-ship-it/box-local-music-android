            package p000;

            import java.util.List;
            import java.util.RandomAccess;
            
            public final class I01II10 extends I01IO0oio implements RandomAccess {
                public final I01IO0oio I00iOIl;
                public final int I00iiI;
                public final int I00iiO;

                public I01II10(I01IO0oio i01IO0oio, int i, int i2) {
/* 4 */             this.I00iOIl = i01IO0oio;
/* 6 */             this.I00iiI = i;
/* 12 */            iOI0OiiiOl1.I00000oOI(i, i2, i01IO0oio.I00000oOI());
/* 16 */            this.I00iiO = i2 - i;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object get(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             if (i < 0 || i >= i2) {
/* 25 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 28 */                return null;
                    }
/* 12 */            return this.I00iOIl.get(this.I00iiI + i);
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             iOI0OiiiOl1.I00000oOI(i, i2, this.I00iiO);
/* 8 */             int i3 = this.I00iiI;
/* 14 */            return new I01II10(this.I00iOIl, i + i3, i3 + i2);
                }
            }

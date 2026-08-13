            package p000;
            
            public final class lOI0Oo0liO extends lOI1lll1l10 {
                public final transient int I00iiO;
                public final transient int I00iio;
                public final lOI1lll1l10 I00ilI0I1;

                public lOI0Oo0liO(lOI1lll1l10 loi1lll1l10, int i, int i2) {
/* 1 */             this.I00ilI0I1 = loi1lll1l10;
/* 6 */             this.I00iiO = i;
/* 8 */             this.I00iio = i2;
                }

                @Override
                public final Object[] I00000oOI() {
/* 3 */             return this.I00ilI0I1.I00000oOI();
                }

                @Override
                public final int I0000O() {
/* 9 */             return this.I00ilI0I1.I0000O() + this.I00iiO;
                }

                @Override
                public final int I0000oI00() {
/* 12 */            return this.I00ilI0I1.I0000O() + this.I00iiO + this.I00iio;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return true;
                }

                @Override
                public final lOI1lll1l10 subList(int i, int i2) {
/* 3 */             ll0OlOllOl.I0000oI00(i, i2, this.I00iio);
/* 6 */             int i3 = this.I00iiO;
/* 12 */            return this.I00ilI0I1.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll0OlOllOl.I0000Il00O(i, this.I00iio);
/* 11 */            return this.I00ilI0I1.get(i + this.I00iiO);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }

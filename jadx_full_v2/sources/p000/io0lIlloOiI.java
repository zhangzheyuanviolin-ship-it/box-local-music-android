            package p000;
            
            public final class io0lIlloOiI extends io0o00I1ol1o {
                public final transient int I00iiO;
                public final transient int I00iio;
                public final io0o00I1ol1o I00ilI0I1;

                public io0lIlloOiI(io0o00I1ol1o io0o00i1ol1o, int i, int i2) {
/* 1 */             this.I00ilI0I1 = io0o00i1ol1o;
/* 6 */             this.I00iiO = i;
/* 8 */             this.I00iio = i2;
                }

                @Override
                public final int I0000O() {
/* 12 */            return this.I00ilI0I1.I0000oI00() + this.I00iiO + this.I00iio;
                }

                @Override
                public final int I0000oI00() {
/* 9 */             return this.I00ilI0I1.I0000oI00() + this.I00iiO;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return true;
                }

                @Override
                public final Object[] I000OiO() {
/* 3 */             return this.I00ilI0I1.I000OiO();
                }

                @Override
                public final io0o00I1ol1o subList(int i, int i2) {
/* 3 */             lio1l10i0I.I0000Il00O(i, i2, this.I00iio);
/* 6 */             int i3 = this.I00iiO;
/* 12 */            return this.I00ilI0I1.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             lio1l10i0I.I00000oIO(i, this.I00iio);
/* 11 */            return this.I00ilI0I1.get(i + this.I00iiO);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }

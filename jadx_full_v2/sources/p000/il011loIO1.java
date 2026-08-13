            package p000;
            
            public final class il011loIO1 extends il0II0OO1 {
                public final transient int I00iiO;
                public final transient int I00iio;
                public final il0II0OO1 I00ilI0I1;

                public il011loIO1(il0II0OO1 il0ii0oo1, int i, int i2) {
/* 1 */             this.I00ilI0I1 = il0ii0oo1;
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
                public final Object[] I0001Ioi1lo() {
/* 3 */             return this.I00ilI0I1.I0001Ioi1lo();
                }

                @Override
                public final il0II0OO1 subList(int i, int i2) {
/* 3 */             lil0iIo1Oiil.I00000oOI(i, i2, this.I00iio);
/* 6 */             int i3 = this.I00iiO;
/* 12 */            return this.I00ilI0I1.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             lil0iIo1Oiil.I00000oIO(i, this.I00iio);
/* 11 */            return this.I00ilI0I1.get(i + this.I00iiO);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }

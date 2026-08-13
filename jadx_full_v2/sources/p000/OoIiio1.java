            package p000;
            
            public final class OoIiio1 extends OoIiOIo0i010 {
                public final int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OoIiio1(int i) {
/* 4 */             super(1);
/* 1 */             this.I00ilI0I1 = i;
                }

                @Override
                public final Object next() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 30 */                    int i = this.I00iio;
/* 34 */                    this.I00iio = i + 2;
/* 38 */                    Object[] objArr = this.I00iiI;
/* 47 */                    return new O1OOO0IoIIi(0, objArr[i], objArr[i + 1]);
                        case 1:
/* 19 */                    int i2 = this.I00iio;
/* 23 */                    this.I00iio = i2 + 2;
/* 27 */                    return this.I00iiI[i2];
                        default:
/* 6 */                     int i3 = this.I00iio;
/* 10 */                    this.I00iio = i3 + 2;
/* 16 */                    return this.I00iiI[i3 + 1];
                    }
                }
            }

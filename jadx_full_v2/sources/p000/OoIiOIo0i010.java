            package p000;

            import java.util.Iterator;
            
            public abstract class OoIiOIo0i010 implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public Object[] I00iiI;
                public int I00iiO;
                public int I00iio;

                public OoIiOIo0i010(int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 1:
/* 23 */                    this.I00iiI = OoIiIlIo.I0000oI00.I0000O;
                            break;
                        default:
/* 13 */                    this.I00iiI = OoIi1O0.I0000O.I0000Il00O;
                            break;
                    }
                }

                public void I00000oIO(Object[] objArr, int i, int i2) {
/* 1 */             this.I00iiI = objArr;
/* 3 */             this.I00iiO = i;
/* 5 */             this.I00iio = i2;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    if (this.I00iio < this.I00iiO) {
                            }
                            break;
                        default:
/* 10 */                    if (this.I00iio < this.I00iiO) {
                            }
                            break;
                    }
/* 14 */            return false;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }
            }

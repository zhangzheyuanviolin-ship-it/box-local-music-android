            package p000;

            import java.util.Iterator;
            
            public final class OIll0iIIo1iI implements Iterator {
                public long[] I00iOIl;
                public long[] I00iiI;
                public int I00iiO;
                public long I00iio;
                public long I00ilI0I1;
                public long I00ilO0;

                @Override
                public final boolean hasNext() {
                    return this.I00ilI0I1 < this.I00ilO0;
                }

                @Override
                public final Long next() {
/* 1 */             long j = this.I00ilI0I1;
/* 7 */             if (j >= this.I00ilO0) {
/* 51 */                IoOOl0iOl1io.I00000oOI();
/* 54 */                return null;
                    }
/* 15 */            if (j < this.I00iio) {
/* 18 */                this.I00ilI0I1 = 1 + j;
/* 20 */                return Long.valueOf(j);
                    }
/* 25 */            long[] jArr = this.I00iOIl;
/* 29 */            int i = this.I00iiO + 1;
/* 31 */            this.I00iiO = i;
/* 33 */            long j2 = jArr[i];
/* 35 */            this.I00ilI0I1 = j2;
/* 41 */            this.I00iio = this.I00iiI[i];
/* 44 */            this.I00ilI0I1 = 1 + j2;
/* 46 */            return Long.valueOf(j2);
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException();
                }
            }

            package p000;
            
            public final class IooO10lI extends IooIlO1 {
                public int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public int I00iio;

                @Override
                public final boolean hasNext() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final int nextInt() {
/* 1 */             int i = this.I00iio;
/* 5 */             if (i != this.I00iiI) {
/* 23 */                this.I00iio = this.I00iOIl + i;
/* 29 */                return i;
                    }
/* 9 */             if (this.I00iiO) {
/* 12 */                this.I00iiO = false;
/* 14 */                return i;
                    }
/* 15 */            IoOOl0iOl1io.I00000oOI();
/* 18 */            return 0;
                }
            }

            package p000;
            
            public final class OO100O10 extends I01IO1il {
                public Object[] I00iiO;
                public OoIi1IlIOOI I00iio;

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 40 */                IoOOl0iOl1io.I00000oOI();
/* 43 */                return null;
                    }
/* 7 */             OoIi1IlIOOI ooIi1IlIOOI = this.I00iio;
/* 13 */            if (ooIi1IlIOOI.hasNext()) {
                        this.I00iOIl++;
/* 21 */                return ooIi1IlIOOI.next();
                    }
/* 26 */            Object[] objArr = this.I00iiO;
/* 28 */            int i = this.I00iOIl;
/* 32 */            this.I00iOIl = i + 1;
/* 37 */            return objArr[i - ooIi1IlIOOI.I00iiI];
                }

                @Override
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 34 */                IoOOl0iOl1io.I00000oOI();
/* 37 */                return null;
                    }
/* 7 */             int i = this.I00iOIl;
/* 9 */             OoIi1IlIOOI ooIi1IlIOOI = this.I00iio;
/* 11 */            int i2 = ooIi1IlIOOI.I00iiI;
/* 13 */            if (i <= i2) {
/* 27 */                this.I00iOIl = i - 1;
/* 29 */                return ooIi1IlIOOI.previous();
                    }
/* 15 */            Object[] objArr = this.I00iiO;
                    int i3 = i - 1;
/* 19 */            this.I00iOIl = i3;
/* 22 */            return objArr[i3 - i2];
                }
            }

            package p000;
            
            public final class OoIi1IlIOOI extends I01IO1il {
                public int I00iiO;
                public Object[] I00iio;
                public boolean I00ilI0I1;

                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v3 */
                public OoIi1IlIOOI(int i, int i2, int i3, Object[] objArr) {
/* 1 */             super(i, i2);
/* 4 */             this.I00iiO = i3;
/* 6 */             Object[] objArr2 = new Object[i3];
/* 8 */             this.I00iio = objArr2;
/* 16 */            ?? r4 = i == i2 ? 1 : 0;
/* 17 */            this.I00ilI0I1 = r4;
/* 19 */            objArr2[0] = objArr;
/* 22 */            I00000oOI(i - r4, 1);
                }

                public final Object I00000oIO() {
/* 15 */            return ((Object[]) this.I00iio[this.I00iiO - 1])[this.I00iOIl & 31];
                }

                public final void I00000oOI(int i, int i2) {
/* 4 */             int i3 = (this.I00iiO - i2) * 5;
/* 8 */             while (i2 < this.I00iiO) {
/* 10 */                Object[] objArr = this.I00iio;
/* 24 */                objArr[i2] = ((Object[]) objArr[i2 - 1])[li1IOiiI.I00000oIO(i, i3)];
                        i3 -= 5;
/* 28 */                i2++;
                    }
                }

                public final void I0000Il00O(int i) {
/* 1 */             int i2 = 0;
/* 8 */             while (li1IOiiI.I00000oIO(this.I00iOIl, i2) == i) {
/* 10 */                i2 += 5;
                    }
/* 13 */            if (i2 > 0) {
/* 26 */                I00000oOI(this.I00iOIl, ((this.I00iiO - 1) - (i2 / 5)) + 1);
                    }
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 29 */                IoOOl0iOl1io.I00000oOI();
/* 32 */                return null;
                    }
/* 7 */             Object objI00000oIO = I00000oIO();
/* 14 */            int i = this.I00iOIl + 1;
/* 15 */            this.I00iOIl = i;
/* 19 */            if (i == this.I00iiI) {
/* 21 */                this.I00ilI0I1 = true;
/* 23 */                return objI00000oIO;
                    }
/* 25 */            I0000Il00O(0);
/* 28 */            return objI00000oIO;
                }

                @Override
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 35 */                IoOOl0iOl1io.I00000oOI();
/* 38 */                return null;
                    }
                    this.I00iOIl--;
/* 15 */            if (this.I00ilI0I1) {
/* 18 */                this.I00ilI0I1 = false;
/* 20 */                return I00000oIO();
                    }
/* 27 */            I0000Il00O(31);
/* 30 */            return I00000oIO();
                }
            }

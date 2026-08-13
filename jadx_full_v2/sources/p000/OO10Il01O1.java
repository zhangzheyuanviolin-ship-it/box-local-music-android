            package p000;
            
            public final class OO10Il01O1 extends I01IO1il {
                public OO100II1 I00iiO;
                public int I00iio;
                public OoIi1IlIOOI I00ilI0I1;
                public int I00ilO0;

                public final void I00000oIO() {
/* 9 */             if (this.I00iio == this.I00iiO.I000iOII()) {
/* 11 */                return;
                    }
/* 12 */            I000II.I001IIilI0O();
                }

                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r0v6 */
                public final void I00000oOI() {
/* 1 */             OO100II1 oo100ii1 = this.I00iiO;
/* 3 */             Object[] objArr = oo100ii1.I00ilO0;
/* 5 */             if (objArr == null) {
/* 8 */                 this.I00ilI0I1 = null;
/* 10 */                return;
                    }
/* 15 */            int i = (oo100ii1.I00ioIO - 1) & (-32);
/* 17 */            int i2 = this.I00iOIl;
/* 19 */            if (i2 > i) {
/* 21 */                i2 = i;
                    }
/* 26 */            int i3 = (oo100ii1.I00iio / 5) + 1;
/* 27 */            OoIi1IlIOOI ooIi1IlIOOI = this.I00ilI0I1;
/* 29 */            if (ooIi1IlIOOI == null) {
/* 36 */                this.I00ilI0I1 = new OoIi1IlIOOI(i2, i, i3, objArr);
/* 38 */                return;
                    }
/* 39 */            ooIi1IlIOOI.I00iOIl = i2;
/* 41 */            ooIi1IlIOOI.I00iiI = i;
/* 43 */            ooIi1IlIOOI.I00iiO = i3;
/* 45 */            Object[] objArr2 = ooIi1IlIOOI.I00iio;
/* 48 */            if (objArr2.length < i3) {
/* 50 */                objArr2 = new Object[i3];
/* 52 */                ooIi1IlIOOI.I00iio = objArr2;
                    }
/* 55 */            objArr2[0] = objArr;
/* 57 */            ?? r0 = i2 == i ? 1 : 0;
/* 60 */            ooIi1IlIOOI.I00ilI0I1 = r0;
/* 63 */            ooIi1IlIOOI.I00000oOI(i2 - r0, 1);
                }

                @Override
                public final void add(Object obj) {
/* 1 */             I00000oIO();
/* 4 */             OO100II1 oo100ii1 = this.I00iiO;
/* 8 */             oo100ii1.add(this.I00iOIl, obj);
                    this.I00iOIl++;
/* 21 */            this.I00iiI = oo100ii1.I00000oOI();
/* 27 */            this.I00iio = oo100ii1.I000iOII();
/* 30 */            this.I00ilO0 = -1;
/* 32 */            I00000oOI();
                }

                @Override
                public final Object next() {
/* 1 */             OO100II1 oo100ii1 = this.I00iiO;
/* 3 */             I00000oIO();
/* 10 */            if (!hasNext()) {
/* 60 */                IoOOl0iOl1io.I00000oOI();
/* 63 */                return null;
                    }
/* 12 */            int i = this.I00iOIl;
/* 14 */            this.I00ilO0 = i;
/* 16 */            OoIi1IlIOOI ooIi1IlIOOI = this.I00ilI0I1;
/* 18 */            if (ooIi1IlIOOI == null) {
/* 20 */                Object[] objArr = oo100ii1.I00io1l;
/* 24 */                this.I00iOIl = i + 1;
/* 26 */                return objArr[i];
                    }
/* 33 */            if (ooIi1IlIOOI.hasNext()) {
                        this.I00iOIl++;
/* 41 */                return ooIi1IlIOOI.next();
                    }
/* 46 */            Object[] objArr2 = oo100ii1.I00io1l;
/* 48 */            int i2 = this.I00iOIl;
/* 52 */            this.I00iOIl = i2 + 1;
/* 57 */            return objArr2[i2 - ooIi1IlIOOI.I00iiI];
                }

                @Override
                public final Object previous() {
/* 1 */             OO100II1 oo100ii1 = this.I00iiO;
/* 3 */             I00000oIO();
/* 10 */            if (!hasPrevious()) {
/* 54 */                IoOOl0iOl1io.I00000oOI();
/* 57 */                return null;
                    }
/* 12 */            int i = this.I00iOIl;
/* 16 */            this.I00ilO0 = i - 1;
/* 18 */            OoIi1IlIOOI ooIi1IlIOOI = this.I00ilI0I1;
/* 20 */            if (ooIi1IlIOOI == null) {
/* 22 */                Object[] objArr = oo100ii1.I00io1l;
                        int i2 = i - 1;
/* 26 */                this.I00iOIl = i2;
/* 28 */                return objArr[i2];
                    }
/* 31 */            int i3 = ooIi1IlIOOI.I00iiI;
/* 33 */            if (i <= i3) {
/* 47 */                this.I00iOIl = i - 1;
/* 49 */                return ooIi1IlIOOI.previous();
                    }
/* 35 */            Object[] objArr2 = oo100ii1.I00io1l;
                    int i4 = i - 1;
/* 39 */            this.I00iOIl = i4;
/* 42 */            return objArr2[i4 - i3];
                }

                @Override
                public final void remove() {
/* 1 */             OO100II1 oo100ii1 = this.I00iiO;
/* 3 */             I00000oIO();
/* 6 */             int i = this.I00ilO0;
/* 9 */             if (i == -1) {
/* 40 */                IOOlIIilOl0.I000iOII();
/* 55 */                return;
                    }
/* 11 */            oo100ii1.I0000O(i);
/* 14 */            int i2 = this.I00ilO0;
/* 18 */            if (i2 < this.I00iOIl) {
/* 20 */                this.I00iOIl = i2;
                    }
/* 26 */            this.I00iiI = oo100ii1.I00000oOI();
/* 32 */            this.I00iio = oo100ii1.I000iOII();
/* 34 */            this.I00ilO0 = -1;
/* 36 */            I00000oOI();
                }

                @Override
                public final void set(Object obj) {
/* 1 */             I00000oIO();
/* 4 */             int i = this.I00ilO0;
/* 7 */             if (i == -1) {
/* 24 */                IOOlIIilOl0.I000iOII();
/* 29 */                return;
                    }
/* 9 */             OO100II1 oo100ii1 = this.I00iiO;
/* 11 */            oo100ii1.set(i, obj);
/* 18 */            this.I00iio = oo100ii1.I000iOII();
/* 20 */            I00000oOI();
                }
            }

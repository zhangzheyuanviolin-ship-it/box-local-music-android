            package p000;
            
            public final class O0lio0 implements OlO01l1oOil {
                public final int I00iOIl;
                public final int I00iiI;
                public final OIooliIO0 I00iiO;
                public int I00iio;

                public O0lio0(int i, int i2, int i3) {
/* 4 */             this.I00iOIl = i2;
/* 6 */             this.I00iiI = i3;
/* 10 */            int i4 = (i / i2) * i2;
/* 31 */            this.I00iiO = new OIooliIO0(lIiioliIlo.I000O01llI0(Math.max(i4 - i3, 0), i4 + i2 + i3), Io1Oioii1111.I00ilO0);
/* 33 */            this.I00iio = i;
                }

                public final void I00000oIO(int i) {
/* 3 */             if (i != this.I00iio) {
/* 5 */                 this.I00iio = i;
/* 7 */                 int i2 = this.I00iOIl;
/* 10 */                int i3 = (i / i2) * i2;
/* 11 */                int i4 = this.I00iiI;
/* 28 */                this.I00iiO.setValue(lIiioliIlo.I000O01llI0(Math.max(i3 - i4, 0), i3 + i2 + i4));
                    }
                }

                @Override
                public final Object getValue() {
/* 7 */             return (IooO11l) this.I00iiO.getValue();
                }
            }

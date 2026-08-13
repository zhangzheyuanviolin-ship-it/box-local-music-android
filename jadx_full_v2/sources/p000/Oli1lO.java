            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class Oli1lO implements OilO0iOl, Iio0iiOlIOil {
                public final OilO0iOl I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public Oli1lO(OilO0iOl oilO0iOl, int i, int i2) {
/* 4 */             this.I00000oIO = oilO0iOl;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
/* 11 */            if (i < 0) {
/* 46 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "startIndex should be non-negative, but is "));
/* 215 */               throw null;
                    }
/* 13 */            if (i2 < 0) {
/* 36 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i2, "endIndex should be non-negative, but is "));
/* 39 */                throw null;
                    }
/* 15 */            if (i2 >= i) {
/* 17 */                return;
                    }
/* 26 */            I000II.I0010I0i(IIl001iO0Io.I000l1(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
/* 29 */            throw null;
                }

                @Override
                public final OilO0iOl I00000oIO(int i) {
/* 1 */             int i2 = this.I0000Il00O;
/* 3 */             int i3 = this.I00000oOI;
                    return i >= i2 - i3 ? this : new Oli1lO(this.I00000oIO, i3, i + i3);
                }

                @Override
                public final OilO0iOl I00000oOI(int i) {
/* 1 */             int i2 = this.I0000Il00O;
/* 3 */             int i3 = this.I00000oOI;
                    return i >= i2 - i3 ? Il01lilOo00I.I00000oIO : new Oli1lO(this.I00000oIO, i3 + i, i2);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             Io00llIoO1lO io00llIoO1lO = new Io00llIoO1lO(3);
/* 7 */             io00llIoO1lO.I00iio = this;
/* 15 */            io00llIoO1lO.I00iiO = this.I00000oIO.iterator();
/* 17 */            VarHandle.storeStoreFence();
/* 29 */            return io00llIoO1lO;
                }
            }

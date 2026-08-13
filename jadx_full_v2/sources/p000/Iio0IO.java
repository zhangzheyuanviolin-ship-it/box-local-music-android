            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class Iio0IO implements OilO0iOl, Iio0iiOlIOil {
                public final int I00000oIO;
                public final OilO0iOl I00000oOI;
                public final int I0000Il00O;

                public Iio0IO(OilO0iOl oilO0iOl, int i, int i2) {
/* 1 */             this.I00000oIO = i2;
                    switch (i2) {
                        case 1:
/* 32 */                    this.I00000oOI = oilO0iOl;
/* 34 */                    this.I0000Il00O = i;
/* 36 */                    if (i >= 0) {
/* 38 */                        return;
                            }
/* 43 */                    I000II.I0010I0i(Oi010OO0.I0010I0i("count must be non-negative, but was ", i, '.'));
/* 46 */                    throw null;
                        default:
/* 14 */                    this.I00000oOI = oilO0iOl;
/* 16 */                    this.I0000Il00O = i;
/* 18 */                    if (i >= 0) {
/* 20 */                        return;
                            }
/* 25 */                    I000II.I0010I0i(Oi010OO0.I0010I0i("count must be non-negative, but was ", i, '.'));
/* 28 */                    throw null;
                    }
                }

                @Override
                public final OilO0iOl I00000oIO(int i) {
/* 1 */             int i2 = this.I00000oIO;
/* 4 */             OilO0iOl oilO0iOl = this.I00000oOI;
/* 6 */             int i3 = this.I0000Il00O;
                    switch (i2) {
                        case 0:
/* 20 */                    int i4 = i3 + i;
                            return i4 < 0 ? new Iio0IO(this, i, 1) : new Oli1lO(oilO0iOl, i3, i4);
                        default:
                            return i >= i3 ? this : new Iio0IO(oilO0iOl, i, 1);
                    }
                }

                @Override
                public final OilO0iOl I00000oOI(int i) {
/* 1 */             int i2 = this.I00000oIO;
/* 3 */             OilO0iOl oilO0iOl = this.I00000oOI;
/* 5 */             int i3 = this.I0000Il00O;
                    switch (i2) {
                        case 0:
/* 21 */                    int i4 = i3 + i;
                            return i4 < 0 ? new Iio0IO(this, i, 0) : new Iio0IO(oilO0iOl, i4, 0);
                        default:
                            return i >= i3 ? Il01lilOo00I.I00000oIO : new Oli1lO(oilO0iOl, i, i3);
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             OilO0iOl oilO0iOl = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 31 */                    Iio0IIOo iio0IIOo = new Iio0IIOo(0);
/* 38 */                    iio0IIOo.I00iiI = oilO0iOl.iterator();
/* 40 */                    iio0IIOo.I00iiO = i2;
/* 42 */                    VarHandle.storeStoreFence();
/* 45 */                    return iio0IIOo;
                        default:
/* 13 */                    Iio0IIOo iio0IIOo2 = new Iio0IIOo(2);
/* 16 */                    iio0IIOo2.I00iiO = i2;
/* 22 */                    iio0IIOo2.I00iiI = oilO0iOl.iterator();
/* 24 */                    VarHandle.storeStoreFence();
/* 27 */                    return iio0IIOo2;
                    }
                }
            }

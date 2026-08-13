            package p000;

            import java.util.Iterator;
            
/* 34 */    public abstract class OO0ll1OIlIO0 implements Iterator, O0IlIoi {
                public int I00iiI;
                public final Object[] I00iio;
                public final int I00iOIl = 0;
                public boolean I00iiO = true;

                public OO0ll1OIlIO0(OoIi1O0 ooIi1O0, OoIiOIo0i010[] ooIiOIo0i010Arr) {
/* 7 */             this.I00iio = ooIiOIo0i010Arr;
/* 12 */            OoIiOIo0i010 ooIiOIo0i010 = ooIiOIo0i010Arr[0];
/* 14 */            Object[] objArr = ooIi1O0.I0000Il00O;
/* 22 */            int iBitCount = Integer.bitCount(ooIi1O0.I00000oIO) * 2;
/* 24 */            ooIiOIo0i010.I00iiI = objArr;
/* 26 */            ooIiOIo0i010.I00iiO = iBitCount;
/* 28 */            ooIiOIo0i010.I00iio = 0;
/* 30 */            this.I00iiI = 0;
/* 32 */            I00000oOI();
                }

                public void I00000oIO() {
/* 3 */             OoIiOIo0i010[] ooIiOIo0i010Arr = (OoIiOIo0i010[]) this.I00iio;
/* 5 */             int i = this.I00iiI;
/* 7 */             OoIiOIo0i010 ooIiOIo0i010 = ooIiOIo0i010Arr[i];
/* 13 */            if (ooIiOIo0i010.I00iio < ooIiOIo0i010.I00iiO) {
/* 15 */                return;
                    }
/* 18 */            while (-1 < i) {
/* 20 */                int iI0000Il00O = I0000Il00O(i);
/* 24 */                if (iI0000Il00O == -1) {
/* 26 */                    OoIiOIo0i010 ooIiOIo0i0102 = ooIiOIo0i010Arr[i];
/* 28 */                    int i2 = ooIiOIo0i0102.I00iio;
/* 30 */                    Object[] objArr = ooIiOIo0i0102.I00iiI;
/* 33 */                    if (i2 < objArr.length) {
/* 35 */                        int length = objArr.length;
/* 38 */                        ooIiOIo0i0102.I00iio = i2 + 1;
/* 40 */                        iI0000Il00O = I0000Il00O(i);
                            }
                        }
/* 44 */                if (iI0000Il00O != -1) {
/* 46 */                    this.I00iiI = iI0000Il00O;
/* 48 */                    return;
                        }
/* 49 */                if (i > 0) {
/* 53 */                    OoIiOIo0i010 ooIiOIo0i0103 = ooIiOIo0i010Arr[i - 1];
/* 55 */                    int i3 = ooIiOIo0i0103.I00iio;
/* 59 */                    int length2 = ooIiOIo0i0103.I00iiI.length;
/* 62 */                    ooIiOIo0i0103.I00iio = i3 + 1;
                        }
/* 70 */                ooIiOIo0i010Arr[i].I00000oIO(OoIiIlIo.I0000oI00.I0000O, 0, 0);
                        i--;
                    }
/* 76 */            this.I00iiO = false;
                }

                public void I00000oOI() {
/* 3 */             OoIiOIo0i010[] ooIiOIo0i010Arr = (OoIiOIo0i010[]) this.I00iio;
/* 5 */             int i = this.I00iiI;
/* 7 */             OoIiOIo0i010 ooIiOIo0i010 = ooIiOIo0i010Arr[i];
/* 13 */            if (ooIiOIo0i010.I00iio < ooIiOIo0i010.I00iiO) {
/* 15 */                return;
                    }
/* 18 */            while (-1 < i) {
/* 20 */                int iI0000O = I0000O(i);
/* 24 */                if (iI0000O == -1) {
/* 26 */                    OoIiOIo0i010 ooIiOIo0i0102 = ooIiOIo0i010Arr[i];
/* 28 */                    int i2 = ooIiOIo0i0102.I00iio;
/* 30 */                    Object[] objArr = ooIiOIo0i0102.I00iiI;
/* 33 */                    if (i2 < objArr.length) {
/* 35 */                        int length = objArr.length;
/* 38 */                        ooIiOIo0i0102.I00iio = i2 + 1;
/* 40 */                        iI0000O = I0000O(i);
                            }
                        }
/* 44 */                if (iI0000O != -1) {
/* 46 */                    this.I00iiI = iI0000O;
/* 48 */                    return;
                        }
/* 49 */                if (i > 0) {
/* 53 */                    OoIiOIo0i010 ooIiOIo0i0103 = ooIiOIo0i010Arr[i - 1];
/* 55 */                    int i3 = ooIiOIo0i0103.I00iio;
/* 59 */                    int length2 = ooIiOIo0i0103.I00iiI.length;
/* 62 */                    ooIiOIo0i0103.I00iio = i3 + 1;
                        }
/* 64 */                OoIiOIo0i010 ooIiOIo0i0104 = ooIiOIo0i010Arr[i];
/* 70 */                ooIiOIo0i0104.I00iiI = OoIi1O0.I0000O.I0000Il00O;
/* 72 */                ooIiOIo0i0104.I00iiO = 0;
/* 74 */                ooIiOIo0i0104.I00iio = 0;
                        i--;
                    }
/* 79 */            this.I00iiO = false;
                }

                public int I0000Il00O(int i) {
/* 3 */             OoIiOIo0i010[] ooIiOIo0i010Arr = (OoIiOIo0i010[]) this.I00iio;
/* 5 */             OoIiOIo0i010 ooIiOIo0i010 = ooIiOIo0i010Arr[i];
/* 7 */             int i2 = ooIiOIo0i010.I00iio;
/* 11 */            if (i2 < ooIiOIo0i010.I00iiO) {
/* 13 */                return i;
                    }
/* 14 */            Object[] objArr = ooIiOIo0i010.I00iiI;
/* 17 */            if (i2 >= objArr.length) {
/* 63 */                return -1;
                    }
/* 19 */            int length = objArr.length;
/* 22 */            OoIiIlIo ooIiIlIo = (OoIiIlIo) objArr[i2];
/* 26 */            if (i == 6) {
/* 30 */                OoIiOIo0i010 ooIiOIo0i0102 = ooIiOIo0i010Arr[i + 1];
/* 32 */                Object[] objArr2 = ooIiIlIo.I0000O;
/* 35 */                ooIiOIo0i0102.I00000oIO(objArr2, objArr2.length, 0);
                    } else {
/* 53 */                ooIiOIo0i010Arr[i + 1].I00000oIO(ooIiIlIo.I0000O, Integer.bitCount(ooIiIlIo.I00000oIO) * 2, 0);
                    }
/* 58 */            return I0000Il00O(i + 1);
                }

                public int I0000O(int i) {
/* 3 */             OoIiOIo0i010[] ooIiOIo0i010Arr = (OoIiOIo0i010[]) this.I00iio;
/* 5 */             OoIiOIo0i010 ooIiOIo0i010 = ooIiOIo0i010Arr[i];
/* 7 */             int i2 = ooIiOIo0i010.I00iio;
/* 11 */            if (i2 < ooIiOIo0i010.I00iiO) {
/* 13 */                return i;
                    }
/* 14 */            Object[] objArr = ooIiOIo0i010.I00iiI;
/* 17 */            if (i2 >= objArr.length) {
/* 67 */                return -1;
                    }
/* 19 */            int length = objArr.length;
/* 22 */            OoIi1O0 ooIi1O0 = (OoIi1O0) objArr[i2];
/* 24 */            Object[] objArr2 = ooIi1O0.I0000Il00O;
/* 28 */            if (i == 6) {
/* 32 */                OoIiOIo0i010 ooIiOIo0i0102 = ooIiOIo0i010Arr[i + 1];
/* 34 */                int length2 = objArr2.length;
/* 35 */                ooIiOIo0i0102.I00iiI = objArr2;
/* 37 */                ooIiOIo0i0102.I00iiO = length2;
/* 39 */                ooIiOIo0i0102.I00iio = 0;
                    } else {
/* 44 */                OoIiOIo0i010 ooIiOIo0i0103 = ooIiOIo0i010Arr[i + 1];
/* 52 */                int iBitCount = Integer.bitCount(ooIi1O0.I00000oIO) * 2;
/* 54 */                ooIiOIo0i0103.I00iiI = objArr2;
/* 56 */                ooIiOIo0i0103.I00iiO = iBitCount;
/* 58 */                ooIiOIo0i0103.I00iio = 0;
                    }
/* 62 */            return I0000O(i + 1);
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiO;
                }

                @Override
                public Object next() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object[] objArr = this.I00iio;
                    switch (i) {
                        case 0:
/* 33 */                    if (!this.I00iiO) {
/* 49 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 41 */                        Object next = ((OoIiOIo0i010[]) objArr)[this.I00iiI].next();
/* 45 */                        I00000oOI();
                                break;
                            }
                        default:
/* 11 */                    if (!this.I00iiO) {
/* 27 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 19 */                        Object next2 = ((OoIiOIo0i010[]) objArr)[this.I00iiI].next();
/* 23 */                        I00000oIO();
                                break;
                            }
                    }
/* 3 */             return null;
                }

                @Override
                public void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

/* 35 */        public OO0ll1OIlIO0(OoIiIlIo ooIiIlIo, OoIiOIo0i010[] ooIiOIo0i010Arr) {
/* 37 */            this.I00iio = ooIiOIo0i010Arr;
/* 42 */            ooIiOIo0i010Arr[0].I00000oIO(ooIiIlIo.I0000O, Integer.bitCount(ooIiIlIo.I00000oIO) * 2, 0);
/* 43 */            this.I00iiI = 0;
/* 44 */            I00000oIO();
                }
            }

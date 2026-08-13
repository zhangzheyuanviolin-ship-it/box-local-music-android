            package p000;

            import java.util.AbstractList;
            import java.util.ListIterator;
            
/* 27 */    public final class Io1ioiIIO1lI implements ListIterator, O0IlIoi {
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;

                public Io1ioiIIO1lI(Ol1o0O0O0 ol1o0O0O0, int i) {
/* 2 */             this.I00iOIl = 3;
/* 7 */             this.I00ilI0I1 = ol1o0O0O0;
/* 11 */            this.I00iiI = i - 1;
/* 14 */            this.I00iiO = -1;
/* 26 */            this.I00iio = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
                }

                public void I00000oIO() {
/* 13 */            if (((AbstractList) ((O101iIOO) this.I00ilI0I1).I00ilI0I1).modCount == this.I00iio) {
/* 15 */                return;
                    }
/* 16 */            I000II.I001IIilI0O();
                }

                public void I00000oOI() {
/* 11 */            if (((AbstractList) ((O101lO1) this.I00ilI0I1)).modCount == this.I00iio) {
/* 13 */                return;
                    }
/* 14 */            I000II.I001IIilI0O();
                }

                public void I0000Il00O() {
/* 17 */            if (((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(((Ol1o0O0O0) this.I00ilI0I1).I00iOIl)).I0000oI00 == this.I00iio) {
/* 19 */                return;
                    }
/* 20 */            I000II.I001IIilI0O();
                }

                @Override
                public final void add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 99 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 67 */                    I00000oIO();
/* 72 */                    O101iIOO o101iIOO = (O101iIOO) this.I00ilI0I1;
/* 74 */                    int i = this.I00iiI;
/* 78 */                    this.I00iiI = i + 1;
/* 80 */                    o101iIOO.add(i, obj);
/* 83 */                    this.I00iiO = -1;
/* 89 */                    this.I00iio = ((AbstractList) o101iIOO).modCount;
/* 91 */                    return;
                        case 2:
/* 42 */                    I00000oOI();
/* 47 */                    O101lO1 o101lO1 = (O101lO1) this.I00ilI0I1;
/* 49 */                    int i2 = this.I00iiI;
/* 53 */                    this.I00iiI = i2 + 1;
/* 55 */                    o101lO1.add(i2, obj);
/* 58 */                    this.I00iiO = -1;
/* 64 */                    this.I00iio = ((AbstractList) o101lO1).modCount;
/* 66 */                    return;
                        default:
/* 7 */                     I0000Il00O();
/* 12 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilI0I1;
/* 18 */                    ol1o0O0O0.add(this.I00iiI + 1, obj);
/* 21 */                    this.I00iiO = -1;
                            this.I00iiI++;
/* 39 */                    this.I00iio = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 41 */                    return;
                    }
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 51 */                    if (this.I00iiI < this.I00iio) {
                                break;
                            }
                            break;
                        case 1:
/* 43 */                    if (this.I00iiI < ((O101iIOO) this.I00ilI0I1).I00iiO) {
                                break;
                            }
                            break;
                        case 2:
/* 31 */                    if (this.I00iiI < ((O101lO1) this.I00ilI0I1).I00iiI) {
                                break;
                            }
                            break;
                        default:
/* 19 */                    if (this.I00iiI < ((Ol1o0O0O0) this.I00ilI0I1).size() - 1) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean hasPrevious() {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    if (this.I00iiI > this.I00iiO) {
                            }
                            break;
                        case 1:
/* 24 */                    if (this.I00iiI > 0) {
                            }
                            break;
                        case 2:
/* 16 */                    if (this.I00iiI > 0) {
                            }
                            break;
                        default:
/* 8 */                     if (this.I00iiI >= 0) {
                            }
                            break;
                    }
/* 12 */            return false;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 97 */                    OI0oiiIO0 oI0oiiIO0 = ((Io1l0iI11iII) this.I00ilI0I1).I00iOIl;
/* 99 */                    int i = this.I00iiI;
/* 103 */                   this.I00iiI = i + 1;
/* 109 */                   return (O1ooOo) oI0oiiIO0.I000II(i);
                        case 1:
/* 62 */                    I00000oIO();
/* 65 */                    int i2 = this.I00iiI;
/* 69 */                    O101iIOO o101iIOO = (O101iIOO) this.I00ilI0I1;
/* 73 */                    if (i2 >= o101iIOO.I00iiO) {
/* 89 */                        IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 77 */                    this.I00iiI = i2 + 1;
/* 79 */                    this.I00iiO = i2;
/* 86 */                    return o101iIOO.I00iOIl[o101iIOO.I00iiI + i2];
                        case 2:
/* 34 */                    I00000oOI();
/* 37 */                    int i3 = this.I00iiI;
/* 41 */                    O101lO1 o101lO1 = (O101lO1) this.I00ilI0I1;
/* 45 */                    if (i3 >= o101lO1.I00iiI) {
/* 58 */                        IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 49 */                    this.I00iiI = i3 + 1;
/* 51 */                    this.I00iiO = i3;
/* 55 */                    return o101lO1.I00iOIl[i3];
                        default:
/* 7 */                     I0000Il00O();
/* 12 */                    int i4 = this.I00iiI + 1;
/* 14 */                    this.I00iiO = i4;
/* 18 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilI0I1;
/* 24 */                    iO0oloi1IO0.I0000Il00O(i4, ol1o0O0O0.size());
/* 27 */                    Object obj = ol1o0O0O0.get(i4);
/* 31 */                    this.I00iiI = i4;
/* 33 */                    return obj;
                    }
                }

                @Override
                public final int nextIndex() {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    return this.I00iiI - this.I00iiO;
                        case 1:
/* 14 */                    return this.I00iiI;
                        case 2:
/* 11 */                    return this.I00iiI;
                        default:
/* 8 */                     return this.I00iiI + 1;
                    }
                }

                @Override
                public final Object previous() {
                    switch (this.I00iOIl) {
                        case 0:
/* 97 */                    OI0oiiIO0 oI0oiiIO0 = ((Io1l0iI11iII) this.I00ilI0I1).I00iOIl;
                            int i = this.I00iiI - 1;
/* 103 */                   this.I00iiI = i;
/* 109 */                   return (O1ooOo) oI0oiiIO0.I000II(i);
                        case 1:
/* 64 */                    I00000oIO();
/* 67 */                    int i2 = this.I00iiI;
/* 69 */                    if (i2 <= 0) {
/* 89 */                        IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
                            int i3 = i2 - 1;
/* 73 */                    this.I00iiI = i3;
/* 75 */                    this.I00iiO = i3;
/* 79 */                    O101iIOO o101iIOO = (O101iIOO) this.I00ilI0I1;
/* 86 */                    return o101iIOO.I00iOIl[o101iIOO.I00iiI + i3];
                        case 2:
/* 38 */                    I00000oOI();
/* 41 */                    int i4 = this.I00iiI;
/* 43 */                    if (i4 <= 0) {
/* 60 */                        IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
                            int i5 = i4 - 1;
/* 47 */                    this.I00iiI = i5;
/* 49 */                    this.I00iiO = i5;
/* 57 */                    return ((O101lO1) this.I00ilI0I1).I00iOIl[i5];
                        default:
/* 7 */                     I0000Il00O();
/* 10 */                    int i6 = this.I00iiI;
/* 14 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilI0I1;
/* 20 */                    iO0oloi1IO0.I0000Il00O(i6, ol1o0O0O0.size());
/* 23 */                    int i7 = this.I00iiI;
/* 25 */                    this.I00iiO = i7;
                            this.I00iiI--;
/* 27 */                    return ol1o0O0O0.get(i7);
                    }
                }

                @Override
                public final int previousIndex() {
                    int i;
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    return (this.I00iiI - this.I00iiO) - 1;
                        case 1:
/* 14 */                    i = this.I00iiI;
                            break;
                        case 2:
/* 9 */                     i = this.I00iiI;
                            break;
                        default:
/* 6 */                     return this.I00iiI;
                    }
/* 11 */            return i - 1;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 110 */                   throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 74 */                    O101iIOO o101iIOO = (O101iIOO) this.I00ilI0I1;
/* 76 */                    I00000oIO();
/* 79 */                    int i = this.I00iiO;
/* 81 */                    if (i == -1) {
/* 99 */                        I000II.I001IO000("Call next() or previous() before removing element from the iterator.");
/* 102 */                       return;
                            }
/* 83 */                    o101iIOO.I0000O(i);
/* 88 */                    this.I00iiI = this.I00iiO;
/* 90 */                    this.I00iiO = -1;
/* 96 */                    this.I00iio = ((AbstractList) o101iIOO).modCount;
/* 102 */                   return;
                        case 2:
/* 43 */                    O101lO1 o101lO1 = (O101lO1) this.I00ilI0I1;
/* 45 */                    I00000oOI();
/* 48 */                    int i2 = this.I00iiO;
/* 50 */                    if (i2 == -1) {
/* 68 */                        I000II.I001IO000("Call next() or previous() before removing element from the iterator.");
/* 71 */                        return;
                            }
/* 52 */                    o101lO1.I0000O(i2);
/* 57 */                    this.I00iiI = this.I00iiO;
/* 59 */                    this.I00iiO = -1;
/* 65 */                    this.I00iio = ((AbstractList) o101lO1).modCount;
/* 71 */                    return;
                        default:
/* 9 */                     I0000Il00O();
/* 14 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilI0I1;
/* 18 */                    ol1o0O0O0.remove(this.I00iiO);
                            this.I00iiI--;
/* 26 */                    this.I00iiO = -1;
/* 38 */                    this.I00iio = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 40 */                    return;
                    }
                }

                @Override
                public final void set(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 87 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 61 */                    I00000oIO();
/* 64 */                    int i = this.I00iiO;
/* 66 */                    if (i != -1) {
/* 72 */                        ((O101iIOO) this.I00ilI0I1).set(i, obj);
/* 79 */                        return;
                            } else {
/* 76 */                        I000II.I001IO000("Call next() or previous() before replacing element from the iterator.");
/* 79 */                        return;
                            }
                        case 2:
/* 42 */                    I00000oOI();
/* 45 */                    int i2 = this.I00iiO;
/* 47 */                    if (i2 != -1) {
/* 53 */                        ((O101lO1) this.I00ilI0I1).set(i2, obj);
/* 60 */                        return;
                            } else {
/* 57 */                        I000II.I001IO000("Call next() or previous() before replacing element from the iterator.");
/* 60 */                        return;
                            }
                        default:
/* 11 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilI0I1;
/* 13 */                    I0000Il00O();
/* 16 */                    int i3 = this.I00iiO;
/* 18 */                    if (i3 < 0) {
/* 38 */                        I000II.I001IO000("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
/* 41 */                        return;
                            } else {
/* 20 */                        ol1o0O0O0.set(i3, obj);
/* 33 */                        this.I00iio = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 41 */                        return;
                            }
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 28 */        public Io1ioiIIO1lI(Io1l0iI11iII io1l0iI11iII, int i, int i2) {
/* 31 */            this(io1l0iI11iII, (i2 & 1) != 0 ? 0 : i, 0, io1l0iI11iII.I00iOIl.I00000oOI);
                    this.I00iOIl = 0;
                }

/* 31 */        public Io1ioiIIO1lI(int i) {
/* 32 */            this.I00iOIl = i;
                }

/* 32 */        public Io1ioiIIO1lI(Io1l0iI11iII io1l0iI11iII, int i, int i2, int i3) {
                    this.I00iOIl = 0;
                    this.I00ilI0I1 = io1l0iI11iII;
/* 34 */            this.I00iiI = i;
/* 35 */            this.I00iiO = i2;
/* 36 */            this.I00iio = i3;
                }
            }

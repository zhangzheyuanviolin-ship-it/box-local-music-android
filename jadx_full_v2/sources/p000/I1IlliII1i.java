            package p000;

            import java.util.Iterator;
            
/* 21 */    public final class I1IlliII1i implements Iterator, O0IlIoi {
                public int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public final int I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public I1IlliII1i(I1Io0i0II i1Io0i0II, int i) {
/* 10 */            this(i1Io0i0II.I00iiO);
/* 1 */             this.I00iio = i;
                    switch (i) {
                        case 1:
/* 14 */                    this.I00ilI0I1 = i1Io0i0II;
/* 18 */                    this(i1Io0i0II.I00iiO);
                            break;
                        default:
/* 6 */                     this.I00ilI0I1 = i1Io0i0II;
                            break;
                    }
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iiI < this.I00iOIl;
                }

                @Override
                public final Object next() {
                    Object objI000II;
/* 5 */             if (!hasNext()) {
/* 45 */                IoOOl0iOl1io.I00000oOI();
/* 48 */                return null;
                    }
/* 7 */             int i = this.I00iiI;
/* 9 */             int i2 = this.I00iio;
/* 11 */            Object obj = this.I00ilI0I1;
                    switch (i2) {
                        case 0:
/* 32 */                    objI000II = ((I1Io0i0II) obj).I000II(i);
                            break;
                        case 1:
/* 25 */                    objI000II = ((I1Io0i0II) obj).I000OiO(i);
                            break;
                        default:
/* 20 */                    objI000II = ((I1Io1oIoo) obj).I00iiI[i];
                            break;
                    }
                    this.I00iiI++;
/* 42 */            this.I00iiO = true;
/* 44 */            return objI000II;
                }

                @Override
                public final void remove() {
/* 3 */             if (!this.I00iiO) {
/* 47 */                I000II.I001IO000("Call next() before removing an element.");
/* 50 */                return;
                    }
                    int i = this.I00iiI - 1;
/* 9 */             this.I00iiI = i;
/* 11 */            int i2 = this.I00iio;
/* 13 */            Object obj = this.I00ilI0I1;
                    switch (i2) {
                        case 0:
/* 32 */                    ((I1Io0i0II) obj).I000O01llI0(i);
                            break;
                        case 1:
/* 26 */                    ((I1Io0i0II) obj).I000O01llI0(i);
                            break;
                        default:
/* 20 */                    ((I1Io1oIoo) obj).I00000oOI(i);
                            break;
                    }
                    this.I00iOIl--;
/* 42 */            this.I00iiO = false;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 22 */        public I1IlliII1i(I1Io1oIoo i1Io1oIoo) {
/* 25 */            this(i1Io1oIoo.I00iiO);
                    this.I00iio = 2;
/* 23 */            this.I00ilI0I1 = i1Io1oIoo;
                }

/* 25 */        public I1IlliII1i(int i) {
/* 27 */            this.I00iOIl = i;
                }
            }

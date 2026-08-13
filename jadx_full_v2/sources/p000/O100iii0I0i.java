            package p000;

            import java.util.AbstractMap;
            import java.util.Iterator;
            import java.util.Map;
            
/* 25 */    public abstract class O100iii0I0i implements Iterator {
                public int I00iiI;
                public Map.Entry I00iiO;
                public final AbstractMap I00ilI0I1;
                public final int I00iOIl = 0;
                public Map.Entry I00iio = null;

                public O100iii0I0i(iI0o1i0o ii0o1i0o) {
/* 7 */             this.I00ilI0I1 = ii0o1i0o;
/* 17 */            this.I00iiO = (iI0lliloO) ((iI0lliloO) ii0o1i0o.I00ilO0).I00ioIO;
/* 24 */            this.I00iiI = ii0o1i0o.I00iiO;
                }

                public O100l1 I00000oIO() {
/* 3 */             O100l1 o100l1 = (O100l1) this.I00iiO;
/* 7 */             O100l1O0IiiO o100l1O0IiiO = (O100l1O0IiiO) this.I00ilI0I1;
/* 12 */            if (o100l1 == o100l1O0IiiO.I00ilO0) {
/* 33 */                IoOOl0iOl1io.I00000oOI();
/* 11 */                return null;
                    }
/* 18 */            if (o100l1O0IiiO.I00ilI0I1 != this.I00iiI) {
/* 29 */                I000II.I001IIilI0O();
/* 11 */                return null;
                    }
/* 24 */            this.I00iiO = (O100l1) o100l1.I00l0I0l0lO1;
/* 26 */            this.I00iio = o100l1;
/* 28 */            return o100l1;
                }

                public O100l1 I00000oOI() {
/* 3 */             lo0olliO11 lo0ollio11 = (lo0olliO11) this.I00ilI0I1;
/* 7 */             O100l1 o100l1 = (O100l1) this.I00iiO;
/* 12 */            if (o100l1 == lo0ollio11.I00ilO0) {
/* 33 */                IoOOl0iOl1io.I00000oOI();
/* 11 */                return null;
                    }
/* 18 */            if (lo0ollio11.I00ilI0I1 != this.I00iiI) {
/* 29 */                I000II.I001IIilI0O();
/* 11 */                return null;
                    }
/* 24 */            this.I00iiO = (O100l1) o100l1.I00l0I0l0lO1;
/* 26 */            this.I00iio = o100l1;
/* 28 */            return o100l1;
                }

                public iI0lliloO I0000Il00O() {
/* 3 */             iI0o1i0o ii0o1i0o = (iI0o1i0o) this.I00ilI0I1;
/* 7 */             iI0lliloO ii0lliloo = (iI0lliloO) this.I00iiO;
/* 14 */            if (ii0lliloo == ((iI0lliloO) ii0o1i0o.I00ilO0)) {
/* 35 */                IoOOl0iOl1io.I00000oOI();
/* 13 */                return null;
                    }
/* 20 */            if (ii0o1i0o.I00iiO != this.I00iiI) {
/* 31 */                I000II.I001IIilI0O();
/* 13 */                return null;
                    }
/* 26 */            this.I00iiO = (iI0lliloO) ii0lliloo.I00ioIO;
/* 28 */            this.I00iio = ii0lliloo;
/* 30 */            return ii0lliloo;
                }

                public iI0lliloO I0000O() {
/* 3 */             iI0o1i0o ii0o1i0o = (iI0o1i0o) this.I00ilI0I1;
/* 7 */             iI0lliloO ii0lliloo = (iI0lliloO) this.I00iiO;
/* 14 */            if (ii0lliloo == ((iI0lliloO) ii0o1i0o.I00ilO0)) {
/* 35 */                IoOOl0iOl1io.I00000oOI();
/* 13 */                return null;
                    }
/* 20 */            if (ii0o1i0o.I00iiO != this.I00iiI) {
/* 31 */                I000II.I001IIilI0O();
/* 13 */                return null;
                    }
/* 26 */            this.I00iiO = (iI0lliloO) ii0lliloo.I00ioIO;
/* 28 */            this.I00iio = ii0lliloo;
/* 30 */            return ii0lliloo;
                }

                @Override
                public final boolean hasNext() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             AbstractMap abstractMap = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 58 */                    if (((O100l1) this.I00iiO) != ((O100l1O0IiiO) abstractMap).I00ilO0) {
                                break;
                            }
                            break;
                        case 1:
/* 46 */                    if (((iI0lliloO) this.I00iiO) != ((iI0lliloO) ((iI0o1i0o) abstractMap).I00ilO0)) {
                                break;
                            }
                            break;
                        case 2:
/* 32 */                    if (((iI0lliloO) this.I00iiO) != ((iI0lliloO) ((iI0o1i0o) abstractMap).I00ilO0)) {
                                break;
                            }
                            break;
                        default:
/* 18 */                    if (((O100l1) this.I00iiO) != ((lo0olliO11) abstractMap).I00ilO0) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    return I00000oIO();
                        case 1:
/* 16 */                    return I0000Il00O();
                        case 2:
/* 11 */                    return I0000O();
                        default:
/* 6 */                     return I00000oOI();
                    }
                }

                @Override
                public final void remove() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             AbstractMap abstractMap = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 76 */                    O100l1O0IiiO o100l1O0IiiO = (O100l1O0IiiO) abstractMap;
/* 80 */                    O100l1 o100l1 = (O100l1) this.I00iio;
/* 82 */                    if (o100l1 == null) {
/* 94 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 84 */                        o100l1O0IiiO.I0000Il00O(o100l1, true);
/* 87 */                        this.I00iio = null;
/* 91 */                        this.I00iiI = o100l1O0IiiO.I00ilI0I1;
                                break;
                            }
                        case 1:
/* 54 */                    iI0o1i0o ii0o1i0o = (iI0o1i0o) abstractMap;
/* 58 */                    iI0lliloO ii0lliloo = (iI0lliloO) this.I00iio;
/* 60 */                    if (ii0lliloo == null) {
/* 72 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 62 */                        ii0o1i0o.I0000Il00O(ii0lliloo, true);
/* 65 */                        this.I00iio = null;
/* 69 */                        this.I00iiI = ii0o1i0o.I00iiO;
                                break;
                            }
                        case 2:
/* 32 */                    iI0o1i0o ii0o1i0o2 = (iI0o1i0o) abstractMap;
/* 36 */                    iI0lliloO ii0lliloo2 = (iI0lliloO) this.I00iio;
/* 38 */                    if (ii0lliloo2 == null) {
/* 50 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 40 */                        ii0o1i0o2.I0000O(ii0lliloo2, true);
/* 43 */                        this.I00iio = null;
/* 47 */                        this.I00iiI = ii0o1i0o2.I00iiO;
                                break;
                            }
                        default:
/* 12 */                    O100l1 o100l12 = (O100l1) this.I00iio;
/* 14 */                    if (o100l12 == null) {
/* 28 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 16 */                        lo0olliO11 lo0ollio11 = (lo0olliO11) abstractMap;
/* 18 */                        lo0ollio11.I00000oOI(o100l12, true);
/* 21 */                        this.I00iio = null;
/* 25 */                        this.I00iiI = lo0ollio11.I00ilI0I1;
                                break;
                            }
                    }
                }

/* 26 */        public O100iii0I0i(iI0o1i0o ii0o1i0o, byte b) {
                    this.I00ilI0I1 = ii0o1i0o;
                    this.I00iiO = (iI0lliloO) ((iI0lliloO) ii0o1i0o.I00ilO0).I00ioIO;
                    this.I00iiI = ii0o1i0o.I00iiO;
                }

/* 27 */        public O100iii0I0i(lo0olliO11 lo0ollio11) {
                    this.I00ilI0I1 = lo0ollio11;
/* 29 */            this.I00iiO = (O100l1) lo0ollio11.I00ilO0.I00l0I0l0lO1;
                    this.I00iiI = lo0ollio11.I00ilI0I1;
                }

/* 29 */        public O100iii0I0i(O100l1O0IiiO o100l1O0IiiO) {
                    this.I00ilI0I1 = o100l1O0IiiO;
/* 31 */            this.I00iiO = (O100l1) o100l1O0IiiO.I00ilO0.I00l0I0l0lO1;
/* 33 */            this.I00iiI = o100l1O0IiiO.I00ilI0I1;
                }
            }

            package p000;

            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class IlIloII10O implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public Iterator I00iiI;
                public int I00iiO;
                public Object I00iio;
                public OilO0iOl I00ilI0I1;

                public void I00000oIO() {
/* 3 */             IlIo0o ilIo0o = (IlIo0o) this.I00ilI0I1;
/* 5 */             Iterator it = this.I00iiI;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 31 */                if (((Boolean) ilIo0o.I0000Il00O.invoke(next)).booleanValue() == ilIo0o.I00000oOI) {
/* 33 */                    this.I00iio = next;
/* 36 */                    this.I00iiO = 1;
/* 38 */                    return;
                        }
                    }
/* 40 */            this.I00iiO = 0;
                }

                public void I00000oOI() {
/* 1 */             Iterator it = this.I00iiI;
/* 7 */             if (it.hasNext()) {
/* 9 */                 Object next = it.next();
/* 31 */                if (((Boolean) ((Function1) ((IlIl0l) this.I00ilI0I1).I0000Il00O).invoke(next)).booleanValue()) {
/* 34 */                    this.I00iiO = 1;
/* 36 */                    this.I00iio = next;
/* 38 */                    return;
                        }
                    }
/* 40 */            this.I00iiO = 0;
                }

                public boolean I0000Il00O() {
/* 1 */             Iterator it = this.I00iiI;
/* 5 */             Iterator it2 = (Iterator) this.I00iio;
/* 8 */             if (it2 != null && it2.hasNext()) {
/* 16 */                this.I00iiO = 1;
/* 7 */                 return true;
                    }
/* 23 */            while (it.hasNext()) {
/* 25 */                Object next = it.next();
/* 31 */                IlOIIioI1 ilOIIioI1 = (IlOIIioI1) this.I00ilI0I1;
/* 45 */                Iterator it3 = (Iterator) ilOIIioI1.I0000Il00O.invoke(ilOIIioI1.I00000oOI.invoke(next));
/* 51 */                if (it3.hasNext()) {
/* 53 */                    this.I00iio = it3;
/* 55 */                    this.I00iiO = 1;
/* 7 */                     return true;
                        }
                    }
/* 59 */            this.I00iiO = 2;
/* 62 */            this.I00iio = null;
/* 64 */            return false;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 41 */                    if (this.I00iiO == -1) {
/* 43 */                        I00000oIO();
                            }
                            return this.I00iiO == 1;
                        case 1:
/* 22 */                    int i = this.I00iiO;
/* 25 */                    if (i == 1) {
/* 24 */                        return true;
                            }
/* 29 */                    if (i == 2) {
/* 31 */                        return false;
                            }
/* 33 */                    return I0000Il00O();
                        default:
/* 9 */                     if (this.I00iiO == -1) {
/* 11 */                        I00000oOI();
                            }
                            return this.I00iiO == 1;
                    }
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 67 */                    if (this.I00iiO == -1) {
/* 69 */                        I00000oIO();
                            }
/* 74 */                    if (this.I00iiO == 0) {
/* 84 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 76 */                        Object obj = this.I00iio;
/* 78 */                        this.I00iio = null;
/* 80 */                        this.I00iiO = -1;
                                break;
                            }
                        case 1:
/* 31 */                    int i = this.I00iiO;
/* 34 */                    if (i == 2) {
/* 61 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else if (i == 0 && !I0000Il00O()) {
/* 45 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 50 */                        this.I00iiO = 0;
                                break;
                            }
                        default:
/* 10 */                    if (this.I00iiO == -1) {
/* 12 */                        I00000oOI();
                            }
/* 17 */                    if (this.I00iiO == 0) {
/* 27 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 19 */                        Object obj2 = this.I00iio;
/* 21 */                        this.I00iio = null;
/* 23 */                        this.I00iiO = -1;
                                break;
                            }
                    }
/* 4 */             return null;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }
            }

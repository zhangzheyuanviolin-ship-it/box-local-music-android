            package p000;

            import java.util.ConcurrentModificationException;
            import java.util.Iterator;
            import java.util.Map;
            
/* 10 */    public final class OO0oo0lO implements Iterator, O0IlIoi {
                public final int I00iOIl = 1;
                public Object I00iiI;
                public Map I00iiO;
                public int I00iio;

                public OO0oo0lO(Object obj, Map map) {
/* 7 */             this.I00iiI = obj;
/* 9 */             this.I00iiO = map;
                }

                public O100lilo1Ill I00000oIO() {
/* 5 */             if (!hasNext()) {
/* 57 */                IoOOl0iOl1io.I00000oOI();
/* 60 */                return null;
                    }
/* 11 */            Object obj = this.I00iiO.get(this.I00iiI);
/* 15 */            if (obj != null) {
/* 17 */                O100lilo1Ill o100lilo1Ill = (O100lilo1Ill) obj;
                        this.I00iio++;
/* 27 */                this.I00iiI = o100lilo1Ill.I0000Il00O;
/* 29 */                return o100lilo1Ill;
                    }
/* 56 */            throw new ConcurrentModificationException("Hash code of a key (" + this.I00iiI + ") has changed after it was added to the persistent map.");
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 28 */                    if (this.I00iio < this.I00iiO.size()) {
                                break;
                            }
                            break;
                        default:
/* 16 */                    if (this.I00iio < this.I00iiO.size()) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 65 */                    return I00000oIO();
                        default:
/* 10 */                    if (!hasNext()) {
/* 60 */                        IoOOl0iOl1io.I00000oOI();
/* 63 */                        return null;
                            }
/* 12 */                    Object obj = this.I00iiI;
                            this.I00iio++;
/* 22 */                    Object obj2 = this.I00iiO.get(obj);
/* 26 */                    if (obj2 != null) {
/* 32 */                        this.I00iiI = ((O100ll1iO0il) obj2).I00000oOI;
/* 64 */                        return obj;
                            }
/* 59 */                    throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

/* 11 */        public OO0oo0lO() {
                }
            }

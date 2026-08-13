            package p000;

            import java.util.Iterator;
            
            public final class Iio0IIOo implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public Iterator I00iiI;
                public int I00iiO;

                public Iio0IIOo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    Iterator it = this.I00iiI;
/* 33 */                    while (this.I00iiO > 0 && it.hasNext()) {
/* 41 */                        it.next();
                                this.I00iiO--;
                            }
/* 51 */                    return it.hasNext();
                        case 1:
/* 24 */                    return this.I00iiI.hasNext();
                        default:
                            return this.I00iiO > 0 && this.I00iiI.hasNext();
                    }
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 50 */                    Iterator it = this.I00iiI;
/* 54 */                    while (this.I00iiO > 0 && it.hasNext()) {
/* 62 */                        it.next();
                                this.I00iiO--;
                            }
/* 72 */                    return it.next();
                        case 1:
/* 28 */                    int i = this.I00iiO;
/* 32 */                    this.I00iiO = i + 1;
/* 34 */                    if (i >= 0) {
/* 42 */                        return new Iol0oIiIOI(i, this.I00iiI.next());
                            }
/* 46 */                    IOOi1I.I000lI();
/* 49 */                    throw null;
                        default:
/* 7 */                     int i2 = this.I00iiO;
/* 9 */                     if (i2 != 0) {
/* 13 */                        this.I00iiO = i2 - 1;
/* 17 */                        return this.I00iiI.next();
                            }
/* 22 */                    IoOOl0iOl1io.I00000oOI();
/* 3 */                     return null;
                    }
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

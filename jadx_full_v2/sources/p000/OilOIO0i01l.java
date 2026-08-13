            package p000;

            import java.util.Iterator;
            
            public final class OilOIO0i01l implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public Object I00iiI;
                public boolean I00iiO;

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiO;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 40 */                    if (!this.I00iiO) {
/* 47 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 42 */                        this.I00iiO = false;
                                break;
                            }
                        case 1:
/* 27 */                    if (!this.I00iiO) {
/* 34 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 29 */                        this.I00iiO = false;
                                break;
                            }
                        default:
/* 10 */                    if (!this.I00iiO) {
/* 21 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 12 */                        this.I00iiO = false;
                                break;
                            }
                    }
/* 3 */             return null;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 19 */                    throw new UnsupportedOperationException();
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }
            }

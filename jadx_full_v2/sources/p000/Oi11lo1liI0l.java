            package p000;

            import java.util.ListIterator;
            
            public final class Oi11lo1liI0l implements ListIterator, O0IlIoi {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public Oi11lo1liI0l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    ListIterator listIterator = (ListIterator) this.I00iiI;
/* 26 */                    listIterator.add(obj);
/* 29 */                    listIterator.previous();
/* 32 */                    return;
                        case 1:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new IllegalStateException("Cannot modify a state list through an iterator");
                    }
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        case 1:
                            break;
                        default:
/* 20 */                    if (((OOo0ll111) this.I00iiI).I00iOIl < ((Oli1i0O) this.I00iiO).I00iio - 1) {
                            }
                            break;
                    }
/* 29 */            return ((ListIterator) this.I00iiI).hasPrevious();
                }

                @Override
                public final boolean hasPrevious() {
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        case 1:
                            break;
                        default:
/* 12 */                    if (((OOo0ll111) this.I00iiI).I00iOIl >= 0) {
                            }
                            break;
                    }
/* 22 */            return ((ListIterator) this.I00iiI).hasNext();
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 43 */                    return ((ListIterator) this.I00iiI).previous();
                        case 1:
/* 34 */                    return ((ListIterator) this.I00iiI).previous();
                        default:
/* 8 */                     OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iiI;
/* 12 */                    int i = oOo0ll111.I00iOIl + 1;
/* 16 */                    Oli1i0O oli1i0O = (Oli1i0O) this.I00iiO;
/* 20 */                    iO0oloi1IO0.I0000Il00O(i, oli1i0O.I00iio);
/* 23 */                    oOo0ll111.I00iOIl = i;
/* 25 */                    return oli1i0O.get(i);
                    }
                }

                @Override
                public final int nextIndex() {
                    int iPreviousIndex;
                    int iI000II;
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    Oi11oOI oi11oOI = (Oi11oOI) this.I00iiO;
/* 41 */                    iPreviousIndex = ((ListIterator) this.I00iiI).previousIndex();
/* 45 */                    iI000II = IOOi1I.I000II(oi11oOI);
                            break;
                        case 1:
/* 17 */                    O1OlO1II o1OlO1II = (O1OlO1II) this.I00iiO;
/* 23 */                    iPreviousIndex = ((ListIterator) this.I00iiI).previousIndex();
/* 27 */                    iI000II = IOOi1I.I000II(o1OlO1II);
                            break;
                        default:
/* 12 */                    return ((OOo0ll111) this.I00iiI).I00iOIl + 1;
                    }
/* 31 */            return iI000II - iPreviousIndex;
                }

                @Override
                public final Object previous() {
                    switch (this.I00iOIl) {
                        case 0:
/* 43 */                    return ((ListIterator) this.I00iiI).next();
                        case 1:
/* 34 */                    return ((ListIterator) this.I00iiI).next();
                        default:
/* 8 */                     OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iiI;
/* 10 */                    int i = oOo0ll111.I00iOIl;
/* 14 */                    Oli1i0O oli1i0O = (Oli1i0O) this.I00iiO;
/* 18 */                    iO0oloi1IO0.I0000Il00O(i, oli1i0O.I00iio);
/* 23 */                    oOo0ll111.I00iOIl = i - 1;
/* 25 */                    return oli1i0O.get(i);
                    }
                }

                @Override
                public final int previousIndex() {
                    int iNextIndex;
                    int iI000II;
                    switch (this.I00iOIl) {
                        case 0:
/* 33 */                    Oi11oOI oi11oOI = (Oi11oOI) this.I00iiO;
/* 39 */                    iNextIndex = ((ListIterator) this.I00iiI).nextIndex();
/* 43 */                    iI000II = IOOi1I.I000II(oi11oOI);
                            break;
                        case 1:
/* 15 */                    O1OlO1II o1OlO1II = (O1OlO1II) this.I00iiO;
/* 21 */                    iNextIndex = ((ListIterator) this.I00iiI).nextIndex();
/* 25 */                    iI000II = IOOi1I.I000II(o1OlO1II);
                            break;
                        default:
/* 10 */                    return ((OOo0ll111) this.I00iiI).I00iOIl;
                    }
/* 29 */            return iI000II - iNextIndex;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    ((ListIterator) this.I00iiI).remove();
/* 29 */                    return;
                        case 1:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new IllegalStateException("Cannot modify a state list through an iterator");
                    }
                }

                @Override
                public final void set(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    ((ListIterator) this.I00iiI).set(obj);
/* 29 */                    return;
                        case 1:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new IllegalStateException("Cannot modify a state list through an iterator");
                    }
                }
            }

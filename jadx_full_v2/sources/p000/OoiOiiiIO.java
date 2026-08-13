            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class OoiOiiiIO implements Iterator {
                public final int I00iOIl;
                public Iterator I00iiI;

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.hasNext();
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 117 */                   return (String) this.I00iiI.next();
                        case 1:
/* 108 */                   return (String) this.I00iiI.next();
                        case 2:
/* 97 */                    return ((Map.Entry) this.I00iiI.next()).getValue();
                        case 3:
/* 84 */                    return ((Map.Entry) this.I00iiI.next()).getValue();
                        case 4:
/* 71 */                    return ((Map.Entry) this.I00iiI.next()).getValue();
                        case 5:
/* 60 */                    return (String) this.I00iiI.next();
                        case 6:
/* 49 */                    return ((Map.Entry) this.I00iiI.next()).getValue();
                        case 7:
/* 36 */                    return ((Map.Entry) this.I00iiI.next()).getValue();
                        case 8:
/* 23 */                    return ((Map.Entry) this.I00iiI.next()).getValue();
                        default:
/* 12 */                    return (String) this.I00iiI.next();
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 67 */                    throw new UnsupportedOperationException();
                        case 1:
/* 61 */                    throw new UnsupportedOperationException();
                        case 2:
/* 52 */                    this.I00iiI.remove();
/* 55 */                    return;
                        case 3:
/* 46 */                    this.I00iiI.remove();
/* 49 */                    return;
                        case 4:
/* 40 */                    this.I00iiI.remove();
/* 43 */                    return;
                        case 5:
/* 37 */                    throw new UnsupportedOperationException("Remove not supported");
                        case 6:
/* 26 */                    this.I00iiI.remove();
/* 29 */                    return;
                        case 7:
/* 20 */                    this.I00iiI.remove();
/* 23 */                    return;
                        case 8:
/* 14 */                    this.I00iiI.remove();
/* 17 */                    return;
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }
            }

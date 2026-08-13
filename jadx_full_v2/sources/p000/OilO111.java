            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
            public final class OilO111 implements Iterator, IOoil1iiIilo, O0IlIoi {
                public int I00iOIl;
                public Object I00iiI;
                public IOoil1iiIilo I00iiO;

                public final RuntimeException I00000oIO() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             if (i == 4) {
/* 41 */                return new NoSuchElementException();
                    }
/* 7 */             if (i == 5) {
/* 35 */                return new IllegalStateException("Iterator has failed.");
                    }
/* 27 */            return new IllegalStateException("Unexpected state of the iterator: " + this.I00iOIl);
                }

                public final void I00000oOI(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 1 */             this.I00iiI = obj;
/* 4 */             this.I00iOIl = 3;
/* 6 */             this.I00iiO = iOoil1iiIilo;
/* 8 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return Il00o11.I00iOIl;
                }

                @Override
                public final boolean hasNext() {
                    int i;
                    while (true) {
/* 1 */                 i = this.I00iOIl;
/* 4 */                 if (i != 0) {
                            break;
                        }
/* 28 */                this.I00iOIl = 5;
/* 30 */                IOoil1iiIilo iOoil1iiIilo = this.I00iiO;
/* 32 */                this.I00iiO = null;
/* 36 */                iOoil1iiIilo.resumeWith(OoiIlOl1iI.I00000oIO);
                    }
/* 7 */             if (i == 1) {
/* 26 */                throw null;
                    }
/* 10 */            if (i == 2 || i == 3) {
/* 6 */                 return true;
                    }
/* 16 */            if (i == 4) {
/* 18 */                return false;
                    }
/* 24 */            throw I00000oIO();
                }

                @Override
                public final Object next() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             if (i == 0 || i == 1) {
/* 35 */                if (hasNext()) {
/* 37 */                    return next();
                        }
/* 42 */                IoOOl0iOl1io.I00000oOI();
/* 3 */                 return null;
                    }
/* 10 */            if (i == 2) {
/* 28 */                this.I00iOIl = 1;
/* 30 */                throw null;
                    }
/* 13 */            if (i != 3) {
/* 27 */                throw I00000oIO();
                    }
/* 16 */            this.I00iOIl = 0;
/* 18 */            Object obj = this.I00iiI;
/* 20 */            this.I00iiI = null;
/* 22 */            return obj;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void resumeWith(Object obj) throws Throwable {
/* 1 */             lIoii1l01l0i.I00000oOI(obj);
/* 5 */             this.I00iOIl = 4;
                }
            }

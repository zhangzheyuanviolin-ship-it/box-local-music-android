            package p000;

            import java.util.Iterator;
            
            public abstract class I011lIilI0lo implements Iterator, O0IlIoi {
                public int I00iOIl;
                public Object I00iiI;

                public abstract void I00000oIO();

                @Override
                public final boolean hasNext() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             if (i == 0) {
/* 22 */                this.I00iOIl = 3;
/* 24 */                I00000oIO();
                        return this.I00iOIl == 1;
                    }
/* 7 */             if (i == 1) {
/* 4 */                 return true;
                    }
/* 10 */            if (i == 2) {
/* 3 */                 return false;
                    }
/* 15 */            I000II.I000iOII("hasNext called when the iterator is in the FAILED state.");
/* 18 */            return false;
                }

                @Override
                public final Object next() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             if (i == 1) {
/* 7 */                 this.I00iOIl = 0;
/* 9 */                 return this.I00iiI;
                    }
/* 13 */            if (i != 2) {
/* 16 */                this.I00iOIl = 3;
/* 18 */                I00000oIO();
/* 23 */                if (this.I00iOIl == 1) {
/* 25 */                    this.I00iOIl = 0;
/* 27 */                    return this.I00iiI;
                        }
                    }
/* 30 */            IoOOl0iOl1io.I00000oOI();
/* 33 */            return null;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }

            package p000;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.util.Iterator;
            
            public final class O0ooOOI10 implements Iterator, O0IlIoi {
                public String I00iOIl;
                public boolean I00iiI;
                public I1Iolliil0i I00iiO;

                @Override
                public final boolean hasNext() throws IOException {
/* 1 */             String line = this.I00iOIl;
/* 4 */             if (line == null && !this.I00iiI) {
/* 16 */                line = ((BufferedReader) this.I00iiO.I00000oOI).readLine();
/* 20 */                this.I00iOIl = line;
/* 22 */                if (line == null) {
/* 24 */                    this.I00iiI = true;
                        }
                    }
                    return line != null;
                }

                @Override
                public final Object next() {
/* 6 */             if (!hasNext()) {
/* 13 */                IoOOl0iOl1io.I00000oOI();
/* 5 */                 return null;
                    }
/* 8 */             String str = this.I00iOIl;
/* 10 */            this.I00iOIl = null;
/* 12 */            return str;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }

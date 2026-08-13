            package p000;
            
            public final class OiI01O1ilo implements IIO1OlO0 {
                public OIIloI0Iil I00iOIl;
                public O1100oi0Iio I00iiI;
                public int I00iiO;

                @Override
                public final boolean hasNext() {
                    return this.I00iiO > 0;
                }

                @Override
                public final Object next() {
/* 7 */             if (!this.I00iiI.hasNext()) {
/* 21 */                this.I00iiI = (O1100oi0Iio) this.I00iOIl.I00000oIO().iterator();
                    }
                    this.I00iiO--;
/* 35 */            return Byte.valueOf(this.I00iiI.I00000oIO());
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException();
                }
            }

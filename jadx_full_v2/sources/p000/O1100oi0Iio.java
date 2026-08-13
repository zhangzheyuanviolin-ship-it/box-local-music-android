            package p000;
            
            public final class O1100oi0Iio implements IIO1OlO0 {
                public int I00iOIl;
                public int I00iiI;
                public O1101ooIo0l I00iiO;

                public final byte I00000oIO() {
                    try {
/* 3 */                 byte[] bArr = this.I00iiO.I00iiI;
/* 5 */                 int i = this.I00iOIl;
/* 9 */                 this.I00iOIl = i + 1;
/* 11 */                return bArr[i];
                    } catch (ArrayIndexOutOfBoundsException e) {
/* 19 */                OIiilo1Ool0o.I000II(e.getMessage());
/* 22 */                return (byte) 0;
                    }
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iOIl < this.I00iiI;
                }

                @Override
                public final Object next() {
/* 5 */             return Byte.valueOf(I00000oIO());
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException();
                }
            }

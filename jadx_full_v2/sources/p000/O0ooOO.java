            package p000;

            import java.util.Iterator;
            
            public final class O0ooOO implements Iterator, O0IlIoi {
                public CharSequence I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;

                @Override
                public final boolean hasNext() {
                    int i;
                    int i2;
/* 1 */             CharSequence charSequence = this.I00iOIl;
/* 3 */             int i3 = this.I00iiI;
/* 7 */             if (i3 != 0) {
                        return i3 == 1;
                    }
/* 16 */            if (this.I00ilI0I1 < 0) {
/* 18 */                this.I00iiI = 2;
/* 5 */                 return false;
                    }
/* 21 */            int length = charSequence.length();
/* 27 */            int length2 = charSequence.length();
/* 31 */            for (int i4 = this.I00iiO; i4 < length2; i4++) {
/* 33 */                char cCharAt = charSequence.charAt(i4);
/* 41 */                if (cCharAt == '\n' || cCharAt == '\r') {
/* 48 */                    i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
/* 66 */                    length = i4;
/* 69 */                    this.I00iiI = 1;
/* 71 */                    this.I00ilI0I1 = i;
/* 73 */                    this.I00iio = length;
/* 6 */                     return true;
                        }
                    }
/* 68 */            i = -1;
/* 69 */            this.I00iiI = 1;
/* 71 */            this.I00ilI0I1 = i;
/* 73 */            this.I00iio = length;
/* 6 */             return true;
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 30 */                IoOOl0iOl1io.I00000oOI();
/* 33 */                return null;
                    }
/* 8 */             this.I00iiI = 0;
/* 10 */            int i = this.I00iio;
/* 12 */            int i2 = this.I00iiO;
/* 17 */            this.I00iiO = this.I00ilI0I1 + i;
/* 25 */            return this.I00iOIl.subSequence(i2, i).toString();
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }

            package p000;

            import java.util.Iterator;
            
            public final class O0ooioii0o implements Iterator {
                public CharSequence I00iOIl;
                public O1001lIo I00iiI;
                public int I00iiO;
                public int I00iio;
                public IOO000ilo I00ilI0I1;

                @Override
                public final boolean hasNext() {
                    OiO10ll0 oiO10ll0;
/* 1 */             CharSequence charSequence = this.I00iOIl;
/* 6 */             if (this.I00iiI == null) {
/* 9 */                 int length = charSequence.length();
                        while (true) {
/* 13 */                    int i = this.I00iiO;
/* 15 */                    if (i >= length) {
                                break;
                            }
/* 17 */                    IOO000ilo iOO000ilo = this.I00ilI0I1;
/* 19 */                    char cCharAt = charSequence.charAt(i);
/* 25 */                    if (cCharAt == ':') {
/* 52 */                        oiO10ll0 = (iolOOiI) iOO000ilo.I00iiI;
                            } else if (cCharAt == '@') {
/* 47 */                        oiO10ll0 = (Iioi0lilII) iOO000ilo.I00iio;
                            } else if (cCharAt != 'w') {
/* 35 */                        iOO000ilo.getClass();
/* 38 */                        oiO10ll0 = null;
                            } else {
/* 42 */                        oiO10ll0 = (IIIOlol) iOO000ilo.I00iiO;
                            }
/* 54 */                    int i2 = this.I00iiO;
/* 56 */                    if (oiO10ll0 != null) {
/* 60 */                        O1001lIo o1001lIoI001lIiIIo1O = oiO10ll0.I001lIiIIo1O(charSequence, i2, this.I00iio);
/* 64 */                        if (o1001lIoI001lIiIIo1O != null) {
/* 66 */                            this.I00iiI = o1001lIoI001lIiIIo1O;
/* 68 */                            int i3 = o1001lIoI001lIiIIo1O.I0000Il00O;
/* 70 */                            this.I00iiO = i3;
/* 72 */                            this.I00iio = i3;
                                    break;
                                }
                                this.I00iiO++;
                            } else {
/* 83 */                        this.I00iiO = i2 + 1;
                            }
                        }
                    }
                    return this.I00iiI != null;
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 13 */                IoOOl0iOl1io.I00000oOI();
/* 16 */                return null;
                    }
/* 7 */             O1001lIo o1001lIo = this.I00iiI;
/* 10 */            this.I00iiI = null;
/* 12 */            return o1001lIo;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("remove");
                }
            }

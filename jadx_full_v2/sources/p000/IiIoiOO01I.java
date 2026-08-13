            package p000;

            import java.util.Iterator;
            
            public final class IiIoiOO01I implements Iterator, O0IlIoi {
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public IooO11l I00iio;
                public int I00ilI0I1;
                public IiIoiOio I00ilO0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO() {
                    OIoi0IIoi oIoi0IIoi;
/* 1 */             IiIoiOio iiIoiOio = this.I00ilO0;
/* 3 */             CharSequence charSequence = iiIoiOio.I00000oIO;
/* 5 */             int i = this.I00iiO;
/* 8 */             if (i < 0) {
/* 10 */                this.I00iOIl = 0;
/* 13 */                this.I00iio = null;
/* 15 */                return;
                    }
/* 16 */            int i2 = iiIoiOio.I00000oOI;
/* 20 */            if (i2 > 0) {
/* 24 */                int i3 = this.I00ilI0I1 + 1;
/* 25 */                this.I00ilI0I1 = i3;
/* 27 */                if (i3 >= i2) {
/* 46 */                    this.I00iio = new IooO11l(this.I00iiI, OlOoOIi0o.I00111O(charSequence), 1);
/* 48 */                    this.I00iiO = -1;
                        } else if (i <= charSequence.length() && (oIoi0IIoi = (OIoi0IIoi) iiIoiOio.I0000Il00O.invoke(charSequence, Integer.valueOf(this.I00iiO))) != null) {
/* 87 */                    int iIntValue = ((Number) oIoi0IIoi.I00iOIl).intValue();
/* 95 */                    int iIntValue2 = ((Number) oIoi0IIoi.I00iiI).intValue();
/* 105 */                   this.I00iio = lIiioliIlo.I000O01llI0(this.I00iiI, iIntValue);
/* 107 */                   int i4 = iIntValue + iIntValue2;
/* 108 */                   this.I00iiI = i4;
/* 114 */                   this.I00iiO = i4 + (iIntValue2 == 0 ? 1 : 0);
                        } else {
/* 78 */                    this.I00iio = new IooO11l(this.I00iiI, OlOoOIi0o.I00111O(charSequence), 1);
/* 80 */                    this.I00iiO = -1;
                        }
                    }
/* 116 */           this.I00iOIl = 1;
                }

                @Override
                public final boolean hasNext() {
/* 4 */             if (this.I00iOIl == -1) {
/* 6 */                 I00000oIO();
                    }
                    return this.I00iOIl == 1;
                }

                @Override
                public final Object next() {
/* 4 */             if (this.I00iOIl == -1) {
/* 6 */                 I00000oIO();
                    }
/* 12 */            if (this.I00iOIl == 0) {
/* 21 */                IoOOl0iOl1io.I00000oOI();
/* 11 */                return null;
                    }
/* 14 */            IooO11l iooO11l = this.I00iio;
/* 16 */            this.I00iio = null;
/* 18 */            this.I00iOIl = -1;
/* 20 */            return iooO11l;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }

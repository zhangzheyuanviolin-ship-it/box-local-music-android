            package p000;

            import java.util.Iterator;
            
            public final class OI1o11OI implements Iterator, O0IlIoi {
                public int I00iOIl;
                public boolean I00iiI;
                public I0oiil10Ili I00iiO;

                @Override
                public final boolean hasNext() {
                    return this.I00iOIl + 1 < ((OlIIioolI) this.I00iiO.I00iio).I0000O();
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 28 */                IoOOl0iOl1io.I00000oOI();
/* 31 */                return null;
                    }
/* 8 */             this.I00iiI = true;
/* 14 */            OlIIioolI olIIioolI = (OlIIioolI) this.I00iiO.I00iio;
/* 18 */            int i = this.I00iOIl + 1;
/* 19 */            this.I00iOIl = i;
/* 25 */            return (OI1ilOI1ioo0) olIIioolI.I0000oI00(i);
                }

                @Override
                public final void remove() {
/* 3 */             if (!this.I00iiI) {
/* 47 */                I000II.I001IO000("You must call next() before you can remove an element");
/* 55 */                return;
                    }
/* 9 */             OlIIioolI olIIioolI = (OlIIioolI) this.I00iiO.I00iio;
/* 20 */            ((OI1ilOI1ioo0) olIIioolI.I0000oI00(this.I00iOIl)).I00iiO = null;
/* 22 */            int i = this.I00iOIl;
/* 24 */            Object[] objArr = olIIioolI.I00iiO;
/* 26 */            Object obj = objArr[i];
/* 28 */            Object obj2 = iO10Oii01l.I00000oIO;
/* 30 */            if (obj != obj2) {
/* 32 */                objArr[i] = obj2;
/* 35 */                olIIioolI.I00iOIl = true;
                    }
/* 39 */            this.I00iOIl = i - 1;
/* 42 */            this.I00iiI = false;
                }
            }

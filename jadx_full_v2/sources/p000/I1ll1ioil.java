            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            
            public final class I1ll1ioil extends I00O0o1oo {
                public final int I00iio;
                public final I00O0o1oo[] I00ilI0I1;

                public I1ll1ioil(byte[] bArr, I00O0o1oo[] i00O0o1ooArr) {
/* 1 */             super(bArr);
/* 4 */             this.I00ilI0I1 = i00O0o1ooArr;
/* 8 */             this.I00iio = 1000;
                }

                public static byte[] I001iOo1i0O(I00O0o1oo[] i00O0o1ooArr) {
/* 1 */             int length = i00O0o1ooArr.length;
/* 2 */             if (length == 0) {
/* 46 */                return I00O0o1oo.I00iiO;
                    }
/* 6 */             if (length == 1) {
/* 43 */                return i00O0o1ooArr[0].I00iOIl;
                    }
/* 9 */             int length2 = 0;
/* 10 */            for (I00O0o1oo i00O0o1oo : i00O0o1ooArr) {
/* 17 */                length2 += i00O0o1oo.I00iOIl.length;
                    }
/* 21 */            byte[] bArr = new byte[length2];
/* 24 */            int length3 = 0;
/* 25 */            for (I00O0o1oo i00O0o1oo2 : i00O0o1ooArr) {
/* 29 */                byte[] bArr2 = i00O0o1oo2.I00iOIl;
/* 32 */                System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
/* 36 */                length3 += bArr2.length;
                    }
/* 40 */            return bArr;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 1 */             boolean zI00100o1O0lo = I00100o1O0lo();
/* 6 */             byte[] bArr = this.I00iOIl;
/* 9 */             if (!zI00100o1O0lo) {
/* 11 */                int length = bArr.length;
/* 12 */                o1OIll00i.I00i01iIIliI(4, z);
/* 15 */                o1OIll00i.I00Oio(length);
/* 18 */                o1OIll00i.I00OilO00Il(bArr, 0, length);
/* 21 */                return;
                    }
/* 24 */            o1OIll00i.I00i01iIIliI(36, z);
/* 29 */            o1OIll00i.I00OOll1(Barcode.FORMAT_ITF);
/* 32 */            I00O0o1oo[] i00O0o1ooArr = this.I00ilI0I1;
/* 34 */            if (i00O0o1ooArr != null) {
/* 36 */                o1OIll00i.I00i0ilIl0i(i00O0o1ooArr);
                    } else {
/* 40 */                int i = 0;
/* 42 */                while (i < bArr.length) {
/* 48 */                    int iMin = Math.min(bArr.length - i, this.I00iio);
/* 53 */                    o1OIll00i.I00i01iIIliI(4, true);
/* 56 */                    o1OIll00i.I00Oio(iMin);
/* 59 */                    o1OIll00i.I00OilO00Il(bArr, i, iMin);
/* 62 */                    i += iMin;
                        }
                    }
/* 64 */            o1OIll00i.I00OOll1(0);
/* 67 */            o1OIll00i.I00OOll1(0);
                }

                @Override
                public final boolean I00100o1O0lo() {
                    return this.I00ilI0I1 != null || this.I00iOIl.length > this.I00iio;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 1 */             boolean zI00100o1O0lo = I00100o1O0lo();
/* 5 */             byte[] bArr = this.I00iOIl;
/* 7 */             if (!zI00100o1O0lo) {
/* 10 */                return O1OIll00i.I00O10llo(bArr.length, z);
                    }
/* 19 */            int iI0010I0i = z ? 4 : 3;
/* 20 */            I00O0o1oo[] i00O0o1ooArr = this.I00ilI0I1;
/* 23 */            if (i00O0o1ooArr != null) {
/* 27 */                for (I00O0o1oo i00O0o1oo : i00O0o1ooArr) {
/* 35 */                    iI0010I0i += i00O0o1oo.I0010I0i(true);
                        }
/* 39 */                return iI0010I0i;
                    }
/* 40 */            int length = bArr.length;
/* 41 */            int i = this.I00iio;
/* 43 */            int i2 = length / i;
/* 49 */            int iI00O10llo = (O1OIll00i.I00O10llo(i, true) * i2) + iI0010I0i;
/* 52 */            int length2 = bArr.length - (i2 * i);
                    return length2 > 0 ? O1OIll00i.I00O10llo(length2, true) + iI00O10llo : iI00O10llo;
                }
            }

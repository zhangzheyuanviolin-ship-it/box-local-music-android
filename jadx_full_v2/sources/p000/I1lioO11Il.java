            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            
            public final class I1lioO11Il extends I001lloI {
                public int I00iio;
                public I001lloI[] I00ilI0I1;

                public I1lioO11Il(I001lloI[] i001lloIArr) {
/* 6 */             super(I001lIiIIo1O(i001lloIArr), false);
/* 9 */             this.I00ilI0I1 = i001lloIArr;
/* 13 */            this.I00iio = 1000;
                }

                public static byte[] I001lIiIIo1O(I001lloI[] i001lloIArr) {
/* 1 */             int length = i001lloIArr.length;
/* 4 */             if (length == 0) {
/* 69 */                return new byte[]{0};
                    }
/* 6 */             if (length == 1) {
/* 66 */                return i001lloIArr[0].I00iOIl;
                    }
                    int i = length - 1;
/* 11 */            int length2 = 0;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                byte[] bArr = i001lloIArr[i2].I00iOIl;
/* 20 */                if (bArr[0] != 0) {
/* 30 */                    I000II.I000iOII("only the last nested bitstring can have padding");
/* 33 */                    return null;
                        }
/* 24 */                length2 += bArr.length - 1;
                    }
/* 37 */            byte[] bArr2 = i001lloIArr[i].I00iOIl;
/* 39 */            byte b = bArr2[0];
/* 43 */            byte[] bArr3 = new byte[length2 + bArr2.length];
/* 45 */            bArr3[0] = b;
/* 47 */            int i3 = 1;
/* 48 */            for (I001lloI i001lloI : i001lloIArr) {
/* 52 */                byte[] bArr4 = i001lloI.I00iOIl;
/* 55 */                int length3 = bArr4.length - 1;
/* 56 */                System.arraycopy(bArr4, 1, bArr3, i3, length3);
/* 59 */                i3 += length3;
                    }
/* 63 */            return bArr3;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 9 */             if (!I00100o1O0lo()) {
/* 11 */                int length = bArr.length;
/* 12 */                o1OIll00i.I00i01iIIliI(3, z);
/* 15 */                o1OIll00i.I00Oio(length);
/* 18 */                o1OIll00i.I00OilO00Il(bArr, 0, length);
/* 21 */                return;
                    }
/* 24 */            o1OIll00i.I00i01iIIliI(35, z);
/* 29 */            o1OIll00i.I00OOll1(Barcode.FORMAT_ITF);
/* 32 */            I001lloI[] i001lloIArr = this.I00ilI0I1;
/* 34 */            if (i001lloIArr != null) {
/* 36 */                o1OIll00i.I00i0ilIl0i(i001lloIArr);
                    } else if (bArr.length >= 2) {
/* 45 */                byte b = bArr[0];
/* 47 */                int length2 = bArr.length;
                        int i = length2 - 1;
/* 50 */                int i2 = this.I00iio;
                        int i3 = i2 - 1;
/* 54 */                while (i > i3) {
/* 58 */                    o1OIll00i.I00OOll1(3);
/* 61 */                    o1OIll00i.I00Oio(i2);
/* 64 */                    o1OIll00i.I00OOll1(0);
/* 67 */                    o1OIll00i.I00OilO00Il(bArr, length2 - i, i3);
/* 70 */                    i -= i3;
                        }
/* 73 */                o1OIll00i.I00OOll1(3);
/* 78 */                o1OIll00i.I00Oio(i + 1);
/* 81 */                o1OIll00i.I00OOll1(b);
/* 84 */                o1OIll00i.I00OilO00Il(bArr, length2 - i, i);
                    }
/* 87 */            o1OIll00i.I00OOll1(0);
/* 90 */            o1OIll00i.I00OOll1(0);
                }

                @Override
                public final boolean I00100o1O0lo() {
                    return this.I00ilI0I1 != null || this.I00iOIl.length > this.I00iio;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 1 */             int i = this.I00iio;
/* 3 */             I001lloI[] i001lloIArr = this.I00ilI0I1;
/* 5 */             byte[] bArr = this.I00iOIl;
/* 11 */            if (!I00100o1O0lo()) {
/* 14 */                return O1OIll00i.I00O10llo(bArr.length, z);
                    }
/* 23 */            int iI0010I0i = z ? 4 : 3;
/* 25 */            if (i001lloIArr != null) {
/* 29 */                for (I001lloI i001lloI : i001lloIArr) {
/* 37 */                    iI0010I0i += i001lloI.I0010I0i(true);
                        }
/* 41 */                return iI0010I0i;
                    }
/* 44 */            if (bArr.length < 2) {
/* 46 */                return iI0010I0i;
                    }
                    int i2 = i - 1;
/* 51 */            int length = (bArr.length - 2) / i2;
/* 65 */            return O1OIll00i.I00O10llo(bArr.length - (i2 * length), true) + (O1OIll00i.I00O10llo(i, true) * length) + iI0010I0i;
                }
            }

            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.FilterInputStream;
            import java.io.InputStream;
            import java.util.Arrays;
            
/* 42 */    public final class i0IolIloo extends FilterInputStream {
                public final i0O1ilIOoli1 I00iOIl;
                public byte[] I00iiI;
                public long I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;

                public i0IolIloo(InputStream inputStream) {
/* 1 */             super(inputStream);
/* 9 */             this.I00iOIl = new i0O1ilIOoli1();
/* 15 */            this.I00iiI = new byte[Barcode.FORMAT_AZTEC];
/* 18 */            this.I00iio = false;
/* 20 */            this.I00ilI0I1 = false;
                }

                public final i0IoI1olO1 I00000oIO() {
                    byte[] bArr;
/* 7 */             if (this.I00iiO > 0) {
/* 18 */                do {
/* 9 */                     bArr = this.I00iiI;
/* 18 */                } while (read(bArr, 0, bArr.length) != -1);
                    }
/* 22 */            if (this.I00iio || this.I00ilI0I1) {
/* 135 */               return new i0IoI1olO1(null, -1L, -1, false, false, null);
                    }
/* 31 */            boolean zI0000Il00O = I0000Il00O(30);
/* 36 */            i0O1ilIOoli1 i0o1iliooli1 = this.I00iOIl;
/* 38 */            if (!zI0000Il00O) {
/* 40 */                this.I00iio = true;
/* 42 */                return i0o1iliooli1.I00000oOI();
                    }
/* 47 */            i0IoI1olO1 i0ioi1olo1I00000oOI = i0o1iliooli1.I00000oOI();
/* 53 */            if (i0ioi1olo1I00000oOI.I0000oI00) {
/* 55 */                this.I00ilI0I1 = true;
/* 57 */                return i0ioi1olo1I00000oOI;
                    }
/* 67 */            if (i0ioi1olo1I00000oOI.I00000oOI == 4294967295L) {
/* 125 */               throw new i0O0lI1oiO("Files bigger than 4GiB are not supported.");
                    }
                    int i = i0o1iliooli1.I0001Ioi1lo - 30;
/* 75 */            int length = this.I00iiI.length;
                    long j = i;
/* 80 */            if (j > length) {
/* 86 */                do {
/* 82 */                    length += length;
/* 86 */                } while (length < j);
/* 94 */                this.I00iiI = Arrays.copyOf(this.I00iiI, length);
                    }
/* 100 */           if (!I0000Il00O(i)) {
/* 102 */               this.I00iio = true;
/* 104 */               return i0o1iliooli1.I00000oOI();
                    }
/* 109 */           i0IoI1olO1 i0ioi1olo1I00000oOI2 = i0o1iliooli1.I00000oOI();
/* 115 */           this.I00iiO = i0ioi1olo1I00000oOI2.I00000oOI;
/* 117 */           return i0ioi1olo1I00000oOI2;
                }

                public final boolean I0000Il00O(int i) {
/* 8 */             int iMax = Math.max(0, super.read(this.I00iiI, 0, i));
/* 12 */            i0O1ilIOoli1 i0o1iliooli1 = this.I00iOIl;
/* 14 */            if (iMax != i) {
/* 18 */                int i2 = i - iMax;
/* 28 */                if (Math.max(0, super.read(this.I00iiI, iMax, i2)) != i2) {
/* 33 */                    i0o1iliooli1.I00000oIO(this.I00iiI, 0, iMax);
/* 3 */                     return false;
                        }
                    }
/* 39 */            i0o1iliooli1.I00000oIO(this.I00iiI, 0, i);
/* 42 */            return true;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 1 */             long j = this.I00iiO;
/* 7 */             if (j <= 0 || this.I00iio) {
/* 42 */                return -1;
                    }
/* 25 */            int iMax = Math.max(0, super.read(bArr, i, (int) Math.min(j, i2)));
                    this.I00iiO -= iMax;
/* 35 */            if (iMax != 0) {
/* 41 */                return iMax;
                    }
/* 38 */            this.I00iio = true;
/* 24 */            return 0;
                }

                @Override
/* 43 */        public final int read(byte[] bArr) {
/* 44 */            return read(bArr, 0, bArr.length);
                }
            }

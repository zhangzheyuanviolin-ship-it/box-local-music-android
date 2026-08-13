            package p000;
            
            public class IIO1i10I extends IIOI1Ii1I {
                public final byte[] I00iio;

                public IIO1i10I(byte[] bArr) {
/* 5 */             this.I00iOIl = 0;
/* 7 */             bArr.getClass();
/* 10 */            this.I00iio = bArr;
                }

                @Override
                public byte I00000oOI(int i) {
/* 3 */             return this.I00iio[i];
                }

                @Override
                public void I0001Ioi1lo(int i, byte[] bArr) {
/* 4 */             System.arraycopy(this.I00iio, 0, bArr, 0, i);
                }

                @Override
                public byte I000OOo1O(int i) {
/* 3 */             return this.I00iio[i];
                }

                public int I000iOII() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 95 */                return true;
                    }
/* 7 */             if ((obj instanceof IIOI1Ii1I) && size() == ((IIOI1Ii1I) obj).size()) {
/* 28 */                if (size() == 0) {
/* 95 */                    return true;
                        }
/* 33 */                if (!(obj instanceof IIO1i10I)) {
/* 121 */                   return obj.equals(this);
                        }
/* 35 */                IIO1i10I iIO1i10I = (IIO1i10I) obj;
/* 37 */                int i = this.I00iOIl;
/* 39 */                int i2 = iIO1i10I.I00iOIl;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 48 */                    int size = size();
/* 56 */                    if (size > iIO1i10I.size()) {
/* 117 */                       I000II.I00100o1O0lo(size, size());
/* 6 */                         return false;
                            }
/* 62 */                    if (size > iIO1i10I.size()) {
/* 109 */                       OIiilo1Ool0o.I000o00OoI0I(iIO1i10I.size(), IlIi0I0.I00100o1O0lo("Ran off end of other: 0, ", size, ", "));
/* 6 */                         return false;
                            }
/* 64 */                    byte[] bArr = iIO1i10I.I00iio;
/* 70 */                    int iI000iOII = I000iOII() + size;
/* 71 */                    int iI000iOII2 = I000iOII();
/* 75 */                    int iI000iOII3 = iIO1i10I.I000iOII();
/* 79 */                    while (iI000iOII2 < iI000iOII) {
/* 87 */                        if (this.I00iio[iI000iOII2] == bArr[iI000iOII3]) {
/* 90 */                            iI000iOII2++;
/* 92 */                            iI000iOII3++;
                                }
                            }
/* 95 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public int size() {
/* 3 */             return this.I00iio.length;
                }
            }

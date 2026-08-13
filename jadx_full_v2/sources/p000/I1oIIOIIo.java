            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.math.RoundingMode;
            import java.util.Arrays;
            
            public final class I1oIIOIIo {
                public final String I00000oIO;
                public final char[] I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public final int I0001Ioi1lo;
                public final byte[] I000II;

                public I1oIIOIIo(String str, char[] cArr) {
/* 3 */             byte[] bArr = new byte[Barcode.FORMAT_ITF];
/* 6 */             Arrays.fill(bArr, (byte) -1);
/* 10 */            int i = 0;
                    while (true) {
/* 13 */                if (i >= cArr.length) {
/* 78 */                    this.I00000oIO = str;
/* 80 */                    this.I00000oOI = cArr;
                            try {
/* 82 */                        int length = cArr.length;
/* 83 */                        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
/* 85 */                        int iI00000oOI = iooili11.I00000oOI(length);
/* 89 */                        this.I0000O = iI00000oOI;
/* 91 */                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iI00000oOI);
/* 97 */                        int i2 = 1 << (3 - iNumberOfTrailingZeros);
/* 99 */                        this.I0000oI00 = i2;
/* 102 */                       this.I0001Ioi1lo = iI00000oOI >> iNumberOfTrailingZeros;
/* 106 */                       this.I0000Il00O = cArr.length - 1;
/* 108 */                       this.I000II = bArr;
/* 110 */                       boolean[] zArr = new boolean[i2];
/* 114 */                       for (int i3 = 0; i3 < this.I0001Ioi1lo; i3++) {
/* 118 */                           int i4 = this.I0000O;
/* 120 */                           RoundingMode roundingMode2 = RoundingMode.CEILING;
/* 126 */                           zArr[iooili11.I00000oIO(i3 * 8, i4)] = true;
                                }
/* 131 */                       return;
                            } catch (ArithmeticException e) {
/* 551 */                       throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                            }
                        }
/* 15 */                char c = cArr[i];
/* 23 */                if (!(c < 128)) {
/* 71 */                    I000II.I000iOII(lOi0oI00.I00000oIO("Non-ASCII character: %s", Character.valueOf(c)));
/* 74 */                    throw null;
                        }
/* 31 */                if (!(bArr[c] == -1)) {
/* 53 */                    I000II.I000iOII(lOi0oI00.I00000oIO("Duplicate character: %s", Character.valueOf(c)));
/* 56 */                    throw null;
                        }
/* 34 */                bArr[c] = (byte) i;
/* 36 */                i++;
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I1oIIOIIo) && Arrays.equals(this.I00000oOI, ((I1oIIOIIo) obj).I00000oOI);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(this.I00000oOI) + 1237;
                }

                public final String toString() {
/* 1 */             return this.I00000oIO;
                }
            }

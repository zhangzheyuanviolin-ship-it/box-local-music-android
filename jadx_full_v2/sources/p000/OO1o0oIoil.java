            package p000;

            import android.util.Log;
            import java.io.EOFException;
            import java.io.IOException;
            
            public final class OO1o0oIoil extends OlliIl0 {
                public float I0001Ioi1lo;
                public String[] I000II;

                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws EOFException {
                    String str;
                    String[] strArr;
/* 5 */             this.I0001Ioi1lo = ioiOloi.I001i1lo1io();
/* 7 */             ioiOloi.I001i1lo1io();
/* 10 */            ioiOloi.I00IioO0OiOi();
/* 13 */            ioiOloi.I00IioO0OiOi();
/* 16 */            ioiOloi.I00IoiI();
/* 19 */            ioiOloi.I00IoiI();
/* 22 */            ioiOloi.I00IoiI();
/* 25 */            ioiOloi.I00IoiI();
/* 28 */            ioiOloi.I00IoiI();
/* 31 */            float f = this.I0001Ioi1lo;
/* 37 */            int i = 0;
/* 40 */            if (f == 1.0f) {
/* 42 */                String[] strArr2 = new String[258];
/* 44 */                this.I000II = strArr2;
/* 48 */                System.arraycopy(Ooool11iIi1.I00000oIO, 0, strArr2, 0, 258);
                    } else if (f == 2.0f) {
/* 59 */                int iI00OIl = ioiOloi.I00OIl();
/* 63 */                int[] iArr = new int[iI00OIl];
/* 67 */                this.I000II = new String[iI00OIl];
/* 69 */                int iMax = Integer.MIN_VALUE;
/* 74 */                for (int i2 = 0; i2 < iI00OIl; i2++) {
/* 76 */                    int iI00OIl2 = ioiOloi.I00OIl();
/* 80 */                    iArr[i2] = iI00OIl2;
/* 82 */                    if (iI00OIl2 <= 32767) {
/* 84 */                        iMax = Math.max(iMax, iI00OIl2);
                            }
                        }
/* 91 */                if (iMax >= 258) {
                            int i3 = iMax - 257;
/* 95 */                    strArr = new String[i3];
/* 97 */                    int i4 = 0;
/* 98 */                    while (i4 < i3) {
/* 100 */                       int i5 = ioiOloi.read();
/* 105 */                       if (i5 == -1) {
/* 150 */                           throw new EOFException("premature EOF");
                                }
                                try {
/* 113 */                           strArr[i4] = ioiOloi.I00Io1lO(i5, IO1IOO01oiO.I00000oIO);
/* 115 */                           i4++;
                                } catch (IOException e) {
/* 131 */                           Log.w("PdfBox-Android", Oi010OO0.I0010o("Error reading names in PostScript table at entry ", i4, " of ", i3, ", setting remaining entries to .notdef"), e);
/* 134 */                           while (i4 < i3) {
/* 138 */                               strArr[i4] = ".notdef";
/* 140 */                               i4++;
                                    }
                                }
                            }
                        } else {
/* 151 */                   strArr = null;
                        }
/* 152 */               while (i < iI00OIl) {
/* 154 */                   int i6 = iArr[i];
/* 156 */                   if (i6 >= 0 && i6 < 258) {
/* 166 */                       this.I000II[i] = Ooool11iIi1.I00000oIO[i6];
                            } else if (i6 < 258 || i6 > 32767) {
/* 186 */                       this.I000II[i] = ".undefined";
                            } else {
/* 179 */                       this.I000II[i] = strArr[i6 - 258];
                            }
/* 188 */                   i++;
                        }
                    } else if (f == 2.5f) {
/* 197 */               int iI001l0I00 = ooIllIioi1l.I001l0I00();
/* 201 */               int[] iArr2 = new int[iI001l0I00];
/* 203 */               int i7 = 0;
/* 204 */               while (i7 < iI001l0I00) {
/* 206 */                   int i8 = ioiOloi.read();
/* 212 */                   if (i8 > 127) {
                                i8 -= 256;
                            }
/* 217 */                   int i9 = i7 + 1;
/* 220 */                   iArr2[i7] = i8 + i9;
/* 222 */                   i7 = i9;
                        }
/* 226 */               this.I000II = new String[iI001l0I00];
                        while (true) {
/* 228 */                   String[] strArr3 = this.I000II;
/* 231 */                   if (i >= strArr3.length) {
                                break;
                            }
/* 233 */                   int i10 = iArr2[i];
/* 235 */                   if (i10 >= 0 && i10 < 258 && (str = Ooool11iIi1.I00000oIO[i10]) != null) {
/* 245 */                       strArr3[i] = str;
                            }
/* 247 */                   i++;
                        }
                    } else if (f == 3.0f) {
/* 258 */               this.I0000oI00.getName();
                    }
/* 262 */           this.I0000O = true;
                }
            }

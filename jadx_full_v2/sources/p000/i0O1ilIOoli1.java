            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Arrays;
            
            public final class i0O1ilIOoli1 {
                public byte[] I00000oIO = new byte[Barcode.FORMAT_AZTEC];
                public int I00000oOI = 0;
                public int I0000oI00 = -1;
                public long I0000Il00O = -1;
                public boolean I000O01llI0 = false;
                public int I0001Ioi1lo = 30;
                public long I0000O = -1;
                public int I000II = -1;
                public String I000OOo1O = null;

                public final int I00000oIO(byte[] bArr, int i, int i2) {
/* 3 */             int iI0000Il00O = I0000Il00O(30, bArr, i, i2);
/* 8 */             if (iI0000Il00O != -1) {
/* 16 */                if (this.I0000Il00O == -1) {
/* 21 */                    long jI0000Il00O = liO0lioo.I0000Il00O(0, this.I00000oIO);
/* 25 */                    this.I0000Il00O = jI0000Il00O;
/* 32 */                    if (jI0000Il00O == 67324752) {
/* 34 */                        this.I000O01llI0 = false;
/* 44 */                        this.I0000O = liO0lioo.I0000Il00O(18, this.I00000oIO);
/* 54 */                        this.I000II = liO0lioo.I00000oIO(8, this.I00000oIO);
/* 64 */                        this.I0000oI00 = liO0lioo.I00000oIO(26, this.I00000oIO);
/* 77 */                        int iI00000oIO = this.I0000oI00 + 30 + liO0lioo.I00000oIO(28, this.I00000oIO);
/* 78 */                        this.I0001Ioi1lo = iI00000oIO;
/* 82 */                        int length = this.I00000oIO.length;
/* 83 */                        if (length < iI00000oIO) {
/* 86 */                            do {
/* 85 */                                length += length;
/* 86 */                            } while (length < iI00000oIO);
/* 95 */                            this.I00000oIO = Arrays.copyOf(this.I00000oIO, length);
                                }
                            } else {
/* 99 */                        this.I000O01llI0 = true;
                            }
                        }
/* 105 */               int iI0000Il00O2 = I0000Il00O(this.I0001Ioi1lo, bArr, i + iI0000Il00O, i2 - iI0000Il00O);
/* 109 */               if (iI0000Il00O2 != -1) {
/* 112 */                   int i3 = iI0000Il00O + iI0000Il00O2;
/* 115 */                   if (!this.I000O01llI0 && this.I000OOo1O == null) {
/* 130 */                       this.I000OOo1O = new String(this.I00000oIO, 30, this.I0000oI00);
                            }
/* 132 */                   return i3;
                        }
                    }
/* 7 */             return -1;
                }

                public final i0IoI1olO1 I00000oOI() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             int i2 = this.I0001Ioi1lo;
/* 5 */             String str = this.I000OOo1O;
/* 7 */             long j = this.I0000O;
/* 9 */             int i3 = this.I000II;
/* 11 */            if (i < i2) {
/* 24 */                return new i0IoI1olO1(str, j, i3, true, this.I000O01llI0, Arrays.copyOf(this.I00000oIO, i));
                    }
/* 39 */            i0IoI1olO1 i0ioi1olo1 = new i0IoI1olO1(str, j, i3, false, this.I000O01llI0, Arrays.copyOf(this.I00000oIO, i2));
/* 43 */            this.I00000oOI = 0;
/* 46 */            this.I0000oI00 = -1;
/* 50 */            this.I0000Il00O = -1L;
/* 52 */            this.I000O01llI0 = false;
/* 56 */            this.I0001Ioi1lo = 30;
/* 58 */            this.I0000O = -1L;
/* 60 */            this.I000II = -1;
/* 63 */            this.I000OOo1O = null;
/* 113 */           return i0ioi1olo1;
                }

                public final int I0000Il00O(int i, byte[] bArr, int i2, int i3) {
/* 1 */             int i4 = this.I00000oOI;
/* 3 */             if (i4 >= i) {
/* 28 */                return 0;
                    }
/* 7 */             int iMin = Math.min(i3, i - i4);
/* 15 */            System.arraycopy(bArr, i2, this.I00000oIO, this.I00000oOI, iMin);
/* 20 */            int i5 = this.I00000oOI + iMin;
/* 21 */            this.I00000oOI = i5;
/* 23 */            if (i5 < i) {
/* 25 */                return -1;
                    }
/* 27 */            return iMin;
                }
            }

            package p000;

            import java.util.Arrays;
            
            public final class OoiO0I1O1II {
                public static final OoiO0I1O1II I0001Ioi1lo = new OoiO0I1O1II(0, new int[0], new Object[0], false);
                public int I00000oIO;
                public int[] I00000oOI;
                public Object[] I0000Il00O;
                public int I0000O = -1;
                public boolean I0000oI00;

                public OoiO0I1O1II(int i, int[] iArr, Object[] objArr, boolean z) {
/* 7 */             this.I00000oIO = i;
/* 9 */             this.I00000oOI = iArr;
/* 11 */            this.I0000Il00O = objArr;
/* 13 */            this.I0000oI00 = z;
                }

                public static OoiO0I1O1II I0000Il00O() {
/* 11 */            return new OoiO0I1O1II(0, new int[8], new Object[8], true);
                }

                public final void I00000oIO(int i) {
/* 1 */             int[] iArr = this.I00000oOI;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.I00000oIO;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 14 */                    i = i3;
                        }
/* 17 */                if (i < 8) {
/* 19 */                    i = 8;
                        }
/* 24 */                this.I00000oOI = Arrays.copyOf(iArr, i);
/* 32 */                this.I0000Il00O = Arrays.copyOf(this.I0000Il00O, i);
                    }
                }

                public final int I00000oOI() {
                    int iI000O01llI0;
                    int iI000OiO;
                    int iI0000O;
/* 1 */             int i = this.I0000O;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int i2 = 0;
/* 11 */            for (int i3 = 0; i3 < this.I00000oIO; i3++) {
/* 15 */                int i4 = this.I00000oOI[i3];
/* 17 */                int i5 = i4 >>> 3;
/* 19 */                int i6 = i4 & 7;
/* 21 */                if (i6 != 0) {
/* 24 */                    if (i6 == 1) {
/* 96 */                        ((Long) this.I0000Il00O[i3]).getClass();
/* 99 */                        iI0000O = IOOOi1I1I1.I0000O(i5);
                            } else if (i6 == 2) {
/* 85 */                        iI0000O = IOOOi1I1I1.I00000oIO(i5, (IIOI1Ii1I) this.I0000Il00O[i3]);
                            } else if (i6 == 3) {
/* 64 */                        iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i5) * 2;
/* 71 */                        iI000OiO = ((OoiO0I1O1II) this.I0000Il00O[i3]).I00000oOI();
                            } else {
/* 33 */                        if (i6 != 5) {
/* 55 */                            OoOil11Ol1o.I000oI1ioi(O000oiiiOI0.I0000Il00O());
/* 58 */                            return 0;
                                }
/* 41 */                        ((Integer) this.I0000Il00O[i3]).getClass();
/* 44 */                        iI0000O = IOOOi1I1I1.I0000Il00O(i5);
                            }
/* 48 */                    i2 = iI0000O + i2;
                        } else {
/* 110 */                   long jLongValue = ((Long) this.I0000Il00O[i3]).longValue();
/* 114 */                   iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i5);
/* 118 */                   iI000OiO = IOOOi1I1I1.I000OiO(jLongValue);
                        }
/* 76 */                i2 = iI000OiO + iI000O01llI0 + i2;
                    }
/* 126 */           this.I0000O = i2;
/* 541 */           return i2;
                }

                public final void I0000O(int i, Object obj) {
/* 3 */             if (!this.I0000oI00) {
/* 27 */                OIiilo1Ool0o.I000lI();
/* 89 */                return;
                    }
/* 9 */             I00000oIO(this.I00000oIO + 1);
/* 12 */            int[] iArr = this.I00000oOI;
/* 14 */            int i2 = this.I00000oIO;
/* 16 */            iArr[i2] = i;
/* 20 */            this.I0000Il00O[i2] = obj;
/* 24 */            this.I00000oIO = i2 + 1;
                }

                public final void I0000oI00(iiOlilo0IIIl iiolilo0iiil) throws IOO1IOl1O10 {
/* 3 */             if (this.I00000oIO == 0) {
/* 186 */               return;
                    }
/* 7 */             iiolilo0iiil.getClass();
/* 12 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 18 */            for (int i = 0; i < this.I00000oIO; i++) {
/* 22 */                int i2 = this.I00000oOI[i];
/* 26 */                Object obj = this.I0000Il00O[i];
/* 28 */                int i3 = i2 >>> 3;
/* 30 */                int i4 = i2 & 7;
/* 32 */                if (i4 == 0) {
/* 101 */                   long jLongValue = ((Long) obj).longValue();
/* 105 */                   iOOOi1I1I1.I00100o1O0lo(i3, 0);
/* 108 */                   iOOOi1I1I1.I0010o(jLongValue);
                        } else if (i4 == 1) {
/* 88 */                    long jLongValue2 = ((Long) obj).longValue();
/* 92 */                    iOOOi1I1I1.I00100o1O0lo(i3, 1);
/* 95 */                    iOOOi1I1I1.I000oI1ioi(jLongValue2);
                        } else if (i4 == 2) {
/* 82 */                    iiolilo0iiil.I00IoiI(i3, (IIOI1Ii1I) obj);
                        } else if (i4 == 3) {
/* 67 */                    iOOOi1I1I1.I00100o1O0lo(i3, 3);
/* 72 */                    ((OoiO0I1O1II) obj).I0000oI00(iiolilo0iiil);
/* 76 */                    iOOOi1I1I1.I00100o1O0lo(i3, 4);
                        } else if (i4 != 5) {
/* 63 */                    IioIoO10iOiI.I000lI(O000oiiiOI0.I0000Il00O());
/* 66 */                    return;
                        } else {
/* 48 */                    int iIntValue = ((Integer) obj).intValue();
/* 52 */                    iOOOi1I1I1.I00100o1O0lo(i3, 5);
/* 55 */                    iOOOi1I1I1.I000o00OoI0I(iIntValue);
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof OoiO0I1O1II)) {
/* 5 */                 return false;
                    }
/* 14 */            OoiO0I1O1II ooiO0I1O1II = (OoiO0I1O1II) obj;
/* 16 */            int i = this.I00000oIO;
/* 20 */            if (i == ooiO0I1O1II.I00000oIO) {
/* 22 */                int[] iArr = this.I00000oOI;
/* 24 */                int[] iArr2 = ooiO0I1O1II.I00000oOI;
/* 26 */                int i2 = 0;
                        while (true) {
/* 27 */                    if (i2 >= i) {
/* 39 */                        Object[] objArr = this.I0000Il00O;
/* 41 */                        Object[] objArr2 = ooiO0I1O1II.I0000Il00O;
/* 43 */                        int i3 = this.I00000oIO;
/* 46 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                            if (objArr[i4].equals(objArr2[i4])) {
                                    }
                                }
/* 1 */                         return true;
                            }
/* 33 */                    if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
/* 36 */                    i2++;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00000oIO;
/* 6 */             int i2 = (527 + i) * 31;
/* 8 */             int[] iArr = this.I00000oOI;
/* 10 */            int iHashCode = 17;
/* 13 */            int i3 = 17;
/* 15 */            for (int i4 = 0; i4 < i; i4++) {
/* 21 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 26 */            int i5 = (i2 + i3) * 31;
/* 28 */            Object[] objArr = this.I0000Il00O;
/* 30 */            int i6 = this.I00000oIO;
/* 32 */            for (int i7 = 0; i7 < i6; i7++) {
/* 42 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 46 */            return i5 + iHashCode;
                }
            }

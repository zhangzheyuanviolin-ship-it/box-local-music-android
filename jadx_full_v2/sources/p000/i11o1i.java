            package p000;

            import java.util.Arrays;
            
            public final class i11o1i {
                public static final i11o1i I0001Ioi1lo = new i11o1i(0, new int[0], new Object[0], false);
                public int I00000oIO;
                public int[] I00000oOI;
                public Object[] I0000Il00O;
                public int I0000O = -1;
                public boolean I0000oI00;

                public i11o1i(int i, int[] iArr, Object[] objArr, boolean z) {
/* 7 */             this.I00000oIO = i;
/* 9 */             this.I00000oOI = iArr;
/* 11 */            this.I0000Il00O = objArr;
/* 13 */            this.I0000oI00 = z;
                }

                public static i11o1i I00000oOI() {
/* 11 */            return new i11o1i(0, new int[8], new Object[8], true);
                }

                public final int I00000oIO() {
                    int iI00000oOI;
                    int iI0000Il00O;
                    int iI00000oOI2;
/* 1 */             int i = this.I0000O;
/* 4 */             if (i != -1) {
/* 245 */               return i;
                    }
/* 8 */             int iI0001Ioi1lo = 0;
/* 11 */            for (int i2 = 0; i2 < this.I00000oIO; i2++) {
/* 15 */                int i3 = this.I00000oOI[i2];
/* 17 */                int i4 = i3 >>> 3;
/* 19 */                int i5 = i3 & 7;
/* 21 */                if (i5 != 0) {
/* 24 */                    if (i5 == 1) {
/* 114 */                       ((Long) this.I0000Il00O[i2]).getClass();
/* 121 */                       iI00000oOI2 = i11I0o0ii.I00000oOI(i4 << 3) + 8;
                            } else if (i5 == 2) {
/* 85 */                        int i6 = i4 << 3;
/* 91 */                        i11I0IiII0Ol i11i0iiii0ol = (i11I0IiII0Ol) this.I0000Il00O[i2];
/* 93 */                        int iI00000oOI3 = i11I0o0ii.I00000oOI(i6);
/* 97 */                        int iI0000oI00 = i11i0iiii0ol.I0000oI00();
/* 101 */                       iI0001Ioi1lo = OooioIOo1.I0001Ioi1lo(iI0000oI00, iI0000oI00, iI00000oOI3, iI0001Ioi1lo);
                            } else if (i5 == 3) {
/* 66 */                        int iI00000oOI4 = i11I0o0ii.I00000oOI(i4 << 3);
/* 70 */                        iI00000oOI = iI00000oOI4 + iI00000oOI4;
/* 77 */                        iI0000Il00O = ((i11o1i) this.I0000Il00O[i2]).I00000oIO();
                            } else {
/* 33 */                        if (i5 != 5) {
/* 60 */                            OoOil11Ol1o.I000oI1ioi(new i11OoiOIolO());
/* 6 */                             return 0;
                                }
/* 43 */                        ((Integer) this.I0000Il00O[i2]).getClass();
/* 50 */                        iI00000oOI2 = i11I0o0ii.I00000oOI(i4 << 3) + 4;
                            }
/* 52 */                    iI0001Ioi1lo = iI00000oOI2 + iI0001Ioi1lo;
                        } else {
/* 124 */                   int i7 = i4 << 3;
/* 132 */                   long jLongValue = ((Long) this.I0000Il00O[i2]).longValue();
/* 136 */                   iI00000oOI = i11I0o0ii.I00000oOI(i7);
/* 140 */                   iI0000Il00O = i11I0o0ii.I0000Il00O(jLongValue);
                        }
/* 82 */                iI0001Ioi1lo = iI0000Il00O + iI00000oOI + iI0001Ioi1lo;
                    }
/* 149 */           this.I0000O = iI0001Ioi1lo;
/* 151 */           return iI0001Ioi1lo;
                }

                public final void I0000Il00O(int i, Object obj) {
/* 3 */             if (!this.I0000oI00) {
/* 27 */                OIiilo1Ool0o.I000lI();
/* 37 */                return;
                    }
/* 9 */             I0000oI00(this.I00000oIO + 1);
/* 12 */            int[] iArr = this.I00000oOI;
/* 14 */            int i2 = this.I00000oIO;
/* 16 */            iArr[i2] = i;
/* 20 */            this.I0000Il00O[i2] = obj;
/* 24 */            this.I00000oIO = i2 + 1;
                }

                public final void I0000O(i11I1Ili i11i1ili) {
/* 3 */             if (this.I00000oIO != 0) {
/* 8 */                 for (int i = 0; i < this.I00000oIO; i++) {
/* 12 */                    int i2 = this.I00000oOI[i];
/* 16 */                    Object obj = this.I0000Il00O[i];
/* 18 */                    int i3 = i2 & 7;
/* 21 */                    int i4 = i2 >>> 3;
/* 22 */                    if (i3 == 0) {
/* 113 */                       ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i4, ((Long) obj).longValue());
                            } else if (i3 == 1) {
/* 99 */                        ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i4, ((Long) obj).longValue());
                            } else if (i3 == 2) {
/* 85 */                        ((i11I0o0ii) i11i1ili.I00iiI).I0001Ioi1lo(i4, (i11I0IiII0Ol) obj);
                            } else if (i3 == 3) {
/* 62 */                        ((i11I0o0ii) i11i1ili.I00iiI).I000oI1ioi(i4, 3);
/* 67 */                        ((i11o1i) obj).I0000O(i11i1ili);
/* 75 */                        ((i11I0o0ii) i11i1ili.I00iiI).I000oI1ioi(i4, 4);
                            } else {
/* 33 */                        if (i3 != 5) {
/* 54 */                            IioIoO10iOiI.I000lI(new i11OoiOIolO());
/* 57 */                            return;
                                }
/* 45 */                        ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i4, ((Integer) obj).intValue());
                            }
                        }
                    }
                }

                public final void I0000oI00(int i) {
/* 1 */             int[] iArr = this.I00000oOI;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.I00000oIO;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 13 */                    i = i3;
                        }
/* 16 */                if (i < 8) {
/* 18 */                    i = 8;
                        }
/* 23 */                this.I00000oOI = Arrays.copyOf(iArr, i);
/* 31 */                this.I0000Il00O = Arrays.copyOf(this.I0000Il00O, i);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 60 */                return true;
                    }
/* 5 */             if (obj != null && (obj instanceof i11o1i)) {
/* 13 */                i11o1i i11o1iVar = (i11o1i) obj;
/* 15 */                int i = this.I00000oIO;
/* 19 */                if (i == i11o1iVar.I00000oIO) {
/* 21 */                    int[] iArr = this.I00000oOI;
/* 23 */                    int[] iArr2 = i11o1iVar.I00000oOI;
/* 25 */                    int i2 = 0;
                            while (true) {
/* 26 */                        if (i2 >= i) {
/* 38 */                            Object[] objArr = this.I0000Il00O;
/* 40 */                            Object[] objArr2 = i11o1iVar.I0000Il00O;
/* 42 */                            int i3 = this.I00000oIO;
/* 45 */                            for (int i4 = 0; i4 < i3; i4++) {
/* 55 */                                if (objArr[i4].equals(objArr2[i4])) {
                                        }
                                    }
/* 60 */                            return true;
                                }
/* 32 */                        if (iArr[i2] != iArr2[i2]) {
                                    break;
                                }
/* 35 */                        i2++;
                            }
                        }
                    }
/* 4 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = i + 527;
/* 5 */             int[] iArr = this.I00000oOI;
/* 8 */             int iHashCode = 17;
/* 11 */            int i3 = 17;
/* 12 */            for (int i4 = 0; i4 < i; i4++) {
/* 18 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 25 */            int i5 = ((i2 * 31) + i3) * 31;
/* 27 */            Object[] objArr = this.I0000Il00O;
/* 29 */            int i6 = this.I00000oIO;
/* 31 */            for (int i7 = 0; i7 < i6; i7++) {
/* 41 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return i5 + iHashCode;
                }
            }

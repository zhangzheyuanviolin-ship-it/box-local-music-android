            package p000;

            import java.util.Arrays;
            
            public final class OoiO0l {
                public static final OoiO0l I0001Ioi1lo = new OoiO0l(0, new int[0], new Object[0], false);
                public int I00000oIO;
                public int[] I00000oOI;
                public Object[] I0000Il00O;
                public int I0000O = -1;
                public boolean I0000oI00;

                public OoiO0l(int i, int[] iArr, Object[] objArr, boolean z) {
/* 7 */             this.I00000oIO = i;
/* 9 */             this.I00000oOI = iArr;
/* 11 */            this.I0000Il00O = objArr;
/* 13 */            this.I0000oI00 = z;
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
                    int iI000O01llI02;
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
/* 98 */                        ((Long) this.I0000Il00O[i3]).getClass();
/* 105 */                       iI000O01llI02 = IOOOio0o.I000O01llI0(i5) + 8;
                            } else if (i6 == 2) {
/* 87 */                        iI000O01llI02 = IOOOio0o.I0001Ioi1lo(i5, (IIO1ooI) this.I0000Il00O[i3]);
                            } else if (i6 == 3) {
/* 66 */                        iI000O01llI0 = IOOOio0o.I000O01llI0(i5) * 2;
/* 73 */                        iI000OiO = ((OoiO0l) this.I0000Il00O[i3]).I00000oOI();
                            } else {
/* 33 */                        if (i6 != 5) {
/* 57 */                            OoOil11Ol1o.I000oI1ioi(O0011oo.I00000oOI());
/* 60 */                            return 0;
                                }
/* 41 */                        ((Integer) this.I0000Il00O[i3]).getClass();
/* 48 */                        iI000O01llI02 = IOOOio0o.I000O01llI0(i5) + 4;
                            }
/* 50 */                    i2 = iI000O01llI02 + i2;
                        } else {
/* 114 */                   long jLongValue = ((Long) this.I0000Il00O[i3]).longValue();
/* 118 */                   iI000O01llI0 = IOOOio0o.I000O01llI0(i5);
/* 122 */                   iI000OiO = IOOOio0o.I000OiO(jLongValue);
                        }
/* 78 */                i2 = iI000OiO + iI000O01llI0 + i2;
                    }
/* 130 */           this.I0000O = i2;
/* 245 */           return i2;
                }

                public final void I0000Il00O(int i, Object obj) {
/* 3 */             if (!this.I0000oI00) {
/* 27 */                OIiilo1Ool0o.I000lI();
/* 37 */                return;
                    }
/* 9 */             I00000oIO(this.I00000oIO + 1);
/* 12 */            int[] iArr = this.I00000oOI;
/* 14 */            int i2 = this.I00000oIO;
/* 16 */            iArr[i2] = i;
/* 20 */            this.I0000Il00O[i2] = obj;
/* 24 */            this.I00000oIO = i2 + 1;
                }

                public final void I0000O(IIOOoll iIOOoll) {
/* 3 */             if (this.I00000oIO == 0) {
/* 168 */               return;
                    }
/* 6 */             iIOOoll.getClass();
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 16 */            for (int i = 0; i < this.I00000oIO; i++) {
/* 20 */                int i2 = this.I00000oOI[i];
/* 24 */                Object obj = this.I0000Il00O[i];
/* 26 */                int i3 = i2 >>> 3;
/* 28 */                int i4 = i2 & 7;
/* 30 */                if (i4 == 0) {
/* 97 */                    iOOOio0o.I00II0oii1o(i3, ((Long) obj).longValue());
                        } else if (i4 == 1) {
/* 87 */                    iOOOio0o.I00111O(i3, ((Long) obj).longValue());
                        } else if (i4 == 2) {
/* 77 */                    iOOOio0o.I00100l0(i3, (IIO1ooI) obj);
                        } else if (i4 == 3) {
/* 62 */                    iOOOio0o.I001lllioOl(i3, 3);
/* 67 */                    ((OoiO0l) obj).I0000O(iIOOoll);
/* 71 */                    iOOOio0o.I001lllioOl(i3, 4);
                        } else {
/* 42 */                    if (i4 != 5) {
/* 58 */                        IioIoO10iOiI.I000lI(O0011oo.I00000oOI());
/* 61 */                        return;
                            }
/* 50 */                    iOOOio0o.I0010I0i(i3, ((Integer) obj).intValue());
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof OoiO0l)) {
/* 5 */                 return false;
                    }
/* 14 */            OoiO0l ooiO0l = (OoiO0l) obj;
/* 16 */            int i = this.I00000oIO;
/* 20 */            if (i == ooiO0l.I00000oIO) {
/* 22 */                int[] iArr = this.I00000oOI;
/* 24 */                int[] iArr2 = ooiO0l.I00000oOI;
/* 26 */                int i2 = 0;
                        while (true) {
/* 27 */                    if (i2 >= i) {
/* 39 */                        Object[] objArr = this.I0000Il00O;
/* 41 */                        Object[] objArr2 = ooiO0l.I0000Il00O;
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

            package p000;

            import java.util.Arrays;
            
            public final class OlIIioolI implements Cloneable {
                public boolean I00iOIl;
                public int[] I00iiI;
                public Object[] I00iiO;
                public int I00iio;

                public OlIIioolI(int i) {
                    int i2;
/* 5 */             int i3 = 4;
                    while (true) {
/* 8 */                 i2 = 40;
/* 10 */                if (i3 >= 32) {
                            break;
                        }
                        int i4 = (1 << i3) - 12;
/* 16 */                if (40 <= i4) {
/* 18 */                    i2 = i4;
                            break;
                        }
/* 20 */                i3++;
                    }
/* 23 */            int i5 = i2 / 4;
/* 26 */            this.I00iiI = new int[i5];
/* 30 */            this.I00iiO = new Object[i5];
                }

                public final OlIIioolI clone() {
/* 5 */             OlIIioolI olIIioolI = (OlIIioolI) super.clone();
/* 15 */            olIIioolI.I00iiI = (int[]) this.I00iiI.clone();
/* 25 */            olIIioolI.I00iiO = (Object[]) this.I00iiO.clone();
/* 55 */            return olIIioolI;
                }

                public final int I00000oOI(int i) {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 iO10Oii01l.I00000oOI(this);
                    }
/* 10 */            return this.I00iiI[i];
                }

                public final void I0000Il00O(int i, Object obj) {
/* 5 */             int iI00000oIO = iIIl1I0OIlO0.I00000oIO(this.I00iio, i, this.I00iiI);
/* 9 */             if (iI00000oIO >= 0) {
/* 13 */                this.I00iiO[iI00000oIO] = obj;
/* 15 */                return;
                    }
/* 16 */            int i2 = ~iI00000oIO;
/* 17 */            int i3 = this.I00iio;
/* 19 */            if (i2 < i3) {
/* 21 */                Object[] objArr = this.I00iiO;
/* 27 */                if (objArr[i2] == iO10Oii01l.I00000oIO) {
/* 31 */                    this.I00iiI[i2] = i;
/* 33 */                    objArr[i2] = obj;
/* 35 */                    return;
                        }
                    }
/* 38 */            if (this.I00iOIl && i3 >= this.I00iiI.length) {
/* 45 */                iO10Oii01l.I00000oOI(this);
/* 56 */                i2 = ~iIIl1I0OIlO0.I00000oIO(this.I00iio, i, this.I00iiI);
                    }
/* 57 */            int i4 = this.I00iio;
/* 63 */            if (i4 >= this.I00iiI.length) {
/* 67 */                int i5 = (i4 + 1) * 4;
/* 68 */                int i6 = 4;
                        while (true) {
/* 71 */                    if (i6 >= 32) {
                                break;
                            }
                            int i7 = (1 << i6) - 12;
/* 77 */                    if (i5 <= i7) {
/* 79 */                        i5 = i7;
                                break;
                            }
/* 81 */                    i6++;
                        }
/* 84 */                int i8 = i5 / 4;
/* 91 */                this.I00iiI = Arrays.copyOf(this.I00iiI, i8);
/* 99 */                this.I00iiO = Arrays.copyOf(this.I00iiO, i8);
                    }
/* 101 */           int i9 = this.I00iio;
/* 105 */           if (i9 - i2 != 0) {
/* 107 */               int[] iArr = this.I00iiI;
/* 109 */               int i10 = i2 + 1;
/* 111 */               I1IoiO1l.I000O01llI0(i10, i2, i9, iArr, iArr);
/* 114 */               Object[] objArr2 = this.I00iiO;
/* 118 */               I1IoiO1l.I000iOII(objArr2, i10, objArr2, i2, this.I00iio);
                    }
/* 123 */           this.I00iiI[i2] = i;
/* 127 */           this.I00iiO[i2] = obj;
                    this.I00iio++;
                }

                public final int I0000O() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 iO10Oii01l.I00000oOI(this);
                    }
/* 8 */             return this.I00iio;
                }

                public final Object I0000oI00(int i) {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 iO10Oii01l.I00000oOI(this);
                    }
/* 8 */             Object[] objArr = this.I00iiO;
/* 11 */            if (i < objArr.length) {
/* 13 */                return objArr[i];
                    }
/* 29 */            throw new ArrayIndexOutOfBoundsException();
                }

                public final String toString() {
/* 5 */             if (I0000O() <= 0) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.I00iio * 28);
/* 21 */            sb.append('{');
/* 24 */            int i = this.I00iio;
/* 27 */            for (int i2 = 0; i2 < i; i2++) {
/* 29 */                if (i2 > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 40 */                sb.append(I00000oOI(i2));
/* 45 */                sb.append('=');
/* 48 */                Object objI0000oI00 = I0000oI00(i2);
/* 52 */                if (objI0000oI00 != this) {
/* 54 */                    sb.append(objI0000oI00);
                        } else {
/* 60 */                    sb.append("(this Map)");
                        }
                    }
/* 68 */            sb.append('}');
/* 71 */            return sb.toString();
                }
            }

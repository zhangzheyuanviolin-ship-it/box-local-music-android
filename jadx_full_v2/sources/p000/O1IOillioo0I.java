            package p000;

            import java.util.Arrays;
            
/* 42 */    public final class O1IOillioo0I implements Cloneable {
                public boolean I00iOIl;
                public long[] I00iiI;
                public Object[] I00iiO;
                public int I00iio;

                public O1IOillioo0I(int i) {
/* 4 */             if (i == 0) {
/* 8 */                 this.I00iiI = iIIl1I0OIlO0.I00000oOI;
/* 12 */                this.I00iiO = iIIl1I0OIlO0.I0000Il00O;
/* 14 */                return;
                    }
/* 15 */            int i2 = i * 8;
/* 17 */            int i3 = 4;
                    while (true) {
/* 20 */                if (i3 >= 32) {
                            break;
                        }
                        int i4 = (1 << i3) - 12;
/* 26 */                if (i2 <= i4) {
/* 28 */                    i2 = i4;
                            break;
                        }
/* 30 */                i3++;
                    }
/* 33 */            int i5 = i2 / 8;
/* 37 */            this.I00iiI = new long[i5];
/* 41 */            this.I00iiO = new Object[i5];
                }

                public final void I00000oIO() {
/* 1 */             int i = this.I00iio;
/* 3 */             Object[] objArr = this.I00iiO;
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                objArr[i2] = null;
                    }
/* 15 */            this.I00iio = 0;
/* 17 */            this.I00iOIl = false;
                }

                public final Object I00000oOI(long j) {
                    Object obj;
/* 5 */             int iI00000oOI = iIIl1I0OIlO0.I00000oOI(this.I00iiI, this.I00iio, j);
/* 9 */             if (iI00000oOI < 0 || (obj = this.I00iiO[iI00000oOI]) == iIoOoiIO.I00000oIO) {
/* 21 */                return null;
                    }
/* 20 */            return obj;
                }

                public final long I0000Il00O(int i) {
                    int i2;
/* 2 */             if (i < 0 || i >= (i2 = this.I00iio)) {
/* 65 */                lO00l0o.I00000oIO("Expected index to be within 0..size()-1, but was " + i);
/* 77 */                throw null;
                    }
/* 10 */            if (this.I00iOIl) {
/* 12 */                long[] jArr = this.I00iiI;
/* 14 */                Object[] objArr = this.I00iiO;
/* 18 */                int i3 = 0;
/* 19 */                for (int i4 = 0; i4 < i2; i4++) {
/* 21 */                    Object obj = objArr[i4];
/* 25 */                    if (obj != iIoOoiIO.I00000oIO) {
/* 27 */                        if (i4 != i3) {
/* 31 */                            jArr[i3] = jArr[i4];
/* 33 */                            objArr[i3] = obj;
/* 35 */                            objArr[i4] = null;
                                }
/* 37 */                        i3++;
                            }
                        }
/* 42 */                this.I00iOIl = false;
/* 44 */                this.I00iio = i3;
                    }
/* 48 */            return this.I00iiI[i];
                }

                public final void I0000O(long j, Object obj) {
/* 5 */             int iI00000oOI = iIIl1I0OIlO0.I00000oOI(this.I00iiI, this.I00iio, j);
/* 9 */             if (iI00000oOI >= 0) {
/* 13 */                this.I00iiO[iI00000oOI] = obj;
/* 15 */                return;
                    }
/* 16 */            int i = ~iI00000oOI;
/* 17 */            int i2 = this.I00iio;
/* 19 */            Object obj2 = iIoOoiIO.I00000oIO;
/* 21 */            if (i < i2) {
/* 23 */                Object[] objArr = this.I00iiO;
/* 27 */                if (objArr[i] == obj2) {
/* 31 */                    this.I00iiI[i] = j;
/* 33 */                    objArr[i] = obj;
/* 35 */                    return;
                        }
                    }
/* 38 */            if (this.I00iOIl) {
/* 40 */                long[] jArr = this.I00iiI;
/* 43 */                if (i2 >= jArr.length) {
/* 45 */                    Object[] objArr2 = this.I00iiO;
/* 49 */                    int i3 = 0;
/* 50 */                    for (int i4 = 0; i4 < i2; i4++) {
/* 52 */                        Object obj3 = objArr2[i4];
/* 54 */                        if (obj3 != obj2) {
/* 56 */                            if (i4 != i3) {
/* 60 */                                jArr[i3] = jArr[i4];
/* 62 */                                objArr2[i3] = obj3;
/* 65 */                                objArr2[i4] = null;
                                    }
/* 67 */                            i3++;
                                }
                            }
/* 72 */                    this.I00iOIl = false;
/* 74 */                    this.I00iio = i3;
/* 82 */                    i = ~iIIl1I0OIlO0.I00000oOI(this.I00iiI, i3, j);
                        }
                    }
/* 83 */            int i5 = this.I00iio;
/* 89 */            if (i5 >= this.I00iiI.length) {
/* 92 */                int i6 = (i5 + 1) * 8;
/* 94 */                int i7 = 4;
                        while (true) {
/* 97 */                    if (i7 >= 32) {
                                break;
                            }
                            int i8 = (1 << i7) - 12;
/* 103 */                   if (i6 <= i8) {
/* 105 */                       i6 = i8;
                                break;
                            }
/* 107 */                   i7++;
                        }
/* 110 */               int i9 = i6 / 8;
/* 118 */               this.I00iiI = Arrays.copyOf(this.I00iiI, i9);
/* 126 */               this.I00iiO = Arrays.copyOf(this.I00iiO, i9);
                    }
/* 128 */           int i10 = this.I00iio;
/* 132 */           if (i10 - i != 0) {
/* 134 */               long[] jArr2 = this.I00iiI;
/* 136 */               int i11 = i + 1;
/* 138 */               I1IoiO1l.I000OiO(jArr2, jArr2, i11, i, i10);
/* 141 */               Object[] objArr3 = this.I00iiO;
/* 145 */               I1IoiO1l.I000iOII(objArr3, i11, objArr3, i, this.I00iio);
                    }
/* 150 */           this.I00iiI[i] = j;
/* 154 */           this.I00iiO[i] = obj;
                    this.I00iio++;
                }

                public final void I0000oI00(long j) {
/* 5 */             int iI00000oOI = iIIl1I0OIlO0.I00000oOI(this.I00iiI, this.I00iio, j);
/* 9 */             if (iI00000oOI >= 0) {
/* 11 */                Object[] objArr = this.I00iiO;
/* 13 */                Object obj = objArr[iI00000oOI];
/* 15 */                Object obj2 = iIoOoiIO.I00000oIO;
/* 17 */                if (obj != obj2) {
/* 19 */                    objArr[iI00000oOI] = obj2;
/* 22 */                    this.I00iOIl = true;
                        }
                    }
                }

                public final int I0001Ioi1lo() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 int i = this.I00iio;
/* 7 */                 long[] jArr = this.I00iiI;
/* 9 */                 Object[] objArr = this.I00iiO;
/* 13 */                int i2 = 0;
/* 14 */                for (int i3 = 0; i3 < i; i3++) {
/* 16 */                    Object obj = objArr[i3];
/* 20 */                    if (obj != iIoOoiIO.I00000oIO) {
/* 22 */                        if (i3 != i2) {
/* 26 */                            jArr[i2] = jArr[i3];
/* 28 */                            objArr[i2] = obj;
/* 31 */                            objArr[i3] = null;
                                }
/* 33 */                        i2++;
                            }
                        }
/* 38 */                this.I00iOIl = false;
/* 40 */                this.I00iio = i2;
                    }
/* 42 */            return this.I00iio;
                }

                public final Object I000II(int i) {
                    int i2;
/* 2 */             if (i < 0 || i >= (i2 = this.I00iio)) {
/* 65 */                lO00l0o.I00000oIO("Expected index to be within 0..size()-1, but was " + i);
/* 77 */                throw null;
                    }
/* 10 */            if (this.I00iOIl) {
/* 12 */                long[] jArr = this.I00iiI;
/* 14 */                Object[] objArr = this.I00iiO;
/* 18 */                int i3 = 0;
/* 19 */                for (int i4 = 0; i4 < i2; i4++) {
/* 21 */                    Object obj = objArr[i4];
/* 25 */                    if (obj != iIoOoiIO.I00000oIO) {
/* 27 */                        if (i4 != i3) {
/* 31 */                            jArr[i3] = jArr[i4];
/* 33 */                            objArr[i3] = obj;
/* 35 */                            objArr[i4] = null;
                                }
/* 37 */                        i3++;
                            }
                        }
/* 42 */                this.I00iOIl = false;
/* 44 */                this.I00iio = i3;
                    }
/* 48 */            return this.I00iiO[i];
                }

                public final Object clone() {
/* 5 */             O1IOillioo0I o1IOillioo0I = (O1IOillioo0I) super.clone();
/* 15 */            o1IOillioo0I.I00iiI = (long[]) this.I00iiI.clone();
/* 25 */            o1IOillioo0I.I00iiO = (Object[]) this.I00iiO.clone();
/* 55 */            return o1IOillioo0I;
                }

                public final String toString() {
/* 5 */             if (I0001Ioi1lo() <= 0) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.I00iio * 28);
/* 21 */            sb.append('{');
/* 24 */            int i = this.I00iio;
/* 27 */            for (int i2 = 0; i2 < i; i2++) {
/* 29 */                if (i2 > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 40 */                sb.append(I0000Il00O(i2));
/* 45 */                sb.append('=');
/* 48 */                Object objI000II = I000II(i2);
/* 52 */                if (objI000II != sb) {
/* 54 */                    sb.append(objI000II);
                        } else {
/* 60 */                    sb.append("(this Map)");
                        }
                    }
/* 68 */            sb.append('}');
/* 71 */            return sb.toString();
                }

/* 43 */        public O1IOillioo0I(Object obj) {
/* 44 */            this(10);
                }
            }

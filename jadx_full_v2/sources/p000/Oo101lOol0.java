            package p000;
            
            public final class Oo101lOol0 {
                public final int I00000oIO;
                public final long[] I00000oOI;
                public final Object[] I0000Il00O;

                public Oo101lOol0(int i, long[] jArr, Object[] objArr) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = jArr;
/* 8 */             this.I0000Il00O = objArr;
                }

                public final int I00000oIO(long j) {
                    int i = this.I00000oIO - 1;
/* 6 */             if (i != -1) {
/* 8 */                 long[] jArr = this.I00000oOI;
/* 10 */                int i2 = 0;
/* 11 */                if (i != 0) {
/* 13 */                    while (i2 <= i) {
/* 17 */                        int i3 = (i2 + i) >>> 1;
/* 21 */                        long j2 = jArr[i3] - j;
/* 26 */                        if (j2 < 0) {
/* 28 */                            i2 = i3 + 1;
                                } else {
/* 31 */                            if (j2 <= 0) {
/* 36 */                                return i3;
                                    }
                                    i = i3 - 1;
                                }
                            }
/* 39 */                    return -(i2 + 1);
                        }
/* 41 */                long j3 = jArr[0];
/* 45 */                if (j3 == j) {
/* 10 */                    return 0;
                        }
/* 48 */                if (j3 > j) {
/* 50 */                    return -2;
                        }
                    }
/* 5 */             return -1;
                }

                public final Oo101lOol0 I00000oOI(long j, Object obj) {
                    long[] jArr;
                    int i;
/* 1 */             Object[] objArr = this.I0000Il00O;
/* 4 */             int i2 = 0;
/* 6 */             int i3 = 0;
/* 7 */             for (Object obj2 : objArr) {
/* 11 */                if (obj2 != null) {
/* 13 */                    i3++;
                        }
                    }
/* 18 */            int i4 = i3 + 1;
/* 20 */            long[] jArr2 = new long[i4];
/* 22 */            Object[] objArr2 = new Object[i4];
/* 25 */            if (i4 > 1) {
/* 27 */                int i5 = 0;
                        while (true) {
/* 28 */                    jArr = this.I00000oOI;
/* 30 */                    i = this.I00000oIO;
/* 32 */                    if (i2 >= i4 || i5 >= i) {
                                break;
                            }
/* 36 */                    long j2 = jArr[i5];
/* 38 */                    Object obj3 = objArr[i5];
/* 42 */                    if (j2 > j) {
/* 44 */                        jArr2[i2] = j;
/* 46 */                        objArr2[i2] = obj;
/* 48 */                        i2++;
                                break;
                            }
/* 51 */                    if (obj3 != null) {
/* 53 */                        jArr2[i2] = j2;
/* 55 */                        objArr2[i2] = obj3;
/* 57 */                        i2++;
                            }
/* 59 */                    i5++;
                        }
/* 62 */                if (i5 == i) {
/* 64 */                    jArr2[i3] = j;
/* 66 */                    objArr2[i3] = obj;
                        } else {
/* 69 */                    while (i2 < i4) {
/* 71 */                        long j3 = jArr[i5];
/* 73 */                        Object obj4 = objArr[i5];
/* 75 */                        if (obj4 != null) {
/* 77 */                            jArr2[i2] = j3;
/* 79 */                            objArr2[i2] = obj4;
/* 81 */                            i2++;
                                }
/* 83 */                        i5++;
                            }
                        }
                    } else {
/* 86 */                jArr2[0] = j;
/* 88 */                objArr2[0] = obj;
                    }
/* 92 */            return new Oo101lOol0(i4, jArr2, objArr2);
                }
            }

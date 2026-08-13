            package p000;

            import java.util.Arrays;
            
/* 79 */    public abstract class IoilIilo {
                public final int I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;

                public IoilIilo(int i, byte b) {
/* 1 */             this.I00000oIO = i;
                    switch (i) {
                        case 2:
/* 70 */                    lioIlO.I00000oIO(4, "initialCapacity");
/* 75 */                    this.I00000oOI = new Object[4];
/* 78 */                    this.I0000Il00O = 0;
                            break;
                        case 3:
/* 58 */                    this.I00000oOI = new Object[4];
/* 61 */                    this.I0000Il00O = 0;
                            break;
                        case 4:
/* 41 */                    ll0iOo11011i.I00000oOI(4, "initialCapacity");
/* 46 */                    this.I00000oOI = new Object[4];
/* 49 */                    this.I0000Il00O = 0;
                            break;
                        case 5:
/* 27 */                    this.I00000oOI = null;
/* 30 */                    this.I0000O = false;
/* 32 */                    this.I0000Il00O = 0;
                            break;
                        default:
/* 12 */                    liO1lOO1oIO.I00000oIO(4, "initialCapacity");
/* 17 */                    this.I00000oOI = new Object[4];
/* 20 */                    this.I0000Il00O = 0;
                            break;
                    }
                }

                public static IolIIo0o0Iio I0000Il00O() {
/* 3 */             IolIIo0o0Iio iolIIo0o0Iio = new IolIIo0o0Iio();
/* 7 */             iolIIo0o0Iio.I00000oIO = true;
/* 10 */            iolIIo0o0Iio.I00000oOI = 0;
/* 20 */            return iolIIo0o0Iio;
                }

                public static int I0000O(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 26 */                I000II.I000iOII("cannot store more than Integer.MAX_VALUE elements");
/* 29 */                return 0;
                    }
/* 3 */             if (i2 <= i) {
/* 5 */                 return i;
                    }
/* 9 */             int iI0000Il00O = i + (i >> 1) + 1;
/* 11 */            if (iI0000Il00O < i2) {
/* 14 */                iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                    }
/* 18 */            if (iI0000Il00O < 0) {
/* 20 */                return Integer.MAX_VALUE;
                    }
/* 23 */            return iI0000Il00O;
                }

                public static int I000II(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 29 */                I000II.I000iOII("cannot store more than Integer.MAX_VALUE elements");
/* 32 */                return 0;
                    }
/* 3 */             if (i2 <= i) {
/* 5 */                 return i;
                    }
/* 9 */             int iHighestOneBit = i + (i >> 1) + 1;
/* 11 */            if (iHighestOneBit < i2) {
/* 19 */                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
                    }
/* 21 */            if (iHighestOneBit < 0) {
/* 23 */                return Integer.MAX_VALUE;
                    }
/* 26 */            return iHighestOneBit;
                }

                public static int I000OOo1O(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 26 */                I000II.I000iOII("cannot store more than Integer.MAX_VALUE elements");
/* 29 */                return 0;
                    }
/* 3 */             if (i2 <= i) {
/* 5 */                 return i;
                    }
/* 9 */             int iI0000Il00O = i + (i >> 1) + 1;
/* 11 */            if (iI0000Il00O < i2) {
/* 14 */                iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                    }
/* 18 */            if (iI0000Il00O < 0) {
/* 20 */                return Integer.MAX_VALUE;
                    }
/* 23 */            return iI0000Il00O;
                }

                public static int I000OiO(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 26 */                I000II.I000iOII("cannot store more than Integer.MAX_VALUE elements");
/* 29 */                return 0;
                    }
/* 3 */             if (i2 <= i) {
/* 5 */                 return i;
                    }
/* 9 */             int iI0000Il00O = i + (i >> 1) + 1;
/* 11 */            if (iI0000Il00O < i2) {
/* 14 */                iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                    }
/* 18 */            if (iI0000Il00O < 0) {
/* 20 */                return Integer.MAX_VALUE;
                    }
/* 23 */            return iI0000Il00O;
                }

                public void I00000oIO(Object obj) {
/* 1 */             obj.getClass();
/* 5 */             I0000oI00(1);
/* 8 */             Object[] objArr = this.I00000oOI;
/* 10 */            int i = this.I0000Il00O;
/* 14 */            this.I0000Il00O = i + 1;
/* 16 */            objArr[i] = obj;
                }

                public void I00000oOI(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             Object[] objArr = this.I00000oOI;
/* 11 */            int iI000II = I000II(objArr.length, this.I0000Il00O + 1);
/* 16 */            if (iI000II > objArr.length || this.I0000O) {
/* 28 */                this.I00000oOI = Arrays.copyOf(this.I00000oOI, iI000II);
/* 31 */                this.I0000O = false;
                    }
/* 33 */            Object[] objArr2 = this.I00000oOI;
/* 35 */            int i = this.I0000Il00O;
/* 39 */            this.I0000Il00O = i + 1;
/* 41 */            objArr2[i] = obj;
                }

                public void I0000oI00(int i) {
/* 3 */             int length = this.I00000oOI.length;
/* 7 */             int iI0000O = I0000O(length, this.I0000Il00O + i);
/* 11 */            if (iI0000O > length || this.I0000O) {
/* 25 */                this.I00000oOI = Arrays.copyOf(this.I00000oOI, iI0000O);
/* 28 */                this.I0000O = false;
                    }
                }

                public abstract void I0001Ioi1lo(Io0OoIoOo io0OoIoOo, OloIlI0ll oloIlI0ll);

                public void I000O01llI0(Object obj) {
                    switch (this.I00000oIO) {
                        case 2:
/* 87 */                    obj.getClass();
/* 90 */                    I000iOII(1);
/* 93 */                    Object[] objArr = this.I00000oOI;
/* 95 */                    int i = this.I0000Il00O;
/* 99 */                    this.I0000Il00O = i + 1;
/* 101 */                   objArr[i] = obj;
                            break;
                        case 3:
/* 24 */                    obj.getClass();
/* 27 */                    int i2 = this.I0000Il00O;
/* 29 */                    int i3 = i2 + 1;
/* 31 */                    Object[] objArrCopyOf = this.I00000oOI;
/* 33 */                    int length = objArrCopyOf.length;
/* 35 */                    if (length < i3) {
/* 40 */                        int i4 = length + (length >> 1) + 1;
/* 41 */                        if (i4 < i3) {
/* 43 */                            int iHighestOneBit = Integer.highestOneBit(i2);
/* 47 */                            i4 = iHighestOneBit + iHighestOneBit;
                                }
/* 49 */                        if (i4 < 0) {
/* 51 */                            i4 = Integer.MAX_VALUE;
                                }
/* 54 */                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
/* 58 */                        this.I00000oOI = objArrCopyOf;
/* 60 */                        this.I0000O = false;
                            } else if (this.I0000O) {
/* 72 */                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
/* 74 */                        this.I00000oOI = objArrCopyOf;
/* 76 */                        this.I0000O = false;
                            }
/* 78 */                    int i5 = this.I0000Il00O;
/* 82 */                    this.I0000Il00O = i5 + 1;
/* 84 */                    objArrCopyOf[i5] = obj;
                            break;
                        default:
/* 7 */                     obj.getClass();
/* 10 */                    I000iOII(1);
/* 13 */                    Object[] objArr2 = this.I00000oOI;
/* 15 */                    int i6 = this.I0000Il00O;
/* 19 */                    this.I0000Il00O = i6 + 1;
/* 21 */                    objArr2[i6] = obj;
                            break;
                    }
                }

                public void I000iOII(int i) {
                    switch (this.I00000oIO) {
                        case 2:
/* 36 */                    int length = this.I00000oOI.length;
/* 40 */                    int iI000OOo1O = I000OOo1O(length, this.I0000Il00O + i);
/* 44 */                    if (iI000OOo1O > length || this.I0000O) {
/* 56 */                        this.I00000oOI = Arrays.copyOf(this.I00000oOI, iI000OOo1O);
/* 58 */                        this.I0000O = false;
                                break;
                            }
                            break;
                        default:
/* 9 */                     int length2 = this.I00000oOI.length;
/* 13 */                    int iI000OiO = I000OiO(length2, this.I0000Il00O + i);
/* 17 */                    if (iI000OiO > length2 || this.I0000O) {
/* 29 */                        this.I00000oOI = Arrays.copyOf(this.I00000oOI, iI000OiO);
/* 31 */                        this.I0000O = false;
                                break;
                            }
                            break;
                    }
                }

/* 81 */        public IoilIilo(int i) {
                    this.I00000oIO = 0;
/* 83 */            ii1oO1IOiI1o.I00000oIO(i, "initialCapacity");
/* 84 */            this.I00000oOI = new Object[i];
/* 85 */            this.I0000Il00O = 0;
                }
            }

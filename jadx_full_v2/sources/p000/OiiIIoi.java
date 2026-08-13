            package p000;
            
            public final class OiiIIoi extends IIOIIi1ilIO {
                public final transient byte[][] I00ilI0I1;
                public final transient int[] I00ilO0;

                public OiiIIoi(byte[][] bArr, int[] iArr) {
/* 5 */             super(IIOIIi1ilIO.I00iio.I00iOIl);
/* 8 */             this.I00ilI0I1 = bArr;
/* 10 */            this.I00ilO0 = iArr;
                }

                @Override
                public final int I00000oOI() {
/* 8 */             return this.I00ilO0[this.I00ilI0I1.length - 1];
                }

                @Override
                public final String I0000Il00O() {
/* 5 */             return I00100o1O0lo().I0000Il00O();
                }

                @Override
                public final int I0000O(int i, byte[] bArr) {
/* 5 */             return I00100o1O0lo().I0000O(i, bArr);
                }

                @Override
                public final byte[] I0001Ioi1lo() {
/* 1 */             return I00100l0();
                }

                @Override
                public final byte I000II(int i) {
/* 1 */             byte[][] bArr = this.I00ilI0I1;
                    int length = bArr.length - 1;
/* 6 */             int[] iArr = this.I00ilO0;
/* 14 */            iO1oO1OoOoii.I00000oOI(iArr[length], i, 1L);
/* 17 */            int iI00000oIO = iO1oO1I0i.I00000oIO(this, i);
/* 37 */            return bArr[iI00000oIO][(i - (iI00000oIO == 0 ? 0 : iArr[iI00000oIO - 1])) + iArr[bArr.length + iI00000oIO]];
                }

                @Override
                public final int I000O01llI0(byte[] bArr) {
/* 5 */             return I00100o1O0lo().I000O01llI0(bArr);
                }

                @Override
                public final boolean I000OOo1O(int i, IIOIIi1ilIO iIOIIi1ilIO, int i2) {
/* 2 */             if (i >= 0 && i <= I00000oOI() - i2) {
/* 12 */                int i3 = i2 + i;
/* 13 */                int iI00000oIO = iO1oO1I0i.I00000oIO(this, i);
/* 17 */                int i4 = 0;
/* 18 */                while (i < i3) {
/* 20 */                    int[] iArr = this.I00ilO0;
/* 28 */                    int i5 = iI00000oIO == 0 ? 0 : iArr[iI00000oIO - 1];
/* 32 */                    int i6 = iArr[iI00000oIO] - i5;
/* 33 */                    byte[][] bArr = this.I00ilI0I1;
/* 37 */                    int i7 = iArr[bArr.length + iI00000oIO];
/* 44 */                    int iMin = Math.min(i3, i6 + i5) - i;
/* 54 */                    if (iIOIIi1ilIO.I000OiO(i4, bArr[iI00000oIO], (i - i5) + i7, iMin)) {
/* 57 */                        i4 += iMin;
/* 58 */                        i += iMin;
/* 59 */                        iI00000oIO++;
                            }
                        }
/* 62 */                return true;
                    }
/* 1 */             return false;
                }

                @Override
                public final boolean I000OiO(int i, byte[] bArr, int i2, int i3) {
/* 2 */             if (i >= 0 && i <= I00000oOI() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
/* 18 */                int i4 = i3 + i;
/* 19 */                int iI00000oIO = iO1oO1I0i.I00000oIO(this, i);
/* 23 */                while (i < i4) {
/* 25 */                    int[] iArr = this.I00ilO0;
/* 33 */                    int i5 = iI00000oIO == 0 ? 0 : iArr[iI00000oIO - 1];
/* 37 */                    int i6 = iArr[iI00000oIO] - i5;
/* 38 */                    byte[][] bArr2 = this.I00ilI0I1;
/* 42 */                    int i7 = iArr[bArr2.length + iI00000oIO];
/* 49 */                    int iMin = Math.min(i4, i6 + i5) - i;
/* 59 */                    if (iO1oO1OoOoii.I00000oIO(bArr2[iI00000oIO], (i - i5) + i7, bArr, i2, iMin)) {
/* 62 */                        i2 += iMin;
/* 63 */                        i += iMin;
/* 64 */                        iI00000oIO++;
                            }
                        }
/* 67 */                return true;
                    }
/* 1 */             return false;
                }

                @Override
                public final IIOIIi1ilIO I000iOII(int i, int i2) {
/* 4 */             if (i2 == -1234567890) {
/* 6 */                 i2 = I00000oOI();
                    }
/* 11 */            if (i < 0) {
/* 166 */               I000II.I0010I0i(IIlIOloOOO.I00100l0("beginIndex=", i, " < 0"));
/* 10 */                return null;
                    }
/* 19 */            if (i2 > I00000oOI()) {
/* 128 */               StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("endIndex=", i2, " > length(");
/* 136 */               sbI00100o1O0lo.append(I00000oOI());
/* 141 */               sbI00100o1O0lo.append(')');
/* 157 */               throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                    }
/* 21 */            int i3 = i2 - i;
/* 23 */            if (i3 < 0) {
/* 122 */               I000II.I0010I0i(IIl001iO0Io.I000l1(i2, i, "endIndex=", " < beginIndex="));
/* 10 */                return null;
                    }
/* 25 */            if (i == 0 && i2 == I00000oOI()) {
/* 33 */                return this;
                    }
/* 34 */            if (i == i2) {
/* 36 */                return IIOIIi1ilIO.I00iio;
                    }
/* 39 */            int iI00000oIO = iO1oO1I0i.I00000oIO(this, i);
/* 45 */            int iI00000oIO2 = iO1oO1I0i.I00000oIO(this, i2 - 1);
/* 51 */            byte[][] bArr = this.I00ilI0I1;
/* 57 */            byte[][] bArr2 = (byte[][]) I1IoiO1l.I00100o1O0lo(bArr, iI00000oIO, iI00000oIO2 + 1);
/* 62 */            int[] iArr = new int[bArr2.length * 2];
/* 65 */            int[] iArr2 = this.I00ilO0;
/* 67 */            if (iI00000oIO <= iI00000oIO2) {
/* 69 */                int i4 = iI00000oIO;
/* 70 */                int i5 = 0;
                        while (true) {
/* 78 */                    iArr[i5] = Math.min(iArr2[i4] - i, i3);
/* 80 */                    int i6 = i5 + 1;
/* 88 */                    iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
/* 90 */                    if (i4 == iI00000oIO2) {
                                break;
                            }
/* 92 */                    i4++;
/* 94 */                    i5 = i6;
                        }
                    }
/* 101 */           int i7 = iI00000oIO != 0 ? iArr2[iI00000oIO - 1] : 0;
/* 103 */           int length = bArr2.length;
/* 108 */           iArr[length] = (i - i7) + iArr[length];
/* 112 */           return new OiiIIoi(bArr2, iArr);
                }

                @Override
                public final IIOIIi1ilIO I000lI() {
/* 5 */             return I00100o1O0lo().I000lI();
                }

                @Override
                public final void I000oI1ioi(III1o0lOio0 iII1o0lOio0, int i) {
/* 2 */             int iI00000oIO = iO1oO1I0i.I00000oIO(this, 0);
/* 6 */             int i2 = 0;
/* 7 */             while (i2 < i) {
/* 9 */                 int[] iArr = this.I00ilO0;
/* 17 */                int i3 = iI00000oIO == 0 ? 0 : iArr[iI00000oIO - 1];
/* 21 */                int i4 = iArr[iI00000oIO] - i3;
/* 22 */                byte[][] bArr = this.I00ilI0I1;
/* 26 */                int i5 = iArr[bArr.length + iI00000oIO];
/* 33 */                int iMin = Math.min(i, i4 + i3) - i2;
/* 36 */                int i6 = (i2 - i3) + i5;
/* 44 */                Oii1OOIOo oii1OOIOo = new Oii1OOIOo(bArr[iI00000oIO], i6, i6 + iMin, true);
/* 47 */                Oii1OOIOo oii1OOIOo2 = iII1o0lOio0.I00iOIl;
/* 49 */                if (oii1OOIOo2 == null) {
/* 51 */                    oii1OOIOo.I000II = oii1OOIOo;
/* 53 */                    oii1OOIOo.I0001Ioi1lo = oii1OOIOo;
/* 55 */                    iII1o0lOio0.I00iOIl = oii1OOIOo;
                        } else {
/* 60 */                    oii1OOIOo2.I000II.I00000oOI(oii1OOIOo);
                        }
/* 63 */                i2 += iMin;
/* 64 */                iI00000oIO++;
                    }
                    iII1o0lOio0.I00iiI += i;
                }

                public final byte[] I00100l0() {
/* 5 */             byte[] bArr = new byte[I00000oOI()];
/* 7 */             byte[][] bArr2 = this.I00ilI0I1;
/* 9 */             int length = bArr2.length;
/* 10 */            int i = 0;
/* 11 */            int i2 = 0;
/* 12 */            int i3 = 0;
/* 13 */            while (i < length) {
/* 17 */                int[] iArr = this.I00ilO0;
/* 19 */                int i4 = iArr[length + i];
/* 21 */                int i5 = iArr[i];
/* 25 */                int i6 = i5 - i2;
/* 29 */                I1IoiO1l.I000OOo1O(bArr2[i], i3, bArr, i4, i4 + i6);
/* 32 */                i3 += i6;
/* 33 */                i++;
/* 35 */                i2 = i5;
                    }
/* 113 */           return bArr;
                }

                public final IIOIIi1ilIO I00100o1O0lo() {
/* 7 */             return new IIOIIi1ilIO(I00100l0());
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 31 */                return true;
                    }
/* 7 */             if (obj instanceof IIOIIi1ilIO) {
/* 9 */                 IIOIIi1ilIO iIOIIi1ilIO = (IIOIIi1ilIO) obj;
/* 19 */                if (iIOIIi1ilIO.I00000oOI() == I00000oOI() && I000OOo1O(0, iIOIIi1ilIO, I00000oOI())) {
/* 31 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             int i = this.I00iiI;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 6 */             byte[][] bArr = this.I00ilI0I1;
/* 8 */             int length = bArr.length;
/* 9 */             int i2 = 0;
/* 11 */            int i3 = 1;
/* 12 */            int i4 = 0;
/* 13 */            while (i2 < length) {
/* 17 */                int[] iArr = this.I00ilO0;
/* 19 */                int i5 = iArr[length + i2];
/* 21 */                int i6 = iArr[i2];
/* 23 */                byte[] bArr2 = bArr[i2];
/* 27 */                int i7 = (i6 - i4) + i5;
/* 28 */                while (i5 < i7) {
/* 34 */                    i3 = (i3 * 31) + bArr2[i5];
/* 35 */                    i5++;
                        }
/* 38 */                i2++;
/* 40 */                i4 = i6;
                    }
/* 42 */            this.I00iiI = i3;
/* 113 */           return i3;
                }

                @Override
                public final String toString() {
/* 5 */             return I00100o1O0lo().toString();
                }
            }

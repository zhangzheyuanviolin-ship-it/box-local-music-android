            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.ListIterator;
            
            public final class OO0oo1iO1lio extends I01Io11IiiiO {
                public final Object[] I00iOIl;
                public final Object[] I00iiI;
                public final int I00iiO;
                public final int I00iio;

                public OO0oo1iO1lio(Object[] objArr, Object[] objArr2, int i, int i2) {
/* 4 */             this.I00iOIl = objArr;
/* 6 */             this.I00iiI = objArr2;
/* 8 */             this.I00iiO = i;
/* 10 */            this.I00iio = i2;
/* 23 */            if (!(I00000oOI() > 32)) {
/* 43 */                OO1oio00IO.I00000oIO("Trie-based persistent vector should have at least 33 elements, got " + I00000oOI());
                    }
/* 46 */            int length = objArr2.length;
                }

                public static Object[] I00100o1O0lo(Object[] objArr, int i, int i2, Object obj, IooiOoO1I1iO iooiOoO1I1iO) {
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 7 */             if (i == 0) {
/* 14 */                Object[] objArrCopyOf = iI00000oIO == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
/* 22 */                I1IoiO1l.I000iOII(objArr, iI00000oIO + 1, objArrCopyOf, iI00000oIO, 31);
/* 27 */                iooiOoO1I1iO.I00000oIO = objArr[31];
/* 29 */                objArrCopyOf[iI00000oIO] = obj;
/* 31 */                return objArrCopyOf;
                    }
/* 32 */            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
                    int i3 = i - 5;
/* 46 */            objArrCopyOf2[iI00000oIO] = I00100o1O0lo((Object[]) objArr[iI00000oIO], i3, i2, obj, iooiOoO1I1iO);
                    while (true) {
/* 48 */                iI00000oIO++;
/* 50 */                if (iI00000oIO >= 32 || objArrCopyOf2[iI00000oIO] == null) {
                            break;
                        }
/* 67 */                objArrCopyOf2[iI00000oIO] = I00100o1O0lo((Object[]) objArr[iI00000oIO], i3, 0, iooiOoO1I1iO.I00000oIO, iooiOoO1I1iO);
                    }
/* 399 */           return objArrCopyOf2;
                }

                public static Object[] I0010o(Object[] objArr, int i, int i2, IooiOoO1I1iO iooiOoO1I1iO) {
                    Object[] objArrI0010o;
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 7 */             if (i == 5) {
/* 11 */                iooiOoO1I1iO.I00000oIO = objArr[iI00000oIO];
/* 13 */                objArrI0010o = null;
                    } else {
/* 20 */                objArrI0010o = I0010o((Object[]) objArr[iI00000oIO], i - 5, i2, iooiOoO1I1iO);
                    }
/* 24 */            if (objArrI0010o == null && iI00000oIO == 0) {
/* 5 */                 return null;
                    }
/* 31 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
/* 35 */            objArrCopyOf[iI00000oIO] = objArrI0010o;
/* 204 */           return objArrCopyOf;
                }

                public static Object[] I001lIiIIo1O(int i, int i2, Object obj, Object[] objArr) {
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 7 */             Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
/* 11 */            if (i == 0) {
/* 13 */                objArrCopyOf[iI00000oIO] = obj;
/* 15 */                return objArrCopyOf;
                    }
/* 26 */            objArrCopyOf[iI00000oIO] = I001lIiIIo1O(i - 5, i2, obj, (Object[]) objArrCopyOf[iI00000oIO]);
/* 204 */           return objArrCopyOf;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final I01Io11IiiiO I0000O(int i, Object obj) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             l10ioi0.I00000oOI(i, i2);
/* 6 */             if (i == i2) {
/* 8 */                 return I000OOo1O(obj);
                    }
/* 13 */            int iI001iOo1i0O = I001iOo1i0O();
/* 17 */            Object[] objArr = this.I00iOIl;
/* 19 */            if (i >= iI001iOo1i0O) {
/* 22 */                return I0010I0i(obj, objArr, i - iI001iOo1i0O);
                    }
/* 30 */            IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(null);
/* 42 */            return I0010I0i(iooiOoO1I1iO.I00000oIO, I00100o1O0lo(objArr, this.I00iio, i, obj, iooiOoO1I1iO), 0);
                }

                @Override
                public final I01Io11IiiiO I000OOo1O(Object obj) {
/* 1 */             int iI001iOo1i0O = I001iOo1i0O();
/* 5 */             int i = this.I00iiO;
/* 7 */             int i2 = i - iI001iOo1i0O;
/* 9 */             Object[] objArr = this.I00iOIl;
/* 11 */            Object[] objArr2 = this.I00iiI;
/* 15 */            if (i2 < 32) {
/* 17 */                Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
/* 21 */                objArrCopyOf[i2] = obj;
/* 29 */                return new OO0oo1iO1lio(objArr, objArrCopyOf, i + 1, this.I00iio);
                    }
/* 33 */            Object[] objArr3 = new Object[32];
/* 36 */            objArr3[0] = obj;
/* 38 */            return I00111O(objArr, objArr2, objArr3);
                }

                @Override
                public final OO100II1 I000iOII() {
/* 9 */             return new OO100II1(this, this.I00iOIl, this.I00iiI, this.I00iio);
                }

                @Override
                public final I01Io11IiiiO I000lI(I01Io1 i01Io1) {
/* 9 */             OO100II1 oo100ii1 = new OO100II1(this, this.I00iOIl, this.I00iiI, this.I00iio);
/* 12 */            oo100ii1.I00IlilI0i0i(i01Io1);
/* 15 */            return oo100ii1.I000OOo1O();
                }

                @Override
                public final I01Io11IiiiO I000o00OoI0I(int i) {
/* 5 */             l10ioi0.I00000oIO(i, I00000oOI());
/* 8 */             int iI001iOo1i0O = I001iOo1i0O();
/* 12 */            int i2 = this.I00iio;
/* 14 */            Object[] objArr = this.I00iOIl;
                    return i >= iI001iOo1i0O ? I001i1O0Ol(iI001iOo1i0O, i2, i - iI001iOo1i0O, objArr) : I001i1O0Ol(iI001iOo1i0O, i2, 0, I001IO000(objArr, i2, i, new IooiOoO1I1iO(this.I00iiI[0])));
                }

                @Override
                public final I01Io11IiiiO I000oI1ioi(int i, Object obj) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             l10ioi0.I00000oIO(i, i2);
/* 6 */             int iI001iOo1i0O = I001iOo1i0O();
/* 10 */            Object[] objArr = this.I00iOIl;
/* 12 */            Object[] objArr2 = this.I00iiI;
/* 14 */            int i3 = this.I00iio;
/* 16 */            if (iI001iOo1i0O > i) {
/* 40 */                return new OO0oo1iO1lio(I001lIiIIo1O(i3, i, obj, objArr), objArr2, i2, i3);
                    }
/* 20 */            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
/* 26 */            objArrCopyOf[i & 31] = obj;
/* 30 */            return new OO0oo1iO1lio(objArr, objArrCopyOf, i2, i3);
                }

                public final OO0oo1iO1lio I0010I0i(Object obj, Object[] objArr, int i) {
/* 1 */             int iI001iOo1i0O = I001iOo1i0O();
/* 5 */             int i2 = this.I00iiO;
/* 7 */             int i3 = i2 - iI001iOo1i0O;
/* 9 */             Object[] objArr2 = this.I00iiI;
/* 13 */            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
/* 17 */            if (i3 < 32) {
/* 21 */                I1IoiO1l.I000iOII(objArr2, i + 1, objArrCopyOf, i, i3);
/* 24 */                objArrCopyOf[i] = obj;
/* 32 */                return new OO0oo1iO1lio(objArr, objArrCopyOf, i2 + 1, this.I00iio);
                    }
/* 38 */            Object obj2 = objArr2[31];
/* 44 */            I1IoiO1l.I000iOII(objArr2, i + 1, objArrCopyOf, i, i3 - 1);
/* 47 */            objArrCopyOf[i] = obj;
/* 49 */            Object[] objArr3 = new Object[32];
/* 52 */            objArr3[0] = obj2;
/* 54 */            return I00111O(objArr, objArrCopyOf, objArr3);
                }

                public final OO0oo1iO1lio I00111O(Object[] objArr, Object[] objArr2, Object[] objArr3) {
/* 1 */             int i = this.I00iiO;
/* 3 */             int i2 = i >> 5;
/* 6 */             int i3 = this.I00iio;
/* 10 */            if (i2 <= (1 << i3)) {
/* 39 */                return new OO0oo1iO1lio(I001IIilI0O(i3, objArr, objArr2), objArr3, i + 1, i3);
                    }
/* 14 */            Object[] objArr4 = new Object[32];
/* 17 */            objArr4[0] = objArr;
/* 19 */            int i4 = i3 + 5;
/* 28 */            return new OO0oo1iO1lio(I001IIilI0O(i4, objArr4, objArr2), objArr3, i + 1, i4);
                }

                public final Object[] I001IIilI0O(int i, Object[] objArr, Object[] objArr2) {
/* 7 */             int iI00000oIO = li1IOiiI.I00000oIO(I00000oOI() - 1, i);
/* 20 */            Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
/* 23 */            if (i == 5) {
/* 25 */                objArrCopyOf[iI00000oIO] = objArr2;
/* 27 */                return objArrCopyOf;
                    }
/* 37 */            objArrCopyOf[iI00000oIO] = I001IIilI0O(i - 5, (Object[]) objArrCopyOf[iI00000oIO], objArr2);
/* 98 */            return objArrCopyOf;
                }

                public final Object[] I001IO000(Object[] objArr, int i, int i2, IooiOoO1I1iO iooiOoO1I1iO) {
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 9 */             if (i == 0) {
/* 16 */                Object[] objArrCopyOf = iI00000oIO == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
/* 22 */                I1IoiO1l.I000iOII(objArr, iI00000oIO, objArrCopyOf, iI00000oIO + 1, 32);
/* 27 */                objArrCopyOf[31] = iooiOoO1I1iO.I00000oIO;
/* 31 */                iooiOoO1I1iO.I00000oIO = objArr[iI00000oIO];
/* 33 */                return objArrCopyOf;
                    }
/* 44 */            int iI00000oIO2 = objArr[31] == null ? li1IOiiI.I00000oIO(I001iOo1i0O() - 1, i) : 31;
/* 48 */            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
                    int i3 = i - 5;
/* 54 */            int i4 = iI00000oIO + 1;
/* 56 */            if (i4 <= iI00000oIO2) {
                        while (true) {
/* 67 */                    objArrCopyOf2[iI00000oIO2] = I001IO000((Object[]) objArrCopyOf2[iI00000oIO2], i3, 0, iooiOoO1I1iO);
/* 69 */                    if (iI00000oIO2 == i4) {
                                break;
                            }
                            iI00000oIO2--;
                        }
                    }
/* 82 */            objArrCopyOf2[iI00000oIO] = I001IO000((Object[]) objArrCopyOf2[iI00000oIO], i3, i2, iooiOoO1I1iO);
/* 204 */           return objArrCopyOf2;
                }

                public final I01Io11IiiiO I001i1O0Ol(int i, int i2, int i3, Object[] objArr) {
/* 3 */             int i4 = this.I00iiO - i;
/* 8 */             if (i4 != 1) {
/* 65 */                Object[] objArr2 = this.I00iiI;
/* 67 */                Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
                        int i5 = i4 - 1;
/* 73 */                if (i3 < i5) {
/* 77 */                    I1IoiO1l.I000iOII(objArr2, i3, objArrCopyOf, i3 + 1, i4);
                        }
/* 80 */                objArrCopyOf[i5] = null;
/* 86 */                return new OO0oo1iO1lio(objArr, objArrCopyOf, (i + i4) - 1, i2);
                    }
/* 10 */            if (i2 == 0) {
/* 15 */                if (objArr.length == 33) {
/* 17 */                    objArr = Arrays.copyOf(objArr, 32);
                        }
/* 23 */                return new Ol1Iil(objArr);
                    }
/* 29 */            IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(null);
/* 34 */            Object[] objArrI0010o = I0010o(objArr, i2, i - 1, iooiOoO1I1iO);
/* 40 */            Object[] objArr3 = (Object[]) iooiOoO1I1iO.I00000oIO;
                    return objArrI0010o[1] == null ? new OO0oo1iO1lio((Object[]) objArrI0010o[0], objArr3, i, i2 - 5) : new OO0oo1iO1lio(objArrI0010o, objArr3, i, i2);
                }

                public final int I001iOo1i0O() {
/* 5 */             return (this.I00iiO - 1) & (-32);
                }

                @Override
                public final Object get(int i) {
                    Object[] objArr;
/* 5 */             l10ioi0.I00000oIO(i, I00000oOI());
/* 12 */            if (I001iOo1i0O() <= i) {
/* 14 */                objArr = this.I00iiI;
                    } else {
/* 17 */                Object[] objArr2 = this.I00iOIl;
/* 21 */                for (int i2 = this.I00iio; i2 > 0; i2 -= 5) {
/* 27 */                    objArr2 = objArr2[li1IOiiI.I00000oIO(i, i2)];
                        }
/* 34 */                objArr = objArr2;
                    }
/* 37 */            return objArr[i & 31];
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             l10ioi0.I00000oOI(i, i2);
/* 12 */            int i3 = (this.I00iio / 5) + 1;
/* 14 */            OO100O10 oo100o10 = new OO100O10(i, i2);
/* 19 */            oo100o10.I00iiO = this.I00iiI;
/* 23 */            int i4 = (i2 - 1) & (-32);
/* 25 */            if (i > i4) {
/* 27 */                i = i4;
                    }
/* 35 */            oo100o10.I00iio = new OoIi1IlIOOI(i, i4, i3, this.I00iOIl);
/* 37 */            VarHandle.storeStoreFence();
/* 77 */            return oo100o10;
                }
            }

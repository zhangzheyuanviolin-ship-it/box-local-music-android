            package p000;

            import java.util.Arrays;
            
            public final class OoIiIlIo {
                public static final OoIiIlIo I0000oI00 = new OoIiIlIo(0, 0, new Object[0], null);
                public int I00000oIO;
                public int I00000oOI;
                public final lOOlOoll I0000Il00O;
                public Object[] I0000O;

                public OoIiIlIo(int i, int i2, Object[] objArr, lOOlOoll loolooll) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = loolooll;
/* 10 */            this.I0000O = objArr;
                }

                public static OoIiIlIo I000OiO(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, lOOlOoll loolooll) {
/* 10 */            if (i3 > 30) {
/* 18 */                return new OoIiIlIo(0, 0, new Object[]{obj, obj2, obj3, obj4}, loolooll);
                    }
/* 22 */            int iI00000oIO = lOoIIlo.I00000oIO(i, i3);
/* 26 */            int iI00000oIO2 = lOoIIlo.I00000oIO(i2, i3);
/* 31 */            if (iI00000oIO != iI00000oIO2) {
/* 66 */                return new OoIiIlIo((1 << iI00000oIO) | (1 << iI00000oIO2), 0, iI00000oIO < iI00000oIO2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, loolooll);
                    }
/* 89 */            return new OoIiIlIo(0, 1 << iI00000oIO, new Object[]{I000OiO(i, obj, obj2, i2, obj3, obj4, i3 + 5, loolooll)}, loolooll);
                }

                public final Object[] I00000oIO(int i, int i2, int i3, Object obj, Object obj2, int i4, lOOlOoll loolooll) {
/* 3 */             Object obj3 = this.I0000O[i];
/* 25 */            OoIiIlIo ooIiIlIoI000OiO = I000OiO(obj3 != null ? obj3.hashCode() : 0, obj3, I001i1lo1io(i), i3, obj, obj2, i4 + 5, loolooll);
/* 29 */            int iI00111O = I00111O(i2);
/* 33 */            int i5 = iI00111O + 1;
/* 35 */            Object[] objArr = this.I0000O;
/* 42 */            Object[] objArr2 = new Object[objArr.length - 1];
/* 45 */            I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, i, 6);
/* 50 */            I1IoiO1l.I000iOII(objArr, i, objArr2, i + 2, i5);
/* 53 */            objArr2[iI00111O - 1] = ooIiIlIoI000OiO;
/* 56 */            I1IoiO1l.I000iOII(objArr, iI00111O, objArr2, i5, objArr.length);
/* 965 */           return objArr2;
                }

                public final int I00000oOI() {
/* 3 */             if (this.I00000oOI == 0) {
/* 8 */                 return this.I0000O.length / 2;
                    }
/* 13 */            int iBitCount = Integer.bitCount(this.I00000oIO);
/* 21 */            int length = this.I0000O.length;
/* 22 */            for (int i = iBitCount * 2; i < length; i++) {
/* 32 */                iBitCount += I0010o(i).I00000oOI();
                    }
/* 55 */            return iBitCount;
                }

                public final boolean I0000Il00O(Object obj) {
/* 10 */            IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, this.I0000O.length), 2);
/* 14 */            int i = iooO0oO00II000II.I00iOIl;
/* 16 */            int i2 = iooO0oO00II000II.I00iiI;
/* 18 */            int i3 = iooO0oO00II000II.I00iiO;
/* 20 */            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
/* 36 */                while (!O0000Ioio00.I0000O(obj, this.I0000O[i])) {
/* 40 */                    if (i != i2) {
/* 42 */                        i += i3;
                            }
                        }
/* 38 */                return true;
                    }
/* 4 */             return false;
                }

                public final boolean I0000O(Object obj, int i, int i2) {
/* 6 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 11 */            if (I000O01llI0(iI00000oIO)) {
/* 21 */                return O0000Ioio00.I0000O(obj, this.I0000O[I0001Ioi1lo(iI00000oIO)]);
                    }
/* 30 */            if (!I000OOo1O(iI00000oIO)) {
/* 56 */                return false;
                    }
/* 36 */            OoIiIlIo ooIiIlIoI0010o = I0010o(I00111O(iI00000oIO));
                    return i2 == 30 ? ooIiIlIoI0010o.I0000Il00O(obj) : ooIiIlIoI0010o.I0000O(obj, i, i2 + 5);
                }

                public final boolean I0000oI00(OoIiIlIo ooIiIlIo) {
/* 1 */             if (this == ooIiIlIo) {
/* 39 */                return true;
                    }
/* 9 */             if (this.I00000oOI == ooIiIlIo.I00000oOI && this.I00000oIO == ooIiIlIo.I00000oIO) {
/* 21 */                int length = this.I0000O.length;
/* 23 */                for (int i = 0; i < length; i++) {
/* 33 */                    if (this.I0000O[i] == ooIiIlIo.I0000O[i]) {
                            }
                        }
/* 39 */                return true;
                    }
/* 8 */             return false;
                }

                public final int I0001Ioi1lo(int i) {
/* 10 */            return Integer.bitCount(this.I00000oIO & (i - 1)) * 2;
                }

                public final Object I000II(Object obj, int i, int i2) {
/* 6 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 11 */            if (I000O01llI0(iI00000oIO)) {
/* 13 */                int iI0001Ioi1lo = I0001Ioi1lo(iI00000oIO);
/* 25 */                if (O0000Ioio00.I0000O(obj, this.I0000O[iI0001Ioi1lo])) {
/* 27 */                    return I001i1lo1io(iI0001Ioi1lo);
                        }
/* 103 */               return null;
                    }
/* 36 */            if (!I000OOo1O(iI00000oIO)) {
/* 103 */               return null;
                    }
/* 42 */            OoIiIlIo ooIiIlIoI0010o = I0010o(I00111O(iI00000oIO));
/* 48 */            if (i2 != 30) {
/* 98 */                return ooIiIlIoI0010o.I000II(obj, i, i2 + 5);
                    }
/* 59 */            IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIoI0010o.I0000O.length), 2);
/* 63 */            int i3 = iooO0oO00II000II.I00iOIl;
/* 65 */            int i4 = iooO0oO00II000II.I00iiI;
/* 67 */            int i5 = iooO0oO00II000II.I00iiO;
/* 69 */            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
/* 103 */               return null;
                    }
/* 85 */            while (!O0000Ioio00.I0000O(obj, ooIiIlIoI0010o.I0000O[i3])) {
/* 92 */                if (i3 == i4) {
/* 103 */                   return null;
                        }
/* 94 */                i3 += i5;
                    }
/* 87 */            return ooIiIlIoI0010o.I001i1lo1io(i3);
                }

                public final boolean I000O01llI0(int i) {
                    return (this.I00000oIO & i) != 0;
                }

                public final boolean I000OOo1O(int i) {
                    return (this.I00000oOI & i) != 0;
                }

                public final OoIiIlIo I000iOII(int i, OO0lo1Ooo oO0lo1Ooo) {
/* 5 */             oO0lo1Ooo.I0000Il00O(oO0lo1Ooo.I00ilO0 - 1);
/* 12 */            oO0lo1Ooo.I00iio = I001i1lo1io(i);
/* 14 */            Object[] objArr = this.I0000O;
/* 18 */            if (objArr.length == 2) {
/* 20 */                return null;
                    }
/* 26 */            if (this.I0000Il00O != oO0lo1Ooo.I00iiI) {
/* 44 */                return new OoIiIlIo(0, 0, lOoIIlo.I0000Il00O(i, objArr), oO0lo1Ooo.I00iiI);
                    }
/* 32 */            this.I0000O = lOoIIlo.I0000Il00O(i, objArr);
/* 34 */            return this;
                }

                public final OoIiIlIo I000l1(int i, Object obj, Object obj2, int i2, OO0lo1Ooo oO0lo1Ooo) {
                    OO0lo1Ooo oO0lo1Ooo2;
                    OoIiIlIo ooIiIlIoI000l1;
/* 6 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 8 */             boolean zI000O01llI0 = I000O01llI0(iI00000oIO);
/* 12 */            lOOlOoll loolooll = this.I0000Il00O;
/* 14 */            if (zI000O01llI0) {
/* 16 */                int iI0001Ioi1lo = I0001Ioi1lo(iI00000oIO);
/* 28 */                if (!O0000Ioio00.I0000O(obj, this.I0000O[iI0001Ioi1lo])) {
/* 85 */                    oO0lo1Ooo.I0000Il00O(oO0lo1Ooo.I00ilO0 + 1);
/* 88 */                    lOOlOoll loolooll2 = oO0lo1Ooo.I00iiI;
/* 90 */                    if (loolooll != loolooll2) {
/* 132 */                       return new OoIiIlIo(this.I00000oIO ^ iI00000oIO, this.I00000oOI | iI00000oIO, I00000oIO(iI0001Ioi1lo, iI00000oIO, i, obj, obj2, i2, loolooll2), loolooll2);
                            }
/* 101 */                   this.I0000O = I00000oIO(iI0001Ioi1lo, iI00000oIO, i, obj, obj2, i2, loolooll2);
                            this.I00000oIO ^= iI00000oIO;
                            this.I00000oOI |= iI00000oIO;
/* 92 */                    return this;
                        }
/* 34 */                oO0lo1Ooo.I00iio = I001i1lo1io(iI0001Ioi1lo);
/* 40 */                if (I001i1lo1io(iI0001Ioi1lo) == obj2) {
/* 42 */                    return this;
                        }
/* 47 */                if (loolooll == oO0lo1Ooo.I00iiI) {
/* 52 */                    this.I0000O[iI0001Ioi1lo + 1] = obj2;
/* 54 */                    return this;
                        }
                        oO0lo1Ooo.I00ilI0I1++;
/* 60 */                Object[] objArr = this.I0000O;
/* 63 */                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 68 */                objArrCopyOf[iI0001Ioi1lo + 1] = obj2;
/* 78 */                return new OoIiIlIo(this.I00000oIO, this.I00000oOI, objArrCopyOf, oO0lo1Ooo.I00iiI);
                    }
/* 145 */           if (!I000OOo1O(iI00000oIO)) {
/* 287 */               oO0lo1Ooo.I0000Il00O(oO0lo1Ooo.I00ilO0 + 1);
/* 290 */               lOOlOoll loolooll3 = oO0lo1Ooo.I00iiI;
/* 292 */               int iI0001Ioi1lo2 = I0001Ioi1lo(iI00000oIO);
/* 296 */               Object[] objArr2 = this.I0000O;
/* 298 */               if (loolooll != loolooll3) {
/* 323 */                   return new OoIiIlIo(this.I00000oIO | iI00000oIO, this.I00000oOI, lOoIIlo.I00000oOI(objArr2, iI0001Ioi1lo2, obj, obj2), loolooll3);
                        }
/* 304 */               this.I0000O = lOoIIlo.I00000oOI(objArr2, iI0001Ioi1lo2, obj, obj2);
                        this.I00000oIO |= iI00000oIO;
/* 140 */               return this;
                    }
/* 147 */           int iI00111O = I00111O(iI00000oIO);
/* 151 */           OoIiIlIo ooIiIlIoI0010o = I0010o(iI00111O);
/* 157 */           if (i2 == 30) {
/* 168 */               IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIoI0010o.I0000O.length), 2);
/* 172 */               int i3 = iooO0oO00II000II.I00iOIl;
/* 174 */               int i4 = iooO0oO00II000II.I00iiI;
/* 176 */               int i5 = iooO0oO00II000II.I00iiO;
/* 178 */               if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
/* 245 */                   oO0lo1Ooo.I0000Il00O(oO0lo1Ooo.I00ilO0 + 1);
/* 258 */                   ooIiIlIoI000l1 = new OoIiIlIo(0, 0, lOoIIlo.I00000oOI(ooIiIlIoI0010o.I0000O, 0, obj, obj2), oO0lo1Ooo.I00iiI);
/* 261 */                   oO0lo1Ooo2 = oO0lo1Ooo;
                        } else {
/* 194 */                   while (!O0000Ioio00.I0000O(obj, ooIiIlIoI0010o.I0000O[i3])) {
/* 238 */                       if (i3 == i4) {
/* 245 */                           oO0lo1Ooo.I0000Il00O(oO0lo1Ooo.I00ilO0 + 1);
/* 258 */                           ooIiIlIoI000l1 = new OoIiIlIo(0, 0, lOoIIlo.I00000oOI(ooIiIlIoI0010o.I0000O, 0, obj, obj2), oO0lo1Ooo.I00iiI);
                                    break;
                                }
/* 240 */                       i3 += i5;
                            }
/* 200 */                   oO0lo1Ooo.I00iio = ooIiIlIoI0010o.I001i1lo1io(i3);
/* 206 */                   if (ooIiIlIoI0010o.I0000Il00O == oO0lo1Ooo.I00iiI) {
/* 211 */                       ooIiIlIoI0010o.I0000O[i3 + 1] = obj2;
/* 213 */                       ooIiIlIoI000l1 = ooIiIlIoI0010o;
                            } else {
                                oO0lo1Ooo.I00ilI0I1++;
/* 220 */                       Object[] objArr3 = ooIiIlIoI0010o.I0000O;
/* 223 */                       Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
/* 228 */                       objArrCopyOf2[i3 + 1] = obj2;
/* 234 */                       ooIiIlIoI000l1 = new OoIiIlIo(0, 0, objArrCopyOf2, oO0lo1Ooo.I00iiI);
                            }
/* 261 */                   oO0lo1Ooo2 = oO0lo1Ooo;
                        }
                    } else {
/* 268 */               oO0lo1Ooo2 = oO0lo1Ooo;
/* 269 */               ooIiIlIoI000l1 = ooIiIlIoI0010o.I000l1(i, obj, obj2, i2 + 5, oO0lo1Ooo2);
                    }
                    return ooIiIlIoI0010o == ooIiIlIoI000l1 ? this : I0010I0i(iI00111O, ooIiIlIoI000l1, oO0lo1Ooo2.I00iiI);
                }

                public final OoIiIlIo I000lI(OoIiIlIo ooIiIlIo, int i, IiIoo10 iiIoo10, OO0lo1Ooo oO0lo1Ooo) {
                    Object[] objArr;
                    OoIiIlIo ooIiIlIoI000OiO;
/* 11 */            if (this == ooIiIlIo) {
                        iiIoo10.I00000oIO += I00000oOI();
/* 1 */                 return this;
                    }
/* 26 */            int i2 = 0;
/* 27 */            if (i > 30) {
/* 29 */                lOOlOoll loolooll = oO0lo1Ooo.I00iiI;
/* 31 */                Object[] objArr2 = this.I0000O;
/* 38 */                Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + ooIiIlIo.I0000O.length);
/* 44 */                int length = this.I0000O.length;
/* 52 */                IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIo.I0000O.length), 2);
/* 56 */                int i3 = iooO0oO00II000II.I00iOIl;
/* 58 */                int i4 = iooO0oO00II000II.I00iiI;
/* 60 */                int i5 = iooO0oO00II000II.I00iiO;
/* 62 */                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                            while (true) {
/* 78 */                        if (I0000Il00O(ooIiIlIo.I0000O[i3])) {
                                    iiIoo10.I00000oIO++;
                                } else {
/* 80 */                            Object[] objArr3 = ooIiIlIo.I0000O;
/* 84 */                            objArrCopyOf[length] = objArr3[i3];
/* 92 */                            objArrCopyOf[length + 1] = objArr3[i3 + 1];
/* 94 */                            length += 2;
                                }
/* 103 */                       if (i3 == i4) {
                                    break;
                                }
/* 105 */                       i3 += i5;
                            }
                        }
/* 110 */               if (length != this.I0000O.length) {
/* 117 */                   if (length != ooIiIlIo.I0000O.length) {
                                return length == objArrCopyOf.length ? new OoIiIlIo(0, 0, objArrCopyOf, loolooll) : new OoIiIlIo(0, 0, Arrays.copyOf(objArrCopyOf, length), loolooll);
                            }
                        }
/* 1 */                 return this;
                    }
/* 144 */           int i6 = this.I00000oOI | ooIiIlIo.I00000oOI;
/* 145 */           int i7 = this.I00000oIO;
/* 147 */           int i8 = ooIiIlIo.I00000oIO;
/* 152 */           int i9 = (i7 ^ i8) & (~i6);
/* 153 */           int i10 = i7 & i8;
/* 154 */           int i11 = i9;
/* 155 */           while (i10 != 0) {
/* 157 */               int iLowestOneBit = Integer.lowestOneBit(i10);
/* 181 */               if (O0000Ioio00.I0000O(this.I0000O[I0001Ioi1lo(iLowestOneBit)], ooIiIlIo.I0000O[ooIiIlIo.I0001Ioi1lo(iLowestOneBit)])) {
/* 183 */                   i11 |= iLowestOneBit;
                        } else {
/* 187 */                   i6 |= iLowestOneBit;
                        }
/* 188 */               i10 ^= iLowestOneBit;
                    }
/* 192 */           if ((i6 & i11) != 0) {
/* 197 */               OO1oio00IO.I00000oOI("Check failed.");
                    }
/* 235 */           OoIiIlIo ooIiIlIo2 = (O0000Ioio00.I0000O(this.I0000Il00O, oO0lo1Ooo.I00iiI) && this.I00000oIO == i11 && this.I00000oOI == i6) ? this : new OoIiIlIo(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
/* 239 */           int i12 = i6;
/* 240 */           int i13 = 0;
/* 241 */           while (i12 != 0) {
/* 243 */               int iLowestOneBit2 = Integer.lowestOneBit(i12);
/* 247 */               Object[] objArr4 = ooIiIlIo2.I0000O;
/* 252 */               int length2 = (objArr4.length - 1) - i13;
/* 258 */               if (I000OOo1O(iLowestOneBit2)) {
/* 264 */                   ooIiIlIoI000OiO = I0010o(I00111O(iLowestOneBit2));
/* 272 */                   if (ooIiIlIo.I000OOo1O(iLowestOneBit2)) {
/* 284 */                       ooIiIlIoI000OiO = ooIiIlIoI000OiO.I000lI(ooIiIlIo.I0010o(ooIiIlIo.I00111O(iLowestOneBit2)), i + 5, iiIoo10, oO0lo1Ooo);
/* 288 */                       objArr = objArr4;
                            } else if (ooIiIlIo.I000O01llI0(iLowestOneBit2)) {
/* 298 */                       int iI0001Ioi1lo = ooIiIlIo.I0001Ioi1lo(iLowestOneBit2);
/* 304 */                       Object obj = ooIiIlIo.I0000O[iI0001Ioi1lo];
/* 306 */                       Object objI001i1lo1io = ooIiIlIo.I001i1lo1io(iI0001Ioi1lo);
/* 310 */                       int i14 = oO0lo1Ooo.I00ilO0;
/* 327 */                       objArr = objArr4;
/* 336 */                       ooIiIlIoI000OiO = ooIiIlIoI000OiO.I000l1(obj != null ? obj.hashCode() : i2, obj, objI001i1lo1io, i + 5, oO0lo1Ooo);
/* 342 */                       if (oO0lo1Ooo.I00ilO0 == i14) {
                                    iiIoo10.I00000oIO++;
                                }
                            } else {
/* 352 */                       objArr = objArr4;
                            }
                        } else {
/* 357 */                   objArr = objArr4;
/* 363 */                   if (ooIiIlIo.I000OOo1O(iLowestOneBit2)) {
/* 369 */                       OoIiIlIo ooIiIlIoI0010o = ooIiIlIo.I0010o(ooIiIlIo.I00111O(iLowestOneBit2));
/* 377 */                       if (I000O01llI0(iLowestOneBit2)) {
/* 379 */                           int iI0001Ioi1lo2 = I0001Ioi1lo(iLowestOneBit2);
/* 385 */                           Object obj2 = this.I0000O[iI0001Ioi1lo2];
/* 395 */                           int i15 = i + 5;
/* 401 */                           if (ooIiIlIoI0010o.I0000O(obj2, obj2 != null ? obj2.hashCode() : 0, i15)) {
                                        iiIoo10.I00000oIO++;
/* 409 */                               ooIiIlIoI000OiO = ooIiIlIoI0010o;
                                    } else {
/* 423 */                               ooIiIlIoI000OiO = ooIiIlIoI0010o.I000l1(obj2 != null ? obj2.hashCode() : 0, obj2, I001i1lo1io(iI0001Ioi1lo2), i15, oO0lo1Ooo);
                                    }
                                } else {
/* 409 */                           ooIiIlIoI000OiO = ooIiIlIoI0010o;
                                }
                            } else {
/* 428 */                       int iI0001Ioi1lo3 = I0001Ioi1lo(iLowestOneBit2);
/* 434 */                       Object obj3 = this.I0000O[iI0001Ioi1lo3];
/* 436 */                       Object objI001i1lo1io2 = I001i1lo1io(iI0001Ioi1lo3);
/* 440 */                       int iI0001Ioi1lo4 = ooIiIlIo.I0001Ioi1lo(iLowestOneBit2);
/* 446 */                       Object obj4 = ooIiIlIo.I0000O[iI0001Ioi1lo4];
/* 480 */                       ooIiIlIoI000OiO = I000OiO(obj3 != null ? obj3.hashCode() : 0, obj3, objI001i1lo1io2, obj4 != null ? obj4.hashCode() : 0, obj4, ooIiIlIo.I001i1lo1io(iI0001Ioi1lo4), i + 5, oO0lo1Ooo.I00iiI);
                            }
                        }
/* 484 */               objArr[length2] = ooIiIlIoI000OiO;
/* 486 */               i13++;
/* 488 */               i12 ^= iLowestOneBit2;
/* 489 */               i2 = 0;
                    }
/* 492 */           int i16 = 0;
/* 493 */           while (i11 != 0) {
/* 495 */               int iLowestOneBit3 = Integer.lowestOneBit(i11);
/* 499 */               int i17 = i16 * 2;
/* 505 */               if (ooIiIlIo.I000O01llI0(iLowestOneBit3)) {
/* 528 */                   int iI0001Ioi1lo5 = ooIiIlIo.I0001Ioi1lo(iLowestOneBit3);
/* 532 */                   Object[] objArr5 = ooIiIlIo2.I0000O;
/* 538 */                   objArr5[i17] = ooIiIlIo.I0000O[iI0001Ioi1lo5];
/* 546 */                   objArr5[i17 + 1] = ooIiIlIo.I001i1lo1io(iI0001Ioi1lo5);
/* 552 */                   if (I000O01llI0(iLowestOneBit3)) {
                                iiIoo10.I00000oIO++;
                            }
                        } else {
/* 507 */                   int iI0001Ioi1lo6 = I0001Ioi1lo(iLowestOneBit3);
/* 511 */                   Object[] objArr6 = ooIiIlIo2.I0000O;
/* 517 */                   objArr6[i17] = this.I0000O[iI0001Ioi1lo6];
/* 525 */                   objArr6[i17 + 1] = I001i1lo1io(iI0001Ioi1lo6);
                        }
/* 560 */               i16++;
/* 562 */               i11 ^= iLowestOneBit3;
                    }
/* 568 */           if (!I0000oI00(ooIiIlIo2)) {
                        return ooIiIlIo.I0000oI00(ooIiIlIo2) ? ooIiIlIo : ooIiIlIo2;
                    }
/* 1 */             return this;
                }

                public final OoIiIlIo I000o00OoI0I(int i, Object obj, int i2, OO0lo1Ooo oO0lo1Ooo) {
                    OoIiIlIo ooIiIlIoI000o00OoI0I;
/* 6 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 12 */            if (I000O01llI0(iI00000oIO)) {
/* 14 */                int iI0001Ioi1lo = I0001Ioi1lo(iI00000oIO);
/* 26 */                if (O0000Ioio00.I0000O(obj, this.I0000O[iI0001Ioi1lo])) {
/* 28 */                    return I00100l0(iI0001Ioi1lo, iI00000oIO, oO0lo1Ooo);
                        }
                    } else if (I000OOo1O(iI00000oIO)) {
/* 41 */                int iI00111O = I00111O(iI00000oIO);
/* 45 */                OoIiIlIo ooIiIlIoI0010o = I0010o(iI00111O);
/* 51 */                if (i2 == 30) {
/* 62 */                    IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIoI0010o.I0000O.length), 2);
/* 66 */                    int i3 = iooO0oO00II000II.I00iOIl;
/* 68 */                    int i4 = iooO0oO00II000II.I00iiI;
/* 70 */                    int i5 = iooO0oO00II000II.I00iiO;
/* 72 */                    if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
/* 99 */                        ooIiIlIoI000o00OoI0I = ooIiIlIoI0010o;
                                break;
                            }
/* 88 */                    while (!O0000Ioio00.I0000O(obj, ooIiIlIoI0010o.I0000O[i3])) {
/* 95 */                        if (i3 == i4) {
/* 99 */                            ooIiIlIoI000o00OoI0I = ooIiIlIoI0010o;
                                    break;
                                }
/* 97 */                        i3 += i5;
                            }
/* 90 */                    ooIiIlIoI000o00OoI0I = ooIiIlIoI0010o.I000iOII(i3, oO0lo1Ooo);
                        } else {
/* 104 */                   ooIiIlIoI000o00OoI0I = ooIiIlIoI0010o.I000o00OoI0I(i, obj, i2 + 5, oO0lo1Ooo);
                        }
/* 112 */               return I00100o1O0lo(ooIiIlIoI0010o, ooIiIlIoI000o00OoI0I, iI00111O, iI00000oIO, oO0lo1Ooo.I00iiI);
                    }
/* 33 */            return this;
                }

                public final OoIiIlIo I000oI1ioi(int i, Object obj, Object obj2, int i2, OO0lo1Ooo oO0lo1Ooo) {
                    OO0lo1Ooo oO0lo1Ooo2;
                    OoIiIlIo ooIiIlIoI000oI1ioi;
/* 6 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 11 */            if (I000O01llI0(iI00000oIO)) {
/* 13 */                int iI0001Ioi1lo = I0001Ioi1lo(iI00000oIO);
                        return (O0000Ioio00.I0000O(obj, this.I0000O[iI0001Ioi1lo]) && O0000Ioio00.I0000O(obj2, I001i1lo1io(iI0001Ioi1lo))) ? I00100l0(iI0001Ioi1lo, iI00000oIO, oO0lo1Ooo) : this;
                    }
/* 46 */            if (!I000OOo1O(iI00000oIO)) {
/* 399 */               return this;
                    }
/* 49 */            int iI00111O = I00111O(iI00000oIO);
/* 53 */            OoIiIlIo ooIiIlIoI0010o = I0010o(iI00111O);
/* 59 */            if (i2 == 30) {
/* 70 */                IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIoI0010o.I0000O.length), 2);
/* 74 */                int i3 = iooO0oO00II000II.I00iOIl;
/* 76 */                int i4 = iooO0oO00II000II.I00iiI;
/* 78 */                int i5 = iooO0oO00II000II.I00iiO;
/* 80 */                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
/* 117 */                   ooIiIlIoI000oI1ioi = ooIiIlIoI0010o;
/* 118 */                   oO0lo1Ooo2 = oO0lo1Ooo;
                        } else {
                            while (true) {
/* 96 */                        if (!O0000Ioio00.I0000O(obj, ooIiIlIoI0010o.I0000O[i3]) || !O0000Ioio00.I0000O(obj2, ooIiIlIoI0010o.I001i1lo1io(i3))) {
/* 113 */                           if (i3 == i4) {
                                        break;
                                    }
/* 115 */                           i3 += i5;
                                } else {
/* 108 */                           ooIiIlIoI000oI1ioi = ooIiIlIoI0010o.I000iOII(i3, oO0lo1Ooo);
                                    break;
                                }
                            }
/* 117 */                   ooIiIlIoI000oI1ioi = ooIiIlIoI0010o;
/* 118 */                   oO0lo1Ooo2 = oO0lo1Ooo;
                        }
                    } else {
/* 125 */               oO0lo1Ooo2 = oO0lo1Ooo;
/* 126 */               ooIiIlIoI000oI1ioi = ooIiIlIoI0010o.I000oI1ioi(i, obj, obj2, i2 + 5, oO0lo1Ooo2);
                    }
/* 135 */           return I00100o1O0lo(ooIiIlIoI0010o, ooIiIlIoI000oI1ioi, iI00111O, iI00000oIO, oO0lo1Ooo2.I00iiI);
                }

                public final OoIiIlIo I00100l0(int i, int i2, OO0lo1Ooo oO0lo1Ooo) {
/* 5 */             oO0lo1Ooo.I0000Il00O(oO0lo1Ooo.I00ilO0 - 1);
/* 12 */            oO0lo1Ooo.I00iio = I001i1lo1io(i);
/* 14 */            Object[] objArr = this.I0000O;
/* 18 */            if (objArr.length == 2) {
/* 20 */                return null;
                    }
/* 26 */            if (this.I0000Il00O != oO0lo1Ooo.I00iiI) {
/* 53 */                return new OoIiIlIo(i2 ^ this.I00000oIO, this.I00000oOI, lOoIIlo.I0000Il00O(i, objArr), oO0lo1Ooo.I00iiI);
                    }
/* 32 */            this.I0000O = lOoIIlo.I0000Il00O(i, objArr);
                    this.I00000oIO ^= i2;
/* 39 */            return this;
                }

                public final OoIiIlIo I00100o1O0lo(OoIiIlIo ooIiIlIo, OoIiIlIo ooIiIlIo2, int i, int i2, lOOlOoll loolooll) {
/* 1 */             lOOlOoll loolooll2 = this.I0000Il00O;
/* 3 */             if (ooIiIlIo2 != null) {
                        return (loolooll2 == loolooll || ooIiIlIo != ooIiIlIo2) ? I0010I0i(i, ooIiIlIo2, loolooll) : this;
                    }
/* 5 */             Object[] objArr = this.I0000O;
/* 9 */             if (objArr.length == 1) {
/* 11 */                return null;
                    }
/* 13 */            if (loolooll2 != loolooll) {
/* 38 */                return new OoIiIlIo(this.I00000oIO, this.I00000oOI ^ i2, lOoIIlo.I0000O(i, objArr), loolooll);
                    }
/* 19 */            this.I0000O = lOoIIlo.I0000O(i, objArr);
                    this.I00000oOI ^= i2;
/* 26 */            return this;
                }

                public final OoIiIlIo I0010I0i(int i, OoIiIlIo ooIiIlIo, lOOlOoll loolooll) {
/* 1 */             Object[] objArr = this.I0000O;
/* 5 */             if (objArr.length == 1 && ooIiIlIo.I0000O.length == 2 && ooIiIlIo.I00000oOI == 0) {
/* 19 */                ooIiIlIo.I00000oIO = this.I00000oOI;
/* 21 */                return ooIiIlIo;
                    }
/* 24 */            if (this.I0000Il00O == loolooll) {
/* 26 */                objArr[i] = ooIiIlIo;
/* 28 */                return this;
                    }
/* 30 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 34 */            objArrCopyOf[i] = ooIiIlIo;
/* 42 */            return new OoIiIlIo(this.I00000oIO, this.I00000oOI, objArrCopyOf, loolooll);
                }

                public final OoIiIlIo I0010o(int i) {
/* 5 */             return (OoIiIlIo) this.I0000O[i];
                }

                public final int I00111O(int i) {
/* 15 */            return (this.I0000O.length - 1) - Integer.bitCount(this.I00000oOI & (i - 1));
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
                
                    if (r15 != null) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
                
                    if (r15 == null) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
                
                    r15.I00iiO = I001i1O0Ol(r3, r2, (p000.OoIiIlIo) r15.I00iiO);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
                
                    return r15;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1I1OO I001IIilI0O(Object obj, int i, int i2, Object obj2) {
                    O1I1OO o1i1ooI001IIilI0O;
/* 7 */             int i3 = 1;
/* 8 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 14 */            int i4 = 15;
/* 16 */            int i5 = 0;
/* 18 */            if (I000O01llI0(iI00000oIO)) {
/* 20 */                int iI0001Ioi1lo = I0001Ioi1lo(iI00000oIO);
/* 32 */                if (!O0000Ioio00.I0000O(obj, this.I0000O[iI0001Ioi1lo])) {
/* 92 */                    return new O1I1OO(new OoIiIlIo(this.I00000oIO ^ iI00000oIO, this.I00000oOI | iI00000oIO, I00000oIO(iI0001Ioi1lo, iI00000oIO, i, obj, obj2, i2, null), null), i3, i4);
                        }
/* 38 */                if (I001i1lo1io(iI0001Ioi1lo) != obj2) {
/* 42 */                    Object[] objArr = this.I0000O;
/* 45 */                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 50 */                    objArrCopyOf[iI0001Ioi1lo + 1] = obj2;
/* 63 */                    return new O1I1OO(new OoIiIlIo(this.I00000oIO, this.I00000oOI, objArrCopyOf, null), i5, i4);
                        }
                    } else {
/* 102 */               if (!I000OOo1O(iI00000oIO)) {
/* 248 */                   return new O1I1OO(new OoIiIlIo(iI00000oIO | this.I00000oIO, this.I00000oOI, lOoIIlo.I00000oOI(this.I0000O, I0001Ioi1lo(iI00000oIO), obj, obj2), null), i3, i4);
                        }
/* 104 */               int iI00111O = I00111O(iI00000oIO);
/* 108 */               OoIiIlIo ooIiIlIoI0010o = I0010o(iI00111O);
/* 114 */               if (i2 == 30) {
/* 124 */                   IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIoI0010o.I0000O.length), 2);
/* 128 */                   int i6 = iooO0oO00II000II.I00iOIl;
/* 130 */                   int i7 = iooO0oO00II000II.I00iiI;
/* 132 */                   int i8 = iooO0oO00II000II.I00iiO;
/* 134 */                   if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
/* 150 */                       while (!O0000Ioio00.I0000O(obj, ooIiIlIoI0010o.I0000O[i6])) {
/* 181 */                           if (i6 != i7) {
/* 183 */                               i6 += i8;
                                    }
                                }
/* 156 */                       if (obj2 == ooIiIlIoI0010o.I001i1lo1io(i6)) {
/* 158 */                           o1i1ooI001IIilI0O = null;
                                } else {
/* 160 */                           Object[] objArr2 = ooIiIlIoI0010o.I0000O;
/* 163 */                           Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
/* 168 */                           objArrCopyOf2[i6 + 1] = obj2;
/* 177 */                           o1i1ooI001IIilI0O = new O1I1OO(new OoIiIlIo(0, 0, objArrCopyOf2, null), i5, i4);
                                }
                            }
/* 198 */                   o1i1ooI001IIilI0O = new O1I1OO(new OoIiIlIo(0, 0, lOoIIlo.I00000oOI(ooIiIlIoI0010o.I0000O, 0, obj, obj2), null), i3, i4);
                            break;
                        }
/* 208 */               o1i1ooI001IIilI0O = ooIiIlIoI0010o.I001IIilI0O(obj, i, i2 + 5, obj2);
                    }
/* 17 */            return null;
                }

                public final OoIiIlIo I001IO000(Object obj, int i, int i2) {
                    OoIiIlIo ooIiIlIoI001IO000;
/* 6 */             int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i2);
/* 14 */            if (I000O01llI0(iI00000oIO)) {
/* 16 */                int iI0001Ioi1lo = I0001Ioi1lo(iI00000oIO);
/* 28 */                if (!O0000Ioio00.I0000O(obj, this.I0000O[iI0001Ioi1lo])) {
/* 408 */                   return this;
                        }
/* 30 */                Object[] objArr = this.I0000O;
/* 33 */                if (objArr.length != 2) {
/* 48 */                    return new OoIiIlIo(this.I00000oIO ^ iI00000oIO, this.I00000oOI, lOoIIlo.I0000Il00O(iI0001Ioi1lo, objArr), null);
                        }
                    } else {
/* 56 */                if (!I000OOo1O(iI00000oIO)) {
/* 408 */                   return this;
                        }
/* 58 */                int iI00111O = I00111O(iI00000oIO);
/* 62 */                OoIiIlIo ooIiIlIoI0010o = I0010o(iI00111O);
/* 68 */                if (i2 == 30) {
/* 78 */                    IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, ooIiIlIoI0010o.I0000O.length), 2);
/* 82 */                    int i3 = iooO0oO00II000II.I00iOIl;
/* 84 */                    int i4 = iooO0oO00II000II.I00iiI;
/* 86 */                    int i5 = iooO0oO00II000II.I00iiO;
/* 88 */                    if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
/* 127 */                       ooIiIlIoI001IO000 = ooIiIlIoI0010o;
                                break;
                            }
/* 104 */                   while (!O0000Ioio00.I0000O(obj, ooIiIlIoI0010o.I0000O[i3])) {
/* 123 */                       if (i3 == i4) {
/* 127 */                           ooIiIlIoI001IO000 = ooIiIlIoI0010o;
                                    break;
                                }
/* 125 */                       i3 += i5;
                            }
/* 106 */                   Object[] objArr2 = ooIiIlIoI0010o.I0000O;
/* 119 */                   ooIiIlIoI001IO000 = objArr2.length == 2 ? null : new OoIiIlIo(0, 0, lOoIIlo.I0000Il00O(i3, objArr2), null);
                        } else {
/* 131 */                   ooIiIlIoI001IO000 = ooIiIlIoI0010o.I001IO000(obj, i, i2 + 5);
                        }
/* 135 */               if (ooIiIlIoI001IO000 != null) {
                            return ooIiIlIoI0010o != ooIiIlIoI001IO000 ? I001i1O0Ol(iI00111O, iI00000oIO, ooIiIlIoI001IO000) : this;
                        }
/* 137 */               Object[] objArr3 = this.I0000O;
/* 140 */               if (objArr3.length != 1) {
/* 154 */                   return new OoIiIlIo(this.I00000oIO, this.I00000oOI ^ iI00000oIO, lOoIIlo.I0000O(iI00111O, objArr3), null);
                        }
                    }
/* 13 */            return null;
                }

                public final OoIiIlIo I001i1O0Ol(int i, int i2, OoIiIlIo ooIiIlIo) {
/* 1 */             Object[] objArr = ooIiIlIo.I0000O;
/* 6 */             if (objArr.length != 2 || ooIiIlIo.I00000oOI != 0) {
/* 70 */                Object[] objArr2 = this.I0000O;
/* 73 */                Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
/* 77 */                objArrCopyOf[i] = ooIiIlIo;
/* 85 */                return new OoIiIlIo(this.I00000oIO, this.I00000oOI, objArrCopyOf, null);
                    }
/* 16 */            if (this.I0000O.length == 1) {
/* 20 */                ooIiIlIo.I00000oIO = this.I00000oOI;
/* 22 */                return ooIiIlIo;
                    }
/* 23 */            int iI0001Ioi1lo = I0001Ioi1lo(i2);
/* 27 */            Object[] objArr3 = this.I0000O;
/* 30 */            Object obj = objArr[0];
/* 32 */            Object obj2 = objArr[1];
/* 36 */            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
/* 45 */            I1IoiO1l.I000iOII(objArrCopyOf2, i + 2, objArrCopyOf2, i + 1, objArr3.length);
/* 50 */            I1IoiO1l.I000iOII(objArrCopyOf2, iI0001Ioi1lo + 2, objArrCopyOf2, iI0001Ioi1lo, i);
/* 53 */            objArrCopyOf2[iI0001Ioi1lo] = obj;
/* 56 */            objArrCopyOf2[iI0001Ioi1lo + 1] = obj2;
/* 66 */            return new OoIiIlIo(this.I00000oIO ^ i2, this.I00000oOI ^ i2, objArrCopyOf2, null);
                }

                public final Object I001i1lo1io(int i) {
/* 5 */             return this.I0000O[i + 1];
                }
            }

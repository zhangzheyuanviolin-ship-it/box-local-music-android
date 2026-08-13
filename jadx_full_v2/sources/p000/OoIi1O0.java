            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class OoIi1O0 {
                public static final OoIi1O0 I0000O = new OoIi1O0(0, 0, 0, new Object[0]);
                public int I00000oIO;
                public final int I00000oOI;
                public final Object[] I0000Il00O;

                public OoIi1O0(int i, int i2, int i3, Object[] objArr) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = objArr;
                }

                public static OoIi1O0 I0001Ioi1lo(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3) {
/* 6 */             if (i3 > 30) {
/* 14 */                return new OoIi1O0(0, 0, 0, new Object[]{obj, obj2, obj3, obj4});
                    }
/* 18 */            int iI00000oIO = lOoII1oIio.I00000oIO(i, i3);
/* 22 */            int iI00000oIO2 = lOoII1oIio.I00000oIO(i2, i3);
/* 27 */            if (iI00000oIO != iI00000oIO2) {
/* 62 */                return new OoIi1O0((1 << iI00000oIO) | (1 << iI00000oIO2), 0, 0, iI00000oIO < iI00000oIO2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2});
                    }
/* 86 */            return new OoIi1O0(0, 1 << iI00000oIO, 0, new Object[]{I0001Ioi1lo(i, obj, obj2, i2, obj3, obj4, i3 + 5)});
                }

                public static OoIi1O0 I000iOII(OoIi1O0 ooIi1O0, int i, int i2, OoIi1O0 ooIi1O02) {
/* 1 */             int i3 = ooIi1O0.I00000oOI;
/* 3 */             Object[] objArr = ooIi1O0.I0000Il00O;
/* 5 */             Object[] objArr2 = ooIi1O02.I0000Il00O;
/* 10 */            if (objArr2.length != 2 || ooIi1O02.I00000oOI != 0) {
/* 66 */                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 70 */                objArrCopyOf[i] = ooIi1O02;
/* 76 */                return new OoIi1O0(ooIi1O0.I00000oIO, i3, 0, objArrCopyOf);
                    }
/* 18 */            if (objArr.length == 1) {
/* 20 */                ooIi1O02.I00000oIO = i3;
/* 22 */                return ooIi1O02;
                    }
/* 23 */            int iI0000Il00O = ooIi1O0.I0000Il00O(i2);
/* 27 */            Object obj = objArr2[0];
/* 29 */            Object obj2 = objArr2[1];
/* 33 */            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length + 1);
/* 42 */            I1IoiO1l.I000iOII(objArrCopyOf2, i + 2, objArrCopyOf2, i + 1, objArr.length);
/* 47 */            I1IoiO1l.I000iOII(objArrCopyOf2, iI0000Il00O + 2, objArrCopyOf2, iI0000Il00O, i);
/* 50 */            objArrCopyOf2[iI0000Il00O] = obj;
/* 53 */            objArrCopyOf2[iI0000Il00O + 1] = obj2;
/* 61 */            return new OoIi1O0(ooIi1O0.I00000oIO ^ i2, i2 ^ i3, 0, objArrCopyOf2);
                }

                public final int I00000oIO(Object obj) {
/* 1 */             Object[] objArr = this.I0000Il00O;
/* 10 */            IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, objArr.length), 2);
/* 14 */            int i = iooO0oO00II000II.I00iOIl;
/* 16 */            int i2 = iooO0oO00II000II.I00iiI;
/* 18 */            int i3 = iooO0oO00II000II.I00iiO;
/* 20 */            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
/* 41 */                return -1;
                    }
/* 34 */            while (!O0000Ioio00.I0000O(obj, objArr[i])) {
/* 37 */                if (i == i2) {
/* 41 */                    return -1;
                        }
/* 39 */                i += i3;
                    }
/* 36 */            return i;
                }

                public final boolean I00000oOI(Object obj, int i, int i2) {
/* 6 */             int iI00000oIO = 1 << lOoII1oIio.I00000oIO(i, i2);
/* 11 */            if ((this.I00000oIO & iI00000oIO) != 0) {
/* 21 */                return O0000Ioio00.I0000O(obj, this.I0000Il00O[I0000Il00O(iI00000oIO)]);
                    }
/* 30 */            if ((this.I00000oOI & iI00000oIO) == 0) {
/* 29 */                return false;
                    }
/* 36 */            OoIi1O0 ooIi1O0I000II = I000II(I000O01llI0(iI00000oIO));
                    return i2 == 30 ? ooIi1O0I000II.I00000oIO(obj) != -1 : ooIi1O0I000II.I00000oOI(obj, i, i2 + 5);
                }

                public final int I0000Il00O(int i) {
/* 10 */            return Integer.bitCount(this.I00000oIO & (i - 1)) * 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000O(OoIi1O0 ooIi1O0, IlliIl1l11O illiIl1l11O) {
                    int length;
/* 1 */             Object[] objArr = ooIi1O0.I0000Il00O;
/* 3 */             if (this == ooIi1O0) {
/* 193 */               return true;
                    }
/* 7 */             int i = this.I00000oIO;
/* 12 */            if (i == ooIi1O0.I00000oIO) {
/* 14 */                int i2 = ooIi1O0.I00000oOI;
/* 16 */                int i3 = this.I00000oOI;
/* 18 */                if (i3 == i2) {
/* 23 */                    Object[] objArr2 = this.I0000Il00O;
/* 25 */                    if (i != 0 || i3 != 0) {
/* 113 */                       int iBitCount = Integer.bitCount(i) * 2;
/* 118 */                       IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, iBitCount), 2);
/* 122 */                       int i4 = iooO0oO00II000II.I00iOIl;
/* 124 */                       int i5 = iooO0oO00II000II.I00iiI;
/* 126 */                       int i6 = iooO0oO00II000II.I00iiO;
/* 128 */                       if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
/* 172 */                           length = objArr2.length;
/* 173 */                           while (iBitCount < length) {
/* 187 */                               if (I000II(iBitCount).I0000O(ooIi1O0.I000II(iBitCount), illiIl1l11O)) {
/* 190 */                                   iBitCount++;
                                        }
                                    }
/* 193 */                           return true;
                                }
/* 144 */                       while (O0000Ioio00.I0000O(objArr2[i4], objArr[i4]) && ((Boolean) illiIl1l11O.invoke(I000l1(i4), ooIi1O0.I000l1(i4))).booleanValue()) {
/* 168 */                           if (i4 == i5) {
/* 172 */                               length = objArr2.length;
/* 173 */                               while (iBitCount < length) {
                                        }
/* 193 */                               return true;
                                    }
/* 170 */                           i4 += i6;
                                }
                            } else if (objArr2.length == objArr.length) {
/* 40 */                        Iterable iterableI000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, objArr2.length), 2);
/* 46 */                        if ((iterableI000II instanceof Collection) && ((Collection) iterableI000II).isEmpty()) {
/* 193 */                           return true;
                                }
/* 59 */                        Iterator it = iterableI000II.iterator();
/* 68 */                        while (((IooO10lI) it).I00iiO) {
/* 73 */                            int iNextInt = ((IooIlO1) it).nextInt();
/* 77 */                            Object obj = objArr[iNextInt];
/* 79 */                            Object objI000l1 = ooIi1O0.I000l1(iNextInt);
/* 83 */                            int iI00000oIO = I00000oIO(obj);
/* 106 */                           if (!(iI00000oIO != -1 ? ((Boolean) illiIl1l11O.invoke(I000l1(iI00000oIO), objI000l1)).booleanValue() : false)) {
                                    }
                                }
/* 193 */                       return true;
                            }
                        }
                    }
/* 11 */            return false;
                }

                public final Object I0000oI00(Object obj, int i, int i2) {
/* 6 */             int iI00000oIO = 1 << lOoII1oIio.I00000oIO(i, i2);
/* 11 */            if ((this.I00000oIO & iI00000oIO) != 0) {
/* 13 */                int iI0000Il00O = I0000Il00O(iI00000oIO);
/* 25 */                if (O0000Ioio00.I0000O(obj, this.I0000Il00O[iI0000Il00O])) {
/* 27 */                    return I000l1(iI0000Il00O);
                        }
                    } else {
/* 35 */                if ((this.I00000oOI & iI00000oIO) == 0) {
/* 10 */                    return null;
                        }
/* 41 */                OoIi1O0 ooIi1O0I000II = I000II(I000O01llI0(iI00000oIO));
/* 47 */                if (i2 != 30) {
/* 64 */                    return ooIi1O0I000II.I0000oI00(obj, i, i2 + 5);
                        }
/* 49 */                int iI00000oIO2 = ooIi1O0I000II.I00000oIO(obj);
/* 54 */                if (iI00000oIO2 != -1) {
/* 56 */                    return ooIi1O0I000II.I000l1(iI00000oIO2);
                        }
                    }
/* 10 */            return null;
                }

                public final OoIi1O0 I000II(int i) {
/* 5 */             return (OoIi1O0) this.I0000Il00O[i];
                }

                public final int I000O01llI0(int i) {
/* 15 */            return (this.I0000Il00O.length - 1) - Integer.bitCount(this.I00000oOI & (i - 1));
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
                
                    if (r1 == null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
                
                    if (r1 == null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
                
                    r1.I00iiO = I000iOII(r16, r2, r9, (p000.OoIi1O0) r1.I00iiO);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
                
                    return r1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1I1OO I000OOo1O(Object obj, int i, int i2, Object obj2) {
                    O1I1OO o1i1ooI000OOo1O;
/* 13 */            int i3 = 1;
/* 14 */            int iI00000oIO = 1 << lOoII1oIio.I00000oIO(i, i2);
/* 18 */            int i4 = this.I00000oIO & iI00000oIO;
/* 19 */            int i5 = 14;
/* 22 */            int i6 = 0;
/* 23 */            int i7 = this.I00000oOI;
/* 25 */            Object[] objArr = this.I0000Il00O;
/* 28 */            if (i4 != 0) {
/* 30 */                int iI0000Il00O = I0000Il00O(iI00000oIO);
/* 40 */                if (!O0000Ioio00.I0000O(obj, objArr[iI0000Il00O])) {
/* 71 */                    Object obj3 = objArr[iI0000Il00O];
/* 91 */                    OoIi1O0 ooIi1O0I0001Ioi1lo = I0001Ioi1lo(obj3 != null ? obj3.hashCode() : 0, obj3, I000l1(iI0000Il00O), i, obj, obj2, i2 + 5);
/* 95 */                    int iI000O01llI0 = I000O01llI0(iI00000oIO);
/* 99 */                    int i8 = iI000O01llI0 + 1;
/* 105 */                   Object[] objArr2 = new Object[objArr.length - 1];
/* 107 */                   I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, iI0000Il00O, 6);
/* 112 */                   I1IoiO1l.I000iOII(objArr, iI0000Il00O, objArr2, iI0000Il00O + 2, i8);
/* 115 */                   objArr2[iI000O01llI0 - 1] = ooIi1O0I0001Ioi1lo;
/* 118 */                   I1IoiO1l.I000iOII(objArr, iI000O01llI0, objArr2, i8, objArr.length);
/* 133 */                   return new O1I1OO(new OoIi1O0(this.I00000oIO ^ iI00000oIO, i7 | iI00000oIO, 0, objArr2), i3, i5);
                        }
/* 46 */                if (I000l1(iI0000Il00O) != obj2) {
/* 51 */                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 56 */                    objArrCopyOf[iI0000Il00O + 1] = obj2;
/* 67 */                    return new O1I1OO(new OoIi1O0(this.I00000oIO, i7, 0, objArrCopyOf), i6, i5);
                        }
                    } else {
/* 140 */               if ((i7 & iI00000oIO) == 0) {
/* 241 */                   int iI0000Il00O2 = I0000Il00O(iI00000oIO);
/* 247 */                   Object[] objArr3 = new Object[objArr.length + 2];
/* 249 */                   I1IoiO1l.I000oI1ioi(objArr, 0, objArr3, iI0000Il00O2, 6);
/* 255 */                   I1IoiO1l.I000iOII(objArr, iI0000Il00O2 + 2, objArr3, iI0000Il00O2, objArr.length);
/* 258 */                   objArr3[iI0000Il00O2] = obj;
/* 261 */                   objArr3[iI0000Il00O2 + 1] = obj2;
/* 273 */                   return new O1I1OO(new OoIi1O0(this.I00000oIO | iI00000oIO, i7, 0, objArr3), i3, i5);
                        }
/* 142 */               int iI000O01llI02 = I000O01llI0(iI00000oIO);
/* 146 */               OoIi1O0 ooIi1O0I000II = I000II(iI000O01llI02);
/* 152 */               if (i2 == 30) {
/* 154 */                   Object[] objArr4 = ooIi1O0I000II.I0000Il00O;
/* 156 */                   int iI00000oIO2 = ooIi1O0I000II.I00000oIO(obj);
/* 161 */                   if (iI00000oIO2 == -1) {
/* 192 */                       Object[] objArr5 = new Object[objArr4.length + 2];
/* 194 */                       I1IoiO1l.I000oI1ioi(objArr4, 0, objArr5, 0, 6);
/* 198 */                       I1IoiO1l.I000iOII(objArr4, 2, objArr5, 0, objArr4.length);
/* 201 */                       objArr5[0] = obj;
/* 203 */                       objArr5[1] = obj2;
/* 212 */                       o1i1ooI000OOo1O = new O1I1OO(new OoIi1O0(0, 0, 0, objArr5), i3, i5);
                            } else if (obj2 == ooIi1O0I000II.I000l1(iI00000oIO2)) {
/* 169 */                       o1i1ooI000OOo1O = null;
                            } else {
/* 172 */                       Object[] objArrCopyOf2 = Arrays.copyOf(objArr4, objArr4.length);
/* 177 */                       objArrCopyOf2[iI00000oIO2 + 1] = obj2;
/* 186 */                       o1i1ooI000OOo1O = new O1I1OO(new OoIi1O0(0, 0, 0, objArrCopyOf2), i6, i5);
                            }
                        } else {
/* 223 */                   o1i1ooI000OOo1O = ooIi1O0I000II.I000OOo1O(obj, i, i2 + 5, obj2);
                        }
                    }
/* 27 */            return null;
                }

                public final OoIi1O0 I000OiO(int i, Oi0IO1ii011 oi0IO1ii011, int i2) {
                    OoIi1O0 ooIi1O0I000OiO;
/* 6 */             int iI00000oIO = 1 << lOoII1oIio.I00000oIO(i, i2);
/* 10 */            int i3 = this.I00000oIO & iI00000oIO;
/* 13 */            int i4 = this.I00000oOI;
/* 17 */            Object[] objArr = this.I0000Il00O;
/* 19 */            if (i3 != 0) {
/* 21 */                int iI0000Il00O = I0000Il00O(iI00000oIO);
/* 31 */                if (!oi0IO1ii011.equals(objArr[iI0000Il00O])) {
/* 215 */                   return this;
                        }
/* 34 */                if (objArr.length != 2) {
/* 39 */                    Object[] objArr2 = new Object[objArr.length - 2];
/* 41 */                    I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, iI0000Il00O, 6);
/* 47 */                    I1IoiO1l.I000iOII(objArr, iI0000Il00O, objArr2, iI0000Il00O + 2, objArr.length);
/* 55 */                    return new OoIi1O0(this.I00000oIO ^ iI00000oIO, i4, 0, objArr2);
                        }
                    } else {
/* 61 */                if ((i4 & iI00000oIO) == 0) {
/* 215 */                   return this;
                        }
/* 63 */                int iI000O01llI0 = I000O01llI0(iI00000oIO);
/* 67 */                OoIi1O0 ooIi1O0I000II = I000II(iI000O01llI0);
/* 73 */                if (i2 == 30) {
/* 75 */                    int iI00000oIO2 = ooIi1O0I000II.I00000oIO(oi0IO1ii011);
/* 80 */                    if (iI00000oIO2 != -1) {
/* 82 */                        Object[] objArr3 = ooIi1O0I000II.I0000Il00O;
/* 85 */                        if (objArr3.length == 2) {
/* 87 */                            ooIi1O0I000OiO = null;
                                } else {
/* 91 */                            Object[] objArr4 = new Object[objArr3.length - 2];
/* 93 */                            I1IoiO1l.I000oI1ioi(objArr3, 0, objArr4, iI00000oIO2, 6);
/* 99 */                            I1IoiO1l.I000iOII(objArr3, iI00000oIO2, objArr4, iI00000oIO2 + 2, objArr3.length);
/* 104 */                           ooIi1O0I000OiO = new OoIi1O0(0, 0, 0, objArr4);
                                }
                            } else {
/* 108 */                       ooIi1O0I000OiO = ooIi1O0I000II;
                            }
                        } else {
/* 112 */                   ooIi1O0I000OiO = ooIi1O0I000II.I000OiO(i, oi0IO1ii011, i2 + 5);
                        }
/* 116 */               if (ooIi1O0I000OiO != null) {
                            return ooIi1O0I000II != ooIi1O0I000OiO ? I000iOII(this, iI000O01llI0, iI00000oIO, ooIi1O0I000OiO) : this;
                        }
/* 119 */               if (objArr.length != 1) {
/* 124 */                   Object[] objArr5 = new Object[objArr.length - 1];
/* 126 */                   I1IoiO1l.I000oI1ioi(objArr, 0, objArr5, iI000O01llI0, 6);
/* 132 */                   I1IoiO1l.I000iOII(objArr, iI000O01llI0, objArr5, iI000O01llI0 + 1, objArr.length);
/* 141 */                   return new OoIi1O0(this.I00000oIO, i4 ^ iI00000oIO, 0, objArr5);
                        }
                    }
/* 16 */            return null;
                }

                public final Object I000l1(int i) {
/* 5 */             return this.I0000Il00O[i + 1];
                }
            }

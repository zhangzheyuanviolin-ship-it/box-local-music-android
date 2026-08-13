            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            
            public final class Ol11il011o0 {
                public Ol11i0000Oo I00000oIO;
                public int[] I00000oOI;
                public Object[] I0000Il00O;
                public ArrayList I0000O;
                public HashMap I0000oI00;
                public OI0l1oli1I I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;
                public int I000l1;
                public int I000lI;
                public int I000o00OoI0I;
                public int I000oI1ioi;
                public IooOlI11lli I00100l0;
                public IooOlI11lli I00100o1O0lo;
                public IooOlI11lli I0010I0i;
                public OI0l1oli1I I0010o;
                public int I00111O;
                public int I001IIilI0O;
                public int I001IO000;
                public boolean I001i1O0Ol;
                public OI0l1iiooO I001i1lo1io;

                public static int I000O01llI0(int i, int i2, int i3, int i4) {
                    return i > i2 ? -(((i4 - i3) - i) + 1) : i;
                }

                public static void I001iOo1i0O(Ol11il011o0 ol11il011o0) {
/* 1 */             int i = ol11il011o0.I001IO000;
/* 3 */             int iI00100o1O0lo = ol11il011o0.I00100o1O0lo(i);
/* 7 */             int[] iArr = ol11il011o0.I00000oOI;
/* 11 */            int i2 = (iI00100o1O0lo * 5) + 1;
/* 13 */            int i3 = iArr[i2];
/* 19 */            if ((i3 & 134217728) != 0) {
/* 34 */                return;
                    }
/* 26 */            int i4 = (i3 & (-134217729)) | 134217728;
/* 27 */            iArr[i2] = i4;
/* 32 */            if ((67108864 & i4) != 0) {
/* 34 */                return;
                    }
/* 39 */            ol11il011o0.I00OIl(ol11il011o0.I00IO1(iArr, i));
                }

                public final void I00000oIO(int i) {
/* 1 */             boolean z = false;
/* 8 */             if (!(i >= 0)) {
/* 12 */                IOl1II00.I00000oIO("Cannot seek backwards");
                    }
/* 22 */            if (!(this.I000o00OoI0I <= 0)) {
/* 26 */                OO1oio00IO.I00000oOI("Cannot call seek() while inserting");
                    }
/* 29 */            if (i == 0) {
/* 31 */                return;
                    }
/* 34 */            int i2 = this.I00111O + i;
/* 35 */            int i3 = this.I001IO000;
/* 37 */            if (i2 >= i3 && i2 <= this.I001IIilI0O) {
/* 43 */                z = true;
                    }
/* 44 */            if (!z) {
/* 75 */                IOl1II00.I00000oIO("Cannot seek outside the current group (" + i3 + "-" + this.I001IIilI0O + ")");
                    }
/* 78 */            this.I00111O = i2;
/* 86 */            int iI0001Ioi1lo = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i2));
/* 90 */            this.I000OOo1O = iI0001Ioi1lo;
/* 92 */            this.I000OiO = iI0001Ioi1lo;
                }

                public final Ilo1iIi1OI01 I00000oOI(int i) {
/* 1 */             ArrayList arrayList = this.I0000O;
/* 7 */             int iI0000O = Ol11iOOOoo1.I0000O(arrayList, i, I000oI1ioi());
/* 11 */            if (iI0000O >= 0) {
/* 40 */                return (Ilo1iIi1OI01) arrayList.get(iI0000O);
                    }
/* 17 */            if (i > this.I000II) {
/* 25 */                i = -(I000oI1ioi() - i);
                    }
/* 26 */            Ilo1iIi1OI01 ilo1iIi1OI01 = new Ilo1iIi1OI01(i);
/* 32 */            arrayList.add(-(iI0000O + 1), ilo1iIi1OI01);
/* 35 */            return ilo1iIi1OI01;
                }

                public final int I0000Il00O(Ilo1iIi1OI01 ilo1iIi1OI01) {
/* 1 */             int i = ilo1iIi1OI01.I00000oIO;
                    return i < 0 ? I000oI1ioi() + i : i;
                }

                public final void I0000O() {
/* 1 */             int i = this.I000o00OoI0I;
/* 5 */             this.I000o00OoI0I = i + 1;
/* 7 */             if (i == 0) {
/* 21 */                this.I00100o1O0lo.I0000Il00O((I000o00OoI0I() - this.I000O01llI0) - this.I001IIilI0O);
                    }
                }

                public final void I0000oI00(boolean z) {
/* 1 */             Ol11i0000Oo ol11i0000Oo = this.I00000oIO;
/* 4 */             this.I001i1O0Ol = true;
/* 6 */             if (z && this.I00100l0.I00000oOI == 0) {
/* 18 */                I001lIiIIo1O(I000oI1ioi());
/* 29 */                I001lllioOl(this.I0000Il00O.length - this.I000l1, this.I000II);
/* 32 */                int i = this.I000iOII;
/* 40 */                Arrays.fill(this.I0000Il00O, i, this.I000l1 + i, (Object) null);
/* 43 */                I00IOO();
                    }
/* 46 */            int[] iArr = this.I00000oOI;
/* 48 */            int i2 = this.I000II;
/* 50 */            Object[] objArr = this.I0000Il00O;
/* 52 */            int i3 = this.I000iOII;
/* 54 */            ArrayList arrayList = this.I0000O;
/* 56 */            HashMap map = this.I0000oI00;
/* 58 */            OI0l1oli1I oI0l1oli1I = this.I0001Ioi1lo;
/* 62 */            if (!ol11i0000Oo.I00io1l) {
/* 67 */                OO1oio00IO.I00000oIO("Unexpected writer close()");
                    }
/* 71 */            ol11i0000Oo.I00io1l = false;
/* 73 */            ol11i0000Oo.I00iOIl = iArr;
/* 75 */            ol11i0000Oo.I00iiI = i2;
/* 77 */            ol11i0000Oo.I00iiO = objArr;
/* 79 */            ol11i0000Oo.I00iio = i3;
/* 81 */            ol11i0000Oo.I00l0I0l0lO1 = arrayList;
/* 83 */            ol11i0000Oo.I00l0OO0IO = map;
/* 85 */            ol11i0000Oo.I00li1OI = oI0l1oli1I;
                }

                public final int I0001Ioi1lo(int[] iArr, int i) {
/* 5 */             if (i >= I000o00OoI0I()) {
/* 12 */                return this.I0000Il00O.length - this.I000l1;
                    }
/* 18 */            int i2 = iArr[(i * 5) + 4];
                    return i2 < 0 ? (this.I0000Il00O.length - this.I000l1) + i2 + 1 : i2;
                }

                public final int I000II(int i) {
/* 11 */            return (this.I000l1 * (i < this.I000iOII ? 0 : 1)) + i;
                }

                public final void I000OOo1O() {
                    OI0oiiIO0 oI0oiiIO0;
/* 1 */             IooOlI11lli iooOlI11lli = this.I0010I0i;
/* 11 */            boolean z = this.I000o00OoI0I > 0;
/* 12 */            int i = this.I00111O;
/* 14 */            int i2 = this.I001IIilI0O;
/* 16 */            int i3 = this.I001IO000;
/* 18 */            int iI00100o1O0lo = I00100o1O0lo(i3);
/* 22 */            int i4 = this.I000oI1ioi;
/* 24 */            int i5 = i - i3;
/* 28 */            int i6 = iI00100o1O0lo * 5;
/* 30 */            int i7 = i6 + 1;
/* 41 */            boolean z2 = (this.I00000oOI[i7] & 1073741824) != 0;
/* 42 */            if (z) {
/* 44 */                OI0l1oli1I oI0l1oli1I = this.I0010o;
/* 46 */                if (oI0l1oli1I != null && (oI0oiiIO0 = (OI0oiiIO0) oI0l1oli1I.I00000oOI(i3)) != null) {
/* 56 */                    Object[] objArr = oI0oiiIO0.I00000oIO;
/* 58 */                    int i8 = oI0oiiIO0.I00000oOI;
/* 61 */                    for (int i9 = 0; i9 < i8; i9++) {
/* 65 */                        I00IO1oi11O(objArr[i9]);
                            }
                        }
/* 77 */                int[] iArr = this.I00000oOI;
/* 81 */                iArr[i6 + 3] = i5;
/* 83 */                Ol11iOOOoo1.I000II(iI00100o1O0lo, i4, iArr);
/* 86 */                int iI00000oOI = iooOlI11lli.I00000oOI();
/* 90 */                if (z2) {
/* 92 */                    i4 = 1;
                        }
/* 94 */                this.I000oI1ioi = iI00000oOI + i4;
/* 98 */                int iI00IO1 = I00IO1(this.I00000oOI, i3);
/* 102 */               this.I001IO000 = iI00IO1;
/* 112 */               int iI000oI1ioi = iI00IO1 < 0 ? I000oI1ioi() : I00100o1O0lo(iI00IO1 + 1);
/* 121 */               int iI0001Ioi1lo = iI000oI1ioi >= 0 ? I0001Ioi1lo(this.I00000oOI, iI000oI1ioi) : 0;
/* 125 */               this.I000OOo1O = iI0001Ioi1lo;
/* 127 */               this.I000OiO = iI0001Ioi1lo;
/* 129 */               return;
                    }
/* 130 */           if (i != i2) {
/* 135 */               IOl1II00.I00000oIO("Expected to be at the end of a group");
                    }
/* 140 */           int iI00000oOI2 = Ol11iOOOoo1.I00000oOI(this.I00000oOI, iI00100o1O0lo);
/* 144 */           int[] iArr2 = this.I00000oOI;
/* 151 */           int i10 = iArr2[i7] & 67108863;
/* 154 */           iArr2[i6 + 3] = i5;
/* 156 */           Ol11iOOOoo1.I000II(iI00100o1O0lo, i4, iArr2);
/* 161 */           int iI00000oOI3 = this.I00100l0.I00000oOI();
/* 179 */           this.I001IIilI0O = (I000o00OoI0I() - this.I000O01llI0) - this.I00100o1O0lo.I00000oOI();
/* 181 */           this.I001IO000 = iI00000oOI3;
/* 185 */           int iI00IO12 = I00IO1(this.I00000oOI, i3);
/* 189 */           int iI00000oOI4 = iooOlI11lli.I00000oOI();
/* 193 */           this.I000oI1ioi = iI00000oOI4;
/* 195 */           if (iI00IO12 == iI00000oOI3) {
/* 203 */               this.I000oI1ioi = iI00000oOI4 + (z2 ? 0 : i4 - i10);
/* 205 */               return;
                    }
/* 206 */           int i11 = i5 - iI00000oOI2;
/* 211 */           int i12 = z2 ? 0 : i4 - i10;
/* 212 */           if (i11 != 0 || i12 != 0) {
/* 216 */               while (iI00IO12 != 0 && iI00IO12 != iI00000oOI3 && (i12 != 0 || i11 != 0)) {
/* 224 */                   int iI00100o1O0lo2 = I00100o1O0lo(iI00IO12);
/* 228 */                   if (i11 != 0) {
/* 243 */                       this.I00000oOI[(iI00100o1O0lo2 * 5) + 3] = Ol11iOOOoo1.I00000oOI(this.I00000oOI, iI00100o1O0lo2) + i11;
                            }
/* 245 */                   if (i12 != 0) {
/* 247 */                       int[] iArr3 = this.I00000oOI;
/* 256 */                       Ol11iOOOoo1.I000II(iI00100o1O0lo2, (iArr3[(iI00100o1O0lo2 * 5) + 1] & 67108863) + i12, iArr3);
                            }
/* 259 */                   int[] iArr4 = this.I00000oOI;
/* 267 */                   if ((iArr4[(iI00100o1O0lo2 * 5) + 1] & 1073741824) != 0) {
/* 269 */                       i12 = 0;
                            }
/* 270 */                   iI00IO12 = I00IO1(iArr4, iI00IO12);
                        }
                    }
                    this.I000oI1ioi += i12;
                }

                public final void I000OiO() {
/* 3 */             if (this.I000o00OoI0I <= 0) {
/* 8 */                 OO1oio00IO.I00000oOI("Unbalanced begin/end insert");
                    }
                    int i = this.I000o00OoI0I - 1;
/* 15 */            this.I000o00OoI0I = i;
/* 17 */            if (i == 0) {
/* 27 */                if (this.I0010I0i.I00000oOI != this.I00100l0.I00000oOI) {
/* 32 */                    IOl1II00.I00000oIO("startGroup/endGroup mismatch while inserting");
                        }
/* 49 */                this.I001IIilI0O = (I000o00OoI0I() - this.I000O01llI0) - this.I00100o1O0lo.I00000oOI();
                    }
                }

                public final void I000iOII(int i) {
/* 3 */             boolean z = false;
/* 10 */            if (!(this.I000o00OoI0I <= 0)) {
/* 14 */                IOl1II00.I00000oIO("Cannot call ensureStarted() while inserting");
                    }
/* 17 */            int i2 = this.I001IO000;
/* 19 */            if (i2 != i) {
/* 21 */                if (i >= i2 && i < this.I001IIilI0O) {
/* 27 */                    z = true;
                        }
/* 28 */                if (!z) {
/* 52 */                    IOl1II00.I00000oIO("Started group at " + i + " must be a subgroup of the group at " + i2);
                        }
/* 55 */                int i3 = this.I00111O;
/* 57 */                int i4 = this.I000OOo1O;
/* 59 */                int i5 = this.I000OiO;
/* 61 */                this.I00111O = i;
/* 63 */                I00O0i0ii();
/* 66 */                this.I00111O = i3;
/* 68 */                this.I000OOo1O = i4;
/* 70 */                this.I000OiO = i5;
                    }
                }

                public final void I000l1(int i, int i2, int i3) {
/* 3 */             if (i >= this.I000II) {
/* 13 */                i = -((I000oI1ioi() - i) + 2);
                    }
/* 14 */            while (i3 < i2) {
/* 26 */                this.I00000oOI[(I00100o1O0lo(i3) * 5) + 2] = i;
/* 38 */                int iI00000oOI = Ol11iOOOoo1.I00000oOI(this.I00000oOI, I00100o1O0lo(i3)) + i3;
/* 41 */                I000l1(i3, iI00000oOI, i3 + 1);
/* 44 */                i3 = iI00000oOI;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:69:0x0141, code lost:
                
                    p000.lO00l0o.I00000oOI("Index must be between 0 and size");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
                
                    throw null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000lI(int i, IlliIl1l11O illiIl1l11O) {
                    int i2;
                    int i3;
                    int i4;
/* 5 */             IlliIl1l11O illiIl1l11O2 = illiIl1l11O;
/* 9 */             int iI00IO1 = I00IO1(this.I00000oOI, i);
/* 13 */            int iI000oI1ioi = I000oI1ioi();
/* 21 */            int iI00111O = I00111O(i) + i;
/* 22 */            int i5 = i;
/* 23 */            OI0lOIOi1l oI0lOIOi1l = null;
/* 24 */            OI0l1iiooO oI0l1iiooO = null;
/* 25 */            loop0: while (i5 < iI00111O) {
/* 33 */                int iI0001Ioi1lo = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i5));
/* 37 */                int i6 = i5 + 1;
/* 45 */                int iI0001Ioi1lo2 = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i6));
/* 49 */                while (iI0001Ioi1lo < iI0001Ioi1lo2) {
/* 57 */                    Object obj = this.I0000Il00O[I000II(iI0001Ioi1lo)];
/* 61 */                    if (obj instanceof IloI1lO1IiI0) {
/* 64 */                        IloI1lO1IiI0 iloI1lO1IiI0 = (IloI1lO1IiI0) obj;
/* 70 */                        if (!(iloI1lO1IiI0 instanceof IloI1lO1IiI0)) {
/* 73 */                            iloI1lO1IiI0 = null;
                                }
/* 75 */                        if (iloI1lO1IiI0 == null) {
/* 167 */                           IOl1II00.I00000oOI("Inconsistent composition");
/* 170 */                           IOOlIIilOl0.I0000Il00O();
/* 173 */                           return;
                                }
/* 77 */                        int i7 = iloI1lO1IiI0.I00000oOI;
/* 79 */                        if (i7 >= 0) {
/* 85 */                            int iI00111O2 = I00111O(i5) + i5;
/* 86 */                            int iI00000oOI = i6;
/* 87 */                            int i8 = 0;
/* 88 */                            while (iI00000oOI < iI00111O2 && i8 < i7) {
/* 92 */                                int i9 = iI00IO1;
/* 94 */                                int iI00100o1O0lo = I00100o1O0lo(iI00000oOI);
/* 98 */                                int i10 = iI00111O;
/* 106 */                               iI00000oOI += Ol11iOOOoo1.I00000oOI(this.I00000oOI, iI00100o1O0lo);
/* 107 */                               if (iI00000oOI < iI00111O2 && (this.I00000oOI[(iI00100o1O0lo * 5) + 1] & 536870912) == 0) {
/* 123 */                                   i8++;
                                        }
/* 125 */                               iI00IO1 = i9;
/* 127 */                               iI00111O = i10;
                                    }
/* 130 */                           i3 = iI00IO1;
/* 132 */                           i4 = iI00111O;
/* 134 */                           if (oI0lOIOi1l == null) {
/* 136 */                               int[] iArr = IooOIoI.I00000oIO;
/* 140 */                               oI0lOIOi1l = new OI0lOIOi1l();
                                    }
/* 143 */                           if (oI0l1iiooO == null) {
/* 147 */                               oI0l1iiooO = new OI0l1iiooO();
                                    }
/* 150 */                           oI0lOIOi1l.I00000oIO(iI00000oOI);
/* 153 */                           oI0l1iiooO.I00000oIO(iI00000oOI);
/* 156 */                           oI0l1iiooO.I00000oIO(iI0001Ioi1lo);
                                }
/* 184 */                       iI0001Ioi1lo++;
/* 186 */                       iI00IO1 = i3;
/* 188 */                       iI00111O = i4;
                            }
/* 160 */                   i3 = iI00IO1;
/* 162 */                   i4 = iI00111O;
/* 181 */                   illiIl1l11O2.invoke(Integer.valueOf(iI0001Ioi1lo), obj);
/* 184 */                   iI0001Ioi1lo++;
/* 186 */                   iI00IO1 = i3;
/* 188 */                   iI00111O = i4;
                        }
/* 192 */               int i11 = iI00IO1;
/* 194 */               int i12 = iI00111O;
/* 207 */               iI00IO1 = i6 < iI000oI1ioi ? I00IO1(this.I00000oOI, i6) : -1;
/* 208 */               if (iI00IO1 != i5) {
/* 210 */                   int iI00IO12 = i11;
                            while (true) {
/* 212 */                       if (oI0l1iiooO != null && oI0lOIOi1l != null && oI0lOIOi1l.I0001Ioi1lo(i5)) {
/* 222 */                           int i13 = oI0l1iiooO.I00000oOI;
/* 224 */                           int i14 = i13 / 2;
/* 226 */                           int i15 = 0;
/* 227 */                           int i16 = 0;
/* 228 */                           while (i15 < i14) {
/* 230 */                               int i17 = i15 * 2;
/* 232 */                               int iI0000Il00O = oI0l1iiooO.I0000Il00O(i17);
/* 236 */                               if (iI0000Il00O == i5) {
/* 240 */                                   int iI0000Il00O2 = oI0l1iiooO.I0000Il00O(i17 + 1);
/* 256 */                                   illiIl1l11O2.invoke(Integer.valueOf(iI0000Il00O2), this.I0000Il00O[I000II(iI0000Il00O2)]);
                                        } else if (i17 != i16) {
/* 262 */                                   int i18 = i16 + 1;
/* 264 */                                   oI0l1iiooO.I0001Ioi1lo(i16, iI0000Il00O);
/* 267 */                                   i16 += 2;
/* 275 */                                   oI0l1iiooO.I0001Ioi1lo(i18, oI0l1iiooO.I0000Il00O(i17 + 1));
                                        } else {
/* 279 */                                   i16 += 2;
                                        }
/* 281 */                               i15++;
/* 283 */                               illiIl1l11O2 = illiIl1l11O;
                                    }
/* 286 */                           if (i16 != i13) {
/* 288 */                               if (i16 < 0 || i16 > (i2 = oI0l1iiooO.I00000oOI) || i13 < 0 || i13 > i2) {
                                            break loop0;
                                        }
/* 298 */                               if (i13 < i16) {
/* 318 */                                   lO00l0o.I00000oIO("The end index must be < start index");
/* 321 */                                   throw null;
                                        }
/* 300 */                               if (i13 != i16) {
/* 302 */                                   if (i13 < i2) {
/* 304 */                                       int[] iArr2 = oI0l1iiooO.I00000oIO;
/* 306 */                                       I1IoiO1l.I000O01llI0(i16, i13, i2, iArr2, iArr2);
                                            }
                                            oI0l1iiooO.I00000oOI -= i13 - i16;
                                        }
                                    }
                                }
/* 328 */                       if (i5 == i || iI00IO12 == iI00IO1) {
                                    break;
                                }
/* 338 */                       i5 = iI00IO12;
/* 334 */                       iI00IO12 = I00IO1(this.I00000oOI, iI00IO12);
/* 340 */                       illiIl1l11O2 = illiIl1l11O;
                            }
                        }
/* 344 */               illiIl1l11O2 = illiIl1l11O;
/* 346 */               i5 = i6;
/* 347 */               iI00111O = i12;
                    }
                }

                public final int I000o00OoI0I() {
/* 4 */             return this.I00000oOI.length / 5;
                }

                public final int I000oI1ioi() {
/* 7 */             return I000o00OoI0I() - this.I000O01llI0;
                }

                public final Object I00100l0(int i) {
/* 1 */             int iI00100o1O0lo = I00100o1O0lo(i);
/* 5 */             int[] iArr = this.I00000oOI;
/* 9 */             int i2 = (iI00100o1O0lo * 5) + 1;
/* 16 */            if ((iArr[i2] & 268435456) == 0) {
/* 36 */                return IOl11li.I00000oIO;
                    }
/* 33 */            return this.I0000Il00O[Integer.bitCount(iArr[i2] >> 29) + I0001Ioi1lo(iArr, iI00100o1O0lo)];
                }

                public final int I00100o1O0lo(int i) {
/* 11 */            return (this.I000O01llI0 * (i < this.I000II ? 0 : 1)) + i;
                }

                public final int I0010I0i(int i) {
/* 9 */             return this.I00000oOI[I00100o1O0lo(i) * 5];
                }

                public final Object I0010o(int i) {
/* 1 */             int iI00100o1O0lo = I00100o1O0lo(i);
/* 5 */             int[] iArr = this.I00000oOI;
/* 7 */             int i2 = iI00100o1O0lo * 5;
/* 11 */            int i3 = iArr[i2 + 1];
/* 16 */            if ((536870912 & i3) == 0) {
/* 34 */                return null;
                    }
/* 31 */            return this.I0000Il00O[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
                }

                public final int I00111O(int i) {
/* 7 */             return Ol11iOOOoo1.I00000oOI(this.I00000oOI, I00100o1O0lo(i));
                }

                public final boolean I001IIilI0O(int i, int i2) {
                    int iI000o00OoI0I;
                    int iI00111O;
/* 1 */             IooOlI11lli iooOlI11lli = this.I00100l0;
/* 6 */             if (i2 == this.I001IO000) {
/* 8 */                 iI000o00OoI0I = this.I001IIilI0O;
                    } else {
/* 15 */                if (i2 > iooOlI11lli.I00000oIO(0)) {
/* 17 */                    iI00111O = I00111O(i2);
                        } else {
/* 23 */                    int[] iArr = iooOlI11lli.I00000oIO;
/* 28 */                    int iMin = Math.min(iArr.length, iooOlI11lli.I00000oOI);
/* 32 */                    int i3 = 0;
                            while (true) {
/* 33 */                        if (i3 >= iMin) {
/* 43 */                            i3 = -1;
                                    break;
                                }
/* 37 */                        if (iArr[i3] == i2) {
                                    break;
                                }
/* 40 */                        i3++;
                            }
/* 44 */                    if (i3 < 0) {
/* 46 */                        iI00111O = I00111O(i2);
                            } else {
/* 64 */                        iI000o00OoI0I = (I000o00OoI0I() - this.I000O01llI0) - this.I00100o1O0lo.I00000oIO[i3];
                            }
                        }
/* 21 */                iI000o00OoI0I = iI00111O + i2;
                    }
                    return i > i2 && i < iI000o00OoI0I;
                }

                public final void I001IO000(int i) {
/* 1 */             if (i > 0) {
/* 3 */                 int i2 = this.I00111O;
/* 5 */                 I001lIiIIo1O(i2);
/* 8 */                 int i3 = this.I000II;
/* 10 */                int i4 = this.I000O01llI0;
/* 12 */                int[] iArr = this.I00000oOI;
/* 15 */                int length = iArr.length / 5;
/* 17 */                int i5 = length - i4;
/* 20 */                if (i4 < i) {
/* 32 */                    int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
/* 38 */                    int[] iArr2 = new int[iMax * 5];
/* 40 */                    int i6 = iMax - i5;
/* 46 */                    I1IoiO1l.I000O01llI0(0, 0, i3 * 5, iArr, iArr2);
/* 55 */                    I1IoiO1l.I000O01llI0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
/* 58 */                    this.I00000oOI = iArr2;
/* 60 */                    i4 = i6;
/* 61 */                    iArr = iArr2;
                        }
/* 62 */                int i7 = this.I001IIilI0O;
/* 64 */                if (i7 >= i3) {
/* 67 */                    this.I001IIilI0O = i7 + i;
                        }
/* 69 */                int i8 = i3 + i;
/* 71 */                this.I000II = i8;
/* 74 */                this.I000O01llI0 = i4 - i;
/* 101 */               int iI000O01llI0 = I000O01llI0(i5 > 0 ? I0001Ioi1lo(iArr, I00100o1O0lo(i2 + i)) : 0, this.I000lI >= i3 ? this.I000iOII : 0, this.I000l1, this.I0000Il00O.length);
/* 106 */               for (int i9 = i3; i9 < i8; i9++) {
/* 114 */                   this.I00000oOI[(i9 * 5) + 4] = iI000O01llI0;
                        }
/* 119 */               int i10 = this.I000lI;
/* 121 */               if (i10 >= i3) {
/* 124 */                   this.I000lI = i10 + i;
                        }
                    }
                }

                public final void I001i1O0Ol(int i, int i2) {
/* 1 */             if (i > 0) {
/* 5 */                 I001lllioOl(this.I000OOo1O, i2);
/* 8 */                 int i3 = this.I000iOII;
/* 10 */                int i4 = this.I000l1;
/* 12 */                if (i4 < i) {
/* 14 */                    Object[] objArr = this.I0000Il00O;
/* 16 */                    int length = objArr.length;
/* 17 */                    int i5 = length - i4;
/* 29 */                    int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
/* 33 */                    Object[] objArr2 = new Object[iMax];
/* 37 */                    for (int i6 = 0; i6 < iMax; i6++) {
/* 40 */                        objArr2[i6] = null;
                            }
/* 45 */                    int i7 = iMax - i5;
/* 46 */                    int i8 = i4 + i3;
/* 49 */                    System.arraycopy(objArr, 0, objArr2, 0, i3);
/* 53 */                    System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
/* 56 */                    this.I0000Il00O = objArr2;
/* 58 */                    i4 = i7;
                        }
/* 59 */                int i9 = this.I000OiO;
/* 61 */                if (i9 >= i3) {
/* 64 */                    this.I000OiO = i9 + i;
                        }
/* 67 */                this.I000iOII = i3 + i;
/* 70 */                this.I000l1 = i4 - i;
                    }
                }

                public final boolean I001i1lo1io(int i) {
                    return (this.I00000oOI[(I00100o1O0lo(i) * 5) + 1] & 1073741824) != 0;
                }

                public final void I001l0I00(Ol11i0000Oo ol11i0000Oo, int i) {
/* 5 */             if (this.I000o00OoI0I <= 0) {
/* 10 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 14 */            if (i == 0 && this.I00111O == 0 && this.I00000oIO.I00iiI == 0) {
/* 28 */                int iI00000oOI = Ol11iOOOoo1.I00000oOI(ol11i0000Oo.I00iOIl, i);
/* 32 */                int i2 = ol11i0000Oo.I00iiI;
/* 34 */                if (iI00000oOI == i2) {
/* 36 */                    int[] iArr = this.I00000oOI;
/* 38 */                    Object[] objArr = this.I0000Il00O;
/* 40 */                    ArrayList arrayList = this.I0000O;
/* 42 */                    HashMap map = this.I0000oI00;
/* 44 */                    OI0l1oli1I oI0l1oli1I = this.I0001Ioi1lo;
/* 46 */                    int[] iArr2 = ol11i0000Oo.I00iOIl;
/* 48 */                    Object[] objArr2 = ol11i0000Oo.I00iiO;
/* 50 */                    int i3 = ol11i0000Oo.I00iio;
/* 52 */                    HashMap map2 = ol11i0000Oo.I00l0OO0IO;
/* 54 */                    OI0l1oli1I oI0l1oli1I2 = ol11i0000Oo.I00li1OI;
/* 56 */                    this.I00000oOI = iArr2;
/* 58 */                    this.I0000Il00O = objArr2;
/* 62 */                    this.I0000O = ol11i0000Oo.I00l0I0l0lO1;
/* 64 */                    this.I000II = i2;
/* 70 */                    this.I000O01llI0 = (iArr2.length / 5) - i2;
/* 72 */                    this.I000iOII = i3;
/* 76 */                    this.I000l1 = objArr2.length - i3;
/* 78 */                    this.I000lI = i2;
/* 80 */                    this.I0000oI00 = map2;
/* 82 */                    this.I0001Ioi1lo = oI0l1oli1I2;
/* 84 */                    ol11i0000Oo.I00iOIl = iArr;
/* 86 */                    ol11i0000Oo.I00iiI = 0;
/* 88 */                    ol11i0000Oo.I00iiO = objArr;
/* 90 */                    ol11i0000Oo.I00iio = 0;
/* 92 */                    ol11i0000Oo.I00l0I0l0lO1 = arrayList;
/* 94 */                    ol11i0000Oo.I00l0OO0IO = map;
/* 96 */                    ol11i0000Oo.I00li1OI = oI0l1oli1I;
/* 98 */                    return;
                        }
                    }
/* 99 */            Ol11il011o0 ol11il011o0I000lI = ol11i0000Oo.I000lI();
                    try {
/* 107 */               lOIlIOil.I00000oIO(ol11il011o0I000lI, i, this, true, true, false);
/* 111 */               ol11il011o0I000lI.I0000oI00(true);
                    } catch (Throwable th) {
/* 117 */               ol11il011o0I000lI.I0000oI00(false);
/* 332 */               throw th;
                    }
                }

                public final void I001lIiIIo1O(int i) {
                    Ilo1iIi1OI01 ilo1iIi1OI01;
                    int i2;
                    Ilo1iIi1OI01 ilo1iIi1OI012;
                    int i3;
                    int i4;
/* 1 */             int i5 = this.I000O01llI0;
/* 3 */             int i6 = this.I000II;
/* 5 */             if (i6 != i) {
/* 13 */                if (!this.I0000O.isEmpty()) {
/* 21 */                    int iI000o00OoI0I = I000o00OoI0I() - this.I000O01llI0;
/* 22 */                    ArrayList arrayList = this.I0000O;
/* 24 */                    if (i6 < i) {
/* 36 */                        for (int iI0000Il00O = Ol11iOOOoo1.I0000Il00O(arrayList, i6, iI000o00OoI0I); iI0000Il00O < this.I0000O.size() && (i3 = (ilo1iIi1OI012 = (Ilo1iIi1OI01) this.I0000O.get(iI0000Il00O)).I00000oIO) < 0 && (i4 = i3 + iI000o00OoI0I) < i; iI0000Il00O++) {
/* 53 */                            ilo1iIi1OI012.I00000oIO = i4;
                                }
                            } else {
/* 68 */                        for (int iI0000Il00O2 = Ol11iOOOoo1.I0000Il00O(arrayList, i, iI000o00OoI0I); iI0000Il00O2 < this.I0000O.size() && (i2 = (ilo1iIi1OI01 = (Ilo1iIi1OI01) this.I0000O.get(iI0000Il00O2)).I00000oIO) >= 0; iI0000Il00O2++) {
/* 85 */                            ilo1iIi1OI01.I00000oIO = -(iI000o00OoI0I - i2);
                                }
                            }
                        }
/* 90 */                if (i5 > 0) {
/* 92 */                    int[] iArr = this.I00000oOI;
/* 94 */                    int i7 = i * 5;
/* 96 */                    int i8 = i5 * 5;
/* 98 */                    int i9 = i6 * 5;
/* 100 */                   if (i < i6) {
/* 103 */                       I1IoiO1l.I000O01llI0(i8 + i7, i7, i9, iArr, iArr);
                            } else {
/* 110 */                       I1IoiO1l.I000O01llI0(i9, i9 + i8, i7 + i8, iArr, iArr);
                            }
                        }
/* 113 */               if (i < i6) {
/* 115 */                   i6 = i + i5;
                        }
/* 117 */               int iI000o00OoI0I2 = I000o00OoI0I();
/* 121 */               if (i6 >= iI000o00OoI0I2) {
/* 126 */                   IOl1II00.I00000oIO("Check failed");
                        }
/* 129 */               while (i6 < iI000o00OoI0I2) {
/* 135 */                   int i10 = (i6 * 5) + 2;
/* 137 */                   int i11 = this.I00000oOI[i10];
/* 149 */                   int iI000oI1ioi = i11 > -2 ? i11 : (I000oI1ioi() + i11) - (-2);
/* 150 */                   if (iI000oI1ioi >= i) {
/* 159 */                       iI000oI1ioi = -((I000oI1ioi() - iI000oI1ioi) - (-2));
                            }
/* 160 */                   if (iI000oI1ioi != i11) {
/* 164 */                       this.I00000oOI[i10] = iI000oI1ioi;
                            }
/* 166 */                   i6++;
/* 168 */                   if (i6 == i) {
/* 170 */                       i6 += i5;
                            }
                        }
                    }
/* 172 */           this.I000II = i;
                }

                public final void I001lllioOl(int i, int i2) {
/* 1 */             int i3 = this.I000l1;
/* 3 */             int i4 = this.I000iOII;
/* 5 */             int i5 = this.I000lI;
/* 7 */             if (i4 != i) {
/* 9 */                 Object[] objArr = this.I0000Il00O;
/* 11 */                if (i < i4) {
/* 16 */                    System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
                        } else {
/* 20 */                    int i6 = i4 + i3;
/* 25 */                    System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
                        }
                    }
/* 34 */            int iMin = Math.min(i2 + 1, I000oI1ioi());
/* 38 */            if (i5 != iMin) {
/* 43 */                int length = this.I0000Il00O.length - i3;
/* 45 */                if (iMin < i5) {
/* 47 */                    int iI00100o1O0lo = I00100o1O0lo(iMin);
/* 51 */                    int iI00100o1O0lo2 = I00100o1O0lo(i5);
/* 55 */                    int i7 = this.I000II;
/* 57 */                    while (iI00100o1O0lo < iI00100o1O0lo2) {
/* 63 */                        int i8 = (iI00100o1O0lo * 5) + 4;
/* 65 */                        int i9 = this.I00000oOI[i8];
/* 72 */                        if (!(i9 >= 0)) {
/* 76 */                            IOl1II00.I00000oIO("Unexpected anchor value, expected a positive anchor");
                                }
/* 85 */                        this.I00000oOI[i8] = -((length - i9) + 1);
/* 87 */                        iI00100o1O0lo++;
/* 89 */                        if (iI00100o1O0lo == i7) {
/* 93 */                            iI00100o1O0lo += this.I000O01llI0;
                                }
                            }
                        } else {
/* 95 */                    int iI00100o1O0lo3 = I00100o1O0lo(i5);
/* 99 */                    int iI00100o1O0lo4 = I00100o1O0lo(iMin);
/* 103 */                   while (iI00100o1O0lo3 < iI00100o1O0lo4) {
/* 109 */                       int i10 = (iI00100o1O0lo3 * 5) + 4;
/* 111 */                       int i11 = this.I00000oOI[i10];
/* 118 */                       if (!(i11 < 0)) {
/* 122 */                           IOl1II00.I00000oIO("Unexpected anchor value, expected a negative anchor");
                                }
/* 129 */                       this.I00000oOI[i10] = i11 + length + 1;
/* 131 */                       iI00100o1O0lo3++;
/* 135 */                       if (iI00100o1O0lo3 == this.I000II) {
/* 139 */                           iI00100o1O0lo3 += this.I000O01llI0;
                                }
                            }
                        }
/* 141 */               this.I000lI = iMin;
                    }
/* 143 */           this.I000iOII = i;
                }

                public final List I001lloI(Ilo1iIi1OI01 ilo1iIi1OI01, Ol11il011o0 ol11il011o0) {
/* 5 */             if (ol11il011o0.I000o00OoI0I <= 0) {
/* 8 */                 IOl1II00.I00000oIO("Check failed");
                    }
/* 13 */            if (this.I000o00OoI0I != 0) {
/* 16 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 23 */            if (!ilo1iIi1OI01.I00000oIO()) {
/* 25 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 33 */            int iI0000Il00O = I0000Il00O(ilo1iIi1OI01) + 1;
/* 35 */            int i = this.I00111O;
/* 37 */            if (i > iI0000Il00O || iI0000Il00O >= this.I001IIilI0O) {
/* 44 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 49 */            int iI00IO1 = I00IO1(this.I00000oOI, iI0000Il00O);
/* 53 */            int iI00111O = I00111O(iI0000Il00O);
/* 65 */            int iI00II0oii1o = I001i1lo1io(iI0000Il00O) ? 1 : I00II0oii1o(iI0000Il00O);
/* 75 */            List listI00000oIO = lOIlIOil.I00000oIO(this, iI0000Il00O, ol11il011o0, false, false, true);
/* 79 */            I00OIl(iI00IO1);
/* 83 */            boolean z = iI00II0oii1o > 0;
/* 87 */            while (iI00IO1 >= i) {
/* 89 */                int iI00100o1O0lo = I00100o1O0lo(iI00IO1);
/* 93 */                int[] iArr = this.I00000oOI;
/* 100 */               int i2 = iI00100o1O0lo * 5;
/* 104 */               iArr[i2 + 3] = Ol11iOOOoo1.I00000oOI(iArr, iI00100o1O0lo) - iI00111O;
/* 106 */               if (z) {
/* 108 */                   int[] iArr2 = this.I00000oOI;
/* 112 */                   int i3 = iArr2[i2 + 1];
/* 117 */                   if ((1073741824 & i3) != 0) {
/* 119 */                       z = false;
                            } else {
/* 126 */                       Ol11iOOOoo1.I000II(iI00100o1O0lo, (i3 & 67108863) - iI00II0oii1o, iArr2);
                            }
                        }
/* 131 */               iI00IO1 = I00IO1(this.I00000oOI, iI00IO1);
                    }
/* 136 */           if (z) {
/* 140 */               if (this.I000oI1ioi < iI00II0oii1o) {
/* 143 */                   IOl1II00.I00000oIO("Check failed");
                        }
                        this.I000oI1ioi -= iI00II0oii1o;
                    }
/* 332 */           return listI00000oIO;
                }

                public final Object I00II0Ol1O0l(int i) {
/* 1 */             int iI00100o1O0lo = I00100o1O0lo(i);
/* 5 */             int[] iArr = this.I00000oOI;
/* 16 */            if ((iArr[(iI00100o1O0lo * 5) + 1] & 1073741824) != 0) {
/* 28 */                return this.I0000Il00O[I000II(I0001Ioi1lo(iArr, iI00100o1O0lo))];
                    }
/* 31 */            return null;
                }

                public final int I00II0oii1o(int i) {
/* 16 */            return this.I00000oOI[(I00100o1O0lo(i) * 5) + 1] & 67108863;
                }

                public final int I00IO1(int[] iArr, int i) {
/* 9 */             int i2 = iArr[(I00100o1O0lo(i) * 5) + 2];
                    return i2 > -2 ? i2 : (I000oI1ioi() + i2) - (-2);
                }

                public final Object I00IO1oi11O(Object obj) {
/* 4 */             if (this.I000o00OoI0I > 0) {
/* 8 */                 I001i1O0Ol(1, this.I001IO000);
                    }
/* 11 */            Object[] objArr = this.I0000Il00O;
/* 13 */            int i = this.I000OOo1O;
/* 17 */            this.I000OOo1O = i + 1;
/* 23 */            Object obj2 = objArr[I000II(i)];
/* 29 */            if (this.I000OOo1O > this.I000OiO) {
/* 34 */                IOl1II00.I00000oIO("Writing to an invalid slot");
                    }
/* 46 */            this.I0000Il00O[I000II(this.I000OOo1O - 1)] = obj;
/* 77 */            return obj2;
                }

                public final void I00IOO() {
                    int i;
/* 1 */             OI0l1iiooO oI0l1iiooO = this.I001i1lo1io;
/* 3 */             if (oI0l1iiooO != null) {
/* 7 */                 while (oI0l1iiooO.I00000oOI != 0) {
/* 9 */                     int iI00000oOI = lIIO11.I00000oOI(oI0l1iiooO);
/* 13 */                    int iI00100o1O0lo = I00100o1O0lo(iI00000oOI);
/* 17 */                    int iI00111O = iI00000oOI + 1;
/* 23 */                    int iI00111O2 = I00111O(iI00000oOI) + iI00000oOI;
                            while (true) {
/* 26 */                        if (iI00111O >= iI00111O2) {
/* 52 */                            i = 0;
                                    break;
                                } else {
/* 42 */                            if ((this.I00000oOI[(I00100o1O0lo(iI00111O) * 5) + 1] & 201326592) != 0) {
/* 44 */                                i = 1;
                                        break;
                                    }
/* 50 */                            iI00111O += I00111O(iI00111O);
                                }
                            }
/* 53 */                    int[] iArr = this.I00000oOI;
/* 57 */                    int i2 = (iI00100o1O0lo * 5) + 1;
/* 58 */                    int i3 = iArr[i2];
/* 66 */                    if (((67108864 & i3) != 0 ? 1 : 0) != i) {
/* 75 */                        iArr[i2] = (i << 26) | ((-67108865) & i3);
/* 77 */                        int iI00IO1 = I00IO1(iArr, iI00000oOI);
/* 81 */                        if (iI00IO1 >= 0) {
/* 83 */                            lIIO11.I00000oIO(oI0l1iiooO, iI00IO1);
                                }
                            }
                        }
                    }
                }

                public final boolean I00IioO0OiOi() {
/* 3 */             if (this.I000o00OoI0I != 0) {
/* 8 */                 IOl1II00.I00000oIO("Cannot remove group while inserting");
                    }
/* 11 */            int i = this.I00111O;
/* 13 */            int i2 = this.I000OOo1O;
/* 21 */            int iI0001Ioi1lo = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i));
/* 25 */            int iI00IoIO0lI = I00IoIO0lI();
/* 31 */            I00Iooi00oi(this.I001IO000);
/* 34 */            OI0l1iiooO oI0l1iiooO = this.I001i1lo1io;
/* 36 */            if (oI0l1iiooO != null) {
                        while (true) {
/* 38 */                    int i3 = oI0l1iiooO.I00000oOI;
/* 40 */                    if (i3 == 0) {
                                break;
                            }
/* 42 */                    if (i3 == 0) {
/* 57 */                        lO00l0o.I0000Il00O("IntList is empty.");
/* 61 */                        throw null;
                            }
/* 49 */                    if (oI0l1iiooO.I00000oIO[0] < i) {
                                break;
                            }
/* 51 */                    lIIO11.I00000oOI(oI0l1iiooO);
                        }
                    }
/* 65 */            boolean zI00IlilI0i0i = I00IlilI0i0i(i, this.I00111O - i);
/* 74 */            I00Io1lO(iI0001Ioi1lo, this.I000OOo1O - iI0001Ioi1lo, i - 1);
/* 77 */            this.I00111O = i;
/* 79 */            this.I000OOo1O = i2;
                    this.I000oI1ioi -= iI00IoIO0lI;
/* 110 */           return zI00IlilI0i0i;
                }

                public final boolean I00IlilI0i0i(int i, int i2) {
/* 2 */             if (i2 > 0) {
/* 4 */                 ArrayList arrayList = this.I0000O;
/* 6 */                 I001lIiIIo1O(i);
/* 14 */                if (!arrayList.isEmpty()) {
/* 16 */                    HashMap map = this.I0000oI00;
/* 20 */                    int i3 = i + i2;
/* 29 */                    int iI0000Il00O = Ol11iOOOoo1.I0000Il00O(this.I0000O, i3, I000o00OoI0I() - this.I000O01llI0);
/* 39 */                    if (iI0000Il00O >= this.I0000O.size()) {
                                iI0000Il00O--;
                            }
/* 43 */                    int i4 = iI0000Il00O + 1;
/* 45 */                    int i5 = 0;
/* 46 */                    while (iI0000Il00O >= 0) {
/* 54 */                        Ilo1iIi1OI01 ilo1iIi1OI01 = (Ilo1iIi1OI01) this.I0000O.get(iI0000Il00O);
/* 56 */                        int iI0000Il00O2 = I0000Il00O(ilo1iIi1OI01);
/* 60 */                        if (iI0000Il00O2 < i) {
                                    break;
                                }
/* 62 */                        if (iI0000Il00O2 < i3) {
/* 66 */                            ilo1iIi1OI01.I00000oIO = Integer.MIN_VALUE;
/* 68 */                            if (map != null) {
                                    }
/* 76 */                            if (i5 == 0) {
/* 78 */                                i5 = iI0000Il00O + 1;
                                    }
/* 80 */                            i4 = iI0000Il00O;
                                }
                                iI0000Il00O--;
                            }
/* 84 */                    z = i4 < i5;
/* 87 */                    if (z) {
/* 95 */                        this.I0000O.subList(i4, i5).clear();
                            }
                        }
/* 98 */                this.I000II = i;
                        this.I000O01llI0 += i2;
/* 105 */               int i6 = this.I000lI;
/* 107 */               if (i6 > i) {
/* 114 */                   this.I000lI = Math.max(i, i6 - i2);
                        }
/* 116 */               int i7 = this.I001IIilI0O;
/* 120 */               if (i7 >= this.I000II) {
/* 123 */                   this.I001IIilI0O = i7 - i2;
                        }
/* 125 */               int i8 = this.I001IO000;
/* 127 */               if (i8 >= 0 && (this.I00000oOI[(I00100o1O0lo(i8) * 5) + 1] & 67108864) != 0) {
/* 145 */                   I00OIl(i8);
                        }
                    }
/* 332 */           return z;
                }

                public final void I00Io1lO(int i, int i2, int i3) {
/* 1 */             if (i2 > 0) {
/* 3 */                 int i4 = this.I000l1;
/* 5 */                 int i5 = i + i2;
/* 7 */                 I001lllioOl(i5, i3);
/* 10 */                this.I000iOII = i;
/* 13 */                this.I000l1 = i4 + i2;
/* 18 */                Arrays.fill(this.I0000Il00O, i, i5, (Object) null);
/* 21 */                int i6 = this.I000OiO;
/* 23 */                if (i6 >= i) {
/* 26 */                    this.I000OiO = i6 - i2;
                        }
                    }
                }

                public final Object I00Io1o110i(Object obj, int i, int i2) {
/* 7 */             int iI00IoiI = I00IoiI(this.I00000oOI, I00100o1O0lo(i));
/* 19 */            int iI0001Ioi1lo = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i + 1));
/* 23 */            int i3 = iI00IoiI + i2;
/* 25 */            if (i3 < iI00IoiI || i3 >= iI0001Ioi1lo) {
/* 52 */                IOl1II00.I00000oIO("Write to an invalid slot index " + i2 + " for group " + i);
                    }
/* 55 */            int iI000II = I000II(i3);
/* 59 */            Object[] objArr = this.I0000Il00O;
/* 61 */            Object obj2 = objArr[iI000II];
/* 63 */            objArr[iI000II] = obj;
/* 98 */            return obj2;
                }

                public final int I00IoIO0lI() {
/* 3 */             int iI00100o1O0lo = I00100o1O0lo(this.I00111O);
/* 15 */            int iI00000oOI = Ol11iOOOoo1.I00000oOI(this.I00000oOI, iI00100o1O0lo) + this.I00111O;
/* 16 */            this.I00111O = iI00000oOI;
/* 28 */            this.I000OOo1O = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(iI00000oOI));
/* 36 */            int i = this.I00000oOI[(iI00100o1O0lo * 5) + 1];
/* 41 */            if ((1073741824 & i) != 0) {
/* 34 */                return 1;
                    }
/* 47 */            return i & 67108863;
                }

                public final void I00IoO0() {
/* 1 */             int i = this.I001IIilI0O;
/* 3 */             this.I00111O = i;
/* 15 */            this.I000OOo1O = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i));
                }

                public final int I00IoiI(int[] iArr, int i) {
/* 5 */             if (i >= I000o00OoI0I()) {
/* 12 */                return this.I0000Il00O.length - this.I000l1;
                    }
/* 14 */            int iI0000oI00 = Ol11iOOOoo1.I0000oI00(iArr, i);
                    return iI0000oI00 < 0 ? (this.I0000Il00O.length - this.I000l1) + iI0000oI00 + 1 : iI0000oI00;
                }

                public final IloI10l1l I00Iooi00oi(int i) {
                    Ilo1iIi1OI01 ilo1iIi1OI01I00O10llo;
/* 1 */             HashMap map = this.I0000oI00;
/* 4 */             if (map == null || (ilo1iIi1OI01I00O10llo = I00O10llo(i)) == null) {
/* 3 */                 return null;
                    }
/* 16 */            return (IloI10l1l) map.get(ilo1iIi1OI01I00O10llo);
                }

                public final void I00O0i0ii() {
/* 3 */             if (this.I000o00OoI0I != 0) {
/* 8 */                 IOl1II00.I00000oIO("Key must be supplied when inserting");
                    }
/* 11 */            IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 14 */            I00O0o1oo(0, iOO0o0I1l, false, iOO0o0I1l);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I00O0o1oo(int i, Object obj, boolean z, Object obj2) {
                    int i2;
/* 1 */             int i3 = this.I001IO000;
/* 11 */            Object[] objArr = this.I000o00OoI0I > 0;
/* 16 */            this.I0010I0i.I0000Il00O(this.I000oI1ioi);
/* 19 */            IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 21 */            if (objArr == true) {
/* 23 */                int i4 = this.I00111O;
/* 31 */                int iI0001Ioi1lo = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(i4));
/* 35 */                I001IO000(1);
/* 38 */                this.I000OOo1O = iI0001Ioi1lo;
/* 40 */                this.I000OiO = iI0001Ioi1lo;
/* 42 */                int iI00100o1O0lo = I00100o1O0lo(i4);
/* 50 */                int i5 = obj != iOO0o0I1l ? 1 : 0;
/* 57 */                int i6 = (z || obj2 == iOO0o0I1l) ? 0 : 1;
/* 65 */                int iI000O01llI0 = I000O01llI0(iI0001Ioi1lo, this.I000iOII, this.I000l1, this.I0000Il00O.length);
/* 69 */                if (iI000O01llI0 >= 0 && this.I000lI < i4) {
/* 83 */                    iI000O01llI0 = -(((this.I0000Il00O.length - this.I000l1) - iI000O01llI0) + 1);
                        }
/* 84 */                int[] iArr = this.I00000oOI;
/* 86 */                int i7 = this.I001IO000;
/* 88 */                int i8 = iI00100o1O0lo * 5;
/* 90 */                iArr[i8] = i;
/* 102 */               iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
/* 106 */               iArr[i8 + 2] = i7;
/* 110 */               iArr[i8 + 3] = 0;
/* 114 */               iArr[i8 + 4] = iI000O01llI0;
/* 118 */               int i9 = (z ? 1 : 0) + i5 + i6;
/* 119 */               if (i9 > 0) {
/* 121 */                   I001i1O0Ol(i9, i4);
/* 124 */                   Object[] objArr2 = this.I0000Il00O;
/* 126 */                   int i10 = this.I000OOo1O;
/* 128 */                   if (z) {
/* 132 */                       objArr2[i10] = obj2;
/* 130 */                       i10++;
                            }
/* 135 */                   if (i5 != 0) {
/* 139 */                       objArr2[i10] = obj;
/* 137 */                       i10++;
                            }
/* 142 */                   if (i6 != 0) {
/* 146 */                       objArr2[i10] = obj2;
/* 144 */                       i10++;
                            }
/* 149 */                   this.I000OOo1O = i10;
                        }
/* 151 */               this.I000oI1ioi = 0;
/* 153 */               i2 = i4 + 1;
/* 155 */               this.I001IO000 = i4;
/* 157 */               this.I00111O = i2;
/* 159 */               if (i3 >= 0) {
/* 161 */                   I00Iooi00oi(i3);
                        }
                    } else {
/* 167 */               this.I00100l0.I0000Il00O(i3);
/* 182 */               this.I00100o1O0lo.I0000Il00O((I000o00OoI0I() - this.I000O01llI0) - this.I001IIilI0O);
/* 185 */               int i11 = this.I00111O;
/* 187 */               int iI00100o1O0lo2 = I00100o1O0lo(i11);
/* 195 */               if (!O0000Ioio00.I0000O(obj2, iOO0o0I1l)) {
/* 197 */                   if (z) {
/* 201 */                       I00OIo(this.I00111O, obj2);
                            } else {
/* 205 */                       I00OIO1(obj2);
                            }
                        }
/* 214 */               this.I000OOo1O = I00IoiI(this.I00000oOI, iI00100o1O0lo2);
/* 229 */               this.I000OiO = I0001Ioi1lo(this.I00000oOI, I00100o1O0lo(this.I00111O + 1));
/* 231 */               int[] iArr2 = this.I00000oOI;
/* 233 */               int i12 = iI00100o1O0lo2 * 5;
/* 243 */               this.I000oI1ioi = iArr2[i12 + 1] & 67108863;
/* 245 */               this.I001IO000 = i11;
/* 249 */               this.I00111O = i11 + 1;
/* 255 */               i2 = i11 + iArr2[i12 + 3];
                    }
/* 256 */           this.I001IIilI0O = i2;
                }

                public final Ilo1iIi1OI01 I00O10llo(int i) {
                    ArrayList arrayList;
                    int iI0000O;
/* 2 */             if (i < 0 || i >= I000oI1ioi() || (iI0000O = Ol11iOOOoo1.I0000O((arrayList = this.I0000O), i, I000oI1ioi())) < 0) {
/* 1 */                 return null;
                    }
/* 26 */            return (Ilo1iIi1OI01) arrayList.get(iI0000O);
                }

                public final void I00OI1(Object obj) {
/* 3 */             if (this.I000o00OoI0I <= 0 || this.I000OOo1O == this.I000iOII) {
/* 44 */                I00IO1oi11O(obj);
/* 77 */                return;
                    }
/* 11 */            OI0l1oli1I oI0l1oli1I = this.I0010o;
/* 13 */            if (oI0l1oli1I == null) {
/* 17 */                oI0l1oli1I = new OI0l1oli1I();
                    }
/* 20 */            this.I0010o = oI0l1oli1I;
/* 22 */            int i = this.I001IO000;
/* 24 */            Object objI00000oOI = oI0l1oli1I.I00000oOI(i);
/* 28 */            if (objI00000oOI == null) {
/* 32 */                objI00000oOI = new OI0oiiIO0();
/* 35 */                oI0l1oli1I.I000OOo1O(i, objI00000oOI);
                    }
/* 40 */            ((OI0oiiIO0) objI00000oOI).I00000oOI(obj);
                }

                public final void I00OIO1(Object obj) {
/* 3 */             int iI00100o1O0lo = I00100o1O0lo(this.I00111O);
/* 11 */            int i = (iI00100o1O0lo * 5) + 1;
/* 18 */            if ((this.I00000oOI[i] & 268435456) == 0) {
/* 23 */                IOl1II00.I00000oIO("Updating the data of a group that was not created with a data slot");
                    }
/* 26 */            Object[] objArr = this.I0000Il00O;
/* 28 */            int[] iArr = this.I00000oOI;
/* 47 */            objArr[I000II(Integer.bitCount(iArr[i] >> 29) + I0001Ioi1lo(iArr, iI00100o1O0lo))] = obj;
                }

                public final void I00OIl(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 OI0l1iiooO oI0l1iiooO = this.I001i1lo1io;
/* 5 */                 if (oI0l1iiooO == null) {
/* 9 */                     oI0l1iiooO = new OI0l1iiooO();
/* 12 */                    this.I001i1lo1io = oI0l1iiooO;
                        }
/* 14 */                lIIO11.I00000oIO(oI0l1iiooO, i);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00OIo(int i, Object obj) {
                    boolean z;
/* 1 */             int iI00100o1O0lo = I00100o1O0lo(i);
/* 5 */             int[] iArr = this.I00000oOI;
/* 8 */             if (iI00100o1O0lo < iArr.length) {
/* 19 */                z = (iArr[(iI00100o1O0lo * 5) + 1] & 1073741824) != 0;
                    }
/* 23 */            if (!z) {
/* 44 */                IOl1II00.I00000oIO("Updating the node of a group at " + i + " that was not created with as a node group");
                    }
/* 59 */            this.I0000Il00O[I000II(I0001Ioi1lo(this.I00000oOI, iI00100o1O0lo))] = obj;
                }

                public final String toString() {
/* 1 */             int i = this.I00111O;
/* 3 */             int i2 = this.I001IIilI0O;
/* 5 */             int iI000oI1ioi = I000oI1ioi();
/* 9 */             int i3 = this.I000II;
/* 13 */            int i4 = this.I000O01llI0 + i3;
/* 20 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("SlotWriter(current = ", i, " end=", i2, " size = ");
/* 24 */            sbI0010I0i.append(iI000oI1ioi);
/* 29 */            sbI0010I0i.append(" gap=");
/* 32 */            sbI0010I0i.append(i3);
/* 37 */            sbI0010I0i.append("-");
/* 42 */            return IIl001iO0Io.I000lI(i4, ")", sbI0010I0i);
                }
            }

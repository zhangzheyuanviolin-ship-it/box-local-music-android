            package p000;

            import java.util.ArrayList;
            
            public final class Ol11i0 {
                public Ol11i0000Oo I00000oIO;
                public int[] I00000oOI;
                public int I0000Il00O;
                public Object[] I0000O;
                public int I0000oI00;
                public boolean I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public IooOlI11lli I000OiO;
                public int I000iOII;
                public int I000l1;
                public int I000lI;
                public boolean I000o00OoI0I;

                public final Ilo1iIi1OI01 I00000oIO(int i) {
/* 3 */             ArrayList arrayList = this.I00000oIO.I00l0I0l0lO1;
/* 7 */             int iI0000O = Ol11iOOOoo1.I0000O(arrayList, i, this.I0000Il00O);
/* 11 */            if (iI0000O >= 0) {
/* 29 */                return (Ilo1iIi1OI01) arrayList.get(iI0000O);
                    }
/* 15 */            Ilo1iIi1OI01 ilo1iIi1OI01 = new Ilo1iIi1OI01(i);
/* 21 */            arrayList.add(-(iI0000O + 1), ilo1iIi1OI01);
/* 24 */            return ilo1iIi1OI01;
                }

                public final Object I00000oOI(int[] iArr, int i) {
/* 1 */             int i2 = i * 5;
/* 5 */             int i3 = iArr[i2 + 1];
/* 10 */            if ((268435456 & i3) != 0) {
/* 30 */                return this.I0000O[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
                    }
/* 33 */            return IOl11li.I00000oIO;
                }

                public final void I0000Il00O() {
/* 2 */             this.I0001Ioi1lo = true;
/* 8 */             if (this.I00000oIO.I00ilI0I1 <= 0) {
/* 13 */                IOl1II00.I00000oIO("Unexpected reader close()");
                    }
                    r0.I00ilI0I1--;
/* 25 */            this.I0000O = new Object[0];
                }

                public final boolean I0000O(int i) {
                    return (this.I00000oOI[(i * 5) + 1] & 67108864) != 0;
                }

                public final void I0000oI00() {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             int[] iArr = this.I00000oOI;
/* 7 */             if (this.I000iOII == 0) {
/* 20 */                if (!(this.I000II == this.I000O01llI0)) {
/* 24 */                    IOl1II00.I00000oIO("endGroup() not called at the end of a group");
                        }
/* 33 */                int i2 = iArr[(this.I000OOo1O * 5) + 2];
/* 35 */                this.I000OOo1O = i2;
/* 46 */                this.I000O01llI0 = i2 < 0 ? i : Ol11iOOOoo1.I00000oOI(iArr, i2) + i2;
/* 50 */                int iI00000oOI = this.I000OiO.I00000oOI();
/* 54 */                if (iI00000oOI < 0) {
/* 56 */                    this.I000l1 = 0;
/* 58 */                    this.I000lI = 0;
                        } else {
/* 61 */                    this.I000l1 = iI00000oOI;
/* 76 */                    this.I000lI = i2 >= i - 1 ? this.I0000oI00 : iArr[((i2 + 1) * 5) + 4];
                        }
                    }
                }

                public final Object I0001Ioi1lo() {
/* 1 */             int i = this.I000II;
/* 5 */             if (i < this.I000O01llI0) {
/* 9 */                 return I00000oOI(this.I00000oOI, i);
                    }
/* 15 */            return 0;
                }

                public final int I000II() {
/* 1 */             int i = this.I000II;
/* 5 */             if (i < this.I000O01llI0) {
/* 11 */                return this.I00000oOI[i * 5];
                    }
/* 14 */            return 0;
                }

                public final Object I000O01llI0(int i, int i2) {
/* 1 */             int[] iArr = this.I00000oOI;
/* 3 */             int iI0000oI00 = Ol11iOOOoo1.I0000oI00(iArr, i);
/* 7 */             int i3 = i + 1;
/* 22 */            int i4 = iI0000oI00 + i2;
                    return i4 < (i3 < this.I0000Il00O ? iArr[(i3 * 5) + 4] : this.I0000oI00) ? this.I0000O[i4] : IOl11li.I00000oIO;
                }

                public final int I000OOo1O(int i) {
/* 5 */             return this.I00000oOI[i * 5];
                }

                public final boolean I000OiO(int i) {
                    return (this.I00000oOI[(i * 5) + 1] & 134217728) != 0;
                }

                public final boolean I000iOII(int i) {
                    return (this.I00000oOI[(i * 5) + 1] & 536870912) != 0;
                }

                public final boolean I000l1(int i) {
                    return (this.I00000oOI[(i * 5) + 1] & 1073741824) != 0;
                }

                public final Object I000lI() {
                    int i;
/* 3 */             if (this.I000iOII > 0 || (i = this.I000l1) >= this.I000lI) {
/* 25 */                this.I000o00OoI0I = false;
/* 27 */                return IOl11li.I00000oIO;
                    }
/* 13 */            this.I000o00OoI0I = true;
/* 15 */            Object[] objArr = this.I0000O;
/* 19 */            this.I000l1 = i + 1;
/* 21 */            return objArr[i];
                }

                public final Object I000o00OoI0I(int i) {
/* 1 */             int[] iArr = this.I00000oOI;
/* 3 */             int i2 = i * 5;
/* 11 */            int i3 = iArr[i2 + 1] & 1073741824;
/* 12 */            if (i3 != 0) {
                        return i3 != 0 ? this.I0000O[iArr[i2 + 4]] : IOl11li.I00000oIO;
                    }
/* 28 */            return null;
                }

                public final int I000oI1ioi(int i) {
/* 12 */            return this.I00000oOI[(i * 5) + 1] & 67108863;
                }

                public final Object I00100l0(int[] iArr, int i) {
/* 1 */             int i2 = i * 5;
/* 5 */             int i3 = iArr[i2 + 1];
/* 10 */            if ((536870912 & i3) == 0) {
/* 28 */                return null;
                    }
/* 25 */            return this.I0000O[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
                }

                public final int I00100o1O0lo(int i) {
/* 7 */             return this.I00000oOI[(i * 5) + 2];
                }

                public final void I0010I0i(int i) {
/* 1 */             int[] iArr = this.I00000oOI;
/* 11 */            if (!(this.I000iOII == 0)) {
/* 15 */                IOl1II00.I00000oIO("Cannot reposition while in an empty region");
                    }
/* 18 */            this.I000II = i;
/* 20 */            int i2 = this.I0000Il00O;
/* 31 */            int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
/* 34 */            if (i3 != this.I000OOo1O) {
/* 36 */                this.I000OOo1O = i3;
/* 38 */                if (i3 < 0) {
/* 40 */                    this.I000O01llI0 = i2;
                        } else {
/* 48 */                    this.I000O01llI0 = Ol11iOOOoo1.I00000oOI(iArr, i3) + i3;
                        }
/* 50 */                this.I000l1 = 0;
/* 52 */                this.I000lI = 0;
                    }
                }

                public final int I0010o() {
/* 9 */             if (!(this.I000iOII == 0)) {
/* 13 */                IOl1II00.I00000oIO("Cannot skip while in an empty region");
                    }
/* 16 */            int[] iArr = this.I00000oOI;
/* 18 */            int i = this.I000II;
/* 39 */            int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
/* 45 */            this.I000II = Ol11iOOOoo1.I00000oOI(iArr, i) + i;
/* 55 */            return i2;
                }

                public final void I00111O() {
/* 9 */             if (!(this.I000iOII == 0)) {
/* 13 */                IOl1II00.I00000oIO("Cannot skip the enclosing group while in an empty region");
                    }
/* 18 */            this.I000II = this.I000O01llI0;
/* 20 */            this.I000l1 = 0;
/* 22 */            this.I000lI = 0;
                }

                public final void I001IIilI0O() {
/* 1 */             int[] iArr = this.I00000oOI;
/* 5 */             if (this.I000iOII <= 0) {
/* 7 */                 int i = this.I000OOo1O;
/* 9 */                 int i2 = this.I000II;
/* 17 */                if (iArr[(i2 * 5) + 2] != i) {
/* 22 */                    OO1oio00IO.I00000oIO("Invalid slot table detected");
                        }
/* 25 */                IooOlI11lli iooOlI11lli = this.I000OiO;
/* 27 */                int i3 = this.I000l1;
/* 29 */                int i4 = this.I000lI;
/* 31 */                if (i3 == 0 && i4 == 0) {
/* 36 */                    iooOlI11lli.I0000Il00O(-1);
                        } else {
/* 40 */                    iooOlI11lli.I0000Il00O(i3);
                        }
/* 43 */                this.I000OOo1O = i2;
/* 50 */                this.I000O01llI0 = Ol11iOOOoo1.I00000oOI(iArr, i2) + i2;
/* 52 */                int i5 = i2 + 1;
/* 54 */                this.I000II = i5;
/* 60 */                this.I000l1 = Ol11iOOOoo1.I0000oI00(iArr, i2);
/* 77 */                this.I000lI = i2 >= this.I0000Il00O + (-1) ? this.I0000oI00 : iArr[(i5 * 5) + 4];
                    }
                }

                public final String toString() {
/* 1 */             int i = this.I000II;
/* 3 */             int iI000II = I000II();
/* 7 */             int i2 = this.I000OOo1O;
/* 9 */             int i3 = this.I000O01llI0;
/* 17 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("SlotReader(current=", i, ", key=", iI000II, ", parent=");
/* 21 */            sbI0010I0i.append(i2);
/* 26 */            sbI0010I0i.append(", end=");
/* 29 */            sbI0010I0i.append(i3);
/* 34 */            sbI0010I0i.append(")");
/* 37 */            return sbI0010I0i.toString();
                }
            }

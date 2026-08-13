            package p000;

            import java.util.ArrayList;
            
            public final class IOl11o0IIoI {
                public IloI0lOlll1 I00000oIO;
                public IO0ooOiO0OOo I00000oOI;
                public boolean I0000Il00O;
                public IooOlI11lli I0000O;
                public boolean I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public ArrayList I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;
                public int I000l1;

                public final void I00000oIO() {
/* 1 */             I0000Il00O();
/* 4 */             ArrayList arrayList = this.I000O01llI0;
/* 10 */            if (arrayList.isEmpty()) {
                        this.I000II++;
                    } else {
/* 18 */                arrayList.remove(arrayList.size() - 1);
                    }
                }

                public final void I00000oOI() {
/* 1 */             ArrayList arrayList = this.I000O01llI0;
/* 3 */             int i = this.I000II;
/* 6 */             if (i > 0) {
/* 10 */                OIii0IO oIii0IO = this.I00000oOI.I00000oIO;
/* 14 */                oIii0IO.I0000O(OIiOlll11.I0000O);
/* 32 */                oIii0IO.I0000Il00O[oIii0IO.I0000O - oIii0IO.I00000oIO[oIii0IO.I00000oOI - 1].I00000oOI] = i;
/* 34 */                this.I000II = 0;
                    }
/* 40 */            if (arrayList.isEmpty()) {
/* 110 */               return;
                    }
/* 42 */            IO0ooOiO0OOo iO0ooOiO0OOo = this.I00000oOI;
/* 44 */            int size = arrayList.size();
/* 48 */            Object[] objArr = new Object[size];
/* 51 */            for (int i2 = 0; i2 < size; i2++) {
/* 57 */                objArr[i2] = arrayList.get(i2);
                    }
/* 62 */            iO0ooOiO0OOo.getClass();
/* 65 */            if (size != 0) {
/* 68 */                OIii0IO oIii0IO2 = iO0ooOiO0OOo.I00000oIO;
/* 72 */                oIii0IO2.I0000O(OIiII10l1l1.I0000O);
/* 75 */                l1lI1iI.I00000oIO(oIii0IO2, 0, objArr);
                    }
/* 78 */            arrayList.clear();
                }

                public final void I0000Il00O() {
/* 1 */             int i = this.I000l1;
/* 3 */             if (i > 0) {
/* 5 */                 int i2 = this.I000OOo1O;
/* 8 */                 if (i2 >= 0) {
/* 10 */                    I00000oOI();
/* 15 */                    OIii0IO oIii0IO = this.I00000oOI.I00000oIO;
/* 19 */                    oIii0IO.I0000O(OIiO0I101.I0000O);
/* 34 */                    int i3 = oIii0IO.I0000O - oIii0IO.I00000oIO[oIii0IO.I00000oOI - 1].I00000oOI;
/* 35 */                    int[] iArr = oIii0IO.I0000Il00O;
/* 37 */                    iArr[i3] = i2;
/* 41 */                    iArr[i3 + 1] = i;
/* 43 */                    this.I000OOo1O = -1;
                        } else {
/* 46 */                    int i4 = this.I000iOII;
/* 48 */                    int i5 = this.I000OiO;
/* 50 */                    I00000oOI();
/* 55 */                    OIii0IO oIii0IO2 = this.I00000oOI.I00000oIO;
/* 59 */                    oIii0IO2.I0000O(OIiIiiio.I0000O);
/* 74 */                    int i6 = oIii0IO2.I0000O - oIii0IO2.I00000oIO[oIii0IO2.I00000oOI - 1].I00000oOI;
/* 75 */                    int[] iArr2 = oIii0IO2.I0000Il00O;
/* 79 */                    iArr2[i6 + 1] = i4;
/* 81 */                    iArr2[i6] = i5;
/* 85 */                    iArr2[i6 + 2] = i;
/* 87 */                    this.I000OiO = -1;
/* 89 */                    this.I000iOII = -1;
                        }
/* 92 */                this.I000l1 = 0;
                    }
                }

                public final void I0000O(boolean z) {
/* 3 */             Ol11i0 ol11i0 = this.I00000oIO.I00IO1oi11O;
/* 10 */            int i = z ? ol11i0.I000OOo1O : ol11i0.I000II;
/* 14 */            int i2 = i - this.I0001Ioi1lo;
/* 16 */            if (i2 < 0) {
/* 21 */                IOl1II00.I00000oIO("Tried to seek backward");
                    }
/* 24 */            if (i2 > 0) {
/* 28 */                OIii0IO oIii0IO = this.I00000oOI.I00000oIO;
/* 32 */                oIii0IO.I0000O(OIi1iiOIOoo.I0000O);
/* 50 */                oIii0IO.I0000Il00O[oIii0IO.I0000O - oIii0IO.I00000oIO[oIii0IO.I00000oOI - 1].I00000oOI] = i2;
/* 52 */                this.I0001Ioi1lo = i;
                    }
                }

                public final void I0000oI00() {
                    int i;
/* 1 */             IooOlI11lli iooOlI11lli = this.I0000O;
/* 5 */             Ol11i0 ol11i0 = this.I00000oIO.I00IO1oi11O;
/* 9 */             if (ol11i0.I0000Il00O <= 0 || iooOlI11lli.I00000oIO(-2) == (i = ol11i0.I000OOo1O)) {
/* 110 */               return;
                    }
/* 24 */            if (!this.I0000Il00O && this.I0000oI00) {
/* 30 */                I0000O(false);
/* 39 */                this.I00000oOI.I00000oIO.I0000O(OIiIIlo0iili.I0000O);
/* 42 */                this.I0000Il00O = true;
                    }
/* 44 */            if (i > 0) {
/* 46 */                Ilo1iIi1OI01 ilo1iIi1OI01I00000oIO = ol11i0.I00000oIO(i);
/* 50 */                iooOlI11lli.I0000Il00O(i);
/* 53 */                I0000O(false);
/* 58 */                OIii0IO oIii0IO = this.I00000oOI.I00000oIO;
/* 62 */                oIii0IO.I0000O(OIiIIli.I0000O);
/* 65 */                l1lI1iI.I00000oIO(oIii0IO, 0, ilo1iIi1OI01I00000oIO);
/* 68 */                this.I0000Il00O = true;
                    }
                }

                public final void I0001Ioi1lo(int i, int i2) {
/* 1 */             if (i2 > 0) {
/* 8 */                 if (!(i >= 0)) {
/* 24 */                    IOl1II00.I00000oIO("Invalid remove index " + i);
                        }
/* 29 */                if (this.I000OOo1O == i) {
                            this.I000l1 += i2;
/* 36 */                    return;
                        }
/* 37 */                I0000Il00O();
/* 40 */                this.I000OOo1O = i;
/* 42 */                this.I000l1 = i2;
                    }
                }
            }

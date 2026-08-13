            package p000;

            import android.graphics.Point;
            import android.graphics.Rect;
            import android.os.Build;
            import android.view.Display;
            import android.view.DisplayCutout;
            import android.view.View;
            import android.view.WindowInsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            
/* 18 */    public class i00OOi extends i00i1I1 {
                public final WindowInsets I0000Il00O;
                public Ioo0l0I[] I0000O;
                public Ioo0l0I I0000oI00;
                public i00iooo00li I0001Ioi1lo;
                public Ioo0l0I I000II;
                public int I000O01llI0;
                public IiiIoi1O0 I000OOo1O;
                public int I000OiO;
                public int I000iOII;
                public Rect[][] I000l1;
                public Rect[][] I000lI;

                public i00OOi(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 1 */             super(i00iooo00liVar);
/* 5 */             this.I0000oI00 = null;
/* 11 */            this.I000l1 = new Rect[10][];
/* 15 */            this.I000lI = new Rect[10][];
/* 17 */            this.I0000Il00O = windowInsets;
                }

                private IiiIoi1O0 I001lloI(View view) {
                    Display display;
/* 2 */             if (view == null || (display = view.getDisplay()) == null) {
/* 1 */                 return null;
                    }
/* 14 */            Point point = new Point();
/* 17 */            display.getRealSize(point);
/* 28 */            if (this.I00000oIO.I00000oIO.I00111O()) {
/* 39 */                return IiiIoi1O0.I00000oIO(point.x, point.y, true, 0, 0, 0, 0);
                    }
/* 45 */            OiI10iIOOol0 oiI10iIOOol0I00000oIO = il1i1IilIol.I00000oIO(display, 0);
/* 50 */            OiI10iIOOol0 oiI10iIOOol0I00000oIO2 = il1i1IilIol.I00000oIO(display, 1);
/* 55 */            OiI10iIOOol0 oiI10iIOOol0I00000oIO3 = il1i1IilIol.I00000oIO(display, 2);
/* 60 */            OiI10iIOOol0 oiI10iIOOol0I00000oIO4 = il1i1IilIol.I00000oIO(display, 3);
/* 95 */            return IiiIoi1O0.I00000oIO(point.x, point.y, false, oiI10iIOOol0I00000oIO != null ? oiI10iIOOol0I00000oIO.I00000oOI : 0, oiI10iIOOol0I00000oIO2 != null ? oiI10iIOOol0I00000oIO2.I00000oOI : 0, oiI10iIOOol0I00000oIO3 != null ? oiI10iIOOol0I00000oIO3.I00000oOI : 0, oiI10iIOOol0I00000oIO4 != null ? oiI10iIOOol0I00000oIO4.I00000oOI : 0);
                }

                private static List<Rect> I00II0Ol1O0l(Rect[][] rectArr, int i) {
                    Rect[] rectArr2;
/* 1 */             Rect[] rectArr3 = null;
/* 5 */             for (int i2 = 1; i2 <= 512; i2 <<= 1) {
/* 9 */                 if ((i & i2) != 0 && (rectArr2 = rectArr[liIIiioO.I00000oIO(i2)]) != null) {
/* 21 */                    if (rectArr3 == null) {
/* 23 */                        rectArr3 = rectArr2;
                            } else {
/* 28 */                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
/* 32 */                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
/* 37 */                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
/* 40 */                        rectArr3 = rectArr4;
                            }
                        }
                    }
                    return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
                }

                private Rect[] I00II0oii1o(Ioo0l0I ioo0l0I) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int i = ioo0l0I.I00000oIO;
/* 8 */             int i2 = ioo0l0I.I0000O;
/* 10 */            int i3 = ioo0l0I.I0000Il00O;
/* 12 */            int i4 = ioo0l0I.I00000oOI;
/* 15 */            if (i != 0) {
/* 26 */                arrayList.add(new Rect(0, 0, ioo0l0I.I00000oIO, this.I000OiO));
                    }
/* 29 */            if (i4 != 0) {
/* 38 */                arrayList.add(new Rect(0, 0, this.I000iOII, i4));
                    }
/* 41 */            if (i3 != 0) {
/* 45 */                int i5 = this.I000iOII;
/* 54 */                arrayList.add(new Rect(i5 - i3, 0, i5, this.I000OiO));
                    }
/* 57 */            if (i2 != 0) {
/* 61 */                int i6 = this.I000OiO;
/* 70 */                arrayList.add(new Rect(0, i6 - i2, this.I000iOII, i6));
                    }
/* 83 */            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
                }

                private Ioo0l0I I00IO1(int i, boolean z) {
/* 1 */             Ioo0l0I ioo0l0II00000oIO = Ioo0l0I.I0000oI00;
/* 6 */             for (int i2 = 1; i2 <= 512; i2 <<= 1) {
/* 10 */                if ((i & i2) != 0) {
/* 13 */                    Ioo0l0I ioo0l0II00IO1oi11O = I00IO1oi11O(i2, z);
/* 49 */                    ioo0l0II00000oIO = Ioo0l0I.I00000oIO(Math.max(ioo0l0II00000oIO.I00000oIO, ioo0l0II00IO1oi11O.I00000oIO), Math.max(ioo0l0II00000oIO.I00000oOI, ioo0l0II00IO1oi11O.I00000oOI), Math.max(ioo0l0II00000oIO.I0000Il00O, ioo0l0II00IO1oi11O.I0000Il00O), Math.max(ioo0l0II00000oIO.I0000O, ioo0l0II00IO1oi11O.I0000O));
                        }
                    }
/* 106 */           return ioo0l0II00000oIO;
                }

                private Ioo0l0I I00IOO() {
/* 1 */             i00iooo00li i00iooo00liVar = this.I0001Ioi1lo;
                    return i00iooo00liVar != null ? i00iooo00liVar.I00000oIO.I000l1() : Ioo0l0I.I0000oI00;
                }

                private Ioo0l0I I00IioO0OiOi(View view) {
/* 29 */            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                }

                public static boolean I00Io1lO(int i, int i2) {
                    return (i & 6) == (i2 & 6);
                }

                @Override
                public void I0000O(View view) {
/* 5 */             this.I000iOII = view.getWidth();
/* 11 */            this.I000OiO = view.getHeight();
/* 13 */            Ioo0l0I ioo0l0II00IioO0OiOi = I00IioO0OiOi(view);
/* 17 */            if (ioo0l0II00IioO0OiOi == null) {
/* 19 */                ioo0l0II00IioO0OiOi = Ioo0l0I.I0000oI00;
                    }
/* 21 */            I001i1lo1io(ioo0l0II00IioO0OiOi);
                }

                @Override
                public void I0000oI00(i00iooo00li i00iooo00liVar) {
/* 5 */             i00iooo00liVar.I00000oIO.I001iOo1i0O(this.I0001Ioi1lo);
/* 8 */             Ioo0l0I ioo0l0I = this.I000II;
/* 10 */            i00i1I1 i00i1i1 = i00iooo00liVar.I00000oIO;
/* 12 */            i00i1i1.I001i1lo1io(ioo0l0I);
/* 17 */            i00i1i1.I001l0I00(this.I000O01llI0);
/* 22 */            i00i1i1.I001IO000(this.I000OOo1O);
/* 27 */            i00i1i1.I001lIiIIo1O(this.I000l1);
/* 32 */            i00i1i1.I001lllioOl(this.I000lI);
                }

                @Override
                public List<Rect> I0001Ioi1lo(int i) {
/* 3 */             return I00II0Ol1O0l(this.I000l1, i);
                }

                @Override
                public List<Rect> I000II(int i) {
/* 3 */             return I00II0Ol1O0l(this.I000lI, i);
                }

                @Override
                public Ioo0l0I I000OOo1O(int i) {
/* 2 */             return I00IO1(i, false);
                }

                @Override
                public Ioo0l0I I000OiO(int i) {
/* 2 */             return I00IO1(i, true);
                }

                @Override
                public final Ioo0l0I I000o00OoI0I() {
/* 1 */             Ioo0l0I ioo0l0I = this.I0000oI00;
/* 3 */             if (ioo0l0I != null) {
/* 55 */                return ioo0l0I;
                    }
/* 5 */             WindowInsets windowInsets = this.I0000Il00O;
/* 23 */            Ioo0l0I ioo0l0II00000oIO = Ioo0l0I.I00000oIO(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
/* 27 */            this.I0000oI00 = ioo0l0II00000oIO;
/* 55 */            return ioo0l0II00000oIO;
                }

                @Override
                public void I00100l0(View view) {
/* 5 */             this.I000OOo1O = I001lloI(view);
                }

                @Override
                public void I00100o1O0lo() {
/* 4 */             for (int i = 1; i <= 512; i <<= 1) {
/* 6 */                 int iI00000oIO = liIIiioO.I00000oIO(i);
/* 20 */                this.I000l1[iI00000oIO] = I00II0oii1o(I000OOo1O(i));
/* 24 */                if (i != 8) {
/* 36 */                    this.I000lI[iI00000oIO] = I00II0oii1o(I000OiO(i));
                        }
                    }
                }

                @Override
                public i00iooo00li I0010I0i(int i, int i2, int i3, int i4) {
/* 4 */             i00iooo00li i00iooo00liVarI0000Il00O = i00iooo00li.I0000Il00O(null, this.I0000Il00O);
/* 8 */             int i5 = Build.VERSION.SDK_INT;
/* 32 */            i00OOOOi i00ooo1lo = i5 >= 36 ? new i00OOO1lo(i00iooo00liVarI0000Il00O) : i5 >= 35 ? new i00OIoI(i00iooo00liVarI0000Il00O) : new i00OIl1Io1(i00iooo00liVarI0000Il00O);
/* 43 */            i00ooo1lo.I0000oI00(i00iooo00li.I00000oIO(I000o00OoI0I(), i, i2, i3, i4));
/* 54 */            i00ooo1lo.I0000O(i00iooo00li.I00000oIO(I000l1(), i, i2, i3, i4));
/* 57 */            return i00ooo1lo.I00000oOI();
                }

                @Override
                public boolean I00111O() {
/* 3 */             return this.I0000Il00O.isRound();
                }

                @Override
                public boolean I001IIilI0O(int i) {
/* 5 */             for (int i2 = 1; i2 <= 512; i2 <<= 1) {
/* 9 */                 if ((i & i2) != 0 && !I00IlilI0i0i(i2)) {
/* 18 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public void I001IO000(IiiIoi1O0 iiiIoi1O0) {
/* 1 */             this.I000OOo1O = iiiIoi1O0;
                }

                @Override
                public void I001i1O0Ol(Ioo0l0I[] ioo0l0IArr) {
/* 1 */             this.I0000O = ioo0l0IArr;
                }

                @Override
                public void I001i1lo1io(Ioo0l0I ioo0l0I) {
/* 1 */             this.I000II = ioo0l0I;
                }

                @Override
                public void I001iOo1i0O(i00iooo00li i00iooo00liVar) {
/* 1 */             this.I0001Ioi1lo = i00iooo00liVar;
                }

                @Override
                public void I001l0I00(int i) {
/* 1 */             this.I000O01llI0 = i;
                }

                @Override
                public void I001lIiIIo1O(Rect[][] rectArr) {
/* 1 */             Objects.requireNonNull(rectArr);
/* 10 */            this.I000l1 = (Rect[][]) rectArr.clone();
                }

                @Override
                public void I001lllioOl(Rect[][] rectArr) {
/* 1 */             Objects.requireNonNull(rectArr);
/* 10 */            this.I000lI = (Rect[][]) rectArr.clone();
                }

                public Ioo0l0I I00IO1oi11O(int i, boolean z) {
                    Ioo0l0I ioo0l0II000l1;
                    int i2;
/* 2 */             Ioo0l0I ioo0l0I = Ioo0l0I.I0000oI00;
/* 5 */             if (i != 1) {
/* 9 */                 if (i != 2) {
/* 13 */                    if (i == 8) {
/* 88 */                        Ioo0l0I[] ioo0l0IArr = this.I0000O;
/* 96 */                        ioo0l0II000l1 = ioo0l0IArr != null ? ioo0l0IArr[liIIiioO.I00000oIO(8)] : null;
/* 98 */                        if (ioo0l0II000l1 != null) {
/* 100 */                           return ioo0l0II000l1;
                                }
/* 101 */                       Ioo0l0I ioo0l0II000o00OoI0I = I000o00OoI0I();
/* 105 */                       Ioo0l0I ioo0l0II00IOO = I00IOO();
/* 109 */                       int i3 = ioo0l0II000o00OoI0I.I0000O;
/* 113 */                       if (i3 > ioo0l0II00IOO.I0000O) {
/* 115 */                           return Ioo0l0I.I00000oIO(0, 0, 0, i3);
                                }
/* 120 */                       Ioo0l0I ioo0l0I2 = this.I000II;
/* 122 */                       if (ioo0l0I2 != null && !ioo0l0I2.equals(ioo0l0I) && (i2 = this.I000II.I0000O) > ioo0l0II00IOO.I0000O) {
/* 138 */                           return Ioo0l0I.I00000oIO(0, 0, 0, i2);
                                }
                            } else {
/* 17 */                        if (i == 16) {
/* 83 */                            return I000lI();
                                }
/* 21 */                        if (i == 32) {
/* 78 */                            return I000iOII();
                                }
/* 25 */                        if (i == 64) {
/* 73 */                            return I000oI1ioi();
                                }
/* 29 */                        if (i == 128) {
/* 33 */                            i00iooo00li i00iooo00liVar = this.I0001Ioi1lo;
/* 44 */                            IiiIlIlO iiiIlIlOI000O01llI0 = i00iooo00liVar != null ? i00iooo00liVar.I00000oIO.I000O01llI0() : I000O01llI0();
/* 48 */                            if (iiiIlIlOI000O01llI0 != null) {
/* 50 */                                DisplayCutout displayCutout = iiiIlIlOI000O01llI0.I00000oIO;
/* 68 */                                return Ioo0l0I.I00000oIO(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                    }
                                }
                            }
                        } else {
/* 143 */                   if (z) {
/* 145 */                       Ioo0l0I ioo0l0II00IOO2 = I00IOO();
/* 149 */                       Ioo0l0I ioo0l0II000l12 = I000l1();
/* 177 */                       return Ioo0l0I.I00000oIO(Math.max(ioo0l0II00IOO2.I00000oIO, ioo0l0II000l12.I00000oIO), 0, Math.max(ioo0l0II00IOO2.I0000Il00O, ioo0l0II000l12.I0000Il00O), Math.max(ioo0l0II00IOO2.I0000O, ioo0l0II000l12.I0000O));
                            }
/* 185 */                   if ((this.I000O01llI0 & 2) == 0) {
/* 188 */                       Ioo0l0I ioo0l0II000o00OoI0I2 = I000o00OoI0I();
/* 192 */                       i00iooo00li i00iooo00liVar2 = this.I0001Ioi1lo;
/* 198 */                       ioo0l0II000l1 = i00iooo00liVar2 != null ? i00iooo00liVar2.I00000oIO.I000l1() : null;
/* 202 */                       int iMin = ioo0l0II000o00OoI0I2.I0000O;
/* 204 */                       if (ioo0l0II000l1 != null) {
/* 208 */                           iMin = Math.min(iMin, ioo0l0II000l1.I0000O);
                                }
/* 216 */                       return Ioo0l0I.I00000oIO(ioo0l0II000o00OoI0I2.I00000oIO, 0, ioo0l0II000o00OoI0I2.I0000Il00O, iMin);
                            }
                        }
                    } else {
/* 221 */               if (z) {
/* 239 */                   return Ioo0l0I.I00000oIO(0, Math.max(I00IOO().I00000oOI, I000o00OoI0I().I00000oOI), 0, 0);
                        }
/* 248 */               if ((this.I000O01llI0 & 4) == 0) {
/* 257 */                   return Ioo0l0I.I00000oIO(0, I000o00OoI0I().I00000oOI, 0, 0);
                        }
                    }
/* 250 */           return ioo0l0I;
                }

                public boolean I00IlilI0i0i(int i) {
/* 3 */             if (i != 1 && i != 2) {
/* 9 */                 if (i == 4) {
/* 1 */                     return false;
                        }
/* 13 */                if (i != 8 && i != 128) {
/* 2 */                     return true;
                        }
                    }
/* 31 */            return !I00IO1oi11O(i, false).equals(Ioo0l0I.I0000oI00);
                }

                @Override
                public boolean equals(Object obj) {
/* 6 */             if (!super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 9 */             i00OOi i00ooi = (i00OOi) obj;
                    return Objects.equals(this.I000II, i00ooi.I000II) && I00Io1lO(this.I000O01llI0, i00ooi.I000O01llI0);
                }

/* 19 */        public i00OOi(i00iooo00li i00iooo00liVar, i00OOi i00ooi) {
/* 20 */            this(i00iooo00liVar, new WindowInsets(i00ooi.I0000Il00O));
                }
            }

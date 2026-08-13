            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public final class OO100II1 extends I01Io000 implements Collection, O0IlOIOIoOI {
                public I01Io11IiiiO I00iOIl;
                public Object[] I00iiI;
                public Object[] I00iiO;
                public int I00iio;
                public lOOlOoll I00ilI0I1 = new lOOlOoll(13);
                public Object[] I00ilO0;
                public Object[] I00io1l;
                public int I00ioIO;

                public OO100II1(I01Io11IiiiO i01Io11IiiiO, Object[] objArr, Object[] objArr2, int i) {
/* 4 */             this.I00iOIl = i01Io11IiiiO;
/* 6 */             this.I00iiI = objArr;
/* 8 */             this.I00iiO = objArr2;
/* 10 */            this.I00iio = i;
/* 21 */            this.I00ilO0 = objArr;
/* 23 */            this.I00io1l = objArr2;
/* 29 */            this.I00ioIO = i01Io11IiiiO.I00000oOI();
                }

                public static void I000OiO(Object[] objArr, int i, Iterator it) {
/* 3 */             while (i < 32 && it.hasNext()) {
/* 17 */                objArr[i] = it.next();
/* 11 */                i++;
                    }
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public final Object I0000O(int i) {
/* 5 */             l10ioi0.I00000oIO(i, I00000oOI());
                    ((AbstractList) this).modCount++;
/* 14 */            int iI00IoIO0lI = I00IoIO0lI();
/* 18 */            if (i >= iI00IoIO0lI) {
/* 25 */                return I00Io1o110i(iI00IoIO0lI, this.I00iio, i - iI00IoIO0lI, this.I00ilO0);
                    }
/* 37 */            IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(this.I00io1l[0]);
/* 50 */            I00Io1o110i(iI00IoIO0lI, this.I00iio, 0, I00Io1lO(this.I00ilO0, this.I00iio, i, iooiOoO1I1iO));
/* 53 */            return iooiOoO1I1iO.I00000oIO;
                }

                public final I01Io11IiiiO I000OOo1O() {
                    I01Io11IiiiO ol1Iil;
/* 1 */             Object[] objArr = this.I00ilO0;
/* 5 */             if (objArr == this.I00iiI && this.I00io1l == this.I00iiO) {
/* 13 */                ol1Iil = this.I00iOIl;
                    } else {
/* 23 */                this.I00ilI0I1 = new lOOlOoll(13);
/* 25 */                this.I00iiI = objArr;
/* 27 */                Object[] objArr2 = this.I00io1l;
/* 29 */                this.I00iiO = objArr2;
/* 57 */                ol1Iil = objArr == null ? objArr2.length == 0 ? Ol1Iil.I00iiI : new Ol1Iil(Arrays.copyOf(objArr2, this.I00ioIO)) : new OO0oo1iO1lio(objArr, objArr2, this.I00ioIO, this.I00iio);
                    }
/* 61 */            this.I00iOIl = ol1Iil;
/* 110 */           return ol1Iil;
                }

                public final int I000iOII() {
/* 1 */             return ((AbstractList) this).modCount;
                }

                public final void I000lI(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
/* 3 */             if (this.I00ilO0 == null) {
/* 83 */                I000II.I001IO000("root is null");
/* 685 */               return;
                    }
/* 5 */             int i4 = i >> 5;
/* 13 */            I01IO1il i01IO1ilI0010I0i = I0010I0i(I00IoIO0lI() >> 5);
/* 17 */            int i5 = i3;
/* 18 */            Object[] objArrI00111O = objArr2;
/* 23 */            while (i01IO1ilI0010I0i.I00iOIl - 1 != i4) {
/* 29 */                Object[] objArr3 = (Object[]) i01IO1ilI0010I0i.previous();
/* 36 */                I1IoiO1l.I000iOII(objArr3, 0, objArrI00111O, 32 - i2, 32);
/* 39 */                objArrI00111O = I00111O(i2, objArr3);
                        i5--;
/* 45 */                objArr[i5] = objArrI00111O;
                    }
/* 53 */            Object[] objArr4 = (Object[]) i01IO1ilI0010I0i.previous();
/* 64 */            int iI00IoIO0lI = i3 - (((I00IoIO0lI() >> 5) - 1) - i4);
/* 66 */            if (iI00IoIO0lI < i3) {
/* 68 */                objArr2 = objArr[iI00IoIO0lI];
                    }
/* 77 */            I00Iooi00oi(collection, i, objArr4, 32, objArr, iI00IoIO0lI, objArr2);
                }

                public final Object[] I000o00OoI0I(Object[] objArr, int i, int i2, Object obj, IooiOoO1I1iO iooiOoO1I1iO) {
                    Object obj2;
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 5 */             if (i == 0) {
/* 11 */                iooiOoO1I1iO.I00000oIO = objArr[31];
/* 13 */                Object[] objArrI0010o = I0010o(objArr);
/* 21 */                System.arraycopy(objArr, iI00000oIO, objArrI0010o, iI00000oIO + 1, 31 - iI00000oIO);
/* 24 */                objArrI0010o[iI00000oIO] = obj;
/* 26 */                return objArrI0010o;
                    }
/* 27 */            Object[] objArrI0010o2 = I0010o(objArr);
                    int i3 = i - 5;
/* 46 */            objArrI0010o2[iI00000oIO] = I000o00OoI0I((Object[]) objArrI0010o2[iI00000oIO], i3, i2, obj, iooiOoO1I1iO);
                    while (true) {
/* 48 */                iI00000oIO++;
/* 52 */                if (iI00000oIO >= 32 || (obj2 = objArrI0010o2[iI00000oIO]) == null) {
                            break;
                        }
/* 68 */                objArrI0010o2[iI00000oIO] = I000o00OoI0I((Object[]) obj2, i3, 0, iooiOoO1I1iO.I00000oIO, iooiOoO1I1iO);
                    }
/* 399 */           return objArrI0010o2;
                }

                public final void I000oI1ioi(Object obj, Object[] objArr, int i) {
/* 1 */             int iI00O0i0ii = I00O0i0ii();
/* 7 */             Object[] objArrI0010o = I0010o(this.I00io1l);
/* 11 */            Object[] objArr2 = this.I00io1l;
/* 15 */            if (iI00O0i0ii >= 32) {
/* 37 */                Object obj2 = objArr2[31];
/* 41 */                I1IoiO1l.I000iOII(objArr2, i + 1, objArrI0010o, i, 31);
/* 44 */                objArrI0010o[i] = obj;
/* 50 */                I00II0Ol1O0l(objArr, objArrI0010o, I001IO000(obj2));
/* 98 */                return;
                    }
/* 19 */            I1IoiO1l.I000iOII(objArr2, i + 1, objArrI0010o, i, iI00O0i0ii);
/* 22 */            objArrI0010o[i] = obj;
/* 24 */            this.I00ilO0 = objArr;
/* 26 */            this.I00io1l = objArrI0010o;
                    this.I00ioIO++;
                }

                public final boolean I00100o1O0lo(Object[] objArr) {
                    return objArr.length == 33 && objArr[32] == this.I00ilI0I1;
                }

                public final I01IO1il I0010I0i(int i) {
/* 1 */             Object[] objArr = this.I00ilO0;
/* 3 */             if (objArr == null) {
/* 40 */                I000II.I001IO000("Invalid root");
/* 43 */                return null;
                    }
/* 9 */             int iI00IoIO0lI = I00IoIO0lI() >> 5;
/* 11 */            l10ioi0.I00000oOI(i, iI00IoIO0lI);
/* 14 */            int i2 = this.I00iio;
/* 16 */            if (i2 != 0) {
/* 34 */                return new OoIi1IlIOOI(i, iI00IoIO0lI, i2 / 5, objArr);
                    }
/* 20 */            int i3 = 1;
/* 21 */            IIII0IoOO iIII0IoOO = new IIII0IoOO(i, i3, i3);
/* 24 */            iIII0IoOO.I00iio = objArr;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            return iIII0IoOO;
                }

                public final Object[] I0010o(Object[] objArr) {
/* 1 */             if (objArr == null) {
/* 3 */                 return I001IIilI0O();
                    }
/* 12 */            if (I00100o1O0lo(objArr)) {
/* 14 */                return objArr;
                    }
/* 15 */            Object[] objArrI001IIilI0O = I001IIilI0O();
/* 19 */            int length = objArr.length;
/* 22 */            if (length > 32) {
/* 24 */                length = 32;
                    }
/* 27 */            I1IoiO1l.I000oI1ioi(objArr, 0, objArrI001IIilI0O, length, 6);
/* 77 */            return objArrI001IIilI0O;
                }

                public final Object[] I00111O(int i, Object[] objArr) {
/* 6 */             if (I00100o1O0lo(objArr)) {
/* 10 */                System.arraycopy(objArr, 0, objArr, i, 32 - i);
/* 13 */                return objArr;
                    }
/* 14 */            Object[] objArrI001IIilI0O = I001IIilI0O();
/* 20 */            System.arraycopy(objArr, 0, objArrI001IIilI0O, i, 32 - i);
/* 37 */            return objArrI001IIilI0O;
                }

                public final Object[] I001IIilI0O() {
/* 3 */             Object[] objArr = new Object[33];
/* 9 */             objArr[32] = this.I00ilI0I1;
/* 20 */            return objArr;
                }

                public final Object[] I001IO000(Object obj) {
/* 3 */             Object[] objArr = new Object[33];
/* 6 */             objArr[0] = obj;
/* 12 */            objArr[32] = this.I00ilI0I1;
/* 29 */            return objArr;
                }

                public final Object[] I001i1O0Ol(Object[] objArr, int i, int i2) {
/* 7 */             if (!(i2 >= 0)) {
/* 11 */                OO1oio00IO.I00000oIO("shift should be positive");
                    }
/* 14 */            if (i2 == 0) {
/* 16 */                return objArr;
                    }
/* 17 */            int iI00000oIO = li1IOiiI.I00000oIO(i, i2);
/* 27 */            Object objI001i1O0Ol = I001i1O0Ol((Object[]) objArr[iI00000oIO], i, i2 - 5);
/* 33 */            if (iI00000oIO < 31) {
/* 35 */                int i3 = iI00000oIO + 1;
/* 39 */                if (objArr[i3] != null) {
/* 45 */                    if (I00100o1O0lo(objArr)) {
/* 50 */                        Arrays.fill(objArr, i3, 32, (Object) null);
                            }
/* 53 */                    Object[] objArrI001IIilI0O = I001IIilI0O();
/* 57 */                    System.arraycopy(objArr, 0, objArrI001IIilI0O, 0, i3);
/* 60 */                    objArr = objArrI001IIilI0O;
                        }
                    }
/* 63 */            if (objI001i1O0Ol == objArr[iI00000oIO]) {
/* 98 */                return objArr;
                    }
/* 65 */            Object[] objArrI0010o = I0010o(objArr);
/* 69 */            objArrI0010o[iI00000oIO] = objI001i1O0Ol;
/* 71 */            return objArrI0010o;
                }

                public final Object[] I001iOo1i0O(Object[] objArr, int i, int i2, IooiOoO1I1iO iooiOoO1I1iO) {
                    Object[] objArrI001iOo1i0O;
/* 3 */             int iI00000oIO = li1IOiiI.I00000oIO(i2 - 1, i);
/* 9 */             if (i == 5) {
/* 13 */                iooiOoO1I1iO.I00000oIO = objArr[iI00000oIO];
/* 15 */                objArrI001iOo1i0O = null;
                    } else {
/* 22 */                objArrI001iOo1i0O = I001iOo1i0O((Object[]) objArr[iI00000oIO], i - 5, i2, iooiOoO1I1iO);
                    }
/* 26 */            if (objArrI001iOo1i0O == null && iI00000oIO == 0) {
/* 7 */                 return null;
                    }
/* 31 */            Object[] objArrI0010o = I0010o(objArr);
/* 35 */            objArrI0010o[iI00000oIO] = objArrI001iOo1i0O;
/* 204 */           return objArrI0010o;
                }

                public final void I001lIiIIo1O(Object[] objArr, int i, int i2) {
/* 3 */             if (i2 == 0) {
/* 5 */                 this.I00ilO0 = null;
/* 7 */                 if (objArr == null) {
/* 9 */                     objArr = new Object[0];
                        }
/* 11 */                this.I00io1l = objArr;
/* 13 */                this.I00ioIO = i;
/* 15 */                this.I00iio = i2;
/* 17 */                return;
                    }
/* 20 */            IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(null);
/* 23 */            Object[] objArrI001iOo1i0O = I001iOo1i0O(objArr, i2, i, iooiOoO1I1iO);
/* 31 */            this.I00io1l = (Object[]) iooiOoO1I1iO.I00000oIO;
/* 33 */            this.I00ioIO = i;
/* 38 */            if (objArrI001iOo1i0O[1] == null) {
/* 44 */                this.I00ilO0 = (Object[]) objArrI001iOo1i0O[0];
/* 48 */                this.I00iio = i2 - 5;
                    } else {
/* 51 */                this.I00ilO0 = objArrI001iOo1i0O;
/* 53 */                this.I00iio = i2;
                    }
                }

                public final Object[] I001lllioOl(Object[] objArr, int i, int i2, Iterator it) {
/* 5 */             if (!it.hasNext()) {
/* 9 */                 OO1oio00IO.I00000oIO("invalid buffersIterator");
                    }
/* 19 */            if (!(i2 >= 0)) {
/* 23 */                OO1oio00IO.I00000oIO("negative shift");
                    }
/* 26 */            if (i2 == 0) {
/* 32 */                return (Object[]) it.next();
                    }
/* 35 */            Object[] objArrI0010o = I0010o(objArr);
/* 39 */            int iI00000oIO = li1IOiiI.I00000oIO(i, i2);
                    int i3 = i2 - 5;
/* 53 */            objArrI0010o[iI00000oIO] = I001lllioOl((Object[]) objArrI0010o[iI00000oIO], i, i3, it);
                    while (true) {
/* 55 */                iI00000oIO++;
/* 58 */                if (iI00000oIO >= 32 || !it.hasNext()) {
                            break;
                        }
/* 74 */                objArrI0010o[iI00000oIO] = I001lllioOl((Object[]) objArrI0010o[iI00000oIO], 0, i3, it);
                    }
/* 204 */           return objArrI0010o;
                }

                public final Object[] I001lloI(Object[] objArr, int i, Object[][] objArr2) {
/* 1 */             I01I0Iioooo0 i01I0Iioooo0I00000oIO = iOO1OO.I00000oIO(objArr2);
/* 5 */             int i2 = i >> 5;
/* 7 */             int i3 = this.I00iio;
/* 19 */            Object[] objArrI001lllioOl = i2 < (1 << i3) ? I001lllioOl(objArr, i, i3, i01I0Iioooo0I00000oIO) : I0010o(objArr);
/* 27 */            while (i01I0Iioooo0I00000oIO.hasNext()) {
                        this.I00iio += 5;
/* 35 */                objArrI001lllioOl = I001IO000(objArrI001lllioOl);
/* 39 */                int i4 = this.I00iio;
/* 43 */                I001lllioOl(objArrI001lllioOl, 1 << i4, i4, i01I0Iioooo0I00000oIO);
                    }
/* 98 */            return objArrI001lllioOl;
                }

                public final void I00II0Ol1O0l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
/* 1 */             int i = this.I00ioIO;
/* 3 */             int i2 = i >> 5;
/* 5 */             int i3 = this.I00iio;
/* 10 */            if (i2 > (1 << i3)) {
/* 24 */                this.I00ilO0 = I00II0oii1o(this.I00iio + 5, I001IO000(objArr), objArr2);
/* 26 */                this.I00io1l = objArr3;
                        this.I00iio += 5;
                        this.I00ioIO++;
/* 39 */                return;
                    }
/* 40 */            if (objArr == null) {
/* 42 */                this.I00ilO0 = objArr2;
/* 44 */                this.I00io1l = objArr3;
/* 47 */                this.I00ioIO = i + 1;
                    } else {
/* 54 */                this.I00ilO0 = I00II0oii1o(i3, objArr, objArr2);
/* 56 */                this.I00io1l = objArr3;
                        this.I00ioIO++;
                    }
                }

                public final Object[] I00II0oii1o(int i, Object[] objArr, Object[] objArr2) {
/* 7 */             int iI00000oIO = li1IOiiI.I00000oIO(I00000oOI() - 1, i);
/* 11 */            Object[] objArrI0010o = I0010o(objArr);
/* 16 */            if (i == 5) {
/* 18 */                objArrI0010o[iI00000oIO] = objArr2;
/* 20 */                return objArrI0010o;
                    }
/* 30 */            objArrI0010o[iI00000oIO] = I00II0oii1o(i - 5, (Object[]) objArrI0010o[iI00000oIO], objArr2);
/* 98 */            return objArrI0010o;
                }

                public final int I00IO1(Function1 function1, Object[] objArr, int i, int i2, IooiOoO1I1iO iooiOoO1I1iO, ArrayList arrayList, ArrayList arrayList2) {
/* 5 */             if (I00100o1O0lo(objArr)) {
/* 7 */                 arrayList.add(objArr);
                    }
/* 12 */            Object[] objArr2 = (Object[]) iooiOoO1I1iO.I00000oIO;
/* 15 */            Object[] objArrI001IIilI0O = objArr2;
/* 17 */            for (int i3 = 0; i3 < i; i3++) {
/* 19 */                Object obj = objArr[i3];
/* 31 */                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
/* 35 */                    if (i2 == 32) {
/* 52 */                        objArrI001IIilI0O = !arrayList.isEmpty() ? (Object[]) IIlIOloOOO.I000o00OoI0I(1, arrayList) : I001IIilI0O();
/* 57 */                        i2 = 0;
                            }
/* 60 */                    objArrI001IIilI0O[i2] = obj;
/* 58 */                    i2++;
                        }
                    }
/* 66 */            iooiOoO1I1iO.I00000oIO = objArrI001IIilI0O;
/* 68 */            if (objArr2 != objArrI001IIilI0O) {
/* 70 */                arrayList2.add(objArr2);
                    }
/* 965 */           return i2;
                }

                public final int I00IO1oi11O(Function1 function1, Object[] objArr, int i, IooiOoO1I1iO iooiOoO1I1iO) {
/* 2 */             Object[] objArrI0010o = objArr;
/* 3 */             int i2 = i;
/* 4 */             boolean z = false;
/* 5 */             for (int i3 = 0; i3 < i; i3++) {
/* 7 */                 Object obj = objArr[i3];
/* 19 */                if (((Boolean) function1.invoke(obj)).booleanValue()) {
/* 21 */                    if (!z) {
/* 23 */                        objArrI0010o = I0010o(objArr);
/* 27 */                        z = true;
/* 28 */                        i2 = i3;
                            }
                        } else if (z) {
/* 34 */                    objArrI0010o[i2] = obj;
/* 32 */                    i2++;
                        }
                    }
/* 40 */            iooiOoO1I1iO.I00000oIO = objArrI0010o;
/* 204 */           return i2;
                }

                public final boolean I00IlilI0i0i(Function1 function1) {
                    int i;
/* 1 */             Function1 function12 = function1;
/* 3 */             int iI00O0i0ii = I00O0i0ii();
/* 9 */             Object[] objArrI001i1O0Ol = null;
/* 10 */            IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(null);
/* 15 */            boolean z = false;
/* 17 */            if (this.I00ilO0 == null) {
/* 21 */                int iI00IO1oi11O = I00IO1oi11O(function12, this.I00io1l, iI00O0i0ii, iooiOoO1I1iO);
/* 25 */                Object obj = iooiOoO1I1iO.I00000oIO;
/* 27 */                if (iI00IO1oi11O == iI00O0i0ii) {
/* 29 */                    iI00IO1oi11O = iI00O0i0ii;
                        } else {
/* 31 */                    Object[] objArr = (Object[]) obj;
/* 33 */                    Arrays.fill(objArr, iI00IO1oi11O, iI00O0i0ii, (Object) null);
/* 36 */                    this.I00io1l = objArr;
                            this.I00ioIO -= iI00O0i0ii - iI00IO1oi11O;
                        }
/* 45 */                if (iI00IO1oi11O != iI00O0i0ii) {
/* 47 */                    z = true;
                        }
                    } else {
/* 50 */                I01IO1il i01IO1ilI0010I0i = I0010I0i(0);
/* 56 */                int iI00IO1oi11O2 = 32;
/* 57 */                while (iI00IO1oi11O2 == 32 && i01IO1ilI0010I0i.hasNext()) {
/* 71 */                    iI00IO1oi11O2 = I00IO1oi11O(function12, (Object[]) i01IO1ilI0010I0i.next(), 32, iooiOoO1I1iO);
                        }
/* 76 */                if (iI00IO1oi11O2 == 32) {
/* 80 */                    int iI00IO1oi11O3 = I00IO1oi11O(function12, this.I00io1l, iI00O0i0ii, iooiOoO1I1iO);
/* 84 */                    Object obj2 = iooiOoO1I1iO.I00000oIO;
/* 86 */                    if (iI00IO1oi11O3 == iI00O0i0ii) {
/* 88 */                        iI00IO1oi11O3 = iI00O0i0ii;
                            } else {
/* 90 */                        Object[] objArr2 = (Object[]) obj2;
/* 92 */                        Arrays.fill(objArr2, iI00IO1oi11O3, iI00O0i0ii, (Object) null);
/* 95 */                        this.I00io1l = objArr2;
                                this.I00ioIO -= iI00O0i0ii - iI00IO1oi11O3;
                            }
/* 104 */                   if (iI00IO1oi11O3 == 0) {
/* 112 */                       I001lIiIIo1O(this.I00ilO0, this.I00ioIO, this.I00iio);
                            }
/* 115 */                   if (iI00IO1oi11O3 != iI00O0i0ii) {
                            }
                        } else {
/* 121 */                   int i2 = (i01IO1ilI0010I0i.I00iOIl - 1) << 5;
/* 125 */                   ArrayList arrayList = new ArrayList();
/* 130 */                   ArrayList arrayList2 = new ArrayList();
/* 133 */                   int iI00IO1 = iI00IO1oi11O2;
/* 138 */                   while (i01IO1ilI0010I0i.hasNext()) {
/* 150 */                       iI00IO1 = I00IO1(function12, (Object[]) i01IO1ilI0010I0i.next(), 32, iI00IO1, iooiOoO1I1iO, arrayList2, arrayList);
/* 154 */                       function12 = function1;
                            }
/* 163 */                   int iI00IO12 = I00IO1(function1, this.I00io1l, iI00O0i0ii, iI00IO1, iooiOoO1I1iO, arrayList2, arrayList);
/* 169 */                   Object[] objArr3 = (Object[]) iooiOoO1I1iO.I00000oIO;
/* 171 */                   Arrays.fill(objArr3, iI00IO12, 32, (Object) null);
/* 174 */                   boolean zIsEmpty = arrayList.isEmpty();
/* 178 */                   Object[] objArrI001lllioOl = this.I00ilO0;
/* 180 */                   if (!zIsEmpty) {
/* 189 */                       objArrI001lllioOl = I001lllioOl(objArrI001lllioOl, i2, this.I00iio, arrayList.iterator());
                            }
/* 199 */                   int size = i2 + (arrayList.size() << 5);
/* 202 */                   if ((size & 31) != 0) {
/* 207 */                       OO1oio00IO.I00000oIO("invalid size");
                            }
/* 210 */                   if (size == 0) {
/* 212 */                       this.I00iio = 0;
                            } else {
                                int i3 = size - 1;
                                while (true) {
/* 217 */                           i = this.I00iio;
/* 221 */                           if ((i3 >> i) != 0) {
                                        break;
                                    }
/* 225 */                           this.I00iio = i - 5;
/* 227 */                           objArrI001lllioOl = objArrI001lllioOl[0];
                                }
/* 232 */                       objArrI001i1O0Ol = I001i1O0Ol(objArrI001lllioOl, i3, i);
                            }
/* 236 */                   this.I00ilO0 = objArrI001i1O0Ol;
/* 238 */                   this.I00io1l = objArr3;
/* 241 */                   this.I00ioIO = size + iI00IO12;
                        }
/* 47 */                z = true;
                    }
/* 245 */           if (z) {
                        ((AbstractList) this).modCount++;
                    }
/* 437 */           return z;
                }

                public final Object[] I00Io1lO(Object[] objArr, int i, int i2, IooiOoO1I1iO iooiOoO1I1iO) {
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 7 */             if (i == 0) {
/* 9 */                 Object obj = objArr[iI00000oIO];
/* 11 */                Object[] objArrI0010o = I0010o(objArr);
/* 15 */                int i3 = iI00000oIO + 1;
/* 19 */                System.arraycopy(objArr, i3, objArrI0010o, iI00000oIO, 32 - i3);
/* 24 */                objArrI0010o[31] = iooiOoO1I1iO.I00000oIO;
/* 26 */                iooiOoO1I1iO.I00000oIO = obj;
/* 28 */                return objArrI0010o;
                    }
/* 39 */            int iI00000oIO2 = objArr[31] == null ? li1IOiiI.I00000oIO(I00IoIO0lI() - 1, i) : 31;
/* 43 */            Object[] objArrI0010o2 = I0010o(objArr);
                    int i4 = i - 5;
/* 49 */            int i5 = iI00000oIO + 1;
/* 51 */            if (i5 <= iI00000oIO2) {
                        while (true) {
/* 62 */                    objArrI0010o2[iI00000oIO2] = I00Io1lO((Object[]) objArrI0010o2[iI00000oIO2], i4, 0, iooiOoO1I1iO);
/* 64 */                    if (iI00000oIO2 == i5) {
                                break;
                            }
                            iI00000oIO2--;
                        }
                    }
/* 77 */            objArrI0010o2[iI00000oIO] = I00Io1lO((Object[]) objArrI0010o2[iI00000oIO], i4, i2, iooiOoO1I1iO);
/* 204 */           return objArrI0010o2;
                }

                public final Object I00Io1o110i(int i, int i2, int i3, Object[] objArr) {
/* 5 */             int iI00000oOI = I00000oOI() - i;
/* 6 */             Object[] objArr2 = this.I00io1l;
/* 9 */             if (iI00000oOI == 1) {
/* 12 */                Object obj = objArr2[0];
/* 14 */                I001lIiIIo1O(objArr, i, i2);
/* 17 */                return obj;
                    }
/* 18 */            Object obj2 = objArr2[i3];
/* 20 */            Object[] objArrI0010o = I0010o(objArr2);
/* 24 */            int i4 = i3 + 1;
/* 28 */            System.arraycopy(objArr2, i4, objArrI0010o, i3, iI00000oOI - i4);
/* 34 */            objArrI0010o[iI00000oOI - 1] = null;
/* 36 */            this.I00ilO0 = objArr;
/* 38 */            this.I00io1l = objArrI0010o;
/* 42 */            this.I00ioIO = (i + iI00000oOI) - 1;
/* 44 */            this.I00iio = i2;
/* 204 */           return obj2;
                }

                public final int I00IoIO0lI() {
/* 1 */             int i = this.I00ioIO;
/* 5 */             if (i <= 32) {
/* 7 */                 return 0;
                    }
/* 11 */            return (i - 1) & (-32);
                }

                public final Object[] I00IoO0(Object[] objArr, int i, int i2, Object obj, IooiOoO1I1iO iooiOoO1I1iO) {
/* 1 */             int iI00000oIO = li1IOiiI.I00000oIO(i2, i);
/* 5 */             Object[] objArrI0010o = I0010o(objArr);
/* 9 */             if (i != 0) {
/* 41 */                objArrI0010o[iI00000oIO] = I00IoO0((Object[]) objArrI0010o[iI00000oIO], i - 5, i2, obj, iooiOoO1I1iO);
/* 399 */               return objArrI0010o;
                    }
/* 11 */            if (objArrI0010o != objArr) {
                        ((AbstractList) this).modCount++;
                    }
/* 21 */            iooiOoO1I1iO.I00000oIO = objArrI0010o[iI00000oIO];
/* 23 */            objArrI0010o[iI00000oIO] = obj;
/* 25 */            return objArrI0010o;
                }

                public final void I00Iooi00oi(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
                    Object[] objArrI001IIilI0O;
/* 2 */             if (i3 < 1) {
/* 7 */                 OO1oio00IO.I00000oIO("requires at least one nullBuffer");
                    }
/* 10 */            Object[] objArrI0010o = I0010o(objArr);
/* 15 */            objArr2[0] = objArrI0010o;
/* 17 */            int i4 = i & 31;
/* 25 */            int size = ((collection.size() + i) - 1) & 31;
/* 29 */            int i5 = (i2 - i4) + size;
/* 32 */            if (i5 < 32) {
/* 35 */                I1IoiO1l.I000iOII(objArrI0010o, size + 1, objArr3, i4, i2);
                    } else {
                        int i6 = i5 - 31;
/* 41 */                if (i3 == 1) {
/* 43 */                    objArrI001IIilI0O = objArrI0010o;
                        } else {
/* 45 */                    objArrI001IIilI0O = I001IIilI0O();
                            i3--;
/* 51 */                    objArr2[i3] = objArrI001IIilI0O;
                        }
/* 53 */                int i7 = i2 - i6;
/* 55 */                I1IoiO1l.I000iOII(objArrI0010o, 0, objArr3, i7, i2);
/* 59 */                I1IoiO1l.I000iOII(objArrI0010o, size + 1, objArrI001IIilI0O, i4, i7);
/* 62 */                objArr3 = objArrI001IIilI0O;
                    }
/* 63 */            Iterator it = collection.iterator();
/* 67 */            I000OiO(objArrI0010o, i4, it);
/* 70 */            for (int i8 = 1; i8 < i3; i8++) {
/* 72 */                Object[] objArrI001IIilI0O2 = I001IIilI0O();
/* 76 */                I000OiO(objArrI001IIilI0O2, 0, it);
/* 79 */                objArr2[i8] = objArrI001IIilI0O2;
                    }
/* 84 */            I000OiO(objArr3, 0, it);
                }

                public final int I00O0i0ii() {
/* 1 */             int i = this.I00ioIO;
                    return i <= 32 ? i : i - ((i - 1) & (-32));
                }

                @Override
                public final void add(int i, Object obj) {
/* 5 */             l10ioi0.I00000oOI(i, I00000oOI());
/* 12 */            if (i == I00000oOI()) {
/* 14 */                add(obj);
/* 17 */                return;
                    }
                    ((AbstractList) this).modCount++;
/* 24 */            int iI00IoIO0lI = I00IoIO0lI();
/* 28 */            if (i >= iI00IoIO0lI) {
/* 33 */                I000oI1ioi(obj, this.I00ilO0, i - iI00IoIO0lI);
/* 36 */                return;
                    }
/* 40 */            IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(null);
/* 57 */            I000oI1ioi(iooiOoO1I1iO.I00000oIO, I000o00OoI0I(this.I00ilO0, this.I00iio, i, obj, iooiOoO1I1iO), 0);
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
                    Collection collection2;
                    Object[] objArrI001IIilI0O;
/* 3 */             l10ioi0.I00000oOI(i, this.I00ioIO);
/* 8 */             if (i == this.I00ioIO) {
/* 10 */                return addAll(collection);
                    }
/* 20 */            if (collection.isEmpty()) {
/* 19 */                return false;
                    }
                    ((AbstractList) this).modCount++;
/* 31 */            int i2 = (i >> 5) << 5;
/* 44 */            int size = ((collection.size() + (this.I00ioIO - i2)) - 1) / 32;
/* 46 */            if (size == 0) {
/* 48 */                int i3 = i & 31;
/* 56 */                int size2 = ((collection.size() + i) - 1) & 31;
/* 58 */                Object[] objArr = this.I00io1l;
/* 60 */                Object[] objArrI0010o = I0010o(objArr);
/* 70 */                System.arraycopy(objArr, i3, objArrI0010o, size2 + 1, I00O0i0ii() - i3);
/* 77 */                I000OiO(objArrI0010o, i3, collection.iterator());
/* 80 */                this.I00io1l = objArrI0010o;
/* 89 */                this.I00ioIO = collection.size() + this.I00ioIO;
/* 25 */                return true;
                    }
/* 92 */            Object[][] objArr2 = new Object[size][];
/* 94 */            int iI00O0i0ii = I00O0i0ii();
/* 104 */           int size3 = collection.size() + this.I00ioIO;
/* 105 */           if (size3 > 32) {
/* 112 */               size3 -= (size3 - 1) & (-32);
                    }
/* 117 */           if (i >= I00IoIO0lI()) {
/* 119 */               objArrI001IIilI0O = I001IIilI0O();
/* 126 */               collection2 = collection;
/* 130 */               I00Iooi00oi(collection2, i, this.I00io1l, iI00O0i0ii, objArr2, size, objArrI001IIilI0O);
/* 133 */               objArr2 = objArr2;
                    } else {
/* 135 */               collection2 = collection;
/* 136 */               Object[] objArr3 = this.I00io1l;
/* 138 */               if (size3 > iI00O0i0ii) {
/* 140 */                   int i4 = size3 - iI00O0i0ii;
/* 142 */                   Object[] objArrI00111O = I00111O(i4, objArr3);
/* 149 */                   I000lI(collection2, i, i4, objArr2, size, objArrI00111O);
/* 152 */                   objArr2 = objArr2;
/* 153 */                   objArrI001IIilI0O = objArrI00111O;
                        } else {
/* 155 */                   objArrI001IIilI0O = I001IIilI0O();
/* 159 */                   int i5 = iI00O0i0ii - size3;
/* 162 */                   System.arraycopy(objArr3, i5, objArrI001IIilI0O, 0, iI00O0i0ii - i5);
/* 165 */                   int i6 = 32 - i5;
/* 168 */                   Object[] objArrI00111O2 = I00111O(i6, this.I00io1l);
                            int i7 = size - 1;
/* 174 */                   objArr2[i7] = objArrI00111O2;
/* 180 */                   I000lI(collection2, i, i6, objArr2, i7, objArrI00111O2);
/* 183 */                   collection2 = collection2;
                        }
                    }
/* 190 */           this.I00ilO0 = I001lloI(this.I00ilO0, i2, objArr2);
/* 192 */           this.I00io1l = objArrI001IIilI0O;
/* 201 */           this.I00ioIO = collection2.size() + this.I00ioIO;
/* 25 */            return true;
                }

                @Override
                public final Object get(int i) {
                    Object[] objArr;
/* 5 */             l10ioi0.I00000oIO(i, I00000oOI());
/* 12 */            if (I00IoIO0lI() <= i) {
/* 14 */                objArr = this.I00io1l;
                    } else {
/* 17 */                Object[] objArr2 = this.I00ilO0;
/* 21 */                for (int i2 = this.I00iio; i2 > 0; i2 -= 5) {
/* 27 */                    objArr2 = objArr2[li1IOiiI.I00000oIO(i, i2)];
                        }
/* 34 */                objArr = objArr2;
                    }
/* 37 */            return objArr[i & 31];
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 3 */             l10ioi0.I00000oOI(i, this.I00ioIO);
/* 10 */            OO10Il01O1 oO10Il01O1 = new OO10Il01O1(i, this.I00ioIO);
/* 13 */            oO10Il01O1.I00iiO = this;
/* 17 */            oO10Il01O1.I00iio = ((AbstractList) this).modCount;
/* 20 */            oO10Il01O1.I00ilO0 = -1;
/* 22 */            oO10Il01O1.I00000oOI();
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return oO10Il01O1;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 4 */             I01Io1 i01Io1 = new I01Io1(1);
/* 7 */             i01Io1.I00iiI = collection;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            return I00IlilI0i0i(i01Io1);
                }

                @Override
                public final Object set(int i, Object obj) {
/* 5 */             l10ioi0.I00000oIO(i, I00000oOI());
/* 12 */            if (I00IoIO0lI() > i) {
/* 42 */                IooiOoO1I1iO iooiOoO1I1iO = new IooiOoO1I1iO(null);
/* 56 */                this.I00ilO0 = I00IoO0(this.I00ilO0, this.I00iio, i, obj, iooiOoO1I1iO);
/* 58 */                return iooiOoO1I1iO.I00000oIO;
                    }
/* 16 */            Object[] objArrI0010o = I0010o(this.I00io1l);
/* 22 */            if (objArrI0010o != this.I00io1l) {
                        ((AbstractList) this).modCount++;
                    }
/* 30 */            int i2 = i & 31;
/* 32 */            Object obj2 = objArrI0010o[i2];
/* 34 */            objArrI0010o[i2] = obj;
/* 36 */            this.I00io1l = objArrI0010o;
/* 38 */            return obj2;
                }

                @Override
/* 28 */        public final ListIterator listIterator() {
/* 29 */            return listIterator(0);
                }

                @Override
/* 60 */        public final boolean add(Object obj) {
                    ((AbstractList) this).modCount++;
/* 62 */            int iI00O0i0ii = I00O0i0ii();
                    if (iI00O0i0ii < 32) {
/* 63 */                Object[] objArrI0010o = I0010o(this.I00io1l);
/* 64 */                objArrI0010o[iI00O0i0ii] = obj;
/* 65 */                this.I00io1l = objArrI0010o;
/* 67 */                this.I00ioIO = I00000oOI() + 1;
                    } else {
/* 69 */                I00II0Ol1O0l(this.I00ilO0, this.I00io1l, I001IO000(obj));
                    }
                    return true;
                }

                @Override
/* 203 */       public final boolean addAll(Collection collection) {
/* 204 */           if (collection.isEmpty()) {
                        return false;
                    }
                    ((AbstractList) this).modCount++;
/* 206 */           int iI00O0i0ii = I00O0i0ii();
/* 207 */           Iterator it = collection.iterator();
/* 208 */           if (32 - iI00O0i0ii >= collection.size()) {
/* 209 */               Object[] objArrI0010o = I0010o(this.I00io1l);
                        I000OiO(objArrI0010o, iI00O0i0ii, it);
                        this.I00io1l = objArrI0010o;
/* 211 */               this.I00ioIO = collection.size() + this.I00ioIO;
                        return true;
                    }
/* 212 */           int size = ((collection.size() + iI00O0i0ii) - 1) / 32;
/* 213 */           Object[][] objArr = new Object[size][];
/* 214 */           Object[] objArrI0010o2 = I0010o(this.I00io1l);
                    I000OiO(objArrI0010o2, iI00O0i0ii, it);
                    objArr[0] = objArrI0010o2;
                    for (int i = 1; i < size; i++) {
/* 215 */               Object[] objArrI001IIilI0O = I001IIilI0O();
                        I000OiO(objArrI001IIilI0O, 0, it);
                        objArr[i] = objArrI001IIilI0O;
                    }
/* 216 */           this.I00ilO0 = I001lloI(this.I00ilO0, I00IoIO0lI(), objArr);
/* 217 */           Object[] objArrI001IIilI0O2 = I001IIilI0O();
                    I000OiO(objArrI001IIilI0O2, 0, it);
                    this.I00io1l = objArrI001IIilI0O2;
/* 219 */           this.I00ioIO = collection.size() + this.I00ioIO;
                    return true;
                }
            }

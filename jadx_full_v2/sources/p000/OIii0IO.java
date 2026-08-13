            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            
            public final class OIii0IO extends l1lI1ioIli10 {
                public int I00000oOI;
                public int I0000O;
                public int I0001Ioi1lo;
                public IlO1i1lOIi[] I00000oIO = new IlO1i1lOIi[16];
                public int[] I0000Il00O = new int[16];
                public Object[] I0000oI00 = new Object[16];

                public final void I00000oIO() {
/* 2 */             this.I00000oOI = 0;
/* 4 */             this.I0000O = 0;
/* 11 */            Arrays.fill(this.I0000oI00, 0, this.I0001Ioi1lo, (Object) null);
/* 14 */            this.I0001Ioi1lo = 0;
                }

                public final void I00000oOI(I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 3 */             if (this.I00000oOI != 0) {
/* 8 */                 IOOOi1 iOOOi1 = new IOOOi1(5);
/* 11 */                iOOOi1.I0000oI00 = this;
/* 13 */                VarHandle.storeStoreFence();
                        while (true) {
/* 24 */                    IlO1i1lOIi ilO1i1lOIi = ((OIii0IO) iOOOi1.I0000oI00).I00000oIO[iOOOi1.I00000oOI];
/* 26 */                    Ilo1iIi1OI01 ilo1iIi1OI01I0001Ioi1lo = ilO1i1lOIi.I0001Ioi1lo(iOOOi1);
/* 30 */                    I1IOO010 i1ioo0102 = i1ioo010;
/* 31 */                    Ol11il011o0 ol11il011o02 = ol11il011o0;
/* 32 */                    OOoo1il oOoo1il2 = oOoo1il;
/* 33 */                    OIiOolI1lio oIiOolI1lio2 = oIiOolI1lio;
                            try {
/* 34 */                        ilO1i1lOIi.I0000O(iOOOi1, i1ioo0102, ol11il011o02, oOoo1il2, oIiOolI1lio2);
/* 37 */                        int i = iOOOi1.I00000oOI;
/* 41 */                        OIii0IO oIii0IO = (OIii0IO) iOOOi1.I0000oI00;
/* 43 */                        int i2 = oIii0IO.I00000oOI;
/* 45 */                        if (i < i2) {
/* 50 */                            IlO1i1lOIi ilO1i1lOIi2 = oIii0IO.I00000oIO[i];
                                    iOOOi1.I0000Il00O += ilO1i1lOIi2.I00000oOI;
                                    iOOOi1.I0000O += ilO1i1lOIi2.I0000Il00O;
/* 66 */                            int i3 = i + 1;
/* 68 */                            iOOOi1.I00000oOI = i3;
/* 70 */                            if (i3 >= i2) {
                                        break;
                                    }
/* 72 */                            i1ioo010 = i1ioo0102;
/* 73 */                            ol11il011o0 = ol11il011o02;
/* 74 */                            oOoo1il = oOoo1il2;
/* 75 */                            oIiOolI1lio = oIiOolI1lio2;
                                } else {
                                    break;
                                }
                            } finally {
                            }
                        }
                    }
/* 100 */           I00000oIO();
                }

                public final boolean I0000Il00O() {
                    return this.I00000oOI == 0;
                }

                public final void I0000O(IlO1i1lOIi ilO1i1lOIi) {
/* 1 */             int i = this.I00000oOI;
/* 3 */             IlO1i1lOIi[] ilO1i1lOIiArr = this.I00000oIO;
/* 5 */             int length = ilO1i1lOIiArr.length;
/* 6 */             int i2 = Barcode.FORMAT_UPC_E;
/* 9 */             if (i == length) {
/* 17 */                IlO1i1lOIi[] ilO1i1lOIiArr2 = new IlO1i1lOIi[(i > 1024 ? 1024 : i) + i];
/* 19 */                System.arraycopy(ilO1i1lOIiArr, 0, ilO1i1lOIiArr2, 0, i);
/* 22 */                this.I00000oIO = ilO1i1lOIiArr2;
                    }
/* 24 */            int i3 = this.I0000O;
/* 26 */            int i4 = ilO1i1lOIi.I00000oOI;
/* 28 */            int i5 = ilO1i1lOIi.I0000Il00O;
/* 30 */            int i6 = i3 + i4;
/* 31 */            int[] iArr = this.I0000Il00O;
/* 33 */            int length2 = iArr.length;
/* 34 */            if (i6 > length2) {
/* 41 */                int i7 = (length2 > 1024 ? 1024 : length2) + length2;
/* 42 */                if (i7 >= i6) {
/* 45 */                    i6 = i7;
                        }
/* 46 */                int[] iArr2 = new int[i6];
/* 48 */                I1IoiO1l.I000O01llI0(0, 0, length2, iArr, iArr2);
/* 51 */                this.I0000Il00O = iArr2;
                    }
/* 55 */            int i8 = this.I0001Ioi1lo + i5;
/* 56 */            Object[] objArr = this.I0000oI00;
/* 58 */            int length3 = objArr.length;
/* 59 */            if (i8 > length3) {
/* 61 */                if (length3 <= 1024) {
/* 64 */                    i2 = length3;
                        }
/* 65 */                int i9 = i2 + length3;
/* 66 */                if (i9 >= i8) {
/* 69 */                    i8 = i9;
                        }
/* 70 */                Object[] objArr2 = new Object[i8];
/* 72 */                System.arraycopy(objArr, 0, objArr2, 0, length3);
/* 75 */                this.I0000oI00 = objArr2;
                    }
/* 77 */            IlO1i1lOIi[] ilO1i1lOIiArr3 = this.I00000oIO;
/* 79 */            int i10 = this.I00000oOI;
/* 83 */            this.I00000oOI = i10 + 1;
/* 85 */            ilO1i1lOIiArr3[i10] = ilO1i1lOIi;
                    this.I0000O += ilO1i1lOIi.I00000oOI;
                    this.I0001Ioi1lo += i5;
                }
            }

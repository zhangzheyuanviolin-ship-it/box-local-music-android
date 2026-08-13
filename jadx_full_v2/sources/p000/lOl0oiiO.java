            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOl0oiiO {
                /* JADX WARN: Removed duplicated region for block: B:140:0x0281  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x02a0  */
                /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x013f  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0149  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(String str, Function1 function1, O1ooiI111i o1ooiI111i, boolean z, Oo0lloOiiIOI oo0lloOiiIOI, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, OoooioIi0I ooooioIi0I, O0OO00iO o0OO00iO, O0OO00i o0OO00i, boolean z2, int i, int i2, OioOIi1o0I oioOIi1o0I, OloooOlO10oI oloooOlO10oI, IloI0lOlll1 iloI0lOlll1, int i3, int i4, int i5) {
                    int i6;
                    IlliIl1l11O illiIl1l11O4;
                    int i7;
                    int i8;
                    boolean z3;
                    int i9;
                    IlliIl1l11O illiIl1l11O5;
                    boolean z4;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    OoooioIi0I ooooioIi0I2;
                    O0OO00i o0OO00i2;
                    int i10;
                    int i11;
                    OioOIi1o0I oioOIi1o0I2;
                    IlliIl1l11O illiIl1l11O6;
                    boolean z5;
                    IlliIl1l11O illiIl1l11O7;
                    O0OO00iO o0OO00iO2;
                    OOloioIl oOloioIlI001IO000;
                    IlliIl1l11O illiIl1l11O8;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    int i12;
                    int i13;
                    Oo0lloOiiIOI oo0lloOiiIOI3;
                    boolean z6;
/* 1 */             iloI0lOlll1.I00i0O(-154966360);
                    int i14 = i3 | (iloI0lOlll1.I000II(str) ? 4 : 2);
                    if ((i3 & 48) == 0) {
                        i14 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
                    int i15 = i14 | (iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | 27648;
                    if ((i3 & 196608) == 0) {
                        i15 |= ((i5 & 32) == 0 && iloI0lOlll1.I000II(oo0lloOiiIOI)) ? 131072 : 65536;
                    }
                    int i16 = i15 | 1572864;
                    int i17 = i5 & Barcode.FORMAT_QR_CODE;
                    int i18 = 33554432;
                    if (i17 == 0) {
                        if ((i3 & 100663296) == 0) {
                            i16 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 67108864 : 33554432;
                        }
                        i6 = i5 & Barcode.FORMAT_UPC_A;
                        if (i6 == 0) {
                            i16 |= 805306368;
                            illiIl1l11O4 = illiIl1l11O3;
                        } else {
                            illiIl1l11O4 = illiIl1l11O3;
                            if ((i3 & 805306368) == 0) {
                                i16 |= iloI0lOlll1.I000OOo1O(illiIl1l11O4) ? 536870912 : 268435456;
                            }
                        }
                        i7 = i4 | 1797558;
                        i8 = 131072 & i5;
                        if (i8 == 0) {
                            i7 = i4 | 14380470;
                            z3 = z2;
                        } else {
                            z3 = z2;
                            if ((i4 & 12582912) == 0) {
                                i7 |= iloI0lOlll1.I000O01llI0(z3) ? 8388608 : 4194304;
                            }
                        }
                        if ((i4 & 100663296) == 0) {
                            if ((i5 & 262144) == 0 && iloI0lOlll1.I0000oI00(i)) {
                                i18 = 67108864;
                            }
                            i7 |= i18;
                        }
                        i9 = i5 & 524288;
                        if (i9 == 0) {
                            i7 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i7 |= iloI0lOlll1.I0000oI00(i2) ? 536870912 : 268435456;
                        }
                        if (iloI0lOlll1.I00OIl(i16 & 1, ((i16 & 306783379) != 306783378 && (i7 & 306783379) == 306783378 && (((6 | (((i5 & 2097152) == 0 || !iloI0lOlll1.I000II(oioOIi1o0I)) ? (char) 16 : ' ')) | (!iloI0lOlll1.I000II(oloooOlO10oI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF)) & 147) == 146) ? false : true)) {
                            illiIl1l11O5 = illiIl1l11O;
/* 27 */                    iloI0lOlll1.I00OilO00Il();
                            z4 = z;
                            oo0lloOiiIOI2 = oo0lloOiiIOI;
                            ooooioIi0I2 = ooooioIi0I;
                            o0OO00i2 = o0OO00i;
                            i10 = i;
                            i11 = i2;
                            oioOIi1o0I2 = oioOIi1o0I;
                            illiIl1l11O6 = illiIl1l11O4;
                            z5 = z3;
                            illiIl1l11O7 = illiIl1l11O2;
                            o0OO00iO2 = o0OO00iO;
                        } else {
                            iloI0lOlll1.I00Ol00();
                            if ((i3 & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 4 */                         Oo0lloOiiIOI oo0lloOiiIOI4 = (i5 & 32) != 0 ? (Oo0lloOiiIOI) iloI0lOlll1.I000iOII(Oo0i1oIIoOO.I00000oIO) : oo0lloOiiIOI;
                                illiIl1l11O8 = i17 != 0 ? null : illiIl1l11O2;
                                if (i6 != 0) {
                                    illiIl1l11O4 = null;
                                }
/* 5 */                         OoOil11Ol1o ooOil11Ol1o = lolIo0.I00l0I0l0lO1;
/* 6 */                         O0OO00iO o0OO00iO3 = O0OO00iO.I0000Il00O;
/* 7 */                         O0OO00i o0OO00i3 = O0OO00i.I0000Il00O;
                                if (i8 != 0) {
                                    z3 = false;
                                }
                                int i19 = (i5 & 262144) != 0 ? z3 ? 1 : Integer.MAX_VALUE : i;
                                int i20 = i9 != 0 ? 1 : i2;
/* 9 */                         oioOIi1o0II00000oOI = (i5 & 2097152) != 0 ? Oiol0Ol0li0.I00000oOI(IlIlOOO.I0000O, iloI0lOlll1) : oioOIi1o0I;
                                z5 = z3;
                                i12 = i19;
                                o0OO00iO2 = o0OO00iO3;
                                o0OO00i2 = o0OO00i3;
                                i13 = i20;
                                ooooioIi0I2 = ooOil11Ol1o;
                                oo0lloOiiIOI3 = oo0lloOiiIOI4;
                                z4 = true;
                            } else {
/* 2 */                         iloI0lOlll1.I00OilO00Il();
                                z4 = z;
                                oo0lloOiiIOI3 = oo0lloOiiIOI;
                                illiIl1l11O8 = illiIl1l11O2;
                                ooooioIi0I2 = ooooioIi0I;
                                o0OO00i2 = o0OO00i;
                                i12 = i;
                                i13 = i2;
                                oioOIi1o0II00000oOI = oioOIi1o0I;
                                z5 = z3;
                                o0OO00iO2 = o0OO00iO;
                            }
/* 10 */                    iloI0lOlll1.I0010o();
                            IlliIl1l11O illiIl1l11O9 = illiIl1l11O4;
/* 11 */                    iloI0lOlll1.I00i01iIIliI(488158419);
/* 12 */                    Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            IlliIl1l11O illiIl1l11O10 = illiIl1l11O8;
/* 13 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 14 */                        objI00O0i0ii = l001l0.I00000oIO();
/* 15 */                        iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 16 */                    OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 17 */                    iloI0lOlll1.I0010I0i(false);
/* 18 */                    iloI0lOlll1.I00i01iIIliI(1401225826);
                            long jI0000O = oo0lloOiiIOI3.I0000O();
                            if (jI0000O != 16) {
                                z6 = false;
                            } else {
                                z6 = false;
/* 20 */                        jI0000O = oloooOlO10oI.I0000oI00(z4, false, ((Boolean) ili0i1I0iII1.I00000oIO(oI0lOIiOIOOo, iloI0lOlll1, 0).getValue()).booleanValue());
                            }
                            long j = jI0000O;
/* 21 */                    iloI0lOlll1.I0010I0i(z6);
/* 22 */                    Oo0lloOiiIOI oo0lloOiiIOII0001Ioi1lo = oo0lloOiiIOI3.I0001Ioi1lo(new Oo0lloOiiIOI(j, 0L, null, null, 0L, 0L, 0, 0L, 16777214));
                            Oo0lloOiiIOI oo0lloOiiIOI5 = oo0lloOiiIOI3;
/* 25 */                    OOiIo1lll oOiIo1lllI00000oIO = Oo0lOio.I00000oIO.I00000oIO(oloooOlO10oI.I000iOII);
/* 26 */                    Oo01IooIoo oo01IooIoo = new Oo01IooIoo();
                            oo01IooIoo.I00iOIl = o1ooiI111i;
                            oo01IooIoo.I00iiI = oloooOlO10oI;
                            oo01IooIoo.I00iiO = str;
                            oo01IooIoo.I00iio = function1;
                            oo01IooIoo.I00ilI0I1 = z4;
                            oo01IooIoo.I00ilO0 = oo0lloOiiIOII0001Ioi1lo;
                            oo01IooIoo.I00io1l = o0OO00iO2;
                            oo01IooIoo.I00ioIO = o0OO00i2;
                            oo01IooIoo.I00l0I0l0lO1 = z5;
                            oo01IooIoo.I00l0OO0IO = i12;
                            oo01IooIoo.I00li1OI = i13;
                            oo01IooIoo.I00ll1 = ooooioIi0I2;
                            oo01IooIoo.I00lli11 = oI0lOIiOIOOo;
                            illiIl1l11O5 = illiIl1l11O;
                            oo01IooIoo.I00lll10 = illiIl1l11O5;
                            illiIl1l11O7 = illiIl1l11O10;
                            oo01IooIoo.I00o0iI0io1 = illiIl1l11O7;
                            int i21 = i13;
                            oo01IooIoo.I00o0l1o1o0 = illiIl1l11O9;
                            OioOIi1o0I oioOIi1o0I3 = oioOIi1o0II00000oOI;
                            oo01IooIoo.I00o101lO = oioOIi1o0I3;
                            VarHandle.storeStoreFence();
                            iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(1459735400, oo01IooIoo, iloI0lOlll1), iloI0lOlll1, 56);
                            oo0lloOiiIOI2 = oo0lloOiiIOI5;
                            i10 = i12;
                            illiIl1l11O6 = illiIl1l11O9;
                            i11 = i21;
                            oioOIi1o0I2 = oioOIi1o0I3;
                        }
/* 28 */                oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                        if (oOloioIlI001IO000 == null) {
                            Oo01i1OO oo01i1OO = new Oo01i1OO();
                            oo01i1OO.I00iOIl = str;
                            oo01i1OO.I00iiI = function1;
                            oo01i1OO.I00iiO = o1ooiI111i;
                            oo01i1OO.I00iio = z4;
                            oo01i1OO.I00ilI0I1 = oo0lloOiiIOI2;
                            oo01i1OO.I00ilO0 = illiIl1l11O5;
                            oo01i1OO.I00io1l = illiIl1l11O7;
                            oo01i1OO.I00ioIO = illiIl1l11O6;
                            oo01i1OO.I00l0I0l0lO1 = ooooioIi0I2;
                            oo01i1OO.I00l0OO0IO = o0OO00iO2;
                            oo01i1OO.I00li1OI = o0OO00i2;
                            oo01i1OO.I00ll1 = z5;
                            oo01i1OO.I00lli11 = i10;
                            oo01i1OO.I00lll10 = i11;
                            oo01i1OO.I00o0iI0io1 = oioOIi1o0I2;
                            oo01i1OO.I00o0l1o1o0 = oloooOlO10oI;
                            oo01i1OO.I00o101lO = i3;
                            oo01i1OO.I00oI0i = i4;
                            oo01i1OO.I00oII = i5;
                            VarHandle.storeStoreFence();
/* 29 */                    oOloioIlI001IO000.I0000O = oo01i1OO;
                            return;
                        }
                        return;
                    }
                    i16 = i15 | 102236160;
                    i6 = i5 & Barcode.FORMAT_UPC_A;
                    if (i6 == 0) {
                    }
                    i7 = i4 | 1797558;
                    i8 = 131072 & i5;
                    if (i8 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i9 = i5 & 524288;
                    if (i9 == 0) {
                    }
                    if (iloI0lOlll1.I00OIl(i16 & 1, ((i16 & 306783379) != 306783378 && (i7 & 306783379) == 306783378 && (((6 | (((i5 & 2097152) == 0 || !iloI0lOlll1.I000II(oioOIi1o0I)) ? (char) 16 : ' ')) | (!iloI0lOlll1.I000II(oloooOlO10oI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF)) & 147) == 146) ? false : true)) {
                    }
/* 28 */            oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 == null) {
                    }
                }
            }

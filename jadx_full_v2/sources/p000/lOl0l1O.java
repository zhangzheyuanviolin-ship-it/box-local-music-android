            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class lOl0l1O {
                /* JADX WARN: Removed duplicated region for block: B:189:0x02ac A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:190:0x02ae  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x02d2  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x02d8  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x02f6 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:206:0x02f8  */
                /* JADX WARN: Removed duplicated region for block: B:243:0x03d3  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x03e7 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:247:0x03e9  */
                /* JADX WARN: Removed duplicated region for block: B:250:0x040d  */
                /* JADX WARN: Removed duplicated region for block: B:263:0x0431  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x046c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(CharSequence charSequence, IlliIl1l11O illiIl1l11O, lOl0oo lol0oo, Function3 function3, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, IlliIl1l11O illiIl1l11O4, IlliIl1l11O illiIl1l11O5, boolean z, boolean z2, boolean z3, OI0lOIiOIOOo oI0lOIiOIOOo, OIo1Oi1l1lI oIo1Oi1l1lI, OloooOlO10oI oloooOlO10oI, IlliIl1l11O illiIl1l11O6, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    CharSequence charSequence2;
                    boolean z4;
                    OIo1Oi1l1lI oIo1Oi1l1lI3;
                    IlliIl1l11O illiIl1l11O7;
                    IloI0lOlll1 iloI0lOlll12;
                    OoI1iOl0IoI ooI1iOl0IoI;
                    boolean z5;
                    OoI1O1OIoI ooI1O1OIoII0000O;
                    OoI1iOl0IoI ooI1iOl0IoI2;
                    boolean z6;
                    OoI1O1OIoI ooI1O1OIoII0000O2;
                    IOii1l iOii1lI00000oOI;
                    Io1Oioii1111 io1Oioii1111;
                    int i5;
                    IOii1l iOii1lI00000oOI2;
                    IOii1l iOii1l;
                    IOii1l iOii1l2;
                    long j;
                    IOii1l iOii1l3;
                    IOii1l iOii1l4;
                    IlIoO1ilo1 ilIoO1ilo1;
                    IlIoO1ilo1 ilIoO1ilo12;
                    Object objI00olI;
                    float f;
                    boolean zI000II;
                    Object objI00O0i0ii;
                    int iOrdinal;
                    boolean zI000II2;
                    Object objI00O0i0ii2;
                    Function1 function1I0000oI00;
                    Object objI00olI2;
                    float f2;
                    boolean zI000II3;
                    Object objI00O0i0ii3;
                    int iOrdinal2;
                    float f3;
                    boolean zI000II4;
                    Object objI00O0i0ii4;
                    Function1 function1I0000oI002;
                    lOl0oo lol0oo2 = lol0oo;
                    IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 1 */             Io1Oioii1111 io1Oioii11112 = Io1Oioii1111.I00ilO0;
                    iloI0lOlll13.I00i0O(-1478429597);
                    if ((i & 6) == 0) {
                        i3 = i | (iloI0lOlll13.I000OOo1O(charSequence) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(illiIl1l11O) ? 32 : 16;
                    }
                    int i6 = i & 384;
                    int i7 = Barcode.FORMAT_ITF;
                    if (i6 == 0) {
                        i3 |= iloI0lOlll13.I000II(lol0oo2) ? 256 : 128;
                    }
                    int i8 = i & 3072;
                    int i9 = Barcode.FORMAT_UPC_E;
                    if (i8 == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(function3) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(illiIl1l11O2) ? 16384 : 8192;
                    }
                    if ((i & 196608) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(illiIl1l11O3) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(illiIl1l11O4) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(null) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(null) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        i3 |= iloI0lOlll13.I000OOo1O(illiIl1l11O5) ? 536870912 : 268435456;
                    }
                    int i10 = i3;
                    if ((i2 & 6) == 0) {
                        i4 = i2 | (iloI0lOlll13.I000O01llI0(z) ? 4 : 2);
                    } else {
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= iloI0lOlll13.I000O01llI0(z2) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        if (iloI0lOlll13.I000O01llI0(z3)) {
                            i7 = 256;
                        }
                        i4 |= i7;
                    }
                    if ((i2 & 3072) == 0) {
                        if (iloI0lOlll13.I000II(oI0lOIiOIOOo)) {
                            i9 = 2048;
                        }
                        i4 |= i9;
                    }
                    if ((i2 & 24576) == 0) {
                        oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                        i4 |= iloI0lOlll13.I000II(oIo1Oi1l1lI2) ? 16384 : 8192;
                    } else {
                        oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                    }
                    if ((i2 & 196608) == 0) {
                        i4 |= iloI0lOlll13.I000II(oloooOlO10oI) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i4 |= iloI0lOlll13.I000OOo1O(illiIl1l11O6) ? 1048576 : 524288;
                    }
                    int i11 = i4;
                    if (iloI0lOlll13.I00OIl(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 599187) == 599186) ? false : true)) {
/* 2 */                 boolean zBooleanValue = ((Boolean) ili0i1I0iII1.I00000oIO(oI0lOIiOIOOo, iloI0lOlll13, (i11 >> 9) & 14).getValue()).booleanValue();
/* 5 */                 IololIo1ooo iololIo1ooo = zBooleanValue ? IololIo1ooo.I00iOIl : charSequence.length() == 0 ? IololIo1ooo.I00iiI : IololIo1ooo.I00iiO;
/* 8 */                 OoOo1o00Oi00 ooOo1o00Oi00 = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(O1OoilIO.I00000oOI)).I00000oOI;
/* 9 */                 Oo0lloOiiIOI oo0lloOiiIOI = ooOo1o00Oi00.I000OiO;
/* 10 */                Oo0lloOiiIOI oo0lloOiiIOI2 = ooOo1o00Oi00.I000l1;
/* 11 */                long jI0000O = oo0lloOiiIOI.I0000O();
/* 12 */                long j2 = IOOiio0i.I000o00OoI0I;
/* 13 */                boolean z7 = (Ooi0i1.I00000oOI(jI0000O, j2) && !Ooi0i1.I00000oOI(oo0lloOiiIOI2.I0000O(), j2)) || (!Ooi0i1.I00000oOI(oo0lloOiiIOI.I0000O(), j2) && Ooi0i1.I00000oOI(oo0lloOiiIOI2.I0000O(), j2));
/* 20 */                OoI1iOl0IoI ooI1iOl0IoII0001Ioi1lo = iO1IIloiOoiO.I0001Ioi1lo(iololIo1ooo, "TextFieldInputState", iloI0lOlll13, 48, 0);
                        I01O1lIi i01O1lIi = ooI1iOl0IoII0001Ioi1lo.I00000oIO;
/* 21 */                boolean z8 = function3 != null && ((lol0oo2 instanceof Oo01ii01) || (lol0oo2 instanceof Oo01iOI));
                        float f4 = 1.0f;
/* 23 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        if (function3 != null) {
                            iloI0lOlll13.I00i01iIIliI(994993276);
/* 24 */                    IlIoO1ilo1 ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iiI, iloI0lOlll13);
/* 25 */                    OoIoOiiO1 ooIoOiiO1 = Ooo0ii.I00000oIO;
/* 26 */                    if (ooI1iOl0IoII0001Ioi1lo.I000OOo1O()) {
                                z5 = z8;
/* 37 */                        iloI0lOlll13.I00i01iIIliI(1666827533);
/* 38 */                        iloI0lOlll13.I0010I0i(false);
/* 39 */                        objI00olI2 = i01O1lIi.I00olI();
                            } else {
                                iloI0lOlll13.I00i01iIIliI(1666573488);
/* 27 */                        boolean zI000II5 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 28 */                        objI00olI2 = iloI0lOlll13.I00O0i0ii();
                                if (zI000II5 || objI00olI2 == iOO0o0I1l) {
/* 29 */                            Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
                                    if (ol1il1o1I000OOo1O != null) {
                                        z5 = z8;
/* 30 */                                function1I0000oI002 = ol1il1o1I000OOo1O.I0000oI00();
                                    } else {
                                        z5 = z8;
                                        function1I0000oI002 = null;
                                    }
/* 31 */                            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                                    try {
/* 32 */                                Object objI00olI3 = i01O1lIi.I00olI();
/* 33 */                                iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI002);
/* 34 */                                iloI0lOlll13.I00iio(objI00olI3);
                                        objI00olI2 = objI00olI3;
                                    } finally {
                                    }
                                } else {
                                    z5 = z8;
                                }
/* 35 */                        iloI0lOlll13.I0010I0i(false);
                            }
/* 41 */                    iloI0lOlll13.I00i01iIIliI(1071902915);
/* 40 */                    int iOrdinal3 = ((IololIo1ooo) objI00olI2).ordinal();
                            if (iOrdinal3 == 0) {
                                f2 = 1.0f;
/* 42 */                        iloI0lOlll13.I0010I0i(false);
/* 43 */                        Float fValueOf = Float.valueOf(f2);
/* 44 */                        zI000II3 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 45 */                        objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                if (zI000II3 || objI00O0i0ii3 == iOO0o0I1l) {
/* 47 */                            IOI0iIo1o iOI0iIo1o = new IOI0iIo1o(8);
                                    iOI0iIo1o.I00iiI = ooI1iOl0IoII0001Ioi1lo;
/* 48 */                            VarHandle.storeStoreFence();
/* 49 */                            objI00O0i0ii3 = Ol1llolil.I00000oOI(iOI0iIo1o);
/* 50 */                            iloI0lOlll13.I00iio(objI00O0i0ii3);
                                }
/* 51 */                        IololIo1ooo iololIo1ooo2 = (IololIo1ooo) ((OlO01l1oOil) objI00O0i0ii3).getValue();
/* 52 */                        iloI0lOlll13.I00i01iIIliI(1071902915);
                                iOrdinal2 = iololIo1ooo2.ordinal();
                                if (iOrdinal2 == 0) {
                                    f3 = 1.0f;
/* 53 */                            iloI0lOlll13.I0010I0i(false);
/* 54 */                            Float fValueOf2 = Float.valueOf(f3);
/* 55 */                            zI000II4 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 56 */                            objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                    if (zI000II4 || objI00O0i0ii4 == iOO0o0I1l) {
/* 58 */                                IOI0iIo1o iOI0iIo1o2 = new IOI0iIo1o(9);
                                        iOI0iIo1o2.I00iiI = ooI1iOl0IoII0001Ioi1lo;
/* 59 */                                VarHandle.storeStoreFence();
/* 60 */                                objI00O0i0ii4 = Ol1llolil.I00000oOI(iOI0iIo1o2);
/* 61 */                                iloI0lOlll13.I00iio(objI00O0i0ii4);
                                    }
/* 63 */                            iloI0lOlll13.I00i01iIIliI(1806589607);
/* 64 */                            iloI0lOlll13.I0010I0i(false);
/* 65 */                            ooI1O1OIoII0000O = iO1IIloiOoiO.I0000O(ooI1iOl0IoII0001Ioi1lo, fValueOf, fValueOf2, ilIoO1ilo1I00000oOI, ooIoOiiO1, iloI0lOlll13, 196608);
                                    ooI1iOl0IoI = ooI1iOl0IoII0001Ioi1lo;
/* 66 */                            iloI0lOlll13.I0010I0i(false);
                                } else {
                                    if (iOrdinal2 == 1) {
                                        if (z5) {
                                            f3 = 0.0f;
                                        }
/* 53 */                                iloI0lOlll13.I0010I0i(false);
/* 54 */                                Float fValueOf22 = Float.valueOf(f3);
/* 55 */                                zI000II4 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 56 */                                objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                        if (zI000II4) {
/* 58 */                                    IOI0iIo1o iOI0iIo1o22 = new IOI0iIo1o(9);
                                            iOI0iIo1o22.I00iiI = ooI1iOl0IoII0001Ioi1lo;
/* 59 */                                    VarHandle.storeStoreFence();
/* 60 */                                    objI00O0i0ii4 = Ol1llolil.I00000oOI(iOI0iIo1o22);
/* 61 */                                    iloI0lOlll13.I00iio(objI00O0i0ii4);
/* 63 */                                    iloI0lOlll13.I00i01iIIliI(1806589607);
/* 64 */                                    iloI0lOlll13.I0010I0i(false);
/* 65 */                                    ooI1O1OIoII0000O = iO1IIloiOoiO.I0000O(ooI1iOl0IoII0001Ioi1lo, fValueOf, fValueOf22, ilIoO1ilo1I00000oOI, ooIoOiiO1, iloI0lOlll13, 196608);
                                            ooI1iOl0IoI = ooI1iOl0IoII0001Ioi1lo;
/* 66 */                                    iloI0lOlll13.I0010I0i(false);
                                        }
                                    } else if (iOrdinal2 != 2) {
                                        I000II.I00000oIO();
                                        return;
                                    }
                                    f3 = 1.0f;
/* 53 */                            iloI0lOlll13.I0010I0i(false);
/* 54 */                            Float fValueOf222 = Float.valueOf(f3);
/* 55 */                            zI000II4 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 56 */                            objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                    if (zI000II4) {
                                    }
                                }
                            } else {
                                if (iOrdinal3 == 1) {
                                    if (z5) {
                                        f2 = 0.0f;
                                    }
/* 42 */                            iloI0lOlll13.I0010I0i(false);
/* 43 */                            Float fValueOf3 = Float.valueOf(f2);
/* 44 */                            zI000II3 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 45 */                            objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                    if (zI000II3) {
/* 47 */                                IOI0iIo1o iOI0iIo1o3 = new IOI0iIo1o(8);
                                        iOI0iIo1o3.I00iiI = ooI1iOl0IoII0001Ioi1lo;
/* 48 */                                VarHandle.storeStoreFence();
/* 49 */                                objI00O0i0ii3 = Ol1llolil.I00000oOI(iOI0iIo1o3);
/* 50 */                                iloI0lOlll13.I00iio(objI00O0i0ii3);
/* 51 */                                IololIo1ooo iololIo1ooo22 = (IololIo1ooo) ((OlO01l1oOil) objI00O0i0ii3).getValue();
/* 52 */                                iloI0lOlll13.I00i01iIIliI(1071902915);
                                        iOrdinal2 = iololIo1ooo22.ordinal();
                                        if (iOrdinal2 == 0) {
                                        }
                                    }
                                } else if (iOrdinal3 != 2) {
                                    I000II.I00000oIO();
                                    return;
                                }
                                f2 = 1.0f;
/* 42 */                        iloI0lOlll13.I0010I0i(false);
/* 43 */                        Float fValueOf32 = Float.valueOf(f2);
/* 44 */                        zI000II3 = iloI0lOlll13.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 45 */                        objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                if (zI000II3) {
                                }
                            }
                        } else {
                            ooI1iOl0IoI = ooI1iOl0IoII0001Ioi1lo;
                            z5 = z8;
/* 67 */                    iloI0lOlll13.I00i01iIIliI(995064483);
/* 68 */                    iloI0lOlll13.I0010I0i(false);
                            ooI1O1OIoII0000O = null;
                        }
                        if (illiIl1l11O2 != null) {
/* 69 */                    iloI0lOlll13.I00i01iIIliI(995155127);
/* 70 */                    IlIoO1ilo1 ilIoO1ilo1I00000oOI2 = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll13);
/* 71 */                    IlIoO1ilo1 ilIoO1ilo1I00000oOI3 = l1i1II.I00000oOI(OI0I0o.I00ilI0I1, iloI0lOlll13);
/* 72 */                    OoIoOiiO1 ooIoOiiO12 = Ooo0ii.I00000oIO;
/* 73 */                    if (ooI1iOl0IoI.I000OOo1O()) {
                                ilIoO1ilo1 = ilIoO1ilo1I00000oOI2;
                                ilIoO1ilo12 = ilIoO1ilo1I00000oOI3;
/* 84 */                        iloI0lOlll13.I00i01iIIliI(1666827533);
/* 85 */                        iloI0lOlll13.I0010I0i(false);
/* 86 */                        objI00olI = i01O1lIi.I00olI();
                            } else {
                                iloI0lOlll13.I00i01iIIliI(1666573488);
/* 74 */                        boolean zI000II6 = iloI0lOlll13.I000II(ooI1iOl0IoI);
/* 75 */                        objI00olI = iloI0lOlll13.I00O0i0ii();
                                if (zI000II6 || objI00olI == iOO0o0I1l) {
/* 76 */                            Ol1il1o1 ol1il1o1I000OOo1O2 = iOl0lOIi11.I000OOo1O();
                                    if (ol1il1o1I000OOo1O2 != null) {
                                        ilIoO1ilo1 = ilIoO1ilo1I00000oOI2;
/* 77 */                                function1I0000oI00 = ol1il1o1I000OOo1O2.I0000oI00();
                                    } else {
                                        ilIoO1ilo1 = ilIoO1ilo1I00000oOI2;
                                        function1I0000oI00 = null;
                                    }
                                    ilIoO1ilo12 = ilIoO1ilo1I00000oOI3;
/* 78 */                            Ol1il1o1 ol1il1o1I000iOII2 = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O2);
                                    try {
/* 79 */                                Object objI00olI4 = i01O1lIi.I00olI();
/* 80 */                                iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O2, ol1il1o1I000iOII2, function1I0000oI00);
/* 81 */                                iloI0lOlll13.I00iio(objI00olI4);
                                        objI00olI = objI00olI4;
                                    } finally {
                                    }
                                } else {
                                    ilIoO1ilo1 = ilIoO1ilo1I00000oOI2;
                                    ilIoO1ilo12 = ilIoO1ilo1I00000oOI3;
                                }
/* 82 */                        iloI0lOlll13.I0010I0i(false);
                            }
/* 88 */                    iloI0lOlll13.I00i01iIIliI(-2037958114);
/* 87 */                    int iOrdinal4 = ((IololIo1ooo) objI00olI).ordinal();
                            if (iOrdinal4 == 0) {
                                f = 1.0f;
/* 89 */                        iloI0lOlll13.I0010I0i(false);
/* 90 */                        Float fValueOf4 = Float.valueOf(f);
/* 91 */                        zI000II = iloI0lOlll13.I000II(ooI1iOl0IoI);
/* 92 */                        objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
                                if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 94 */                            IOI0iIo1o iOI0iIo1o4 = new IOI0iIo1o(12);
                                    iOI0iIo1o4.I00iiI = ooI1iOl0IoI;
/* 95 */                            VarHandle.storeStoreFence();
/* 96 */                            objI00O0i0ii = Ol1llolil.I00000oOI(iOI0iIo1o4);
/* 97 */                            iloI0lOlll13.I00iio(objI00O0i0ii);
                                }
/* 98 */                        IololIo1ooo iololIo1ooo3 = (IololIo1ooo) ((OlO01l1oOil) objI00O0i0ii).getValue();
/* 99 */                        iloI0lOlll13.I00i01iIIliI(-2037958114);
                                iOrdinal = iololIo1ooo3.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        if (iOrdinal != 2) {
                                            I000II.I00000oIO();
                                            return;
                                        }
                                    } else if (z5) {
                                    }
                                    f4 = 0.0f;
                                }
/* 100 */                       iloI0lOlll13.I0010I0i(false);
/* 101 */                       Float fValueOf5 = Float.valueOf(f4);
/* 102 */                       zI000II2 = iloI0lOlll13.I000II(ooI1iOl0IoI);
/* 103 */                       objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                                if (!zI000II2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 105 */                           IOI0iIo1o iOI0iIo1o5 = new IOI0iIo1o(13);
                                    iOI0iIo1o5.I00iiI = ooI1iOl0IoI;
/* 106 */                           VarHandle.storeStoreFence();
/* 107 */                           objI00O0i0ii2 = Ol1llolil.I00000oOI(iOI0iIo1o5);
/* 108 */                           iloI0lOlll13.I00iio(objI00O0i0ii2);
                                }
/* 109 */                       OoI1O01lI ooI1O01lI = (OoI1O01lI) ((OlO01l1oOil) objI00O0i0ii2).getValue();
/* 110 */                       iloI0lOlll13.I00i01iIIliI(-1370891590);
                                IololIo1ooo iololIo1ooo4 = IololIo1ooo.I00iOIl;
                                IololIo1ooo iololIo1ooo5 = IololIo1ooo.I00iiI;
/* 111 */                       IlIoO1ilo1 ilIoO1ilo13 = (!ooI1O01lI.I0000O(iololIo1ooo4, iololIo1ooo5) && (ooI1O01lI.I0000O(iololIo1ooo5, iololIo1ooo4) || ooI1O01lI.I0000O(IololIo1ooo.I00iiO, iololIo1ooo5))) ? ilIoO1ilo12 : ilIoO1ilo1;
                                z6 = false;
/* 113 */                       iloI0lOlll13.I0010I0i(false);
                                OoI1iOl0IoI ooI1iOl0IoI3 = ooI1iOl0IoI;
/* 114 */                       ooI1O1OIoII0000O2 = iO1IIloiOoiO.I0000O(ooI1iOl0IoI3, fValueOf4, fValueOf5, ilIoO1ilo13, ooIoOiiO12, iloI0lOlll13, 196608);
                                ooI1iOl0IoI2 = ooI1iOl0IoI3;
/* 115 */                       iloI0lOlll13.I0010I0i(false);
                            } else {
                                if (iOrdinal4 == 1) {
                                    if (z5) {
                                    }
/* 89 */                            iloI0lOlll13.I0010I0i(false);
/* 90 */                            Float fValueOf42 = Float.valueOf(f);
/* 91 */                            zI000II = iloI0lOlll13.I000II(ooI1iOl0IoI);
/* 92 */                            objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
                                    if (zI000II) {
/* 94 */                                IOI0iIo1o iOI0iIo1o42 = new IOI0iIo1o(12);
                                        iOI0iIo1o42.I00iiI = ooI1iOl0IoI;
/* 95 */                                VarHandle.storeStoreFence();
/* 96 */                                objI00O0i0ii = Ol1llolil.I00000oOI(iOI0iIo1o42);
/* 97 */                                iloI0lOlll13.I00iio(objI00O0i0ii);
/* 98 */                                IololIo1ooo iololIo1ooo32 = (IololIo1ooo) ((OlO01l1oOil) objI00O0i0ii).getValue();
/* 99 */                                iloI0lOlll13.I00i01iIIliI(-2037958114);
                                        iOrdinal = iololIo1ooo32.ordinal();
                                        if (iOrdinal != 0) {
                                        }
/* 100 */                               iloI0lOlll13.I0010I0i(false);
/* 101 */                               Float fValueOf52 = Float.valueOf(f4);
/* 102 */                               zI000II2 = iloI0lOlll13.I000II(ooI1iOl0IoI);
/* 103 */                               objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                                        if (!zI000II2) {
/* 105 */                                   IOI0iIo1o iOI0iIo1o52 = new IOI0iIo1o(13);
                                            iOI0iIo1o52.I00iiI = ooI1iOl0IoI;
/* 106 */                                   VarHandle.storeStoreFence();
/* 107 */                                   objI00O0i0ii2 = Ol1llolil.I00000oOI(iOI0iIo1o52);
/* 108 */                                   iloI0lOlll13.I00iio(objI00O0i0ii2);
/* 109 */                                   OoI1O01lI ooI1O01lI2 = (OoI1O01lI) ((OlO01l1oOil) objI00O0i0ii2).getValue();
/* 110 */                                   iloI0lOlll13.I00i01iIIliI(-1370891590);
                                            IololIo1ooo iololIo1ooo42 = IololIo1ooo.I00iOIl;
                                            IololIo1ooo iololIo1ooo52 = IololIo1ooo.I00iiI;
/* 111 */                                   if (ooI1O01lI2.I0000O(iololIo1ooo42, iololIo1ooo52)) {
                                                z6 = false;
/* 113 */                                       iloI0lOlll13.I0010I0i(false);
                                                OoI1iOl0IoI ooI1iOl0IoI32 = ooI1iOl0IoI;
/* 114 */                                       ooI1O1OIoII0000O2 = iO1IIloiOoiO.I0000O(ooI1iOl0IoI32, fValueOf42, fValueOf52, ilIoO1ilo13, ooIoOiiO12, iloI0lOlll13, 196608);
                                                ooI1iOl0IoI2 = ooI1iOl0IoI32;
/* 115 */                                       iloI0lOlll13.I0010I0i(false);
                                            }
                                        }
                                    }
                                } else if (iOrdinal4 != 2) {
                                    I000II.I00000oIO();
                                    return;
                                }
                                f = 0.0f;
/* 89 */                        iloI0lOlll13.I0010I0i(false);
/* 90 */                        Float fValueOf422 = Float.valueOf(f);
/* 91 */                        zI000II = iloI0lOlll13.I000II(ooI1iOl0IoI);
/* 92 */                        objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
                                if (zI000II) {
                                }
                            }
                        } else {
                            ooI1iOl0IoI2 = ooI1iOl0IoI;
                            z6 = false;
/* 116 */                   iloI0lOlll13.I00i01iIIliI(995231139);
/* 117 */                   iloI0lOlll13.I0010I0i(false);
                            ooI1O1OIoII0000O2 = null;
                        }
/* 118 */               iloI0lOlll13.I00i01iIIliI(995398787);
/* 119 */               iloI0lOlll13.I0010I0i(z6);
                        if (function3 == null) {
/* 120 */                   iloI0lOlll13.I00i01iIIliI(995485028);
/* 121 */                   iloI0lOlll13.I0010I0i(z6);
                            iOii1lI00000oOI = null;
                        } else {
/* 122 */                   iloI0lOlll13.I00i01iIIliI(995485029);
/* 123 */                   Oo00lI oo00lI = new Oo00lI(1);
                            oo00lI.I00li1OI = ooI1O1OIoII0000O;
                            oo00lI.I00iiI = oloooOlO10oI;
                            oo00lI.I00iiO = z2;
                            oo00lI.I00iio = z3;
                            oo00lI.I00ilI0I1 = zBooleanValue;
                            oo00lI.I00ilO0 = z7;
                            oo00lI.I00io1l = ooI1iOl0IoI2;
                            oo00lI.I00ioIO = oo0lloOiiIOI2;
                            oo00lI.I00l0I0l0lO1 = oo0lloOiiIOI;
                            oo00lI.I00l0OO0IO = function3;
                            VarHandle.storeStoreFence();
                            iOii1lI00000oOI = iiioOl1O.I00000oOI(-568812970, oo00lI, iloI0lOlll13);
/* 124 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 128 */               long j3 = !z2 ? oloooOlO10oI.I00II0Ol1O0l : z3 ? oloooOlO10oI.I00II0oii1o : zBooleanValue ? oloooOlO10oI.I001lllioOl : oloooOlO10oI.I001lloI;
/* 129 */               Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii5 == iOO0o0I1l) {
/* 130 */                   Oo00IO0Ol0l oo00IO0Ol0l = new Oo00IO0Ol0l(4);
                            oo00IO0Ol0l.I00iiI = ooI1O1OIoII0000O2;
                            VarHandle.storeStoreFence();
/* 131 */                   IOO000ilo iOO000ilo = Ol1llolil.I00000oIO;
                            io1Oioii1111 = io1Oioii11112;
/* 132 */                   IiO0o1I iiO0o1I = new IiO0o1I(oo00IO0Ol0l, io1Oioii1111);
/* 133 */                   iloI0lOlll13.I00iio(iiO0o1I);
                            objI00O0i0ii5 = iiO0o1I;
                        } else {
                            io1Oioii1111 = io1Oioii11112;
                        }
/* 134 */               OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii5;
/* 135 */               if (illiIl1l11O2 != null && charSequence.length() == 0 && ((Boolean) olO01l1oOil.getValue()).booleanValue()) {
/* 137 */                   iloI0lOlll13.I00i01iIIliI(996556513);
/* 138 */                   I1iIo0i i1iIo0i = new I1iIo0i(1);
                            i1iIo0i.I00iiI = j3;
                            i1iIo0i.I00iiO = oo0lloOiiIOI;
                            i1iIo0i.I00iio = illiIl1l11O2;
                            VarHandle.storeStoreFence();
                            iOii1lI00000oOI2 = iiioOl1O.I00000oOI(1789869489, i1iIo0i, iloI0lOlll13);
                            i5 = 0;
/* 139 */                   iloI0lOlll13.I0010I0i(false);
                        } else {
                            i5 = 0;
/* 140 */                   iloI0lOlll13.I00i01iIIliI(996868186);
/* 141 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1lI00000oOI2 = null;
                        }
/* 142 */               Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii6 == iOO0o0I1l) {
/* 143 */                   Oo00IO0Ol0l oo00IO0Ol0l2 = new Oo00IO0Ol0l(i5);
                            oo00IO0Ol0l2.I00iiI = null;
                            VarHandle.storeStoreFence();
/* 144 */                   IOO000ilo iOO000ilo2 = Ol1llolil.I00000oIO;
/* 145 */                   IiO0o1I iiO0o1I2 = new IiO0o1I(oo00IO0Ol0l2, io1Oioii1111);
/* 146 */                   iloI0lOlll13.I00iio(iiO0o1I2);
                            objI00O0i0ii6 = iiO0o1I2;
                        }
/* 148 */               iloI0lOlll13.I00i01iIIliI(997311610);
/* 149 */               iloI0lOlll13.I0010I0i(false);
/* 150 */               iloI0lOlll13.I00i01iIIliI(997632026);
/* 151 */               iloI0lOlll13.I0010I0i(false);
/* 155 */               long j4 = !z2 ? oloooOlO10oI.I0010I0i : z3 ? oloooOlO10oI.I0010o : zBooleanValue ? oloooOlO10oI.I00100l0 : oloooOlO10oI.I00100o1O0lo;
                        if (illiIl1l11O3 == null) {
/* 156 */                   iloI0lOlll13.I00i01iIIliI(997794745);
/* 157 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1l = null;
                        } else {
/* 158 */                   iloI0lOlll13.I00i01iIIliI(997794746);
/* 159 */                   IOI1oIil1 iOI1oIil1 = new IOI1oIil1(2);
                            iOI1oIil1.I00iiI = j4;
                            iOI1oIil1.I00iiO = illiIl1l11O3;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(-341635739, iOI1oIil1, iloI0lOlll13);
/* 160 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1l = iOii1lI00000oOI3;
                        }
                        if (z2) {
                            iOii1l2 = iOii1lI00000oOI;
/* 164 */                   j = z3 ? oloooOlO10oI.I001i1O0Ol : zBooleanValue ? oloooOlO10oI.I00111O : oloooOlO10oI.I001IIilI0O;
                        } else {
                            iOii1l2 = iOii1lI00000oOI;
/* 161 */                   j = oloooOlO10oI.I001IO000;
                        }
                        if (illiIl1l11O4 == null) {
/* 165 */                   iloI0lOlll13.I00i01iIIliI(998054680);
/* 166 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1l3 = null;
                        } else {
/* 167 */                   iloI0lOlll13.I00i01iIIliI(998054681);
/* 168 */                   IOI1oIil1 iOI1oIil12 = new IOI1oIil1(3);
                            iOI1oIil12.I00iiI = j;
                            iOI1oIil12.I00iiO = illiIl1l11O4;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI4 = iiioOl1O.I00000oOI(-1014805251, iOI1oIil12, iloI0lOlll13);
/* 169 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1l3 = iOii1lI00000oOI4;
                        }
/* 173 */               long j5 = !z2 ? oloooOlO10oI.I00IOO : z3 ? oloooOlO10oI.I00IioO0OiOi : zBooleanValue ? oloooOlO10oI.I00IO1 : oloooOlO10oI.I00IO1oi11O;
                        if (illiIl1l11O5 == null) {
/* 174 */                   iloI0lOlll13.I00i01iIIliI(998325155);
/* 175 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1l4 = null;
                        } else {
/* 176 */                   iloI0lOlll13.I00i01iIIliI(998325156);
/* 177 */                   I0o0i11iOOlI i0o0i11iOOlI = new I0o0i11iOOlI(3);
                            i0o0i11iOOlI.I00iiI = j5;
                            i0o0i11iOOlI.I00iiO = oo0lloOiiIOI2;
                            i0o0i11iOOlI.I00iio = illiIl1l11O5;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI5 = iiioOl1O.I00000oOI(-1718586554, i0o0i11iOOlI, iloI0lOlll13);
/* 178 */                   iloI0lOlll13.I0010I0i(false);
                            iOii1l4 = iOii1lI00000oOI5;
                        }
/* 179 */               boolean zI000II7 = iloI0lOlll13.I000II(ooI1O1OIoII0000O);
/* 180 */               Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
                        Object obj = objI00O0i0ii7;
                        if (zI000II7 || objI00O0i0ii7 == iOO0o0I1l) {
/* 181 */                   Oo00IO0Ol0l oo00IO0Ol0l3 = new Oo00IO0Ol0l(1);
                            oo00IO0Ol0l3.I00iiI = ooI1O1OIoII0000O;
                            VarHandle.storeStoreFence();
/* 182 */                   iloI0lOlll13.I00iio(oo00IO0Ol0l3);
                            obj = oo00IO0Ol0l3;
                        }
/* 183 */               IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 184 */               boolean zI000II8 = iloI0lOlll13.I000II(ooI1O1OIoII0000O2);
/* 185 */               Object objI00O0i0ii8 = iloI0lOlll13.I00O0i0ii();
                        Object obj2 = objI00O0i0ii8;
                        if (zI000II8 || objI00O0i0ii8 == iOO0o0I1l) {
/* 186 */                   Oo00IO0Ol0l oo00IO0Ol0l4 = new Oo00IO0Ol0l(2);
                            oo00IO0Ol0l4.I00iiI = ooI1O1OIoII0000O2;
                            VarHandle.storeStoreFence();
/* 187 */                   iloI0lOlll13.I00iio(oo00IO0Ol0l4);
                            obj2 = oo00IO0Ol0l4;
                        }
/* 188 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj2;
/* 189 */               boolean zI000II9 = iloI0lOlll13.I000II(null);
/* 190 */               Object objI00O0i0ii9 = iloI0lOlll13.I00O0i0ii();
                        Object obj3 = objI00O0i0ii9;
                        if (zI000II9 || objI00O0i0ii9 == iOO0o0I1l) {
/* 191 */                   Oo00IO0Ol0l oo00IO0Ol0l5 = new Oo00IO0Ol0l(3);
                            oo00IO0Ol0l5.I00iiI = null;
                            VarHandle.storeStoreFence();
/* 192 */                   iloI0lOlll13.I00iio(oo00IO0Ol0l5);
                            obj3 = oo00IO0Ol0l5;
                        }
/* 193 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj3;
/* 194 */               if (lol0oo instanceof Oo01iOI) {
                            iloI0lOlll13.I00i01iIIliI(998774501);
/* 195 */                   Object objI00O0i0ii10 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii10 == iOO0o0I1l) {
/* 197 */                       objI00O0i0ii10 = lOO00IiI0li.I00000oIO(Ol0i1I.I00000oIO(0L));
/* 198 */                       iloI0lOlll13.I00iio(objI00O0i0ii10);
                            }
/* 199 */                   OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii10;
/* 200 */                   O11iol o11iol = new O11iol(27);
                            o11iol.I00iiI = oI10i0Il;
                            o11iol.I00iiO = lol0oo;
                            o11iol.I00iio = oIo1Oi1l1lI;
                            o11iol.I00ilI0I1 = illiIl1l11O6;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI6 = iiioOl1O.I00000oOI(-852893942, o11iol, iloI0lOlll13);
/* 201 */                   Oo01iOI oo01iOI = (Oo01iOI) lol0oo;
/* 202 */                   Oo010l1I oo010l1I = new Oo010l1I(illOOo00lI);
/* 203 */                   Oo010l1I oo010l1I2 = new Oo010l1I(illOOo00lI2);
/* 204 */                   Oo010l1I oo010l1I3 = new Oo010l1I(illOOo00lI3);
/* 205 */                   boolean zI000II10 = iloI0lOlll13.I000II(illOOo00lI);
/* 206 */                   Object objI00O0i0ii11 = iloI0lOlll13.I00O0i0ii();
                            Object obj4 = objI00O0i0ii11;
                            if (zI000II10 || objI00O0i0ii11 == iOO0o0I1l) {
/* 207 */                       OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(12);
                                oiOi011iI1ol.I00iiO = illOOo00lI;
                                oiOi011iI1ol.I00iiI = oI10i0Il;
                                VarHandle.storeStoreFence();
/* 208 */                       iloI0lOlll13.I00iio(oiOi011iI1ol);
                                obj4 = oiOi011iI1ol;
                            }
                            charSequence2 = charSequence;
                            IOii1l iOii1l5 = iOii1l;
                            z4 = z;
/* 210 */                   I00000oOI(illiIl1l11O, charSequence2, iOii1lI00000oOI2, iOii1l2, iOii1l5, iOii1l3, null, null, z4, oo01iOI, oo010l1I, oo010l1I2, oo010l1I3, (Function1) obj4, iOii1lI00000oOI6, iOii1l4, oIo1Oi1l1lI, iloI0lOlll13, (i10 & 112) | 6 | ((i10 << 6) & 896) | ((i11 << 27) & 1879048192), ((i10 >> 6) & 14) | 196608 | (29360128 & (i11 << 9)));
                            IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 211 */                   iloI0lOlll14.I0010I0i(false);
                            illiIl1l11O7 = illiIl1l11O;
                            lol0oo2 = lol0oo;
                            oIo1Oi1l1lI3 = oIo1Oi1l1lI;
                            iloI0lOlll12 = iloI0lOlll14;
                        } else {
/* 212 */                   iloI0lOlll13.I00i01iIIliI(1000494784);
/* 213 */                   I0ili1O00li i0ili1O00li = new I0ili1O00li(7);
                            i0ili1O00li.I00iiI = illiIl1l11O6;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI7 = iiioOl1O.I00000oOI(590261845, i0ili1O00li, iloI0lOlll13);
                            int i12 = (i10 & 112) | 6 | ((i10 << 6) & 896) | ((i11 << 27) & 1879048192);
                            int i13 = ((i10 >> 6) & 14) | 24576 | (3670016 & (i11 << 6));
                            illiIl1l11O7 = illiIl1l11O;
                            z4 = z;
                            IOii1l iOii1l6 = iOii1l4;
                            charSequence2 = charSequence;
                            oIo1Oi1l1lI3 = oIo1Oi1l1lI;
/* 218 */                   I0001Ioi1lo(illiIl1l11O7, charSequence2, iOii1l2, iOii1lI00000oOI2, iOii1l, iOii1l3, null, null, z4, lol0oo, new Oo010l1I(illOOo00lI), new Oo010l1I(illOOo00lI2), new Oo010l1I(illOOo00lI3), iOii1lI00000oOI7, iOii1l6, oIo1Oi1l1lI3, iloI0lOlll13, i12, i13);
                            lol0oo2 = lol0oo;
                            IloI0lOlll1 iloI0lOlll15 = iloI0lOlll13;
/* 219 */                   iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll15;
                        }
                    } else {
                        charSequence2 = charSequence;
                        z4 = z;
                        oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
                        illiIl1l11O7 = illiIl1l11O;
/* 220 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 221 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        Oo00oll oo00oll = new Oo00oll();
                        oo00oll.I00iOIl = charSequence2;
                        oo00oll.I00iiI = illiIl1l11O7;
                        oo00oll.I00iiO = lol0oo2;
                        oo00oll.I00iio = function3;
                        oo00oll.I00ilI0I1 = illiIl1l11O2;
                        oo00oll.I00ilO0 = illiIl1l11O3;
                        oo00oll.I00io1l = illiIl1l11O4;
                        oo00oll.I00ioIO = illiIl1l11O5;
                        oo00oll.I00l0I0l0lO1 = z4;
                        oo00oll.I00l0OO0IO = z2;
                        oo00oll.I00li1OI = z3;
                        oo00oll.I00ll1 = oI0lOIiOIOOo;
                        oo00oll.I00lli11 = oIo1Oi1l1lI3;
                        oo00oll.I00lll10 = oloooOlO10oI;
                        oo00oll.I00o0iI0io1 = illiIl1l11O6;
                        oo00oll.I00o0l1o1o0 = i;
                        oo00oll.I00o101lO = i2;
                        VarHandle.storeStoreFence();
/* 222 */               oOloioIlI001IO000.I0000O = oo00oll;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:274:0x057a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(IlliIl1l11O illiIl1l11O, CharSequence charSequence, Function3 function3, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, IlliIl1l11O illiIl1l11O4, IlliIl1l11O illiIl1l11O5, IlliIl1l11O illiIl1l11O6, boolean z, Oo01iOI oo01iOI, Oo010l1I oo010l1I, Oo010l1I oo010l1I2, Oo010l1I oo010l1I3, Function1 function1, IOii1l iOii1l, IlliIl1l11O illiIl1l11O7, OIo1Oi1l1lI oIo1Oi1l1lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    Oo010l1I oo010l1I4;
                    Oo010l1I oo010l1I5;
                    Function1 function12;
                    IlliIl1l11O illiIl1l11O8;
                    IlliIl1l11O illiIl1l11O9;
                    IlliIl1l11O illiIl1l11O10;
                    O0iOOoiioO o0iOOoiioO;
                    II0O01li0 iI0O01li0;
                    boolean z2;
                    Object obj;
                    float f;
                    II0O01li0 iI0O01li02;
                    IlliIl1l11O illiIl1l11O11;
                    boolean z3;
                    boolean zI000OOo1O;
                    boolean zI000OOo1O2;
/* 1 */             II0O01li0 iI0O01li03 = i1O01oOIoI0I.I00io1l;
                    II0O01li0 iI0O01li04 = i1O01oOIoI0I.I00iiO;
                    iloI0lOlll1.I00i0O(720589198);
                    int i5 = i & 6;
                    O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
                    if (i5 == 0) {
                        i3 = i | (iloI0lOlll1.I000II(o1ooIo101ll) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16;
                    }
                    int i6 = i & 384;
                    int i7 = Barcode.FORMAT_ITF;
                    if (i6 == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(charSequence) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    int i8 = i & 3072;
                    int i9 = Barcode.FORMAT_UPC_E;
                    if (i8 == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(function3) ? Barcode.FORMAT_PDF417 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 16384 : 8192;
                    }
                    if ((i & 196608) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O4) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O5) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O6) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= iloI0lOlll1.I000O01llI0(z) ? 536870912 : 268435456;
                    }
                    if ((i2 & 6) == 0) {
                        i4 = i2 | (iloI0lOlll1.I000II(oo01iOI) ? 4 : 2);
                    } else {
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= (i2 & 64) == 0 ? iloI0lOlll1.I000II(oo010l1I) : iloI0lOlll1.I000OOo1O(oo010l1I) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        if ((i2 & Barcode.FORMAT_UPC_A) == 0) {
                            oo010l1I4 = oo010l1I2;
                            zI000OOo1O2 = iloI0lOlll1.I000II(oo010l1I4);
                        } else {
                            oo010l1I4 = oo010l1I2;
                            zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oo010l1I4);
                        }
                        if (zI000OOo1O2) {
                            i7 = Barcode.FORMAT_QR_CODE;
                        }
                        i4 |= i7;
                    } else {
                        oo010l1I4 = oo010l1I2;
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i2 & Barcode.FORMAT_AZTEC) == 0) {
                            oo010l1I5 = oo010l1I3;
                            zI000OOo1O = iloI0lOlll1.I000II(oo010l1I5);
                        } else {
                            oo010l1I5 = oo010l1I3;
                            zI000OOo1O = iloI0lOlll1.I000OOo1O(oo010l1I5);
                        }
                        if (zI000OOo1O) {
                            i9 = Barcode.FORMAT_PDF417;
                        }
                        i4 |= i9;
                    } else {
                        oo010l1I5 = oo010l1I3;
                    }
                    if ((i2 & 24576) == 0) {
                        function12 = function1;
                        i4 |= iloI0lOlll1.I000OOo1O(function12) ? 16384 : 8192;
                    } else {
                        function12 = function1;
                    }
                    if ((i2 & 196608) == 0) {
                        i4 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i4 |= iloI0lOlll1.I000OOo1O(illiIl1l11O7) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i4 |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? 8388608 : 4194304;
                    }
                    int i10 = i4;
                    if (iloI0lOlll1.I00OIl(i3 & 1, ((i3 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true)) {
/* 2 */                 float fI000OiO = I000OiO(iloI0lOlll1);
                        int i11 = i10 & 112;
/* 6 */                 boolean zI0000O = ((29360128 & i10) == 8388608) | ((57344 & i10) == 16384) | ((i3 & 1879048192) == 536870912) | ((i10 & 14) == 4) | (i11 == 32 || ((i10 & 64) != 0 && iloI0lOlll1.I000II(oo010l1I))) | ((i10 & 896) == 256 || ((i10 & Barcode.FORMAT_UPC_A) != 0 && iloI0lOlll1.I000II(oo010l1I4))) | ((i10 & 7168) == 2048 || ((i10 & Barcode.FORMAT_AZTEC) != 0 && iloI0lOlll1.I000II(oo010l1I5))) | iloI0lOlll1.I0000O(fI000OiO);
/* 7 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 8 */                 Object obj2 = IOl11li.I00000oIO;
                        Object obj3 = objI00O0i0ii;
                        if (zI0000O || objI00O0i0ii == obj2) {
/* 10 */                    OIl1IiO oIl1IiO = new OIl1IiO();
/* 11 */                    oIl1IiO.I00000oIO = function12;
/* 12 */                    oIl1IiO.I00000oOI = z;
/* 13 */                    oIl1IiO.I0000Il00O = oo01iOI;
/* 14 */                    oIl1IiO.I0000O = oo010l1I;
/* 15 */                    oIl1IiO.I0000oI00 = oo010l1I4;
/* 16 */                    oIl1IiO.I0001Ioi1lo = oo010l1I5;
/* 17 */                    oIl1IiO.I000II = oIo1Oi1l1lI;
/* 18 */                    oIl1IiO.I000O01llI0 = fI000OiO;
/* 19 */                    VarHandle.storeStoreFence();
/* 20 */                    iloI0lOlll1.I00iio(oIl1IiO);
                            obj3 = oIl1IiO;
                        }
/* 21 */                OIl1IiO oIl1IiO2 = (OIl1IiO) obj3;
/* 24 */                O0iOOoiioO o0iOOoiioO2 = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 26 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 27 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 28 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 29 */                IOl0oi0lOl1.I000lI.getClass();
/* 30 */                iloI0lOlll1.I00i0oil();
/* 31 */                boolean z4 = iloI0lOlll1.I00O10llo;
/* 32 */                IllOOo00lI illOOo00lI = O0iiOioolIi.I01101IOlO;
                        if (z4) {
/* 33 */                    iloI0lOlll1.I000l1(illOOo00lI);
                        } else {
/* 34 */                    iloI0lOlll1.I00io1l();
                        }
/* 35 */                IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 36 */                li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oIl1IiO2);
/* 37 */                IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 38 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 39 */                Integer numValueOf = Integer.valueOf(iHashCode);
/* 40 */                IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 41 */                li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 42 */                li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 43 */                IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 44 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 45 */                iOii1l.invoke(iloI0lOlll1, Integer.valueOf((i10 >> 15) & 14));
                        if (illiIl1l11O3 != null) {
/* 46 */                    iloI0lOlll1.I00i01iIIliI(1958829341);
/* 48 */                    O1ooiI111i o1ooiI111iI0000O = iIoIOo00o.I00000oOI(o1ooIo101ll, "Leading").I0000O(O1lolo0IO.I00000oIO);
                            iI0O01li0 = iI0O01li03;
                            obj = obj2;
/* 49 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 51 */                    int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 52 */                    OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 53 */                    O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O);
/* 54 */                    iloI0lOlll1.I00i0oil();
                            o0iOOoiioO = o0iOOoiioO2;
/* 55 */                    if (iloI0lOlll1.I00O10llo) {
/* 56 */                        iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 57 */                        iloI0lOlll1.I00io1l();
                            }
/* 58 */                    li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 59 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 60 */                    IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 61 */                    li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 62 */                    illiIl1l11O3.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 15) & 14));
/* 63 */                    iloI0lOlll1.I0010I0i(true);
                            z2 = false;
/* 64 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
                            o0iOOoiioO = o0iOOoiioO2;
                            iI0O01li0 = iI0O01li03;
                            z2 = false;
                            obj = obj2;
/* 65 */                    iloI0lOlll1.I00i01iIIliI(1959075357);
/* 66 */                    iloI0lOlll1.I0010I0i(false);
                        }
                        if (illiIl1l11O4 != null) {
/* 67 */                    iloI0lOlll1.I00i01iIIliI(1959118075);
/* 69 */                    O1ooiI111i o1ooiI111iI0000O2 = iIoIOo00o.I00000oOI(o1ooIo101ll, "Trailing").I0000O(O1lolo0IO.I00000oIO);
/* 70 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, z2);
/* 72 */                    int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 73 */                    OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 74 */                    O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O2);
/* 75 */                    iloI0lOlll1.I00i0oil();
/* 76 */                    if (iloI0lOlll1.I00O10llo) {
/* 77 */                        iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 78 */                        iloI0lOlll1.I00io1l();
                            }
/* 79 */                    li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O2);
/* 80 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 81 */                    IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 82 */                    li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 83 */                    illiIl1l11O4.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 18) & 14));
/* 84 */                    iloI0lOlll1.I0010I0i(true);
/* 85 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 86 */                    iloI0lOlll1.I00i01iIIliI(1959366013);
/* 87 */                    iloI0lOlll1.I0010I0i(z2);
                        }
                        O0iOOoiioO o0iOOoiioO3 = o0iOOoiioO;
/* 88 */                float fI0000O = iO01II.I0000O(oIo1Oi1l1lI, o0iOOoiioO3);
/* 89 */                float fI0000Il00O = iO01II.I0000Il00O(oIo1Oi1l1lI, o0iOOoiioO3);
                        if (illiIl1l11O3 != null) {
                            fI0000O -= fI000OiO;
                            if (fI0000O < 0.0f) {
                                fI0000O = 0.0f;
                            }
                        }
                        float f2 = fI0000O;
                        if (illiIl1l11O4 != null) {
                            fI0000Il00O -= fI000OiO;
                            if (fI0000Il00O < 0.0f) {
                                fI0000Il00O = 0.0f;
                            }
                        }
                        if (illiIl1l11O5 != null) {
/* 90 */                    iloI0lOlll1.I00i01iIIliI(1960069992);
/* 94 */                    O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(iIoIOo00o.I00000oOI(o1ooIo101ll, "Prefix"), 24.0f, 0.0f, 2)), f2, 0.0f, 2.0f, 0.0f, 10);
                            iI0O01li02 = iI0O01li04;
/* 95 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O3 = II1oOI10.I0000Il00O(iI0O01li02, false);
                            f = fI0000Il00O;
/* 97 */                    int iHashCode4 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 98 */                    OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll1.I000lI();
/* 99 */                    O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 100 */                   iloI0lOlll1.I00i0oil();
/* 101 */                   if (iloI0lOlll1.I00O10llo) {
/* 102 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 103 */                       iloI0lOlll1.I00io1l();
                            }
/* 104 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O3);
/* 105 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI4);
/* 106 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 107 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O4);
/* 108 */                   illiIl1l11O5.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 21) & 14));
/* 109 */                   iloI0lOlll1.I0010I0i(true);
/* 110 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
                            f = fI0000Il00O;
                            iI0O01li02 = iI0O01li04;
/* 111 */                   iloI0lOlll1.I00i01iIIliI(1960397693);
/* 112 */                   iloI0lOlll1.I0010I0i(false);
                        }
                        if (illiIl1l11O6 != null) {
/* 113 */                   iloI0lOlll1.I00i01iIIliI(1960440938);
/* 117 */                   O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(iIoIOo00o.I00000oOI(o1ooIo101ll, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f, 0.0f, 10);
/* 118 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O4 = II1oOI10.I0000Il00O(iI0O01li02, false);
/* 120 */                   int iHashCode5 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 121 */                   OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll1.I000lI();
/* 122 */                   O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO2);
/* 123 */                   iloI0lOlll1.I00i0oil();
/* 124 */                   if (iloI0lOlll1.I00O10llo) {
/* 125 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 126 */                       iloI0lOlll1.I00io1l();
                            }
/* 127 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O4);
/* 128 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI5);
/* 129 */                   IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 130 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O5);
                            illiIl1l11O11 = illiIl1l11O6;
/* 131 */                   illiIl1l11O11.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 24) & 14));
/* 132 */                   iloI0lOlll1.I0010I0i(true);
/* 133 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
                            illiIl1l11O11 = illiIl1l11O6;
/* 134 */                   iloI0lOlll1.I00i01iIIliI(1960766717);
/* 135 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 138 */               O1ooiI111i o1ooiI111iI000OiO3 = iO01II.I000OiO(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(o1ooIo101ll, 24.0f, 0.0f, 2)), illiIl1l11O5 == null ? f2 : 0.0f, 0.0f, illiIl1l11O11 == null ? f : 0.0f, 0.0f, 10);
                        if (function3 != null) {
/* 139 */                   iloI0lOlll1.I00i01iIIliI(1961136702);
/* 140 */                   function3.invoke(iIoIOo00o.I00000oOI(o1ooIo101ll, "Hint").I0000O(o1ooiI111iI000OiO3), iloI0lOlll1, Integer.valueOf((i3 >> 6) & 112));
/* 141 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 142 */                   iloI0lOlll1.I00i01iIIliI(1961227997);
/* 143 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 146 */               O1ooiI111i o1ooiI111iI0000O3 = I000iOII(iIoIOo00o.I00000oOI(o1ooIo101ll, "TextField"), charSequence, (illiIl1l11O5 == null && illiIl1l11O11 == null) ? false : true).I0000O(o1ooiI111iI000OiO3);
/* 147 */               O1iOIl0o10 o1iOIl0o10I0000Il00O5 = II1oOI10.I0000Il00O(iI0O01li02, true);
/* 149 */               int iHashCode6 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 150 */               OO0lO0l0 oO0lO0l0I000lI6 = iloI0lOlll1.I000lI();
/* 151 */               O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O3);
/* 152 */               iloI0lOlll1.I00i0oil();
/* 153 */               if (iloI0lOlll1.I00O10llo) {
/* 154 */                   iloI0lOlll1.I000l1(illOOo00lI);
                        } else {
/* 155 */                   iloI0lOlll1.I00io1l();
                        }
/* 156 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O5);
/* 157 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI6);
/* 158 */               IIl001iO0Io.I001IIilI0O(iHashCode6, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 159 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O6);
                        illiIl1l11O8 = illiIl1l11O;
/* 160 */               illiIl1l11O8.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 3) & 14));
/* 161 */               iloI0lOlll1.I0010I0i(true);
                        if (illiIl1l11O2 != null) {
/* 162 */                   iloI0lOlll1.I00i01iIIliI(1962015552);
/* 163 */                   boolean z5 = i11 == 32 || ((i10 & 64) != 0 && iloI0lOlll1.I000OOo1O(oo010l1I));
/* 164 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            if (!z5) {
                                Object obj4 = objI00O0i0ii2;
                                if (objI00O0i0ii2 == obj) {
/* 165 */                           Oo00IiOIOiOl oo00IiOIOiOl = new Oo00IiOIOiOl(0);
                                    oo00IiOIOiOl.I00iiI = oo010l1I;
                                    VarHandle.storeStoreFence();
/* 166 */                           iloI0lOlll1.I00iio(oo00IiOIOiOl);
                                    obj4 = oo00IiOIOiOl;
                                }
/* 168 */                       Io0IOoOo io0IOoOo = new Io0IOoOo(1);
/* 167 */                       io0IOoOo.I00iiI = (IllOOo00lI) obj4;
                                VarHandle.storeStoreFence();
/* 171 */                       O1ooiI111i o1ooiI111iI0000O4 = iIoIOo00o.I00000oOI(Ol0iOOO0.I0010o(iIoIo1lll0lI.I00000oIO(o1ooIo101ll, io0IOoOo)), "Label").I0000O(o1ooIo101ll);
/* 172 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O6 = II1oOI10.I0000Il00O(iI0O01li02, false);
/* 174 */                       int iHashCode7 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 175 */                       OO0lO0l0 oO0lO0l0I000lI7 = iloI0lOlll1.I000lI();
/* 176 */                       O1ooiI111i o1ooiI111iI0000Il00O7 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O4);
/* 177 */                       iloI0lOlll1.I00i0oil();
/* 178 */                       if (iloI0lOlll1.I00O10llo) {
/* 179 */                           iloI0lOlll1.I000l1(illOOo00lI);
                                } else {
/* 180 */                           iloI0lOlll1.I00io1l();
                                }
/* 181 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O6);
/* 182 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI7);
/* 183 */                       IIl001iO0Io.I001IIilI0O(iHashCode7, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 184 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O7);
                                illiIl1l11O9 = illiIl1l11O2;
/* 185 */                       illiIl1l11O9.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 12) & 14));
/* 186 */                       iloI0lOlll1.I0010I0i(true);
/* 187 */                       iloI0lOlll1.I0010I0i(false);
                            }
                        } else {
                            illiIl1l11O9 = illiIl1l11O2;
/* 188 */                   iloI0lOlll1.I00i01iIIliI(1962412445);
/* 189 */                   iloI0lOlll1.I0010I0i(false);
                        }
                        if (illiIl1l11O7 != null) {
/* 190 */                   iloI0lOlll1.I00i01iIIliI(1962460960);
/* 196 */                   O1ooiI111i o1ooiI111iI0000oI00 = iO01II.I0000oI00(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(iIoIOo00o.I00000oOI(o1ooIo101ll, "Supporting"), 16.0f, 0.0f, 2)), new OIo1i1(16.0f, 4.0f, 16.0f, 0.0f));
/* 197 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O7 = II1oOI10.I0000Il00O(iI0O01li02, false);
/* 199 */                   int iHashCode8 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 200 */                   OO0lO0l0 oO0lO0l0I000lI8 = iloI0lOlll1.I000lI();
/* 201 */                   O1ooiI111i o1ooiI111iI0000Il00O8 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI00);
/* 202 */                   iloI0lOlll1.I00i0oil();
/* 203 */                   if (iloI0lOlll1.I00O10llo) {
/* 204 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 205 */                       iloI0lOlll1.I00io1l();
                            }
/* 206 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O7);
/* 207 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI8);
/* 208 */                   IIl001iO0Io.I001IIilI0O(iHashCode8, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 209 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O8);
                            illiIl1l11O10 = illiIl1l11O7;
/* 210 */                   illiIl1l11O10.invoke(iloI0lOlll1, Integer.valueOf((i10 >> 18) & 14));
                            z3 = true;
/* 211 */                   iloI0lOlll1.I0010I0i(true);
/* 212 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
                            illiIl1l11O10 = illiIl1l11O7;
                            z3 = true;
/* 213 */                   iloI0lOlll1.I00i01iIIliI(1962796349);
/* 214 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 215 */               iloI0lOlll1.I0010I0i(z3);
                    } else {
                        illiIl1l11O8 = illiIl1l11O;
                        illiIl1l11O9 = illiIl1l11O2;
                        illiIl1l11O10 = illiIl1l11O7;
/* 216 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 217 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        Oo00Ol1Ii oo00Ol1Ii = new Oo00Ol1Ii();
                        oo00Ol1Ii.I00iOIl = illiIl1l11O8;
                        oo00Ol1Ii.I00iiI = charSequence;
                        oo00Ol1Ii.I00iiO = function3;
                        oo00Ol1Ii.I00iio = illiIl1l11O9;
                        oo00Ol1Ii.I00ilI0I1 = illiIl1l11O3;
                        oo00Ol1Ii.I00ilO0 = illiIl1l11O4;
                        oo00Ol1Ii.I00io1l = illiIl1l11O5;
                        oo00Ol1Ii.I00ioIO = illiIl1l11O6;
                        oo00Ol1Ii.I00l0I0l0lO1 = z;
                        oo00Ol1Ii.I00l0OO0IO = oo01iOI;
                        oo00Ol1Ii.I00li1OI = oo010l1I;
                        oo00Ol1Ii.I00ll1 = oo010l1I2;
                        oo00Ol1Ii.I00lli11 = oo010l1I3;
                        oo00Ol1Ii.I00lll10 = function1;
                        oo00Ol1Ii.I00o0iI0io1 = iOii1l;
                        oo00Ol1Ii.I00o0l1o1o0 = illiIl1l11O10;
                        oo00Ol1Ii.I00o101lO = oIo1Oi1l1lI;
                        oo00Ol1Ii.I00oI0i = i;
                        oo00Ol1Ii.I00oII = i2;
                        VarHandle.storeStoreFence();
/* 218 */               oOloioIlI001IO000.I0000O = oo00Ol1Ii;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:104:0x019f  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x01ac  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0221  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x024d  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x026d A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:150:0x026f  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x039a  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x03db A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:210:0x03dd  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x040a  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x0415  */
                /* JADX WARN: Removed duplicated region for block: B:227:0x0457  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x04a9  */
                /* JADX WARN: Removed duplicated region for block: B:249:0x04ca  */
                /* JADX WARN: Removed duplicated region for block: B:252:0x04d0  */
                /* JADX WARN: Removed duplicated region for block: B:255:0x0518  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x051b  */
                /* JADX WARN: Removed duplicated region for block: B:259:0x0520  */
                /* JADX WARN: Removed duplicated region for block: B:260:0x0523  */
                /* JADX WARN: Removed duplicated region for block: B:263:0x052e  */
                /* JADX WARN: Removed duplicated region for block: B:267:0x0534  */
                /* JADX WARN: Removed duplicated region for block: B:270:0x0573 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:272:0x0578  */
                /* JADX WARN: Removed duplicated region for block: B:273:0x057a  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x0597  */
                /* JADX WARN: Removed duplicated region for block: B:283:0x05c4  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x05c6  */
                /* JADX WARN: Removed duplicated region for block: B:288:0x062d  */
                /* JADX WARN: Removed duplicated region for block: B:291:0x0633  */
                /* JADX WARN: Removed duplicated region for block: B:296:0x0655  */
                /* JADX WARN: Removed duplicated region for block: B:298:0x0659  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x065e  */
                /* JADX WARN: Removed duplicated region for block: B:304:0x0663  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x0666  */
                /* JADX WARN: Removed duplicated region for block: B:308:0x06fb  */
                /* JADX WARN: Removed duplicated region for block: B:309:0x071e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(OlO01l1oOil olO01l1oOil, OloooOlO10oI oloooOlO10oI, boolean z, boolean z2, boolean z3, boolean z4, OoI1iOl0IoI ooI1iOl0IoI, Oo0lloOiiIOI oo0lloOiiIOI, Oo0lloOiiIOI oo0lloOiiIOI2, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i) {
                    OoI1iOl0IoI ooI1iOl0IoI2;
                    I01O1lIi i01O1lIi;
                    OIooliIO0 oIooliIO0;
                    I10i1IOOol i10i1IOOol;
                    Oo0101 oo0101;
                    IOO0o0I1l iOO0o0I1l;
                    int i2;
                    OoI1O1OIoI ooI1O1OIoI;
                    int i3;
                    boolean z5;
                    Object objI00olI;
                    int i4;
                    boolean z6;
                    Object objI00O0i0ii;
                    boolean z7;
                    Object objI00O0i0ii2;
                    float fFloatValue;
                    OlIIi1oIIOlo olIIi1oIIOlo;
                    OlIIi1oIIOlo olIIi1oIIOlo2;
                    Oo0OO1I1i oo0OO1I1i;
                    Oo0OO1I1i oo0OO1I1i2;
                    boolean z8;
                    Oo0OO1I1i iII1lO;
                    IOOli10 iOOli10;
                    IlilIIiIiO ililIIiIiO;
                    IlilIIiIiO ililIIiIiO2;
                    Oo0OOlO0 oo0OOlO0;
                    Oo0OOlO0 oo0OOlO02;
                    OioOII0oI oioOII0oI;
                    OioOII0oI oioOII0oI2;
                    OioOII0oI oioOII0oII00000oIO;
                    OO1O1OI oo1o1oi;
                    OO1O1OI oo1o1oi2;
                    Oo0OOliO01o oo0OOliO01o;
                    Oo0OOliO01o oo0OOliO01o2;
                    OO1Il0I1 oO1Il0I1;
                    OO1Il0I1 oO1Il0I12;
                    OO1Il0I1 oO1Il0I13;
                    Ol1il1o1 ol1il1o1I000OOo1O;
                    Function1 function1I0000oI00;
                    Ol1il1o1 ol1il1o1I000iOII;
                    OoI1iOl0IoI ooI1iOl0IoI3;
                    int i5;
                    OoIoOiiO1 ooIoOiiO1;
                    I10i1IOOol i10i1IOOol2;
                    boolean z9;
                    Object objI00olI2;
                    IOOiio0i iOOiio0i;
                    boolean z10;
                    Object objI00O0i0ii3;
                    IololIo1ooo iololIo1ooo;
                    boolean z11;
                    Object objI00O0i0ii4;
                    boolean z12;
/* 23 */            I01O1lIi i01O1lIi2 = ooI1iOl0IoI.I00000oIO;
/* 25 */            OIooliIO0 oIooliIO02 = ooI1iOl0IoI.I0000O;
/* 27 */            I10i1IOOol i10i1IOOol3 = I10i1IOOol.I00l0I0l0lO1;
/* 32 */            iloI0lOlll1.I00i0O(376119213);
/* 161 */           int i6 = i | (iloI0lOlll1.I000II(olO01l1oOil) ? 4 : 2) | (iloI0lOlll1.I000II(oloooOlO10oI) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000O01llI0(z3) ? 16384 : 8192) | (iloI0lOlll1.I000O01llI0(z4) ? 131072 : 65536) | (iloI0lOlll1.I000II(ooI1iOl0IoI) ? 1048576 : 524288) | (iloI0lOlll1.I000II(oo0lloOiiIOI) ? 8388608 : 4194304) | (iloI0lOlll1.I000II(oo0lloOiiIOI2) ? 67108864 : 33554432) | (iloI0lOlll1.I000OOo1O(function3) ? 536870912 : 268435456);
/* 182 */           if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
/* 184 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 188 */               IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 190 */               if (objI00O0i0ii5 == iOO0o0I1l2) {
/* 194 */                   objI00O0i0ii5 = new Oo0101();
/* 197 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 200 */               Oo0101 oo01012 = (Oo0101) objI00O0i0ii5;
/* 219 */               long j = !z ? oloooOlO10oI.I001l0I00 : z2 ? oloooOlO10oI.I001lIiIIo1O : z3 ? oloooOlO10oI.I001i1lo1io : oloooOlO10oI.I001iOo1i0O;
/* 228 */               if (z4) {
/* 230 */                   i2 = 6;
/* 235 */                   iloI0lOlll1.I00i01iIIliI(-601510006);
/* 238 */                   long jI0000O = oo0lloOiiIOI.I0000O();
/* 242 */                   if (z4 && jI0000O == 16) {
/* 249 */                       jI0000O = j;
                            }
/* 251 */                   long jI0000O2 = oo0lloOiiIOI2.I0000O();
/* 255 */                   if (z4 && jI0000O2 == 16) {
/* 262 */                       jI0000O2 = j;
                            }
/* 268 */                   IlIoO1ilo1 ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 274 */                   int i7 = ((i6 >> 18) & 14) | 384;
/* 280 */                   IololIo1ooo iololIo1ooo2 = (IololIo1ooo) oIooliIO02.getValue();
/* 287 */                   iloI0lOlll1.I00i01iIIliI(-759924327);
/* 290 */                   int[] iArr = Oo010O0.I00000oIO;
/* 307 */                   long j2 = iArr[iololIo1ooo2.ordinal()] == 1 ? jI0000O : jI0000O2;
/* 310 */                   iloI0lOlll1.I0010I0i(false);
/* 313 */                   IOOl0ll iOOl0llI0001Ioi1lo = IOOiio0i.I0001Ioi1lo(j2);
/* 317 */                   boolean zI000II = iloI0lOlll1.I000II(iOOl0llI0001Ioi1lo);
/* 323 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 327 */                   if (zI000II || objI00O0i0ii6 == iOO0o0I1l2) {
/* 338 */                       i01O1lIi = i01O1lIi2;
/* 344 */                       objI00O0i0ii6 = Ooo0ii.I00000oIO(i10i1IOOol3, new I10iOo0il1(iOOl0llI0001Ioi1lo, 2));
/* 348 */                       iloI0lOlll1.I00iio(objI00O0i0ii6);
                            } else {
/* 332 */                       i01O1lIi = i01O1lIi2;
                            }
/* 351 */                   OoIoOiiO1 ooIoOiiO12 = (OoIoOiiO1) objI00O0i0ii6;
/* 355 */                   int i8 = (i7 & 14) | 3072;
/* 361 */                   if (ooI1iOl0IoI.I000OOo1O()) {
/* 459 */                       ooI1iOl0IoI3 = ooI1iOl0IoI;
/* 461 */                       i5 = i8;
/* 463 */                       ooIoOiiO1 = ooIoOiiO12;
/* 465 */                       oIooliIO0 = oIooliIO02;
/* 467 */                       i10i1IOOol2 = i10i1IOOol3;
/* 472 */                       z9 = false;
/* 473 */                       iloI0lOlll1.I00i01iIIliI(1666827533);
/* 476 */                       iloI0lOlll1.I0010I0i(false);
/* 479 */                       objI00olI2 = i01O1lIi.I00olI();
                            } else {
/* 366 */                       iloI0lOlll1.I00i01iIIliI(1666573488);
/* 373 */                       i5 = i8;
/* 376 */                       if (((i8 & 14) ^ 6) > 4) {
/* 378 */                           ooI1iOl0IoI3 = ooI1iOl0IoI;
/* 384 */                           if (iloI0lOlll1.I000II(ooI1iOl0IoI3)) {
/* 387 */                               ooIoOiiO1 = ooIoOiiO12;
                                    }
/* 401 */                           objI00olI2 = iloI0lOlll1.I00O0i0ii();
/* 405 */                           if (!z12 || objI00olI2 == iOO0o0I1l2) {
/* 416 */                               ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 429 */                               function1I0000oI00 = ol1il1o1I000OOo1O == null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 426 */                               oIooliIO0 = oIooliIO02;
/* 432 */                               ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
/* 436 */                               i10i1IOOol2 = i10i1IOOol3;
                                        try {
/* 438 */                                   Object objI00olI3 = i01O1lIi.I00olI();
/* 442 */                                   iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 445 */                                   iloI0lOlll1.I00iio(objI00olI3);
/* 448 */                                   objI00olI2 = objI00olI3;
                                        } finally {
                                        }
                                    } else {
/* 410 */                               oIooliIO0 = oIooliIO02;
/* 412 */                               i10i1IOOol2 = i10i1IOOol3;
                                    }
/* 414 */                           z9 = false;
/* 450 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 390 */                           ooI1iOl0IoI3 = ooI1iOl0IoI;
                                }
/* 392 */                       ooIoOiiO1 = ooIoOiiO12;
/* 400 */                       z12 = (i5 & 6) == 4;
/* 401 */                       objI00olI2 = iloI0lOlll1.I00O0i0ii();
/* 405 */                       if (z12) {
/* 416 */                           ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 429 */                           if (ol1il1o1I000OOo1O == null) {
                                    }
/* 426 */                           oIooliIO0 = oIooliIO02;
/* 432 */                           ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
/* 436 */                           i10i1IOOol2 = i10i1IOOol3;
/* 438 */                           Object objI00olI32 = i01O1lIi.I00olI();
/* 442 */                           iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 445 */                           iloI0lOlll1.I00iio(objI00olI32);
/* 448 */                           objI00olI2 = objI00olI32;
/* 414 */                           z9 = false;
/* 450 */                           iloI0lOlll1.I0010I0i(false);
                                }
                            }
/* 488 */                   iloI0lOlll1.I00i01iIIliI(-759924327);
/* 503 */                   long j3 = iArr[((IololIo1ooo) objI00olI2).ordinal()] == 1 ? jI0000O : jI0000O2;
/* 505 */                   iloI0lOlll1.I0010I0i(z9);
/* 508 */                   IOOiio0i iOOiio0iI00000oIO = IOOiio0i.I00000oIO(j3);
/* 512 */                   int i9 = i5 & 14;
/* 514 */                   int i10 = i9 ^ 6;
/* 517 */                   if (i10 <= 4 || !iloI0lOlll1.I000II(ooI1iOl0IoI3)) {
/* 529 */                       iOOiio0i = iOOiio0iI00000oIO;
/* 533 */                       if ((i5 & 6) != 4) {
/* 537 */                           z10 = false;
                                }
/* 538 */                       objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 542 */                       if (!z10 || objI00O0i0ii3 == iOO0o0I1l2) {
/* 550 */                           IOI0iIo1o iOI0iIo1o = new IOI0iIo1o(10);
/* 553 */                           iOI0iIo1o.I00iiI = ooI1iOl0IoI3;
/* 555 */                           VarHandle.storeStoreFence();
/* 558 */                           objI00O0i0ii3 = Ol1llolil.I00000oOI(iOI0iIo1o);
/* 562 */                           iloI0lOlll1.I00iio(objI00O0i0ii3);
                                }
/* 571 */                       iololIo1ooo = (IololIo1ooo) ((OlO01l1oOil) objI00O0i0ii3).getValue();
/* 576 */                       iloI0lOlll1.I00i01iIIliI(-759924327);
/* 586 */                       if (iArr[iololIo1ooo.ordinal()] != 1) {
/* 590 */                           jI0000O = jI0000O2;
                                }
/* 593 */                       iloI0lOlll1.I0010I0i(false);
/* 596 */                       IOOiio0i iOOiio0iI00000oIO2 = IOOiio0i.I00000oIO(jI0000O);
/* 615 */                       z11 = (i10 <= 4 && iloI0lOlll1.I000II(ooI1iOl0IoI3)) || (i5 & 6) == 4;
/* 616 */                       objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 620 */                       if (z11 || objI00O0i0ii4 == iOO0o0I1l2) {
/* 628 */                           IOI0iIo1o iOI0iIo1o2 = new IOI0iIo1o(11);
/* 631 */                           iOI0iIo1o2.I00iiI = ooI1iOl0IoI3;
/* 633 */                           VarHandle.storeStoreFence();
/* 636 */                           objI00O0i0ii4 = Ol1llolil.I00000oOI(iOI0iIo1o2);
/* 640 */                           iloI0lOlll1.I00iio(objI00O0i0ii4);
                                }
/* 654 */                       iloI0lOlll1.I00i01iIIliI(1730286052);
/* 658 */                       iloI0lOlll1.I0010I0i(false);
/* 661 */                       int i11 = i9 | 196608;
/* 664 */                       oo0101 = oo01012;
/* 665 */                       iOO0o0I1l = iOO0o0I1l2;
/* 672 */                       ooI1iOl0IoI2 = ooI1iOl0IoI3;
/* 673 */                       i10i1IOOol = i10i1IOOol2;
/* 677 */                       OoI1O1OIoI ooI1O1OIoII0000O = iO1IIloiOoiO.I0000O(ooI1iOl0IoI2, iOOiio0i, iOOiio0iI00000oIO2, ilIoO1ilo1I00000oOI, ooIoOiiO1, iloI0lOlll1, i11);
/* 681 */                       iloI0lOlll1.I0010I0i(false);
/* 684 */                       ooI1O1OIoI = ooI1O1OIoII0000O;
                            } else {
/* 526 */                       iOOiio0i = iOOiio0iI00000oIO;
                            }
/* 535 */                   z10 = true;
/* 538 */                   objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 542 */                   if (!z10) {
/* 550 */                       IOI0iIo1o iOI0iIo1o3 = new IOI0iIo1o(10);
/* 553 */                       iOI0iIo1o3.I00iiI = ooI1iOl0IoI3;
/* 555 */                       VarHandle.storeStoreFence();
/* 558 */                       objI00O0i0ii3 = Ol1llolil.I00000oOI(iOI0iIo1o3);
/* 562 */                       iloI0lOlll1.I00iio(objI00O0i0ii3);
/* 571 */                       iololIo1ooo = (IololIo1ooo) ((OlO01l1oOil) objI00O0i0ii3).getValue();
/* 576 */                       iloI0lOlll1.I00i01iIIliI(-759924327);
/* 586 */                       if (iArr[iololIo1ooo.ordinal()] != 1) {
                                }
/* 593 */                       iloI0lOlll1.I0010I0i(false);
/* 596 */                       IOOiio0i iOOiio0iI00000oIO22 = IOOiio0i.I00000oIO(jI0000O);
/* 615 */                       if (i10 <= 4) {
/* 616 */                           objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 620 */                           if (z11) {
/* 628 */                               IOI0iIo1o iOI0iIo1o22 = new IOI0iIo1o(11);
/* 631 */                               iOI0iIo1o22.I00iiI = ooI1iOl0IoI3;
/* 633 */                               VarHandle.storeStoreFence();
/* 636 */                               objI00O0i0ii4 = Ol1llolil.I00000oOI(iOI0iIo1o22);
/* 640 */                               iloI0lOlll1.I00iio(objI00O0i0ii4);
/* 654 */                               iloI0lOlll1.I00i01iIIliI(1730286052);
/* 658 */                               iloI0lOlll1.I0010I0i(false);
/* 661 */                               int i112 = i9 | 196608;
/* 664 */                               oo0101 = oo01012;
/* 665 */                               iOO0o0I1l = iOO0o0I1l2;
/* 672 */                               ooI1iOl0IoI2 = ooI1iOl0IoI3;
/* 673 */                               i10i1IOOol = i10i1IOOol2;
/* 677 */                               OoI1O1OIoI ooI1O1OIoII0000O2 = iO1IIloiOoiO.I0000O(ooI1iOl0IoI2, iOOiio0i, iOOiio0iI00000oIO22, ilIoO1ilo1I00000oOI, ooIoOiiO1, iloI0lOlll1, i112);
/* 681 */                               iloI0lOlll1.I0010I0i(false);
/* 684 */                               ooI1O1OIoI = ooI1O1OIoII0000O2;
                                    }
                                } else {
/* 616 */                           objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 620 */                           if (z11) {
                                    }
                                }
                            }
                        } else {
/* 686 */                   ooI1iOl0IoI2 = ooI1iOl0IoI;
/* 688 */                   i01O1lIi = i01O1lIi2;
/* 690 */                   oIooliIO0 = oIooliIO02;
/* 692 */                   i10i1IOOol = i10i1IOOol3;
/* 693 */                   oo0101 = oo01012;
/* 694 */                   iOO0o0I1l = iOO0o0I1l2;
/* 696 */                   i2 = 6;
/* 701 */                   iloI0lOlll1.I00i01iIIliI(-601031335);
/* 704 */                   iloI0lOlll1.I0010I0i(false);
/* 707 */                   ooI1O1OIoI = null;
                        }
/* 713 */               IlIoO1ilo1 ilIoO1ilo1I00000oOI2 = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 719 */               int i12 = ((i6 >> 18) & 14) | 384;
/* 730 */               iloI0lOlll1.I00i01iIIliI(1139343725);
/* 734 */               iloI0lOlll1.I0010I0i(false);
/* 737 */               IOOl0ll iOOl0llI0001Ioi1lo2 = IOOiio0i.I0001Ioi1lo(j);
/* 741 */               boolean zI000II2 = iloI0lOlll1.I000II(iOOl0llI0001Ioi1lo2);
/* 745 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 749 */               if (zI000II2 || objI00O0i0ii7 == iOO0o0I1l) {
/* 759 */                   objI00O0i0ii7 = Ooo0ii.I00000oIO(i10i1IOOol, new I10iOo0il1(iOOl0llI0001Ioi1lo2, 2));
/* 763 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 767 */               OoIoOiiO1 ooIoOiiO13 = (OoIoOiiO1) objI00O0i0ii7;
/* 771 */               int i13 = (i12 & 14) | 3072;
/* 777 */               if (ooI1iOl0IoI2.I000OOo1O()) {
/* 858 */                   i3 = i13;
/* 860 */                   z5 = false;
/* 864 */                   iloI0lOlll1.I00i01iIIliI(1666827533);
/* 867 */                   iloI0lOlll1.I0010I0i(false);
/* 870 */                   objI00olI = i01O1lIi.I00olI();
                        } else {
/* 782 */                   iloI0lOlll1.I00i01iIIliI(1666573488);
/* 804 */                   boolean z13 = (((i13 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(ooI1iOl0IoI2)) || (i13 & 6) == 4;
/* 805 */                   objI00olI = iloI0lOlll1.I00O0i0ii();
/* 809 */                   if (z13 || objI00olI == iOO0o0I1l) {
/* 818 */                       ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 829 */                       function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 831 */                       ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
/* 835 */                       i3 = i13;
                                try {
/* 837 */                           Object objI00olI4 = i01O1lIi.I00olI();
/* 841 */                           iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 844 */                           iloI0lOlll1.I00iio(objI00olI4);
/* 847 */                           objI00olI = objI00olI4;
                                } finally {
                                }
                            } else {
/* 814 */                       i3 = i13;
                            }
/* 816 */                   z5 = false;
/* 849 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 879 */               iloI0lOlll1.I00i01iIIliI(1139343725);
/* 882 */               iloI0lOlll1.I0010I0i(z5);
/* 885 */               IOOiio0i iOOiio0iI00000oIO3 = IOOiio0i.I00000oIO(j);
/* 889 */               int i14 = i3 & 14;
/* 891 */               int i15 = i14 ^ 6;
/* 894 */               if (i15 <= 4 || !iloI0lOlll1.I000II(ooI1iOl0IoI2)) {
/* 906 */                   i4 = i14;
/* 910 */                   if ((i3 & 6) != 4) {
/* 914 */                       z6 = false;
                            }
/* 915 */                   objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 919 */                   if (!z6 || objI00O0i0ii == iOO0o0I1l) {
/* 927 */                       IOI0iIo1o iOI0iIo1o4 = new IOI0iIo1o(i2);
/* 930 */                       iOI0iIo1o4.I00iiI = ooI1iOl0IoI2;
/* 932 */                       VarHandle.storeStoreFence();
/* 935 */                       objI00O0i0ii = Ol1llolil.I00000oOI(iOI0iIo1o4);
/* 939 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 953 */                   iloI0lOlll1.I00i01iIIliI(1139343725);
/* 957 */                   iloI0lOlll1.I0010I0i(false);
/* 960 */                   IOOiio0i iOOiio0iI00000oIO4 = IOOiio0i.I00000oIO(j);
/* 981 */                   z7 = (i15 <= 4 && iloI0lOlll1.I000II(ooI1iOl0IoI2)) || (i3 & 6) == 4;
/* 982 */                   objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 986 */                   if (z7 || objI00O0i0ii2 == iOO0o0I1l) {
/* 993 */                       IOI0iIo1o iOI0iIo1o5 = new IOI0iIo1o(7);
/* 996 */                       iOI0iIo1o5.I00iiI = ooI1iOl0IoI2;
/* 998 */                       VarHandle.storeStoreFence();
/* 1001 */                      objI00O0i0ii2 = Ol1llolil.I00000oOI(iOI0iIo1o5);
/* 1005 */                      iloI0lOlll1.I00iio(objI00O0i0ii2);
                            }
/* 1019 */                  iloI0lOlll1.I00i01iIIliI(-1207102280);
/* 1023 */                  iloI0lOlll1.I0010I0i(false);
/* 1029 */                  OoI1O1OIoI ooI1O1OIoII0000O3 = iO1IIloiOoiO.I0000O(ooI1iOl0IoI2, iOOiio0iI00000oIO3, iOOiio0iI00000oIO4, ilIoO1ilo1I00000oOI2, ooIoOiiO13, iloI0lOlll1, i4 | 196608);
/* 1046 */                  fFloatValue = olO01l1oOil == null ? ((Number) olO01l1oOil.getValue()).floatValue() : 1.0f;
/* 1050 */                  olIIi1oIIOlo = oo0lloOiiIOI2.I00000oIO;
/* 1052 */                  olIIi1oIIOlo2 = oo0lloOiiIOI.I00000oIO;
/* 1054 */                  Oo0OO1I1i oo0OO1I1i3 = OlIIii.I0000O;
/* 1056 */                  oo0OO1I1i = olIIi1oIIOlo.I00000oIO;
/* 1058 */                  oo0OO1I1i2 = olIIi1oIIOlo2.I00000oIO;
/* 1060 */                  z8 = oo0OO1I1i instanceof III1lO;
/* 1062 */                  iII1lO = Oo0OIIl1i1.I00000oIO;
/* 1068 */                  if (!z8 || (oo0OO1I1i2 instanceof III1lO)) {
/* 1112 */                      if (z8 || !(oo0OO1I1i2 instanceof III1lO)) {
/* 1200 */                          iII1lO = (Oo0OO1I1i) OlIIii.I00000oOI(oo0OO1I1i, oo0OO1I1i2, fFloatValue);
                                } else {
/* 1118 */                          III1lO iII1lO2 = (III1lO) oo0OO1I1i;
/* 1122 */                          III1lO iII1lO3 = (III1lO) oo0OO1I1i2;
/* 1130 */                          III11l1I iII11l1I = (III11l1I) OlIIii.I00000oOI(iII1lO2.I00000oIO, iII1lO3.I00000oIO, fFloatValue);
/* 1136 */                          float fI00000oOI = l1I1Il.I00000oOI(iII1lO2.I00000oOI, iII1lO3.I00000oOI, fFloatValue);
/* 1140 */                          if (iII11l1I != null) {
/* 1145 */                              if (iII11l1I instanceof OlI00IIlOO) {
/* 1151 */                                  long jI00000oIO = lOl01i0i00.I00000oIO(fI00000oOI, ((OlI00IIlOO) iII11l1I).I00000oIO);
/* 1157 */                                  if (jI00000oIO != 16) {
/* 1161 */                                      iOOli10 = new IOOli10();
/* 1164 */                                      iOOli10.I00000oIO = jI00000oIO;
/* 1166 */                                      if (jI00000oIO == 16) {
/* 1172 */                                          Ioliol.I00000oIO("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                                                }
/* 1168 */                                      VarHandle.storeStoreFence();
/* 1102 */                                      iII1lO = iOOli10;
                                            }
                                        } else {
/* 1178 */                                  if (!(iII11l1I instanceof OioIoiOi)) {
/* 1190 */                                      I000II.I00000oIO();
/* 1193 */                                      return;
                                            }
/* 1184 */                                  iII1lO = new III1lO((OioIoiOi) iII11l1I, fI00000oOI);
                                        }
                                    }
                                }
/* 1109 */                      Oo0OO1I1i oo0OO1I1i4 = iII1lO;
/* 1213 */                      IliO1o11o iliO1o11o = (IliO1o11o) OlIIii.I00000oOI(olIIi1oIIOlo.I0001Ioi1lo, olIIi1oIIOlo2.I0001Ioi1lo, fFloatValue);
/* 1219 */                      long jI0000Il00O = OlIIii.I0000Il00O(fFloatValue, olIIi1oIIOlo.I00000oOI, olIIi1oIIOlo2.I00000oOI);
/* 1223 */                      ililIIiIiO = olIIi1oIIOlo.I0000Il00O;
/* 1225 */                      if (ililIIiIiO == null) {
/* 1227 */                          ililIIiIiO = IlilIIiIiO.I00ioIO;
                                }
/* 1229 */                      ililIIiIiO2 = olIIi1oIIOlo2.I0000Il00O;
/* 1231 */                      if (ililIIiIiO2 == null) {
/* 1233 */                          ililIIiIiO2 = IlilIIiIiO.I00ioIO;
                                }
/* 1252 */                      IlilIIiIiO ililIIiIiO3 = new IlilIIiIiO(lIiioliIlo.I0000Il00O(l1I1Il.I0000Il00O(ililIIiIiO.I00iOIl, ililIIiIiO2.I00iOIl, fFloatValue), 1, 1000));
/* 1265 */                      Ilil10i ilil10i = (Ilil10i) OlIIii.I00000oOI(olIIi1oIIOlo.I0000O, olIIi1oIIOlo2.I0000O, fFloatValue);
/* 1277 */                      Ilil10oOo ilil10oOo = (Ilil10oOo) OlIIii.I00000oOI(olIIi1oIIOlo.I0000oI00, olIIi1oIIOlo2.I0000oI00, fFloatValue);
/* 1289 */                      String str = (String) OlIIii.I00000oOI(olIIi1oIIOlo.I000II, olIIi1oIIOlo2.I000II, fFloatValue);
/* 1297 */                      long jI0000Il00O2 = OlIIii.I0000Il00O(fFloatValue, olIIi1oIIOlo.I000O01llI0, olIIi1oIIOlo2.I000O01llI0);
/* 1301 */                      I1oi0illolii i1oi0illolii = olIIi1oIIOlo.I000OOo1O;
/* 1308 */                      float f = i1oi0illolii != null ? i1oi0illolii.I00000oIO : 0.0f;
/* 1309 */                      I1oi0illolii i1oi0illolii2 = olIIi1oIIOlo2.I000OOo1O;
/* 1317 */                      float fI00000oOI2 = l1I1Il.I00000oOI(f, i1oi0illolii2 != null ? i1oi0illolii2.I00000oIO : 0.0f, fFloatValue);
/* 1321 */                      oo0OOlO0 = olIIi1oIIOlo.I000OiO;
/* 1323 */                      Oo0OOlO0 oo0OOlO03 = Oo0OOlO0.I0000Il00O;
/* 1325 */                      if (oo0OOlO0 == null) {
/* 1327 */                          oo0OOlO0 = oo0OOlO03;
                                }
/* 1328 */                      oo0OOlO02 = olIIi1oIIOlo2.I000OiO;
/* 1330 */                      if (oo0OOlO02 != null) {
/* 1333 */                          oo0OOlO03 = oo0OOlO02;
                                }
/* 1352 */                      Oo0OOlO0 oo0OOlO04 = new Oo0OOlO0(l1I1Il.I00000oOI(oo0OOlO0.I00000oIO, oo0OOlO03.I00000oIO, fFloatValue), l1I1Il.I00000oOI(oo0OOlO0.I00000oOI, oo0OOlO03.I00000oOI, fFloatValue));
/* 1365 */                      O11oiiOIl0O o11oiiOIl0O = (O11oiiOIl0O) OlIIii.I00000oOI(olIIi1oIIOlo.I000iOII, olIIi1oIIOlo2.I000iOII, fFloatValue);
/* 1374 */                      long jI000II = iiO01ll11o1l.I000II(fFloatValue, olIIi1oIIOlo.I000l1, olIIi1oIIOlo2.I000l1);
/* 1388 */                      OlooIOI0O olooIOI0O = (OlooIOI0O) OlIIii.I00000oOI(olIIi1oIIOlo.I000lI, olIIi1oIIOlo2.I000lI, fFloatValue);
/* 1390 */                      oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 1392 */                      oioOII0oI2 = olIIi1oIIOlo2.I000o00OoI0I;
/* 1394 */                      if (oioOII0oI == null && oioOII0oI2 == null) {
/* 1398 */                          oioOII0oII00000oIO = null;
                                } else {
/* 1461 */                          oioOII0oII00000oIO = oioOII0oI != null ? lOI0IIIo.I00000oIO(new OioOII0oI(oioOII0oI2.I0000Il00O, IOOiio0i.I0000Il00O(0.0f, oioOII0oI2.I00000oIO), oioOII0oI2.I00000oOI), oioOII0oI2, fFloatValue) : oioOII0oI2 == null ? lOI0IIIo.I00000oIO(oioOII0oI, new OioOII0oI(oioOII0oI.I0000Il00O, IOOiio0i.I0000Il00O(0.0f, oioOII0oI.I00000oIO), oioOII0oI.I00000oOI), fFloatValue) : lOI0IIIo.I00000oIO(oioOII0oI, oioOII0oI2, fFloatValue);
                                }
/* 1466 */                      oo1o1oi = olIIi1oIIOlo.I000oI1ioi;
/* 1468 */                      OO1O1OI oo1o1oi3 = olIIi1oIIOlo2.I000oI1ioi;
/* 1470 */                      if (oo1o1oi == null || oo1o1oi3 != null) {
/* 1477 */                          if (oo1o1oi == null) {
/* 1479 */                              oo1o1oi = OO1O1OI.I00000oIO;
                                    }
/* 1481 */                          oo1o1oi2 = oo1o1oi;
                                } else {
/* 1474 */                          oo1o1oi2 = null;
                                }
/* 1501 */                      OlIIi1oIIOlo olIIi1oIIOlo3 = new OlIIi1oIIOlo(oo0OO1I1i4, jI0000Il00O, ililIIiIiO3, ilil10i, ilil10oOo, iliO1o11o, str, jI0000Il00O2, I1oi0illolii.I00000oIO(fI00000oOI2), oo0OOlO04, o11oiiOIl0O, jI000II, olooIOI0O, oioOII0oII00000oIO, oo1o1oi2, (Iilloo0IOoIo) OlIIii.I00000oOI(olIIi1oIIOlo.I00100l0, olIIi1oIIOlo2.I00100l0, fFloatValue));
/* 1506 */                      OIoioI0OIiI oIoioI0OIiI = oo0lloOiiIOI2.I00000oOI;
/* 1508 */                      OIoioI0OIiI oIoioI0OIiI2 = oo0lloOiiIOI.I00000oOI;
/* 1510 */                      int i16 = OIoioOil.I00000oOI;
/* 1532 */                      int i17 = ((OloOOIoO1ii1) OlIIii.I00000oOI(OloOOIoO1ii1.I00000oIO(oIoioI0OIiI.I00000oIO), OloOOIoO1ii1.I00000oIO(oIoioI0OIiI2.I00000oIO), fFloatValue)).I00000oIO;
/* 1534 */                      int i18 = oIoioI0OIiI.I00000oOI;
/* 1538 */                      OlooIlII1 olooIlII1 = new OlooIlII1();
/* 1541 */                      olooIlII1.I00000oIO = i18;
/* 1543 */                      VarHandle.storeStoreFence();
/* 1546 */                      int i19 = oIoioI0OIiI2.I00000oOI;
/* 1550 */                      OlooIlII1 olooIlII12 = new OlooIlII1();
/* 1553 */                      olooIlII12.I00000oIO = i19;
/* 1555 */                      VarHandle.storeStoreFence();
/* 1564 */                      int i20 = ((OlooIlII1) OlIIii.I00000oOI(olooIlII1, olooIlII12, fFloatValue)).I00000oIO;
/* 1574 */                      long jI0000Il00O3 = OlIIii.I0000Il00O(fFloatValue, oIoioI0OIiI.I0000Il00O, oIoioI0OIiI2.I0000Il00O);
/* 1578 */                      oo0OOliO01o = oIoioI0OIiI.I0000O;
/* 1580 */                      if (oo0OOliO01o == null) {
/* 1582 */                          oo0OOliO01o = Oo0OOliO01o.I0000Il00O;
                                }
/* 1584 */                      oo0OOliO01o2 = oIoioI0OIiI2.I0000O;
/* 1586 */                      if (oo0OOliO01o2 == null) {
/* 1588 */                          oo0OOliO01o2 = Oo0OOliO01o.I0000Il00O;
                                }
/* 1608 */                      Oo0OOliO01o oo0OOliO01o3 = new Oo0OOliO01o(OlIIii.I0000Il00O(fFloatValue, oo0OOliO01o.I00000oIO, oo0OOliO01o2.I00000oIO), OlIIii.I0000Il00O(fFloatValue, oo0OOliO01o.I00000oOI, oo0OOliO01o2.I00000oOI));
/* 1611 */                      oO1Il0I1 = oIoioI0OIiI.I0000oI00;
/* 1613 */                      oO1Il0I12 = oIoioI0OIiI2.I0000oI00;
/* 1615 */                      if (oO1Il0I1 == null || oO1Il0I12 != null) {
/* 1622 */                          OO1Il0I1 oO1Il0I14 = OO1Il0I1.I0000Il00O;
/* 1624 */                          if (oO1Il0I1 == null) {
/* 1626 */                              oO1Il0I1 = oO1Il0I14;
                                    }
/* 1627 */                          boolean z14 = oO1Il0I1.I00000oIO;
/* 1629 */                          if (oO1Il0I12 == null) {
/* 1631 */                              oO1Il0I12 = oO1Il0I14;
                                    }
/* 1632 */                          boolean z15 = oO1Il0I12.I00000oIO;
/* 1679 */                          oO1Il0I13 = z14 != z15 ? oO1Il0I1 : new OO1Il0I1(((IioolI0lo0il) OlIIii.I00000oOI(IioolI0lo0il.I00000oIO(oO1Il0I1.I00000oOI), IioolI0lo0il.I00000oIO(oO1Il0I12.I00000oOI), fFloatValue)).I00000oIO, ((Boolean) OlIIii.I00000oOI(Boolean.valueOf(z14), Boolean.valueOf(z15), fFloatValue)).booleanValue());
                                } else {
/* 1619 */                          oO1Il0I13 = null;
                                }
/* 1694 */                      O0oo0I00 o0oo0I00 = (O0oo0I00) OlIIii.I00000oOI(oIoioI0OIiI.I0001Ioi1lo, oIoioI0OIiI2.I0001Ioi1lo, fFloatValue);
/* 1696 */                      int i21 = oIoioI0OIiI.I000II;
/* 1700 */                      O0olI0Oiili o0olI0Oiili = new O0olI0Oiili();
/* 1703 */                      o0olI0Oiili.I00000oIO = i21;
/* 1705 */                      VarHandle.storeStoreFence();
/* 1708 */                      int i22 = oIoioI0OIiI2.I000II;
/* 1712 */                      O0olI0Oiili o0olI0Oiili2 = new O0olI0Oiili();
/* 1715 */                      o0olI0Oiili2.I00000oIO = i22;
/* 1717 */                      VarHandle.storeStoreFence();
/* 1726 */                      int i23 = ((O0olI0Oiili) OlIIii.I00000oOI(o0olI0Oiili, o0olI0Oiili2, fFloatValue)).I00000oIO;
/* 1728 */                      int i24 = oIoioI0OIiI.I000O01llI0;
/* 1732 */                      IoOiIO ioOiIO = new IoOiIO();
/* 1735 */                      ioOiIO.I00000oIO = i24;
/* 1737 */                      VarHandle.storeStoreFence();
/* 1740 */                      int i25 = oIoioI0OIiI2.I000O01llI0;
/* 1744 */                      IoOiIO ioOiIO2 = new IoOiIO();
/* 1747 */                      ioOiIO2.I00000oIO = i25;
/* 1749 */                      VarHandle.storeStoreFence();
/* 1783 */                      Oo0lloOiiIOI oo0lloOiiIOI3 = new Oo0lloOiiIOI(olIIi1oIIOlo3, new OIoioI0OIiI(i17, i20, jI0000Il00O3, oo0OOliO01o3, oO1Il0I13, o0oo0I00, i23, ((IoOiIO) OlIIii.I00000oOI(ioOiIO, ioOiIO2, fFloatValue)).I00000oIO, (Oo0l0I) OlIIii.I00000oOI(oIoioI0OIiI.I000OOo1O, oIoioI0OIiI2.I000OOo1O, fFloatValue)));
/* 1825 */                      Oo0lloOiiIOI oo0lloOiiIOII00000oOI = !z4 ? Oo0lloOiiIOI.I00000oOI(oo0lloOiiIOI3, ((IOOiio0i) ooI1O1OIoI.I00l0OO0IO.getValue()).I00000oIO, 0L, null, null, 0L, 0L, null, 16777214) : oo0lloOiiIOI3;
/* 1835 */                      long j4 = ((IOOiio0i) ooI1O1OIoII0000O3.I00l0OO0IO.getValue()).I00000oIO;
/* 1840 */                      Oo00iIooiI oo00iIooiI = new Oo00iIooiI(0);
/* 1843 */                      oo00iIooiI.I00iiI = function3;
/* 1845 */                      oo00iIooiI.I00iiO = oo0101;
/* 1847 */                      VarHandle.storeStoreFence();
/* 1863 */                      I0000O(j4, oo0lloOiiIOII00000oOI, iiioOl1O.I00000oOI(57043598, oo00iIooiI, iloI0lOlll1), iloI0lOlll1, 384);
                            } else {
/* 1082 */                      long jI000II2 = iiO01ll11o1l.I000II(fFloatValue, oo0OO1I1i.I00000oIO(), oo0OO1I1i2.I00000oIO());
/* 1088 */                      if (jI000II2 != 16) {
/* 1092 */                          iOOli10 = new IOOli10();
/* 1095 */                          iOOli10.I00000oIO = jI000II2;
/* 1097 */                          if (jI000II2 == 16) {
/* 1105 */                              Ioliol.I00000oIO("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                                    }
/* 1099 */                          VarHandle.storeStoreFence();
/* 1102 */                          iII1lO = iOOli10;
                                }
/* 1109 */                      Oo0OO1I1i oo0OO1I1i42 = iII1lO;
/* 1213 */                      IliO1o11o iliO1o11o2 = (IliO1o11o) OlIIii.I00000oOI(olIIi1oIIOlo.I0001Ioi1lo, olIIi1oIIOlo2.I0001Ioi1lo, fFloatValue);
/* 1219 */                      long jI0000Il00O4 = OlIIii.I0000Il00O(fFloatValue, olIIi1oIIOlo.I00000oOI, olIIi1oIIOlo2.I00000oOI);
/* 1223 */                      ililIIiIiO = olIIi1oIIOlo.I0000Il00O;
/* 1225 */                      if (ililIIiIiO == null) {
                                }
/* 1229 */                      ililIIiIiO2 = olIIi1oIIOlo2.I0000Il00O;
/* 1231 */                      if (ililIIiIiO2 == null) {
                                }
/* 1252 */                      IlilIIiIiO ililIIiIiO32 = new IlilIIiIiO(lIiioliIlo.I0000Il00O(l1I1Il.I0000Il00O(ililIIiIiO.I00iOIl, ililIIiIiO2.I00iOIl, fFloatValue), 1, 1000));
/* 1265 */                      Ilil10i ilil10i2 = (Ilil10i) OlIIii.I00000oOI(olIIi1oIIOlo.I0000O, olIIi1oIIOlo2.I0000O, fFloatValue);
/* 1277 */                      Ilil10oOo ilil10oOo2 = (Ilil10oOo) OlIIii.I00000oOI(olIIi1oIIOlo.I0000oI00, olIIi1oIIOlo2.I0000oI00, fFloatValue);
/* 1289 */                      String str2 = (String) OlIIii.I00000oOI(olIIi1oIIOlo.I000II, olIIi1oIIOlo2.I000II, fFloatValue);
/* 1297 */                      long jI0000Il00O22 = OlIIii.I0000Il00O(fFloatValue, olIIi1oIIOlo.I000O01llI0, olIIi1oIIOlo2.I000O01llI0);
/* 1301 */                      I1oi0illolii i1oi0illolii3 = olIIi1oIIOlo.I000OOo1O;
/* 1308 */                      if (i1oi0illolii3 != null) {
                                }
/* 1309 */                      I1oi0illolii i1oi0illolii22 = olIIi1oIIOlo2.I000OOo1O;
/* 1317 */                      float fI00000oOI22 = l1I1Il.I00000oOI(f, i1oi0illolii22 != null ? i1oi0illolii22.I00000oIO : 0.0f, fFloatValue);
/* 1321 */                      oo0OOlO0 = olIIi1oIIOlo.I000OiO;
/* 1323 */                      Oo0OOlO0 oo0OOlO032 = Oo0OOlO0.I0000Il00O;
/* 1325 */                      if (oo0OOlO0 == null) {
                                }
/* 1328 */                      oo0OOlO02 = olIIi1oIIOlo2.I000OiO;
/* 1330 */                      if (oo0OOlO02 != null) {
                                }
/* 1352 */                      Oo0OOlO0 oo0OOlO042 = new Oo0OOlO0(l1I1Il.I00000oOI(oo0OOlO0.I00000oIO, oo0OOlO032.I00000oIO, fFloatValue), l1I1Il.I00000oOI(oo0OOlO0.I00000oOI, oo0OOlO032.I00000oOI, fFloatValue));
/* 1365 */                      O11oiiOIl0O o11oiiOIl0O2 = (O11oiiOIl0O) OlIIii.I00000oOI(olIIi1oIIOlo.I000iOII, olIIi1oIIOlo2.I000iOII, fFloatValue);
/* 1374 */                      long jI000II3 = iiO01ll11o1l.I000II(fFloatValue, olIIi1oIIOlo.I000l1, olIIi1oIIOlo2.I000l1);
/* 1388 */                      OlooIOI0O olooIOI0O2 = (OlooIOI0O) OlIIii.I00000oOI(olIIi1oIIOlo.I000lI, olIIi1oIIOlo2.I000lI, fFloatValue);
/* 1390 */                      oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 1392 */                      oioOII0oI2 = olIIi1oIIOlo2.I000o00OoI0I;
/* 1394 */                      if (oioOII0oI == null) {
/* 1461 */                          oioOII0oII00000oIO = oioOII0oI != null ? lOI0IIIo.I00000oIO(new OioOII0oI(oioOII0oI2.I0000Il00O, IOOiio0i.I0000Il00O(0.0f, oioOII0oI2.I00000oIO), oioOII0oI2.I00000oOI), oioOII0oI2, fFloatValue) : oioOII0oI2 == null ? lOI0IIIo.I00000oIO(oioOII0oI, new OioOII0oI(oioOII0oI.I0000Il00O, IOOiio0i.I0000Il00O(0.0f, oioOII0oI.I00000oIO), oioOII0oI.I00000oOI), fFloatValue) : lOI0IIIo.I00000oIO(oioOII0oI, oioOII0oI2, fFloatValue);
/* 1466 */                          oo1o1oi = olIIi1oIIOlo.I000oI1ioi;
/* 1468 */                          OO1O1OI oo1o1oi32 = olIIi1oIIOlo2.I000oI1ioi;
/* 1470 */                          if (oo1o1oi == null) {
/* 1477 */                              if (oo1o1oi == null) {
                                        }
/* 1481 */                              oo1o1oi2 = oo1o1oi;
/* 1501 */                              OlIIi1oIIOlo olIIi1oIIOlo32 = new OlIIi1oIIOlo(oo0OO1I1i42, jI0000Il00O4, ililIIiIiO32, ilil10i2, ilil10oOo2, iliO1o11o2, str2, jI0000Il00O22, I1oi0illolii.I00000oIO(fI00000oOI22), oo0OOlO042, o11oiiOIl0O2, jI000II3, olooIOI0O2, oioOII0oII00000oIO, oo1o1oi2, (Iilloo0IOoIo) OlIIii.I00000oOI(olIIi1oIIOlo.I00100l0, olIIi1oIIOlo2.I00100l0, fFloatValue));
/* 1506 */                              OIoioI0OIiI oIoioI0OIiI3 = oo0lloOiiIOI2.I00000oOI;
/* 1508 */                              OIoioI0OIiI oIoioI0OIiI22 = oo0lloOiiIOI.I00000oOI;
/* 1510 */                              int i162 = OIoioOil.I00000oOI;
/* 1532 */                              int i172 = ((OloOOIoO1ii1) OlIIii.I00000oOI(OloOOIoO1ii1.I00000oIO(oIoioI0OIiI3.I00000oIO), OloOOIoO1ii1.I00000oIO(oIoioI0OIiI22.I00000oIO), fFloatValue)).I00000oIO;
/* 1534 */                              int i182 = oIoioI0OIiI3.I00000oOI;
/* 1538 */                              OlooIlII1 olooIlII13 = new OlooIlII1();
/* 1541 */                              olooIlII13.I00000oIO = i182;
/* 1543 */                              VarHandle.storeStoreFence();
/* 1546 */                              int i192 = oIoioI0OIiI22.I00000oOI;
/* 1550 */                              OlooIlII1 olooIlII122 = new OlooIlII1();
/* 1553 */                              olooIlII122.I00000oIO = i192;
/* 1555 */                              VarHandle.storeStoreFence();
/* 1564 */                              int i202 = ((OlooIlII1) OlIIii.I00000oOI(olooIlII13, olooIlII122, fFloatValue)).I00000oIO;
/* 1574 */                              long jI0000Il00O32 = OlIIii.I0000Il00O(fFloatValue, oIoioI0OIiI3.I0000Il00O, oIoioI0OIiI22.I0000Il00O);
/* 1578 */                              oo0OOliO01o = oIoioI0OIiI3.I0000O;
/* 1580 */                              if (oo0OOliO01o == null) {
                                        }
/* 1584 */                              oo0OOliO01o2 = oIoioI0OIiI22.I0000O;
/* 1586 */                              if (oo0OOliO01o2 == null) {
                                        }
/* 1608 */                              Oo0OOliO01o oo0OOliO01o32 = new Oo0OOliO01o(OlIIii.I0000Il00O(fFloatValue, oo0OOliO01o.I00000oIO, oo0OOliO01o2.I00000oIO), OlIIii.I0000Il00O(fFloatValue, oo0OOliO01o.I00000oOI, oo0OOliO01o2.I00000oOI));
/* 1611 */                              oO1Il0I1 = oIoioI0OIiI3.I0000oI00;
/* 1613 */                              oO1Il0I12 = oIoioI0OIiI22.I0000oI00;
/* 1615 */                              if (oO1Il0I1 == null) {
/* 1622 */                                  OO1Il0I1 oO1Il0I142 = OO1Il0I1.I0000Il00O;
/* 1624 */                                  if (oO1Il0I1 == null) {
                                            }
/* 1627 */                                  boolean z142 = oO1Il0I1.I00000oIO;
/* 1629 */                                  if (oO1Il0I12 == null) {
                                            }
/* 1632 */                                  boolean z152 = oO1Il0I12.I00000oIO;
/* 1679 */                                  if (z142 != z152) {
                                            }
/* 1694 */                                  O0oo0I00 o0oo0I002 = (O0oo0I00) OlIIii.I00000oOI(oIoioI0OIiI3.I0001Ioi1lo, oIoioI0OIiI22.I0001Ioi1lo, fFloatValue);
/* 1696 */                                  int i212 = oIoioI0OIiI3.I000II;
/* 1700 */                                  O0olI0Oiili o0olI0Oiili3 = new O0olI0Oiili();
/* 1703 */                                  o0olI0Oiili3.I00000oIO = i212;
/* 1705 */                                  VarHandle.storeStoreFence();
/* 1708 */                                  int i222 = oIoioI0OIiI22.I000II;
/* 1712 */                                  O0olI0Oiili o0olI0Oiili22 = new O0olI0Oiili();
/* 1715 */                                  o0olI0Oiili22.I00000oIO = i222;
/* 1717 */                                  VarHandle.storeStoreFence();
/* 1726 */                                  int i232 = ((O0olI0Oiili) OlIIii.I00000oOI(o0olI0Oiili3, o0olI0Oiili22, fFloatValue)).I00000oIO;
/* 1728 */                                  int i242 = oIoioI0OIiI3.I000O01llI0;
/* 1732 */                                  IoOiIO ioOiIO3 = new IoOiIO();
/* 1735 */                                  ioOiIO3.I00000oIO = i242;
/* 1737 */                                  VarHandle.storeStoreFence();
/* 1740 */                                  int i252 = oIoioI0OIiI22.I000O01llI0;
/* 1744 */                                  IoOiIO ioOiIO22 = new IoOiIO();
/* 1747 */                                  ioOiIO22.I00000oIO = i252;
/* 1749 */                                  VarHandle.storeStoreFence();
/* 1783 */                                  Oo0lloOiiIOI oo0lloOiiIOI32 = new Oo0lloOiiIOI(olIIi1oIIOlo32, new OIoioI0OIiI(i172, i202, jI0000Il00O32, oo0OOliO01o32, oO1Il0I13, o0oo0I002, i232, ((IoOiIO) OlIIii.I00000oOI(ioOiIO3, ioOiIO22, fFloatValue)).I00000oIO, (Oo0l0I) OlIIii.I00000oOI(oIoioI0OIiI3.I000OOo1O, oIoioI0OIiI22.I000OOo1O, fFloatValue)));
/* 1825 */                                  if (!z4) {
                                            }
/* 1835 */                                  long j42 = ((IOOiio0i) ooI1O1OIoII0000O3.I00l0OO0IO.getValue()).I00000oIO;
/* 1840 */                                  Oo00iIooiI oo00iIooiI2 = new Oo00iIooiI(0);
/* 1843 */                                  oo00iIooiI2.I00iiI = function3;
/* 1845 */                                  oo00iIooiI2.I00iiO = oo0101;
/* 1847 */                                  VarHandle.storeStoreFence();
/* 1863 */                                  I0000O(j42, oo0lloOiiIOII00000oOI, iiioOl1O.I00000oOI(57043598, oo00iIooiI2, iloI0lOlll1), iloI0lOlll1, 384);
                                        }
                                    }
                                }
                            }
                        } else {
/* 903 */                   i4 = i14;
                        }
/* 912 */               z6 = true;
/* 915 */               objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 919 */               if (!z6) {
/* 927 */                   IOI0iIo1o iOI0iIo1o42 = new IOI0iIo1o(i2);
/* 930 */                   iOI0iIo1o42.I00iiI = ooI1iOl0IoI2;
/* 932 */                   VarHandle.storeStoreFence();
/* 935 */                   objI00O0i0ii = Ol1llolil.I00000oOI(iOI0iIo1o42);
/* 939 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
/* 953 */                   iloI0lOlll1.I00i01iIIliI(1139343725);
/* 957 */                   iloI0lOlll1.I0010I0i(false);
/* 960 */                   IOOiio0i iOOiio0iI00000oIO42 = IOOiio0i.I00000oIO(j);
/* 981 */                   if (i15 <= 4) {
/* 982 */                       objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 986 */                       if (z7) {
/* 993 */                           IOI0iIo1o iOI0iIo1o52 = new IOI0iIo1o(7);
/* 996 */                           iOI0iIo1o52.I00iiI = ooI1iOl0IoI2;
/* 998 */                           VarHandle.storeStoreFence();
/* 1001 */                          objI00O0i0ii2 = Ol1llolil.I00000oOI(iOI0iIo1o52);
/* 1005 */                          iloI0lOlll1.I00iio(objI00O0i0ii2);
/* 1019 */                          iloI0lOlll1.I00i01iIIliI(-1207102280);
/* 1023 */                          iloI0lOlll1.I0010I0i(false);
/* 1029 */                          OoI1O1OIoI ooI1O1OIoII0000O32 = iO1IIloiOoiO.I0000O(ooI1iOl0IoI2, iOOiio0iI00000oIO3, iOOiio0iI00000oIO42, ilIoO1ilo1I00000oOI2, ooIoOiiO13, iloI0lOlll1, i4 | 196608);
/* 1046 */                          if (olO01l1oOil == null) {
                                    }
/* 1050 */                          olIIi1oIIOlo = oo0lloOiiIOI2.I00000oIO;
/* 1052 */                          olIIi1oIIOlo2 = oo0lloOiiIOI.I00000oIO;
/* 1054 */                          Oo0OO1I1i oo0OO1I1i32 = OlIIii.I0000O;
/* 1056 */                          oo0OO1I1i = olIIi1oIIOlo.I00000oIO;
/* 1058 */                          oo0OO1I1i2 = olIIi1oIIOlo2.I00000oIO;
/* 1060 */                          z8 = oo0OO1I1i instanceof III1lO;
/* 1062 */                          iII1lO = Oo0OIIl1i1.I00000oIO;
/* 1068 */                          if (z8) {
/* 1112 */                              if (z8) {
/* 1200 */                                  iII1lO = (Oo0OO1I1i) OlIIii.I00000oOI(oo0OO1I1i, oo0OO1I1i2, fFloatValue);
/* 1109 */                                  Oo0OO1I1i oo0OO1I1i422 = iII1lO;
/* 1213 */                                  IliO1o11o iliO1o11o22 = (IliO1o11o) OlIIii.I00000oOI(olIIi1oIIOlo.I0001Ioi1lo, olIIi1oIIOlo2.I0001Ioi1lo, fFloatValue);
/* 1219 */                                  long jI0000Il00O42 = OlIIii.I0000Il00O(fFloatValue, olIIi1oIIOlo.I00000oOI, olIIi1oIIOlo2.I00000oOI);
/* 1223 */                                  ililIIiIiO = olIIi1oIIOlo.I0000Il00O;
/* 1225 */                                  if (ililIIiIiO == null) {
                                            }
/* 1229 */                                  ililIIiIiO2 = olIIi1oIIOlo2.I0000Il00O;
/* 1231 */                                  if (ililIIiIiO2 == null) {
                                            }
/* 1252 */                                  IlilIIiIiO ililIIiIiO322 = new IlilIIiIiO(lIiioliIlo.I0000Il00O(l1I1Il.I0000Il00O(ililIIiIiO.I00iOIl, ililIIiIiO2.I00iOIl, fFloatValue), 1, 1000));
/* 1265 */                                  Ilil10i ilil10i22 = (Ilil10i) OlIIii.I00000oOI(olIIi1oIIOlo.I0000O, olIIi1oIIOlo2.I0000O, fFloatValue);
/* 1277 */                                  Ilil10oOo ilil10oOo22 = (Ilil10oOo) OlIIii.I00000oOI(olIIi1oIIOlo.I0000oI00, olIIi1oIIOlo2.I0000oI00, fFloatValue);
/* 1289 */                                  String str22 = (String) OlIIii.I00000oOI(olIIi1oIIOlo.I000II, olIIi1oIIOlo2.I000II, fFloatValue);
/* 1297 */                                  long jI0000Il00O222 = OlIIii.I0000Il00O(fFloatValue, olIIi1oIIOlo.I000O01llI0, olIIi1oIIOlo2.I000O01llI0);
/* 1301 */                                  I1oi0illolii i1oi0illolii32 = olIIi1oIIOlo.I000OOo1O;
/* 1308 */                                  if (i1oi0illolii32 != null) {
                                            }
/* 1309 */                                  I1oi0illolii i1oi0illolii222 = olIIi1oIIOlo2.I000OOo1O;
/* 1317 */                                  float fI00000oOI222 = l1I1Il.I00000oOI(f, i1oi0illolii222 != null ? i1oi0illolii222.I00000oIO : 0.0f, fFloatValue);
/* 1321 */                                  oo0OOlO0 = olIIi1oIIOlo.I000OiO;
/* 1323 */                                  Oo0OOlO0 oo0OOlO0322 = Oo0OOlO0.I0000Il00O;
/* 1325 */                                  if (oo0OOlO0 == null) {
                                            }
/* 1328 */                                  oo0OOlO02 = olIIi1oIIOlo2.I000OiO;
/* 1330 */                                  if (oo0OOlO02 != null) {
                                            }
/* 1352 */                                  Oo0OOlO0 oo0OOlO0422 = new Oo0OOlO0(l1I1Il.I00000oOI(oo0OOlO0.I00000oIO, oo0OOlO0322.I00000oIO, fFloatValue), l1I1Il.I00000oOI(oo0OOlO0.I00000oOI, oo0OOlO0322.I00000oOI, fFloatValue));
/* 1365 */                                  O11oiiOIl0O o11oiiOIl0O22 = (O11oiiOIl0O) OlIIii.I00000oOI(olIIi1oIIOlo.I000iOII, olIIi1oIIOlo2.I000iOII, fFloatValue);
/* 1374 */                                  long jI000II32 = iiO01ll11o1l.I000II(fFloatValue, olIIi1oIIOlo.I000l1, olIIi1oIIOlo2.I000l1);
/* 1388 */                                  OlooIOI0O olooIOI0O22 = (OlooIOI0O) OlIIii.I00000oOI(olIIi1oIIOlo.I000lI, olIIi1oIIOlo2.I000lI, fFloatValue);
/* 1390 */                                  oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 1392 */                                  oioOII0oI2 = olIIi1oIIOlo2.I000o00OoI0I;
/* 1394 */                                  if (oioOII0oI == null) {
                                            }
                                        }
                                    }
                                }
                            } else {
/* 982 */                       objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 986 */                       if (z7) {
                                }
                            }
                        }
                    } else {
/* 1867 */              iloI0lOlll1.I00OilO00Il();
                    }
/* 1870 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1874 */          if (oOloioIlI001IO000 != null) {
/* 1879 */              Oo00lI oo00lI = new Oo00lI(0);
/* 1884 */              oo00lI.I00li1OI = olO01l1oOil;
/* 1888 */              oo00lI.I00iiI = oloooOlO10oI;
/* 1892 */              oo00lI.I00iiO = z;
/* 1896 */              oo00lI.I00iio = z2;
/* 1900 */              oo00lI.I00ilI0I1 = z3;
/* 1904 */              oo00lI.I00ilO0 = z4;
/* 1908 */              oo00lI.I00io1l = ooI1iOl0IoI;
/* 1912 */              oo00lI.I00ioIO = oo0lloOiiIOI;
/* 1916 */              oo00lI.I00l0I0l0lO1 = oo0lloOiiIOI2;
/* 1918 */              oo00lI.I00l0OO0IO = function3;
/* 1920 */              VarHandle.storeStoreFence();
/* 1923 */              oOloioIlI001IO000.I0000O = oo00lI;
                    }
                }

                public static final void I0000O(long j, Oo0lloOiiIOI oo0lloOiiIOI, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
                    long j2;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    IlliIl1l11O illiIl1l11O2;
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(396611577);
/* 28 */            int i2 = (iloI0lOlll1.I0001Ioi1lo(j) ? 4 : 2) | i | (iloI0lOlll1.I000II(oo0lloOiiIOI) ? 32 : 16);
/* 31 */            if ((i & 384) == 0) {
/* 44 */                i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 49 */            int i3 = 1;
/* 61 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 65 */                j2 = j;
/* 66 */                oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 67 */                illiIl1l11O2 = illiIl1l11O;
/* 68 */                iloI0lOlll12 = iloI0lOlll1;
/* 69 */                lIOi11I01oo.I00000oIO(j2, oo0lloOiiIOI2, illiIl1l11O2, iloI0lOlll12, i2 & 1022);
                    } else {
/* 73 */                j2 = j;
/* 74 */                oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 75 */                illiIl1l11O2 = illiIl1l11O;
/* 76 */                iloI0lOlll12 = iloI0lOlll1;
/* 77 */                iloI0lOlll12.I00OilO00Il();
                    }
/* 80 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 84 */            if (oOloioIlI001IO000 != null) {
/* 88 */                OOiIiiIioiO oOiIiiIioiO = new OOiIiiIioiO(i3);
/* 91 */                oOiIiiIioiO.I00iiI = j2;
/* 93 */                oOiIiiIioiO.I00iiO = oo0lloOiiIOI2;
/* 95 */                oOiIiiIioiO.I00iio = illiIl1l11O2;
/* 97 */                oOiIiiIioiO.I00ilI0I1 = i;
/* 99 */                VarHandle.storeStoreFence();
/* 102 */               oOloioIlI001IO000.I0000O = oOiIiiIioiO;
                    }
                }

                public static final void I0000oI00(long j, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(590397809);
/* 11 */            int i2 = 4;
/* 29 */            int i3 = i | (iloI0lOlll1.I0001Ioi1lo(j) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16);
/* 45 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 62 */                iiliio0o.I00000oIO(IOoIioIOoolI.I00000oIO.I00000oIO(IOOiio0i.I00000oIO(j)), illiIl1l11O, iloI0lOlll1, (i3 & 112) | 8);
                    } else {
/* 66 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 69 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 73 */            if (oOloioIlI001IO000 != null) {
/* 77 */                IOI1oIil1 iOI1oIil1 = new IOI1oIil1(i2);
/* 80 */                iOI1oIil1.I00iiI = j;
/* 82 */                iOI1oIil1.I00iiO = illiIl1l11O;
/* 84 */                VarHandle.storeStoreFence();
/* 87 */                oOloioIlI001IO000.I0000O = iOI1oIil1;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:241:0x04ca  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x04d1  */
                /* JADX WARN: Removed duplicated region for block: B:248:0x0511  */
                /* JADX WARN: Removed duplicated region for block: B:249:0x0515  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0001Ioi1lo(IlliIl1l11O illiIl1l11O, CharSequence charSequence, IlliIl1l11O illiIl1l11O2, Function3 function3, IlliIl1l11O illiIl1l11O3, IlliIl1l11O illiIl1l11O4, IlliIl1l11O illiIl1l11O5, IlliIl1l11O illiIl1l11O6, boolean z, lOl0oo lol0oo, Oo010l1I oo010l1I, Oo010l1I oo010l1I2, Oo010l1I oo010l1I3, IOii1l iOii1l, IlliIl1l11O illiIl1l11O7, OIo1Oi1l1lI oIo1Oi1l1lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    Oo010l1I oo010l1I4;
                    Oo010l1I oo010l1I5;
                    IOii1l iOii1l2;
                    IlliIl1l11O illiIl1l11O8;
                    CharSequence charSequence2;
                    IlliIl1l11O illiIl1l11O9;
                    IlliIl1l11O illiIl1l11O10;
                    O0iOOoiioO o0iOOoiioO;
                    II0O01li0 iI0O01li0;
                    Object obj;
                    boolean z2;
                    IlliIl1l11O illiIl1l11O11;
                    IOioOOi0I iOioOOi0I;
                    II0O01li0 iI0O01li02;
                    O1ooIo101ll o1ooIo101ll;
                    boolean z3;
                    Oo010l1I oo010l1I6;
                    boolean z4;
                    int i5;
                    Object obj2;
                    boolean zI000OOo1O;
                    boolean zI000OOo1O2;
/* 1 */             II0O01li0 iI0O01li03 = i1O01oOIoI0I.I00io1l;
                    II0O01li0 iI0O01li04 = i1O01oOIoI0I.I00iiO;
                    iloI0lOlll1.I00i0O(908032139);
                    int i6 = i & 6;
                    O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
                    if (i6 == 0) {
                        i3 = i | (iloI0lOlll1.I000II(o1ooIo101ll2) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16;
                    }
                    int i7 = i & 384;
                    int i8 = Barcode.FORMAT_ITF;
                    if (i7 == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(charSequence) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    int i9 = i & 3072;
                    int i10 = Barcode.FORMAT_UPC_E;
                    if (i9 == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? Barcode.FORMAT_PDF417 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(function3) ? 16384 : 8192;
                    }
                    if ((i & 196608) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O4) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O5) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O6) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= iloI0lOlll1.I000O01llI0(z) ? 536870912 : 268435456;
                    }
                    int i11 = i3;
                    if ((i2 & 6) == 0) {
                        i4 = i2 | (iloI0lOlll1.I000II(lol0oo) ? 4 : 2);
                    } else {
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= (i2 & 64) == 0 ? iloI0lOlll1.I000II(oo010l1I) : iloI0lOlll1.I000OOo1O(oo010l1I) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        if ((i2 & Barcode.FORMAT_UPC_A) == 0) {
                            oo010l1I4 = oo010l1I2;
                            zI000OOo1O2 = iloI0lOlll1.I000II(oo010l1I4);
                        } else {
                            oo010l1I4 = oo010l1I2;
                            zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oo010l1I4);
                        }
                        if (zI000OOo1O2) {
                            i8 = Barcode.FORMAT_QR_CODE;
                        }
                        i4 |= i8;
                    } else {
                        oo010l1I4 = oo010l1I2;
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i2 & Barcode.FORMAT_AZTEC) == 0) {
                            oo010l1I5 = oo010l1I3;
                            zI000OOo1O = iloI0lOlll1.I000II(oo010l1I5);
                        } else {
                            oo010l1I5 = oo010l1I3;
                            zI000OOo1O = iloI0lOlll1.I000OOo1O(oo010l1I5);
                        }
                        if (zI000OOo1O) {
                            i10 = Barcode.FORMAT_PDF417;
                        }
                        i4 |= i10;
                    } else {
                        oo010l1I5 = oo010l1I3;
                    }
                    if ((i2 & 24576) == 0) {
                        iOii1l2 = iOii1l;
                        i4 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? 16384 : 8192;
                    } else {
                        iOii1l2 = iOii1l;
                    }
                    if ((i2 & 196608) == 0) {
                        i4 |= iloI0lOlll1.I000OOo1O(illiIl1l11O7) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i4 |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? 1048576 : 524288;
                    }
                    int i12 = i4;
                    if (iloI0lOlll1.I00OIl(i11 & 1, ((i11 & 306783379) == 306783378 && (599187 & i12) == 599186) ? false : true)) {
/* 2 */                 float fI000OOo1O = I000OOo1O(iloI0lOlll1);
                        int i13 = i12 & 112;
/* 6 */                 boolean zI0000O = ((3670016 & i12) == 1048576) | ((i11 & 1879048192) == 536870912) | ((i12 & 14) == 4) | (i13 == 32 || ((i12 & 64) != 0 && iloI0lOlll1.I000II(oo010l1I))) | ((i12 & 896) == 256 || ((i12 & Barcode.FORMAT_UPC_A) != 0 && iloI0lOlll1.I000II(oo010l1I4))) | ((i12 & 7168) == 2048 || ((i12 & Barcode.FORMAT_AZTEC) != 0 && iloI0lOlll1.I000II(oo010l1I5))) | iloI0lOlll1.I0000O(fI000OOo1O);
/* 7 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 8 */                 Object obj3 = IOl11li.I00000oIO;
                        Object obj4 = objI00O0i0ii;
                        if (zI0000O || objI00O0i0ii == obj3) {
/* 10 */                    Oo01oiIlool oo01oiIlool = new Oo01oiIlool();
/* 11 */                    oo01oiIlool.I00000oIO = z;
/* 12 */                    oo01oiIlool.I00000oOI = lol0oo;
/* 13 */                    oo01oiIlool.I0000Il00O = oo010l1I;
/* 14 */                    oo01oiIlool.I0000O = oo010l1I4;
/* 15 */                    oo01oiIlool.I0000oI00 = oo010l1I5;
/* 16 */                    oo01oiIlool.I0001Ioi1lo = oIo1Oi1l1lI;
/* 17 */                    oo01oiIlool.I000II = fI000OOo1O;
/* 18 */                    VarHandle.storeStoreFence();
/* 19 */                    iloI0lOlll1.I00iio(oo01oiIlool);
                            obj4 = oo01oiIlool;
                        }
/* 20 */                Oo01oiIlool oo01oiIlool2 = (Oo01oiIlool) obj4;
/* 23 */                O0iOOoiioO o0iOOoiioO2 = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 25 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 26 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 27 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll2);
/* 28 */                IOl0oi0lOl1.I000lI.getClass();
/* 29 */                iloI0lOlll1.I00i0oil();
/* 30 */                boolean z5 = iloI0lOlll1.I00O10llo;
/* 31 */                IllOOo00lI illOOo00lI = O0iiOioolIi.I01101IOlO;
                        if (z5) {
/* 32 */                    iloI0lOlll1.I000l1(illOOo00lI);
                        } else {
/* 33 */                    iloI0lOlll1.I00io1l();
                        }
/* 34 */                IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00io1l;
/* 35 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oo01oiIlool2);
/* 36 */                IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ilO0;
/* 37 */                li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI);
/* 38 */                Integer numValueOf = Integer.valueOf(iHashCode);
/* 39 */                IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ioIO;
/* 40 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, numValueOf);
/* 41 */                li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 42 */                IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
/* 43 */                li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 44 */                iOii1l2.invoke(iloI0lOlll1, Integer.valueOf((i12 >> 12) & 14));
                        if (illiIl1l11O3 != null) {
/* 45 */                    iloI0lOlll1.I00i01iIIliI(-556998400);
/* 46 */                    O1ooiI111i o1ooiI111iI00000oOI = iIoIOo00o.I00000oOI(o1ooIo101ll2, "Leading");
                            IoI110lO0O ioI110lO0O = IooiioIo.I00000oIO;
/* 47 */                    O1ooiI111i o1ooiI111iI0000O = o1ooiI111iI00000oOI.I0000O(O1lolo0IO.I00000oIO);
                            iI0O01li0 = iI0O01li03;
                            obj = obj3;
/* 48 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 50 */                    int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 51 */                    OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 52 */                    O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O);
/* 53 */                    iloI0lOlll1.I00i0oil();
                            o0iOOoiioO = o0iOOoiioO2;
/* 54 */                    if (iloI0lOlll1.I00O10llo) {
/* 55 */                        iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 56 */                        iloI0lOlll1.I00io1l();
                            }
/* 57 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 58 */                    li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI2);
/* 59 */                    IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 60 */                    li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 61 */                    illiIl1l11O3.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 15) & 14));
/* 62 */                    iloI0lOlll1.I0010I0i(true);
                            z2 = false;
/* 63 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
                            o0iOOoiioO = o0iOOoiioO2;
                            iI0O01li0 = iI0O01li03;
                            obj = obj3;
                            z2 = false;
/* 64 */                    iloI0lOlll1.I00i01iIIliI(-556752384);
/* 65 */                    iloI0lOlll1.I0010I0i(false);
                        }
                        if (illiIl1l11O4 != null) {
/* 66 */                    iloI0lOlll1.I00i01iIIliI(-556709666);
/* 67 */                    O1ooiI111i o1ooiI111iI00000oOI2 = iIoIOo00o.I00000oOI(o1ooIo101ll2, "Trailing");
                            IoI110lO0O ioI110lO0O2 = IooiioIo.I00000oIO;
/* 68 */                    O1ooiI111i o1ooiI111iI0000O2 = o1ooiI111iI00000oOI2.I0000O(O1lolo0IO.I00000oIO);
/* 69 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, z2);
/* 71 */                    int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 72 */                    OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 73 */                    O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O2);
/* 74 */                    iloI0lOlll1.I00i0oil();
/* 75 */                    if (iloI0lOlll1.I00O10llo) {
/* 76 */                        iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 77 */                        iloI0lOlll1.I00io1l();
                            }
/* 78 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O2);
/* 79 */                    li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI3);
/* 80 */                    IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 81 */                    li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 82 */                    illiIl1l11O4.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 18) & 14));
/* 83 */                    iloI0lOlll1.I0010I0i(true);
/* 84 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 85 */                    iloI0lOlll1.I00i01iIIliI(-556461728);
/* 86 */                    iloI0lOlll1.I0010I0i(z2);
                        }
                        O0iOOoiioO o0iOOoiioO3 = o0iOOoiioO;
/* 87 */                float fI0000O = iO01II.I0000O(oIo1Oi1l1lI, o0iOOoiioO3);
/* 88 */                float fI0000Il00O = iO01II.I0000Il00O(oIo1Oi1l1lI, o0iOOoiioO3);
/* 89 */                float fI000OiO = I000OiO(iloI0lOlll1);
                        if (illiIl1l11O3 != null) {
                            fI0000O -= fI000OiO;
                            if (fI0000O < 0.0f) {
                                fI0000O = 0.0f;
                            }
                        }
                        float f = fI0000O;
                        if (illiIl1l11O4 != null) {
                            fI0000Il00O -= fI000OiO;
                            if (fI0000Il00O < 0.0f) {
                                fI0000Il00O = 0.0f;
                            }
                        }
                        float f2 = fI0000Il00O;
                        if (illiIl1l11O5 != null) {
/* 90 */                    iloI0lOlll1.I00i01iIIliI(-555685333);
/* 94 */                    O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(iIoIOo00o.I00000oOI(o1ooIo101ll2, "Prefix"), 24.0f, 0.0f, 2)), f, 0.0f, 2.0f, 0.0f, 10);
                            iI0O01li02 = iI0O01li04;
/* 95 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O3 = II1oOI10.I0000Il00O(iI0O01li02, false);
                            iOioOOi0I = iOioOOi0I5;
/* 97 */                    int iHashCode4 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 98 */                    OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll1.I000lI();
/* 99 */                    O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 100 */                   iloI0lOlll1.I00i0oil();
/* 101 */                   if (iloI0lOlll1.I00O10llo) {
/* 102 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 103 */                       iloI0lOlll1.I00io1l();
                            }
/* 104 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O3);
/* 105 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI4);
/* 106 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 107 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O4);
                            illiIl1l11O11 = illiIl1l11O5;
/* 108 */                   illiIl1l11O11.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 21) & 14));
/* 109 */                   iloI0lOlll1.I0010I0i(true);
/* 110 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
                            illiIl1l11O11 = illiIl1l11O5;
                            iOioOOi0I = iOioOOi0I5;
                            iI0O01li02 = iI0O01li04;
/* 111 */                   iloI0lOlll1.I00i01iIIliI(-555357632);
/* 112 */                   iloI0lOlll1.I0010I0i(false);
                        }
                        if (illiIl1l11O6 != null) {
/* 113 */                   iloI0lOlll1.I00i01iIIliI(-555314387);
/* 117 */                   O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(iIoIOo00o.I00000oOI(o1ooIo101ll2, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
/* 118 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O4 = II1oOI10.I0000Il00O(iI0O01li02, false);
                            o1ooIo101ll = o1ooIo101ll2;
/* 120 */                   int iHashCode5 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 121 */                   OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll1.I000lI();
/* 122 */                   O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO2);
/* 123 */                   iloI0lOlll1.I00i0oil();
/* 124 */                   if (iloI0lOlll1.I00O10llo) {
/* 125 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 126 */                       iloI0lOlll1.I00io1l();
                            }
/* 127 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O4);
/* 128 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI5);
/* 129 */                   IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 130 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O5);
/* 131 */                   illiIl1l11O6.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 24) & 14));
/* 132 */                   iloI0lOlll1.I0010I0i(true);
/* 133 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
                            o1ooIo101ll = o1ooIo101ll2;
/* 134 */                   iloI0lOlll1.I00i01iIIliI(-554988608);
/* 135 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 136 */               O1ooiI111i o1ooiI111iI000OiO3 = iO01II.I000OiO(o1ooIo101ll, f, 0.0f, f2, 0.0f, 10);
                        O1ooIo101ll o1ooIo101ll3 = o1ooIo101ll;
                        if (illiIl1l11O2 != null) {
/* 137 */                   iloI0lOlll1.I00i01iIIliI(-554488733);
/* 138 */                   O1ooiI111i o1ooiI111iI00000oOI3 = iIoIOo00o.I00000oOI(o1ooIo101ll3, "Label");
                            if (i13 != 32) {
                                if ((i12 & 64) != 0) {
                                    oo010l1I6 = oo010l1I;
/* 139 */                           if (iloI0lOlll1.I000OOo1O(oo010l1I6)) {
                                    }
/* 140 */                           Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                    if (z4 || objI00O0i0ii2 == obj) {
                                        i5 = 1;
/* 141 */                               Oo00IiOIOiOl oo00IiOIOiOl = new Oo00IiOIOiOl(1);
                                        oo00IiOIOiOl.I00iiI = oo010l1I6;
                                        VarHandle.storeStoreFence();
/* 142 */                               iloI0lOlll1.I00iio(oo00IiOIOiOl);
                                        obj2 = oo00IiOIOiOl;
                                    } else {
                                        i5 = 1;
                                        obj2 = objI00O0i0ii2;
                                    }
/* 144 */                           Io0IOoOo io0IOoOo = new Io0IOoOo(i5);
/* 143 */                           io0IOoOo.I00iiI = (IllOOo00lI) obj2;
                                    VarHandle.storeStoreFence();
/* 146 */                           O1ooiI111i o1ooiI111iI0000O3 = Ol0iOOO0.I0010o(iIoIo1lll0lI.I00000oIO(o1ooiI111iI00000oOI3, io0IOoOo)).I0000O(o1ooiI111iI000OiO3);
/* 147 */                           O1iOIl0o10 o1iOIl0o10I0000Il00O5 = II1oOI10.I0000Il00O(iI0O01li02, false);
/* 149 */                           int iHashCode6 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 150 */                           OO0lO0l0 oO0lO0l0I000lI6 = iloI0lOlll1.I000lI();
/* 151 */                           O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O3);
/* 152 */                           iloI0lOlll1.I00i0oil();
/* 153 */                           if (iloI0lOlll1.I00O10llo) {
/* 155 */                               iloI0lOlll1.I00io1l();
                                    } else {
/* 154 */                               iloI0lOlll1.I000l1(illOOo00lI);
                                    }
/* 156 */                           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O5);
/* 157 */                           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI6);
/* 158 */                           IIl001iO0Io.I001IIilI0O(iHashCode6, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 159 */                           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O6);
                                    illiIl1l11O9 = illiIl1l11O2;
/* 160 */                           illiIl1l11O9.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 9) & 14));
/* 161 */                           iloI0lOlll1.I0010I0i(true);
/* 162 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
                                    oo010l1I6 = oo010l1I;
                                }
                                z4 = false;
/* 140 */                       Object objI00O0i0ii22 = iloI0lOlll1.I00O0i0ii();
                                if (z4) {
                                    i5 = 1;
/* 141 */                           Oo00IiOIOiOl oo00IiOIOiOl2 = new Oo00IiOIOiOl(1);
                                    oo00IiOIOiOl2.I00iiI = oo010l1I6;
                                    VarHandle.storeStoreFence();
/* 142 */                           iloI0lOlll1.I00iio(oo00IiOIOiOl2);
                                    obj2 = oo00IiOIOiOl2;
/* 144 */                           Io0IOoOo io0IOoOo2 = new Io0IOoOo(i5);
/* 143 */                           io0IOoOo2.I00iiI = (IllOOo00lI) obj2;
                                    VarHandle.storeStoreFence();
/* 146 */                           O1ooiI111i o1ooiI111iI0000O32 = Ol0iOOO0.I0010o(iIoIo1lll0lI.I00000oIO(o1ooiI111iI00000oOI3, io0IOoOo2)).I0000O(o1ooiI111iI000OiO3);
/* 147 */                           O1iOIl0o10 o1iOIl0o10I0000Il00O52 = II1oOI10.I0000Il00O(iI0O01li02, false);
/* 149 */                           int iHashCode62 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 150 */                           OO0lO0l0 oO0lO0l0I000lI62 = iloI0lOlll1.I000lI();
/* 151 */                           O1ooiI111i o1ooiI111iI0000Il00O62 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O32);
/* 152 */                           iloI0lOlll1.I00i0oil();
/* 153 */                           if (iloI0lOlll1.I00O10llo) {
                                    }
/* 156 */                           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O52);
/* 157 */                           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI62);
/* 158 */                           IIl001iO0Io.I001IIilI0O(iHashCode62, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 159 */                           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O62);
                                    illiIl1l11O9 = illiIl1l11O2;
/* 160 */                           illiIl1l11O9.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 9) & 14));
/* 161 */                           iloI0lOlll1.I0010I0i(true);
/* 162 */                           iloI0lOlll1.I0010I0i(false);
                                }
                            } else {
                                oo010l1I6 = oo010l1I;
                            }
                            z4 = true;
/* 140 */                   Object objI00O0i0ii222 = iloI0lOlll1.I00O0i0ii();
                            if (z4) {
                            }
                        } else {
                            illiIl1l11O9 = illiIl1l11O2;
/* 163 */                   iloI0lOlll1.I00i01iIIliI(-554091840);
/* 164 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 167 */               O1ooiI111i o1ooiI111iI000OiO4 = iO01II.I000OiO(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(o1ooIo101ll3, 24.0f, 0.0f, 2)), illiIl1l11O11 == null ? f : 0.0f, 0.0f, illiIl1l11O6 == null ? f2 : 0.0f, 0.0f, 10);
                        if (function3 != null) {
/* 168 */                   iloI0lOlll1.I00i01iIIliI(-553721855);
/* 169 */                   function3.invoke(iIoIOo00o.I00000oOI(o1ooIo101ll3, "Hint").I0000O(o1ooiI111iI000OiO4), iloI0lOlll1, Integer.valueOf((i11 >> 9) & 112));
/* 170 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 171 */                   iloI0lOlll1.I00i01iIIliI(-553630560);
/* 172 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 173 */               O1ooiI111i o1ooiI111iI00000oOI4 = iIoIOo00o.I00000oOI(o1ooIo101ll3, "TextField");
                        boolean z6 = (illiIl1l11O11 == null && illiIl1l11O6 == null) ? false : true;
                        charSequence2 = charSequence;
/* 175 */               O1ooiI111i o1ooiI111iI0000O4 = I000iOII(o1ooiI111iI00000oOI4, charSequence2, z6).I0000O(o1ooiI111iI000OiO4);
/* 176 */               O1iOIl0o10 o1iOIl0o10I0000Il00O6 = II1oOI10.I0000Il00O(iI0O01li02, true);
/* 178 */               int iHashCode7 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 179 */               OO0lO0l0 oO0lO0l0I000lI7 = iloI0lOlll1.I000lI();
/* 180 */               O1ooiI111i o1ooiI111iI0000Il00O7 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O4);
/* 181 */               iloI0lOlll1.I00i0oil();
/* 182 */               if (iloI0lOlll1.I00O10llo) {
/* 183 */                   iloI0lOlll1.I000l1(illOOo00lI);
                        } else {
/* 184 */                   iloI0lOlll1.I00io1l();
                        }
/* 185 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O6);
/* 186 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI7);
/* 187 */               IIl001iO0Io.I001IIilI0O(iHashCode7, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 188 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O7);
                        illiIl1l11O8 = illiIl1l11O;
/* 189 */               illiIl1l11O8.invoke(iloI0lOlll1, Integer.valueOf((i11 >> 3) & 14));
/* 190 */               iloI0lOlll1.I0010I0i(true);
                        if (illiIl1l11O7 != null) {
/* 191 */                   iloI0lOlll1.I00i01iIIliI(-553246997);
/* 197 */                   O1ooiI111i o1ooiI111iI0000oI00 = iO01II.I0000oI00(Ol0iOOO0.I0010o(Ol0iOOO0.I000OOo1O(iIoIOo00o.I00000oOI(o1ooIo101ll3, "Supporting"), 16.0f, 0.0f, 2)), new OIo1i1(16.0f, 4.0f, 16.0f, 0.0f));
/* 198 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O7 = II1oOI10.I0000Il00O(iI0O01li02, false);
/* 200 */                   int iHashCode8 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 201 */                   OO0lO0l0 oO0lO0l0I000lI8 = iloI0lOlll1.I000lI();
/* 202 */                   O1ooiI111i o1ooiI111iI0000Il00O8 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI00);
/* 203 */                   iloI0lOlll1.I00i0oil();
/* 204 */                   if (iloI0lOlll1.I00O10llo) {
/* 205 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 206 */                       iloI0lOlll1.I00io1l();
                            }
/* 207 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O7);
/* 208 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI8);
/* 209 */                   IIl001iO0Io.I001IIilI0O(iHashCode8, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 210 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O8);
                            illiIl1l11O10 = illiIl1l11O7;
/* 211 */                   illiIl1l11O10.invoke(iloI0lOlll1, Integer.valueOf((i12 >> 15) & 14));
                            z3 = true;
/* 212 */                   iloI0lOlll1.I0010I0i(true);
/* 213 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
                            illiIl1l11O10 = illiIl1l11O7;
                            z3 = true;
/* 214 */                   iloI0lOlll1.I00i01iIIliI(-552857792);
/* 215 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 216 */               iloI0lOlll1.I0010I0i(z3);
                    } else {
                        illiIl1l11O8 = illiIl1l11O;
                        charSequence2 = charSequence;
                        illiIl1l11O9 = illiIl1l11O2;
                        illiIl1l11O10 = illiIl1l11O7;
/* 217 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 218 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        Oo00oOOl0IoO oo00oOOl0IoO = new Oo00oOOl0IoO();
                        oo00oOOl0IoO.I00iOIl = illiIl1l11O8;
                        oo00oOOl0IoO.I00iiI = charSequence2;
                        oo00oOOl0IoO.I00iiO = illiIl1l11O9;
                        oo00oOOl0IoO.I00iio = function3;
                        oo00oOOl0IoO.I00ilI0I1 = illiIl1l11O3;
                        oo00oOOl0IoO.I00ilO0 = illiIl1l11O4;
                        oo00oOOl0IoO.I00io1l = illiIl1l11O5;
                        oo00oOOl0IoO.I00ioIO = illiIl1l11O6;
                        oo00oOOl0IoO.I00l0I0l0lO1 = z;
                        oo00oOOl0IoO.I00l0OO0IO = lol0oo;
                        oo00oOOl0IoO.I00li1OI = oo010l1I;
                        oo00oOOl0IoO.I00ll1 = oo010l1I2;
                        oo00oOOl0IoO.I00lli11 = oo010l1I3;
                        oo00oOOl0IoO.I00lll10 = iOii1l;
                        oo00oOOl0IoO.I00o0iI0io1 = illiIl1l11O10;
                        oo00oOOl0IoO.I00o0l1o1o0 = oIo1Oi1l1lI;
                        oo00oOOl0IoO.I00o101lO = i;
                        oo00oOOl0IoO.I00oI0i = i2;
                        VarHandle.storeStoreFence();
/* 219 */               oOloioIlI001IO000.I0000O = oo00oOOl0IoO;
                    }
                }

                public static final I0iol11I1OI I000II(lOl0oo lol0oo) {
/* 3 */             if (lol0oo instanceof Oo01ii01) {
/* 7 */                 return ((Oo01ii01) lol0oo).I00000oOI;
                    }
/* 12 */            if (lol0oo instanceof Oo01iOI) {
/* 14 */                return i1O01oOIoI0I.I00o0iI0io1;
                    }
/* 19 */            IioIoO10iOiI.I000OiO("Unknown position: ", lol0oo);
/* 22 */            return null;
                }

                public static final I0iol11I1OI I000O01llI0(lOl0oo lol0oo) {
/* 3 */             if (lol0oo instanceof Oo01ii01) {
/* 7 */                 return ((Oo01ii01) lol0oo).I00000oIO;
                    }
/* 12 */            if (lol0oo instanceof Oo01iOI) {
/* 14 */                return i1O01oOIoI0I.I00o0iI0io1;
                    }
/* 19 */            IioIoO10iOiI.I000OiO("Unknown position: ", lol0oo);
/* 22 */            return null;
                }

                public static final float I000OOo1O(IloI0lOlll1 iloI0lOlll1) {
/* 15 */            long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000l1.I00000oOI.I0000Il00O;
/* 17 */            long j2 = OoOii0lOol.I000l1;
/* 32 */            if ((1095216660480L & j) != 4294967296L) {
/* 35 */                j = j2;
                    }
/* 50 */            return ((IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0)).I001lIiIIo1O(j) / 2.0f;
                }

                public static final float I000OiO(IloI0lOlll1 iloI0lOlll1) {
/* 9 */             float f = ((Iil1010O) iloI0lOlll1.I000iOII(IooiioIo.I0000Il00O)).I00iOIl;
/* 16 */            if (Float.isNaN(f)) {
/* 18 */                f = 0.0f;
                    }
/* 24 */            float f2 = (f - Ol11ooiiI11.I0000Il00O) / 2.0f;
/* 27 */            if (f2 < 0.0f) {
/* 15 */                return 0.0f;
                    }
/* 77 */            return f2;
                }

                public static final O1ooiI111i I000iOII(O1ooiI111i o1ooiI111i, CharSequence charSequence, boolean z) {
/* 1 */             O1ooiI111i o1ooiI111iI00000oOI = O1ooIo101ll.I00000oIO;
/* 3 */             if (z && charSequence.length() > 0) {
/* 15 */                Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(8);
/* 18 */                ol1OiIli00Ii.I00iiI = charSequence;
/* 20 */                VarHandle.storeStoreFence();
/* 24 */                o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oOI, false, ol1OiIli00Ii);
                    }
/* 28 */            return o1ooiI111i.I0000O(o1ooiI111iI00000oOI);
                }
            }

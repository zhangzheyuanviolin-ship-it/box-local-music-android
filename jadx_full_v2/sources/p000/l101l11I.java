            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l101l11I {
                /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x04b1  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x04c7  */
                /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, O0o0I1i0O o0o0I1i0O, OIo1Oi1l1lI oIo1Oi1l1lI, boolean z, IlOIll0o11Ii ilOIll0o11Ii, boolean z2, I0o1iIoolIi i0o1iIoolIi, I0iol11I1OI i0iol11I1OI, I1IioI1l10 i1IioI1l10, II0O000iIl iI0O000iIl, I1IiiOO0i0io i1IiiOO0i0io, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i, int i2, int i3) {
                    int i4;
                    I0iol11I1OI i0iol11I1OI2;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    IlOIll0o11Ii ilOIll0o11Ii2;
                    I0o1iIoolIi i0o1iIoolIi2;
                    O1ooiI111i o1ooiI111i2;
                    O0o0I1i0O o0o0I1i0O2;
                    I1IioI1l10 i1IioI1l102;
                    II0O000iIl iI0O000iIl2;
                    I1IiiOO0i0io i1IiiOO0i0io2;
                    I0iol11I1OI i0iol11I1OI3;
                    OOloioIl oOloioIlI001IO000;
                    I1IioI1l10 i1IioI1l103;
                    int i10;
                    I0iol11I1OI i0iol11I1OI4;
                    II0O000iIl iI0O000iIl3;
                    I1IiiOO0i0io i1IiiOO0i0io3;
                    boolean z3;
                    O1ooiI111i o1ooiI111iI00000oIO;
                    boolean z4 = z2;
/* 1 */             iloI0lOlll1.I00i0O(924924659);
                    if ((i & 6) == 0) {
                        i4 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
                        i4 = i;
                    }
                    if ((i & 48) == 0) {
                        i4 |= iloI0lOlll1.I000II(o0o0I1i0O) ? 32 : 16;
                    }
                    int i11 = i & 384;
                    int i12 = Barcode.FORMAT_ITF;
                    if (i11 == 0) {
                        i4 |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    int i13 = i & 3072;
                    int i14 = Barcode.FORMAT_UPC_E;
                    if (i13 == 0) {
                        i4 |= iloI0lOlll1.I000O01llI0(false) ? Barcode.FORMAT_PDF417 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i4 |= iloI0lOlll1.I000O01llI0(z) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i4 |= iloI0lOlll1.I000II(ilOIll0o11Ii) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= iloI0lOlll1.I000O01llI0(z4) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i4 |= iloI0lOlll1.I000II(i0o1iIoolIi) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= 33554432;
                    }
                    int i15 = i3 & Barcode.FORMAT_UPC_A;
                    if (i15 != 0) {
                        i4 |= 805306368;
                        i0iol11I1OI2 = i0iol11I1OI;
                    } else {
                        i0iol11I1OI2 = i0iol11I1OI;
                        if ((i & 805306368) == 0) {
                            i4 |= iloI0lOlll1.I000II(i0iol11I1OI2) ? 536870912 : 268435456;
                        }
                    }
                    int i16 = i3 & Barcode.FORMAT_UPC_E;
                    if (i16 != 0) {
                        i6 = i2 | 6;
                        i5 = i4;
                    } else if ((i2 & 6) == 0) {
                        i5 = i4;
                        i6 = i2 | (iloI0lOlll1.I000II(i1IioI1l10) ? 4 : 2);
                    } else {
                        i5 = i4;
                        i6 = i2;
                    }
                    int i17 = i3 & Barcode.FORMAT_PDF417;
                    if (i17 != 0) {
                        i6 |= 48;
                        i7 = i17;
                    } else if ((i2 & 48) == 0) {
                        i7 = i17;
                        i6 |= iloI0lOlll1.I000II(iI0O000iIl) ? 32 : 16;
                    } else {
                        i7 = i17;
                    }
                    int i18 = i6;
                    int i19 = i3 & Barcode.FORMAT_AZTEC;
                    if (i19 == 0) {
                        i8 = i18;
                        if ((i2 & 384) == 0) {
                            if (iloI0lOlll1.I000II(i1IiiOO0i0io)) {
                                i12 = Barcode.FORMAT_QR_CODE;
                            }
                            i8 |= i12;
                        }
                        if ((i2 & 3072) == 0) {
                            if (iloI0lOlll1.I000OOo1O(function1)) {
                                i14 = Barcode.FORMAT_PDF417;
                            }
                            i8 |= i14;
                        }
                        i9 = i8;
                        if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 306783379) == 306783378 || (i9 & 1171) != 1170)) {
                            ilOIll0o11Ii2 = ilOIll0o11Ii;
                            i0o1iIoolIi2 = i0o1iIoolIi;
                            o1ooiI111i2 = o1ooiI111i;
                            o0o0I1i0O2 = o0o0I1i0O;
/* 95 */                    iloI0lOlll1.I00OilO00Il();
                            i1IioI1l102 = i1IioI1l10;
                            iI0O000iIl2 = iI0O000iIl;
                            i1IiiOO0i0io2 = i1IiiOO0i0io;
                            i0iol11I1OI3 = i0iol11I1OI2;
                        } else {
                            iloI0lOlll1.I00Ol00();
                            if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
                                int i20 = i5 & (-234881025);
                                if (i15 != 0) {
                                    i0iol11I1OI2 = null;
                                }
                                i1IioI1l103 = i16 != 0 ? null : i1IioI1l10;
                                i10 = i20;
                                i0iol11I1OI4 = i0iol11I1OI2;
                                iI0O000iIl3 = i7 != 0 ? null : iI0O000iIl;
                                i1IiiOO0i0io3 = i19 != 0 ? null : i1IiiOO0i0io;
                            } else {
/* 2 */                         iloI0lOlll1.I00OilO00Il();
                                i1IioI1l103 = i1IioI1l10;
                                i1IiiOO0i0io3 = i1IiiOO0i0io;
                                i10 = i5 & (-234881025);
                                i0iol11I1OI4 = i0iol11I1OI2;
                                iI0O000iIl3 = iI0O000iIl;
                            }
                            iloI0lOlll1.I0010o();
                            int i21 = i10 >> 3;
                            int i22 = i21 & 14;
                            int i23 = i22 | ((i9 >> 6) & 112);
/* 3 */                     OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(function1, iloI0lOlll1);
/* 4 */                     boolean z5 = (((i23 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(o0o0I1i0O)) || (i23 & 6) == 4;
/* 5 */                     Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            boolean z6 = z5;
/* 6 */                     Object obj = IOl11li.I00000oIO;
                            if (z6 || objI00O0i0ii == obj) {
/* 8 */                         O0l11l1iOO o0l11l1iOO = new O0l11l1iOO();
/* 11 */                        o0l11l1iOO.I00000oIO = new OIooi1iOiOol(Integer.MAX_VALUE);
/* 14 */                        o0l11l1iOO.I00000oOI = new OIooi1iOiOol(Integer.MAX_VALUE);
/* 15 */                        IOO0o0I1l iOO0o0I1l = IOO0o0I1l.I00ilI0I1;
/* 16 */                        O0loollioliO o0loollioliO = new O0loollioliO(0);
                                o0loollioliO.I00iiI = oI10i0IlI00000oOI;
                                VarHandle.storeStoreFence();
/* 17 */                        IOO000ilo iOO000ilo = Ol1llolil.I00000oIO;
/* 18 */                        IiO0o1I iiO0o1I = new IiO0o1I(o0loollioliO, iOO0o0I1l);
/* 19 */                        I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(24);
                                i0iI0O1IoIoI.I00iiI = iiO0o1I;
                                i0iI0O1IoIoI.I00iiO = o0o0I1i0O;
                                i0iI0O1IoIoI.I00iio = o0l11l1iOO;
                                VarHandle.storeStoreFence();
/* 21 */                        objI00O0i0ii = new O0l0IOol0(0, 2, OlO01l1oOil.class, new IiO0o1I(i0iI0O1IoIoI, iOO0o0I1l), "value", "getValue()Ljava/lang/Object;");
/* 23 */                        iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 24 */                    O0Iooi01 o0Iooi01 = (O0Iooi01) objI00O0i0ii;
                            int i24 = i10 >> 9;
                            int i25 = i22 | (i24 & 112);
/* 25 */                    boolean z7 = ((((i25 & 112) ^ 48) > 32 && iloI0lOlll1.I000O01llI0(z)) || (i25 & 48) == 32) | ((((i25 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(o0o0I1i0O)) || (i25 & 6) == 4);
/* 26 */                    Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            Object obj2 = objI00O0i0ii2;
                            if (z7 || objI00O0i0ii2 == obj) {
/* 28 */                        O0lo1OiliO o0lo1OiliO = new O0lo1OiliO();
/* 29 */                        o0lo1OiliO.I00000oOI = o0o0I1i0O;
                                o0lo1OiliO.I0000Il00O = z;
/* 30 */                        O0lo0o o0lo0o = new O0lo0o(0);
                                o0lo0o.I00iiI = o0o0I1i0O;
                                VarHandle.storeStoreFence();
/* 32 */                        o0lo1OiliO.I00000oIO = Ol1llolil.I00000oOI(o0lo0o);
/* 33 */                        VarHandle.storeStoreFence();
/* 34 */                        iloI0lOlll1.I00iio(o0lo1OiliO);
                                obj2 = o0lo1OiliO;
                            }
/* 35 */                    O0lo0l o0lo0l = (O0lo0l) obj2;
/* 36 */                    Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                            if (objI00O0i0ii3 == obj) {
/* 37 */                        objI00O0i0ii3 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 38 */                        iloI0lOlll1.I00iio(objI00O0i0ii3);
                            }
/* 39 */                    Ii0110 ii0110 = (Ii0110) objI00O0i0ii3;
/* 42 */                    Io10IIII io10IIII = (Io10IIII) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000II);
/* 46 */                    liIoOiiO1Oi liiooiio1oi = ((Boolean) iloI0lOlll1.I000iOII(IOlO0o100i1i.I001i1lo1io)).booleanValue() ? null : OlO1oilO0o0I.I00000oIO;
                            int i26 = i10 & 112;
                            int i27 = i9 << 18;
                            int i28 = (i10 & 65520) | (i24 & 3670016) | (i27 & 29360128) | (i27 & 234881024) | ((i9 << 27) & 1879048192);
/* 57 */                    boolean zI0000oI00 = ((((i28 & 112) ^ 48) > 32 && iloI0lOlll1.I000II(o0o0I1i0O)) || (i28 & 48) == 32) | ((((i28 & 896) ^ 384) > 256 && iloI0lOlll1.I000II(oIo1Oi1l1lI)) || (i28 & 384) == 256) | ((((i28 & 7168) ^ 3072) > 2048 && iloI0lOlll1.I000O01llI0(false)) || (i28 & 3072) == 2048) | ((((57344 & i28) ^ 24576) > 16384 && iloI0lOlll1.I000O01llI0(z)) || (i28 & 24576) == 16384) | iloI0lOlll1.I0000oI00(0) | ((((i28 & 3670016) ^ 1572864) > 1048576 && iloI0lOlll1.I000II(i0iol11I1OI4)) || (i28 & 1572864) == 1048576) | ((((i28 & 29360128) ^ 12582912) > 8388608 && iloI0lOlll1.I000II(iI0O000iIl3)) || (i28 & 12582912) == 8388608) | ((((i28 & 234881024) ^ 100663296) > 67108864 && iloI0lOlll1.I000II(i1IiiOO0i0io3)) || (i28 & 100663296) == 67108864) | ((((i28 & 1879048192) ^ 805306368) > 536870912 && iloI0lOlll1.I000II(i1IioI1l103)) || (i28 & 805306368) == 536870912) | iloI0lOlll1.I000II(io10IIII) | iloI0lOlll1.I000II(liiooiio1oi);
/* 58 */                    Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                            Object obj3 = objI00O0i0ii4;
                            if (zI0000oI00 || objI00O0i0ii4 == obj) {
/* 60 */                        O0o001o o0o001o = new O0o001o();
                                o0o001o.I00000oIO = o0o0I1i0O;
                                o0o001o.I00000oOI = z;
                                o0o001o.I0000Il00O = oIo1Oi1l1lI;
                                o0o001o.I0000O = o0Iooi01;
                                o0o001o.I0000oI00 = i1IioI1l103;
                                o0o001o.I0001Ioi1lo = i1IiiOO0i0io3;
                                o0o001o.I000II = ii0110;
                                o0o001o.I000O01llI0 = io10IIII;
                                o0o001o.I000OOo1O = liiooiio1oi;
                                o0o001o.I000OiO = i0iol11I1OI4;
                                o0o001o.I000iOII = iI0O000iIl3;
/* 61 */                        VarHandle.storeStoreFence();
/* 62 */                        iloI0lOlll1.I00iio(o0o001o);
                                obj3 = o0o001o;
                            }
/* 63 */                    O0liioil o0liioil = (O0liioil) obj3;
/* 64 */                    OIilII oIilII = z ? OIilII.I00iOIl : OIilII.I00iiI;
                            if (z2) {
/* 65 */                        iloI0lOlll1.I00i01iIIliI(-2077147368);
/* 66 */                        boolean zI0000oI002 = iloI0lOlll1.I0000oI00(0) | ((((i21 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(o0o0I1i0O)) || (i21 & 6) == 4);
/* 67 */                        Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                                Object obj4 = objI00O0i0ii5;
                                if (zI0000oI002 || objI00O0i0ii5 == obj) {
/* 69 */                            O0loO1OIoI o0loO1OIoI = new O0loO1OIoI();
                                    o0loO1OIoI.I00000oIO = o0o0I1i0O;
/* 70 */                            VarHandle.storeStoreFence();
/* 71 */                            iloI0lOlll1.I00iio(o0loO1OIoI);
                                    obj4 = o0loO1OIoI;
                                }
/* 74 */                        o1ooiI111iI00000oIO = iIoIoOi00.I00000oIO((O0loO1OIoI) obj4, o0o0I1i0O.I00100l0, oIilII);
                                z3 = false;
/* 75 */                        iloI0lOlll1.I0010I0i(false);
                            } else {
                                z3 = false;
/* 76 */                        iloI0lOlll1.I00i01iIIliI(-2076718545);
/* 77 */                        iloI0lOlll1.I0010I0i(false);
/* 78 */                        o1ooiI111iI00000oIO = O1ooIo101ll.I00000oIO;
                            }
                            if (i26 == 32) {
                                z3 = true;
                            }
/* 79 */                    Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii6;
                            if (z3 || objI00O0i0ii6 == obj) {
/* 80 */                        O0lo0o o0lo0o2 = new O0lo0o(1);
                                o0lo0o2.I00iiI = o0o0I1i0O;
                                VarHandle.storeStoreFence();
/* 81 */                        iloI0lOlll1.I00iio(o0lo0o2);
                                obj5 = o0lo0o2;
                            }
/* 82 */                    OlO1oOlIl01 olO1oOlIl01I00000oIO = l0oloiiool0l.I00000oIO(z, (IllOOo00lI) obj5, iloI0lOlll1, i24 & 126);
                            o1ooiI111i2 = o1ooiI111i;
/* 90 */                    O1ooiI111i o1ooiI111iI00000oIO2 = iIoO1101ooO1.I00000oIO(iIoOIl1il.I00000oIO(o1ooiI111i2.I0000O(o0o0I1i0O.I000lI).I0000O(o0o0I1i0O.I000o00OoI0I), o0Iooi01, o0lo0l, oIilII, z2).I0000O(o1ooiI111iI00000oIO), o0o0I1i0O.I000oI1ioi);
                            iI0O000iIl2 = iI0O000iIl3;
                            I1IiiOO0i0io i1IiiOO0i0io4 = i1IiiOO0i0io3;
                            i0iol11I1OI3 = i0iol11I1OI4;
                            i1IioI1l102 = i1IioI1l103;
                            o0o0I1i0O2 = o0o0I1i0O;
/* 94 */                    l0oolIloOO.I00000oIO(o0Iooi01, iO0lIo11i11O.I00000oIO(o1ooiI111iI00000oIO2, o0o0I1i0O, oIilII, i0o1iIoolIi, z2, ilOIll0o11Ii, o0o0I1i0O.I000II, olO1oOlIl01I00000oIO), o0o0I1i0O2.I00100o1O0lo, o0liioil, iloI0lOlll1, 0);
                            ilOIll0o11Ii2 = ilOIll0o11Ii;
                            z4 = z2;
                            i0o1iIoolIi2 = i0o1iIoolIi;
                            i1IiiOO0i0io2 = i1IiiOO0i0io4;
                        }
/* 96 */                oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                        if (oOloioIlI001IO000 == null) {
                            O0loolo0 o0loolo0 = new O0loolo0();
                            o0loolo0.I00iOIl = o1ooiI111i2;
                            o0loolo0.I00iiI = o0o0I1i0O2;
                            o0loolo0.I00iiO = oIo1Oi1l1lI;
                            o0loolo0.I00iio = z;
                            o0loolo0.I00ilI0I1 = ilOIll0o11Ii2;
                            o0loolo0.I00ilO0 = z4;
                            o0loolo0.I00io1l = i0o1iIoolIi2;
                            o0loolo0.I00ioIO = i0iol11I1OI3;
                            o0loolo0.I00l0I0l0lO1 = i1IioI1l102;
                            o0loolo0.I00l0OO0IO = iI0O000iIl2;
                            o0loolo0.I00li1OI = i1IiiOO0i0io2;
                            o0loolo0.I00ll1 = function1;
                            o0loolo0.I00lli11 = i;
                            o0loolo0.I00lll10 = i2;
                            o0loolo0.I00o0iI0io1 = i3;
                            VarHandle.storeStoreFence();
/* 97 */                    oOloioIlI001IO000.I0000O = o0loolo0;
                            return;
                        }
                        return;
                    }
                    i8 = i18 | 384;
                    if ((i2 & 3072) == 0) {
                    }
                    i9 = i8;
                    if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 306783379) == 306783378 || (i9 & 1171) != 1170)) {
                    }
/* 96 */            oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 == null) {
                    }
                }
            }

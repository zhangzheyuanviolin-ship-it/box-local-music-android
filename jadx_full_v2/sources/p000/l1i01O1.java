            package p000;

            import android.content.Context;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.function.Predicate;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class l1i01O1 {
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, O1ol100o0O o1ol100o0O, IllOOo00lI illOOo00lI, IlliIl1l11O illiIl1l11O, boolean z, boolean z2, boolean z3, O1ooiI111i o1ooiI111i, boolean z4, Function1 function1, boolean z5, boolean z6, boolean z7, IlliIl1l11O illiIl1l11O2, boolean z8, String str, Function1 function12, IloI0lOlll1 iloI0lOlll1, int i, int i2, int i3) {
                    int i4;
                    O1ooiI111i o1ooiI111i2;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    boolean z9;
                    boolean z10;
                    Function1 function13;
                    boolean z11;
                    boolean z12;
                    boolean z13;
                    boolean z14;
                    String str2;
                    Function1 function14;
                    int i14;
                    Function1 function15;
                    Function1 function16;
                    boolean z15;
                    String str3;
                    Function1 function17;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    Object obj2;
                    IlliIl1l11O illiIl1l11O3 = illiIl1l11O2;
                    String str4 = o1oIOiI11o0.I00000oIO;
/* 1 */             iloI0lOlll1.I00i0O(2058481592);
                    int i15 = i | (iloI0lOlll1.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(o1oIOiI11o0) ? 32 : 16);
                    boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1ol100o0O);
                    int i16 = Barcode.FORMAT_ITF;
                    int i17 = i15 | (zI000OOo1O ? 256 : 128) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 16384 : 8192) | (iloI0lOlll1.I000O01llI0(z) ? 131072 : 65536) | (iloI0lOlll1.I000O01llI0(z2) ? 1048576 : 524288);
                    int i18 = i3 & Barcode.FORMAT_ITF;
                    if (i18 != 0) {
                        i4 = i17 | 12582912;
                    } else {
                        i4 = i17 | (iloI0lOlll1.I000O01llI0(z3) ? 8388608 : 4194304);
                    }
                    int i19 = i3 & Barcode.FORMAT_QR_CODE;
                    if (i19 != 0) {
                        i4 |= 100663296;
                        o1ooiI111i2 = o1ooiI111i;
                    } else {
                        o1ooiI111i2 = o1ooiI111i;
                        if ((i & 100663296) == 0) {
                            i4 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 67108864 : 33554432;
                        }
                    }
                    int i20 = i3 & Barcode.FORMAT_UPC_A;
                    if (i20 != 0) {
                        i6 = i4 | 805306368;
                        i5 = i20;
                    } else {
                        i5 = i20;
                        i6 = i4 | (iloI0lOlll1.I000O01llI0(z4) ? 536870912 : 268435456);
                    }
                    int i21 = i3 & Barcode.FORMAT_UPC_E;
                    if (i21 != 0) {
                        i8 = i2 | 6;
                        i7 = i21;
                    } else {
                        i7 = i21;
                        i8 = i2 | (iloI0lOlll1.I000OOo1O(function1) ? 4 : 2);
                    }
                    int i22 = i3 & Barcode.FORMAT_PDF417;
                    if (i22 != 0) {
                        i8 |= 48;
                        i9 = i22;
                    } else if ((i2 & 48) == 0) {
                        i9 = i22;
                        i8 |= iloI0lOlll1.I000O01llI0(z5) ? 32 : 16;
                    } else {
                        i9 = i22;
                    }
                    int i23 = i8;
                    int i24 = i3 & Barcode.FORMAT_AZTEC;
                    if (i24 != 0) {
                        i10 = i23 | 384;
                    } else {
                        if (iloI0lOlll1.I000O01llI0(z6)) {
                            i16 = 256;
                        }
                        i10 = i23 | i16;
                    }
                    if ((i2 & 24576) == 0) {
                        i10 |= iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 16384 : 8192;
                    }
                    int i25 = 32768 & i3;
                    if (i25 != 0) {
                        i11 = i10 | 196608;
                    } else {
                        i11 = i10 | (iloI0lOlll1.I000O01llI0(z8) ? 131072 : 65536);
                    }
                    int i26 = i3 & 65536;
                    if (i26 != 0) {
                        i12 = i11 | 1572864;
                    } else {
                        i12 = i11 | (iloI0lOlll1.I000II(str) ? 1048576 : 524288);
                    }
                    int i27 = i3 & 131072;
                    if (i27 != 0) {
                        i13 = i12 | 12582912;
                    } else {
                        i13 = i12 | (iloI0lOlll1.I000OOo1O(function12) ? 8388608 : 4194304);
                    }
                    int i28 = i13;
                    if (iloI0lOlll1.I00OIl(i6 & 1, ((i6 & 306783379) == 306783378 && (i28 & 4792467) == 4792466) ? false : true)) {
                        boolean z16 = i18 != 0 ? false : z3;
/* 2 */                 O1ooiI111i o1ooiI111i3 = i19 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
                        boolean z17 = i5 != 0 ? false : z4;
                        O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 3 */                 Object obj3 = IOl11li.I00000oIO;
                        if (i7 != 0) {
/* 4 */                     Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            if (objI00O0i0ii == obj3) {
                                i14 = i6;
/* 5 */                         objI00O0i0ii = new I01OoIoio00O(8);
/* 6 */                         iloI0lOlll1.I00iio(objI00O0i0ii);
                            } else {
                                i14 = i6;
                            }
/* 7 */                     function15 = (Function1) objI00O0i0ii;
                        } else {
                            i14 = i6;
                            function15 = function1;
                        }
                        boolean z18 = i9 != 0 ? false : z5;
                        boolean z19 = i24 != 0 ? false : z6;
                        Function1 function18 = function15;
                        boolean z20 = (i3 & 8192) != 0 ? false : z7;
                        boolean z21 = i25 != 0 ? false : z8;
/* 8 */                 String str5 = i26 != 0 ? "" : str;
                        if (i27 != 0) {
/* 9 */                     Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            if (objI00O0i0ii2 == obj3) {
/* 10 */                        objI00O0i0ii2 = new I01OoIoio00O(7);
/* 11 */                        iloI0lOlll1.I00iio(objI00O0i0ii2);
                            }
/* 12 */                    function16 = (Function1) objI00O0i0ii2;
                        } else {
                            function16 = function12;
                        }
/* 13 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii3 == obj3) {
/* 15 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 16 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 17 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
                        Function1 function19 = function16;
/* 19 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll1);
/* 22 */                Object obj4 = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 25 */                O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I0000Il00O.get(str4);
/* 28 */                O1oOil o1oOil = (O1oOil) ((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I0000O.get(str4);
/* 30 */                boolean z22 = (o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiI;
/* 32 */                boolean z23 = (o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiO;
/* 34 */                boolean z24 = (o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iio;
/* 35 */                O1olIOOiiIOo o1olIOOiiIOo = new O1olIOOiiIOo();
                        o1olIOOiiIOo.I00iOIl = z19;
                        o1olIOOiiIOo.I00iiI = z22;
                        o1olIOOiiIOo.I00iiO = z;
                        o1olIOOiiIOo.I00iio = oloIl1l1oOii;
                        o1olIOOiiIOo.I00ilI0I1 = o1oIOiI11o0;
                        o1olIOOiiIOo.I00ilO0 = o1ol100o0O;
                        o1olIOOiiIOo.I00io1l = illiIl1l11O;
                        VarHandle.storeStoreFence();
                        boolean z25 = z19;
                        IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1225900787, o1olIOOiiIOo, iloI0lOlll1);
/* 36 */                O1olIiilO1o o1olIiilO1o = new O1olIiilO1o();
                        o1olIiilO1o.I00iOIl = z16;
                        o1olIiilO1o.I00iiI = z22;
                        o1olIiilO1o.I00iiO = z;
                        o1olIiilO1o.I00iio = illOOo00lI;
                        VarHandle.storeStoreFence();
                        IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-92231375, o1olIiilO1o, iloI0lOlll1);
/* 37 */                O1oli0l1OI o1oli0l1OI = new O1oli0l1OI();
                        o1oli0l1OI.I00iOIl = o1oIo0iI00;
                        o1oli0l1OI.I00iiI = o1oIOiI11o0;
                        o1oli0l1OI.I00iiO = z18;
                        o1oli0l1OI.I00iio = z22;
                        o1oli0l1OI.I00ilI0I1 = z;
                        o1oli0l1OI.I00ilO0 = z23;
                        o1oli0l1OI.I00io1l = z24;
                        o1oli0l1OI.I00ioIO = z17;
                        o1oli0l1OI.I00l0I0l0lO1 = z2;
                        o1oli0l1OI.I00l0OO0IO = function18;
                        o1oli0l1OI.I00li1OI = oI10i0Il2;
                        VarHandle.storeStoreFence();
                        IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(-1425814104, o1oli0l1OI, iloI0lOlll1);
                        int i29 = ((i14 >> 21) & 112) | 3462;
                        boolean z26 = z17;
                        boolean z27 = z18;
                        boolean z28 = z16;
/* 38 */                I11i1lloiiO.I00000oIO(iOii1lI00000oOI, o1ooiI111i4, iOii1lI00000oOI2, iOii1lI00000oOI3, 0.0f, null, null, null, iloI0lOlll1, i29, 496);
/* 39 */                if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 40 */                    iloI0lOlll1.I00i01iIIliI(687808493);
/* 43 */                    ArrayList arrayList = new ArrayList(o1oIOiI11o0.I0000O);
/* 45 */                    if (O0000Ioio00.I0000O(oloIl1l1oOii.I00000oIO, "llm_tiny_garden")) {
/* 52 */                        iloI0lOlll1.I00i01iIIliI(688142890);
/* 53 */                        iloI0lOlll1.I0010I0i(false);
                            } else {
                                iloI0lOlll1.I00i01iIIliI(688056400);
/* 46 */                        Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                                if (objI00O0i0ii4 == obj3) {
/* 47 */                            O1o0i0Ol0Oo0 o1o0i0Ol0Oo0 = new O1o0i0Ol0Oo0(13);
/* 48 */                            O1ollIl o1ollIl = new O1ollIl(0);
                                    o1ollIl.I00000oOI = o1o0i0Ol0Oo0;
                                    VarHandle.storeStoreFence();
/* 49 */                            iloI0lOlll1.I00iio(o1ollIl);
                                    objI00O0i0ii4 = o1ollIl;
                                }
/* 50 */                        arrayList.removeIf((Predicate) objI00O0i0ii4);
/* 51 */                        iloI0lOlll1.I0010I0i(false);
                            }
/* 54 */                    if (oloIl1l1oOii.I00000oIO()) {
/* 61 */                        iloI0lOlll1.I00i01iIIliI(688250026);
/* 62 */                        iloI0lOlll1.I0010I0i(false);
                            } else {
                                iloI0lOlll1.I00i01iIIliI(688176990);
/* 55 */                        Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                                if (objI00O0i0ii5 == obj3) {
/* 56 */                            O1o0i0Ol0Oo0 o1o0i0Ol0Oo02 = new O1o0i0Ol0Oo0(14);
/* 57 */                            O1ollIl o1ollIl2 = new O1ollIl(1);
                                    o1ollIl2.I00000oOI = o1o0i0Ol0Oo02;
                                    VarHandle.storeStoreFence();
/* 58 */                            iloI0lOlll1.I00iio(o1ollIl2);
                                    objI00O0i0ii5 = o1ollIl2;
                                }
/* 59 */                        arrayList.removeIf((Predicate) objI00O0i0ii5);
/* 60 */                        iloI0lOlll1.I0010I0i(false);
                            }
/* 63 */                    Map map = o1oIOiI11o0.I00IoIO0lI;
/* 64 */                    Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                            if (objI00O0i0ii6 == obj3) {
/* 65 */                        O0loollioliO o0loollioliO = new O0loollioliO(27);
                                oI10i0Il = oI10i0Il2;
                                o0loollioliO.I00iiI = oI10i0Il;
                                VarHandle.storeStoreFence();
/* 66 */                        iloI0lOlll1.I00iio(o0loollioliO);
                                obj = o0loollioliO;
                            } else {
                                oI10i0Il = oI10i0Il2;
                                obj = objI00O0i0ii6;
                            }
/* 67 */                    IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj;
                            boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(arrayList) | iloI0lOlll1.I000OOo1O(o1oIOiI11o0) | ((i28 & 29360128) == 8388608) | iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(oloIl1l1oOii) | iloI0lOlll1.I000OOo1O(obj4) | ((i28 & 57344) == 16384);
/* 69 */                    Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                            if (zI000OOo1O2 || objI00O0i0ii7 == obj3) {
/* 70 */                        IO1IlI1 iO1IlI1 = new IO1IlI1(2);
                                iO1IlI1.I00iio = arrayList;
                                iO1IlI1.I00ilI0I1 = o1oIOiI11o0;
                                function17 = function19;
                                iO1IlI1.I00ilO0 = function17;
                                iO1IlI1.I00iiI = o1ol100o0O;
                                iO1IlI1.I00io1l = oloIl1l1oOii;
                                iO1IlI1.I00ioIO = obj4;
                                illiIl1l11O3 = illiIl1l11O2;
                                iO1IlI1.I00l0I0l0lO1 = illiIl1l11O3;
                                iO1IlI1.I00iiO = oI10i0Il;
                                VarHandle.storeStoreFence();
/* 71 */                        iloI0lOlll1.I00iio(iO1IlI1);
                                obj2 = iO1IlI1;
                            } else {
                                illiIl1l11O3 = illiIl1l11O2;
                                function17 = function19;
                                obj2 = objI00O0i0ii7;
                            }
                            z15 = z21;
                            str3 = str5;
/* 74 */                    IOll1OIIi0O1.I00000oOI("Configurations", arrayList, map, illOOo00lI2, (Function3) obj2, null, null, false, z15, oloIl1l1oOii.I000oI1ioi, str3, iloI0lOlll1, ((i28 << 9) & 234881024) | 3078, (i28 >> 18) & 14, 224);
/* 75 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
                            illiIl1l11O3 = illiIl1l11O2;
                            z15 = z21;
                            str3 = str5;
                            function17 = function19;
/* 76 */                    iloI0lOlll1.I00i01iIIliI(690573290);
/* 77 */                    iloI0lOlll1.I0010I0i(false);
                        }
                        function14 = function17;
                        z14 = z15;
                        str2 = str3;
                        z9 = z28;
                        z10 = z26;
                        z13 = z20;
                        z12 = z25;
                        function13 = function18;
                        z11 = z27;
                        o1ooiI111i2 = o1ooiI111i4;
                    } else {
/* 78 */                iloI0lOlll1.I00OilO00Il();
                        z9 = z3;
                        z10 = z4;
                        function13 = function1;
                        z11 = z5;
                        z12 = z6;
                        z13 = z7;
                        z14 = z8;
                        str2 = str;
                        function14 = function12;
                    }
/* 79 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        O1ol1OI o1ol1OI = new O1ol1OI();
                        o1ol1OI.I00iOIl = oloIl1l1oOii;
                        o1ol1OI.I00iiI = o1oIOiI11o0;
                        o1ol1OI.I00iiO = o1ol100o0O;
                        o1ol1OI.I00iio = illOOo00lI;
                        o1ol1OI.I00ilI0I1 = illiIl1l11O;
                        o1ol1OI.I00ilO0 = z;
                        o1ol1OI.I00io1l = z2;
                        o1ol1OI.I00ioIO = z9;
                        o1ol1OI.I00l0I0l0lO1 = o1ooiI111i2;
                        o1ol1OI.I00l0OO0IO = z10;
                        o1ol1OI.I00li1OI = function13;
                        o1ol1OI.I00ll1 = z11;
                        o1ol1OI.I00lli11 = z12;
                        o1ol1OI.I00lll10 = z13;
                        o1ol1OI.I00o0iI0io1 = illiIl1l11O3;
                        o1ol1OI.I00o0l1o1o0 = z14;
                        o1ol1OI.I00o101lO = str2;
                        o1ol1OI.I00oI0i = function14;
                        o1ol1OI.I00oII = i;
                        o1ol1OI.I00oIiI10 = i2;
                        o1ol1OI.I00oO101o = i3;
                        VarHandle.storeStoreFence();
/* 80 */                oOloioIlI001IO000.I0000O = o1ol1OI;
                    }
                }
            }

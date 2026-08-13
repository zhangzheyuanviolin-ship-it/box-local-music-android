            package p000;

            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.WeakHashMap;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class i1Ioo11OIl {
                public static i1IoOioloO1 I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:256:0x0756  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ol100o0O o1ol100o0O, OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, O11iO00I1o o11iO00I1o, OIo1Oi1l1lI oIo1Oi1l1lI, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, IlliOIilI illiOIilI, IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O3, Function1 function1, IllOOo00lI illOOo00lI2, IllOOo00lI illOOo00lI3, IlliIl1l11O illiIl1l11O4, boolean z, boolean z2, boolean z3, IOii1l iOii1l, Function3 function3, Function1 function12, boolean z4, IllOOo00lI illOOo00lI4, boolean z5, IllOOo00lI illOOo00lI5, boolean z6, IllOOo00lI illOOo00lI6, IloI0lOlll1 iloI0lOlll1, int i) {
                    IlliOIilI illiOIilI2;
                    IllOOo00lI illOOo00lI7;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    IllOOo00lI illOOo00lI8;
                    O1oIOiI11o0 o1oIOiI11o02;
                    IllOOo00lI illOOo00lI9;
                    IloI0lOlll1 iloI0lOlll12;
                    Io1I0l io1I0l;
                    IOoil1iiIilo iOoil1iiIilo;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    O0o0I1i0O o0o0I1i0O;
                    boolean z10;
                    IlliIl1l11O illiIl1l11O5;
                    Ol1OlloIO ol1OlloIO;
                    OI10i0Il oI10i0Il3;
                    OI10i0Il oI10i0Il4;
                    Object obj;
                    OI10i0Il oI10i0Il5;
                    Object obj2;
                    OIooi1iOiOol oIooi1iOiOol;
                    Object obj3;
                    Function1 function13;
                    Object obj4;
                    Function1 function14;
                    Object obj5;
                    Function1 function15;
                    String str;
                    IOO0o0I1l iOO0o0I1l;
                    String str2;
                    O1ol100o0O o1ol100o0O2 = o1ol100o0O;
                    OloIl1l1oOii oloIl1l1oOii2 = oloIl1l1oOii;
                    IllOOo00lI illOOo00lI10 = illOOo00lI3;
                    IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
                    String str3 = o1oIOiI11o0.I00000oIO;
/* 1 */             iloI0lOlll13.I00i0O(-1757987372);
                    int i2 = i | (iloI0lOlll13.I000OOo1O(o1ol100o0O2) ? 4 : 2) | (iloI0lOlll13.I000OOo1O(oloIl1l1oOii2) ? 32 : 16);
                    boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(o1oIOiI11o0);
                    int i3 = Barcode.FORMAT_ITF;
                    int i4 = i2 | (zI000OOo1O ? 256 : 128);
                    boolean zI000OOo1O2 = iloI0lOlll13.I000OOo1O(o11iO00I1o);
                    int i5 = Barcode.FORMAT_UPC_E;
                    int i6 = i4 | (zI000OOo1O2 ? 2048 : 1024) | (iloI0lOlll13.I000II(oIo1Oi1l1lI) ? 16384 : 8192) | (iloI0lOlll13.I000OOo1O(illiIl1l11O) ? 131072 : 65536) | (iloI0lOlll13.I000OOo1O(illiIl1l11O2) ? 1048576 : 524288) | (iloI0lOlll13.I000OOo1O(illiOIilI) ? 8388608 : 4194304) | (iloI0lOlll13.I000II(o1ooiI111i) ? 536870912 : 268435456);
                    int i7 = 24576 | (iloI0lOlll13.I000OOo1O(illOOo00lI2) ? 256 : 128) | (iloI0lOlll13.I000OOo1O(illOOo00lI10) ? 2048 : 1024) | (iloI0lOlll13.I000O01llI0(z) ? 131072 : 65536) | (iloI0lOlll13.I000O01llI0(z2) ? 1048576 : 524288) | (iloI0lOlll13.I000O01llI0(z3) ? 8388608 : 4194304) | (iloI0lOlll13.I000OOo1O(iOii1l) ? 67108864 : 33554432) | (iloI0lOlll13.I000OOo1O(function3) ? 536870912 : 268435456);
                    int i8 = (iloI0lOlll13.I000OOo1O(function12) ? 4 : 2) | (iloI0lOlll13.I000O01llI0(z4) ? 32 : 16);
                    if (iloI0lOlll13.I000OOo1O(illOOo00lI4)) {
                        i3 = 256;
                    }
                    int i9 = i8 | i3;
                    if (iloI0lOlll13.I000O01llI0(z5)) {
                        i5 = 2048;
                    }
                    int i10 = i9 | i5 | (iloI0lOlll13.I000OOo1O(illOOo00lI5) ? 16384 : 8192) | (iloI0lOlll13.I000O01llI0(z6) ? 131072 : 65536) | (iloI0lOlll13.I000OOo1O(illOOo00lI6) ? 1048576 : 524288);
                    if (iloI0lOlll13.I00OIl(i6 & 1, ((i6 & 273228947) == 273228946 && (i7 & 306783361) == 306783360 && (i10 & 599187) == 599186) ? false : true)) {
/* 3 */                 OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o11iO00I1o.I0000Il00O, iloI0lOlll13);
/* 5 */                 OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(o1ol100o0O2.I000OOo1O, iloI0lOlll13);
/* 8 */                 List list = (List) ((IO1looOIi) oI10i0IlI00000oOI.getValue()).I0000O.get(str3);
                        if (list == null) {
                            list = Il01100l.I00iOIl;
                        }
/* 12 */                Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 13 */                IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
                        if (objI00O0i0ii == iOO0o0I1l2) {
/* 14 */                    objI00O0i0ii = new Ol1OlloIO();
/* 15 */                    iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 16 */                Ol1OlloIO ol1OlloIO2 = (Ol1OlloIO) objI00O0i0ii;
/* 17 */                Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 18 */                    objI00O0i0ii2 = iIO0iiOiOl0l.I000II(iloI0lOlll13);
/* 19 */                    iloI0lOlll13.I00iio(objI00O0i0ii2);
                        }
/* 20 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii2;
/* 23 */                IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) iloI0lOlll13.I000iOII(IOlO0o100i1i.I0000oI00);
/* 26 */                Io1I0l io1I0l2 = (Io1I0l) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000l1);
/* 27 */                boolean zI000II = iloI0lOlll13.I000II(list);
/* 28 */                Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                        if (zI000II || objI00O0i0ii3 == iOO0o0I1l2) {
/* 29 */                    Iterator it = IOOi0Ool1i.I00OIo(list).iterator();
                            int size = 0;
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                IO1OO01i0 iO1OO01i0 = (IO1OO01i0) it.next();
/* 30 */                        if (iO1OO01i0 instanceof IO1Ol1I) {
                                    break;
                                }
/* 31 */                        if (iO1OO01i0 instanceof IO1OoiOlOO) {
/* 34 */                            size = ((IO1OoiOlOO) iO1OO01i0).I000II.size() + size;
                                }
                                it = it2;
                            }
/* 35 */                    objI00O0i0ii3 = Integer.valueOf(size);
/* 36 */                    iloI0lOlll13.I00iio(objI00O0i0ii3);
                        }
/* 37 */                int iIntValue = ((Number) objI00O0i0ii3).intValue();
/* 38 */                Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii4 == iOO0o0I1l2) {
/* 40 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO("");
/* 41 */                    iloI0lOlll13.I00iio(objI00O0i0ii4);
                        }
/* 42 */                OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii4;
/* 45 */                Ili1iIl ili1iIl = (Ili1iIl) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000OOo1O);
/* 46 */                O0o0I1i0O o0o0I1i0OI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll13);
/* 50 */                Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii5 == iOO0o0I1l2) {
/* 52 */                    objI00O0i0ii5 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 53 */                    iloI0lOlll13.I00iio(objI00O0i0ii5);
                        }
/* 54 */                OI10i0Il oI10i0Il7 = (OI10i0Il) objI00O0i0ii5;
/* 55 */                Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii6 == iOO0o0I1l2) {
/* 56 */                    objI00O0i0ii6 = lOO00IiI0li.I00000oIO(null);
/* 57 */                    iloI0lOlll13.I00iio(objI00O0i0ii6);
                        }
/* 58 */                OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii6;
/* 59 */                Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii7 == iOO0o0I1l2) {
/* 61 */                    objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 62 */                    iloI0lOlll13.I00iio(objI00O0i0ii7);
                        }
/* 63 */                OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii7;
/* 64 */                Object objI00O0i0ii8 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii8 == iOO0o0I1l2) {
/* 66 */                    objI00O0i0ii8 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 67 */                    iloI0lOlll13.I00iio(objI00O0i0ii8);
                        }
/* 68 */                OI10i0Il oI10i0Il10 = (OI10i0Il) objI00O0i0ii8;
/* 69 */                Object objI00O0i0ii9 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii9 == iOO0o0I1l2) {
/* 70 */                    objI00O0i0ii9 = lOIoOIOIOili.I00000oIO();
/* 71 */                    iloI0lOlll13.I00iio(objI00O0i0ii9);
                        }
/* 72 */                OIooi1iOiOol oIooi1iOiOol2 = (OIooi1iOiOol) objI00O0i0ii9;
/* 73 */                Object objI00O0i0ii10 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii10 == iOO0o0I1l2) {
/* 74 */                    objI00O0i0ii10 = lOIoOIOIOili.I00000oIO();
/* 75 */                    iloI0lOlll13.I00iio(objI00O0i0ii10);
                        }
/* 76 */                OIooi1iOiOol oIooi1iOiOol3 = (OIooi1iOiOol) objI00O0i0ii10;
/* 77 */                Object objI00O0i0ii11 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii11 == iOO0o0I1l2) {
/* 78 */                    objI00O0i0ii11 = lOIoOIOIOili.I00000oIO();
/* 79 */                    iloI0lOlll13.I00iio(objI00O0i0ii11);
                        }
/* 80 */                OIooi1iOiOol oIooi1iOiOol4 = (OIooi1iOiOol) objI00O0i0ii11;
/* 81 */                Object objI00O0i0ii12 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii12 == iOO0o0I1l2) {
/* 83 */                    objI00O0i0ii12 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 84 */                    iloI0lOlll13.I00iio(objI00O0i0ii12);
                        }
/* 85 */                OI10i0Il oI10i0Il11 = (OI10i0Il) objI00O0i0ii12;
/* 86 */                Boolean bool = (Boolean) oI10i0Il11.getValue();
                        bool.getClass();
/* 87 */                Object objI00O0i0ii13 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii13 == iOO0o0I1l2) {
                            io1I0l = io1I0l2;
                            iOoil1iiIilo = null;
/* 88 */                    objI00O0i0ii13 = new II01OoOI1(oI10i0Il11, iOoil1iiIilo, 2);
/* 89 */                    iloI0lOlll13.I00iio(objI00O0i0ii13);
                        } else {
                            io1I0l = io1I0l2;
                            iOoil1iiIilo = null;
                        }
/* 90 */                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii13, iloI0lOlll13, bool);
/* 91 */                Object objI00O0i0ii14 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii14 == iOO0o0I1l2) {
/* 92 */                    objI00O0i0ii14 = lOO00IiI0li.I00000oIO(iOoil1iiIilo);
/* 93 */                    iloI0lOlll13.I00iio(objI00O0i0ii14);
                        }
/* 94 */                OI10i0Il oI10i0Il12 = (OI10i0Il) objI00O0i0ii14;
/* 95 */                Object objI00O0i0ii15 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii15 == iOO0o0I1l2) {
/* 96 */                    objI00O0i0ii15 = lOO00IiI0li.I00000oIO("");
/* 97 */                    iloI0lOlll13.I00iio(objI00O0i0ii15);
                        }
/* 98 */                OI10i0Il oI10i0Il13 = (OI10i0Il) objI00O0i0ii15;
/* 99 */                if (!list.isEmpty()) {
/* 100 */                   IO1OO01i0 iO1OO01i02 = (IO1OO01i0) IOOi0Ool1i.I00Io1o110i(list);
/* 101 */                   oI10i0Il12.setValue(iO1OO01i02);
/* 102 */                   if (iO1OO01i02 instanceof IO1iI1i) {
/* 105 */                       oI10i0Il13.setValue(((IO1iI1i) iO1OO01i02).I000II);
                            }
                        }
/* 106 */               WeakHashMap weakHashMap = i00lIlOOll0.I001i1O0Ol;
/* 109 */               Integer numValueOf = Integer.valueOf(liIIiol0oI10.I00000oIO(iloI0lOlll13).I0000Il00O.I0000oI00().I0000O);
                        boolean zI000II2 = iloI0lOlll13.I000II(o0o0I1i0OI00000oIO);
/* 110 */               Object objI00O0i0ii16 = iloI0lOlll13.I00O0i0ii();
                        if (zI000II2 || objI00O0i0ii16 == iOO0o0I1l2) {
                            oI10i0Il = oI10i0Il13;
/* 111 */                   objI00O0i0ii16 = new IO1lIOi(0, null, o0o0I1i0OI00000oIO);
/* 112 */                   iloI0lOlll13.I00iio(objI00O0i0ii16);
                        } else {
                            oI10i0Il = oI10i0Il13;
                        }
/* 113 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii16, iloI0lOlll13, numValueOf);
/* 114 */               Integer numValueOf2 = Integer.valueOf(list.size());
                        IO1OO01i0 iO1OO01i03 = (IO1OO01i0) oI10i0Il12.getValue();
/* 115 */               IO1iIoo iO1iIoo = iO1OO01i03 != null ? iO1OO01i03.I00000oIO : null;
/* 116 */               boolean zI000OOo1O3 = iloI0lOlll13.I000OOo1O(list) | iloI0lOlll13.I000II(o0o0I1i0OI00000oIO);
/* 117 */               Object objI00O0i0ii17 = iloI0lOlll13.I00O0i0ii();
                        int i11 = 22;
                        if (zI000OOo1O3 || objI00O0i0ii17 == iOO0o0I1l2) {
                            oI10i0Il2 = oI10i0Il11;
/* 118 */                   objI00O0i0ii17 = new I00oI0i(list, o0o0I1i0OI00000oIO, null, i11);
/* 119 */                   iloI0lOlll13.I00iio(objI00O0i0ii17);
                        } else {
                            oI10i0Il2 = oI10i0Il11;
                        }
/* 120 */               iIO0iiOiOl0l.I0000oI00(numValueOf2, iO1iIoo, (IlliIl1l11O) objI00O0i0ii17, iloI0lOlll13);
/* 121 */               Object objI00O0i0ii18 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii18 == iOO0o0I1l2) {
/* 122 */                   IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(1);
                            iO1Io1IOOOIi.I00iiI = o0o0I1i0OI00000oIO;
                            iO1Io1IOOOIi.I00iiO = list;
                            VarHandle.storeStoreFence();
/* 123 */                   objI00O0i0ii18 = Ol1llolil.I00000oOI(iO1Io1IOOOIi);
/* 124 */                   iloI0lOlll13.I00iio(objI00O0i0ii18);
                        }
/* 125 */               OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii18;
/* 126 */               boolean zI000OOo1O4 = iloI0lOlll13.I000OOo1O(list) | iloI0lOlll13.I000II(o0o0I1i0OI00000oIO);
/* 127 */               Object objI00O0i0ii19 = iloI0lOlll13.I00O0i0ii();
                        if (zI000OOo1O4 || objI00O0i0ii19 == iOO0o0I1l2) {
/* 128 */                   objI00O0i0ii19 = new I000oI1ioi(oI10i0Il12, oI10i0Il, list, o0o0I1i0OI00000oIO, olO01l1oOil, null, 4);
                            o0o0I1i0O = o0o0I1i0OI00000oIO;
/* 129 */                   iloI0lOlll13.I00iio(objI00O0i0ii19);
                        } else {
                            o0o0I1i0O = o0o0I1i0OI00000oIO;
                        }
/* 130 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii19, iloI0lOlll13, o0o0I1i0O);
/* 131 */               Object objI00O0i0ii20 = iloI0lOlll13.I00O0i0ii();
                        Object obj6 = objI00O0i0ii20;
                        if (objI00O0i0ii20 == iOO0o0I1l2) {
/* 133 */                   IO1lOIIIoo iO1lOIIIoo = new IO1lOIIIoo();
/* 134 */                   iO1lOIIIoo.I00iOIl = ili1iIl;
                            VarHandle.storeStoreFence();
/* 135 */                   iloI0lOlll13.I00iio(iO1lOIIIoo);
                            obj6 = iO1lOIIIoo;
                        }
/* 136 */               IO1lOIIIoo iO1lOIIIoo2 = (IO1lOIIIoo) obj6;
/* 139 */               O1oOil o1oOil = (O1oOil) ((O1oiOloOo) oI10i0IlI00000oOI2.getValue()).I0000O.get(str3);
/* 140 */               boolean zI000OOo1O5 = iloI0lOlll13.I000OOo1O(o1oOil);
/* 141 */               Object objI00O0i0ii21 = iloI0lOlll13.I00O0i0ii();
                        if (zI000OOo1O5 || objI00O0i0ii21 == iOO0o0I1l2) {
                            z10 = false;
/* 142 */                   objI00O0i0ii21 = new IO1l0lIi0O1(o1oOil, oI10i0Il9, null, 0);
/* 143 */                   iloI0lOlll13.I00iio(objI00O0i0ii21);
                        } else {
                            z10 = false;
                        }
/* 144 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii21, iloI0lOlll13, o1oOil);
/* 145 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 146 */               II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00l0OO0IO;
/* 147 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, z10);
/* 149 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 150 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
                        O0o0I1i0O o0o0I1i0O2 = o0o0I1i0O;
/* 151 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, ilIl1Io0lii1);
/* 152 */               IOl0oi0lOl1.I000lI.getClass();
/* 153 */               iloI0lOlll13.I00i0oil();
/* 154 */               boolean z11 = iloI0lOlll13.I00O10llo;
/* 155 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
                        if (z11) {
/* 156 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 157 */                   iloI0lOlll13.I00io1l();
                        }
/* 158 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 159 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 160 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 161 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI);
/* 162 */               Integer numValueOf3 = Integer.valueOf(iHashCode);
/* 163 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 164 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, numValueOf3);
/* 165 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 166 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 167 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 168 */               boolean zBooleanValue = ((Boolean) oI10i0Il10.getValue()).booleanValue();
/* 169 */               OOo0IO oOo0IO = Ooooi01I.I00000oIO;
                        List list2 = list;
/* 170 */               OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 200.0f, IooO0O.I00000oIO(4294967297L), 1);
/* 171 */               Object objI00O0i0ii22 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii22 == iOO0o0I1l2) {
/* 172 */                   objI00O0i0ii22 = new I10I0o1ii10(20);
/* 173 */                   iloI0lOlll13.I00iio(objI00O0i0ii22);
                        }
/* 175 */               OoIoOiiO1 ooIoOiiO1 = Il0iiiII11.I00000oIO;
                        int i12 = 5;
/* 179 */               Il0l0iooI il0l0iooII00000oIO = new Il0l0iooI(new OoI1iOioli((IlI1o11l0) null, new Ol0oo1IioO(new Il0iOO1l101(1, (Function1) objI00O0i0ii22), olIOiI1iI1I0000Il00O), (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 125)).I00000oIO(Il0iiiII11.I0000oI00(iOO01lio0.I0000Il00O(0.0f, 200.0f, null, 5), 2));
/* 180 */               Il1OOloOIl1 il1OOloOIl1I0001Ioi1lo = Il0iiiII11.I0001Ioi1lo(null, 3);
/* 181 */               Object objI00O0i0ii23 = iloI0lOlll13.I00O0i0ii();
                        if (objI00O0i0ii23 == iOO0o0I1l2) {
/* 182 */                   objI00O0i0ii23 = new IO1I11OO(2);
/* 183 */                   iloI0lOlll13.I00iio(objI00O0i0ii23);
                        }
                        O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 184 */               O1ooiI111i o1ooiI111iI00000oIO = iIlll1lo.I00000oIO(o1ooIo101ll, (Function1) objI00O0i0ii23);
/* 185 */               I0iII1i10I i0iII1i10I = new I0iII1i10I(i12);
                        i0iII1i10I.I00iiI = oIooi1iOiOol2;
                        VarHandle.storeStoreFence();
/* 186 */               O1OooO0IlOo.I0000Il00O(zBooleanValue, o1ooiI111iI00000oIO, il0l0iooII00000oIO, il1OOloOIl1I0001Ioi1lo, null, iiioOl1O.I00000oOI(-748989514, i0iII1i10I, iloI0lOlll13), iloI0lOlll13, 199728, 16);
/* 187 */               O1ooiI111i o1ooiI111iI0000oI00 = iO01II.I0000oI00(o1ooiI111i, oIo1Oi1l1lI);
/* 189 */               OIo1OiOOl oIo1OiOOl = new OIo1OiOOl();
/* 190 */               oIo1OiOOl.I00000oIO = oIo1Oi1l1lI;
/* 191 */               VarHandle.storeStoreFence();
/* 193 */               O1ooiI111i o1ooiI111iI00000oIO2 = iO1Oii0i.I00000oIO(o1ooiI111iI0000oI00.I0000O(oIo1OiOOl));
/* 194 */               II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 195 */               I1IiOIiOli i1IiOIiOli = I1IiooiI1IlO.I0000Il00O;
                        IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll13, 0);
/* 197 */               int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 198 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 199 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oIO2);
/* 200 */               iloI0lOlll13.I00i0oil();
/* 201 */               if (iloI0lOlll13.I00O10llo) {
/* 202 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 203 */                   iloI0lOlll13.I00io1l();
                        }
/* 204 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 205 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI2);
/* 206 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 207 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 208 */               O1ooiI111i o1ooiI111iI00000oIO3 = IOOloooii.I00000oIO(o1ooIo101ll, 1.0f);
/* 209 */               O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 211 */               int iHashCode3 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 212 */               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll13.I000lI();
/* 213 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oIO3);
/* 214 */               iloI0lOlll13.I00i0oil();
/* 215 */               if (iloI0lOlll13.I00O10llo) {
/* 216 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 217 */                   iloI0lOlll13.I00io1l();
                        }
/* 218 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O2);
/* 219 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI3);
/* 220 */               IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 221 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O3);
/* 222 */               String strI00000oOI = lOOoli.I00000oOI(R.string.cd_chat_panel, iloI0lOlll13);
/* 223 */               O1ooiI111i o1ooiI111iI00000oIO4 = iO0011o0iIIl.I00000oIO(ilIl1Io0lii1, iO1lOIIIoo2, null);
/* 224 */               boolean zI000II3 = iloI0lOlll13.I000II(strI00000oOI);
/* 225 */               Object objI00O0i0ii24 = iloI0lOlll13.I00O0i0ii();
                        Object obj7 = objI00O0i0ii24;
                        if (zI000II3 || objI00O0i0ii24 == iOO0o0I1l2) {
/* 226 */                   I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(4);
                            i0ioO0Oio0ll.I00iiI = strI00000oOI;
                            VarHandle.storeStoreFence();
/* 227 */                   iloI0lOlll13.I00iio(i0ioO0Oio0ll);
                            obj7 = i0ioO0Oio0ll;
                        }
/* 229 */               O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO4, false, (Function1) obj7);
                        int i13 = i6 & 458752;
                        Io1I0l io1I0l3 = io1I0l;
                        boolean zI000OOo1O6 = iloI0lOlll13.I000OOo1O(list2) | iloI0lOlll13.I000OOo1O(oloIl1l1oOii) | (i13 == 131072) | iloI0lOlll13.I000OOo1O(o1oIOiI11o0) | iloI0lOlll13.I000OOo1O(io1I0l3) | iloI0lOlll13.I000II(oI10i0IlI00000oOI) | iloI0lOlll13.I000OOo1O(o1ol100o0O) | iloI0lOlll13.I000OOo1O(iOO0i0o1O0l) | iloI0lOlll13.I000OOo1O(ii0110) | ((i10 & 14) == 4) | ((i6 & 3670016) == 1048576);
/* 231 */               Object objI00O0i0ii25 = iloI0lOlll13.I00O0i0ii();
                        if (zI000OOo1O6 || objI00O0i0ii25 == iOO0o0I1l2) {
/* 232 */                   IO1iiIIiI1o iO1iiIIiI1o = new IO1iiIIiI1o();
                            iO1iiIIiI1o.I00iOIl = list2;
                            iO1iiIIiI1o.I00iiI = oloIl1l1oOii;
                            illiIl1l11O5 = illiIl1l11O;
                            iO1iiIIiI1o.I00iiO = illiIl1l11O5;
                            iO1iiIIiI1o.I00iio = o1oIOiI11o0;
                            iO1iiIIiI1o.I00ilI0I1 = io1I0l3;
                            iO1iiIIiI1o.I00ilO0 = illiIl1l11O4;
                            iO1iiIIiI1o.I00io1l = oI10i0IlI00000oOI;
                            iO1iiIIiI1o.I00ioIO = o1ol100o0O;
                            iO1iiIIiI1o.I00l0I0l0lO1 = iOO0i0o1O0l;
                            iO1iiIIiI1o.I00l0OO0IO = ii0110;
                            iO1iiIIiI1o.I00li1OI = function12;
                            ol1OlloIO = ol1OlloIO2;
                            iO1iiIIiI1o.I00ll1 = ol1OlloIO;
                            oI10i0Il3 = oI10i0IlI00000oOI;
                            iO1iiIIiI1o.I00lli11 = illiIl1l11O2;
                            iO1iiIIiI1o.I00lll10 = oI10i0Il8;
                            oI10i0Il4 = oI10i0Il7;
                            iO1iiIIiI1o.I00o0iI0io1 = oI10i0Il4;
                            VarHandle.storeStoreFence();
/* 233 */                   iloI0lOlll13.I00iio(iO1iiIIiI1o);
                            obj = iO1iiIIiI1o;
                        } else {
                            illiIl1l11O5 = illiIl1l11O;
                            oI10i0Il3 = oI10i0IlI00000oOI;
                            ol1OlloIO = ol1OlloIO2;
                            oI10i0Il4 = oI10i0Il7;
                            obj = objI00O0i0ii25;
                        }
/* 235 */               l0oIiiI1O0o.I00000oIO(o1ooiI111iI00000oOI, o0o0I1i0O2, null, i1IiOIiOli, null, null, false, null, (Function1) obj, iloI0lOlll13, 24576, 492);
                        OI10i0Il oI10i0Il14 = oI10i0Il4;
/* 236 */               lOIli1Ol.I00000oOI(ol1OlloIO, iO01II.I000O01llI0(o1ooIo101ll, 0.0f, 4.0f, 1), null, iloI0lOlll13, 54);
/* 237 */               if (list2.isEmpty() && oIooi1iOiOol3.I000II() == 0 && oIooi1iOiOol4.I000II() == 0) {
/* 240 */                   iloI0lOlll13.I00i01iIIliI(-1885174665);
/* 241 */                   iOii1l.invoke(o1oIOiI11o0, iloI0lOlll13, Integer.valueOf(((i6 >> 6) & 14) | ((i7 >> 21) & 112)));
/* 242 */                   iloI0lOlll13.I0010I0i(false);
                        } else {
/* 243 */                   iloI0lOlll13.I00i01iIIliI(-1885119888);
/* 244 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 245 */               O1oOl0 o1oOl0 = o1oOil != null ? o1oOil.I00000oIO : null;
/* 246 */               O1oOl0 o1oOl02 = O1oOl0.I00iiI;
                        if (o1oOl0 == o1oOl02) {
/* 247 */                   o1oOil.getClass();
/* 255 */                   boolean z12 = !o1oOil.I0000Il00O.contains((String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", Accelerator.GPU.getLabel()), ValueType.STRING));
/* 258 */                   IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00, i1O01oOIoI0I.I00o0l1o1o0, iloI0lOlll13, 54);
/* 260 */                   int iHashCode4 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 261 */                   OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll13.I000lI();
/* 262 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 263 */                   iloI0lOlll13.I00i0oil();
/* 264 */                   if (iloI0lOlll13.I00O10llo) {
/* 265 */                       iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 266 */                       iloI0lOlll13.I00io1l();
                            }
/* 267 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, iOOlo1O01OI00000oIO2);
/* 268 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI4);
/* 269 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 270 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O4);
/* 273 */                   O1OooO0IlOo.I0000O(z12, null, Il0iiiII11.I0000oI00(null, 3).I00000oIO(Il0iiiII11.I000II(null, 0.9f, 5)), Il0iiiII11.I0001Ioi1lo(null, 3).I00000oIO(Il0iiiII11.I000O01llI0(5, 0.9f)), null, i1Ol0Oo0OI.I00000oIO, iloI0lOlll13, 1600518, 18);
/* 274 */                   iloI0lOlll13.I0010I0i(true);
/* 279 */                   ilOl00Oo1l1.I00000oIO(0, iloI0lOlll13, iO01II.I000II(II1oili.I00000oIO.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00iio), 16.0f, 8.0f), lOOoli.I00000oOI(R.string.aicore_image_limit_message, iloI0lOlll13), ((Boolean) oI10i0Il2.getValue()).booleanValue());
/* 280 */                   iloI0lOlll13.I0010I0i(true);
/* 281 */                   function3.invoke(o1oIOiI11o0, iloI0lOlll13, Integer.valueOf(((i6 >> 6) & 14) | ((i7 >> 24) & 112)));
/* 282 */                   String str4 = (String) oI10i0Il6.getValue();
/* 284 */                   boolean z13 = ((IO1looOIi) oI10i0Il3.getValue()).I00000oIO;
/* 286 */                   boolean z14 = ((IO1looOIi) oI10i0Il3.getValue()).I00000oOI;
/* 288 */                   boolean z15 = ((IO1looOIi) oI10i0Il3.getValue()).I0000Il00O;
                            boolean z16 = (o1oOil != null ? o1oOil.I00000oIO : null) == o1oOl02;
/* 290 */                   int i14 = oloIl1l1oOii.I00100o1O0lo;
/* 291 */                   String str5 = oloIl1l1oOii.I00000oIO;
/* 292 */                   boolean z17 = str5 == "llm_agent_chat";
/* 293 */                   boolean z18 = o1oIOiI11o0.I001i1O0Ol && z2;
/* 294 */                   boolean z19 = o1oIOiI11o0.I001i1lo1io && z3;
/* 295 */                   boolean zI0000O = O0000Ioio00.I0000O(str5, "llm_chat");
/* 296 */                   Object objI00O0i0ii26 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii26 == iOO0o0I1l2) {
/* 297 */                       I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(25);
                                oI10i0Il5 = oI10i0Il6;
                                i0Il0IoIIOll.I00iiI = oI10i0Il5;
                                VarHandle.storeStoreFence();
/* 298 */                       iloI0lOlll13.I00iio(i0Il0IoIIOll);
                                obj2 = i0Il0IoIIOll;
                            } else {
                                oI10i0Il5 = oI10i0Il6;
                                obj2 = objI00O0i0ii26;
                            }
/* 299 */                   Function1 function16 = (Function1) obj2;
/* 300 */                   boolean zI000OOo1O7 = (i13 == 131072) | iloI0lOlll13.I000OOo1O(o1oIOiI11o0) | iloI0lOlll13.I000OOo1O(ili1iIl);
/* 301 */                   Object objI00O0i0ii27 = iloI0lOlll13.I00O0i0ii();
                            Object obj8 = objI00O0i0ii27;
                            if (zI000OOo1O7 || objI00O0i0ii27 == iOO0o0I1l2) {
/* 302 */                       I0O1IO i0o1io = new I0O1IO(3);
                                i0o1io.I00iiI = illiIl1l11O5;
                                i0o1io.I00iiO = o1oIOiI11o0;
                                i0o1io.I00iio = ili1iIl;
                                i0o1io.I00ilI0I1 = oI10i0Il5;
                                VarHandle.storeStoreFence();
/* 303 */                       iloI0lOlll13.I00iio(i0o1io);
                                obj8 = i0o1io;
                            }
/* 304 */                   Function1 function17 = (Function1) obj8;
/* 305 */                   boolean zI000OOo1O8 = (i13 == 131072) | iloI0lOlll13.I000OOo1O(o1oIOiI11o0);
/* 306 */                   Object objI00O0i0ii28 = iloI0lOlll13.I00O0i0ii();
                            Object obj9 = objI00O0i0ii28;
                            if (zI000OOo1O8 || objI00O0i0ii28 == iOO0o0I1l2) {
/* 307 */                       IO1io1iOI iO1io1iOI = new IO1io1iOI(0);
                                iO1io1iOI.I00iiI = illiIl1l11O5;
                                iO1io1iOI.I00iiO = o1oIOiI11o0;
                                VarHandle.storeStoreFence();
/* 308 */                       iloI0lOlll13.I00iio(iO1io1iOI);
                                obj9 = iO1io1iOI;
                            }
/* 309 */                   IllOOo00lI illOOo00lI11 = (IllOOo00lI) obj9;
/* 310 */                   Object objI00O0i0ii29 = iloI0lOlll13.I00O0i0ii();
                            int i15 = 23;
                            if (objI00O0i0ii29 == iOO0o0I1l2) {
/* 311 */                       I00o101lO i00o101lO = new I00o101lO(i15);
                                i00o101lO.I00iiI = oI10i0Il10;
                                oIooi1iOiOol = oIooi1iOiOol2;
                                i00o101lO.I00iiO = oIooi1iOiOol;
                                VarHandle.storeStoreFence();
/* 312 */                       iloI0lOlll13.I00iio(i00o101lO);
                                obj3 = i00o101lO;
                            } else {
                                oIooi1iOiOol = oIooi1iOiOol2;
                                obj3 = objI00O0i0ii29;
                            }
/* 313 */                   Function1 function18 = (Function1) obj3;
/* 314 */                   Object objI00O0i0ii30 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii30 == iOO0o0I1l2) {
                                function13 = function18;
/* 315 */                       IO1ioio1I iO1ioio1I = new IO1ioio1I(0);
                                iO1ioio1I.I00iiI = oIooi1iOiOol;
                                VarHandle.storeStoreFence();
/* 316 */                       iloI0lOlll13.I00iio(iO1ioio1I);
                                obj4 = iO1ioio1I;
                            } else {
                                function13 = function18;
                                obj4 = objI00O0i0ii30;
                            }
/* 317 */                   Function1 function19 = (Function1) obj4;
/* 318 */                   Object objI00O0i0ii31 = iloI0lOlll13.I00O0i0ii();
                            Object obj10 = objI00O0i0ii31;
                            if (objI00O0i0ii31 == iOO0o0I1l2) {
/* 319 */                       IO1ioio1I iO1ioio1I2 = new IO1ioio1I(1);
                                iO1ioio1I2.I00iiI = oIooi1iOiOol3;
                                VarHandle.storeStoreFence();
/* 320 */                       iloI0lOlll13.I00iio(iO1ioio1I2);
                                obj10 = iO1ioio1I2;
                            }
/* 321 */                   Function1 function110 = (Function1) obj10;
/* 322 */                   Object objI00O0i0ii32 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii32 == iOO0o0I1l2) {
                                function14 = function17;
/* 323 */                       IO1ioio1I iO1ioio1I3 = new IO1ioio1I(2);
                                iO1ioio1I3.I00iiI = oIooi1iOiOol4;
                                VarHandle.storeStoreFence();
/* 324 */                       iloI0lOlll13.I00iio(iO1ioio1I3);
                                obj5 = iO1ioio1I3;
                            } else {
                                function14 = function17;
                                obj5 = objI00O0i0ii32;
                            }
/* 325 */                   Function1 function111 = (Function1) obj5;
/* 326 */                   Object objI00O0i0ii33 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii33 == iOO0o0I1l2) {
                                function15 = function111;
                                str = str4;
/* 327 */                       objI00O0i0ii33 = new I1ol0OoiOI1o(oI10i0Il2, 22);
/* 328 */                       iloI0lOlll13.I00iio(objI00O0i0ii33);
                            } else {
                                function15 = function111;
                                str = str4;
                            }
                            int i16 = i10 << 15;
                            oloIl1l1oOii2 = oloIl1l1oOii;
                            illOOo00lI7 = illOOo00lI2;
                            o1ol100o0O2 = o1ol100o0O;
                            illOOo00lI10 = illOOo00lI3;
/* 330 */                   l1O0o1.I00000oOI(oloIl1l1oOii2, o1ol100o0O2, str, z14, z13, iIntValue, z16, i14, function16, function14, z15, illOOo00lI11, illOOo00lI7, function13, function19, illOOo00lI10, function110, function15, z17, z18, z19, z, (IllOOo00lI) objI00O0i0ii33, zI0000O, z4, illOOo00lI4, z5, illOOo00lI5, z6, illOOo00lI6, iloI0lOlll13, ((i6 >> 3) & 14) | 806879232 | ((i6 << 3) & 112), ((i7 << 3) & 7168) | 918773760 | ((i7 << 9) & 3670016), 24576 | ((i7 >> 6) & 7168) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), (i10 >> 15) & 126);
                            z7 = z;
                            z8 = z4;
                            illOOo00lI9 = illOOo00lI4;
                            z9 = z5;
                            illOOo00lI8 = illOOo00lI5;
                            IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 331 */                   iloI0lOlll14.I00111O();
/* 332 */                   iloI0lOlll14.I00111O();
/* 333 */                   if (((Boolean) oI10i0Il9.getValue()).booleanValue()) {
/* 334 */                       iloI0lOlll14.I00i01iIIliI(651664717);
                                if (o1oOil == null || (str2 = o1oOil.I00000oOI) == null) {
/* 39 */                            str2 = "";
                                }
/* 336 */                       Object objI00O0i0ii34 = iloI0lOlll14.I00O0i0ii();
                                iOO0o0I1l = iOO0o0I1l2;
                                if (objI00O0i0ii34 == iOO0o0I1l) {
/* 337 */                           objI00O0i0ii34 = new I1ol0OoiOI1o(oI10i0Il9, 23);
/* 338 */                           iloI0lOlll14.I00iio(objI00O0i0ii34);
                                }
/* 340 */                       ilIIill.I00000oIO(str2, (IllOOo00lI) objI00O0i0ii34, iloI0lOlll14, 48);
/* 341 */                       iloI0lOlll14.I001IIilI0O();
                            } else {
                                iOO0o0I1l = iOO0o0I1l2;
/* 342 */                       iloI0lOlll14.I00i01iIIliI(651788686);
                                iloI0lOlll14.I001IIilI0O();
                            }
/* 343 */                   if (((Boolean) oI10i0Il14.getValue()).booleanValue()) {
/* 344 */                       iloI0lOlll14.I00i01iIIliI(651864295);
/* 345 */                       Object objI00O0i0ii35 = iloI0lOlll14.I00O0i0ii();
                                if (objI00O0i0ii35 == iOO0o0I1l) {
/* 346 */                           objI00O0i0ii35 = new I1ol0OoiOI1o(oI10i0Il14, 21);
/* 347 */                           iloI0lOlll14.I00iio(objI00O0i0ii35);
                                }
/* 348 */                       IllOOo00lI illOOo00lI12 = (IllOOo00lI) objI00O0i0ii35;
/* 349 */                       IO1OO01i0 iO1OO01i04 = (IO1OO01i0) oI10i0Il8.getValue();
                                o1oIOiI11o02 = o1oIOiI11o0;
/* 350 */                       boolean zI000OOo1O9 = ((i6 & 29360128) == 8388608) | iloI0lOlll14.I000OOo1O(o1oIOiI11o02);
/* 351 */                       Object objI00O0i0ii36 = iloI0lOlll14.I00O0i0ii();
                                if (zI000OOo1O9 || objI00O0i0ii36 == iOO0o0I1l) {
                                    illiOIilI2 = illiOIilI;
/* 352 */                           objI00O0i0ii36 = new I0illI1iI(illiOIilI2, o1oIOiI11o02);
/* 353 */                           iloI0lOlll14.I00iio(objI00O0i0ii36);
                                } else {
                                    illiOIilI2 = illiOIilI;
                                }
/* 355 */                       I1oool0O.I00000oIO(illOOo00lI12, iO1OO01i04, (Function3) objI00O0i0ii36, iloI0lOlll14, 6);
/* 356 */                       iloI0lOlll14.I001IIilI0O();
                                iloI0lOlll12 = iloI0lOlll14;
                            } else {
                                o1oIOiI11o02 = o1oIOiI11o0;
                                illiOIilI2 = illiOIilI;
/* 357 */                       iloI0lOlll14.I00i01iIIliI(652178542);
                                iloI0lOlll14.I001IIilI0O();
                                iloI0lOlll12 = iloI0lOlll14;
                            }
                        }
                    } else {
                        illiOIilI2 = illiOIilI;
                        illOOo00lI7 = illOOo00lI2;
                        z7 = z;
                        z8 = z4;
                        z9 = z5;
                        illOOo00lI8 = illOOo00lI5;
                        o1oIOiI11o02 = o1oIOiI11o0;
                        illOOo00lI9 = illOOo00lI4;
/* 358 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 359 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        IO1ilo iO1ilo = new IO1ilo();
                        iO1ilo.I00iOIl = o1ol100o0O2;
                        iO1ilo.I00iiI = oloIl1l1oOii2;
                        iO1ilo.I00iiO = o1oIOiI11o02;
                        iO1ilo.I00iio = o11iO00I1o;
                        iO1ilo.I00ilI0I1 = oIo1Oi1l1lI;
                        iO1ilo.I00ilO0 = illiIl1l11O;
                        iO1ilo.I00io1l = illiIl1l11O2;
                        iO1ilo.I00ioIO = illiOIilI2;
                        iO1ilo.I00l0I0l0lO1 = illOOo00lI;
                        iO1ilo.I00l0OO0IO = o1ooiI111i;
                        iO1ilo.I00li1OI = illiIl1l11O3;
                        iO1ilo.I00ll1 = function1;
                        iO1ilo.I00lli11 = illOOo00lI7;
                        iO1ilo.I00lll10 = illOOo00lI10;
                        iO1ilo.I00o0iI0io1 = illiIl1l11O4;
                        iO1ilo.I00o0l1o1o0 = z7;
                        iO1ilo.I00o101lO = z2;
                        iO1ilo.I00oI0i = z3;
                        iO1ilo.I00oII = iOii1l;
                        iO1ilo.I00oIiI10 = function3;
                        iO1ilo.I00oO101o = function12;
                        iO1ilo.I00oOio10iI1 = z8;
                        iO1ilo.I00ol1 = illOOo00lI9;
                        iO1ilo.I00olI = z9;
                        iO1ilo.I00oli = illOOo00lI8;
                        iO1ilo.I00oliIiO01i = z6;
                        iO1ilo.I00oo1iO0ll = illOOo00lI6;
                        VarHandle.storeStoreFence();
/* 360 */               oOloioIlI001IO000.I0000O = iO1ilo;
                    }
                }

                public static final Object I00000oOI(O0o0I1i0O o0o0I1i0O, Oll0io oll0io) {
                    Object objI0001Ioi1lo;
/* 5 */             int i = o0o0I1i0O.I000OiO().I000oI1ioi;
                    return (i <= 0 || (objI0001Ioi1lo = o0o0I1i0O.I0001Ioi1lo(i + (-1), 1000000, oll0io)) != Ii0111o.I00iOIl) ? OoiIlOl1iI.I00000oIO : objI0001Ioi1lo;
                }
            }

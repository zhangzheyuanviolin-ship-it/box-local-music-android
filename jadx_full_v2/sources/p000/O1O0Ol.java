            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import io.github.darriousliu.katex.freetype.FreeTypeAndroid;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O1O0Ol {
                public static final long I00000oIO;

                static {
/* 3 */             lOlilO1lOIO.I0000O(20);
/* 10 */            I00000oIO = lOlilO1lOIO.I0000O(20);
                }

                public static final void I00000oIO(String str, O1ooiI111i o1ooiI111i, long j, long j2, O1O0iI0oo o1O0iI0oo, O1O11o01I1Il o1O11o01I1Il, boolean z, long j3, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    long j4;
                    int i3;
                    OIoi0IIoi oIoi0IIoi;
                    O1ooiI111i o1ooiI111i2 = o1ooiI111i;
                    long j5 = j;
/* 1 */             iloI0lOlll1.I00i0O(496149811);
                    if ((i & 6) == 0) {
                        i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= iloI0lOlll1.I0001Ioi1lo(j5) ? 256 : Barcode.FORMAT_ITF;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 2048 : Barcode.FORMAT_UPC_E;
                    }
                    int i4 = i2 | 24576;
                    if ((196608 & i) == 0) {
                        i4 |= iloI0lOlll1.I0000oI00(o1O0iI0oo.ordinal()) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i4 |= iloI0lOlll1.I0000oI00(o1O11o01I1Il.ordinal()) ? 1048576 : 524288;
                    }
                    if ((12582912 & i) == 0) {
                        i4 |= iloI0lOlll1.I000O01llI0(z) ? 8388608 : 4194304;
                    }
                    int i5 = i4 | 100663296;
                    if (iloI0lOlll1.I00OIl(i5 & 1, (38347923 & i5) != 38347922)) {
/* 2 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 3 */                 IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        if (objI00O0i0ii == iOO0o0I1l) {
/* 5 */                     objI00O0i0ii = lOO00IiI0li.I00000oIO(new O1O0lOI());
/* 6 */                     iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 7 */                 OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
                        O1IooO o1IooO = null;
/* 8 */                 boolean zI000II = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | iloI0lOlll1.I000II(null) | ((i5 & 458752) == 131072) | ((i5 & 234881024) == 67108864);
/* 9 */                 Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 10 */                    if (str.length() > 0) {
/* 11 */                        if (str.length() > 0) {
/* 12 */                            O1O0lOI o1O0lOI = new O1O0lOI();
/* 14 */                            O1O000oloOl o1O000oloOl = new O1O000oloOl();
/* 15 */                            o1O000oloOl.I00000oIO = str;
/* 16 */                            o1O000oloOl.I0000Il00O = str.length();
/* 17 */                            o1O000oloOl.I0001Ioi1lo = O1Ill10.I00iOIl;
/* 18 */                            o1O000oloOl.I000OOo1O = new Character[]{'{', '}', '$', '#', '%', '_', '|', ' ', ',', '>', ';', '!', '\\'};
                                    i3 = i5;
/* 30 */                            o1O000oloOl.I000OiO = O1Oii0O0loo.I0000Il00O(new OIoi0IIoi("over", new String[]{""}), new OIoi0IIoi("atop", new String[]{""}), new OIoi0IIoi("choose", new String[]{"(", ")"}), new OIoi0IIoi("brack", new String[]{"[", "]"}), new OIoi0IIoi("brace", new String[]{"{", "}"}));
/* 31 */                            VarHandle.storeStoreFence();
/* 32 */                            O1IooO o1IooOI00000oIO = o1O000oloOl.I00000oIO(false, (char) 0);
/* 33 */                            if (o1O000oloOl.I0001Ioi1lo()) {
/* 34 */                                o1O000oloOl.I000l1(O1O0lio1liIo.I00iiI, "Mismatched braces: ".concat(str));
                                        o1IooOI00000oIO = null;
                                    }
/* 35 */                            O1O0lOI o1O0lOI2 = o1O000oloOl.I000O01llI0;
                                    if (o1O0lOI2 != null) {
                                        if (o1O0lOI2 != null) {
/* 36 */                                    o1O0lOI.I00000oIO = o1O0lOI2.I00000oIO;
/* 37 */                                    o1O0lOI.I00000oOI = o1O0lOI2.I00000oOI;
                                        }
                                        o1IooOI00000oIO = null;
                                    }
/* 40 */                            oIoi0IIoi = new OIoi0IIoi(o1O0lOI.I00000oIO != O1O0lio1liIo.I00iOIl ? null : o1IooOI00000oIO, o1O0lOI);
                                } else {
                                    i3 = i5;
/* 42 */                            oIoi0IIoi = new OIoi0IIoi(null, new O1O0lOI());
                                }
/* 44 */                        o1IooO = (O1IooO) oIoi0IIoi.I00iOIl;
/* 47 */                        oI10i0Il.setValue((O1O0lOI) oIoi0IIoi.I00iiI);
                            } else {
                                i3 = i5;
                            }
/* 48 */                    iloI0lOlll1.I00iio(o1IooO);
                            objI00O0i0ii2 = o1IooO;
                        } else {
                            i3 = i5;
                        }
/* 50 */                O1O0lOI o1O0lOI3 = (O1O0lOI) oI10i0Il.getValue();
                        int i6 = i3 << 3;
                        int i7 = (i3 & 112) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024) | (i6 & 1879048192);
/* 51 */                j4 = I00000oIO;
                        o1ooiI111i2 = o1ooiI111i;
                        j5 = j;
/* 49 */                I00000oOI((O1IooO) objI00O0i0ii2, o1ooiI111i2, o1O0lOI3, j5, j2, o1O0iI0oo, o1O11o01I1Il, z, j4, iloI0lOlll1, i7);
                    } else {
/* 52 */                iloI0lOlll1.I00OilO00Il();
                        j4 = j3;
                    }
/* 53 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        O1O0IoI01 o1O0IoI01 = new O1O0IoI01();
                        o1O0IoI01.I00iOIl = str;
                        o1O0IoI01.I00iiI = o1ooiI111i2;
                        o1O0IoI01.I00iiO = j5;
                        o1O0IoI01.I00iio = j2;
                        o1O0IoI01.I00ilI0I1 = o1O0iI0oo;
                        o1O0IoI01.I00ilO0 = o1O11o01I1Il;
                        o1O0IoI01.I00io1l = z;
                        o1O0IoI01.I00ioIO = j4;
                        o1O0IoI01.I00l0I0l0lO1 = i;
                        VarHandle.storeStoreFence();
/* 54 */                oOloioIlI001IO000.I0000O = o1O0IoI01;
                    }
                }

                public static final void I00000oOI(O1IooO o1IooO, O1ooiI111i o1ooiI111i, O1O0lOI o1O0lOI, long j, long j2, O1O0iI0oo o1O0iI0oo, O1O11o01I1Il o1O11o01I1Il, boolean z, long j3, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1O00IIOio1l o1O00IIOio1lI00000oIO;
                    OIoi0IIoi oIoi0IIoi;
                    O1IoI1l1IIo0 o1IoI1l1IIo0;
                    Il1oollOO1iI il1oollOO1iII00000oIO;
                    O1ooiI111i o1ooiI111i2 = o1ooiI111i;
                    O1O0lOI o1O0lOI2 = o1O0lOI;
                    long j4 = j2;
                    long j5 = j3;
                    IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 1 */             iloI0lOlll12.I00i0O(-516324697);
                    int i3 = (i & 6) == 0 ? (iloI0lOlll12.I000OOo1O(o1IooO) ? 4 : 2) | i : i;
                    if ((i & 48) == 0) {
                        i3 |= iloI0lOlll12.I000II(o1ooiI111i2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i3 |= iloI0lOlll12.I000OOo1O(o1O0lOI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
                    if ((i & 3072) == 0) {
                        i3 |= iloI0lOlll12.I0001Ioi1lo(j) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll12.I0001Ioi1lo(j4) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= iloI0lOlll12.I000OOo1O(null) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= iloI0lOlll12.I0000oI00(o1O0iI0oo.ordinal()) ? 1048576 : 524288;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= iloI0lOlll12.I0000oI00(o1O11o01I1Il.ordinal()) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i) == 0) {
                        i3 |= iloI0lOlll12.I000O01llI0(z) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        i3 |= iloI0lOlll12.I0001Ioi1lo(j5) ? 536870912 : 268435456;
                    }
                    int i4 = i3;
                    if (iloI0lOlll12.I00OIl(i4 & 1, (306783379 & i4) != 306783378)) {
/* 4 */                 IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll12.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 5 */                 Oo0ioO oo0ioOI00000oIO = lOli1ioiOl.I00000oIO(iloI0lOlll12);
                        boolean zI000II = iloI0lOlll12.I000II(o1IooO) | iloI0lOlll12.I000II(o1O0lOI2) | ((i4 & 7168) == 2048) | iloI0lOlll12.I000II(null) | ((i4 & 3670016) == 1048576) | ((234881024 & i4) == 67108864);
/* 7 */                 Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 8 */                 if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 9 */                     HashMap map = O1IliIO1iiO.I00000oIO;
/* 10 */                    O1IooIOio0[] o1IooIOio0Arr = O1IooIOio0.I00iOIl;
/* 11 */                    HashMap map2 = O1IliIO1iiO.I00000oIO;
                            O1IlIoIOOIi o1IlIoIOOIiI00000oIO = (O1IlIoIOOIi) map2.get("latinmodern-math");
                            if (o1IlIoIOOIiI00000oIO == null) {
                                i2 = i4;
/* 13 */                        O1IlIoIOOIi o1IlIoIOOIi = new O1IlIoIOOIi();
/* 14 */                        o1IlIoIOOIi.I00000oIO = 20.0f;
/* 16 */                        O1Ill0ioO10 o1Ill0ioO10 = new O1Ill0ioO10();
/* 17 */                        o1Ill0ioO10.I00000oIO = 20.0f;
/* 18 */                        o1Ill0ioO10.I00000oOI = "latinmodern-math";
/* 20 */                        O0oO1ilo o0oO1iloNewLibrary = IoOil1.I00000oIO.newLibrary();
                                if (o0oO1iloNewLibrary == null) {
/* 81 */                            throw new O1Ooo1IIioo("Error initializing FreeType.");
                                }
                                try {
/* 22 */                            il1oollOO1iII00000oIO = o0oO1iloNewLibrary.I00000oIO(li1IiOlol.I00000oIO("files/fonts/latinmodern-math.otf"));
                                } catch (Exception e) {
/* 23 */                            System.out.println(e);
                                    il1oollOO1iII00000oIO = null;
                                }
/* 24 */                        long j6 = il1oollOO1iII00000oIO.I00000oIO;
                                o1Ill0ioO10.I0000O = il1oollOO1iII00000oIO;
/* 25 */                        int i5 = (int) (o1Ill0ioO10.I00000oIO * 64.0f);
/* 26 */                        FreeTypeAndroid freeTypeAndroid = IoOil1.I00000oIO;
/* 28 */                        freeTypeAndroid.setCharSize(il1oollOO1iII00000oIO.I00000oIO, 0, i5, 0, 0);
/* 30 */                        o1Ill0ioO10.I0000Il00O = freeTypeAndroid.faceGetUnitsPerEM(j6);
/* 33 */                        OI1OOIOiOI1 oI1OOIOiOI1NewBuffer = freeTypeAndroid.newBuffer(il1oollOO1iII00000oIO.I00000oOI.I00000oIO.remaining());
/* 35 */                        O0i1llII o0i1llII = new O0i1llII(1);
                                o0i1llII.I0000Il00O = oI1OOIOiOI1NewBuffer;
/* 36 */                        HashMap map3 = new HashMap();
                                o0i1llII.I0000O = map3;
/* 37 */                        o0i1llII.I0000oI00 = new HashMap();
/* 38 */                        o0i1llII.I0001Ioi1lo = new HashMap();
/* 39 */                        o0i1llII.I000II = new HashMap();
/* 40 */                        o0i1llII.I000O01llI0 = new HashMap();
/* 41 */                        ByteBuffer byteBuffer = oI1OOIOiOI1NewBuffer.I00000oIO;
/* 43 */                        if (freeTypeAndroid.loadMathTable(j6, oI1OOIOiOI1NewBuffer, byteBuffer.remaining()) && byteBuffer.getInt() == 65536) {
/* 45 */                            int iI00000oIO = o0i1llII.I00000oIO();
/* 46 */                            int iI00000oIO2 = o0i1llII.I00000oIO();
/* 47 */                            int iI00000oIO3 = o0i1llII.I00000oIO();
/* 48 */                            oI1OOIOiOI1NewBuffer.I00000oIO(iI00000oIO);
                                    int i6 = 0;
                                    while (i6 < 112) {
/* 49 */                                String[] strArr = iIoOoli.I00000oIO;
                                        int i7 = i6;
                                        String str = strArr[i7];
/* 50 */                                String str2 = strArr[i7 + 1];
/* 51 */                                if (O0000Ioio00.I0000O(str, "uint16") || O0000Ioio00.I0000O(str, "int16")) {
/* 56 */                                    map3.put(str2, Integer.valueOf(o0i1llII.I00000oIO()));
                                        } else {
/* 52 */                                    int iI00000oIO4 = o0i1llII.I00000oIO();
/* 53 */                                    o0i1llII.I00000oIO();
/* 54 */                                    map3.put(str2, Integer.valueOf(iI00000oIO4));
                                        }
                                        i6 = i7 + 2;
                                    }
/* 57 */                            oI1OOIOiOI1NewBuffer.I00000oIO(iI00000oIO2);
/* 58 */                            int iI00000oIO5 = o0i1llII.I00000oIO();
/* 59 */                            int iI00000oIO6 = o0i1llII.I00000oIO();
/* 61 */                            o0i1llII.I0000oI00(iI00000oIO5 + iI00000oIO2, (HashMap) o0i1llII.I0000oI00);
/* 62 */                            o0i1llII.I0000oI00(iI00000oIO2 + iI00000oIO6, (HashMap) o0i1llII.I0001Ioi1lo);
/* 63 */                            oI1OOIOiOI1NewBuffer.I00000oIO(iI00000oIO3);
/* 64 */                            o0i1llII.I00000oOI = o0i1llII.I00000oIO();
/* 65 */                            int iI00000oIO7 = o0i1llII.I00000oIO();
/* 66 */                            int iI00000oIO8 = o0i1llII.I00000oIO();
/* 68 */                            int iI00000oIO9 = o0i1llII.I00000oIO();
/* 69 */                            Integer[] numArrI0000O = o0i1llII.I0000O(iI00000oIO7 + iI00000oIO3);
/* 70 */                            Integer[] numArrI0000O2 = o0i1llII.I0000O(iI00000oIO8 + iI00000oIO3);
                                    int i8 = 0;
                                    for (int iI00000oIO10 = o0i1llII.I00000oIO(); i8 < iI00000oIO10; iI00000oIO10 = iI00000oIO10) {
                                        Integer[] numArr = numArrI0000O;
/* 72 */                                ((HashMap) o0i1llII.I000II).put(numArr[i8], o0i1llII.I0000Il00O(iI00000oIO3 + o0i1llII.I00000oIO()));
                                        i8++;
                                        numArrI0000O = numArr;
                                        numArrI0000O2 = numArrI0000O2;
                                    }
                                    Integer[] numArr2 = numArrI0000O2;
                                    for (int i9 = 0; i9 < iI00000oIO9; i9++) {
/* 74 */                                ((HashMap) o0i1llII.I000O01llI0).put(numArr2[i9], o0i1llII.I0000Il00O(o0i1llII.I00000oIO() + iI00000oIO3));
                                    }
                                }
/* 75 */                        VarHandle.storeStoreFence();
/* 77 */                        IoOil1.I00000oIO.deleteBuffer(oI1OOIOiOI1NewBuffer);
/* 78 */                        o1Ill0ioO10.I0000oI00 = o0i1llII;
/* 79 */                        o1IlIoIOOIi.I00000oOI = o1Ill0ioO10;
/* 80 */                        map2.put("latinmodern-math", o1IlIoIOOIi);
                                o1IlIoIOOIiI00000oIO = o1IlIoIOOIi;
                            } else {
                                i2 = i4;
                                if (o1IlIoIOOIiI00000oIO.I00000oIO != 20.0f) {
/* 83 */                            o1IlIoIOOIiI00000oIO = o1IlIoIOOIiI00000oIO.I00000oIO(20.0f);
                                }
                            }
/* 84 */                    O1IlIoIOOIi o1IlIoIOOIiI00000oIO2 = o1IlIoIOOIiI00000oIO.I00000oIO(iiIooOOOI.I00oO101o(j));
                            if (o1IooO != null) {
/* 85 */                        int iOrdinal = o1O0iI0oo.ordinal();
                                if (iOrdinal == 0) {
/* 88 */                            o1IoI1l1IIo0 = O1IoI1l1IIo0.I00iOIl;
                                } else {
                                    if (iOrdinal != 1) {
/* 87 */                                I000II.I00000oIO();
                                        return;
                                    }
/* 86 */                            o1IoI1l1IIo0 = O1IoI1l1IIo0.I00iiI;
                                }
/* 89 */                        o1O00IIOio1lI00000oIO = l11ioolOl1oO.I00000oIO(o1IooO, o1IlIoIOOIiI00000oIO2, o1IoI1l1IIo0);
                            } else {
                                o1O00IIOio1lI00000oIO = null;
                            }
                            if (o1O00IIOio1lI00000oIO != null) {
                                j5 = j3;
/* 95 */                        oIoi0IIoi = new OIoi0IIoi(Iil1010O.I00000oIO(iiIooOOOI.I00OIO1(o1O00IIOio1lI00000oIO.I0000Il00O + 1.0f)), Iil1010O.I00000oIO(iiIooOOOI.I00OIO1(o1O00IIOio1lI00000oIO.I00000oIO + o1O00IIOio1lI00000oIO.I00000oOI + 1.0f)));
                                o1O0lOI2 = o1O0lOI;
                            } else {
                                o1O0lOI2 = o1O0lOI;
/* 97 */                        if (o1O0lOI == null || o1O0lOI2.I00000oIO == O1O0lio1liIo.I00iOIl || !z) {
                                    j5 = j3;
/* 106 */                           oIoi0IIoi = new OIoi0IIoi(Iil1010O.I00000oIO(0.0f), Iil1010O.I00000oIO(0.0f));
                                } else {
                                    j5 = j3;
/* 98 */                            float fI001lIiIIo1O = iiIooOOOI.I001lIiIIo1O(j5);
/* 103 */                           oIoi0IIoi = new OIoi0IIoi(Iil1010O.I00000oIO(o1O0lOI2.I00000oOI.length() * fI001lIiIIo1O * 0.6f), Iil1010O.I00000oIO(fI001lIiIIo1O * 1.2f));
                                }
                            }
/* 109 */                   float f = ((Iil1010O) oIoi0IIoi.I00iOIl).I00iOIl;
/* 112 */                   float f2 = ((Iil1010O) oIoi0IIoi.I00iiI).I00iOIl;
/* 114 */                   O1O0iiiI1li o1O0iiiI1li = new O1O0iiiI1li();
/* 115 */                   o1O0iiiI1li.I00000oIO = o1O00IIOio1lI00000oIO;
/* 116 */                   o1O0iiiI1li.I00000oOI = f;
/* 117 */                   o1O0iiiI1li.I0000Il00O = f2;
/* 118 */                   o1O0iiiI1li.I0000O = o1O0lOI2;
/* 119 */                   VarHandle.storeStoreFence();
                            iloI0lOlll12 = iloI0lOlll1;
/* 120 */                   iloI0lOlll12.I00iio(o1O0iiiI1li);
                            objI00O0i0ii = o1O0iiiI1li;
                        } else {
                            i2 = i4;
                        }
/* 121 */               O1O0iiiI1li o1O0iiiI1li2 = (O1O0iiiI1li) objI00O0i0ii;
                        j4 = j2;
                        o1ooiI111i2 = o1ooiI111i;
/* 127 */               I0000Il00O(o1O0iiiI1li2.I0000O, o1O0iiiI1li2.I00000oIO, Ol0iOOO0.I000o00OoI0I(o1ooiI111i, o1O0iiiI1li2.I00000oOI, o1O0iiiI1li2.I0000Il00O), j4, o1O11o01I1Il, j5, oo0ioOI00000oIO, iloI0lOlll12, ((i2 >> 3) & 7168) | ((i2 >> 9) & 57344) | ((i2 >> 12) & 458752));
                    } else {
/* 128 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 129 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        O1O0O1l o1O0O1l = new O1O0O1l();
                        o1O0O1l.I00iOIl = o1IooO;
                        o1O0O1l.I00iiI = o1ooiI111i2;
                        o1O0O1l.I00iiO = o1O0lOI2;
                        o1O0O1l.I00iio = j;
                        o1O0O1l.I00ilI0I1 = j4;
                        o1O0O1l.I00ilO0 = o1O0iI0oo;
                        o1O0O1l.I00io1l = o1O11o01I1Il;
                        o1O0O1l.I00ioIO = z;
                        o1O0O1l.I00l0I0l0lO1 = j5;
                        o1O0O1l.I00l0OO0IO = i;
                        VarHandle.storeStoreFence();
/* 130 */               oOloioIlI001IO000.I0000O = o1O0O1l;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(O1O0lOI o1O0lOI, O1O00IIOio1l o1O00IIOio1l, O1ooiI111i o1ooiI111i, long j, O1O11o01I1Il o1O11o01I1Il, long j2, Oo0ioO oo0ioO, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 22 */            iloI0lOlll1.I00i0O(-1776372358);
/* 27 */            if ((i & 6) == 0) {
/* 38 */                i2 = (iloI0lOlll1.I000OOo1O(o1O0lOI) ? 4 : 2) | i;
                    } else {
/* 40 */                i2 = i;
                    }
/* 43 */            if ((i & 48) == 0) {
/* 56 */                i2 |= iloI0lOlll1.I000OOo1O(o1O00IIOio1l) ? 32 : 16;
                    }
/* 59 */            if ((i & 384) == 0) {
/* 72 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 75 */            if ((i & 3072) == 0) {
/* 88 */                i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 91 */            if ((i & 24576) == 0) {
/* 108 */               i2 |= iloI0lOlll1.I0000oI00(o1O11o01I1Il.ordinal()) ? 16384 : 8192;
                    }
/* 114 */           if ((196608 & i) == 0) {
/* 126 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 131072 : 65536;
                    }
/* 133 */           if ((i & 1572864) == 0) {
/* 146 */               i2 |= iloI0lOlll1.I000II(oo0ioO) ? 1048576 : 524288;
                    }
/* 156 */           int i3 = 0;
/* 171 */           if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 599187) != 599186)) {
/* 173 */               iloI0lOlll1.I00Ol00();
/* 178 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 187 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 190 */               iloI0lOlll1.I0010o();
/* 258 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1O0lOI) | ((458752 & i2) == 131072) | ((((3670016 & i2) ^ 1572864) > 1048576 && iloI0lOlll1.I000II(oo0ioO)) || (i2 & 1572864) == 1048576) | iloI0lOlll1.I000OOo1O(o1O00IIOio1l) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
/* 260 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 264 */               if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 268 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 272 */                       O1O0OiO0o o1O0OiO0o = new O1O0OiO0o();
/* 275 */                       o1O0OiO0o.I00iOIl = o1O0lOI;
/* 277 */                       o1O0OiO0o.I00iiI = j2;
/* 279 */                       o1O0OiO0o.I00iiO = oo0ioO;
/* 281 */                       o1O0OiO0o.I00iio = o1O00IIOio1l;
/* 283 */                       o1O0OiO0o.I00ilI0I1 = j;
/* 285 */                       o1O0OiO0o.I00ilO0 = o1O11o01I1Il;
/* 287 */                       VarHandle.storeStoreFence();
/* 290 */                       iloI0lOlll1.I00iio(o1O0OiO0o);
                                obj = o1O0OiO0o;
                            }
/* 299 */                   iOl0ilO1.I00000oIO(o1ooiI111i, (Function1) obj, iloI0lOlll1, (i2 >> 6) & 14);
                        }
                    } else {
/* 303 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 306 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 310 */           if (oOloioIlI001IO000 != null) {
/* 314 */               O1O0Oiool0 o1O0Oiool0 = new O1O0Oiool0(i3);
/* 317 */               o1O0Oiool0.I00ilO0 = o1O0lOI;
/* 319 */               o1O0Oiool0.I00io1l = o1O00IIOio1l;
/* 321 */               o1O0Oiool0.I00iiI = o1ooiI111i;
/* 323 */               o1O0Oiool0.I00iiO = j;
/* 325 */               o1O0Oiool0.I00ioIO = o1O11o01I1Il;
/* 327 */               o1O0Oiool0.I00iio = j2;
/* 329 */               o1O0Oiool0.I00l0I0l0lO1 = oo0ioO;
/* 331 */               o1O0Oiool0.I00ilI0I1 = i;
/* 333 */               VarHandle.storeStoreFence();
/* 336 */               oOloioIlI001IO000.I0000O = o1O0Oiool0;
                    }
                }
            }

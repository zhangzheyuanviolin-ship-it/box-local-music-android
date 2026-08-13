            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I1oioi1oI {
                static {
/* 3 */             il1llI.I00000oIO(40.0f, 40.0f);
                }

                /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x018b  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x01b1  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x01df  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x01f6  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0315  */
                /* JADX WARN: Removed duplicated region for block: B:220:0x032c  */
                /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oo0OI01Il oo0OI01Il, Function1 function1, O1ooiI111i o1ooiI111i, boolean z, Oo0lloOiiIOI oo0lloOiiIOI, O0OO00iO o0OO00iO, O0OO00i o0OO00i, int i, int i2, OoooioIi0I ooooioIi0I, Function1 function12, OI0lOIiOIOOo oI0lOIiOIOOo, III11l1I iII11l1I, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i3, int i4, int i5) {
                    int i6;
                    boolean z2;
                    int i7;
                    int i8;
                    O0OO00iO o0OO00iO2;
                    int i9;
                    O0OO00i o0OO00i2;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    O1ooiI111i o1ooiI111i2;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    int i22;
                    OoooioIi0I ooooioIi0I2;
                    Function1 function13;
                    OI0lOIiOIOOo oI0lOIiOIOOo2;
                    III11l1I olI00IIlOO;
                    OOloioIl oOloioIlI001IO000;
                    int i23;
                    O0OO00i o0OO00i3;
                    Function1 function14;
                    int i24;
                    OI0lOIiOIOOo oI0lOIiOIOOo3;
                    boolean z3;
                    int i25;
                    int i26;
                    Function1 function15;
                    OoooioIi0I ooooioIi0I3;
                    O0OO00iO o0OO00iO3;
                    O0OO00i o0OO00i4;
                    Oo0OI01Il oo0OI01Il2 = oo0OI01Il;
/* 1 */             iloI0lOlll1.I00i0O(-971111025);
                    if ((i3 & 6) == 0) {
                        i6 = (iloI0lOlll1.I000II(oo0OI01Il2) ? 4 : 2) | i3;
                    } else {
                        i6 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i6 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
                    int i27 = i3 & 384;
                    int i28 = Barcode.FORMAT_QR_CODE;
                    if (i27 == 0) {
                        i6 |= iloI0lOlll1.I000II(o1ooiI111i) ? 256 : Barcode.FORMAT_ITF;
                    }
                    int i29 = i5 & 8;
                    int i30 = Barcode.FORMAT_UPC_E;
                    if (i29 != 0) {
                        i6 |= 3072;
                    } else {
                        if ((i3 & 3072) == 0) {
                            z2 = z;
                            i6 |= iloI0lOlll1.I000O01llI0(z2) ? 2048 : 1024;
                        }
                        if ((i5 & 16) == 0) {
                            i6 |= 24576;
                        } else if ((i3 & 24576) == 0) {
                            i6 |= iloI0lOlll1.I000O01llI0(false) ? 16384 : 8192;
                        }
                        if ((i3 & 196608) == 0) {
                            i6 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? 131072 : 65536;
                        }
                        i7 = i5 & 64;
                        if (i7 == 0) {
                            i6 |= 1572864;
                        } else {
                            if ((i3 & 1572864) == 0) {
                                i8 = 196608;
                                o0OO00iO2 = o0OO00iO;
                                i6 |= iloI0lOlll1.I000II(o0OO00iO2) ? 1048576 : 524288;
                            }
                            i9 = i5 & Barcode.FORMAT_ITF;
                            if (i9 != 0) {
                                i6 |= 12582912;
                                o0OO00i2 = o0OO00i;
                            } else {
                                o0OO00i2 = o0OO00i;
                                if ((i3 & 12582912) == 0) {
                                    i6 |= iloI0lOlll1.I000II(o0OO00i2) ? 8388608 : 4194304;
                                }
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                i6 |= 100663296;
                            } else if ((i3 & 100663296) == 0) {
                                i6 |= iloI0lOlll1.I000O01llI0(false) ? 67108864 : 33554432;
                            }
                            if ((805306368 & i3) == 0) {
                                if ((i5 & Barcode.FORMAT_UPC_A) == 0) {
                                    i10 = i;
                                    int i31 = iloI0lOlll1.I0000oI00(i10) ? 536870912 : 268435456;
                                    i6 |= i31;
                                } else {
                                    i10 = i;
                                }
                                i6 |= i31;
                            } else {
                                i10 = i;
                            }
                            i11 = i5 & Barcode.FORMAT_UPC_E;
                            if (i11 != 0) {
                                i13 = i4 | 6;
                                i12 = i11;
                            } else if ((i4 & 6) == 0) {
                                i12 = i11;
                                i13 = i4 | (iloI0lOlll1.I0000oI00(i2) ? 4 : 2);
                            } else {
                                i12 = i11;
                                i13 = i4;
                            }
                            i14 = i5 & Barcode.FORMAT_PDF417;
                            if (i14 != 0) {
                                i13 |= 48;
                                i15 = i14;
                            } else if ((i4 & 48) == 0) {
                                i15 = i14;
                                i13 |= iloI0lOlll1.I000II(ooooioIi0I) ? 32 : 16;
                            } else {
                                i15 = i14;
                            }
                            int i32 = i13;
                            i16 = i5 & Barcode.FORMAT_AZTEC;
                            if (i16 != 0) {
                                i17 = i32 | 384;
                            } else if ((i4 & 384) == 0) {
                                if (!iloI0lOlll1.I000OOo1O(function12)) {
                                    i28 = Barcode.FORMAT_ITF;
                                }
                                i17 = i32 | i28;
                            } else {
                                i17 = i32;
                            }
                            i18 = i5 & 8192;
                            if (i18 != 0) {
                                i19 = i17 | 3072;
                            } else {
                                int i33 = i17;
                                if ((i4 & 3072) == 0) {
                                    if (iloI0lOlll1.I000II(oI0lOIiOIOOo)) {
                                        i30 = 2048;
                                    }
                                    i19 = i33 | i30;
                                } else {
                                    i19 = i33;
                                }
                            }
                            i20 = i5 & 16384;
                            if (i20 == 0) {
                                i21 = i19;
                                if ((i4 & 24576) == 0) {
                                    i21 |= iloI0lOlll1.I000II(iII11l1I) ? 16384 : 8192;
                                }
                                if ((i4 & i8) == 0) {
                                    i21 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 131072 : 65536;
                                }
                                if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
                                    o1ooiI111i2 = o1ooiI111i;
                                    oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 20 */                            iloI0lOlll1.I00OilO00Il();
                                    i22 = i2;
                                    ooooioIi0I2 = ooooioIi0I;
                                    function13 = function12;
                                    oI0lOIiOIOOo2 = oI0lOIiOIOOo;
                                    olI00IIlOO = iII11l1I;
                                } else {
                                    iloI0lOlll1.I00Ol00();
                                    int i34 = i3 & 1;
                                    Object obj = IOl11li.I00000oIO;
                                    if (i34 == 0 || iloI0lOlll1.I001lloI()) {
                                        if (i29 != 0) {
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
/* 3 */                                     o0OO00iO2 = O0OO00iO.I0000Il00O;
                                        }
/* 4 */                                 O0OO00i o0OO00i5 = i9 != 0 ? O0OO00i.I0000Il00O : o0OO00i2;
                                        if ((i5 & Barcode.FORMAT_UPC_A) != 0) {
                                            i6 &= -1879048193;
                                            i23 = Integer.MAX_VALUE;
                                        } else {
                                            i23 = i10;
                                        }
                                        int i35 = i12 != 0 ? 1 : i2;
/* 5 */                                 OoooioIi0I ooooioIi0I4 = i15 != 0 ? lolIo0.I00l0I0l0lO1 : ooooioIi0I;
                                        if (i16 != 0) {
/* 6 */                                     Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                            if (objI00O0i0ii == obj) {
                                                o0OO00i3 = o0OO00i5;
/* 7 */                                         objI00O0i0ii = new I10I0o1ii10(13);
/* 8 */                                         iloI0lOlll1.I00iio(objI00O0i0ii);
                                            } else {
                                                o0OO00i3 = o0OO00i5;
                                            }
/* 9 */                                     function14 = (Function1) objI00O0i0ii;
                                        } else {
                                            o0OO00i3 = o0OO00i5;
                                            function14 = function12;
                                        }
                                        Function1 function16 = function14;
                                        int i36 = i35;
                                        i24 = i6;
                                        oI0lOIiOIOOo3 = i18 != 0 ? null : oI0lOIiOIOOo;
                                        z3 = z2;
                                        i25 = i23;
                                        i26 = i36;
                                        function15 = function16;
/* 12 */                                olI00IIlOO = i20 != 0 ? new OlI00IIlOO(IOOiio0i.I00000oOI) : iII11l1I;
                                        ooooioIi0I3 = ooooioIi0I4;
                                        o0OO00iO3 = o0OO00iO2;
                                        o0OO00i4 = o0OO00i3;
                                    } else {
/* 2 */                                 iloI0lOlll1.I00OilO00Il();
                                        if ((i5 & Barcode.FORMAT_UPC_A) != 0) {
                                            i6 &= -1879048193;
                                        }
                                        ooooioIi0I3 = ooooioIi0I;
                                        function15 = function12;
                                        olI00IIlOO = iII11l1I;
                                        i24 = i6;
                                        z3 = z2;
                                        i25 = i10;
                                        o0OO00iO3 = o0OO00iO2;
                                        oI0lOIiOIOOo3 = oI0lOIiOIOOo;
                                        o0OO00i4 = o0OO00i2;
                                        i26 = i2;
                                    }
/* 13 */                            iloI0lOlll1.I0010o();
/* 14 */                            IoiiO1O1 ioiiO1O1I00000oIO = o0OO00iO3.I00000oIO(false);
                                    O0OO00iO o0OO00iO4 = o0OO00iO3;
                                    boolean z4 = ((i24 & 14) == 4) | ((i24 & 112) == 32);
/* 15 */                            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                    Object obj2 = objI00O0i0ii2;
                                    if (z4 || objI00O0i0ii2 == obj) {
/* 16 */                                I00o101lO i00o101lO = new I00o101lO(18);
                                        i00o101lO.I00iiI = oo0OI01Il2;
                                        i00o101lO.I00iiO = function1;
                                        VarHandle.storeStoreFence();
/* 17 */                                iloI0lOlll1.I00iio(i00o101lO);
                                        obj2 = i00o101lO;
                                    }
                                    int i37 = i21 << 9;
                                    ooooioIi0I2 = ooooioIi0I3;
                                    function13 = function15;
                                    oI0lOIiOIOOo2 = oI0lOIiOIOOo3;
                                    oo0OI01Il2 = oo0OI01Il;
                                    oo0lloOiiIOI2 = oo0lloOiiIOI;
                                    o1ooiI111i2 = o1ooiI111i;
/* 19 */                            iioii1oiO01i.I00000oIO(oo0OI01Il2, (Function1) obj2, o1ooiI111i2, oo0lloOiiIOI2, ooooioIi0I2, function13, oI0lOIiOIOOo2, olI00IIlOO, true, i25, i26, ioiiO1O1I00000oIO, o0OO00i4, z3, false, iOii1l, iloI0lOlll1, (i24 & 910) | ((i24 >> 6) & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016) | (i37 & 29360128), (i24 & 7168) | ((i24 >> 15) & 896) | (i24 & 57344) | (i21 & 458752));
                                    i22 = i26;
                                    o0OO00i2 = o0OO00i4;
                                    o0OO00iO2 = o0OO00iO4;
                                    i10 = i25;
                                    z2 = z3;
                                }
/* 21 */                        oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                                if (oOloioIlI001IO000 == null) {
                                    I1oio01OIO i1oio01OIO = new I1oio01OIO();
                                    i1oio01OIO.I00iOIl = oo0OI01Il2;
                                    i1oio01OIO.I00iiI = function1;
                                    i1oio01OIO.I00iiO = o1ooiI111i2;
                                    i1oio01OIO.I00iio = z2;
                                    i1oio01OIO.I00ilI0I1 = oo0lloOiiIOI2;
                                    i1oio01OIO.I00ilO0 = o0OO00iO2;
                                    i1oio01OIO.I00io1l = o0OO00i2;
                                    i1oio01OIO.I00ioIO = i10;
                                    i1oio01OIO.I00l0I0l0lO1 = i22;
                                    i1oio01OIO.I00l0OO0IO = ooooioIi0I2;
                                    i1oio01OIO.I00li1OI = function13;
                                    i1oio01OIO.I00ll1 = oI0lOIiOIOOo2;
                                    i1oio01OIO.I00lli11 = olI00IIlOO;
                                    i1oio01OIO.I00lll10 = iOii1l;
                                    i1oio01OIO.I00o0iI0io1 = i3;
                                    i1oio01OIO.I00o0l1o1o0 = i4;
                                    i1oio01OIO.I00o101lO = i5;
                                    VarHandle.storeStoreFence();
/* 22 */                            oOloioIlI001IO000.I0000O = i1oio01OIO;
                                    return;
                                }
                                return;
                            }
                            i21 = i19 | 24576;
                            if ((i4 & i8) == 0) {
                            }
                            if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
                            }
/* 21 */                    oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                            if (oOloioIlI001IO000 == null) {
                            }
                        }
                        i8 = 196608;
                        o0OO00iO2 = o0OO00iO;
                        i9 = i5 & Barcode.FORMAT_ITF;
                        if (i9 != 0) {
                        }
                        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                        }
                        if ((805306368 & i3) == 0) {
                        }
                        i11 = i5 & Barcode.FORMAT_UPC_E;
                        if (i11 != 0) {
                        }
                        i14 = i5 & Barcode.FORMAT_PDF417;
                        if (i14 != 0) {
                        }
                        int i322 = i13;
                        i16 = i5 & Barcode.FORMAT_AZTEC;
                        if (i16 != 0) {
                        }
                        i18 = i5 & 8192;
                        if (i18 != 0) {
                        }
                        i20 = i5 & 16384;
                        if (i20 == 0) {
                        }
                        if ((i4 & i8) == 0) {
                        }
                        if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
                        }
/* 21 */                oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                        if (oOloioIlI001IO000 == null) {
                        }
                    }
                    z2 = z;
                    if ((i5 & 16) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    i7 = i5 & 64;
                    if (i7 == 0) {
                    }
                    i8 = 196608;
                    o0OO00iO2 = o0OO00iO;
                    i9 = i5 & Barcode.FORMAT_ITF;
                    if (i9 != 0) {
                    }
                    if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                    }
                    if ((805306368 & i3) == 0) {
                    }
                    i11 = i5 & Barcode.FORMAT_UPC_E;
                    if (i11 != 0) {
                    }
                    i14 = i5 & Barcode.FORMAT_PDF417;
                    if (i14 != 0) {
                    }
                    int i3222 = i13;
                    i16 = i5 & Barcode.FORMAT_AZTEC;
                    if (i16 != 0) {
                    }
                    i18 = i5 & 8192;
                    if (i18 != 0) {
                    }
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                    }
                    if ((i4 & i8) == 0) {
                    }
                    if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
                    }
/* 21 */            oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(String str, Function1 function1, O1ooiI111i o1ooiI111i, boolean z, boolean z2, Oo0lloOiiIOI oo0lloOiiIOI, O0OO00iO o0OO00iO, O0OO00i o0OO00i, boolean z3, int i, int i2, OoooioIi0I ooooioIi0I, Function1 function12, OI0lOIiOIOOo oI0lOIiOIOOo, OlI00IIlOO olI00IIlOO, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i3, int i4, int i5) {
                    boolean z4;
                    int i6;
                    boolean z5;
                    int i7;
                    O0OO00iO o0OO00iO2;
                    O0OO00i o0OO00i2;
                    int i8;
                    boolean z6;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    O1ooiI111i o1ooiI111i2;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    int i14;
                    int i15;
                    OoooioIi0I ooooioIi0I2;
                    Function1 function13;
                    OI0lOIiOIOOo oI0lOIiOIOOo2;
                    int i16;
                    boolean z7;
                    int i17;
                    int i18;
                    Function1 function14;
                    O0OO00iO o0OO00iO3;
                    int i19;
                    boolean z8;
                    OoooioIi0I ooooioIi0I3;
                    OI0lOIiOIOOo oI0lOIiOIOOo3;
                    OoooioIi0I ooooioIi0I4;
                    Function1 function15;
                    long j;
/* 1 */             iloI0lOlll1.I00i0O(2026950908);
                    int i20 = i3 | (iloI0lOlll1.I000II(str) ? 4 : 2);
                    if ((i3 & 48) == 0) {
                        i20 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
                    int i21 = i20 | (iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
                    int i22 = i5 & 8;
                    if (i22 != 0) {
                        i6 = i21 | 3072;
                        z4 = z;
                    } else {
                        z4 = z;
                        i6 = i21 | (iloI0lOlll1.I000O01llI0(z4) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
                    }
                    int i23 = i5 & 16;
                    if (i23 != 0) {
                        i7 = i6 | 24576;
                        z5 = z2;
                    } else {
                        z5 = z2;
                        i7 = i6 | (iloI0lOlll1.I000O01llI0(z5) ? 16384 : 8192);
                    }
                    int i24 = i7 | (iloI0lOlll1.I000II(oo0lloOiiIOI) ? 131072 : 65536);
                    int i25 = i5 & 64;
                    if (i25 != 0) {
                        i24 |= 1572864;
                        o0OO00iO2 = o0OO00iO;
                    } else {
                        o0OO00iO2 = o0OO00iO;
                        if ((i3 & 1572864) == 0) {
                            i24 |= iloI0lOlll1.I000II(o0OO00iO2) ? 1048576 : 524288;
                        }
                    }
                    int i26 = i5 & Barcode.FORMAT_ITF;
                    if (i26 != 0) {
                        i8 = i24 | 12582912;
                        o0OO00i2 = o0OO00i;
                    } else {
                        o0OO00i2 = o0OO00i;
                        i8 = i24 | (iloI0lOlll1.I000II(o0OO00i2) ? 8388608 : 4194304);
                    }
                    int i27 = i5 & Barcode.FORMAT_QR_CODE;
                    if (i27 != 0) {
                        i8 |= 100663296;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i3 & 100663296) == 0) {
                            i8 |= iloI0lOlll1.I000O01llI0(z6) ? 67108864 : 33554432;
                        }
                    }
                    if ((i3 & 805306368) == 0) {
                        i8 |= ((i5 & Barcode.FORMAT_UPC_A) == 0 && iloI0lOlll1.I0000oI00(i)) ? 536870912 : 268435456;
                    }
                    int i28 = i5 & Barcode.FORMAT_UPC_E;
                    if (i28 != 0) {
                        i10 = 196614;
                        i9 = i28;
                    } else if ((i4 & 6) == 0) {
                        i9 = i28;
                        i10 = i4 | (iloI0lOlll1.I0000oI00(i2) ? 4 : 2);
                    } else {
                        i9 = i28;
                        i10 = i4;
                    }
                    int i29 = i5 & Barcode.FORMAT_PDF417;
                    if (i29 != 0) {
                        i12 = i10 | 48;
                        i11 = i29;
                    } else {
                        i11 = i29;
                        i12 = i10 | (iloI0lOlll1.I000II(ooooioIi0I) ? 32 : 16);
                    }
                    int i30 = i12;
                    int i31 = i30 | 384;
                    int i32 = i5 & 8192;
                    if (i32 != 0) {
                        i13 = i30 | 3456;
                    } else {
                        i13 = i31 | (iloI0lOlll1.I000II(oI0lOIiOIOOo) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
                    }
                    int i33 = i13 | (iloI0lOlll1.I000II(olI00IIlOO) ? 16384 : 8192);
                    if (iloI0lOlll1.I00OIl(i8 & 1, ((i8 & 306783379) == 306783378 && (i33 & 74899) == 74898) ? false : true)) {
                        iloI0lOlll1.I00Ol00();
                        int i34 = i3 & 1;
                        Object obj = IOl11li.I00000oIO;
                        if (i34 == 0 || iloI0lOlll1.I001lloI()) {
                            if (i22 != 0) {
                                z4 = true;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            }
/* 3 */                     O0OO00iO o0OO00iO4 = i25 != 0 ? O0OO00iO.I0000Il00O : o0OO00iO2;
                            if (i26 != 0) {
/* 4 */                         o0OO00i2 = O0OO00i.I0000Il00O;
                            }
                            if (i27 != 0) {
                                z6 = false;
                            }
                            if ((i5 & Barcode.FORMAT_UPC_A) != 0) {
                                i16 = z6 ? 1 : Integer.MAX_VALUE;
                                i8 &= -1879048193;
                            } else {
                                i16 = i;
                            }
                            int i35 = i9 != 0 ? 1 : i2;
/* 5 */                     OoooioIi0I ooooioIi0I5 = i11 != 0 ? lolIo0.I00l0I0l0lO1 : ooooioIi0I;
/* 6 */                     Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            if (objI00O0i0ii == obj) {
/* 7 */                         objI00O0i0ii = new I10I0o1ii10(12);
/* 8 */                         iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
                            z7 = z5;
                            i17 = i16;
                            i18 = i35;
/* 9 */                     function14 = (Function1) objI00O0i0ii;
                            o0OO00iO3 = o0OO00iO4;
                            i19 = i8;
                            z8 = z6;
                            ooooioIi0I3 = ooooioIi0I5;
                            oI0lOIiOIOOo3 = i32 != 0 ? null : oI0lOIiOIOOo;
                        } else {
/* 2 */                     iloI0lOlll1.I00OilO00Il();
                            if ((i5 & Barcode.FORMAT_UPC_A) != 0) {
                                i8 &= -1879048193;
                            }
                            i17 = i;
                            i18 = i2;
                            i19 = i8;
                            z7 = z5;
                            z8 = z6;
                            o0OO00iO3 = o0OO00iO2;
                            ooooioIi0I3 = ooooioIi0I;
                            function14 = function12;
                            oI0lOIiOIOOo3 = oI0lOIiOIOOo;
                        }
/* 10 */                iloI0lOlll1.I0010o();
/* 11 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii2 == obj) {
                            ooooioIi0I4 = ooooioIi0I3;
                            function15 = function14;
                            j = 0;
/* 13 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(new Oo0OI01Il(6, 0L, str));
/* 14 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        } else {
                            ooooioIi0I4 = ooooioIi0I3;
                            function15 = function14;
                            j = 0;
                        }
/* 15 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 17 */                Oo0OI01Il oo0OI01IlI00000oOI = Oo0OI01Il.I00000oOI((Oo0OI01Il) oI10i0Il.getValue(), str, j, 6);
/* 18 */                boolean zI000II = iloI0lOlll1.I000II(oo0OI01IlI00000oOI);
/* 19 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii3;
                        if (zI000II || objI00O0i0ii3 == obj) {
/* 20 */                    I01ii1IIl i01ii1IIl = new I01ii1IIl(15);
                            i01ii1IIl.I00iiI = oo0OI01IlI00000oOI;
                            i01ii1IIl.I00iiO = oI10i0Il;
                            VarHandle.storeStoreFence();
/* 21 */                    iloI0lOlll1.I00iio(i01ii1IIl);
                            obj2 = i01ii1IIl;
                        }
/* 22 */                iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj2, iloI0lOlll1);
                        boolean z9 = (i19 & 14) == 4;
/* 23 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        if (z9 || objI00O0i0ii4 == obj) {
/* 24 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(str);
/* 25 */                    iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 26 */                Object obj3 = (OI10i0Il) objI00O0i0ii4;
/* 27 */                IoiiO1O1 ioiiO1O1I00000oIO = o0OO00iO3.I00000oIO(z8);
                        boolean z10 = !z8;
                        int i36 = z8 ? 1 : i18;
                        int i37 = z8 ? 1 : i17;
                        O0OO00iO o0OO00iO5 = o0OO00iO3;
                        boolean z11 = z8;
/* 28 */                boolean zI000II2 = iloI0lOlll1.I000II(obj3) | ((i19 & 112) == 32);
/* 29 */                Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii5;
                        if (zI000II2 || objI00O0i0ii5 == obj) {
/* 30 */                    I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(5);
                            i01oIoOI01l.I00iiO = function1;
                            i01oIoOI01l.I00iiI = oI10i0Il;
                            i01oIoOI01l.I00iio = obj3;
                            VarHandle.storeStoreFence();
/* 31 */                    iloI0lOlll1.I00iio(i01oIoOI01l);
                            obj4 = i01oIoOI01l;
                        }
                        int i38 = i33 << 9;
                        oo0lloOiiIOI2 = oo0lloOiiIOI;
                        Function1 function16 = function15;
                        o1ooiI111i2 = o1ooiI111i;
                        ooooioIi0I2 = ooooioIi0I4;
/* 33 */                iioii1oiO01i.I00000oIO(oo0OI01IlI00000oOI, (Function1) obj4, o1ooiI111i2, oo0lloOiiIOI2, ooooioIi0I2, function16, oI0lOIiOIOOo3, olI00IIlOO, z10, i37, i36, ioiiO1O1I00000oIO, o0OO00i2, z4, z7, iOii1l, iloI0lOlll1, (i19 & 896) | ((i19 >> 6) & 7168) | (i38 & 57344) | 196608 | (i38 & 3670016) | (i38 & 29360128), ((i19 >> 15) & 896) | (i19 & 7168) | (i19 & 57344) | 196608);
                        function13 = function16;
                        oI0lOIiOIOOo2 = oI0lOIiOIOOo3;
                        z5 = z7;
                        i14 = i17;
                        i15 = i18;
                        o0OO00iO2 = o0OO00iO5;
                        z6 = z11;
                    } else {
                        o1ooiI111i2 = o1ooiI111i;
                        oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 34 */                iloI0lOlll1.I00OilO00Il();
                        i14 = i;
                        i15 = i2;
                        ooooioIi0I2 = ooooioIi0I;
                        function13 = function12;
                        oI0lOIiOIOOo2 = oI0lOIiOIOOo;
                    }
/* 35 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        I1oiloi1o i1oiloi1o = new I1oiloi1o();
                        i1oiloi1o.I00iOIl = str;
                        i1oiloi1o.I00iiI = function1;
                        i1oiloi1o.I00iiO = o1ooiI111i2;
                        i1oiloi1o.I00iio = z4;
                        i1oiloi1o.I00ilI0I1 = z5;
                        i1oiloi1o.I00ilO0 = oo0lloOiiIOI2;
                        i1oiloi1o.I00io1l = o0OO00iO2;
                        i1oiloi1o.I00ioIO = o0OO00i2;
                        i1oiloi1o.I00l0I0l0lO1 = z6;
                        i1oiloi1o.I00l0OO0IO = i14;
                        i1oiloi1o.I00li1OI = i15;
                        i1oiloi1o.I00ll1 = ooooioIi0I2;
                        i1oiloi1o.I00lli11 = function13;
                        i1oiloi1o.I00lll10 = oI0lOIiOIOOo2;
                        i1oiloi1o.I00o0iI0io1 = olI00IIlOO;
                        i1oiloi1o.I00o0l1o1o0 = iOii1l;
                        i1oiloi1o.I00o101lO = i3;
                        i1oiloi1o.I00oI0i = i4;
                        i1oiloi1o.I00oII = i5;
                        VarHandle.storeStoreFence();
/* 36 */                oOloioIlI001IO000.I0000O = i1oiloi1o;
                    }
                }
            }

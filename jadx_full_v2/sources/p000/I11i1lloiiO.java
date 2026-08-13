            package p000;

            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class I11i1lloiiO {
                public static final float I00000oIO;

                static {
/* 10 */            new Ii0i0o1lliO1(0.8f, 0.0f, 0.8f, 0.15f);
/* 15 */            I00000oIO = 12.0f;
                }

                /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IOii1l iOii1l, O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O, IOii1l iOii1l2, float f, i00O0OOIlOO i00o0ooiloo, Oo1oI1il00o oo1oI1il00o, OIo1Oi1l1lI oIo1Oi1l1lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    IlliIl1l11O illiIl1l11O2;
                    Oo1oI1il00o oo1oI1il00oI00000oIO;
                    int i5;
                    int i6;
                    float f2;
                    i00O0OOIlOO i00o0ooiloo2;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    Oo1oI1il00o oo1oI1il00o2;
                    O1ooiI111i o1ooiI111i3;
                    OOloioIl oOloioIlI001IO000;
                    int i7;
                    float f3;
                    boolean z;
/* 14 */            iloI0lOlll1.I00i0O(-1109867978);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(iOii1l) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i8 = i2 & 2;
/* 35 */            if (i8 != 0) {
/* 37 */                i3 |= 48;
                    } else {
/* 44 */                if ((i & 48) == 0) {
/* 46 */                    o1ooiI111i2 = o1ooiI111i;
/* 59 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 60 */                i4 = i2 & 4;
/* 62 */                if (i4 != 0) {
/* 71 */                    if ((i & 384) == 0) {
/* 73 */                        illiIl1l11O2 = illiIl1l11O;
/* 86 */                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 89 */                    if ((i & 3072) == 0) {
/* 102 */                       i3 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                            }
/* 103 */                   int i9 = i3 | 24576;
/* 108 */                   if ((196608 & i) == 0) {
/* 113 */                       i9 = 90112 | i3;
                            }
/* 117 */                   if ((1572864 & i) == 0) {
/* 121 */                       if ((i2 & 64) == 0) {
/* 123 */                           oo1oI1il00oI00000oIO = oo1oI1il00o;
/* 129 */                           int i10 = iloI0lOlll1.I000II(oo1oI1il00oI00000oIO) ? 1048576 : 524288;
/* 138 */                           i9 |= i10;
                                } else {
/* 134 */                           oo1oI1il00oI00000oIO = oo1oI1il00o;
                                }
/* 138 */                       i9 |= i10;
                            } else {
/* 140 */                       oo1oI1il00oI00000oIO = oo1oI1il00o;
                            }
/* 146 */                   if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 148 */                       i9 |= 12582912;
                            } else if ((i & 12582912) == 0) {
/* 166 */                       i9 |= iloI0lOlll1.I000II(null) ? 8388608 : 4194304;
                            }
/* 169 */                   i5 = i9 | 100663296;
/* 189 */                   if (iloI0lOlll1.I00OIl(i5 & 1, (38347923 & i5) != 38347922)) {
/* 191 */                       iloI0lOlll1.I00Ol00();
/* 202 */                       if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 239 */                           O1ooiI111i o1ooiI111i4 = i8 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 240 */                           if (i4 != 0) {
/* 242 */                               illiIl1l11O2 = i1OO1IlO.I00000oOI;
                                    }
/* 245 */                           float f4 = Oo1oIoo01.I00000oOI;
/* 247 */                           O0ol1iO1 o0ol1iO1I00000oOI = Oo1oIoo01.I00000oOI(iloI0lOlll1);
/* 251 */                           int i11 = i5 & (-458753);
/* 255 */                           if ((i2 & 64) != 0) {
/* 267 */                               oo1oI1il00oI00000oIO = Oo1oIoo01.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO);
/* 271 */                               i7 = i5 & (-4128769);
                                    } else {
/* 273 */                               i7 = i11;
                                    }
/* 274 */                           oIo1Oi1l1lI2 = Oo1oIoo01.I00000oIO;
/* 277 */                           oo1oI1il00o2 = oo1oI1il00oI00000oIO;
/* 278 */                           o1ooiI111i3 = o1ooiI111i4;
/* 279 */                           f3 = f4;
/* 280 */                           z = true;
/* 281 */                           i00o0ooiloo2 = o0ol1iO1I00000oOI;
                                } else {
/* 211 */                           iloI0lOlll1.I00OilO00Il();
/* 214 */                           int i12 = i5 & (-458753);
/* 218 */                           if ((i2 & 64) != 0) {
/* 220 */                               i12 = i5 & (-4128769);
                                    }
/* 223 */                           oo1oI1il00o2 = oo1oI1il00oI00000oIO;
/* 224 */                           o1ooiI111i3 = o1ooiI111i2;
/* 225 */                           z = true;
/* 226 */                           i00o0ooiloo2 = i00o0ooiloo;
/* 228 */                           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 230 */                           i7 = i12;
/* 231 */                           f3 = f;
                                }
/* 282 */                       iloI0lOlll1.I0010o();
/* 327 */                       int i13 = i7 << 3;
/* 333 */                       int i14 = i7 << 12;
/* 365 */                       i6 = 1;
/* 366 */                       I00000oOI(o1ooiI111i3, iOii1l, OoOoOOilil.I00000oIO(I11iOlIIO.I00000oIO, iloI0lOlll1), Oo0lloOiiIOI.I0000O, i1O01oOIoI0I.I00o0l1o1o0, illiIl1l11O2, iOii1l2, (Iil1010O.I0000Il00O(f3, Float.NaN) || Iil1010O.I0000Il00O(f3, Float.POSITIVE_INFINITY)) ? Oo1oIoo01.I00000oOI : f3, oIo1Oi1l1lI2, i00o0ooiloo2, oo1oI1il00o2, iloI0lOlll1, ((i7 >> 3) & 14) | 224256 | (i13 & 112) | (i14 & 3670016) | (i14 & 29360128) | (i13 & 1879048192), (i7 >> 15) & 1022);
/* 369 */                       f2 = f3;
                            } else {
/* 372 */                       i6 = 1;
/* 373 */                       iloI0lOlll1.I00OilO00Il();
/* 376 */                       f2 = f;
/* 378 */                       i00o0ooiloo2 = i00o0ooiloo;
/* 380 */                       oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 382 */                       oo1oI1il00o2 = oo1oI1il00oI00000oIO;
/* 383 */                       o1ooiI111i3 = o1ooiI111i2;
                            }
/* 384 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 388 */                   if (oOloioIlI001IO000 != null) {
/* 392 */                       I11OliiI1loi i11OliiI1loi = new I11OliiI1loi(i6);
/* 395 */                       i11OliiI1loi.I00iiI = iOii1l;
/* 397 */                       i11OliiI1loi.I00iiO = o1ooiI111i3;
/* 399 */                       i11OliiI1loi.I00li1OI = illiIl1l11O2;
/* 401 */                       i11OliiI1loi.I00iio = iOii1l2;
/* 403 */                       i11OliiI1loi.I00ilI0I1 = f2;
/* 405 */                       i11OliiI1loi.I00ilO0 = i00o0ooiloo2;
/* 407 */                       i11OliiI1loi.I00io1l = oo1oI1il00o2;
/* 409 */                       i11OliiI1loi.I00ioIO = oIo1Oi1l1lI2;
/* 411 */                       i11OliiI1loi.I00l0I0l0lO1 = i;
/* 415 */                       i11OliiI1loi.I00l0OO0IO = i2;
/* 417 */                       VarHandle.storeStoreFence();
/* 420 */                       oOloioIlI001IO000.I0000O = i11OliiI1loi;
/* 3539 */                      return;
                            }
/* 3539 */                  return;
                        }
/* 64 */                i3 |= 384;
/* 66 */                illiIl1l11O2 = illiIl1l11O;
/* 89 */                if ((i & 3072) == 0) {
                        }
/* 103 */               int i92 = i3 | 24576;
/* 108 */               if ((196608 & i) == 0) {
                        }
/* 117 */               if ((1572864 & i) == 0) {
                        }
/* 146 */               if ((i2 & Barcode.FORMAT_ITF) != 0) {
                        }
/* 169 */               i5 = i92 | 100663296;
/* 189 */               if (iloI0lOlll1.I00OIl(i5 & 1, (38347923 & i5) != 38347922)) {
                        }
/* 384 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 388 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 39 */            o1ooiI111i2 = o1ooiI111i;
/* 60 */            i4 = i2 & 4;
/* 62 */            if (i4 != 0) {
                    }
/* 66 */            illiIl1l11O2 = illiIl1l11O;
/* 89 */            if ((i & 3072) == 0) {
                    }
/* 103 */           int i922 = i3 | 24576;
/* 108 */           if ((196608 & i) == 0) {
                    }
/* 117 */           if ((1572864 & i) == 0) {
                    }
/* 146 */           if ((i2 & Barcode.FORMAT_ITF) != 0) {
                    }
/* 169 */           i5 = i922 | 100663296;
/* 189 */           if (iloI0lOlll1.I00OIl(i5 & 1, (38347923 & i5) != 38347922)) {
                    }
/* 384 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 388 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, IOii1l iOii1l, Oo0lloOiiIOI oo0lloOiiIOI, Oo0lloOiiIOI oo0lloOiiIOI2, II0IlloOiO0i iI0IlloOiO0i, IlliIl1l11O illiIl1l11O, Function3 function3, float f, OIo1Oi1l1lI oIo1Oi1l1lI, i00O0OOIlOO i00o0ooiloo, Oo1oI1il00o oo1oI1il00o, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    IlliIl1l11O illiIl1l11O2;
                    float f2;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    IloI0lOlll1 iloI0lOlll12;
/* 23 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 32 */            iloI0lOlll13.I00i0O(703932376);
/* 37 */            if ((i & 6) == 0) {
/* 48 */                i3 = (iloI0lOlll13.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 50 */                i3 = i;
                    }
/* 55 */            if ((i & 48) == 0) {
/* 68 */                i3 |= iloI0lOlll13.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 70 */            int i5 = i & 384;
/* 72 */            int i6 = Barcode.FORMAT_ITF;
/* 74 */            int i7 = i3;
/* 76 */            if (i5 == 0) {
/* 89 */                i7 |= iloI0lOlll13.I000II(oo0lloOiiIOI) ? Barcode.FORMAT_QR_CODE : 128;
                    }
/* 96 */            if ((i & 3072) == 0) {
/* 109 */               i7 |= iloI0lOlll13.I000OOo1O(null) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 113 */           if ((i & 24576) == 0) {
/* 126 */               i7 |= iloI0lOlll13.I000II(oo0lloOiiIOI2) ? 16384 : 8192;
                    }
/* 131 */           if ((196608 & i) == 0) {
/* 144 */               i7 |= iloI0lOlll13.I000II(iI0IlloOiO0i) ? 131072 : 65536;
                    }
/* 149 */           if ((1572864 & i) == 0) {
/* 162 */               i7 |= iloI0lOlll13.I000OOo1O(illiIl1l11O) ? 1048576 : 524288;
                    }
/* 167 */           if ((12582912 & i) == 0) {
/* 180 */               i7 |= iloI0lOlll13.I000OOo1O(function3) ? 8388608 : 4194304;
                    }
/* 185 */           if ((100663296 & i) == 0) {
/* 198 */               i7 |= iloI0lOlll13.I0000O(f) ? 67108864 : 33554432;
                    }
/* 203 */           if ((805306368 & i) == 0) {
/* 216 */               i7 |= iloI0lOlll13.I000II(oIo1Oi1l1lI) ? 536870912 : 268435456;
                    }
/* 218 */           int i8 = i7;
/* 222 */           if ((i2 & 6) == 0) {
/* 235 */               i4 = i2 | (iloI0lOlll13.I000II(i00o0ooiloo) ? 4 : 2);
                    } else {
/* 238 */               i4 = i2;
                    }
/* 242 */           if ((i2 & 48) == 0) {
/* 252 */               i4 |= iloI0lOlll13.I000II(oo1oI1il00o) ? 32 : 16;
                    }
/* 256 */           if ((i2 & 384) == 0) {
/* 262 */               if (iloI0lOlll13.I000II(null)) {
/* 264 */                   i6 = Barcode.FORMAT_QR_CODE;
                        }
/* 266 */               i4 |= i6;
                    }
/* 268 */           int i9 = i4;
/* 295 */           if (!iloI0lOlll13.I00OIl(i8 & 1, ((306783379 & i8) == 306783378 && (i9 & 147) == 146) ? false : true)) {
/* 717 */               illiIl1l11O2 = illiIl1l11O;
/* 719 */               f2 = f;
/* 721 */               oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 723 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    } else {
/* 301 */               if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
/* 713 */                   I000II.I000iOII("The expandedHeight is expected to be specified and finite");
/* 716 */                   return;
                        }
/* 323 */               boolean z = (i9 & 112) == 32;
/* 324 */               int i10 = i9 & 896;
/* 333 */               boolean z2 = z | (i10 == 256);
/* 334 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 338 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 340 */               if (z2 || objI00O0i0ii == iOO0o0I1l) {
/* 347 */                   I01iiIii10O i01iiIii10O = new I01iiIii10O(4);
/* 350 */                   i01iiIii10O.I00iiI = oo1oI1il00o;
/* 352 */                   VarHandle.storeStoreFence();
/* 355 */                   objI00O0i0ii = Ol1llolil.I00000oOI(i01iiIii10O);
/* 359 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 388 */               OlO01l1oOil olO01l1oOilI00000oIO = Ol0i0Il1.I00000oIO(((IOOiio0i) ((OlO01l1oOil) objI00O0i0ii).getValue()).I00000oIO, l1i1II.I00000oOI(OI0I0o.I00iiO, iloI0lOlll13), null, iloI0lOlll13, 0, 12);
/* 395 */               I00oooO i00oooO = new I00oooO(3);
/* 398 */               i00oooO.I00iiI = function3;
/* 400 */               VarHandle.storeStoreFence();
/* 406 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1222546095, i00oooO, iloI0lOlll13);
/* 413 */               iloI0lOlll13.I00i01iIIliI(-1473335574);
/* 417 */               iloI0lOlll13.I0010I0i(false);
/* 420 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 422 */               O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(o1ooIo101ll);
/* 426 */               boolean zI000II = iloI0lOlll13.I000II(olO01l1oOilI00000oIO);
/* 430 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                        Object obj = objI00O0i0ii2;
/* 434 */               if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 441 */                   I11OloI0 i11OloI0 = new I11OloI0(0);
/* 444 */                   i11OloI0.I00iiI = olO01l1oOilI00000oIO;
/* 446 */                   VarHandle.storeStoreFence();
/* 449 */                   iloI0lOlll13.I00iio(i11OloI0);
                            obj = i11OloI0;
                        }
/* 454 */               O1ooiI111i o1ooiI111iI00000oIO = iIO01l11OlO.I00000oIO(o1ooiI111iI0000O, (Function1) obj);
/* 458 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 462 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 467 */                   objI00O0i0ii3 = new I10I0o1ii10(3);
/* 470 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        }
/* 476 */               O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO, false, (Function1) objI00O0i0ii3);
/* 480 */               Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 484 */               if (objI00O0i0ii4 == iOO0o0I1l) {
/* 486 */                   objI00O0i0ii4 = I11i11i1loi.I00000oOI;
/* 488 */                   iloI0lOlll13.I00iio(objI00O0i0ii4);
                        }
/* 495 */               O1ooiI111i o1ooiI111iI00000oIO2 = Oll10I.I00000oIO(o1ooiI111iI00000oOI, OoiIlOl1iI.I00000oIO, (PointerInputEventHandler) objI00O0i0ii4);
/* 501 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 507 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 511 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 515 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oIO2);
/* 521 */               IOl0oi0lOl1.I000lI.getClass();
/* 524 */               iloI0lOlll13.I00i0oil();
/* 531 */               if (iloI0lOlll13.I00O10llo) {
/* 535 */                   iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 539 */                   iloI0lOlll13.I00io1l();
                        }
/* 544 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 549 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 558 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 561 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 566 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 573 */               O1ooiI111i o1ooiI111iI00000oOI2 = ii0OOOOo0i.I00000oOI(iO1OiO1lo1o.I00000oIO(o1ooIo101ll, i00o0ooiloo));
/* 583 */               boolean z3 = i10 == 256;
/* 584 */               Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 588 */               if (z3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 595 */                   objI00O0i0ii5 = new I11Oo11I(0);
/* 598 */                   iloI0lOlll13.I00iio(objI00O0i0ii5);
                        }
/* 601 */               IlOOiIO ilOOiIO = (IlOOiIO) objI00O0i0ii5;
/* 603 */               long j = oo1oI1il00o.I0000Il00O;
/* 607 */               long j2 = oo1oI1il00o.I0000O;
/* 614 */               long j3 = oo1oI1il00o.I0000oI00;
/* 617 */               long j4 = oo1oI1il00o.I0001Ioi1lo;
/* 621 */               Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
/* 625 */               if (objI00O0i0ii6 == iOO0o0I1l) {
/* 631 */                   objI00O0i0ii6 = new I01iOOoiOI(17);
/* 634 */                   iloI0lOlll13.I00iio(objI00O0i0ii6);
                        }
/* 643 */               int i11 = (i8 << 15) & 2146959360;
/* 651 */               int i12 = ((i8 >> 9) & 896) | 1600566;
/* 655 */               int i13 = i8 >> 3;
/* 696 */               I0000O(o1ooiI111iI00000oOI2, ilOOiIO, j, j2, j4, j3, iOii1l, oo0lloOiiIOI, oo0lloOiiIOI2, (IllOOo00lI) objI00O0i0ii6, iI0IlloOiO0i, illiIl1l11O, iOii1lI00000oOI, f, oIo1Oi1l1lI, iloI0lOlll13, i11, i12 | (i13 & 458752) | (i13 & 29360128) | (i13 & 234881024));
/* 699 */               illiIl1l11O2 = illiIl1l11O;
/* 701 */               f2 = f;
/* 703 */               oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 705 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 707 */               iloI0lOlll14.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 726 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 730 */           if (oOloioIlI001IO000 != null) {
/* 734 */               I11i0lo00 i11i0lo00 = new I11i0lo00();
/* 739 */               i11i0lo00.I00iOIl = o1ooiI111i;
/* 741 */               i11i0lo00.I00iiI = iOii1l;
/* 743 */               i11i0lo00.I00iiO = oo0lloOiiIOI;
/* 745 */               i11i0lo00.I00iio = oo0lloOiiIOI2;
/* 747 */               i11i0lo00.I00ilI0I1 = iI0IlloOiO0i;
/* 749 */               i11i0lo00.I00ilO0 = illiIl1l11O2;
/* 753 */               i11i0lo00.I00io1l = function3;
/* 755 */               i11i0lo00.I00ioIO = f2;
/* 757 */               i11i0lo00.I00l0I0l0lO1 = oIo1Oi1l1lI2;
/* 761 */               i11i0lo00.I00l0OO0IO = i00o0ooiloo;
/* 765 */               i11i0lo00.I00li1OI = oo1oI1il00o;
/* 769 */               i11i0lo00.I00ll1 = i;
/* 773 */               i11i0lo00.I00lli11 = i2;
/* 775 */               VarHandle.storeStoreFence();
/* 778 */               oOloioIlI001IO000.I0000O = i11i0lo00;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
                /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(IOii1l iOii1l, O1ooiI111i o1ooiI111i, IOii1l iOii1l2, Function3 function3, float f, i00O0OOIlOO i00o0ooiloo, Oo1oI1il00o oo1oI1il00o, OIo1Oi1l1lI oIo1Oi1l1lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    Function3 function32;
                    Oo1oI1il00o oo1oI1il00oI00000oIO;
                    int i3;
                    int i4;
                    O1ooiI111i o1ooiI111i2;
                    float f2;
                    i00O0OOIlOO i00o0ooiloo2;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    Function3 function33;
                    Oo1oI1il00o oo1oI1il00o2;
                    OOloioIl oOloioIlI001IO000;
                    int i5;
                    float f3;
                    int i6;
/* 8 */             iloI0lOlll1.I00i0O(660588393);
/* 11 */            int i7 = i | 48;
/* 13 */            int i8 = i2 & 8;
/* 15 */            if (i8 != 0) {
/* 17 */                i7 = i | 3120;
                    } else {
/* 24 */                if ((i & 3072) == 0) {
/* 26 */                    function32 = function3;
/* 39 */                    i7 |= iloI0lOlll1.I000OOo1O(function32) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 43 */                int i9 = i7 | 90112;
/* 46 */                if ((i2 & 64) != 0) {
/* 48 */                    oo1oI1il00oI00000oIO = oo1oI1il00o;
/* 54 */                    int i10 = iloI0lOlll1.I000II(oo1oI1il00oI00000oIO) ? 1048576 : 524288;
/* 66 */                    i3 = i9 | i10 | 113246208;
/* 86 */                    if (iloI0lOlll1.I00OIl(i3 & 1, (38347923 & i3) != 38347922)) {
/* 88 */                        iloI0lOlll1.I00Ol00();
/* 99 */                        if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 138 */                           Function3 function34 = i8 != 0 ? i1OO1IlO.I00000oIO : function32;
/* 139 */                           float f4 = Oo1oIoo01.I00000oOI;
/* 141 */                           O0ol1iO1 o0ol1iO1I00000oOI = Oo1oIoo01.I00000oOI(iloI0lOlll1);
/* 145 */                           i5 = (-458753) & i3;
/* 148 */                           if ((i2 & 64) != 0) {
/* 160 */                               oo1oI1il00oI00000oIO = Oo1oIoo01.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO);
/* 164 */                               i5 = i3 & (-4128769);
                                    }
/* 171 */                           function33 = function34;
/* 172 */                           f3 = f4;
/* 173 */                           i6 = 0;
/* 166 */                           oIo1Oi1l1lI2 = Oo1oIoo01.I00000oIO;
/* 175 */                           oo1oI1il00o2 = oo1oI1il00oI00000oIO;
/* 176 */                           i00o0ooiloo2 = o0ol1iO1I00000oOI;
/* 168 */                           o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                                } else {
/* 108 */                           iloI0lOlll1.I00OilO00Il();
/* 111 */                           int i11 = i3 & (-458753);
/* 115 */                           if ((i2 & 64) != 0) {
/* 117 */                               i11 = i3 & (-4128769);
                                    }
/* 120 */                           function33 = function32;
/* 121 */                           i6 = 0;
/* 122 */                           o1ooiI111i2 = o1ooiI111i;
/* 124 */                           i00o0ooiloo2 = i00o0ooiloo;
/* 126 */                           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 128 */                           i5 = i11;
/* 129 */                           oo1oI1il00o2 = oo1oI1il00oI00000oIO;
/* 130 */                           f3 = f;
                                }
/* 178 */                       iloI0lOlll1.I0010o();
/* 236 */                       i4 = i6;
/* 241 */                       I00000oOI(o1ooiI111i2, iOii1l, OoOoOOilil.I00000oIO(I11iOlIIO.I00000oIO, iloI0lOlll1), Oo0lloOiiIOI.I0000O, i1O01oOIoI0I.I00o0iI0io1, iOii1l2, function33, (Iil1010O.I0000Il00O(f3, Float.NaN) || Iil1010O.I0000Il00O(f3, Float.POSITIVE_INFINITY)) ? Oo1oIoo01.I00000oOI : f3, oIo1Oi1l1lI2, i00o0ooiloo2, oo1oI1il00o2, iloI0lOlll1, ((i5 << 12) & 29360128) | 807103542, (i5 >> 15) & 1022);
/* 244 */                       f2 = f3;
                            } else {
/* 247 */                       i4 = 0;
/* 248 */                       iloI0lOlll1.I00OilO00Il();
/* 251 */                       o1ooiI111i2 = o1ooiI111i;
/* 253 */                       f2 = f;
/* 255 */                       i00o0ooiloo2 = i00o0ooiloo;
/* 257 */                       oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 259 */                       function33 = function32;
/* 260 */                       oo1oI1il00o2 = oo1oI1il00oI00000oIO;
                            }
/* 261 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 265 */                   if (oOloioIlI001IO000 != null) {
/* 269 */                       I11OliiI1loi i11OliiI1loi = new I11OliiI1loi(i4);
/* 274 */                       i11OliiI1loi.I00iiI = iOii1l;
/* 276 */                       i11OliiI1loi.I00iiO = o1ooiI111i2;
/* 280 */                       i11OliiI1loi.I00iio = iOii1l2;
/* 282 */                       i11OliiI1loi.I00li1OI = function33;
/* 284 */                       i11OliiI1loi.I00ilI0I1 = f2;
/* 286 */                       i11OliiI1loi.I00ilO0 = i00o0ooiloo2;
/* 288 */                       i11OliiI1loi.I00io1l = oo1oI1il00o2;
/* 290 */                       i11OliiI1loi.I00ioIO = oIo1Oi1l1lI2;
/* 292 */                       i11OliiI1loi.I00l0I0l0lO1 = i;
/* 296 */                       i11OliiI1loi.I00l0OO0IO = i2;
/* 298 */                       VarHandle.storeStoreFence();
/* 301 */                       oOloioIlI001IO000.I0000O = i11OliiI1loi;
/* 3539 */                      return;
                            }
/* 3539 */                  return;
                        }
/* 59 */                oo1oI1il00oI00000oIO = oo1oI1il00o;
/* 66 */                i3 = i9 | i10 | 113246208;
/* 86 */                if (iloI0lOlll1.I00OIl(i3 & 1, (38347923 & i3) != 38347922)) {
                        }
/* 261 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 265 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 19 */            function32 = function3;
/* 43 */            int i92 = i7 | 90112;
/* 46 */            if ((i2 & 64) != 0) {
                    }
/* 66 */            i3 = i92 | i10 | 113246208;
/* 86 */            if (iloI0lOlll1.I00OIl(i3 & 1, (38347923 & i3) != 38347922)) {
                    }
/* 261 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 265 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I0000O(O1ooiI111i o1ooiI111i, IlOOiIO ilOOiIO, long j, long j2, long j3, long j4, IOii1l iOii1l, Oo0lloOiiIOI oo0lloOiiIOI, Oo0lloOiiIOI oo0lloOiiIOI2, IllOOo00lI illOOo00lI, II0IlloOiO0i iI0IlloOiO0i, IlliIl1l11O illiIl1l11O, IOii1l iOii1l2, float f, OIo1Oi1l1lI oIo1Oi1l1lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    IllOOo00lI illOOo00lI2;
                    int i4;
                    II0IlloOiO0i iI0IlloOiO0i2;
                    IlliIl1l11O illiIl1l11O2;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    long j5;
                    Oo0lloOiiIOI oo0lloOiiIOI3;
                    IloI0lOlll1 iloI0lOlll12;
                    boolean z;
                    Object obj;
                    IOii1l iOii1l3 = iOii1l;
/* 1 */             iloI0lOlll1.I00i0O(239553141);
                    if ((i & 6) == 0) {
                        i3 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= (i & 64) == 0 ? iloI0lOlll1.I000II(ilOOiIO) : iloI0lOlll1.I000OOo1O(ilOOiIO) ? 32 : 16;
                    }
                    int i5 = i & 384;
                    int i6 = Barcode.FORMAT_ITF;
                    if (i5 == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    int i7 = i & 3072;
                    int i8 = Barcode.FORMAT_UPC_E;
                    if (i7 == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j2) ? Barcode.FORMAT_PDF417 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j3) ? 16384 : 8192;
                    }
                    if ((i & 196608) == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j4) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(iOii1l3) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(null) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        i3 |= iloI0lOlll1.I000II(oo0lloOiiIOI2) ? 536870912 : 268435456;
                    }
                    if ((i2 & 6) == 0) {
                        illOOo00lI2 = illOOo00lI;
                        i4 = i2 | (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 4 : 2);
                    } else {
                        illOOo00lI2 = illOOo00lI;
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= iloI0lOlll1.I000II(I1IiooiI1IlO.I0000oI00) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        iI0IlloOiO0i2 = iI0IlloOiO0i;
                        if (iloI0lOlll1.I000II(iI0IlloOiO0i2)) {
                            i6 = Barcode.FORMAT_QR_CODE;
                        }
                        i4 |= i6;
                    } else {
                        iI0IlloOiO0i2 = iI0IlloOiO0i;
                    }
                    if ((i2 & 3072) == 0) {
                        if (iloI0lOlll1.I0000oI00(0)) {
                            i8 = Barcode.FORMAT_PDF417;
                        }
                        i4 |= i8;
                    }
                    if ((i2 & 24576) == 0) {
                        i4 |= iloI0lOlll1.I000O01llI0(false) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) == 0) {
                        illiIl1l11O2 = illiIl1l11O;
                        i4 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 131072 : 65536;
                    } else {
                        illiIl1l11O2 = illiIl1l11O;
                    }
                    IOii1l iOii1l4 = iOii1l2;
                    if ((i2 & 1572864) == 0) {
                        i4 |= iloI0lOlll1.I000OOo1O(iOii1l4) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i4 |= iloI0lOlll1.I0000O(f) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                        i4 |= iloI0lOlll1.I000II(oIo1Oi1l1lI2) ? 67108864 : 33554432;
                    } else {
                        oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                    }
                    int i9 = i4;
                    if (iloI0lOlll1.I00OIl(i3 & 1, ((i3 & 306783379) == 306783378 && (38347923 & i9) == 38347922) ? false : true)) {
/* 2 */                 boolean z2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && iloI0lOlll1.I000II(ilOOiIO))) | ((i9 & 112) == 32) | ((i9 & 896) == 256) | ((i9 & 7168) == 2048) | ((29360128 & i9) == 8388608);
/* 3 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 4 */                 Object obj2 = IOl11li.I00000oIO;
                        Object obj3 = objI00O0i0ii;
                        if (z2 || objI00O0i0ii == obj2) {
/* 6 */                     Oo1oOl0I1 oo1oOl0I1 = new Oo1oOl0I1();
/* 7 */                     oo1oOl0I1.I00000oIO = ilOOiIO;
/* 8 */                     oo1oOl0I1.I00000oOI = iI0IlloOiO0i2;
/* 9 */                     oo1oOl0I1.I0000Il00O = f;
/* 10 */                    oo1oOl0I1.I0000O = oIo1Oi1l1lI2;
/* 11 */                    VarHandle.storeStoreFence();
/* 12 */                    iloI0lOlll1.I00iio(oo1oOl0I1);
                            obj3 = oo1oOl0I1;
                        }
/* 13 */                Oo1oOl0I1 oo1oOl0I12 = (Oo1oOl0I1) obj3;
/* 15 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 16 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 17 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 18 */                IOl0oi0lOl1.I000lI.getClass();
/* 19 */                iloI0lOlll1.I00i0oil();
/* 20 */                boolean z3 = iloI0lOlll1.I00O10llo;
/* 21 */                IllOOo00lI illOOo00lI3 = O0iiOioolIi.I01101IOlO;
                        if (z3) {
/* 22 */                    iloI0lOlll1.I000l1(illOOo00lI3);
                        } else {
/* 23 */                    iloI0lOlll1.I00io1l();
                        }
/* 24 */                IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 25 */                li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oo1oOl0I12);
/* 26 */                IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 27 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 28 */                Integer numValueOf = Integer.valueOf(iHashCode);
/* 29 */                IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 30 */                li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 31 */                li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 32 */                IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 33 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
                        O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 34 */                O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(iIoIOo00o.I00000oOI(o1ooIo101ll, "navigationIcon"), 4.0f, 0.0f, 0.0f, 0.0f, 14);
/* 35 */                II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00iiO;
/* 36 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 38 */                int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 39 */                OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 40 */                O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 41 */                iloI0lOlll1.I00i0oil();
/* 42 */                if (iloI0lOlll1.I00O10llo) {
/* 43 */                    iloI0lOlll1.I000l1(illOOo00lI3);
                        } else {
/* 44 */                    iloI0lOlll1.I00io1l();
                        }
/* 45 */                li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 46 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 47 */                IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 48 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 49 */                IOlO1IilOlOl iOlO1IilOlOl = IOoIioIOoolI.I00000oIO;
/* 52 */                iiliio0o.I00000oIO(iOlO1IilOlOl.I00000oIO(IOOiio0i.I00000oIO(j)), illiIl1l11O2, iloI0lOlll1, 8 | ((i9 >> 12) & 112));
/* 53 */                iloI0lOlll1.I0010I0i(true);
/* 54 */                iloI0lOlll1.I00i01iIIliI(408669108);
/* 56 */                O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(iIoIOo00o.I00000oOI(o1ooIo101ll, "title"), 4.0f, 0.0f, 2);
/* 57 */                iloI0lOlll1.I00i01iIIliI(-402447002);
/* 58 */                iloI0lOlll1.I0010I0i(false);
/* 59 */                O1ooiI111i o1ooiI111iI0000O = o1ooiI111iI000O01llI0.I0000O(o1ooIo101ll);
                        boolean z4 = (i9 & 14) == 4;
/* 60 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        if (z4 || objI00O0i0ii2 == obj2) {
                            z = false;
/* 61 */                    I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(0);
                            i11i0ol0l0.I00iiI = illOOo00lI2;
                            VarHandle.storeStoreFence();
/* 62 */                    iloI0lOlll1.I00iio(i11i0ol0l0);
                            obj = i11i0ol0l0;
                        } else {
                            z = false;
                            obj = objI00O0i0ii2;
                        }
/* 63 */                O1ooiI111i o1ooiI111iI00000oIO = iIlll1lo.I00000oIO(o1ooiI111iI0000O, (Function1) obj);
/* 64 */                O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, z);
/* 66 */                int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 67 */                OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 68 */                O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 69 */                iloI0lOlll1.I00i0oil();
/* 70 */                if (iloI0lOlll1.I00O10llo) {
/* 71 */                    iloI0lOlll1.I000l1(illOOo00lI3);
                        } else {
/* 72 */                    iloI0lOlll1.I00io1l();
                        }
/* 73 */                li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O2);
/* 74 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 75 */                IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 76 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
                        iOii1l3 = iOii1l;
                        oo0lloOiiIOI3 = oo0lloOiiIOI;
                        iloI0lOlll12 = iloI0lOlll1;
                        j5 = j2;
/* 77 */                lIOi11I01oo.I00000oIO(j5, oo0lloOiiIOI3, iOii1l3, iloI0lOlll12, ((i3 >> 9) & 14) | ((i3 >> 18) & 112) | ((i3 >> 12) & 896));
/* 78 */                iloI0lOlll12.I0010I0i(true);
/* 79 */                iloI0lOlll12.I0010I0i(false);
/* 80 */                O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(iIoIOo00o.I00000oOI(o1ooIo101ll, "actionIcons"), 0.0f, 0.0f, 4.0f, 0.0f, 11);
/* 81 */                O1iOIl0o10 o1iOIl0o10I0000Il00O3 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 83 */                int iHashCode4 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 84 */                OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll12.I000lI();
/* 85 */                O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000OiO2);
/* 86 */                iloI0lOlll12.I00i0oil();
/* 87 */                if (iloI0lOlll12.I00O10llo) {
/* 88 */                    iloI0lOlll12.I000l1(illOOo00lI3);
                        } else {
/* 89 */                    iloI0lOlll12.I00io1l();
                        }
/* 90 */                li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, o1iOIl0o10I0000Il00O3);
/* 91 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI4);
/* 92 */                IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll12, iOioOOi0I3, iloI0lOlll12);
/* 93 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O4);
                        iOii1l4 = iOii1l2;
/* 96 */                iiliio0o.I00000oIO(iOlO1IilOlOl.I00000oIO(IOOiio0i.I00000oIO(j4)), iOii1l4, iloI0lOlll12, 8 | ((i9 >> 15) & 112));
/* 97 */                iloI0lOlll12.I0010I0i(true);
/* 98 */                iloI0lOlll12.I0010I0i(true);
                    } else {
                        j5 = j2;
                        oo0lloOiiIOI3 = oo0lloOiiIOI;
                        iloI0lOlll12 = iloI0lOlll1;
/* 99 */                iloI0lOlll12.I00OilO00Il();
                    }
/* 100 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        I11i0ooIO1 i11i0ooIO1 = new I11i0ooIO1();
                        i11i0ooIO1.I00iOIl = o1ooiI111i;
                        i11i0ooIO1.I00iiI = ilOOiIO;
                        i11i0ooIO1.I00iiO = j;
                        i11i0ooIO1.I00iio = j5;
                        i11i0ooIO1.I00ilI0I1 = j3;
                        i11i0ooIO1.I00ilO0 = j4;
                        i11i0ooIO1.I00io1l = iOii1l3;
                        i11i0ooIO1.I00ioIO = oo0lloOiiIOI3;
                        i11i0ooIO1.I00l0I0l0lO1 = oo0lloOiiIOI2;
                        i11i0ooIO1.I00l0OO0IO = illOOo00lI;
                        i11i0ooIO1.I00li1OI = iI0IlloOiO0i;
                        i11i0ooIO1.I00ll1 = illiIl1l11O;
                        i11i0ooIO1.I00lli11 = iOii1l4;
                        i11i0ooIO1.I00lll10 = f;
                        i11i0ooIO1.I00o0iI0io1 = oIo1Oi1l1lI;
                        i11i0ooIO1.I00o0l1o1o0 = i;
                        i11i0ooIO1.I00o101lO = i2;
                        VarHandle.storeStoreFence();
/* 101 */               oOloioIlI001IO000.I0000O = i11i0ooIO1;
                    }
                }
            }

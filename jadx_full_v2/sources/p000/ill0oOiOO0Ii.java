            package p000;

            import android.content.Context;
            import android.webkit.WebViewClient;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ill0oOiOO0Ii {
                /* JADX WARN: Removed duplicated region for block: B:145:0x025a  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0267  */
                /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, String str, boolean z, boolean z2, boolean z3, Function1 function1, Function1 function12, WebViewClient webViewClient, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    String str2;
                    int i4;
                    boolean z4;
                    int i5;
                    boolean z5;
                    int i6;
                    boolean z6;
                    int i7;
                    Function1 function13;
                    int i8;
                    Function1 function14;
                    int i9;
                    int i10;
                    int i11;
                    O1ooiI111i o1ooiI111i2;
                    WebViewClient webViewClient2;
                    OOloioIl oOloioIlI001IO000;
/* 12 */            iloI0lOlll1.I00i0O(-334334641);
/* 17 */            if ((i & 6) == 0) {
/* 28 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 30 */                i3 = i;
                    }
/* 31 */            int i12 = i2 & 2;
/* 35 */            if (i12 != 0) {
/* 37 */                i4 = i3 | 48;
/* 38 */                str2 = str;
                    } else {
/* 41 */                str2 = str;
/* 54 */                i4 = i3 | (iloI0lOlll1.I000II(str2) ? 32 : 16);
                    }
/* 55 */            int i13 = i2 & 4;
/* 57 */            if (i13 != 0) {
/* 59 */                i5 = i4 | 384;
/* 61 */                z4 = z;
                    } else {
/* 64 */                z4 = z;
/* 77 */                i5 = i4 | (iloI0lOlll1.I000O01llI0(z4) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
                    }
/* 78 */            int i14 = i2 & 8;
/* 80 */            if (i14 != 0) {
/* 82 */                i5 |= 3072;
                    } else {
/* 89 */                if ((i & 3072) == 0) {
/* 91 */                    z5 = z2;
/* 104 */                   i5 |= iloI0lOlll1.I000O01llI0(z5) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 105 */               i6 = i2 & 16;
/* 107 */               if (i6 != 0) {
/* 116 */                   if ((i & 24576) == 0) {
/* 118 */                       z6 = z3;
/* 131 */                       i5 |= iloI0lOlll1.I000O01llI0(z6) ? 16384 : 8192;
                            }
/* 133 */                   i7 = i2 & 32;
/* 137 */                   if (i7 != 0) {
/* 139 */                       i5 |= 196608;
/* 141 */                       function13 = function1;
                            } else {
/* 146 */                       function13 = function1;
/* 148 */                       if ((i & 196608) == 0) {
/* 161 */                           i5 |= iloI0lOlll1.I000OOo1O(function13) ? 131072 : 65536;
                                }
                            }
/* 163 */                   i8 = i2 & 64;
/* 165 */                   if (i8 != 0) {
/* 169 */                       i9 = i5 | 1572864;
/* 171 */                       function14 = function12;
                            } else {
/* 174 */                       function14 = function12;
/* 187 */                       i9 = i5 | (iloI0lOlll1.I000OOo1O(function14) ? 1048576 : 524288);
                            }
/* 191 */                   int i15 = i9 | 12582912;
/* 193 */                   i10 = i2 & Barcode.FORMAT_QR_CODE;
/* 195 */                   if (i10 != 0) {
/* 199 */                       i11 = i9 | 113246208;
                            } else {
/* 218 */                       i11 = i15 | (iloI0lOlll1.I000OOo1O(webViewClient) ? 67108864 : 33554432);
                            }
/* 249 */                   if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 38347923) != 38347922)) {
/* 252 */                       if (i12 != 0) {
/* 254 */                           str2 = null;
                                }
/* 255 */                       if (i13 != 0) {
/* 257 */                           z4 = false;
                                }
/* 259 */                       if (i14 != 0) {
/* 261 */                           z5 = false;
                                }
/* 263 */                       if (i6 != 0) {
/* 265 */                           z6 = false;
                                }
/* 267 */                       if (i7 != 0) {
/* 269 */                           function13 = null;
                                }
/* 270 */                       if (i8 != 0) {
/* 272 */                           function14 = null;
                                }
/* 277 */                       WebViewClient webViewClient3 = i10 != 0 ? null : webViewClient;
/* 285 */                       Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 287 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 291 */                       Object obj = IOl11li.I00000oIO;
/* 293 */                       if (objI00O0i0ii == obj) {
/* 303 */                           objI00O0i0ii = webViewClient3 == null ? new I1oIill(context) : webViewClient3;
/* 304 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 307 */                       WebViewClient webViewClient4 = (WebViewClient) objI00O0i0ii;
/* 309 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 313 */                       if (objI00O0i0ii2 == obj) {
/* 315 */                           objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 319 */                           iloI0lOlll1.I00iio(objI00O0i0ii2);
                                }
/* 322 */                       OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 324 */                       Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 328 */                       if (objI00O0i0ii3 == obj) {
/* 330 */                           objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 334 */                           iloI0lOlll1.I00iio(objI00O0i0ii3);
                                }
/* 337 */                       OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 341 */                       WebViewClient webViewClient5 = webViewClient3;
/* 344 */                       I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 347 */                       Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                                Object obj2 = objI00O0i0ii4;
/* 351 */                       if (objI00O0i0ii4 == obj) {
/* 357 */                           IlI0iIl011 ilI0iIl011 = new IlI0iIl011(8);
/* 360 */                           ilI0iIl011.I00iiI = oI10i0Il;
/* 362 */                           VarHandle.storeStoreFence();
/* 365 */                           iloI0lOlll1.I00iio(ilI0iIl011);
                                    obj2 = ilI0iIl011;
                                }
/* 372 */                       O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj2, iloI0lOlll1, 48);
/* 379 */                       I0IIiOoi1i i0IIiOoi1i2 = new I0IIiOoi1i(5);
/* 382 */                       Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii5;
/* 386 */                       if (objI00O0i0ii5 == obj) {
/* 392 */                           IlI0iIl011 ilI0iIl0112 = new IlI0iIl011(9);
/* 395 */                           ilI0iIl0112.I00iiI = oI10i0Il2;
/* 397 */                           VarHandle.storeStoreFence();
/* 400 */                           iloI0lOlll1.I00iio(ilI0iIl0112);
                                    obj3 = ilI0iIl0112;
                                }
/* 407 */                       O1OIi1 o1OIi1I00000oIO2 = iOI1O1I1O.I00000oIO(i0IIiOoi1i2, (Function1) obj3, iloI0lOlll1, 48);
/* 487 */                       int i16 = i11;
/* 509 */                       boolean zI000OOo1O = ((i11 & 896) == 256) | ((i11 & 7168) == 2048) | ((3670016 & i11) == 1048576) | ((57344 & i11) == 16384) | iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO) | iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO2) | iloI0lOlll1.I000OOo1O(webViewClient4) | ((i11 & 112) == 32) | ((i16 & 458752) == 131072);
/* 511 */                       Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                                Object obj4 = objI00O0i0ii6;
/* 515 */                       if (zI000OOo1O || objI00O0i0ii6 == obj) {
/* 521 */                           Ilo1OiIi ilo1OiIi = new Ilo1OiIi();
/* 524 */                           ilo1OiIi.I00iOIl = z5;
/* 526 */                           ilo1OiIi.I00iiI = webViewClient4;
/* 528 */                           ilo1OiIi.I00iiO = str2;
/* 530 */                           ilo1OiIi.I00iio = function13;
/* 532 */                           ilo1OiIi.I00ilI0I1 = function14;
/* 534 */                           ilo1OiIi.I00ilO0 = z6;
/* 536 */                           ilo1OiIi.I00io1l = o1OIi1I00000oIO;
/* 538 */                           ilo1OiIi.I00ioIO = o1OIi1I00000oIO2;
/* 540 */                           ilo1OiIi.I00l0I0l0lO1 = oI10i0Il;
/* 542 */                           ilo1OiIi.I00l0OO0IO = oI10i0Il2;
/* 544 */                           ilo1OiIi.I00li1OI = z4;
/* 546 */                           VarHandle.storeStoreFence();
/* 549 */                           iloI0lOlll1.I00iio(ilo1OiIi);
                                    obj4 = ilo1OiIi;
                                }
/* 552 */                       Function1 function15 = (Function1) obj4;
/* 554 */                       Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 558 */                       if (objI00O0i0ii7 == obj) {
/* 564 */                           objI00O0i0ii7 = new Ilo10O1IlOl(17);
/* 567 */                           iloI0lOlll1.I00iio(objI00O0i0ii7);
                                }
/* 595 */                       O0000Ioio00.I00000oOI(function15, o1ooiI111i, (Function1) objI00O0i0ii7, null, iloI0lOlll1, ((i16 << 3) & 112) | 3072, 20);
/* 598 */                       o1ooiI111i2 = o1ooiI111i;
/* 600 */                       webViewClient2 = webViewClient5;
                            } else {
/* 603 */                       o1ooiI111i2 = o1ooiI111i;
/* 605 */                       iloI0lOlll1.I00OilO00Il();
/* 608 */                       webViewClient2 = webViewClient;
                            }
/* 610 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 614 */                   if (oOloioIlI001IO000 != null) {
/* 618 */                       Ilo1Oii010 ilo1Oii010 = new Ilo1Oii010();
/* 621 */                       ilo1Oii010.I00iOIl = o1ooiI111i2;
/* 623 */                       ilo1Oii010.I00iiI = str2;
/* 625 */                       ilo1Oii010.I00iiO = z4;
/* 627 */                       ilo1Oii010.I00iio = z5;
/* 629 */                       ilo1Oii010.I00ilI0I1 = z6;
/* 631 */                       ilo1Oii010.I00ilO0 = function13;
/* 633 */                       ilo1Oii010.I00io1l = function14;
/* 635 */                       ilo1Oii010.I00ioIO = webViewClient2;
/* 639 */                       ilo1Oii010.I00l0I0l0lO1 = i;
/* 643 */                       ilo1Oii010.I00l0OO0IO = i2;
/* 645 */                       VarHandle.storeStoreFence();
/* 648 */                       oOloioIlI001IO000.I0000O = ilo1Oii010;
/* 3539 */                      return;
                            }
/* 3539 */                  return;
                        }
/* 109 */               i5 |= 24576;
/* 111 */               z6 = z3;
/* 133 */               i7 = i2 & 32;
/* 137 */               if (i7 != 0) {
                        }
/* 163 */               i8 = i2 & 64;
/* 165 */               if (i8 != 0) {
                        }
/* 191 */               int i152 = i9 | 12582912;
/* 193 */               i10 = i2 & Barcode.FORMAT_QR_CODE;
/* 195 */               if (i10 != 0) {
                        }
/* 249 */               if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 38347923) != 38347922)) {
                        }
/* 610 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 614 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 84 */            z5 = z2;
/* 105 */           i6 = i2 & 16;
/* 107 */           if (i6 != 0) {
                    }
/* 111 */           z6 = z3;
/* 133 */           i7 = i2 & 32;
/* 137 */           if (i7 != 0) {
                    }
/* 163 */           i8 = i2 & 64;
/* 165 */           if (i8 != 0) {
                    }
/* 191 */           int i1522 = i9 | 12582912;
/* 193 */           i10 = i2 & Barcode.FORMAT_QR_CODE;
/* 195 */           if (i10 != 0) {
                    }
/* 249 */           if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 38347923) != 38347922)) {
                    }
/* 610 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 614 */           if (oOloioIlI001IO000 != null) {
                    }
                }
            }

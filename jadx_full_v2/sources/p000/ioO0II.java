            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ioO0II {
                /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
                /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OIoOo11 oIoOo11, String str, O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, IOoOOI1ii iOoOOI1ii, float f, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    float f2;
                    I0iolI1I11l1 i0iolI1I11l12;
                    OOloioIl oOloioIlI001IO000;
/* 18 */            iloI0lOlll1.I00i0O(1142754848);
/* 23 */            if ((i & 6) == 0) {
/* 43 */                i3 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oIoOo11) : iloI0lOlll1.I000OOo1O(oIoOo11) ? 4 : 2) | i;
                    } else {
/* 45 */                i3 = i;
                    }
/* 50 */            if ((i & 48) == 0) {
/* 62 */                i3 |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 65 */            if ((i & 384) == 0) {
/* 78 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 79 */            int i5 = i2 & 8;
/* 81 */            if (i5 != 0) {
/* 83 */                i3 |= 3072;
                    } else {
/* 90 */                if ((i & 3072) == 0) {
/* 105 */                   i3 |= iloI0lOlll1.I000II(i0iolI1I11l1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 108 */               if ((i & 24576) == 0) {
/* 121 */                   i3 |= iloI0lOlll1.I000II(iOoOOI1ii) ? 16384 : 8192;
                        }
/* 122 */               i4 = i2 & 32;
/* 126 */               if (i4 != 0) {
/* 133 */                   if ((196608 & i) == 0) {
/* 135 */                       f2 = f;
/* 148 */                       i3 |= iloI0lOlll1.I0000O(f2) ? 131072 : 65536;
                            }
/* 153 */                   if ((i2 & 64) != 0) {
/* 155 */                       i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
/* 173 */                       i3 |= iloI0lOlll1.I000II(null) ? 1048576 : 524288;
                            }
/* 194 */                   if (iloI0lOlll1.I00OIl(i3 & 1, (599187 & i3) != 599186)) {
/* 201 */                       i0iolI1I11l12 = i5 != 0 ? i1O01oOIoI0I.I00io1l : i0iolI1I11l1;
/* 203 */                       if (i4 != 0) {
/* 207 */                           f2 = 1.0f;
                                }
/* 208 */                       O1ooiI111i o1ooiI111iI00000oOI = O1ooIo101ll.I00000oIO;
/* 210 */                       Object obj = IOl11li.I00000oIO;
/* 212 */                       if (str != null) {
/* 217 */                           iloI0lOlll1.I00i01iIIliI(1899222916);
/* 226 */                           boolean z = (i3 & 112) == 32;
/* 227 */                           Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                    Object obj2 = objI00O0i0ii;
/* 231 */                           if (z || objI00O0i0ii == obj) {
/* 239 */                               I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(19);
/* 242 */                               i0ioO0Oio0ll.I00iiI = str;
/* 244 */                               VarHandle.storeStoreFence();
/* 247 */                               iloI0lOlll1.I00iio(i0ioO0Oio0ll);
                                        obj2 = i0ioO0Oio0ll;
                                    }
/* 252 */                           o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oOI, false, (Function1) obj2);
/* 256 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 263 */                           iloI0lOlll1.I00i01iIIliI(1899381698);
/* 266 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 280 */                       float f3 = f2;
/* 285 */                       O1ooiI111i o1ooiI111iI00000oIO = iO01O00o.I00000oIO(ii0OOOOo0i.I00000oOI(o1ooiI111i.I0000O(o1ooiI111iI00000oOI)), oIoOo11, i0iolI1I11l12, iOoOOI1ii, f3, null, 2);
/* 289 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 293 */                       if (objI00O0i0ii2 == obj) {
/* 295 */                           objI00O0i0ii2 = I0o0oo1oOOlO.I000OOo1O;
/* 297 */                           iloI0lOlll1.I00iio(objI00O0i0ii2);
                                }
/* 300 */                       O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) objI00O0i0ii2;
/* 304 */                       int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 308 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 312 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 318 */                       IOl0oi0lOl1.I000lI.getClass();
/* 321 */                       iloI0lOlll1.I00i0oil();
/* 326 */                       if (iloI0lOlll1.I00O10llo) {
/* 330 */                           iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 334 */                           iloI0lOlll1.I00io1l();
                                }
/* 339 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 344 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 347 */                       li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 352 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 361 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 364 */                       iloI0lOlll1.I0010I0i(true);
/* 367 */                       f2 = f3;
                            } else {
/* 369 */                       iloI0lOlll1.I00OilO00Il();
/* 372 */                       i0iolI1I11l12 = i0iolI1I11l1;
                            }
/* 374 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 378 */                   if (oOloioIlI001IO000 != null) {
/* 382 */                       IoiIOlll0i ioiIOlll0i = new IoiIOlll0i();
/* 385 */                       ioiIOlll0i.I00iOIl = oIoOo11;
/* 387 */                       ioiIOlll0i.I00iiI = str;
/* 389 */                       ioiIOlll0i.I00iiO = o1ooiI111i;
/* 391 */                       ioiIOlll0i.I00iio = i0iolI1I11l12;
/* 393 */                       ioiIOlll0i.I00ilI0I1 = iOoOOI1ii;
/* 395 */                       ioiIOlll0i.I00ilO0 = f2;
/* 397 */                       ioiIOlll0i.I00io1l = i;
/* 399 */                       ioiIOlll0i.I00ioIO = i2;
/* 401 */                       VarHandle.storeStoreFence();
/* 404 */                       oOloioIlI001IO000.I0000O = ioiIOlll0i;
/* 1821 */                      return;
                            }
/* 1821 */                  return;
                        }
/* 128 */               i3 |= 196608;
/* 129 */               f2 = f;
/* 153 */               if ((i2 & 64) != 0) {
                        }
/* 194 */               if (iloI0lOlll1.I00OIl(i3 & 1, (599187 & i3) != 599186)) {
                        }
/* 374 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 378 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 108 */           if ((i & 24576) == 0) {
                    }
/* 122 */           i4 = i2 & 32;
/* 126 */           if (i4 != 0) {
                    }
/* 129 */           f2 = f;
/* 153 */           if ((i2 & 64) != 0) {
                    }
/* 194 */           if (iloI0lOlll1.I00OIl(i3 & 1, (599187 & i3) != 599186)) {
                    }
/* 374 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 378 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I00000oOI(I0oO00o i0oO00o, String str, O1ooiI111i o1ooiI111i, IOoOOI1ii iOoOOI1ii, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
/* 1 */             II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00io1l;
/* 5 */             if ((i2 & 16) != 0) {
/* 7 */                 iOoOOI1ii = IOoOIiOl1llI.I00000oOI;
                    }
/* 9 */             IOoOOI1ii iOoOOI1ii2 = iOoOOI1ii;
/* 10 */            boolean zI000II = iloI0lOlll1.I000II(i0oO00o);
/* 14 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 18 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 25 */                objI00O0i0ii = iOOol1l.I00000oIO(i0oO00o, 1);
/* 29 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 66 */            I00000oIO((II0o0I1O10ii) objI00O0i0ii, str, o1ooiI111i, iI0O01li0, iOoOOI1ii2, 1.0f, iloI0lOlll1, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
                }
            }

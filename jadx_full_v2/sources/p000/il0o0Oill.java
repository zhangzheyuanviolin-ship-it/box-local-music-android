            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class il0o0Oill {
                /* JADX WARN: Multi-variable type inference failed */
                public static final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, O1ol100o0O o1ol100o0O, O1oIo0iI00 o1oIo0iI00, O1ooiI111i o1ooiI111i, boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    int i4;
                    boolean z2;
                    OI10i0Il oI10i0Il2;
                    Object obj2;
                    boolean z3;
/* 18 */            iloI0lOlll1.I00i0O(-1925179487);
/* 23 */            if ((i & 6) == 0) {
/* 34 */                i2 = (iloI0lOlll1.I000OOo1O(o1oIOiI11o0) ? 4 : 2) | i;
                    } else {
/* 36 */                i2 = i;
                    }
/* 39 */            if ((i & 48) == 0) {
/* 52 */                i2 |= iloI0lOlll1.I000OOo1O(o1ol100o0O) ? 32 : 16;
                    }
/* 55 */            if ((i & 384) == 0) {
/* 68 */                i2 |= iloI0lOlll1.I000II(o1oIo0iI00) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 71 */            if ((i & 3072) == 0) {
/* 84 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 87 */            if ((i & 24576) == 0) {
/* 100 */               i2 |= iloI0lOlll1.I000O01llI0(z) ? 16384 : 8192;
                    }
/* 101 */           int i5 = i2;
/* 118 */           if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 9363) != 9362)) {
/* 120 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 124 */               Object obj3 = IOl11li.I00000oIO;
                        Object obj4 = objI00O0i0ii;
/* 126 */               if (objI00O0i0ii == obj3) {
/* 130 */                   Object objI00000oIO = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 134 */                   iloI0lOlll1.I00iio(objI00000oIO);
                            obj4 = objI00000oIO;
                        }
/* 137 */               OI10i0Il oI10i0Il3 = (OI10i0Il) obj4;
/* 145 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 48);
/* 151 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 155 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 159 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 165 */               IOl0oi0lOl1.I000lI.getClass();
/* 168 */               iloI0lOlll1.I00i0oil();
/* 173 */               if (iloI0lOlll1.I00O10llo) {
/* 177 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 181 */                   iloI0lOlll1.I00io1l();
                        }
/* 186 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 191 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 200 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 203 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 208 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 216 */               ModelDownloadStatusType modelDownloadStatusType = o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null;
/* 229 */               if ((modelDownloadStatusType == null ? -1 : IiIo10.I00000oIO[modelDownloadStatusType.ordinal()]) == 1) {
/* 234 */                   iloI0lOlll1.I00i01iIIliI(227071008);
/* 237 */                   if (z) {
/* 242 */                       iloI0lOlll1.I00i01iIIliI(227101512);
/* 245 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                Object obj5 = objI00O0i0ii2;
/* 249 */                       if (objI00O0i0ii2 == obj3) {
/* 254 */                           IOli1iO1Ii iOli1iO1Ii = new IOli1iO1Ii(2);
/* 257 */                           iOli1iO1Ii.I00iiI = oI10i0Il3;
/* 259 */                           VarHandle.storeStoreFence();
/* 262 */                           iloI0lOlll1.I00iio(iOli1iO1Ii);
                                    obj5 = iOli1iO1Ii;
                                }
/* 287 */                       i4 = i5;
/* 289 */                       oI10i0Il = oI10i0Il3;
/* 291 */                       obj = obj3;
/* 293 */                       z3 = false;
/* 294 */                       iIo1101O.I00000oIO((IllOOo00lI) obj5, null, false, null, null, i1Oo1IIO.I00000oIO, iloI0lOlll1, 1572870, 62);
/* 297 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 301 */                       oI10i0Il = oI10i0Il3;
/* 303 */                       obj = obj3;
/* 304 */                       i4 = i5;
/* 306 */                       z3 = false;
/* 310 */                       iloI0lOlll1.I00i01iIIliI(227436901);
/* 313 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 316 */                   iloI0lOlll1.I0010I0i(z3);
                            z2 = z3;
                        } else {
/* 321 */                   oI10i0Il = oI10i0Il3;
/* 323 */                   obj = obj3;
/* 324 */                   i4 = i5;
/* 326 */                   z2 = 0;
/* 330 */                   iloI0lOlll1.I00i01iIIliI(227460771);
/* 333 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 337 */               iloI0lOlll1.I0010I0i(true);
/* 350 */               if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 355 */                   iloI0lOlll1.I00i01iIIliI(1972088782);
/* 366 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(o1oIOiI11o0);
/* 367 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 371 */                   if (zI000OOo1O || objI00O0i0ii3 == obj) {
/* 381 */                       IiIo0O00 iiIo0O00 = new IiIo0O00(z2 ? 1 : 0);
/* 384 */                       iiIo0O00.I00iiI = o1ol100o0O;
/* 386 */                       iiIo0O00.I00iiO = o1oIOiI11o0;
/* 388 */                       oI10i0Il2 = oI10i0Il;
/* 390 */                       iiIo0O00.I00iio = oI10i0Il2;
/* 392 */                       VarHandle.storeStoreFence();
/* 395 */                       iloI0lOlll1.I00iio(iiIo0O00);
                                obj2 = iiIo0O00;
                            } else {
/* 376 */                       oI10i0Il2 = oI10i0Il;
                                obj2 = objI00O0i0ii3;
                            }
/* 398 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) obj2;
/* 400 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                            Object obj6 = objI00O0i0ii4;
/* 404 */                   if (objI00O0i0ii4 == obj) {
/* 409 */                       IOli1iO1Ii iOli1iO1Ii2 = new IOli1iO1Ii(3);
/* 412 */                       iOli1iO1Ii2.I00iiI = oI10i0Il2;
/* 414 */                       VarHandle.storeStoreFence();
/* 417 */                       iloI0lOlll1.I00iio(iOli1iO1Ii2);
                                obj6 = iOli1iO1Ii2;
                            }
/* 426 */                   iio0lIO.I00000oIO(o1oIOiI11o0, illOOo00lI, (IllOOo00lI) obj6, iloI0lOlll1, (i4 & 14) | 384);
/* 429 */                   iloI0lOlll1.I0010I0i(z2);
                            i3 = z2;
                        } else {
/* 436 */                   iloI0lOlll1.I00i01iIIliI(1972322305);
/* 439 */                   iloI0lOlll1.I0010I0i(z2);
                            i3 = z2;
                        }
                    } else {
/* 443 */               i3 = 0;
/* 444 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 447 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 451 */           if (oOloioIlI001IO000 != null) {
/* 455 */               IiIo0oO010ol iiIo0oO010ol = new IiIo0oO010ol(i3);
/* 458 */               iiIo0oO010ol.I00iiI = o1oIOiI11o0;
/* 460 */               iiIo0oO010ol.I00io1l = o1ol100o0O;
/* 462 */               iiIo0oO010ol.I00iiO = o1oIo0iI00;
/* 464 */               iiIo0oO010ol.I00ilI0I1 = o1ooiI111i;
/* 466 */               iiIo0oO010ol.I00iio = z;
/* 470 */               iiIo0oO010ol.I00ilO0 = i;
/* 472 */               VarHandle.storeStoreFence();
/* 475 */               oOloioIlI001IO000.I0000O = iiIo0oO010ol;
                    }
                }
            }

            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function3;
            
            public abstract class lOIli1Ol {
                public static final void I00000oIO(Ol1OiolO0 ol1OiolO0, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
/* 12 */            iloI0lOlll1.I00i0O(-977568115);
/* 30 */            int i2 = (i & 6) == 0 ? (iloI0lOlll1.I000II(ol1OiolO0) ? 4 : 2) | i : i;
/* 33 */            if ((i & 48) == 0) {
/* 46 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 49 */            if ((i & 384) == 0) {
/* 64 */                i2 |= iloI0lOlll1.I000OOo1O(iII1l1Oloio.I00000oIO) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 70 */            int i3 = 0;
/* 81 */            int i4 = 19;
/* 83 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 88 */                String strI00000oIO = lOi10Ol.I00000oIO(R.string.m3c_snackbar_pane_title, iloI0lOlll1);
/* 92 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                        Object obj = objI00O0i0ii;
/* 98 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 102 */                   IlI1ooiil1lo ilI1ooiil1lo = new IlI1ooiil1lo();
/* 110 */                   ilI1ooiil1lo.I00000oIO = new Object();
/* 117 */                   ilI1ooiil1lo.I00000oOI = new ArrayList();
/* 119 */                   iloI0lOlll1.I00iio(ilI1ooiil1lo);
                            obj = ilI1ooiil1lo;
                        }
/* 122 */               IlI1ooiil1lo ilI1ooiil1lo2 = (IlI1ooiil1lo) obj;
/* 124 */               Object obj2 = ilI1ooiil1lo2.I00000oIO;
/* 126 */               ArrayList arrayList = ilI1ooiil1lo2.I00000oOI;
/* 132 */               if (O0000Ioio00.I0000O(ol1OiolO0, obj2)) {
/* 280 */                   iloI0lOlll1.I00i01iIIliI(1443889109);
/* 283 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 137 */                   iloI0lOlll1.I00i01iIIliI(1441886385);
/* 140 */                   ilI1ooiil1lo2.I00000oIO = ol1OiolO0;
/* 148 */                   ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 151 */                   int size = arrayList.size();
/* 156 */                   for (int i5 = 0; i5 < size; i5++) {
/* 166 */                       arrayList2.add(((IlI1oo0ioO) arrayList.get(i5)).I00000oIO);
                            }
/* 174 */                   ArrayList arrayList3 = new ArrayList(arrayList2);
/* 181 */                   if (!arrayList3.contains(ol1OiolO0)) {
/* 183 */                       arrayList3.add(ol1OiolO0);
                            }
/* 186 */                   arrayList.clear();
/* 195 */                   ArrayList arrayList4 = new ArrayList(arrayList3.size());
/* 198 */                   int size2 = arrayList3.size();
/* 203 */                   for (int i6 = 0; i6 < size2; i6++) {
/* 205 */                       Object obj3 = arrayList3.get(i6);
/* 209 */                       if (obj3 != null) {
/* 211 */                           arrayList4.add(obj3);
                                }
                            }
/* 217 */                   int size3 = arrayList4.size();
/* 221 */                   int i7 = 0;
/* 222 */                   while (i7 < size3) {
/* 228 */                       Ol1OiolO0 ol1OiolO02 = (Ol1OiolO0) arrayList4.get(i7);
/* 234 */                       IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(i4);
/* 237 */                       iO1oIiIi1O01.I00iiO = ol1OiolO02;
/* 239 */                       iO1oIiIi1O01.I00iio = ol1OiolO0;
/* 241 */                       iO1oIiIi1O01.I00iiI = ilI1ooiil1lo2;
/* 243 */                       iO1oIiIi1O01.I00ilI0I1 = strI00000oIO;
/* 245 */                       VarHandle.storeStoreFence();
/* 251 */                       IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1952400805, iO1oIiIi1O01, iloI0lOlll1);
/* 255 */                       IlI1oo0ioO ilI1oo0ioO = new IlI1oo0ioO();
/* 258 */                       ilI1oo0ioO.I00000oIO = ol1OiolO02;
/* 260 */                       ilI1oo0ioO.I00000oOI = iOii1lI00000oOI;
/* 262 */                       VarHandle.storeStoreFence();
/* 265 */                       arrayList.add(ilI1oo0ioO);
/* 268 */                       i7++;
/* 270 */                       i4 = 19;
                            }
/* 273 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 288 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 294 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 298 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 302 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 308 */               IOl0oi0lOl1.I000lI.getClass();
/* 311 */               iloI0lOlll1.I00i0oil();
/* 316 */               if (iloI0lOlll1.I00O10llo) {
/* 320 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 324 */                   iloI0lOlll1.I00io1l();
                        }
/* 329 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 334 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 343 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 346 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 351 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 354 */               OOloioIl oOloioIlI001lllioOl = iloI0lOlll1.I001lllioOl();
/* 358 */               if (oOloioIlI001lllioOl == null) {
/* 436 */                   I000II.I001IO000("no recompose scope found");
/* 439 */                   return;
                        }
                        oOloioIlI001lllioOl.I00000oOI |= 1;
/* 365 */               ilI1ooiil1lo2.I0000Il00O = oOloioIlI001lllioOl;
/* 370 */               iloI0lOlll1.I00i01iIIliI(-1888182177);
/* 373 */               int size4 = arrayList.size();
/* 378 */               for (int i8 = 0; i8 < size4; i8++) {
/* 384 */                   IlI1oo0ioO ilI1oo0ioO2 = (IlI1oo0ioO) arrayList.get(i8);
/* 386 */                   Ol1OiolO0 ol1OiolO03 = ilI1oo0ioO2.I00000oIO;
/* 388 */                   IOii1l iOii1l = ilI1oo0ioO2.I00000oOI;
/* 393 */                   iloI0lOlll1.I00Ol1ll1(1325010085, ol1OiolO03);
/* 398 */                   Ol1OIoI ol1OIoI = new Ol1OIoI(i3);
/* 401 */                   ol1OIoI.I00iiI = ol1OiolO03;
/* 403 */                   VarHandle.storeStoreFence();
/* 418 */                   iOii1l.invoke(iiioOl1O.I00000oOI(-1893791890, ol1OIoI, iloI0lOlll1), iloI0lOlll1, 6);
/* 421 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 427 */               iloI0lOlll1.I0010I0i(false);
/* 430 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 440 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 443 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 447 */           if (oOloioIlI001IO000 != null) {
/* 453 */               I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(19);
/* 456 */               i0O0llIiIlOO.I00iiO = ol1OiolO0;
/* 458 */               i0O0llIiIlOO.I00iio = o1ooiI111i;
/* 460 */               i0O0llIiIlOO.I00iiI = i;
/* 462 */               VarHandle.storeStoreFence();
/* 465 */               oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }

                public static final void I00000oOI(Ol1OlloIO ol1OlloIO, O1ooiI111i o1ooiI111i, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-1077081618);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(ol1OlloIO) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 39 */            int i3 = i2 | 384;
/* 45 */            int i4 = 1;
/* 57 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 65 */                Ol1OiolO0 ol1OiolO0 = (Ol1OiolO0) ol1OlloIO.I00000oOI.getValue();
/* 73 */                I01o0I i01o0I = (I01o0I) iloI0lOlll1.I000iOII(IOlO0o100i1i.I00000oIO);
/* 83 */                boolean zI000II = iloI0lOlll1.I000II(ol1OiolO0) | iloI0lOlll1.I000OOo1O(i01o0I);
/* 84 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 88 */                if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 97 */                    objI00O0i0ii = new Ol110ii1I(ol1OiolO0, i01o0I, (IOoil1iiIilo) null, i4);
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 105 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii, iloI0lOlll1, ol1OiolO0);
/* 118 */               I00000oIO((Ol1OiolO0) ol1OlloIO.I00000oOI.getValue(), o1ooiI111i, iloI0lOlll1, i3 & 1008);
/* 121 */               function3 = iII1l1Oloio.I00000oIO;
                    } else {
/* 124 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 127 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 131 */           if (oOloioIlI001IO000 != null) {
/* 137 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(22);
/* 140 */               i0IliiililIo.I00iiO = ol1OlloIO;
/* 142 */               i0IliiililIo.I00iio = o1ooiI111i;
/* 144 */               i0IliiililIo.I00ilI0I1 = function3;
/* 146 */               i0IliiililIo.I00iiI = i;
/* 148 */               VarHandle.storeStoreFence();
/* 151 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }
            }

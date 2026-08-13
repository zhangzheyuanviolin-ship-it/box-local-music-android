            package p000;

            import android.app.Activity;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1iOI0I1iII {
                public static final void I00000oIO(OI1o1o1iO1l oI1o1o1iO1l, O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
                    I0iolI1I11l1 i0iolI1I11l12;
                    char c;
                    O1ooiI111i o1ooiI111i2;
                    Function1 function16;
                    Function1 function17;
                    int i4;
                    I0iolI1I11l1 i0iolI1I11l13;
                    Function1 function18;
/* 16 */            iloI0lOlll1.I00i0O(1840250294);
/* 22 */            if ((i & 6) == 0) {
/* 33 */                i2 = (iloI0lOlll1.I000OOo1O(oI1o1o1iO1l) ? 4 : 2) | i;
                    } else {
/* 35 */                i2 = i;
                    }
/* 42 */            if ((i & 48) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000II("homepage") ? 32 : 16;
                    }
/* 55 */            int i5 = i2 | 28032;
/* 60 */            if ((196608 & i) == 0) {
/* 73 */                i5 |= iloI0lOlll1.I000OOo1O(function1) ? 131072 : 65536;
                    }
/* 77 */            if ((1572864 & i) == 0) {
/* 90 */                i5 |= iloI0lOlll1.I000OOo1O(function12) ? 1048576 : 524288;
                    }
/* 94 */            if ((12582912 & i) == 0) {
/* 98 */                i5 |= 4194304;
                    }
/* 102 */           if ((100663296 & i) == 0) {
/* 106 */               i5 |= 33554432;
                    }
/* 109 */           int i6 = i5 | 805306368;
/* 118 */           char c2 = iloI0lOlll1.I000OOo1O(function15) ? (char) 4 : (char) 2;
/* 126 */           if ((306783379 & i6) == 306783378 && (c2 & 3) == 2 && iloI0lOlll1.I00IO1()) {
/* 139 */               iloI0lOlll1.I00OilO00Il();
/* 142 */               o1ooiI111i2 = o1ooiI111i;
/* 144 */               i0iolI1I11l13 = i0iolI1I11l1;
/* 146 */               function16 = function13;
/* 148 */               function18 = function14;
/* 150 */               i4 = 3;
                    } else {
/* 154 */               iloI0lOlll1.I00Ol00();
/* 162 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 188 */                   i3 = i6 & (-264241153);
/* 186 */                   i0iolI1I11l12 = i1O01oOIoI0I.I00iiO;
/* 193 */                   c = c2;
/* 189 */                   o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 195 */                   function16 = function1;
/* 196 */                   function17 = function12;
                        } else {
/* 171 */                   iloI0lOlll1.I00OilO00Il();
/* 175 */                   o1ooiI111i2 = o1ooiI111i;
/* 177 */                   function17 = function14;
/* 174 */                   i3 = i6 & (-264241153);
/* 180 */                   c = c2;
/* 181 */                   i0iolI1I11l12 = i0iolI1I11l1;
/* 183 */                   function16 = function13;
                        }
/* 197 */               iloI0lOlll1.I0010o();
/* 203 */               i4 = 3;
/* 237 */               boolean z = ((i3 & 57344) == 16384) | ((i3 & 112) == 32) | ((c & 14) == 4);
/* 239 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 243 */               if (z || objI00O0i0ii == IOl11li.I00000oIO) {
/* 251 */                   OII1IlOi0 oII1IlOi0 = oI1o1o1iO1l.I00000oOI.I0010o;
/* 266 */                   OI1o0olI oI1o0olI = new OI1o0olI(oII1IlOi0.I00000oOI(l1iOoIO.I00000oIO(OI1o1io.class)), null);
/* 274 */                   oI1o0olI.I000O01llI0 = new ArrayList();
/* 276 */                   oI1o0olI.I0001Ioi1lo = oII1IlOi0;
/* 278 */                   oI1o0olI.I000II = "homepage";
/* 280 */                   VarHandle.storeStoreFence();
/* 283 */                   function15.invoke(oI1o0olI);
/* 286 */                   objI00O0i0ii = oI1o0olI.I0000Il00O();
/* 290 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 297 */               int i7 = i3 >> 3;
/* 309 */               int i8 = (i3 & 8078) | (i7 & 57344) | (458752 & i7) | (i7 & 234881024);
/* 311 */               i0iolI1I11l13 = i0iolI1I11l12;
/* 314 */               function18 = function17;
/* 315 */               I00000oOI(oI1o1o1iO1l, (OI1lo1liOO) objI00O0i0ii, o1ooiI111i2, i0iolI1I11l13, function1, function12, function16, function18, iloI0lOlll1, i8);
                    }
/* 318 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 322 */           if (oOloioIlI001IO000 != null) {
/* 328 */               OI1oi0O1ioI0 oI1oi0O1ioI0 = new OI1oi0O1ioI0(i4);
/* 331 */               oI1oi0O1ioI0.I00iiI = oI1o1o1iO1l;
/* 333 */               oI1oi0O1ioI0.I00iio = o1ooiI111i2;
/* 335 */               oI1oi0O1ioI0.I00ilI0I1 = i0iolI1I11l13;
/* 337 */               oI1oi0O1ioI0.I00ilO0 = function1;
/* 339 */               oI1oi0O1ioI0.I00io1l = function12;
/* 341 */               oI1oi0O1ioI0.I00ioIO = function16;
/* 343 */               oI1oi0O1ioI0.I00l0I0l0lO1 = function18;
/* 345 */               oI1oi0O1ioI0.I00iiO = function15;
/* 347 */               oI1oi0O1ioI0.I00l0OO0IO = i;
/* 349 */               VarHandle.storeStoreFence();
/* 352 */               oOloioIlI001IO000.I0000O = oI1oi0O1ioI0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:181:0x0343  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x034d  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x035e  */
                /* JADX WARN: Removed duplicated region for block: B:187:0x0365  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x0368  */
                /* JADX WARN: Removed duplicated region for block: B:195:0x0376  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x03a0  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x03bb  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x03c6  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x041a  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x0435  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x067a  */
                /* JADX WARN: Removed duplicated region for block: B:318:0x067e  */
                /* JADX WARN: Removed duplicated region for block: B:320:0x0681  */
                /* JADX WARN: Removed duplicated region for block: B:323:0x06b6  */
                /* JADX WARN: Removed duplicated region for block: B:472:0x0417 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(OI1o1o1iO1l oI1o1o1iO1l, OI1lo1liOO oI1lo1liOO, O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, Function1 function1, Function1 function12, Function1 function13, Function1 function14, IloI0lOlll1 iloI0lOlll1, int i) {
                    Object obj;
                    OII1IlOi0 oII1IlOi0;
                    IOl00O1iI1Oo iOl00O1iI1Oo;
                    OI1lo1liOO oI1lo1liOO2;
                    IOl00O1iI1Oo iOl00O1iI1Oo2;
                    OI1o1o1iO1l oI1o1o1iO1l2;
                    Object i000oI1ioi;
                    boolean z;
                    IOl00O1iI1Oo iOl00O1iI1Oo3;
                    Function1 function15;
                    Object obj2;
                    OIooO1iiliI oIooO1iiliI;
                    OI10i0Il oI10i0Il;
                    Object obj3;
                    Function1 function16;
                    IloI0lOlll1 iloI0lOlll12;
                    Function1 function17;
                    int i2;
                    Iii0iOoIo iii0iOoIo;
                    IloI0lOlll1 iloI0lOlll13;
                    OI1lo1liOO oI1lo1liOO3;
                    Function1 function18;
                    Object obj4;
                    OoI1Oi0l1I0o ooI1Oi0l1I0o;
                    Object obj5;
                    boolean z2;
                    int i3;
                    Object obj6;
                    Intent intent;
                    int[] intArray;
                    Bundle bundle;
                    int[] iArr;
                    OI1il00IOO oI1il00IOOI000iOII;
                    int[] iArr2;
                    ArrayList arrayList;
                    int length;
                    int i4;
                    String strI00000oIO;
                    OI1lo1liOO oI1lo1liOO4;
                    Bundle bundle2;
                    int i5;
                    OI1ilOI1ioo0 oI1ilOI1ioo0I000II;
                    OI1lo1liOO oI1lo1liOO5;
                    Iterator it;
                    IloI0lOlll1 iloI0lOlll14;
/* 5 */             O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 7 */             I0iolI1I11l1 i0iolI1I11l12 = i0iolI1I11l1;
/* 11 */            Function1 function19 = function12;
/* 15 */            Function1 function110 = function14;
/* 19 */            int i6 = i;
/* 24 */            iloI0lOlll1.I00i0O(-1964664536);
/* 42 */            int i7 = (i6 & 6) == 0 ? (iloI0lOlll1.I000OOo1O(oI1o1o1iO1l) ? 4 : 2) | i6 : i6;
/* 45 */            if ((i6 & 48) == 0) {
/* 58 */                i7 |= iloI0lOlll1.I000OOo1O(oI1lo1liOO) ? 32 : 16;
                    }
/* 61 */            if ((i6 & 384) == 0) {
/* 74 */                i7 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 77 */            if ((i6 & 3072) == 0) {
/* 90 */                i7 |= iloI0lOlll1.I000II(i0iolI1I11l12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 93 */            if ((i6 & 24576) == 0) {
/* 106 */               i7 |= iloI0lOlll1.I000OOo1O(function1) ? 16384 : 8192;
                    }
/* 110 */           if ((196608 & i6) == 0) {
/* 123 */               i7 |= iloI0lOlll1.I000OOo1O(function19) ? 131072 : 65536;
                    }
/* 130 */           if ((i6 & 1572864) == 0) {
/* 143 */               i7 |= iloI0lOlll1.I000OOo1O(function13) ? 1048576 : 524288;
                    }
/* 149 */           if ((i6 & 12582912) == 0) {
/* 162 */               i7 |= iloI0lOlll1.I000OOo1O(function110) ? 8388608 : 4194304;
                    }
/* 169 */           if ((i6 & 100663296) == 0) {
/* 182 */               i7 |= iloI0lOlll1.I000OOo1O(null) ? 67108864 : 33554432;
                    }
/* 184 */           int i8 = i7;
/* 192 */           if ((38347923 & i8) == 38347922 && iloI0lOlll1.I00IO1()) {
/* 201 */               iloI0lOlll1.I00OilO00Il();
/* 204 */               function17 = function1;
/* 205 */               oI1o1o1iO1l2 = oI1o1o1iO1l;
/* 206 */               function18 = function13;
/* 207 */               iloI0lOlll14 = iloI0lOlll1;
/* 208 */               oI1lo1liOO3 = oI1lo1liOO;
                    } else {
/* 211 */               iloI0lOlll1.I00Ol00();
/* 216 */               if ((i6 & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 225 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 228 */               iloI0lOlll1.I0010o();
/* 238 */               Object obj7 = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 240 */               Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll1);
/* 244 */               if (oool1Ii0II00000oIO == null) {
/* 2736 */                  I000II.I001IO000("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
/* 2739 */                  return;
                        }
/* 246 */               Oool0l1iOIOl oool0l1iOIOlI000II = oool1Ii0II00000oIO.I000II();
/* 250 */               OI1i0llli oI1i0llli = oI1o1o1iO1l.I00000oOI;
/* 262 */               if (!O0000Ioio00.I0000O(oI1i0llli.I000oI1ioi, l1iO0o0oo.I00000oIO(oool0l1iOIOlI000II))) {
/* 271 */                   if (!oI1i0llli.I0001Ioi1lo.isEmpty()) {
/* 2730 */                      I000II.I001IO000("ViewModelStore should be set before setGraph call");
/* 2733 */                      return;
                            }
/* 277 */                   oI1i0llli.I000oI1ioi = l1iO0o0oo.I00000oIO(oool0l1iOIOlI000II);
                        }
/* 279 */               LinkedHashMap linkedHashMap = oI1i0llli.I00111O;
/* 281 */               OII1IlOi0 oII1IlOi02 = oI1i0llli.I0010o;
/* 283 */               I0oiil10Ili i0oiil10Ili = oI1lo1liOO.I00ilO0;
/* 287 */               I1Il0loi i1Il0loi = oI1i0llli.I0001Ioi1lo;
/* 293 */               if (i1Il0loi.isEmpty()) {
/* 312 */                   obj = obj7;
                        } else {
/* 295 */                   obj = obj7;
/* 303 */                   if (oI1i0llli.I000O01llI0() == O0oOi0I.I00iOIl) {
/* 308 */                       I000II.I001IO000("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
/* 311 */                       return;
                            }
                        }
/* 320 */               if (O0000Ioio00.I0000O(oI1i0llli.I0000Il00O, oI1lo1liOO)) {
/* 1473 */                  oII1IlOi0 = oII1IlOi02;
/* 1475 */                  iOl00O1iI1Oo = null;
/* 1480 */                  int iI0000O = ((OlIIioolI) i0oiil10Ili.I00iio).I0000O();
/* 1485 */                  for (int i9 = 0; i9 < iI0000O; i9++) {
/* 1495 */                      OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) ((OlIIioolI) i0oiil10Ili.I00iio).I0000oI00(i9);
/* 1505 */                      int iI00000oOI = ((OlIIioolI) oI1i0llli.I0000Il00O.I00ilO0.I00iio).I00000oOI(i9);
/* 1515 */                      OlIIioolI olIIioolI = (OlIIioolI) oI1i0llli.I0000Il00O.I00ilO0.I00iio;
/* 1519 */                      if (olIIioolI.I00iOIl) {
/* 1521 */                          iO10Oii01l.I00000oOI(olIIioolI);
                                }
/* 1528 */                      int iI00000oIO = iIIl1I0OIlO0.I00000oIO(olIIioolI.I00iio, iI00000oOI, olIIioolI.I00iiI);
/* 1532 */                      if (iI00000oIO >= 0) {
/* 1534 */                          Object[] objArr = olIIioolI.I00iiO;
/* 1536 */                          Object obj8 = objArr[iI00000oIO];
/* 1538 */                          objArr[iI00000oIO] = oI1ilOI1ioo0;
                                }
                            }
/* 1543 */                  Iterator it2 = i1Il0loi.iterator();
/* 1551 */                  while (it2.hasNext()) {
/* 1557 */                      OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) it2.next();
/* 1559 */                      int i10 = OI1ilOI1ioo0.I00ilI0I1;
/* 1567 */                      List listI000lI = OilO1oiooiII.I000lI(l1iO11O10.I00000oOI(oI1OloOIO1O.I00iiI));
/* 1574 */                      O1OlO1II o1OlO1II = new O1OlO1II(1);
/* 1577 */                      o1OlO1II.I00iiI = listI000lI;
/* 1579 */                      VarHandle.storeStoreFence();
/* 1582 */                      OI1ilOI1ioo0 oI1ilOI1ioo0I000II2 = oI1i0llli.I0000Il00O;
/* 1585 */                      ListIterator listIterator = o1OlO1II.listIterator(0);
                                while (true) {
/* 1594 */                          ListIterator listIterator2 = (ListIterator) ((Oi11lo1liI0l) listIterator).I00iiI;
/* 1600 */                          if (listIterator2.hasPrevious()) {
/* 1606 */                              OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) listIterator2.previous();
/* 1616 */                              if (!O0000Ioio00.I0000O(oI1ilOI1ioo02, oI1i0llli.I0000Il00O) || !oI1ilOI1ioo0I000II2.equals(oI1lo1liOO)) {
/* 1627 */                                  if (oI1ilOI1ioo0I000II2 instanceof OI1lo1liOO) {
/* 1637 */                                      oI1ilOI1ioo0I000II2 = ((OI1lo1liOO) oI1ilOI1ioo0I000II2).I00ilO0.I000II(oI1ilOI1ioo02.I00iiI.I00000oOI);
                                            }
                                        }
                                    }
                                }
/* 1644 */                      oI1OloOIO1O.I00iiI = oI1ilOI1ioo0I000II2;
                            }
                        } else {
/* 322 */                   OI1lo1liOO oI1lo1liOO6 = oI1i0llli.I0000Il00O;
/* 324 */                   if (oI1lo1liOO6 != null) {
/* 339 */                       Iterator it3 = new ArrayList(oI1i0llli.I000l1.keySet()).iterator();
/* 347 */                       while (it3.hasNext()) {
/* 355 */                           int iIntValue = ((Integer) it3.next()).intValue();
/* 365 */                           Iterator it4 = linkedHashMap.values().iterator();
                                    while (true) {
/* 373 */                               it = it3;
/* 376 */                               if (!it4.hasNext()) {
                                            break;
                                        }
/* 386 */                               ((OI1Ooo) it4.next()).I0000O = true;
/* 390 */                               it3 = it;
                                    }
/* 417 */                           boolean zI00100l0 = oI1i0llli.I00100l0(iIntValue, null, new OI1oooI(false, true, -1, false, false, -1, -1));
/* 427 */                           Iterator it5 = linkedHashMap.values().iterator();
/* 435 */                           while (it5.hasNext()) {
/* 447 */                               ((OI1Ooo) it5.next()).I0000O = false;
/* 449 */                               zI00100l0 = zI00100l0;
                                    }
/* 454 */                           if (zI00100l0) {
/* 457 */                               oI1i0llli.I000l1(iIntValue, true, false);
                                    }
/* 465 */                           it3 = it;
                                }
/* 474 */                       oI1i0llli.I000l1(oI1lo1liOO6.I00iiI.I00000oOI, true, false);
                            }
/* 477 */                   oI1i0llli.I0000Il00O = oI1lo1liOO;
/* 479 */                   OI1o1o1iO1l oI1o1o1iO1l3 = oI1i0llli.I00000oIO;
/* 481 */                   OI1i0llli oI1i0llli2 = oI1o1o1iO1l3.I00000oOI;
/* 483 */                   I1O0ol i1O0ol = oI1o1o1iO1l3.I0000Il00O;
/* 485 */                   Bundle bundle3 = oI1i0llli.I0000O;
/* 487 */                   if (bundle3 != null && bundle3.containsKey("android-support-nav:controller:navigatorState:names")) {
/* 497 */                       ArrayList<String> stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names");
/* 501 */                       if (stringArrayList == null) {
/* 555 */                           lO0iIII0.I00000oIO("android-support-nav:controller:navigatorState:names");
/* 558 */                           throw null;
                                }
/* 503 */                       Iterator<String> it6 = stringArrayList.iterator();
/* 511 */                       while (it6.hasNext()) {
/* 517 */                           Iterator<String> it7 = it6;
/* 513 */                           String next = it6.next();
/* 523 */                           oII1IlOi02.I00000oOI(next);
/* 530 */                           if (bundle3.containsKey(next) && bundle3.getBundle(next) == null) {
/* 541 */                               lO0iIII0.I00000oIO(next);
/* 546 */                               throw null;
                                    }
/* 538 */                           it6 = it7;
                                }
                            }
/* 559 */                   Bundle[] bundleArr = oI1i0llli.I0000oI00;
/* 563 */                   if (bundleArr != null) {
/* 565 */                       int length2 = bundleArr.length;
/* 568 */                       int i11 = 0;
/* 569 */                       while (i11 < length2) {
/* 571 */                           int i12 = length2;
/* 575 */                           int i13 = i11;
/* 579 */                           OI1Oo1O oI1Oo1O = new OI1Oo1O(bundleArr[i11]);
/* 582 */                           o00io0IiOOo0 o00io0iiooo0 = oI1Oo1O.I00000oIO;
/* 587 */                           OI1ilOI1ioo0 oI1ilOI1ioo0I0000Il00O = oI1i0llli.I0000Il00O(o00io0iiooo0.I00iiI, null);
/* 591 */                           if (oI1ilOI1ioo0I0000Il00O == null) {
/* 656 */                               int i14 = OI1ilOI1ioo0.I00ilI0I1;
/* 668 */                               StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Restoring the Navigation back stack failed: destination ", l1iO11O10.I00000oIO(i1O0ol, o00io0iiooo0.I00iiI), " cannot be found from the current destination ");
/* 676 */                               sbI001IIilI0O.append(oI1i0llli.I0001Ioi1lo());
/* 686 */                               throw new IllegalStateException(sbI001IIilI0O.toString());
                                    }
/* 599 */                           OI1OloOIO1O oI1OloOIO1OI00000oIO = oI1Oo1O.I00000oIO(i1O0ol, oI1ilOI1ioo0I0000Il00O, oI1i0llli.I000O01llI0(), oI1i0llli.I000oI1ioi);
/* 605 */                           OII1Il1IlOO oII1Il1IlOOI00000oOI = oII1IlOi02.I00000oOI(oI1ilOI1ioo0I0000Il00O.I00iOIl);
/* 609 */                           Object obj9 = linkedHashMap.get(oII1Il1IlOOI00000oOI);
                                    Object obj10 = obj9;
/* 613 */                           if (obj9 == null) {
/* 615 */                               OI1Ooo oI1OooI00000oIO = oI1o1o1iO1l3.I00000oIO(oII1Il1IlOOI00000oOI);
/* 619 */                               linkedHashMap.put(oII1Il1IlOOI00000oOI, oI1OooI00000oIO);
                                        obj10 = oI1OooI00000oIO;
                                    }
/* 624 */                           i1Il0loi.addLast(oI1OloOIO1OI00000oIO);
/* 627 */                           ((OI1Ooo) obj10).I00000oIO(oI1OloOIO1OI00000oIO);
/* 632 */                           OI1lo1liOO oI1lo1liOO7 = oI1OloOIO1OI00000oIO.I00iiI.I00iiO;
/* 634 */                           if (oI1lo1liOO7 != null) {
/* 644 */                               oI1i0llli.I000OiO(oI1OloOIO1OI00000oIO, oI1i0llli.I0000oI00(oI1lo1liOO7.I00iiI.I00000oOI));
                                    }
/* 647 */                           i11 = i13 + 1;
/* 653 */                           length2 = i12;
                                }
/* 689 */                       oI1i0llli.I00000oOI.invoke();
/* 693 */                       oI1i0llli.I0000oI00 = null;
                            }
/* 701 */                   Collection collectionValues = O1Oii0O0loo.I000iOII(oII1IlOi02.I00000oIO).values();
/* 709 */                   ArrayList arrayList2 = new ArrayList();
/* 720 */                   for (Object obj11 : collectionValues) {
/* 731 */                       if (!((OII1Il1IlOO) obj11).I00000oOI) {
/* 733 */                           arrayList2.add(obj11);
                                }
                            }
/* 737 */                   Iterator it8 = arrayList2.iterator();
/* 745 */                   while (it8.hasNext()) {
/* 751 */                       OII1Il1IlOO oII1Il1IlOO = (OII1Il1IlOO) it8.next();
/* 753 */                       Object objI00000oIO = linkedHashMap.get(oII1Il1IlOO);
/* 757 */                       if (objI00000oIO == null) {
/* 759 */                           objI00000oIO = oI1o1o1iO1l3.I00000oIO(oII1Il1IlOO);
/* 763 */                           linkedHashMap.put(oII1Il1IlOO, objI00000oIO);
                                }
/* 768 */                       oII1Il1IlOO.I00000oIO = (OI1Ooo) objI00000oIO;
/* 771 */                       oII1Il1IlOO.I00000oOI = true;
                            }
/* 776 */                   if (oI1i0llli.I0000Il00O == null || !i1Il0loi.isEmpty()) {
/* 1463 */                      oII1IlOi0 = oII1IlOi02;
/* 1465 */                      iOl00O1iI1Oo = null;
/* 1466 */                      oI1i0llli.I00000oOI();
                            } else {
/* 784 */                       Activity activity = oI1o1o1iO1l3.I0000O;
/* 788 */                       if (oI1o1o1iO1l3.I0000oI00 || activity == null || (intent = activity.getIntent()) == null) {
/* 1454 */                          oII1IlOi0 = oII1IlOi02;
                                } else {
/* 800 */                           Bundle extras = intent.getExtras();
/* 806 */                           if (extras != null) {
                                        try {
/* 810 */                                   intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                        } catch (Exception e) {
/* 830 */                                   Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                        }
/* 846 */                               ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
/* 857 */                               Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 870 */                               bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
/* 871 */                               if (bundle != null) {
/* 873 */                                   bundleI00000oIO.putAll(bundle);
                                        }
/* 876 */                               if (intArray != null || intArray.length == 0) {
/* 887 */                                   OI1lo1liOO oI1lo1liOOI000OOo1O = oI1i0llli2.I000OOo1O();
/* 893 */                                   iArr = intArray;
/* 895 */                                   Uri data = intent.getData();
/* 899 */                                   String action = intent.getAction();
/* 903 */                                   String type = intent.getType();
/* 907 */                                   oII1IlOi0 = oII1IlOi02;
/* 911 */                                   IOO000ilo iOO000ilo = new IOO000ilo(21);
/* 914 */                                   iOO000ilo.I00iiI = data;
/* 916 */                                   iOO000ilo.I00iiO = action;
/* 918 */                                   iOO000ilo.I00iio = type;
/* 920 */                                   VarHandle.storeStoreFence();
/* 923 */                                   oI1il00IOOI000iOII = oI1lo1liOOI000OOo1O.I000iOII(iOO000ilo, oI1lo1liOOI000OOo1O);
/* 927 */                                   if (oI1il00IOOI000iOII == null) {
/* 929 */                                       OI1ilOI1ioo0 oI1ilOI1ioo03 = oI1il00IOOI000iOII.I00iOIl;
/* 932 */                                       int[] iArrI0000O = oI1ilOI1ioo03.I0000O(null);
/* 938 */                                       Bundle bundleI00000oOI = oI1ilOI1ioo03.I00000oOI(oI1il00IOOI000iOII.I00iiI);
/* 942 */                                       if (bundleI00000oOI != null) {
/* 944 */                                           bundleI00000oIO.putAll(bundleI00000oOI);
                                                }
/* 947 */                                       iArr2 = iArrI0000O;
/* 948 */                                       arrayList = null;
                                            }
/* 954 */                                   if (iArr2 != null && iArr2.length != 0) {
/* 961 */                                       OI1lo1liOO oI1lo1liOO8 = oI1i0llli2.I0000Il00O;
/* 963 */                                       length = iArr2.length;
/* 964 */                                       i4 = 0;
                                                while (true) {
/* 965 */                                           if (i4 < length) {
/* 1048 */                                              strI00000oIO = null;
                                                        break;
                                                    }
/* 967 */                                           int i15 = iArr2[i4];
/* 969 */                                           if (i4 == 0) {
/* 971 */                                               i5 = length;
/* 973 */                                               oI1ilOI1ioo0I000II = oI1i0llli2.I0000Il00O;
/* 979 */                                               if (oI1ilOI1ioo0I000II.I00iiI.I00000oOI != i15) {
/* 982 */                                                   oI1ilOI1ioo0I000II = null;
                                                        }
                                                    } else {
/* 984 */                                               i5 = length;
/* 988 */                                               oI1ilOI1ioo0I000II = oI1lo1liOO8.I00ilO0.I000II(i15);
                                                    }
/* 992 */                                           if (oI1ilOI1ioo0I000II == null) {
/* 994 */                                               int i16 = OI1ilOI1ioo0.I00ilI0I1;
/* 1000 */                                              strI00000oIO = l1iO11O10.I00000oIO(oI1i0llli2.I00000oIO.I0000Il00O, i15);
                                                        break;
                                                    }
/* 1010 */                                          if (i4 != iArr2.length - 1 && (oI1ilOI1ioo0I000II instanceof OI1lo1liOO)) {
                                                        while (true) {
/* 1016 */                                                  oI1lo1liOO5 = (OI1lo1liOO) oI1ilOI1ioo0I000II;
/* 1018 */                                                  I0oiil10Ili i0oiil10Ili2 = oI1lo1liOO5.I00ilO0;
/* 1028 */                                                  if (!(i0oiil10Ili2.I000II(i0oiil10Ili2.I00iiI) instanceof OI1lo1liOO)) {
                                                                break;
                                                            } else {
/* 1032 */                                                      oI1ilOI1ioo0I000II = i0oiil10Ili2.I000II(i0oiil10Ili2.I00iiI);
                                                            }
                                                        }
/* 1040 */                                              oI1lo1liOO8 = oI1lo1liOO5;
                                                    }
/* 1041 */                                          i4++;
/* 1045 */                                          length = i5;
                                                }
/* 1049 */                                      if (strI00000oIO == null) {
/* 1073 */                                          Log.i("NavController", "Could not find destination " + strI00000oIO + " in the navigation graph, ignoring the deep link from " + intent);
                                                } else {
/* 1080 */                                          bundleI00000oIO.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
/* 1083 */                                          int length3 = iArr2.length;
/* 1084 */                                          Bundle[] bundleArr2 = new Bundle[length3];
/* 1087 */                                          for (int i17 = 0; i17 < length3; i17++) {
/* 1098 */                                              Bundle bundleI00000oIO2 = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 1102 */                                              bundleI00000oIO2.putAll(bundleI00000oIO);
/* 1105 */                                              if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i17)) != null) {
/* 1115 */                                                  bundleI00000oIO2.putAll(bundle2);
                                                        }
/* 1118 */                                              bundleArr2[i17] = bundleI00000oIO2;
                                                    }
/* 1123 */                                          int flags = intent.getFlags();
/* 1129 */                                          int i18 = 268435456 & flags;
/* 1130 */                                          if (i18 != 0 && (flags & 32768) == 0) {
/* 1138 */                                              intent.addFlags(32768);
/* 1143 */                                              OlIOI10i1 olIOI10i1I0000O = OlIOI10i1.I0000O(oI1o1o1iO1l3.I00000oIO);
/* 1147 */                                              ComponentName component = intent.getComponent();
/* 1151 */                                              if (component == null) {
/* 1161 */                                                  component = intent.resolveActivity(((Context) olIOI10i1I0000O.I00iiO).getPackageManager());
                                                        }
/* 1165 */                                              if (component != null) {
/* 1167 */                                                  olIOI10i1I0000O.I00000oOI(component);
                                                        }
/* 1174 */                                              ((ArrayList) olIOI10i1I0000O.I00iiI).add(intent);
/* 1177 */                                              olIOI10i1I0000O.I0000oI00();
/* 1180 */                                              activity.finish();
/* 1184 */                                              activity.overridePendingTransition(0, 0);
                                                    } else if (i18 != 0) {
/* 1204 */                                              if (!oI1i0llli2.I0001Ioi1lo.isEmpty()) {
/* 1214 */                                                  oI1i0llli2.I000l1(oI1i0llli2.I0000Il00O.I00iiI.I00000oOI, true, false);
                                                        }
/* 1217 */                                              int i19 = 0;
/* 1219 */                                              while (i19 < iArr2.length) {
/* 1221 */                                                  int i20 = iArr2[i19];
/* 1223 */                                                  int i21 = i19 + 1;
/* 1225 */                                                  Bundle bundle4 = bundleArr2[i19];
/* 1228 */                                                  OI1ilOI1ioo0 oI1ilOI1ioo0I0000Il00O2 = oI1i0llli2.I0000Il00O(i20, null);
/* 1232 */                                                  if (oI1ilOI1ioo0I0000Il00O2 == null) {
/* 1309 */                                                      int i22 = OI1ilOI1ioo0.I00ilI0I1;
/* 1317 */                                                      StringBuilder sbI001IIilI0O2 = IIlIOloOOO.I001IIilI0O("Deep Linking failed: destination ", l1iO11O10.I00000oIO(i1O0ol, i20), " cannot be found from the current destination ");
/* 1325 */                                                      sbI001IIilI0O2.append(oI1i0llli2.I0001Ioi1lo());
/* 1335 */                                                      throw new IllegalStateException(sbI001IIilI0O2.toString());
                                                            }
/* 1238 */                                                  O1lIIi o1lIIi = new O1lIIi(8);
/* 1241 */                                                  o1lIIi.I00iiI = oI1ilOI1ioo0I0000Il00O2;
/* 1243 */                                                  o1lIIi.I00iiO = oI1o1o1iO1l3;
/* 1245 */                                                  VarHandle.storeStoreFence();
/* 1250 */                                                  OII000iIloI0 oII000iIloI0 = new OII000iIloI0();
/* 1257 */                                                  IIOOoI iIOOoI = new IIOOoI(2, (byte) 0);
/* 1261 */                                                  iIOOoI.I00000oOI = -1;
/* 1263 */                                                  iIOOoI.I0000Il00O = -1;
/* 1265 */                                                  oII000iIloI0.I00000oIO = iIOOoI;
/* 1267 */                                                  oII000iIloI0.I00000oOI = -1;
/* 1269 */                                                  VarHandle.storeStoreFence();
/* 1272 */                                                  o1lIIi.invoke(oII000iIloI0);
/* 1304 */                                                  oI1i0llli2.I000iOII(oI1ilOI1ioo0I0000Il00O2, bundle4, new OI1oooI(false, false, oII000iIloI0.I00000oOI, false, oII000iIloI0.I0000Il00O, iIOOoI.I00000oOI, iIOOoI.I0000Il00O));
/* 1307 */                                                  i19 = i21;
                                                        }
/* 1337 */                                              oI1o1o1iO1l3.I0000oI00 = true;
                                                    } else {
/* 1341 */                                              OI1lo1liOO oI1lo1liOO9 = oI1i0llli2.I0000Il00O;
/* 1343 */                                              int length4 = iArr2.length;
/* 1344 */                                              int i23 = 0;
/* 1345 */                                              while (i23 < length4) {
/* 1347 */                                                  int i24 = iArr2[i23];
/* 1349 */                                                  Bundle bundle5 = bundleArr2[i23];
/* 1358 */                                                  OI1ilOI1ioo0 oI1ilOI1ioo0I000II3 = i23 == 0 ? oI1i0llli2.I0000Il00O : oI1lo1liOO9.I00ilO0.I000II(i24);
/* 1362 */                                                  if (oI1ilOI1ioo0I000II3 == null) {
/* 1434 */                                                      int i25 = OI1ilOI1ioo0.I00ilI0I1;
/* 1442 */                                                      IoOOl0iOl1io.I0010o("Deep Linking failed: destination ", l1iO11O10.I00000oIO(i1O0ol, i24), " cannot be found in graph ", oI1lo1liOO9);
/* 1445 */                                                      return;
                                                            }
/* 1369 */                                                  if (i23 == iArr2.length - 1) {
/* 1428 */                                                      oI1i0llli2.I000iOII(oI1ilOI1ioo0I000II3, bundle5, new OI1oooI(false, false, oI1i0llli2.I0000Il00O.I00iiI.I00000oOI, true, false, 0, 0));
                                                            } else if (oI1ilOI1ioo0I000II3 instanceof OI1lo1liOO) {
                                                                while (true) {
/* 1375 */                                                          oI1lo1liOO4 = (OI1lo1liOO) oI1ilOI1ioo0I000II3;
/* 1377 */                                                          I0oiil10Ili i0oiil10Ili3 = oI1lo1liOO4.I00ilO0;
/* 1387 */                                                          if (!(i0oiil10Ili3.I000II(i0oiil10Ili3.I00iiI) instanceof OI1lo1liOO)) {
                                                                        break;
                                                                    } else {
/* 1391 */                                                              oI1ilOI1ioo0I000II3 = i0oiil10Ili3.I000II(i0oiil10Ili3.I00iiI);
                                                                    }
                                                                }
/* 1399 */                                                      oI1lo1liOO9 = oI1lo1liOO4;
                                                            }
/* 1431 */                                                  i23++;
                                                        }
/* 1447 */                                              oI1o1o1iO1l3.I0000oI00 = true;
                                                    }
/* 1449 */                                          oI1lo1liOO2 = oI1lo1liOO;
/* 1451 */                                          iOl00O1iI1Oo = null;
/* 1651 */                                          OII1Il1IlOO oII1Il1IlOOI00000oOI2 = oII1IlOi0.I00000oOI("composable");
/* 1663 */                                          iOl00O1iI1Oo2 = !(oII1Il1IlOOI00000oOI2 instanceof IOl00O1iI1Oo) ? (IOl00O1iI1Oo) oII1Il1IlOOI00000oOI2 : iOl00O1iI1Oo;
/* 1664 */                                          if (iOl00O1iI1Oo2 != null) {
/* 1666 */                                              OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1670 */                                              if (oOloioIlI001IO000 != null) {
/* 1675 */                                                  OI1oi0O1ioI0 oI1oi0O1ioI0 = new OI1oi0O1ioI0(2);
/* 1680 */                                                  oI1oi0O1ioI0.I00iiI = oI1o1o1iO1l;
/* 1682 */                                                  oI1oi0O1ioI0.I00iiO = oI1lo1liOO2;
/* 1686 */                                                  oI1oi0O1ioI0.I00iio = o1ooiI111i;
/* 1690 */                                                  oI1oi0O1ioI0.I00ilI0I1 = i0iolI1I11l1;
/* 1694 */                                                  oI1oi0O1ioI0.I00ilO0 = function1;
/* 1698 */                                                  oI1oi0O1ioI0.I00io1l = function12;
/* 1702 */                                                  oI1oi0O1ioI0.I00ioIO = function13;
/* 1706 */                                                  oI1oi0O1ioI0.I00l0I0l0lO1 = function14;
/* 1710 */                                                  oI1oi0O1ioI0.I00l0OO0IO = i;
/* 1712 */                                                  VarHandle.storeStoreFence();
/* 1715 */                                                  oOloioIlI001IO000.I0000O = oI1oi0O1ioI0;
/* 2727 */                                                  return;
                                                        }
/* 2727 */                                              return;
                                                    }
/* 1719 */                                          oI1o1o1iO1l2 = oI1o1o1iO1l;
/* 1743 */                                          OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(iOl00O1iI1Oo2.I00000oOI().I0000oI00, iloI0lOlll1);
/* 1747 */                                          Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 1751 */                                          Object obj12 = IOl11li.I00000oIO;
                                                    Object obj13 = objI00O0i0ii;
/* 1753 */                                          if (objI00O0i0ii == obj12) {
/* 1758 */                                              Object oIooO1iiliI2 = new OIooO1iiliI(0.0f);
/* 1761 */                                              iloI0lOlll1.I00iio(oIooO1iiliI2);
                                                        obj13 = oIooO1iiliI2;
                                                    }
/* 1764 */                                          OIooO1iiliI oIooO1iiliI3 = (OIooO1iiliI) obj13;
/* 1766 */                                          Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                                    Object obj14 = objI00O0i0ii2;
/* 1770 */                                          if (objI00O0i0ii2 == obj12) {
/* 1774 */                                              Object objI00000oIO2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 1778 */                                              iloI0lOlll1.I00iio(objI00000oIO2);
                                                        obj14 = objI00000oIO2;
                                                    }
/* 1781 */                                          OI10i0Il oI10i0Il2 = (OI10i0Il) obj14;
/* 1798 */                                          boolean z3 = ((List) oI10i0IlI00000oOI.getValue()).size() > 1;
/* 1807 */                                          boolean zI000II = iloI0lOlll1.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000OOo1O(iOl00O1iI1Oo2);
/* 1811 */                                          Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 1815 */                                          if (zI000II || objI00O0i0ii3 == obj12) {
/* 1836 */                                              z = z3;
/* 1837 */                                              iOl00O1iI1Oo3 = iOl00O1iI1Oo2;
/* 1842 */                                              function15 = function14;
/* 1844 */                                              IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 1846 */                                              obj2 = obj12;
/* 1847 */                                              oIooO1iiliI = oIooO1iiliI3;
/* 1848 */                                              oI10i0Il = oI10i0Il2;
/* 1849 */                                              obj3 = oI10i0IlI00000oOI;
/* 1851 */                                              function16 = function13;
/* 1853 */                                              i000oI1ioi = new I000oI1ioi(iOl00O1iI1Oo3, obj3, oIooO1iiliI, oI10i0Il, (IOoil1iiIilo) null, 14);
/* 1856 */                                              iloI0lOlll15.I00iio(i000oI1ioi);
                                                        iloI0lOlll12 = iloI0lOlll15;
                                                    } else {
/* 1820 */                                              function15 = function14;
/* 1822 */                                              iloI0lOlll12 = iloI0lOlll1;
/* 1823 */                                              oIooO1iiliI = oIooO1iiliI3;
/* 1824 */                                              obj2 = obj12;
/* 1825 */                                              oI10i0Il = oI10i0Il2;
/* 1826 */                                              obj3 = oI10i0IlI00000oOI;
/* 1828 */                                              function16 = function13;
/* 1830 */                                              i000oI1ioi = objI00O0i0ii3;
/* 1831 */                                              z = z3;
/* 1832 */                                              iOl00O1iI1Oo3 = iOl00O1iI1Oo2;
                                                    }
/* 1862 */                                          l1iIiil0Oio.I00000oIO(z, (IlliIl1l11O) i000oI1ioi, iloI0lOlll12, 0);
/* 1869 */                                          Object obj15 = obj;
/* 1875 */                                          boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(oI1o1o1iO1l2) | iloI0lOlll12.I000OOo1O(obj15);
/* 1876 */                                          Object objI00O0i0ii4 = iloI0lOlll12.I00O0i0ii();
                                                    Object obj16 = objI00O0i0ii4;
/* 1880 */                                          if (zI000OOo1O || objI00O0i0ii4 == obj2) {
/* 1888 */                                              O1lIIi o1lIIi2 = new O1lIIi(10);
/* 1891 */                                              o1lIIi2.I00iiO = oI1o1o1iO1l2;
/* 1893 */                                              o1lIIi2.I00iiI = obj15;
/* 1895 */                                              VarHandle.storeStoreFence();
/* 1898 */                                              iloI0lOlll12.I00iio(o1lIIi2);
                                                        obj16 = o1lIIi2;
                                                    }
/* 1903 */                                          iIO0iiOiOl0l.I00000oOI(obj15, (Function1) obj16, iloI0lOlll12);
/* 1906 */                                          OiIil1il oiIil1ilI00000oIO = lO0OOOO0.I00000oIO(iloI0lOlll12);
/* 1912 */                                          OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(oI1i0llli.I000OOo1O, iloI0lOlll12);
/* 1916 */                                          Object objI00O0i0ii5 = iloI0lOlll12.I00O0i0ii();
                                                    Object obj17 = objI00O0i0ii5;
/* 1920 */                                          if (objI00O0i0ii5 == obj2) {
/* 1925 */                                              OI1oil oI1oil = new OI1oil(0);
/* 1928 */                                              oI1oil.I00iiI = oI10i0IlI00000oOI2;
/* 1930 */                                              VarHandle.storeStoreFence();
/* 1933 */                                              Object objI00000oOI = Ol1llolil.I00000oOI(oI1oil);
/* 1937 */                                              iloI0lOlll12.I00iio(objI00000oOI);
                                                        obj17 = objI00000oOI;
                                                    }
/* 1940 */                                          OlO01l1oOil olO01l1oOil = (OlO01l1oOil) obj17;
/* 1952 */                                          Object obj18 = (OI1OloOIO1O) IOOi0Ool1i.I00IoIO0lI((List) olO01l1oOil.getValue());
/* 1954 */                                          Object objI00O0i0ii6 = iloI0lOlll12.I00O0i0ii();
                                                    Object obj19 = objI00O0i0ii6;
/* 1958 */                                          if (objI00O0i0ii6 == obj2) {
/* 1960 */                                              int i26 = OIOi1III0.I00000oIO;
/* 1965 */                                              Object oI0o0olO1 = new OI0o0olO1(6);
/* 1968 */                                              iloI0lOlll12.I00iio(oI0o0olO1);
                                                        obj19 = oI0o0olO1;
                                                    }
/* 1971 */                                          Object obj20 = (OI0o0olO1) obj19;
/* 1973 */                                          if (obj18 != null) {
/* 1978 */                                              iloI0lOlll12.I00i01iIIliI(-1797563167);
/* 1989 */                                              OIooO1iiliI oIooO1iiliI4 = oIooO1iiliI;
/* 2028 */                                              boolean zI000OOo1O2 = iloI0lOlll12.I000OOo1O(iOl00O1iI1Oo3) | ((((i8 & 3670016) ^ 1572864) > 1048576 && iloI0lOlll12.I000II(function16)) || (i8 & 1572864) == 1048576) | ((i8 & 57344) == 16384);
/* 2030 */                                              Object objI00O0i0ii7 = iloI0lOlll12.I00O0i0ii();
                                                        Object obj21 = objI00O0i0ii7;
/* 2034 */                                              if (zI000OOo1O2 || objI00O0i0ii7 == obj2) {
/* 2041 */                                                  OI1oilIllo0 oI1oilIllo0 = new OI1oilIllo0(0);
/* 2044 */                                                  oI1oilIllo0.I00iiI = iOl00O1iI1Oo3;
/* 2046 */                                                  oI1oilIllo0.I00iiO = function16;
/* 2048 */                                                  oI1oilIllo0.I00iio = function1;
/* 2050 */                                                  oI1oilIllo0.I00ilI0I1 = oI10i0Il;
/* 2052 */                                                  VarHandle.storeStoreFence();
/* 2055 */                                                  iloI0lOlll12.I00iio(oI1oilIllo0);
                                                            obj21 = oI1oilIllo0;
                                                        }
/* 2058 */                                              Object obj22 = (Function1) obj21;
/* 2104 */                                              boolean zI000OOo1O3 = iloI0lOlll12.I000OOo1O(iOl00O1iI1Oo3) | ((((i8 & 29360128) ^ 12582912) > 8388608 && iloI0lOlll12.I000II(function15)) || (i8 & 12582912) == 8388608) | ((i8 & 458752) == 131072);
/* 2106 */                                              Object objI00O0i0ii8 = iloI0lOlll12.I00O0i0ii();
/* 2110 */                                              if (zI000OOo1O3 || objI00O0i0ii8 == obj2) {
/* 2120 */                                                  OI1oilIllo0 oI1oilIllo02 = new OI1oilIllo0(1);
/* 2123 */                                                  oI1oilIllo02.I00iiI = iOl00O1iI1Oo3;
/* 2125 */                                                  oI1oilIllo02.I00iiO = function15;
/* 2127 */                                                  oI1oilIllo02.I00iio = function12;
/* 2129 */                                                  oI1oilIllo02.I00ilI0I1 = oI10i0Il;
/* 2131 */                                                  VarHandle.storeStoreFence();
/* 2134 */                                                  iloI0lOlll12.I00iio(oI1oilIllo02);
                                                            obj4 = oI1oilIllo02;
                                                        } else {
                                                            obj4 = objI00O0i0ii8;
                                                        }
/* 2137 */                                              Object obj23 = (Function1) obj4;
/* 2149 */                                              boolean z4 = (i8 & 234881024) == 67108864;
/* 2150 */                                              Object objI00O0i0ii9 = iloI0lOlll12.I00O0i0ii();
                                                        Object obj24 = objI00O0i0ii9;
/* 2154 */                                              if (z4 || objI00O0i0ii9 == obj2) {
/* 2161 */                                                  Object oI1lOo = new OI1lOo(3);
/* 2164 */                                                  VarHandle.storeStoreFence();
/* 2167 */                                                  iloI0lOlll12.I00iio(oI1lOo);
                                                            obj24 = oI1lOo;
                                                        }
/* 2170 */                                              Function1 function111 = (Function1) obj24;
/* 2172 */                                              Boolean bool = Boolean.TRUE;
/* 2174 */                                              boolean zI000OOo1O4 = iloI0lOlll12.I000OOo1O(iOl00O1iI1Oo3);
/* 2178 */                                              Object objI00O0i0ii10 = iloI0lOlll12.I00O0i0ii();
                                                        Object obj25 = objI00O0i0ii10;
/* 2182 */                                              if (zI000OOo1O4 || objI00O0i0ii10 == obj2) {
/* 2190 */                                                  O1lIIi o1lIIi3 = new O1lIIi(9);
/* 2193 */                                                  o1lIIi3.I00iiI = olO01l1oOil;
/* 2195 */                                                  o1lIIi3.I00iiO = iOl00O1iI1Oo3;
/* 2197 */                                                  VarHandle.storeStoreFence();
/* 2200 */                                                  iloI0lOlll12.I00iio(o1lIIi3);
                                                            obj25 = o1lIIi3;
                                                        }
/* 2205 */                                              iIO0iiOiOl0l.I00000oOI(bool, (Function1) obj25, iloI0lOlll12);
/* 2208 */                                              Object objI00O0i0ii11 = iloI0lOlll12.I00O0i0ii();
                                                        Object obj26 = objI00O0i0ii11;
/* 2212 */                                              if (objI00O0i0ii11 == obj2) {
/* 2216 */                                                  Object oii110oOoO = new Oii110oOoO(obj18);
/* 2219 */                                                  iloI0lOlll12.I00iio(oii110oOoO);
                                                            obj26 = oii110oOoO;
                                                        }
/* 2222 */                                              Oii110oOoO oii110oOoO2 = (Oii110oOoO) obj26;
/* 2229 */                                              OoI1Oi0l1I0o ooI1Oi0l1I0oI0000oI00 = iO1IIloiOoiO.I0000oI00(oii110oOoO2, "entry", iloI0lOlll12, 56, 0);
/* 2243 */                                              if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 2248 */                                                  iloI0lOlll12.I00i01iIIliI(-1795329152);
/* 2255 */                                                  Float fValueOf = Float.valueOf(oIooO1iiliI4.I000II());
/* 2267 */                                                  boolean zI000II2 = iloI0lOlll12.I000II(obj3) | iloI0lOlll12.I000OOo1O(oii110oOoO2);
/* 2269 */                                                  Object obj27 = obj3;
/* 2271 */                                                  Object objI00O0i0ii12 = iloI0lOlll12.I00O0i0ii();
/* 2275 */                                                  if (zI000II2 || objI00O0i0ii12 == obj2) {
/* 2291 */                                                      iii0iOoIo = null;
/* 2293 */                                                      objI00O0i0ii12 = new IiI110i1O(oii110oOoO2, obj27, oIooO1iiliI4, null, 28);
/* 2298 */                                                      iloI0lOlll12.I00iio(objI00O0i0ii12);
                                                            } else {
/* 2280 */                                                      iii0iOoIo = null;
                                                            }
/* 2303 */                                                  iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii12, iloI0lOlll12, fValueOf);
/* 2307 */                                                  iloI0lOlll12.I0010I0i(false);
/* 2310 */                                                  obj5 = obj18;
/* 2311 */                                                  ooI1Oi0l1I0o = ooI1Oi0l1I0oI0000oI00;
/* 2313 */                                                  z2 = false;
                                                        } else {
/* 2315 */                                                  iii0iOoIo = null;
/* 2315 */                                                  boolean z5 = false;
/* 2320 */                                                  iloI0lOlll12.I00i01iIIliI(-1794910745);
/* 2336 */                                                  boolean zI000OOo1O5 = iloI0lOlll12.I000OOo1O(oii110oOoO2) | iloI0lOlll12.I000OOo1O(obj18) | iloI0lOlll12.I000II(ooI1Oi0l1I0oI0000oI00);
/* 2337 */                                                  Object objI00O0i0ii13 = iloI0lOlll12.I00O0i0ii();
/* 2341 */                                                  if (zI000OOo1O5 || objI00O0i0ii13 == obj2) {
/* 2358 */                                                      ooI1Oi0l1I0o = ooI1Oi0l1I0oI0000oI00;
/* 2360 */                                                      objI00O0i0ii13 = new O1o1iI((Object) oii110oOoO2, obj18, (Object) ooI1Oi0l1I0o, (IOoil1iiIilo) (z5 ? 1 : 0), 4);
/* 2365 */                                                      obj5 = obj18;
/* 2367 */                                                      iloI0lOlll12.I00iio(objI00O0i0ii13);
                                                            } else {
/* 2346 */                                                      obj5 = obj18;
/* 2347 */                                                      ooI1Oi0l1I0o = ooI1Oi0l1I0oI0000oI00;
                                                            }
/* 2372 */                                                  iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii13, iloI0lOlll12, obj5);
/* 2375 */                                                  z2 = false;
/* 2376 */                                                  iloI0lOlll12.I0010I0i(false);
                                                        }
/* 2402 */                                              boolean zI000OOo1O6 = iloI0lOlll12.I000OOo1O(obj20) | iloI0lOlll12.I000OOo1O(iOl00O1iI1Oo3) | iloI0lOlll12.I000II(obj22) | iloI0lOlll12.I000II(obj23) | iloI0lOlll12.I000II(function111);
/* 2403 */                                              Object objI00O0i0ii14 = iloI0lOlll12.I00O0i0ii();
                                                        Object obj28 = objI00O0i0ii14;
/* 2407 */                                              if (zI000OOo1O6 || objI00O0i0ii14 == obj2) {
/* 2414 */                                                  I0O0loI1i i0O0loI1i = new I0O0loI1i(2);
/* 2417 */                                                  i0O0loI1i.I00iiO = obj20;
/* 2419 */                                                  i0O0loI1i.I00iio = iOl00O1iI1Oo3;
/* 2421 */                                                  i0O0loI1i.I00ilI0I1 = obj22;
/* 2423 */                                                  i0O0loI1i.I00ilO0 = obj23;
/* 2425 */                                                  i0O0loI1i.I00io1l = function111;
/* 2427 */                                                  i0O0loI1i.I00ioIO = olO01l1oOil;
/* 2429 */                                                  i0O0loI1i.I00iiI = oI10i0Il;
/* 2431 */                                                  VarHandle.storeStoreFence();
/* 2434 */                                                  iloI0lOlll12.I00iio(i0O0loI1i);
                                                            obj28 = i0O0loI1i;
                                                        }
/* 2438 */                                              Function1 function112 = (Function1) obj28;
/* 2440 */                                              Object objI00O0i0ii15 = iloI0lOlll12.I00O0i0ii();
/* 2444 */                                              if (objI00O0i0ii15 == obj2) {
/* 2448 */                                                  i3 = 4;
/* 2449 */                                                  Object oI1lOo2 = new OI1lOo(4);
/* 2452 */                                                  iloI0lOlll12.I00iio(oI1lOo2);
                                                            obj6 = oI1lOo2;
                                                        } else {
/* 2456 */                                                  i3 = 4;
                                                            obj6 = objI00O0i0ii15;
                                                        }
/* 2461 */                                              Iloio01l0Il iloio01l0Il = new Iloio01l0Il(i3);
/* 2464 */                                              iloio01l0Il.I00iiI = oii110oOoO2;
/* 2466 */                                              iloio01l0Il.I00iiO = obj5;
/* 2468 */                                              iloio01l0Il.I00iio = oiIil1ilI00000oIO;
/* 2470 */                                              iloio01l0Il.I00ilI0I1 = oI10i0Il;
/* 2472 */                                              iloio01l0Il.I00ilO0 = olO01l1oOil;
/* 2474 */                                              VarHandle.storeStoreFence();
/* 2498 */                                              IloI0lOlll1 iloI0lOlll16 = iloI0lOlll12;
/* 2500 */                                              Object obj29 = obj2;
/* 2501 */                                              boolean z6 = z2;
/* 2502 */                                              OoI1Oi0l1I0o ooI1Oi0l1I0o2 = ooI1Oi0l1I0o;
/* 2506 */                                              o1ooiI111i2 = o1ooiI111i;
/* 2508 */                                              i0iolI1I11l12 = i0iolI1I11l1;
/* 2511 */                                              O1OIIoio0i1.I00000oIO(ooI1Oi0l1I0o2, o1ooiI111i2, function112, i0iolI1I11l12, (Function1) obj6, iiioOl1O.I00000oOI(820763100, iloio01l0Il, iloI0lOlll12), iloI0lOlll16, ((i8 >> 3) & 112) | 221184 | (i8 & 7168));
/* 2515 */                                              IloI0lOlll1 iloI0lOlll17 = iloI0lOlll16;
/* 2519 */                                              Object objI00olI = ooI1Oi0l1I0o2.I00000oIO.I00olI();
/* 2525 */                                              Object value = ooI1Oi0l1I0o2.I0000O.getValue();
/* 2533 */                                              oI1o1o1iO1l2 = oI1o1o1iO1l;
/* 2554 */                                              boolean zI000II3 = iloI0lOlll17.I000II(ooI1Oi0l1I0o2) | iloI0lOlll17.I000OOo1O(oI1o1o1iO1l2) | iloI0lOlll17.I000OOo1O(obj5) | iloI0lOlll17.I000OOo1O(iOl00O1iI1Oo3) | iloI0lOlll17.I000OOo1O(obj20);
/* 2555 */                                              Object objI00O0i0ii16 = iloI0lOlll17.I00O0i0ii();
/* 2559 */                                              if (zI000II3 || objI00O0i0ii16 == obj29) {
/* 2572 */                                                  function17 = function1;
/* 2578 */                                                  Object ilo1I0li1Ol = new Ilo1I0li1Ol(ooI1Oi0l1I0o2, oI1o1o1iO1l, obj5, obj20, olO01l1oOil, iOl00O1iI1Oo3, null, 2);
/* 2581 */                                                  oI1o1o1iO1l2 = oI1o1o1iO1l;
/* 2582 */                                                  iloI0lOlll17.I00iio(ilo1I0li1Ol);
/* 2585 */                                                  objI00O0i0ii16 = ilo1I0li1Ol;
                                                        } else {
/* 2564 */                                                  function17 = function1;
                                                        }
/* 2588 */                                              iIO0iiOiOl0l.I0000oI00(objI00olI, value, (IlliIl1l11O) objI00O0i0ii16, iloI0lOlll17);
/* 2591 */                                              iloI0lOlll17.I0010I0i(z6);
                                                        i2 = z6;
                                                        iloI0lOlll13 = iloI0lOlll17;
                                                    } else {
/* 2595 */                                              i0iolI1I11l12 = i0iolI1I11l1;
/* 2597 */                                              IloI0lOlll1 iloI0lOlll18 = iloI0lOlll12;
/* 2598 */                                              function17 = function1;
/* 2599 */                                              i2 = 0;
/* 2600 */                                              iii0iOoIo = null;
/* 2602 */                                              o1ooiI111i2 = o1ooiI111i;
/* 2607 */                                              iloI0lOlll18.I00i01iIIliI(-1789758886);
/* 2610 */                                              iloI0lOlll18.I0010I0i(false);
                                                        iloI0lOlll13 = iloI0lOlll18;
                                                    }
/* 2619 */                                          OII1Il1IlOO oII1Il1IlOOI00000oOI3 = oI1o1o1iO1l2.I00000oOI.I0010o.I00000oOI("dialog");
/* 2630 */                                          Iii0iOoIo iii0iOoIo2 = oII1Il1IlOOI00000oOI3 instanceof Iii0iOoIo ? (Iii0iOoIo) oII1Il1IlOOI00000oOI3 : iii0iOoIo;
/* 2632 */                                          if (iii0iOoIo2 == null) {
/* 2634 */                                              OOloioIl oOloioIlI001IO0002 = iloI0lOlll13.I001IO000();
/* 2638 */                                              if (oOloioIlI001IO0002 != null) {
/* 2642 */                                                  OI1oi0O1ioI0 oI1oi0O1ioI02 = new OI1oi0O1ioI0(i2);
/* 2645 */                                                  oI1oi0O1ioI02.I00iiI = oI1o1o1iO1l2;
/* 2649 */                                                  oI1oi0O1ioI02.I00iiO = oI1lo1liOO;
/* 2651 */                                                  oI1oi0O1ioI02.I00iio = o1ooiI111i2;
/* 2653 */                                                  oI1oi0O1ioI02.I00ilI0I1 = i0iolI1I11l12;
/* 2655 */                                                  oI1oi0O1ioI02.I00ilO0 = function17;
/* 2659 */                                                  oI1oi0O1ioI02.I00io1l = function12;
/* 2663 */                                                  oI1oi0O1ioI02.I00ioIO = function13;
/* 2667 */                                                  oI1oi0O1ioI02.I00l0I0l0lO1 = function14;
/* 2671 */                                                  oI1oi0O1ioI02.I00l0OO0IO = i;
/* 2673 */                                                  VarHandle.storeStoreFence();
/* 2676 */                                                  oOloioIlI001IO0002.I0000O = oI1oi0O1ioI02;
/* 2727 */                                                  return;
                                                        }
/* 2727 */                                              return;
                                                    }
/* 2679 */                                          oI1lo1liOO3 = oI1lo1liOO;
/* 2681 */                                          function19 = function12;
/* 2683 */                                          function18 = function13;
/* 2685 */                                          function110 = function14;
/* 2687 */                                          i6 = i;
/* 2689 */                                          il1OO11i1O1.I00000oIO(iii0iOoIo2, iloI0lOlll13, i2);
                                                    iloI0lOlll14 = iloI0lOlll13;
                                                }
                                            }
                                        } else {
/* 882 */                                   iArr = intArray;
/* 884 */                                   oII1IlOi0 = oII1IlOi02;
                                        }
/* 950 */                               arrayList = parcelableArrayList;
/* 952 */                               iArr2 = iArr;
/* 954 */                               if (iArr2 != null) {
/* 961 */                                   OI1lo1liOO oI1lo1liOO82 = oI1i0llli2.I0000Il00O;
/* 963 */                                   length = iArr2.length;
/* 964 */                                   i4 = 0;
                                            while (true) {
/* 965 */                                       if (i4 < length) {
                                                }
/* 1041 */                                      i4++;
/* 1045 */                                      length = i5;
                                            }
/* 1049 */                                  if (strI00000oIO == null) {
                                            }
                                        }
                                    } else {
/* 833 */                               intArray = null;
/* 846 */                               if (extras == null) {
                                        }
/* 857 */                               Bundle bundleI00000oIO3 = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 870 */                               if (extras == null) {
                                        }
/* 871 */                               if (bundle != null) {
                                        }
/* 876 */                               if (intArray != null) {
/* 887 */                                   OI1lo1liOO oI1lo1liOOI000OOo1O2 = oI1i0llli2.I000OOo1O();
/* 893 */                                   iArr = intArray;
/* 895 */                                   Uri data2 = intent.getData();
/* 899 */                                   String action2 = intent.getAction();
/* 903 */                                   String type2 = intent.getType();
/* 907 */                                   oII1IlOi0 = oII1IlOi02;
/* 911 */                                   IOO000ilo iOO000ilo2 = new IOO000ilo(21);
/* 914 */                                   iOO000ilo2.I00iiI = data2;
/* 916 */                                   iOO000ilo2.I00iiO = action2;
/* 918 */                                   iOO000ilo2.I00iio = type2;
/* 920 */                                   VarHandle.storeStoreFence();
/* 923 */                                   oI1il00IOOI000iOII = oI1lo1liOOI000OOo1O2.I000iOII(iOO000ilo2, oI1lo1liOOI000OOo1O2);
/* 927 */                                   if (oI1il00IOOI000iOII == null) {
/* 950 */                                       arrayList = parcelableArrayList;
/* 952 */                                       iArr2 = iArr;
                                            }
/* 954 */                                   if (iArr2 != null) {
                                            }
                                        }
                                    }
                                }
/* 1458 */                      iOl00O1iI1Oo = null;
/* 1459 */                      oI1i0llli.I000iOII(oI1i0llli.I0000Il00O, null, null);
                            }
                        }
/* 1469 */              oI1lo1liOO2 = oI1lo1liOO;
/* 1651 */              OII1Il1IlOO oII1Il1IlOOI00000oOI22 = oII1IlOi0.I00000oOI("composable");
/* 1663 */              if (!(oII1Il1IlOOI00000oOI22 instanceof IOl00O1iI1Oo)) {
                        }
/* 1664 */              if (iOl00O1iI1Oo2 != null) {
                        }
                    }
/* 2692 */          OOloioIl oOloioIlI001IO0003 = iloI0lOlll14.I001IO000();
/* 2696 */          if (oOloioIlI001IO0003 != null) {
/* 2701 */              OI1oi0O1ioI0 oI1oi0O1ioI03 = new OI1oi0O1ioI0(1);
/* 2704 */              oI1oi0O1ioI03.I00iiI = oI1o1o1iO1l2;
/* 2706 */              oI1oi0O1ioI03.I00iiO = oI1lo1liOO3;
/* 2708 */              oI1oi0O1ioI03.I00iio = o1ooiI111i2;
/* 2710 */              oI1oi0O1ioI03.I00ilI0I1 = i0iolI1I11l12;
/* 2712 */              oI1oi0O1ioI03.I00ilO0 = function17;
/* 2714 */              oI1oi0O1ioI03.I00io1l = function19;
/* 2716 */              oI1oi0O1ioI03.I00ioIO = function18;
/* 2718 */              oI1oi0O1ioI03.I00l0I0l0lO1 = function110;
/* 2720 */              oI1oi0O1ioI03.I00l0OO0IO = i6;
/* 2722 */              VarHandle.storeStoreFence();
/* 2725 */              oOloioIlI001IO0003.I0000O = oI1oi0O1ioI03;
                    }
                }
            }

            package p000;

            import android.content.Context;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IoI0lol0i1i {
                public static final List I00000oIO;

                static {
/* 1 */             IO0l1oIIi1i iO0l1oIIi1i = IO0l10iol.I00000oIO;
/* 3 */             IO0l1oIIi1i iO0l1oIIi1i2 = IO0l10iol.I00000oIO;
/* 5 */             IO0l1oIIi1i iO0l1oIIi1i3 = IO0l10iol.I00000oIO;
/* 19 */            I00000oIO = IOOi1I.I000O01llI0("llm", "experimental");
                }

                public static final void I00000oIO(List list, int i, boolean z, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i2) {
                    O0o0I1i0O o0o0I1i0O;
                    IOO0o0I1l iOO0o0I1l;
                    Context context;
                    Ii0110 ii0110;
                    boolean z2;
                    float f;
                    float fI0000Il00O;
                    IloI0lOlll1 iloI0lOlll12;
/* 14 */            iloI0lOlll1.I00i0O(401103937);
/* 21 */            int i3 = 2;
/* 64 */            int i4 = i2 | (iloI0lOlll1.I000OOo1O(list) ? 4 : 2) | (iloI0lOlll1.I0000oI00(i) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 82 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 1171) != 1170)) {
/* 90 */                Context context2 = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 92 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 96 */                IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 98 */                if (objI00O0i0ii == iOO0o0I1l2) {
/* 100 */                   objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 104 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 107 */               Ii0110 ii01102 = (Ii0110) objI00O0i0ii;
/* 109 */               O0o0I1i0O o0o0I1i0OI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll1);
/* 113 */               if (z) {
/* 140 */                   iloI0lOlll1.I00i01iIIliI(-1086162286);
/* 160 */                   o0o0I1i0O = o0o0I1i0OI00000oIO;
/* 162 */                   IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 163 */                   iOO0o0I1l = iOO0o0I1l2;
/* 165 */                   context = context2;
/* 167 */                   ii0110 = ii01102;
/* 169 */                   z2 = false;
/* 171 */                   f = 1.0f;
/* 173 */                   fI0000Il00O = OollloolI.I0000Il00O(410L, 1200, "task card animation", iloI0lOlll13, 438);
/* 177 */                   iloI0lOlll13.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll13;
                        } else {
/* 118 */                   iloI0lOlll1.I00i01iIIliI(1754036445);
/* 121 */                   iloI0lOlll1.I0010I0i(false);
/* 124 */                   context = context2;
/* 125 */                   ii0110 = ii01102;
/* 127 */                   iOO0o0I1l = iOO0o0I1l2;
/* 128 */                   o0o0I1i0O = o0o0I1i0OI00000oIO;
/* 130 */                   iloI0lOlll12 = iloI0lOlll1;
/* 131 */                   fI0000Il00O = 1.0f;
/* 133 */                   f = 1.0f;
/* 135 */                   z2 = false;
                        }
/* 196 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, f), 0.0f, 0.0f, 0.0f, 32.0f, 7);
/* 200 */               boolean zI0000O = iloI0lOlll12.I0000O(fI0000Il00O);
/* 204 */               Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                        Object obj = objI00O0i0ii2;
/* 208 */               if (zI0000O || objI00O0i0ii2 == iOO0o0I1l) {
/* 214 */                   II1O10OOoOIi iI1O10OOoOIi = new II1O10OOoOIi(2);
/* 217 */                   iI1O10OOoOIi.I00iiI = fI0000Il00O;
/* 219 */                   VarHandle.storeStoreFence();
/* 222 */                   iloI0lOlll12.I00iio(iI1O10OOoOIi);
                            obj = iI1O10OOoOIi;
                        }
/* 227 */               O1ooiI111i o1ooiI111iI00000oIO = iIlll1lo.I00000oIO(o1ooiI111iI000OiO, (Function1) obj);
/* 233 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(16.0f);
/* 250 */               boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(list) | ((i4 & 112) == 32 ? true : z2);
/* 255 */               if ((i4 & 7168) == 2048) {
/* 257 */                   z2 = true;
                        }
/* 259 */               Ii0110 ii01103 = ii0110;
/* 266 */               O0o0I1i0O o0o0I1i0O2 = o0o0I1i0O;
/* 277 */               boolean zI000OOo1O2 = zI000OOo1O | z2 | iloI0lOlll12.I000OOo1O(ii01103) | iloI0lOlll12.I000II(o0o0I1i0O2) | iloI0lOlll12.I000OOo1O(context);
/* 278 */               Object objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
                        Object obj2 = objI00O0i0ii3;
/* 282 */               if (zI000OOo1O2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 288 */                   Io1oIli io1oIli = new Io1oIli();
/* 291 */                   io1oIli.I00iOIl = list;
/* 293 */                   io1oIli.I00iiI = i;
/* 295 */                   io1oIli.I00iiO = function1;
/* 297 */                   io1oIli.I00iio = ii01103;
/* 299 */                   io1oIli.I00ilI0I1 = o0o0I1i0O2;
/* 301 */                   io1oIli.I00ilO0 = context;
/* 303 */                   VarHandle.storeStoreFence();
/* 306 */                   iloI0lOlll12.I00iio(io1oIli);
                            obj2 = io1oIli;
                        }
/* 325 */               l0oIiiI1O0o.I00000oOI(o1ooiI111iI00000oIO, o0o0I1i0O2, null, i1IioII0000oI00, null, null, false, null, (Function1) obj2, iloI0lOlll1, 24576);
                    } else {
/* 329 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 332 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 336 */           if (oOloioIlI001IO000 != null) {
/* 340 */               I0oololOOll1 i0oololOOll1 = new I0oololOOll1(i3);
/* 343 */               i0oololOOll1.I00iio = list;
/* 345 */               i0oololOOll1.I00iiO = i;
/* 347 */               i0oololOOll1.I00iiI = z;
/* 349 */               i0oololOOll1.I00ilI0I1 = function1;
/* 351 */               VarHandle.storeStoreFence();
/* 354 */               oOloioIlI001IO000.I0000O = i0oololOOll1;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final void I00000oOI(O1ol100o0O o1ol100o0O, OoI01iiOoo01 ooI01iiOoo01, Function1 function1, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IllOOo00lI illOOo00lI3, IllOOo00lI illOOo00lI4, boolean z, O1ooiI111i o1ooiI111i, boolean z2, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1ol100o0O o1ol100o0O2;
                    OoI01iiOoo01 ooI01iiOoo012;
                    IllOOo00lI illOOo00lI5;
                    IllOOo00lI illOOo00lI6;
                    Function1 function12;
                    IllOOo00lI illOOo00lI7;
                    O1ooiI111i o1ooiI111i2;
                    IloI0lOlll1 iloI0lOlll12;
                    Object obj;
                    Object obj2;
                    OI10i0Il oI10i0Il;
                    IOoil1iiIilo iOoil1iiIilo;
                    O1ooIo101ll o1ooIo101ll;
                    Object obj3;
                    OI10i0Il oI10i0Il2;
                    OI10i0Il oI10i0Il3;
                    IloI0lOlll1 iloI0lOlll13;
                    OoI01iiOoo01 ooI01iiOoo013;
                    IloI0lOlll1 iloI0lOlll14;
                    Object obj4;
                    List list;
                    OI10i0Il oI10i0Il4;
                    OI10i0Il oI10i0Il5;
                    Object obj5;
                    Ii0110 ii0110;
                    int i2;
                    IloI0lOlll1 iloI0lOlll15;
                    boolean z3;
                    IloI0lOlll1 iloI0lOlll16;
/* 19 */            IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 24 */            iloI0lOlll17.I00i0O(483170686);
/* 121 */           int i3 = i | (iloI0lOlll17.I000OOo1O(o1ol100o0O) ? 4 : 2) | (iloI0lOlll17.I000OOo1O(ooI01iiOoo01) ? 32 : 16) | (iloI0lOlll17.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll17.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll17.I000OOo1O(illOOo00lI2) ? 16384 : 8192) | (iloI0lOlll17.I000OOo1O(illOOo00lI3) ? 131072 : 65536) | (iloI0lOlll17.I000OOo1O(illOOo00lI4) ? 1048576 : 524288) | (iloI0lOlll17.I000O01llI0(z) ? 8388608 : 4194304);
/* 142 */           if (iloI0lOlll17.I00OIl(i3 & 1, (i3 & 273228947) != 273228946)) {
/* 146 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll17);
/* 150 */               Object objI00O0i0ii = iloI0lOlll17.I00O0i0ii();
/* 154 */               Object obj6 = IOl11li.I00000oIO;
/* 156 */               if (objI00O0i0ii == obj6) {
/* 160 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 164 */                   iloI0lOlll17.I00iio(objI00O0i0ii);
                        }
/* 167 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii;
/* 169 */               Object objI00O0i0ii2 = iloI0lOlll17.I00O0i0ii();
/* 173 */               if (objI00O0i0ii2 == obj6) {
/* 177 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 181 */                   iloI0lOlll17.I00iio(objI00O0i0ii2);
                        }
/* 184 */               OI10i0Il oI10i0Il7 = (OI10i0Il) objI00O0i0ii2;
/* 186 */               Object objI00O0i0ii3 = iloI0lOlll17.I00O0i0ii();
/* 190 */               if (objI00O0i0ii3 == obj6) {
/* 192 */                   objI00O0i0ii3 = iIO0iiOiOl0l.I000II(iloI0lOlll17);
/* 196 */                   iloI0lOlll17.I00iio(objI00O0i0ii3);
                        }
/* 199 */               Ii0110 ii01102 = (Ii0110) objI00O0i0ii3;
/* 207 */               Context context = (Context) iloI0lOlll17.I000iOII(I0lloOI0oio.I00000oOI);
/* 222 */               OlOolloIIOl0.I000II(context.getPackageName(), ".dev", false);
/* 231 */               Object obj7 = ((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I00000oIO;
/* 233 */               boolean zI000II = iloI0lOlll17.I000II(obj7);
/* 237 */               Object objI00O0i0ii4 = iloI0lOlll17.I00O0i0ii();
/* 245 */               if (zI000II || objI00O0i0ii4 == obj6) {
/* 251 */                   List list2 = (Iterable) obj7;
/* 257 */                   int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(list2, 10));
/* 269 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO >= 16 ? iI00000oIO : 16);
/* 280 */                   for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
/* 282 */                       Object next = it.next();
/* 295 */                       linkedHashMap.put(((OloIl1l1oOii) next).I0000Il00O.I00000oIO, next);
                            }
/* 311 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 328 */                   for (Iterator it2 = linkedHashMap.entrySet().iterator(); it2.hasNext(); it2 = it2) {
/* 334 */                       Map.Entry entry = (Map.Entry) it2.next();
/* 350 */                       linkedHashMap2.put(entry.getKey(), ((OloIl1l1oOii) entry.getValue()).I0000Il00O);
                            }
/* 356 */                   iloI0lOlll17.I00iio(linkedHashMap2);
/* 359 */                   objI00O0i0ii4 = linkedHashMap2;
                        }
/* 360 */               Map map = (Map) objI00O0i0ii4;
/* 362 */               boolean zI000II2 = iloI0lOlll17.I000II(map);
/* 366 */               Object objI00O0i0ii5 = iloI0lOlll17.I00O0i0ii();
/* 370 */               if (zI000II2 || objI00O0i0ii5 == obj6) {
/* 386 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(map.keySet());
/* 395 */                   Ilo0lI ilo0lI = new Ilo0lI(7);
/* 398 */                   ilo0lI.I00iiI = map;
/* 400 */                   ilo0lI.I00iiO = context;
/* 402 */                   VarHandle.storeStoreFence();
/* 407 */                   obj = context;
/* 410 */                   IOi10O11O iOi10O11O = new IOi10O11O(1);
/* 413 */                   iOi10O11O.I00iiI = ilo0lI;
/* 415 */                   VarHandle.storeStoreFence();
/* 418 */                   List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(listI00iIi0i1o, iOi10O11O);
/* 432 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00Ol1ll1, 10));
/* 435 */                   Iterator it3 = listI00Ol1ll1.iterator();
/* 443 */                   while (it3.hasNext()) {
/* 457 */                       arrayList.add((IO0l1oIIi1i) map.get((String) it3.next()));
                            }
/* 461 */                   iloI0lOlll17.I00iio(arrayList);
                            obj2 = arrayList;
                        } else {
/* 375 */                   obj = context;
                            obj2 = objI00O0i0ii5;
                        }
/* 465 */               List list3 = (List) obj2;
/* 473 */               boolean zBooleanValue = ((Boolean) oI10i0Il7.getValue()).booleanValue();
/* 477 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 479 */               IOoil1iiIilo iOoil1iiIilo2 = null;
/* 480 */               if (zBooleanValue) {
/* 1103 */                  illOOo00lI5 = illOOo00lI2;
/* 1104 */                  illOOo00lI6 = illOOo00lI3;
/* 1105 */                  oI10i0Il = oI10i0IlI00000oOI;
/* 1107 */                  iOoil1iiIilo = null;
/* 1108 */                  o1ooIo101ll = o1ooIo101ll2;
/* 1111 */                  o1ol100o0O2 = o1ol100o0O;
/* 1112 */                  function12 = function1;
/* 1113 */                  illOOo00lI7 = illOOo00lI4;
/* 1114 */                  obj3 = obj6;
/* 1115 */                  oI10i0Il2 = oI10i0Il6;
/* 1117 */                  oI10i0Il3 = oI10i0Il7;
/* 1122 */                  iloI0lOlll17.I00i01iIIliI(1717760644);
/* 1125 */                  iloI0lOlll17.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll17;
                        } else {
/* 485 */                   iloI0lOlll17.I00i01iIIliI(1704940904);
/* 488 */                   Object objI00O0i0ii6 = iloI0lOlll17.I00O0i0ii();
/* 492 */                   if (objI00O0i0ii6 == obj6) {
/* 496 */                       objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 500 */                       iloI0lOlll17.I00iio(objI00O0i0ii6);
                            }
/* 503 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii6;
/* 513 */                   Boolean boolValueOf = Boolean.valueOf(((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I0000oI00);
/* 517 */                   boolean zI000II3 = iloI0lOlll17.I000II(oI10i0IlI00000oOI);
/* 521 */                   Object objI00O0i0ii7 = iloI0lOlll17.I00O0i0ii();
/* 525 */                   if (zI000II3 || objI00O0i0ii7 == obj6) {
/* 535 */                       obj4 = obj6;
/* 539 */                       objI00O0i0ii7 = new Ii1O001loIoO(oI10i0IlI00000oOI, oI10i0Il8, iOoil1iiIilo2, 21);
/* 542 */                       iloI0lOlll17.I00iio(objI00O0i0ii7);
                            } else {
/* 530 */                       obj4 = obj6;
                            }
/* 547 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii7, iloI0lOlll17, boolValueOf);
/* 560 */                   if (((Boolean) oI10i0Il8.getValue()).booleanValue()) {
/* 565 */                       iloI0lOlll17.I00i01iIIliI(1705860550);
/* 568 */                       IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 576 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00, i1O01oOIoI0I.I00lli11, iloI0lOlll17, 54);
/* 582 */                       int iHashCode = Long.hashCode(iloI0lOlll17.I00OI1);
/* 586 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll17.I000lI();
/* 590 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll17, ilIl1Io0lii1);
/* 596 */                       IOl0oi0lOl1.I000lI.getClass();
/* 599 */                       iloI0lOlll17.I00i0oil();
/* 606 */                       if (iloI0lOlll17.I00O10llo) {
/* 610 */                           iloI0lOlll17.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 614 */                           iloI0lOlll17.I00io1l();
                                }
/* 619 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll17, oiI1iiIl1Oi0I00000oIO);
/* 624 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll17, oO0lO0l0I000lI);
/* 633 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll17, Integer.valueOf(iHashCode));
/* 636 */                       li01Ooiio01.I00000oOI(iloI0lOlll17);
/* 641 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll17, o1ooiI111iI0000Il00O);
/* 644 */                       OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 670 */                       o1ooIo101ll = o1ooIo101ll2;
/* 703 */                       oI10i0Il2 = oI10i0Il6;
/* 705 */                       list = list3;
/* 707 */                       obj5 = obj;
/* 709 */                       oI10i0Il3 = oI10i0Il7;
/* 711 */                       ii0110 = ii01102;
/* 713 */                       oI10i0Il5 = oI10i0Il8;
/* 717 */                       obj3 = obj4;
/* 719 */                       oI10i0Il4 = oI10i0IlI00000oOI;
/* 724 */                       OOO0iOio0oil.I00000oIO(Ol0iOOO0.I000lI(iO01II.I000OiO(o1ooIo101ll2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f), 0L, 3.0f, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(oOiIOoiOO)).I00000oIO.I0010I0i, 0, 0.0f, iloI0lOlll1, 390, 50);
/* 786 */                       Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.loading_model_list, iloI0lOlll1), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oOI.I000iOII, iloI0lOlll1, 0, 0, 131070);
/* 789 */                       IloI0lOlll1 iloI0lOlll18 = iloI0lOlll1;
/* 791 */                       iloI0lOlll18.I0010I0i(true);
/* 794 */                       i2 = 0;
/* 795 */                       iloI0lOlll18.I0010I0i(false);
                                iloI0lOlll15 = iloI0lOlll18;
                            } else {
/* 799 */                       oI10i0Il2 = oI10i0Il6;
/* 801 */                       list = list3;
/* 803 */                       oI10i0Il4 = oI10i0IlI00000oOI;
/* 805 */                       oI10i0Il5 = oI10i0Il8;
/* 807 */                       obj5 = obj;
/* 809 */                       ii0110 = ii01102;
/* 811 */                       oI10i0Il3 = oI10i0Il7;
/* 813 */                       o1ooIo101ll = o1ooIo101ll2;
/* 815 */                       obj3 = obj4;
/* 818 */                       i2 = 0;
/* 822 */                       iloI0lOlll17.I00i01iIIliI(1706356612);
/* 825 */                       iloI0lOlll17.I0010I0i(false);
                                iloI0lOlll15 = iloI0lOlll17;
                            }
/* 838 */                   if (((Boolean) oI10i0Il5.getValue()).booleanValue() || ((O1oiOloOo) oI10i0Il4.getValue()).I0000oI00) {
/* 1076 */                      o1ol100o0O2 = o1ol100o0O;
/* 1078 */                      function12 = function1;
/* 1080 */                      illOOo00lI5 = illOOo00lI2;
/* 1082 */                      illOOo00lI6 = illOOo00lI3;
/* 1084 */                      boolean z4 = i2;
/* 1085 */                      oI10i0Il = oI10i0Il4;
/* 1087 */                      iOoil1iiIilo = null;
/* 1088 */                      illOOo00lI7 = illOOo00lI4;
/* 1093 */                      iloI0lOlll15.I00i01iIIliI(1717756676);
/* 1096 */                      iloI0lOlll15.I0010I0i(z4);
                                iloI0lOlll16 = iloI0lOlll15;
                                z3 = z4;
                            } else {
/* 853 */                       iloI0lOlll15.I00i01iIIliI(1706829145);
/* 856 */                       IiloiO iiloiO = IiloiO.I00iOIl;
/* 858 */                       IiloOlIoIool iiloOlIoIoolI0000O = OII0IoiI.I0000O(iloI0lOlll15);
/* 865 */                       I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 868 */                       Object objI00O0i0ii8 = iloI0lOlll15.I00O0i0ii();
/* 872 */                       if (objI00O0i0ii8 == obj3) {
/* 876 */                           objI00O0i0ii8 = new IoI0IiI0(i2);
/* 879 */                           iloI0lOlll15.I00iio(objI00O0i0ii8);
                                }
/* 886 */                       Object objI00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) objI00O0i0ii8, iloI0lOlll15, 48);
/* 898 */                       boolean zI000OOo1O = iloI0lOlll15.I000OOo1O(obj5) | iloI0lOlll15.I000OOo1O(objI00000oIO);
/* 899 */                       Object objI00O0i0ii9 = iloI0lOlll15.I00O0i0ii();
/* 903 */                       if (zI000OOo1O || objI00O0i0ii9 == obj3) {
/* 915 */                           objI00O0i0ii9 = new Ii1O001loIoO(obj5, objI00000oIO, null, 22);
/* 918 */                           iloI0lOlll15.I00iio(objI00O0i0ii9);
                                }
/* 925 */                       iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii9, iloI0lOlll15, OoiIlOl1iI.I00000oIO);
/* 928 */                       boolean zI0000Il00O = iiloOlIoIoolI0000O.I0000Il00O();
/* 940 */                       boolean zI000OOo1O2 = iloI0lOlll15.I000OOo1O(ii0110) | iloI0lOlll15.I000II(iiloOlIoIoolI0000O);
/* 941 */                       Object objI00O0i0ii10 = iloI0lOlll15.I00O0i0ii();
                                Object obj8 = objI00O0i0ii10;
/* 945 */                       if (zI000OOo1O2 || objI00O0i0ii10 == obj3) {
/* 951 */                           IoI0O1IIii ioI0O1IIii = new IoI0O1IIii(i2);
/* 954 */                           ioI0O1IIii.I00iiI = ii0110;
/* 956 */                           ioI0O1IIii.I00iiO = iiloOlIoIoolI0000O;
/* 958 */                           VarHandle.storeStoreFence();
/* 961 */                           iloI0lOlll15.I00iio(ioI0O1IIii);
                                    obj8 = ioI0O1IIii;
                                }
/* 966 */                       iOOloIo.I00000oIO(i2, i2, (IllOOo00lI) obj8, iloI0lOlll15, zI0000Il00O);
/* 969 */                       boolean zI0000Il00O2 = iiloOlIoIoolI0000O.I0000Il00O();
/* 977 */                       O11iol o11iol = new O11iol(14);
/* 980 */                       o11iol.I00iiI = ii0110;
/* 982 */                       o11iol.I00iiO = iiloOlIoIoolI0000O;
/* 984 */                       o11iol.I00iio = illOOo00lI;
/* 986 */                       o11iol.I00ilI0I1 = oI10i0Il2;
/* 988 */                       VarHandle.storeStoreFence();
/* 994 */                       IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-737312142, o11iol, iloI0lOlll15);
/* 1000 */                      IoI0Oi0OOlol ioI0Oi0OOlol = new IoI0Oi0OOlol();
/* 1003 */                      ioI0Oi0OOlol.I00iOIl = z;
/* 1005 */                      ioI0Oi0OOlol.I00iiI = ii0110;
/* 1007 */                      ioI0Oi0OOlol.I00iiO = iiloOlIoIoolI0000O;
/* 1009 */                      ioI0Oi0OOlol.I00iio = z2;
/* 1013 */                      ioI0Oi0OOlol.I00ilI0I1 = list;
/* 1015 */                      o1ol100o0O2 = o1ol100o0O;
/* 1017 */                      ioI0Oi0OOlol.I00ilO0 = o1ol100o0O2;
/* 1021 */                      ioI0Oi0OOlol.I00io1l = function1;
/* 1025 */                      ioI0Oi0OOlol.I00ioIO = illOOo00lI3;
/* 1027 */                      illOOo00lI5 = illOOo00lI2;
/* 1029 */                      ioI0Oi0OOlol.I00l0I0l0lO1 = illOOo00lI5;
/* 1031 */                      illOOo00lI7 = illOOo00lI4;
/* 1033 */                      ioI0Oi0OOlol.I00l0OO0IO = illOOo00lI7;
/* 1037 */                      ioI0Oi0OOlol.I00li1OI = oI10i0Il4;
/* 1039 */                      VarHandle.storeStoreFence();
/* 1056 */                      illOOo00lI6 = illOOo00lI3;
/* 1058 */                      IloI0lOlll1 iloI0lOlll19 = iloI0lOlll15;
/* 1060 */                      oI10i0Il = oI10i0Il4;
/* 1062 */                      iOoil1iiIilo = null;
/* 1064 */                      function12 = function1;
/* 1066 */                      OII0IoiI.I0000Il00O(iOii1lI00000oOI, null, iiloOlIoIoolI0000O, zI0000Il00O2, 0L, iiioOl1O.I00000oOI(953695885, ioI0Oi0OOlol, iloI0lOlll15), iloI0lOlll19, 196614);
/* 1069 */                      IloI0lOlll1 iloI0lOlll110 = iloI0lOlll19;
/* 1071 */                      z3 = false;
/* 1072 */                      iloI0lOlll110.I0010I0i(false);
                                iloI0lOlll16 = iloI0lOlll110;
                            }
/* 1099 */                  iloI0lOlll16.I0010I0i(z3);
                            iloI0lOlll13 = iloI0lOlll16;
                        }
/* 1138 */              if (((Boolean) oI10i0Il3.getValue()).booleanValue()) {
/* 1143 */                  iloI0lOlll13.I00i01iIIliI(1717828968);
/* 1146 */                  ooI01iiOoo013 = ooI01iiOoo01;
/* 1148 */                  boolean zI000OOo1O3 = iloI0lOlll13.I000OOo1O(ooI01iiOoo013);
/* 1152 */                  Object objI00O0i0ii11 = iloI0lOlll13.I00O0i0ii();
                            Object obj9 = objI00O0i0ii11;
/* 1156 */                  if (zI000OOo1O3 || objI00O0i0ii11 == obj3) {
/* 1164 */                      IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(20);
/* 1167 */                      iO1Io1IOOOIi.I00iiI = ooI01iiOoo013;
/* 1171 */                      iO1Io1IOOOIi.I00iiO = oI10i0Il3;
/* 1173 */                      VarHandle.storeStoreFence();
/* 1176 */                      iloI0lOlll13.I00iio(iO1Io1IOOOIi);
                                obj9 = iO1Io1IOOOIi;
                            }
/* 1183 */                  iOO0oo0lIIO.I00000oIO(0, 2, (IllOOo00lI) obj9, iloI0lOlll13, false);
/* 1186 */                  iloI0lOlll13.I0010I0i(false);
                        } else {
/* 1190 */                  ooI01iiOoo013 = ooI01iiOoo01;
/* 1196 */                  iloI0lOlll13.I00i01iIIliI(1717948132);
/* 1199 */                  iloI0lOlll13.I0010I0i(false);
                        }
/* 1212 */              if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 1217 */                  iloI0lOlll13.I00i01iIIliI(1718004056);
/* 1220 */                  Ii1liIllli0 ii1liIllli0 = o1ol100o0O2.I0000Il00O;
/* 1222 */                  ii1liIllli0.getClass();
/* 1238 */                  Oo0oOoIo0ol oo0oOoIo0ol = (Oo0oOoIo0ol) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, iOoil1iiIilo, 15));
/* 1240 */                  Object objI00O0i0ii12 = iloI0lOlll13.I00O0i0ii();
                            Object obj10 = objI00O0i0ii12;
/* 1244 */                  if (objI00O0i0ii12 == obj3) {
/* 1250 */                      IloOi11lo iloOi11lo = new IloOi11lo(27);
/* 1253 */                      iloOi11lo.I00iiI = oI10i0Il2;
/* 1255 */                      VarHandle.storeStoreFence();
/* 1258 */                      iloI0lOlll13.I00iio(iloOi11lo);
                                obj10 = iloOi11lo;
                            }
/* 1269 */                  OioIlii1iOO.I0000Il00O(oo0oOoIo0ol, o1ol100o0O2, (IllOOo00lI) obj10, iloI0lOlll13, ((i3 << 3) & 112) | 384);
/* 1273 */                  iloI0lOlll13.I0010I0i(false);
                        } else {
/* 1281 */                  iloI0lOlll13.I00i01iIIliI(1718200100);
/* 1284 */                  iloI0lOlll13.I0010I0i(false);
                        }
/* 1299 */              if (((O1oiOloOo) oI10i0Il.getValue()).I0001Ioi1lo.length() > 0) {
/* 1304 */                  iloI0lOlll13.I00i01iIIliI(1718279150);
/* 1307 */                  boolean zI000OOo1O4 = iloI0lOlll13.I000OOo1O(o1ol100o0O2);
/* 1311 */                  Object objI00O0i0ii13 = iloI0lOlll13.I00O0i0ii();
                            Object obj11 = objI00O0i0ii13;
/* 1315 */                  if (zI000OOo1O4 || objI00O0i0ii13 == obj3) {
/* 1322 */                      Io1o0l0iOl io1o0l0iOl = new Io1o0l0iOl(1);
/* 1325 */                      io1o0l0iOl.I00iiI = o1ol100o0O2;
/* 1327 */                      VarHandle.storeStoreFence();
/* 1330 */                      iloI0lOlll13.I00iio(io1o0l0iOl);
                                obj11 = io1o0l0iOl;
                            }
/* 1338 */                  IoI011li ioI011li = new IoI011li(0);
/* 1341 */                  ioI011li.I00iiI = o1ol100o0O2;
/* 1343 */                  VarHandle.storeStoreFence();
/* 1349 */                  IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(1778947466, ioI011li, iloI0lOlll13);
/* 1356 */                  IoI011li ioI011li2 = new IoI011li(1);
/* 1359 */                  ioI011li2.I00iiI = o1ol100o0O2;
/* 1361 */                  VarHandle.storeStoreFence();
/* 1367 */                  IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(-1329042488, ioI011li2, iloI0lOlll13);
/* 1375 */                  IloIlOOIi iloIlOOIi = new IloIlOOIi(10);
/* 1380 */                  iloIlOOIi.I00iiI = oI10i0Il;
/* 1382 */                  VarHandle.storeStoreFence();
/* 1417 */                  ooI01iiOoo012 = ooI01iiOoo013;
/* 1419 */                  IloI0lOlll1 iloI0lOlll111 = iloI0lOlll13;
/* 1422 */                  iOIil10l.I00000oIO((IllOOo00lI) obj11, iOii1lI00000oOI2, null, iOii1lI00000oOI3, i1i11ioIIlOl.I0001Ioi1lo, iiioOl1O.I00000oOI(-142065146, iloIlOOIi, iloI0lOlll13), i1i11ioIIlOl.I000II, null, 0L, 0L, 0L, 0L, null, iloI0lOlll111, 1797168, 16260);
/* 1425 */                  IloI0lOlll1 iloI0lOlll112 = iloI0lOlll111;
/* 1428 */                  iloI0lOlll112.I0010I0i(false);
                            iloI0lOlll14 = iloI0lOlll112;
                        } else {
/* 1432 */                  ooI01iiOoo012 = ooI01iiOoo013;
/* 1437 */                  iloI0lOlll13.I00i01iIIliI(1718976836);
/* 1440 */                  iloI0lOlll13.I0010I0i(false);
                            iloI0lOlll14 = iloI0lOlll13;
                        }
/* 1443 */              o1ooiI111i2 = o1ooIo101ll;
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 1447 */              o1ol100o0O2 = o1ol100o0O;
/* 1448 */              ooI01iiOoo012 = ooI01iiOoo01;
/* 1449 */              illOOo00lI5 = illOOo00lI2;
/* 1450 */              illOOo00lI6 = illOOo00lI3;
/* 1451 */              function12 = function1;
/* 1452 */              illOOo00lI7 = illOOo00lI4;
/* 1453 */              iloI0lOlll17.I00OilO00Il();
/* 1456 */              o1ooiI111i2 = o1ooiI111i;
                        iloI0lOlll12 = iloI0lOlll17;
                    }
/* 1458 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1462 */          if (oOloioIlI001IO000 != null) {
/* 1466 */              IoI0IOO0Ili ioI0IOO0Ili = new IoI0IOO0Ili();
/* 1469 */              ioI0IOO0Ili.I00iOIl = o1ol100o0O2;
/* 1471 */              ioI0IOO0Ili.I00iiI = ooI01iiOoo012;
/* 1473 */              ioI0IOO0Ili.I00iiO = function12;
/* 1475 */              ioI0IOO0Ili.I00iio = illOOo00lI;
/* 1477 */              ioI0IOO0Ili.I00ilI0I1 = illOOo00lI5;
/* 1479 */              ioI0IOO0Ili.I00ilO0 = illOOo00lI6;
/* 1481 */              ioI0IOO0Ili.I00io1l = illOOo00lI7;
/* 1485 */              ioI0IOO0Ili.I00ioIO = z;
/* 1487 */              ioI0IOO0Ili.I00l0I0l0lO1 = o1ooiI111i2;
/* 1491 */              ioI0IOO0Ili.I00l0OO0IO = z2;
/* 1493 */              VarHandle.storeStoreFence();
/* 1496 */              oOloioIlI001IO000.I0000O = ioI0IOO0Ili;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(boolean z, boolean z2, IloI0lOlll1 iloI0lOlll1, int i) {
                    float fI0000Il00O;
/* 8 */             iloI0lOlll1.I00i0O(-9489770);
/* 21 */            int i2 = i | (iloI0lOlll1.I000O01llI0(z) ? 4 : 2);
/* 37 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 39 */                if (z) {
/* 56 */                    iloI0lOlll1.I00i01iIIliI(758347748);
/* 67 */                    fI0000Il00O = OollloolI.I0000Il00O(300L, 1200, "intro text animation", iloI0lOlll1, 438);
/* 71 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 44 */                    iloI0lOlll1.I00i01iIIliI(758319228);
/* 47 */                    iloI0lOlll1.I0010I0i(false);
/* 50 */                    fI0000Il00O = 1.0f;
                        }
/* 78 */                StringBuilder sb = new StringBuilder(16);
/* 83 */                new ArrayList();
/* 88 */                ArrayList arrayList = new ArrayList();
/* 93 */                new ArrayList();
/* 96 */                String string = sb.toString();
/* 106 */               ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 109 */               int size = arrayList.size();
/* 113 */               for (int i3 = 0; i3 < size; i3++) {
/* 129 */                   arrayList2.add(((I111101Olo00) arrayList.get(i3)).I00000oIO(sb.length()));
                        }
/* 137 */               I1111OO10i i1111OO10i = new I1111OO10i(string, arrayList2);
/* 150 */               Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000iOII;
/* 152 */               boolean zI0000O = iloI0lOlll1.I0000O(fI0000Il00O);
/* 156 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 160 */               if (!zI0000O) {
                            Object obj = objI00O0i0ii;
/* 164 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 168 */                       II1O10OOoOIi iI1O10OOoOIi = new II1O10OOoOIi(1);
/* 171 */                       iI1O10OOoOIi.I00iiI = fI0000Il00O;
/* 173 */                       VarHandle.storeStoreFence();
/* 176 */                       iloI0lOlll1.I00iio(iI1O10OOoOIi);
                                obj = iI1O10OOoOIi;
                            }
/* 220 */                   Oo0i1oIIoOO.I0000Il00O(i1111OO10i, iIlll1lo.I00000oIO(O1ooIo101ll.I00000oIO, (Function1) obj), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, oo0lloOiiIOI, iloI0lOlll1, 0, 0, 262140);
                        }
                    } else {
/* 224 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 227 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 231 */           if (oOloioIlI001IO000 != null) {
/* 235 */               Io1o1I1O0 io1o1I1O0 = new Io1o1I1O0();
/* 238 */               io1o1I1O0.I00iOIl = z;
/* 242 */               io1o1I1O0.I00iiI = z2;
/* 244 */               VarHandle.storeStoreFence();
/* 247 */               oOloioIlI001IO000.I0000O = io1o1I1O0;
                    }
                }

                public static final void I0000O(OloIl1l1oOii oloIl1l1oOii, int i, boolean z, IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, String str, boolean z2, IloI0lOlll1 iloI0lOlll1, int i2) {
                    String str2;
                    OI10i0Il oI10i0Il;
                    IOoil1iiIilo iOoil1iiIilo;
                    IOO0o0I1l iOO0o0I1l;
                    float fI0000Il00O;
                    IloI0lOlll1 iloI0lOlll12;
                    long j;
/* 13 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 15 */            int i3 = i2;
/* 20 */            iloI0lOlll13.I00i0O(941135186);
/* 69 */            int i4 = (iloI0lOlll13.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | i3 | (iloI0lOlll13.I0000oI00(i) ? 32 : 16) | (iloI0lOlll13.I000O01llI0(z) ? 256 : Barcode.FORMAT_ITF) | (iloI0lOlll13.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 72 */            if ((i3 & 24576) == 0) {
/* 85 */                i4 |= iloI0lOlll13.I000II(o1ooiI111i) ? 16384 : 8192;
                    }
/* 88 */            int i5 = i4 | 196608;
/* 109 */           if (iloI0lOlll13.I00OIl(i5 & 1, (599187 & i5) != 599186)) {
/* 111 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 115 */               IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 117 */               if (objI00O0i0ii == iOO0o0I1l2) {
/* 121 */                   Io1olIi io1olIi = new Io1olIi(0);
/* 124 */                   io1olIi.I00iiI = oloIl1l1oOii;
/* 126 */                   VarHandle.storeStoreFence();
/* 129 */                   objI00O0i0ii = Ol1llolil.I00000oOI(io1olIi);
/* 133 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 136 */               OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii;
/* 138 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 142 */               if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 146 */                   Io1ollO io1ollO = new Io1ollO(0);
/* 149 */                   io1ollO.I00iiI = olO01l1oOil;
/* 151 */                   VarHandle.storeStoreFence();
/* 154 */                   objI00O0i0ii2 = Ol1llolil.I00000oOI(io1ollO);
/* 158 */                   iloI0lOlll13.I00iio(objI00O0i0ii2);
                        }
/* 163 */               OlO01l1oOil olO01l1oOil2 = (OlO01l1oOil) objI00O0i0ii2;
/* 165 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 171 */               if (objI00O0i0ii3 == iOO0o0I1l2) {
/* 173 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 177 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        }
/* 182 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 184 */               Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 188 */               if (objI00O0i0ii4 == iOO0o0I1l2) {
/* 192 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 196 */                   iloI0lOlll13.I00iio(objI00O0i0ii4);
                        }
/* 201 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 207 */               String str3 = (String) olO01l1oOil2.getValue();
/* 209 */               Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 213 */               IOoil1iiIilo iOoil1iiIilo2 = null;
/* 215 */               if (objI00O0i0ii5 == iOO0o0I1l2) {
/* 221 */                   objI00O0i0ii5 = new IiI110i1O(oI10i0Il2, olO01l1oOil2, oI10i0Il3, iOoil1iiIilo2, 13);
/* 226 */                   oI10i0Il = oI10i0Il2;
/* 228 */                   iOoil1iiIilo = null;
/* 230 */                   iloI0lOlll13.I00iio(objI00O0i0ii5);
                        } else {
/* 234 */                   oI10i0Il = oI10i0Il2;
/* 236 */                   iOoil1iiIilo = null;
                        }
/* 240 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii5, iloI0lOlll13, str3);
/* 243 */               if (z) {
/* 248 */                   iloI0lOlll13.I00i01iIIliI(-1807140124);
/* 268 */                   iOO0o0I1l = iOO0o0I1l2;
/* 275 */                   fI0000Il00O = OollloolI.I0000Il00O((i * 100) + 410, 600, "task card animation", iloI0lOlll1, 432);
/* 279 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 281 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll14;
                        } else {
/* 285 */                   iOO0o0I1l = iOO0o0I1l2;
/* 290 */                   iloI0lOlll13.I00i01iIIliI(878826764);
/* 293 */                   iloI0lOlll13.I0010I0i(false);
/* 296 */                   fI0000Il00O = 1.0f;
                            iloI0lOlll12 = iloI0lOlll13;
                        }
/* 317 */               String strI0000Il00O = lOOoli.I0000Il00O(R.string.cd_task_card, new Object[]{oloIl1l1oOii.I00000oOI, Integer.valueOf(oloIl1l1oOii.I000OiO.size())}, iloI0lOlll12);
/* 321 */               Object objI00O0i0ii6 = iloI0lOlll12.I00O0i0ii();
/* 325 */               if (objI00O0i0ii6 == iOO0o0I1l) {
/* 327 */                   objI00O0i0ii6 = l001l0.I00000oIO();
/* 331 */                   iloI0lOlll12.I00iio(objI00O0i0ii6);
                        }
/* 334 */               OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii6;
/* 336 */               Object objI00O0i0ii7 = iloI0lOlll12.I00O0i0ii();
/* 340 */               if (objI00O0i0ii7 == iOO0o0I1l) {
/* 344 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 348 */                   iloI0lOlll12.I00iio(objI00O0i0ii7);
                        }
/* 351 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii7;
/* 353 */               Object objI00O0i0ii8 = iloI0lOlll12.I00O0i0ii();
/* 357 */               if (objI00O0i0ii8 == iOO0o0I1l) {
/* 362 */                   objI00O0i0ii8 = new Ili1101O0(oI0lOIiOIOOo, oI10i0Il4, iOoil1iiIilo, 1);
/* 365 */                   iloI0lOlll12.I00iio(objI00O0i0ii8);
                        }
/* 372 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii8, iloI0lOlll12, oI0lOIiOIOOo);
/* 391 */               float f = ((Boolean) oI10i0Il4.getValue()).booleanValue() ? 0.93f : 1.0f;
/* 393 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 420 */               float f2 = fI0000Il00O;
/* 424 */               OlO01l1oOil olO01l1oOilI00000oOI = I10i0IOl.I00000oOI(f, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I0000O.I0000Il00O(), "taskCardPressScale", iloI0lOlll12, 3072, 20);
/* 428 */               Object objI00O0i0ii9 = iloI0lOlll12.I00O0i0ii();
/* 432 */               if (objI00O0i0ii9 == iOO0o0I1l) {
/* 440 */                   objI00O0i0ii9 = lOO00IiI0li.I00000oIO(Boolean.valueOf(!z));
/* 444 */                   iloI0lOlll12.I00iio(objI00O0i0ii9);
                        }
/* 447 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii9;
/* 469 */               boolean z3 = ((i5 & 896) == 256) | ((i5 & 112) == 32);
/* 471 */               Object objI00O0i0ii10 = iloI0lOlll12.I00O0i0ii();
/* 475 */               if (z3 || objI00O0i0ii10 == iOO0o0I1l) {
/* 482 */                   objI00O0i0ii10 = new IoI0lIii(i, null, oI10i0Il5, z);
/* 485 */                   iloI0lOlll12.I00iio(objI00O0i0ii10);
                        }
/* 492 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii10, iloI0lOlll12, OoiIlOl1iI.I00000oIO);
/* 536 */               OlO01l1oOil olO01l1oOilI00000oOI2 = I10i0IOl.I00000oOI(((Boolean) oI10i0Il5.getValue()).booleanValue() ? 1.0f : 0.8f, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I0000O.I0001Ioi1lo(), "taskCardAppear", iloI0lOlll12, 3072, 20);
/* 565 */               IOO0o0I1l iOO0o0I1l3 = iOO0o0I1l;
/* 578 */               O1ooiI111i o1ooiI111iI00000oIO = i1Ioo1o0.I00000oIO(ii0OOOOo0i.I00000oIO(o1ooiI111i, OiI11O1i1.I00000oOI(24.0f)), oI0lOIiOIOOo, (Iol100iI0lO) iloI0lOlll12.I000iOII(Iol0oOO.I00000oIO), false, null, illOOo00lI, 28);
/* 595 */               boolean zI0000O = iloI0lOlll12.I0000O(f2) | iloI0lOlll12.I000II(olO01l1oOilI00000oOI) | iloI0lOlll12.I000II(olO01l1oOilI00000oOI2);
/* 596 */               Object objI00O0i0ii11 = iloI0lOlll12.I00O0i0ii();
                        Object obj = objI00O0i0ii11;
/* 600 */               if (zI0000O || objI00O0i0ii11 == iOO0o0I1l3) {
/* 607 */                   I0i1l00llOi1 i0i1l00llOi1 = new I0i1l00llOi1(2);
/* 610 */                   i0i1l00llOi1.I00iiI = f2;
/* 612 */                   i0i1l00llOi1.I00iiO = olO01l1oOilI00000oOI;
/* 614 */                   i0i1l00llOi1.I00iio = olO01l1oOilI00000oOI2;
/* 616 */                   VarHandle.storeStoreFence();
/* 619 */                   iloI0lOlll12.I00iio(i0i1l00llOi1);
                            obj = i0i1l00llOi1;
                        }
/* 624 */               O1ooiI111i o1ooiI111iI00000oIO2 = iIlll1lo.I00000oIO(o1ooiI111iI00000oIO, (Function1) obj);
/* 628 */               boolean zI000II = iloI0lOlll12.I000II(strI0000Il00O);
/* 632 */               Object objI00O0i0ii12 = iloI0lOlll12.I00O0i0ii();
                        Object obj2 = objI00O0i0ii12;
/* 636 */               if (zI000II || objI00O0i0ii12 == iOO0o0I1l3) {
/* 644 */                   I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(16);
/* 647 */                   i0ioO0Oio0ll.I00iiI = strI0000Il00O;
/* 649 */                   VarHandle.storeStoreFence();
/* 652 */                   iloI0lOlll12.I00iio(i0ioO0Oio0ll);
                            obj2 = i0ioO0Oio0ll;
                        }
/* 657 */               int i6 = 0;
/* 658 */               O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO2, false, (Function1) obj2);
/* 666 */               if ("".length() <= 0 && !z2) {
/* 694 */                   iloI0lOlll12.I00i01iIIliI(-184683221);
/* 705 */                   j = ((Ii0iOlI) iloI0lOlll12.I000iOII(Oo0oi1olI.I00000oOI)).I0000Il00O;
/* 707 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 674 */                   iloI0lOlll12.I00i01iIIliI(-184756660);
/* 685 */                   j = ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1;
/* 687 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 710 */               IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(j, iloI0lOlll12);
/* 716 */               Io1olo0 io1olo0 = new Io1olo0(i6);
/* 719 */               io1olo0.I00iiI = z2;
/* 721 */               io1olo0.I00iiO = oloIl1l1oOii;
/* 725 */               io1olo0.I00iio = oI10i0Il;
/* 727 */               VarHandle.storeStoreFence();
/* 747 */               i3 = i2;
/* 749 */               iOl111l1l.I00000oOI(o1ooiI111iI00000oOI, null, iO0i0iI00000oIO, null, null, iiioOl1O.I00000oOI(-1288314592, io1olo0, iloI0lOlll12), iloI0lOlll1, 196608, 26);
/* 169 */               str2 = "";
                    } else {
/* 755 */               iloI0lOlll1.I00OilO00Il();
/* 758 */               str2 = str;
                    }
/* 760 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 764 */           if (oOloioIlI001IO000 != null) {
/* 768 */               IoI010Ol1Ill ioI010Ol1Ill = new IoI010Ol1Ill();
/* 771 */               ioI010Ol1Ill.I00iOIl = oloIl1l1oOii;
/* 775 */               ioI010Ol1Ill.I00iiI = i;
/* 779 */               ioI010Ol1Ill.I00iiO = z;
/* 781 */               ioI010Ol1Ill.I00iio = illOOo00lI;
/* 785 */               ioI010Ol1Ill.I00ilI0I1 = o1ooiI111i;
/* 787 */               ioI010Ol1Ill.I00ilO0 = str2;
/* 789 */               ioI010Ol1Ill.I00io1l = z2;
/* 791 */               ioI010Ol1Ill.I00ioIO = i3;
/* 793 */               VarHandle.storeStoreFence();
/* 796 */               oOloioIlI001IO000.I0000O = ioI010Ol1Ill;
                    }
                }

                public static final void I0000oI00(O1ol100o0O o1ol100o0O, IiI0O1Io iiI0O1Io, List list, Map map, boolean z, Function1 function1, boolean z2, boolean z3, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    float fI0000Il00O;
/* 13 */            IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 18 */            iloI0lOlll12.I00i0O(2098807667);
/* 93 */            int i3 = i | (iloI0lOlll12.I000II(iiI0O1Io) ? 32 : 16) | (iloI0lOlll12.I000OOo1O(list) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll12.I000OOo1O(map) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll12.I000O01llI0(z) ? 16384 : 8192) | (iloI0lOlll12.I000OOo1O(function1) ? 131072 : 65536) | (iloI0lOlll12.I000O01llI0(z3) ? 8388608 : 4194304);
/* 114 */           if (iloI0lOlll12.I00OIl(i3 & 1, (4269201 & i3) != 4269200)) {
/* 116 */               if (z) {
/* 133 */                   iloI0lOlll12.I00i01iIIliI(-1680443388);
/* 146 */                   fI0000Il00O = OollloolI.I0000Il00O(410L, 1200, "task card animation", iloI0lOlll1, 438);
/* 150 */                   iloI0lOlll12 = iloI0lOlll1;
/* 151 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 121 */                   iloI0lOlll12.I00i01iIIliI(511191467);
/* 124 */                   iloI0lOlll12.I0010I0i(false);
/* 127 */                   fI0000Il00O = 1.0f;
                        }
/* 154 */               Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 158 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 160 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 164 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 168 */                   iloI0lOlll12.I00iio(objI00O0i0ii);
                        }
/* 171 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 173 */               Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
/* 177 */               int i4 = 3;
/* 178 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 183 */                   objI00O0i0ii2 = new II01OoOI1(oI10i0Il, null, i4);
/* 186 */                   iloI0lOlll12.I00iio(objI00O0i0ii2);
                        }
/* 193 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll12, OoiIlOl1iI.I00000oIO);
/* 196 */               II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00ll1;
/* 201 */               OIo1i1 oIo1i1I00000oIO = iO01II.I00000oIO(2, 20.0f);
/* 207 */               Io1o1loOOii0 io1o1loOOii0 = new Io1o1loOOii0();
/* 210 */               io1o1loOOii0.I00iOIl = map;
/* 212 */               io1o1loOOii0.I00iiI = list;
/* 214 */               io1o1loOOii0.I00iiO = z3;
/* 216 */               io1o1loOOii0.I00iio = fI0000Il00O;
/* 218 */               io1o1loOOii0.I00ilI0I1 = z;
/* 220 */               io1o1loOOii0.I00ilO0 = function1;
/* 222 */               io1o1loOOii0.I00io1l = oI10i0Il;
/* 224 */               VarHandle.storeStoreFence();
/* 260 */               i2 = 0;
/* 262 */               l1loiOIllii.I00000oIO(((i3 >> 3) & 14) | 1573248, 16314, null, iI0O000iIl, null, iiioOl1O.I00000oOI(475513396, io1o1loOOii0, iloI0lOlll12), iloI0lOlll12, null, null, oIo1i1I00000oIO, iiI0O1Io, null, null, false);
                    } else {
/* 266 */               i2 = 0;
/* 267 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 270 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 274 */           if (oOloioIlI001IO000 != null) {
/* 278 */               Io1oIIi io1oIIi = new Io1oIIi(i2);
/* 283 */               io1oIIi.I00ilO0 = o1ol100o0O;
/* 285 */               io1oIIi.I00io1l = iiI0O1Io;
/* 287 */               io1oIIi.I00ioIO = list;
/* 291 */               io1oIIi.I00l0I0l0lO1 = map;
/* 295 */               io1oIIi.I00iiI = z;
/* 299 */               io1oIIi.I00ilI0I1 = function1;
/* 303 */               io1oIIi.I00iiO = z2;
/* 307 */               io1oIIi.I00iio = z3;
/* 309 */               VarHandle.storeStoreFence();
/* 312 */               oOloioIlI001IO000.I0000O = io1oIIi;
                    }
                }

                public static final void I0001Ioi1lo(boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1120481637);
/* 8 */             int i2 = i & 1;
/* 9 */             int i3 = 0;
/* 18 */            if (!iloI0lOlll1.I00OIl(i2, i2 != 0)) {
/* 21 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 24 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 28 */            if (oOloioIlI001IO000 != null) {
/* 32 */                Io1oi101I io1oi101I = new Io1oi101I(i3);
/* 35 */                io1oi101I.I00iiI = z;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                oOloioIlI001IO000.I0000O = io1oi101I;
                    }
                }

                public static final String I000II(Context context, IO0l1oIIi1i iO0l1oIIi1i) {
/* 7 */             return context.getString(iO0l1oIIi1i.I00000oOI.intValue());
                }
            }

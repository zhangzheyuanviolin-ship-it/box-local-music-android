            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class Olo0O1oOi1I {
                public static final Oo0lloOiiIOI I00000oIO = new Oo0lloOiiIOI(0, 0, IlilIIiIiO.I00li1OI, null, 0, 0, 0, 0, 16777211);
                public static final long I00000oOI = lOlilO1lOIO.I0000O(8);
                public static final long I0000Il00O = IOOiio0i.I000o00OoI0I;

                public static final void I00000oIO(Oi1O00I1 oi1O00I1, O1ooiI111i o1ooiI111i, Function1 function1, Function1 function12, IloI0lOlll1 iloI0lOlll1, int i) {
                    Object next;
                    O1ooIo101ll o1ooIo101ll;
                    List list;
                    O1ooiI111i o1ooiI111i2;
/* 7 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 14 */            iloI0lOlll12.I00i0O(-750323390);
/* 33 */            int i2 = ((i & 6) == 0 ? (iloI0lOlll12.I000II(oi1O00I1) ? 4 : 2) | i : i) | 48;
/* 39 */            if ((i & 384) == 0) {
/* 51 */                i2 |= iloI0lOlll12.I000OOo1O(function1) ? 256 : Barcode.FORMAT_ITF;
                    }
/* 56 */            if ((i & 3072) == 0) {
/* 68 */                i2 |= iloI0lOlll12.I000OOo1O(function12) ? 2048 : Barcode.FORMAT_UPC_E;
                    }
/* 73 */            if ((i2 & 1171) == 1170 && iloI0lOlll12.I00IO1()) {
/* 82 */                iloI0lOlll12.I00OilO00Il();
/* 85 */                o1ooiI111i2 = o1ooiI111i;
                    } else {
/* 97 */                Olo0loOlIO olo0loOlIO = Oi1i0Oi.I0000Il00O(Oi1i0Oi.I00000oOI(iloI0lOlll12)).I0001Ioi1lo;
/* 99 */                long jI0000Il00O = Oi1Io0I.I0000Il00O(iloI0lOlll12);
/* 106 */               iloI0lOlll12.I00i01iIIliI(1636511210);
/* 116 */               boolean z = (i2 & 896) == 256;
/* 117 */               Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 121 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 123 */               if (z || objI00O0i0ii == iOO0o0I1l) {
/* 127 */                   if (function1 != null) {
/* 131 */                       OiI1O11OO oiI1O11OO = new OiI1O11OO();
/* 134 */                       function1.invoke(oiI1O11OO);
/* 137 */                       objI00O0i0ii = oiI1O11OO.I00000oIO;
                            } else {
/* 141 */                       objI00O0i0ii = null;
                            }
/* 142 */                   iloI0lOlll12.I00iio(objI00O0i0ii);
                        }
/* 145 */               Olo0il1o olo0il1o = (Olo0il1o) objI00O0i0ii;
/* 147 */               iloI0lOlll12.I0010I0i(false);
/* 153 */               iloI0lOlll12.I00i01iIIliI(1636514279);
/* 162 */               boolean z2 = (i2 & 7168) == 2048;
/* 163 */               Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
/* 169 */               if (z2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 175 */                   Olloi1o olloi1o = new Olloi1o();
/* 180 */                   ArrayList arrayList = new ArrayList();
/* 183 */                   olloi1o.I00000oIO = arrayList;
/* 185 */                   VarHandle.storeStoreFence();
/* 188 */                   function12.invoke(olloi1o);
/* 197 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 200 */                   Iterator it = arrayList.iterator();
/* 208 */                   while (it.hasNext()) {
/* 218 */                       arrayList2.add(((OiI1O11OO) it.next()).I00000oIO);
                            }
/* 222 */                   iloI0lOlll12.I00iio(arrayList2);
/* 225 */                   objI00O0i0ii2 = arrayList2;
                        }
/* 226 */               List list2 = (List) objI00O0i0ii2;
/* 228 */               iloI0lOlll12.I0010I0i(false);
/* 234 */               iloI0lOlll12.I00i01iIIliI(1636517410);
/* 245 */               boolean zI000II = iloI0lOlll12.I000II(olo0il1o) | iloI0lOlll12.I000II(list2);
/* 246 */               Object objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
                        IloI0lOlll1 iloI0lOlll13 = iloI0lOlll12;
/* 250 */               if (zI000II || objI00O0i0ii3 == iOO0o0I1l) {
/* 263 */                   int size = olo0il1o != null ? olo0il1o.I00000oIO.size() : 0;
/* 267 */                   Iterator it2 = list2.iterator();
/* 275 */                   if (it2.hasNext()) {
/* 280 */                       next = it2.next();
/* 288 */                       if (it2.hasNext()) {
/* 297 */                           int size2 = ((Olo0il1o) next).I00000oIO.size();
                                    iloI0lOlll12 = iloI0lOlll12;
                                    while (true) {
/* 301 */                               Object next2 = it2.next();
/* 311 */                               int size3 = ((Olo0il1o) next2).I00000oIO.size();
/* 315 */                               if (size2 < size3) {
/* 317 */                                   size2 = size3;
/* 318 */                                   next = next2;
                                        }
/* 324 */                               if (!it2.hasNext()) {
                                            break;
                                        } else {
/* 729 */                                   iloI0lOlll12 = iloI0lOlll1;
                                        }
                                    }
                                }
                            } else {
/* 277 */                       next = null;
                            }
/* 328 */                   Olo0il1o olo0il1o2 = (Olo0il1o) next;
/* 344 */                   objI00O0i0ii3 = Integer.valueOf(Math.max(size, olo0il1o2 != null ? olo0il1o2.I00000oIO.size() : 0));
/* 348 */                   iloI0lOlll12.I00iio(objI00O0i0ii3);
                            iloI0lOlll13 = iloI0lOlll12;
                        }
/* 353 */               int iIntValue = ((Number) objI00O0i0ii3).intValue();
/* 358 */               iloI0lOlll13.I0010I0i(false);
/* 367 */               Oo0lloOiiIOI oo0lloOiiIOII0001Ioi1lo = Oi1Io0I.I0000O(iloI0lOlll13).I0001Ioi1lo(olo0loOlIO.I00000oIO);
/* 381 */               int i3 = i2;
/* 387 */               float fI001lIiIIo1O = ((IiIooOOOI) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000O01llI0)).I001lIiIIo1O(olo0loOlIO.I00000oOI.I00000oIO);
/* 391 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 397 */               O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(ii0OOOOo0i.I00000oOI(o1ooIo101ll2), fI001lIiIIo1O);
/* 404 */               iloI0lOlll13.I00i01iIIliI(1636530935);
/* 420 */               boolean zI000II2 = iloI0lOlll13.I000II(olo0il1o) | iloI0lOlll13.I000II(list2) | iloI0lOlll13.I000II(o1ooiI111iI0001Ioi1lo);
/* 421 */               Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 425 */               if (zI000II2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 434 */                   O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 438 */                   if (olo0il1o != null) {
/* 440 */                       List list3 = olo0il1o.I00000oIO;
/* 446 */                       o1ooIo101ll = o1ooIo101ll2;
/* 448 */                       list = list2;
/* 456 */                       ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 459 */                       Iterator it3 = list3.iterator();
/* 467 */                       while (it3.hasNext()) {
/* 473 */                           Function3 function3 = (Function3) it3.next();
/* 480 */                           I1oilOoo1iO i1oilOoo1iO = new I1oilOoo1iO(3);
/* 483 */                           i1oilOoo1iO.I00iiI = oo0lloOiiIOII0001Ioi1lo;
/* 485 */                           i1oilOoo1iO.I00iiO = o1ooiI111iI0001Ioi1lo;
/* 487 */                           i1oilOoo1iO.I00iio = function3;
/* 489 */                           VarHandle.storeStoreFence();
/* 503 */                           arrayList3.add(new IOii1l(-1928061582, i1oilOoo1iO, true));
/* 506 */                           it3 = it3;
/* 508 */                           oo0lloOiiIOII0001Ioi1lo = oo0lloOiiIOII0001Ioi1lo;
                                }
/* 511 */                       o101lO1I0000oI00.add(arrayList3);
                            } else {
/* 515 */                       o1ooIo101ll = o1ooIo101ll2;
/* 517 */                       list = list2;
                            }
/* 523 */                   Iterator it4 = list.iterator();
/* 531 */                   while (it4.hasNext()) {
/* 539 */                       List<Function3> list4 = ((Olo0il1o) it4.next()).I00000oIO;
/* 551 */                       ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 562 */                       for (Function3 function32 : list4) {
/* 575 */                           Olo0O0iOoO0i olo0O0iOoO0i = new Olo0O0iOoO0i(1);
/* 578 */                           olo0O0iOoO0i.I00iiI = o1ooiI111iI0001Ioi1lo;
/* 580 */                           olo0O0iOoO0i.I00iiO = function32;
/* 582 */                           VarHandle.storeStoreFence();
/* 595 */                           arrayList4.add(new IOii1l(-978043317, olo0O0iOoO0i, true));
/* 598 */                           o1ooiI111iI0001Ioi1lo = o1ooiI111iI0001Ioi1lo;
/* 600 */                           it4 = it4;
                                }
/* 610 */                       o101lO1I0000oI00.add(arrayList4);
/* 613 */                       it4 = it4;
                            }
/* 616 */                   objI00O0i0ii4 = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 620 */                   iloI0lOlll13.I00iio(objI00O0i0ii4);
                        } else {
/* 430 */                   o1ooIo101ll = o1ooIo101ll2;
                        }
/* 624 */               List list5 = (List) objI00O0i0ii4;
/* 627 */               iloI0lOlll13.I0010I0i(false);
/* 632 */               float fFloatValue = olo0loOlIO.I0000O.floatValue();
/* 639 */               iloI0lOlll13.I00i01iIIliI(1636566517);
/* 650 */               boolean zI000II3 = iloI0lOlll13.I000II(olo0loOlIO) | iloI0lOlll13.I0001Ioi1lo(jI0000Il00O);
/* 651 */               Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                        Object obj = objI00O0i0ii5;
/* 655 */               if (zI000II3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 662 */                   O0lOli0Il o0lOli0Il = new O0lOli0Il(2);
/* 665 */                   o0lOli0Il.I00iiO = olo0loOlIO;
/* 667 */                   o0lOli0Il.I00iiI = jI0000Il00O;
/* 669 */                   VarHandle.storeStoreFence();
/* 672 */                   iloI0lOlll13.I00iio(o0lOli0Il);
                            obj = o0lOli0Il;
                        }
/* 679 */               iloI0lOlll13.I0010I0i(false);
/* 693 */               lOIOilI0IllO.I00000oIO(iIntValue, list5, (Function1) obj, fFloatValue, o1ooIo101ll, iloI0lOlll13, (i3 << 9) & 57344);
/* 696 */               o1ooiI111i2 = o1ooIo101ll;
                    }
/* 698 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 702 */           if (oOloioIlI001IO000 != null) {
/* 707 */               I0io0io i0io0io = new I0io0io(6);
/* 710 */               i0io0io.I00ilI0I1 = oi1O00I1;
/* 712 */               i0io0io.I00iiI = o1ooiI111i2;
/* 714 */               i0io0io.I00ilO0 = function1;
/* 716 */               i0io0io.I00iiO = function12;
/* 718 */               i0io0io.I00iio = i;
/* 720 */               VarHandle.storeStoreFence();
/* 723 */               oOloioIlI001IO000.I0000O = i0io0io;
                    }
                }
            }

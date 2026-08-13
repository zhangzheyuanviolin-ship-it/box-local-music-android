            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class Io0Ii1 implements Function3 {
                public O1ol100o0O I00iOIl;
                public Function1 I00iiI;
                public Function1 I00iiO;
                public Ol1OlloIO I00iio;
                public Ol1o0O0O0 I00ilI0I1;
                public OI10i0Il I00ilO0;
                public Ol1o0O0O0 I00io1l;
                public OI10i0Il I00ioIO;
                public Ol1o1llOII I00l0I0l0lO1;

                /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01df  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    Object obj4;
                    String str;
                    Ol1o1llOII ol1o1llOII;
/* 3 */             O1ol100o0O o1ol100o0O = this.I00iOIl;
/* 5 */             Function1 function1 = this.I00iiI;
/* 7 */             Function1 function12 = this.I00iiO;
/* 9 */             Ol1OlloIO ol1OlloIO = this.I00iio;
/* 11 */            Ol1o0O0O0 ol1o0O0O0 = this.I00ilI0I1;
/* 13 */            OI10i0Il oI10i0Il = this.I00ilO0;
/* 15 */            Ol1o0O0O0 ol1o0O0O02 = this.I00io1l;
/* 17 */            OI10i0Il oI10i0Il2 = this.I00ioIO;
/* 19 */            Ol1o1llOII ol1o1llOII2 = this.I00l0I0l0lO1;
/* 23 */            OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) obj;
/* 27 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 33 */            int iIntValue = ((Integer) obj3).intValue();
/* 39 */            if ((iIntValue & 6) == 0) {
/* 50 */                iIntValue |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? 4 : 2;
                    }
/* 70 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 74 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 80 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 84 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 88 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 90 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 96 */                IOl0oi0lOl1.I000lI.getClass();
/* 99 */                iloI0lOlll1.I00i0oil();
/* 106 */               if (iloI0lOlll1.I00O10llo) {
/* 110 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 114 */                   iloI0lOlll1.I00io1l();
                        }
/* 119 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 124 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 133 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 136 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 141 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 144 */               List list = Io0IlOI0l.I00000oIO;
/* 150 */               ArrayList arrayList = new ArrayList();
/* 153 */               Iterator it = list.iterator();
/* 161 */               while (it.hasNext()) {
/* 167 */                   String str2 = (String) it.next();
/* 171 */                   ArrayList arrayList2 = new ArrayList();
/* 174 */                   ListIterator listIterator = ol1o0O0O0.listIterator();
                            while (true) {
/* 180 */                       Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator;
/* 186 */                       if (!io1ioiIIO1lI.hasNext()) {
                                    break;
                                }
/* 188 */                       Object next = io1ioiIIO1lI.next();
/* 192 */                       Iterator it2 = it;
/* 195 */                       O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) next;
/* 201 */                       OI10i0Il oI10i0Il3 = oI10i0Il;
/* 207 */                       List list2 = ((O1oiOloOo) oI10i0Il.getValue()).I00000oIO;
/* 215 */                       ArrayList arrayList3 = new ArrayList();
/* 226 */                       for (Object obj5 : list2) {
/* 228 */                           OIo1Oi1l1lI oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 234 */                           Ol1OlloIO ol1OlloIO2 = ol1OlloIO;
/* 239 */                           ArrayList arrayList4 = ((OloIl1l1oOii) obj5).I000OiO;
/* 241 */                           if (arrayList4 == null || !arrayList4.isEmpty()) {
/* 252 */                               Iterator it3 = arrayList4.iterator();
/* 260 */                               while (it3.hasNext()) {
/* 266 */                                   Iterator it4 = it3;
/* 274 */                                   ol1o1llOII = ol1o1llOII2;
/* 282 */                                   if (O0000Ioio00.I0000O(((O1oIOiI11o0) it3.next()).I00000oIO, o1oIOiI11o0.I00000oIO)) {
/* 284 */                                       arrayList3.add(obj5);
                                                break;
                                            }
/* 294 */                                   ol1o1llOII2 = ol1o1llOII;
/* 296 */                                   it3 = it4;
                                        }
/* 249 */                               ol1o1llOII = ol1o1llOII2;
                                    } else {
/* 249 */                               ol1o1llOII = ol1o1llOII2;
                                    }
/* 287 */                           ol1o1llOII2 = ol1o1llOII;
/* 289 */                           oIo1Oi1l1lI = oIo1Oi1l1lI2;
/* 291 */                           ol1OlloIO = ol1OlloIO2;
                                }
/* 299 */                       Ol1o1llOII ol1o1llOII3 = ol1o1llOII2;
/* 301 */                       Ol1OlloIO ol1OlloIO3 = ol1OlloIO;
/* 303 */                       OIo1Oi1l1lI oIo1Oi1l1lI3 = oIo1Oi1l1lI;
/* 313 */                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 316 */                       Iterator it5 = arrayList3.iterator();
/* 324 */                       while (it5.hasNext()) {
/* 334 */                           arrayList5.add(((OloIl1l1oOii) it5.next()).I00000oIO);
                                }
/* 342 */                       if (!arrayList5.isEmpty()) {
/* 345 */                           Iterator it6 = arrayList5.iterator();
/* 353 */                           while (it6.hasNext()) {
/* 359 */                               String str3 = (String) it6.next();
/* 367 */                               if (O0000Ioio00.I0000O(str3, "tts") || O0000Ioio00.I0000O(str3, "supertonic")) {
/* 377 */                                   str = "Text-to-Speech";
                                            break;
                                        }
                                    }
/* 386 */                           if (arrayList5.isEmpty()) {
                                    }
                                } else if (arrayList5.isEmpty()) {
/* 389 */                           Iterator it7 = arrayList5.iterator();
/* 397 */                           while (it7.hasNext()) {
/* 403 */                               String str4 = (String) it7.next();
/* 411 */                               if (O0000Ioio00.I0000O(str4, "whisper") || O0000Ioio00.I0000O(str4, "sense_voice") || O0000Ioio00.I0000O(str4, "audio_scribe")) {
/* 429 */                                   str = "Speech-to-Text";
                                            break;
                                        }
                                    }
/* 436 */                           if (!arrayList5.isEmpty()) {
                                    }
/* 478 */                           if (arrayList5.isEmpty()) {
                                    }
                                } else {
/* 436 */                           if (!arrayList5.isEmpty()) {
/* 439 */                               Iterator it8 = arrayList5.iterator();
/* 447 */                               while (it8.hasNext()) {
/* 453 */                                   String str5 = (String) it8.next();
/* 461 */                                   if (O0000Ioio00.I0000O(str5, "image_gen") || O0000Ioio00.I0000O(str5, "upscale")) {
/* 471 */                                       str = "Image generation";
                                                break;
                                            }
                                        }
                                    }
/* 478 */                           if (arrayList5.isEmpty()) {
/* 482 */                               Iterator it9 = arrayList5.iterator();
/* 490 */                               while (it9.hasNext()) {
/* 505 */                                   if (OlOolloIIOl0.I000l1((String) it9.next(), "llm_", false)) {
/* 507 */                                       str = "Language models";
                                                break;
                                            }
                                        }
/* 510 */                               str = "Other";
                                    } else {
/* 510 */                               str = "Other";
                                    }
                                }
/* 516 */                       if (str.equals(str2)) {
/* 518 */                           arrayList2.add(next);
                                }
/* 521 */                       it = it2;
/* 523 */                       oI10i0Il = oI10i0Il3;
/* 525 */                       ol1o1llOII2 = ol1o1llOII3;
/* 527 */                       oIo1Oi1l1lI = oIo1Oi1l1lI3;
/* 529 */                       ol1OlloIO = ol1OlloIO3;
                            }
/* 533 */                   Ol1o1llOII ol1o1llOII4 = ol1o1llOII2;
/* 535 */                   Ol1OlloIO ol1OlloIO4 = ol1OlloIO;
/* 537 */                   Iterator it10 = it;
/* 539 */                   OI10i0Il oI10i0Il4 = oI10i0Il;
/* 541 */                   OIo1Oi1l1lI oIo1Oi1l1lI4 = oIo1Oi1l1lI;
/* 554 */                   OIoi0IIoi oIoi0IIoi = arrayList2.isEmpty() ? null : new OIoi0IIoi(str2, arrayList2);
/* 557 */                   if (oIoi0IIoi != null) {
/* 559 */                       arrayList.add(oIoi0IIoi);
                            }
/* 562 */                   it = it10;
/* 564 */                   oI10i0Il = oI10i0Il4;
/* 566 */                   ol1o1llOII2 = ol1o1llOII4;
/* 568 */                   oIo1Oi1l1lI = oIo1Oi1l1lI4;
/* 570 */                   ol1OlloIO = ol1OlloIO4;
                        }
/* 574 */               Ol1o1llOII ol1o1llOII5 = ol1o1llOII2;
/* 576 */               Ol1OlloIO ol1OlloIO5 = ol1OlloIO;
/* 578 */               OIo1Oi1l1lI oIo1Oi1l1lI5 = oIo1Oi1l1lI;
/* 581 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 625 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(iO01II.I000O01llI0(Ol0iOOO0.I0000oI00(i0I1I0.I00000oOI(o1ooIo101ll, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1, iO0ioilo.I00000oIO), 1.0f), 16.0f, 0.0f, 2), 0.0f, oIo1Oi1l1lI5.I0000O(), 0.0f, 0.0f, 13);
/* 631 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 643 */               OIo1i1 oIo1i1I00000oOI = iO01II.I00000oOI(0.0f, 0.0f, oIo1Oi1l1lI5.I00000oIO() + 80.0f, 5);
/* 665 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(arrayList) | iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000II(function1) | iloI0lOlll1.I000II(function12);
/* 666 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 670 */               if (zI000OOo1O || objI00O0i0ii == IOl11li.I00000oIO) {
/* 681 */                   z = true;
/* 682 */                   I0O0loI1i i0O0loI1i = new I0O0loI1i(1);
/* 685 */                   i0O0loI1i.I00iiO = arrayList;
/* 687 */                   i0O0loI1i.I00iio = ol1o0O0O02;
/* 689 */                   i0O0loI1i.I00iiI = oI10i0Il2;
/* 693 */                   i0O0loI1i.I00ilI0I1 = ol1o1llOII5;
/* 695 */                   i0O0loI1i.I00ilO0 = o1ol100o0O;
/* 697 */                   i0O0loI1i.I00io1l = function1;
/* 699 */                   i0O0loI1i.I00ioIO = function12;
/* 701 */                   VarHandle.storeStoreFence();
/* 704 */                   iloI0lOlll1.I00iio(i0O0loI1i);
                            obj4 = i0O0loI1i;
                        } else {
/* 677 */                   z = true;
                            obj4 = objI00O0i0ii;
                        }
/* 727 */               l0oIiiI1O0o.I00000oIO(o1ooiI111iI000OiO, null, oIo1i1I00000oOI, i1IioII0000oI00, null, null, false, null, (Function1) obj4, iloI0lOlll1, 24576, 490);
/* 732 */               II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00l0OO0IO;
/* 734 */               II1oili iI1oili = II1oili.I00000oIO;
/* 753 */               lOIli1Ol.I00000oOI(ol1OlloIO5, iO01II.I000OiO(iI1oili.I00000oOI(o1ooIo101ll, iI0O01li0), 0.0f, 0.0f, 0.0f, 32.0f, 7), null, iloI0lOlll1, 6);
/* 808 */               II1oOI10.I00000oIO(iI1oili.I00000oOI(i0I1I0.I00000oIO(Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), oIo1Oi1l1lI5.I00000oIO()), i1O10l1io1iO.I000lI(IOOi1I.I000O01llI0(IOOiio0i.I00000oIO(IOOiio0i.I000lI), IOOiio0i.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1)))), iI0O01li0), iloI0lOlll1, 0);
/* 811 */               iloI0lOlll1.I0010I0i(z);
                    } else {
/* 816 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 819 */           return OoiIlOl1iI.I00000oIO;
                }
            }

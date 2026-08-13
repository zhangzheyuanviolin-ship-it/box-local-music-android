            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class iOl0ll0OI1II {
                /* JADX WARN: Multi-variable type inference failed */
                public static final OIl1Oli I00000oIO(IIliIi1O0OiO iIliIi1O0OiO, OlOO00iI0lI olOO00iI0lI, Map map) {
                    LinkedHashMap linkedHashMap;
                    OIl1Oli oIl1Oli;
                    boolean z;
                    IoiO1O1 ioiO1O1;
                    IIo1loI0 iIo1loI0I00000oIO;
/* 7 */             String str = iIliIi1O0OiO.I00000oIO;
/* 9 */             LinkedHashMap linkedHashMap2 = olOO00iI0lI.I00iio;
/* 13 */            ArrayList arrayList = new ArrayList();
/* 18 */            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 23 */            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 28 */            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
/* 39 */            Iterator it = ((O1OOIoo01I) olOO00iI0lI.I00ilI0I1.entrySet()).iterator();
/* 85 */            do {
/* 50 */                OIl1Oli oIl1Oli2 = null;
/* 51 */                if (!it.hasNext()) {
/* 113 */                   for (IIo1loI0 iIo1loI0 : olOO00iI0lI.I00io1l) {
/* 121 */                       ArrayList arrayList2 = iIo1loI0.I00000oOI;
/* 123 */                       int i = iIo1loI0.I00000oIO;
/* 129 */                       if (arrayList2.size() == 1) {
/* 139 */                           Surface surface = (Surface) map.get(OlOO0I1.I00000oIO(i));
/* 141 */                           if (surface != null) {
/* 155 */                               linkedHashMap4.put(OIl1lI0ll101.I00000oIO(((OlOIo0l1O0Ol) IOOi0Ool1i.I00OilO00Il(arrayList2)).I00000oIO), surface);
                                    }
                                } else {
/* 159 */                           Iterator it2 = arrayList2.iterator();
/* 167 */                           while (it2.hasNext()) {
/* 173 */                               OlOIo0l1O0Ol olOIo0l1O0Ol = (OlOIo0l1O0Ol) it2.next();
/* 175 */                               Object obj = linkedHashMap2.get(olOIo0l1O0Ol);
/* 179 */                               OIl1Oli oIl1Oli3 = oIl1Oli2;
/* 181 */                               if (obj == null) {
/* 224 */                                   I000II.I001IO000("Required value was null.");
/* 227 */                                   return oIl1Oli3;
                                        }
/* 191 */                               OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap5.get((OlOIo0) obj);
/* 208 */                               Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(OlOO0I1.I00000oIO(i));
/* 210 */                               if (surface2 != null) {
/* 218 */                                   linkedHashMap4.put(OIl1lI0ll101.I00000oIO(olOIo0l1O0Ol.I00000oIO), surface2);
                                        }
/* 221 */                               oIl1Oli2 = oIl1Oli3;
                                    }
                                }
                            }
/* 228 */                   OIl1Oli oIl1Oli4 = oIl1Oli2;
/* 232 */                   Iterator it3 = olOO00iI0lI.I00iiO.iterator();
/* 236 */                   OIl1Oli oIl1Oli5 = oIl1Oli4;
/* 242 */                   while (it3.hasNext()) {
/* 248 */                       OlOIo0 olOIo0 = (OlOIo0) it3.next();
/* 250 */                       ArrayList arrayList3 = olOIo0.I000l1;
/* 252 */                       ArrayList arrayList4 = olOIo0.I000l1;
/* 254 */                       List list = olOIo0.I000iOII;
/* 256 */                       l1I0oI l1i0oi = olOIo0.I0001Ioi1lo;
/* 258 */                       Integer num = olOIo0.I0000oI00;
/* 260 */                       Iterator it4 = it3;
/* 262 */                       String str2 = olOIo0.I0000O;
/* 268 */                       ArrayList arrayList5 = new ArrayList();
/* 271 */                       Iterator it5 = arrayList3.iterator();
/* 279 */                       while (it5.hasNext()) {
/* 285 */                           ArrayList arrayList6 = arrayList4;
/* 301 */                           Surface surface3 = (Surface) map.get(OlOO0I1.I00000oIO(((IIo1loI0) it5.next()).I00000oIO));
/* 303 */                           if (surface3 != null) {
/* 305 */                               arrayList5.add(surface3);
                                    }
/* 308 */                           arrayList4 = arrayList6;
                                }
/* 311 */                       ArrayList arrayList7 = arrayList4;
/* 317 */                       OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap5.get(olOIo0);
/* 319 */                       LinkedHashMap linkedHashMap6 = linkedHashMap5;
/* 327 */                       if (outputConfiguration2 == null) {
/* 406 */                           if (l1i0oi != null) {
/* 408 */                               linkedHashMap = linkedHashMap4;
/* 414 */                               oIl1Oli = oIl1Oli5;
/* 420 */                               if (arrayList5.size() != arrayList3.size()) {
/* 477 */                                   I0oiIOi00lo1 i0oiIOi00lo1I00000oIO = lo1iloiI1.I00000oIO(null, null, l1i0oi, olOIo0.I000II, olOIo0.I000O01llI0, olOIo0.I000OOo1O, list, olOIo0.I00000oOI, arrayList7.size() > 1, num != null ? num.intValue() : -1, !str2.equals(str) ? str2 : oIl1Oli4, 2);
/* 481 */                                   if (i0oiIOi00lo1I00000oIO == null) {
/* 495 */                                       Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + olOIo0);
                                            } else {
/* 500 */                                       arrayList.add(i0oiIOi00lo1I00000oIO);
/* 503 */                                       Iterator it6 = arrayList3.iterator();
/* 511 */                                       while (it6.hasNext()) {
/* 525 */                                           linkedHashMap3.put(OlOO0I1.I00000oIO(((IIo1loI0) it6.next()).I00000oIO), i0oiIOi00lo1I00000oIO);
                                                }
                                            }
                                        }
                                    } else {
/* 529 */                               linkedHashMap = linkedHashMap4;
/* 531 */                               oIl1Oli = oIl1Oli5;
                                    }
/* 541 */                           if (arrayList5.size() != arrayList3.size()) {
/* 714 */                               ArrayList arrayList8 = new ArrayList();
/* 717 */                               Iterator it7 = arrayList3.iterator();
/* 725 */                               while (it7.hasNext()) {
/* 727 */                                   Object next = it7.next();
/* 744 */                                   if (!map.containsKey(OlOO0I1.I00000oIO(((IIo1loI0) next).I00000oIO))) {
/* 746 */                                       arrayList8.add(next);
                                            }
                                        }
/* 752 */                               I000II.I000o00OoI0I("Surfaces are not yet available for ", olOIo0, "! Missing surfaces for ", arrayList8, 33);
/* 755 */                               return oIl1Oli4;
                                    }
/* 606 */                           I0oiIOi00lo1 i0oiIOi00lo1I00000oIO2 = lo1iloiI1.I00000oIO((Surface) IOOi0Ool1i.I001lllioOl(arrayList5), null, null, olOIo0.I000II, olOIo0.I000O01llI0, olOIo0.I000OOo1O, list, olOIo0.I00000oOI, arrayList7.size() > 1, num != null ? num.intValue() : -1, !str2.equals(str) ? str2 : oIl1Oli4, 6);
/* 610 */                           if (i0oiIOi00lo1I00000oIO2 == 0) {
/* 624 */                               Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + olOIo0);
                                    } else {
/* 629 */                               z = true;
/* 634 */                               Iterator it8 = IOOi0Ool1i.I001iOo1i0O(arrayList5, 1).iterator();
/* 642 */                               while (it8.hasNext()) {
/* 652 */                                   i0oiIOi00lo1I00000oIO2.I00iOIl.addSurface((Surface) it8.next());
                                        }
/* 656 */                               IIo1lioOolol iIo1lioOolol = iIliIi1O0OiO.I0000oI00;
/* 658 */                               if (iIo1lioOolol != null) {
/* 666 */                                   IIo1loI0 iIo1loI02 = (IIo1loI0) olOO00iI0lI.I00iiI.get(iIo1lioOolol);
/* 668 */                                   if (iIo1loI02 == null) {
/* 694 */                                       I000II.I001IO000("Postview Stream in StreamGraph cannot be null for reprocessing request");
/* 697 */                                       return oIl1Oli4;
                                            }
/* 670 */                                   if (oIl1Oli == null && arrayList3.contains(iIo1loI02)) {
/* 678 */                                       oIl1Oli5 = i0oiIOi00lo1I00000oIO2;
/* 680 */                                       it3 = it4;
/* 682 */                                       linkedHashMap5 = linkedHashMap6;
/* 684 */                                       linkedHashMap4 = linkedHashMap;
                                            } else {
/* 688 */                                       arrayList.add(i0oiIOi00lo1I00000oIO2);
                                            }
                                        } else {
/* 698 */                                   arrayList.add(i0oiIOi00lo1I00000oIO2);
                                        }
/* 702 */                               it3 = it4;
/* 704 */                               linkedHashMap5 = linkedHashMap6;
/* 706 */                               linkedHashMap4 = linkedHashMap;
/* 708 */                               oIl1Oli5 = oIl1Oli;
                                    }
                                } else {
/* 337 */                           if (arrayList5.size() != arrayList3.size()) {
/* 356 */                               ArrayList arrayList9 = new ArrayList();
/* 359 */                               Iterator it9 = arrayList3.iterator();
/* 367 */                               while (it9.hasNext()) {
/* 369 */                                   Object next2 = it9.next();
/* 386 */                                   if (!map.containsKey(OlOO0I1.I00000oIO(((IIo1loI0) next2).I00000oIO))) {
/* 388 */                                       arrayList9.add(next2);
                                            }
                                        }
/* 394 */                               I000II.I000o00OoI0I("Surfaces are not yet available for ", olOIo0, "! Missing surfaces for ", arrayList9, 33);
/* 397 */                               return oIl1Oli4;
                                    }
/* 344 */                           arrayList.add(new I0oiIOi00lo1(outputConfiguration2));
/* 347 */                           linkedHashMap = linkedHashMap4;
/* 349 */                           oIl1Oli = oIl1Oli5;
                                }
/* 351 */                       z = true;
/* 702 */                       it3 = it4;
/* 704 */                       linkedHashMap5 = linkedHashMap6;
/* 706 */                       linkedHashMap4 = linkedHashMap;
/* 708 */                       oIl1Oli5 = oIl1Oli;
                            }
/* 762 */                   OIl1Oli oIl1Oli6 = new OIl1Oli();
/* 765 */                   oIl1Oli6.I00000oIO = arrayList;
/* 767 */                   oIl1Oli6.I00000oOI = linkedHashMap3;
/* 771 */                   oIl1Oli6.I0000Il00O = oIl1Oli5;
/* 775 */                   oIl1Oli6.I0000O = linkedHashMap4;
/* 777 */                   VarHandle.storeStoreFence();
/* 1638 */                  return oIl1Oli6;
                        }
/* 57 */                Map.Entry entry = (Map.Entry) it.next();
/* 65 */                int i2 = ((OlOO0I1) entry.getKey()).I00000oIO;
/* 71 */                ioiO1O1 = (IoiO1O1) entry.getValue();
/* 73 */                iIo1loI0I00000oIO = olOO00iI0lI.I00000oIO(i2);
/* 77 */                if (iIo1loI0I00000oIO == null) {
/* 99 */                    I000II.I001IO000("Required value was null.");
/* 50 */                    return null;
                        }
/* 85 */            } while (iIo1loI0I00000oIO.I00000oOI.size() == 1);
/* 92 */            OOoOl0i.I00000oIO.I00000oOI(I0oiIIi01.class);
/* 95 */            ioiO1O1.getClass();
/* 98 */            throw null;
                }

                public static final O1OOII I00000oOI(Map map, OlOO00iI0lI olOO00iI0lI) {
/* 3 */             O1OOII o1ooii = new O1OOII();
/* 16 */            for (IIo1loI0 iIo1loI0 : olOO00iI0lI.I00io1l) {
/* 34 */                Surface surface = (Surface) map.get(OlOO0I1.I00000oIO(iIo1loI0.I00000oIO));
/* 36 */                if (surface != null) {
/* 41 */                    Iterator it = iIo1loI0.I00000oOI.iterator();
/* 49 */                    while (it.hasNext()) {
/* 63 */                        o1ooii.put(OIl1lI0ll101.I00000oIO(((OlOIo0l1O0Ol) it.next()).I00000oIO), surface);
                            }
                        }
                    }
/* 67 */            return o1ooii.I00000oOI();
                }
            }

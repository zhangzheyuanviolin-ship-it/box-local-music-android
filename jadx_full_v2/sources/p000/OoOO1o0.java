            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class OoOO1o0 {
                public static final OoOO1o0 I00000oIO = new OoOO1o0();

                public static ArrayList I00000oIO(AbstractCollection abstractCollection, IlliIl1l11O illiIl1l11O) {
/* 3 */             ArrayList arrayList = new ArrayList(abstractCollection);
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) it.next();
/* 26 */                if (!arrayList.isEmpty()) {
/* 29 */                    Iterator it2 = arrayList.iterator();
                            while (true) {
/* 37 */                        if (!it2.hasNext()) {
                                    break;
                                }
/* 43 */                        Ol0O0iI0l0O ol0O0iI0l0O2 = (Ol0O0iI0l0O) it2.next();
/* 45 */                        if (ol0O0iI0l0O2 != ol0O0iI0l0O && ((Boolean) illiIl1l11O.invoke(ol0O0iI0l0O2, ol0O0iI0l0O)).booleanValue()) {
/* 59 */                            it.remove();
                                    break;
                                }
                            }
                        }
                    }
/* 89 */            return arrayList;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v11, types: [OoOI1i1i] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r1v9, types: [OoOI1i1i] */
                /* JADX WARN: Type inference failed for: r7v15, types: [Ol0O0iI0l0O] */
                /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v3 */
                /* JADX WARN: Type inference failed for: r7v4, types: [O0iIl1, Ol0O0iI0l0O, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v9 */
                /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set] */
                public final Ol0O0iI0l0O I00000oOI(ArrayList arrayList) {
                    Ol0O0iI0l0O ol0O0iI0l0OI00000oIO;
/* 1 */             arrayList.size();
/* 6 */             ArrayList arrayList2 = new ArrayList();
/* 9 */             Iterator it = arrayList.iterator();
/* 20 */            while (it.hasNext()) {
/* 26 */                Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) it.next();
/* 34 */                if (ol0O0iI0l0O.I00iOIl() instanceof Iooo1o0oiOo) {
/* 40 */                    Collection collectionI0000oI00 = ol0O0iI0l0O.I00iOIl().I0000oI00();
/* 52 */                    ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(collectionI0000oI00, 10));
/* 55 */                    Iterator it2 = collectionI0000oI00.iterator();
/* 63 */                    while (it2.hasNext()) {
/* 71 */                        Ol0O0iI0l0O ol0O0iI0l0OI00000oOI = ilOiIOII1.I00000oOI((O0iIl1) it2.next());
/* 79 */                        if (ol0O0iI0l0O.I00iiI()) {
/* 81 */                            ol0O0iI0l0OI00000oOI = ol0O0iI0l0OI00000oOI.I00li1OI(true);
                                }
/* 85 */                        arrayList3.add(ol0O0iI0l0OI00000oOI);
                            }
/* 89 */                    arrayList2.addAll(arrayList3);
                        } else {
/* 93 */                    arrayList2.add(ol0O0iI0l0O);
                        }
                    }
/* 97 */            OoOO0i1iIOlI ooOO0i1iIOlII00000oIO = OoOO0i1iIOlI.I00iOIl;
/* 99 */            Iterator it3 = arrayList2.iterator();
/* 107 */           while (it3.hasNext()) {
/* 115 */               ooOO0i1iIOlII00000oIO = ooOO0i1iIOlII00000oIO.I00000oIO((Ooioo0o1l0) it3.next());
                    }
/* 122 */           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 125 */           Iterator it4 = arrayList2.iterator();
/* 134 */           while (it4.hasNext()) {
/* 140 */               Ol0O0iI0l0O ol0O0iI0l0OI00li1OI = (Ol0O0iI0l0O) it4.next();
/* 144 */               if (ooOO0i1iIOlII00000oIO == OoOO0i1iIOlI.I00iio) {
/* 148 */                   if (ol0O0iI0l0OI00li1OI instanceof OIIOlOIoOO) {
/* 150 */                       OIIOlOIoOO oIIOlOIoOO = (OIIOlOIoOO) ol0O0iI0l0OI00li1OI;
/* 165 */                       ol0O0iI0l0OI00li1OI = new OIIOlOIoOO(oIIOlOIoOO.I00iiI, oIIOlOIoOO.I00iiO, oIIOlOIoOO.I00iio, oIIOlOIoOO.I00ilI0I1, oIIOlOIoOO.I00ilO0, true);
                            }
/* 169 */                   Ol0O0iI0l0O ol0O0iI0l0OI0000O = lo1iloiI1.I0000O(ol0O0iI0l0OI00li1OI, false);
/* 183 */                   ol0O0iI0l0OI00li1OI = (ol0O0iI0l0OI0000O == null && (ol0O0iI0l0OI0000O = lOOIol01.I00000oOI(ol0O0iI0l0OI00li1OI)) == null) ? ol0O0iI0l0OI00li1OI.I00li1OI(false) : ol0O0iI0l0OI0000O;
                        }
/* 187 */               linkedHashSet.add(ol0O0iI0l0OI00li1OI);
                    }
/* 199 */           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 202 */           Iterator it5 = arrayList.iterator();
/* 210 */           while (it5.hasNext()) {
/* 222 */               arrayList4.add(((Ol0O0iI0l0O) it5.next()).I00OloOo());
                    }
/* 226 */           Iterator it6 = arrayList4.iterator();
/* 234 */           Ol0O0iI0l0O ol0O0iI0l0O2 = null;
/* 237 */           if (!it6.hasNext()) {
/* 634 */               OoOil11Ol1o.I000OiO("Empty collection can't be reduced.");
/* 234 */               return null;
                    }
/* 239 */           ?? next = it6.next();
/* 247 */           while (it6.hasNext()) {
/* 253 */               OoOI1i1i ooOI1i1i = (OoOI1i1i) it6.next();
/* 255 */               next = (OoOI1i1i) next;
/* 257 */               IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 263 */               if (!next.isEmpty() || !ooOI1i1i.isEmpty()) {
/* 274 */                   ArrayList arrayList5 = new ArrayList();
/* 285 */                   Iterator it7 = ((ConcurrentHashMap) iIlio101Io.I00iiI).values().iterator();
/* 293 */                   while (it7.hasNext()) {
/* 301 */                       int iIntValue = ((Number) it7.next()).intValue();
/* 311 */                       I11O0Ol i11O0Ol = (I11O0Ol) next.I00iOIl.get(iIntValue);
/* 319 */                       I11O0Ol i11O0Ol2 = (I11O0Ol) ooOI1i1i.I00iOIl.get(iIntValue);
/* 321 */                       if (i11O0Ol != null) {
/* 338 */                           if (!O0000Ioio00.I0000O(i11O0Ol2, i11O0Ol)) {
/* 341 */                               i11O0Ol = null;
                                    }
/* 342 */                           i11O0Ol2 = i11O0Ol;
                                } else if (i11O0Ol2 == null || !O0000Ioio00.I0000O(i11O0Ol, i11O0Ol2)) {
/* 332 */                           i11O0Ol2 = null;
                                }
/* 343 */                       iiIiiol0.I00000oIO(arrayList5, i11O0Ol2);
                            }
/* 347 */                   next = IIlio101Io.I00ll1(arrayList5);
                        }
                    }
/* 352 */           OoOI1i1i ooOI1i1i2 = (OoOI1i1i) next;
/* 358 */           if (linkedHashSet.size() == 1) {
/* 364 */               ol0O0iI0l0OI00000oIO = (Ol0O0iI0l0O) IOOi0Ool1i.I00OOll1(linkedHashSet);
                    } else {
/* 385 */               ArrayList arrayListI00000oIO = I00000oIO(linkedHashSet, new IliI1Ii1II(2, this, OoOO1o0.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 8));
/* 389 */               arrayListI00000oIO.isEmpty();
/* 392 */               IooOll1o0I[] iooOll1o0IArr = IooOll1o0I.I00iOIl;
/* 398 */               if (!arrayListI00000oIO.isEmpty()) {
/* 402 */                   Iterator it8 = arrayListI00000oIO.iterator();
/* 410 */                   if (!it8.hasNext()) {
/* 630 */                       OoOil11Ol1o.I000OiO("Empty collection can't be reduced.");
/* 234 */                       return null;
                            }
/* 412 */                   Ol0O0iI0l0O next2 = it8.next();
/* 420 */                   while (it8.hasNext()) {
/* 426 */                       Ol0O0iI0l0O ol0O0iI0l0O3 = (Ol0O0iI0l0O) it8.next();
                                next2 = next2;
/* 430 */                       if (next2 != 0 && ol0O0iI0l0O3 != null) {
/* 435 */                           OoOIOoO1I ooOIOoO1II00iOIl = next2.I00iOIl();
/* 439 */                           OoOIOoO1I ooOIOoO1II00iOIl2 = ol0O0iI0l0O3.I00iOIl();
/* 443 */                           boolean z = ooOIOoO1II00iOIl instanceof IooOo1lO0iO;
/* 445 */                           if (z && (ooOIOoO1II00iOIl2 instanceof IooOo1lO0iO)) {
/* 453 */                               Set set = ((IooOo1lO0iO) ooOIOoO1II00iOIl).I00iOIl;
/* 457 */                               Set set2 = ((IooOo1lO0iO) ooOIOoO1II00iOIl2).I00iOIl;
/* 463 */                               Set setI00iiO = IOOi0Ool1i.I00iiO(set);
/* 467 */                               IOOii0O10Io0.I00100l0(setI00iiO, set2);
/* 472 */                               IooOo1lO0iO iooOo1lO0iO = new IooOo1lO0iO();
/* 477 */                               OoOI1i1i.I00iiI.getClass();
/* 480 */                               OoOI1i1i ooOI1i1i3 = OoOI1i1i.I00iiO;
/* 482 */                               Il0olOol il0olOol = Il0olOol.I00iiO;
/* 490 */                               Il0ol1 il0ol1I00000oIO = Il0ooiloI.I00000oIO(il0olOol, true, "unknown integer literal type");
/* 494 */                               Il01100l il01100l = Il01100l.I00iOIl;
/* 496 */                               l0loOIIo0iOo.I0000O(ooOI1i1i3, iooOo1lO0iO, il01100l, false, il0ol1I00000oIO);
/* 501 */                               I1lOO0Ii00 i1lOO0Ii00 = new I1lOO0Ii00(10);
/* 504 */                               VarHandle.storeStoreFence();
/* 512 */                               iooOo1lO0iO.I00iiI = new OllO00oiil(i1lOO0Ii00);
/* 514 */                               iooOo1lO0iO.I00iOIl = setI00iiO;
/* 516 */                               VarHandle.storeStoreFence();
/* 527 */                               next2 = l0loOIIo0iOo.I0000O(ooOI1i1i3, iooOo1lO0iO, il01100l, false, Il0ooiloI.I00000oIO(il0olOol, true, "unknown integer literal type"));
                                    } else if (z) {
/* 542 */                               if (((IooOo1lO0iO) ooOIOoO1II00iOIl).I00iOIl.contains(ol0O0iI0l0O3)) {
/* 544 */                                   next2 = ol0O0iI0l0O3;
                                        }
                                    } else if (!(ooOIOoO1II00iOIl2 instanceof IooOo1lO0iO) || !((IooOo1lO0iO) ooOIOoO1II00iOIl2).I00iOIl.contains(next2)) {
                                    }
                                }
/* 547 */                       next2 = 0;
                            }
/* 567 */                   ol0O0iI0l0O2 = next2;
                        }
/* 569 */               if (ol0O0iI0l0O2 != null) {
/* 571 */                   ol0O0iI0l0OI00000oIO = ol0O0iI0l0O2;
                        } else {
/* 577 */                   OIIiioOilI.I00000oOI.getClass();
/* 595 */                   ArrayList arrayListI00000oIO2 = I00000oIO(arrayListI00000oIO, new IliI1Ii1II(2, OIIiii0l1oI0.I00000oOI, OIIil1l0IioO.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 9));
/* 599 */                   arrayListI00000oIO2.isEmpty();
/* 621 */                   ol0O0iI0l0OI00000oIO = arrayListI00000oIO2.size() < 2 ? (Ol0O0iI0l0O) IOOi0Ool1i.I00OOll1(arrayListI00000oIO2) : new Iooo1o0oiOo(linkedHashSet).I00000oIO();
                        }
                    }
/* 625 */           return ol0O0iI0l0OI00000oIO.I00lli11(ooOI1i1i2);
                }
            }

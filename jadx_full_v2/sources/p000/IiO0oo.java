            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.WildcardType;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IiO0oo implements IllOOo00lI {
                public final int I00iOIl;
                public IiO10i1 I00iiI;

                public IiO0oo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:115:0x0264  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    Type[] lowerBounds;
                    OIoi0IIoi oIoi0IIoi;
                    Collection collection;
                    int iI00II0Ol1O0l;
/* 3 */             int i = this.I00iOIl;
/* 7 */             Type type = null;
/* 8 */             z = false;
/* 8 */             boolean z = false;
/* 9 */             int i2 = 1;
/* 10 */            IiO10i1 iiO10i1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 875 */                   return Oolli0oi0.I00000oOI(iiO10i1.I001lloI());
                        case 1:
/* 791 */                   if (iiO10i1.I00100l0()) {
/* 801 */                       Object objI00IoIO0lI = IOOi0Ool1i.I00IoIO0lI(iiO10i1.I001l0I00().I00000oIO());
/* 812 */                       ParameterizedType parameterizedType = objI00IoIO0lI instanceof ParameterizedType ? (ParameterizedType) objI00IoIO0lI : null;
/* 827 */                       if (O0000Ioio00.I0000O(parameterizedType != null ? parameterizedType.getRawType() : null, IOoil1iiIilo.class)) {
/* 833 */                           Object objI00II0oii1o = I1IoiO1l.I00II0oii1o(parameterizedType.getActualTypeArguments());
/* 844 */                           WildcardType wildcardType = objI00II0oii1o instanceof WildcardType ? (WildcardType) objI00II0oii1o : null;
/* 845 */                           if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
/* 858 */                               type = (Type) I1IoiO1l.I001IO000(lowerBounds);
                                    }
                                }
                            }
                            return type == null ? iiO10i1.I001l0I00().I0001Ioi1lo() : type;
                        case 2:
/* 487 */                   ArrayList arrayList = new ArrayList();
/* 490 */                   IIiO00o1o iIiO00o1oI001lloI = iiO10i1.I001lloI();
/* 494 */                   Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 513 */                   O0ioOi0Oo1ii o0ioOi0Oo1iiI00iiI = iIiO00o1oI001lloI.I00OI1() != null ? ((OI000ilOol) iIiO00o1oI001lloI.I000lI()).I00iiI() : null;
/* 514 */                   if (o0ioOi0Oo1iiI00iiI != null) {
/* 518 */                       int size = arrayList.size();
/* 522 */                       O0Ioo0o o0Ioo0o = O0Ioo0o.I00iOIl;
/* 526 */                       IiO10OlIOi0I iiO10OlIOi0I = new IiO10OlIOi0I(0);
/* 529 */                       iiO10OlIOi0I.I00iiI = o0ioOi0Oo1iiI00iiI;
/* 531 */                       VarHandle.storeStoreFence();
/* 537 */                       arrayList.add(new IiO1l1i(iiO10i1, size, o0Ioo0o, iiO10OlIOi0I));
                            }
/* 540 */                   IIiO00o1o iIiO00o1oI001lloI2 = iiO10i1.I001lloI();
/* 546 */                   if (iIiO00o1oI001lloI2 instanceof IiOoI01) {
/* 549 */                       IiOoI01 iiOoI01 = (IiOoI01) iIiO00o1oI001lloI2;
/* 559 */                       oIoi0IIoi = new OIoi0IIoi(iiOoI01.I0100i, iiOoI01.I00oooO.I00o0iI0io1);
                            } else if (iIiO00o1oI001lloI2 instanceof IiOo1oO101oi) {
/* 568 */                       IiOo1oO101oi iiOo1oO101oi = (IiOo1oO101oi) iIiO00o1oI001lloI2;
/* 578 */                       oIoi0IIoi = new OIoi0IIoi(iiOo1oO101oi.I00ooIo0, iiOo1oO101oi.I00oo1iO0ll.I00o0iI0io1);
                            } else if (iIiO00o1oI001lloI2 instanceof OOOIoo1o1) {
/* 589 */                       OOOO01l oOOO01l = ((OOOIoo1o1) iIiO00o1oI001lloI2).I00ioIO;
/* 598 */                       IiOo1oO101oi iiOo1oO101oi2 = oOOO01l instanceof IiOo1oO101oi ? (IiOo1oO101oi) oOOO01l : null;
/* 613 */                       oIoi0IIoi = iiOo1oO101oi2 != null ? new OIoi0IIoi(iiOo1oO101oi2.I00ooIo0, iiOo1oO101oi2.I00oo1iO0ll.I00o0iI0io1) : null;
                            }
/* 614 */                   if (oIoi0IIoi == null) {
/* 616 */                       collection = Il01100l.I00iOIl;
                            } else {
/* 621 */                       OI1IlOlol oI1IlOlol = (OI1IlOlol) oIoi0IIoi.I00iOIl;
/* 625 */                       List list = (List) oIoi0IIoi.I00iiI;
/* 627 */                       List listI00Ol1ll1 = iIiO00o1oI001lloI2.I00Ol1ll1();
/* 639 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00Ol1ll1, 10));
/* 646 */                       int i3 = 0;
/* 651 */                       for (Object obj : listI00Ol1ll1) {
/* 657 */                           int i4 = i3 + 1;
/* 659 */                           if (i3 < 0) {
/* 708 */                               IOOi1I.I000lI();
/* 711 */                               throw null;
                                    }
/* 661 */                           O0ioOi0Oo1ii o0ioOi0Oo1ii = (O0ioOi0Oo1ii) obj;
/* 703 */                           arrayList2.add(new Ooo00oi0O(iIiO00o1oI001lloI2, null, i3, o0ioOi0Oo1ii.getAnnotations(), OI1Iio0ii1.I0000O(oI1IlOlol.getString(((OOi0iiO0iOi) list.get(i3)).I00ilI0I1)), o0ioOi0Oo1ii.getType(), false, false, false, null, OlI1o0ooI.I00IO1));
/* 706 */                           i3 = i4;
                                }
/* 712 */                       collection = arrayList2;
                            }
/* 716 */                   int size2 = collection.size();
/* 720 */                   for (int i5 = 0; i5 < size2; i5++) {
/* 724 */                       int size3 = arrayList.size();
/* 728 */                       O0Ioo0o o0Ioo0o2 = O0Ioo0o.I00iiI;
/* 733 */                       IOoliil1Il iOoliil1Il = new IOoliil1Il(2);
/* 736 */                       iOoliil1Il.I00iiO = collection;
/* 738 */                       iOoliil1Il.I00iiI = i5;
/* 740 */                       VarHandle.storeStoreFence();
/* 746 */                       arrayList.add(new IiO1l1i(iiO10i1, size3, o0Ioo0o2, iOoliil1Il));
                            }
/* 756 */                   O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll1 = iiO10i1.I001lloI().I00OOll1();
/* 760 */                   if (o0ioOi0Oo1iiI00OOll1 != null) {
/* 764 */                       int size4 = arrayList.size();
/* 768 */                       O0Ioo0o o0Ioo0o3 = O0Ioo0o.I00iiO;
/* 772 */                       IiO10OlIOi0I iiO10OlIOi0I2 = new IiO10OlIOi0I(1);
/* 775 */                       iiO10OlIOi0I2.I00iiI = o0ioOi0Oo1iiI00OOll1;
/* 777 */                       VarHandle.storeStoreFence();
/* 783 */                       arrayList.add(new IiO1l1i(iiO10i1, size4, o0Ioo0o3, iiO10OlIOi0I2));
                            }
/* 786 */                   return arrayList;
                        case 3:
/* 386 */                   IIiO00o1o iIiO00o1oI001lloI3 = iiO10i1.I001lloI();
/* 392 */                   ArrayList arrayList3 = new ArrayList();
/* 399 */                   if (!lIll0lII1.I00000oIO(iiO10i1)) {
/* 411 */                       arrayList3.addAll((List) iiO10i1.I00iiI.invoke());
                            }
/* 420 */                   int size5 = iIiO00o1oI001lloI3.I00Iooi00oi().size();
/* 424 */                   for (int i6 = 0; i6 < size5; i6++) {
/* 428 */                       int size6 = arrayList3.size();
/* 432 */                       O0Ioo0o o0Ioo0o4 = O0Ioo0o.I00iio;
/* 436 */                       IOoliil1Il iOoliil1Il2 = new IOoliil1Il(i2);
/* 439 */                       iOoliil1Il2.I00iiO = iIiO00o1oI001lloI3;
/* 441 */                       iOoliil1Il2.I00iiI = i6;
/* 443 */                       VarHandle.storeStoreFence();
/* 449 */                       arrayList3.add(new IiO1l1i(iiO10i1, size6, o0Ioo0o4, iOoliil1Il2));
                            }
/* 459 */                   if (iiO10i1.I00IO1() && (iIiO00o1oI001lloI3 instanceof O00l1iI0ol) && arrayList3.size() > 1) {
/* 478 */                       IOOiOil.I000oI1ioi(arrayList3, new IliIiio1(16));
                            }
/* 481 */                   arrayList3.trimToSize();
/* 484 */                   return arrayList3;
                        case 4:
/* 368 */                   O0iIl1 o0iIl1I0001Ioi1lo = iiO10i1.I001lloI().I0001Ioi1lo();
/* 374 */                   IiO0oo iiO0oo = new IiO0oo(i2);
/* 377 */                   iiO0oo.I00iiI = iiO10i1;
/* 379 */                   VarHandle.storeStoreFence();
/* 382 */                   return new IiOOIlll(o0iIl1I0001Ioi1lo, iiO0oo, false);
                        case 5:
/* 321 */                   List typeParameters = iiO10i1.I001lloI().getTypeParameters();
/* 333 */                   ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(typeParameters, 10));
/* 336 */                   Iterator it = typeParameters.iterator();
/* 344 */                   while (it.hasNext()) {
/* 357 */                       arrayList4.add(new O0O0iO(iiO10i1, (OoOOiO) it.next()));
                            }
/* 361 */                   return arrayList4;
                        case 6:
/* 69 */                    List<O0IooIIl00> listI000II = iiO10i1.I000II();
/* 81 */                    int size7 = (iiO10i1.I00100l0() ? 1 : 0) + listI000II.size();
/* 94 */                    if (((Boolean) iiO10i1.I00io1l.getValue()).booleanValue()) {
/* 103 */                       iI00II0Ol1O0l = 0;
/* 108 */                       for (O0IooIIl00 o0IooIIl00 : listI000II) {
/* 131 */                           iI00II0Ol1O0l += ((IiO1l1i) o0IooIIl00).I00iiO == O0Ioo0o.I00iio ? iiO10i1.I00II0Ol1O0l(o0IooIIl00) : 0;
                                }
                            } else {
/* 134 */                       List list2 = listI000II;
/* 138 */                       if ((list2 instanceof Collection) && list2.isEmpty()) {
/* 149 */                           iI00II0Ol1O0l = 0;
                                } else {
/* 151 */                           Iterator it2 = list2.iterator();
/* 155 */                           iI00II0Ol1O0l = 0;
/* 160 */                           while (it2.hasNext()) {
/* 174 */                               if (((IiO1l1i) ((O0IooIIl00) it2.next())).I00iiO == O0Ioo0o.I00iio && (iI00II0Ol1O0l = iI00II0Ol1O0l + 1) < 0) {
/* 181 */                                   IOOi1I.I000l1();
/* 184 */                                   throw null;
                                        }
                                    }
                                }
                            }
/* 187 */                   int i7 = (iI00II0Ol1O0l + 31) / 32;
/* 192 */                   Object[] objArr = new Object[size7 + i7 + 1];
/* 196 */                   Iterator it3 = listI000II.iterator();
/* 204 */                   while (it3.hasNext()) {
/* 212 */                       IiO1l1i iiO1l1i = (IiO1l1i) ((O0IooIIl00) it3.next());
/* 214 */                       boolean zI00100o1O0lo = iiO1l1i.I00100o1O0lo();
/* 218 */                       int i8 = iiO1l1i.I00iiI;
/* 220 */                       if (zI00100o1O0lo) {
/* 222 */                           IiOOIlll iiOOIlllI000l1 = iiO1l1i.I000l1();
/* 226 */                           Ill0IO ill0IO2 = Oolli0oi0.I00000oIO;
/* 228 */                           O0IiIl0il o0IiIl0ilI001IIilI0O = iiOOIlllI000l1.I001IIilI0O();
/* 239 */                           O0Ii1IOoiO o0Ii1IOoiO = o0IiIl0ilI001IIilI0O instanceof O0Ii1IOoiO ? (O0Ii1IOoiO) o0IiIl0ilI001IIilI0O : null;
/* 240 */                           if (o0Ii1IOoiO != null) {
/* 242 */                               O0OoII0ii1li o0OoII0ii1liI00O0i0ii = o0Ii1IOoiO.I00O0i0ii();
/* 252 */                               if ((o0OoII0ii1liI00O0i0ii != null ? o0OoII0ii1liI00O0i0ii.I000lI : null) != null) {
                                        }
                                    }
/* 255 */                           IiOOIlll iiOOIlllI000l12 = iiO1l1i.I000l1();
/* 259 */                           OOoOiOo01lo oOoOiOo01lo = iiOOIlllI000l12.I00iOIl;
/* 270 */                           Type typeI00000oOI = oOoOiOo01lo != null ? (Type) oOoOiOo01lo.invoke() : null;
/* 271 */                           if (typeI00000oOI == null) {
/* 274 */                               typeI00000oOI = OoOo1IIiiO.I00000oOI(iiOOIlllI000l12, false);
                                    }
/* 282 */                           objArr[i8] = Oolli0oi0.I0000Il00O(typeI00000oOI);
                                }
/* 289 */                       if (iiO1l1i.I0010I0i()) {
/* 299 */                           objArr[i8] = IiO10i1.I001IO000(iiO1l1i.I000l1());
                                }
                            }
/* 303 */                   for (int i9 = 0; i9 < i7; i9++) {
/* 311 */                       objArr[size7 + i9] = 0;
                            }
/* 316 */                   return objArr;
                        default:
/* 15 */                    List listI000II2 = iiO10i1.I000II();
/* 23 */                    if (!(listI000II2 instanceof Collection) || !listI000II2.isEmpty()) {
/* 35 */                        Iterator it4 = listI000II2.iterator();
                                while (true) {
/* 43 */                            if (it4.hasNext()) {
/* 61 */                                if (Oolli0oi0.I0000oI00(((IiO1l1i) ((O0IooIIl00) it4.next())).I000l1())) {
/* 63 */                                    z = true;
                                        }
                                    }
                                }
                            }
/* 64 */                    return Boolean.valueOf(z);
                    }
                }
            }

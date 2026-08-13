            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O0lIio0I implements Function1 {
                public final int I00iOIl;
                public O0lIlO1i I00iiI;

                public O0lIio0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:71:0x0201  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 5 */             O0lIlO1i o0lIlO1i = this.I00iiI;
/* 7 */             OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) obj;
                    switch (i) {
                        case 0:
/* 636 */                   O0lIlO1i o0lIlO1i2 = o0lIlO1i.I0000Il00O;
/* 638 */                   if (o0lIlO1i2 != null) {
/* 646 */                       return (Collection) o0lIlO1i2.I0001Ioi1lo.invoke(oI1Iio0ii1);
                            }
/* 651 */                   ArrayList arrayList = new ArrayList();
/* 666 */                   Iterator it = ((Ii1i1O0lI) o0lIlO1i.I0000oI00.invoke()).I0000Il00O(oI1Iio0ii1).iterator();
/* 674 */                   while (it.hasNext()) {
/* 682 */                       O00loo1i111O o00loo1i111OI0010o = o0lIlO1i.I0010o((OOoIOiO0) it.next());
/* 690 */                       if (o0lIlO1i.I00100o1O0lo(o00loo1i111OI0010o)) {
/* 694 */                           Object obj2 = o0lIlO1i.I00000oOI.I00iOIl;
/* 696 */                           arrayList.add(o00loo1i111OI0010o);
                                }
                            }
/* 700 */                   o0lIlO1i.I000OiO(oI1Iio0ii1, arrayList);
/* 703 */                   return arrayList;
                        case 1:
/* 191 */                   O0lIlO1i o0lIlO1i3 = o0lIlO1i.I0000Il00O;
/* 193 */                   if (o0lIlO1i3 != null) {
/* 201 */                       return (OOOO01l) o0lIlO1i3.I000II.invoke(oI1Iio0ii1);
                            }
/* 213 */                   OOoIIOoo0o oOoIIOoo0oI0000O = ((Ii1i1O0lI) o0lIlO1i.I0000oI00.invoke()).I0000O(oI1Iio0ii1);
/* 218 */                   if (oOoIIOoo0oI0000O != null) {
/* 220 */                       Field field = oOoIIOoo0oI0000O.I00000oIO;
/* 226 */                       if (!field.isEnumConstant()) {
/* 230 */                           OOo0ooi oOo0ooi = new OOo0ooi();
                                    boolean z = !Modifier.isFinal(((Field) oOoIIOoo0oI0000O.I00000oOI()).getModifiers());
/* 249 */                           o01l1ioOo0 o01l1iooo0 = o0lIlO1i.I00000oOI;
/* 251 */                           O0l1Ol1o o0l1Ol1oI00000oIO = l0oOo1lI000l.I00000oIO(o01l1iooo0, oOoIIOoo0oI0000O);
/* 255 */                           Ii1Ool1 ii1Ool1I00100l0 = o0lIlO1i.I00100l0();
/* 259 */                           iOloo0O0O ioloo0o0o = O1oIIloii0.I00iOIl;
/* 291 */                           int i2 = 0;
/* 313 */                           O00o11il o00o11ilI01101olii = O00o11il.I01101olii(ii1Ool1I00100l0, o0l1Ol1oI00000oIO, li11ilIiI0.I00000oIO(oOoIIOoo0oI0000O.I0000oI00()), z, oOoIIOoo0oI0000O.I0000Il00O(), l1I0oI.I000OiO(oOoIIOoo0oI0000O), Modifier.isFinal(((Field) oOoIIOoo0oI0000O.I00000oOI()).getModifiers()) && Modifier.isStatic(((Field) oOoIIOoo0oI0000O.I00000oOI()).getModifiers()));
/* 317 */                           oOo0ooi.I00iOIl = o00o11ilI01101olii;
/* 319 */                           o00o11ilI01101olii.I010l1ol111(null, null, null, null);
/* 341 */                           O0iIl1 o0iIl1I001lloI = ((iOliil) o01l1iooo0.I00iio).I001lloI(lIli0ooiOill.I00000oIO(field.getGenericType()), l01ill.I00000oIO(OoOilOl1.I00iiI, false, null, 7));
/* 349 */                           if ((O0i1lI0o1io.I00IO1(o0iIl1I001lloI) || O0i1lI0o1io.I00IO1oi11O(o0iIl1I001lloI)) && Modifier.isFinal(((Field) oOoIIOoo0oI0000O.I00000oOI()).getModifiers())) {
/* 383 */                               Modifier.isStatic(((Field) oOoIIOoo0oI0000O.I00000oOI()).getModifiers());
                                    }
/* 390 */                           OOOO1o oOOO1o = (OOOO1o) oOo0ooi.I00iOIl;
/* 392 */                           O0ioOi0Oo1ii o0ioOi0Oo1iiI000oI1ioi = o0lIlO1i.I000oI1ioi();
/* 397 */                           Il01100l il01100l = Il01100l.I00iOIl;
/* 400 */                           oOOO1o.I01101IOlO(o0iIl1I001lloI, il01100l, o0ioOi0Oo1iiI000oI1ioi, null, il01100l);
/* 403 */                           Ii1Ool1 ii1Ool1I00100l02 = o0lIlO1i.I00100l0();
/* 415 */                           if ((ii1Ool1I00100l02 instanceof OI000ilOol ? (OI000ilOol) ii1Ool1I00100l02 : null) != null) {
/* 421 */                               oOo0ooi.I00iOIl = (OOOO1o) oOo0ooi.I00iOIl;
                                    }
/* 423 */                           Object obj3 = oOo0ooi.I00iOIl;
/* 426 */                           Ooo0I0lliio0 ooo0I0lliio0 = (Ooo0I0lliio0) obj3;
/* 430 */                           O0iIl1 type = ((OOOO1o) obj3).getType();
/* 434 */                           if (ooo0I0lliio0 == null) {
/* 630 */                               IiOiIO0i1Oil.I00000oIO(65);
/* 633 */                               throw null;
                                    }
/* 436 */                           if (type == null) {
/* 624 */                               IiOiIO0i1Oil.I00000oIO(66);
/* 627 */                               throw null;
                                    }
/* 438 */                           int i3 = IiOiIO0i1Oil.I00000oIO;
/* 444 */                           if (!ooo0I0lliio0.I00OIo() && !l0loOi1ol11o.I00000oIO(type)) {
/* 457 */                               if (OoOilo0Oliii.I00000oOI(type)) {
/* 516 */                                   OOOO1o oOOO1o2 = (OOOO1o) oOo0ooi.I00iOIl;
/* 520 */                                   O0lIiIoO011 o0lIiIoO011 = new O0lIiIoO011(i2);
/* 523 */                                   o0lIiIoO011.I00iiI = o0lIlO1i;
/* 525 */                                   o0lIiIoO011.I00iiO = oOo0ooi;
/* 527 */                                   VarHandle.storeStoreFence();
/* 530 */                                   oOOO1o2.I010o0o0oO(null, o0lIiIoO011);
                                        } else {
/* 460 */                                   O0i1lI0o1io o0i1lI0o1ioI0000oI00 = IiOiOOIo.I0000oI00(ooo0I0lliio0);
/* 468 */                                   if (!O0i1lI0o1io.I00IO1(type)) {
/* 470 */                                       OIIil1l0IioO oIIil1l0IioO = O0iIo00.I00000oIO;
/* 480 */                                       if (oIIil1l0IioO.I00000oIO(o0i1lI0o1ioI0000oI00.I001IIilI0O(), type) || oIIil1l0IioO.I00000oIO(o0i1lI0o1ioI0000oI00.I000iOII("Number").I00Ol10(), type) || oIIil1l0IioO.I00000oIO(o0i1lI0o1ioI0000oI00.I0000oI00(), type) || OoillIolOoll.I00000oIO(type)) {
                                                }
                                            }
                                        }
                                    }
/* 533 */                           Object obj4 = oOo0ooi.I00iOIl;
/* 538 */                           if (((OOOO01l) obj4) != null) {
/* 540 */                               return (OOOO01l) obj4;
                                    }
/* 544 */                           Object[] objArr = new Object[3];
                                    switch (6) {
                                        case 1:
/* 577 */                                   objArr[0] = "member";
                                            break;
                                        case 2:
                                        case 4:
                                        case 6:
                                        case 8:
/* 572 */                                   objArr[0] = "descriptor";
                                            break;
                                        case 3:
/* 567 */                                   objArr[0] = "element";
                                            break;
                                        case 5:
/* 562 */                                   objArr[0] = "field";
                                            break;
                                        case 7:
/* 557 */                                   objArr[0] = "javaClass";
                                            break;
                                        default:
/* 552 */                                   objArr[0] = "fqName";
                                            break;
                                    }
/* 581 */                           objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                                    switch (6) {
                                        case 1:
                                        case 2:
/* 608 */                                   objArr[2] = "recordMethod";
                                            break;
                                        case 3:
                                        case 4:
/* 603 */                                   objArr[2] = "recordConstructor";
                                            break;
                                        case 5:
                                        case 6:
/* 598 */                                   objArr[2] = "recordField";
                                            break;
                                        case 7:
                                        case 8:
/* 593 */                                   objArr[2] = "recordClass";
                                            break;
                                        default:
/* 588 */                                   objArr[2] = "getClassResolvedFromSource";
                                            break;
                                    }
/* 621 */                           throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                                }
                            }
/* 217 */                   return null;
                        case 2:
/* 77 */                    LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) o0lIlO1i.I0001Ioi1lo.invoke(oI1Iio0ii1));
/* 82 */                    LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 93 */                    for (Object obj5 : linkedHashSet) {
/* 102 */                       String strI00000oIO = l1OOo1o1l.I00000oIO((Ol0IioOo) obj5, 2);
/* 106 */                       Object arrayList2 = linkedHashMap.get(strI00000oIO);
/* 110 */                       if (arrayList2 == null) {
/* 114 */                           arrayList2 = new ArrayList();
/* 117 */                           linkedHashMap.put(strI00000oIO, arrayList2);
                                }
/* 122 */                       ((List) arrayList2).add(obj5);
                            }
/* 138 */                   for (List list : linkedHashMap.values()) {
/* 150 */                       if (list.size() != 1) {
/* 152 */                           List list2 = list;
/* 156 */                           Collection collectionI00000oIO = l1lio1l1.I00000oIO(list2, IiOi0I1.I00oI0i);
/* 160 */                           linkedHashSet.removeAll(list2);
/* 163 */                           linkedHashSet.addAll(collectionI00000oIO);
                                }
                            }
/* 167 */                   o0lIlO1i.I000l1(linkedHashSet, oI1Iio0ii1);
/* 170 */                   o01l1ioOo0 o01l1iooo02 = o0lIlO1i.I00000oOI;
/* 184 */                   return IOOi0Ool1i.I00iIi0i1o(((Oi1ol0llI) ((I0l1OOl1l10) o01l1iooo02.I00iOIl).I000iOII).I000OiO(o01l1iooo02, linkedHashSet));
                        default:
/* 14 */                    ArrayList arrayList3 = new ArrayList();
/* 23 */                    iiIiiol0.I00000oIO(arrayList3, o0lIlO1i.I000II.invoke(oI1Iio0ii1));
/* 26 */                    o0lIlO1i.I000lI(oI1Iio0ii1, arrayList3);
/* 29 */                    Ii1Ool1 ii1Ool1I00100l03 = o0lIlO1i.I00100l0();
/* 33 */                    int i4 = IiOiIO0i1Oil.I00000oIO;
/* 41 */                    if (IiOiIO0i1Oil.I000l1(ii1Ool1I00100l03, IOIOllO1oli.I00ilI0I1)) {
/* 43 */                        return IOOi0Ool1i.I00iIi0i1o(arrayList3);
                            }
/* 48 */                    o01l1ioOo0 o01l1iooo03 = o0lIlO1i.I00000oOI;
/* 62 */                    return IOOi0Ool1i.I00iIi0i1o(((Oi1ol0llI) ((I0l1OOl1l10) o01l1iooo03.I00iOIl).I000iOII).I000OiO(o01l1iooo03, arrayList3));
                    }
                }
            }

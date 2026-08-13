            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IiO10l implements IllOOo00lI {
                public final int I00iOIl;
                public IiO11010IiO I00iiI;

                public IiO10l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
                /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r5v9, types: [OoloIiOi0O1l, java.lang.Object] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws NoSuchMethodException, SecurityException {
                    Object objI001lllioOl;
                    I111li i111li;
                    ?? SingletonList;
                    IIil1l iIil1lI00IOO;
                    IIil1l iIiil1l0i;
                    GenericDeclaration genericDeclarationI00Io1lO;
                    IIil1l iIil1lI00IOO2;
                    Illlil illlil;
                    Object next;
/* 1 */             int i = this.I00iOIl;
/* 6 */             int i2 = 0;
/* 7 */             IiO11010IiO iiO11010IiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 548 */                   IOIOill iOIOill = OiII0lO1i1.I00000oIO;
/* 550 */                   Illlil illlilI001lloI = iiO11010IiO.I001lloI();
/* 554 */                   O0IiOio0lo0 o0IiOio0lo0 = iiO11010IiO.I00ioIO;
/* 556 */                   l0O1Iloooo l0o1ilooooI0000Il00O = OiII0lO1i1.I0000Il00O(illlilI001lloI);
/* 562 */                   if (l0o1ilooooI0000Il00O instanceof O0I11Ii1Ol) {
/* 568 */                       if (iiO11010IiO.I00IO1()) {
/* 570 */                           Class clsI001l0I00 = o0IiOio0lo0.I001l0I00();
/* 574 */                           List listI000II = iiO11010IiO.I000II();
/* 586 */                           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 589 */                           Iterator it = listI000II.iterator();
/* 597 */                           while (it.hasNext()) {
/* 611 */                               arrayList.add(((IiO1l1i) ((O0IooIIl00) it.next())).getName());
                                    }
/* 615 */                           I111l1 i111l1 = I111l1.I00iiI;
/* 617 */                           I111lIl i111lIl = I111lIl.I00iOIl;
/* 621 */                           return new I111li(clsI001l0I00, arrayList, i111l1);
                                }
/* 645 */                       objI001lllioOl = O0IiOio0lo0.I00Io1lO(o0IiOio0lo0.I001l0I00(), (ArrayList) o0IiOio0lo0.I00IioO0OiOi(((O0I11Ii1Ol) l0o1ilooooI0000Il00O).I00000oIO.I0000Il00O, false).I00iiI);
                            } else if (l0o1ilooooI0000Il00O instanceof O0I1IIl1i0oo) {
/* 655 */                       Illlil illlilI001lloI2 = iiO11010IiO.I001lloI();
/* 667 */                       if (Ioll0il1OI.I0000Il00O(illlilI001lloI2.I000lI()) && (illlilI001lloI2 instanceof IOo1IIOOiO1o) && ((IOo1IIOOiO1o) illlilI001lloI2).I001iOo1i0O()) {
/* 683 */                           Illlil illlilI001lloI3 = iiO11010IiO.I001lloI();
/* 691 */                           String str = ((O0I1IIl1i0oo) l0o1ilooooI0000Il00O).I00000oIO.I0000Il00O;
/* 697 */                           List listI00Iooi00oi = iiO11010IiO.I001lloI().I00Iooi00oi();
/* 701 */                           ?? ooloIiOi0O1l = new OoloIiOi0O1l();
/* 710 */                           ooloIiOi0O1l.I00000oIO = o0IiOio0lo0.I001lllioOl("constructor-impl", str);
/* 736 */                           ooloIiOi0O1l.I00000oOI = o0IiOio0lo0.I001lllioOl("box-impl", OlOoOIi0o.I00IioO0OiOi(str, "V").concat(OOo1Io0I0.I00000oOI(o0IiOio0lo0.I001l0I00())));
/* 738 */                           List list = listI00Iooi00oi;
/* 746 */                           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 749 */                           Iterator it2 = list.iterator();
/* 757 */                           while (it2.hasNext()) {
/* 769 */                               Ol0O0iI0l0O ol0O0iI0l0OI00000oIO = lOoil0Io0Io.I00000oIO(((OIoioOli1I) it2.next()).getType());
/* 773 */                               List listI0000oI00 = li1O10Oli1i1.I0000oI00(ol0O0iI0l0OI00000oIO);
/* 777 */                               if (listI0000oI00 == null) {
/* 779 */                                   Class clsI000O01llI0 = li1O10Oli1i1.I000O01llI0(ol0O0iI0l0OI00000oIO);
/* 794 */                                   listI0000oI00 = clsI000O01llI0 != null ? Collections.singletonList(li1O10Oli1i1.I0000O(clsI000O01llI0, illlilI001lloI3)) : null;
                                        }
/* 795 */                               arrayList2.add(listI0000oI00);
                                    }
/* 799 */                           ooloIiOi0O1l.I0000Il00O = arrayList2;
/* 807 */                           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 818 */                           for (Object obj : list) {
/* 824 */                               int i3 = i2 + 1;
/* 826 */                               if (i2 < 0) {
/* 902 */                                   IOOi1I.I000lI();
/* 905 */                                   throw null;
                                        }
/* 842 */                               OI000ilOol oI000ilOol = (OI000ilOol) ((OIoioOli1I) obj).getType().I00iOIl().I00100o1O0lo();
/* 850 */                               List list2 = (List) ooloIiOi0O1l.I0000Il00O.get(i2);
/* 852 */                               if (list2 != null) {
/* 854 */                                   List list3 = list2;
/* 862 */                                   SingletonList = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 865 */                                   Iterator it3 = list3.iterator();
/* 873 */                                   while (it3.hasNext()) {
/* 885 */                                       SingletonList.add(((Method) it3.next()).getReturnType());
                                            }
                                        } else {
/* 893 */                                   SingletonList = Collections.singletonList(Oolli0oi0.I000O01llI0(oI000ilOol));
                                        }
/* 897 */                               arrayList3.add(SingletonList);
/* 900 */                               i2 = i3;
                                    }
/* 906 */                           ooloIiOi0O1l.I0000O = arrayList3;
/* 910 */                           ArrayList arrayList4 = new ArrayList();
/* 913 */                           Iterator it4 = arrayList3.iterator();
/* 921 */                           while (it4.hasNext()) {
/* 929 */                               IOOii0O10Io0.I00100l0(arrayList4, (Iterable) it4.next());
                                    }
/* 933 */                           ooloIiOi0O1l.I0000oI00 = arrayList4;
/* 935 */                           VarHandle.storeStoreFence();
                                    i111li = ooloIiOi0O1l;
/* 938 */                           return i111li;
                                }
/* 943 */                       O0I1Ii1l0 o0I1Ii1l0 = ((O0I1IIl1i0oo) l0o1ilooooI0000Il00O).I00000oIO;
/* 949 */                       objI001lllioOl = o0IiOio0lo0.I001lllioOl(o0I1Ii1l0.I00000oOI, o0I1Ii1l0.I0000Il00O);
                            } else if (l0o1ilooooI0000Il00O instanceof O0I110loOlOl) {
/* 960 */                       objI001lllioOl = ((O0I110loOlOl) l0o1ilooooI0000Il00O).I00000oIO;
                            } else {
/* 965 */                       if (!(l0o1ilooooI0000Il00O instanceof O0I10olI)) {
/* 1119 */                          if (!(l0o1ilooooI0000Il00O instanceof O0I10lOo)) {
/* 1176 */                              I000II.I00000oIO();
/* 5 */                                 return null;
                                    }
/* 1123 */                          List list4 = ((O0I10lOo) l0o1ilooooI0000Il00O).I00000oIO;
/* 1125 */                          Class clsI001l0I002 = o0IiOio0lo0.I001l0I00();
/* 1130 */                          List list5 = list4;
/* 1138 */                          ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(list5, 10));
/* 1141 */                          Iterator it5 = list5.iterator();
/* 1149 */                          while (it5.hasNext()) {
/* 1161 */                              arrayList5.add(((Method) it5.next()).getName());
                                    }
/* 1171 */                          i111li = new I111li(clsI001l0I002, arrayList5, I111l1.I00iiI, I111lIl.I00iOIl, list4);
/* 938 */                           return i111li;
                                }
/* 969 */                       objI001lllioOl = ((O0I10olI) l0o1ilooooI0000Il00O).I00000oIO;
                            }
/* 973 */                   if (objI001lllioOl instanceof Constructor) {
/* 981 */                       iIil1lI00IOO = iiO11010IiO.I00IO1oi11O((Constructor) objI001lllioOl, iiO11010IiO.I001lloI(), false);
                            } else {
/* 988 */                       if (!(objI001lllioOl instanceof Method)) {
/* 1116 */                          throw new Ii01OOool("Could not compute caller for function: " + iiO11010IiO.I001lloI() + " (member = " + objI001lllioOl + ')');
                                }
/* 990 */                       Method method = (Method) objI001lllioOl;
/* 1000 */                      if (!Modifier.isStatic(method.getModifiers())) {
/* 1027 */                          iIiil1l0i = lIll0lII1.I00000oIO(iiO11010IiO) ? new IIiii0lI(li1O10Oli1i1.I00000oIO(iiO11010IiO.I00l0OO0IO, iiO11010IiO.I001lloI()), method) : new IIil1I01iI(method, 0);
                                } else if (((I01O1lIi) iiO11010IiO.I001lloI()).getAnnotations().I00IOO(Oolli0oi0.I00000oIO) != null) {
/* 1063 */                          iIiil1l0i = lIll0lII1.I00000oIO(iiO11010IiO) ? new IIiil1l0i(method) : new IIil1I01iI(method);
                                } else {
/* 1067 */                          iIil1lI00IOO = iiO11010IiO.I00IOO(method, false);
                                }
/* 1023 */                      iIil1lI00IOO = iIiil1l0i;
                            }
/* 1075 */                  return li1O10Oli1i1.I00000oOI(iIil1lI00IOO, iiO11010IiO.I001lloI(), false);
                        default:
/* 12 */                    IOIOill iOIOill2 = OiII0lO1i1.I00000oIO;
/* 14 */                    Illlil illlilI001lloI4 = iiO11010IiO.I001lloI();
/* 18 */                    O0IiOio0lo0 o0IiOio0lo02 = iiO11010IiO.I00ioIO;
/* 20 */                    l0O1Iloooo l0o1ilooooI0000Il00O2 = OiII0lO1i1.I0000Il00O(illlilI001lloI4);
/* 27 */                    if (l0o1ilooooI0000Il00O2 instanceof O0I1IIl1i0oo) {
/* 29 */                        Illlil illlilI001lloI5 = iiO11010IiO.I001lloI();
/* 41 */                        if (Ioll0il1OI.I0000Il00O(illlilI001lloI5.I000lI()) && (illlilI001lloI5 instanceof IOo1IIOOiO1o) && ((IOo1IIOOiO1o) illlilI001lloI5).I001iOo1i0O()) {
/* 86 */                            throw new Ii01OOool(iiO11010IiO.I001lloI().I000lI() + " cannot have default arguments");
                                }
/* 87 */                        Illlil illlilI001lloI6 = iiO11010IiO.I001lloI();
/* 91 */                        List listI00Iooi00oi2 = illlilI001lloI6.I00Iooi00oi();
/* 99 */                        if (!(listI00Iooi00oi2 instanceof Collection) || !listI00Iooi00oi2.isEmpty()) {
/* 111 */                           Iterator it6 = listI00Iooi00oi2.iterator();
/* 119 */                           while (it6.hasNext()) {
/* 131 */                               if (((Ooo00oi0O) it6.next()).I010ioo()) {
/* 237 */                                   illlil = null;
/* 238 */                                   if (illlil == null) {
/* 246 */                                       O0I1Ii1l0 o0I1Ii1l02 = ((O0I1IIl1i0oo) OiII0lO1i1.I0000Il00O(illlil)).I00000oIO;
/* 252 */                                       genericDeclarationI00Io1lO = o0IiOio0lo02.I001lIiIIo1O(o0I1Ii1l02.I00000oOI, o0I1Ii1l02.I0000Il00O, true);
                                            } else {
/* 260 */                                       O0I1Ii1l0 o0I1Ii1l03 = ((O0I1IIl1i0oo) l0o1ilooooI0000Il00O2).I00000oIO;
/* 283 */                                       genericDeclarationI00Io1lO = o0IiOio0lo02.I001lIiIIo1O(o0I1Ii1l03.I00000oOI, o0I1Ii1l03.I0000Il00O, !Modifier.isStatic(iiO11010IiO.I001l0I00().I00000oOI().getModifiers()));
                                            }
                                        }
                                    }
/* 142 */                           if (Ioll0il1OI.I0000oI00(illlilI001lloI6.I000lI()) || !Modifier.isStatic(iiO11010IiO.I001l0I00().I00000oOI().getModifiers())) {
/* 237 */                               illlil = null;
/* 238 */                               if (illlil == null) {
                                        }
                                    } else {
/* 166 */                               Iterator it7 = IiOiOOIo.I000OiO(illlilI001lloI6).iterator();
                                        while (true) {
/* 171 */                                   IlIloII10O ilIloII10O = (IlIloII10O) it7;
/* 177 */                                   if (ilIloII10O.hasNext()) {
/* 179 */                                       next = ilIloII10O.next();
/* 186 */                                       List listI00Iooi00oi3 = ((IIiO00o1o) next).I00Iooi00oi();
/* 194 */                                       if (!(listI00Iooi00oi3 instanceof Collection) || !listI00Iooi00oi3.isEmpty()) {
/* 206 */                                           Iterator it8 = listI00Iooi00oi3.iterator();
/* 214 */                                           while (it8.hasNext()) {
/* 226 */                                               if (((Ooo00oi0O) it8.next()).I010ioo()) {
                                                        }
                                                    }
                                                }
                                            } else {
/* 229 */                                       next = null;
                                            }
                                        }
/* 232 */                               if (next instanceof Illlil) {
/* 234 */                                   illlil = (Illlil) next;
                                        }
/* 238 */                               if (illlil == null) {
                                        }
                                    }
                                } else if (Ioll0il1OI.I0000oI00(illlilI001lloI6.I000lI())) {
/* 237 */                           illlil = null;
/* 238 */                           if (illlil == null) {
                                    }
                                }
                            } else if (l0o1ilooooI0000Il00O2 instanceof O0I11Ii1Ol) {
/* 297 */                       if (iiO11010IiO.I00IO1()) {
/* 299 */                           Class clsI001l0I003 = o0IiOio0lo02.I001l0I00();
/* 303 */                           List listI000II2 = iiO11010IiO.I000II();
/* 315 */                           ArrayList arrayList6 = new ArrayList(IOOi1I.I0000O(listI000II2, 10));
/* 318 */                           Iterator it9 = listI000II2.iterator();
/* 326 */                           while (it9.hasNext()) {
/* 340 */                               arrayList6.add(((IiO1l1i) ((O0IooIIl00) it9.next())).getName());
                                    }
/* 344 */                           I111l1 i111l12 = I111l1.I00iOIl;
/* 346 */                           I111lIl i111lIl2 = I111lIl.I00iOIl;
/* 350 */                           return new I111li(clsI001l0I003, arrayList6, i111l12);
                                }
/* 360 */                       String str2 = ((O0I11Ii1Ol) l0o1ilooooI0000Il00O2).I00000oIO.I0000Il00O;
/* 362 */                       Class clsI001l0I004 = o0IiOio0lo02.I001l0I00();
/* 368 */                       ArrayList arrayList7 = new ArrayList();
/* 379 */                       O0IiOio0lo0.I00000oIO(arrayList7, (ArrayList) o0IiOio0lo02.I00IioO0OiOi(str2, false).I00iiI, true);
/* 382 */                       genericDeclarationI00Io1lO = O0IiOio0lo0.I00Io1lO(clsI001l0I004, arrayList7);
                            } else {
/* 389 */                       if (l0o1ilooooI0000Il00O2 instanceof O0I10lOo) {
/* 393 */                           List list6 = ((O0I10lOo) l0o1ilooooI0000Il00O2).I00000oIO;
/* 395 */                           Class clsI001l0I005 = o0IiOio0lo02.I001l0I00();
/* 400 */                           List list7 = list6;
/* 408 */                           ArrayList arrayList8 = new ArrayList(IOOi1I.I0000O(list7, 10));
/* 411 */                           Iterator it10 = list7.iterator();
/* 419 */                           while (it10.hasNext()) {
/* 431 */                               arrayList8.add(((Method) it10.next()).getName());
                                    }
/* 441 */                           return new I111li(clsI001l0I005, arrayList8, I111l1.I00iOIl, I111lIl.I00iOIl, list6);
                                }
/* 446 */                       genericDeclarationI00Io1lO = null;
                            }
/* 449 */                   if (genericDeclarationI00Io1lO instanceof Constructor) {
/* 457 */                       iIil1lI00IOO2 = iiO11010IiO.I00IO1oi11O((Constructor) genericDeclarationI00Io1lO, iiO11010IiO.I001lloI(), true);
                            } else if (!(genericDeclarationI00Io1lO instanceof Method)) {
/* 536 */                       iIil1lI00IOO2 = null;
                            } else if (((I01O1lIi) iiO11010IiO.I001lloI()).getAnnotations().I00IOO(Oolli0oi0.I00000oIO) == null || ((OI000ilOol) iiO11010IiO.I001lloI().I000lI()).I00lll10()) {
/* 531 */                       iIil1lI00IOO2 = iiO11010IiO.I00IOO((Method) genericDeclarationI00Io1lO, iiO11010IiO.I001l0I00().I0000Il00O());
                            } else {
/* 500 */                       Method method2 = (Method) genericDeclarationI00Io1lO;
/* 517 */                       iIil1lI00IOO2 = lIll0lII1.I00000oIO(iiO11010IiO) ? new IIiil1l0i(method2) : new IIil1I01iI(method2);
                            }
/* 537 */                   if (iIil1lI00IOO2 != null) {
/* 543 */                       return li1O10Oli1i1.I00000oOI(iIil1lI00IOO2, iiO11010IiO.I001lloI(), true);
                            }
/* 5 */                     return null;
                    }
                }
            }

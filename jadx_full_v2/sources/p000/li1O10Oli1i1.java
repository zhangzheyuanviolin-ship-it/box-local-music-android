            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class li1O10Oli1i1 {
                public static final Object I00000oIO(Object obj, IIiO00o1o iIiO00o1o) {
                    O0iIl1 o0iIl1I0000Il00O;
                    Class clsI000O01llI0;
                    return (((iIiO00o1o instanceof OOOO01l) && Ioll0il1OI.I0000O((Ooo0I0lliio0) iIiO00o1o)) || (o0iIl1I0000Il00O = I0000Il00O(iIiO00o1o)) == null || (clsI000O01llI0 = I000O01llI0(o0iIl1I0000Il00O)) == null) ? obj : I0000O(clsI000O01llI0, iIiO00o1o).invoke(obj, null);
                }

                /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
                
                    if ((r0 != null ? p000.Ioll0il1OI.I0000oI00(r0) : false) == true) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
                
                    r3 = I000O01llI0(r3);
                 */
                /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x0263  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0306  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x011f A[LOOP:3: B:72:0x0119->B:74:0x011f, LOOP_END] */
                /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Cloneable, java.util.List[]] */
                /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Cloneable, java.util.List[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IIiOlII I00000oOI(IIiOlII iIiOlII, IIiO00o1o iIiO00o1o, boolean z) throws NoSuchMethodException, SecurityException {
                    Class clsI000O01llI0;
                    Method declaredMethod;
                    Oo1ol1ll oo1ol1ll;
                    List listI0000oI00;
                    Ol0O0iI0l0O ol0O0iI0l0OI000II;
                    Iterator it;
                    List listI00Iooi00oi;
                    Iterator it2;
                    O0iIl1 o0iIl1I0001Ioi1lo;
/* 5 */             boolean z2 = false;
/* 7 */             if (!Ioll0il1OI.I00000oIO(iIiO00o1o)) {
/* 9 */                 List listI00Ol1ll1 = iIiO00o1o.I00Ol1ll1();
/* 17 */                if ((listI00Ol1ll1 instanceof Collection) && listI00Ol1ll1.isEmpty()) {
/* 69 */                    listI00Iooi00oi = iIiO00o1o.I00Iooi00oi();
/* 77 */                    if (listI00Iooi00oi instanceof Collection) {
/* 89 */                        it2 = listI00Iooi00oi.iterator();
/* 97 */                        while (it2.hasNext()) {
                                }
/* 128 */                       o0iIl1I0001Ioi1lo = iIiO00o1o.I0001Ioi1lo();
/* 132 */                       if (o0iIl1I0001Ioi1lo == null) {
                                }
                            }
                        } else {
/* 29 */                    Iterator it3 = listI00Ol1ll1.iterator();
/* 37 */                    while (it3.hasNext()) {
/* 53 */                        IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((O0ioOi0Oo1ii) it3.next()).getType().I00iOIl().I00100o1O0lo();
/* 65 */                        if (iOIiO1lIl0lI00100o1O0lo != null ? Ioll0il1OI.I0000oI00(iOIiO1lIl0lI00100o1O0lo) : false) {
                                    break;
                                }
                            }
/* 69 */                    listI00Iooi00oi = iIiO00o1o.I00Iooi00oi();
/* 77 */                    if ((listI00Iooi00oi instanceof Collection) || !listI00Iooi00oi.isEmpty()) {
/* 89 */                        it2 = listI00Iooi00oi.iterator();
/* 97 */                        while (it2.hasNext()) {
/* 113 */                           IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ((Ooo00oi0O) it2.next()).getType().I00iOIl().I00100o1O0lo();
/* 125 */                           if (iOIiO1lIl0lI00100o1O0lo2 != null ? Ioll0il1OI.I0000oI00(iOIiO1lIl0lI00100o1O0lo2) : false) {
                                        break;
                                    }
                                }
/* 128 */                       o0iIl1I0001Ioi1lo = iIiO00o1o.I0001Ioi1lo();
/* 132 */                       if (o0iIl1I0001Ioi1lo == null) {
/* 153 */                           O0iIl1 o0iIl1I0000Il00O = I0000Il00O(iIiO00o1o);
/* 157 */                           if (o0iIl1I0000Il00O != null) {
/* 163 */                               IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo3 = o0iIl1I0000Il00O.I00iOIl().I00100o1O0lo();
                                    }
/* 178 */                           return iIiOlII;
                                }
/* 138 */                       IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo4 = o0iIl1I0001Ioi1lo.I00iOIl().I00100o1O0lo();
/* 150 */                       if (!(iOIiO1lIl0lI00100o1O0lo4 != null ? Ioll0il1OI.I00000oOI(iOIiO1lIl0lI00100o1O0lo4) : false)) {
                                }
                            } else {
/* 128 */                       o0iIl1I0001Ioi1lo = iIiO00o1o.I0001Ioi1lo();
/* 132 */                       if (o0iIl1I0001Ioi1lo == null) {
                                }
                            }
                        }
                    }
/* 181 */           OoloIllIlii0 ooloIllIlii0 = new OoloIllIlii0();
/* 187 */           if (iIiOlII instanceof IIiio1) {
/* 189 */               O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll1 = iIiO00o1o.I00OOll1();
/* 193 */               if (o0ioOi0Oo1iiI00OOll1 == null) {
/* 195 */                   o0ioOi0Oo1iiI00OOll1 = iIiO00o1o.I00OI1();
                        }
/* 206 */               O0iIl1 type = o0ioOi0Oo1iiI00OOll1 != null ? o0ioOi0Oo1iiI00OOll1.getType() : null;
/* 207 */               if (type != null && Ioll0il1OI.I0001Ioi1lo(type)) {
/* 215 */                   if (z) {
/* 217 */                       List listI00Iooi00oi2 = iIiO00o1o.I00Iooi00oi();
/* 225 */                       if (!(listI00Iooi00oi2 instanceof Collection) || !listI00Iooi00oi2.isEmpty()) {
/* 237 */                           Iterator it4 = listI00Iooi00oi2.iterator();
/* 245 */                           while (it4.hasNext()) {
/* 257 */                               if (((Ooo00oi0O) it4.next()).I010ioo()) {
/* 263 */                                   ArrayList arrayListI0000oI00 = I0000oI00(lOoil0Io0Io.I00000oIO(type));
/* 275 */                                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI0000oI00, 10));
/* 278 */                                   it = arrayListI0000oI00.iterator();
/* 286 */                                   while (it.hasNext()) {
/* 303 */                                       arrayList.add(((Method) it.next()).invoke(((IIiio1) iIiOlII).I000O01llI0, null));
                                            }
/* 309 */                                   Object[] array = arrayList.toArray(new Object[0]);
/* 319 */                                   Method method = (Method) ((IIiiOiO1) iIiOlII).I00000oIO;
/* 340 */                                   IIiio1O011ll iIiio1O011ll = new IIiio1O011ll(method, false, (Type[]) I1IoiO1l.I0010I0i(array.length, method.getGenericParameterTypes()).toArray(new Type[0]));
/* 343 */                                   iIiio1O011ll.I000II = array;
/* 345 */                                   VarHandle.storeStoreFence();
/* 348 */                                   iIiOlII = iIiio1O011ll;
                                        }
                                    }
                                }
                            } else {
/* 263 */                       ArrayList arrayListI0000oI002 = I0000oI00(lOoil0Io0Io.I00000oIO(type));
/* 275 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayListI0000oI002, 10));
/* 278 */                       it = arrayListI0000oI002.iterator();
/* 286 */                       while (it.hasNext()) {
                                }
/* 309 */                       Object[] array2 = arrayList2.toArray(new Object[0]);
/* 319 */                       Method method2 = (Method) ((IIiiOiO1) iIiOlII).I00000oIO;
/* 340 */                       IIiio1O011ll iIiio1O011ll2 = new IIiio1O011ll(method2, false, (Type[]) I1IoiO1l.I0010I0i(array2.length, method2.getGenericParameterTypes()).toArray(new Type[0]));
/* 343 */                       iIiio1O011ll2.I000II = array2;
/* 345 */                       VarHandle.storeStoreFence();
/* 348 */                       iIiOlII = iIiio1O011ll2;
                            }
                        }
                    }
/* 349 */           ooloIllIlii0.I00000oIO = iIiOlII;
/* 355 */           ooloIllIlii0.I00000oOI = iIiOlII.I00000oOI();
/* 357 */           O0iIl1 o0iIl1I0001Ioi1lo2 = iIiO00o1o.I0001Ioi1lo();
/* 361 */           boolean z3 = iIiO00o1o instanceof Illlil;
/* 363 */           if ((z3 && ((Illlil) iIiO00o1o).I00100l0() && (ol0O0iI0l0OI000II = Ioll0il1OI.I000II(o0iIl1I0001Ioi1lo2)) != null && O0i1lI0o1io.I00IO1(ol0O0iI0l0OI000II)) || clsI000O01llI0 == null) {
/* 386 */               declaredMethod = null;
                    } else {
                        try {
/* 408 */                   declaredMethod = clsI000O01llI0.getDeclaredMethod("box-impl", I0000O(clsI000O01llI0, iIiO00o1o).getReturnType());
                        } catch (NoSuchMethodException unused) {
/* 417 */                   IOOlIIilOl0.I000OiO("No box method found in inline class: ", clsI000O01llI0, " (calling ", iIiO00o1o);
/* 186 */                   return null;
                        }
                    }
/* 425 */           int i = 2;
/* 426 */           if (Ioll0il1OI.I00000oIO(iIiO00o1o)) {
/* 434 */               oo1ol1ll = new Oo1ol1ll(IooO11l.I00iio, new List[0], declaredMethod, i);
                    } else {
/* 441 */               int i2 = -1;
/* 442 */               if ((!(iIiOlII instanceof IIiio1) || ((IIiio1) iIiOlII).I000II) && !(iIiOlII instanceof IIiio1O011ll)) {
/* 459 */                   if (iIiO00o1o instanceof IOo1IIOOiO1o) {
/* 463 */                       if (!(iIiOlII instanceof II1Oloo00lil)) {
/* 466 */                           i2 = 0;
                                }
                            } else if (iIiO00o1o.I00OI1() != null && !(iIiOlII instanceof II1Oloo00lil) && !Ioll0il1OI.I0000oI00(iIiO00o1o.I000lI())) {
/* 489 */                       i2 = 1;
                            }
                        }
/* 502 */               int i3 = iIiOlII instanceof IIiio1O011ll ? -((IIiio1O011ll) iIiOlII).I000II.length : i2;
/* 503 */               Member memberI00000oOI = iIiOlII.I00000oOI();
/* 509 */               ArrayList arrayList3 = new ArrayList();
/* 512 */               O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll12 = iIiO00o1o.I00OOll1();
/* 523 */               O0iIl1 type2 = o0ioOi0Oo1iiI00OOll12 != null ? o0ioOi0Oo1iiI00OOll12.getType() : null;
/* 524 */               if (type2 != null) {
/* 526 */                   arrayList3.add(type2);
                        } else if (iIiO00o1o instanceof IOo1IIOOiO1o) {
/* 537 */                   OI000ilOol oI000ilOolI001l0I00 = ((IOo1IIOOiO1o) iIiO00o1o).I001l0I00();
/* 545 */                   if (oI000ilOolI001l0I00.I000iOII()) {
/* 557 */                       arrayList3.add(((OI000ilOol) oI000ilOolI001l0I00.I000lI()).I00Ol10());
                            }
                        } else {
/* 561 */                   Ii1Ool1 ii1Ool1I000lI = iIiO00o1o.I000lI();
/* 567 */                   if (ii1Ool1I000lI instanceof OI000ilOol) {
/* 569 */                       OI000ilOol oI000ilOol = (OI000ilOol) ii1Ool1I000lI;
/* 575 */                       if (Ioll0il1OI.I0000oI00(oI000ilOol)) {
/* 577 */                           if (memberI00000oOI == null) {
/* 616 */                               arrayList3.add(oI000ilOol.I00Ol10());
                                    } else {
/* 598 */                               if (memberI00000oOI.getDeclaringClass() == null ? false : !OOoOl0i.I00000oIO.I00000oOI(r12).I000o00OoI0I()) {
/* 608 */                                   arrayList3.add(OoOilo0Oliii.I000O01llI0(oI000ilOol.I00Ol10(), true));
                                        }
                                    }
                                }
                            }
                        }
/* 625 */               Iterator it5 = iIiO00o1o.I00Iooi00oi().iterator();
/* 633 */               while (it5.hasNext()) {
/* 645 */                   arrayList3.add(((Ooo00oi0O) it5.next()).getType());
                        }
/* 649 */               Iterator it6 = arrayList3.iterator();
/* 653 */               int size = 0;
/* 658 */               while (it6.hasNext()) {
/* 670 */                   ArrayList arrayListI0000oI003 = I0000oI00(lOoil0Io0Io.I00000oIO((O0iIl1) it6.next()));
/* 682 */                   size += arrayListI0000oI003 != null ? arrayListI0000oI003.size() : 1;
                        }
/* 709 */               int i4 = size + i3 + (z ? ((size + 31) / 32) + 1 : 0) + ((z3 && ((Illlil) iIiO00o1o).I00100l0()) ? 1 : 0);
/* 714 */               if (iOil0li.I00000oIO(ooloIllIlii0) != i4) {
/* 925 */                   StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
/* 932 */                   sb.append(iOil0li.I00000oIO(ooloIllIlii0));
/* 937 */                   sb.append(" != ");
/* 940 */                   sb.append(i4);
/* 945 */                   sb.append("\nCalling: ");
/* 948 */                   sb.append(iIiO00o1o);
/* 953 */                   List listI00000oIO = ooloIllIlii0.I00000oIO.I00000oIO();
/* 959 */                   sb.append("\nParameter types: ");
/* 962 */                   sb.append(listI00000oIO);
/* 967 */                   sb.append(")\nDefault: ");
/* 970 */                   sb.append(z);
/* 2160 */                  throw new Ii01OOool(sb.toString());
                        }
/* 725 */               IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(Math.max(i2, 0), arrayList3.size() + i2);
/* 729 */               ?? r14 = new List[i4];
/* 732 */               for (int i5 = 0; i5 < i4; i5++) {
/* 734 */                   int i6 = iooO11lI000O01llI0.I00iOIl;
/* 738 */                   if (i5 > iooO11lI000O01llI0.I00iiI || i6 > i5) {
/* 775 */                       listI0000oI00 = null;
                            } else {
/* 750 */                       Ol0O0iI0l0O ol0O0iI0l0OI00000oIO = lOoil0Io0Io.I00000oIO((O0iIl1) arrayList3.get(i5 - i2));
/* 754 */                       listI0000oI00 = I0000oI00(ol0O0iI0l0OI00000oIO);
/* 758 */                       if (listI0000oI00 == null) {
/* 760 */                           Class clsI000O01llI02 = I000O01llI0(ol0O0iI0l0OI00000oIO);
/* 764 */                           if (clsI000O01llI02 != null) {
/* 770 */                               listI0000oI00 = Collections.singletonList(I0000O(clsI000O01llI02, iIiO00o1o));
                                    }
                                }
                            }
/* 776 */                   r14[i5] = listI0000oI00;
                        }
/* 783 */               oo1ol1ll = new Oo1ol1ll(iooO11lI000O01llI0, r14, declaredMethod, i);
                    }
/* 789 */           List[] listArr = (List[]) oo1ol1ll.I00iiO;
/* 791 */           ooloIllIlii0.I0000Il00O = oo1ol1ll;
/* 793 */           O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 797 */           IIiOlII iIiOlII2 = ooloIllIlii0.I00000oIO;
/* 815 */           int length = iIiOlII2 instanceof IIiio1O011ll ? ((IIiio1O011ll) iIiOlII2).I000II.length : iIiOlII2 instanceof IIiio1 ? 1 : 0;
/* 816 */           if (length > 0) {
/* 822 */               o101lO1I0000oI00.add(lIiioliIlo.I000O01llI0(0, length));
                    }
/* 825 */           int length2 = listArr.length;
/* 826 */           int i7 = 0;
/* 827 */           while (i7 < length2) {
/* 829 */               List list = listArr[i7];
/* 839 */               int size2 = (list != null ? list.size() : 1) + length;
/* 844 */               o101lO1I0000oI00.add(lIiioliIlo.I000O01llI0(length, size2));
/* 847 */               i7++;
/* 849 */               length = size2;
                    }
/* 863 */           ooloIllIlii0.I0000O = (IooO11l[]) IOOi1I.I0000Il00O(o101lO1I0000oI00).toArray(new IooO11l[0]);
/* 867 */           Iterable iterable = (IooO11l) oo1ol1ll.I00iiI;
/* 871 */           if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
/* 883 */               Iterator it7 = iterable.iterator();
                        while (true) {
/* 892 */                   if (!((IooO10lI) it7).I00iiO) {
                                break;
                            }
/* 901 */                   List list2 = listArr[((IooIlO1) it7).nextInt()];
/* 903 */                   if (list2 != null && list2.size() > 1) {
/* 912 */                       z2 = true;
                                break;
                            }
                        }
                    }
/* 913 */           ooloIllIlii0.I0000oI00 = z2;
/* 915 */           VarHandle.storeStoreFence();
/* 918 */           return ooloIllIlii0;
                }

                public static final O0iIl1 I0000Il00O(IIiO00o1o iIiO00o1o) {
/* 1 */             O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll1 = iIiO00o1o.I00OOll1();
/* 5 */             O0ioOi0Oo1ii o0ioOi0Oo1iiI00OI1 = iIiO00o1o.I00OI1();
/* 9 */             if (o0ioOi0Oo1iiI00OOll1 != null) {
/* 11 */                return o0ioOi0Oo1iiI00OOll1.getType();
                    }
/* 17 */            if (o0ioOi0Oo1iiI00OI1 != null) {
/* 22 */                if (iIiO00o1o instanceof IOo1IIOOiO1o) {
/* 24 */                    return o0ioOi0Oo1iiI00OI1.getType();
                        }
/* 29 */                Ii1Ool1 ii1Ool1I000lI = iIiO00o1o.I000lI();
/* 40 */                OI000ilOol oI000ilOol = ii1Ool1I000lI instanceof OI000ilOol ? (OI000ilOol) ii1Ool1I000lI : null;
/* 41 */                if (oI000ilOol != null) {
/* 43 */                    return oI000ilOol.I00Ol10();
                        }
                    }
/* 16 */            return null;
                }

                public static final Method I0000O(Class cls, IIiO00o1o iIiO00o1o) {
                    try {
/* 4 */                 return cls.getDeclaredMethod("unbox-impl", null);
                    } catch (NoSuchMethodException unused) {
/* 13 */                IOOlIIilOl0.I000OiO("No unbox method found in inline class: ", cls, " (calling ", iIiO00o1o);
/* 1 */                 return null;
                    }
                }

                public static final ArrayList I0000oI00(Ol0O0iI0l0O ol0O0iI0l0O) {
/* 5 */             ArrayList arrayListI0001Ioi1lo = I0001Ioi1lo(lOoil0Io0Io.I00000oIO(ol0O0iI0l0O));
/* 10 */            if (arrayListI0001Ioi1lo == null) {
/* 9 */                 return null;
                    }
/* 20 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI0001Ioi1lo, 10));
/* 23 */            Iterator it = arrayListI0001Ioi1lo.iterator();
/* 31 */            while (it.hasNext()) {
/* 53 */                arrayList.add("unbox-impl-" + ((String) it.next()));
                    }
/* 67 */            Class clsI000O01llI0 = Oolli0oi0.I000O01llI0((OI000ilOol) ol0O0iI0l0O.I00iOIl().I00100o1O0lo());
/* 77 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 80 */            Iterator it2 = arrayList.iterator();
/* 88 */            while (it2.hasNext()) {
/* 100 */               arrayList2.add(clsI000O01llI0.getDeclaredMethod((String) it2.next(), null));
                    }
/* 104 */           return arrayList2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
                public static final ArrayList I0001Ioi1lo(Ol0O0iI0l0O ol0O0iI0l0O) {
                    ?? SingletonList;
/* 6 */             if (!Ioll0il1OI.I0001Ioi1lo(ol0O0iI0l0O)) {
/* 5 */                 return null;
                    }
/* 16 */            OI000ilOol oI000ilOol = (OI000ilOol) ol0O0iI0l0O.I00iOIl().I00100o1O0lo();
/* 18 */            int i = IiOiOOIo.I00000oIO;
/* 20 */            OoloOii00O ooloOii00OI00lli11 = oI000ilOol.I00lli11();
/* 31 */            ArrayList<OIoi0IIoi> arrayList = (ooloOii00OI00lli11 instanceof OI0O10 ? (OI0O10) ooloOii00OI00lli11 : null).I00000oIO;
/* 35 */            ArrayList arrayList2 = new ArrayList();
/* 46 */            for (OIoi0IIoi oIoi0IIoi : arrayList) {
/* 56 */                OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) oIoi0IIoi.I00iOIl;
/* 62 */                ArrayList arrayListI0001Ioi1lo = I0001Ioi1lo((Ol0O0iI0l0O) oIoi0IIoi.I00iiI);
/* 66 */                if (arrayListI0001Ioi1lo != null) {
/* 76 */                    SingletonList = new ArrayList(IOOi1I.I0000O(arrayListI0001Ioi1lo, 10));
/* 79 */                    Iterator it = arrayListI0001Ioi1lo.iterator();
/* 87 */                    while (it.hasNext()) {
/* 116 */                       SingletonList.add(oI1Iio0ii1.I0000Il00O() + '-' + ((String) it.next()));
                            }
                        } else {
/* 124 */                   SingletonList = Collections.singletonList(oI1Iio0ii1.I0000Il00O());
                        }
/* 130 */               IOOii0O10Io0.I00100l0(arrayList2, (Iterable) SingletonList);
                    }
/* 134 */           return arrayList2;
                }

                public static final Class I000II(Ii1Ool1 ii1Ool1) {
/* 3 */             if (!(ii1Ool1 instanceof OI000ilOol) || !Ioll0il1OI.I00000oOI(ii1Ool1)) {
/* 64 */                return null;
                    }
/* 12 */            OI000ilOol oI000ilOol = (OI000ilOol) ii1Ool1;
/* 14 */            Class clsI000O01llI0 = Oolli0oi0.I000O01llI0(oI000ilOol);
/* 18 */            if (clsI000O01llI0 != null) {
/* 20 */                return clsI000O01llI0;
                    }
/* 27 */            StringBuilder sb = new StringBuilder("Class object for the class ");
/* 34 */            sb.append(oI000ilOol.getName());
/* 39 */            IOIOill iOIOillI0001Ioi1lo = IiOiOOIo.I0001Ioi1lo((IOIiO1lIl0l) ii1Ool1);
/* 45 */            sb.append(" cannot be found (classId=");
/* 48 */            sb.append(iOIOillI0001Ioi1lo);
/* 53 */            sb.append(')');
/* 63 */            throw new Ii01OOool(sb.toString());
                }

                public static final Class I000O01llI0(O0iIl1 o0iIl1) {
                    Ol0O0iI0l0O ol0O0iI0l0OI000II;
/* 9 */             Class clsI000II = I000II(o0iIl1.I00iOIl().I00100o1O0lo());
/* 13 */            if (clsI000II == null) {
/* 43 */                return null;
                    }
/* 20 */            if (OoOilo0Oliii.I0000oI00(o0iIl1) && ((ol0O0iI0l0OI000II = Ioll0il1OI.I000II(o0iIl1)) == null || OoOilo0Oliii.I0000oI00(ol0O0iI0l0OI000II) || O0i1lI0o1io.I00IO1(ol0O0iI0l0OI000II))) {
/* 43 */                return null;
                    }
/* 42 */            return clsI000II;
                }
            }

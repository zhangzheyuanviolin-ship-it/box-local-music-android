            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
/* 47 */    public final class IiOl1ioiiol1 extends I00o0iI0io1 {
                public final int I00iiO = 0;
                public final O1I0II11i I00iio;
                public final I00lll10 I00ilI0I1;

                /* JADX WARN: Illegal instructions before constructor call */
                public IiOl1ioiiol1(IiOlI10iOI iiOlI10iOI) {
/* 4 */             this.I00ilI0I1 = iiOlI10iOI;
/* 6 */             IiOili0lOO1 iiOili0lOO1 = iiOlI10iOI.I00ll1;
/* 16 */            super((O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO);
/* 25 */            O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 30 */            IiOl00l00 iiOl00l00 = new IiOl00l00(6);
/* 33 */            iiOl00l00.I00iiI = iiOlI10iOI;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            o1I0OloI.getClass();
/* 46 */            this.I00iio = new O1I0II11i(o1I0OloI, iiOl00l00);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:103:0x023f  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0253  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0260  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0294  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
                /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r4v31 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Collection I00000oIO() throws Throwable {
                    String strI00000oOI;
                    Ill0IO ill0IOI00000oIO;
                    Class cls;
                    ?? arrayList;
                    String str;
                    OlO0111 olO0111;
                    Ill0IO ill0IO;
                    Ill0IO ill0IO2;
                    ArrayList arrayList2;
                    Ol0O0iI0l0O ol0O0iI0l0OI00000oOI;
/* 3 */             int i = this.I00iiO;
/* 5 */             I00lll10 i00lll10 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 696 */                   IiOlI10iOI iiOlI10iOI = (IiOlI10iOI) i00lll10;
/* 698 */                   OOOi0i1IOo oOOi0i1IOo = iiOlI10iOI.I00ilI0I1;
/* 700 */                   IiOili0lOO1 iiOili0lOO1 = iiOlI10iOI.I00ll1;
/* 706 */                   List listI000OOo1O = lIOOli.I000OOo1O(oOOi0i1IOo, (Oi0Oooi) iiOili0lOO1.I00ilI0I1);
/* 718 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI000OOo1O, 10));
/* 721 */                   Iterator it = listI000OOo1O.iterator();
/* 729 */                   while (it.hasNext()) {
/* 745 */                       arrayList3.add(((IOiOol0) iiOili0lOO1.I00l0I0l0lO1).I00Io1lO((OOi001oo1OOI) it.next()));
                            }
/* 763 */                   ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(arrayList3, ((I0OI00O) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000lI).I00O0o1oo(iiOlI10iOI));
/* 769 */                   ArrayList arrayList4 = new ArrayList();
/* 772 */                   Iterator it2 = arrayListI00O10llo.iterator();
/* 780 */                   while (it2.hasNext()) {
/* 792 */                       IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((O0iIl1) it2.next()).I00iOIl().I00100o1O0lo();
/* 804 */                       OIIoolO0i oIIoolO0i = iOIiO1lIl0lI00100o1O0lo instanceof OIIoolO0i ? (OIIoolO0i) iOIiO1lIl0lI00100o1O0lo : null;
/* 805 */                       if (oIIoolO0i != null) {
/* 807 */                           arrayList4.add(oIIoolO0i);
                                }
                            }
/* 815 */                   if (!arrayList4.isEmpty()) {
/* 823 */                       Il0oiOlO1ooI il0oiOlO1ooI = (Il0oiOlO1ooI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000O01llI0;
/* 831 */                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(arrayList4, 10));
/* 834 */                       Iterator it3 = arrayList4.iterator();
/* 842 */                       while (it3.hasNext()) {
/* 848 */                           OIIoolO0i oIIoolO0i2 = (OIIoolO0i) it3.next();
/* 850 */                           IOIOill iOIOillI0001Ioi1lo = IiOiOOIo.I0001Ioi1lo(oIIoolO0i2);
/* 854 */                           if (iOIOillI0001Ioi1lo == null || (ill0IOI00000oIO = iOIOillI0001Ioi1lo.I00000oIO()) == null || (strI00000oOI = ill0IOI00000oIO.I00000oIO.I00000oIO) == null) {
/* 872 */                               strI00000oOI = oIIoolO0i2.getName().I00000oOI();
                                    }
/* 876 */                           arrayList5.add(strI00000oOI);
                                }
/* 880 */                       il0oiOlO1ooI.I00000oOI(iiOlI10iOI, arrayList5);
                            }
/* 883 */                   return IOOi0Ool1i.I00iIi0i1o(arrayListI00O10llo);
                        default:
/* 12 */                    O0l1i0l o0l1i0l = (O0l1i0l) i00lll10;
/* 14 */                    o01l1ioOo0 o01l1iooo0 = o0l1i0l.I00l0OO0IO;
/* 18 */                    Class cls2 = o0l1i0l.I00ioIO.I00000oIO;
/* 20 */                    cls = Object.class;
/* 22 */                    boolean zEquals = cls2.equals(cls);
/* 27 */                    Il01100l il01100l = Il01100l.I00iOIl;
/* 29 */                    if (zEquals) {
/* 31 */                        arrayList = il01100l;
                            } else {
/* 35 */                        OlIOOOoi0IlI olIOOOoi0IlI = new OlIOOOoi0IlI(2);
/* 38 */                        Type genericSuperclass = cls2.getGenericSuperclass();
/* 46 */                        olIOOOoi0IlI.I00000oIO(genericSuperclass != null ? genericSuperclass : Object.class);
/* 53 */                        olIOOOoi0IlI.I00000oOI(cls2.getGenericInterfaces());
/* 56 */                        ArrayList arrayList6 = olIOOOoi0IlI.I00000oIO;
/* 68 */                        List listI000O01llI0 = IOOi1I.I000O01llI0(arrayList6.toArray(new Type[arrayList6.size()]));
/* 80 */                        arrayList = new ArrayList(IOOi1I.I0000O(listI000O01llI0, 10));
/* 83 */                        Iterator it4 = listI000O01llI0.iterator();
/* 91 */                        while (it4.hasNext()) {
/* 104 */                           arrayList.add(new OOoI10lllo((Type) it4.next()));
                                }
                            }
/* 114 */                   ArrayList arrayList7 = new ArrayList(arrayList.size());
/* 120 */                   ArrayList arrayList8 = new ArrayList(0);
/* 127 */                   I111oOiIiO0 i111oOiIiO0I00IOO = o0l1i0l.I00oO101o.I00IOO(O0I01I.I000o00OoI0I);
/* 132 */                   if (i111oOiIiO0I00IOO != null) {
/* 147 */                       Object objI00Oio = IOOi0Ool1i.I00Oio(i111oOiIiO0I00IOO.I00111O().values());
/* 158 */                       OlOlol0il01 olOlol0il01 = objI00Oio instanceof OlOlol0il01 ? (OlOlol0il01) objI00Oio : null;
/* 159 */                       if (olOlol0il01 != null && (str = (String) olOlol0il01.I00000oIO) != null) {
/* 168 */                           OlO0111 olO01112 = OlO0111.I00iOIl;
/* 170 */                           int length = str.length();
/* 174 */                           int i2 = 0;
                                    while (true) {
/* 175 */                               if (i2 < length) {
/* 177 */                                   char cCharAt = str.charAt(i2);
/* 181 */                                   int iOrdinal = olO01112.ordinal();
/* 185 */                                   if (iOrdinal != 0) {
/* 187 */                                       if (iOrdinal != 1) {
/* 189 */                                           if (iOrdinal != 2) {
/* 192 */                                               I000II.I00000oIO();
/* 195 */                                               return null;
                                                    }
                                                } else if (cCharAt == '.') {
/* 202 */                                           olO0111 = OlO0111.I00iiO;
/* 204 */                                           olO01112 = olO0111;
/* 223 */                                           i2++;
                                                } else if (Character.isJavaIdentifierPart(cCharAt)) {
/* 223 */                                           i2++;
                                                }
                                            }
/* 217 */                                   if (Character.isJavaIdentifierStart(cCharAt)) {
/* 220 */                                       olO0111 = OlO0111.I00iiI;
/* 204 */                                       olO01112 = olO0111;
/* 223 */                                       i2++;
                                            }
                                        } else {
/* 232 */                                   ill0IO = olO01112 != OlO0111.I00iiO ? new Ill0IO(str) : null;
                                        }
                                    }
                                }
                            }
/* 235 */                   if (ill0IO != null) {
/* 237 */                       Ill0OI0lo ill0OI0lo = ill0IO.I00000oIO;
/* 243 */                       if (ill0OI0lo.I0000Il00O() || !ill0OI0lo.I000O01llI0(OlIlllOI1.I000iOII)) {
/* 254 */                           ill0IO = null;
                                }
                            }
/* 255 */                   if (ill0IO == null) {
/* 257 */                       LinkedHashMap linkedHashMap = IlII0olo.I00000oIO;
/* 269 */                       ill0IO2 = (Ill0IO) IlII0olo.I00000oOI.get(IiOiOOIo.I000II(o0l1i0l));
/* 271 */                       if (ill0IO2 == null) {
/* 273 */                           ol0O0iI0l0OI00000oOI = null;
                                }
/* 467 */                       for (OOoI10lllo oOoI10lllo : arrayList) {
/* 488 */                           O0iIl1 o0iIl1I001lloI = ((iOliil) o01l1iooo0.I00iio).I001lloI(oOoI10lllo, l01ill.I00000oIO(OoOilOl1.I00iOIl, false, null, 7));
/* 520 */                           O0iIl1 o0iIl1I000OOo1O = ((Oi1ol0llI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000iOII).I000OOo1O(new Ol0IO1iloi(null, false, o01l1iooo0, I11I1111oi0.I00ilI0I1, true), o0iIl1I001lloI, il01100l, null, false);
/* 524 */                           if (o0iIl1I000OOo1O == null) {
/* 526 */                               o0iIl1I000OOo1O = o0iIl1I001lloI;
                                    }
/* 537 */                           if (o0iIl1I000OOo1O.I00iOIl().I00100o1O0lo() instanceof OIIoolO0i) {
/* 539 */                               arrayList8.add(oOoI10lllo);
                                    }
/* 558 */                           if (!O0000Ioio00.I0000O(o0iIl1I000OOo1O.I00iOIl(), ol0O0iI0l0OI00000oOI != null ? ol0O0iI0l0OI00000oOI.I00iOIl() : null) && !O0i1lI0o1io.I001i1lo1io(o0iIl1I000OOo1O)) {
/* 567 */                               arrayList7.add(o0iIl1I000OOo1O);
                                    }
                                }
/* 572 */                       OI000ilOol oI000ilOol = o0l1i0l.I00l0I0l0lO1;
/* 597 */                       iiIiiol0.I00000oIO(arrayList7, oI000ilOol == null ? new OoOilII0(l11o1O1.I00000oIO(oI000ilOol, o0l1i0l)).I000O01llI0(oI000ilOol.I00Ol10(), Ooo0Ioii0o0.I00iiO) : null);
/* 600 */                       iiIiiol0.I00000oIO(arrayList7, ol0O0iI0l0OI00000oOI);
/* 607 */                       if (!arrayList8.isEmpty()) {
/* 689 */                           return !arrayList7.isEmpty() ? IOOi0Ool1i.I00iIi0i1o(arrayList7) : Collections.singletonList(((OI0011) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000O01llI0).I00iio.I0000oI00());
                                }
/* 609 */                       Object obj = o01l1iooo0.I00iOIl;
/* 617 */                       ArrayList arrayList9 = new ArrayList(IOOi1I.I0000O(arrayList8, 10));
/* 620 */                       Iterator it5 = arrayList8.iterator();
/* 628 */                       while (it5.hasNext()) {
/* 644 */                           arrayList9.add(((OOoI10lllo) ((OOoIlii) it5.next())).I00000oIO.toString());
                                }
/* 656 */                       OoOil11Ol1o.I000l1("Incomplete hierarchy for class ", o0l1i0l.getName(), ", unresolved classes ", arrayList9);
/* 571 */                       return null;
                            }
/* 276 */                   ill0IO2 = ill0IO;
/* 283 */                   OI0011 oi0011 = (OI0011) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000O01llI0;
/* 285 */                   OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00ioIO;
/* 287 */                   int i3 = IiOiOOIo.I00000oIO;
/* 289 */                   Ill0OI0lo ill0OI0lo2 = ill0IO2.I00000oIO;
/* 291 */                   ill0OI0lo2.I0000Il00O();
/* 308 */                   IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = oi0011.I00i0ilIl0i(ill0IO2.I00000oOI()).I00io1l.I0000oI00(ill0OI0lo2.I000II(), oIIl0iOOlo);
/* 319 */                   OI000ilOol oI000ilOol2 = iOIiO1lIl0lI0000oI00 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI0000oI00 : null;
/* 320 */                   if (oI000ilOol2 != null) {
/* 331 */                       int size = oI000ilOol2.I000OOo1O().I000II().size();
/* 337 */                       List listI000II = o0l1i0l.I00o0l1o1o0.I000II();
/* 341 */                       int size2 = listI000II.size();
/* 345 */                       if (size2 == size) {
/* 347 */                           List list = listI000II;
/* 355 */                           arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 358 */                           Iterator it6 = list.iterator();
/* 366 */                           while (it6.hasNext()) {
/* 385 */                               arrayList2.add(new OlIo1I(((OoOOiO) it6.next()).I00Ol10(), Ooo0Ioii0o0.I00iiO));
                                    }
                                } else {
/* 389 */                           if (size2 == 1 && size > 1 && ill0IO == null) {
/* 409 */                               OlIo1I olIo1I = new OlIo1I(((OoOOiO) IOOi0Ool1i.I00OilO00Il(listI000II)).I00Ol10(), Ooo0Ioii0o0.I00iiO);
/* 414 */                               IooO11l iooO11l = new IooO11l(1, size, 1);
/* 423 */                               ArrayList arrayList10 = new ArrayList(IOOi1I.I0000O(iooO11l, 10));
/* 426 */                               Iterator it7 = iooO11l.iterator();
/* 435 */                               while (((IooO10lI) it7).I00iiO) {
/* 440 */                                   ((IooIlO1) it7).nextInt();
/* 443 */                                   arrayList10.add(olIo1I);
                                        }
/* 447 */                               arrayList2 = arrayList10;
                                    }
/* 273 */                           ol0O0iI0l0OI00000oOI = null;
                                }
/* 450 */                       OoOI1i1i.I00iiI.getClass();
/* 455 */                       ol0O0iI0l0OI00000oOI = l0loOIIo0iOo.I00000oOI(OoOI1i1i.I00iiO, oI000ilOol2, arrayList2);
                            }
/* 467 */                   while (r16.hasNext()) {
                            }
/* 572 */                   OI000ilOol oI000ilOol3 = o0l1i0l.I00l0I0l0lO1;
/* 597 */                   iiIiiol0.I00000oIO(arrayList7, oI000ilOol3 == null ? new OoOilII0(l11o1O1.I00000oIO(oI000ilOol3, o0l1i0l)).I000O01llI0(oI000ilOol3.I00Ol10(), Ooo0Ioii0o0.I00iiO) : null);
/* 600 */                   iiIiiol0.I00000oIO(arrayList7, ol0O0iI0l0OI00000oOI);
/* 607 */                   if (!arrayList8.isEmpty()) {
                            }
                            break;
                    }
                }

                @Override
                public final O1oO0lOoI1 I0000Il00O() {
                    switch (this.I00iiO) {
                        case 0:
                            break;
                        default:
/* 12 */                    Object obj = ((O0l1i0l) this.I00ilI0I1).I00l0OO0IO.I00iOIl;
                            break;
                    }
/* 14 */            return O1oO0lOoI1.I00io1l;
                }

                @Override
                public final List I000II() {
                    switch (this.I00iiO) {
                    }
/* 12 */            return (List) this.I00iio.invoke();
                }

                @Override
                public final OI000ilOol I00100o1O0lo() {
/* 1 */             int i = this.I00iiO;
/* 3 */             I00lll10 i00lll10 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 11 */                    return (IiOlI10iOI) i00lll10;
                        default:
/* 8 */                     return (O0l1i0l) i00lll10;
                    }
                }

                @Override
                public final IOIiO1lIl0l I00100o1O0lo() {
/* 1 */             int i = this.I00iiO;
/* 3 */             I00lll10 i00lll10 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 11 */                    return (IiOlI10iOI) i00lll10;
                        default:
/* 8 */                     return (O0l1i0l) i00lll10;
                    }
                }

                @Override
                public final boolean I0010I0i() {
                    switch (this.I00iiO) {
                    }
/* 6 */             return true;
                }

                public final String toString() {
/* 1 */             int i = this.I00iiO;
/* 3 */             I00lll10 i00lll10 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 25 */                    return ((IiOlI10iOI) i00lll10).getName().I00iOIl;
                        default:
/* 14 */                    return ((O0l1i0l) i00lll10).getName().I00000oOI();
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 48 */        public IiOl1ioiiol1(O0l1i0l o0l1i0l) {
/* 49 */            this.I00ilI0I1 = o0l1i0l;
/* 50 */            o01l1ioOo0 o01l1iooo0 = o0l1i0l.I00l0OO0IO;
/* 53 */            super((O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO);
/* 55 */            O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO;
/* 57 */            O0l1OllIOil0 o0l1OllIOil0 = new O0l1OllIOil0(2);
                    o0l1OllIOil0.I00iiI = o0l1i0l;
/* 58 */            VarHandle.storeStoreFence();
/* 61 */            this.I00iio = new O1I0II11i(o1I0OloI, o0l1OllIOil0);
                }
            }

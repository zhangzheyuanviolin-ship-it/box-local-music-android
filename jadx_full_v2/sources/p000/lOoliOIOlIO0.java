            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            
            public abstract class lOoliOIOlIO0 {
                public static final boolean I00000oIO(O0iIl1 o0iIl1, OoOIOoO1I ooOIOoO1I, Set set) {
                    OoOi1Ol ooOi1Ol;
                    OoOOiO ooOOiO;
/* 9 */             if (O0000Ioio00.I0000O(o0iIl1.I00iOIl(), ooOIOoO1I)) {
/* 129 */               return true;
                    }
/* 17 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 29 */            IOIii00 iOIii00 = iOIiO1lIl0lI00100o1O0lo instanceof IOIii00 ? (IOIii00) iOIiO1lIl0lI00100o1O0lo : null;
/* 37 */            List listI00io1l = iOIii00 != null ? iOIii00.I00io1l() : null;
/* 44 */            Iterable iterableI00ilI0I1 = IOOi0Ool1i.I00ilI0I1(o0iIl1.I00OIl());
/* 51 */            if (!(iterableI00ilI0I1 instanceof Collection) || !((Collection) iterableI00ilI0I1).isEmpty()) {
/* 63 */                Iterator it = iterableI00ilI0I1.iterator();
/* 127 */               do {
/* 68 */                    Iio0IIOo iio0IIOo = (Iio0IIOo) it;
/* 76 */                    if (iio0IIOo.I00iiI.hasNext()) {
/* 82 */                        Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 84 */                        int i = iol0oIiIOI.I00000oIO;
/* 88 */                        ooOi1Ol = (OoOi1Ol) iol0oIiIOI.I00000oOI;
/* 99 */                        ooOOiO = listI00io1l != null ? (OoOOiO) IOOi0Ool1i.I00II0oii1o(i, listI00io1l) : null;
                            }
/* 127 */               } while (!(((ooOOiO == null || set == null || !set.contains(ooOOiO)) && !ooOi1Ol.I0000Il00O()) ? I00000oIO(ooOi1Ol.I00000oOI(), ooOIOoO1I, set) : false));
/* 129 */               return true;
                    }
/* 50 */            return false;
                }

                public static final OlIo1I I00000oOI(O0iIl1 o0iIl1, Ooo0Ioii0o0 ooo0Ioii0o0, OoOOiO ooOOiO) {
/* 11 */            if ((ooOOiO != null ? ooOOiO.I000l1() : null) == ooo0Ioii0o0) {
/* 13 */                ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
                    }
/* 15 */            return new OlIo1I(o0iIl1, ooo0Ioii0o0);
                }

                public static final void I0000Il00O(O0iIl1 o0iIl1, Ol0O0iI0l0O ol0O0iI0l0O, LinkedHashSet linkedHashSet, Set set) {
/* 5 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 11 */            if (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) {
/* 25 */                if (!O0000Ioio00.I0000O(o0iIl1.I00iOIl(), ol0O0iI0l0O.I00iOIl())) {
/* 27 */                    linkedHashSet.add(iOIiO1lIl0lI00100o1O0lo);
/* 30 */                    return;
                        }
/* 37 */                Iterator it = ((OoOOiO) iOIiO1lIl0lI00100o1O0lo).getUpperBounds().iterator();
/* 45 */                while (it.hasNext()) {
/* 53 */                    I0000Il00O((O0iIl1) it.next(), ol0O0iI0l0O, linkedHashSet, set);
                        }
/* 483 */               return;
                    }
/* 61 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = o0iIl1.I00iOIl().I00100o1O0lo();
/* 73 */            IOIii00 iOIii00 = iOIiO1lIl0lI00100o1O0lo2 instanceof IOIii00 ? (IOIii00) iOIiO1lIl0lI00100o1O0lo2 : null;
/* 81 */            List listI00io1l = iOIii00 != null ? iOIii00.I00io1l() : null;
/* 92 */            int i = 0;
/* 97 */            for (OoOi1Ol ooOi1Ol : o0iIl1.I00OIl()) {
/* 99 */                int i2 = i + 1;
/* 116 */               OoOOiO ooOOiO = listI00io1l != null ? (OoOOiO) IOOi0Ool1i.I00II0oii1o(i, listI00io1l) : null;
/* 117 */               if ((ooOOiO == null || set == null || !set.contains(ooOOiO)) && !ooOi1Ol.I0000Il00O() && !IOOi0Ool1i.I001i1O0Ol(linkedHashSet, ooOi1Ol.I00000oOI().I00iOIl().I00100o1O0lo()) && !O0000Ioio00.I0000O(ooOi1Ol.I00000oOI().I00iOIl(), ol0O0iI0l0O.I00iOIl())) {
/* 176 */                   I0000Il00O(ooOi1Ol.I00000oOI(), ol0O0iI0l0O, linkedHashSet, set);
                        }
/* 179 */               i = i2;
                    }
                }

                public static final O0i1lI0o1io I0000O(O0iIl1 o0iIl1) {
/* 5 */             return o0iIl1.I00iOIl().I0000O();
                }

                public static final O0iIl1 I0000oI00(OoOOiO ooOOiO) {
                    Object obj;
/* 7 */             ooOOiO.getUpperBounds().isEmpty();
/* 16 */            Iterator it = ooOOiO.getUpperBounds().iterator();
                    while (true) {
/* 24 */                obj = null;
/* 25 */                if (!it.hasNext()) {
                            break;
                        }
/* 27 */                Object next = it.next();
/* 38 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((O0iIl1) next).I00iOIl().I00100o1O0lo();
/* 47 */                OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 49 */                if (oI000ilOol != null && oI000ilOol.I00II0oii1o() != IOIOllO1oli.I00iiI && oI000ilOol.I00II0oii1o() != IOIOllO1oli.I00ilI0I1) {
/* 68 */                    obj = next;
                            break;
                        }
                    }
/* 69 */            O0iIl1 o0iIl1 = (O0iIl1) obj;
                    return o0iIl1 == null ? (O0iIl1) IOOi0Ool1i.I001lllioOl(ooOOiO.getUpperBounds()) : o0iIl1;
                }

                public static final boolean I0001Ioi1lo(OoOOiO ooOOiO, OoOIOoO1I ooOIOoO1I, Set set) {
/* 1 */             List<O0iIl1> upperBounds = ooOOiO.getUpperBounds();
/* 9 */             if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
/* 65 */                return false;
                    }
/* 29 */            for (O0iIl1 o0iIl1 : upperBounds) {
/* 49 */                if (I00000oIO(o0iIl1, ooOOiO.I00Ol10().I00iOIl(), set) && (ooOIOoO1I == null || O0000Ioio00.I0000O(o0iIl1.I00iOIl(), ooOIOoO1I))) {
/* 63 */                    return true;
                        }
                    }
/* 65 */            return false;
                }

                public static final O0iIl1 I000II(O0iIl1 o0iIl1, I11IlOOO i11IlOOO) {
                    return (o0iIl1.getAnnotations().isEmpty() && i11IlOOO.isEmpty()) ? o0iIl1 : o0iIl1.I00l0OO0IO().I00lli11(lOoOoloI01i0.I00000oIO(o0iIl1.I00OloOo(), i11IlOOO));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [Ooioo0o1l0] */
                public static final Ooioo0o1l0 I000O01llI0(O0iIl1 o0iIl1) {
                    Ol0O0iI0l0O ol0O0iI0l0OI0000O;
/* 1 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 11 */            if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 14 */                IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0I00l0OO0IO;
/* 16 */                Ol0O0iI0l0O ol0O0iI0l0OI0000O2 = ilOIOIi00io.I00iiI;
/* 30 */                if (!ol0O0iI0l0OI0000O2.I00iOIl().I000II().isEmpty() && ol0O0iI0l0OI0000O2.I00iOIl().I00100o1O0lo() != null) {
/* 47 */                    List listI000II = ol0O0iI0l0OI0000O2.I00iOIl().I000II();
/* 59 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 62 */                    Iterator it = listI000II.iterator();
/* 70 */                    while (it.hasNext()) {
/* 83 */                        arrayList.add(new OlIo1I((OoOOiO) it.next()));
                            }
/* 87 */                    ol0O0iI0l0OI0000O2 = lOoil0Io0Io.I0000O(ol0O0iI0l0OI0000O2, arrayList, null, 2);
                        }
/* 91 */                Ol0O0iI0l0O ol0O0iI0l0OI0000O3 = ilOIOIi00io.I00iiO;
/* 105 */               if (!ol0O0iI0l0OI0000O3.I00iOIl().I000II().isEmpty() && ol0O0iI0l0OI0000O3.I00iOIl().I00100o1O0lo() != null) {
/* 122 */                   List listI000II2 = ol0O0iI0l0OI0000O3.I00iOIl().I000II();
/* 134 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI000II2, 10));
/* 137 */                   Iterator it2 = listI000II2.iterator();
/* 145 */                   while (it2.hasNext()) {
/* 158 */                       arrayList2.add(new OlIo1I((OoOOiO) it2.next()));
                            }
/* 162 */                   ol0O0iI0l0OI0000O3 = lOoil0Io0Io.I0000O(ol0O0iI0l0OI0000O3, arrayList2, null, 2);
                        }
/* 166 */               ol0O0iI0l0OI0000O = l0loOIIo0iOo.I00000oIO(ol0O0iI0l0OI0000O2, ol0O0iI0l0OI0000O3);
                    } else {
/* 173 */               if (!(ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O)) {
/* 260 */                   I000II.I00000oIO();
/* 10 */                    return null;
                        }
/* 176 */               Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO;
/* 186 */               boolean zIsEmpty = ol0O0iI0l0O.I00iOIl().I000II().isEmpty();
                        ol0O0iI0l0OI0000O = ol0O0iI0l0O;
/* 190 */               if (!zIsEmpty) {
/* 196 */                   IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ol0O0iI0l0O.I00iOIl().I00100o1O0lo();
                            ol0O0iI0l0OI0000O = ol0O0iI0l0O;
/* 200 */                   if (iOIiO1lIl0lI00100o1O0lo != null) {
/* 207 */                       List listI000II3 = ol0O0iI0l0O.I00iOIl().I000II();
/* 219 */                       ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI000II3, 10));
/* 222 */                       Iterator it3 = listI000II3.iterator();
/* 230 */                       while (it3.hasNext()) {
/* 243 */                           arrayList3.add(new OlIo1I((OoOOiO) it3.next()));
                                }
/* 247 */                       ol0O0iI0l0OI0000O = lOoil0Io0Io.I0000O(ol0O0iI0l0O, arrayList3, null, 2);
                            }
                        }
                    }
/* 255 */           return lOoll01ll0I.I00000oOI(ol0O0iI0l0OI0000O, lOoll01ll0I.I00000oIO(ooioo0o1l0I00l0OO0IO));
                }
            }

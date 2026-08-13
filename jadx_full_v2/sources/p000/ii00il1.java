            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class ii00il1 {
                public static boolean I00000oIO(OoOIi1lliil ooOIi1lliil, OoOIi1lliil ooOIi1lliil2) {
/* 8 */             if (!(ooOIi1lliil instanceof OoOIOoO1I)) {
/* 37 */                StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 51 */                I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 3 */                 return false;
                    }
/* 12 */            if (ooOIi1lliil2 instanceof OoOIOoO1I) {
/* 14 */                return ooOIi1lliil.equals(ooOIi1lliil2);
                    }
/* 19 */            StringBuilder sbI0010o2 = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil2, ", ");
/* 33 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil2.getClass(), sbI0010o2));
/* 3 */             return false;
                }

                public static int I00000oOI(O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 11 */                return ((O0iIl1) o0iIo0i1).I00OIl().size();
                    }
/* 20 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 23 */            sb.append(o0iIo0i1);
/* 28 */            sb.append(", ");
/* 41 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 44 */            return 0;
                }

                public static OoOI11 I0000Il00O(Oi1iIiI1 oi1iIiI1) {
/* 3 */             if (oi1iIiI1 instanceof Ol0O0iI0l0O) {
/* 5 */                 return (OoOI11) oi1iIiI1;
                    }
/* 12 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 15 */            sb.append(oi1iIiI1);
/* 20 */            sb.append(", ");
/* 33 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 36 */            return null;
                }

                public static IO0OlIoI1oI I0000O(IOIiIio iOIiIio, Ol0O1I ol0O1I) {
/* 4 */             if (ol0O1I instanceof Ol0O0iI0l0O) {
/* 8 */                 if (ol0O1I instanceof Ol0O1O0O) {
/* 14 */                    return iOIiIio.I00O0i0ii(((Ol0O1O0O) ol0O1I).I00iiI);
                        }
/* 21 */                if (ol0O1I instanceof OIIOlOIoOO) {
/* 23 */                    return (OIIOlOIoOO) ol0O1I;
                        }
/* 3 */                 return null;
                    }
/* 31 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 34 */            sb.append(ol0O1I);
/* 39 */            sb.append(", ");
/* 52 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ol0O1I.getClass(), sb));
/* 3 */             return null;
                }

                public static IiIiOIi0 I0000oI00(Oi1iIiI1 oi1iIiI1) {
/* 4 */             if (oi1iIiI1 instanceof Ol0O0iI0l0O) {
/* 8 */                 if (oi1iIiI1 instanceof IiIiOIi0) {
/* 10 */                    return (IiIiOIi0) oi1iIiI1;
                        }
/* 3 */                 return null;
                    }
/* 18 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 21 */            sb.append(oi1iIiI1);
/* 26 */            sb.append(", ");
/* 39 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 3 */             return null;
                }

                public static IlOIOIi00io I0001Ioi1lo(O0iIo0i1 o0iIo0i1) {
/* 4 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 8 */                 Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = ((O0iIl1) o0iIo0i1).I00l0OO0IO();
/* 14 */                if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 16 */                    return (IlOIOIi00io) ooioo0o1l0I00l0OO0IO;
                        }
/* 3 */                 return null;
                    }
/* 24 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 27 */            sb.append(o0iIo0i1);
/* 32 */            sb.append(", ");
/* 45 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 3 */             return null;
                }

                public static Ol0O0iI0l0O I000II(O0iIo0i1 o0iIo0i1) {
/* 4 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 8 */                 Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = ((O0iIl1) o0iIo0i1).I00l0OO0IO();
/* 14 */                if (ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O) {
/* 16 */                    return (Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO;
                        }
/* 3 */                 return null;
                    }
/* 24 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 27 */            sb.append(o0iIo0i1);
/* 32 */            sb.append(", ");
/* 45 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 3 */             return null;
                }

                public static OlIo1I I000O01llI0(O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 9 */                 return new OlIo1I((O0iIl1) o0iIo0i1);
                    }
/* 17 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 20 */            sb.append(o0iIo0i1);
/* 25 */            sb.append(", ");
/* 38 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 41 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Ol0O0iI0l0O I000OOo1O(Oi1iIiI1 oi1iIiI1) {
                    ArrayList arrayList;
/* 1 */             IO0Io01l1 iO0Io01l1 = IO0Io01l1.I00iOIl;
/* 5 */             IiOl01 iiOl01 = null;
/* 6 */             if (!(oi1iIiI1 instanceof Ol0O0iI0l0O)) {
/* 377 */               StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 380 */               sb.append(oi1iIiI1);
/* 385 */               sb.append(", ");
/* 398 */               I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 5 */                 return null;
                    }
/* 8 */             Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) oi1iIiI1;
/* 10 */            i1i0olI i1i0oli = i1i0olI.I00ilI0I1;
/* 32 */            if (ol0O0iI0l0O.I00OIl().size() != ol0O0iI0l0O.I00iOIl().I000II().size()) {
/* 34 */                arrayList = null;
                    } else {
/* 37 */                List listI00OIl = ol0O0iI0l0O.I00OIl();
/* 42 */                List list = listI00OIl;
/* 46 */                if (!(list instanceof Collection) || !list.isEmpty()) {
/* 58 */                    Iterator it = list.iterator();
/* 66 */                    while (it.hasNext()) {
/* 80 */                        if (((OoOi1Ol) it.next()).I00000oIO() != Ooo0Ioii0o0.I00iiO) {
/* 93 */                            ArrayList arrayListI00ilO0 = IOOi0Ool1i.I00ilO0(list, ol0O0iI0l0O.I00iOIl().I000II());
/* 105 */                           arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00ilO0, 10));
/* 108 */                           Iterator it2 = arrayListI00ilO0.iterator();
/* 116 */                           while (it2.hasNext()) {
/* 122 */                               OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it2.next();
/* 126 */                               OoOi1Ol olIo1I = (OoOi1Ol) oIoi0IIoi.I00iOIl;
/* 130 */                               OoOOiO ooOOiO = (OoOOiO) oIoi0IIoi.I00iiI;
/* 138 */                               if (olIo1I.I00000oIO() != Ooo0Ioii0o0.I00iiO) {
/* 185 */                                   olIo1I = new OlIo1I(new OIIOlOIoOO(iO0Io01l1, new OIIOli0(olIo1I, iiOl01, ooOOiO, 6), (olIo1I.I0000Il00O() || olIo1I.I00000oIO() != Ooo0Ioii0o0.I00iio) ? null : olIo1I.I00000oOI().I00l0OO0IO(), (OoOI1i1i) null, false, 56));
                                        }
/* 188 */                               arrayList.add(olIo1I);
                                    }
/* 204 */                           OoOilII0 ooOilII0 = new OoOilII0(OoOIlIi1.I00000oOI.I000O01llI0(ol0O0iI0l0O.I00iOIl(), arrayList));
/* 210 */                           int size = listI00OIl.size();
/* 215 */                           for (int i = 0; i < size; i++) {
/* 221 */                               OoOi1Ol ooOi1Ol = (OoOi1Ol) listI00OIl.get(i);
/* 227 */                               OoOi1Ol ooOi1Ol2 = (OoOi1Ol) arrayList.get(i);
/* 235 */                               if (ooOi1Ol.I00000oIO() != Ooo0Ioii0o0.I00iiO) {
/* 251 */                                   List upperBounds = ((OoOOiO) ol0O0iI0l0O.I00iOIl().I000II().get(i)).getUpperBounds();
/* 259 */                                   ArrayList arrayList2 = new ArrayList();
/* 262 */                                   Iterator it3 = upperBounds.iterator();
/* 270 */                                   while (it3.hasNext()) {
/* 292 */                                       arrayList2.add(i1i0oli.I00100l0(ooOilII0.I0001Ioi1lo((O0iIl1) it3.next(), Ooo0Ioii0o0.I00iiO).I00l0OO0IO()));
                                            }
/* 300 */                                   if (!ooOi1Ol.I0000Il00O() && ooOi1Ol.I00000oIO() == Ooo0Ioii0o0.I00ilI0I1) {
/* 322 */                                       arrayList2.add(i1i0oli.I00100l0(ooOi1Ol.I00000oOI().I00l0OO0IO()));
                                            }
/* 331 */                                   OIIOli0 oIIOli0 = ((OIIOlOIoOO) ooOi1Ol2.I00000oOI()).I00iiO;
/* 333 */                                   oIIOli0.getClass();
/* 339 */                                   IiOl01 iiOl012 = new IiOl01(2);
/* 342 */                                   iiOl012.I00iiI = arrayList2;
/* 344 */                                   VarHandle.storeStoreFence();
/* 347 */                                   oIIOli0.I00iiI = iiOl012;
                                        }
                                    }
                                }
                            }
/* 34 */                    arrayList = null;
                        }
                    }
/* 353 */           if (arrayList != null) {
/* 367 */               return l0loOIIo0iOo.I0000Il00O(ol0O0iI0l0O.I00OloOo(), ol0O0iI0l0O.I00iOIl(), arrayList, ol0O0iI0l0O.I00iiI());
                    }
/* 5 */             return null;
                }

                public static IO0Io01l1 I000OiO(IO0OlIoI1oI iO0OlIoI1oI) {
/* 3 */             if (iO0OlIoI1oI instanceof OIIOlOIoOO) {
/* 7 */                 return ((OIIOlOIoOO) iO0OlIoI1oI).I00iiI;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(iO0OlIoI1oI);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iO0OlIoI1oI.getClass(), sb));
/* 38 */            return null;
                }

                public static Ooioo0o1l0 I000iOII(IOIiIio iOIiIio, Oi1iIiI1 oi1iIiI1, Oi1iIiI1 oi1iIiI12) {
/* 8 */             if (!(oi1iIiI1 instanceof Ol0O0iI0l0O)) {
/* 50 */                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 53 */                sb.append(iOIiIio);
/* 56 */                sb.append(", ");
/* 69 */                I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iOIiIio.getClass(), sb));
/* 3 */                 return null;
                    }
/* 12 */            if (oi1iIiI12 instanceof Ol0O0iI0l0O) {
/* 18 */                return l0loOIIo0iOo.I00000oIO((Ol0O0iI0l0O) oi1iIiI1, (Ol0O0iI0l0O) oi1iIiI12);
                    }
/* 25 */            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 28 */            sb2.append(iOIiIio);
/* 31 */            sb2.append(", ");
/* 44 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iOIiIio.getClass(), sb2));
/* 3 */             return null;
                }

                public static OoOI1Ooo1 I000l1(O0iIo0i1 o0iIo0i1, int i) {
/* 3 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 15 */                return (OoOI1Ooo1) ((O0iIl1) o0iIo0i1).I00OIl().get(i);
                    }
/* 22 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 25 */            sb.append(o0iIo0i1);
/* 30 */            sb.append(", ");
/* 43 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 46 */            return null;
                }

                public static List I000lI(O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 7 */                 return ((O0iIl1) o0iIo0i1).I00OIl();
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(o0iIo0i1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 40 */            return null;
                }

                public static OoOOlO11iOi I000o00OoI0I(OoOIi1lliil ooOIi1lliil, int i) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 15 */                return (OoOOlO11iOi) ((OoOIOoO1I) ooOIi1lliil).I000II().get(i);
                    }
/* 22 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 36 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 39 */            return null;
                }

                public static List I000oI1ioi(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 7 */                 return ((OoOIOoO1I) ooOIi1lliil).I000II();
                    }
/* 16 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 30 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 33 */            return null;
                }

                public static O0iIl1 I00100l0(OoOOlO11iOi ooOOlO11iOi) {
/* 3 */             if (ooOOlO11iOi instanceof OoOOiO) {
/* 7 */                 return lOoliOIOlIO0.I0000oI00((OoOOiO) ooOOlO11iOi);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(ooOOlO11iOi);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOlO11iOi.getClass(), sb));
/* 40 */            return null;
                }

                public static Ooioo0o1l0 I00100o1O0lo(IOIiIio iOIiIio, OoOI1Ooo1 ooOI1Ooo1) {
/* 6 */             if (iOIiIio.I000OiO(ooOI1Ooo1)) {
/* 5 */                 return null;
                    }
/* 11 */            if (ooOI1Ooo1 instanceof OoOi1Ol) {
/* 19 */                return ((OoOi1Ol) ooOI1Ooo1).I00000oOI().I00l0OO0IO();
                    }
/* 28 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 31 */            sb.append(ooOI1Ooo1);
/* 36 */            sb.append(", ");
/* 49 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOI1Ooo1.getClass(), sb));
/* 5 */             return null;
                }

                public static OoOOiO I0010I0i(OoOIi1lliil ooOIi1lliil) {
/* 4 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 8 */                 IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((OoOIOoO1I) ooOIi1lliil).I00100o1O0lo();
/* 14 */                if (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) {
/* 16 */                    return (OoOOiO) iOIiO1lIl0lI00100o1O0lo;
                        }
/* 3 */                 return null;
                    }
/* 24 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 38 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 3 */             return null;
                }

                public static OoOioOO1 I0010o(OoOI1Ooo1 ooOI1Ooo1) {
/* 3 */             if (ooOI1Ooo1 instanceof OoOi1Ol) {
/* 11 */                return lOol1oi11I.I00000oIO(((OoOi1Ol) ooOI1Ooo1).I00000oIO());
                    }
/* 20 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 23 */            sb.append(ooOI1Ooo1);
/* 28 */            sb.append(", ");
/* 41 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOI1Ooo1.getClass(), sb));
/* 44 */            return null;
                }

                public static OoOioOO1 I00111O(OoOOlO11iOi ooOOlO11iOi) {
/* 3 */             if (ooOOlO11iOi instanceof OoOOiO) {
/* 11 */                return lOol1oi11I.I00000oIO(((OoOOiO) ooOOlO11iOi).I000l1());
                    }
/* 20 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 23 */            sb.append(ooOOlO11iOi);
/* 28 */            sb.append(", ");
/* 41 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOlO11iOi.getClass(), sb));
/* 44 */            return null;
                }

                public static boolean I001IIilI0O(OoOOlO11iOi ooOOlO11iOi, OoOIi1lliil ooOIi1lliil) {
/* 8 */             if (!(ooOOlO11iOi instanceof OoOOiO)) {
/* 55 */                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 58 */                sb.append(ooOOlO11iOi);
/* 61 */                sb.append(", ");
/* 74 */                I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOlO11iOi.getClass(), sb));
/* 3 */                 return false;
                    }
/* 16 */            OoOOiO ooOOiO = (OoOOiO) ooOOlO11iOi;
/* 18 */            if (ooOIi1lliil == null ? true : ooOIi1lliil instanceof OoOIOoO1I) {
/* 23 */                return lOoliOIOlIO0.I0001Ioi1lo(ooOOiO, (OoOIOoO1I) ooOIi1lliil, null);
                    }
/* 30 */            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 33 */            sb2.append(ooOOiO);
/* 36 */            sb2.append(", ");
/* 49 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOiO.getClass(), sb2));
/* 3 */             return false;
                }

                public static boolean I001IO000(Oi1iIiI1 oi1iIiI1, Oi1iIiI1 oi1iIiI12) {
/* 8 */             if (!(oi1iIiI1 instanceof Ol0O0iI0l0O)) {
/* 58 */                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 61 */                sb.append(oi1iIiI1);
/* 64 */                sb.append(", ");
/* 77 */                I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 3 */                 return false;
                    }
/* 12 */            if (oi1iIiI12 instanceof Ol0O0iI0l0O) {
                        return ((Ol0O0iI0l0O) oi1iIiI1).I00OIl() == ((Ol0O0iI0l0O) oi1iIiI12).I00OIl();
                    }
/* 33 */            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 36 */            sb2.append(oi1iIiI12);
/* 39 */            sb2.append(", ");
/* 52 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI12.getClass(), sb2));
/* 3 */             return false;
                }

                public static boolean I001i1O0Ol(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 9 */                 return O0i1lI0o1io.I00IOO((OoOIOoO1I) ooOIi1lliil, OlIllOO11lOl.I00000oIO);
                    }
/* 18 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 32 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 35 */            return false;
                }

                public static boolean I001i1lo1io(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 11 */                return ((OoOIOoO1I) ooOIi1lliil).I00100o1O0lo() instanceof OI000ilOol;
                    }
/* 18 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 32 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 35 */            return false;
                }

                public static boolean I001iOo1i0O(OoOIi1lliil ooOIi1lliil) {
/* 4 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 8 */                 IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((OoOIOoO1I) ooOIi1lliil).I00100o1O0lo();
/* 19 */                OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
                        return (oI000ilOol == null || oI000ilOol.I001IO000() != O1oIIloii0.I00iiI || oI000ilOol.I00II0oii1o() == IOIOllO1oli.I00iiO || oI000ilOol.I00II0oii1o() == IOIOllO1oli.I00iio || oI000ilOol.I00II0oii1o() == IOIOllO1oli.I00ilI0I1) ? false : true;
                    }
/* 76 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ")));
/* 3 */             return false;
                }

                public static boolean I001l0I00(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 7 */                 return ((OoOIOoO1I) ooOIi1lliil).I0010I0i();
                    }
/* 16 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 30 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 33 */            return false;
                }

                public static boolean I001lIiIIo1O(O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 7 */                 return l0loOi1ol11o.I00000oIO((O0iIl1) o0iIo0i1);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(o0iIo0i1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 40 */            return false;
                }

                public static boolean I001lllioOl(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 7 */                 IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((OoOIOoO1I) ooOIi1lliil).I00100o1O0lo();
/* 19 */                OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 26 */                return (oI000ilOol != null ? oI000ilOol.I00lli11() : null) instanceof Ioll0i;
                    }
/* 47 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ")));
/* 50 */            return false;
                }

                public static boolean I001lloI(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 5 */                 return ooOIi1lliil instanceof IooOo1lO0iO;
                    }
/* 12 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 26 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 29 */            return false;
                }

                public static boolean I00II0Ol1O0l(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 5 */                 return ooOIi1lliil instanceof Iooo1o0oiOo;
                    }
/* 12 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 26 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 29 */            return false;
                }

                public static boolean I00II0oii1o(O0iIo0i1 o0iIo0i1) {
                    return (o0iIo0i1 instanceof Ol0O0iI0l0O) && ((Ol0O0iI0l0O) o0iIo0i1).I00iiI();
                }

                public static boolean I00IO1(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 9 */                 return O0i1lI0o1io.I00IOO((OoOIOoO1I) ooOIi1lliil, OlIllOO11lOl.I00000oOI);
                    }
/* 18 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 32 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 35 */            return false;
                }

                public static boolean I00IO1oi11O(O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof O0iIl1) {
/* 7 */                 return OoOilo0Oliii.I0000oI00((O0iIl1) o0iIo0i1);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(o0iIo0i1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 40 */            return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static boolean I00IOO(Ol0O1I ol0O1I) {
/* 3 */             if (ol0O1I instanceof O0iIl1) {
/* 7 */                 return O0i1lI0o1io.I00IO1((O0iIl1) ol0O1I);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(ol0O1I);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ol0O1I.getClass(), sb));
/* 40 */            return false;
                }

                public static boolean I00IioO0OiOi(IO0OlIoI1oI iO0OlIoI1oI) {
/* 3 */             if (iO0OlIoI1oI instanceof OIIOlOIoOO) {
/* 7 */                 return ((OIIOlOIoOO) iO0OlIoI1oI).I00io1l;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(iO0OlIoI1oI);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iO0OlIoI1oI.getClass(), sb));
/* 38 */            return false;
                }

                public static boolean I00IlilI0i0i(OoOI1Ooo1 ooOI1Ooo1) {
/* 3 */             if (ooOI1Ooo1 instanceof OoOi1Ol) {
/* 7 */                 return ((OoOi1Ol) ooOI1Ooo1).I0000Il00O();
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(ooOI1Ooo1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOI1Ooo1.getClass(), sb));
/* 40 */            return false;
                }

                public static void I00Io1lO(Oi1iIiI1 oi1iIiI1) {
/* 3 */             if (oi1iIiI1 instanceof Ol0O0iI0l0O) {
/* 5 */                 return;
                    }
/* 10 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 13 */            sb.append(oi1iIiI1);
/* 18 */            sb.append(", ");
/* 31 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
                }

                public static void I00Io1o110i(Oi1iIiI1 oi1iIiI1) {
/* 3 */             if (oi1iIiI1 instanceof Ol0O0iI0l0O) {
/* 5 */                 return;
                    }
/* 10 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 13 */            sb.append(oi1iIiI1);
/* 18 */            sb.append(", ");
/* 31 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
                }

                public static Ol0O0iI0l0O I00IoIO0lI(IlOIioiOooOO ilOIioiOooOO) {
/* 3 */             if (ilOIioiOooOO instanceof IlOIOIi00io) {
/* 7 */                 return ((IlOIOIi00io) ilOIioiOooOO).I00iiI;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(ilOIioiOooOO);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ilOIioiOooOO.getClass(), sb));
/* 38 */            return null;
                }

                public static Ooioo0o1l0 I00IoO0(IO0OlIoI1oI iO0OlIoI1oI) {
/* 3 */             if (iO0OlIoI1oI instanceof OIIOlOIoOO) {
/* 7 */                 return ((OIIOlOIoOO) iO0OlIoI1oI).I00iio;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(iO0OlIoI1oI);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iO0OlIoI1oI.getClass(), sb));
/* 38 */            return null;
                }

                public static Ooioo0o1l0 I00IoiI(O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof Ooioo0o1l0) {
/* 7 */                 return lOOIol01.I00000oIO((Ooioo0o1l0) o0iIo0i1);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(o0iIo0i1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 40 */            return null;
                }

                public static int I00Iooi00oi(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 11 */                return ((OoOIOoO1I) ooOIi1lliil).I000II().size();
                    }
/* 20 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 34 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 37 */            return 0;
                }

                public static Collection I00O0i0ii(IOIiIio iOIiIio, Oi1iIiI1 oi1iIiI1) {
/* 1 */             OoOIi1lliil ooOIi1lliilI001lllioOl = iOIiIio.I001lllioOl(oi1iIiI1);
/* 7 */             if (ooOIi1lliilI001lllioOl instanceof IooOo1lO0iO) {
/* 11 */                return ((IooOo1lO0iO) ooOIi1lliilI001lllioOl).I00iOIl;
                    }
/* 20 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 23 */            sb.append(oi1iIiI1);
/* 28 */            sb.append(", ");
/* 41 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 44 */            return null;
                }

                public static OoOi1Ol I00O0o1oo(IO0Oio iO0Oio) {
/* 3 */             if (iO0Oio instanceof OIIOli0) {
/* 7 */                 return ((OIIOli0) iO0Oio).I00iOIl;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(iO0Oio);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iO0Oio.getClass(), sb));
/* 38 */            return null;
                }

                public static O0iIl1 I00O10llo(OoOilII0 ooOilII0, O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof Ooioo0o1l0) {
/* 9 */                 return ooOilII0.I0001Ioi1lo((O0iIl1) o0iIo0i1, Ooo0Ioii0o0.I00iiO);
                    }
/* 18 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 21 */            sb.append(o0iIo0i1);
/* 26 */            sb.append(", ");
/* 39 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 42 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static IOIiIOOOIIOI I00OI1(IOIiIio iOIiIio, Oi1iIiI1 oi1iIiI1) {
/* 3 */             if (!(oi1iIiI1 instanceof Ol0O0iI0l0O)) {
/* 43 */                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 46 */                sb.append(oi1iIiI1);
/* 51 */                sb.append(", ");
/* 64 */                I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 67 */                return null;
                    }
/* 5 */             O0iIl1 o0iIl1 = (O0iIl1) oi1iIiI1;
/* 23 */            OoOilII0 ooOilII0 = new OoOilII0(OoOIlIi1.I00000oOI.I000O01llI0(o0iIl1.I00iOIl(), o0iIl1.I00OIl()));
/* 28 */            IOIiIOOOIIOI iOIiIOOOIIOI = new IOIiIOOOIIOI();
/* 31 */            iOIiIOOOIIOI.I00000oIO = iOIiIio;
/* 33 */            iOIiIOOOIIOI.I00000oOI = ooOilII0;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            return iOIiIOOOIIOI;
                }

                public static Collection I00OIO1(OoOIi1lliil ooOIi1lliil) {
/* 3 */             if (ooOIi1lliil instanceof OoOIOoO1I) {
/* 7 */                 return ((OoOIOoO1I) ooOIi1lliil).I0000oI00();
                    }
/* 16 */            StringBuilder sbI0010o = IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIi1lliil, ", ");
/* 30 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIi1lliil.getClass(), sbI0010o));
/* 33 */            return null;
                }

                public static OIIOli0 I00OIl(IO0OlIoI1oI iO0OlIoI1oI) {
/* 3 */             if (iO0OlIoI1oI instanceof OIIOlOIoOO) {
/* 7 */                 return ((OIIOlOIoOO) iO0OlIoI1oI).I00iiO;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(iO0OlIoI1oI);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, iO0OlIoI1oI.getClass(), sb));
/* 38 */            return null;
                }

                public static OoOIOoO1I I00OIo(Oi1iIiI1 oi1iIiI1) {
/* 3 */             if (oi1iIiI1 instanceof Ol0O0iI0l0O) {
/* 7 */                 return ((Ol0O0iI0l0O) oi1iIiI1).I00iOIl();
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(oi1iIiI1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 40 */            return null;
                }

                public static Ol0O0iI0l0O I00OOll1(IlOIioiOooOO ilOIioiOooOO) {
/* 3 */             if (ilOIioiOooOO instanceof IlOIOIi00io) {
/* 7 */                 return ((IlOIOIi00io) ilOIioiOooOO).I00iiO;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 17 */            sb.append(ilOIioiOooOO);
/* 22 */            sb.append(", ");
/* 35 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ilOIioiOooOO.getClass(), sb));
/* 38 */            return null;
                }

                public static O0iIo0i1 I00OilO00Il(IOIiIio iOIiIio, O0iIo0i1 o0iIo0i1) {
/* 3 */             if (o0iIo0i1 instanceof Oi1iIiI1) {
/* 7 */                 return iOIiIio.I0000oI00((Oi1iIiI1) o0iIo0i1);
                    }
/* 14 */            if (o0iIo0i1 instanceof IlOIioiOooOO) {
/* 16 */                IlOIioiOooOO ilOIioiOooOO = (IlOIioiOooOO) o0iIo0i1;
/* 34 */                return iOIiIio.I00l0OO0IO(iOIiIio.I0000oI00((Oi1iIiI1) iOIiIio.I000O01llI0(ilOIioiOooOO)), iOIiIio.I0000oI00((Oi1iIiI1) iOIiIio.I000II(ilOIioiOooOO)));
                    }
/* 41 */            I000II.I001IO000("sealed");
/* 44 */            return null;
                }

                public static Ol0O0iI0l0O I00Oio(Oi1iIiI1 oi1iIiI1, boolean z) {
/* 3 */             if (oi1iIiI1 instanceof Ol0O0iI0l0O) {
/* 7 */                 return ((Ol0O0iI0l0O) oi1iIiI1).I00li1OI(z);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 19 */            sb.append(oi1iIiI1);
/* 24 */            sb.append(", ");
/* 37 */            I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, oi1iIiI1.getClass(), sb));
/* 40 */            return null;
                }
            }

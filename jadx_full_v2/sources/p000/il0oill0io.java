            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public abstract class il0oill0io {
                public static final String I00000oIO(OI000ilOol oI000ilOol, lOOlOoll loolooll) {
/* 1 */             Ii1Ool1 ii1Ool1I000lI = oI000ilOol.I000lI();
/* 5 */             OI1Iio0ii1 name = oI000ilOol.getName();
/* 9 */             OI1Iio0ii1 oI1Iio0ii1 = OlIIoO0Ol0o1.I00000oIO;
/* 11 */            if (name == null || name.I00iiI) {
/* 18 */                name = OlIIoO0Ol0o1.I0000Il00O;
                    }
/* 20 */            String strI0000Il00O = name.I0000Il00O();
/* 26 */            if (!(ii1Ool1I000lI instanceof OIo0il)) {
/* 80 */                OI000ilOol oI000ilOol2 = ii1Ool1I000lI instanceof OI000ilOol ? (OI000ilOol) ii1Ool1I000lI : null;
/* 81 */                if (oI000ilOol2 != null) {
/* 89 */                    return IIlIOloOOO.I000oI1ioi('$', I00000oIO(oI000ilOol2, loolooll), strI0000Il00O);
                        }
/* 98 */                OoOil11Ol1o.I0010o("Unexpected container: ", ii1Ool1I000lI, " for ", oI000ilOol);
/* 73 */                return null;
                    }
/* 32 */            Ill0IO ill0IO = ((OIo0l0) ((OIo0il) ii1Ool1I000lI)).I00ilI0I1;
/* 40 */            if (ill0IO.I00000oIO.I0000Il00O()) {
/* 42 */                return strI0000Il00O;
                    }
/* 66 */            return ill0IO.I00000oIO.I00000oIO.replace('.', '/') + '/' + strI0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00f7 A[EDGE_INSN: B:37:0x00f7->B:103:0x0235 BREAK  A[LOOP:1: B:97:0x0215->B:180:?]] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(O0iIl1 o0iIl1, OoOOO1O ooOOO1O, Function3 function3) {
                    Illo0o illo0oI0000oI00;
                    OOIil01OI oOIil01OII00111O;
                    OOIil01OI oOIil01OII0010I0i;
                    boolean z;
                    Ill0OI0lo ill0OI0loI0001Ioi1lo;
                    Object o0IO0lIIoio;
                    O0IO10lo0oi o0IO10lo0oi;
                    O0iIl1 o0iIl12;
                    OoOOO1O ooOOO1O2;
                    Object objI00000oOI;
                    IlOIOIi00io ilOIOIi00ioI0001Ioi1lo;
/* 1 */             lOOlOoll loolooll = lOOlOoll.I00ioIO;
/* 7 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 11 */            Illo0o illo0oI0000oI002 = null;
/* 12 */            if (iOIiO1lIl0lI00100o1O0lo != null && (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) && O0i1lI0o1io.I00IioO0OiOi(iOIiO1lIl0lI00100o1O0lo)) {
/* 27 */                int i = IiOiOOIo.I00000oIO;
/* 33 */                illo0oI0000oI00 = ilioooOo11.I0000oI00(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo));
                    } else {
/* 25 */                illo0oI0000oI00 = null;
                    }
/* 37 */            Illo0liIIii illo0liIIii = Illo0liIIii.I0000Il00O;
/* 44 */            if (O0000Ioio00.I0000O(illo0oI0000oI00, illo0liIIii)) {
/* 46 */                OI0ioiO1olol oI0ioiO1olol = Oll0il0IoloI.I00000oIO;
/* 52 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = o0iIl1.I00iOIl().I00100o1O0lo();
/* 56 */                if (iOIiO1lIl0lI00100o1O0lo2 != null && (iOIiO1lIl0lI00100o1O0lo2 instanceof OI000ilOol) && O0i1lI0o1io.I00IioO0OiOi(iOIiO1lIl0lI00100o1O0lo2)) {
/* 70 */                    int i2 = IiOiOOIo.I00000oIO;
/* 76 */                    illo0oI0000oI002 = ilioooOo11.I0000oI00(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo2));
                        }
/* 80 */                O0000Ioio00.I0000O(illo0oI0000oI002, illo0liIIii);
/* 83 */                O0i1lI0o1io o0i1lI0o1ioI0000O = lOoliOIOlIO0.I0000O(o0iIl1);
/* 87 */                I11IlOOO annotations = o0iIl1.getAnnotations();
/* 91 */                O0iIl1 o0iIl1I0001Ioi1lo = ilioooOo11.I0001Ioi1lo(o0iIl1);
/* 95 */                List listI0000O = ilioooOo11.I0000O(o0iIl1);
/* 99 */                List listI000II = ilioooOo11.I000II(o0iIl1);
/* 113 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 116 */               Iterator it = listI000II.iterator();
/* 124 */               while (it.hasNext()) {
/* 136 */                   arrayList.add(((OoOi1Ol) it.next()).I00000oOI());
                        }
/* 142 */               OoOI1i1i.I00iiI.getClass();
/* 145 */               OoOI1i1i ooOI1i1i = OoOI1i1i.I00iiO;
/* 149 */               OoOIOoO1I ooOIOoO1II000OOo1O = Oll0il0IoloI.I00000oIO.I000OOo1O();
/* 153 */               ilioooOo11.I000O01llI0(o0iIl1);
/* 208 */               return I00000oOI(ilioooOo11.I00000oOI(o0i1lI0o1ioI0000O, annotations, o0iIl1I0001Ioi1lo, listI0000O, IOOi0Ool1i.I00OI1(arrayList, l0loOIIo0iOo.I0000Il00O(ooOI1i1i, ooOIOoO1II000OOo1O, Collections.singletonList(new OlIo1I(((OoOi1Ol) IOOi0Ool1i.I00Io1o110i(o0iIl1.I00OIl())).I00000oOI())), false)), lOoliOIOlIO0.I0000O(o0iIl1).I000oI1ioi(), false).I00li1OI(o0iIl1.I00iiI()), ooOOO1O, function3);
                    }
/* 213 */           Ol0O0iI0l0O ol0O0iI0l0OI000II = ii00il1.I000II(o0iIl1);
/* 217 */           if (ol0O0iI0l0OI000II == null && ((ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIl1)) == null || (ol0O0iI0l0OI000II = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo)) == null)) {
/* 231 */               ol0O0iI0l0OI000II = ii00il1.I000II(o0iIl1);
                    }
/* 235 */           OoOIOoO1I ooOIOoO1II00OIo = ii00il1.I00OIo(ol0O0iI0l0OI000II);
/* 246 */           if (ii00il1.I001i1lo1io(ooOIOoO1II00OIo)) {
/* 257 */               if (ooOIOoO1II00OIo instanceof OoOIOoO1I) {
/* 268 */                   oOIil01OII00111O = O0i1lI0o1io.I00111O((OI000ilOol) ooOIOoO1II00OIo.I00100o1O0lo());
                        } else {
/* 287 */                   I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIOoO1II00OIo.getClass(), IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIOoO1II00OIo, ", ")));
/* 290 */                   oOIil01OII00111O = null;
                        }
/* 291 */               if (oOIil01OII00111O != null) {
                            switch (oOIil01OII00111O.ordinal()) {
                                case 0:
/* 325 */                           o0IO10lo0oi = O0IOO1lIiOl.I00000oIO;
                                    break;
                                case 1:
/* 322 */                           o0IO10lo0oi = O0IOO1lIiOl.I00000oOI;
                                    break;
                                case 2:
/* 319 */                           o0IO10lo0oi = O0IOO1lIiOl.I0000Il00O;
                                    break;
                                case 3:
/* 316 */                           o0IO10lo0oi = O0IOO1lIiOl.I0000O;
                                    break;
                                case 4:
/* 313 */                           o0IO10lo0oi = O0IOO1lIiOl.I0000oI00;
                                    break;
                                case 5:
/* 310 */                           o0IO10lo0oi = O0IOO1lIiOl.I0001Ioi1lo;
                                    break;
                                case 6:
/* 307 */                           o0IO10lo0oi = O0IOO1lIiOl.I000II;
                                    break;
                                case 7:
/* 304 */                           o0IO10lo0oi = O0IOO1lIiOl.I000O01llI0;
                                    break;
                                default:
/* 300 */                           I000II.I00000oIO();
/* 11 */                            return null;
                            }
/* 331 */                   if (!ii00il1.I00IO1oi11O(o0iIl1)) {
/* 348 */                       boolean z2 = o0iIl1.getAnnotations().I001l0I00(O0I01I.I00100l0);
/* 349 */                       o0IO0lIIoio = lOoil01ollIo.I00000oIO(o0IO10lo0oi, z2);
                            }
                        } else {
/* 357 */                   if (ooOIOoO1II00OIo instanceof OoOIOoO1I) {
/* 368 */                       oOIil01OII0010I0i = O0i1lI0o1io.I0010I0i((OI000ilOol) ooOIOoO1II00OIo.I00100o1O0lo());
                            } else {
/* 387 */                       I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIOoO1II00OIo.getClass(), IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIOoO1II00OIo, ", ")));
/* 390 */                       oOIil01OII0010I0i = null;
                            }
/* 391 */                   if (oOIil01OII0010I0i != null) {
/* 399 */                       O0I1lo0l o0I1lo0l = (O0I1lo0l) O0I1lo0l.I00lll10.get(oOIil01OII0010I0i);
/* 401 */                       if (o0I1lo0l == null) {
/* 416 */                           O0I1lo0l.I00000oIO(6);
/* 419 */                           throw null;
                                }
/* 409 */                       o0IO0lIIoio = i1O10l1io1iO.I000O01llI0("[".concat(o0I1lo0l.I00iiO));
                            } else {
/* 422 */                       if (ooOIOoO1II00OIo instanceof OoOIOoO1I) {
/* 427 */                           IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo3 = ooOIOoO1II00OIo.I00100o1O0lo();
/* 431 */                           if (iOIiO1lIl0lI00100o1O0lo3 != null && O0i1lI0o1io.I00IioO0OiOi(iOIiO1lIl0lI00100o1O0lo3)) {
/* 439 */                               z = true;
                                    }
/* 461 */                           if (!z) {
/* 248 */                               o0IO0lIIoio = null;
                                        break;
                                    }
/* 465 */                           if (ooOIOoO1II00OIo instanceof OoOIOoO1I) {
/* 473 */                               OI000ilOol oI000ilOol = (OI000ilOol) ooOIOoO1II00OIo.I00100o1O0lo();
/* 475 */                               int i3 = IiOiOOIo.I00000oIO;
/* 477 */                               ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol);
                                    } else {
/* 496 */                               I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIOoO1II00OIo.getClass(), IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIOoO1II00OIo, ", ")));
/* 499 */                               ill0OI0loI0001Ioi1lo = null;
                                    }
/* 500 */                           String str = O00oO0liO11.I00000oIO;
/* 502 */                           IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(ill0OI0loI0001Ioi1lo);
/* 506 */                           if (iOIOillI000O01llI0 != null) {
/* 510 */                               if (!ooOOO1O.I0000O) {
/* 512 */                                   List list = O00oO0liO11.I000oI1ioi;
/* 518 */                                   if (!(list instanceof Collection) || !list.isEmpty()) {
/* 530 */                                       Iterator it2 = list.iterator();
/* 538 */                                       while (it2.hasNext()) {
/* 552 */                                           if (((O00oIil1) it2.next()).I00000oIO.equals(iOIOillI000O01llI0)) {
/* 248 */                                               o0IO0lIIoio = null;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
/* 562 */                               o0IO0lIIoio = new O0IO0lIIoio(O0I0oiO1I.I0000oI00(iOIOillI000O01llI0));
                                    }
                                } else {
/* 457 */                           I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOIOoO1II00OIo.getClass(), IIl001iO0Io.I0010o("ClassicTypeSystemContext couldn't handle: ", ooOIOoO1II00OIo, ", ")));
                                }
/* 441 */                       z = false;
/* 461 */                       if (!z) {
                                }
                            }
                        }
                    }
/* 566 */           if (o0IO0lIIoio != null) {
/* 570 */               Object objI00000oIO = lOoil01ollIo.I00000oIO(o0IO0lIIoio, ooOOO1O.I00000oIO);
/* 574 */               function3.invoke(o0iIl1, objI00000oIO, ooOOO1O);
/* 577 */               return objI00000oIO;
                    }
/* 578 */           OoOIOoO1I ooOIOoO1II00iOIl = o0iIl1.I00iOIl();
/* 584 */           if (ooOIOoO1II00iOIl instanceof Iooo1o0oiOo) {
/* 586 */               Iooo1o0oiOo iooo1o0oiOo = (Iooo1o0oiOo) ooOIOoO1II00iOIl;
/* 588 */               O0iIl1 o0iIl13 = iooo1o0oiOo.I00iOIl;
/* 590 */               if (o0iIl13 != null) {
/* 596 */                   return I00000oOI(lOoliOIOlIO0.I000O01llI0(o0iIl13), ooOOO1O, function3);
                        }
/* 619 */               I000II.I000O01llI0("There should be no intersection type in existing descriptors, but found: ".concat(IOOi0Ool1i.I00IlilI0i0i(iooo1o0oiOo.I00iiI, null, null, null, null, 63)));
/* 11 */                return null;
                    }
/* 623 */           IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo4 = ooOIOoO1II00iOIl.I00100o1O0lo();
/* 627 */           if (iOIiO1lIl0lI00100o1O0lo4 == null) {
/* 888 */               OoOil11Ol1o.I000iOII("no descriptor for type constructor of ", o0iIl1);
/* 11 */                return null;
                    }
/* 633 */           if (Il0ooiloI.I0000oI00(iOIiO1lIl0lI00100o1O0lo4)) {
/* 639 */               return new O0IO0lIIoio("error/NonExistentClass");
                    }
/* 645 */           boolean z3 = iOIiO1lIl0lI00100o1O0lo4 instanceof OI000ilOol;
/* 647 */           if (z3 && O0i1lI0o1io.I001iOo1i0O(o0iIl1)) {
/* 663 */               if (o0iIl1.I00OIl().size() != 1) {
/* 744 */                   OoOil11Ol1o.I000OiO("arrays must have one type argument");
/* 11 */                    return null;
                        }
/* 673 */               OoOi1Ol ooOi1Ol = (OoOi1Ol) o0iIl1.I00OIl().get(0);
/* 675 */               O0iIl1 o0iIl1I00000oOI = ooOi1Ol.I00000oOI();
/* 685 */               if (ooOi1Ol.I00000oIO() == Ooo0Ioii0o0.I00iio) {
/* 691 */                   objI00000oOI = new O0IO0lIIoio("java/lang/Object");
                        } else {
/* 699 */                   int iOrdinal = ooOi1Ol.I00000oIO().ordinal();
/* 703 */                   if (iOrdinal == 0 ? (ooOOO1O2 = ooOOO1O.I0001Ioi1lo) != null : iOrdinal == 1 ? (ooOOO1O2 = ooOOO1O.I0000oI00) != null : (ooOOO1O2 = ooOOO1O.I0000Il00O) != null) {
/* 712 */                       ooOOO1O = ooOOO1O2;
                            }
/* 723 */                   objI00000oOI = I00000oOI(o0iIl1I00000oOI, ooOOO1O, function3);
                        }
/* 737 */               return i1O10l1io1iO.I000O01llI0("[".concat(i1O10l1io1iO.I000l1((O0IOO1lIiOl) objI00000oOI)));
                    }
/* 748 */           if (!z3) {
/* 836 */               if (iOIiO1lIl0lI00100o1O0lo4 instanceof OoOOiO) {
/* 840 */                   O0iIl1 o0iIl1I0000oI00 = lOoliOIOlIO0.I0000oI00((OoOOiO) iOIiO1lIl0lI00100o1O0lo4);
/* 848 */                   if (o0iIl1.I00iiI()) {
/* 850 */                       o0iIl1I0000oI00 = OoOilo0Oliii.I000II(o0iIl1I0000oI00);
                            }
/* 856 */                   return I00000oOI(o0iIl1I0000oI00, ooOOO1O, IOilI1lIII1.I00iiO);
                        }
/* 863 */               if ((iOIiO1lIl0lI00100o1O0lo4 instanceof IiOoI0oI) && ooOOO1O.I000II) {
/* 875 */                   return I00000oOI(((IiOoI0oI) iOIiO1lIl0lI00100o1O0lo4).I010ioo(), ooOOO1O, function3);
                        }
/* 882 */               OoOil11Ol1o.I000iOII("Unknown type ", o0iIl1);
/* 11 */                return null;
                    }
/* 754 */           if (Ioll0il1OI.I00000oOI(iOIiO1lIl0lI00100o1O0lo4) && !ooOOO1O.I00000oOI && (o0iIl12 = (O0iIl1) ilIoII0I1Oo.I00000oOI(o0iIl1, new HashSet())) != null) {
/* 793 */               return I00000oOI(o0iIl12, new OoOOO1O(ooOOO1O.I00000oIO, true, ooOOO1O.I0000Il00O, ooOOO1O.I0000O, ooOOO1O.I0000oI00, ooOOO1O.I0001Ioi1lo, ooOOO1O.I000II, ooOOO1O.I000O01llI0), function3);
                    }
/* 798 */           OI000ilOol oI000ilOol2 = (OI000ilOol) iOIiO1lIl0lI00100o1O0lo4;
/* 800 */           oI000ilOol2.I010i10l();
/* 809 */           if (oI000ilOol2.I00II0oii1o() == IOIOllO1oli.I00iio) {
/* 815 */               oI000ilOol2 = (OI000ilOol) oI000ilOol2.I000lI();
                    }
/* 827 */           O0IO0lIIoio o0IO0lIIoio2 = new O0IO0lIIoio(I00000oIO(oI000ilOol2.I010i10l(), loolooll));
/* 830 */           function3.invoke(o0iIl1, o0IO0lIIoio2, ooOOO1O);
/* 833 */           return o0IO0lIIoio2;
                }
            }

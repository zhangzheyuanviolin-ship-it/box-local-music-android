            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Map;
            
            public abstract class ilIoII0I1Oo {
                public static final OoOOlO11iOi I00000oIO(O0iIo0i1 o0iIo0i1) {
                    boolean zI001iOo1i0O;
                    Ooioo0o1l0 ooioo0o1l0I00l0OO0IO;
                    IlOIOIi00io ilOIOIi00ioI0001Ioi1lo;
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
/* 5 */             if (ol0O0iI0l0OI000II == null && ((ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIo0i1)) == null || (ol0O0iI0l0OI000II = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo)) == null)) {
/* 19 */                ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
                    }
/* 27 */            OoOOiO ooOOiOI0010I0i = ii00il1.I0010I0i(ii00il1.I00OIo(ol0O0iI0l0OI000II));
/* 31 */            if (ooOOiOI0010I0i != null) {
/* 168 */               return ooOOiOI0010I0i;
                    }
/* 39 */            if (o0iIo0i1 instanceof O0iIl1) {
/* 44 */                zI001iOo1i0O = O0i1lI0o1io.I001iOo1i0O((O0iIl1) o0iIo0i1);
                    } else {
/* 51 */                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 54 */                sb.append(o0iIo0i1);
/* 57 */                sb.append(", ");
/* 70 */                I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb));
/* 73 */                zI001iOo1i0O = false;
                    }
/* 75 */            if (zI001iOo1i0O) {
/* 86 */                OoOI1Ooo1 ooOI1Ooo1 = (OoOI1Ooo1) IOOi0Ool1i.I00OilO00Il(ii00il1.I000lI(o0iIo0i1));
/* 92 */                if (ii00il1.I00IlilI0i0i(ooOI1Ooo1)) {
/* 94 */                    ooioo0o1l0I00l0OO0IO = null;
                        } else {
/* 98 */                    if (!(ooOI1Ooo1 instanceof OoOi1Ol)) {
/* 120 */                       StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 123 */                       sb2.append(ooOI1Ooo1);
/* 126 */                       sb2.append(", ");
/* 139 */                       I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOI1Ooo1.getClass(), sb2));
/* 74 */                        return null;
                            }
/* 106 */                   ooioo0o1l0I00l0OO0IO = ((OoOi1Ol) ooOI1Ooo1).I00000oOI().I00l0OO0IO();
                        }
/* 110 */               if (ooioo0o1l0I00l0OO0IO != null) {
/* 112 */                   return I00000oIO(ooioo0o1l0I00l0OO0IO);
                        }
                    }
/* 74 */            return null;
                }

                public static final O0iIo0i1 I00000oOI(O0iIo0i1 o0iIo0i1, HashSet hashSet) {
                    Ol0O0iI0l0O ol0O0iI0l0OI000II;
                    O0iIo0i1 o0iIo0i1I00O10llo;
                    O0iIo0i1 o0iIo0i1I00000oOI;
                    OoOIOoO1I ooOIOoO1II000OOo1O;
/* 1 */             o0llIi o0llii = o0llIi.I00io1l;
/* 3 */             OoOIi1lliil ooOIi1lliilI00i01iIIliI = o0llii.I00i01iIIliI(o0iIo0i1);
/* 12 */            if (hashSet.add(ooOIi1lliilI00i01iIIliI)) {
/* 16 */                OoOOiO ooOOiOI0010I0i = ii00il1.I0010I0i(ooOIi1lliilI00i01iIIliI);
/* 20 */                boolean z = true;
/* 21 */                int i = 0;
/* 22 */                if (ooOOiOI0010I0i != null) {
/* 24 */                    O0iIo0i1 o0iIo0i1I00100l0 = ii00il1.I00100l0(ooOOiOI0010I0i);
/* 28 */                    O0iIo0i1 o0iIo0i1I00000oOI2 = I00000oOI(o0iIo0i1I00100l0, hashSet);
/* 32 */                    if (o0iIo0i1I00000oOI2 != null) {
/* 42 */                        if (!ii00il1.I001lllioOl(o0llii.I00i01iIIliI(o0iIo0i1I00100l0)) && (!(o0iIo0i1I00100l0 instanceof Ol0O1I) || !ii00il1.I00IOO((Ol0O1I) o0iIo0i1I00100l0))) {
/* 58 */                            z = false;
                                }
                                return ((o0iIo0i1I00000oOI2 instanceof Ol0O1I) && ii00il1.I00IOO((Ol0O1I) o0iIo0i1I00000oOI2) && ii00il1.I00IO1oi11O(o0iIo0i1) && z) ? o0llii.I0001Ioi1lo(o0iIo0i1I00100l0) : (ii00il1.I00IO1oi11O(o0iIo0i1I00000oOI2) || !ii00il1.I00II0oii1o(o0iIo0i1)) ? o0iIo0i1I00000oOI2 : o0llii.I0001Ioi1lo(o0iIo0i1I00000oOI2);
                            }
                        } else {
/* 108 */                   if (!ii00il1.I001lllioOl(ooOIi1lliilI00i01iIIliI)) {
/* 900 */                       return o0iIo0i1;
                            }
/* 114 */                   List listI000oI1ioi = ii00il1.I000oI1ioi(o0llii.I00i01iIIliI(o0iIo0i1));
/* 118 */                   List listI000lI = ii00il1.I000lI(o0iIo0i1);
/* 132 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000lI, 10));
/* 143 */                   for (Object obj : listI000lI) {
/* 149 */                       int i2 = i + 1;
/* 151 */                       if (i < 0) {
/* 176 */                           IOOi1I.I000lI();
/* 179 */                           throw null;
                                }
/* 155 */                       O0iIl1 o0iIl1I00100o1O0lo = ii00il1.I00100o1O0lo(o0llii, (OoOI1Ooo1) obj);
/* 159 */                       if (o0iIl1I00100o1O0lo == null) {
/* 167 */                           o0iIl1I00100o1O0lo = ii00il1.I00100l0((OoOOlO11iOi) listI000oI1ioi.get(i));
                                }
/* 171 */                       arrayList.add(o0iIl1I00100o1O0lo);
/* 174 */                       i = i2;
                            }
/* 180 */                   List<OoOOlO11iOi> list = listI000oI1ioi;
/* 188 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 203 */                   for (OoOOlO11iOi ooOOlO11iOi : list) {
/* 213 */                       if (ooOOlO11iOi instanceof OoOOiO) {
/* 217 */                           ooOIOoO1II000OOo1O = ((OoOOiO) ooOOlO11iOi).I000OOo1O();
                                } else {
/* 224 */                           StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 227 */                           sb.append(ooOOlO11iOi);
/* 230 */                           sb.append(", ");
/* 243 */                           I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOlO11iOi.getClass(), sb));
/* 246 */                           ooOIOoO1II000OOo1O = null;
                                }
/* 247 */                       arrayList2.add(ooOIOoO1II000OOo1O);
                            }
/* 255 */                   Map mapI000OiO = O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(arrayList2, arrayList));
/* 265 */                   ArrayList arrayList3 = new ArrayList(mapI000OiO.size());
/* 280 */                   for (Map.Entry entry : mapI000OiO.entrySet()) {
/* 314 */                       arrayList3.add(new OIoi0IIoi((OoOIOoO1I) ((OoOIi1lliil) entry.getKey()), new OlIo1I((O0iIl1) ((O0iIo0i1) entry.getValue()))));
                            }
/* 318 */                   Map mapI000OiO2 = O1Oii0O0loo.I000OiO(arrayList3);
/* 322 */                   OoOilII0 ooOilII0 = OoOilII0.I00000oOI;
/* 326 */                   OlIo1o0I0iIo olIo1o0I0iIo = new OlIo1o0I0iIo(1);
/* 329 */                   olIo1o0I0iIo.I0000O = mapI000OiO2;
/* 331 */                   VarHandle.storeStoreFence();
/* 336 */                   OoOilII0 ooOilII02 = new OoOilII0(olIo1o0I0iIo);
/* 341 */                   if (o0iIo0i1 instanceof O0iIl1) {
/* 346 */                       ol0O0iI0l0OI000II = Ioll0il1OI.I000II((O0iIl1) o0iIo0i1);
                            } else {
/* 353 */                       StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 356 */                       sb2.append(o0iIo0i1);
/* 359 */                       sb2.append(", ");
/* 372 */                       I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb2));
/* 375 */                       ol0O0iI0l0OI000II = null;
                            }
/* 376 */                   if (ol0O0iI0l0OI000II == null) {
/* 378 */                       o0iIo0i1I00O10llo = null;
                            } else {
/* 380 */                       OoOOlO11iOi ooOOlO11iOiI00000oIO = I00000oIO(ol0O0iI0l0OI000II);
/* 399 */                       o0iIo0i1I00O10llo = ooOOlO11iOiI00000oIO == null ? ii00il1.I00O10llo(ooOilII02, ol0O0iI0l0OI000II) : I0000Il00O(ol0O0iI0l0OI000II, ii00il1.I00O10llo(ooOilII02, ii00il1.I00100l0(ooOOlO11iOiI00000oIO)));
                            }
/* 403 */                   if (o0iIo0i1I00O10llo != null && (o0iIo0i1I00000oOI = I00000oOI(o0iIo0i1I00O10llo, hashSet)) != null) {
                                return !ii00il1.I00IO1oi11O(o0iIo0i1) ? o0iIo0i1I00000oOI : ii00il1.I00IO1oi11O(o0iIo0i1I00000oOI) ? o0iIo0i1 : ((o0iIo0i1I00000oOI instanceof Ol0O1I) && ii00il1.I00IOO((Ol0O1I) o0iIo0i1I00000oOI)) ? o0iIo0i1 : o0llii.I0001Ioi1lo(o0iIo0i1I00000oOI);
                            }
                        }
                    }
/* 11 */            return null;
                }

                public static final O0iIo0i1 I0000Il00O(O0iIo0i1 o0iIo0i1, O0iIo0i1 o0iIo0i12) {
                    IlOIOIi00io ilOIOIi00ioI0001Ioi1lo;
/* 1 */             o0llIi o0llii = o0llIi.I00io1l;
/* 3 */             Ol0O0iI0l0O ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
/* 7 */             if (ol0O0iI0l0OI000II == null && ((ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIo0i1)) == null || (ol0O0iI0l0OI000II = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo)) == null)) {
/* 21 */                ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
                    }
/* 33 */            if (ii00il1.I0010I0i(ii00il1.I00OIo(ol0O0iI0l0OI000II)) != null) {
                        return ii00il1.I00IO1oi11O(o0iIo0i1) ? o0llii.I0001Ioi1lo(o0iIo0i12) : o0iIo0i12;
                    }
/* 55 */            OoOI1Ooo1 ooOI1Ooo1 = (OoOI1Ooo1) IOOi0Ool1i.I00OilO00Il(ii00il1.I000lI(o0iIo0i1));
/* 71 */            if (Il1Oi0.I00000oIO[ii00il1.I0010o(ooOI1Ooo1).ordinal()] == 1) {
/* 124 */               o0llii.I0000O();
/* 332 */               throw null;
                    }
/* 83 */            if (I0000Il00O(ii00il1.I00100o1O0lo(o0llii, ooOI1Ooo1), o0iIo0i12) instanceof O0iIl1) {
/* 85 */                o0llii.I0000O();
/* 88 */                throw null;
                    }
/* 93 */            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 96 */            sb.append(o0llii);
/* 101 */           sb.append(", ");
/* 123 */           throw new IllegalArgumentException(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0llii.getClass(), sb).toString());
                }
            }

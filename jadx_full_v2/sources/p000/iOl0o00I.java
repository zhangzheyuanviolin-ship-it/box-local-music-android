            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class iOl0o00I {
                public static final I1Ii11 I00000oIO(O0iIl1 o0iIl1) {
                    OoOI10li1I ooOI10li1I;
/* 7 */             if (o0iIl1.I00l0OO0IO() instanceof IlOIOIi00io) {
/* 13 */                I1Ii11 i1Ii11I00000oIO = I00000oIO(ilOiIOII1.I00000oIO(o0iIl1));
/* 21 */                I1Ii11 i1Ii11I00000oIO2 = I00000oIO(ilOiIOII1.I00000oOI(o0iIl1));
/* 83 */                return new I1Ii11(lOoll01ll0I.I00000oOI(l0loOIIo0iOo.I00000oIO(ilOiIOII1.I00000oIO((O0iIl1) i1Ii11I00000oIO.I00000oIO), ilOiIOII1.I00000oOI((O0iIl1) i1Ii11I00000oIO2.I00000oIO)), lOoll01ll0I.I00000oIO(o0iIl1)), lOoll01ll0I.I00000oOI(l0loOIIo0iOo.I00000oIO(ilOiIOII1.I00000oIO((O0iIl1) i1Ii11I00000oIO.I00000oOI), ilOiIOII1.I00000oOI((O0iIl1) i1Ii11I00000oIO2.I00000oOI)), lOoll01ll0I.I00000oIO(o0iIl1)));
                    }
/* 87 */            OoOIOoO1I ooOIOoO1II00iOIl = o0iIl1.I00iOIl();
/* 99 */            boolean z = true;
/* 100 */           if (o0iIl1.I00iOIl() instanceof IO0OIooI) {
/* 104 */               OoOi1Ol ooOi1OlI001IO000 = ((IO0OIooI) ooOIOoO1II00iOIl).I001IO000();
/* 116 */               O0iIl1 o0iIl1I000OOo1O = OoOilo0Oliii.I000OOo1O(ooOi1OlI001IO000.I00000oOI(), o0iIl1.I00iiI());
/* 124 */               int iOrdinal = ooOi1OlI001IO000.I00000oIO().ordinal();
/* 128 */               if (iOrdinal == 1) {
/* 170 */                   return new I1Ii11(o0iIl1I000OOo1O, lOoliOIOlIO0.I0000O(o0iIl1).I000oI1ioi());
                        }
/* 130 */               if (iOrdinal == 2) {
/* 150 */                   return new I1Ii11(OoOilo0Oliii.I000OOo1O(lOoliOIOlIO0.I0000O(o0iIl1).I000o00OoI0I(), o0iIl1.I00iiI()), o0iIl1I000OOo1O);
                        }
/* 156 */               IoOOl0iOl1io.I001i1lo1io("Only nontrivial projections should have been captured, not: ", ooOi1OlI001IO000);
/* 97 */                return null;
                    }
/* 182 */           if (o0iIl1.I00OIl().isEmpty() || o0iIl1.I00OIl().size() != ooOIOoO1II00iOIl.I000II().size()) {
/* 484 */               return new I1Ii11(o0iIl1, o0iIl1);
                    }
/* 206 */           ArrayList arrayList = new ArrayList();
/* 211 */           ArrayList arrayList2 = new ArrayList();
/* 230 */           Iterator it = IOOi0Ool1i.I00ilO0(o0iIl1.I00OIl(), ooOIOoO1II00iOIl.I000II()).iterator();
/* 238 */           while (it.hasNext()) {
/* 244 */               OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 248 */               OoOi1Ol ooOi1Ol = (OoOi1Ol) oIoi0IIoi.I00iOIl;
/* 252 */               OoOOiO ooOOiO = (OoOOiO) oIoi0IIoi.I00iiI;
/* 254 */               Ooo0Ioii0o0 ooo0Ioii0o0I000l1 = ooOOiO.I000l1();
/* 258 */               if (ooo0Ioii0o0I000l1 == null) {
/* 413 */                   OoOilII0.I00000oIO(35);
/* 416 */                   throw null;
                        }
/* 260 */               if (ooOi1Ol == null) {
/* 407 */                   OoOilII0.I00000oIO(36);
/* 410 */                   throw null;
                        }
/* 262 */               OoOilII0 ooOilII0 = OoOilII0.I00000oOI;
/* 281 */               int iOrdinal2 = (ooOi1Ol.I0000Il00O() ? Ooo0Ioii0o0.I00ilI0I1 : OoOilII0.I00000oOI(ooo0Ioii0o0I000l1, ooOi1Ol.I00000oIO())).ordinal();
/* 285 */               if (iOrdinal2 == 0) {
/* 341 */                   ooOI10li1I = new OoOI10li1I(ooOOiO, ooOi1Ol.I00000oOI(), ooOi1Ol.I00000oOI());
                        } else if (iOrdinal2 == 1) {
/* 327 */                   ooOI10li1I = new OoOI10li1I(ooOOiO, ooOi1Ol.I00000oOI(), IiOiOOIo.I0000oI00(ooOOiO).I000oI1ioi());
                        } else {
/* 289 */                   if (iOrdinal2 != 2) {
/* 309 */                       I000II.I00000oIO();
/* 97 */                        return null;
                            }
/* 305 */                   ooOI10li1I = new OoOI10li1I(ooOOiO, IiOiOOIo.I0000oI00(ooOOiO).I000o00OoI0I(), ooOi1Ol.I00000oOI());
                        }
/* 348 */               if (ooOi1Ol.I0000Il00O()) {
/* 350 */                   arrayList.add(ooOI10li1I);
/* 353 */                   arrayList2.add(ooOI10li1I);
                        } else {
/* 359 */                   I1Ii11 i1Ii11I00000oIO3 = I00000oIO(ooOI10li1I.I00000oOI);
/* 365 */                   O0iIl1 o0iIl12 = (O0iIl1) i1Ii11I00000oIO3.I00000oIO;
/* 369 */                   O0iIl1 o0iIl13 = (O0iIl1) i1Ii11I00000oIO3.I00000oOI;
/* 373 */                   I1Ii11 i1Ii11I00000oIO4 = I00000oIO(ooOI10li1I.I0000Il00O);
/* 379 */                   O0iIl1 o0iIl14 = (O0iIl1) i1Ii11I00000oIO4.I00000oIO;
/* 383 */                   O0iIl1 o0iIl15 = (O0iIl1) i1Ii11I00000oIO4.I00000oOI;
/* 387 */                   OoOOiO ooOOiO2 = ooOI10li1I.I00000oIO;
/* 389 */                   OoOI10li1I ooOI10li1I2 = new OoOI10li1I(ooOOiO2, o0iIl13, o0iIl14);
/* 394 */                   OoOI10li1I ooOI10li1I3 = new OoOI10li1I(ooOOiO2, o0iIl12, o0iIl15);
/* 397 */                   arrayList.add(ooOI10li1I2);
/* 400 */                   arrayList2.add(ooOI10li1I3);
                        }
                    }
/* 422 */           if (arrayList.isEmpty()) {
/* 424 */               z = false;
                    } else {
/* 426 */               Iterator it2 = arrayList.iterator();
/* 434 */               while (it2.hasNext()) {
/* 440 */                   OoOI10li1I ooOI10li1I4 = (OoOI10li1I) it2.next();
/* 442 */                   ooOI10li1I4.getClass();
/* 455 */                   if (!O0iIo00.I00000oIO.I00000oOI(ooOI10li1I4.I00000oOI, ooOI10li1I4.I0000Il00O)) {
                                break;
                            }
                        }
/* 424 */               z = false;
                    }
/* 478 */           return new I1Ii11(z ? lOoliOIOlIO0.I0000O(o0iIl1).I000o00OoI0I() : I00000oOI(o0iIl1, arrayList), I00000oOI(o0iIl1, arrayList2));
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final O0iIl1 I00000oOI(O0iIl1 o0iIl1, ArrayList arrayList) {
                    OlIo1I olIo1I;
/* 5 */             o0iIl1.I00OIl().size();
/* 8 */             arrayList.size();
/* 19 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 22 */            Iterator it = arrayList.iterator();
/* 31 */            while (it.hasNext()) {
/* 37 */                OoOI10li1I ooOI10li1I = (OoOI10li1I) it.next();
/* 39 */                ooOI10li1I.getClass();
/* 42 */                O0iIl1 o0iIl12 = ooOI10li1I.I0000Il00O;
/* 44 */                O0iIl1 o0iIl13 = ooOI10li1I.I00000oOI;
/* 46 */                OoOOiO ooOOiO = ooOI10li1I.I00000oIO;
/* 50 */                O0iIo00.I00000oIO.I00000oOI(o0iIl13, o0iIl12);
/* 57 */                if (!O0000Ioio00.I0000O(o0iIl13, o0iIl12)) {
/* 59 */                    Ooo0Ioii0o0 ooo0Ioii0o0I000l1 = ooOOiO.I000l1();
/* 63 */                    Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iio;
/* 65 */                    if (ooo0Ioii0o0I000l1 == ooo0Ioii0o0) {
/* 148 */                       olIo1I = new OlIo1I(o0iIl13);
                            } else if (O0i1lI0o1io.I00II0oii1o(o0iIl13) && ooOOiO.I000l1() != ooo0Ioii0o0) {
/* 82 */                        Ooo0Ioii0o0 ooo0Ioii0o02 = Ooo0Ioii0o0.I00ilI0I1;
/* 88 */                        if (ooo0Ioii0o02 == ooOOiO.I000l1()) {
/* 90 */                            ooo0Ioii0o02 = Ooo0Ioii0o0.I00iiO;
                                }
/* 92 */                        olIo1I = new OlIo1I(o0iIl12, ooo0Ioii0o02);
                            } else {
/* 96 */                        if (o0iIl12 == null) {
/* 142 */                           O0i1lI0o1io.I00000oIO(140);
/* 145 */                           throw null;
                                }
/* 102 */                       if (O0i1lI0o1io.I001i1lo1io(o0iIl12) && o0iIl12.I00iiI()) {
/* 116 */                           if (ooo0Ioii0o0 == ooOOiO.I000l1()) {
/* 118 */                               ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
                                    }
/* 120 */                           olIo1I = new OlIo1I(o0iIl13, ooo0Ioii0o0);
                                } else {
/* 126 */                           Ooo0Ioii0o0 ooo0Ioii0o03 = Ooo0Ioii0o0.I00ilI0I1;
/* 132 */                           if (ooo0Ioii0o03 == ooOOiO.I000l1()) {
/* 134 */                               ooo0Ioii0o03 = Ooo0Ioii0o0.I00iiO;
                                    }
/* 136 */                           olIo1I = new OlIo1I(o0iIl12, ooo0Ioii0o03);
                                }
                            }
                        }
/* 151 */               arrayList2.add(olIo1I);
                    }
/* 157 */           return lOoil0Io0Io.I0000Il00O(o0iIl1, arrayList2, null, 6);
                }
            }

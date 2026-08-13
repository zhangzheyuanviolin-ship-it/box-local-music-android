            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class IiOl00l00 implements IllOOo00lI {
                public final int I00iOIl;
                public IiOlI10iOI I00iiI;

                public IiOl00l00(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    Object next;
                    IiOiOloo0 iiOiOloo0;
                    Object oi0o10;
                    Ol0O0iI0l0O ol0O0iI0l0OI00oO101o;
/* 6 */             boolean z = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 628 */                   IiOlI10iOI iiOlI10iOI = this.I00iiI;
/* 630 */                   IOIOllO1oli iOIOllO1oli = iiOlI10iOI.I00li1OI;
/* 636 */                   if (!iOIOllO1oli.I00000oIO()) {
/* 713 */                       Iterator it = iiOlI10iOI.I00ilI0I1.I00o0l1o1o0.iterator();
                                while (true) {
/* 721 */                           if (it.hasNext()) {
/* 723 */                               next = it.next();
/* 742 */                               if (!IlO1il.I000o00OoI0I.I0000oI00(((OOOiIOiii) next).I00iio).booleanValue()) {
                                        }
                                    } else {
/* 745 */                               next = null;
                                    }
                                }
/* 746 */                       OOOiIOiii oOOiIOiii = (OOOiIOiii) next;
/* 748 */                       if (oOOiIOiii != null) {
/* 756 */                           return ((O1iiIOlO) iiOlI10iOI.I00ll1.I00l0OO0IO).I0000oI00(oOOiIOiii, true);
                                }
/* 7 */                         return null;
                            }
/* 647 */                   IiO0oOII iiO0oOII = new IiO0oOII(iiOlI10iOI, null, i1i0olI.I00iiO, true, 1, OlI1o0ooI.I00IO1);
/* 650 */                   List list = Collections.EMPTY_LIST;
/* 652 */                   int i = IiOiIO0i1Oil.I00000oIO;
/* 656 */                   if (iOIOllO1oli == IOIOllO1oli.I00iiO || iOIOllO1oli.I00000oIO() || IiOiIO0i1Oil.I000oI1ioi(iiOlI10iOI)) {
/* 671 */                       iiOiOloo0 = IiOiioI.I00000oIO;
                            } else if (IiOiIO0i1Oil.I000OiO(iiOlI10iOI)) {
/* 680 */                       iiOiOloo0 = IiOiioI.I000OiO;
/* 682 */                       if (iiOiOloo0 == null) {
/* 687 */                           IiOiIO0i1Oil.I00000oIO(52);
/* 690 */                           throw null;
                                }
                            } else {
/* 691 */                       iiOiOloo0 = IiOiioI.I0000oI00;
                            }
/* 696 */                   iiO0oOII.I011IO1I11OI(list, iiOiOloo0);
/* 703 */                   iiO0oOII.I00io1l = iiOlI10iOI.I00Ol10();
/* 705 */                   return iiO0oOII;
                        case 1:
/* 508 */                   IiOlI10iOI iiOlI10iOI2 = this.I00iiI;
/* 510 */                   IiOili0lOO1 iiOili0lOO1 = iiOlI10iOI2.I00ll1;
/* 514 */                   List list2 = iiOlI10iOI2.I00ilI0I1.I00o0l1o1o0;
/* 520 */                   ArrayList arrayList = new ArrayList();
/* 531 */                   for (Object obj : list2) {
/* 552 */                       if (IlO1il.I000o00OoI0I.I0000oI00(((OOOiIOiii) obj).I00iio).booleanValue()) {
/* 554 */                           arrayList.add(obj);
                                }
                            }
/* 564 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 567 */                   Iterator it2 = arrayList.iterator();
/* 575 */                   while (it2.hasNext()) {
/* 591 */                       arrayList2.add(((O1iiIOlO) iiOili0lOO1.I00l0OO0IO).I0000oI00((OOOiIOiii) it2.next(), false));
                            }
/* 623 */                   return IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00O10llo(arrayList2, IOOi1I.I000OOo1O(iiOlI10iOI2.I00ll1())), ((I0OI00O) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000lI).I00II0oii1o(iiOlI10iOI2));
                        case 2:
/* 468 */                   IiOlI10iOI iiOlI10iOI3 = this.I00iiI;
/* 470 */                   OOOi0i1IOo oOOi0i1IOo = iiOlI10iOI3.I00ilI0I1;
/* 476 */                   if ((oOOi0i1IOo.I00iiO & 4) != 4) {
/* 7 */                         return null;
                            }
/* 496 */                   IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = iiOlI10iOI3.I00oIiI10().I0000oI00(l1iI1lOO.I00000oOI((OI1IlOlol) iiOlI10iOI3.I00ll1.I00iiO, oOOi0i1IOo.I00ilO0), OIIl0iOOlo.I00io1l);
/* 502 */                   if (iOIiO1lIl0lI0000oI00 instanceof OI000ilOol) {
/* 505 */                       return (OI000ilOol) iOIiO1lIl0lI0000oI00;
                            }
/* 7 */                     return null;
                        case 3:
/* 328 */                   IiOlI10iOI iiOlI10iOI4 = this.I00iiI;
/* 330 */                   O1oIIloii0 o1oIIloii0 = iiOlI10iOI4.I00l0I0l0lO1;
/* 332 */                   O1oIIloii0 o1oIIloii02 = O1oIIloii0.I00iiO;
/* 334 */                   if (o1oIIloii0 == o1oIIloii02) {
/* 339 */                       List<Integer> list3 = iiOlI10iOI4.I00ilI0I1.I00oO101o;
/* 348 */                       if (!list3.isEmpty()) {
/* 354 */                           ArrayList arrayList3 = new ArrayList();
/* 365 */                           for (Integer num : list3) {
/* 373 */                               IiOili0lOO1 iiOili0lOO12 = iiOlI10iOI4.I00ll1;
/* 377 */                               Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) iiOili0lOO12.I00iiI;
/* 387 */                               IOIOill iOIOillI00000oIO = l1iI1lOO.I00000oIO((OI1IlOlol) iiOili0lOO12.I00iiO, num.intValue());
/* 395 */                               I1ooIoloo0 i1ooIoloo0 = ((IOIOiIiilIl) ii10lIo0l1.I0010o).I00000oOI;
/* 399 */                               IOIOOIoOIO iOIOOIoOIO = new IOIOOIoOIO();
/* 402 */                               iOIOOIoOIO.I00000oIO = iOIOillI00000oIO;
/* 404 */                               iOIOOIoOIO.I00000oOI = null;
/* 406 */                               VarHandle.storeStoreFence();
/* 413 */                               OI000ilOol oI000ilOol = (OI000ilOol) i1ooIoloo0.invoke(iOIOOIoOIO);
/* 415 */                               if (oI000ilOol != null) {
/* 417 */                                   arrayList3.add(oI000ilOol);
                                        }
                                    }
/* 467 */                           return arrayList3;
                                }
/* 421 */                       if (o1oIIloii0 == o1oIIloii02) {
/* 428 */                           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 431 */                           Ii1Ool1 ii1Ool1 = iiOlI10iOI4.I00o101lO;
/* 435 */                           if (ii1Ool1 instanceof OIo0il) {
/* 443 */                               ii01iIOIiiI.I00000oIO(iiOlI10iOI4, linkedHashSet, ((OIo0il) ii1Ool1).I00IoiI(), false);
                                    }
/* 450 */                           ii01iIOIiiI.I00000oIO(iiOlI10iOI4, linkedHashSet, iiOlI10iOI4.I00l0I0l0lO1(), true);
/* 460 */                           return IOOi0Ool1i.I00Ol1ll1(linkedHashSet, new IliIiio1(13));
                                }
                            }
/* 423 */                   return Il01100l.I00iOIl;
                        case 4:
/* 41 */                    IiOlI10iOI iiOlI10iOI5 = this.I00iiI;
/* 47 */                    if (!iiOlI10iOI5.I00100o1O0lo() && !iiOlI10iOI5.I00o101lO()) {
/* 7 */                         return null;
                            }
/* 60 */                    boolean zI00000oIO = iiOlI10iOI5.I00ilO0.I00000oIO(1, 5, 1);
/* 64 */                    OOOi0i1IOo oOOi0i1IOo2 = iiOlI10iOI5.I00ilI0I1;
/* 66 */                    IiOili0lOO1 iiOili0lOO13 = iiOlI10iOI5.I00ll1;
/* 70 */                    OI1IlOlol oI1IlOlol = (OI1IlOlol) iiOili0lOO13.I00iiO;
/* 74 */                    Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO13.I00ilI0I1;
/* 78 */                    IOiOol0 iOiOol0 = (IOiOol0) iiOili0lOO13.I00l0I0l0lO1;
/* 85 */                    if ((oOOi0i1IOo2.I00iiO & 8) == 8) {
/* 89 */                        OI1Iio0ii1 oI1Iio0ii1I00000oOI = l1iI1lOO.I00000oOI(oI1IlOlol, oOOi0i1IOo2.I00ol1);
/* 93 */                        int i2 = oOOi0i1IOo2.I00iiO;
/* 116 */                       OOi001oo1OOI oOi001oo1OOII00100l0 = (i2 & 16) == 16 ? oOOi0i1IOo2.I00olI : (i2 & 32) == 32 ? oi0Oooi.I00100l0(oOOi0i1IOo2.I00oli) : null;
/* 117 */                       if ((oOi001oo1OOII00100l0 == null || (ol0O0iI0l0OI00oO101o = iOiOol0.I00IOO(oOi001oo1OOII00100l0, true)) == null) && (ol0O0iI0l0OI00oO101o = iiOlI10iOI5.I00oO101o(oI1Iio0ii1I00000oOI)) == null) {
/* 148 */                           IoOOl0iOl1io.I001IO000("cannot determine underlying type for value class ", l1iI1lOO.I00000oOI(oI1IlOlol, oOOi0i1IOo2.I00ilI0I1), " with property ", oI1Iio0ii1I00000oOI);
/* 7 */                             return null;
                                }
/* 133 */                       oi0o10 = new Ioll0i(oI1Iio0ii1I00000oOI, ol0O0iI0l0OI00oO101o);
                            } else if (zI00000oIO && IlO1il.I000iOII.I0000oI00(oOOi0i1IOo2.I00iio).booleanValue()) {
/* 173 */                       Iterator it3 = oOOi0i1IOo2.I00o0l1o1o0.iterator();
/* 177 */                       Object obj2 = null;
                                while (true) {
/* 182 */                           if (it3.hasNext()) {
/* 184 */                               Object next2 = it3.next();
/* 203 */                               if (!IlO1il.I000o00OoI0I.I0000oI00(((OOOiIOiii) next2).I00iio).booleanValue()) {
/* 205 */                                   if (!z) {
/* 209 */                                       z = true;
/* 210 */                                       obj2 = next2;
                                            }
                                        }
                                    } else if (!z) {
                                    }
                                }
/* 207 */                       obj2 = null;
/* 215 */                       OOOiIOiii oOOiIOiii2 = (OOOiIOiii) obj2;
/* 217 */                       if (oOOiIOiii2 != null) {
/* 221 */                           List<OOi0iiO0iOi> list4 = oOOiIOiii2.I00ilI0I1;
/* 231 */                           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 242 */                           for (OOi0iiO0iOi oOi0iiO0iOi : list4) {
/* 269 */                               arrayList4.add(new OIoi0IIoi(l1iI1lOO.I00000oOI(oI1IlOlol, oOi0iiO0iOi.I00ilI0I1), iOiOol0.I00IOO(lIOOli.I000OiO(oOi0iiO0iOi, oi0Oooi), true)));
                                    }
/* 275 */                           oi0o10 = new OI0O10(arrayList4);
                                }
                            } else {
/* 219 */                       oi0o10 = null;
                            }
/* 278 */                   if (oi0o10 != null) {
/* 280 */                       return oi0o10;
                            }
/* 282 */                   if (zI00000oIO) {
/* 7 */                         return null;
                            }
/* 284 */                   IOIO10lo iOIO10loI00ll1 = iiOlI10iOI5.I00ll1();
/* 288 */                   if (iOIO10loI00ll1 == null) {
/* 324 */                       IOOlIIilOl0.I000lI("Inline class has no primary constructor: ", iiOlI10iOI5);
/* 7 */                         return null;
                            }
/* 300 */                   OI1Iio0ii1 name = ((Ooo00oi0O) IOOi0Ool1i.I001lllioOl(iOIO10loI00ll1.I00Iooi00oi())).getName();
/* 304 */                   Ol0O0iI0l0O ol0O0iI0l0OI00oO101o2 = iiOlI10iOI5.I00oO101o(name);
/* 308 */                   if (ol0O0iI0l0OI00oO101o2 != null) {
/* 312 */                       return new Ioll0i(name, ol0O0iI0l0OI00oO101o2);
                            }
/* 318 */                   IOOlIIilOl0.I000lI("Value class has no underlying property: ", iiOlI10iOI5);
/* 7 */                     return null;
                        case 5:
/* 18 */                    IiOlI10iOI iiOlI10iOI6 = this.I00iiI;
/* 36 */                    return IOOi0Ool1i.I00iIi0i1o(((I111ioIIo01) ((Ii10lIo0l1) iiOlI10iOI6.I00ll1.I00iiI).I0000oI00).I001IO000(iiOlI10iOI6.I00oO101o));
                        default:
/* 13 */                    return lOoii1O1lI1O.I00000oOI(this.I00iiI);
                    }
                }
            }

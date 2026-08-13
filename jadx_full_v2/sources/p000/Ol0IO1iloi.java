            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Ol0IO1iloi {
                public final I1110ii00 I00000oIO;
                public final boolean I00000oOI;
                public final o01l1ioOo0 I0000Il00O;
                public final I11I1111oi0 I0000O;
                public final boolean I0000oI00;

                public Ol0IO1iloi(I1110ii00 i1110ii00, boolean z, o01l1ioOo0 o01l1iooo0, I11I1111oi0 i11I1111oi0, boolean z2) {
/* 4 */             this.I00000oIO = i1110ii00;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = o01l1iooo0;
/* 10 */            this.I0000O = i11I1111oi0;
/* 12 */            this.I0000oI00 = z2;
                }

                public static void I00000oIO(Object obj, ArrayList arrayList, I00iiI i00iiI) {
/* 1 */             arrayList.add(obj);
/* 8 */             Iterable iterable = (Iterable) i00iiI.invoke(obj);
/* 10 */            if (iterable != null) {
/* 12 */                Iterator it = iterable.iterator();
/* 20 */                while (it.hasNext()) {
/* 26 */                    I00000oIO(it.next(), arrayList, i00iiI);
                        }
                    }
                }

                public static OIOOOO I0000Il00O(O0iIo0i1 o0iIo0i1) {
                    Ol0O0iI0l0O ol0O0iI0l0OI000II;
                    Ol0O0iI0l0O ol0O0iI0l0OI000II2;
/* 1 */             IlOIOIi00io ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIo0i1);
/* 5 */             if (ilOIOIi00ioI0001Ioi1lo == null || (ol0O0iI0l0OI000II = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo)) == null) {
/* 13 */                ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
                    }
/* 21 */            if (ii00il1.I00II0oii1o(ol0O0iI0l0OI000II)) {
/* 23 */                return OIOOOO.I00iiI;
                    }
/* 26 */            IlOIOIi00io ilOIOIi00ioI0001Ioi1lo2 = ii00il1.I0001Ioi1lo(o0iIo0i1);
/* 30 */            if (ilOIOIi00ioI0001Ioi1lo2 == null || (ol0O0iI0l0OI000II2 = ii00il1.I00OOll1(ilOIOIi00ioI0001Ioi1lo2)) == null) {
/* 38 */                ol0O0iI0l0OI000II2 = ii00il1.I000II(o0iIo0i1);
                    }
/* 46 */            if (ii00il1.I00II0oii1o(ol0O0iI0l0OI000II2)) {
/* 51 */                return null;
                    }
/* 48 */            return OIOOOO.I00iiO;
                }

                public final OIOOOO0 I00000oOI(OoOOlO11iOi ooOOlO11iOi) {
                    List list;
                    OIOOOO oioooo;
/* 4 */             if (ooOOlO11iOi instanceof O0lO1101) {
/* 10 */                if (!(ooOOlO11iOi instanceof OoOOiO)) {
/* 271 */                   StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 274 */                   sb.append(ooOOlO11iOi);
/* 279 */                   sb.append(", ");
/* 292 */                   I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOlO11iOi.getClass(), sb));
/* 3 */                     return null;
                        }
/* 14 */                List upperBounds = ((OoOOiO) ooOOlO11iOi).getUpperBounds();
/* 19 */                List list2 = upperBounds;
/* 23 */                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 36 */                    Iterator it = list2.iterator();
                            while (true) {
/* 44 */                        if (!it.hasNext()) {
                                    break;
                                }
/* 56 */                        if (!ii00il1.I001lIiIIo1O((O0iIo0i1) it.next())) {
/* 60 */                            ArrayList arrayList = new ArrayList();
/* 71 */                            for (Object obj : list2) {
/* 84 */                                if (I0000Il00O((O0iIo0i1) obj) != null) {
/* 86 */                                    arrayList.add(obj);
                                        }
                                    }
/* 90 */                            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 95 */                            I01i01iOOOIo i01i01iOOOIo = new I01i01iOOOIo(0);
/* 98 */                            i01i01iOOOIo.I00iiI = upperBounds;
/* 100 */                           VarHandle.storeStoreFence();
/* 103 */                           O0ioIllo0i1 o0ioIllo0i1I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01i01iOOOIo);
/* 112 */                           if (!arrayList.isEmpty()) {
/* 118 */                               if (!arrayList.isEmpty()) {
/* 121 */                                   Iterator it2 = arrayList.iterator();
/* 129 */                                   if (it2.hasNext()) {
/* 137 */                                       list = upperBounds;
                                            }
                                        }
/* 143 */                               return new OIOOOO0(OIOOOO.I00iOIl, false);
                                    }
/* 159 */                           if (!((List) o0ioIllo0i1I00000oIO.getValue()).isEmpty()) {
/* 165 */                               List list3 = (List) o0ioIllo0i1I00000oIO.getValue();
/* 171 */                               if (!(list3 instanceof Collection) || !list3.isEmpty()) {
/* 183 */                                   Iterator it3 = list3.iterator();
/* 191 */                                   if (it3.hasNext()) {
/* 203 */                                       list = (List) o0ioIllo0i1I00000oIO.getValue();
                                            }
                                        }
/* 262 */                               return new OIOOOO0(OIOOOO.I00iOIl, true);
                                    }
/* 206 */                           List list4 = list;
/* 210 */                           if ((list4 instanceof Collection) && list4.isEmpty()) {
/* 247 */                               oioooo = OIOOOO.I00iiI;
                                    } else {
/* 222 */                               Iterator it4 = list4.iterator();
/* 230 */                               while (it4.hasNext()) {
/* 242 */                                   if (!ii00il1.I00IO1oi11O((O0iIo0i1) it4.next())) {
/* 244 */                                       oioooo = OIOOOO.I00iiO;
                                                break;
                                            }
                                        }
/* 247 */                               oioooo = OIOOOO.I00iiI;
                                    }
/* 254 */                           return new OIOOOO0(oioooo, list != upperBounds);
                                }
                            }
                        }
                    }
/* 3 */             return null;
                }

                public final ArrayList I0000O(O0iIo0i1 o0iIo0i1) {
/* 3 */             o01l1ioOo0 o01l1iooo0 = this.I0000Il00O;
/* 35 */            I01i1I i01i1I = new I01i1I(o0iIo0i1, I11II1o.I00000oOI((I11II1o) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000OiO, (O00ooi0o0iiO) ((O0ioIllo0i1) o01l1iooo0.I00iiO).getValue(), ((O0iIl1) o0iIo0i1).getAnnotations()), null);
/* 41 */            I00iiI i00iiI = new I00iiI(3);
/* 44 */            i00iiI.I00iiI = this;
/* 46 */            VarHandle.storeStoreFence();
/* 52 */            ArrayList arrayList = new ArrayList(1);
/* 55 */            I00000oIO(i01i1I, arrayList, i00iiI);
/* 186 */           return arrayList;
                }
            }

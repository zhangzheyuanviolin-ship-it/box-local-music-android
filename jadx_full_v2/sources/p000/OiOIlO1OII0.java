            package p000;

            import android.speech.tts.Voice;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class OiOIlO1OII0 implements Comparator {
                public static final OiOIlO1OII0 I00iiI = new OiOIlO1OII0(8);
                public static final OiOIlO1OII0 I00iiO = new OiOIlO1OII0(16);
                public final int I00iOIl;

                public OiOIlO1OII0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 694 */                   return iii1OiiIi.I00000oIO((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
                        case 1:
/* 673 */                   return iii1OiiIi.I00000oIO((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
                        case 2:
/* 652 */                   return iii1OiiIi.I00000oIO(((Voice) obj).getName(), ((Voice) obj2).getName());
                        case 3:
/* 507 */                   Iterator it = ((IIo1loI0) obj).I00000oOI.iterator();
/* 515 */                   if (it.hasNext()) {
/* 531 */                       Integer numValueOf = Integer.valueOf(OlOO00iI0lI.I00lll10.indexOf(((OlOIo0l1O0Ol) it.next()).I000O01llI0));
/* 539 */                       while (it.hasNext()) {
/* 555 */                           Integer numValueOf2 = Integer.valueOf(OlOO00iI0lI.I00lll10.indexOf(((OlOIo0l1O0Ol) it.next()).I000O01llI0));
/* 563 */                           if (numValueOf.compareTo(numValueOf2) < 0) {
/* 565 */                               numValueOf = numValueOf2;
                                    }
                                }
/* 571 */                       Iterator it2 = ((IIo1loI0) obj2).I00000oOI.iterator();
/* 579 */                       if (it2.hasNext()) {
/* 595 */                           Integer numValueOf3 = Integer.valueOf(OlOO00iI0lI.I00lll10.indexOf(((OlOIo0l1O0Ol) it2.next()).I000O01llI0));
/* 603 */                           while (it2.hasNext()) {
/* 619 */                               Integer numValueOf4 = Integer.valueOf(OlOO00iI0lI.I00lll10.indexOf(((OlOIo0l1O0Ol) it2.next()).I000O01llI0));
/* 627 */                               if (numValueOf3.compareTo(numValueOf4) < 0) {
/* 629 */                                   numValueOf3 = numValueOf4;
                                        }
                                    }
/* 631 */                           return iii1OiiIi.I00000oIO(numValueOf, numValueOf3);
                                }
                            }
/* 636 */                   IoOOl0iOl1io.I00000oOI();
/* 7 */                     return 0;
                        case 4:
/* 354 */                   Iterator it3 = ((IIo1loI0) obj).I00000oOI.iterator();
/* 362 */                   if (it3.hasNext()) {
/* 382 */                       Integer numValueOf5 = Integer.valueOf(OlOO00iI0lI.I00o0l1o1o0.indexOf(OlOIOoII1i.I00000oIO(((OlOIo0l1O0Ol) it3.next()).I0000Il00O)));
/* 390 */                       while (it3.hasNext()) {
/* 410 */                           Integer numValueOf6 = Integer.valueOf(OlOO00iI0lI.I00o0l1o1o0.indexOf(OlOIOoII1i.I00000oIO(((OlOIo0l1O0Ol) it3.next()).I0000Il00O)));
/* 418 */                           if (numValueOf5.compareTo(numValueOf6) < 0) {
/* 420 */                               numValueOf5 = numValueOf6;
                                    }
                                }
/* 426 */                       Iterator it4 = ((IIo1loI0) obj2).I00000oOI.iterator();
/* 434 */                       if (it4.hasNext()) {
/* 454 */                           Integer numValueOf7 = Integer.valueOf(OlOO00iI0lI.I00o0l1o1o0.indexOf(OlOIOoII1i.I00000oIO(((OlOIo0l1O0Ol) it4.next()).I0000Il00O)));
/* 462 */                           while (it4.hasNext()) {
/* 482 */                               Integer numValueOf8 = Integer.valueOf(OlOO00iI0lI.I00o0l1o1o0.indexOf(OlOIOoII1i.I00000oIO(((OlOIo0l1O0Ol) it4.next()).I0000Il00O)));
/* 490 */                               if (numValueOf7.compareTo(numValueOf8) < 0) {
/* 492 */                                   numValueOf7 = numValueOf8;
                                        }
                                    }
/* 494 */                           return iii1OiiIi.I00000oIO(numValueOf5, numValueOf7);
                                }
                            }
/* 499 */                   IoOOl0iOl1io.I00000oOI();
/* 7 */                     return 0;
                        case 5:
/* 345 */                   return iii1OiiIi.I00000oIO(((Olo000) obj).I00000oIO, ((Olo000) obj2).I00000oIO);
                        case 6:
/* 332 */                   return iii1OiiIi.I00000oIO(((Olo001i0l1) obj).I00000oIO, ((Olo001i0l1) obj2).I00000oIO);
                        case 7:
/* 319 */                   return iii1OiiIi.I00000oIO(Float.valueOf(((IiOoOOO) obj2).I00000oOI), Float.valueOf(((IiOoOOO) obj).I00000oOI));
                        case 8:
/* 267 */                   IlIII1l ilIII1l = (IlIII1l) obj2;
/* 269 */                   IlIII1l ilIII1l2 = (IlIII1l) obj;
                            return !ilIII1l2.I00iOIl.equals(ilIII1l.I00iOIl) ? ilIII1l2.I00iOIl.compareTo(ilIII1l.I00iOIl) : Long.compare(ilIII1l2.I00000oOI(), ilIII1l.I00000oOI());
                        case 9:
/* 262 */                   return iii1OiiIi.I00000oIO(Long.valueOf(((i1Ii1ooOII0) obj).I0000Il00O), Long.valueOf(((i1Ii1ooOII0) obj2).I0000Il00O));
                        case 10:
/* 182 */                   int iI00000oIO = OooioIOo1.I00000oIO(obj);
/* 186 */                   int iI00000oIO2 = OooioIOo1.I00000oIO(obj2);
/* 190 */                   if (iI00000oIO != iI00000oIO2) {
/* 241 */                       return IIlIOloOOO.I00000oIO(iI00000oIO, iI00000oIO2);
                            }
/* 192 */                   int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iI00000oIO);
/* 196 */                   if (iI001lIiIIo1O == 0) {
/* 236 */                       return ((Boolean) obj).compareTo((Boolean) obj2);
                            }
/* 198 */                   if (iI001lIiIIo1O == 1) {
/* 227 */                       return ((String) obj).compareTo((String) obj2);
                            }
/* 200 */                   if (iI001lIiIIo1O == 2) {
/* 218 */                       return ((Long) obj).compareTo((Long) obj2);
                            }
/* 202 */                   if (iI001lIiIIo1O == 3) {
/* 208 */                       return ((Double) obj).compareTo((Double) obj2);
                            }
/* 213 */                   throw null;
                        case 11:
/* 177 */                   return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                        case 12:
/* 156 */                   return ((Comparable) obj).compareTo((Comparable) obj2);
                        case 13:
/* 88 */                    int iI00000oOI = OooioIOo1.I00000oOI(obj);
/* 92 */                    int iI00000oOI2 = OooioIOo1.I00000oOI(obj2);
/* 96 */                    if (iI00000oOI != iI00000oOI2) {
/* 147 */                       return IIlIOloOOO.I00000oIO(iI00000oOI, iI00000oOI2);
                            }
/* 98 */                    int iI001lIiIIo1O2 = IIlIOloOOO.I001lIiIIo1O(iI00000oOI);
/* 102 */                   if (iI001lIiIIo1O2 == 0) {
/* 142 */                       return ((Boolean) obj).compareTo((Boolean) obj2);
                            }
/* 104 */                   if (iI001lIiIIo1O2 == 1) {
/* 133 */                       return ((String) obj).compareTo((String) obj2);
                            }
/* 106 */                   if (iI001lIiIIo1O2 == 2) {
/* 124 */                       return ((Long) obj).compareTo((Long) obj2);
                            }
/* 108 */                   if (iI001lIiIIo1O2 == 3) {
/* 114 */                       return ((Double) obj).compareTo((Double) obj2);
                            }
/* 119 */                   throw null;
                        case 14:
/* 83 */                    return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                        case 15:
/* 62 */                    return ((Comparable) obj).compareTo((Comparable) obj2);
                        case 16:
/* 53 */                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                        case 17:
/* 36 */                    return ((Comparable) obj).compareTo((Comparable) obj2);
                        default:
/* 27 */                    return iii1OiiIi.I00000oIO(Float.valueOf(((l0OOIlOO11) obj2).I00000oOI), Float.valueOf(((l0OOIlOO11) obj).I00000oOI));
                    }
                }
            }

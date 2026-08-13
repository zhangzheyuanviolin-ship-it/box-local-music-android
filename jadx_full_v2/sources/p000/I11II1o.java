            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class I11II1o {
                public static final LinkedHashMap I0000Il00O;
                public I0oO0iO1l0lo I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 12 */            for (I11I1111oi0 i11I1111oi0 : I11I1111oi0.values()) {
/* 16 */                String str = i11I1111oi0.I00iOIl;
/* 22 */                if (linkedHashMap.get(str) == null) {
/* 24 */                    linkedHashMap.put(str, i11I1111oi0);
                        }
                    }
/* 30 */            I0000Il00O = linkedHashMap;
                }

                public static ArrayList I00000oIO(Object obj, boolean z) {
/* 3 */             Map mapI00111O = ((I111oOiIiO0) obj).I00111O();
/* 9 */             ArrayList arrayList = new ArrayList();
/* 24 */            for (Map.Entry entry : mapI00111O.entrySet()) {
/* 64 */                IOOii0O10Io0.I00100l0(arrayList, (!z || O0000Ioio00.I0000O((OI1Iio0ii1) entry.getKey(), O0I01I.I00000oOI)) ? I000OOo1O((IOo0i1) entry.getValue()) : Il01100l.I00iOIl);
                    }
/* 89 */            return arrayList;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O00ooi0o0iiO I00000oOI(I11II1o i11II1o, O00ooi0o0iiO o00ooi0o0iiO, I11IlOOO i11IlOOO) {
                    boolean z;
                    Oi01Iillli oi01IillliI000II;
                    O00li0ll o00li0ll;
                    Object objI0000Il00O;
                    Object next;
                    OIoi0IIoi oIoi0IIoi;
                    OIOOOO0 oioooo0I0001Ioi1lo;
/* 5 */             I0oO0iO1l0lo i0oO0iO1l0lo = i11II1o.I00000oIO;
/* 7 */             I0oO0iO1l0lo i0oO0iO1l0lo2 = i11II1o.I00000oIO;
/* 9 */             boolean z2 = i0oO0iO1l0lo.I00iiI;
/* 11 */            if (!z2) {
/* 17 */                ArrayList arrayList = new ArrayList();
/* 20 */                Iterator it = i11IlOOO.iterator();
                        while (true) {
/* 30 */                    if (!it.hasNext()) {
                                break;
                            }
/* 32 */                    Object next2 = it.next();
/* 36 */                    O00li0ll o00li0ll2 = null;
/* 37 */                    if (z2) {
/* 39 */                        o00li0ll = null;
                            } else {
/* 45 */                        I111oOiIiO0 i111oOiIiO0 = (I111oOiIiO0) next2;
/* 55 */                        O00li0ll o00li0ll3 = (O00li0ll) O00liI.I0000O.get(i111oOiIiO0.I0010o());
/* 57 */                        if (o00li0ll3 != null) {
/* 59 */                            Ill0IO ill0IOI0010o = i111oOiIiO0.I0010o();
/* 63 */                            if (ill0IOI0010o == null || !O00liI.I0000Il00O.containsKey(ill0IOI0010o)) {
/* 84 */                                oi01IillliI000II = i11II1o.I000II(next2);
/* 88 */                                if (oi01IillliI000II == null) {
/* 95 */                                    oi01IillliI000II = ((O0I00OIIo) i0oO0iO1l0lo2.I00iiO).I00000oIO;
                                        }
                                    } else {
/* 81 */                                oi01IillliI000II = (Oi01Iillli) ((I00iiI) i0oO0iO1l0lo.I00iio).invoke(ill0IOI0010o);
                                    }
/* 99 */                            if (oi01IillliI000II == Oi01Iillli.I00iOIl) {
/* 102 */                               oi01IillliI000II = null;
                                    }
/* 103 */                           if (oi01IillliI000II != null) {
/* 137 */                               o00li0ll = new O00li0ll(OIOOOO0.I00000oIO(o00li0ll3.I00000oIO, null, oi01IillliI000II == Oi01Iillli.I00iiI, 1), o00li0ll3.I00000oOI, o00li0ll3.I0000Il00O, o00li0ll3.I0000O, o00li0ll3.I0000oI00);
                                    }
                                }
                            }
/* 140 */                   if (o00li0ll != null) {
/* 142 */                       o00li0ll2 = o00li0ll;
                            } else if (!((O0I00OIIo) i0oO0iO1l0lo.I00iiO).I0000O && (objI0000Il00O = I0000Il00O(next2, O0I01i1Io.I0001Ioi1lo)) != null) {
/* 169 */                       Iterator it2 = I0000O(next2).iterator();
                                while (true) {
/* 177 */                           if (!it2.hasNext()) {
/* 190 */                               next = null;
                                        break;
                                    }
/* 179 */                           next = it2.next();
/* 187 */                           if (i11II1o.I000O01llI0(next) != null) {
                                        break;
                                    }
                                }
/* 191 */                       if (next == null) {
/* 153 */                           oIoi0IIoi = null;
                                } else {
/* 194 */                           ArrayList arrayListI00000oIO = I00000oIO(objI0000Il00O, true);
/* 200 */                           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 203 */                           Iterator it3 = arrayListI00000oIO.iterator();
/* 211 */                           while (it3.hasNext()) {
/* 225 */                               I11I1111oi0 i11I1111oi0 = (I11I1111oi0) I0000Il00O.get((String) it3.next());
/* 227 */                               if (i11I1111oi0 != null) {
/* 229 */                                   linkedHashSet.add(i11I1111oi0);
                                        }
                                    }
/* 241 */                           if (linkedHashSet.contains(I11I1111oi0.I00ilI0I1)) {
/* 257 */                               linkedHashSet = Oio0lI.I0000oI00(Oio0lI.I00000oOI(I1IoiO1l.I00IlilI0i0i(I11I1111oi0.values()), I11I1111oi0.I00ilO0), linkedHashSet);
                                    }
/* 261 */                           oIoi0IIoi = new OIoi0IIoi(next, linkedHashSet);
                                }
/* 264 */                       if (oIoi0IIoi != null) {
/* 268 */                           Object obj = oIoi0IIoi.I00iOIl;
/* 272 */                           Set set = (Set) oIoi0IIoi.I00iiI;
/* 274 */                           Oi01Iillli oi01IillliI000II2 = i11II1o.I000II(next2);
/* 278 */                           if (oi01IillliI000II2 == null && (oi01IillliI000II2 = i11II1o.I000II(obj)) == null) {
/* 291 */                               oi01IillliI000II2 = ((O0I00OIIo) i0oO0iO1l0lo2.I00iiO).I00000oIO;
                                    }
/* 293 */                           Oi01Iillli oi01Iillli = Oi01Iillli.I00iOIl;
/* 295 */                           if (oi01IillliI000II2 != oi01Iillli) {
/* 298 */                               OIOOOO0 oioooo0I0001Ioi1lo2 = i11II1o.I0001Ioi1lo(obj, false);
/* 302 */                               if (oioooo0I0001Ioi1lo2 == null) {
/* 305 */                                   Object objI000O01llI0 = i11II1o.I000O01llI0(obj);
/* 309 */                                   if (objI000O01llI0 != null) {
/* 313 */                                       Oi01Iillli oi01IillliI000II3 = i11II1o.I000II(obj);
/* 317 */                                       if (oi01IillliI000II3 == null) {
/* 324 */                                           oi01IillliI000II3 = ((O0I00OIIo) i0oO0iO1l0lo2.I00iiO).I00000oIO;
                                                }
/* 342 */                                       oioooo0I0001Ioi1lo2 = (oi01IillliI000II3 == oi01Iillli || (oioooo0I0001Ioi1lo = i11II1o.I0001Ioi1lo(objI000O01llI0, false)) == null) ? null : OIOOOO0.I00000oIO(oioooo0I0001Ioi1lo, null, oi01IillliI000II3 == Oi01Iillli.I00iiI, 1);
                                            }
                                        }
/* 346 */                               if (oioooo0I0001Ioi1lo2 != null) {
/* 364 */                                   o00li0ll2 = new O00li0ll(OIOOOO0.I00000oIO(oioooo0I0001Ioi1lo2, null, oi01IillliI000II2 == Oi01Iillli.I00iiI, 1), set, 28);
                                        }
                                    }
                                }
                            }
/* 368 */                   if (o00li0ll2 != null) {
/* 370 */                       arrayList.add(o00li0ll2);
                            }
                        }
/* 379 */               if (!arrayList.isEmpty()) {
/* 386 */                   EnumMap enumMap = new EnumMap(I11I1111oi0.class);
/* 389 */                   Iterator it4 = arrayList.iterator();
/* 397 */                   while (it4.hasNext()) {
/* 403 */                       O00li0ll o00li0ll4 = (O00li0ll) it4.next();
/* 415 */                       for (I11I1111oi0 i11I1111oi02 : o00li0ll4.I00000oOI) {
/* 423 */                           enumMap.containsKey(i11I1111oi02);
/* 426 */                           enumMap.put((EnumMap) i11I1111oi02, (I11I1111oi0) o00li0ll4);
                                }
                            }
/* 442 */                   EnumMap enumMap2 = o00ooi0o0iiO != null ? new EnumMap(o00ooi0o0iiO.I00000oIO) : new EnumMap(I11I1111oi0.class);
/* 457 */                   for (Map.Entry entry : enumMap.entrySet()) {
/* 469 */                       I11I1111oi0 i11I1111oi03 = (I11I1111oi0) entry.getKey();
/* 475 */                       O00li0ll o00li0ll5 = (O00li0ll) entry.getValue();
/* 477 */                       if (o00li0ll5 != null) {
/* 479 */                           enumMap2.put((EnumMap) i11I1111oi03, (I11I1111oi0) o00li0ll5);
/* 482 */                           z = true;
                                }
                            }
/* 484 */                   if (z) {
/* 489 */                       O00ooi0o0iiO o00ooi0o0iiO2 = new O00ooi0o0iiO();
/* 492 */                       o00ooi0o0iiO2.I00000oIO = enumMap2;
/* 494 */                       VarHandle.storeStoreFence();
/* 2160 */                      return o00ooi0o0iiO2;
                            }
                        }
                    }
/* 3 */             return o00ooi0o0iiO;
                }

                public static Object I0000Il00O(Object obj, Ill0IO ill0IO) {
/* 13 */            for (Object obj2 : I0000O(obj)) {
/* 30 */                if (O0000Ioio00.I0000O(((I111oOiIiO0) obj2).I0010o(), ill0IO)) {
/* 32 */                    return obj2;
                        }
                    }
/* 33 */            return null;
                }

                public static Iterable I0000O(Object obj) {
                    I11IlOOO annotations;
/* 3 */             OI000ilOol oI000ilOolI0000O = IiOiOOIo.I0000O((I111oOiIiO0) obj);
                    return (oI000ilOolI0000O == null || (annotations = oI000ilOolI0000O.getAnnotations()) == null) ? Il01100l.I00iOIl : annotations;
                }

                public static boolean I0000oI00(Object obj, Ill0IO ill0IO) {
/* 1 */             Iterable iterableI0000O = I0000O(obj);
/* 7 */             if ((iterableI0000O instanceof Collection) && ((Collection) iterableI0000O).isEmpty()) {
/* 47 */                return false;
                    }
/* 19 */            Iterator it = iterableI0000O.iterator();
/* 27 */            while (it.hasNext()) {
/* 43 */                if (O0000Ioio00.I0000O(((I111oOiIiO0) it.next()).I0010o(), ill0IO)) {
/* 45 */                    return true;
                        }
                    }
/* 47 */            return false;
                }

                public static List I000OOo1O(IOo0i1 iOo0i1) {
/* 3 */             if (!(iOo0i1 instanceof I1IoIo1O0)) {
                        return iOo0i1 instanceof Il0o0Oii0I ? Collections.singletonList(((Il0o0Oii0I) iOo0i1).I0000Il00O.I0000Il00O()) : Il01100l.I00iOIl;
                    }
/* 9 */             Iterable iterable = (Iterable) ((I1IoIo1O0) iOo0i1).I00000oIO;
/* 13 */            ArrayList arrayList = new ArrayList();
/* 16 */            Iterator it = iterable.iterator();
/* 24 */            while (it.hasNext()) {
/* 38 */                IOOii0O10Io0.I00100l0(arrayList, I000OOo1O((IOo0i1) it.next()));
                    }
/* 42 */            return arrayList;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
                
                    if (r5.equals("ALWAYS") != false) goto L38;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
                
                    if (r5.equals("NEVER") == false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
                
                    if (r5.equals("MAYBE") == false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
                
                    r5 = p000.OIOOOO.I00iiI;
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OIOOOO0 I0001Ioi1lo(Object obj, boolean z) {
                    OIOOOO oioooo;
/* 4 */             Ill0IO ill0IOI0010o = ((I111oOiIiO0) obj).I0010o();
/* 9 */             if (ill0IOI0010o != null) {
/* 23 */                Oi01Iillli oi01Iillli = (Oi01Iillli) ((I00iiI) this.I00000oIO.I00iio).invoke(ill0IOI0010o);
/* 25 */                oi01Iillli.getClass();
/* 30 */                if (oi01Iillli == Oi01Iillli.I00iOIl) {
/* 8 */                     return null;
                        }
/* 40 */                if (O0I01i1Io.I000iOII.contains(ill0IOI0010o)) {
/* 42 */                    oioooo = OIOOOO.I00iiO;
                        } else if (O0I01i1Io.I000l1.contains(ill0IOI0010o)) {
/* 53 */                    oioooo = OIOOOO.I00iiI;
                        } else if (O0I01i1Io.I000lI.contains(ill0IOI0010o)) {
/* 64 */                    oioooo = OIOOOO.I00iOIl;
                        } else if (ill0IOI0010o.equals(O0I01i1Io.I000II)) {
/* 83 */                    String str = (String) IOOi0Ool1i.I001lloI(I00000oIO(obj, false));
/* 85 */                    if (str != null) {
                                switch (str.hashCode()) {
                                    case 73135176:
                                        break;
                                    case 74175084:
                                        break;
                                    case 433141802:
/* 110 */                               if (str.equals("UNKNOWN")) {
/* 113 */                                   oioooo = OIOOOO.I00iOIl;
                                            break;
                                        }
                                        break;
                                    case 1933739535:
                                        break;
                                }
                            } else {
/* 137 */                       oioooo = OIOOOO.I00iiO;
                            }
                        }
/* 149 */               return new OIOOOO0(oioooo, oi01Iillli == Oi01Iillli.I00iiI || z);
                    }
/* 8 */             return null;
                }

                public final Oi01Iillli I000II(Object obj) {
                    String str;
/* 5 */             O0I00OIIo o0I00OIIo = (O0I00OIIo) this.I00000oIO.I00iiO;
/* 20 */            Oi01Iillli oi01Iillli = (Oi01Iillli) o0I00OIIo.I0000Il00O.get(((I111oOiIiO0) obj).I0010o());
/* 22 */            if (oi01Iillli != null) {
/* 24 */                return oi01Iillli;
                    }
/* 27 */            Object objI0000Il00O = I0000Il00O(obj, O0I01i1Io.I00100l0);
/* 31 */            if (objI0000Il00O == null || (str = (String) IOOi0Ool1i.I001lloI(I00000oIO(objI0000Il00O, false))) == null) {
/* 107 */               return null;
                    }
/* 47 */            Oi01Iillli oi01Iillli2 = o0I00OIIo.I00000oOI;
/* 49 */            if (oi01Iillli2 != null) {
/* 106 */               return oi01Iillli2;
                    }
/* 51 */            int iHashCode = str.hashCode();
/* 58 */            if (iHashCode == -2137067054) {
/* 101 */               if (str.equals("IGNORE")) {
/* 104 */                   return Oi01Iillli.I00iOIl;
                        }
/* 107 */               return null;
                    }
/* 63 */            if (iHashCode == -1838656823) {
/* 89 */                if (str.equals("STRICT")) {
/* 92 */                    return Oi01Iillli.I00iiO;
                        }
/* 107 */               return null;
                    }
/* 68 */            if (iHashCode == 2656902 && str.equals("WARN")) {
/* 80 */                return Oi01Iillli.I00iiI;
                    }
/* 107 */           return null;
                }

                public final Object I000O01llI0(Object obj) {
                    Object objI000O01llI0;
/* 10 */            if (!((O0I00OIIo) this.I00000oIO.I00iiO).I0000O) {
/* 18 */                I111oOiIiO0 i111oOiIiO0 = (I111oOiIiO0) obj;
/* 28 */                if (IOOi0Ool1i.I001i1O0Ol(O0I01i1Io.I000OiO, i111oOiIiO0.I0010o()) || I0000oI00(obj, O0I01i1Io.I0000O)) {
/* 186 */                   return obj;
                        }
/* 45 */                if (I0000oI00(obj, O0I01i1Io.I0000oI00)) {
/* 48 */                    ConcurrentHashMap concurrentHashMap = this.I00000oOI;
/* 50 */                    OI000ilOol oI000ilOolI0000O = IiOiOOIo.I0000O(i111oOiIiO0);
/* 54 */                    Object obj2 = concurrentHashMap.get(oI000ilOolI0000O);
/* 58 */                    if (obj2 != null) {
/* 97 */                        return obj2;
                            }
/* 64 */                    Iterator it = I0000O(obj).iterator();
                            while (true) {
/* 72 */                        if (!it.hasNext()) {
/* 85 */                            objI000O01llI0 = null;
                                    break;
                                }
/* 78 */                        objI000O01llI0 = I000O01llI0(it.next());
/* 82 */                        if (objI000O01llI0 != null) {
                                    break;
                                }
                            }
/* 86 */                    if (objI000O01llI0 != null) {
/* 89 */                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(oI000ilOolI0000O, objI000O01llI0);
                                return objPutIfAbsent == null ? objI000O01llI0 : objPutIfAbsent;
                            }
                        }
                    }
/* 9 */             return null;
                }
            }

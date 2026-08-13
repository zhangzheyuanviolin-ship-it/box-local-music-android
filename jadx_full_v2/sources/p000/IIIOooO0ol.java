            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class IIIOooO0ol {
                public static final Map I00000oIO;
                public static final LinkedHashMap I00000oOI;
                public static final Set I0000Il00O;
                public static final Set I0000O;

                static {
/* 1 */             Ill0OI0lo ill0OI0lo = OlIllOO11lOl.I000OiO;
/* 21 */            OIoi0IIoi oIoi0IIoi = new OIoi0IIoi(ill0OI0lo.I00000oIO(OI1Iio0ii1.I0000oI00("name")).I000OOo1O(), OlIlllOI1.I0000O);
/* 44 */            OIoi0IIoi oIoi0IIoi2 = new OIoi0IIoi(ill0OI0lo.I00000oIO(OI1Iio0ii1.I0000oI00("ordinal")).I000OOo1O(), OI1Iio0ii1.I0000oI00("ordinal"));
/* 61 */            OIoi0IIoi oIoi0IIoi3 = new OIoi0IIoi(iOi1lii1O.I00000oIO(OlIllOO11lOl.I001lloI, "size"), OI1Iio0ii1.I0000oI00("size"));
/* 64 */            Ill0IO ill0IO = OlIllOO11lOl.I00IO1oi11O;
/* 208 */           Map mapI0000O = O1Oii0O0loo.I0000O(oIoi0IIoi, oIoi0IIoi2, oIoi0IIoi3, new OIoi0IIoi(iOi1lii1O.I00000oIO(ill0IO, "size"), OI1Iio0ii1.I0000oI00("size")), new OIoi0IIoi(OlIllOO11lOl.I0000oI00.I00000oIO(OI1Iio0ii1.I0000oI00("length")).I000OOo1O(), OI1Iio0ii1.I0000oI00("length")), new OIoi0IIoi(iOi1lii1O.I00000oIO(ill0IO, "keys"), OI1Iio0ii1.I0000oI00("keySet")), new OIoi0IIoi(iOi1lii1O.I00000oIO(ill0IO, "values"), OI1Iio0ii1.I0000oI00("values")), new OIoi0IIoi(iOi1lii1O.I00000oIO(ill0IO, "entries"), OI1Iio0ii1.I0000oI00("entrySet")), new OIoi0IIoi(iOi1lii1O.I00000oIO(OlIllOO11lOl.I00Ol00, "size"), OI1Iio0ii1.I0000oI00("length")), new OIoi0IIoi(iOi1lii1O.I00000oIO(OlIllOO11lOl.I00Ol10, "size"), OI1Iio0ii1.I0000oI00("length")), new OIoi0IIoi(iOi1lii1O.I00000oIO(OlIllOO11lOl.I00Ol1ll1, "size"), OI1Iio0ii1.I0000oI00("length")));
/* 212 */           I00000oIO = mapI0000O;
/* 214 */           Set<Map.Entry> setEntrySet = mapI0000O.entrySet();
/* 228 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(setEntrySet, 10));
/* 239 */           for (Map.Entry entry : setEntrySet) {
/* 268 */               arrayList.add(new OIoi0IIoi(((Ill0IO) entry.getKey()).I00000oIO.I000II(), entry.getValue()));
                    }
/* 274 */           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 277 */           Iterator it = arrayList.iterator();
/* 285 */           while (it.hasNext()) {
/* 291 */               OIoi0IIoi oIoi0IIoi4 = (OIoi0IIoi) it.next();
/* 295 */               OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) oIoi0IIoi4.I00iiI;
/* 297 */               Object arrayList2 = linkedHashMap.get(oI1Iio0ii1);
/* 301 */               if (arrayList2 == null) {
/* 305 */                   arrayList2 = new ArrayList();
/* 308 */                   linkedHashMap.put(oI1Iio0ii1, arrayList2);
                        }
/* 317 */               ((List) arrayList2).add((OI1Iio0ii1) oIoi0IIoi4.I00iOIl);
                    }
/* 331 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 348 */           for (Map.Entry entry2 : linkedHashMap.entrySet()) {
/* 370 */               linkedHashMap2.put(entry2.getKey(), IOOi0Ool1i.I001i1lo1io((Iterable) entry2.getValue()));
                    }
/* 374 */           I00000oOI = linkedHashMap2;
/* 376 */           Map map = I00000oIO;
/* 380 */           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 395 */           for (Map.Entry entry3 : map.entrySet()) {
/* 403 */               String str = O00oO0liO11.I00000oIO;
/* 435 */               linkedHashSet.add(O00oO0liO11.I000O01llI0(((Ill0IO) entry3.getKey()).I00000oOI().I00000oIO).I00000oIO().I00000oIO((OI1Iio0ii1) entry3.getValue()));
                    }
/* 441 */           Set setKeySet = I00000oIO.keySet();
/* 445 */           I0000Il00O = setKeySet;
/* 447 */           Set set = setKeySet;
/* 455 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(set, 10));
/* 458 */           Iterator it2 = set.iterator();
/* 466 */           while (it2.hasNext()) {
/* 480 */               arrayList3.add(((Ill0IO) it2.next()).I00000oIO.I000II());
                    }
/* 488 */           I0000O = IOOi0Ool1i.I00iio(arrayList3);
                }
            }

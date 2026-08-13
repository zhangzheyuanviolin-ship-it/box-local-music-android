            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
/* 4 */     public final class Ol1lII implements Set, O0Io11IiO0l {
                public final Ol1o1llOII I00iOIl;
                public final int I00iiI;

                public Ol1lII(Ol1o1llOII ol1o1llOII, int i) {
/* 1 */             this.I00iiI = i;
/* 6 */             this.I00iOIl = ol1o1llOII;
                }

                private final boolean I00000oOI(Collection collection) {
                    OO0lili oO0lili;
                    int i;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 3 */             Set setI00iio = IOOi0Ool1i.I00iio(collection);
/* 7 */             Ol1o1llOII ol1o1llOII = this.I00iOIl;
/* 9 */             boolean z = false;
/* 106 */           do {
                        synchronized (iO100OlI00o.I00000oIO) {
/* 19 */                    Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(ol1o1llOII.I00iOIl);
/* 21 */                    oO0lili = ol1o0ioII01.I0000Il00O;
/* 23 */                    i = ol1o0ioII01.I0000O;
                        }
/* 26 */                OO0lo1Ooo oO0lo1OooI000O01llI0 = oO0lili.I000O01llI0();
/* 32 */                Iterator it = ol1o1llOII.I00iiI.iterator();
/* 43 */                while (((OlO1010i1l) it).hasNext()) {
/* 52 */                    Map.Entry entry = (Map.Entry) ((OlO1010i1l) it).next();
/* 62 */                    if (!setI00iio.contains(entry.getKey())) {
/* 68 */                        oO0lo1OooI000O01llI0.remove(entry.getKey());
/* 71 */                        z = true;
                            }
                        }
/* 73 */                OO0lili oO0liliI00000oOI = oO0lo1OooI000O01llI0.I00000oOI();
/* 81 */                if (O0000Ioio00.I0000O(oO0liliI00000oOI, oO0lili)) {
                            break;
                        }
/* 83 */                Ol1o0ioII01 ol1o0ioII012 = ol1o1llOII.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 88 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 98 */                    zI00000oIO = Ol1o1llOII.I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII012, ol1o1llOII, ol1il1o1I000O01llI0), i, oO0liliI00000oOI);
                        }
/* 103 */               Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, ol1o1llOII);
/* 106 */           } while (!zI00000oIO);
/* 112 */           return z;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iiI) {
                        case 0:
/* 18 */                    iO100OlI00o.I00000oIO();
/* 22 */                    throw null;
                        case 1:
/* 11 */                    iO100OlI00o.I00000oIO();
/* 15 */                    throw null;
                        default:
/* 6 */                     iO100OlI00o.I00000oIO();
/* 10 */                    throw null;
                    }
                }

                @Override
                public final boolean addAll(Collection collection) {
                    switch (this.I00iiI) {
                        case 0:
/* 16 */                    iO100OlI00o.I00000oIO();
/* 20 */                    throw null;
                        case 1:
/* 11 */                    iO100OlI00o.I00000oIO();
/* 15 */                    throw null;
                        default:
/* 6 */                     iO100OlI00o.I00000oIO();
/* 10 */                    throw null;
                    }
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iOIl.clear();
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Ol1o1llOII ol1o1llOII = this.I00iOIl;
                    switch (i) {
                        case 0:
/* 22 */                    if (!OoOOI1100oI0.I0000oI00(obj)) {
/* 24 */                        return false;
                            }
/* 26 */                    Map.Entry entry = (Map.Entry) obj;
/* 40 */                    return O0000Ioio00.I0000O(ol1o1llOII.get(entry.getKey()), entry.getValue());
                        case 1:
/* 13 */                    return ol1o1llOII.containsKey(obj);
                        default:
/* 8 */                     return ol1o1llOII.containsValue(obj);
                    }
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Ol1o1llOII ol1o1llOII = this.I00iOIl;
                    switch (i) {
                        case 0:
/* 88 */                    Collection collection2 = collection;
/* 92 */                    if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
/* 105 */                       Iterator it = collection2.iterator();
/* 113 */                       while (it.hasNext()) {
/* 125 */                           if (!contains((Map.Entry) it.next())) {
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
/* 49 */                    Collection collection3 = collection;
/* 53 */                    if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
/* 65 */                        Iterator it2 = collection3.iterator();
/* 73 */                        while (it2.hasNext()) {
/* 83 */                            if (!ol1o1llOII.containsKey(it2.next())) {
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
/* 10 */                    Collection collection4 = collection;
/* 14 */                    if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
/* 26 */                        Iterator it3 = collection4.iterator();
/* 34 */                        while (it3.hasNext()) {
/* 44 */                            if (!ol1o1llOII.containsValue(it3.next())) {
                                        break;
                                    }
                                }
                            }
                            break;
                    }
/* 6 */             return true;
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iiI;
/* 3 */             Ol1o1llOII ol1o1llOII = this.I00iOIl;
                    switch (i) {
                        case 0:
/* 79 */                    return new OlO1010i1l(ol1o1llOII, ((Ioio0iiil1) ol1o1llOII.I0000Il00O().I0000Il00O.I00000oIO()).iterator(), 0);
                        case 1:
/* 54 */                    return new OlO1010i1l(ol1o1llOII, ((Ioio0iiil1) ol1o1llOII.I0000Il00O().I0000Il00O.I00000oIO()).iterator(), 1);
                        default:
/* 29 */                    return new OlO1010i1l(ol1o1llOII, ((Ioio0iiil1) ol1o1llOII.I0000Il00O().I0000Il00O.I00000oIO()).iterator(), 2);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    Object next;
/* 1 */             int i = this.I00iiI;
/* 5 */             Ol1o1llOII ol1o1llOII = this.I00iOIl;
                    switch (i) {
                        case 0:
/* 72 */                    if (OoOOI1100oI0.I0000oI00(obj) && ol1o1llOII.remove(((Map.Entry) obj).getKey()) != null) {
                                break;
                            }
                            break;
                        case 1:
/* 64 */                    if (ol1o1llOII.remove(obj) != null) {
                                break;
                            }
                            break;
                        default:
/* 12 */                    Iterator it = ol1o1llOII.I00iiI.iterator();
                            while (true) {
/* 23 */                        if (((OlO1010i1l) it).hasNext()) {
/* 28 */                            next = ((OlO1010i1l) it).next();
/* 43 */                            if (O0000Ioio00.I0000O(((Map.Entry) next).getValue(), obj)) {
                                    }
                                } else {
/* 46 */                            next = null;
                                }
                            }
/* 47 */                    Map.Entry entry = (Map.Entry) next;
/* 49 */                    if (entry != null) {
/* 55 */                        ol1o1llOII.remove(entry.getKey());
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    OO0lili oO0lili;
                    int i;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 4 */             boolean z = false;
                    switch (this.I00iiI) {
                        case 0:
/* 152 */                   Iterator it = collection.iterator();
                            while (true) {
/* 156 */                       boolean z2 = false;
/* 161 */                       while (it.hasNext()) {
/* 179 */                           if (this.I00iOIl.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
/* 183 */                               z2 = true;
                                    }
                                }
/* 185 */                       return z2;
                                break;
                            }
                        case 1:
/* 124 */                   Iterator it2 = collection.iterator();
                            while (true) {
/* 128 */                       boolean z3 = false;
/* 133 */                       while (it2.hasNext()) {
/* 145 */                           if (this.I00iOIl.remove(it2.next()) != null || z3) {
/* 149 */                               z3 = true;
                                    }
                                }
/* 151 */                       return z3;
                                break;
                            }
                            break;
                        default:
/* 10 */                    Set setI00iio = IOOi0Ool1i.I00iio(collection);
/* 14 */                    Ol1o1llOII ol1o1llOII = this.I00iOIl;
/* 112 */                   do {
                                synchronized (iO100OlI00o.I00000oIO) {
/* 25 */                            Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(ol1o1llOII.I00iOIl);
/* 27 */                            oO0lili = ol1o0ioII01.I0000Il00O;
/* 29 */                            i = ol1o0ioII01.I0000O;
                                }
/* 32 */                        OO0lo1Ooo oO0lo1OooI000O01llI0 = oO0lili.I000O01llI0();
/* 38 */                        Iterator it3 = ol1o1llOII.I00iiI.iterator();
/* 49 */                        while (((OlO1010i1l) it3).hasNext()) {
/* 58 */                            Map.Entry entry = (Map.Entry) ((OlO1010i1l) it3).next();
/* 68 */                            if (setI00iio.contains(entry.getValue())) {
/* 74 */                                oO0lo1OooI000O01llI0.remove(entry.getKey());
/* 77 */                                z = true;
                                    }
                                }
/* 79 */                        OO0lili oO0liliI00000oOI = oO0lo1OooI000O01llI0.I00000oOI();
/* 87 */                        if (!O0000Ioio00.I0000O(oO0liliI00000oOI, oO0lili)) {
/* 89 */                            Ol1o0ioII01 ol1o0ioII012 = ol1o1llOII.I00iOIl;
                                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 94 */                                ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 104 */                               zI00000oIO = Ol1o1llOII.I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII012, ol1o1llOII, ol1il1o1I000O01llI0), i, oO0liliI00000oOI);
                                    }
/* 109 */                           Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, ol1o1llOII);
                                }
/* 118 */                       return z;
/* 112 */                   } while (!zI00000oIO);
/* 118 */                   return z;
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    OO0lili oO0lili;
                    int i;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
                    OO0lili oO0lili2;
                    int i2;
                    Ol1il1o1 ol1il1o1I000O01llI02;
                    boolean zI00000oIO2;
/* 4 */             boolean z = false;
                    switch (this.I00iiI) {
                        case 0:
/* 127 */                   Collection<Map.Entry> collection2 = collection;
/* 135 */                   int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(collection2, 10));
/* 141 */                   if (iI00000oIO < 16) {
/* 143 */                       iI00000oIO = 16;
                            }
/* 146 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 157 */                   for (Map.Entry entry : collection2) {
/* 173 */                       linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
/* 177 */                   Ol1o1llOII ol1o1llOII = this.I00iOIl;
/* 293 */                   do {
                                synchronized (iO100OlI00o.I00000oIO) {
/* 188 */                           Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(ol1o1llOII.I00iOIl);
/* 190 */                           oO0lili = ol1o0ioII01.I0000Il00O;
/* 192 */                           i = ol1o0ioII01.I0000O;
                                }
/* 195 */                       OO0lo1Ooo oO0lo1OooI000O01llI0 = oO0lili.I000O01llI0();
/* 201 */                       Iterator it = ol1o1llOII.I00iiI.iterator();
/* 212 */                       while (((OlO1010i1l) it).hasNext()) {
/* 221 */                           Map.Entry entry2 = (Map.Entry) ((OlO1010i1l) it).next();
/* 231 */                           if (!linkedHashMap.containsKey(entry2.getKey()) || !O0000Ioio00.I0000O(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
/* 255 */                               oO0lo1OooI000O01llI0.remove(entry2.getKey());
/* 258 */                               z = true;
                                    }
                                }
/* 260 */                       OO0lili oO0liliI00000oOI = oO0lo1OooI000O01llI0.I00000oOI();
/* 268 */                       if (!O0000Ioio00.I0000O(oO0liliI00000oOI, oO0lili)) {
/* 270 */                           Ol1o0ioII01 ol1o0ioII012 = ol1o1llOII.I00iOIl;
                                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 275 */                               ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 285 */                               zI00000oIO = Ol1o1llOII.I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII012, ol1o1llOII, ol1il1o1I000O01llI0), i, oO0liliI00000oOI);
                                    }
/* 290 */                           Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, ol1o1llOII);
                                }
/* 299 */                       return z;
/* 293 */                   } while (!zI00000oIO);
/* 299 */                   return z;
                        case 1:
/* 122 */                   return I00000oOI(collection);
                        default:
/* 10 */                    Set setI00iio = IOOi0Ool1i.I00iio(collection);
/* 14 */                    Ol1o1llOII ol1o1llOII2 = this.I00iOIl;
/* 112 */                   do {
                                synchronized (iO100OlI00o.I00000oIO) {
/* 25 */                            Ol1o0ioII01 ol1o0ioII013 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(ol1o1llOII2.I00iOIl);
/* 27 */                            oO0lili2 = ol1o0ioII013.I0000Il00O;
/* 29 */                            i2 = ol1o0ioII013.I0000O;
                                }
/* 32 */                        OO0lo1Ooo oO0lo1OooI000O01llI02 = oO0lili2.I000O01llI0();
/* 38 */                        Iterator it2 = ol1o1llOII2.I00iiI.iterator();
/* 49 */                        while (((OlO1010i1l) it2).hasNext()) {
/* 58 */                            Map.Entry entry3 = (Map.Entry) ((OlO1010i1l) it2).next();
/* 68 */                            if (!setI00iio.contains(entry3.getValue())) {
/* 74 */                                oO0lo1OooI000O01llI02.remove(entry3.getKey());
/* 77 */                                z = true;
                                    }
                                }
/* 79 */                        OO0lili oO0liliI00000oOI2 = oO0lo1OooI000O01llI02.I00000oOI();
/* 87 */                        if (!O0000Ioio00.I0000O(oO0liliI00000oOI2, oO0lili2)) {
/* 89 */                            Ol1o0ioII01 ol1o0ioII014 = ol1o1llOII2.I00iOIl;
                                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 94 */                                ol1il1o1I000O01llI02 = Ol1l1lI1Ili.I000O01llI0();
/* 104 */                               zI00000oIO2 = Ol1o1llOII.I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII014, ol1o1llOII2, ol1il1o1I000O01llI02), i2, oO0liliI00000oOI2);
                                    }
/* 109 */                           Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI02, ol1o1llOII2);
                                }
/* 118 */                       return z;
/* 112 */                   } while (!zI00000oIO2);
/* 118 */                   return z;
                    }
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }

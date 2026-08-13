            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.AbstractMap;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            
/* 7 */     public class i1olOi1oI extends AbstractCollection {
                public final int I00iOIl;
                public final Object I00iiI;

                public i1olOi1oI(Object obj, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 96 */                    ((iI0iIIo) obj).clear();
                            break;
                        case 1:
/* 90 */                    ((iI0iIIo) obj).clear();
                            break;
                        case 2:
/* 84 */                    ((iI0iIIo) obj).clear();
                            break;
                        case 3:
/* 78 */                    ((iI0iIIo) obj).clear();
                            break;
                        case 4:
/* 72 */                    ((iI0iIIo) obj).clear();
                            break;
                        case 5:
/* 66 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                        case 6:
/* 60 */                    ((iI0iIIo) obj).clear();
                            break;
                        case 7:
/* 54 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                        case 8:
/* 48 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                        case 9:
/* 42 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                        case 10:
/* 36 */                    ((iii1IlooII) ((iiOoioO) obj)).I0000Il00O();
                            break;
                        case 11:
/* 28 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                        case 12:
/* 22 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                        case 13:
/* 16 */                    ((iI0iIIo) obj).clear();
                            break;
                        default:
/* 10 */                    ((i1liloI1Ol1) obj).clear();
                            break;
                    }
                }

                @Override
                public boolean contains(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 5:
/* 95 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                        case 6:
                        case 13:
                        default:
/* 8 */                     return super.contains(obj);
                        case 7:
/* 88 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                        case 8:
/* 81 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                        case 9:
/* 74 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                        case 10:
/* 36 */                    if (obj instanceof Map.Entry) {
/* 38 */                        Map.Entry entry = (Map.Entry) obj;
/* 42 */                        Object key = entry.getKey();
/* 46 */                        Object value = entry.getValue();
/* 56 */                        i1liliil11 i1liliil11VarI00000oIO = ((i1liloI1Ol1) ((iiOoioO) obj2).I00000oIO()).I00000oIO(key);
/* 60 */                        if (i1liliil11VarI00000oIO != null && i1liliil11VarI00000oIO.contains(value)) {
/* 68 */                            return true;
                                }
                            }
/* 70 */                    return false;
                        case 11:
/* 29 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                        case 12:
/* 22 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                        case 14:
/* 15 */                    return ((i1liloI1Ol1) obj2).containsValue(obj);
                    }
                }

                @Override
                public boolean isEmpty() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 5:
/* 57 */                    return ((i1liloI1Ol1) obj).isEmpty();
                        case 6:
                        case 10:
                        case 13:
                        default:
/* 8 */                     return super.isEmpty();
                        case 7:
/* 50 */                    return ((i1liloI1Ol1) obj).isEmpty();
                        case 8:
/* 43 */                    return ((i1liloI1Ol1) obj).isEmpty();
                        case 9:
/* 36 */                    return ((i1liloI1Ol1) obj).isEmpty();
                        case 11:
/* 29 */                    return ((i1liloI1Ol1) obj).isEmpty();
                        case 12:
/* 22 */                    return ((i1liloI1Ol1) obj).isEmpty();
                        case 14:
/* 15 */                    return ((i1liloI1Ol1) obj).isEmpty();
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 358 */                   iI0iIIo ii0iiio = (iI0iIIo) obj;
/* 360 */                   Map mapI000II = ii0iiio.I000II();
                            return mapI000II != null ? mapI000II.values().iterator() : new o0IiO1iO(ii0iiio, 2);
                        case 1:
/* 334 */                   iI0iIIo ii0iiio2 = (iI0iIIo) obj;
/* 336 */                   Map mapI0000O = ii0iiio2.I0000O();
                            return mapI0000O != null ? mapI0000O.values().iterator() : new i1iiiI(ii0iiio2, 2);
                        case 2:
/* 310 */                   iI0iIIo ii0iiio3 = (iI0iIIo) obj;
/* 312 */                   Map mapI000II2 = ii0iiio3.I000II();
                            return mapI000II2 != null ? mapI000II2.values().iterator() : new i1iillI(ii0iiio3, 2);
                        case 3:
/* 286 */                   iI0iIIo ii0iiio4 = (iI0iIIo) obj;
/* 288 */                   Map mapI000II3 = ii0iiio4.I000II();
                            return mapI000II3 != null ? mapI000II3.values().iterator() : new iIii1ilO1o0i(ii0iiio4, 2);
                        case 4:
/* 262 */                   iI0iIIo ii0iiio5 = (iI0iIIo) obj;
/* 264 */                   Map mapI000II4 = ii0iiio5.I000II();
                            return mapI000II4 != null ? mapI000II4.values().iterator() : new iOII01(ii0iiio5, 2);
                        case 5:
/* 244 */                   Iterator it = ((i1liloI1Ol1) obj).entrySet().iterator();
/* 250 */                   OoiOiiiIO ooiOiiiIO = new OoiOiiiIO(2);
/* 253 */                   it.getClass();
/* 256 */                   ooiOiiiIO.I00iiI = it;
/* 258 */                   VarHandle.storeStoreFence();
/* 261 */                   return ooiOiiiIO;
                        case 6:
/* 214 */                   iI0iIIo ii0iiio6 = (iI0iIIo) obj;
/* 216 */                   Map mapI000II5 = ii0iiio6.I000II();
                            return mapI000II5 != null ? mapI000II5.values().iterator() : new iOioOl1O(ii0iiio6, 2);
                        case 7:
/* 195 */                   Iterator it2 = ((i1liloI1Ol1) obj).entrySet().iterator();
/* 202 */                   OoiOiiiIO ooiOiiiIO2 = new OoiOiiiIO(3);
/* 205 */                   it2.getClass();
/* 208 */                   ooiOiiiIO2.I00iiI = it2;
/* 210 */                   VarHandle.storeStoreFence();
/* 213 */                   return ooiOiiiIO2;
                        case 8:
/* 170 */                   Iterator it3 = ((i1liloI1Ol1) obj).entrySet().iterator();
/* 177 */                   OoiOiiiIO ooiOiiiIO3 = new OoiOiiiIO(4);
/* 180 */                   it3.getClass();
/* 183 */                   ooiOiiiIO3.I00iiI = it3;
/* 185 */                   VarHandle.storeStoreFence();
/* 188 */                   return ooiOiiiIO3;
                        case 9:
/* 145 */                   Iterator it4 = ((i1liloI1Ol1) obj).entrySet().iterator();
/* 152 */                   OoiOiiiIO ooiOiiiIO4 = new OoiOiiiIO(6);
/* 155 */                   it4.getClass();
/* 158 */                   ooiOiiiIO4.I00iiI = it4;
/* 160 */                   VarHandle.storeStoreFence();
/* 163 */                   return ooiOiiiIO4;
                        case 10:
/* 102 */                   iii1IlooII iii1ilooii = (iii1IlooII) ((iiOoioO) obj);
/* 104 */                   iii1ilooii.getClass();
/* 109 */                   ii0iloI ii0iloi = new ii0iloI();
/* 112 */                   ii0iloi.I00ilI0I1 = iii1ilooii;
/* 124 */                   ii0iloi.I00iOIl = iii1ilooii.I00iio.entrySet().iterator();
/* 127 */                   ii0iloi.I00iiI = null;
/* 129 */                   ii0iloi.I00iiO = null;
/* 133 */                   ii0iloi.I00iio = il0llo0.I00iOIl;
/* 135 */                   VarHandle.storeStoreFence();
/* 138 */                   return ii0iloi;
                        case 11:
/* 81 */                    Iterator it5 = ((i1liloI1Ol1) obj).entrySet().iterator();
/* 88 */                    OoiOiiiIO ooiOiiiIO5 = new OoiOiiiIO(7);
/* 91 */                    it5.getClass();
/* 94 */                    ooiOiiiIO5.I00iiI = it5;
/* 96 */                    VarHandle.storeStoreFence();
/* 99 */                    return ooiOiiiIO5;
                        case 12:
/* 71 */                    return new iii11I0OO0o(((i1liloI1Ol1) obj).entrySet().iterator());
                        case 13:
/* 35 */                    iI0iIIo ii0iiio7 = (iI0iIIo) obj;
/* 37 */                    Map mapI000II6 = ii0iiio7.I000II();
                            return mapI000II6 != null ? mapI000II6.values().iterator() : new iiioIo0iIO(ii0iiio7, 2);
                        default:
/* 15 */                    Iterator it6 = ((i1liloI1Ol1) obj).entrySet().iterator();
/* 23 */                    OoiOiiiIO ooiOiiiIO6 = new OoiOiiiIO(8);
/* 26 */                    it6.getClass();
/* 29 */                    ooiOiiiIO6.I00iiI = it6;
/* 31 */                    VarHandle.storeStoreFence();
/* 34 */                    return ooiOiiiIO6;
                    }
                }

                @Override
                public boolean remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 5:
/* 327 */                   i1liloI1Ol1 i1liloi1ol1 = (i1liloI1Ol1) obj2;
                            try {
/* 329 */                       return super.remove(obj);
                            } catch (UnsupportedOperationException unused) {
/* 346 */                       for (Map.Entry entry : i1liloi1ol1.entrySet()) {
/* 362 */                           if (lil0l1lIi1.I00000oIO(obj, entry.getValue())) {
/* 368 */                               i1liloi1ol1.remove(entry.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                        case 6:
                        case 13:
                        default:
/* 10 */                    return super.remove(obj);
                        case 7:
/* 281 */                   i1liloI1Ol1 i1liloi1ol12 = (i1liloI1Ol1) obj2;
                            try {
/* 283 */                       return super.remove(obj);
                            } catch (UnsupportedOperationException unused2) {
/* 300 */                       for (Map.Entry entry2 : i1liloi1ol12.entrySet()) {
/* 316 */                           if (lio0iilo.I00000oIO(obj, entry2.getValue())) {
/* 322 */                               i1liloi1ol12.remove(entry2.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                        case 8:
/* 235 */                   i1liloI1Ol1 i1liloi1ol13 = (i1liloI1Ol1) obj2;
                            try {
/* 237 */                       return super.remove(obj);
                            } catch (UnsupportedOperationException unused3) {
/* 254 */                       for (Map.Entry entry3 : i1liloi1ol13.entrySet()) {
/* 270 */                           if (lioooIIO.I00000oIO(obj, entry3.getValue())) {
/* 276 */                               i1liloi1ol13.remove(entry3.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                        case 9:
/* 189 */                   i1liloI1Ol1 i1liloi1ol14 = (i1liloI1Ol1) obj2;
                            try {
/* 191 */                       return super.remove(obj);
                            } catch (UnsupportedOperationException unused4) {
/* 208 */                       for (Map.Entry entry4 : i1liloi1ol14.entrySet()) {
/* 224 */                           if (ll0o0IOO.I00000oIO(obj, entry4.getValue())) {
/* 230 */                               i1liloi1ol14.remove(entry4.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                        case 10:
/* 155 */                   if (!(obj instanceof Map.Entry)) {
/* 3 */                         return false;
                            }
/* 157 */                   Map.Entry entry5 = (Map.Entry) obj;
/* 161 */                   Object key = entry5.getKey();
/* 165 */                   Object value = entry5.getValue();
/* 175 */                   i1liliil11 i1liliil11VarI00000oIO = ((i1liloI1Ol1) ((iiOoioO) obj2).I00000oIO()).I00000oIO(key);
                            return i1liliil11VarI00000oIO != null && i1liliil11VarI00000oIO.remove(value);
                        case 11:
/* 107 */                   i1liloI1Ol1 i1liloi1ol15 = (i1liloI1Ol1) obj2;
                            try {
/* 109 */                       return super.remove(obj);
                            } catch (UnsupportedOperationException unused5) {
/* 126 */                       for (Map.Entry entry6 : i1liloi1ol15.entrySet()) {
/* 142 */                           if (ll1Oll0I0o1.I00000oIO(obj, entry6.getValue())) {
/* 148 */                               i1liloi1ol15.remove(entry6.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                        case 12:
/* 61 */                    i1liloI1Ol1 i1liloi1ol16 = (i1liloI1Ol1) obj2;
                            try {
/* 63 */                        return super.remove(obj);
                            } catch (UnsupportedOperationException unused6) {
/* 80 */                        for (Map.Entry entry7 : i1liloi1ol16.entrySet()) {
/* 96 */                            if (ll1Io11lio.I00000oIO(obj, entry7.getValue())) {
/* 102 */                               i1liloi1ol16.remove(entry7.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                        case 14:
/* 15 */                    i1liloI1Ol1 i1liloi1ol17 = (i1liloI1Ol1) obj2;
                            try {
/* 17 */                        return super.remove(obj);
                            } catch (UnsupportedOperationException unused7) {
/* 34 */                        for (Map.Entry entry8 : i1liloi1ol17.entrySet()) {
/* 50 */                            if (liioo01Ol.I00000oIO(obj, entry8.getValue())) {
/* 56 */                                i1liloi1ol17.remove(entry8.getKey());
/* 4 */                                 return true;
                                    }
                                }
/* 3 */                         return false;
                            }
                    }
                }

                @Override
                public boolean removeAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 5:
/* 422 */                   i1liloI1Ol1 i1liloi1ol1 = (i1liloI1Ol1) obj;
                            try {
/* 424 */                       if (collection != null) {
/* 429 */                           return super.removeAll(collection);
                                }
/* 434 */                       throw null;
                            } catch (UnsupportedOperationException unused) {
/* 437 */                       HashSet hashSet = new HashSet();
/* 452 */                       for (Map.Entry entry : i1liloi1ol1.entrySet()) {
/* 468 */                           if (collection.contains(entry.getValue())) {
/* 474 */                               hashSet.add(entry.getKey());
                                    }
                                }
/* 486 */                       return ((loO1I0) i1liloi1ol1.I00ilI0I1).I00000oOI().removeAll(hashSet);
                            }
                        case 6:
                        case 10:
                        case 13:
                        default:
/* 9 */                     return super.removeAll(collection);
                        case 7:
/* 356 */                   i1liloI1Ol1 i1liloi1ol12 = (i1liloI1Ol1) obj;
                            try {
/* 358 */                       if (collection != null) {
/* 360 */                           return super.removeAll(collection);
                                }
/* 365 */                       throw null;
                            } catch (UnsupportedOperationException unused2) {
/* 368 */                       HashSet hashSet2 = new HashSet();
/* 383 */                       for (Map.Entry entry2 : i1liloi1ol12.entrySet()) {
/* 399 */                           if (collection.contains(entry2.getValue())) {
/* 405 */                               hashSet2.add(entry2.getKey());
                                    }
                                }
/* 417 */                       return ((o10liooI) i1liloi1ol12.I00ilI0I1).I00000oOI().removeAll(hashSet2);
                            }
                        case 8:
/* 287 */                   i1liloI1Ol1 i1liloi1ol13 = (i1liloI1Ol1) obj;
                            try {
/* 289 */                       if (collection != null) {
/* 294 */                           return super.removeAll(collection);
                                }
/* 299 */                       throw null;
                            } catch (UnsupportedOperationException unused3) {
/* 302 */                       HashSet hashSet3 = new HashSet();
/* 317 */                       for (Map.Entry entry3 : i1liloi1ol13.entrySet()) {
/* 333 */                           if (collection.contains(entry3.getValue())) {
/* 339 */                               hashSet3.add(entry3.getKey());
                                    }
                                }
/* 351 */                       return ((o10lo0) i1liloi1ol13.I00ilI0I1).I00000oOI().removeAll(hashSet3);
                            }
                        case 9:
/* 218 */                   i1liloI1Ol1 i1liloi1ol14 = (i1liloI1Ol1) obj;
                            try {
/* 220 */                       if (collection != null) {
/* 225 */                           return super.removeAll(collection);
                                }
/* 230 */                       throw null;
                            } catch (UnsupportedOperationException unused4) {
/* 233 */                       HashSet hashSet4 = new HashSet();
/* 248 */                       for (Map.Entry entry4 : i1liloi1ol14.entrySet()) {
/* 264 */                           if (collection.contains(entry4.getValue())) {
/* 270 */                               hashSet4.add(entry4.getKey());
                                    }
                                }
/* 282 */                       return ((iI1oliOIO) i1liloi1ol14.I00ilI0I1).I00000oOI().removeAll(hashSet4);
                            }
                        case 11:
/* 152 */                   i1liloI1Ol1 i1liloi1ol15 = (i1liloI1Ol1) obj;
                            try {
/* 154 */                       if (collection != null) {
/* 156 */                           return super.removeAll(collection);
                                }
/* 161 */                       throw null;
                            } catch (UnsupportedOperationException unused5) {
/* 164 */                       HashSet hashSet5 = new HashSet();
/* 179 */                       for (Map.Entry entry5 : i1liloi1ol15.entrySet()) {
/* 195 */                           if (collection.contains(entry5.getValue())) {
/* 201 */                               hashSet5.add(entry5.getKey());
                                    }
                                }
/* 213 */                       return ((iOIoo1lI) i1liloi1ol15.I00ilI0I1).I00000oOI().removeAll(hashSet5);
                            }
                        case 12:
/* 83 */                    i1liloI1Ol1 i1liloi1ol16 = (i1liloI1Ol1) obj;
                            try {
/* 85 */                        if (collection != null) {
/* 90 */                            return super.removeAll(collection);
                                }
/* 95 */                        throw null;
                            } catch (UnsupportedOperationException unused6) {
/* 98 */                        HashSet hashSet6 = new HashSet();
/* 113 */                       for (Map.Entry entry6 : i1liloi1ol16.entrySet()) {
/* 129 */                           if (collection.contains(entry6.getValue())) {
/* 135 */                               hashSet6.add(entry6.getKey());
                                    }
                                }
/* 147 */                       return ((iO0OOlIoo00) i1liloi1ol16.I00ilI0I1).I00000oOI().removeAll(hashSet6);
                            }
                        case 14:
/* 14 */                    i1liloI1Ol1 i1liloi1ol17 = (i1liloI1Ol1) obj;
                            try {
/* 16 */                        if (collection != null) {
/* 21 */                            return super.removeAll(collection);
                                }
/* 26 */                        throw null;
                            } catch (UnsupportedOperationException unused7) {
/* 29 */                        HashSet hashSet7 = new HashSet();
/* 44 */                        for (Map.Entry entry7 : i1liloi1ol17.entrySet()) {
/* 60 */                            if (collection.contains(entry7.getValue())) {
/* 66 */                                hashSet7.add(entry7.getKey());
                                    }
                                }
/* 78 */                        return ((iii1IlooII) i1liloi1ol17.I00ilI0I1).I00000oOI().removeAll(hashSet7);
                            }
                    }
                }

                @Override
                public boolean retainAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 5:
/* 422 */                   i1liloI1Ol1 i1liloi1ol1 = (i1liloI1Ol1) obj;
                            try {
/* 424 */                       if (collection != null) {
/* 429 */                           return super.retainAll(collection);
                                }
/* 434 */                       throw null;
                            } catch (UnsupportedOperationException unused) {
/* 437 */                       HashSet hashSet = new HashSet();
/* 452 */                       for (Map.Entry entry : i1liloi1ol1.entrySet()) {
/* 468 */                           if (collection.contains(entry.getValue())) {
/* 474 */                               hashSet.add(entry.getKey());
                                    }
                                }
/* 486 */                       return ((loO1I0) i1liloi1ol1.I00ilI0I1).I00000oOI().retainAll(hashSet);
                            }
                        case 6:
                        case 10:
                        case 13:
                        default:
/* 9 */                     return super.retainAll(collection);
                        case 7:
/* 356 */                   i1liloI1Ol1 i1liloi1ol12 = (i1liloI1Ol1) obj;
                            try {
/* 358 */                       if (collection != null) {
/* 360 */                           return super.retainAll(collection);
                                }
/* 365 */                       throw null;
                            } catch (UnsupportedOperationException unused2) {
/* 368 */                       HashSet hashSet2 = new HashSet();
/* 383 */                       for (Map.Entry entry2 : i1liloi1ol12.entrySet()) {
/* 399 */                           if (collection.contains(entry2.getValue())) {
/* 405 */                               hashSet2.add(entry2.getKey());
                                    }
                                }
/* 417 */                       return ((o10liooI) i1liloi1ol12.I00ilI0I1).I00000oOI().retainAll(hashSet2);
                            }
                        case 8:
/* 287 */                   i1liloI1Ol1 i1liloi1ol13 = (i1liloI1Ol1) obj;
                            try {
/* 289 */                       if (collection != null) {
/* 294 */                           return super.retainAll(collection);
                                }
/* 299 */                       throw null;
                            } catch (UnsupportedOperationException unused3) {
/* 302 */                       HashSet hashSet3 = new HashSet();
/* 317 */                       for (Map.Entry entry3 : i1liloi1ol13.entrySet()) {
/* 333 */                           if (collection.contains(entry3.getValue())) {
/* 339 */                               hashSet3.add(entry3.getKey());
                                    }
                                }
/* 351 */                       return ((o10lo0) i1liloi1ol13.I00ilI0I1).I00000oOI().retainAll(hashSet3);
                            }
                        case 9:
/* 218 */                   i1liloI1Ol1 i1liloi1ol14 = (i1liloI1Ol1) obj;
                            try {
/* 220 */                       if (collection != null) {
/* 225 */                           return super.retainAll(collection);
                                }
/* 230 */                       throw null;
                            } catch (UnsupportedOperationException unused4) {
/* 233 */                       HashSet hashSet4 = new HashSet();
/* 248 */                       for (Map.Entry entry4 : i1liloi1ol14.entrySet()) {
/* 264 */                           if (collection.contains(entry4.getValue())) {
/* 270 */                               hashSet4.add(entry4.getKey());
                                    }
                                }
/* 282 */                       return ((iI1oliOIO) i1liloi1ol14.I00ilI0I1).I00000oOI().retainAll(hashSet4);
                            }
                        case 11:
/* 152 */                   i1liloI1Ol1 i1liloi1ol15 = (i1liloI1Ol1) obj;
                            try {
/* 154 */                       if (collection != null) {
/* 156 */                           return super.retainAll(collection);
                                }
/* 161 */                       throw null;
                            } catch (UnsupportedOperationException unused5) {
/* 164 */                       HashSet hashSet5 = new HashSet();
/* 179 */                       for (Map.Entry entry5 : i1liloi1ol15.entrySet()) {
/* 195 */                           if (collection.contains(entry5.getValue())) {
/* 201 */                               hashSet5.add(entry5.getKey());
                                    }
                                }
/* 213 */                       return ((iOIoo1lI) i1liloi1ol15.I00ilI0I1).I00000oOI().retainAll(hashSet5);
                            }
                        case 12:
/* 83 */                    i1liloI1Ol1 i1liloi1ol16 = (i1liloI1Ol1) obj;
                            try {
/* 85 */                        if (collection != null) {
/* 90 */                            return super.retainAll(collection);
                                }
/* 95 */                        throw null;
                            } catch (UnsupportedOperationException unused6) {
/* 98 */                        HashSet hashSet6 = new HashSet();
/* 113 */                       for (Map.Entry entry6 : i1liloi1ol16.entrySet()) {
/* 129 */                           if (collection.contains(entry6.getValue())) {
/* 135 */                               hashSet6.add(entry6.getKey());
                                    }
                                }
/* 147 */                       return ((iO0OOlIoo00) i1liloi1ol16.I00ilI0I1).I00000oOI().retainAll(hashSet6);
                            }
                        case 14:
/* 14 */                    i1liloI1Ol1 i1liloi1ol17 = (i1liloI1Ol1) obj;
                            try {
/* 16 */                        if (collection != null) {
/* 21 */                            return super.retainAll(collection);
                                }
/* 26 */                        throw null;
                            } catch (UnsupportedOperationException unused7) {
/* 29 */                        HashSet hashSet7 = new HashSet();
/* 44 */                        for (Map.Entry entry7 : i1liloi1ol17.entrySet()) {
/* 60 */                            if (collection.contains(entry7.getValue())) {
/* 66 */                                hashSet7.add(entry7.getKey());
                                    }
                                }
/* 78 */                        return ((iii1IlooII) i1liloi1ol17.I00ilI0I1).I00000oOI().retainAll(hashSet7);
                            }
                    }
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 122 */                   return ((iI0iIIo) obj).size();
                        case 1:
/* 115 */                   return ((iI0iIIo) obj).size();
                        case 2:
/* 108 */                   return ((iI0iIIo) obj).size();
                        case 3:
/* 101 */                   return ((iI0iIIo) obj).size();
                        case 4:
/* 94 */                    return ((iI0iIIo) obj).size();
                        case 5:
/* 87 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                        case 6:
/* 78 */                    return ((iI0iIIo) obj).size();
                        case 7:
/* 71 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                        case 8:
/* 62 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                        case 9:
/* 53 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                        case 10:
/* 46 */                    return ((iii1IlooII) ((iiOoioO) obj)).I00ilI0I1;
                        case 11:
/* 37 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                        case 12:
/* 28 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                        case 13:
/* 19 */                    return ((iI0iIIo) obj).size();
                        default:
/* 12 */                    return ((i1liloI1Ol1) obj).I00iiI.size();
                    }
                }

/* 8 */         public i1olOi1oI(AbstractMap abstractMap, int i) {
/* 9 */             this.I00iOIl = i;
                    this.I00iiI = abstractMap;
                }
            }

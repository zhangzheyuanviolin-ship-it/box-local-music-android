            package p000;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.RandomAccess;
            import java.util.Set;
            
            public final class i1liloI1Ol1 extends AbstractMap {
                public final int I00iOIl;
                public final transient Map I00iiI;
                public transient AbstractSet I00iiO;
                public transient AbstractCollection I00iio;
                public final Serializable I00ilI0I1;

                public i1liloI1Ol1(Serializable serializable, Map map, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00ilI0I1 = serializable;
/* 8 */             this.I00iiI = map;
                }

                public i1liliil11 I00000oIO(Object obj) {
                    Object obj2;
/* 1 */             Map map = this.I00iiI;
/* 3 */             map.getClass();
                    try {
/* 7 */                 obj2 = map.get(obj);
                    } catch (ClassCastException | NullPointerException unused) {
/* 12 */                obj2 = null;
                    }
/* 13 */            Collection collection = (Collection) obj2;
/* 15 */            if (collection == null) {
/* 6 */                 return null;
                    }
/* 20 */            iii1IlooII iii1ilooii = (iii1IlooII) this.I00ilI0I1;
/* 22 */            List list = (List) collection;
                    return list instanceof RandomAccess ? new iiI1Io(iii1ilooii, obj, list, null) : new i1liliil11(iii1ilooii, obj, list, (i1liliil11) null);
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Map map = this.I00iiI;
/* 5 */             Serializable serializable = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 309 */                   iI0iIIo ii0iiio = ((iO0OOlIoo00) serializable).I00iiO;
/* 311 */                   if (map != ii0iiio) {
/* 343 */                       OIlo1IOiO0i oIlo1IOiO0i = new OIlo1IOiO0i(this);
/* 350 */                       while (oIlo1IOiO0i.hasNext()) {
/* 352 */                           oIlo1IOiO0i.next();
/* 355 */                           oIlo1IOiO0i.remove();
                                }
                                break;
                            } else {
/* 317 */                       Iterator it = ii0iiio.values().iterator();
/* 325 */                       while (it.hasNext()) {
/* 333 */                           ((Collection) it.next()).clear();
                                }
/* 337 */                       ii0iiio.clear();
                                break;
                            }
                        case 1:
/* 252 */                   iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
/* 254 */                   iI0iIIo ii0iiio2 = ioioo1li.I00iiO;
/* 256 */                   if (map != ii0iiio2) {
/* 290 */                       OIlo1IOiO0i oIlo1IOiO0i2 = new OIlo1IOiO0i(this, (byte) 0);
/* 297 */                       while (oIlo1IOiO0i2.hasNext()) {
/* 299 */                           oIlo1IOiO0i2.next();
/* 302 */                           oIlo1IOiO0i2.remove();
                                }
                                break;
                            } else {
/* 262 */                       Iterator it2 = ii0iiio2.values().iterator();
/* 270 */                       while (it2.hasNext()) {
/* 278 */                           ((Collection) it2.next()).clear();
                                }
/* 282 */                       ii0iiio2.clear();
/* 285 */                       ioioo1li.I00iio = 0;
                                break;
                            }
                        case 2:
/* 223 */                   iii1IlooII iii1ilooii = (iii1IlooII) serializable;
/* 227 */                   if (map != iii1ilooii.I00iio) {
/* 235 */                       OIlo1IOiO0i oIlo1IOiO0i3 = new OIlo1IOiO0i(this, (char) 0);
/* 242 */                       while (oIlo1IOiO0i3.hasNext()) {
/* 244 */                           oIlo1IOiO0i3.next();
/* 247 */                           oIlo1IOiO0i3.remove();
                                }
                                break;
                            } else {
/* 229 */                       iii1ilooii.I0000Il00O();
                                break;
                            }
                        case 3:
/* 172 */                   iI0iIIo ii0iiio3 = ((loO1I0) serializable).I00iiO;
/* 174 */                   if (map != ii0iiio3) {
/* 206 */                       OIlo1IOiO0i oIlo1IOiO0i4 = new OIlo1IOiO0i(this, 0);
/* 213 */                       while (oIlo1IOiO0i4.hasNext()) {
/* 215 */                           oIlo1IOiO0i4.next();
/* 218 */                           oIlo1IOiO0i4.remove();
                                }
                                break;
                            } else {
/* 180 */                       Iterator it3 = ii0iiio3.values().iterator();
/* 188 */                       while (it3.hasNext()) {
/* 196 */                           ((Collection) it3.next()).clear();
                                }
/* 200 */                       ii0iiio3.clear();
                                break;
                            }
                        case 4:
/* 119 */                   iI0iIIo ii0iiio4 = ((o10liooI) serializable).I00iiO;
/* 121 */                   if (map != ii0iiio4) {
/* 153 */                       OIlo1IOiO0i oIlo1IOiO0i5 = new OIlo1IOiO0i(this, (short) 0);
/* 160 */                       while (oIlo1IOiO0i5.hasNext()) {
/* 162 */                           oIlo1IOiO0i5.next();
/* 165 */                           oIlo1IOiO0i5.remove();
                                }
                                break;
                            } else {
/* 127 */                       Iterator it4 = ii0iiio4.values().iterator();
/* 135 */                       while (it4.hasNext()) {
/* 143 */                           ((Collection) it4.next()).clear();
                                }
/* 147 */                       ii0iiio4.clear();
                                break;
                            }
                        case 5:
/* 66 */                    iI0iIIo ii0iiio5 = ((o10lo0) serializable).I00iiO;
/* 68 */                    if (map != ii0iiio5) {
/* 100 */                       OIlo1IOiO0i oIlo1IOiO0i6 = new OIlo1IOiO0i(this, (byte) 0, false);
/* 107 */                       while (oIlo1IOiO0i6.hasNext()) {
/* 109 */                           oIlo1IOiO0i6.next();
/* 112 */                           oIlo1IOiO0i6.remove();
                                }
                                break;
                            } else {
/* 74 */                        Iterator it5 = ii0iiio5.values().iterator();
/* 82 */                        while (it5.hasNext()) {
/* 90 */                            ((Collection) it5.next()).clear();
                                }
/* 94 */                        ii0iiio5.clear();
                                break;
                            }
                        default:
/* 13 */                    iI0iIIo ii0iiio6 = ((iI1oliOIO) serializable).I00iiO;
/* 15 */                    if (map != ii0iiio6) {
/* 47 */                        OIlo1IOiO0i oIlo1IOiO0i7 = new OIlo1IOiO0i(this, (byte) 0, (byte) 0);
/* 54 */                        while (oIlo1IOiO0i7.hasNext()) {
/* 56 */                            oIlo1IOiO0i7.next();
/* 59 */                            oIlo1IOiO0i7.remove();
                                }
                                break;
                            } else {
/* 21 */                        Iterator it6 = ii0iiio6.values().iterator();
/* 29 */                        while (it6.hasNext()) {
/* 37 */                            ((Collection) it6.next()).clear();
                                }
/* 41 */                        ii0iiio6.clear();
                                break;
                            }
                    }
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Map map = this.I00iiI;
                    switch (i) {
                        case 0:
/* 57 */                    map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused) {
/* 3 */                         return false;
                            }
                        case 1:
/* 49 */                    map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused2) {
/* 3 */                         return false;
                            }
                        case 2:
/* 41 */                    map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused3) {
/* 3 */                         return false;
                            }
                        case 3:
/* 33 */                    map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused4) {
/* 3 */                         return false;
                            }
                        case 4:
/* 25 */                    map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused5) {
/* 3 */                         return false;
                            }
                        case 5:
/* 17 */                    map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused6) {
/* 3 */                         return false;
                            }
                        default:
/* 9 */                     map.getClass();
                            try {
                                break;
                            } catch (ClassCastException | NullPointerException unused7) {
/* 3 */                         return false;
                            }
                    }
/* 12 */            return map.containsKey(obj);
                }

                @Override
                public final Set entrySet() {
                    switch (this.I00iOIl) {
                        case 0:
/* 92 */                    i1OOoIIIl1 i1oooiiil1 = (i1OOoIIIl1) this.I00iiO;
/* 94 */                    if (i1oooiiil1 != null) {
/* 103 */                       return i1oooiiil1;
                            }
/* 98 */                    i1OOoIIIl1 i1oooiiil12 = new i1OOoIIIl1(this);
/* 101 */                   this.I00iiO = i1oooiiil12;
/* 103 */                   return i1oooiiil12;
                        case 1:
/* 78 */                    iI0iI0l1OlI0 ii0ii0l1oli0 = (iI0iI0l1OlI0) this.I00iiO;
/* 80 */                    if (ii0ii0l1oli0 != null) {
/* 89 */                        return ii0ii0l1oli0;
                            }
/* 84 */                    iI0iI0l1OlI0 ii0ii0l1oli02 = new iI0iI0l1OlI0(this);
/* 87 */                    this.I00iiO = ii0ii0l1oli02;
/* 89 */                    return ii0ii0l1oli02;
                        case 2:
/* 64 */                    ii0o11I ii0o11i = (ii0o11I) this.I00iiO;
/* 66 */                    if (ii0o11i != null) {
/* 75 */                        return ii0o11i;
                            }
/* 70 */                    ii0o11I ii0o11i2 = new ii0o11I(this);
/* 73 */                    this.I00iiO = ii0o11i2;
/* 75 */                    return ii0o11i2;
                        case 3:
/* 50 */                    iolO010IO iolo010io = (iolO010IO) this.I00iiO;
/* 52 */                    if (iolo010io != null) {
/* 61 */                        return iolo010io;
                            }
/* 56 */                    iolO010IO iolo010io2 = new iolO010IO(this);
/* 59 */                    this.I00iiO = iolo010io2;
/* 61 */                    return iolo010io2;
                        case 4:
/* 36 */                    lO0Oi0oI lo0oi0oi = (lO0Oi0oI) this.I00iiO;
/* 38 */                    if (lo0oi0oi != null) {
/* 47 */                        return lo0oi0oi;
                            }
/* 42 */                    lO0Oi0oI lo0oi0oi2 = new lO0Oi0oI(this);
/* 45 */                    this.I00iiO = lo0oi0oi2;
/* 47 */                    return lo0oi0oi2;
                        case 5:
/* 22 */                    lO0OoO0lIlI lo0ooo0lili = (lO0OoO0lIlI) this.I00iiO;
/* 24 */                    if (lo0ooo0lili != null) {
/* 33 */                        return lo0ooo0lili;
                            }
/* 28 */                    lO0OoO0lIlI lo0ooo0lili2 = new lO0OoO0lIlI(this);
/* 31 */                    this.I00iiO = lo0ooo0lili2;
/* 33 */                    return lo0ooo0lili2;
                        default:
/* 8 */                     loliOI1li lolioi1li = (loliOI1li) this.I00iiO;
/* 10 */                    if (lolioi1li != null) {
/* 19 */                        return lolioi1li;
                            }
/* 14 */                    loliOI1li lolioi1li2 = new loliOI1li(this);
/* 17 */                    this.I00iiO = lolioi1li2;
/* 19 */                    return lolioi1li2;
                    }
                }

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 96 */                    if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                        case 1:
/* 81 */                    if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                        case 2:
/* 66 */                    if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                        case 3:
/* 51 */                    if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                        case 4:
/* 36 */                    if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                        case 5:
/* 21 */                    if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                        default:
/* 6 */                     if (this == obj || this.I00iiI.equals(obj)) {
                            }
                            break;
                    }
/* 19 */            return true;
                }

                @Override
                public final Object get(Object obj) {
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    Object obj6;
                    Object obj7;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilI0I1;
/* 5 */             Map map = this.I00iiI;
                    switch (i) {
                        case 0:
/* 196 */                   map.getClass();
                            try {
/* 199 */                       obj2 = map.get(obj);
                            } catch (ClassCastException | NullPointerException unused) {
/* 204 */                       obj2 = null;
                            }
/* 205 */                   Collection collection = (Collection) obj2;
/* 207 */                   if (collection == null) {
/* 7 */                         return null;
                            }
/* 210 */                   iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) serializable;
/* 212 */                   List list = (List) collection;
/* 227 */                   return list instanceof RandomAccess ? new iI1I11iO0oi(io0oolioo00, obj, list, null) : new i1liliil11(io0oolioo00, obj, list, (i1liliil11) null);
                        case 1:
/* 160 */                   map.getClass();
                            try {
/* 163 */                       obj3 = map.get(obj);
                            } catch (ClassCastException | NullPointerException unused2) {
/* 168 */                       obj3 = null;
                            }
/* 169 */                   Collection collection2 = (Collection) obj3;
/* 171 */                   if (collection2 == null) {
/* 7 */                         return null;
                            }
/* 174 */                   iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
/* 176 */                   List list2 = (List) collection2;
/* 191 */                   return list2 instanceof RandomAccess ? new iIii0o1OII(ioioo1li, obj, list2, null) : new i1liliil11(ioioo1li, obj, list2, (i1liliil11) null);
                        case 2:
/* 155 */                   return I00000oIO(obj);
                        case 3:
/* 119 */                   map.getClass();
                            try {
/* 122 */                       obj4 = map.get(obj);
                            } catch (ClassCastException | NullPointerException unused3) {
/* 127 */                       obj4 = null;
                            }
/* 128 */                   Collection collection3 = (Collection) obj4;
/* 130 */                   if (collection3 == null) {
/* 7 */                         return null;
                            }
/* 133 */                   loO1I0 loo1i0 = (loO1I0) serializable;
/* 135 */                   List list3 = (List) collection3;
/* 150 */                   return list3 instanceof RandomAccess ? new lIOl0OIo(loo1i0, obj, list3, null) : new i1liliil11(loo1i0, obj, list3, (i1liliil11) null);
                        case 4:
/* 83 */                    map.getClass();
                            try {
/* 86 */                        obj5 = map.get(obj);
                            } catch (ClassCastException | NullPointerException unused4) {
/* 91 */                        obj5 = null;
                            }
/* 92 */                    Collection collection4 = (Collection) obj5;
/* 94 */                    if (collection4 == null) {
/* 7 */                         return null;
                            }
/* 97 */                    o10liooI o10liooi = (o10liooI) serializable;
/* 99 */                    List list4 = (List) collection4;
/* 114 */                   return list4 instanceof RandomAccess ? new lli0oiIio0(o10liooi, obj, list4, null) : new i1liliil11(o10liooi, obj, list4, (i1liliil11) null);
                        case 5:
/* 47 */                    map.getClass();
                            try {
/* 50 */                        obj6 = map.get(obj);
                            } catch (ClassCastException | NullPointerException unused5) {
/* 55 */                        obj6 = null;
                            }
/* 56 */                    Collection collection5 = (Collection) obj6;
/* 58 */                    if (collection5 == null) {
/* 7 */                         return null;
                            }
/* 61 */                    o10lo0 o10lo0Var = (o10lo0) serializable;
/* 63 */                    List list5 = (List) collection5;
/* 78 */                    return list5 instanceof RandomAccess ? new lli1I1l(o10lo0Var, obj, list5, null) : new i1liliil11(o10lo0Var, obj, list5, (i1liliil11) null);
                        default:
/* 11 */                    map.getClass();
                            try {
/* 14 */                        obj7 = map.get(obj);
                            } catch (ClassCastException | NullPointerException unused6) {
/* 19 */                        obj7 = null;
                            }
/* 20 */                    Collection collection6 = (Collection) obj7;
/* 22 */                    if (collection6 == null) {
/* 7 */                         return null;
                            }
/* 25 */                    iI1oliOIO ii1olioio = (iI1oliOIO) serializable;
/* 27 */                    List list6 = (List) collection6;
/* 42 */                    return list6 instanceof RandomAccess ? new o10li11li0(ii1olioio, obj, list6, null) : new i1liliil11(ii1olioio, obj, list6, (i1liliil11) null);
                    }
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.hashCode();
                }

                @Override
                public final Set keySet() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 95 */                    iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) serializable;
/* 97 */                    i1OOoIIIl1 i1oooiiil1 = io0oolioo00.I00iOIl;
/* 99 */                    if (i1oooiiil1 != null) {
/* 110 */                       return i1oooiiil1;
                            }
/* 105 */                   i1OOoIIIl1 i1oooiiil12 = new i1OOoIIIl1(io0oolioo00, io0oolioo00.I00iiO);
/* 108 */                   io0oolioo00.I00iOIl = i1oooiiil12;
/* 110 */                   return i1oooiiil12;
                        case 1:
/* 79 */                    iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
/* 81 */                    iIOo111l iioo111l = ioioo1li.I00iOIl;
/* 83 */                    if (iioo111l != null) {
/* 94 */                        return iioo111l;
                            }
/* 89 */                    iIOo111l iioo111l2 = new iIOo111l(ioioo1li, ioioo1li.I00iiO);
/* 92 */                    ioioo1li.I00iOIl = iioo111l2;
/* 94 */                    return iioo111l2;
                        case 2:
/* 74 */                    return ((iii1IlooII) serializable).I00000oOI();
                        case 3:
/* 56 */                    loO1I0 loo1i0 = (loO1I0) serializable;
/* 58 */                    iolO010IO iolo010io = loo1i0.I00iOIl;
/* 60 */                    if (iolo010io != null) {
/* 71 */                        return iolo010io;
                            }
/* 66 */                    iolO010IO iolo010io2 = new iolO010IO(loo1i0, loo1i0.I00iiO);
/* 69 */                    loo1i0.I00iOIl = iolo010io2;
/* 71 */                    return iolo010io2;
                        case 4:
/* 40 */                    o10liooI o10liooi = (o10liooI) serializable;
/* 42 */                    lO0Oi0oI lo0oi0oi = o10liooi.I00iOIl;
/* 44 */                    if (lo0oi0oi != null) {
/* 55 */                        return lo0oi0oi;
                            }
/* 50 */                    lO0Oi0oI lo0oi0oi2 = new lO0Oi0oI(o10liooi, o10liooi.I00iiO);
/* 53 */                    o10liooi.I00iOIl = lo0oi0oi2;
/* 55 */                    return lo0oi0oi2;
                        case 5:
/* 24 */                    o10lo0 o10lo0Var = (o10lo0) serializable;
/* 26 */                    lO0OoO0lIlI lo0ooo0lili = o10lo0Var.I00iOIl;
/* 28 */                    if (lo0ooo0lili != null) {
/* 39 */                        return lo0ooo0lili;
                            }
/* 34 */                    lO0OoO0lIlI lo0ooo0lili2 = new lO0OoO0lIlI(o10lo0Var, o10lo0Var.I00iiO);
/* 37 */                    o10lo0Var.I00iOIl = lo0ooo0lili2;
/* 39 */                    return lo0ooo0lili2;
                        default:
/* 8 */                     iI1oliOIO ii1olioio = (iI1oliOIO) serializable;
/* 10 */                    loliOI1li lolioi1li = ii1olioio.I00iOIl;
/* 12 */                    if (lolioi1li != null) {
/* 23 */                        return lolioi1li;
                            }
/* 18 */                    loliOI1li lolioi1li2 = new loliOI1li(ii1olioio, ii1olioio.I00iiO);
/* 21 */                    ii1olioio.I00iOIl = lolioi1li2;
/* 23 */                    return lolioi1li2;
                    }
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilI0I1;
/* 7 */             Map map = this.I00iiI;
                    switch (i) {
                        case 0:
/* 176 */                   Collection collection = (Collection) map.remove(obj);
/* 178 */                   if (collection == null) {
/* 6 */                         return null;
                            }
/* 183 */                   ArrayList arrayList = new ArrayList(3);
/* 186 */                   arrayList.addAll(collection);
/* 189 */                   collection.size();
/* 192 */                   collection.clear();
/* 195 */                   return arrayList;
                        case 1:
/* 140 */                   iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
/* 146 */                   Collection collection2 = (Collection) map.remove(obj);
/* 148 */                   if (collection2 == null) {
/* 6 */                         return null;
                            }
/* 153 */                   ArrayList arrayList2 = new ArrayList(3);
/* 156 */                   arrayList2.addAll(collection2);
                            ioioo1li.I00iio -= collection2.size();
/* 168 */                   collection2.clear();
/* 171 */                   return arrayList2;
                        case 2:
/* 108 */                   iii1IlooII iii1ilooii = (iii1IlooII) serializable;
/* 114 */                   Collection collection3 = (Collection) map.remove(obj);
/* 116 */                   if (collection3 == null) {
/* 6 */                         return null;
                            }
/* 121 */                   ArrayList arrayList3 = new ArrayList(3);
/* 124 */                   arrayList3.addAll(collection3);
                            iii1ilooii.I00ilI0I1 -= collection3.size();
/* 136 */                   collection3.clear();
/* 139 */                   return arrayList3;
                        case 3:
/* 88 */                    Collection collection4 = (Collection) map.remove(obj);
/* 90 */                    if (collection4 == null) {
/* 6 */                         return null;
                            }
/* 95 */                    ArrayList arrayList4 = new ArrayList(3);
/* 98 */                    arrayList4.addAll(collection4);
/* 101 */                   collection4.size();
/* 104 */                   collection4.clear();
/* 107 */                   return arrayList4;
                        case 4:
/* 64 */                    Collection collection5 = (Collection) map.remove(obj);
/* 66 */                    if (collection5 == null) {
/* 6 */                         return null;
                            }
/* 71 */                    ArrayList arrayList5 = new ArrayList(3);
/* 74 */                    arrayList5.addAll(collection5);
/* 77 */                    collection5.size();
/* 80 */                    collection5.clear();
/* 83 */                    return arrayList5;
                        case 5:
/* 40 */                    Collection collection6 = (Collection) map.remove(obj);
/* 42 */                    if (collection6 == null) {
/* 6 */                         return null;
                            }
/* 47 */                    ArrayList arrayList6 = new ArrayList(3);
/* 50 */                    arrayList6.addAll(collection6);
/* 53 */                    collection6.size();
/* 56 */                    collection6.clear();
/* 59 */                    return arrayList6;
                        default:
/* 16 */                    Collection collection7 = (Collection) map.remove(obj);
/* 18 */                    if (collection7 == null) {
/* 6 */                         return null;
                            }
/* 23 */                    ArrayList arrayList7 = new ArrayList(3);
/* 26 */                    arrayList7.addAll(collection7);
/* 29 */                    collection7.size();
/* 32 */                    collection7.clear();
/* 35 */                    return arrayList7;
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.size();
                }

                @Override
                public final String toString() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.toString();
                }

                @Override
                public final Collection values() {
                    switch (this.I00iOIl) {
                        case 0:
/* 102 */                   i1olOi1oI i1oloi1oi = (i1olOi1oI) this.I00iio;
/* 104 */                   if (i1oloi1oi != null) {
/* 115 */                       return i1oloi1oi;
                            }
/* 110 */                   i1olOi1oI i1oloi1oi2 = new i1olOi1oI((AbstractMap) this, 12);
/* 113 */                   this.I00iio = i1oloi1oi2;
/* 115 */                   return i1oloi1oi2;
                        case 1:
/* 86 */                    i1olOi1oI i1oloi1oi3 = (i1olOi1oI) this.I00iio;
/* 88 */                    if (i1oloi1oi3 != null) {
/* 99 */                        return i1oloi1oi3;
                            }
/* 94 */                    i1olOi1oI i1oloi1oi4 = new i1olOi1oI((AbstractMap) this, 11);
/* 97 */                    this.I00iio = i1oloi1oi4;
/* 99 */                    return i1oloi1oi4;
                        case 2:
/* 70 */                    i1olOi1oI i1oloi1oi5 = (i1olOi1oI) this.I00iio;
/* 72 */                    if (i1oloi1oi5 != null) {
/* 83 */                        return i1oloi1oi5;
                            }
/* 78 */                    i1olOi1oI i1oloi1oi6 = new i1olOi1oI((AbstractMap) this, 14);
/* 81 */                    this.I00iio = i1oloi1oi6;
/* 83 */                    return i1oloi1oi6;
                        case 3:
/* 55 */                    i1olOi1oI i1oloi1oi7 = (i1olOi1oI) this.I00iio;
/* 57 */                    if (i1oloi1oi7 != null) {
/* 67 */                        return i1oloi1oi7;
                            }
/* 62 */                    i1olOi1oI i1oloi1oi8 = new i1olOi1oI((AbstractMap) this, 5);
/* 65 */                    this.I00iio = i1oloi1oi8;
/* 67 */                    return i1oloi1oi8;
                        case 4:
/* 40 */                    i1olOi1oI i1oloi1oi9 = (i1olOi1oI) this.I00iio;
/* 42 */                    if (i1oloi1oi9 != null) {
/* 52 */                        return i1oloi1oi9;
                            }
/* 47 */                    i1olOi1oI i1oloi1oi10 = new i1olOi1oI((AbstractMap) this, 7);
/* 50 */                    this.I00iio = i1oloi1oi10;
/* 52 */                    return i1oloi1oi10;
                        case 5:
/* 24 */                    i1olOi1oI i1oloi1oi11 = (i1olOi1oI) this.I00iio;
/* 26 */                    if (i1oloi1oi11 != null) {
/* 37 */                        return i1oloi1oi11;
                            }
/* 32 */                    i1olOi1oI i1oloi1oi12 = new i1olOi1oI((AbstractMap) this, 8);
/* 35 */                    this.I00iio = i1oloi1oi12;
/* 37 */                    return i1oloi1oi12;
                        default:
/* 8 */                     i1olOi1oI i1oloi1oi13 = (i1olOi1oI) this.I00iio;
/* 10 */                    if (i1oloi1oi13 != null) {
/* 21 */                        return i1oloi1oi13;
                            }
/* 16 */                    i1olOi1oI i1oloi1oi14 = new i1olOi1oI((AbstractMap) this, 9);
/* 19 */                    this.I00iio = i1oloi1oi14;
/* 21 */                    return i1oloi1oi14;
                    }
                }
            }

            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 15 */    public final class OI0oIOI implements List, O0IloI1o {
                public final int I00iOIl;
                public Object I00iiI;

                public OI0oIOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    ((OI0oiiIO0) this.I00iiI).I00000oOI(obj);
                            break;
                        default:
/* 11 */                    ((OI110O0) this.I00iiI).I00000oOI(obj);
                            break;
                    }
/* 3 */             return true;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 20 */                    if (i < 0 || i > oI0oiiIO0.I00000oOI) {
/* 110 */                       StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Index ", i, " must be in 0..");
/* 116 */                       sbI00100o1O0lo.append(oI0oiiIO0.I00000oOI);
/* 123 */                       lO00l0o.I00000oOI(sbI00100o1O0lo.toString());
/* 126 */                       throw null;
                            }
/* 30 */                    int i2 = 0;
/* 31 */                    if (collection.isEmpty()) {
/* 30 */                        return false;
                            }
/* 40 */                    int size = collection.size() + oI0oiiIO0.I00000oOI;
/* 41 */                    Object[] objArr = oI0oiiIO0.I00000oIO;
/* 44 */                    if (objArr.length < size) {
/* 46 */                        oI0oiiIO0.I000o00OoI0I(size, objArr);
                            }
/* 49 */                    Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 53 */                    if (i != oI0oiiIO0.I00000oOI) {
/* 62 */                        I1IoiO1l.I000iOII(objArr2, collection.size() + i, objArr2, i, oI0oiiIO0.I00000oOI);
                            }
/* 76 */                    for (Object obj : collection) {
/* 82 */                        int i3 = i2 + 1;
/* 84 */                        if (i2 < 0) {
/* 91 */                            IOOi1I.I000lI();
/* 94 */                            throw null;
                                }
/* 87 */                        objArr2[i2 + i] = obj;
/* 89 */                        i2 = i3;
                            }
/* 102 */                   oI0oiiIO0.I00000oOI = collection.size() + oI0oiiIO0.I00000oOI;
/* 104 */                   return true;
                        default:
/* 10 */                    return ((OI110O0) this.I00iiI).I0000oI00(i, collection);
                    }
                }

                @Override
                public final void clear() {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((OI0oiiIO0) this.I00iiI).I0000oI00();
                            break;
                        default:
/* 10 */                    ((OI110O0) this.I00iiI).I000II();
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
                            return ((OI0oiiIO0) this.I00iiI).I000O01llI0(obj) >= 0;
                        default:
/* 10 */                    return ((OI110O0) this.I00iiI).I000OOo1O(obj);
                    }
                }

                @Override
                public final boolean containsAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 42 */                    Iterator it = collection.iterator();
/* 50 */                    while (it.hasNext()) {
/* 60 */                        if (oI0oiiIO0.I000O01llI0(it.next()) < 0) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    OI110O0 oi110o0 = (OI110O0) this.I00iiI;
/* 14 */                    Iterator it2 = collection.iterator();
/* 22 */                    while (it2.hasNext()) {
/* 32 */                        if (!oi110o0.I000OOo1O(it2.next())) {
                                    break;
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final Object get(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    OIOi1o0101.I00000oIO(i, this);
/* 25 */                    return ((OI0oiiIO0) this.I00iiI).I000II(i);
                        default:
/* 6 */                     OI110iiil0.I00000oIO(i, this);
/* 15 */                    return ((OI110O0) this.I00iiI).I00iOIl[i];
                    }
                }

                @Override
                public final int indexOf(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    return ((OI0oiiIO0) this.I00iiI).I000O01llI0(obj);
                        default:
/* 10 */                    return ((OI110O0) this.I00iiI).I000OiO(obj);
                    }
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    return ((OI0oiiIO0) this.I00iiI).I000OOo1O();
                        default:
                            return ((OI110O0) this.I00iiI).I00iiO == 0;
                    }
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return new OI0o11o0ool1(this, 0, 0);
                        default:
/* 10 */                    return new OI0o11o0ool1(this, 0, 1);
                    }
                }

                @Override
                public final int lastIndexOf(Object obj) {
                    int i;
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 37 */                    Object[] objArr = oI0oiiIO0.I00000oIO;
/* 39 */                    int i2 = oI0oiiIO0.I00000oOI;
/* 41 */                    if (obj == null) {
                                i = i2 - 1;
/* 45 */                        while (-1 < i) {
/* 49 */                            if (objArr[i] != null) {
                                        i--;
                                    }
                                }
/* 3 */                         return -1;
                            }
                            i = i2 - 1;
/* 58 */                    while (-1 < i) {
/* 66 */                        if (!obj.equals(objArr[i])) {
                                    i--;
                                }
                            }
/* 3 */                     return -1;
/* 51 */                    return i;
                        default:
/* 9 */                     OI110O0 oi110o0 = (OI110O0) this.I00iiI;
/* 15 */                    Object[] objArr2 = oi110o0.I00iOIl;
/* 17 */                    for (int i3 = oi110o0.I00iiO - 1; i3 >= 0; i3--) {
/* 25 */                        if (O0000Ioio00.I0000O(obj, objArr2[i3])) {
/* 27 */                            return i3;
                                }
                            }
/* 3 */                     return -1;
                    }
                }

                @Override
                public final ListIterator listIterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return new OI0o11o0ool1(this, 0, 0);
                        default:
/* 10 */                    return new OI0o11o0ool1(this, 0, 1);
                    }
                }

                @Override
                public final Object remove(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    OIOi1o0101.I00000oIO(i, this);
/* 25 */                    return ((OI0oiiIO0) this.I00iiI).I000l1(i);
                        default:
/* 6 */                     OI110iiil0.I00000oIO(i, this);
/* 13 */                    return ((OI110O0) this.I00iiI).I000l1(i);
                    }
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 50 */                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 54 */                    int i = oI0oiiIO0.I00000oOI;
/* 56 */                    Iterator it = collection.iterator();
/* 64 */                    while (it.hasNext()) {
/* 70 */                        oI0oiiIO0.I000iOII(it.next());
                            }
/* 76 */                    if (i == oI0oiiIO0.I00000oOI) {
                                break;
                            }
                            break;
                        default:
/* 10 */                    OI110O0 oi110o0 = (OI110O0) this.I00iiI;
/* 16 */                    if (!collection.isEmpty()) {
/* 19 */                        int i2 = oi110o0.I00iiO;
/* 23 */                        Iterator it2 = collection.iterator();
/* 31 */                        while (it2.hasNext()) {
/* 37 */                            oi110o0.I000iOII(it2.next());
                                }
/* 43 */                        if (i2 != oi110o0.I00iiO) {
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 43 */                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 45 */                    int i = oI0oiiIO0.I00000oOI;
/* 47 */                    Object[] objArr = oI0oiiIO0.I00000oIO;
/* 51 */                    for (int i2 = i - 1; -1 < i2; i2--) {
/* 59 */                        if (!collection.contains(objArr[i2])) {
/* 61 */                            oI0oiiIO0.I000l1(i2);
                                }
                            }
/* 69 */                    if (i != oI0oiiIO0.I00000oOI) {
                                break;
                            }
                            break;
                        default:
/* 11 */                    OI110O0 oi110o0 = (OI110O0) this.I00iiI;
/* 13 */                    int i3 = oi110o0.I00iiO;
/* 17 */                    for (int i4 = i3 - 1; -1 < i4; i4--) {
/* 27 */                        if (!collection.contains(oi110o0.I00iOIl[i4])) {
/* 29 */                            oi110o0.I000l1(i4);
                                }
                            }
/* 37 */                    if (i3 != oi110o0.I00iiO) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object set(int i, Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    OIOi1o0101.I00000oIO(i, this);
/* 27 */                    return ((OI0oiiIO0) this.I00iiI).I000oI1ioi(i, obj);
                        default:
/* 6 */                     OI110iiil0.I00000oIO(i, this);
/* 13 */                    Object[] objArr = ((OI110O0) this.I00iiI).I00iOIl;
/* 15 */                    Object obj2 = objArr[i];
/* 17 */                    objArr[i] = obj;
/* 19 */                    return obj2;
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    return ((OI0oiiIO0) this.I00iiI).I00000oOI;
                        default:
/* 10 */                    return ((OI110O0) this.I00iiI).I00iiO;
                    }
                }

                @Override
                public final List subList(int i, int i2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    OIOi1o0101.I00000oOI(i, i2, this);
/* 22 */                    return new OI0oi111I(this, i, i2, 0);
                        default:
/* 6 */                     OI110iiil0.I00000oOI(i, i2, this);
/* 12 */                    return new OI0oi111I(this, i, i2, 1);
                    }
                }

                @Override
                public final Object[] toArray() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return i1O0Ill0.I00000oIO(this);
                }

                @Override
/* 16 */        public final Object[] toArray(Object[] objArr) {
                    switch (this.I00iOIl) {
                    }
/* 17 */            return i1O0Ill0.I00000oOI(this, objArr);
                }

                @Override
/* 22 */        public final void add(int i, Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    ((OI0oiiIO0) this.I00iiI).I00000oIO(i, obj);
                            break;
                        default:
/* 23 */                    ((OI110O0) this.I00iiI).I00000oIO(i, obj);
                            break;
                    }
                }

                @Override
/* 22 */        public final ListIterator listIterator(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return new OI0o11o0ool1(this, i, 0);
                        default:
/* 23 */                    return new OI0o11o0ool1(this, i, 1);
                    }
                }

                @Override
/* 30 */        public final boolean remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 32 */                    return ((OI0oiiIO0) this.I00iiI).I000iOII(obj);
                        default:
/* 31 */                    return ((OI110O0) this.I00iiI).I000iOII(obj);
                    }
                }

                @Override
/* 126 */       public final boolean addAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 130 */                   OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 131 */                   int i = oI0oiiIO0.I00000oOI;
/* 132 */                   Iterator it = collection.iterator();
                            while (it.hasNext()) {
/* 133 */                       oI0oiiIO0.I00000oOI(it.next());
                            }
                            return i != oI0oiiIO0.I00000oOI;
                        default:
/* 127 */                   OI110O0 oi110o0 = (OI110O0) this.I00iiI;
/* 129 */                   return oi110o0.I0000oI00(oi110o0.I00iiO, collection);
                    }
                }
            }

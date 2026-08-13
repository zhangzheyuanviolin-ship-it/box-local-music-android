            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 15 */    public final class OI0oi111I implements List, O0IloI1o {
                public final int I00iOIl;
                public final List I00iiI;
                public final int I00iiO;
                public int I00iio;

                public OI0oi111I(List list, int i, int i2, int i3) {
/* 1 */             this.I00iOIl = i3;
/* 3 */             this.I00iiI = list;
/* 5 */             this.I00iiO = i;
/* 7 */             this.I00iio = i2;
                }

                @Override
                public final void add(int i, Object obj) {
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             int i3 = this.I00iiO;
/* 5 */             List list = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 22 */                    list.add(i + i3, obj);
                            this.I00iio++;
                            break;
                        default:
/* 11 */                    list.add(i + i3, obj);
                            this.I00iio++;
                            break;
                    }
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             int i2 = this.I00iOIl;
/* 5 */             int i3 = this.I00iiO;
/* 7 */             List list = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 30 */                    list.addAll(i + i3, collection);
/* 40 */                    this.I00iio = collection.size() + this.I00iio;
/* 46 */                    if (collection.size() > 0) {
                                break;
                            }
                            break;
                        default:
/* 13 */                    list.addAll(i + i3, collection);
/* 16 */                    int size = collection.size();
                            this.I00iio += size;
/* 25 */                    if (size > 0) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
                    switch (i) {
                        case 0:
                            int i3 = this.I00iio - 1;
/* 31 */                    if (i2 <= i3) {
                                while (true) {
/* 33 */                            list.remove(i3);
/* 36 */                            if (i3 != i2) {
                                        i3--;
                                    }
                                }
                            }
/* 41 */                    this.I00iio = i2;
                            break;
                        default:
                            int i4 = this.I00iio - 1;
/* 14 */                    if (i2 <= i4) {
                                while (true) {
/* 16 */                            list.remove(i4);
/* 19 */                            if (i4 != i2) {
                                        i4--;
                                    }
                                }
                            }
/* 24 */                    this.I00iio = i2;
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             List list = this.I00iiI;
/* 6 */             int i2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 32 */                    int i3 = this.I00iio;
/* 34 */                    while (i2 < i3) {
/* 44 */                        if (O0000Ioio00.I0000O(list.get(i2), obj)) {
                                    break;
                                } else {
/* 48 */                            i2++;
                                }
                            }
                            break;
                        default:
/* 12 */                    int i4 = this.I00iio;
/* 14 */                    while (i2 < i4) {
/* 24 */                        if (O0000Ioio00.I0000O(list.get(i2), obj)) {
                                    break;
                                } else {
/* 28 */                            i2++;
                                }
                            }
                            break;
                    }
/* 8 */             return true;
                }

                @Override
                public final boolean containsAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    Iterator it = collection.iterator();
/* 42 */                    while (it.hasNext()) {
/* 52 */                        if (!contains(it.next())) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    Iterator it2 = collection.iterator();
/* 18 */                    while (it2.hasNext()) {
/* 28 */                        if (!contains(it2.next())) {
                                    break;
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             int i3 = this.I00iiO;
/* 5 */             List list = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 19 */                    OIOi1o0101.I00000oIO(i, this);
                            break;
                        default:
/* 10 */                    OI110iiil0.I00000oIO(i, this);
                            break;
                    }
/* 14 */            return list.get(i + i3);
                }

                @Override
                public final int indexOf(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             List list = this.I00iiI;
/* 6 */             int i2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 33 */                    int i3 = this.I00iio;
/* 36 */                    for (int i4 = i2; i4 < i3; i4++) {
/* 46 */                        if (O0000Ioio00.I0000O(list.get(i4), obj)) {
/* 48 */                            return i4 - i2;
                                }
                            }
/* 3 */                     return -1;
                        default:
/* 11 */                    int i5 = this.I00iio;
/* 14 */                    for (int i6 = i2; i6 < i5; i6++) {
/* 24 */                        if (O0000Ioio00.I0000O(list.get(i6), obj)) {
/* 26 */                            return i6 - i2;
                                }
                            }
/* 3 */                     return -1;
                    }
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    if (this.I00iio == this.I00iiO) {
                            }
                            break;
                        default:
/* 10 */                    if (this.I00iio == this.I00iiO) {
                            }
                            break;
                    }
/* 14 */            return false;
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
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
                    switch (i) {
                        case 0:
                            int i3 = this.I00iio - 1;
/* 40 */                    if (i2 <= i3) {
/* 50 */                        while (!O0000Ioio00.I0000O(list.get(i3), obj)) {
/* 55 */                            if (i3 == i2) {
                                        break;
                                    } else {
                                        i3--;
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            int i4 = this.I00iio - 1;
/* 15 */                    if (i2 <= i4) {
/* 25 */                        while (!O0000Ioio00.I0000O(list.get(i4), obj)) {
/* 30 */                            if (i4 == i2) {
                                        break;
                                    } else {
                                        i4--;
                                    }
                                }
                                break;
                            }
                            break;
                    }
/* 7 */             return -1;
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
                public final boolean remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             int i2 = this.I00iiO;
/* 6 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 41 */                    int i3 = this.I00iio;
/* 43 */                    while (i2 < i3) {
/* 53 */                        if (O0000Ioio00.I0000O(list.get(i2), obj)) {
/* 55 */                            list.remove(i2);
                                    this.I00iio--;
                                    break;
                                } else {
/* 66 */                            i2++;
                                }
                            }
                            break;
                        default:
/* 12 */                    int i4 = this.I00iio;
/* 14 */                    while (i2 < i4) {
/* 24 */                        if (O0000Ioio00.I0000O(list.get(i2), obj)) {
/* 26 */                            list.remove(i2);
                                    this.I00iio--;
                                    break;
                                } else {
/* 37 */                            i2++;
                                }
                            }
                            break;
                    }
/* 8 */             return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 36 */                    int i = this.I00iio;
/* 40 */                    Iterator it = collection.iterator();
/* 48 */                    while (it.hasNext()) {
/* 54 */                        remove(it.next());
                            }
/* 60 */                    if (i != this.I00iio) {
                                break;
                            }
                            break;
                        default:
/* 8 */                     int i2 = this.I00iio;
/* 12 */                    Iterator it2 = collection.iterator();
/* 20 */                    while (it2.hasNext()) {
/* 26 */                        remove(it2.next());
                            }
/* 32 */                    if (i2 != this.I00iio) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             int i2 = this.I00iiO;
/* 7 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 48 */                    int i3 = this.I00iio;
                            int i4 = i3 - 1;
/* 52 */                    if (i2 <= i4) {
                                while (true) {
/* 62 */                            if (!collection.contains(list.get(i4))) {
/* 64 */                                list.remove(i4);
                                        this.I00iio--;
                                    }
/* 73 */                            if (i4 != i2) {
                                        i4--;
                                    }
                                }
                            }
/* 80 */                    if (i3 != this.I00iio) {
                                break;
                            }
                            break;
                        default:
/* 12 */                    int i5 = this.I00iio;
                            int i6 = i5 - 1;
/* 16 */                    if (i2 <= i6) {
                                while (true) {
/* 26 */                            if (!collection.contains(list.get(i6))) {
/* 28 */                                list.remove(i6);
                                        this.I00iio--;
                                    }
/* 37 */                            if (i6 != i2) {
                                        i6--;
                                    }
                                }
                            }
/* 44 */                    if (i5 != this.I00iio) {
                                break;
                            }
                            break;
                    }
/* 6 */             return true;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             int i3 = this.I00iiO;
/* 5 */             List list = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 19 */                    OIOi1o0101.I00000oIO(i, this);
                            break;
                        default:
/* 10 */                    OI110iiil0.I00000oIO(i, this);
                            break;
                    }
/* 14 */            return list.set(i + i3, obj);
                }

                @Override
                public final int size() {
                    int i;
                    int i2;
                    switch (this.I00iOIl) {
                        case 0:
/* 12 */                    i = this.I00iio;
/* 14 */                    i2 = this.I00iiO;
                            break;
                        default:
/* 6 */                     i = this.I00iio;
/* 8 */                     i2 = this.I00iiO;
                            break;
                    }
/* 10 */            return i - i2;
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
/* 22 */        public final ListIterator listIterator(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return new OI0o11o0ool1(this, i, 0);
                        default:
/* 23 */                    return new OI0o11o0ool1(this, i, 1);
                    }
                }

                @Override
/* 32 */        public final boolean add(Object obj) {
                    int i = this.I00iOIl;
                    List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 34 */                    int i2 = this.I00iio;
                            this.I00iio = i2 + 1;
                            list.add(i2, obj);
                            break;
                        default:
/* 33 */                    int i3 = this.I00iio;
                            this.I00iio = i3 + 1;
                            list.add(i3, obj);
                            break;
                    }
                    return true;
                }

                @Override
/* 50 */        public final boolean addAll(Collection collection) {
                    int i = this.I00iOIl;
                    List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 54 */                    list.addAll(this.I00iio, collection);
                            this.I00iio = collection.size() + this.I00iio;
/* 56 */                    if (collection.size() > 0) {
                                break;
                            }
                            break;
                        default:
/* 51 */                    list.addAll(this.I00iio, collection);
/* 52 */                    int size = collection.size();
                            this.I00iio += size;
                            if (size > 0) {
                                break;
                            }
                            break;
                    }
                    return true;
                }

                @Override
/* 70 */        public final Object remove(int i) {
                    int i2 = this.I00iOIl;
                    int i3 = this.I00iiO;
                    List list = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 74 */                    OIOi1o0101.I00000oIO(i, this);
                            this.I00iio--;
/* 75 */                    return list.remove(i + i3);
                        default:
/* 71 */                    OI110iiil0.I00000oIO(i, this);
                            this.I00iio--;
/* 72 */                    return list.remove(i + i3);
                    }
                }
            }

            package p000;

            import java.lang.reflect.Array;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 25 */    public final class I1Il0loi extends I01Io000 {
                public static final Object[] I00iio = new Object[0];
                public int I00iOIl;
                public Object[] I00iiI;
                public int I00iiO;

                public I1Il0loi(int i) {
                    Object[] objArr;
/* 4 */             if (i == 0) {
/* 6 */                 objArr = I00iio;
                    } else {
/* 9 */                 if (i <= 0) {
/* 22 */                    I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Illegal Capacity: "));
/* 29 */                    throw null;
                        }
/* 11 */                objArr = new Object[i];
                    }
/* 13 */            this.I00iiI = objArr;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object I0000O(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 4 */             if (i < 0 || i >= i2) {
/* 148 */               I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 3 */                 return null;
                    }
/* 12 */            if (i == IOOi1I.I000II(this)) {
/* 14 */                return removeLast();
                    }
/* 19 */            if (i == 0) {
/* 21 */                return removeFirst();
                    }
/* 26 */            I0010o();
/* 32 */            int iI0010I0i = I0010I0i(this.I00iOIl + i);
/* 36 */            Object[] objArr = this.I00iiI;
/* 38 */            Object obj = objArr[iI0010I0i];
/* 43 */            int i3 = this.I00iiO >> 1;
/* 44 */            int i4 = this.I00iOIl;
/* 47 */            if (i < i3) {
/* 49 */                if (iI0010I0i >= i4) {
/* 53 */                    I1IoiO1l.I000iOII(objArr, i4 + 1, objArr, i4, iI0010I0i);
                        } else {
/* 57 */                    I1IoiO1l.I000iOII(objArr, 1, objArr, 0, iI0010I0i);
/* 60 */                    Object[] objArr2 = this.I00iiI;
/* 66 */                    objArr2[0] = objArr2[objArr2.length - 1];
/* 68 */                    int i5 = this.I00iOIl;
/* 74 */                    I1IoiO1l.I000iOII(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
                        }
/* 77 */                Object[] objArr3 = this.I00iiI;
/* 79 */                int i6 = this.I00iOIl;
/* 81 */                objArr3[i6] = null;
/* 87 */                this.I00iOIl = I000lI(i6);
                    } else {
/* 95 */                int iI0010I0i2 = I0010I0i(IOOi1I.I000II(this) + i4);
/* 99 */                Object[] objArr4 = this.I00iiI;
/* 101 */               if (iI0010I0i <= iI0010I0i2) {
/* 107 */                   I1IoiO1l.I000iOII(objArr4, iI0010I0i, objArr4, iI0010I0i + 1, iI0010I0i2 + 1);
                        } else {
/* 114 */                   I1IoiO1l.I000iOII(objArr4, iI0010I0i, objArr4, iI0010I0i + 1, objArr4.length);
/* 117 */                   Object[] objArr5 = this.I00iiI;
/* 123 */                   objArr5[objArr5.length - 1] = objArr5[0];
/* 127 */                   I1IoiO1l.I000iOII(objArr5, 0, objArr5, 1, iI0010I0i2 + 1);
                        }
/* 132 */               this.I00iiI[iI0010I0i2] = null;
                    }
                    this.I00iiO--;
/* 139 */           return obj;
                }

                public final void I000OOo1O(int i, Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 7 */             int length = this.I00iiI.length;
/* 8 */             while (i < length && it.hasNext()) {
/* 22 */                this.I00iiI[i] = it.next();
/* 24 */                i++;
                    }
/* 27 */            int i2 = this.I00iOIl;
/* 30 */            for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
/* 44 */                this.I00iiI[i3] = it.next();
                    }
/* 56 */            this.I00iiO = collection.size() + this.I00iiO;
                }

                public final void I000OiO(int i) {
/* 1 */             if (i < 0) {
/* 71 */                I000II.I001IO000("Deque is too big.");
/* 77 */                return;
                    }
/* 3 */             Object[] objArr = this.I00iiI;
/* 6 */             if (i <= objArr.length) {
/* 8 */                 return;
                    }
/* 11 */            if (objArr == I00iio) {
/* 15 */                if (i < 10) {
/* 17 */                    i = 10;
                        }
/* 20 */                this.I00iiI = new Object[i];
/* 22 */                return;
                    }
/* 23 */            int length = objArr.length;
/* 26 */            int i2 = length + (length >> 1);
/* 29 */            if (i2 - i < 0) {
/* 31 */                i2 = i;
                    }
/* 37 */            if (i2 - 2147483639 > 0) {
/* 45 */                i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                    }
/* 46 */            Object[] objArr2 = new Object[i2];
/* 52 */            I1IoiO1l.I000iOII(objArr, 0, objArr2, this.I00iOIl, objArr.length);
/* 55 */            Object[] objArr3 = this.I00iiI;
/* 57 */            int length2 = objArr3.length;
/* 58 */            int i3 = this.I00iOIl;
/* 61 */            I1IoiO1l.I000iOII(objArr3, length2 - i3, objArr2, 0, i3);
/* 64 */            this.I00iOIl = 0;
/* 66 */            this.I00iiI = objArr2;
                }

                public final Object I000iOII() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return null;
                    }
/* 13 */            return this.I00iiI[this.I00iOIl];
                }

                public final int I000lI(int i) {
/* 6 */             if (i == this.I00iiI.length - 1) {
/* 8 */                 return 0;
                    }
/* 10 */            return i + 1;
                }

                public final Object I000o00OoI0I() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return null;
                    }
/* 22 */            return this.I00iiI[I0010I0i(IOOi1I.I000II(this) + this.I00iOIl)];
                }

                public final int I000oI1ioi(int i) {
                    return i < 0 ? i + this.I00iiI.length : i;
                }

                public final void I00100o1O0lo(int i, int i2) {
/* 1 */             Object[] objArr = this.I00iiI;
/* 4 */             if (i < i2) {
/* 6 */                 Arrays.fill(objArr, i, i2, (Object) null);
                    } else {
/* 11 */                Arrays.fill(objArr, i, objArr.length, (Object) null);
/* 17 */                Arrays.fill(this.I00iiI, 0, i2, (Object) null);
                    }
                }

                public final int I0010I0i(int i) {
/* 1 */             Object[] objArr = this.I00iiI;
                    return i >= objArr.length ? i - objArr.length : i;
                }

                public final void I0010o() {
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final void add(int i, Object obj) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             if (i < 0 || i > i2) {
/* 157 */               I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 332 */               return;
                    }
/* 7 */             if (i == i2) {
/* 9 */                 addLast(obj);
/* 12 */                return;
                    }
/* 13 */            if (i == 0) {
/* 15 */                addFirst(obj);
/* 18 */                return;
                    }
/* 19 */            I0010o();
/* 26 */            I000OiO(this.I00iiO + 1);
/* 32 */            int iI0010I0i = I0010I0i(this.I00iOIl + i);
/* 36 */            int i3 = this.I00iiO;
/* 40 */            int i4 = (i3 + 1) >> 1;
/* 41 */            int i5 = this.I00iOIl;
/* 44 */            if (i < i4) {
/* 53 */                int length = iI0010I0i == 0 ? this.I00iiI.length - 1 : iI0010I0i - 1;
/* 62 */                int length2 = i5 == 0 ? this.I00iiI.length - 1 : i5 - 1;
/* 64 */                Object[] objArr = this.I00iiI;
/* 66 */                if (length >= i5) {
/* 70 */                    objArr[length2] = objArr[i5];
/* 76 */                    I1IoiO1l.I000iOII(objArr, i5, objArr, i5 + 1, length + 1);
                        } else {
/* 83 */                    I1IoiO1l.I000iOII(objArr, i5 - 1, objArr, i5, objArr.length);
/* 86 */                    Object[] objArr2 = this.I00iiI;
/* 92 */                    objArr2[objArr2.length - 1] = objArr2[0];
/* 96 */                    I1IoiO1l.I000iOII(objArr2, 0, objArr2, 1, length + 1);
                        }
/* 101 */               this.I00iiI[length] = obj;
/* 103 */               this.I00iOIl = length2;
                    } else {
/* 107 */               int iI0010I0i2 = I0010I0i(i3 + i5);
/* 111 */               Object[] objArr3 = this.I00iiI;
/* 113 */               if (iI0010I0i < iI0010I0i2) {
/* 117 */                   I1IoiO1l.I000iOII(objArr3, iI0010I0i + 1, objArr3, iI0010I0i, iI0010I0i2);
                        } else {
/* 121 */                   I1IoiO1l.I000iOII(objArr3, 1, objArr3, 0, iI0010I0i2);
/* 124 */                   Object[] objArr4 = this.I00iiI;
/* 130 */                   objArr4[0] = objArr4[objArr4.length - 1];
/* 136 */                   I1IoiO1l.I000iOII(objArr4, iI0010I0i + 1, objArr4, iI0010I0i, objArr4.length - 1);
                        }
/* 141 */               this.I00iiI[iI0010I0i] = obj;
                    }
                    this.I00iiO++;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             int i2 = this.I00iiO;
/* 4 */             if (i < 0 || i > i2) {
/* 215 */               I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 3 */                 return false;
                    }
/* 12 */            if (collection.isEmpty()) {
/* 3 */                 return false;
                    }
/* 17 */            if (i == this.I00iiO) {
/* 19 */                return addAll(collection);
                    }
/* 24 */            I0010o();
/* 34 */            I000OiO(collection.size() + this.I00iiO);
/* 42 */            int iI0010I0i = I0010I0i(this.I00iiO + this.I00iOIl);
/* 49 */            int iI0010I0i2 = I0010I0i(this.I00iOIl + i);
/* 53 */            int size = collection.size();
/* 62 */            if (i >= ((this.I00iiO + 1) >> 1)) {
/* 139 */               int i3 = iI0010I0i2 + size;
/* 141 */               Object[] objArr = this.I00iiI;
/* 143 */               if (iI0010I0i2 < iI0010I0i) {
/* 145 */                   int i4 = size + iI0010I0i;
/* 147 */                   if (i4 <= objArr.length) {
/* 149 */                       I1IoiO1l.I000iOII(objArr, i3, objArr, iI0010I0i2, iI0010I0i);
                            } else if (i3 >= objArr.length) {
/* 158 */                       I1IoiO1l.I000iOII(objArr, i3 - objArr.length, objArr, iI0010I0i2, iI0010I0i);
                            } else {
/* 164 */                       int length = iI0010I0i - (i4 - objArr.length);
/* 166 */                       I1IoiO1l.I000iOII(objArr, 0, objArr, length, iI0010I0i);
/* 169 */                       Object[] objArr2 = this.I00iiI;
/* 171 */                       I1IoiO1l.I000iOII(objArr2, i3, objArr2, iI0010I0i2, length);
                            }
                        } else {
/* 175 */                   I1IoiO1l.I000iOII(objArr, size, objArr, 0, iI0010I0i);
/* 178 */                   Object[] objArr3 = this.I00iiI;
/* 181 */                   if (i3 >= objArr3.length) {
/* 186 */                       I1IoiO1l.I000iOII(objArr3, i3 - objArr3.length, objArr3, iI0010I0i2, objArr3.length);
                            } else {
/* 193 */                       I1IoiO1l.I000iOII(objArr3, 0, objArr3, objArr3.length - size, objArr3.length);
/* 196 */                       Object[] objArr4 = this.I00iiI;
/* 200 */                       I1IoiO1l.I000iOII(objArr4, i3, objArr4, iI0010I0i2, objArr4.length - size);
                            }
                        }
/* 203 */               I000OOo1O(iI0010I0i2, collection);
/* 59 */                return true;
                    }
/* 64 */            int i5 = this.I00iOIl;
/* 66 */            int length2 = i5 - size;
/* 68 */            Object[] objArr5 = this.I00iiI;
/* 70 */            if (iI0010I0i2 < i5) {
/* 105 */               I1IoiO1l.I000iOII(objArr5, length2, objArr5, i5, objArr5.length);
/* 108 */               Object[] objArr6 = this.I00iiI;
/* 110 */               if (size >= iI0010I0i2) {
/* 114 */                   I1IoiO1l.I000iOII(objArr6, objArr6.length - size, objArr6, 0, iI0010I0i2);
                        } else {
/* 120 */                   I1IoiO1l.I000iOII(objArr6, objArr6.length - size, objArr6, 0, size);
/* 123 */                   Object[] objArr7 = this.I00iiI;
/* 125 */                   I1IoiO1l.I000iOII(objArr7, 0, objArr7, size, iI0010I0i2);
                        }
                    } else if (length2 >= 0) {
/* 74 */                I1IoiO1l.I000iOII(objArr5, length2, objArr5, i5, iI0010I0i2);
                    } else {
/* 79 */                length2 += objArr5.length;
/* 80 */                int i6 = iI0010I0i2 - i5;
/* 83 */                int length3 = objArr5.length - length2;
/* 84 */                if (length3 >= i6) {
/* 86 */                    I1IoiO1l.I000iOII(objArr5, length2, objArr5, i5, iI0010I0i2);
                        } else {
/* 92 */                    I1IoiO1l.I000iOII(objArr5, length2, objArr5, i5, i5 + length3);
/* 95 */                    Object[] objArr8 = this.I00iiI;
/* 100 */                   I1IoiO1l.I000iOII(objArr8, 0, objArr8, this.I00iOIl + length3, iI0010I0i2);
                        }
                    }
/* 128 */           this.I00iOIl = length2;
/* 135 */           I000OOo1O(I000oI1ioi(iI0010I0i2 - size), collection);
/* 59 */            return true;
                }

                public final void addFirst(Object obj) {
/* 1 */             I0010o();
/* 8 */             I000OiO(this.I00iiO + 1);
/* 11 */            int length = this.I00iOIl;
/* 13 */            if (length == 0) {
/* 17 */                length = this.I00iiI.length;
                    }
                    int i = length - 1;
/* 20 */            this.I00iOIl = i;
/* 24 */            this.I00iiI[i] = obj;
                    this.I00iiO++;
                }

                public final void addLast(Object obj) {
/* 1 */             I0010o();
/* 8 */             I000OiO(this.I00iiO + 1);
/* 22 */            this.I00iiI[I0010I0i(this.I00iiO + this.I00iOIl)] = obj;
                    this.I00iiO++;
                }

                @Override
                public final void clear() {
/* 5 */             if (!isEmpty()) {
/* 7 */                 I0010o();
/* 21 */                I00100o1O0lo(this.I00iOIl, I0010I0i(this.I00iiO + this.I00iOIl));
                    }
/* 25 */            this.I00iOIl = 0;
/* 27 */            this.I00iiO = 0;
                }

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                public final Object first() {
/* 5 */             if (!isEmpty()) {
/* 11 */                return this.I00iiI[this.I00iOIl];
                    }
/* 16 */            OIiilo1Ool0o.I000II("ArrayDeque is empty.");
/* 19 */            return null;
                }

                @Override
                public final Object get(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             if (i >= 0 && i < i2) {
/* 16 */                return this.I00iiI[I0010I0i(this.I00iOIl + i)];
                    }
/* 27 */            I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 30 */            return null;
                }

                @Override
                public final int indexOf(Object obj) {
                    int i;
/* 6 */             int iI0010I0i = I0010I0i(this.I00iiO + this.I00iOIl);
/* 10 */            int length = this.I00iOIl;
/* 12 */            if (length < iI0010I0i) {
/* 14 */                while (length < iI0010I0i) {
/* 24 */                    if (O0000Ioio00.I0000O(obj, this.I00iiI[length])) {
/* 26 */                        i = this.I00iOIl;
                            } else {
/* 30 */                        length++;
                            }
                        }
/* 87 */                return -1;
                    }
/* 37 */            if (isEmpty() || (length = this.I00iOIl) < iI0010I0i) {
/* 87 */                return -1;
                    }
/* 45 */            int length2 = this.I00iiI.length;
                    while (true) {
/* 46 */                if (length >= length2) {
/* 65 */                    for (int i2 = 0; i2 < iI0010I0i; i2++) {
/* 75 */                        if (O0000Ioio00.I0000O(obj, this.I00iiI[i2])) {
/* 80 */                            length = i2 + this.I00iiI.length;
/* 81 */                            i = this.I00iOIl;
                                }
                            }
/* 87 */                    return -1;
                        }
/* 56 */                if (O0000Ioio00.I0000O(obj, this.I00iiI[length])) {
/* 58 */                    i = this.I00iOIl;
                            break;
                        }
/* 61 */                length++;
                    }
/* 28 */            return length - i;
                }

                @Override
                public final boolean isEmpty() {
                    return I00000oOI() == 0;
                }

                public final Object last() {
/* 5 */             if (isEmpty()) {
/* 25 */                OIiilo1Ool0o.I000II("ArrayDeque is empty.");
/* 28 */                return null;
                    }
/* 20 */            return this.I00iiI[I0010I0i(IOOi1I.I000II(this) + this.I00iOIl)];
                }

                @Override
                public final int lastIndexOf(Object obj) {
                    int length;
                    int i;
/* 6 */             int iI0010I0i = I0010I0i(this.I00iiO + this.I00iOIl);
/* 10 */            int i2 = this.I00iOIl;
/* 13 */            if (i2 < iI0010I0i) {
                        length = iI0010I0i - 1;
/* 17 */                if (i2 <= length) {
/* 27 */                    while (!O0000Ioio00.I0000O(obj, this.I00iiI[length])) {
/* 33 */                        if (length != i2) {
                                    length--;
                                }
                            }
/* 29 */                    i = this.I00iOIl;
/* 31 */                    return length - i;
                        }
/* 12 */                return -1;
                    }
/* 42 */            if (!isEmpty() && this.I00iOIl >= iI0010I0i) {
                        while (true) {
                            iI0010I0i--;
/* 50 */                    Object[] objArr = this.I00iiI;
/* 52 */                    if (-1 >= iI0010I0i) {
                                length = objArr.length - 1;
/* 75 */                        int i3 = this.I00iOIl;
/* 77 */                        if (i3 <= length) {
/* 87 */                            while (!O0000Ioio00.I0000O(obj, this.I00iiI[length])) {
/* 92 */                                if (length != i3) {
                                            length--;
                                        }
                                    }
/* 89 */                            i = this.I00iOIl;
                                }
                            } else if (O0000Ioio00.I0000O(obj, objArr[iI0010I0i])) {
/* 65 */                        length = iI0010I0i + this.I00iiI.length;
/* 66 */                        i = this.I00iOIl;
                                break;
                            }
                        }
/* 31 */                return length - i;
                    }
/* 12 */            return -1;
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             int iIndexOf = indexOf(obj);
/* 6 */             if (iIndexOf == -1) {
/* 8 */                 return false;
                    }
/* 10 */            I0000O(iIndexOf);
/* 13 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    int iI0010I0i;
                    Object[] objArr;
/* 5 */             boolean z = false;
/* 5 */             z = false;
/* 5 */             z = false;
/* 6 */             if (!isEmpty() && this.I00iiI.length != 0) {
/* 20 */                int iI0010I0i2 = I0010I0i(this.I00iiO + this.I00iOIl);
/* 24 */                int i = this.I00iOIl;
/* 28 */                if (i < iI0010I0i2) {
/* 30 */                    iI0010I0i = i;
                            while (true) {
/* 31 */                        objArr = this.I00iiI;
/* 33 */                        if (i >= iI0010I0i2) {
                                    break;
                                }
/* 35 */                        Object obj = objArr[i];
/* 41 */                        if (collection.contains(obj)) {
/* 51 */                            z = true;
                                } else {
/* 47 */                            this.I00iiI[iI0010I0i] = obj;
/* 45 */                            iI0010I0i++;
                                }
/* 52 */                        i++;
                            }
/* 55 */                    Arrays.fill(objArr, iI0010I0i, iI0010I0i2, (Object) null);
                        } else {
/* 61 */                    int length = this.I00iiI.length;
/* 62 */                    boolean z2 = false;
/* 63 */                    int i2 = i;
/* 64 */                    while (i < length) {
/* 66 */                        Object[] objArr2 = this.I00iiI;
/* 68 */                        Object obj2 = objArr2[i];
/* 70 */                        objArr2[i] = null;
/* 76 */                        if (collection.contains(obj2)) {
/* 86 */                            z2 = true;
                                } else {
/* 82 */                            this.I00iiI[i2] = obj2;
/* 80 */                            i2++;
                                }
/* 87 */                        i++;
                            }
/* 90 */                    iI0010I0i = I0010I0i(i2);
/* 95 */                    for (int i3 = 0; i3 < iI0010I0i2; i3++) {
/* 97 */                        Object[] objArr3 = this.I00iiI;
/* 99 */                        Object obj3 = objArr3[i3];
/* 101 */                       objArr3[i3] = null;
/* 107 */                       if (collection.contains(obj3)) {
/* 118 */                           z2 = true;
                                } else {
/* 111 */                           this.I00iiI[iI0010I0i] = obj3;
/* 113 */                           iI0010I0i = I000lI(iI0010I0i);
                                }
                            }
/* 122 */                   z = z2;
                        }
/* 123 */               if (z) {
/* 125 */                   I0010o();
/* 135 */                   this.I00iiO = I000oI1ioi(iI0010I0i - this.I00iOIl);
                        }
                    }
/* 168 */           return z;
                }

                public final Object removeFirst() {
/* 6 */             if (isEmpty()) {
/* 34 */                OIiilo1Ool0o.I000II("ArrayDeque is empty.");
/* 5 */                 return null;
                    }
/* 8 */             I0010o();
/* 11 */            Object[] objArr = this.I00iiI;
/* 13 */            int i = this.I00iOIl;
/* 15 */            Object obj = objArr[i];
/* 17 */            objArr[i] = null;
/* 23 */            this.I00iOIl = I000lI(i);
                    this.I00iiO--;
/* 31 */            return obj;
                }

                public final Object removeLast() {
/* 6 */             if (isEmpty()) {
/* 37 */                OIiilo1Ool0o.I000II("ArrayDeque is empty.");
/* 5 */                 return null;
                    }
/* 8 */             I0010o();
/* 18 */            int iI0010I0i = I0010I0i(IOOi1I.I000II(this) + this.I00iOIl);
/* 22 */            Object[] objArr = this.I00iiI;
/* 24 */            Object obj = objArr[iI0010I0i];
/* 26 */            objArr[iI0010I0i] = null;
                    this.I00iiO--;
/* 34 */            return obj;
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 3 */             iOI0OiiiOl1.I00000oOI(i, i2, this.I00iiO);
/* 6 */             int i3 = i2 - i;
/* 8 */             if (i3 == 0) {
/* 10 */                return;
                    }
/* 13 */            if (i3 == this.I00iiO) {
/* 15 */                clear();
/* 18 */                return;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                I0000O(i);
/* 25 */                return;
                    }
/* 26 */            I0010o();
/* 31 */            int i4 = this.I00iiO - i2;
/* 32 */            int i5 = this.I00iOIl;
/* 34 */            int i6 = this.I00iOIl;
/* 36 */            if (i < i4) {
/* 41 */                int iI0010I0i = I0010I0i((i - 1) + i5);
/* 47 */                int iI0010I0i2 = I0010I0i((i2 - 1) + i6);
/* 51 */                while (i > 0) {
/* 53 */                    int i7 = iI0010I0i + 1;
/* 61 */                    int iMin = Math.min(i, Math.min(i7, iI0010I0i2 + 1));
/* 65 */                    Object[] objArr = this.I00iiI;
/* 67 */                    int i8 = iI0010I0i2 - iMin;
/* 70 */                    int i9 = iI0010I0i - iMin;
/* 73 */                    I1IoiO1l.I000iOII(objArr, i8 + 1, objArr, i9 + 1, i7);
/* 76 */                    iI0010I0i = I000oI1ioi(i9);
/* 80 */                    iI0010I0i2 = I000oI1ioi(i8);
/* 84 */                    i -= iMin;
                        }
/* 89 */                int iI0010I0i3 = I0010I0i(this.I00iOIl + i3);
/* 95 */                I00100o1O0lo(this.I00iOIl, iI0010I0i3);
/* 98 */                this.I00iOIl = iI0010I0i3;
                    } else {
/* 102 */               int iI0010I0i4 = I0010I0i(i5 + i2);
/* 107 */               int iI0010I0i5 = I0010I0i(i6 + i);
/* 111 */               int i10 = this.I00iiO;
                        while (true) {
/* 113 */                   i10 -= i2;
/* 114 */                   if (i10 <= 0) {
                                break;
                            }
/* 116 */                   Object[] objArr2 = this.I00iiI;
/* 126 */                   i2 = Math.min(i10, Math.min(objArr2.length - iI0010I0i4, objArr2.length - iI0010I0i5));
/* 130 */                   Object[] objArr3 = this.I00iiI;
/* 132 */                   int i11 = iI0010I0i4 + i2;
/* 134 */                   I1IoiO1l.I000iOII(objArr3, iI0010I0i5, objArr3, iI0010I0i4, i11);
/* 137 */                   iI0010I0i4 = I0010I0i(i11);
/* 142 */                   iI0010I0i5 = I0010I0i(iI0010I0i5 + i2);
                        }
/* 152 */               int iI0010I0i6 = I0010I0i(this.I00iiO + this.I00iOIl);
/* 162 */               I00100o1O0lo(I000oI1ioi(iI0010I0i6 - i3), iI0010I0i6);
                    }
                    this.I00iiO -= i3;
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    int iI0010I0i;
                    Object[] objArr;
/* 5 */             boolean z = false;
/* 5 */             z = false;
/* 5 */             z = false;
/* 6 */             if (!isEmpty() && this.I00iiI.length != 0) {
/* 20 */                int iI0010I0i2 = I0010I0i(this.I00iiO + this.I00iOIl);
/* 24 */                int i = this.I00iOIl;
/* 28 */                if (i < iI0010I0i2) {
/* 30 */                    iI0010I0i = i;
                            while (true) {
/* 31 */                        objArr = this.I00iiI;
/* 33 */                        if (i >= iI0010I0i2) {
                                    break;
                                }
/* 35 */                        Object obj = objArr[i];
/* 41 */                        if (collection.contains(obj)) {
/* 47 */                            this.I00iiI[iI0010I0i] = obj;
/* 45 */                            iI0010I0i++;
                                } else {
/* 51 */                            z = true;
                                }
/* 52 */                        i++;
                            }
/* 55 */                    Arrays.fill(objArr, iI0010I0i, iI0010I0i2, (Object) null);
                        } else {
/* 61 */                    int length = this.I00iiI.length;
/* 62 */                    boolean z2 = false;
/* 63 */                    int i2 = i;
/* 64 */                    while (i < length) {
/* 66 */                        Object[] objArr2 = this.I00iiI;
/* 68 */                        Object obj2 = objArr2[i];
/* 70 */                        objArr2[i] = null;
/* 76 */                        if (collection.contains(obj2)) {
/* 82 */                            this.I00iiI[i2] = obj2;
/* 80 */                            i2++;
                                } else {
/* 86 */                            z2 = true;
                                }
/* 87 */                        i++;
                            }
/* 90 */                    iI0010I0i = I0010I0i(i2);
/* 95 */                    for (int i3 = 0; i3 < iI0010I0i2; i3++) {
/* 97 */                        Object[] objArr3 = this.I00iiI;
/* 99 */                        Object obj3 = objArr3[i3];
/* 101 */                       objArr3[i3] = null;
/* 107 */                       if (collection.contains(obj3)) {
/* 111 */                           this.I00iiI[iI0010I0i] = obj3;
/* 113 */                           iI0010I0i = I000lI(iI0010I0i);
                                } else {
/* 118 */                           z2 = true;
                                }
                            }
/* 122 */                   z = z2;
                        }
/* 123 */               if (z) {
/* 125 */                   I0010o();
/* 135 */                   this.I00iiO = I000oI1ioi(iI0010I0i - this.I00iOIl);
                        }
                    }
/* 168 */           return z;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             if (i < 0 || i >= i2) {
/* 29 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 32 */                return null;
                    }
/* 10 */            int iI0010I0i = I0010I0i(this.I00iOIl + i);
/* 14 */            Object[] objArr = this.I00iiI;
/* 16 */            Object obj2 = objArr[iI0010I0i];
/* 18 */            objArr[iI0010I0i] = obj;
/* 20 */            return obj2;
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 1 */             int length = objArr.length;
/* 2 */             int i = this.I00iiO;
/* 4 */             if (length < i) {
/* 19 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                    }
/* 26 */            int iI0010I0i = I0010I0i(this.I00iiO + this.I00iOIl);
/* 30 */            int i2 = this.I00iOIl;
/* 32 */            if (i2 < iI0010I0i) {
/* 37 */                I1IoiO1l.I000oI1ioi(this.I00iiI, i2, objArr, iI0010I0i, 2);
                    } else if (!isEmpty()) {
/* 47 */                Object[] objArr2 = this.I00iiI;
/* 53 */                I1IoiO1l.I000iOII(objArr2, 0, objArr, this.I00iOIl, objArr2.length);
/* 56 */                Object[] objArr3 = this.I00iiI;
/* 62 */                I1IoiO1l.I000iOII(objArr3, objArr3.length - this.I00iOIl, objArr, 0, iI0010I0i);
                    }
/* 65 */            int i3 = this.I00iiO;
/* 68 */            if (i3 < objArr.length) {
/* 71 */                objArr[i3] = null;
                    }
/* 77 */            return objArr;
                }

/* 26 */        public I1Il0loi() {
/* 28 */            this.I00iiI = I00iio;
                }

                @Override
/* 73 */        public final Object[] toArray() {
/* 75 */            return toArray(new Object[I00000oOI()]);
                }

                @Override
/* 160 */       public final boolean add(Object obj) {
/* 161 */           addLast(obj);
                    return true;
                }

                @Override
/* 218 */       public final boolean addAll(Collection collection) {
/* 219 */           if (collection.isEmpty()) {
                        return false;
                    }
/* 220 */           I0010o();
/* 222 */           I000OiO(collection.size() + this.I00iiO);
/* 225 */           I000OOo1O(I0010I0i(this.I00iiO + this.I00iOIl), collection);
                    return true;
                }
            }

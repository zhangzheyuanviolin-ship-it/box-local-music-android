            package p000;

            import O100I1lloo.I0000O;
            import O100I1lloo.I0000oI00;
            import java.io.Serializable;
            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.Arrays;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
/* 2 */     public final class O100I1lloo extends AbstractMap implements Serializable {
                static final boolean $assertionsDisabled = false;
                private static final Comparator<Comparable> NATURAL_ORDER = new I00000oIO();
                final Comparator<Object> comparator;
                private I0000O entrySet;
                final I000II header;
                private I0000oI00 keySet;
                int modCount;
                int size;
                I000II[] table;
                int threshold;

                public static final class I00000oOI {
                    private int leavesSkipped;
                    private int leavesToSkip;
                    private int size;
                    private I000II stack;

                    public void add(I000II i000ii) {
/* 2 */                 i000ii.right = null;
/* 4 */                 i000ii.parent = null;
/* 6 */                 i000ii.left = null;
/* 9 */                 i000ii.height = 1;
/* 11 */                int i = this.leavesToSkip;
/* 13 */                if (i > 0) {
/* 15 */                    int i2 = this.size;
/* 19 */                    if ((i2 & 1) == 0) {
/* 22 */                        this.size = i2 + 1;
                                i--;
/* 26 */                        this.leavesToSkip = i;
                                this.leavesSkipped++;
                            }
                        }
/* 35 */                i000ii.parent = this.stack;
/* 37 */                this.stack = i000ii;
/* 39 */                int i3 = this.size;
/* 41 */                int i4 = i3 + 1;
/* 43 */                this.size = i4;
/* 46 */                if (i > 0 && (i4 & 1) == 0) {
/* 52 */                    this.size = i3 + 2;
/* 55 */                    this.leavesToSkip = i - 1;
                            this.leavesSkipped++;
                        }
/* 62 */                int i5 = 4;
                        while (true) {
                            int i6 = i5 - 1;
/* 68 */                    if ((this.size & i6) != i6) {
/* 186 */                       return;
                            }
/* 70 */                    int i7 = this.leavesSkipped;
/* 72 */                    if (i7 == 0) {
/* 74 */                        I000II i000ii2 = this.stack;
/* 76 */                        I000II i000ii3 = i000ii2.parent;
/* 78 */                        I000II i000ii4 = i000ii3.parent;
/* 82 */                        i000ii3.parent = i000ii4.parent;
/* 84 */                        this.stack = i000ii3;
/* 86 */                        i000ii3.left = i000ii4;
/* 88 */                        i000ii3.right = i000ii2;
/* 93 */                        i000ii3.height = i000ii2.height + 1;
/* 95 */                        i000ii4.parent = i000ii3;
/* 97 */                        i000ii2.parent = i000ii3;
                            } else if (i7 == 1) {
/* 103 */                       I000II i000ii5 = this.stack;
/* 105 */                       I000II i000ii6 = i000ii5.parent;
/* 107 */                       this.stack = i000ii6;
/* 109 */                       i000ii6.right = i000ii5;
/* 114 */                       i000ii6.height = i000ii5.height + 1;
/* 116 */                       i000ii5.parent = i000ii6;
/* 118 */                       this.leavesSkipped = 0;
                            } else if (i7 == 2) {
/* 123 */                       this.leavesSkipped = 0;
                            }
/* 125 */                   i5 *= 2;
                        }
                    }

                    public void reset(int i) {
/* 10 */                this.leavesToSkip = ((Integer.highestOneBit(i) * 2) - 1) - i;
/* 13 */                this.size = 0;
/* 15 */                this.leavesSkipped = 0;
/* 18 */                this.stack = null;
                    }

                    public I000II root() {
/* 1 */                 I000II i000ii = this.stack;
/* 5 */                 if (i000ii.parent == null) {
/* 7 */                     return i000ii;
                        }
/* 8 */                 IOOlIIilOl0.I000iOII();
/* 11 */                return null;
                    }
                }

                public static class I0000Il00O {
                    private I000II stackTop;

                    public I000II next() {
/* 1 */                 I000II i000ii = this.stackTop;
/* 4 */                 if (i000ii == null) {
/* 3 */                     return null;
                        }
/* 7 */                 I000II i000ii2 = i000ii.parent;
/* 9 */                 i000ii.parent = null;
/* 11 */                I000II i000ii3 = i000ii.right;
                        while (true) {
/* 13 */                    I000II i000ii4 = i000ii2;
/* 14 */                    i000ii2 = i000ii3;
/* 16 */                    if (i000ii2 == null) {
/* 23 */                        this.stackTop = i000ii4;
/* 29 */                        return i000ii;
                            }
/* 18 */                    i000ii2.parent = i000ii4;
/* 20 */                    i000ii3 = i000ii2.left;
                        }
                    }

                    public void reset(I000II i000ii) {
/* 1 */                 I000II i000ii2 = null;
/* 2 */                 while (i000ii != null) {
/* 4 */                     i000ii.parent = i000ii2;
/* 9 */                     i000ii2 = i000ii;
/* 6 */                     i000ii = i000ii.left;
                        }
/* 12 */                this.stackTop = i000ii2;
                    }
                }

                public final class I0000oI00 extends AbstractSet {

                    public class I00000oIO extends I0001Ioi1lo {
                        public I00000oIO() {
/* 5 */                     super();
                        }

                        @Override
                        public Object next() {
/* 5 */                     return nextNode().key;
                        }
                    }

                    public I0000oI00() {
                    }

                    @Override
                    public void clear() {
/* 3 */                 O100I1lloo.this.clear();
                    }

                    @Override
                    public boolean contains(Object obj) {
/* 3 */                 return O100I1lloo.this.containsKey(obj);
                    }

                    @Override
                    public Iterator<Object> iterator() {
/* 3 */                 return new I00000oIO();
                    }

                    @Override
                    public boolean remove(Object obj) {
                        return O100I1lloo.this.removeInternalByKey(obj) != null;
                    }

                    @Override
                    public int size() {
/* 3 */                 return O100I1lloo.this.size;
                    }
                }

                public abstract class I0001Ioi1lo implements Iterator {
                    int expectedModCount;
                    I000II lastReturned = null;
                    I000II next;

                    public I0001Ioi1lo() {
/* 10 */                this.next = O100I1lloo.this.header.next;
/* 17 */                this.expectedModCount = O100I1lloo.this.modCount;
                    }

                    @Override
                    public final boolean hasNext() {
                        return this.next != O100I1lloo.this.header;
                    }

                    public final I000II nextNode() {
/* 1 */                 I000II i000ii = this.next;
/* 3 */                 O100I1lloo o100I1lloo = O100I1lloo.this;
/* 8 */                 if (i000ii == o100I1lloo.header) {
/* 27 */                    IoOOl0iOl1io.I00000oOI();
/* 7 */                     return null;
                        }
/* 14 */                if (o100I1lloo.modCount != this.expectedModCount) {
/* 23 */                    p000.I000II.I001IIilI0O();
/* 7 */                     return null;
                        }
/* 18 */                this.next = i000ii.next;
/* 20 */                this.lastReturned = i000ii;
/* 22 */                return i000ii;
                    }

                    @Override
                    public final void remove() {
/* 1 */                 I000II i000ii = this.lastReturned;
/* 3 */                 if (i000ii == null) {
/* 21 */                    IOOlIIilOl0.I000iOII();
/* 29 */                    return;
                        }
/* 8 */                 O100I1lloo.this.removeInternal(i000ii, true);
/* 12 */                this.lastReturned = null;
/* 18 */                this.expectedModCount = O100I1lloo.this.modCount;
                    }
                }

                public O100I1lloo(Comparator<Object> comparator) {
/* 5 */             this.size = 0;
/* 7 */             this.modCount = 0;
/* 14 */            this.comparator = comparator == null ? NATURAL_ORDER : comparator;
/* 21 */            this.header = new I000II();
/* 25 */            I000II[] i000iiArr = new I000II[16];
/* 27 */            this.table = i000iiArr;
/* 36 */            this.threshold = (i000iiArr.length / 4) + (i000iiArr.length / 2);
                }

                public static <K, V> I000II[] doubleCapacity(I000II[] i000iiArr) {
/* 1 */             int length = i000iiArr.length;
/* 4 */             I000II[] i000iiArr2 = new I000II[length * 2];
/* 8 */             I0000Il00O i0000Il00O = new I0000Il00O();
/* 13 */            I00000oOI i00000oOI = new I00000oOI();
/* 18 */            I00000oOI i00000oOI2 = new I00000oOI();
/* 23 */            for (int i = 0; i < length; i++) {
/* 25 */                I000II i000ii = i000iiArr[i];
/* 27 */                if (i000ii != null) {
/* 30 */                    i0000Il00O.reset(i000ii);
/* 33 */                    int i2 = 0;
/* 34 */                    int i3 = 0;
                            while (true) {
/* 35 */                        I000II next = i0000Il00O.next();
/* 39 */                        if (next == null) {
                                    break;
                                }
/* 44 */                        if ((next.hash & length) == 0) {
/* 46 */                            i2++;
                                } else {
/* 49 */                            i3++;
                                }
                            }
/* 52 */                    i00000oOI.reset(i2);
/* 55 */                    i00000oOI2.reset(i3);
/* 58 */                    i0000Il00O.reset(i000ii);
                            while (true) {
/* 61 */                        I000II next2 = i0000Il00O.next();
/* 65 */                        if (next2 == null) {
                                    break;
                                }
/* 70 */                        if ((next2.hash & length) == 0) {
/* 72 */                            i00000oOI.add(next2);
                                } else {
/* 76 */                            i00000oOI2.add(next2);
                                }
                            }
/* 89 */                    i000iiArr2[i] = i2 > 0 ? i00000oOI.root() : null;
/* 99 */                    i000iiArr2[i + length] = i3 > 0 ? i00000oOI2.root() : null;
                        }
                    }
/* 186 */           return i000iiArr2;
                }

                private boolean equal(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                private void rebalance(I000II i000ii, boolean z) {
/* 1 */             while (i000ii != null) {
/* 3 */                 I000II i000ii2 = i000ii.left;
/* 5 */                 I000II i000ii3 = i000ii.right;
/* 13 */                int i = i000ii2 != null ? i000ii2.height : 0;
/* 19 */                int i2 = i000ii3 != null ? i000ii3.height : 0;
/* 20 */                int i3 = i - i2;
/* 23 */                if (i3 == -2) {
/* 25 */                    I000II i000ii4 = i000ii3.left;
/* 27 */                    I000II i000ii5 = i000ii3.right;
/* 39 */                    int i4 = (i000ii4 != null ? i000ii4.height : 0) - (i000ii5 != null ? i000ii5.height : 0);
/* 41 */                    if (i4 != -1 && (i4 != 0 || z)) {
/* 47 */                        rotateRight(i000ii3);
                            }
/* 50 */                    rotateLeft(i000ii);
/* 53 */                    if (z) {
/* 551 */                       return;
                            }
                        } else if (i3 == 2) {
/* 60 */                    I000II i000ii6 = i000ii2.left;
/* 62 */                    I000II i000ii7 = i000ii2.right;
/* 74 */                    int i5 = (i000ii6 != null ? i000ii6.height : 0) - (i000ii7 != null ? i000ii7.height : 0);
/* 75 */                    if (i5 != 1 && (i5 != 0 || z)) {
/* 81 */                        rotateLeft(i000ii2);
                            }
/* 84 */                    rotateRight(i000ii);
/* 87 */                    if (z) {
/* 551 */                       return;
                            }
                        } else if (i3 == 0) {
/* 94 */                    i000ii.height = i + 1;
/* 96 */                    if (z) {
/* 551 */                       return;
                            }
                        } else {
/* 104 */                   i000ii.height = Math.max(i, i2) + 1;
/* 106 */                   if (!z) {
/* 551 */                       return;
                            }
                        }
/* 109 */               i000ii = i000ii.parent;
                    }
                }

                private void replaceInParent(I000II i000ii, I000II i000ii2) {
/* 1 */             I000II i000ii3 = i000ii.parent;
/* 4 */             i000ii.parent = null;
/* 6 */             if (i000ii2 != null) {
/* 8 */                 i000ii2.parent = i000ii3;
                    }
/* 10 */            if (i000ii3 == null) {
/* 22 */                int i = i000ii.hash;
/* 30 */                this.table[i & (r2.length - 1)] = i000ii2;
                    } else if (i000ii3.left == i000ii) {
/* 16 */                i000ii3.left = i000ii2;
                    } else {
/* 19 */                i000ii3.right = i000ii2;
                    }
                }

                private void rotateLeft(I000II i000ii) {
/* 1 */             I000II i000ii2 = i000ii.left;
/* 3 */             I000II i000ii3 = i000ii.right;
/* 5 */             I000II i000ii4 = i000ii3.left;
/* 7 */             I000II i000ii5 = i000ii3.right;
/* 9 */             i000ii.right = i000ii4;
/* 11 */            if (i000ii4 != null) {
/* 13 */                i000ii4.parent = i000ii;
                    }
/* 15 */            replaceInParent(i000ii, i000ii3);
/* 18 */            i000ii3.left = i000ii;
/* 20 */            i000ii.parent = i000ii3;
/* 39 */            int iMax = Math.max(i000ii2 != null ? i000ii2.height : 0, i000ii4 != null ? i000ii4.height : 0) + 1;
/* 41 */            i000ii.height = iMax;
/* 53 */            i000ii3.height = Math.max(iMax, i000ii5 != null ? i000ii5.height : 0) + 1;
                }

                private void rotateRight(I000II i000ii) {
/* 1 */             I000II i000ii2 = i000ii.left;
/* 3 */             I000II i000ii3 = i000ii.right;
/* 5 */             I000II i000ii4 = i000ii2.left;
/* 7 */             I000II i000ii5 = i000ii2.right;
/* 9 */             i000ii.left = i000ii5;
/* 11 */            if (i000ii5 != null) {
/* 13 */                i000ii5.parent = i000ii;
                    }
/* 15 */            replaceInParent(i000ii, i000ii2);
/* 18 */            i000ii2.right = i000ii;
/* 20 */            i000ii.parent = i000ii2;
/* 39 */            int iMax = Math.max(i000ii3 != null ? i000ii3.height : 0, i000ii5 != null ? i000ii5.height : 0) + 1;
/* 41 */            i000ii.height = iMax;
/* 53 */            i000ii2.height = Math.max(iMax, i000ii4 != null ? i000ii4.height : 0) + 1;
                }

                private static int secondaryHash(int i) {
/* 6 */             int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
/* 12 */            return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
                }

                private Object writeReplace() {
/* 3 */             return new LinkedHashMap(this);
                }

                @Override
                public void clear() {
/* 4 */             Arrays.fill(this.table, (Object) null);
/* 8 */             this.size = 0;
                    this.modCount++;
/* 16 */            I000II i000ii = this.header;
/* 18 */            I000II i000ii2 = i000ii.next;
/* 20 */            while (i000ii2 != i000ii) {
/* 22 */                I000II i000ii3 = i000ii2.next;
/* 24 */                i000ii2.prev = null;
/* 26 */                i000ii2.next = null;
/* 28 */                i000ii2 = i000ii3;
                    }
/* 30 */            i000ii.prev = i000ii;
/* 32 */            i000ii.next = i000ii;
                }

                @Override
                public boolean containsKey(Object obj) {
                    return findByObject(obj) != null;
                }

                @Override
                public Set<Map.Entry<Object, Object>> entrySet() {
/* 1 */             I0000O i0000o = this.entrySet;
/* 3 */             if (i0000o != null) {
/* 5 */                 return i0000o;
                    }
/* 8 */             I0000O i0000o2 = new I0000O();
/* 11 */            this.entrySet = i0000o2;
/* 29 */            return i0000o2;
                }

                public I000II find(Object obj, boolean z) {
                    int iCompareTo;
                    I000II i000ii;
/* 1 */             Comparator<Object> comparator = this.comparator;
/* 3 */             I000II[] i000iiArr = this.table;
/* 9 */             int iSecondaryHash = secondaryHash(obj.hashCode());
/* 16 */            int length = (i000iiArr.length - 1) & iSecondaryHash;
/* 17 */            I000II i000ii2 = i000iiArr[length];
/* 20 */            if (i000ii2 != null) {
/* 30 */                Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) obj : null;
                        while (true) {
/* 31 */                    Object obj2 = i000ii2.key;
/* 40 */                    iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
/* 44 */                    if (iCompareTo == 0) {
/* 46 */                        return i000ii2;
                            }
/* 52 */                    I000II i000ii3 = iCompareTo < 0 ? i000ii2.left : i000ii2.right;
/* 54 */                    if (i000ii3 == null) {
                                break;
                            }
/* 58 */                    i000ii2 = i000ii3;
                        }
                    } else {
/* 60 */                iCompareTo = 0;
                    }
/* 56 */            int i = iCompareTo;
/* 62 */            if (!z) {
/* 19 */                return null;
                    }
/* 65 */            I000II i000ii4 = this.header;
/* 67 */            if (i000ii2 != null) {
/* 111 */               I000II i000ii5 = i000ii2;
/* 116 */               i000ii = new I000II(i000ii5, obj, iSecondaryHash, i000ii4, i000ii4.prev);
/* 119 */               if (i < 0) {
/* 121 */                   i000ii5.left = i000ii;
                        } else {
/* 124 */                   i000ii5.right = i000ii;
                        }
/* 126 */               rebalance(i000ii5, true);
                    } else {
/* 71 */                if (comparator == NATURAL_ORDER && !(obj instanceof Comparable)) {
/* 98 */                    throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
                        }
/* 104 */               i000ii = new I000II(i000ii2, obj, iSecondaryHash, i000ii4, i000ii4.prev);
/* 107 */               i000iiArr[length] = i000ii;
                    }
/* 129 */           int i2 = this.size;
/* 133 */           this.size = i2 + 1;
/* 137 */           if (i2 > this.threshold) {
/* 139 */               doubleCapacity();
                    }
                    this.modCount++;
/* 551 */           return i000ii;
                }

                public I000II findByEntry(Map.Entry<?, ?> entry) {
/* 5 */             I000II i000iiFindByObject = findByObject(entry.getKey());
/* 9 */             if (i000iiFindByObject == null || !equal(i000iiFindByObject.value, entry.getValue())) {
/* 24 */                return null;
                    }
/* 23 */            return i000iiFindByObject;
                }

                public I000II findByObject(Object obj) {
/* 2 */             if (obj != null) {
                        try {
/* 5 */                     return find(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    }
/* 1 */             return null;
                }

                @Override
                public Object get(Object obj) {
/* 1 */             I000II i000iiFindByObject = findByObject(obj);
/* 5 */             if (i000iiFindByObject != null) {
/* 7 */                 return i000iiFindByObject.value;
                    }
/* 10 */            return null;
                }

                @Override
                public Set<Object> keySet() {
/* 1 */             I0000oI00 i0000oI00 = this.keySet;
/* 3 */             if (i0000oI00 != null) {
/* 5 */                 return i0000oI00;
                    }
/* 8 */             I0000oI00 i0000oI002 = new I0000oI00();
/* 11 */            this.keySet = i0000oI002;
/* 29 */            return i0000oI002;
                }

                @Override
                public Object put(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
/* 15 */                IOOlIIilOl0.I000II("key == null");
/* 18 */                return null;
                    }
/* 4 */             I000II i000iiFind = find(obj, true);
/* 8 */             Object obj3 = i000iiFind.value;
/* 10 */            i000iiFind.value = obj2;
/* 12 */            return obj3;
                }

                @Override
                public Object remove(Object obj) {
/* 1 */             I000II i000iiRemoveInternalByKey = removeInternalByKey(obj);
/* 5 */             if (i000iiRemoveInternalByKey != null) {
/* 7 */                 return i000iiRemoveInternalByKey.value;
                    }
/* 10 */            return null;
                }

                public void removeInternal(I000II i000ii, boolean z) {
                    int i;
/* 2 */             if (z) {
/* 4 */                 I000II i000ii2 = i000ii.prev;
/* 8 */                 i000ii2.next = i000ii.next;
/* 12 */                i000ii.next.prev = i000ii2;
/* 14 */                i000ii.prev = null;
/* 16 */                i000ii.next = null;
                    }
/* 18 */            I000II i000ii3 = i000ii.left;
/* 20 */            I000II i000ii4 = i000ii.right;
/* 22 */            I000II i000ii5 = i000ii.parent;
/* 24 */            int i2 = 0;
/* 25 */            if (i000ii3 == null || i000ii4 == null) {
/* 85 */                if (i000ii3 != null) {
/* 87 */                    replaceInParent(i000ii, i000ii3);
/* 90 */                    i000ii.left = null;
                        } else if (i000ii4 != null) {
/* 95 */                    replaceInParent(i000ii, i000ii4);
/* 98 */                    i000ii.right = null;
                        } else {
/* 101 */                   replaceInParent(i000ii, null);
                        }
/* 104 */               rebalance(i000ii5, false);
                        this.size--;
                        this.modCount++;
/* 551 */               return;
                    }
/* 40 */            I000II i000iiLast = i000ii3.height > i000ii4.height ? i000ii3.last() : i000ii4.first();
/* 44 */            removeInternal(i000iiLast, false);
/* 47 */            I000II i000ii6 = i000ii.left;
/* 49 */            if (i000ii6 != null) {
/* 51 */                i = i000ii6.height;
/* 53 */                i000iiLast.left = i000ii6;
/* 55 */                i000ii6.parent = i000iiLast;
/* 57 */                i000ii.left = null;
                    } else {
/* 60 */                i = 0;
                    }
/* 61 */            I000II i000ii7 = i000ii.right;
/* 63 */            if (i000ii7 != null) {
/* 65 */                i2 = i000ii7.height;
/* 67 */                i000iiLast.right = i000ii7;
/* 69 */                i000ii7.parent = i000iiLast;
/* 71 */                i000ii.right = null;
                    }
/* 79 */            i000iiLast.height = Math.max(i, i2) + 1;
/* 81 */            replaceInParent(i000ii, i000iiLast);
                }

                public I000II removeInternalByKey(Object obj) {
/* 1 */             I000II i000iiFindByObject = findByObject(obj);
/* 5 */             if (i000iiFindByObject != null) {
/* 8 */                 removeInternal(i000iiFindByObject, true);
                    }
/* 49 */            return i000iiFindByObject;
                }

                @Override
                public int size() {
/* 1 */             return this.size;
                }

/* 3 */         public final class I0000O extends AbstractSet {
                    public I0000O() {
                    }

                    @Override
                    public void clear() {
/* 3 */                 O100I1lloo.this.clear();
                    }

                    @Override
                    public boolean contains(Object obj) {
                        return (obj instanceof Map.Entry) && O100I1lloo.this.findByEntry((Map.Entry) obj) != null;
                    }

                    @Override
                    public Iterator<Map.Entry<Object, Object>> iterator() {
/* 3 */                 return new I00000oIO();
                    }

                    @Override
                    public boolean remove(Object obj) {
                        I000II i000iiFindByEntry;
/* 4 */                 if (!(obj instanceof Map.Entry) || (i000iiFindByEntry = O100I1lloo.this.findByEntry((Map.Entry) obj)) == null) {
/* 3 */                     return false;
                        }
/* 21 */                O100I1lloo.this.removeInternal(i000iiFindByEntry, true);
/* 20 */                return true;
                    }

                    @Override
                    public int size() {
/* 3 */                 return O100I1lloo.this.size;
                    }

/* 4 */             public class I00000oIO extends I0001Ioi1lo {
                        public I00000oIO() {
/* 5 */                     super();
                        }

                        @Override
/* 5 */                 public Map.Entry<Object, Object> next() {
/* 6 */                     return nextNode();
                        }
                    }
                }

/* 8 */         public class I00000oIO implements Comparator {
                    @Override
/* 9 */             public int compare(Comparable comparable, Comparable comparable2) {
/* 10 */                return comparable.compareTo(comparable2);
                    }
                }

/* 20 */        public static final class I000II implements Map.Entry {
                    final int hash;
                    int height;
                    final Object key;
                    I000II left;
                    I000II next;
                    I000II parent;
                    I000II prev;
                    I000II right;
                    Object value;

                    public I000II(I000II i000ii, Object obj, int i, I000II i000ii2, I000II i000ii3) {
/* 4 */                 this.parent = i000ii;
/* 6 */                 this.key = obj;
/* 8 */                 this.hash = i;
/* 11 */                this.height = 1;
/* 13 */                this.next = i000ii2;
/* 15 */                this.prev = i000ii3;
/* 17 */                i000ii3.next = this;
/* 19 */                i000ii2.prev = this;
                    }

                    @Override
                    public boolean equals(Object obj) {
/* 4 */                 if (obj instanceof Map.Entry) {
/* 6 */                     Map.Entry entry = (Map.Entry) obj;
/* 8 */                     Object obj2 = this.key;
/* 10 */                    if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
/* 29 */                        Object obj3 = this.value;
/* 31 */                        if (obj3 == null) {
/* 37 */                            if (entry.getValue() == null) {
/* 50 */                                return true;
                                    }
                                } else if (obj3.equals(entry.getValue())) {
/* 50 */                            return true;
                                }
                            }
                        }
/* 3 */                 return false;
                    }

                    public I000II first() {
/* 1 */                 I000II i000ii = this.left;
                        while (true) {
/* 3 */                     I000II i000ii2 = i000ii;
/* 4 */                     I000II i000ii3 = this;
/* 5 */                     this = i000ii2;
/* 6 */                     if (this == null) {
/* 29 */                        return i000ii3;
                            }
/* 8 */                     i000ii = this.left;
                        }
                    }

                    @Override
                    public Object getKey() {
/* 1 */                 return this.key;
                    }

                    @Override
                    public Object getValue() {
/* 1 */                 return this.value;
                    }

                    @Override
                    public int hashCode() {
/* 1 */                 Object obj = this.key;
/* 8 */                 int iHashCode = obj == null ? 0 : obj.hashCode();
/* 12 */                Object obj2 = this.value;
/* 21 */                return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                    }

                    public I000II last() {
/* 1 */                 I000II i000ii = this.right;
                        while (true) {
/* 3 */                     I000II i000ii2 = i000ii;
/* 4 */                     I000II i000ii3 = this;
/* 5 */                     this = i000ii2;
/* 6 */                     if (this == null) {
/* 29 */                        return i000ii3;
                            }
/* 8 */                     i000ii = this.right;
                        }
                    }

                    @Override
                    public Object setValue(Object obj) {
/* 1 */                 Object obj2 = this.value;
/* 3 */                 this.value = obj;
/* 49 */                return obj2;
                    }

                    public String toString() {
/* 21 */                return this.key + "=" + this.value;
                    }

/* 21 */            public I000II() {
/* 23 */                this.key = null;
/* 24 */                this.hash = -1;
/* 25 */                this.prev = this;
                        this.next = this;
                    }
                }

/* 38 */        public O100I1lloo() {
/* 39 */            this(null);
                }

/* 104 */       private void doubleCapacity() {
/* 105 */           I000II[] i000iiArrDoubleCapacity = doubleCapacity(this.table);
                    this.table = i000iiArrDoubleCapacity;
                    this.threshold = (i000iiArrDoubleCapacity.length / 4) + (i000iiArrDoubleCapacity.length / 2);
                }
            }

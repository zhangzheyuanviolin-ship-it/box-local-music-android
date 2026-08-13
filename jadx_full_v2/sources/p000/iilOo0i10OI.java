            package p000;

            import java.io.Serializable;
            import java.util.AbstractList;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            
            public final class iilOo0i10OI extends AbstractList implements RandomAccess, Serializable {
                public final int[] I00iOIl;
                public final int I00iiI;
                public final int I00iiO;

                public iilOo0i10OI(int i, int i2, int[] iArr) {
/* 4 */             this.I00iOIl = iArr;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = i2;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof Integer)) {
/* 33 */                return false;
                    }
/* 7 */             int iIntValue = ((Integer) obj).intValue();
/* 11 */            int i = this.I00iiI;
                    while (true) {
/* 16 */                if (i >= this.I00iiO) {
/* 28 */                    i = -1;
                            break;
                        }
/* 22 */                if (this.I00iOIl[i] == iIntValue) {
                            break;
                        }
/* 25 */                i++;
                    }
                    return i != -1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof iilOo0i10OI)) {
/* 47 */                return super.equals(obj);
                    }
/* 8 */             iilOo0i10OI iiloo0i10oi = (iilOo0i10OI) obj;
/* 10 */            int i = iiloo0i10oi.I00iiI;
/* 14 */            int i2 = iiloo0i10oi.I00iiO - i;
/* 15 */            int i3 = this.I00iiO;
/* 17 */            int i4 = this.I00iiI;
/* 19 */            int i5 = i3 - i4;
/* 21 */            if (i2 == i5) {
/* 24 */                for (int i6 = 0; i6 < i5; i6++) {
/* 38 */                    if (this.I00iOIl[i4 + i6] == iiloo0i10oi.I00iOIl[i + i6]) {
                            }
                        }
/* 44 */                return true;
                    }
/* 20 */            return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             int i3 = this.I00iiI;
/* 6 */             ll0o0Io00O10.I00000oIO(i, i2 - i3);
/* 14 */            return Integer.valueOf(this.I00iOIl[i3 + i]);
                }

                @Override
                public final int hashCode() {
/* 3 */             int i = 1;
/* 6 */             for (int i2 = this.I00iiI; i2 < this.I00iiO; i2++) {
/* 14 */                i = (i * 31) + this.I00iOIl[i2];
                    }
/* 20 */            return i;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (obj instanceof Integer) {
/* 8 */                 int iIntValue = ((Integer) obj).intValue();
/* 12 */                int i = this.I00iiI;
/* 14 */                int i2 = i;
                        while (true) {
/* 17 */                    if (i2 >= this.I00iiO) {
/* 29 */                        i2 = -1;
                                break;
                            }
/* 23 */                    if (this.I00iOIl[i2] == iIntValue) {
                                break;
                            }
/* 26 */                    i2++;
                        }
/* 30 */                if (i2 >= 0) {
/* 32 */                    return i2 - i;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             return false;
                }

                @Override
                public final int lastIndexOf(Object obj) {
                    int i;
/* 4 */             if (obj instanceof Integer) {
/* 8 */                 int iIntValue = ((Integer) obj).intValue();
                        int i2 = this.I00iiO - 1;
                        while (true) {
/* 15 */                    i = this.I00iiI;
/* 17 */                    if (i2 < i) {
/* 29 */                        i2 = -1;
                                break;
                            }
/* 23 */                    if (this.I00iOIl[i2] == iIntValue) {
                                break;
                            }
                            i2--;
                        }
/* 30 */                if (i2 >= 0) {
/* 32 */                    return i2 - i;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             int i3 = this.I00iiI;
/* 6 */             Integer num = (Integer) obj;
/* 8 */             ll0o0Io00O10.I00000oIO(i, i2 - i3);
/* 11 */            int i4 = i3 + i;
/* 12 */            int[] iArr = this.I00iOIl;
/* 14 */            int i5 = iArr[i4];
/* 16 */            num.getClass();
/* 23 */            iArr[i4] = num.intValue();
/* 25 */            return Integer.valueOf(i5);
                }

                @Override
                public final int size() {
/* 5 */             return this.I00iiO - this.I00iiI;
                }

                @Override
                public final List subList(int i, int i2) {
/* 1 */             int i3 = this.I00iiO;
/* 3 */             int i4 = this.I00iiI;
/* 6 */             ll0o0Io00O10.I0000Il00O(i, i2, i3 - i4);
/* 9 */             if (i == i2) {
/* 11 */                return Collections.EMPTY_LIST;
                    }
/* 20 */            return new iilOo0i10OI(i4 + i, i2 + i4, this.I00iOIl);
                }

                @Override
                public final String toString() {
/* 1 */             int i = this.I00iiO;
/* 3 */             int i2 = this.I00iiI;
/* 11 */            StringBuilder sb = new StringBuilder((i - i2) * 5);
/* 16 */            sb.append('[');
/* 19 */            int[] iArr = this.I00iOIl;
/* 23 */            sb.append(iArr[i2]);
                    while (true) {
/* 26 */                i2++;
/* 28 */                if (i2 >= i) {
/* 43 */                    sb.append(']');
/* 46 */                    return sb.toString();
                        }
/* 32 */                sb.append(", ");
/* 37 */                sb.append(iArr[i2]);
                    }
                }
            }

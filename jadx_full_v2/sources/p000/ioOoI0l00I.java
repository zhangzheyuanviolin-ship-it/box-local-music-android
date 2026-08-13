            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            public abstract class ioOoI0l00I extends i0IIio0oIoio implements Set {
                public transient ioIl00 I00lll10;

                public static int I001i1O0Ol(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 9 */             if (iMax < 751619276) {
/* 12 */                int iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 26 */                while (iI0000Il00O * 0.7d < iMax) {
/* 28 */                    iI0000Il00O += iI0000Il00O;
                        }
/* 30 */                return iI0000Il00O;
                    }
/* 33 */            if (iMax < 1073741824) {
/* 31 */                return 1073741824;
                    }
/* 38 */            I000II.I000iOII("collection too large");
/* 41 */            return 0;
                }

                public static ioOoI0l00I I001iOo1i0O(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 129 */               return l00IiiIO0o1O.I00oO101o;
                    }
/* 5 */             if (i == 1) {
/* 118 */               Object obj = objArr[0];
/* 120 */               Objects.requireNonNull(obj);
/* 125 */               return new l00lI0l0lO(obj);
                    }
/* 7 */             int iI001i1O0Ol = I001i1O0Ol(i);
/* 11 */            Object[] objArr2 = new Object[iI001i1O0Ol];
                    int i2 = iI001i1O0Ol - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 19 */            for (int i5 = 0; i5 < i; i5++) {
/* 21 */                Object obj2 = objArr[i5];
/* 23 */                if (obj2 == null) {
/* 66 */                    IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i5, "at index "));
/* 18 */                    return null;
                        }
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iI00000oIO = lioi0il.I00000oIO(iHashCode);
                        while (true) {
/* 33 */                    int i6 = iI00000oIO & i2;
/* 35 */                    Object obj3 = objArr2[i6];
/* 37 */                    if (obj3 == null) {
/* 41 */                        objArr[i4] = obj2;
/* 43 */                        objArr2[i6] = obj2;
/* 45 */                        i3 += iHashCode;
/* 39 */                        i4++;
                                break;
                            }
/* 52 */                    if (!obj3.equals(obj2)) {
/* 54 */                        iI00000oIO++;
                            }
                        }
                    }
/* 70 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 73 */            if (i4 == 1) {
/* 75 */                Object obj4 = objArr[0];
/* 77 */                Objects.requireNonNull(obj4);
/* 82 */                return new l00lI0l0lO(obj4);
                    }
/* 92 */            if (I001i1O0Ol(i4) < iI001i1O0Ol / 2) {
/* 94 */                return I001iOo1i0O(i4, objArr);
                    }
/* 99 */            int length = objArr.length;
/* 105 */           if (i4 < (length >> 1) + (length >> 2)) {
/* 107 */               objArr = Arrays.copyOf(objArr, i4);
                    }
/* 114 */           return new l00IiiIO0o1O(objArr, i3, objArr2, i2, i4);
                }

                @Override
                public boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 56 */                return true;
                    }
/* 6 */             if ((obj instanceof ioOoI0l00I) && (this instanceof l00IiiIO0o1O) && (((ioOoI0l00I) obj) instanceof l00IiiIO0o1O) && ((l00IiiIO0o1O) this).I00o0l1o1o0 != obj.hashCode()) {
/* 58 */                return false;
                    }
/* 30 */            if (obj == this) {
/* 56 */                return true;
                    }
/* 35 */            if (!(obj instanceof Set)) {
/* 58 */                return false;
                    }
/* 37 */            Set set = (Set) obj;
                    try {
/* 47 */                if (size() == set.size()) {
                            return containsAll(set);
                        }
/* 58 */                return false;
                    } catch (ClassCastException | NullPointerException unused) {
/* 58 */                return false;
                    }
                }

                @Override
                public int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 55 */            return iHashCode;
                }
            }

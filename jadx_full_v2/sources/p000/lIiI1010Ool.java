            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            public abstract class lIiI1010Ool extends i0IIio0oIoio implements Set {
                public static final int I00o0iI0io1 = 0;
                public transient lIOiOOl I00lll10;

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

                public static lIiI1010Ool I001iOo1i0O(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 143 */               return lIll1lOoI1.I00oOio10iI1;
                    }
/* 5 */             if (i == 1) {
/* 132 */               Object obj = objArr[0];
/* 134 */               Objects.requireNonNull(obj);
/* 139 */               return new lIlo101(obj);
                    }
/* 7 */             int iI001i1O0Ol = I001i1O0Ol(i);
/* 11 */            Object[] objArr2 = new Object[iI001i1O0Ol];
                    int i2 = iI001i1O0Ol - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 19 */            for (int i5 = 0; i5 < i; i5++) {
/* 21 */                Object obj2 = objArr[i5];
/* 23 */                if (obj2 == null) {
/* 80 */                    IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i5, "at index "));
/* 18 */                    return null;
                        }
/* 25 */                int iHashCode = obj2.hashCode();
/* 46 */                int iRotateLeft = (int) (Integer.rotateLeft((int) (iHashCode * (-862048943)), 15) * 461845907);
                        while (true) {
/* 47 */                    int i6 = iRotateLeft & i2;
/* 49 */                    Object obj3 = objArr2[i6];
/* 51 */                    if (obj3 == null) {
/* 55 */                        objArr[i4] = obj2;
/* 57 */                        objArr2[i6] = obj2;
/* 59 */                        i3 += iHashCode;
/* 53 */                        i4++;
                                break;
                            }
/* 66 */                    if (!obj3.equals(obj2)) {
/* 68 */                        iRotateLeft++;
                            }
                        }
                    }
/* 84 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 87 */            if (i4 == 1) {
/* 89 */                Object obj4 = objArr[0];
/* 91 */                Objects.requireNonNull(obj4);
/* 96 */                return new lIlo101(obj4);
                    }
/* 106 */           if (I001i1O0Ol(i4) < iI001i1O0Ol / 2) {
/* 108 */               return I001iOo1i0O(i4, objArr);
                    }
/* 113 */           int length = objArr.length;
/* 119 */           if (i4 < (length >> 1) + (length >> 2)) {
/* 121 */               objArr = Arrays.copyOf(objArr, i4);
                    }
/* 128 */           return new lIll1lOoI1(objArr, i3, objArr2, i2, i4);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 56 */                return true;
                    }
/* 6 */             if ((obj instanceof lIiI1010Ool) && (this instanceof lIll1lOoI1) && (((lIiI1010Ool) obj) instanceof lIll1lOoI1) && ((lIll1lOoI1) this).I00o101lO != obj.hashCode()) {
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

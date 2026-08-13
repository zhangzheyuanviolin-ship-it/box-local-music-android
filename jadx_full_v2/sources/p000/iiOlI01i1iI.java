            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            public abstract class iiOlI01i1iI extends i0IIio0oIoio implements Set {
                public transient iiIooIlooool I00lll10;

                public static int I001iOo1i0O(int i) {
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

                public static iiOlI01i1iI I001lloI(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 144 */               return iilIooO.I00oO101o;
                    }
/* 5 */             if (i == 1) {
/* 133 */               Object obj = objArr[0];
/* 135 */               Objects.requireNonNull(obj);
/* 140 */               return new iilOoii(obj);
                    }
/* 7 */             int iI001iOo1i0O = I001iOo1i0O(i);
/* 11 */            Object[] objArr2 = new Object[iI001iOo1i0O];
                    int i2 = iI001iOo1i0O - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 19 */            for (int i5 = 0; i5 < i; i5++) {
/* 21 */                Object obj2 = objArr[i5];
/* 23 */                if (obj2 == null) {
/* 81 */                    IOOlIIilOl0.I000II(Oi010OO0.I00100l0(i5, "at index ", new StringBuilder(String.valueOf(i5).length() + 9)));
/* 18 */                    return null;
                        }
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iI00000oIO = lilOIIIlIO.I00000oIO(iHashCode);
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
/* 85 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 88 */            if (i4 == 1) {
/* 90 */                Object obj4 = objArr[0];
/* 92 */                Objects.requireNonNull(obj4);
/* 97 */                return new iilOoii(obj4);
                    }
/* 107 */           if (I001iOo1i0O(i4) < iI001iOo1i0O / 2) {
/* 109 */               return I001lloI(i4, objArr);
                    }
/* 114 */           int length = objArr.length;
/* 120 */           if (i4 < (length >> 1) + (length >> 2)) {
/* 122 */               objArr = Arrays.copyOf(objArr, i4);
                    }
/* 129 */           return new iilIooO(objArr, i3, objArr2, i2, i4);
                }

                public abstract OoiOOoOlo I001i1O0Ol();

                public final iiIooIlooool I001lIiIIo1O() {
/* 1 */             iiIooIlooool iiiooilooool = this.I00lll10;
/* 3 */             if (iiiooilooool != null) {
/* 20 */                return iiiooilooool;
                    }
/* 5 */             iiIooIlooool iiiooiloooolI001lllioOl = I001lllioOl();
/* 9 */             this.I00lll10 = iiiooiloooolI001lllioOl;
/* 20 */            return iiiooiloooolI001lllioOl;
                }

                public iiIooIlooool I001lllioOl() {
/* 3 */             Object[] array = toArray(i0IIio0oIoio.I00li1OI);
/* 7 */             iiIi1O0 iiii1o0 = iiIooIlooool.I00lll10;
/* 9 */             int length = array.length;
                    return length == 0 ? iii11O110.I00o101lO : new iii11O110(array, length);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 56 */                return true;
                    }
/* 6 */             if ((obj instanceof iiOlI01i1iI) && (this instanceof iilIooO) && (((iiOlI01i1iI) obj) instanceof iilIooO) && ((iilIooO) this).I00o0l1o1o0 != obj.hashCode()) {
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

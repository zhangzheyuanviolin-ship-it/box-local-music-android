            package p000;

            import java.util.Arrays;
            import java.util.Objects;
            import java.util.Set;
            
            public abstract class Ioio0O extends IoilO0iiOo1 implements Set {
                public static final int I00iiO = 0;
                public transient IoillO0OOoo I00iiI;

                public static int I000lI(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 10 */            if (iMax < 751619276) {
/* 18 */                int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
/* 29 */                while (iHighestOneBit * 0.7d < iMax) {
/* 31 */                    iHighestOneBit <<= 1;
                        }
/* 34 */                return iHighestOneBit;
                    }
/* 41 */            if (iMax < 1073741824) {
/* 35 */                return 1073741824;
                    }
/* 46 */            I000II.I000iOII("collection too large");
/* 49 */            return 0;
                }

                public static Ioio0O I000o00OoI0I(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 129 */               return OOoliIo1ol.I00l0OO0IO;
                    }
/* 5 */             if (i == 1) {
/* 118 */               Object obj = objArr[0];
/* 120 */               Objects.requireNonNull(obj);
/* 125 */               return new Ol0i0ill1l(obj);
                    }
/* 7 */             int iI000lI = I000lI(i);
/* 11 */            Object[] objArr2 = new Object[iI000lI];
                    int i2 = iI000lI - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 19 */            for (int i5 = 0; i5 < i; i5++) {
/* 21 */                Object obj2 = objArr[i5];
/* 23 */                if (obj2 == null) {
/* 66 */                    IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i5, "at index "));
/* 18 */                    return null;
                        }
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iI00000oIO = illii0liI.I00000oIO(iHashCode);
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
/* 52 */                    if (obj3.equals(obj2)) {
                                break;
                            }
/* 57 */                    iI00000oIO++;
                        }
                    }
/* 70 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 73 */            if (i4 == 1) {
/* 75 */                Object obj4 = objArr[0];
/* 77 */                Objects.requireNonNull(obj4);
/* 82 */                return new Ol0i0ill1l(obj4);
                    }
/* 92 */            if (I000lI(i4) < iI000lI / 2) {
/* 94 */                return I000o00OoI0I(i4, objArr);
                    }
/* 99 */            int length = objArr.length;
/* 105 */           if (i4 < (length >> 1) + (length >> 2)) {
/* 107 */               objArr = Arrays.copyOf(objArr, i4);
                    }
/* 114 */           return new OOoliIo1ol(objArr, i3, objArr2, i2, i4);
                }

                public static Ioio0O I00100o1O0lo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
/* 12 */            if (!(objArr.length <= 2147483641)) {
/* 46 */                I000II.I000iOII("the total number of elements must fit in an int");
/* 49 */                return null;
                    }
/* 16 */            int length = objArr.length + 6;
/* 17 */            Object[] objArr2 = new Object[length];
/* 19 */            objArr2[0] = obj;
/* 21 */            objArr2[1] = obj2;
/* 24 */            objArr2[2] = obj3;
/* 27 */            objArr2[3] = obj4;
/* 30 */            objArr2[4] = obj5;
/* 33 */            objArr2[5] = obj6;
/* 36 */            System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
/* 39 */            return I000o00OoI0I(length, objArr2);
                }

                @Override
                public IoillO0OOoo I00000oOI() {
/* 1 */             IoillO0OOoo ioillO0OOoo = this.I00iiI;
/* 3 */             if (ioillO0OOoo != null) {
/* 20 */                return ioillO0OOoo;
                    }
/* 5 */             IoillO0OOoo ioillO0OOooI000oI1ioi = I000oI1ioi();
/* 9 */             this.I00iiI = ioillO0OOooI000oI1ioi;
/* 20 */            return ioillO0OOooI000oI1ioi;
                }

                public IoillO0OOoo I000oI1ioi() {
/* 3 */             Object[] array = toArray(IoilO0iiOo1.I00iOIl);
/* 7 */             IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 10 */            return IoillO0OOoo.I000lI(array.length, array);
                }

                @Override
                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if ((obj instanceof Ioio0O) && (this instanceof OOoliIo1ol) && (((Ioio0O) obj) instanceof OOoliIo1ol) && hashCode() != obj.hashCode()) {
/* 7 */                 return false;
                    }
/* 32 */            if (this != obj) {
/* 37 */                if (obj instanceof Set) {
/* 39 */                    Set set = (Set) obj;
                            try {
/* 49 */                        if (size() == set.size()) {
/* 55 */                            if (containsAll(set)) {
                                    }
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                @Override
                public int hashCode() {
/* 1 */             return lOI00O.I00000oIO(this);
                }
            }

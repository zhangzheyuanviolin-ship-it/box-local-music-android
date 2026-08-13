            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            public abstract class lOO110IoOiI extends lO1OoOllIo0 implements Set {
                public transient lOI1lll1l10 I00iiI;

                public static int I000lI(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 9 */             if (iMax >= 751619276) {
/* 40 */                ll0OlOllOl.I00000oIO("collection too large", iMax < 1073741824);
/* 31 */                return 1073741824;
                    }
/* 12 */            int iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 26 */            while (iI0000Il00O * 0.7d < iMax) {
/* 28 */                iI0000Il00O += iI0000Il00O;
                    }
/* 30 */            return iI0000Il00O;
                }

                public static lOO110IoOiI I000oI1ioi(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 120 */               return lOllil.I00l0I0l0lO1;
                    }
/* 5 */             if (i == 1) {
/* 109 */               Object obj = objArr[0];
/* 111 */               Objects.requireNonNull(obj);
/* 116 */               return new lOo10Oi(obj);
                    }
/* 7 */             int iI000lI = I000lI(i);
/* 11 */            Object[] objArr2 = new Object[iI000lI];
                    int i2 = iI000lI - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 18 */            for (int i5 = 0; i5 < i; i5++) {
/* 20 */                Object obj2 = objArr[i5];
/* 22 */                ll0lIii.I00000oOI(i5, obj2);
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iI00000oIO = ll0l01liOO1.I00000oIO(iHashCode);
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
/* 61 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 64 */            if (i4 == 1) {
/* 66 */                Object obj4 = objArr[0];
/* 68 */                Objects.requireNonNull(obj4);
/* 73 */                return new lOo10Oi(obj4);
                    }
/* 83 */            if (I000lI(i4) < iI000lI / 2) {
/* 85 */                return I000oI1ioi(i4, objArr);
                    }
/* 90 */            int length = objArr.length;
/* 96 */            if (i4 < (length >> 1) + (length >> 2)) {
/* 98 */                objArr = Arrays.copyOf(objArr, i4);
                    }
/* 105 */           return new lOllil(objArr, i3, objArr2, i2, i4);
                }

                @Override
                public lOI1lll1l10 I0001Ioi1lo() {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iiI;
/* 3 */             if (loi1lll1l10 != null) {
/* 20 */                return loi1lll1l10;
                    }
/* 5 */             lOI1lll1l10 loi1lll1l10I000o00OoI0I = I000o00OoI0I();
/* 9 */             this.I00iiI = loi1lll1l10I000o00OoI0I;
/* 20 */            return loi1lll1l10I000o00OoI0I;
                }

                public abstract OoiOOoOlo I000iOII();

                public lOI1lll1l10 I000o00OoI0I() {
/* 3 */             Object[] array = toArray(lO1OoOllIo0.I00iOIl);
/* 7 */             lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 10 */            return lOI1lll1l10.I000oI1ioi(array.length, array);
                }

                @Override
                public boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 56 */                return true;
                    }
/* 6 */             if ((obj instanceof lOO110IoOiI) && (this instanceof lOllil) && (((lOO110IoOiI) obj) instanceof lOllil) && ((lOllil) this).I00iio != obj.hashCode()) {
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

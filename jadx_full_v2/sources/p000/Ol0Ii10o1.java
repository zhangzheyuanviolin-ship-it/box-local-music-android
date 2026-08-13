            package p000;

            import java.util.Arrays;
            import java.util.Map;
            
/* 22 */    public class Ol0Ii10o1 {
                public int[] I00iOIl;
                public Object[] I00iiI;
                public int I00iiO;

                public Ol0Ii10o1(int i) {
/* 11 */            this.I00iOIl = i == 0 ? iIIl1I0OIlO0.I00000oIO : new int[i];
/* 22 */            this.I00iiI = i == 0 ? iIIl1I0OIlO0.I0000Il00O : new Object[i << 1];
                }

                public final int I00000oIO(Object obj) {
/* 3 */             int i = this.I00iiO * 2;
/* 5 */             Object[] objArr = this.I00iiI;
/* 8 */             if (obj == null) {
/* 11 */                for (int i2 = 1; i2 < i; i2 += 2) {
/* 15 */                    if (objArr[i2] == null) {
/* 17 */                        return i2 >> 1;
                            }
                        }
/* 40 */                return -1;
                    }
/* 24 */            for (int i3 = 1; i3 < i; i3 += 2) {
/* 32 */                if (obj.equals(objArr[i3])) {
/* 34 */                    return i3 >> 1;
                        }
                    }
/* 40 */            return -1;
                }

                public final int I00000oOI(int i, Object obj) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             if (i2 == 0) {
/* 5 */                 return -1;
                    }
/* 9 */             int iI00000oIO = iIIl1I0OIlO0.I00000oIO(i2, i, this.I00iOIl);
/* 13 */            if (iI00000oIO < 0 || O0000Ioio00.I0000O(obj, this.I00iiI[iI00000oIO << 1])) {
/* 28 */                return iI00000oIO;
                    }
/* 29 */            int i3 = iI00000oIO + 1;
/* 31 */            while (i3 < i2 && this.I00iOIl[i3] == i) {
/* 49 */                if (O0000Ioio00.I0000O(obj, this.I00iiI[i3 << 1])) {
/* 51 */                    return i3;
                        }
/* 52 */                i3++;
                    }
/* 57 */            for (int i4 = iI00000oIO - 1; i4 >= 0 && this.I00iOIl[i4] == i; i4--) {
/* 75 */                if (O0000Ioio00.I0000O(obj, this.I00iiI[i4 << 1])) {
/* 77 */                    return i4;
                        }
                    }
/* 81 */            return ~i3;
                }

                public final int I0000Il00O(Object obj) {
                    return obj == null ? I0000O() : I00000oOI(obj.hashCode(), obj);
                }

                public final int I0000O() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i == 0) {
/* 5 */                 return -1;
                    }
/* 10 */            int iI00000oIO = iIIl1I0OIlO0.I00000oIO(i, 0, this.I00iOIl);
/* 14 */            if (iI00000oIO < 0 || this.I00iiI[iI00000oIO << 1] == null) {
/* 25 */                return iI00000oIO;
                    }
/* 26 */            int i2 = iI00000oIO + 1;
/* 28 */            while (i2 < i && this.I00iOIl[i2] == 0) {
/* 42 */                if (this.I00iiI[i2 << 1] == null) {
/* 44 */                    return i2;
                        }
/* 45 */                i2++;
                    }
/* 50 */            for (int i3 = iI00000oIO - 1; i3 >= 0 && this.I00iOIl[i3] == 0; i3--) {
/* 64 */                if (this.I00iiI[i3 << 1] == null) {
/* 66 */                    return i3;
                        }
                    }
/* 70 */            return ~i2;
                }

                public final Object I000II(int i) {
/* 1 */             if (i >= 0 && i < this.I00iiO) {
/* 11 */                return this.I00iiI[i << 1];
                    }
/* 28 */            lO00l0o.I00000oIO("Expected index to be within 0..size()-1, but was " + i);
/* 77 */            throw null;
                }

                public final Object I000O01llI0(int i) {
                    int i2;
/* 2 */             if (i < 0 || i >= (i2 = this.I00iiO)) {
/* 147 */               lO00l0o.I00000oIO("Expected index to be within 0..size()-1, but was " + i);
/* 168 */               throw null;
                    }
/* 8 */             Object[] objArr = this.I00iiI;
/* 10 */            int i3 = i << 1;
/* 14 */            Object obj = objArr[i3 + 1];
/* 17 */            if (i2 <= 1) {
/* 19 */                clear();
/* 22 */                return obj;
                    }
                    int i4 = i2 - 1;
/* 25 */            int[] iArr = this.I00iOIl;
/* 30 */            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
/* 98 */                if (i < i4) {
/* 100 */                   int i5 = i + 1;
/* 102 */                   I1IoiO1l.I000O01llI0(i, i5, i2, iArr, iArr);
/* 105 */                   Object[] objArr2 = this.I00iiI;
/* 110 */                   I1IoiO1l.I000iOII(objArr2, i3, objArr2, i5 << 1, i2 << 1);
                        }
/* 113 */               Object[] objArr3 = this.I00iiI;
/* 115 */               int i6 = i4 << 1;
/* 117 */               objArr3[i6] = null;
/* 120 */               objArr3[i6 + 1] = null;
                    } else {
/* 41 */                int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
/* 47 */                this.I00iOIl = Arrays.copyOf(iArr, i7);
/* 56 */                this.I00iiI = Arrays.copyOf(this.I00iiI, i7 << 1);
/* 60 */                if (i2 != this.I00iiO) {
/* 94 */                    I000II.I001IIilI0O();
/* 1 */                     return null;
                        }
/* 62 */                if (i > 0) {
/* 67 */                    I1IoiO1l.I000O01llI0(0, 0, i, iArr, this.I00iOIl);
/* 72 */                    I1IoiO1l.I000iOII(objArr, 0, this.I00iiI, 0, i3);
                        }
/* 75 */                if (i < i4) {
/* 79 */                    int i8 = i + 1;
/* 81 */                    I1IoiO1l.I000O01llI0(i, i8, i2, iArr, this.I00iOIl);
/* 90 */                    I1IoiO1l.I000iOII(objArr, i3, this.I00iiI, i8 << 1, i2 << 1);
                        }
                    }
/* 124 */           if (i2 == this.I00iiO) {
/* 126 */               this.I00iiO = i4;
/* 128 */               return obj;
                    }
/* 129 */           I000II.I001IIilI0O();
/* 1 */             return null;
                }

                public final Object I000OOo1O(int i, Object obj) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 32 */                lO00l0o.I00000oIO("Expected index to be within 0..size()-1, but was " + i);
/* 37 */                throw null;
                    }
/* 9 */             int i2 = (i << 1) + 1;
/* 11 */            Object[] objArr = this.I00iiI;
/* 13 */            Object obj2 = objArr[i2];
/* 15 */            objArr[i2] = obj;
/* 17 */            return obj2;
                }

                public final Object I000OiO(int i) {
/* 1 */             if (i >= 0 && i < this.I00iiO) {
/* 13 */                return this.I00iiI[(i << 1) + 1];
                    }
/* 30 */            lO00l0o.I00000oIO("Expected index to be within 0..size()-1, but was " + i);
/* 77 */            throw null;
                }

                public final void clear() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i > 0) {
/* 7 */                 this.I00iOIl = iIIl1I0OIlO0.I00000oIO;
/* 11 */                this.I00iiI = iIIl1I0OIlO0.I0000Il00O;
/* 13 */                i = 0;
/* 14 */                this.I00iiO = 0;
                    }
/* 16 */            if (i <= 0) {
/* 18 */                return;
                    }
/* 19 */            I000II.I001IIilI0O();
                }

                public boolean containsKey(Object obj) {
                    return I0000Il00O(obj) >= 0;
                }

                public boolean containsValue(Object obj) {
                    return I00000oIO(obj) >= 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    try {
/* 8 */                 if (obj instanceof Ol0Ii10o1) {
/* 10 */                    int i = this.I00iiO;
/* 17 */                    if (i != ((Ol0Ii10o1) obj).I00iiO) {
/* 5 */                         return false;
                            }
/* 20 */                    Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) obj;
/* 23 */                    for (int i2 = 0; i2 < i; i2++) {
/* 25 */                        Object objI000II = I000II(i2);
/* 29 */                        Object objI000OiO = I000OiO(i2);
/* 33 */                        Object obj2 = ol0Ii10o1.get(objI000II);
/* 37 */                        if (objI000OiO == null) {
/* 39 */                            if (obj2 != null || !ol0Ii10o1.containsKey(objI000II)) {
/* 5 */                                 return false;
                                    }
                                } else if (!objI000OiO.equals(obj2)) {
/* 5 */                             return false;
                                }
                            }
/* 1 */                     return true;
                        }
/* 61 */                if (!(obj instanceof Map) || this.I00iiO != ((Map) obj).size()) {
/* 5 */                     return false;
                        }
/* 75 */                int i3 = this.I00iiO;
/* 78 */                for (int i4 = 0; i4 < i3; i4++) {
/* 80 */                    Object objI000II2 = I000II(i4);
/* 84 */                    Object objI000OiO2 = I000OiO(i4);
/* 91 */                    Object obj3 = ((Map) obj).get(objI000II2);
/* 95 */                    if (objI000OiO2 == null) {
/* 97 */                        if (obj3 != null || !((Map) obj).containsKey(objI000II2)) {
/* 5 */                             return false;
                                }
                            } else if (!objI000OiO2.equals(obj3)) {
/* 5 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    } catch (ClassCastException | NullPointerException unused) {
                    }
/* 5 */             return false;
                }

                public Object get(Object obj) {
/* 1 */             int iI0000Il00O = I0000Il00O(obj);
/* 5 */             if (iI0000Il00O >= 0) {
/* 13 */                return this.I00iiI[(iI0000Il00O << 1) + 1];
                    }
/* 16 */            return null;
                }

                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             int iI0000Il00O = I0000Il00O(obj);
                    return iI0000Il00O >= 0 ? this.I00iiI[(iI0000Il00O << 1) + 1] : obj2;
                }

                public final int hashCode() {
/* 1 */             int[] iArr = this.I00iOIl;
/* 3 */             Object[] objArr = this.I00iiI;
/* 5 */             int i = this.I00iiO;
/* 8 */             int i2 = 1;
/* 9 */             int i3 = 0;
/* 10 */            int iHashCode = 0;
/* 11 */            while (i3 < i) {
/* 13 */                Object obj = objArr[i2];
/* 26 */                iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
/* 27 */                i3++;
/* 29 */                i2 += 2;
                    }
/* 55 */            return iHashCode;
                }

                public final boolean isEmpty() {
                    return this.I00iiO <= 0;
                }

                public final Object put(Object obj, Object obj2) {
/* 1 */             int i = this.I00iiO;
/* 10 */            int iHashCode = obj != null ? obj.hashCode() : 0;
/* 18 */            int iI00000oOI = obj != null ? I00000oOI(iHashCode, obj) : I0000O();
/* 22 */            if (iI00000oOI >= 0) {
/* 26 */                int i2 = (iI00000oOI << 1) + 1;
/* 28 */                Object[] objArr = this.I00iiI;
/* 30 */                Object obj3 = objArr[i2];
/* 32 */                objArr[i2] = obj2;
/* 34 */                return obj3;
                    }
/* 35 */            int i3 = ~iI00000oOI;
/* 36 */            int[] iArr = this.I00iOIl;
/* 40 */            if (i >= iArr.length) {
/* 42 */                int i4 = 8;
/* 44 */                if (i >= 8) {
/* 48 */                    i4 = (i >> 1) + i;
                        } else if (i < 4) {
/* 54 */                    i4 = 4;
                        }
/* 59 */                this.I00iOIl = Arrays.copyOf(iArr, i4);
/* 69 */                this.I00iiI = Arrays.copyOf(this.I00iiI, i4 << 1);
/* 73 */                if (i != this.I00iiO) {
/* 76 */                    I000II.I001IIilI0O();
/* 39 */                    return null;
                        }
                    }
/* 80 */            if (i3 < i) {
/* 82 */                int[] iArr2 = this.I00iOIl;
/* 84 */                int i5 = i3 + 1;
/* 86 */                I1IoiO1l.I000O01llI0(i5, i3, i, iArr2, iArr2);
/* 89 */                Object[] objArr2 = this.I00iiI;
/* 99 */                I1IoiO1l.I000iOII(objArr2, i5 << 1, objArr2, i3 << 1, this.I00iiO << 1);
                    }
/* 102 */           int i6 = this.I00iiO;
/* 104 */           if (i == i6) {
/* 106 */               int[] iArr3 = this.I00iOIl;
/* 109 */               if (i3 < iArr3.length) {
/* 111 */                   iArr3[i3] = iHashCode;
/* 113 */                   Object[] objArr3 = this.I00iiI;
/* 115 */                   int i7 = i3 << 1;
/* 117 */                   objArr3[i7] = obj;
/* 121 */                   objArr3[i7 + 1] = obj2;
/* 125 */                   this.I00iiO = i6 + 1;
/* 39 */                    return null;
                        }
                    }
/* 128 */           I000II.I001IIilI0O();
/* 39 */            return null;
                }

                public final Object putIfAbsent(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 == null ? put(obj, obj2) : obj3;
                }

                public final boolean remove(Object obj, Object obj2) {
/* 1 */             int iI0000Il00O = I0000Il00O(obj);
/* 5 */             if (iI0000Il00O < 0 || !O0000Ioio00.I0000O(obj2, I000OiO(iI0000Il00O))) {
/* 22 */                return false;
                    }
/* 17 */            I000O01llI0(iI0000Il00O);
/* 20 */            return true;
                }

                public final boolean replace(Object obj, Object obj2, Object obj3) {
/* 1 */             int iI0000Il00O = I0000Il00O(obj);
/* 5 */             if (iI0000Il00O < 0 || !O0000Ioio00.I0000O(obj2, I000OiO(iI0000Il00O))) {
/* 22 */                return false;
                    }
/* 17 */            I000OOo1O(iI0000Il00O, obj3);
/* 20 */            return true;
                }

                public final int size() {
/* 1 */             return this.I00iiO;
                }

                public final String toString() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.I00iiO * 28);
/* 21 */            sb.append('{');
/* 24 */            int i = this.I00iiO;
/* 27 */            for (int i2 = 0; i2 < i; i2++) {
/* 29 */                if (i2 > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 36 */                Object objI000II = I000II(i2);
/* 42 */                if (objI000II != sb) {
/* 44 */                    sb.append(objI000II);
                        } else {
/* 48 */                    sb.append("(this Map)");
                        }
/* 53 */                sb.append('=');
/* 56 */                Object objI000OiO = I000OiO(i2);
/* 60 */                if (objI000OiO != sb) {
/* 62 */                    sb.append(objI000OiO);
                        } else {
/* 66 */                    sb.append("(this Map)");
                        }
                    }
/* 74 */            sb.append('}');
/* 77 */            return sb.toString();
                }

/* 23 */        public Object remove(Object obj) {
/* 24 */            int iI0000Il00O = I0000Il00O(obj);
                    if (iI0000Il00O >= 0) {
/* 25 */                return I000O01llI0(iI0000Il00O);
                    }
                    return null;
                }

/* 23 */        public final Object replace(Object obj, Object obj2) {
/* 24 */            int iI0000Il00O = I0000Il00O(obj);
                    if (iI0000Il00O >= 0) {
/* 25 */                return I000OOo1O(iI0000Il00O, obj2);
                    }
                    return null;
                }

/* 24 */        public Ol0Ii10o1() {
/* 25 */            this(0);
                }
            }

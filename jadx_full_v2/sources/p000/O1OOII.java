            package p000;

            import java.io.Serializable;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
/* 50 */    public final class O1OOII implements Map, Serializable, O0IloOoIliOO {
                public static final O1OOII I00lll10;
                public Object[] I00iOIl;
                public Object[] I00iiI;
                public int[] I00iiO;
                public int[] I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public O1OOIoo01I I00l0OO0IO;
                public IO0ioo1i0oo I00li1OI;
                public O1OOIoo01I I00ll1;
                public boolean I00lli11;

                static {
/* 4 */             O1OOII o1ooii = new O1OOII(0);
/* 8 */             o1ooii.I00lli11 = true;
/* 10 */            I00lll10 = o1ooii;
                }

                public O1OOII(int i) {
/* 1 */             if (i < 0) {
/* 47 */                I000II.I000iOII("capacity must be non-negative.");
/* 186 */               throw null;
                    }
/* 3 */             Object[] objArr = new Object[i];
/* 5 */             int[] iArr = new int[i];
/* 13 */            int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
/* 22 */            this.I00iOIl = objArr;
/* 25 */            this.I00iiI = null;
/* 27 */            this.I00iiO = iArr;
/* 29 */            this.I00iio = new int[iHighestOneBit];
/* 32 */            this.I00ilI0I1 = 2;
/* 35 */            this.I00ilO0 = 0;
/* 42 */            this.I00io1l = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
                }

                public final int I00000oIO(Object obj) {
/* 1 */             I0000Il00O();
                    while (true) {
/* 4 */                 int iI000OOo1O = I000OOo1O(obj);
/* 10 */                int i = this.I00ilI0I1 * 2;
/* 15 */                int length = this.I00iio.length / 2;
/* 17 */                if (i > length) {
/* 19 */                    i = length;
                        }
/* 20 */                int i2 = 0;
                        while (true) {
/* 21 */                    int[] iArr = this.I00iio;
/* 23 */                    int i3 = iArr[iI000OOo1O];
/* 26 */                    if (i3 == 0) {
/* 28 */                        int i4 = this.I00ilO0;
/* 30 */                        Object[] objArr = this.I00iOIl;
/* 33 */                        if (i4 < objArr.length) {
/* 39 */                            int i5 = i4 + 1;
/* 41 */                            this.I00ilO0 = i5;
/* 43 */                            objArr[i4] = obj;
/* 47 */                            this.I00iiO[i4] = iI000OOo1O;
/* 49 */                            iArr[iI000OOo1O] = i5;
                                    this.I00l0I0l0lO1++;
                                    this.I00ioIO++;
/* 63 */                            if (i2 > this.I00ilI0I1) {
/* 65 */                                this.I00ilI0I1 = i2;
                                    }
/* 67 */                            return i4;
                                }
/* 35 */                        I000II(1);
                            } else {
/* 78 */                        if (O0000Ioio00.I0000O(this.I00iOIl[i3 - 1], obj)) {
/* 80 */                            return -i3;
                                }
/* 82 */                        i2++;
/* 84 */                        if (i2 > i) {
/* 91 */                            I000OiO(this.I00iio.length * 2);
                                    break;
                                }
/* 104 */                       iI000OOo1O = iI000OOo1O == 0 ? this.I00iio.length - 1 : iI000OOo1O - 1;
                            }
                        }
                    }
                }

                public final O1OOII I00000oOI() {
/* 1 */             I0000Il00O();
/* 5 */             this.I00lli11 = true;
                    return this.I00l0I0l0lO1 > 0 ? this : I00lll10;
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00lli11) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                public final void I0000O(boolean z) {
                    int i;
/* 1 */             Object[] objArr = this.I00iiI;
/* 3 */             int i2 = 0;
/* 4 */             int i3 = 0;
                    while (true) {
/* 5 */                 i = this.I00ilO0;
/* 7 */                 if (i2 >= i) {
                            break;
                        }
/* 9 */                 int[] iArr = this.I00iiO;
/* 11 */                int i4 = iArr[i2];
/* 13 */                if (i4 >= 0) {
/* 15 */                    Object[] objArr2 = this.I00iOIl;
/* 19 */                    objArr2[i3] = objArr2[i2];
/* 21 */                    if (objArr != null) {
/* 25 */                        objArr[i3] = objArr[i2];
                            }
/* 27 */                    if (z) {
/* 29 */                        iArr[i3] = i4;
/* 35 */                        this.I00iio[i4] = i3 + 1;
                            }
/* 37 */                    i3++;
                        }
/* 39 */                i2++;
                    }
/* 44 */            l10iI1.I00000oIO(this.I00iOIl, i3, i);
/* 47 */            if (objArr != null) {
/* 51 */                l10iI1.I00000oIO(objArr, i3, this.I00ilO0);
                    }
/* 54 */            this.I00ilO0 = i3;
                }

                public final void I000II(int i) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             int length = objArr.length;
/* 4 */             int i2 = this.I00ilO0;
/* 6 */             int i3 = length - i2;
/* 9 */             int i4 = i2 - this.I00l0I0l0lO1;
/* 12 */            if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
/* 22 */                I0000O(true);
/* 25 */                return;
                    }
/* 26 */            int i5 = i2 + i;
/* 27 */            if (i5 < 0) {
/* 186 */               throw new OutOfMemoryError();
                    }
/* 30 */            if (i5 > objArr.length) {
/* 32 */                int length2 = objArr.length;
/* 35 */                int i6 = length2 + (length2 >> 1);
/* 38 */                if (i6 - i5 < 0) {
/* 40 */                    i6 = i5;
                        }
/* 46 */                if (i6 - 2147483639 > 0) {
/* 54 */                    i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                        }
/* 59 */                this.I00iOIl = Arrays.copyOf(objArr, i6);
/* 61 */                Object[] objArr2 = this.I00iiI;
/* 71 */                this.I00iiI = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
/* 79 */                this.I00iiO = Arrays.copyOf(this.I00iiO, i6);
/* 87 */                int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
/* 94 */                if (iHighestOneBit > this.I00iio.length) {
/* 96 */                    I000OiO(iHighestOneBit);
                        }
                    }
                }

                public final int I000O01llI0(Object obj) {
/* 1 */             int iI000OOo1O = I000OOo1O(obj);
/* 5 */             int i = this.I00ilI0I1;
                    while (true) {
/* 9 */                 int i2 = this.I00iio[iI000OOo1O];
/* 12 */                if (i2 == 0) {
/* 11 */                    return -1;
                        }
                        int i3 = i2 - 1;
/* 25 */                if (O0000Ioio00.I0000O(this.I00iOIl[i3], obj)) {
/* 27 */                    return i3;
                        }
                        i--;
/* 29 */                if (i < 0) {
/* 11 */                    return -1;
                        }
/* 42 */                iI000OOo1O = iI000OOo1O == 0 ? this.I00iio.length - 1 : iI000OOo1O - 1;
                    }
                }

                public final int I000OOo1O(Object obj) {
/* 15 */            return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.I00io1l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
                
                    r3[r0] = r6;
                    r5.I00iiO[r2] = r0;
                    r2 = r6;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OiO(int i) {
                    this.I00ioIO++;
/* 11 */            int i2 = 0;
/* 12 */            if (this.I00ilO0 > this.I00l0I0l0lO1) {
/* 14 */                I0000O(false);
                    }
/* 19 */            this.I00iio = new int[i];
/* 27 */            this.I00io1l = Integer.numberOfLeadingZeros(i) + 1;
/* 31 */            while (i2 < this.I00ilO0) {
/* 33 */                int i3 = i2 + 1;
/* 39 */                int iI000OOo1O = I000OOo1O(this.I00iOIl[i2]);
/* 43 */                int i4 = this.I00ilI0I1;
                        while (true) {
/* 45 */                    int[] iArr = this.I00iio;
/* 49 */                    if (iArr[iI000OOo1O] == 0) {
                                break;
                            }
                            i4--;
/* 61 */                    if (i4 < 0) {
/* 75 */                        I000II.I001IO000("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
/* 186 */                       return;
                            }
/* 71 */                    iI000OOo1O = iI000OOo1O == 0 ? iArr.length - 1 : iI000OOo1O - 1;
                        }
                    }
                }

                public final void I000iOII(int i) {
                    int i2;
                    int i3;
                    int iI000OOo1O;
                    int[] iArr;
/* 4 */             this.I00iOIl[i] = null;
/* 6 */             Object[] objArr = this.I00iiI;
/* 8 */             if (objArr != null) {
/* 10 */                objArr[i] = null;
                    }
/* 14 */            int length = this.I00iiO[i];
                    loop0: while (true) {
/* 17 */                int i4 = length;
/* 18 */                int i5 = 0;
/* 81 */                do {
/* 29 */                    length = length == 0 ? this.I00iio.length - 1 : length - 1;
/* 30 */                    int[] iArr2 = this.I00iio;
/* 32 */                    i2 = iArr2[length];
/* 34 */                    i5++;
/* 38 */                    if (i5 > this.I00ilI0I1) {
/* 40 */                        iArr2[i4] = 0;
                                break loop0;
                            } else if (i2 == 0) {
/* 45 */                        iArr2[i4] = 0;
                                break loop0;
                            } else {
                                i3 = i2 - 1;
/* 74 */                        iI000OOo1O = I000OOo1O(this.I00iOIl[i3]) - length;
/* 75 */                        iArr = this.I00iio;
                            }
/* 81 */                } while ((iI000OOo1O & (iArr.length - 1)) < i5);
/* 83 */                iArr[i4] = i2;
/* 87 */                this.I00iiO[i3] = i4;
                    }
/* 50 */            this.I00iiO[i] = -1;
                    this.I00l0I0l0lO1--;
                    this.I00ioIO++;
                }

                @Override
                public final void clear() {
/* 1 */             I0000Il00O();
                    int i = this.I00ilO0 - 1;
/* 9 */             if (i >= 0) {
/* 11 */                int i2 = 0;
                        while (true) {
/* 12 */                    int[] iArr = this.I00iiO;
/* 14 */                    int i3 = iArr[i2];
/* 16 */                    if (i3 >= 0) {
/* 20 */                        this.I00iio[i3] = 0;
/* 23 */                        iArr[i2] = -1;
                            }
/* 25 */                    if (i2 == i) {
                                break;
                            } else {
/* 27 */                        i2++;
                            }
                        }
                    }
/* 34 */            l10iI1.I00000oIO(this.I00iOIl, 0, this.I00ilO0);
/* 37 */            Object[] objArr = this.I00iiI;
/* 39 */            if (objArr != null) {
/* 43 */                l10iI1.I00000oIO(objArr, 0, this.I00ilO0);
                    }
/* 46 */            this.I00l0I0l0lO1 = 0;
/* 48 */            this.I00ilO0 = 0;
                    this.I00ioIO++;
                }

                @Override
                public final boolean containsKey(Object obj) {
                    return I000O01llI0(obj) >= 0;
                }

                @Override
                public final boolean containsValue(Object obj) {
                    int i;
/* 1 */             int i2 = this.I00ilO0;
                    while (true) {
/* 3 */                 i = -1;
                        i2--;
/* 5 */                 if (i2 >= 0) {
/* 11 */                    if (this.I00iiO[i2] >= 0 && O0000Ioio00.I0000O(this.I00iiI[i2], obj)) {
/* 23 */                        i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    return i >= 0;
                }

                @Override
                public final Set entrySet() {
/* 1 */             O1OOIoo01I o1OOIoo01I = this.I00ll1;
/* 3 */             if (o1OOIoo01I != null) {
/* 29 */                return o1OOIoo01I;
                    }
/* 8 */             O1OOIoo01I o1OOIoo01I2 = new O1OOIoo01I(this, 0);
/* 11 */            this.I00ll1 = o1OOIoo01I2;
/* 29 */            return o1OOIoo01I2;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 69 */                return true;
                    }
/* 6 */             if (obj instanceof Map) {
/* 8 */                 Map map = (Map) obj;
/* 16 */                if (this.I00l0I0l0lO1 == map.size()) {
/* 32 */                    for (Object obj2 : map.entrySet()) {
/* 38 */                        if (obj2 != null) {
                                    try {
/* 40 */                                Map.Entry entry = (Map.Entry) obj2;
/* 46 */                                int iI000O01llI0 = I000O01llI0(entry.getKey());
/* 66 */                                if (!(iI000O01llI0 < 0 ? false : O0000Ioio00.I0000O(this.I00iiI[iI000O01llI0], entry.getValue()))) {
                                        }
                                    } catch (ClassCastException unused) {
                                    }
                                }
                            }
/* 69 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             int iI000O01llI0 = I000O01llI0(obj);
/* 5 */             if (iI000O01llI0 < 0) {
/* 7 */                 return null;
                    }
/* 11 */            return this.I00iiI[iI000O01llI0];
                }

                @Override
                public final int hashCode() {
/* 4 */             O1OIoioOO1lo o1OIoioOO1lo = new O1OIoioOO1lo(this, 0);
/* 7 */             int i = 0;
/* 12 */            while (o1OIoioOO1lo.hasNext()) {
/* 14 */                int i2 = o1OIoioOO1lo.I00iOIl;
/* 18 */                O1OOII o1ooii = (O1OOII) o1OIoioOO1lo.I00iiI;
/* 22 */                if (i2 >= o1ooii.I00ilO0) {
/* 62 */                    IoOOl0iOl1io.I00000oOI();
/* 3 */                     return 0;
                        }
/* 26 */                o1OIoioOO1lo.I00iOIl = i2 + 1;
/* 28 */                o1OIoioOO1lo.I00iiO = i2;
/* 32 */                Object obj = o1ooii.I00iOIl[i2];
/* 41 */                int iHashCode = obj != null ? obj.hashCode() : 0;
/* 46 */                Object obj2 = o1ooii.I00iiI[o1OIoioOO1lo.I00iiO];
/* 55 */                int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
/* 57 */                o1OIoioOO1lo.I0000Il00O();
/* 60 */                i += iHashCode ^ iHashCode2;
                    }
/* 113 */           return i;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00l0I0l0lO1 == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             O1OOIoo01I o1OOIoo01I = this.I00l0OO0IO;
/* 3 */             if (o1OOIoo01I != null) {
/* 29 */                return o1OOIoo01I;
                    }
/* 8 */             O1OOIoo01I o1OOIoo01I2 = new O1OOIoo01I(this, 1);
/* 11 */            this.I00l0OO0IO = o1OOIoo01I2;
/* 29 */            return o1OOIoo01I2;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 1 */             I0000Il00O();
/* 4 */             int iI00000oIO = I00000oIO(obj);
/* 8 */             Object[] objArr = this.I00iiI;
/* 11 */            if (objArr == null) {
/* 16 */                int length = this.I00iOIl.length;
/* 17 */                if (length < 0) {
/* 38 */                    I000II.I000iOII("capacity must be non-negative.");
/* 10 */                    return null;
                        }
/* 19 */                objArr = new Object[length];
/* 21 */                this.I00iiI = objArr;
                    }
/* 23 */            if (iI00000oIO >= 0) {
/* 33 */                objArr[iI00000oIO] = obj2;
/* 10 */                return null;
                    }
                    int i = (-iI00000oIO) - 1;
/* 28 */            Object obj3 = objArr[i];
/* 30 */            objArr[i] = obj2;
/* 32 */            return obj3;
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             I0000Il00O();
/* 4 */             Set<Map.Entry> setEntrySet = map.entrySet();
/* 14 */            if (setEntrySet.isEmpty()) {
/* 186 */               return;
                    }
/* 21 */            I000II(setEntrySet.size());
/* 32 */            for (Map.Entry entry : setEntrySet) {
/* 44 */                int iI00000oIO = I00000oIO(entry.getKey());
/* 48 */                Object[] objArr = this.I00iiI;
/* 50 */                if (objArr == null) {
/* 55 */                    int length = this.I00iOIl.length;
/* 56 */                    if (length < 0) {
/* 95 */                        I000II.I000iOII("capacity must be non-negative.");
/* 186 */                       return;
                            } else {
/* 58 */                        objArr = new Object[length];
/* 60 */                        this.I00iiI = objArr;
                            }
                        }
/* 62 */                if (iI00000oIO >= 0) {
/* 68 */                    objArr[iI00000oIO] = entry.getValue();
                        } else {
                            int i = (-iI00000oIO) - 1;
/* 84 */                    if (!O0000Ioio00.I0000O(entry.getValue(), objArr[i])) {
/* 90 */                        objArr[i] = entry.getValue();
                            }
                        }
                    }
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I0000Il00O();
/* 4 */             int iI000O01llI0 = I000O01llI0(obj);
/* 8 */             if (iI000O01llI0 < 0) {
/* 10 */                return null;
                    }
/* 14 */            Object obj2 = this.I00iiI[iI000O01llI0];
/* 16 */            I000iOII(iI000O01llI0);
/* 49 */            return obj2;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder((this.I00l0I0l0lO1 * 3) + 2);
/* 14 */            sb.append("{");
/* 19 */            int i = 0;
/* 20 */            O1OIoioOO1lo o1OIoioOO1lo = new O1OIoioOO1lo(this, 0);
/* 27 */            while (o1OIoioOO1lo.hasNext()) {
/* 29 */                if (i > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 36 */                int i2 = o1OIoioOO1lo.I00iOIl;
/* 40 */                O1OOII o1ooii = (O1OOII) o1OIoioOO1lo.I00iiI;
/* 44 */                if (i2 >= o1ooii.I00ilO0) {
/* 93 */                    IoOOl0iOl1io.I00000oOI();
/* 96 */                    return null;
                        }
/* 48 */                o1OIoioOO1lo.I00iOIl = i2 + 1;
/* 50 */                o1OIoioOO1lo.I00iiO = i2;
/* 54 */                Object obj = o1ooii.I00iOIl[i2];
/* 58 */                if (obj == o1ooii) {
/* 60 */                    sb.append("(this Map)");
                        } else {
/* 64 */                    sb.append(obj);
                        }
/* 69 */                sb.append('=');
/* 76 */                Object obj2 = o1ooii.I00iiI[o1OIoioOO1lo.I00iiO];
/* 78 */                if (obj2 == o1ooii) {
/* 80 */                    sb.append("(this Map)");
                        } else {
/* 84 */                    sb.append(obj2);
                        }
/* 87 */                o1OIoioOO1lo.I0000Il00O();
/* 90 */                i++;
                    }
/* 100 */           sb.append("}");
/* 103 */           return sb.toString();
                }

                @Override
                public final Collection values() {
/* 1 */             IO0ioo1i0oo iO0ioo1i0oo = this.I00li1OI;
/* 3 */             if (iO0ioo1i0oo != null) {
/* 29 */                return iO0ioo1i0oo;
                    }
/* 8 */             IO0ioo1i0oo iO0ioo1i0oo2 = new IO0ioo1i0oo(this, 1);
/* 11 */            this.I00li1OI = iO0ioo1i0oo2;
/* 29 */            return iO0ioo1i0oo2;
                }

/* 51 */        public O1OOII() {
/* 52 */            this(8);
                }
            }

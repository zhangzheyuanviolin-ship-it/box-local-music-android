            package p000;

            import java.io.Serializable;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.SortedMap;
            
            public final class lOliil implements Map, Serializable {
                public static final lOliil I00io1l = new lOliil(null, new Object[0], 0);
                public transient lOlIO0oi I00iOIl;
                public transient lOlO1Oioo I00iiI;
                public transient lOlOo0Ol11oO I00iiO;
                public final transient Object I00iio;
                public final transient Object[] I00ilI0I1;
                public final transient int I00ilO0;

                public lOliil(Object obj, Object[] objArr, int i) {
/* 4 */             this.I00iio = obj;
/* 6 */             this.I00ilI0I1 = objArr;
/* 8 */             this.I00ilO0 = i;
                }

                public static lOliil I00000oIO(Map map) {
                    int size;
                    Object[] objArr;
                    int length;
                    int size2;
/* 3 */             if ((map instanceof lOliil) && !(map instanceof SortedMap)) {
/* 9 */                 return (lOliil) map;
                    }
/* 12 */            Set<Map.Entry> setEntrySet = map.entrySet();
/* 16 */            boolean z = setEntrySet instanceof Collection;
/* 33 */            I00Ol00 i00Ol00 = new I00Ol00(z ? setEntrySet.size() : 4, 22);
/* 36 */            if (z && (size2 = (size = setEntrySet.size()) + size) > (length = (objArr = (Object[]) i00Ol00.I0000Il00O).length)) {
/* 61 */                i00Ol00.I0000Il00O = Arrays.copyOf(objArr, IoilIilo.I000OiO(length, size2));
                    }
/* 71 */            for (Map.Entry entry : setEntrySet) {
/* 87 */                i00Ol00.I001iOo1i0O(entry.getKey(), entry.getValue());
                    }
/* 91 */            return i00Ol00.I001lllioOl();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
                /* JADX WARN: Type inference failed for: r16v11 */
                /* JADX WARN: Type inference failed for: r16v12 */
                /* JADX WARN: Type inference failed for: r16v13 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static lOliil I0000Il00O(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    boolean z;
                    int i2;
                    char c;
                    Object obj;
                    char c2;
                    short[] sArr;
                    boolean z2;
                    int i3;
                    ?? r16;
                    boolean z3;
                    boolean z4;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 9 */                 return I00io1l;
                    }
/* 12 */            Object obj2 = null;
/* 13 */            boolean z5 = false;
/* 14 */            int i5 = 1;
/* 15 */            if (i4 == 1) {
/* 19 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 24 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 29 */                return new lOliil(null, objArrCopyOf, 1);
                    }
/* 35 */            ll0OlOllOl.I0000O(i4, objArrCopyOf.length >> 1);
/* 38 */            int iI000lI = lOO110IoOiI.I000lI(i4);
/* 42 */            char c3 = 2;
/* 43 */            if (i4 != 1) {
                        int i6 = iI000lI - 1;
/* 70 */                if (iI000lI <= 128) {
/* 72 */                    byte[] bArr = new byte[iI000lI];
/* 74 */                    Arrays.fill(bArr, (byte) -1);
/* 77 */                    int i7 = 0;
/* 78 */                    int i8 = 0;
/* 79 */                    while (i7 < i4) {
/* 81 */                        int i9 = i8 + i8;
/* 83 */                        int i10 = i7 + i7;
/* 85 */                        Object obj3 = objArrCopyOf[i10];
/* 87 */                        Objects.requireNonNull(obj3);
/* 91 */                        Object obj4 = objArrCopyOf[i10 ^ i5];
/* 93 */                        Objects.requireNonNull(obj4);
/* 100 */                       int iI00000oIO = ll0l01liOO1.I00000oIO(obj3.hashCode());
                                while (true) {
/* 104 */                           int i11 = iI00000oIO & i6;
/* 105 */                           z2 = z5;
/* 109 */                           i3 = i5;
/* 113 */                           int i12 = bArr[i11] & 255;
/* 114 */                           if (i12 == 255) {
/* 117 */                               bArr[i11] = (byte) i9;
/* 119 */                               if (i8 < i7) {
/* 121 */                                   objArrCopyOf[i9] = obj3;
/* 125 */                                   objArrCopyOf[i9 ^ 1] = obj4;
                                        }
/* 127 */                               i8++;
                                    } else {
/* 136 */                               if (obj3.equals(objArrCopyOf[i12])) {
/* 138 */                                   int i13 = i12 ^ 1;
/* 142 */                                   Object obj5 = objArrCopyOf[i13];
/* 144 */                                   Objects.requireNonNull(obj5);
/* 147 */                                   lOIO0O0 loio0o0 = new lOIO0O0(obj3, obj4, obj5);
/* 150 */                                   objArrCopyOf[i13] = obj4;
/* 152 */                                   obj2 = loio0o0;
                                            break;
                                        }
/* 160 */                               iI00000oIO = i11 + 1;
/* 162 */                               z5 = z2;
/* 164 */                               i5 = i3;
                                    }
                                }
/* 153 */                       i7++;
/* 155 */                       z5 = z2;
/* 157 */                       i5 = i3;
                            }
/* 167 */                   z = z5;
/* 169 */                   i2 = i5;
/* 171 */                   if (i8 == i4) {
/* 173 */                       obj2 = bArr;
                                z4 = z;
                            } else {
/* 175 */                       sArr = new Object[3];
/* 177 */                       sArr[z ? 1 : 0] = bArr;
/* 183 */                       sArr[i2] = Integer.valueOf(i8);
/* 185 */                       sArr[2] = obj2;
/* 187 */                       obj2 = sArr;
                                z4 = z;
                            }
                        } else {
/* 190 */                   z = false;
/* 192 */                   i2 = 1;
/* 197 */                   if (iI000lI <= 32768) {
/* 199 */                       sArr = new short[iI000lI];
/* 201 */                       Arrays.fill(sArr, (short) -1);
/* 206 */                       int i14 = 0;
/* 207 */                       for (int i15 = 0; i15 < i4; i15++) {
/* 209 */                           int i16 = i14 + i14;
/* 211 */                           int i17 = i15 + i15;
/* 213 */                           Object obj6 = objArrCopyOf[i17];
/* 215 */                           Objects.requireNonNull(obj6);
/* 220 */                           Object obj7 = objArrCopyOf[i17 ^ 1];
/* 222 */                           Objects.requireNonNull(obj7);
/* 229 */                           int iI00000oIO2 = ll0l01liOO1.I00000oIO(obj6.hashCode());
                                    while (true) {
/* 233 */                               int i18 = iI00000oIO2 & i6;
/* 236 */                               char c4 = (char) sArr[i18];
/* 240 */                               if (c4 == 65535) {
/* 243 */                                   sArr[i18] = (short) i16;
/* 245 */                                   if (i14 < i15) {
/* 247 */                                       objArrCopyOf[i16] = obj6;
/* 251 */                                       objArrCopyOf[i16 ^ 1] = obj7;
                                            }
/* 253 */                                   i14++;
                                        } else {
/* 262 */                                   if (obj6.equals(objArrCopyOf[c4])) {
/* 264 */                                       int i19 = c4 ^ 1;
/* 268 */                                       Object obj8 = objArrCopyOf[i19];
/* 270 */                                       Objects.requireNonNull(obj8);
/* 273 */                                       lOIO0O0 loio0o02 = new lOIO0O0(obj6, obj7, obj8);
/* 276 */                                       objArrCopyOf[i19] = obj7;
/* 278 */                                       obj2 = loio0o02;
                                                break;
                                            }
/* 282 */                                   iI00000oIO2 = i18 + 1;
                                        }
                                    }
                                }
/* 285 */                       if (i14 == i4) {
/* 187 */                           obj2 = sArr;
                                    z4 = z;
                                } else {
/* 288 */                           obj2 = new Object[]{sArr, Integer.valueOf(i14), obj2};
                                    z4 = z;
                                }
                            } else {
/* 303 */                       int[] iArr = new int[iI000lI];
/* 305 */                       Arrays.fill(iArr, -1);
/* 308 */                       int i20 = 0;
/* 310 */                       int i21 = 0;
/* 311 */                       while (i20 < i4) {
/* 313 */                           int i22 = i21 + i21;
/* 315 */                           int i23 = i20 + i20;
/* 317 */                           Object obj9 = objArrCopyOf[i23];
/* 319 */                           Objects.requireNonNull(obj9);
/* 324 */                           Object obj10 = objArrCopyOf[i23 ^ 1];
/* 326 */                           Objects.requireNonNull(obj10);
/* 333 */                           int iI00000oIO3 = ll0l01liOO1.I00000oIO(obj9.hashCode());
                                    while (true) {
/* 337 */                               int i24 = iI00000oIO3 & i6;
/* 338 */                               int i25 = iArr[i24];
/* 340 */                               if (i25 == -1) {
/* 342 */                                   iArr[i24] = i22;
/* 344 */                                   if (i21 < i20) {
/* 346 */                                       objArrCopyOf[i22] = obj9;
/* 350 */                                       objArrCopyOf[i22 ^ 1] = obj10;
                                            }
/* 352 */                                   i21++;
/* 354 */                                   c2 = c3;
                                        } else {
/* 357 */                                   c2 = c3;
/* 365 */                                   if (obj9.equals(objArrCopyOf[i25])) {
/* 367 */                                       int i26 = i25 ^ 1;
/* 371 */                                       Object obj11 = objArrCopyOf[i26];
/* 373 */                                       Objects.requireNonNull(obj11);
/* 376 */                                       lOIO0O0 loio0o03 = new lOIO0O0(obj9, obj10, obj11);
/* 379 */                                       objArrCopyOf[i26] = obj10;
/* 381 */                                       obj2 = loio0o03;
                                                break;
                                            }
/* 387 */                                   iI00000oIO3 = i24 + 1;
/* 389 */                                   c3 = c2;
                                        }
                                    }
/* 382 */                           i20++;
/* 384 */                           c3 = c2;
                                }
/* 392 */                       c = c3;
/* 394 */                       if (i21 == i4) {
/* 396 */                           obj = iArr;
                                    r16 = z;
                                } else {
/* 398 */                           Object[] objArr2 = new Object[3];
/* 400 */                           objArr2[0] = iArr;
/* 406 */                           objArr2[1] = Integer.valueOf(i21);
/* 408 */                           objArr2[c] = obj2;
/* 410 */                           obj = objArr2;
                                    r16 = z;
                                }
                            }
                        }
/* 411 */               z3 = obj instanceof Object[];
                        Object obj12 = obj;
/* 413 */               if (z3) {
/* 415 */                   Object[] objArr3 = (Object[]) obj;
/* 419 */                   lOIO0O0 loio0o04 = (lOIO0O0) objArr3[c];
/* 421 */                   if (i00Ol00 == null) {
/* 448 */                       throw loio0o04.I00000oIO();
                            }
/* 423 */                   i00Ol00.I0000O = loio0o04;
/* 425 */                   Object obj13 = objArr3[r16];
/* 431 */                   int iIntValue = ((Integer) objArr3[i2]).intValue();
/* 437 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 441 */                   obj12 = obj13;
/* 442 */                   i4 = iIntValue;
                        }
/* 451 */               return new lOliil(obj12, objArrCopyOf, i4);
                    }
/* 47 */            Objects.requireNonNull(objArrCopyOf[0]);
/* 52 */            Objects.requireNonNull(objArrCopyOf[1]);
/* 55 */            z4 = false;
/* 57 */            i4 = 1;
/* 58 */            i2 = 1;
/* 60 */            c = 2;
                    obj = obj2;
                    r16 = z4;
/* 411 */           z3 = obj instanceof Object[];
                    Object obj122 = obj;
/* 413 */           if (z3) {
                    }
/* 451 */           return new lOliil(obj122, objArrCopyOf, i4);
                }

                @Override
                public final lOO110IoOiI entrySet() {
/* 1 */             lOlIO0oi lolio0oi = this.I00iOIl;
/* 3 */             if (lolio0oi != null) {
/* 20 */                return lolio0oi;
                    }
/* 11 */            lOlIO0oi lolio0oi2 = new lOlIO0oi(this, this.I00ilI0I1, this.I00ilO0);
/* 14 */            this.I00iOIl = lolio0oi2;
/* 20 */            return lolio0oi2;
                }

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean containsKey(Object obj) {
                    return get(obj) != null;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 1 */             lOlOo0Ol11oO loloo0ol11oo = this.I00iiO;
/* 3 */             if (loloo0ol11oo == null) {
/* 12 */                loloo0ol11oo = new lOlOo0Ol11oO(this.I00ilI0I1, 1, this.I00ilO0);
/* 15 */                this.I00iiO = loloo0ol11oo;
                    }
/* 17 */            return loloo0ol11oo.contains(obj);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Map) {
/* 21 */                return entrySet().equals(((Map) obj).entrySet());
                    }
/* 9 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
                /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get(Object obj) {
                    Object obj2;
/* 2 */             if (obj == null) {
/* 4 */                 obj2 = null;
                    } else {
/* 8 */                 int i = this.I00ilO0;
/* 10 */                Object[] objArr = this.I00ilI0I1;
/* 12 */                if (i == 1) {
/* 15 */                    Object obj3 = objArr[0];
/* 17 */                    Objects.requireNonNull(obj3);
/* 24 */                    if (obj3.equals(obj)) {
/* 26 */                        obj2 = objArr[1];
/* 28 */                        Objects.requireNonNull(obj2);
                            }
                        } else {
/* 33 */                    Object obj4 = this.I00iio;
/* 35 */                    if (obj4 != null) {
/* 41 */                        if (obj4 instanceof byte[]) {
/* 44 */                            byte[] bArr = (byte[]) obj4;
                                    int length = bArr.length - 1;
/* 53 */                            int iI00000oIO = ll0l01liOO1.I00000oIO(obj.hashCode());
                                    while (true) {
/* 57 */                                int i2 = iI00000oIO & length;
/* 62 */                                int i3 = bArr[i2] & 255;
/* 63 */                                if (i3 == 255) {
                                            break;
                                        }
/* 72 */                                if (obj.equals(objArr[i3])) {
/* 76 */                                    obj2 = objArr[i3 ^ 1];
                                            break;
                                        }
/* 79 */                                iI00000oIO = i2 + 1;
                                    }
                                } else if (obj4 instanceof short[]) {
/* 87 */                            short[] sArr = (short[]) obj4;
                                    int length2 = sArr.length - 1;
/* 96 */                            int iI00000oIO2 = ll0l01liOO1.I00000oIO(obj.hashCode());
                                    while (true) {
/* 100 */                               int i4 = iI00000oIO2 & length2;
/* 103 */                               char c = (char) sArr[i4];
/* 107 */                               if (c == 65535) {
                                            break;
                                        }
/* 116 */                               if (obj.equals(objArr[c])) {
/* 120 */                                   obj2 = objArr[c ^ 1];
                                            break;
                                        }
/* 123 */                               iI00000oIO2 = i4 + 1;
                                    }
                                } else {
/* 126 */                           int[] iArr = (int[]) obj4;
                                    int length3 = iArr.length - 1;
/* 134 */                           int iI00000oIO3 = ll0l01liOO1.I00000oIO(obj.hashCode());
                                    while (true) {
/* 138 */                               int i5 = iI00000oIO3 & length3;
/* 139 */                               int i6 = iArr[i5];
/* 141 */                               if (i6 == -1) {
                                            break;
                                        }
/* 151 */                               if (obj.equals(objArr[i6])) {
/* 155 */                                   obj2 = objArr[i6 ^ 1];
                                            break;
                                        }
/* 161 */                               iI00000oIO3 = i5 + 1;
                                    }
                                }
                            }
                        }
                    }
/* 157 */           if (obj2 == null) {
/* 1 */                 return null;
                    }
/* 160 */           return obj2;
                }

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 != null ? obj3 : obj2;
                }

                @Override
                public final int hashCode() {
/* 5 */             Iterator it = entrySet().iterator();
/* 10 */            int iHashCode = 0;
/* 15 */            while (it.hasNext()) {
/* 17 */                Object next = it.next();
/* 29 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             lOlO1Oioo lolo1oioo = this.I00iiI;
/* 3 */             if (lolo1oioo != null) {
/* 55 */                return lolo1oioo;
                    }
/* 17 */            lOlO1Oioo lolo1oioo2 = new lOlO1Oioo(this, new lOlOo0Ol11oO(this.I00ilI0I1, 0, this.I00ilO0));
/* 20 */            this.I00iiI = lolo1oioo2;
/* 22 */            return lolo1oioo2;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                public final void putAll(Map map) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilO0;
                }

                public final String toString() {
/* 3 */             int i = this.I00ilO0;
/* 5 */             ll0iOo11011i.I00000oOI(i, "size");
/* 22 */            StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
/* 27 */            sb.append('{');
/* 36 */            Iterator it = ((lOlIO0oi) entrySet()).iterator();
/* 40 */            boolean z = true;
/* 45 */            while (it.hasNext()) {
/* 51 */                Map.Entry entry = (Map.Entry) it.next();
/* 53 */                if (!z) {
/* 57 */                    sb.append(", ");
                        }
/* 62 */                OooioIOo1.I00111O(entry, sb, '=');
/* 65 */                z = false;
                    }
/* 69 */            sb.append('}');
/* 72 */            return sb.toString();
                }

                @Override
                public final Collection values() {
/* 1 */             lOlOo0Ol11oO loloo0ol11oo = this.I00iiO;
/* 3 */             if (loloo0ol11oo != null) {
/* 20 */                return loloo0ol11oo;
                    }
/* 12 */            lOlOo0Ol11oO loloo0ol11oo2 = new lOlOo0Ol11oO(this.I00ilI0I1, 1, this.I00ilO0);
/* 15 */            this.I00iiO = loloo0ol11oo2;
/* 20 */            return loloo0ol11oo2;
                }
            }

            package p000;

            import java.util.Arrays;
            import java.util.Objects;
            
            public final class iiO111IOo extends iOlloIll11 {
                public static final iiO111IOo I00io1l = new iiO111IOo(null, new Object[0], 0);
                public final transient Object I00iio;
                public final transient Object[] I00ilI0I1;
                public final transient int I00ilO0;

                public iiO111IOo(Object obj, Object[] objArr, int i) {
/* 4 */             this.I00iio = obj;
/* 6 */             this.I00ilI0I1 = objArr;
/* 8 */             this.I00ilO0 = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
                /* JADX WARN: Type inference failed for: r16v10 */
                /* JADX WARN: Type inference failed for: r16v11 */
                /* JADX WARN: Type inference failed for: r16v12 */
                /* JADX WARN: Type inference failed for: r16v13 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static iiO111IOo I00000oOI(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    int iI0000Il00O;
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
/* 29 */                return new iiO111IOo(null, objArrCopyOf, 1);
                    }
/* 35 */            ll01O0I1o0i1.I00000oOI(i4, objArrCopyOf.length >> 1);
/* 38 */            char c3 = 2;
/* 39 */            int iMax = Math.max(i4, 2);
/* 47 */            if (iMax < 751619276) {
/* 49 */                iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 63 */                while (iI0000Il00O * 0.7d < iMax) {
/* 65 */                    iI0000Il00O += iI0000Il00O;
                        }
                    } else {
/* 67 */                iI0000Il00O = 1073741824;
/* 69 */                if (iMax >= 1073741824) {
/* 487 */                   I000II.I000iOII("collection too large");
/* 12 */                    return null;
                        }
                    }
/* 71 */            if (i4 == 1) {
/* 75 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 80 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 83 */                z4 = false;
/* 85 */                i4 = 1;
/* 86 */                i2 = 1;
                    } else {
                        int i6 = iI0000Il00O - 1;
/* 97 */                if (iI0000Il00O <= 128) {
/* 99 */                    byte[] bArr = new byte[iI0000Il00O];
/* 101 */                   Arrays.fill(bArr, (byte) -1);
/* 104 */                   int i7 = 0;
/* 105 */                   int i8 = 0;
/* 106 */                   while (i7 < i4) {
/* 108 */                       int i9 = i8 + i8;
/* 110 */                       int i10 = i7 + i7;
/* 112 */                       Object obj3 = objArrCopyOf[i10];
/* 114 */                       Objects.requireNonNull(obj3);
/* 118 */                       Object obj4 = objArrCopyOf[i10 ^ i5];
/* 120 */                       Objects.requireNonNull(obj4);
/* 127 */                       int iI00000oIO = liiliO.I00000oIO(obj3.hashCode());
                                while (true) {
/* 131 */                           int i11 = iI00000oIO & i6;
/* 132 */                           z2 = z5;
/* 136 */                           i3 = i5;
/* 140 */                           int i12 = bArr[i11] & 255;
/* 141 */                           if (i12 == 255) {
/* 144 */                               bArr[i11] = (byte) i9;
/* 146 */                               if (i8 < i7) {
/* 148 */                                   objArrCopyOf[i9] = obj3;
/* 152 */                                   objArrCopyOf[i9 ^ 1] = obj4;
                                        }
/* 154 */                               i8++;
                                    } else {
/* 163 */                               if (obj3.equals(objArrCopyOf[i12])) {
/* 165 */                                   int i13 = i12 ^ 1;
/* 169 */                                   Object obj5 = objArrCopyOf[i13];
/* 171 */                                   Objects.requireNonNull(obj5);
/* 174 */                                   iOl1loOO11o iol1looo11o = new iOl1loOO11o(obj3, obj4, obj5);
/* 177 */                                   objArrCopyOf[i13] = obj4;
/* 179 */                                   obj2 = iol1looo11o;
                                            break;
                                        }
/* 187 */                               iI00000oIO = i11 + 1;
/* 189 */                               z5 = z2;
/* 191 */                               i5 = i3;
                                    }
                                }
/* 180 */                       i7++;
/* 182 */                       z5 = z2;
/* 184 */                       i5 = i3;
                            }
/* 194 */                   z = z5;
/* 196 */                   i2 = i5;
/* 198 */                   if (i8 == i4) {
/* 200 */                       c = 2;
/* 202 */                       obj = bArr;
                                r16 = z;
/* 441 */                       z3 = obj instanceof Object[];
                                Object obj6 = obj;
/* 443 */                       if (z3) {
/* 445 */                           Object[] objArr2 = (Object[]) obj;
/* 449 */                           iOl1loOO11o iol1looo11o2 = (iOl1loOO11o) objArr2[c];
/* 451 */                           if (i00Ol00 == null) {
/* 478 */                               throw iol1looo11o2.I00000oIO();
                                    }
/* 453 */                           i00Ol00.I0000O = iol1looo11o2;
/* 455 */                           Object obj7 = objArr2[r16];
/* 461 */                           int iIntValue = ((Integer) objArr2[i2]).intValue();
/* 467 */                           objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 471 */                           obj6 = obj7;
/* 472 */                           i4 = iIntValue;
                                }
/* 481 */                       return new iiO111IOo(obj6, objArrCopyOf, i4);
                            }
/* 205 */                   sArr = new Object[3];
/* 207 */                   sArr[z ? 1 : 0] = bArr;
/* 213 */                   sArr[i2] = Integer.valueOf(i8);
/* 215 */                   sArr[2] = obj2;
/* 217 */                   obj2 = sArr;
                            z4 = z;
                        } else {
/* 220 */                   z = false;
/* 222 */                   i2 = 1;
/* 227 */                   if (iI0000Il00O > 32768) {
/* 333 */                       int[] iArr = new int[iI0000Il00O];
/* 335 */                       Arrays.fill(iArr, -1);
/* 338 */                       int i14 = 0;
/* 340 */                       int i15 = 0;
/* 341 */                       while (i14 < i4) {
/* 343 */                           int i16 = i15 + i15;
/* 345 */                           int i17 = i14 + i14;
/* 347 */                           Object obj8 = objArrCopyOf[i17];
/* 349 */                           Objects.requireNonNull(obj8);
/* 354 */                           Object obj9 = objArrCopyOf[i17 ^ 1];
/* 356 */                           Objects.requireNonNull(obj9);
/* 363 */                           int iI00000oIO2 = liiliO.I00000oIO(obj8.hashCode());
                                    while (true) {
/* 367 */                               int i18 = iI00000oIO2 & i6;
/* 368 */                               int i19 = iArr[i18];
/* 370 */                               if (i19 == -1) {
/* 372 */                                   iArr[i18] = i16;
/* 374 */                                   if (i15 < i14) {
/* 376 */                                       objArrCopyOf[i16] = obj8;
/* 380 */                                       objArrCopyOf[i16 ^ 1] = obj9;
                                            }
/* 382 */                                   i15++;
/* 384 */                                   c2 = c3;
                                        } else {
/* 387 */                                   c2 = c3;
/* 395 */                                   if (obj8.equals(objArrCopyOf[i19])) {
/* 397 */                                       int i20 = i19 ^ 1;
/* 401 */                                       Object obj10 = objArrCopyOf[i20];
/* 403 */                                       Objects.requireNonNull(obj10);
/* 406 */                                       iOl1loOO11o iol1looo11o3 = new iOl1loOO11o(obj8, obj9, obj10);
/* 409 */                                       objArrCopyOf[i20] = obj9;
/* 411 */                                       obj2 = iol1looo11o3;
                                                break;
                                            }
/* 417 */                                   iI00000oIO2 = i18 + 1;
/* 419 */                                   c3 = c2;
                                        }
                                    }
/* 412 */                           i14++;
/* 414 */                           c3 = c2;
                                }
/* 422 */                       c = c3;
/* 424 */                       if (i15 == i4) {
/* 426 */                           obj = iArr;
                                    r16 = z;
                                } else {
/* 428 */                           Object[] objArr3 = new Object[3];
/* 430 */                           objArr3[0] = iArr;
/* 436 */                           objArr3[1] = Integer.valueOf(i15);
/* 438 */                           objArr3[c] = obj2;
/* 440 */                           obj = objArr3;
                                    r16 = z;
                                }
/* 441 */                       z3 = obj instanceof Object[];
                                Object obj62 = obj;
/* 443 */                       if (z3) {
                                }
/* 481 */                       return new iiO111IOo(obj62, objArrCopyOf, i4);
                            }
/* 229 */                   sArr = new short[iI0000Il00O];
/* 231 */                   Arrays.fill(sArr, (short) -1);
/* 236 */                   int i21 = 0;
/* 237 */                   for (int i22 = 0; i22 < i4; i22++) {
/* 239 */                       int i23 = i21 + i21;
/* 241 */                       int i24 = i22 + i22;
/* 243 */                       Object obj11 = objArrCopyOf[i24];
/* 245 */                       Objects.requireNonNull(obj11);
/* 250 */                       Object obj12 = objArrCopyOf[i24 ^ 1];
/* 252 */                       Objects.requireNonNull(obj12);
/* 259 */                       int iI00000oIO3 = liiliO.I00000oIO(obj11.hashCode());
                                while (true) {
/* 263 */                           int i25 = iI00000oIO3 & i6;
/* 266 */                           char c4 = (char) sArr[i25];
/* 270 */                           if (c4 == 65535) {
/* 273 */                               sArr[i25] = (short) i23;
/* 275 */                               if (i21 < i22) {
/* 277 */                                   objArrCopyOf[i23] = obj11;
/* 281 */                                   objArrCopyOf[i23 ^ 1] = obj12;
                                        }
/* 283 */                               i21++;
                                    } else {
/* 292 */                               if (obj11.equals(objArrCopyOf[c4])) {
/* 294 */                                   int i26 = c4 ^ 1;
/* 298 */                                   Object obj13 = objArrCopyOf[i26];
/* 300 */                                   Objects.requireNonNull(obj13);
/* 303 */                                   iOl1loOO11o iol1looo11o4 = new iOl1loOO11o(obj11, obj12, obj13);
/* 306 */                                   objArrCopyOf[i26] = obj12;
/* 308 */                                   obj2 = iol1looo11o4;
                                            break;
                                        }
/* 312 */                               iI00000oIO3 = i25 + 1;
                                    }
                                }
                            }
/* 315 */                   if (i21 == i4) {
/* 217 */                       obj2 = sArr;
                                z4 = z;
                            } else {
/* 318 */                       obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                                z4 = z;
                            }
                        }
                    }
/* 88 */            c = 2;
                    obj = obj2;
                    r16 = z4;
/* 441 */           z3 = obj instanceof Object[];
                    Object obj622 = obj;
/* 443 */           if (z3) {
                    }
/* 481 */           return new iiO111IOo(obj622, objArrCopyOf, i4);
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
/* 53 */                            int iI00000oIO = liiliO.I00000oIO(obj.hashCode());
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
/* 96 */                            int iI00000oIO2 = liiliO.I00000oIO(obj.hashCode());
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
/* 134 */                           int iI00000oIO3 = liiliO.I00000oIO(obj.hashCode());
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
                public final int size() {
/* 1 */             return this.I00ilO0;
                }
            }

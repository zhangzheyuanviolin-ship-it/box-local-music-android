            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class OOoli1l implements Map, Serializable {
                public static final OOoli1l I00ioIO;
                public static final OOoli1l I00l0I0l0lO1;
                public static final OOoli1l I00l0OO0IO;
                public static final OOoli1l I00li1OI;
                public static final OOoli1l I00ll1;
                public static final OOoli1l I00lli11;
                public static final OOoli1l I00lll10;
                public final int I00iOIl;
                public final transient Object I00iiI;
                public final transient Object[] I00iiO;
                public final transient int I00iio;
                public transient AbstractCollection I00ilI0I1;
                public transient AbstractCollection I00ilO0;
                public transient AbstractCollection I00io1l;

                static {
/* 3 */             int i = 0;
/* 7 */             Object obj = null;
/* 11 */            I00ioIO = new OOoli1l(i, 0, obj, new Object[0]);
/* 21 */            I00l0I0l0lO1 = new OOoli1l(i, 1, obj, new Object[0]);
/* 31 */            I00l0OO0IO = new OOoli1l(i, 2, obj, new Object[0]);
/* 41 */            I00li1OI = new OOoli1l(i, 3, obj, new Object[0]);
/* 51 */            I00ll1 = new OOoli1l(i, 4, obj, new Object[0]);
/* 61 */            I00lli11 = new OOoli1l(i, 5, obj, new Object[0]);
/* 71 */            I00lll10 = new OOoli1l(i, 6, obj, new Object[0]);
                }

                public OOoli1l(int i, int i2, Object obj, Object[] objArr) {
/* 1 */             this.I00iOIl = i2;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = objArr;
/* 7 */             this.I00iio = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
                public static OOoli1l I00000oIO(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    int i2;
                    char c;
                    short[] sArr;
                    byte[] bArr;
                    int i3;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 9 */                 return I00ioIO;
                    }
/* 12 */            Object ioilo1l = null;
/* 13 */            int i5 = 0;
/* 14 */            int i6 = 1;
/* 15 */            if (i4 == 1) {
/* 19 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 24 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 29 */                return new OOoli1l(i6, i5, ioilo1l, objArrCopyOf);
                    }
/* 35 */            lII0I0I01I1l.I000II(i4, objArrCopyOf.length >> 1);
/* 38 */            int iI000lI = Ioio0O.I000lI(i4);
/* 42 */            if (i4 == 1) {
/* 46 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 51 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 54 */                i2 = 1;
/* 56 */                c = 2;
                    } else {
                        int i7 = iI000lI - 1;
/* 65 */                char c2 = 65535;
/* 66 */                if (iI000lI <= 128) {
/* 68 */                    byte[] bArr2 = new byte[iI000lI];
/* 70 */                    Arrays.fill(bArr2, (byte) -1);
/* 73 */                    int i8 = 0;
/* 74 */                    int i9 = 0;
/* 75 */                    while (i8 < i4) {
/* 77 */                        int i10 = i8 * 2;
/* 79 */                        int i11 = i9 * 2;
/* 81 */                        Object obj = objArrCopyOf[i10];
/* 83 */                        Objects.requireNonNull(obj);
/* 87 */                        Object obj2 = objArrCopyOf[i10 ^ i6];
/* 89 */                        Objects.requireNonNull(obj2);
/* 96 */                        int iI00000oIO = illii0liI.I00000oIO(obj.hashCode());
                                while (true) {
/* 100 */                           int i12 = iI00000oIO & i7;
/* 101 */                           i3 = i6;
/* 109 */                           int i13 = bArr2[i12] & 255;
/* 110 */                           if (i13 == 255) {
/* 113 */                               bArr2[i12] = (byte) i11;
/* 115 */                               if (i9 < i8) {
/* 117 */                                   objArrCopyOf[i11] = obj;
/* 121 */                                   objArrCopyOf[i11 ^ 1] = obj2;
                                        }
/* 123 */                               i9++;
                                    } else {
/* 132 */                               if (obj.equals(objArrCopyOf[i13])) {
/* 136 */                                   int i14 = i13 ^ 1;
/* 138 */                                   Object obj3 = objArrCopyOf[i14];
/* 140 */                                   Objects.requireNonNull(obj3);
/* 143 */                                   ioilo1l = new Ioilo1l(obj, obj2, obj3);
/* 146 */                                   objArrCopyOf[i14] = obj2;
                                            break;
                                        }
/* 153 */                               iI00000oIO = i12 + 1;
/* 155 */                               i6 = i3;
                                    }
                                }
/* 148 */                       i8++;
/* 150 */                       i6 = i3;
                            }
/* 158 */                   i2 = i6;
/* 160 */                   c = 2;
                            bArr = bArr2;
/* 162 */                   if (i9 != i4) {
/* 167 */                       sArr = new Object[3];
/* 169 */                       sArr[0] = bArr2;
/* 175 */                       sArr[i2] = Integer.valueOf(i9);
/* 177 */                       sArr[2] = ioilo1l;
/* 179 */                       ioilo1l = sArr;
                            }
/* 164 */                   ioilo1l = bArr;
                        } else {
/* 182 */                   i2 = 1;
/* 184 */                   c = 2;
/* 189 */                   if (iI000lI <= 32768) {
/* 191 */                       sArr = new short[iI000lI];
/* 193 */                       Arrays.fill(sArr, (short) -1);
/* 197 */                       int i15 = 0;
/* 198 */                       for (int i16 = 0; i16 < i4; i16++) {
/* 200 */                           int i17 = i16 * 2;
/* 202 */                           int i18 = i15 * 2;
/* 204 */                           Object obj4 = objArrCopyOf[i17];
/* 206 */                           Objects.requireNonNull(obj4);
/* 211 */                           Object obj5 = objArrCopyOf[i17 ^ 1];
/* 213 */                           Objects.requireNonNull(obj5);
/* 220 */                           int iI00000oIO2 = illii0liI.I00000oIO(obj4.hashCode());
                                    while (true) {
/* 224 */                               int i19 = iI00000oIO2 & i7;
/* 230 */                               int i20 = sArr[i19] & 65535;
/* 231 */                               if (i20 == 65535) {
/* 234 */                                   sArr[i19] = (short) i18;
/* 236 */                                   if (i15 < i16) {
/* 238 */                                       objArrCopyOf[i18] = obj4;
/* 242 */                                       objArrCopyOf[i18 ^ 1] = obj5;
                                            }
/* 244 */                                   i15++;
                                        } else {
/* 253 */                                   if (obj4.equals(objArrCopyOf[i20])) {
/* 257 */                                       int i21 = i20 ^ 1;
/* 259 */                                       Object obj6 = objArrCopyOf[i21];
/* 261 */                                       Objects.requireNonNull(obj6);
/* 264 */                                       ioilo1l = new Ioilo1l(obj4, obj5, obj6);
/* 267 */                                       objArrCopyOf[i21] = obj5;
                                                break;
                                            }
/* 272 */                                   iI00000oIO2 = i19 + 1;
                                        }
                                    }
                                }
/* 275 */                       if (i15 != i4) {
/* 278 */                           bArr = new Object[]{sArr, Integer.valueOf(i15), ioilo1l};
/* 164 */                           ioilo1l = bArr;
                                }
/* 179 */                       ioilo1l = sArr;
                            } else {
/* 291 */                       sArr = new int[iI000lI];
/* 293 */                       Arrays.fill((int[]) sArr, -1);
/* 296 */                       int i22 = 0;
/* 297 */                       int i23 = 0;
/* 298 */                       while (i22 < i4) {
/* 300 */                           int i24 = i22 * 2;
/* 302 */                           int i25 = i23 * 2;
/* 304 */                           Object obj7 = objArrCopyOf[i24];
/* 306 */                           Objects.requireNonNull(obj7);
/* 311 */                           Object obj8 = objArrCopyOf[i24 ^ 1];
/* 313 */                           Objects.requireNonNull(obj8);
/* 320 */                           int iI00000oIO3 = illii0liI.I00000oIO(obj7.hashCode());
                                    while (true) {
/* 324 */                               int i26 = iI00000oIO3 & i7;
/* 325 */                               ?? r15 = sArr[i26];
/* 327 */                               if (r15 == c2) {
/* 329 */                                   sArr[i26] = i25;
/* 331 */                                   if (i23 < i22) {
/* 333 */                                       objArrCopyOf[i25] = obj7;
/* 337 */                                       objArrCopyOf[i25 ^ 1] = obj8;
                                            }
/* 339 */                                   i23++;
                                        } else {
/* 348 */                                   if (obj7.equals(objArrCopyOf[r15])) {
/* 352 */                                       int i27 = r15 ^ 1;
/* 354 */                                       Object obj9 = objArrCopyOf[i27];
/* 356 */                                       Objects.requireNonNull(obj9);
/* 359 */                                       ioilo1l = new Ioilo1l(obj7, obj8, obj9);
/* 362 */                                       objArrCopyOf[i27] = obj8;
                                                break;
                                            }
/* 368 */                                   iI00000oIO3 = i26 + 1;
/* 370 */                                   c2 = 65535;
                                        }
                                    }
/* 364 */                           i22++;
/* 366 */                           c2 = 65535;
                                }
/* 372 */                       if (i23 != i4) {
/* 375 */                           bArr = new Object[]{sArr, Integer.valueOf(i23), ioilo1l};
/* 164 */                           ioilo1l = bArr;
                                }
/* 179 */                       ioilo1l = sArr;
                            }
                        }
                    }
/* 389 */           boolean z = ioilo1l instanceof Object[];
                    Object obj10 = ioilo1l;
/* 391 */           if (z) {
/* 393 */               Object[] objArr2 = (Object[]) ioilo1l;
/* 397 */               Ioilo1l ioilo1l2 = (Ioilo1l) objArr2[c];
/* 399 */               if (i00Ol00 == null) {
/* 426 */                   throw ioilo1l2.I00000oIO();
                        }
/* 401 */               i00Ol00.I0000O = ioilo1l2;
/* 403 */               Object obj11 = objArr2[0];
/* 409 */               int iIntValue = ((Integer) objArr2[i2]).intValue();
/* 415 */               objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
/* 419 */               obj10 = obj11;
/* 420 */               i4 = iIntValue;
                    }
/* 429 */           return new OOoli1l(i4, i5, obj10, objArrCopyOf);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r16v5 */
                /* JADX WARN: Type inference failed for: r16v7 */
                /* JADX WARN: Type inference failed for: r16v8 */
                /* JADX WARN: Type inference failed for: r16v9 */
                /* JADX WARN: Type inference failed for: r4v2, types: [int[]] */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
                public static OOoli1l I00000oOI(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    int iI0000Il00O;
                    boolean z;
                    char c;
                    short[] sArr;
                    Object[] objArr2;
                    boolean z2;
                    char c2;
                    ?? r16;
/* 1 */             int i2 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i2 == 0) {
/* 9 */                 return I00l0I0l0lO1;
                    }
/* 12 */            Object obj = null;
/* 13 */            boolean z3 = false;
/* 14 */            int i3 = 1;
/* 15 */            if (i2 == 1) {
/* 19 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 24 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 29 */                return new OOoli1l(i3, i3, obj, objArrCopyOf);
                    }
/* 35 */            ll111i0.I00000oOI(i2, objArrCopyOf.length >> 1);
/* 38 */            char c3 = 2;
/* 39 */            int iMax = Math.max(i2, 2);
/* 46 */            char c4 = 65535;
/* 47 */            if (iMax < 751619276) {
/* 49 */                iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 63 */                while (iI0000Il00O * 0.7d < iMax) {
/* 65 */                    iI0000Il00O += iI0000Il00O;
                        }
                    } else {
/* 67 */                iI0000Il00O = 1073741824;
/* 69 */                if (iMax >= 1073741824) {
/* 471 */                   I000II.I000iOII("collection too large");
/* 12 */                    return null;
                        }
                    }
/* 71 */            if (i2 == 1) {
/* 75 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 80 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 83 */                r16 = 0;
/* 85 */                i2 = 1;
/* 86 */                c = 2;
                    } else {
                        int i4 = iI0000Il00O - 1;
/* 95 */                if (iI0000Il00O <= 128) {
/* 97 */                    byte[] bArr = new byte[iI0000Il00O];
/* 99 */                    Arrays.fill(bArr, (byte) -1);
/* 102 */                   int i5 = 0;
/* 103 */                   int i6 = 0;
/* 104 */                   while (i5 < i2) {
/* 106 */                       int i7 = i6 + i6;
/* 108 */                       int i8 = i5 + i5;
/* 110 */                       Object obj2 = objArrCopyOf[i8];
/* 112 */                       Objects.requireNonNull(obj2);
/* 116 */                       Object obj3 = objArrCopyOf[i8 ^ 1];
/* 118 */                       Objects.requireNonNull(obj3);
/* 125 */                       int iI00000oIO = ll1l0I000OO.I00000oIO(obj2.hashCode());
                                while (true) {
/* 129 */                           int i9 = iI00000oIO & i4;
/* 130 */                           z2 = z3;
/* 134 */                           c2 = c3;
/* 138 */                           int i10 = bArr[i9] & 255;
/* 139 */                           if (i10 == 255) {
/* 142 */                               bArr[i9] = (byte) i7;
/* 144 */                               if (i6 < i5) {
/* 146 */                                   objArrCopyOf[i7] = obj2;
/* 150 */                                   objArrCopyOf[i7 ^ 1] = obj3;
                                        }
/* 152 */                               i6++;
                                    } else {
/* 161 */                               if (obj2.equals(objArrCopyOf[i10])) {
/* 163 */                                   int i11 = i10 ^ 1;
/* 167 */                                   Object obj4 = objArrCopyOf[i11];
/* 169 */                                   Objects.requireNonNull(obj4);
/* 172 */                                   iI1IIi1o11Ol ii1iii1o11ol = new iI1IIi1o11Ol(obj2, obj3, obj4);
/* 175 */                                   objArrCopyOf[i11] = obj3;
/* 177 */                                   obj = ii1iii1o11ol;
                                            break;
                                        }
/* 185 */                               iI00000oIO = i9 + 1;
/* 187 */                               z3 = z2;
/* 189 */                               c3 = c2;
                                    }
                                }
/* 178 */                       i5++;
/* 180 */                       z3 = z2;
/* 182 */                       c3 = c2;
                            }
/* 192 */                   z = z3;
/* 194 */                   c = c3;
/* 196 */                   if (i6 == i2) {
/* 198 */                       obj = bArr;
                                r16 = z;
                            } else {
/* 201 */                       sArr = new Object[3];
/* 203 */                       sArr[z ? 1 : 0] = bArr;
/* 209 */                       sArr[1] = Integer.valueOf(i6);
/* 211 */                       sArr[c] = obj;
/* 213 */                       obj = sArr;
                                r16 = z;
                            }
                        } else {
/* 216 */                   z = false;
/* 218 */                   c = 2;
/* 223 */                   if (iI0000Il00O <= 32768) {
/* 225 */                       sArr = new short[iI0000Il00O];
/* 227 */                       Arrays.fill(sArr, (short) -1);
/* 232 */                       int i12 = 0;
/* 233 */                       for (int i13 = 0; i13 < i2; i13++) {
/* 235 */                           int i14 = i12 + i12;
/* 237 */                           int i15 = i13 + i13;
/* 239 */                           Object obj5 = objArrCopyOf[i15];
/* 241 */                           Objects.requireNonNull(obj5);
/* 245 */                           Object obj6 = objArrCopyOf[i15 ^ 1];
/* 247 */                           Objects.requireNonNull(obj6);
/* 254 */                           int iI00000oIO2 = ll1l0I000OO.I00000oIO(obj5.hashCode());
                                    while (true) {
/* 258 */                               int i16 = iI00000oIO2 & i4;
/* 261 */                               char c5 = (char) sArr[i16];
/* 265 */                               if (c5 == 65535) {
/* 268 */                                   sArr[i16] = (short) i14;
/* 270 */                                   if (i12 < i13) {
/* 272 */                                       objArrCopyOf[i14] = obj5;
/* 276 */                                       objArrCopyOf[i14 ^ 1] = obj6;
                                            }
/* 278 */                                   i12++;
                                        } else {
/* 287 */                                   if (obj5.equals(objArrCopyOf[c5])) {
/* 289 */                                       int i17 = c5 ^ 1;
/* 293 */                                       Object obj7 = objArrCopyOf[i17];
/* 295 */                                       Objects.requireNonNull(obj7);
/* 298 */                                       iI1IIi1o11Ol ii1iii1o11ol2 = new iI1IIi1o11Ol(obj5, obj6, obj7);
/* 301 */                                       objArrCopyOf[i17] = obj6;
/* 303 */                                       obj = ii1iii1o11ol2;
                                                break;
                                            }
/* 307 */                                   iI00000oIO2 = i16 + 1;
                                        }
                                    }
                                }
/* 310 */                       if (i12 != i2) {
/* 313 */                           objArr2 = new Object[]{sArr, Integer.valueOf(i12), obj};
/* 325 */                           obj = objArr2;
                                    r16 = z;
                                }
/* 213 */                       obj = sArr;
                                r16 = z;
                            } else {
/* 327 */                       sArr = new int[iI0000Il00O];
/* 329 */                       Arrays.fill((int[]) sArr, -1);
/* 332 */                       int i18 = 0;
/* 334 */                       int i19 = 0;
/* 335 */                       while (i18 < i2) {
/* 337 */                           int i20 = i19 + i19;
/* 339 */                           int i21 = i18 + i18;
/* 341 */                           Object obj8 = objArrCopyOf[i21];
/* 343 */                           Objects.requireNonNull(obj8);
/* 347 */                           Object obj9 = objArrCopyOf[i21 ^ 1];
/* 349 */                           Objects.requireNonNull(obj9);
/* 356 */                           int iI00000oIO3 = ll1l0I000OO.I00000oIO(obj8.hashCode());
                                    while (true) {
/* 360 */                               int i22 = iI00000oIO3 & i4;
/* 361 */                               ?? r15 = sArr[i22];
/* 363 */                               if (r15 == c4) {
/* 365 */                                   sArr[i22] = i20;
/* 367 */                                   if (i19 < i18) {
/* 369 */                                       objArrCopyOf[i20] = obj8;
/* 373 */                                       objArrCopyOf[i20 ^ 1] = obj9;
                                            }
/* 375 */                                   i19++;
                                        } else {
/* 384 */                                   if (obj8.equals(objArrCopyOf[r15])) {
/* 386 */                                       int i23 = r15 ^ 1;
/* 390 */                                       Object obj10 = objArrCopyOf[i23];
/* 392 */                                       Objects.requireNonNull(obj10);
/* 395 */                                       iI1IIi1o11Ol ii1iii1o11ol3 = new iI1IIi1o11Ol(obj8, obj9, obj10);
/* 398 */                                       objArrCopyOf[i23] = obj9;
/* 400 */                                       obj = ii1iii1o11ol3;
                                                break;
                                            }
/* 405 */                                   iI00000oIO3 = i22 + 1;
/* 407 */                                   c4 = 65535;
                                        }
                                    }
/* 401 */                           i18++;
/* 403 */                           c4 = 65535;
                                }
/* 409 */                       if (i19 != i2) {
/* 412 */                           objArr2 = new Object[]{sArr, Integer.valueOf(i19), obj};
/* 325 */                           obj = objArr2;
                                    r16 = z;
                                }
/* 213 */                       obj = sArr;
                                r16 = z;
                            }
                        }
                    }
/* 425 */           boolean z4 = obj instanceof Object[];
                    Object obj11 = obj;
/* 427 */           if (z4) {
/* 429 */               Object[] objArr3 = (Object[]) obj;
/* 433 */               iI1IIi1o11Ol ii1iii1o11ol4 = (iI1IIi1o11Ol) objArr3[c];
/* 435 */               if (i00Ol00 == null) {
/* 462 */                   throw ii1iii1o11ol4.I00000oIO();
                        }
/* 437 */               i00Ol00.I0000O = ii1iii1o11ol4;
/* 439 */               Object obj12 = objArr3[r16];
/* 445 */               int iIntValue = ((Integer) objArr3[1]).intValue();
/* 451 */               objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 455 */               obj11 = obj12;
/* 456 */               i2 = iIntValue;
                    }
/* 465 */           return new OOoli1l(i2, i3, obj11, objArrCopyOf);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
                /* JADX WARN: Type inference failed for: r16v10 */
                /* JADX WARN: Type inference failed for: r16v11 */
                /* JADX WARN: Type inference failed for: r16v12 */
                /* JADX WARN: Type inference failed for: r16v13 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OOoli1l I0000Il00O(int i, Object[] objArr, I00Ol00 i00Ol00) {
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
/* 9 */                 return I00li1OI;
                    }
/* 12 */            int i5 = 3;
/* 13 */            Object obj2 = null;
/* 14 */            boolean z5 = false;
/* 15 */            int i6 = 1;
/* 16 */            if (i4 == 1) {
/* 20 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 25 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 30 */                return new OOoli1l(i6, i5, obj2, objArrCopyOf);
                    }
/* 36 */            lio0looOIII0.I00000oOI(i4, objArrCopyOf.length >> 1);
/* 39 */            char c3 = 2;
/* 40 */            int iMax = Math.max(i4, 2);
/* 48 */            if (iMax < 751619276) {
/* 50 */                iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 64 */                while (iI0000Il00O * 0.7d < iMax) {
/* 66 */                    iI0000Il00O += iI0000Il00O;
                        }
                    } else {
/* 68 */                iI0000Il00O = 1073741824;
/* 70 */                if (iMax >= 1073741824) {
/* 487 */                   I000II.I000iOII("collection too large");
/* 13 */                    return null;
                        }
                    }
/* 72 */            if (i4 == 1) {
/* 76 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 81 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 84 */                z4 = false;
/* 86 */                i4 = 1;
/* 87 */                i2 = 1;
                    } else {
                        int i7 = iI0000Il00O - 1;
/* 97 */                if (iI0000Il00O <= 128) {
/* 99 */                    byte[] bArr = new byte[iI0000Il00O];
/* 101 */                   Arrays.fill(bArr, (byte) -1);
/* 104 */                   int i8 = 0;
/* 105 */                   int i9 = 0;
/* 106 */                   while (i8 < i4) {
/* 108 */                       int i10 = i9 + i9;
/* 110 */                       int i11 = i8 + i8;
/* 112 */                       Object obj3 = objArrCopyOf[i11];
/* 114 */                       Objects.requireNonNull(obj3);
/* 118 */                       Object obj4 = objArrCopyOf[i11 ^ i6];
/* 120 */                       Objects.requireNonNull(obj4);
/* 127 */                       int iI00000oIO = lioI0OiO.I00000oIO(obj3.hashCode());
                                while (true) {
/* 131 */                           int i12 = iI00000oIO & i7;
/* 132 */                           z2 = z5;
/* 136 */                           i3 = i6;
/* 140 */                           int i13 = bArr[i12] & 255;
/* 141 */                           if (i13 == 255) {
/* 144 */                               bArr[i12] = (byte) i10;
/* 146 */                               if (i9 < i8) {
/* 148 */                                   objArrCopyOf[i10] = obj3;
/* 152 */                                   objArrCopyOf[i10 ^ 1] = obj4;
                                        }
/* 154 */                               i9++;
                                    } else {
/* 163 */                               if (obj3.equals(objArrCopyOf[i13])) {
/* 165 */                                   int i14 = i13 ^ 1;
/* 169 */                                   Object obj5 = objArrCopyOf[i14];
/* 171 */                                   Objects.requireNonNull(obj5);
/* 174 */                                   io0i1oI io0i1oi = new io0i1oI(obj3, obj4, obj5);
/* 177 */                                   objArrCopyOf[i14] = obj4;
/* 179 */                                   obj2 = io0i1oi;
                                            break;
                                        }
/* 187 */                               iI00000oIO = i12 + 1;
/* 189 */                               z5 = z2;
/* 191 */                               i6 = i3;
                                    }
                                }
/* 180 */                       i8++;
/* 182 */                       z5 = z2;
/* 184 */                       i6 = i3;
                            }
/* 194 */                   z = z5;
/* 196 */                   i2 = i6;
/* 198 */                   if (i9 == i4) {
/* 200 */                       c = 2;
/* 202 */                       obj = bArr;
                                r16 = z;
/* 441 */                       z3 = obj instanceof Object[];
                                Object obj6 = obj;
/* 443 */                       if (z3) {
/* 445 */                           Object[] objArr2 = (Object[]) obj;
/* 449 */                           io0i1oI io0i1oi2 = (io0i1oI) objArr2[c];
/* 451 */                           if (i00Ol00 == null) {
/* 478 */                               throw io0i1oi2.I00000oIO();
                                    }
/* 453 */                           i00Ol00.I0000O = io0i1oi2;
/* 455 */                           Object obj7 = objArr2[r16];
/* 461 */                           int iIntValue = ((Integer) objArr2[i2]).intValue();
/* 467 */                           objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 471 */                           obj6 = obj7;
/* 472 */                           i4 = iIntValue;
                                }
/* 481 */                       return new OOoli1l(i4, i5, obj6, objArrCopyOf);
                            }
/* 205 */                   sArr = new Object[3];
/* 207 */                   sArr[z ? 1 : 0] = bArr;
/* 213 */                   sArr[i2] = Integer.valueOf(i9);
/* 215 */                   sArr[2] = obj2;
/* 217 */                   obj2 = sArr;
                            z4 = z;
                        } else {
/* 220 */                   z = false;
/* 222 */                   i2 = 1;
/* 227 */                   if (iI0000Il00O > 32768) {
/* 333 */                       int[] iArr = new int[iI0000Il00O];
/* 335 */                       Arrays.fill(iArr, -1);
/* 338 */                       int i15 = 0;
/* 340 */                       int i16 = 0;
/* 341 */                       while (i15 < i4) {
/* 343 */                           int i17 = i16 + i16;
/* 345 */                           int i18 = i15 + i15;
/* 347 */                           Object obj8 = objArrCopyOf[i18];
/* 349 */                           Objects.requireNonNull(obj8);
/* 354 */                           Object obj9 = objArrCopyOf[i18 ^ 1];
/* 356 */                           Objects.requireNonNull(obj9);
/* 363 */                           int iI00000oIO2 = lioI0OiO.I00000oIO(obj8.hashCode());
                                    while (true) {
/* 367 */                               int i19 = iI00000oIO2 & i7;
/* 368 */                               int i20 = iArr[i19];
/* 370 */                               if (i20 == -1) {
/* 372 */                                   iArr[i19] = i17;
/* 374 */                                   if (i16 < i15) {
/* 376 */                                       objArrCopyOf[i17] = obj8;
/* 380 */                                       objArrCopyOf[i17 ^ 1] = obj9;
                                            }
/* 382 */                                   i16++;
/* 384 */                                   c2 = c3;
                                        } else {
/* 387 */                                   c2 = c3;
/* 395 */                                   if (obj8.equals(objArrCopyOf[i20])) {
/* 397 */                                       int i21 = i20 ^ 1;
/* 401 */                                       Object obj10 = objArrCopyOf[i21];
/* 403 */                                       Objects.requireNonNull(obj10);
/* 406 */                                       io0i1oI io0i1oi3 = new io0i1oI(obj8, obj9, obj10);
/* 409 */                                       objArrCopyOf[i21] = obj9;
/* 411 */                                       obj2 = io0i1oi3;
                                                break;
                                            }
/* 417 */                                   iI00000oIO2 = i19 + 1;
/* 419 */                                   c3 = c2;
                                        }
                                    }
/* 412 */                           i15++;
/* 414 */                           c3 = c2;
                                }
/* 422 */                       c = c3;
/* 424 */                       if (i16 == i4) {
/* 426 */                           obj = iArr;
                                    r16 = z;
                                } else {
/* 428 */                           Object[] objArr3 = new Object[3];
/* 430 */                           objArr3[0] = iArr;
/* 436 */                           objArr3[1] = Integer.valueOf(i16);
/* 438 */                           objArr3[c] = obj2;
/* 440 */                           obj = objArr3;
                                    r16 = z;
                                }
/* 441 */                       z3 = obj instanceof Object[];
                                Object obj62 = obj;
/* 443 */                       if (z3) {
                                }
/* 481 */                       return new OOoli1l(i4, i5, obj62, objArrCopyOf);
                            }
/* 229 */                   sArr = new short[iI0000Il00O];
/* 231 */                   Arrays.fill(sArr, (short) -1);
/* 236 */                   int i22 = 0;
/* 237 */                   for (int i23 = 0; i23 < i4; i23++) {
/* 239 */                       int i24 = i22 + i22;
/* 241 */                       int i25 = i23 + i23;
/* 243 */                       Object obj11 = objArrCopyOf[i25];
/* 245 */                       Objects.requireNonNull(obj11);
/* 250 */                       Object obj12 = objArrCopyOf[i25 ^ 1];
/* 252 */                       Objects.requireNonNull(obj12);
/* 259 */                       int iI00000oIO3 = lioI0OiO.I00000oIO(obj11.hashCode());
                                while (true) {
/* 263 */                           int i26 = iI00000oIO3 & i7;
/* 266 */                           char c4 = (char) sArr[i26];
/* 270 */                           if (c4 == 65535) {
/* 273 */                               sArr[i26] = (short) i24;
/* 275 */                               if (i22 < i23) {
/* 277 */                                   objArrCopyOf[i24] = obj11;
/* 281 */                                   objArrCopyOf[i24 ^ 1] = obj12;
                                        }
/* 283 */                               i22++;
                                    } else {
/* 292 */                               if (obj11.equals(objArrCopyOf[c4])) {
/* 294 */                                   int i27 = c4 ^ 1;
/* 298 */                                   Object obj13 = objArrCopyOf[i27];
/* 300 */                                   Objects.requireNonNull(obj13);
/* 303 */                                   io0i1oI io0i1oi4 = new io0i1oI(obj11, obj12, obj13);
/* 306 */                                   objArrCopyOf[i27] = obj12;
/* 308 */                                   obj2 = io0i1oi4;
                                            break;
                                        }
/* 312 */                               iI00000oIO3 = i26 + 1;
                                    }
                                }
                            }
/* 315 */                   if (i22 == i4) {
/* 217 */                       obj2 = sArr;
                                z4 = z;
                            } else {
/* 318 */                       obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
                                z4 = z;
                            }
                        }
                    }
/* 89 */            c = 2;
                    obj = obj2;
                    r16 = z4;
/* 441 */           z3 = obj instanceof Object[];
                    Object obj622 = obj;
/* 443 */           if (z3) {
                    }
/* 481 */           return new OOoli1l(i4, i5, obj622, objArrCopyOf);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r17v10 */
                /* JADX WARN: Type inference failed for: r17v11 */
                /* JADX WARN: Type inference failed for: r17v3 */
                /* JADX WARN: Type inference failed for: r17v8 */
                /* JADX WARN: Type inference failed for: r17v9 */
                /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OOoli1l I0000O(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    int iI0000Il00O;
                    int i2;
                    char c;
                    short[] sArr;
                    Object[] objArr2;
                    char c2;
                    boolean z;
                    int i3;
                    ?? r17;
                    boolean z2;
                    boolean z3;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 9 */                 return I00ll1;
                    }
/* 12 */            int i5 = 4;
/* 13 */            Object obj = null;
/* 14 */            boolean z4 = false;
/* 15 */            int i6 = 1;
/* 16 */            if (i4 == 1) {
/* 20 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 25 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 30 */                return new OOoli1l(i6, i5, obj, objArrCopyOf);
                    }
/* 36 */            lio1I001.I00000oOI(i4, objArrCopyOf.length >> 1);
/* 39 */            char c3 = 2;
/* 40 */            int iMax = Math.max(i4, 2);
/* 47 */            char c4 = 65535;
/* 48 */            if (iMax < 751619276) {
/* 50 */                iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 64 */                while (iI0000Il00O * 0.7d < iMax) {
/* 66 */                    iI0000Il00O += iI0000Il00O;
                        }
                    } else {
/* 68 */                iI0000Il00O = 1073741824;
/* 70 */                if (iMax >= 1073741824) {
/* 491 */                   I000II.I000iOII("collection too large");
/* 13 */                    return null;
                        }
                    }
/* 72 */            if (i4 != 1) {
                        int i7 = iI0000Il00O - 1;
/* 98 */                if (iI0000Il00O <= 128) {
/* 100 */                   byte[] bArr = new byte[iI0000Il00O];
/* 102 */                   Arrays.fill(bArr, (byte) -1);
/* 105 */                   int i8 = 0;
/* 106 */                   int i9 = 0;
/* 107 */                   while (i8 < i4) {
/* 109 */                       int i10 = i9 + i9;
/* 111 */                       int i11 = i8 + i8;
/* 113 */                       Object obj2 = objArrCopyOf[i11];
/* 115 */                       Objects.requireNonNull(obj2);
/* 119 */                       Object obj3 = objArrCopyOf[i11 ^ i6];
/* 121 */                       Objects.requireNonNull(obj3);
/* 128 */                       int iI00000oIO = lioI1oll11II.I00000oIO(obj2.hashCode());
                                while (true) {
/* 132 */                           int i12 = iI00000oIO & i7;
/* 134 */                           z = z4;
/* 138 */                           i3 = i6;
/* 142 */                           int i13 = bArr[i12] & 255;
/* 143 */                           if (i13 == 255) {
/* 146 */                               bArr[i12] = (byte) i10;
/* 148 */                               if (i9 < i8) {
/* 150 */                                   objArrCopyOf[i10] = obj2;
/* 154 */                                   objArrCopyOf[i10 ^ 1] = obj3;
                                        }
/* 156 */                               i9++;
                                    } else {
/* 165 */                               if (obj2.equals(objArrCopyOf[i13])) {
/* 167 */                                   int i14 = i13 ^ 1;
/* 171 */                                   Object obj4 = objArrCopyOf[i14];
/* 173 */                                   Objects.requireNonNull(obj4);
/* 176 */                                   io0iII11O io0iii11o = new io0iII11O(obj2, obj3, obj4);
/* 179 */                                   objArrCopyOf[i14] = obj3;
/* 181 */                                   obj = io0iii11o;
                                            break;
                                        }
/* 189 */                               iI00000oIO = i12 + 1;
/* 191 */                               z4 = z;
/* 193 */                               i6 = i3;
                                    }
                                }
/* 182 */                       i8++;
/* 184 */                       z4 = z;
/* 186 */                       i6 = i3;
                            }
/* 196 */                   boolean z5 = z4;
/* 198 */                   i2 = i6;
/* 200 */                   if (i9 == i4) {
/* 202 */                       c = 2;
/* 204 */                       obj = bArr;
                                r17 = z5;
                            } else {
/* 207 */                       Object[] objArr3 = new Object[3];
/* 209 */                       objArr3[z5 ? 1 : 0] = bArr;
/* 215 */                       objArr3[i2] = Integer.valueOf(i9);
/* 217 */                       objArr3[2] = obj;
/* 219 */                       obj = objArr3;
                                z3 = z5;
                            }
                        } else {
/* 222 */                   boolean z6 = false;
/* 224 */                   i2 = 1;
/* 229 */                   if (iI0000Il00O <= 32768) {
/* 231 */                       sArr = new short[iI0000Il00O];
/* 233 */                       Arrays.fill(sArr, (short) -1);
/* 236 */                       int i15 = 0;
/* 238 */                       int i16 = 0;
/* 239 */                       while (i15 < i4) {
/* 241 */                           int i17 = i16 + i16;
/* 243 */                           int i18 = i15 + i15;
/* 245 */                           Object obj5 = objArrCopyOf[i18];
/* 247 */                           Objects.requireNonNull(obj5);
/* 252 */                           Object obj6 = objArrCopyOf[i18 ^ 1];
/* 254 */                           Objects.requireNonNull(obj6);
/* 261 */                           int iI00000oIO2 = lioI1oll11II.I00000oIO(obj5.hashCode());
                                    while (true) {
/* 265 */                               int i19 = iI00000oIO2 & i7;
/* 268 */                               char c5 = (char) sArr[i19];
/* 269 */                               c2 = c3;
/* 274 */                               if (c5 == 65535) {
/* 277 */                                   sArr[i19] = (short) i17;
/* 279 */                                   if (i16 < i15) {
/* 281 */                                       objArrCopyOf[i17] = obj5;
/* 285 */                                       objArrCopyOf[i17 ^ 1] = obj6;
                                            }
/* 287 */                                   i16++;
                                        } else {
/* 296 */                                   if (obj5.equals(objArrCopyOf[c5])) {
/* 298 */                                       int i20 = c5 ^ 1;
/* 302 */                                       Object obj7 = objArrCopyOf[i20];
/* 304 */                                       Objects.requireNonNull(obj7);
/* 307 */                                       io0iII11O io0iii11o2 = new io0iII11O(obj5, obj6, obj7);
/* 310 */                                       objArrCopyOf[i20] = obj6;
/* 312 */                                       obj = io0iii11o2;
                                                break;
                                            }
/* 318 */                                   iI00000oIO2 = i19 + 1;
/* 320 */                                   c3 = c2;
                                        }
                                    }
/* 313 */                           i15++;
/* 315 */                           c3 = c2;
                                }
/* 323 */                       c = c3;
/* 325 */                       if (i16 != i4) {
/* 330 */                           Object[] objArr4 = new Object[3];
/* 332 */                           objArr4[0] = sArr;
/* 338 */                           objArr4[1] = Integer.valueOf(i16);
/* 340 */                           objArr4[c] = obj;
                                    objArr2 = objArr4;
/* 342 */                           obj = objArr2;
                                    r17 = z6;
                                }
/* 327 */                       obj = sArr;
                                r17 = z6;
                            } else {
/* 344 */                       c = 2;
/* 346 */                       sArr = new int[iI0000Il00O];
/* 348 */                       Arrays.fill((int[]) sArr, -1);
/* 351 */                       int i21 = 0;
/* 353 */                       int i22 = 0;
/* 354 */                       while (i21 < i4) {
/* 356 */                           int i23 = i22 + i22;
/* 358 */                           int i24 = i21 + i21;
/* 360 */                           Object obj8 = objArrCopyOf[i24];
/* 362 */                           Objects.requireNonNull(obj8);
/* 367 */                           Object obj9 = objArrCopyOf[i24 ^ 1];
/* 369 */                           Objects.requireNonNull(obj9);
/* 376 */                           int iI00000oIO3 = lioI1oll11II.I00000oIO(obj8.hashCode());
                                    while (true) {
/* 380 */                               int i25 = iI00000oIO3 & i7;
/* 381 */                               ?? r15 = sArr[i25];
/* 383 */                               if (r15 == c4) {
/* 385 */                                   sArr[i25] = i23;
/* 387 */                                   if (i22 < i21) {
/* 389 */                                       objArrCopyOf[i23] = obj8;
/* 393 */                                       objArrCopyOf[i23 ^ 1] = obj9;
                                            }
/* 395 */                                   i22++;
                                        } else {
/* 404 */                                   if (obj8.equals(objArrCopyOf[r15])) {
/* 406 */                                       int i26 = r15 ^ 1;
/* 410 */                                       Object obj10 = objArrCopyOf[i26];
/* 412 */                                       Objects.requireNonNull(obj10);
/* 415 */                                       io0iII11O io0iii11o3 = new io0iII11O(obj8, obj9, obj10);
/* 418 */                                       objArrCopyOf[i26] = obj9;
/* 420 */                                       obj = io0iii11o3;
                                                break;
                                            }
/* 425 */                                   iI00000oIO3 = i25 + 1;
/* 427 */                                   c4 = 65535;
                                        }
                                    }
/* 421 */                           i21++;
/* 423 */                           c4 = 65535;
                                }
/* 429 */                       if (i22 != i4) {
/* 432 */                           objArr2 = new Object[]{sArr, Integer.valueOf(i22), obj};
/* 342 */                           obj = objArr2;
                                    r17 = z6;
                                }
/* 327 */                       obj = sArr;
                                r17 = z6;
                            }
                        }
/* 445 */               z2 = obj instanceof Object[];
                        Object obj11 = obj;
/* 447 */               if (z2) {
/* 449 */                   Object[] objArr5 = (Object[]) obj;
/* 453 */                   io0iII11O io0iii11o4 = (io0iII11O) objArr5[c];
/* 455 */                   if (i00Ol00 == null) {
/* 482 */                       throw io0iii11o4.I00000oIO();
                            }
/* 457 */                   i00Ol00.I0000O = io0iii11o4;
/* 459 */                   Object obj12 = objArr5[r17];
/* 465 */                   int iIntValue = ((Integer) objArr5[i2]).intValue();
/* 471 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 475 */                   obj11 = obj12;
/* 476 */                   i4 = iIntValue;
                        }
/* 485 */               return new OOoli1l(i4, i5, obj11, objArrCopyOf);
                    }
/* 76 */            Objects.requireNonNull(objArrCopyOf[0]);
/* 81 */            Objects.requireNonNull(objArrCopyOf[1]);
/* 84 */            z3 = false;
/* 86 */            i4 = 1;
/* 87 */            i2 = 1;
/* 89 */            c = 2;
                    r17 = z3;
/* 445 */           z2 = obj instanceof Object[];
                    Object obj112 = obj;
/* 447 */           if (z2) {
                    }
/* 485 */           return new OOoli1l(i4, i5, obj112, objArrCopyOf);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r17v10 */
                /* JADX WARN: Type inference failed for: r17v11 */
                /* JADX WARN: Type inference failed for: r17v3 */
                /* JADX WARN: Type inference failed for: r17v9 */
                /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OOoli1l I000II(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    int i2;
                    char c;
                    short[] sArr;
                    Object[] objArr2;
                    char c2;
                    boolean z;
                    int i3;
                    ?? r17;
                    boolean z2;
                    boolean z3;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 9 */                 return I00lll10;
                    }
/* 12 */            int i5 = 6;
/* 13 */            Object obj = null;
/* 14 */            boolean z4 = false;
/* 15 */            int i6 = 1;
/* 16 */            if (i4 == 1) {
/* 20 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 25 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 30 */                return new OOoli1l(i6, i5, obj, objArrCopyOf);
                    }
/* 36 */            lio00O0OO.I00000oOI(i4, objArrCopyOf.length >> 1);
/* 39 */            int iI001i1O0Ol = ioOoI0l00I.I001i1O0Ol(i4);
/* 43 */            char c3 = 2;
/* 44 */            if (i4 == 1) {
/* 48 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 53 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 56 */                z3 = false;
/* 58 */                i4 = 1;
/* 59 */                i2 = 1;
                    } else {
                        int i7 = iI001i1O0Ol - 1;
/* 70 */                char c4 = 65535;
/* 71 */                if (iI001i1O0Ol > 128) {
/* 192 */                   boolean z5 = false;
/* 194 */                   i2 = 1;
/* 199 */                   if (iI001i1O0Ol <= 32768) {
/* 201 */                       sArr = new short[iI001i1O0Ol];
/* 203 */                       Arrays.fill(sArr, (short) -1);
/* 206 */                       int i8 = 0;
/* 208 */                       int i9 = 0;
/* 209 */                       while (i8 < i4) {
/* 211 */                           int i10 = i9 + i9;
/* 213 */                           int i11 = i8 + i8;
/* 215 */                           Object obj2 = objArrCopyOf[i11];
/* 217 */                           Objects.requireNonNull(obj2);
/* 222 */                           Object obj3 = objArrCopyOf[i11 ^ 1];
/* 224 */                           Objects.requireNonNull(obj3);
/* 231 */                           int iI00000oIO = lioi0il.I00000oIO(obj2.hashCode());
                                    while (true) {
/* 235 */                               int i12 = iI00000oIO & i7;
/* 238 */                               char c5 = (char) sArr[i12];
/* 239 */                               c2 = c3;
/* 244 */                               if (c5 == 65535) {
/* 247 */                                   sArr[i12] = (short) i10;
/* 249 */                                   if (i9 < i8) {
/* 251 */                                       objArrCopyOf[i10] = obj2;
/* 255 */                                       objArrCopyOf[i10 ^ 1] = obj3;
                                            }
/* 257 */                                   i9++;
                                        } else {
/* 266 */                                   if (obj2.equals(objArrCopyOf[c5])) {
/* 268 */                                       int i13 = c5 ^ 1;
/* 272 */                                       Object obj4 = objArrCopyOf[i13];
/* 274 */                                       Objects.requireNonNull(obj4);
/* 277 */                                       ioIlIoooo ioilioooo = new ioIlIoooo(obj2, obj3, obj4);
/* 280 */                                       objArrCopyOf[i13] = obj3;
/* 282 */                                       obj = ioilioooo;
                                                break;
                                            }
/* 288 */                                   iI00000oIO = i12 + 1;
/* 290 */                                   c3 = c2;
                                        }
                                    }
/* 283 */                           i8++;
/* 285 */                           c3 = c2;
                                }
/* 293 */                       c = c3;
/* 295 */                       if (i9 != i4) {
/* 300 */                           Object[] objArr3 = new Object[3];
/* 302 */                           objArr3[0] = sArr;
/* 308 */                           objArr3[1] = Integer.valueOf(i9);
/* 310 */                           objArr3[c] = obj;
                                    objArr2 = objArr3;
/* 312 */                           obj = objArr2;
                                    r17 = z5;
                                }
/* 297 */                       obj = sArr;
                                r17 = z5;
                            } else {
/* 314 */                       c = 2;
/* 316 */                       sArr = new int[iI001i1O0Ol];
/* 318 */                       Arrays.fill((int[]) sArr, -1);
/* 321 */                       int i14 = 0;
/* 323 */                       int i15 = 0;
/* 324 */                       while (i14 < i4) {
/* 326 */                           int i16 = i15 + i15;
/* 328 */                           int i17 = i14 + i14;
/* 330 */                           Object obj5 = objArrCopyOf[i17];
/* 332 */                           Objects.requireNonNull(obj5);
/* 337 */                           Object obj6 = objArrCopyOf[i17 ^ 1];
/* 339 */                           Objects.requireNonNull(obj6);
/* 346 */                           int iI00000oIO2 = lioi0il.I00000oIO(obj5.hashCode());
                                    while (true) {
/* 350 */                               int i18 = iI00000oIO2 & i7;
/* 351 */                               ?? r15 = sArr[i18];
/* 353 */                               if (r15 == c4) {
/* 355 */                                   sArr[i18] = i16;
/* 357 */                                   if (i15 < i14) {
/* 359 */                                       objArrCopyOf[i16] = obj5;
/* 363 */                                       objArrCopyOf[i16 ^ 1] = obj6;
                                            }
/* 365 */                                   i15++;
                                        } else {
/* 374 */                                   if (obj5.equals(objArrCopyOf[r15])) {
/* 376 */                                       int i19 = r15 ^ 1;
/* 380 */                                       Object obj7 = objArrCopyOf[i19];
/* 382 */                                       Objects.requireNonNull(obj7);
/* 385 */                                       ioIlIoooo ioilioooo2 = new ioIlIoooo(obj5, obj6, obj7);
/* 388 */                                       objArrCopyOf[i19] = obj6;
/* 390 */                                       obj = ioilioooo2;
                                                break;
                                            }
/* 395 */                                   iI00000oIO2 = i18 + 1;
/* 397 */                                   c4 = 65535;
                                        }
                                    }
/* 391 */                           i14++;
/* 393 */                           c4 = 65535;
                                }
/* 399 */                       if (i15 != i4) {
/* 402 */                           objArr2 = new Object[]{sArr, Integer.valueOf(i15), obj};
/* 312 */                           obj = objArr2;
                                    r17 = z5;
                                }
/* 297 */                       obj = sArr;
                                r17 = z5;
                            }
/* 415 */                   z2 = obj instanceof Object[];
                            Object obj8 = obj;
/* 417 */                   if (z2) {
/* 419 */                       Object[] objArr4 = (Object[]) obj;
/* 423 */                       ioIlIoooo ioilioooo3 = (ioIlIoooo) objArr4[c];
/* 425 */                       if (i00Ol00 == null) {
/* 452 */                           throw ioilioooo3.I00000oIO();
                                }
/* 427 */                       i00Ol00.I0000O = ioilioooo3;
/* 429 */                       Object obj9 = objArr4[r17];
/* 435 */                       int iIntValue = ((Integer) objArr4[i2]).intValue();
/* 441 */                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 445 */                       obj8 = obj9;
/* 446 */                       i4 = iIntValue;
                            }
/* 455 */                   return new OOoli1l(i4, i5, obj8, objArrCopyOf);
                        }
/* 73 */                byte[] bArr = new byte[iI001i1O0Ol];
/* 75 */                Arrays.fill(bArr, (byte) -1);
/* 78 */                int i20 = 0;
/* 79 */                int i21 = 0;
/* 80 */                while (i20 < i4) {
/* 82 */                    int i22 = i21 + i21;
/* 84 */                    int i23 = i20 + i20;
/* 86 */                    Object obj10 = objArrCopyOf[i23];
/* 88 */                    Objects.requireNonNull(obj10);
/* 92 */                    Object obj11 = objArrCopyOf[i23 ^ i6];
/* 94 */                    Objects.requireNonNull(obj11);
/* 101 */                   int iI00000oIO3 = lioi0il.I00000oIO(obj10.hashCode());
                            while (true) {
/* 105 */                       int i24 = iI00000oIO3 & i7;
/* 107 */                       z = z4;
/* 111 */                       i3 = i6;
/* 115 */                       int i25 = bArr[i24] & 255;
/* 116 */                       if (i25 == 255) {
/* 119 */                           bArr[i24] = (byte) i22;
/* 121 */                           if (i21 < i20) {
/* 123 */                               objArrCopyOf[i22] = obj10;
/* 127 */                               objArrCopyOf[i22 ^ 1] = obj11;
                                    }
/* 129 */                           i21++;
                                } else {
/* 138 */                           if (obj10.equals(objArrCopyOf[i25])) {
/* 140 */                               int i26 = i25 ^ 1;
/* 144 */                               Object obj12 = objArrCopyOf[i26];
/* 146 */                               Objects.requireNonNull(obj12);
/* 149 */                               ioIlIoooo ioilioooo4 = new ioIlIoooo(obj10, obj11, obj12);
/* 152 */                               objArrCopyOf[i26] = obj11;
/* 154 */                               obj = ioilioooo4;
                                        break;
                                    }
/* 162 */                           iI00000oIO3 = i24 + 1;
/* 164 */                           z4 = z;
/* 166 */                           i6 = i3;
                                }
                            }
/* 155 */                   i20++;
/* 157 */                   z4 = z;
/* 159 */                   i6 = i3;
                        }
/* 169 */               boolean z6 = z4;
/* 171 */               i2 = i6;
/* 173 */               if (i21 == i4) {
/* 175 */                   obj = bArr;
                            z3 = z6;
                        } else {
/* 177 */                   Object[] objArr5 = new Object[3];
/* 179 */                   objArr5[z6 ? 1 : 0] = bArr;
/* 185 */                   objArr5[i2] = Integer.valueOf(i21);
/* 187 */                   objArr5[2] = obj;
/* 189 */                   obj = objArr5;
                            z3 = z6;
                        }
                    }
/* 61 */            c = 2;
                    r17 = z3;
/* 415 */           z2 = obj instanceof Object[];
                    Object obj82 = obj;
/* 417 */           if (z2) {
                    }
/* 455 */           return new OOoli1l(i4, i5, obj82, objArrCopyOf);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r17v10 */
                /* JADX WARN: Type inference failed for: r17v11 */
                /* JADX WARN: Type inference failed for: r17v3 */
                /* JADX WARN: Type inference failed for: r17v8 */
                /* JADX WARN: Type inference failed for: r17v9 */
                /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OOoli1l I000O01llI0(int i, Object[] objArr, I00Ol00 i00Ol00) {
                    int iI0000Il00O;
                    int i2;
                    char c;
                    short[] sArr;
                    Object[] objArr2;
                    char c2;
                    boolean z;
                    int i3;
                    ?? r17;
                    boolean z2;
                    boolean z3;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 9 */                 return I00lli11;
                    }
/* 12 */            int i5 = 5;
/* 13 */            Object obj = null;
/* 14 */            boolean z4 = false;
/* 15 */            int i6 = 1;
/* 16 */            if (i4 == 1) {
/* 20 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 25 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 30 */                return new OOoli1l(i6, i5, obj, objArrCopyOf);
                    }
/* 36 */            lio1l10i0I.I00000oOI(i4, objArrCopyOf.length >> 1);
/* 39 */            char c3 = 2;
/* 40 */            int iMax = Math.max(i4, 2);
/* 47 */            char c4 = 65535;
/* 48 */            if (iMax < 751619276) {
/* 50 */                iI0000Il00O = OooioIOo1.I0000Il00O(iMax, -1);
/* 64 */                while (iI0000Il00O * 0.7d < iMax) {
/* 66 */                    iI0000Il00O += iI0000Il00O;
                        }
                    } else {
/* 68 */                iI0000Il00O = 1073741824;
/* 70 */                if (iMax >= 1073741824) {
/* 491 */                   I000II.I000iOII("collection too large");
/* 13 */                    return null;
                        }
                    }
/* 72 */            if (i4 != 1) {
                        int i7 = iI0000Il00O - 1;
/* 98 */                if (iI0000Il00O <= 128) {
/* 100 */                   byte[] bArr = new byte[iI0000Il00O];
/* 102 */                   Arrays.fill(bArr, (byte) -1);
/* 105 */                   int i8 = 0;
/* 106 */                   int i9 = 0;
/* 107 */                   while (i8 < i4) {
/* 109 */                       int i10 = i9 + i9;
/* 111 */                       int i11 = i8 + i8;
/* 113 */                       Object obj2 = objArrCopyOf[i11];
/* 115 */                       Objects.requireNonNull(obj2);
/* 119 */                       Object obj3 = objArrCopyOf[i11 ^ i6];
/* 121 */                       Objects.requireNonNull(obj3);
/* 128 */                       int iI00000oIO = lioOO0l0Iol.I00000oIO(obj2.hashCode());
                                while (true) {
/* 132 */                           int i12 = iI00000oIO & i7;
/* 134 */                           z = z4;
/* 138 */                           i3 = i6;
/* 142 */                           int i13 = bArr[i12] & 255;
/* 143 */                           if (i13 == 255) {
/* 146 */                               bArr[i12] = (byte) i10;
/* 148 */                               if (i9 < i8) {
/* 150 */                                   objArrCopyOf[i10] = obj2;
/* 154 */                                   objArrCopyOf[i10 ^ 1] = obj3;
                                        }
/* 156 */                               i9++;
                                    } else {
/* 165 */                               if (obj2.equals(objArrCopyOf[i13])) {
/* 167 */                                   int i14 = i13 ^ 1;
/* 171 */                                   Object obj4 = objArrCopyOf[i14];
/* 173 */                                   Objects.requireNonNull(obj4);
/* 176 */                                   io11I0O io11i0o = new io11I0O(obj2, obj3, obj4);
/* 179 */                                   objArrCopyOf[i14] = obj3;
/* 181 */                                   obj = io11i0o;
                                            break;
                                        }
/* 189 */                               iI00000oIO = i12 + 1;
/* 191 */                               z4 = z;
/* 193 */                               i6 = i3;
                                    }
                                }
/* 182 */                       i8++;
/* 184 */                       z4 = z;
/* 186 */                       i6 = i3;
                            }
/* 196 */                   boolean z5 = z4;
/* 198 */                   i2 = i6;
/* 200 */                   if (i9 == i4) {
/* 202 */                       c = 2;
/* 204 */                       obj = bArr;
                                r17 = z5;
                            } else {
/* 207 */                       Object[] objArr3 = new Object[3];
/* 209 */                       objArr3[z5 ? 1 : 0] = bArr;
/* 215 */                       objArr3[i2] = Integer.valueOf(i9);
/* 217 */                       objArr3[2] = obj;
/* 219 */                       obj = objArr3;
                                z3 = z5;
                            }
                        } else {
/* 222 */                   boolean z6 = false;
/* 224 */                   i2 = 1;
/* 229 */                   if (iI0000Il00O <= 32768) {
/* 231 */                       sArr = new short[iI0000Il00O];
/* 233 */                       Arrays.fill(sArr, (short) -1);
/* 236 */                       int i15 = 0;
/* 238 */                       int i16 = 0;
/* 239 */                       while (i15 < i4) {
/* 241 */                           int i17 = i16 + i16;
/* 243 */                           int i18 = i15 + i15;
/* 245 */                           Object obj5 = objArrCopyOf[i18];
/* 247 */                           Objects.requireNonNull(obj5);
/* 252 */                           Object obj6 = objArrCopyOf[i18 ^ 1];
/* 254 */                           Objects.requireNonNull(obj6);
/* 261 */                           int iI00000oIO2 = lioOO0l0Iol.I00000oIO(obj5.hashCode());
                                    while (true) {
/* 265 */                               int i19 = iI00000oIO2 & i7;
/* 268 */                               char c5 = (char) sArr[i19];
/* 269 */                               c2 = c3;
/* 274 */                               if (c5 == 65535) {
/* 277 */                                   sArr[i19] = (short) i17;
/* 279 */                                   if (i16 < i15) {
/* 281 */                                       objArrCopyOf[i17] = obj5;
/* 285 */                                       objArrCopyOf[i17 ^ 1] = obj6;
                                            }
/* 287 */                                   i16++;
                                        } else {
/* 296 */                                   if (obj5.equals(objArrCopyOf[c5])) {
/* 298 */                                       int i20 = c5 ^ 1;
/* 302 */                                       Object obj7 = objArrCopyOf[i20];
/* 304 */                                       Objects.requireNonNull(obj7);
/* 307 */                                       io11I0O io11i0o2 = new io11I0O(obj5, obj6, obj7);
/* 310 */                                       objArrCopyOf[i20] = obj6;
/* 312 */                                       obj = io11i0o2;
                                                break;
                                            }
/* 318 */                                   iI00000oIO2 = i19 + 1;
/* 320 */                                   c3 = c2;
                                        }
                                    }
/* 313 */                           i15++;
/* 315 */                           c3 = c2;
                                }
/* 323 */                       c = c3;
/* 325 */                       if (i16 != i4) {
/* 330 */                           Object[] objArr4 = new Object[3];
/* 332 */                           objArr4[0] = sArr;
/* 338 */                           objArr4[1] = Integer.valueOf(i16);
/* 340 */                           objArr4[c] = obj;
                                    objArr2 = objArr4;
/* 342 */                           obj = objArr2;
                                    r17 = z6;
                                }
/* 327 */                       obj = sArr;
                                r17 = z6;
                            } else {
/* 344 */                       c = 2;
/* 346 */                       sArr = new int[iI0000Il00O];
/* 348 */                       Arrays.fill((int[]) sArr, -1);
/* 351 */                       int i21 = 0;
/* 353 */                       int i22 = 0;
/* 354 */                       while (i21 < i4) {
/* 356 */                           int i23 = i22 + i22;
/* 358 */                           int i24 = i21 + i21;
/* 360 */                           Object obj8 = objArrCopyOf[i24];
/* 362 */                           Objects.requireNonNull(obj8);
/* 367 */                           Object obj9 = objArrCopyOf[i24 ^ 1];
/* 369 */                           Objects.requireNonNull(obj9);
/* 376 */                           int iI00000oIO3 = lioOO0l0Iol.I00000oIO(obj8.hashCode());
                                    while (true) {
/* 380 */                               int i25 = iI00000oIO3 & i7;
/* 381 */                               ?? r15 = sArr[i25];
/* 383 */                               if (r15 == c4) {
/* 385 */                                   sArr[i25] = i23;
/* 387 */                                   if (i22 < i21) {
/* 389 */                                       objArrCopyOf[i23] = obj8;
/* 393 */                                       objArrCopyOf[i23 ^ 1] = obj9;
                                            }
/* 395 */                                   i22++;
                                        } else {
/* 404 */                                   if (obj8.equals(objArrCopyOf[r15])) {
/* 406 */                                       int i26 = r15 ^ 1;
/* 410 */                                       Object obj10 = objArrCopyOf[i26];
/* 412 */                                       Objects.requireNonNull(obj10);
/* 415 */                                       io11I0O io11i0o3 = new io11I0O(obj8, obj9, obj10);
/* 418 */                                       objArrCopyOf[i26] = obj9;
/* 420 */                                       obj = io11i0o3;
                                                break;
                                            }
/* 425 */                                   iI00000oIO3 = i25 + 1;
/* 427 */                                   c4 = 65535;
                                        }
                                    }
/* 421 */                           i21++;
/* 423 */                           c4 = 65535;
                                }
/* 429 */                       if (i22 != i4) {
/* 432 */                           objArr2 = new Object[]{sArr, Integer.valueOf(i22), obj};
/* 342 */                           obj = objArr2;
                                    r17 = z6;
                                }
/* 327 */                       obj = sArr;
                                r17 = z6;
                            }
                        }
/* 445 */               z2 = obj instanceof Object[];
                        Object obj11 = obj;
/* 447 */               if (z2) {
/* 449 */                   Object[] objArr5 = (Object[]) obj;
/* 453 */                   io11I0O io11i0o4 = (io11I0O) objArr5[c];
/* 455 */                   if (i00Ol00 == null) {
/* 482 */                       throw io11i0o4.I00000oIO();
                            }
/* 457 */                   i00Ol00.I0000O = io11i0o4;
/* 459 */                   Object obj12 = objArr5[r17];
/* 465 */                   int iIntValue = ((Integer) objArr5[i2]).intValue();
/* 471 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 475 */                   obj11 = obj12;
/* 476 */                   i4 = iIntValue;
                        }
/* 485 */               return new OOoli1l(i4, i5, obj11, objArrCopyOf);
                    }
/* 76 */            Objects.requireNonNull(objArrCopyOf[0]);
/* 81 */            Objects.requireNonNull(objArrCopyOf[1]);
/* 84 */            z3 = false;
/* 86 */            i4 = 1;
/* 87 */            i2 = 1;
/* 89 */            c = 2;
                    r17 = z3;
/* 445 */           z2 = obj instanceof Object[];
                    Object obj112 = obj;
/* 447 */           if (z2) {
                    }
/* 485 */           return new OOoli1l(i4, i5, obj112, objArrCopyOf);
                }

                @Override
                public final void clear() {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    throw new UnsupportedOperationException();
                        case 1:
/* 41 */                    throw new UnsupportedOperationException();
                        case 2:
/* 35 */                    throw new UnsupportedOperationException();
                        case 3:
/* 29 */                    throw new UnsupportedOperationException();
                        case 4:
/* 23 */                    throw new UnsupportedOperationException();
                        case 5:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean containsKey(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 70 */                    if (get(obj) != null) {
                            }
                            break;
                        case 1:
/* 60 */                    if (get(obj) != null) {
                            }
                            break;
                        case 2:
/* 50 */                    if (get(obj) != null) {
                            }
                            break;
                        case 3:
/* 40 */                    if (get(obj) != null) {
                            }
                            break;
                        case 4:
/* 30 */                    if (get(obj) != null) {
                            }
                            break;
                        case 5:
/* 20 */                    if (get(obj) != null) {
                            }
                            break;
                        default:
/* 10 */                    if (get(obj) != null) {
                            }
                            break;
                    }
/* 14 */            return false;
                }

                @Override
                public final boolean containsValue(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 141 */                   OOolII0o oOolII0o = (OOolII0o) this.I00io1l;
/* 143 */                   if (oOolII0o == null) {
/* 151 */                       oOolII0o = new OOolII0o(this.I00iiO, 1, this.I00iio);
/* 154 */                       this.I00io1l = oOolII0o;
                            }
/* 156 */                   return oOolII0o.contains(obj);
                        case 1:
/* 119 */                   iO10oiIlOi io10oiiloi = (iO10oiIlOi) this.I00io1l;
/* 121 */                   if (io10oiiloi == null) {
/* 129 */                       io10oiiloi = new iO10oiIlOi(this.I00iiO, 1, this.I00iio);
/* 132 */                       this.I00io1l = io10oiiloi;
                            }
/* 134 */                   return io10oiiloi.contains(obj);
                        case 2:
/* 97 */                    iil1o0OIo iil1o0oio = (iil1o0OIo) this.I00io1l;
/* 99 */                    if (iil1o0oio == null) {
/* 107 */                       iil1o0oio = new iil1o0OIo(this.I00iiO, 1, this.I00iio);
/* 110 */                       this.I00io1l = iil1o0oio;
                            }
/* 112 */                   return iil1o0oio.contains(obj);
                        case 3:
/* 75 */                    ioI1Ol101 ioi1ol101 = (ioI1Ol101) this.I00io1l;
/* 77 */                    if (ioi1ol101 == null) {
/* 85 */                        ioi1ol101 = new ioI1Ol101(this.I00iiO, 1, this.I00iio);
/* 88 */                        this.I00io1l = ioi1ol101;
                            }
/* 90 */                    return ioi1ol101.contains(obj);
                        case 4:
/* 53 */                    ioI1i0i0 ioi1i0i0 = (ioI1i0i0) this.I00io1l;
/* 55 */                    if (ioi1i0i0 == null) {
/* 63 */                        ioi1i0i0 = new ioI1i0i0(this.I00iiO, 1, this.I00iio);
/* 66 */                        this.I00io1l = ioi1i0i0;
                            }
/* 68 */                    return ioi1i0i0.contains(obj);
                        case 5:
/* 31 */                    ioIl0ooI ioil0ooi = (ioIl0ooI) this.I00io1l;
/* 33 */                    if (ioil0ooi == null) {
/* 41 */                        ioil0ooi = new ioIl0ooI(this.I00iiO, 1, this.I00iio);
/* 44 */                        this.I00io1l = ioil0ooi;
                            }
/* 46 */                    return ioil0ooi.contains(obj);
                        default:
/* 9 */                     l0001O l0001o = (l0001O) this.I00io1l;
/* 11 */                    if (l0001o == null) {
/* 19 */                        l0001o = new l0001O(this.I00iiO, 1, this.I00iio);
/* 22 */                        this.I00io1l = l0001o;
                            }
/* 24 */                    return l0001o.contains(obj);
                    }
                }

                @Override
                public final Set entrySet() {
                    switch (this.I00iOIl) {
                        case 0:
/* 116 */                   OOol10IO0O1 oOol10IO0O1 = (OOol10IO0O1) this.I00ilI0I1;
/* 118 */                   if (oOol10IO0O1 != null) {
/* 131 */                       return oOol10IO0O1;
                            }
/* 126 */                   OOol10IO0O1 oOol10IO0O12 = new OOol10IO0O1(this, this.I00iiO, this.I00iio);
/* 129 */                   this.I00ilI0I1 = oOol10IO0O12;
/* 131 */                   return oOol10IO0O12;
                        case 1:
/* 98 */                    iIolIOo0I iiolioo0i = (iIolIOo0I) this.I00ilI0I1;
/* 100 */                   if (iiolioo0i != null) {
/* 113 */                       return iiolioo0i;
                            }
/* 108 */                   iIolIOo0I iiolioo0i2 = new iIolIOo0I(this, this.I00iiO, this.I00iio);
/* 111 */                   this.I00ilI0I1 = iiolioo0i2;
/* 113 */                   return iiolioo0i2;
                        case 2:
/* 80 */                    iiiiO10iIiI iiiio10iiii = (iiiiO10iIiI) this.I00ilI0I1;
/* 82 */                    if (iiiio10iiii != null) {
/* 95 */                        return iiiio10iiii;
                            }
/* 90 */                    iiiiO10iIiI iiiio10iiii2 = new iiiiO10iIiI(this, this.I00iiO, this.I00iio);
/* 93 */                    this.I00ilI0I1 = iiiio10iiii2;
/* 95 */                    return iiiio10iiii2;
                        case 3:
/* 62 */                    io1o0Ol0 io1o0ol0 = (io1o0Ol0) this.I00ilI0I1;
/* 64 */                    if (io1o0ol0 != null) {
/* 77 */                        return io1o0ol0;
                            }
/* 72 */                    io1o0Ol0 io1o0ol02 = new io1o0Ol0(this, this.I00iiO, this.I00iio);
/* 75 */                    this.I00ilI0I1 = io1o0ol02;
/* 77 */                    return io1o0ol02;
                        case 4:
/* 44 */                    io1o0i1 io1o0i1Var = (io1o0i1) this.I00ilI0I1;
/* 46 */                    if (io1o0i1Var != null) {
/* 59 */                        return io1o0i1Var;
                            }
/* 54 */                    io1o0i1 io1o0i1Var2 = new io1o0i1(this, this.I00iiO, this.I00iio);
/* 57 */                    this.I00ilI0I1 = io1o0i1Var2;
/* 59 */                    return io1o0i1Var2;
                        case 5:
/* 26 */                    ioIO0Ilo11l ioio0ilo11l = (ioIO0Ilo11l) this.I00ilI0I1;
/* 28 */                    if (ioio0ilo11l != null) {
/* 41 */                        return ioio0ilo11l;
                            }
/* 36 */                    ioIO0Ilo11l ioio0ilo11l2 = new ioIO0Ilo11l(this, this.I00iiO, this.I00iio);
/* 39 */                    this.I00ilI0I1 = ioio0ilo11l2;
/* 41 */                    return ioio0ilo11l2;
                        default:
/* 8 */                     ioolil0I ioolil0i = (ioolil0I) this.I00ilI0I1;
/* 10 */                    if (ioolil0i != null) {
/* 23 */                        return ioolil0i;
                            }
/* 18 */                    ioolil0I ioolil0i2 = new ioolil0I(this, this.I00iiO, this.I00iio);
/* 21 */                    this.I00ilI0I1 = ioolil0i2;
/* 23 */                    return ioolil0i2;
                    }
                }

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 152 */                   if (this != obj) {
/* 158 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 1:
/* 128 */                   if (this != obj) {
/* 134 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 2:
/* 104 */                   if (this != obj) {
/* 110 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 3:
/* 80 */                    if (this != obj) {
/* 86 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 4:
/* 56 */                    if (this != obj) {
/* 62 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 5:
/* 32 */                    if (this != obj) {
/* 38 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
/* 8 */                     if (this != obj) {
/* 14 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                    }
/* 27 */            return entrySet().equals(((Map) obj).entrySet());
                }

                /* JADX WARN: Removed duplicated region for block: B:125:0x01d2  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0266  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x02fa  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x038e  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
                /* JADX WARN: Removed duplicated region for block: B:5:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get(Object obj) {
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    Object obj6;
                    Object obj7;
                    Object obj8;
/* 1 */             int i = this.I00iOIl;
/* 6 */             Object obj9 = this.I00iiI;
/* 9 */             Object[] objArr = this.I00iiO;
/* 11 */            int i2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 909 */                   if (obj != null) {
/* 914 */                       if (i2 == 1) {
/* 916 */                           Object obj10 = objArr[0];
/* 918 */                           Objects.requireNonNull(obj10);
/* 925 */                           if (obj10.equals(obj)) {
/* 927 */                               obj2 = objArr[1];
/* 929 */                               Objects.requireNonNull(obj2);
                                    } else {
/* 911 */                               obj2 = null;
                                    }
                                } else if (obj9 != null) {
/* 939 */                           if (obj9 instanceof byte[]) {
/* 942 */                               byte[] bArr = (byte[]) obj9;
/* 945 */                               int length = bArr.length - 1;
/* 950 */                               int iI00000oIO = illii0liI.I00000oIO(obj.hashCode());
                                        while (true) {
/* 954 */                                   int i3 = iI00000oIO & length;
/* 957 */                                   int i4 = bArr[i3] & 255;
/* 958 */                                   if (i4 != 255) {
/* 967 */                                       if (obj.equals(objArr[i4])) {
/* 971 */                                           obj2 = objArr[i4 ^ 1];
                                                } else {
/* 974 */                                           iI00000oIO = i3 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 982 */                               short[] sArr = (short[]) obj9;
/* 985 */                               int length2 = sArr.length - 1;
/* 990 */                               int iI00000oIO2 = illii0liI.I00000oIO(obj.hashCode());
                                        while (true) {
/* 994 */                                   int i5 = iI00000oIO2 & length2;
/* 997 */                                   int i6 = sArr[i5] & 65535;
/* 998 */                                   if (i6 != 65535) {
/* 1007 */                                      if (obj.equals(objArr[i6])) {
/* 1011 */                                          obj2 = objArr[i6 ^ 1];
                                                } else {
/* 1014 */                                          iI00000oIO2 = i5 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 1017 */                              int[] iArr = (int[]) obj9;
/* 1020 */                              int length3 = iArr.length - 1;
/* 1025 */                              int iI00000oIO3 = illii0liI.I00000oIO(obj.hashCode());
                                        while (true) {
/* 1029 */                                  int i7 = iI00000oIO3 & length3;
/* 1030 */                                  int i8 = iArr[i7];
/* 1032 */                                  if (i8 != -1) {
/* 1041 */                                      if (obj.equals(objArr[i8])) {
/* 1045 */                                          obj2 = objArr[i8 ^ 1];
                                                } else {
/* 1052 */                                          iI00000oIO3 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 1047 */                  if (obj2 == null) {
/* 14 */                        return null;
                            }
/* 1050 */                  return obj2;
                        case 1:
/* 761 */                   if (obj != null) {
/* 766 */                       if (i2 == 1) {
/* 768 */                           Object obj11 = objArr[0];
/* 770 */                           Objects.requireNonNull(obj11);
/* 777 */                           if (obj11.equals(obj)) {
/* 779 */                               obj3 = objArr[1];
/* 781 */                               Objects.requireNonNull(obj3);
                                    } else {
/* 763 */                               obj3 = null;
                                    }
                                } else if (obj9 != null) {
/* 791 */                           if (obj9 instanceof byte[]) {
/* 794 */                               byte[] bArr2 = (byte[]) obj9;
                                        int length4 = bArr2.length - 1;
/* 802 */                               int iI00000oIO4 = ll1l0I000OO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 806 */                                   int i9 = iI00000oIO4 & length4;
/* 809 */                                   int i10 = bArr2[i9] & 255;
/* 810 */                                   if (i10 != 255) {
/* 819 */                                       if (obj.equals(objArr[i10])) {
/* 823 */                                           obj3 = objArr[i10 ^ 1];
                                                } else {
/* 826 */                                           iI00000oIO4 = i9 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 834 */                               short[] sArr2 = (short[]) obj9;
                                        int length5 = sArr2.length - 1;
/* 842 */                               int iI00000oIO5 = ll1l0I000OO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 846 */                                   int i11 = iI00000oIO5 & length5;
/* 849 */                                   char c = (char) sArr2[i11];
/* 850 */                                   if (c != 65535) {
/* 859 */                                       if (obj.equals(objArr[c])) {
/* 863 */                                           obj3 = objArr[c ^ 1];
                                                } else {
/* 866 */                                           iI00000oIO5 = i11 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 870 */                               int[] iArr2 = (int[]) obj9;
                                        int length6 = iArr2.length - 1;
/* 879 */                               int iI00000oIO6 = ll1l0I000OO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 883 */                                   int i12 = iI00000oIO6 & length6;
/* 884 */                                   int i13 = iArr2[i12];
/* 886 */                                   if (i13 != -1) {
/* 895 */                                       if (obj.equals(objArr[i13])) {
/* 899 */                                           obj3 = objArr[i13 ^ 1];
                                                } else {
/* 906 */                                           iI00000oIO6 = i12 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 901 */                   if (obj3 == null) {
/* 14 */                        return null;
                            }
/* 904 */                   return obj3;
                        case 2:
/* 613 */                   if (obj != null) {
/* 618 */                       if (i2 == 1) {
/* 620 */                           Object obj12 = objArr[0];
/* 622 */                           Objects.requireNonNull(obj12);
/* 629 */                           if (obj12.equals(obj)) {
/* 631 */                               obj4 = objArr[1];
/* 633 */                               Objects.requireNonNull(obj4);
                                    } else {
/* 615 */                               obj4 = null;
                                    }
                                } else if (obj9 != null) {
/* 643 */                           if (obj9 instanceof byte[]) {
/* 646 */                               byte[] bArr3 = (byte[]) obj9;
                                        int length7 = bArr3.length - 1;
/* 654 */                               int iI00000oIO7 = lilOIIIlIO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 658 */                                   int i14 = iI00000oIO7 & length7;
/* 661 */                                   int i15 = bArr3[i14] & 255;
/* 662 */                                   if (i15 != 255) {
/* 671 */                                       if (obj.equals(objArr[i15])) {
/* 675 */                                           obj4 = objArr[i15 ^ 1];
                                                } else {
/* 678 */                                           iI00000oIO7 = i14 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 686 */                               short[] sArr3 = (short[]) obj9;
                                        int length8 = sArr3.length - 1;
/* 694 */                               int iI00000oIO8 = lilOIIIlIO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 698 */                                   int i16 = iI00000oIO8 & length8;
/* 701 */                                   char c2 = (char) sArr3[i16];
/* 702 */                                   if (c2 != 65535) {
/* 711 */                                       if (obj.equals(objArr[c2])) {
/* 715 */                                           obj4 = objArr[c2 ^ 1];
                                                } else {
/* 718 */                                           iI00000oIO8 = i16 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 722 */                               int[] iArr3 = (int[]) obj9;
                                        int length9 = iArr3.length - 1;
/* 731 */                               int iI00000oIO9 = lilOIIIlIO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 735 */                                   int i17 = iI00000oIO9 & length9;
/* 736 */                                   int i18 = iArr3[i17];
/* 738 */                                   if (i18 != -1) {
/* 747 */                                       if (obj.equals(objArr[i18])) {
/* 751 */                                           obj4 = objArr[i18 ^ 1];
                                                } else {
/* 758 */                                           iI00000oIO9 = i17 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 753 */                   if (obj4 == null) {
/* 14 */                        return null;
                            }
/* 756 */                   return obj4;
                        case 3:
/* 465 */                   if (obj != null) {
/* 470 */                       if (i2 == 1) {
/* 472 */                           Object obj13 = objArr[0];
/* 474 */                           Objects.requireNonNull(obj13);
/* 481 */                           if (obj13.equals(obj)) {
/* 483 */                               obj5 = objArr[1];
/* 485 */                               Objects.requireNonNull(obj5);
                                    } else {
/* 467 */                               obj5 = null;
                                    }
                                } else if (obj9 != null) {
/* 495 */                           if (obj9 instanceof byte[]) {
/* 498 */                               byte[] bArr4 = (byte[]) obj9;
                                        int length10 = bArr4.length - 1;
/* 506 */                               int iI00000oIO10 = lioI0OiO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 510 */                                   int i19 = iI00000oIO10 & length10;
/* 513 */                                   int i20 = bArr4[i19] & 255;
/* 514 */                                   if (i20 != 255) {
/* 523 */                                       if (obj.equals(objArr[i20])) {
/* 527 */                                           obj5 = objArr[i20 ^ 1];
                                                } else {
/* 530 */                                           iI00000oIO10 = i19 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 538 */                               short[] sArr4 = (short[]) obj9;
                                        int length11 = sArr4.length - 1;
/* 546 */                               int iI00000oIO11 = lioI0OiO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 550 */                                   int i21 = iI00000oIO11 & length11;
/* 553 */                                   char c3 = (char) sArr4[i21];
/* 554 */                                   if (c3 != 65535) {
/* 563 */                                       if (obj.equals(objArr[c3])) {
/* 567 */                                           obj5 = objArr[c3 ^ 1];
                                                } else {
/* 570 */                                           iI00000oIO11 = i21 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 574 */                               int[] iArr4 = (int[]) obj9;
                                        int length12 = iArr4.length - 1;
/* 583 */                               int iI00000oIO12 = lioI0OiO.I00000oIO(obj.hashCode());
                                        while (true) {
/* 587 */                                   int i22 = iI00000oIO12 & length12;
/* 588 */                                   int i23 = iArr4[i22];
/* 590 */                                   if (i23 != -1) {
/* 599 */                                       if (obj.equals(objArr[i23])) {
/* 603 */                                           obj5 = objArr[i23 ^ 1];
                                                } else {
/* 610 */                                           iI00000oIO12 = i22 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 605 */                   if (obj5 == null) {
/* 14 */                        return null;
                            }
/* 608 */                   return obj5;
                        case 4:
/* 317 */                   if (obj != null) {
/* 322 */                       if (i2 == 1) {
/* 324 */                           Object obj14 = objArr[0];
/* 326 */                           Objects.requireNonNull(obj14);
/* 333 */                           if (obj14.equals(obj)) {
/* 335 */                               obj6 = objArr[1];
/* 337 */                               Objects.requireNonNull(obj6);
                                    } else {
/* 319 */                               obj6 = null;
                                    }
                                } else if (obj9 != null) {
/* 347 */                           if (obj9 instanceof byte[]) {
/* 350 */                               byte[] bArr5 = (byte[]) obj9;
                                        int length13 = bArr5.length - 1;
/* 358 */                               int iI00000oIO13 = lioI1oll11II.I00000oIO(obj.hashCode());
                                        while (true) {
/* 362 */                                   int i24 = iI00000oIO13 & length13;
/* 365 */                                   int i25 = bArr5[i24] & 255;
/* 366 */                                   if (i25 != 255) {
/* 375 */                                       if (obj.equals(objArr[i25])) {
/* 379 */                                           obj6 = objArr[i25 ^ 1];
                                                } else {
/* 382 */                                           iI00000oIO13 = i24 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 390 */                               short[] sArr5 = (short[]) obj9;
                                        int length14 = sArr5.length - 1;
/* 398 */                               int iI00000oIO14 = lioI1oll11II.I00000oIO(obj.hashCode());
                                        while (true) {
/* 402 */                                   int i26 = iI00000oIO14 & length14;
/* 405 */                                   char c4 = (char) sArr5[i26];
/* 406 */                                   if (c4 != 65535) {
/* 415 */                                       if (obj.equals(objArr[c4])) {
/* 419 */                                           obj6 = objArr[c4 ^ 1];
                                                } else {
/* 422 */                                           iI00000oIO14 = i26 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 426 */                               int[] iArr5 = (int[]) obj9;
                                        int length15 = iArr5.length - 1;
/* 435 */                               int iI00000oIO15 = lioI1oll11II.I00000oIO(obj.hashCode());
                                        while (true) {
/* 439 */                                   int i27 = iI00000oIO15 & length15;
/* 440 */                                   int i28 = iArr5[i27];
/* 442 */                                   if (i28 != -1) {
/* 451 */                                       if (obj.equals(objArr[i28])) {
/* 455 */                                           obj6 = objArr[i28 ^ 1];
                                                } else {
/* 462 */                                           iI00000oIO15 = i27 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 457 */                   if (obj6 == null) {
/* 14 */                        return null;
                            }
/* 460 */                   return obj6;
                        case 5:
/* 169 */                   if (obj != null) {
/* 174 */                       if (i2 == 1) {
/* 176 */                           Object obj15 = objArr[0];
/* 178 */                           Objects.requireNonNull(obj15);
/* 185 */                           if (obj15.equals(obj)) {
/* 187 */                               obj7 = objArr[1];
/* 189 */                               Objects.requireNonNull(obj7);
                                    } else {
/* 171 */                               obj7 = null;
                                    }
                                } else if (obj9 != null) {
/* 199 */                           if (obj9 instanceof byte[]) {
/* 202 */                               byte[] bArr6 = (byte[]) obj9;
                                        int length16 = bArr6.length - 1;
/* 210 */                               int iI00000oIO16 = lioOO0l0Iol.I00000oIO(obj.hashCode());
                                        while (true) {
/* 214 */                                   int i29 = iI00000oIO16 & length16;
/* 217 */                                   int i30 = bArr6[i29] & 255;
/* 218 */                                   if (i30 != 255) {
/* 227 */                                       if (obj.equals(objArr[i30])) {
/* 231 */                                           obj7 = objArr[i30 ^ 1];
                                                } else {
/* 234 */                                           iI00000oIO16 = i29 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 242 */                               short[] sArr6 = (short[]) obj9;
                                        int length17 = sArr6.length - 1;
/* 250 */                               int iI00000oIO17 = lioOO0l0Iol.I00000oIO(obj.hashCode());
                                        while (true) {
/* 254 */                                   int i31 = iI00000oIO17 & length17;
/* 257 */                                   char c5 = (char) sArr6[i31];
/* 258 */                                   if (c5 != 65535) {
/* 267 */                                       if (obj.equals(objArr[c5])) {
/* 271 */                                           obj7 = objArr[c5 ^ 1];
                                                } else {
/* 274 */                                           iI00000oIO17 = i31 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 278 */                               int[] iArr6 = (int[]) obj9;
                                        int length18 = iArr6.length - 1;
/* 287 */                               int iI00000oIO18 = lioOO0l0Iol.I00000oIO(obj.hashCode());
                                        while (true) {
/* 291 */                                   int i32 = iI00000oIO18 & length18;
/* 292 */                                   int i33 = iArr6[i32];
/* 294 */                                   if (i33 != -1) {
/* 303 */                                       if (obj.equals(objArr[i33])) {
/* 307 */                                           obj7 = objArr[i33 ^ 1];
                                                } else {
/* 314 */                                           iI00000oIO18 = i32 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 309 */                   if (obj7 == null) {
/* 14 */                        return null;
                            }
/* 312 */                   return obj7;
                        default:
/* 21 */                    if (obj != null) {
/* 26 */                        if (i2 == 1) {
/* 28 */                            Object obj16 = objArr[0];
/* 30 */                            Objects.requireNonNull(obj16);
/* 37 */                            if (obj16.equals(obj)) {
/* 39 */                                obj8 = objArr[1];
/* 41 */                                Objects.requireNonNull(obj8);
                                    } else {
/* 23 */                                obj8 = null;
                                    }
                                } else if (obj9 != null) {
/* 51 */                            if (obj9 instanceof byte[]) {
/* 54 */                                byte[] bArr7 = (byte[]) obj9;
                                        int length19 = bArr7.length - 1;
/* 62 */                                int iI00000oIO19 = lioi0il.I00000oIO(obj.hashCode());
                                        while (true) {
/* 66 */                                    int i34 = iI00000oIO19 & length19;
/* 69 */                                    int i35 = bArr7[i34] & 255;
/* 70 */                                    if (i35 != 255) {
/* 79 */                                        if (obj.equals(objArr[i35])) {
/* 83 */                                            obj8 = objArr[i35 ^ 1];
                                                } else {
/* 86 */                                            iI00000oIO19 = i34 + 1;
                                                }
                                            }
                                        }
                                    } else if (obj9 instanceof short[]) {
/* 94 */                                short[] sArr7 = (short[]) obj9;
                                        int length20 = sArr7.length - 1;
/* 102 */                               int iI00000oIO20 = lioi0il.I00000oIO(obj.hashCode());
                                        while (true) {
/* 106 */                                   int i36 = iI00000oIO20 & length20;
/* 109 */                                   char c6 = (char) sArr7[i36];
/* 110 */                                   if (c6 != 65535) {
/* 119 */                                       if (obj.equals(objArr[c6])) {
/* 123 */                                           obj8 = objArr[c6 ^ 1];
                                                } else {
/* 126 */                                           iI00000oIO20 = i36 + 1;
                                                }
                                            }
                                        }
                                    } else {
/* 130 */                               int[] iArr7 = (int[]) obj9;
                                        int length21 = iArr7.length - 1;
/* 139 */                               int iI00000oIO21 = lioi0il.I00000oIO(obj.hashCode());
                                        while (true) {
/* 143 */                                   int i37 = iI00000oIO21 & length21;
/* 144 */                                   int i38 = iArr7[i37];
/* 146 */                                   if (i38 != -1) {
/* 155 */                                       if (obj.equals(objArr[i38])) {
/* 159 */                                           obj8 = objArr[i38 ^ 1];
                                                } else {
/* 166 */                                           iI00000oIO21 = i37 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 161 */                   if (obj8 == null) {
/* 14 */                        return null;
                            }
/* 164 */                   return obj8;
                    }
                }

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 54 */                    Object obj3 = get(obj);
                            return obj3 != null ? obj3 : obj2;
                        case 1:
/* 46 */                    Object obj4 = get(obj);
                            return obj4 != null ? obj4 : obj2;
                        case 2:
/* 38 */                    Object obj5 = get(obj);
                            return obj5 != null ? obj5 : obj2;
                        case 3:
/* 30 */                    Object obj6 = get(obj);
                            return obj6 != null ? obj6 : obj2;
                        case 4:
/* 22 */                    Object obj7 = get(obj);
                            return obj7 != null ? obj7 : obj2;
                        case 5:
/* 14 */                    Object obj8 = get(obj);
                            return obj8 != null ? obj8 : obj2;
                        default:
/* 6 */                     Object obj9 = get(obj);
                            return obj9 != null ? obj9 : obj2;
                    }
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 267 */                   OOol10IO0O1 oOol10IO0O1 = (OOol10IO0O1) this.I00ilI0I1;
/* 269 */                   if (oOol10IO0O1 == null) {
/* 277 */                       oOol10IO0O1 = new OOol10IO0O1(this, this.I00iiO, this.I00iio);
/* 280 */                       this.I00ilI0I1 = oOol10IO0O1;
                            }
/* 282 */                   return lOI00O.I00000oIO(oOol10IO0O1);
                        case 1:
/* 224 */                   iIolIOo0I iiolioo0i = (iIolIOo0I) this.I00ilI0I1;
/* 226 */                   if (iiolioo0i == null) {
/* 234 */                       iiolioo0i = new iIolIOo0I(this, this.I00iiO, this.I00iio);
/* 237 */                       this.I00ilI0I1 = iiolioo0i;
                            }
/* 239 */                   Iterator it = iiolioo0i.iterator();
/* 243 */                   int iHashCode = 0;
/* 248 */                   while (it.hasNext()) {
/* 250 */                       Object next = it.next();
/* 262 */                       iHashCode += next != null ? next.hashCode() : 0;
                            }
/* 264 */                   return iHashCode;
                        case 2:
/* 181 */                   iiiiO10iIiI iiiio10iiii = (iiiiO10iIiI) this.I00ilI0I1;
/* 183 */                   if (iiiio10iiii == null) {
/* 191 */                       iiiio10iiii = new iiiiO10iIiI(this, this.I00iiO, this.I00iio);
/* 194 */                       this.I00ilI0I1 = iiiio10iiii;
                            }
/* 196 */                   Iterator it2 = iiiio10iiii.iterator();
/* 200 */                   int iHashCode2 = 0;
/* 205 */                   while (it2.hasNext()) {
/* 207 */                       Object next2 = it2.next();
/* 219 */                       iHashCode2 += next2 != null ? next2.hashCode() : 0;
                            }
/* 221 */                   return iHashCode2;
                        case 3:
/* 138 */                   io1o0Ol0 io1o0ol0 = (io1o0Ol0) this.I00ilI0I1;
/* 140 */                   if (io1o0ol0 == null) {
/* 148 */                       io1o0ol0 = new io1o0Ol0(this, this.I00iiO, this.I00iio);
/* 151 */                       this.I00ilI0I1 = io1o0ol0;
                            }
/* 153 */                   Iterator it3 = io1o0ol0.iterator();
/* 157 */                   int iHashCode3 = 0;
/* 162 */                   while (it3.hasNext()) {
/* 164 */                       Object next3 = it3.next();
/* 176 */                       iHashCode3 += next3 != null ? next3.hashCode() : 0;
                            }
/* 178 */                   return iHashCode3;
                        case 4:
/* 95 */                    io1o0i1 io1o0i1Var = (io1o0i1) this.I00ilI0I1;
/* 97 */                    if (io1o0i1Var == null) {
/* 105 */                       io1o0i1Var = new io1o0i1(this, this.I00iiO, this.I00iio);
/* 108 */                       this.I00ilI0I1 = io1o0i1Var;
                            }
/* 110 */                   Iterator it4 = io1o0i1Var.iterator();
/* 114 */                   int iHashCode4 = 0;
/* 119 */                   while (it4.hasNext()) {
/* 121 */                       Object next4 = it4.next();
/* 133 */                       iHashCode4 += next4 != null ? next4.hashCode() : 0;
                            }
/* 135 */                   return iHashCode4;
                        case 5:
/* 52 */                    ioIO0Ilo11l ioio0ilo11l = (ioIO0Ilo11l) this.I00ilI0I1;
/* 54 */                    if (ioio0ilo11l == null) {
/* 62 */                        ioio0ilo11l = new ioIO0Ilo11l(this, this.I00iiO, this.I00iio);
/* 65 */                        this.I00ilI0I1 = ioio0ilo11l;
                            }
/* 67 */                    Iterator it5 = ioio0ilo11l.iterator();
/* 71 */                    int iHashCode5 = 0;
/* 76 */                    while (it5.hasNext()) {
/* 78 */                        Object next5 = it5.next();
/* 90 */                        iHashCode5 += next5 != null ? next5.hashCode() : 0;
                            }
/* 92 */                    return iHashCode5;
                        default:
/* 9 */                     ioolil0I ioolil0i = (ioolil0I) this.I00ilI0I1;
/* 11 */                    if (ioolil0i == null) {
/* 19 */                        ioolil0i = new ioolil0I(this, this.I00iiO, this.I00iio);
/* 22 */                        this.I00ilI0I1 = ioolil0i;
                            }
/* 24 */                    Iterator it6 = ioolil0i.iterator();
/* 28 */                    int iHashCode6 = 0;
/* 33 */                    while (it6.hasNext()) {
/* 35 */                        Object next6 = it6.next();
/* 47 */                        iHashCode6 += next6 != null ? next6.hashCode() : 0;
                            }
/* 49 */                    return iHashCode6;
                    }
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 0:
/* 70 */                    if (size() == 0) {
                            }
                            break;
                        case 1:
/* 60 */                    if (size() == 0) {
                            }
                            break;
                        case 2:
/* 50 */                    if (size() == 0) {
                            }
                            break;
                        case 3:
/* 40 */                    if (size() == 0) {
                            }
                            break;
                        case 4:
/* 30 */                    if (size() == 0) {
                            }
                            break;
                        case 5:
/* 20 */                    if (size() == 0) {
                            }
                            break;
                        default:
/* 10 */                    if (size() == 0) {
                            }
                            break;
                    }
/* 14 */            return false;
                }

                @Override
                public final Set keySet() {
                    switch (this.I00iOIl) {
                        case 0:
/* 179 */                   OOolI0OoI oOolI0OoI = (OOolI0OoI) this.I00ilO0;
/* 181 */                   if (oOolI0OoI != null) {
/* 200 */                       return oOolI0OoI;
                            }
/* 194 */                   OOolI0OoI oOolI0OoI2 = new OOolI0OoI(this, new OOolII0o(this.I00iiO, 0, this.I00iio));
/* 197 */                   this.I00ilO0 = oOolI0OoI2;
/* 199 */                   return oOolI0OoI2;
                        case 1:
/* 147 */                   iO0i00IIIlo io0i00iiilo = (iO0i00IIIlo) this.I00ilO0;
/* 149 */                   if (io0i00iiilo != null) {
/* 176 */                       return io0i00iiilo;
                            }
/* 157 */                   iO10oiIlOi io10oiiloi = new iO10oiIlOi(this.I00iiO, 0, this.I00iio);
/* 163 */                   iO0i00IIIlo io0i00iiilo2 = new iO0i00IIIlo(2);
/* 166 */                   io0i00iiilo2.I00o0iI0io1 = this;
/* 168 */                   io0i00iiilo2.I00o0l1o1o0 = io10oiiloi;
/* 170 */                   VarHandle.storeStoreFence();
/* 173 */                   this.I00ilO0 = io0i00iiilo2;
/* 175 */                   return io0i00iiilo2;
                        case 2:
/* 114 */                   iiio0Il1o000 iiio0il1o000 = (iiio0Il1o000) this.I00ilO0;
/* 116 */                   if (iiio0il1o000 != null) {
/* 144 */                       return iiio0il1o000;
                            }
/* 124 */                   iil1o0OIo iil1o0oio = new iil1o0OIo(this.I00iiO, 0, this.I00iio);
/* 131 */                   iiio0Il1o000 iiio0il1o0002 = new iiio0Il1o000(9);
/* 134 */                   iiio0il1o0002.I00o0iI0io1 = this;
/* 136 */                   iiio0il1o0002.I00o0l1o1o0 = iil1o0oio;
/* 138 */                   VarHandle.storeStoreFence();
/* 141 */                   this.I00ilO0 = iiio0il1o0002;
/* 143 */                   return iiio0il1o0002;
                        case 3:
/* 90 */                    ioI010 ioi010 = (ioI010) this.I00ilO0;
/* 92 */                    if (ioi010 != null) {
/* 111 */                       return ioi010;
                            }
/* 105 */                   ioI010 ioi0102 = new ioI010(this, new ioI1Ol101(this.I00iiO, 0, this.I00iio));
/* 108 */                   this.I00ilO0 = ioi0102;
/* 110 */                   return ioi0102;
                        case 4:
/* 66 */                    ioI01IoOO1li ioi01iooo1li = (ioI01IoOO1li) this.I00ilO0;
/* 68 */                    if (ioi01iooo1li != null) {
/* 87 */                        return ioi01iooo1li;
                            }
/* 81 */                    ioI01IoOO1li ioi01iooo1li2 = new ioI01IoOO1li(this, new ioI1i0i0(this.I00iiO, 0, this.I00iio));
/* 84 */                    this.I00ilO0 = ioi01iooo1li2;
/* 86 */                    return ioi01iooo1li2;
                        case 5:
/* 42 */                    ioIOl10iIi01 ioiol10iii01 = (ioIOl10iIi01) this.I00ilO0;
/* 44 */                    if (ioiol10iii01 != null) {
/* 63 */                        return ioiol10iii01;
                            }
/* 57 */                    ioIOl10iIi01 ioiol10iii012 = new ioIOl10iIi01(this, new ioIl0ooI(this.I00iiO, 0, this.I00iio));
/* 60 */                    this.I00ilO0 = ioiol10iii012;
/* 62 */                    return ioiol10iii012;
                        default:
/* 9 */                     iooo10i iooo10iVar = (iooo10i) this.I00ilO0;
/* 11 */                    if (iooo10iVar != null) {
/* 39 */                        return iooo10iVar;
                            }
/* 19 */                    l0001O l0001o = new l0001O(this.I00iiO, 0, this.I00iio);
/* 26 */                    iooo10i iooo10iVar2 = new iooo10i(10);
/* 29 */                    iooo10iVar2.I00o0iI0io1 = this;
/* 31 */                    iooo10iVar2.I00o0l1o1o0 = l0001o;
/* 33 */                    VarHandle.storeStoreFence();
/* 36 */                    this.I00ilO0 = iooo10iVar2;
/* 38 */                    return iooo10iVar2;
                    }
                }

                @Override
                public final Object put(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    throw new UnsupportedOperationException();
                        case 1:
/* 41 */                    throw new UnsupportedOperationException();
                        case 2:
/* 35 */                    throw new UnsupportedOperationException();
                        case 3:
/* 29 */                    throw new UnsupportedOperationException();
                        case 4:
/* 23 */                    throw new UnsupportedOperationException();
                        case 5:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final void putAll(Map map) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    throw new UnsupportedOperationException();
                        case 1:
/* 41 */                    throw new UnsupportedOperationException();
                        case 2:
/* 35 */                    throw new UnsupportedOperationException();
                        case 3:
/* 29 */                    throw new UnsupportedOperationException();
                        case 4:
/* 23 */                    throw new UnsupportedOperationException();
                        case 5:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final Object remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    throw new UnsupportedOperationException();
                        case 1:
/* 41 */                    throw new UnsupportedOperationException();
                        case 2:
/* 35 */                    throw new UnsupportedOperationException();
                        case 3:
/* 29 */                    throw new UnsupportedOperationException();
                        case 4:
/* 23 */                    throw new UnsupportedOperationException();
                        case 5:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iio;
                }

                public final String toString() {
/* 15 */            boolean z = true;
                    switch (this.I00iOIl) {
                        case 0:
/* 436 */                   int i = this.I00iio;
/* 438 */                   ii1oO1IOiI1o.I00000oIO(i, "size");
/* 450 */                   StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
/* 453 */                   sb.append('{');
/* 462 */                   OoiOOoOlo it = ((OOol10IO0O1) entrySet()).iterator();
                            while (true) {
/* 467 */                       IoilOOi ioilOOi = (IoilOOi) it;
/* 473 */                       if (!ioilOOi.hasNext()) {
/* 491 */                           sb.append('}');
/* 494 */                           return sb.toString();
                                }
/* 479 */                       Map.Entry entry = (Map.Entry) ioilOOi.next();
/* 481 */                       if (!z) {
/* 483 */                           sb.append(", ");
                                }
/* 486 */                       OooioIOo1.I00111O(entry, sb, '=');
/* 489 */                       z = false;
                            }
                        case 1:
/* 369 */                   int i2 = this.I00iio;
/* 371 */                   if (i2 < 0) {
/* 432 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "size cannot be negative but was: "));
/* 5 */                         return null;
                            }
/* 382 */                   StringBuilder sb2 = new StringBuilder((int) Math.min(i2 * 8, 1073741824L));
/* 385 */                   sb2.append('{');
/* 394 */                   Iterator it2 = ((iIolIOo0I) entrySet()).iterator();
/* 402 */                   while (it2.hasNext()) {
/* 408 */                       Map.Entry entry2 = (Map.Entry) it2.next();
/* 410 */                       if (!z) {
/* 412 */                           sb2.append(", ");
                                }
/* 415 */                       OooioIOo1.I00111O(entry2, sb2, '=');
/* 418 */                       z = false;
                            }
/* 420 */                   sb2.append('}');
/* 423 */                   return sb2.toString();
                        case 2:
/* 287 */                   int i3 = this.I00iio;
/* 289 */                   if (i3 < 0) {
/* 365 */                       I000II.I000iOII(Oi010OO0.I00100l0(i3, "size cannot be negative but was: ", new StringBuilder(String.valueOf(i3).length() + 33)));
/* 5 */                         return null;
                            }
/* 300 */                   StringBuilder sb3 = new StringBuilder((int) Math.min(i3 * 8, 1073741824L));
/* 303 */                   sb3.append('{');
/* 312 */                   Iterator it3 = ((iiiiO10iIiI) entrySet()).iterator();
/* 320 */                   while (it3.hasNext()) {
/* 326 */                       Map.Entry entry3 = (Map.Entry) it3.next();
/* 328 */                       if (!z) {
/* 330 */                           sb3.append(", ");
                                }
/* 333 */                       OooioIOo1.I00111O(entry3, sb3, '=');
/* 336 */                       z = false;
                            }
/* 338 */                   sb3.append('}');
/* 341 */                   return sb3.toString();
                        case 3:
/* 220 */                   int i4 = this.I00iio;
/* 222 */                   if (i4 < 0) {
/* 283 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(i4, "size cannot be negative but was: "));
/* 5 */                         return null;
                            }
/* 233 */                   StringBuilder sb4 = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
/* 236 */                   sb4.append('{');
/* 245 */                   Iterator it4 = ((io1o0Ol0) entrySet()).iterator();
/* 253 */                   while (it4.hasNext()) {
/* 259 */                       Map.Entry entry4 = (Map.Entry) it4.next();
/* 261 */                       if (!z) {
/* 263 */                           sb4.append(", ");
                                }
/* 266 */                       OooioIOo1.I00111O(entry4, sb4, '=');
/* 269 */                       z = false;
                            }
/* 271 */                   sb4.append('}');
/* 274 */                   return sb4.toString();
                        case 4:
/* 153 */                   int i5 = this.I00iio;
/* 155 */                   if (i5 < 0) {
/* 216 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(i5, "size cannot be negative but was: "));
/* 5 */                         return null;
                            }
/* 166 */                   StringBuilder sb5 = new StringBuilder((int) Math.min(i5 * 8, 1073741824L));
/* 169 */                   sb5.append('{');
/* 178 */                   Iterator it5 = ((io1o0i1) entrySet()).iterator();
/* 186 */                   while (it5.hasNext()) {
/* 192 */                       Map.Entry entry5 = (Map.Entry) it5.next();
/* 194 */                       if (!z) {
/* 196 */                           sb5.append(", ");
                                }
/* 199 */                       OooioIOo1.I00111O(entry5, sb5, '=');
/* 202 */                       z = false;
                            }
/* 204 */                   sb5.append('}');
/* 207 */                   return sb5.toString();
                        case 5:
/* 86 */                    int i6 = this.I00iio;
/* 88 */                    if (i6 < 0) {
/* 149 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(i6, "size cannot be negative but was: "));
/* 5 */                         return null;
                            }
/* 99 */                    StringBuilder sb6 = new StringBuilder((int) Math.min(i6 * 8, 1073741824L));
/* 102 */                   sb6.append('{');
/* 111 */                   Iterator it6 = ((ioIO0Ilo11l) entrySet()).iterator();
/* 119 */                   while (it6.hasNext()) {
/* 125 */                       Map.Entry entry6 = (Map.Entry) it6.next();
/* 127 */                       if (!z) {
/* 129 */                           sb6.append(", ");
                                }
/* 132 */                       OooioIOo1.I00111O(entry6, sb6, '=');
/* 135 */                       z = false;
                            }
/* 137 */                   sb6.append('}');
/* 140 */                   return sb6.toString();
                        default:
/* 26 */                    int i7 = this.I00iio;
/* 28 */                    lioIlO.I00000oIO(i7, "size");
/* 40 */                    StringBuilder sb7 = new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
/* 43 */                    sb7.append('{');
/* 52 */                    Iterator it7 = ((ioolil0I) entrySet()).iterator();
/* 60 */                    while (it7.hasNext()) {
/* 66 */                        Map.Entry entry7 = (Map.Entry) it7.next();
/* 68 */                        if (!z) {
/* 70 */                            sb7.append(", ");
                                }
/* 73 */                        OooioIOo1.I00111O(entry7, sb7, '=');
/* 76 */                        z = false;
                            }
/* 78 */                    sb7.append('}');
/* 81 */                    return sb7.toString();
                    }
                }

                @Override
                public final Collection values() {
                    switch (this.I00iOIl) {
                        case 0:
/* 117 */                   OOolII0o oOolII0o = (OOolII0o) this.I00io1l;
/* 119 */                   if (oOolII0o != null) {
/* 132 */                       return oOolII0o;
                            }
/* 127 */                   OOolII0o oOolII0o2 = new OOolII0o(this.I00iiO, 1, this.I00iio);
/* 130 */                   this.I00io1l = oOolII0o2;
/* 132 */                   return oOolII0o2;
                        case 1:
/* 99 */                    iO10oiIlOi io10oiiloi = (iO10oiIlOi) this.I00io1l;
/* 101 */                   if (io10oiiloi != null) {
/* 114 */                       return io10oiiloi;
                            }
/* 109 */                   iO10oiIlOi io10oiiloi2 = new iO10oiIlOi(this.I00iiO, 1, this.I00iio);
/* 112 */                   this.I00io1l = io10oiiloi2;
/* 114 */                   return io10oiiloi2;
                        case 2:
/* 81 */                    iil1o0OIo iil1o0oio = (iil1o0OIo) this.I00io1l;
/* 83 */                    if (iil1o0oio != null) {
/* 96 */                        return iil1o0oio;
                            }
/* 91 */                    iil1o0OIo iil1o0oio2 = new iil1o0OIo(this.I00iiO, 1, this.I00iio);
/* 94 */                    this.I00io1l = iil1o0oio2;
/* 96 */                    return iil1o0oio2;
                        case 3:
/* 63 */                    ioI1Ol101 ioi1ol101 = (ioI1Ol101) this.I00io1l;
/* 65 */                    if (ioi1ol101 != null) {
/* 78 */                        return ioi1ol101;
                            }
/* 73 */                    ioI1Ol101 ioi1ol1012 = new ioI1Ol101(this.I00iiO, 1, this.I00iio);
/* 76 */                    this.I00io1l = ioi1ol1012;
/* 78 */                    return ioi1ol1012;
                        case 4:
/* 45 */                    ioI1i0i0 ioi1i0i0 = (ioI1i0i0) this.I00io1l;
/* 47 */                    if (ioi1i0i0 != null) {
/* 60 */                        return ioi1i0i0;
                            }
/* 55 */                    ioI1i0i0 ioi1i0i02 = new ioI1i0i0(this.I00iiO, 1, this.I00iio);
/* 58 */                    this.I00io1l = ioi1i0i02;
/* 60 */                    return ioi1i0i02;
                        case 5:
/* 27 */                    ioIl0ooI ioil0ooi = (ioIl0ooI) this.I00io1l;
/* 29 */                    if (ioil0ooi != null) {
/* 42 */                        return ioil0ooi;
                            }
/* 37 */                    ioIl0ooI ioil0ooi2 = new ioIl0ooI(this.I00iiO, 1, this.I00iio);
/* 40 */                    this.I00io1l = ioil0ooi2;
/* 42 */                    return ioil0ooi2;
                        default:
/* 9 */                     l0001O l0001o = (l0001O) this.I00io1l;
/* 11 */                    if (l0001o != null) {
/* 24 */                        return l0001o;
                            }
/* 19 */                    l0001O l0001o2 = new l0001O(this.I00iiO, 1, this.I00iio);
/* 22 */                    this.I00io1l = l0001o2;
/* 24 */                    return l0001o2;
                    }
                }
            }

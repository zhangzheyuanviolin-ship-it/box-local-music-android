            package p000;

            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
/* 414 */   public final class i1Ol1oooo1ii extends AbstractMap {
                public static final OiOIlO1OII0 I00io1l = new OiOIlO1OII0(11);
                public static final OiOIlO1OII0 I00ioIO = new OiOIlO1OII0(14);
                public final int I00iOIl;
                public final Object[] I00iiI;
                public final int[] I00iiO;
                public Integer I00iio;
                public String I00ilI0I1;
                public final AbstractSet I00ilO0;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [i1Ol1oooo1ii, java.util.AbstractMap] */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v18 */
                /* JADX WARN: Type inference failed for: r0v2 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v8 */
                public i1Ol1oooo1ii(i1Ol1oooo1ii i1ol1oooo1ii, i1Ol1oooo1ii i1ol1oooo1ii2, byte b) {
                    int i;
                    Object obj;
                    Object[] objArr;
/* 7 */             int i2 = 1;
/* 8 */             abstractMap.I00iOIl = 1;
/* 10 */            i1Ol1oooo1ii abstractMap = new AbstractMap();
/* 15 */            int i3 = -1;
/* 19 */            abstractMap.I00ilO0 = new ilI11lO01oo(abstractMap, -1);
/* 22 */            abstractMap.I00iio = null;
/* 24 */            abstractMap.I00ilI0I1 = null;
/* 34 */            int size = i1ol1oooo1ii2.size() + i1ol1oooo1ii.size();
/* 51 */            int i4 = i1ol1oooo1ii.I00iiO[i1ol1oooo1ii.size()] + i1ol1oooo1ii2.I00iiO[i1ol1oooo1ii2.size()];
/* 53 */            int i5 = size + 1;
/* 55 */            Object[] objArr2 = new Object[i4];
/* 57 */            int[] iArr = new int[i5];
/* 59 */            int i6 = 0;
/* 60 */            iArr[0] = size;
/* 62 */            Map.Entry entryI00000oOI = i1ol1oooo1ii.I00000oOI(0);
/* 66 */            Map.Entry entryI00000oOI2 = i1ol1oooo1ii2.I00000oOI(0);
/* 71 */            int i7 = 0;
/* 72 */            int i8 = 0;
/* 73 */            int iI00000oIO = size;
/* 74 */            int i9 = 0;
                    while (true) {
/* 75 */                if (entryI00000oOI == null && entryI00000oOI2 == null) {
                            break;
                        }
/* 79 */                int i10 = i9 + 1;
/* 149 */               int iCompareTo = entryI00000oOI == null ? i2 : entryI00000oOI2 == null ? i3 : i6;
/* 151 */               if (iCompareTo == 0 && (iCompareTo = ((String) entryI00000oOI.getKey()).compareTo((String) entryI00000oOI2.getKey())) == 0) {
/* 175 */                   int i11 = i8 + 1;
/* 177 */                   int i12 = i7 + 1;
/* 195 */                   objArr2[i9] = new AbstractMap.SimpleImmutableEntry((String) entryI00000oOI.getKey(), new ilI11lO01oo(abstractMap, i9));
/* 202 */                   ilI11lO01oo ili11lo01oo = (ilI11lO01oo) entryI00000oOI.getValue();
/* 208 */                   ilI11lO01oo ili11lo01oo2 = (ilI11lO01oo) entryI00000oOI2.getValue();
/* 210 */                   int i13 = 0;
/* 211 */                   int i14 = 0;
                            abstractMap = abstractMap;
                            while (true) {
/* 212 */                       int iI00000oOI = ili11lo01oo.I00000oOI();
/* 216 */                       i1Ol1oooo1ii i1ol1oooo1ii3 = ili11lo01oo.I00iiI;
/* 224 */                       if (i13 >= iI00000oOI - ili11lo01oo.I0000O() && i14 >= ili11lo01oo2.I00000oOI() - ili11lo01oo2.I0000O()) {
                                    break;
                                }
/* 286 */                       int iCompare = i13 == ili11lo01oo.I00000oOI() - ili11lo01oo.I0000O() ? 1 : i14 == ili11lo01oo2.I00000oOI() - ili11lo01oo2.I0000O() ? -1 : 0;
/* 287 */                       if (iCompare == 0) {
/* 301 */                           i = i13;
/* 315 */                           iCompare = ilIOIll.I00000oOI.compare(i1ol1oooo1ii3.I00iiI[ili11lo01oo.I0000O() + i13], ili11lo01oo2.I00iiI.I00iiI[ili11lo01oo2.I0000O() + i14]);
                                } else {
/* 320 */                           i = i13;
                                }
/* 322 */                       if (iCompare < 0) {
/* 324 */                           i13 = i + 1;
/* 334 */                           obj = i1ol1oooo1ii3.I00iiI[ili11lo01oo.I0000O() + i];
                                } else {
/* 337 */                           int i15 = i14 + 1;
/* 348 */                           Object obj2 = ili11lo01oo2.I00iiI.I00iiI[ili11lo01oo2.I0000O() + i14];
/* 350 */                           if (iCompare == 0) {
/* 356 */                               i14 = i15;
/* 357 */                               obj = obj2;
/* 352 */                               i13 = i + 1;
                                    } else {
/* 361 */                               i14 = i15;
/* 362 */                               obj = obj2;
/* 363 */                               i13 = i;
                                    }
                                }
/* 367 */                       objArr2[iI00000oIO] = obj;
/* 369 */                       abstractMap = this;
/* 365 */                       iI00000oIO++;
                            }
/* 239 */                   iArr[i10] = iI00000oIO;
/* 241 */                   entryI00000oOI = i1ol1oooo1ii.I00000oOI(i12);
/* 245 */                   entryI00000oOI2 = i1ol1oooo1ii2.I00000oOI(i11);
/* 249 */                   i8 = i11;
/* 250 */                   i7 = i12;
/* 251 */                   i9 = i10;
/* 253 */                   i2 = 1;
/* 254 */                   i3 = -1;
/* 255 */                   i6 = 0;
                        } else {
/* 374 */                   if (iCompareTo < 0) {
/* 376 */                       i7++;
/* 380 */                       iI00000oIO = I00000oIO(entryI00000oOI, i9, iI00000oIO, objArr2, iArr);
/* 384 */                       entryI00000oOI = i1ol1oooo1ii.I00000oOI(i7);
                            } else {
/* 391 */                       Map.Entry entry = entryI00000oOI;
/* 392 */                       i8++;
/* 397 */                       int iI00000oIO2 = I00000oIO(entryI00000oOI2, i9, iI00000oIO, objArr2, iArr);
/* 401 */                       entryI00000oOI2 = i1ol1oooo1ii2.I00000oOI(i8);
/* 406 */                       iI00000oIO = iI00000oIO2;
/* 407 */                       entryI00000oOI = entry;
                            }
/* 408 */                   i9 = i10;
/* 410 */                   i2 = 1;
/* 411 */                   i3 = -1;
/* 412 */                   i6 = 0;
/* 413 */                   abstractMap = this;
                        }
                    }
/* 82 */            int i16 = iArr[i6];
/* 84 */            int i17 = i16 - i9;
/* 86 */            if (i17 != 0) {
/* 90 */                for (int i18 = i6; i18 <= i9; i18++) {
/* 95 */                    iArr[i18] = iArr[i18] - i17;
                        }
/* 100 */               int i19 = iArr[i9];
/* 102 */               int i20 = i19 - i9;
/* 108 */               if (I000II(i4, i19)) {
/* 110 */                   objArr = new Object[i19];
/* 112 */                   System.arraycopy(objArr2, i6, objArr, i6, i9);
                        } else {
/* 116 */                   objArr = objArr2;
                        }
/* 117 */               System.arraycopy(objArr2, i16, objArr, i9, i20);
/* 120 */               objArr2 = objArr;
                    }
/* 121 */           abstractMap.I00iiI = objArr2;
/* 125 */           int i21 = iArr[i6] + i2;
/* 136 */           abstractMap.I00iiO = I000II(i5, i21) ? Arrays.copyOf(iArr, i21) : iArr;
                }

                public static boolean I0000Il00O(int i, int i2) {
                    return i > 16 && i * 9 > i2 * 10;
                }

                public static boolean I000II(int i, int i2) {
                    return i > 16 && i * 9 > i2 * 10;
                }

                public final int I00000oIO(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
                    switch (this.I00iOIl) {
                        case 0:
/* 60 */                    i1Ol01i1 i1ol01i1 = (i1Ol01i1) entry.getValue();
/* 70 */                    int iI0000O = i1ol01i1.I0000O() - i1ol01i1.I00000oOI();
/* 79 */                    System.arraycopy(i1ol01i1.I00iiI.I00iiI, i1ol01i1.I00000oOI(), objArr, i2, iI0000O);
/* 98 */                    objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new i1Ol01i1(this, i));
/* 102 */                   int i3 = i2 + iI0000O;
/* 103 */                   iArr[i + 1] = i3;
/* 105 */                   return i3;
                        default:
/* 10 */                    ilI11lO01oo ili11lo01oo = (ilI11lO01oo) entry.getValue();
/* 20 */                    int iI00000oOI = ili11lo01oo.I00000oOI() - ili11lo01oo.I0000O();
/* 29 */                    System.arraycopy(ili11lo01oo.I00iiI.I00iiI, ili11lo01oo.I0000O(), objArr, i2, iI00000oOI);
/* 48 */                    objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new ilI11lO01oo(this, i));
/* 52 */                    int i4 = i2 + iI00000oOI;
/* 53 */                    iArr[i + 1] = i4;
/* 55 */                    return i4;
                    }
                }

                public Map.Entry I00000oOI(int i) {
/* 6 */             if (i < this.I00iiO[0]) {
/* 12 */                return (Map.Entry) this.I00iiI[i];
                    }
/* 15 */            return null;
                }

                public Map.Entry I0000O(int i) {
/* 6 */             if (i < this.I00iiO[0]) {
/* 12 */                return (Map.Entry) this.I00iiI[i];
                    }
/* 15 */            return null;
                }

                @Override
                public final Set entrySet() {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    return (i1Ol01i1) this.I00ilO0;
                        default:
/* 8 */                     return (ilI11lO01oo) this.I00ilO0;
                    }
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    Integer numValueOf = this.I00iio;
/* 27 */                    if (numValueOf == null) {
/* 33 */                        numValueOf = Integer.valueOf(super.hashCode());
/* 37 */                        this.I00iio = numValueOf;
                            }
/* 39 */                    return numValueOf.intValue();
                        default:
/* 6 */                     Integer numValueOf2 = this.I00iio;
/* 8 */                     if (numValueOf2 == null) {
/* 14 */                        numValueOf2 = Integer.valueOf(super.hashCode());
/* 18 */                        this.I00iio = numValueOf2;
                            }
/* 20 */                    return numValueOf2.intValue();
                    }
                }

                @Override
                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    String str = this.I00ilI0I1;
/* 19 */                    if (str != null) {
/* 27 */                        return str;
                            }
/* 21 */                    String string = super.toString();
/* 25 */                    this.I00ilI0I1 = string;
/* 27 */                    return string;
                        default:
/* 6 */                     String str2 = this.I00ilI0I1;
/* 8 */                     if (str2 != null) {
/* 16 */                        return str2;
                            }
/* 10 */                    String string2 = super.toString();
/* 14 */                    this.I00ilI0I1 = string2;
/* 16 */                    return string2;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [i1Ol1oooo1ii, java.util.AbstractMap] */
                /* JADX WARN: Type inference failed for: r0v1, types: [i1Ol1oooo1ii] */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v19 */
                /* JADX WARN: Type inference failed for: r0v2 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v8 */
/* 415 */       public i1Ol1oooo1ii(i1Ol1oooo1ii i1ol1oooo1ii, i1Ol1oooo1ii i1ol1oooo1ii2) {
                    int i;
                    Object obj;
                    Object[] objArr;
                    int i2 = 0;
                    abstractMap.I00iOIl = 0;
/* 416 */           ?? abstractMap = new AbstractMap();
/* 417 */           abstractMap.I00ilO0 = new i1Ol01i1(abstractMap, -1);
                    abstractMap.I00iio = null;
                    abstractMap.I00ilI0I1 = null;
/* 418 */           int size = i1ol1oooo1ii2.size() + i1ol1oooo1ii.size();
/* 419 */           int i3 = i1ol1oooo1ii.I00iiO[i1ol1oooo1ii.size()] + i1ol1oooo1ii2.I00iiO[i1ol1oooo1ii2.size()];
                    int i4 = size + 1;
/* 420 */           Object[] objArr2 = new Object[i3];
/* 421 */           int[] iArr = new int[i4];
/* 422 */           iArr[0] = size;
/* 423 */           Map.Entry entryI0000O = i1ol1oooo1ii.I0000O(0);
/* 424 */           Map.Entry entryI0000O2 = i1ol1oooo1ii2.I0000O(0);
                    int i5 = 0;
                    int i6 = 0;
                    int iI00000oIO = size;
                    int i7 = 0;
                    while (true) {
                        if (entryI0000O == null && entryI0000O2 == null) {
                            break;
                        }
                        int i8 = i7 + 1;
                        if (entryI0000O != null) {
                            if (entryI0000O2 != null) {
/* 434 */                       int iCompareTo = ((String) entryI0000O.getKey()).compareTo((String) entryI0000O2.getKey());
                                if (iCompareTo == 0) {
                                    int i9 = i5 + 1;
                                    int i10 = i6 + 1;
/* 437 */                           objArr2[i7] = new AbstractMap.SimpleImmutableEntry((String) entryI0000O.getKey(), new i1Ol01i1(abstractMap, i7));
/* 438 */                           i1Ol01i1 i1ol01i1 = (i1Ol01i1) entryI0000O.getValue();
                                    i1Ol01i1 i1ol01i12 = (i1Ol01i1) entryI0000O2.getValue();
                                    int i11 = 0;
                                    int i12 = 0;
                                    abstractMap = abstractMap;
                                    while (true) {
/* 439 */                               int iI0000O = i1ol01i1.I0000O();
                                        i1Ol1oooo1ii i1ol1oooo1ii3 = i1ol01i1.I00iiI;
                                        if (i11 >= iI0000O - i1ol01i1.I00000oOI() && i12 >= i1ol01i12.I0000O() - i1ol01i12.I00000oOI()) {
                                            break;
                                        }
/* 443 */                               int iCompare = i11 == i1ol01i1.I0000O() - i1ol01i1.I00000oOI() ? 1 : i12 == i1ol01i12.I0000O() - i1ol01i12.I00000oOI() ? -1 : 0;
                                        if (iCompare == 0) {
/* 444 */                                   OiOIlO1OII0 oiOIlO1OII0 = i1OlOoO10O1.I00000oOI;
                                            i = i11;
/* 453 */                                   iCompare = i1OlOoO10O1.I00000oOI.compare(i1ol1oooo1ii3.I00iiI[i1ol01i1.I00000oOI() + i11], i1ol01i12.I00iiI.I00iiI[i1ol01i12.I00000oOI() + i12]);
                                        } else {
                                            i = i11;
                                        }
                                        if (iCompare < 0) {
                                            i11 = i + 1;
/* 456 */                                   obj = i1ol1oooo1ii3.I00iiI[i1ol01i1.I00000oOI() + i];
                                        } else {
                                            int i13 = i12 + 1;
/* 460 */                                   Object obj2 = i1ol01i12.I00iiI.I00iiI[i1ol01i12.I00000oOI() + i12];
                                            if (iCompare == 0) {
                                                i12 = i13;
                                                obj = obj2;
                                                i11 = i + 1;
                                            } else {
                                                i12 = i13;
                                                obj = obj2;
                                                i11 = i;
                                            }
                                        }
/* 461 */                               objArr2[iI00000oIO] = obj;
                                        abstractMap = this;
                                        iI00000oIO++;
                                    }
/* 440 */                           iArr[i8] = iI00000oIO;
/* 441 */                           entryI0000O = i1ol1oooo1ii.I0000O(i10);
/* 442 */                           entryI0000O2 = i1ol1oooo1ii2.I0000O(i9);
                                    i6 = i10;
                                    i5 = i9;
                                    i7 = i8;
                                    i2 = 0;
                                } else {
                                    if (iCompareTo < 0) {
                                    }
                                    i7 = i8;
                                    i2 = 0;
                                    abstractMap = this;
                                }
                            }
                            i6++;
/* 462 */                   iI00000oIO = I00000oIO(entryI0000O, i7, iI00000oIO, objArr2, iArr);
/* 463 */                   entryI0000O = i1ol1oooo1ii.I0000O(i6);
                            i7 = i8;
                            i2 = 0;
                            abstractMap = this;
                        }
                        Map.Entry entry = entryI0000O;
                        i5++;
/* 464 */               int iI00000oIO2 = I00000oIO(entryI0000O2, i7, iI00000oIO, objArr2, iArr);
/* 465 */               entryI0000O2 = i1ol1oooo1ii2.I0000O(i5);
                        iI00000oIO = iI00000oIO2;
                        entryI0000O = entry;
                        i7 = i8;
                        i2 = 0;
                        abstractMap = this;
                    }
/* 425 */           int i14 = iArr[i2];
                    int i15 = i14 - i7;
                    if (i15 != 0) {
                        for (int i16 = i2; i16 <= i7; i16++) {
/* 426 */                   iArr[i16] = iArr[i16] - i15;
                        }
/* 427 */               int i17 = iArr[i7];
                        int i18 = i17 - i7;
                        if (I0000Il00O(i3, i17)) {
/* 428 */                   objArr = new Object[i17];
/* 429 */                   System.arraycopy(objArr2, i2, objArr, i2, i7);
                        } else {
                            objArr = objArr2;
                        }
/* 430 */               System.arraycopy(objArr2, i14, objArr, i7, i18);
                        objArr2 = objArr;
                    }
/* 431 */           abstractMap.I00iiI = objArr2;
/* 432 */           int i19 = iArr[i2] + 1;
/* 433 */           abstractMap.I00iiO = I0000Il00O(i4, i19) ? Arrays.copyOf(iArr, i19) : iArr;
                }

/* 465 */       public i1Ol1oooo1ii(int i) {
                    this.I00iOIl = i;
                    switch (i) {
                        case 1:
/* 477 */                   List list = Collections.EMPTY_LIST;
/* 479 */                   this.I00ilO0 = new ilI11lO01oo(this, -1);
                            this.I00iio = null;
                            this.I00ilI0I1 = null;
/* 480 */                   Iterator it = list.iterator();
                            if (!it.hasNext()) {
/* 481 */                       int size = list.size();
                                Object[] objArr = new Object[size];
/* 482 */                       Iterator it2 = list.iterator();
                                if (!it2.hasNext()) {
/* 483 */                           int[] iArr = {0};
/* 484 */                           this.I00iiI = I000II(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                                    this.I00iiO = iArr;
                                    return;
                                }
/* 486 */                       throw IIlIOloOOO.I000lI(it2);
                            }
/* 488 */                   throw IIlIOloOOO.I000lI(it);
                        default:
                            List list2 = Collections.EMPTY_LIST;
/* 467 */                   this.I00ilO0 = new i1Ol01i1(this, -1);
                            this.I00iio = null;
                            this.I00ilI0I1 = null;
/* 468 */                   Iterator it3 = list2.iterator();
                            if (!it3.hasNext()) {
/* 469 */                       int size2 = list2.size();
                                Object[] objArr2 = new Object[size2];
/* 470 */                       Iterator it4 = list2.iterator();
                                if (!it4.hasNext()) {
/* 471 */                           int[] iArr2 = {0};
/* 472 */                           this.I00iiI = I0000Il00O(size2, 0) ? Arrays.copyOf(objArr2, 0) : objArr2;
                                    this.I00iiO = iArr2;
                                    return;
                                }
/* 474 */                       throw IIlIOloOOO.I000lI(it4);
                            }
/* 476 */                   throw IIlIOloOOO.I000lI(it3);
                    }
                }
            }

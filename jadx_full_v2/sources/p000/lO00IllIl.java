            package p000;

            import java.util.List;
            
            public abstract class lO00IllIl {
                public static final O1iOIo0o0 I00000oIO(OiI1O1iOoiOI oiI1O1iOoiOI, int i, int i2, int i3, int i4, int i5, O1iOIoOiO0 o1iOIoOiO0, List list, OO1I0001000i[] oO1I0001000iArr, int i6, int i7, int[] iArr, int i8) {
                    int i9;
                    float f;
                    long j;
                    int i10;
                    int i11;
                    int i12;
/* 9 */             List list2 = list;
                    long j2 = i5;
/* 14 */            int i13 = i7 - i6;
/* 16 */            int[] iArr2 = new int[i13];
/* 18 */            int i14 = i6;
/* 20 */            int iMax = 0;
/* 21 */            int i15 = 0;
/* 22 */            int i16 = 0;
/* 23 */            int iMin = 0;
/* 24 */            float f2 = 0.0f;
/* 28 */            while (i14 < i7) {
/* 36 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list2.get(i14);
/* 42 */                float fI00000oOI = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll));
/* 48 */                if (fI00000oOI > 0.0f) {
/* 50 */                    f2 += fI00000oOI;
/* 52 */                    i15++;
/* 54 */                    j = j2;
/* 56 */                    i10 = i14;
                        } else {
/* 59 */                    int i17 = i3 - i16;
/* 61 */                    OO1I0001000i oO1I0001000iI001lllioOl = oO1I0001000iArr[i14];
/* 63 */                    j = j2;
/* 65 */                    if (oO1I0001000iI001lllioOl == null) {
/* 70 */                        if (i3 == Integer.MAX_VALUE) {
/* 72 */                            i10 = i14;
/* 74 */                            i11 = i15;
/* 76 */                            i12 = Integer.MAX_VALUE;
                                } else {
/* 81 */                            i10 = i14;
/* 83 */                            i11 = i15;
/* 89 */                            i12 = i17 < 0 ? 0 : i17;
                                }
/* 95 */                        oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(oiI1O1iOoiOI.I000II(0, i12, i4, false));
                            } else {
/* 102 */                       i10 = i14;
/* 104 */                       i11 = i15;
                            }
/* 99 */                    OO1I0001000i oO1I0001000i = oO1I0001000iI001lllioOl;
/* 107 */                   int iI000OiO = oiI1O1iOoiOI.I000OiO(oO1I0001000i);
/* 111 */                   int iI000OOo1O = oiI1O1iOoiOI.I000OOo1O(oO1I0001000i);
/* 117 */                   iArr2[i10 - i6] = iI000OiO;
/* 119 */                   int i18 = i17 - iI000OiO;
/* 121 */                   if (i18 < 0) {
/* 123 */                       i18 = 0;
                            }
/* 124 */                   iMin = Math.min(i5, i18);
/* 129 */                   i16 += iI000OiO + iMin;
/* 130 */                   iMax = Math.max(iMax, iI000OOo1O);
/* 134 */                   oO1I0001000iArr[i10] = oO1I0001000i;
/* 136 */                   i15 = i11;
                        }
/* 138 */               i14 = i10 + 1;
/* 140 */               j2 = j;
                    }
/* 143 */           long j3 = j2;
/* 147 */           if (i15 == 0) {
/* 149 */               i16 -= iMin;
/* 150 */               i9 = 0;
                    } else {
/* 166 */               long j4 = (r22 - 1) * j3;
/* 170 */               long jRound = ((i3 != Integer.MAX_VALUE ? i3 : i) - i16) - j4;
/* 175 */               if (jRound < 0) {
/* 177 */                   jRound = 0;
                        }
/* 180 */               float f3 = jRound / f2;
/* 184 */               for (int i19 = i6; i19 < i7; i19++) {
/* 208 */                   jRound -= Math.round(lIooiiooO.I00000oOI(lIooiiooO.I00000oIO((O1iIo0ll) list2.get(i19))) * f3);
                        }
/* 215 */               int i20 = i6;
/* 217 */               int i21 = iMax;
/* 218 */               int i22 = 0;
/* 219 */               while (i20 < i7) {
/* 223 */                   if (oO1I0001000iArr[i20] == null) {
/* 231 */                       O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list2.get(i20);
/* 233 */                       f = f3;
/* 235 */                       OiI1Olo1I oiI1Olo1II00000oIO = lIooiiooO.I00000oIO(o1iIo0ll2);
/* 239 */                       float fI00000oOI2 = lIooiiooO.I00000oOI(oiI1Olo1II00000oIO);
/* 245 */                       if (fI00000oOI2 <= 0.0f) {
/* 250 */                           IoliiIlI0O.I00000oOI("All weights <= 0 should have placeables");
                                }
/* 253 */                       int iSignum = Long.signum(jRound);
/* 260 */                       long j5 = jRound - iSignum;
/* 273 */                       int iMax2 = Math.max(0, Math.round(fI00000oOI2 * f) + iSignum);
/* 299 */                       OO1I0001000i oO1I0001000iI001lllioOl2 = o1iIo0ll2.I001lllioOl(oiI1O1iOoiOI.I000II((!(oiI1Olo1II00000oIO != null ? oiI1Olo1II00000oIO.I00000oOI : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
/* 303 */                       int iI000OiO2 = oiI1O1iOoiOI.I000OiO(oO1I0001000iI001lllioOl2);
/* 307 */                       int iI000OOo1O2 = oiI1O1iOoiOI.I000OOo1O(oO1I0001000iI001lllioOl2);
/* 313 */                       iArr2[i20 - i6] = iI000OiO2;
/* 315 */                       i22 += iI000OiO2;
/* 316 */                       int iMax3 = Math.max(i21, iI000OOo1O2);
/* 320 */                       oO1I0001000iArr[i20] = oO1I0001000iI001lllioOl2;
/* 322 */                       i21 = iMax3;
/* 323 */                       jRound = j5;
                            } else {
/* 326 */                       f = f3;
                            }
/* 331 */                   i20++;
/* 335 */                   list2 = list;
/* 337 */                   f3 = f;
                        }
/* 342 */               i9 = (int) (i22 + j4);
/* 343 */               int i23 = i3 - i16;
/* 345 */               if (i9 < 0) {
/* 347 */                   i9 = 0;
                        }
/* 348 */               if (i9 > i23) {
/* 350 */                   i9 = i23;
                        }
/* 351 */               iMax = i21;
                    }
/* 352 */           int i24 = i9 + i16;
/* 353 */           if (i24 < 0) {
/* 355 */               i24 = 0;
                    }
/* 358 */           int iMax4 = Math.max(i24, i);
/* 369 */           int iMax5 = Math.max(iMax, Math.max(i2, 0));
/* 373 */           int[] iArr3 = new int[i13];
/* 377 */           oiI1O1iOoiOI.I0001Ioi1lo(iMax4, iArr2, iArr3, o1iOIoOiO0);
/* 388 */           return oiI1O1iOoiOI.I000O01llI0(oO1I0001000iArr, o1iOIoOiO0, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
                }
            }

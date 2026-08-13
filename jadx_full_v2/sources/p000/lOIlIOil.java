            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            
            public abstract class lOIlIOil {
                /* JADX WARN: Multi-variable type inference failed */
                public static List I00000oIO(Ol11il011o0 ol11il011o0, int i, Ol11il011o0 ol11il011o02, boolean z, boolean z2, boolean z3) {
                    Il01100l il01100l;
                    boolean z4;
                    int i2;
                    int i3;
/* 7 */             int iI00111O = ol11il011o0.I00111O(i);
/* 11 */            int i4 = i + iI00111O;
/* 19 */            int iI0001Ioi1lo = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i));
/* 29 */            int iI0001Ioi1lo2 = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i4));
/* 33 */            int i5 = iI0001Ioi1lo2 - iI0001Ioi1lo;
/* 56 */            boolean z5 = i >= 0 && (ol11il011o0.I00000oOI[(ol11il011o0.I00100o1O0lo(i) * 5) + 1] & 201326592) != 0;
/* 57 */            ol11il011o02.I001IO000(iI00111O);
/* 62 */            ol11il011o02.I001i1O0Ol(i5, ol11il011o02.I00111O);
/* 67 */            if (ol11il011o0.I000II < i4) {
/* 69 */                ol11il011o0.I001lIiIIo1O(i4);
                    }
/* 74 */            if (ol11il011o0.I000iOII < iI0001Ioi1lo2) {
/* 76 */                ol11il011o0.I001lllioOl(iI0001Ioi1lo2, i4);
                    }
/* 79 */            int[] iArr = ol11il011o02.I00000oOI;
/* 81 */            int i6 = ol11il011o02.I00111O;
/* 85 */            int i7 = i6 * 5;
/* 91 */            I1IoiO1l.I000O01llI0(i7, i * 5, i4 * 5, ol11il011o0.I00000oOI, iArr);
/* 94 */            Object[] objArr = ol11il011o02.I0000Il00O;
/* 96 */            int i8 = ol11il011o02.I000OOo1O;
/* 100 */           System.arraycopy(ol11il011o0.I0000Il00O, iI0001Ioi1lo, objArr, i8, i5);
/* 103 */           int i9 = ol11il011o02.I001IO000;
/* 107 */           iArr[i7 + 2] = i9;
/* 109 */           int i10 = i6 - i;
/* 111 */           int i11 = i6 + iI00111O;
/* 117 */           int iI0001Ioi1lo3 = i8 - ol11il011o02.I0001Ioi1lo(iArr, i6);
/* 121 */           int i12 = ol11il011o02.I000lI;
/* 125 */           int i13 = ol11il011o02.I000l1;
/* 127 */           int length = objArr.length;
/* 128 */           boolean z6 = z5;
/* 130 */           int i14 = i12;
/* 134 */           int i15 = i6;
/* 135 */           while (i15 < i11) {
/* 137 */               if (i15 != i6) {
/* 141 */                   int i16 = (i15 * 5) + 2;
/* 147 */                   iArr[i16] = iArr[i16] + i10;
                        }
/* 153 */               int[] iArr2 = iArr;
/* 155 */               int iI0001Ioi1lo4 = ol11il011o02.I0001Ioi1lo(iArr, i15) + iI0001Ioi1lo3;
/* 157 */               if (i14 < i15) {
/* 159 */                   i2 = i6;
/* 161 */                   i3 = 0;
                        } else {
/* 163 */                   i2 = i6;
/* 165 */                   i3 = ol11il011o02.I000iOII;
                        }
/* 175 */               iArr2[(i15 * 5) + 4] = Ol11il011o0.I000O01llI0(iI0001Ioi1lo4, i3, i13, length);
/* 177 */               if (i15 == i14) {
/* 179 */                   i14++;
                        }
/* 181 */               i15++;
/* 183 */               i6 = i2;
/* 185 */               iArr = iArr2;
                    }
/* 188 */           int[] iArr3 = iArr;
/* 190 */           ol11il011o02.I000lI = i14;
/* 198 */           int iI0000Il00O = Ol11iOOOoo1.I0000Il00O(ol11il011o0.I0000O, i, ol11il011o0.I000oI1ioi());
/* 208 */           int iI0000Il00O2 = Ol11iOOOoo1.I0000Il00O(ol11il011o0.I0000O, i4, ol11il011o0.I000oI1ioi());
/* 212 */           if (iI0000Il00O < iI0000Il00O2) {
/* 214 */               ArrayList arrayList = ol11il011o0.I0000O;
/* 220 */               ArrayList arrayList2 = new ArrayList(iI0000Il00O2 - iI0000Il00O);
/* 224 */               for (int i17 = iI0000Il00O; i17 < iI0000Il00O2; i17++) {
/* 230 */                   Ilo1iIi1OI01 ilo1iIi1OI01 = (Ilo1iIi1OI01) arrayList.get(i17);
                            ilo1iIi1OI01.I00000oIO += i10;
/* 238 */                   arrayList2.add(ilo1iIi1OI01);
                        }
/* 258 */               ol11il011o02.I0000O.addAll(Ol11iOOOoo1.I0000Il00O(ol11il011o02.I0000O, ol11il011o02.I00111O, ol11il011o02.I000oI1ioi()), arrayList2);
/* 265 */               arrayList.subList(iI0000Il00O, iI0000Il00O2).clear();
                        il01100l = arrayList2;
                    } else {
/* 269 */               il01100l = Il01100l.I00iOIl;
                    }
/* 272 */           Il01100l il01100l2 = il01100l;
/* 278 */           if (!il01100l2.isEmpty()) {
/* 280 */               HashMap map = ol11il011o0.I0000oI00;
/* 282 */               HashMap map2 = ol11il011o02.I0000oI00;
/* 284 */               if (map != null && map2 != null) {
/* 288 */                   int size = il01100l2.size();
/* 293 */                   for (int i18 = 0; i18 < size; i18++) {
                            }
                        }
                    }
/* 310 */           int i19 = ol11il011o02.I001IO000;
/* 312 */           ol11il011o02.I00Iooi00oi(i9);
/* 317 */           int iI00IO1 = ol11il011o0.I00IO1(ol11il011o0.I00000oOI, i);
/* 321 */           if (!z3) {
/* 323 */               z4 = false;
                    } else if (z) {
/* 333 */               boolean z7 = iI00IO1 >= 0;
/* 335 */               if (z7) {
/* 337 */                   ol11il011o0.I00O0i0ii();
/* 343 */                   ol11il011o0.I00000oIO(iI00IO1 - ol11il011o0.I00111O);
/* 346 */                   ol11il011o0.I00O0i0ii();
                        }
/* 352 */               ol11il011o0.I00000oIO(i - ol11il011o0.I00111O);
/* 355 */               boolean zI00IioO0OiOi = ol11il011o0.I00IioO0OiOi();
/* 359 */               if (z7) {
/* 361 */                   ol11il011o0.I00IoO0();
/* 364 */                   ol11il011o0.I000OOo1O();
/* 367 */                   ol11il011o0.I00IoO0();
/* 370 */                   ol11il011o0.I000OOo1O();
                        }
/* 373 */               z4 = zI00IioO0OiOi;
                    } else {
/* 376 */               boolean zI00IlilI0i0i = ol11il011o0.I00IlilI0i0i(i, iI00111O);
/* 382 */               ol11il011o0.I00Io1lO(iI0001Ioi1lo, i5, i - 1);
/* 385 */               z4 = zI00IlilI0i0i;
                    }
/* 387 */           if (z4) {
/* 391 */               IOl1II00.I00000oIO("Unexpectedly removed anchors");
                    }
/* 394 */           int i20 = ol11il011o02.I000oI1ioi;
/* 398 */           int i21 = iArr3[i7 + 1];
/* 414 */           ol11il011o02.I000oI1ioi = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
/* 416 */           if (z2) {
/* 418 */               ol11il011o02.I00111O = i11;
/* 421 */               ol11il011o02.I000OOo1O = i8 + i5;
                    }
/* 423 */           if (z6) {
/* 425 */               ol11il011o02.I00OIl(i9);
                    }
/* 685 */           return il01100l;
                }
            }

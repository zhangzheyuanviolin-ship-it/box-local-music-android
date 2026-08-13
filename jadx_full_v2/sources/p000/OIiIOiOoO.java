            package p000;

            import java.util.ArrayList;
            
            public final class OIiIOiOoO extends IlO1i1lOIi {
                public static final OIiIOiOoO I0000O = new OIiIOiOoO(1, 0, 2);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
                    int[] iArr;
                    Ilo1iIi1OI01 ilo1iIi1OI01;
                    int iI0000Il00O;
/* 6 */             int iI0000oI00 = iOOOi1.I0000oI00(0);
/* 12 */            if (ol11il011o0.I000o00OoI0I != 0) {
/* 17 */                IOl1II00.I00000oIO("Cannot move a group while inserting");
                    }
/* 22 */            if (iI0000oI00 < 0) {
/* 25 */                IOl1II00.I00000oIO("Parameter offset is out of bounds");
                    }
/* 28 */            if (iI0000oI00 == 0) {
/* 399 */               return;
                    }
/* 32 */            int i = ol11il011o0.I00111O;
/* 34 */            int i2 = ol11il011o0.I001IO000;
/* 36 */            int i3 = ol11il011o0.I001IIilI0O;
/* 38 */            int iI00000oOI = i;
                    while (true) {
/* 39 */                iArr = ol11il011o0.I00000oOI;
/* 41 */                if (iI0000oI00 <= 0) {
                            break;
                        }
/* 51 */                iI00000oOI += Ol11iOOOoo1.I00000oOI(iArr, ol11il011o0.I00100o1O0lo(iI00000oOI));
/* 52 */                if (iI00000oOI > i3) {
/* 55 */                    IOl1II00.I00000oIO("Parameter offset is out of bounds");
                        }
                        iI0000oI00--;
                    }
/* 65 */            int iI00000oOI2 = Ol11iOOOoo1.I00000oOI(iArr, ol11il011o0.I00100o1O0lo(iI00000oOI));
/* 77 */            int iI0001Ioi1lo = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(ol11il011o0.I00111O));
/* 87 */            int iI0001Ioi1lo2 = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(iI00000oOI));
/* 93 */            int i4 = iI00000oOI + iI00000oOI2;
/* 98 */            int iI0001Ioi1lo3 = ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(i4));
/* 102 */           int i5 = iI0001Ioi1lo3 - iI0001Ioi1lo2;
/* 112 */           ol11il011o0.I001i1O0Ol(i5, Math.max(ol11il011o0.I00111O - 1, 0));
/* 115 */           ol11il011o0.I001IO000(iI00000oOI2);
/* 118 */           int[] iArr2 = ol11il011o0.I00000oOI;
/* 124 */           int iI00100o1O0lo = ol11il011o0.I00100o1O0lo(i4) * 5;
/* 135 */           I1IoiO1l.I000O01llI0(ol11il011o0.I00100o1O0lo(i) * 5, iI00100o1O0lo, (iI00000oOI2 * 5) + iI00100o1O0lo, iArr2, iArr2);
/* 138 */           if (i5 > 0) {
/* 140 */               Object[] objArr = ol11il011o0.I0000Il00O;
/* 144 */               int iI000II = ol11il011o0.I000II(iI0001Ioi1lo2 + i5);
/* 154 */               System.arraycopy(objArr, iI000II, objArr, iI0001Ioi1lo, ol11il011o0.I000II(iI0001Ioi1lo3 + i5) - iI000II);
                    }
/* 157 */           int i6 = iI0001Ioi1lo2 + i5;
/* 158 */           int i7 = i6 - iI0001Ioi1lo;
/* 160 */           int i8 = ol11il011o0.I000iOII;
/* 162 */           int i9 = ol11il011o0.I000l1;
/* 166 */           int length = ol11il011o0.I0000Il00O.length;
/* 167 */           int i10 = ol11il011o0.I000lI;
/* 169 */           int i11 = i + iI00000oOI2;
/* 171 */           int i12 = i;
/* 172 */           while (i12 < i11) {
/* 174 */               int iI00100o1O0lo2 = ol11il011o0.I00100o1O0lo(i12);
/* 182 */               int i13 = i7;
/* 203 */               int[] iArr3 = iArr2;
/* 216 */               iArr3[(iI00100o1O0lo2 * 5) + 4] = Ol11il011o0.I000O01llI0(Ol11il011o0.I000O01llI0(ol11il011o0.I0001Ioi1lo(iArr2, iI00100o1O0lo2) - i13, i10 < iI00100o1O0lo2 ? 0 : i8, i9, length), ol11il011o0.I000iOII, ol11il011o0.I000l1, ol11il011o0.I0000Il00O.length);
/* 218 */               i12++;
/* 220 */               i7 = i13;
/* 222 */               iArr2 = iArr3;
/* 224 */               i8 = i8;
                    }
/* 228 */           int i14 = i4 + iI00000oOI2;
/* 230 */           int iI000oI1ioi = ol11il011o0.I000oI1ioi();
/* 236 */           int iI0000Il00O2 = Ol11iOOOoo1.I0000Il00O(ol11il011o0.I0000O, i4, iI000oI1ioi);
/* 242 */           ArrayList arrayList = new ArrayList();
/* 245 */           if (iI0000Il00O2 >= 0) {
/* 253 */               while (iI0000Il00O2 < ol11il011o0.I0000O.size() && (iI0000Il00O = ol11il011o0.I0000Il00O((ilo1iIi1OI01 = (Ilo1iIi1OI01) ol11il011o0.I0000O.get(iI0000Il00O2)))) >= i4 && iI0000Il00O < i14) {
/* 271 */                   arrayList.add(ilo1iIi1OI01);
                        }
                    }
/* 283 */           int i15 = i - i4;
/* 285 */           int size = arrayList.size();
/* 290 */           for (int i16 = 0; i16 < size; i16++) {
/* 296 */               Ilo1iIi1OI01 ilo1iIi1OI012 = (Ilo1iIi1OI01) arrayList.get(i16);
/* 302 */               int iI0000Il00O3 = ol11il011o0.I0000Il00O(ilo1iIi1OI012) + i15;
/* 305 */               if (iI0000Il00O3 >= ol11il011o0.I000II) {
/* 310 */                   ilo1iIi1OI012.I00000oIO = -(iI000oI1ioi - iI0000Il00O3);
                        } else {
/* 313 */                   ilo1iIi1OI012.I00000oIO = iI0000Il00O3;
                        }
/* 323 */               ol11il011o0.I0000O.add(Ol11iOOOoo1.I0000Il00O(ol11il011o0.I0000O, iI0000Il00O3, iI000oI1ioi), ilo1iIi1OI012);
                    }
/* 333 */           if (ol11il011o0.I00IlilI0i0i(i4, iI00000oOI2)) {
/* 337 */               IOl1II00.I00000oIO("Unexpectedly removed anchors");
                    }
/* 342 */           ol11il011o0.I000l1(i2, ol11il011o0.I001IIilI0O, i);
/* 345 */           if (i5 > 0) {
/* 349 */               ol11il011o0.I00Io1lO(i6, i5, i4 - 1);
                    }
                }
            }

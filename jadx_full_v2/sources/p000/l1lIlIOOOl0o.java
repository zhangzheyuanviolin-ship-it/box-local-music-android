            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            public abstract class l1lIlIOOOl0o {
                public static void I00000oIO(long j, III1o0lOio0 iII1o0lOio0, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
                    int i4;
                    int i5;
                    ArrayList arrayList3;
                    long j2;
                    int i6;
/* 3 */             int i7 = i;
/* 5 */             ArrayList arrayList4 = arrayList;
/* 11 */            ArrayList arrayList5 = arrayList2;
/* 15 */            if (i2 >= i3) {
/* 426 */               I000II.I000iOII("Failed requirement.");
/* 429 */               return;
                    }
/* 18 */            for (int i8 = i2; i8 < i3; i8++) {
/* 30 */                if (((IIOIIi1ilIO) arrayList4.get(i8)).I00000oOI() < i7) {
/* 35 */                    I000II.I000iOII("Failed requirement.");
/* 38 */                    return;
                        }
                    }
/* 43 */            IIOIIi1ilIO iIOIIi1ilIO = (IIOIIi1ilIO) arrayList.get(i2);
/* 51 */            IIOIIi1ilIO iIOIIi1ilIO2 = (IIOIIi1ilIO) arrayList4.get(i3 - 1);
/* 57 */            if (i7 == iIOIIi1ilIO.I00000oOI()) {
/* 65 */                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
/* 69 */                int i9 = i2 + 1;
/* 75 */                IIOIIi1ilIO iIOIIi1ilIO3 = (IIOIIi1ilIO) arrayList4.get(i9);
/* 79 */                i4 = i9;
/* 80 */                i5 = iIntValue;
/* 81 */                iIOIIi1ilIO = iIOIIi1ilIO3;
                    } else {
/* 84 */                i4 = i2;
/* 85 */                i5 = -1;
                    }
/* 96 */            if (iIOIIi1ilIO.I000II(i7) == iIOIIi1ilIO2.I000II(i7)) {
/* 306 */               int iMin = Math.min(iIOIIi1ilIO.I00000oOI(), iIOIIi1ilIO2.I00000oOI());
/* 310 */               int i10 = 0;
/* 312 */               for (int i11 = i7; i11 < iMin && iIOIIi1ilIO.I000II(i11) == iIOIIi1ilIO2.I000II(i11); i11++) {
/* 324 */                   i10++;
                        }
/* 340 */               long j3 = (iII1o0lOio0.I00iiI / 4) + j + 2 + i10 + 1;
/* 342 */               iII1o0lOio0.I00oII(-i10);
/* 345 */               iII1o0lOio0.I00oII(i5);
/* 348 */               int i12 = i7 + i10;
/* 350 */               while (i7 < i12) {
/* 358 */                   iII1o0lOio0.I00oII(iIOIIi1ilIO.I000II(i7) & 255);
/* 361 */                   i7++;
                        }
/* 366 */               if (i4 + 1 == i3) {
/* 378 */                   if (i12 == ((IIOIIi1ilIO) arrayList4.get(i4)).I00000oOI()) {
/* 390 */                       iII1o0lOio0.I00oII(((Number) arrayList5.get(i4)).intValue());
/* 393 */                       return;
                            } else {
/* 396 */                       I000II.I001IO000("Check failed.");
/* 399 */                       return;
                            }
                        }
/* 402 */               III1o0lOio0 iII1o0lOio02 = new III1o0lOio0();
/* 413 */               iII1o0lOio0.I00oII(((int) ((iII1o0lOio02.I00iiI / 4) + j3)) * (-1));
/* 419 */               I00000oIO(j3, iII1o0lOio02, i12, arrayList4, i4, i3, arrayList5);
/* 422 */               iII1o0lOio0.I00lli11(iII1o0lOio02);
/* 425 */               return;
                    }
/* 100 */           int i13 = 1;
/* 101 */           for (int i14 = i4 + 1; i14 < i3; i14++) {
/* 125 */               if (((IIOIIi1ilIO) arrayList4.get(i14 - 1)).I000II(i7) != ((IIOIIi1ilIO) arrayList4.get(i14)).I000II(i7)) {
/* 127 */                   i13++;
                        }
                    }
/* 146 */           long j4 = (iII1o0lOio0.I00iiI / 4) + j + 2 + (i13 * 2);
/* 147 */           iII1o0lOio0.I00oII(i13);
/* 150 */           iII1o0lOio0.I00oII(i5);
/* 154 */           for (int i15 = i4; i15 < i3; i15++) {
/* 162 */               int iI000II = ((IIOIIi1ilIO) arrayList4.get(i15)).I000II(i7);
/* 166 */               if (i15 == i4 || iI000II != ((IIOIIi1ilIO) arrayList4.get(i15 - 1)).I000II(i7)) {
/* 184 */                   iII1o0lOio0.I00oII(iI000II & 255);
                        }
                    }
/* 192 */           III1o0lOio0 iII1o0lOio03 = new III1o0lOio0();
/* 195 */           int i16 = i4;
/* 196 */           while (i16 < i3) {
/* 204 */               byte bI000II = ((IIOIIi1ilIO) arrayList4.get(i16)).I000II(i7);
/* 208 */               int i17 = i16 + 1;
/* 210 */               int i18 = i17;
                        while (true) {
/* 211 */                   if (i18 >= i3) {
/* 229 */                       i18 = i3;
                                break;
                            } else if (bI000II != ((IIOIIi1ilIO) arrayList4.get(i18)).I000II(i7)) {
                                break;
                            } else {
/* 226 */                       i18++;
                            }
                        }
/* 230 */               if (i17 == i18 && i7 + 1 == ((IIOIIi1ilIO) arrayList4.get(i16)).I00000oOI()) {
/* 256 */                   iII1o0lOio0.I00oII(((Number) arrayList5.get(i16)).intValue());
/* 259 */                   arrayList3 = arrayList5;
/* 260 */                   j2 = j4;
/* 261 */                   i6 = i18;
                        } else {
/* 271 */                   iII1o0lOio0.I00oII(((int) ((iII1o0lOio03.I00iiI / 4) + j4)) * (-1));
/* 276 */                   arrayList3 = arrayList5;
/* 277 */                   j2 = j4;
/* 278 */                   i6 = i18;
/* 281 */                   I00000oIO(j2, iII1o0lOio03, i7 + 1, arrayList, i16, i6, arrayList3);
/* 284 */                   arrayList4 = arrayList;
                        }
/* 285 */               j4 = j2;
/* 286 */               i16 = i6;
/* 287 */               arrayList5 = arrayList3;
                    }
/* 289 */           iII1o0lOio0.I00lli11(iII1o0lOio03);
                }

                /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
                
                    continue;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OIil0IiIo I00000oOI(IIOIIi1ilIO... iIOIIi1ilIOArr) {
/* 4 */             if (iIOIIi1ilIOArr.length == 0) {
/* 14 */                return new OIil0IiIo(new IIOIIi1ilIO[0], new int[]{0, -1});
                    }
/* 22 */            I1Il00 i1Il00 = new I1Il00();
/* 25 */            i1Il00.I00iOIl = iIOIIi1ilIOArr;
/* 27 */            i1Il00.I00iiI = false;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            ArrayList arrayList = new ArrayList(i1Il00);
/* 35 */            IOOiOil.I000o00OoI0I(arrayList);
/* 38 */            int size = arrayList.size();
/* 44 */            ArrayList arrayList2 = new ArrayList(size);
/* 48 */            for (int i = 0; i < size; i++) {
/* 54 */                arrayList2.add(-1);
                    }
/* 60 */            int length = iIOIIi1ilIOArr.length;
/* 61 */            int i2 = 0;
/* 62 */            int i3 = 0;
/* 63 */            while (i2 < length) {
/* 77 */                arrayList2.set(IOOi1I.I00000oOI(arrayList, iIOIIi1ilIOArr[i2]), Integer.valueOf(i3));
/* 80 */                i2++;
/* 67 */                i3++;
                    }
/* 95 */            if (((IIOIIi1ilIO) arrayList.get(0)).I00000oOI() <= 0) {
/* 244 */               I000II.I000iOII("the empty byte string is not a supported option");
/* 94 */                return null;
                    }
/* 97 */            int i4 = 0;
/* 102 */           while (i4 < arrayList.size()) {
/* 108 */               IIOIIi1ilIO iIOIIi1ilIO = (IIOIIi1ilIO) arrayList.get(i4);
/* 110 */               int i5 = i4 + 1;
/* 112 */               int i6 = i5;
/* 117 */               while (i6 < arrayList.size()) {
/* 123 */                   IIOIIi1ilIO iIOIIi1ilIO2 = (IIOIIi1ilIO) arrayList.get(i6);
/* 125 */                   iIOIIi1ilIO2.getClass();
/* 136 */                   if (iIOIIi1ilIO2.I000OOo1O(0, iIOIIi1ilIO, iIOIIi1ilIO.I00000oOI())) {
/* 146 */                       if (iIOIIi1ilIO2.I00000oOI() == iIOIIi1ilIO.I00000oOI()) {
/* 188 */                           OIiilo1Ool0o.I000O01llI0("duplicate option: ", iIOIIi1ilIO2);
/* 94 */                            return null;
                                }
/* 168 */                       if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
/* 170 */                           arrayList.remove(i6);
/* 179 */                           ((Number) arrayList2.remove(i6)).intValue();
                                } else {
/* 183 */                           i6++;
                                }
                            }
                        }
/* 192 */               i4 = i5;
                    }
/* 196 */           III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 207 */           I00000oIO(0L, iII1o0lOio0, 0, arrayList, 0, arrayList.size(), arrayList2);
/* 215 */           int i7 = (int) (iII1o0lOio0.I00iiI / 4);
/* 216 */           int[] iArr = new int[i7];
/* 218 */           for (int i8 = 0; i8 < i7; i8++) {
/* 224 */               iArr[i8] = iII1o0lOio0.I00IioO0OiOi();
                    }
/* 238 */           return new OIil0IiIo((IIOIIi1ilIO[]) Arrays.copyOf(iIOIIi1ilIOArr, iIOIIi1ilIOArr.length), iArr);
                }
            }

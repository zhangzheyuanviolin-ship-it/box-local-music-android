            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OiiI000O implements OI0Iolo0lIiI {
                public Ii0110 I00000oIO;
                public I110IiI0o1Il I00000oOI;
                public I10i01 I0000Il00O;
                public Integer I0000O;

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    Object obj;
                    Object obj2;
                    Object obj3;
/* 1 */             ArrayList arrayList = (ArrayList) list;
/* 8 */             List list2 = (List) arrayList.get(0);
/* 10 */            int i = 1;
/* 15 */            List list3 = (List) arrayList.get(1);
/* 23 */            ArrayList arrayList2 = new ArrayList(list2.size());
/* 29 */            int size = list2.size();
/* 34 */            for (int i2 = 0; i2 < size; i2++) {
/* 46 */                arrayList2.add(((O1iIo0ll) list2.get(i2)).I001lllioOl(j));
                    }
/* 57 */            if (arrayList2.isEmpty()) {
/* 59 */                obj = null;
                    } else {
/* 61 */                obj = arrayList2.get(0);
/* 68 */                int i3 = ((OO1I0001000i) obj).I00iOIl;
/* 70 */                int iI000II = IOOi1I.I000II(arrayList2);
/* 74 */                if (1 <= iI000II) {
/* 76 */                    int i4 = 1;
                            while (true) {
/* 77 */                        Object obj4 = arrayList2.get(i4);
/* 84 */                        int i5 = ((OO1I0001000i) obj4).I00iOIl;
/* 86 */                        if (i3 < i5) {
/* 88 */                            obj = obj4;
/* 89 */                            i3 = i5;
                                }
/* 90 */                        if (i4 == iI000II) {
                                    break;
                                }
/* 92 */                        i4++;
                            }
                        }
                    }
/* 95 */            OO1I0001000i oO1I0001000i = (OO1I0001000i) obj;
/* 102 */           int i6 = oO1I0001000i != null ? oO1I0001000i.I00iOIl : 0;
/* 109 */           ArrayList arrayList3 = new ArrayList(list3.size());
/* 115 */           int size2 = list3.size();
/* 120 */           for (int i7 = 0; i7 < size2; i7++) {
/* 132 */               arrayList3.add(((O1iIo0ll) list3.get(i7)).I001lllioOl(j));
                    }
/* 142 */           if (arrayList3.isEmpty()) {
/* 144 */               obj2 = null;
                    } else {
/* 146 */               obj2 = arrayList3.get(0);
/* 153 */               int i8 = ((OO1I0001000i) obj2).I00iOIl;
/* 155 */               int iI000II2 = IOOi1I.I000II(arrayList3);
/* 159 */               if (1 <= iI000II2) {
/* 161 */                   int i9 = 1;
                            while (true) {
/* 162 */                       Object obj5 = arrayList3.get(i9);
/* 169 */                       int i10 = ((OO1I0001000i) obj5).I00iOIl;
/* 171 */                       if (i8 < i10) {
/* 173 */                           obj2 = obj5;
/* 174 */                           i8 = i10;
                                }
/* 175 */                       if (i9 == iI000II2) {
                                    break;
                                }
/* 177 */                       i9++;
                            }
                        }
                    }
/* 180 */           OO1I0001000i oO1I0001000i2 = (OO1I0001000i) obj2;
/* 191 */           Integer numValueOf = oO1I0001000i2 != null ? Integer.valueOf(oO1I0001000i2.I00iOIl) : null;
/* 196 */           if (arrayList3.isEmpty()) {
/* 198 */               obj3 = null;
                    } else {
/* 200 */               obj3 = arrayList3.get(0);
/* 207 */               int i11 = ((OO1I0001000i) obj3).I00iiI;
/* 209 */               int iI000II3 = IOOi1I.I000II(arrayList3);
/* 213 */               if (1 <= iI000II3) {
                            while (true) {
/* 215 */                       Object obj6 = arrayList3.get(i);
/* 222 */                       int i12 = ((OO1I0001000i) obj6).I00iiI;
/* 224 */                       if (i11 < i12) {
/* 226 */                           obj3 = obj6;
/* 227 */                           i11 = i12;
                                }
/* 228 */                       if (i == iI000II3) {
                                    break;
                                }
/* 230 */                       i++;
                            }
                        }
                    }
/* 233 */           OO1I0001000i oO1I0001000i3 = (OO1I0001000i) obj3;
/* 240 */           int i13 = oO1I0001000i3 != null ? oO1I0001000i3.I00iiI : 0;
/* 241 */           float f = OiiI0o101O0.I0000Il00O;
/* 266 */           int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(8.0f) + Math.max(o1iOIoOiO0.I00l0OO0IO(f), i6) + (numValueOf != null ? numValueOf.intValue() : 0);
/* 282 */           int i14 = i6 == 0 ? (-(o1iOIoOiO0.I00l0OO0IO(8.0f) + o1iOIoOiO0.I00l0OO0IO(f))) / 2 : 0;
/* 283 */           Integer num = this.I0000O;
/* 285 */           if (num == null) {
/* 291 */               this.I0000O = Integer.valueOf(i14);
                    } else {
/* 294 */               I10i01 i10i01 = this.I0000Il00O;
/* 296 */               if (i10i01 == null) {
/* 304 */                   i10i01 = new I10i01(num, Ooo0ii.I00000oOI, null, 12);
/* 307 */                   this.I0000Il00O = i10i01;
                        }
/* 321 */               if (((Number) i10i01.I0000oI00.getValue()).intValue() != i14) {
/* 331 */                   iOi1II01i0.I0000O(this.I00000oIO, null, null, new II1iIl0Ililo(i10i01, i14, this, (IOoil1iiIilo) null), 3);
                        }
                    }
/* 336 */           Oii1o1OoI oii1o1OoI = new Oii1o1OoI(0);
/* 339 */           oii1o1OoI.I00iio = arrayList2;
/* 341 */           oii1o1OoI.I00ilO0 = this;
/* 343 */           oii1o1OoI.I00iiI = i14;
/* 345 */           oii1o1OoI.I00ilI0I1 = arrayList3;
/* 347 */           oii1o1OoI.I00iiO = i13;
/* 349 */           VarHandle.storeStoreFence();
/* 354 */           return o1iOIoOiO0.I001i1lo1io(iI00l0OO0IO, i13, Il011I1OiO0I.I00iOIl, oii1o1OoI);
                }
            }

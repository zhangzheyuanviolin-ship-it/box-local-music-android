            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            
            public final class Olllo0o0O1l implements OI0Iolo0lIiI {
                public float I00000oIO;
                public float I00000oOI;
                public Olllo10O I0000Il00O;
                public int I0000O;
                public OiOoi1OOoOO I0000oI00;

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
/* 5 */             int i = this.I0000O;
/* 7 */             float f = this.I00000oOI;
/* 11 */            ArrayList arrayList = (ArrayList) list;
/* 18 */            List list2 = (List) arrayList.get(0);
/* 25 */            List list3 = (List) arrayList.get(1);
/* 27 */            float f2 = this.I00000oIO;
/* 29 */            int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(f2);
/* 33 */            int size = list2.size();
/* 37 */            Integer numValueOf = 0;
/* 42 */            List list4 = list2;
/* 44 */            int size2 = list4.size();
/* 52 */            for (int i2 = 0; i2 < size2; i2++) {
/* 72 */                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((O1iIo0ll) list2.get(i2)).I0000Il00O(Integer.MAX_VALUE)));
                    }
/* 79 */            int iIntValue = numValueOf.intValue();
/* 83 */            int i3 = iI00l0OO0IO * 2;
/* 97 */            long jI0000Il00O = IOo0oO11ll1O.I0000Il00O(j, o1iOIoOiO0.I00l0OO0IO(f), 0, iIntValue, iIntValue, 2);
/* 105 */           OOo0lO oOo0lO = new OOo0lO();
/* 108 */           oOo0lO.I00iOIl = f2;
/* 118 */           ArrayList arrayList2 = new ArrayList(list2.size());
/* 127 */           int i4 = 0;
/* 128 */           for (int size3 = list4.size(); i4 < size3; size3 = size3) {
/* 144 */               arrayList2.add(((O1iIo0ll) list2.get(i4)).I001lllioOl(jI0000Il00O));
/* 147 */               i4++;
                    }
/* 154 */           int[] iArrCopyOf = new int[16];
/* 156 */           int size4 = list4.size();
/* 160 */           int i5 = 0;
/* 161 */           int i6 = 0;
/* 162 */           while (i5 < size4) {
/* 170 */               List list5 = list2;
/* 175 */               int iI001iOo1i0O = ((O1iIo0ll) list2.get(i5)).I001iOo1i0O(Integer.MAX_VALUE);
/* 179 */               int i7 = i6 + 1;
/* 181 */               int i8 = size4;
/* 184 */               if (iArrCopyOf.length < i7) {
/* 195 */                   iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i7, (iArrCopyOf.length * 3) / 2));
                        }
/* 199 */               iArrCopyOf[i6] = iI001iOo1i0O;
/* 201 */               i5++;
/* 203 */               size4 = i8;
/* 205 */               i6 = i7;
/* 206 */               list2 = list5;
                    }
/* 211 */           ArrayList arrayList3 = new ArrayList(size);
/* 214 */           int i9 = i3;
/* 216 */           int i10 = 0;
/* 217 */           while (i10 < size) {
/* 219 */               Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 227 */               int[] iArr = iArrCopyOf;
/* 239 */               Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(o1iOIoOiO0.I00O0o1oo(((OO1I0001000i) arrayList2.get(i10)).I00iOIl));
/* 247 */               if (iil1010OI00000oIO.compareTo(iil1010OI00000oIO2) < 0) {
/* 250 */                   iil1010OI00000oIO = iil1010OI00000oIO2;
                        }
/* 251 */               float f3 = iil1010OI00000oIO.I00iOIl;
/* 257 */               int iI00l0OO0IO2 = i9 + o1iOIoOiO0.I00l0OO0IO(f3);
/* 258 */               if (i10 < 0 || i10 >= i6) {
/* 320 */                   lO00l0o.I00000oOI("Index must be between 0 and size");
/* 324 */                   throw null;
                        }
/* 272 */               Iil1010O iil1010OI00000oIO3 = Iil1010O.I00000oIO(o1iOIoOiO0.I00O0o1oo(iArr[i10]) - 32.0f);
/* 278 */               int i11 = size;
/* 280 */               Iil1010O iil1010OI00000oIO4 = Iil1010O.I00000oIO(24.0f);
/* 288 */               if (iil1010OI00000oIO3.compareTo(iil1010OI00000oIO4) < 0) {
/* 291 */                   iil1010OI00000oIO3 = iil1010OI00000oIO4;
                        }
/* 292 */               float f4 = iil1010OI00000oIO3.I00iOIl;
/* 298 */               float f5 = oOo0lO.I00iOIl;
/* 300 */               Olll1Oi olll1Oi = new Olll1Oi(f5, f3, f4);
/* 304 */               oOo0lO.I00iOIl = f5 + f3;
/* 306 */               arrayList3.add(olll1Oi);
/* 309 */               i10++;
/* 311 */               i9 = iI00l0OO0IO2;
/* 313 */               iArrCopyOf = iArr;
/* 315 */               size = i11;
                    }
/* 329 */           this.I0000Il00O.I00000oIO.setValue(arrayList3);
/* 338 */           ArrayList arrayList4 = new ArrayList(list3.size());
/* 344 */           int size5 = list3.size();
/* 348 */           int i12 = 0;
/* 349 */           while (i12 < size5) {
/* 384 */               arrayList4.add(((O1iIo0ll) list3.get(i12)).I001lllioOl(IOo0oO11ll1O.I00000oOI(0, o1iOIoOiO0.I00l0OO0IO(((Olll1Oi) arrayList3.get(i)).I0000Il00O), 0, iIntValue)));
/* 387 */               i12++;
/* 389 */               i9 = i9;
/* 391 */               size5 = size5;
/* 393 */               list3 = list3;
                    }
/* 398 */           OiOoi1OOoOO oiOoi1OOoOO = this.I0000oI00;
/* 402 */           OlllloIl olllloIl = new OlllloIl();
/* 405 */           olllloIl.I00iOIl = oOo0lO;
/* 407 */           olllloIl.I00iiI = f2;
/* 409 */           olllloIl.I00iiO = arrayList2;
/* 411 */           olllloIl.I00iio = arrayList4;
/* 413 */           olllloIl.I00ilI0I1 = oiOoi1OOoOO;
/* 415 */           olllloIl.I00ilO0 = o1iOIoOiO0;
/* 417 */           olllloIl.I00io1l = iI00l0OO0IO;
/* 419 */           olllloIl.I00ioIO = arrayList3;
/* 421 */           olllloIl.I00l0I0l0lO1 = i;
/* 423 */           olllloIl.I00l0OO0IO = iIntValue;
/* 425 */           VarHandle.storeStoreFence();
/* 432 */           return o1iOIoOiO0.I001i1lo1io(i9, iIntValue, Il011I1OiO0I.I00iOIl, olllloIl);
                }
            }
